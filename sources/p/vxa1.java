package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vxa1 {
    public final List a;

    public vxa1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxa1) && u890.j(this.a, ((vxa1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
