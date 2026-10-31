package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vf50 {
    public final List a;

    public vf50(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf50) && u890.j(this.a, ((vf50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
