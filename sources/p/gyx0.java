package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gyx0 extends iyx0 {
    public final IOException a;

    public gyx0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gyx0) && this.a.equals(((gyx0) obj).a);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
