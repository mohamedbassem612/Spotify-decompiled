package com.google.android.gms.internal.meet_coactivities;

import p.dv20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzpg extends RuntimeException {
    private zzpg(String str, String str2) {
        super(str);
    }

    public static zzpg zza(String str, String str2, int i) {
        return new zzpg(zze(str, str2, i, i + 1), str2);
    }

    public static zzpg zzb(String str, String str2) {
        return new zzpg(str, str2);
    }

    public static zzpg zzc(String str, String str2, int i, int i2) {
        return new zzpg(zze(str, str2, i, i2), str2);
    }

    public static zzpg zzd(String str, String str2, int i) {
        return new zzpg(zze(str, str2, i, -1), str2);
    }

    private static String zze(String str, String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sbG = dv20.g(str, ": ");
        if (i > 8) {
            sbG.append("...");
            sbG.append((CharSequence) str2, i - 5, i);
        } else {
            sbG.append((CharSequence) str2, 0, i);
        }
        sbG.append('[');
        sbG.append(str2.substring(i, i2));
        sbG.append(']');
        if (str2.length() - i2 > 8) {
            sbG.append((CharSequence) str2, i2, i2 + 5);
            sbG.append("...");
        } else {
            sbG.append((CharSequence) str2, i2, str2.length());
        }
        return sbG.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
