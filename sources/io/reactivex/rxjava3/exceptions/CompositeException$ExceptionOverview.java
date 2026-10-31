package io.reactivex.rxjava3.exceptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CompositeException$ExceptionOverview extends RuntimeException {
    public CompositeException$ExceptionOverview(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
