package com.spotify.interapp.service;

import io.reactivex.rxjava3.core.Observable;
import p.es5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class IapException extends RuntimeException {
    public final Object a;
    public final String b;

    public IapException(String str, Exception exc) {
        super(exc);
        this.a = str;
        this.b = "wamp.error";
    }

    public static Observable a(String str) {
        return Observable.error(new IapException(new es5(str), "wamp.error"));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return String.format("IapException{%s %s}", this.b, this.a);
    }

    public IapException(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }
}
