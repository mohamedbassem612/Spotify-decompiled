package com.spotify.searchview.proto;

import p.c290;
import p.f940;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d implements c290 {
    public final Object convert(int i) {
        f940 f940Var;
        if (i != 0) {
            f940Var = i != 1 ? null : f940.DENY_REASON_ENTITLEMENT_MISSING;
        } else {
            f940Var = f940.DENY_REASON_UNSPECIFIED;
        }
        return f940Var == null ? f940.UNRECOGNIZED : f940Var;
    }
}
