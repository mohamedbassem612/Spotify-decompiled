package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vnf1 {
    public final String a;
    public final String b;
    public final unf1 c;
    public final tnf1 d;
    public final yzu e;

    public vnf1(String str, String str2, unf1 unf1Var, tnf1 tnf1Var, yzu yzuVar) {
        this.a = str;
        this.b = str2;
        this.c = unf1Var;
        this.d = tnf1Var;
        this.e = yzuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vnf1) {
            vnf1 vnf1Var = (vnf1) obj;
            return this.a.equals(vnf1Var.a) && this.b.equals(vnf1Var.b) && this.c.equals(vnf1Var.c) && this.d.equals(vnf1Var.d) && this.e == vnf1Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }
}
