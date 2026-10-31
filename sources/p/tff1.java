package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tff1 implements uff1 {
    public final int a;
    public final String b;

    public tff1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tff1)) {
            return false;
        }
        tff1 tff1Var = (tff1) obj;
        return this.a == tff1Var.a && u890.j(this.b, tff1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
