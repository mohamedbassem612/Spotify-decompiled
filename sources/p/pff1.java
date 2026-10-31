package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pff1 implements uff1 {
    public final int a;
    public final String b;

    public pff1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pff1)) {
            return false;
        }
        pff1 pff1Var = (pff1) obj;
        return this.a == pff1Var.a && u890.j(this.b, pff1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
