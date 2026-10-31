package com.spotify.searchview.v1;

import p.c290;
import p.g940;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b implements c290 {
    public final Object convert(int i) {
        g940 g940Var;
        if (i != 0) {
            g940Var = i != 1 ? null : g940.DENY_REASON_ENTITLEMENT_MISSING;
        } else {
            g940Var = g940.DENY_REASON_UNSPECIFIED;
        }
        return g940Var == null ? g940.UNRECOGNIZED : g940Var;
    }
}
