package com.google.android.gms.common.api;

import p.pl10;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final pl10 a;

    public UnsupportedApiCallException(pl10 pl10Var) {
        this.a = pl10Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
