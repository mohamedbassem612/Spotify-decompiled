package com.google.android.gms.internal.meet_coactivities;

import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
enum zzov {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    public static /* bridge */ /* synthetic */ zzov zza(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        eg.f("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return null;
    }
}
