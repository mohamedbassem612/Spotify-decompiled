package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kf31 implements uf31 {
    public final List a;

    public kf31(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kf31) && u890.j(this.a, ((kf31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
