package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class atc0 extends htc0 {
    public final int a;
    public final List b;

    public atc0(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atc0)) {
            return false;
        }
        atc0 atc0Var = (atc0) obj;
        return this.a == atc0Var.a && u890.j(this.b, atc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
