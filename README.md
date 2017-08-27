# graylog-example
An example of how to use graylog

This is the logback file I used in this project:

<configuration>
 
    <appender name="GELF" class="de.siegmar.logbackgelf.GelfUdpAppender">
        <graylogHost>127.0.0.1</graylogHost>
        <graylogPort>12201</graylogPort>
        <maxChunkSize>508</maxChunkSize>
        <useCompression>true</useCompression>
        <layout class="de.siegmar.logbackgelf.GelfLayout">
            <includeRawMessage>false</includeRawMessage>
            <includeMarker>true</includeMarker>
            <includeMdcData>true</includeMdcData>
            <includeCallerData>false</includeCallerData>
            <includeRootCauseData>false</includeRootCauseData>
            <includeLevelName>true</includeLevelName>
            <shortPatternLayout class="ch.qos.logback.classic.PatternLayout">
                <pattern>%m%nopex</pattern>
            </shortPatternLayout>
            <fullPatternLayout class="ch.qos.logback.classic.PatternLayout">
                <pattern>%m</pattern>
            </fullPatternLayout>
            <staticField>app_name:graylog-example</staticField>
            <staticField>client:local</staticField>
        </layout>
    </appender>

    <root level="INFO">
        <appender-ref ref="GELF" />
    </root>
 
</configuration>

