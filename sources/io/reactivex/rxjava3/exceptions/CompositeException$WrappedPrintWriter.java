package io.reactivex.rxjava3.exceptions;

import java.io.PrintWriter;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CompositeException$WrappedPrintWriter extends CompositeException$PrintStreamOrWriter {
    public final PrintWriter a;

    public CompositeException$WrappedPrintWriter(PrintWriter printWriter) {
        this.a = printWriter;
    }

    @Override // io.reactivex.rxjava3.exceptions.CompositeException$PrintStreamOrWriter
    public final CompositeException$PrintStreamOrWriter a(Serializable serializable) {
        this.a.print(serializable);
        return this;
    }
}
