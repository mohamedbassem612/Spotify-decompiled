package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzml implements zzls {
    private static final Set zza = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));
    private final StringBuilder zzd;
    private boolean zze = false;
    private final String zzb = "[CONTEXT ";
    private final String zzc = " ]";

    public zzml(String str, String str2, StringBuilder sb) {
        this.zzd = sb;
    }

    private static int zzc(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt == '\"' || cCharAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzls
    public final void zza(String str, Object obj) {
        boolean z = this.zze;
        StringBuilder sb = this.zzd;
        if (z) {
            sb.append(' ');
        } else {
            if (sb.length() > 0) {
                StringBuilder sb2 = this.zzd;
                sb2.append((sb2.length() > 1000 || this.zzd.indexOf("\n") != -1) ? '\n' : ' ');
            }
            this.zzd.append(this.zzb);
            this.zze = true;
        }
        StringBuilder sb3 = this.zzd;
        sb3.append(str);
        sb3.append('=');
        if (obj == null) {
            sb3.append(true);
            return;
        }
        if (zza.contains(obj.getClass())) {
            sb3.append(obj);
            return;
        }
        sb3.append('\"');
        String string = obj.toString();
        int i = 0;
        while (true) {
            int iZzc = zzc(string, i);
            if (iZzc == -1) {
                sb3.append((CharSequence) string, i, string.length());
                sb3.append('\"');
                return;
            }
            sb3.append((CharSequence) string, i, iZzc);
            i = iZzc + 1;
            char cCharAt = string.charAt(iZzc);
            if (cCharAt == '\t') {
                cCharAt = 't';
            } else if (cCharAt == '\n') {
                cCharAt = 'n';
            } else if (cCharAt == '\r') {
                cCharAt = 'r';
            } else if (cCharAt != '\"' && cCharAt != '\\') {
                sb3.append((char) 65533);
            }
            sb3.append("\\");
            sb3.append(cCharAt);
        }
    }

    public final void zzb() {
        if (this.zze) {
            this.zzd.append(this.zzc);
        }
    }
}
