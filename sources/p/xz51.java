package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xz51 implements yz51 {
    public final List a;

    public xz51(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xz51) && u890.j(this.a, ((xz51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
