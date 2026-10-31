package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vn3 extends qxd0 {
    public final List d;

    public vn3(List list) {
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn3) && this.d.equals(((vn3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
