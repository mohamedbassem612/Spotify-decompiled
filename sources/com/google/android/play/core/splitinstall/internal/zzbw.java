package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzbw {
    public static String zza(File file) {
        if (!file.getName().endsWith(".apk")) {
            hhg1.n("Non-apk found in splits directory.");
            return null;
        }
        String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        if (strReplaceFirst.equals("base-master") || strReplaceFirst.equals("base-main")) {
            return "";
        }
        return strReplaceFirst.startsWith("base-") ? strReplaceFirst.replace("base-", "config.") : strReplaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }
}
