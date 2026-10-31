package com.google.android.gms.internal.meet_coactivities;

import p.bhn0;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzpj {
    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        bhn0.i(str.concat(" must not be null"));
        return null;
    }

    public static String zzb(String str) {
        if (str.isEmpty()) {
            hhg1.n("identifier must not be empty");
            return null;
        }
        if (!zzd(str.charAt(0))) {
            hhg1.n("identifier must start with an ASCII letter: ".concat(str));
            return null;
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!zzd(cCharAt) && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
                hhg1.n("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                return null;
            }
        }
        return str;
    }

    public static void zzc(boolean z, String str) {
        if (z) {
            return;
        }
        hhg1.n(str);
    }

    private static boolean zzd(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }
}
