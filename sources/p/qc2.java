package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qc2 extends rc2 {
    public final List d;

    public qc2(List list) {
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc2) && this.d.equals(((qc2) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
