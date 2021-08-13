package io.github.elieof.eoo.uaa.config

import org.intellij.lang.annotations.Language

// Regex for acceptable logins
@Language("RegExp")
const val LOGIN_REGEX: String = "^(?>[a-zA-Z0-9!$&*+=?^_`{|}~.-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)|(?>[_.@A-Za-z0-9-]+)$"
const val SYSTEM_ACCOUNT: String = "system"
const val ANONYMOUS_USER: String = "anonymoususer"
const val DEFAULT_LANGUAGE: String = "en"
