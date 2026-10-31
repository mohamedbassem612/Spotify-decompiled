package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class qcg1 {
    public static final pcg1 Companion = new pcg1();
    public final String a;
    public final String b;

    public /* synthetic */ qcg1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ocg1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcg1)) {
            return false;
        }
        qcg1 qcg1Var = (qcg1) obj;
        return u890.j(this.a, qcg1Var.a) && u890.j(this.b, qcg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
