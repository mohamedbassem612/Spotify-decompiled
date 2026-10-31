package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qff1 implements uff1 {
    public final int a;
    public final String b;

    public qff1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qff1)) {
            return false;
        }
        qff1 qff1Var = (qff1) obj;
        return this.a == qff1Var.a && u890.j(this.b, qff1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
