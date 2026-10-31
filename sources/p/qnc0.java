package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qnc0 {
    public final int a;
    public final List b;

    public qnc0(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnc0)) {
            return false;
        }
        qnc0 qnc0Var = (qnc0) obj;
        return this.a == qnc0Var.a && this.b.equals(qnc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
