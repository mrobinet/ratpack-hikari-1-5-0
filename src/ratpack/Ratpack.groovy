import com.zaxxer.hikari.HikariConfig
import ratpack.hikari.HikariModule

import static ratpack.groovy.Groovy.ratpack

ratpack {
	serverConfig {
		yaml "ratpack-hikari.yml"
	}
	bindings {
		moduleConfig(HikariModule, serverConfig.get("/db", HikariConfig))
	}
	handlers {
		get {
			render "Hello World!"
		}
	}
}
