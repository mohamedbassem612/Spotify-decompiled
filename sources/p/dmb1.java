package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dmb1 implements job1 {
    public final int a;
    public final String b;

    public dmb1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmb1)) {
            return false;
        }
        dmb1 dmb1Var = (dmb1) obj;
        return this.a == dmb1Var.a && u890.j(this.b, dmb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
