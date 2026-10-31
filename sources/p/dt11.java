package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dt11 {
    public final q1v a;
    public final q1v b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dt11(q1v q1vVar, int i) {
        int i2 = i & 1;
        q1v q1vVar2 = q1v.a;
        this(i2 != 0 ? q1vVar2 : q1vVar, q1vVar2);
    }

    public final q1v a(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return this.a;
        }
        if (iC == 1) {
            return this.b;
        }
        eg.o();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt11)) {
            return false;
        }
        dt11 dt11Var = (dt11) obj;
        return this.a == dt11Var.a && this.b == dt11Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public dt11(q1v q1vVar, q1v q1vVar2) {
        this.a = q1vVar;
        this.b = q1vVar2;
    }
}
