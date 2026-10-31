package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dw3 {
    public final List a;

    public dw3(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dw3) && u890.j(this.a, ((dw3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
