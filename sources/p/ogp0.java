package p;

import io.reactivex.rxjava3.core.Emitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ogp0 extends pgp0 {
    public final Emitter a;

    public ogp0(Emitter emitter) {
        this.a = emitter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogp0) && this.a.equals(((ogp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
