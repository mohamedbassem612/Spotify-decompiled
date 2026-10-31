package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qmq0 {
    public final List a;
    public final gfe b;
    public final boolean c;

    public qmq0(List list, gfe gfeVar, boolean z) {
        this.a = list;
        this.b = gfeVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmq0)) {
            return false;
        }
        qmq0 qmq0Var = (qmq0) obj;
        return this.a.equals(qmq0Var.a) && this.b == qmq0Var.b && this.c == qmq0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
