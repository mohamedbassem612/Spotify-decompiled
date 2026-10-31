package org.apache.commons.io;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class TaggedIOException extends IOExceptionWithCause {
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return (IOException) super.getCause();
    }
}
