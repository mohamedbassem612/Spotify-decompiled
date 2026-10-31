package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o0l extends p0l {
    public final List a;

    public o0l(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0l) && this.a.equals(((o0l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
