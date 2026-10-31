package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r3w0 {
    public final List a;

    public r3w0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3w0) && this.a.equals(((r3w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
