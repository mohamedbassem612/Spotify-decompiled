package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zqn implements crn {
    public final IOException a;

    public zqn(IOException iOException) {
        this.a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqn) && this.a.equals(((zqn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
