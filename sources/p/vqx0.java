package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vqx0 extends frx0 {
    public final List a;

    public vqx0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqx0) && u890.j(this.a, ((vqx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
