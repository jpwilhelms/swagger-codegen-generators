package io.swagger.codegen.v3.generators.handlebars;

import com.github.jknack.handlebars.Options;

public class StringUtilHelper {

    /**
     * concat parameters found to a given string.
     * @param element
     * @param options
     * @return
     */
    public String concat(String element, Options options) {
        final StringBuilder builder = new StringBuilder(element);
        if (options.params != null && options.params.length > 0) {
            for (Object param : options.params) {
                builder.append(param);
            }
        }
        return builder.toString();
    }

    public String backSlash() {
        return "\\";
    }

    public String escapePattern( String text ) {
        return text.replace("\\", "\\\\");
    }

    public String escapeDoubleQuote( String text ) {
        if( text == null ) {
            return "";
        }
        return text.replace( "\"", "\\\"" );
    }

    public String escapeJavaString( String text ) {
        if( text == null ) {
            return "";
        }
        return escapeDoubleQuote( text ).replaceAll( "[\r\n]+", " " );
    }
}
