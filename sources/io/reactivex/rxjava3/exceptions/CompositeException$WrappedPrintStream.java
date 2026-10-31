package io.reactivex.rxjava3.exceptions;

import java.io.PrintStream;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CompositeException$WrappedPrintStream extends CompositeException$PrintStreamOrWriter {
    public final PrintStream a;

    public CompositeException$WrappedPrintStream(PrintStream printStream) {
        this.a = printStream;
    }

    @Override // io.reactivex.rxjava3.exceptions.CompositeException$PrintStreamOrWriter
    public final CompositeException$PrintStreamOrWriter a(Serializable serializable) {
        this.a.print(serializable);
        return this;
    }
}
