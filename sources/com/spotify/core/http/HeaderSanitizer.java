package com.spotify.core.http;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/spotify/core/http/HeaderSanitizer;", "", "<init>", "()V", "isValid", "", "c", "", "sanitizeValue", "", "value", "src_main_java_com_spotify_connectivity_http-connectivity-http"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class HeaderSanitizer {
    public static final HeaderSanitizer INSTANCE = new HeaderSanitizer();

    private HeaderSanitizer() {
    }

    private final boolean isValid(char c) {
        if (c != '\t') {
            return ' ' <= c && c < 127;
        }
        return true;
    }

    public final String sanitizeValue(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (!INSTANCE.isValid(value.charAt(i))) {
                StringBuilder sb = new StringBuilder(value.length());
                int length = value.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = value.charAt(i2);
                    if (INSTANCE.isValid(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                return sb.toString();
            }
        }
        return value;
    }
}
