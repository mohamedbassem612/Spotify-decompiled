package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uo01 implements wo01 {
    public final int a;
    public final List b;

    public uo01(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo01)) {
            return false;
        }
        uo01 uo01Var = (uo01) obj;
        return this.a == uo01Var.a && u890.j(this.b, uo01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public /* synthetic */ uo01(int i) {
        this(i, z6x.a);
    }
}
