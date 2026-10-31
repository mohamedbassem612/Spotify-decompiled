package p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lde0 {
    public static int a(String str) {
        Pattern pattern = v9s0.c;
        if (str.length() == 0) {
            return 3;
        }
        return pattern.matcher(str).matches() ? 1 : 2;
    }
}
