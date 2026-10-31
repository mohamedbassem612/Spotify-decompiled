package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z4w0 implements b5w0 {
    public final List a;

    public z4w0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4w0) && this.a.equals(((z4w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
