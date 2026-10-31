package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class arf1 implements brf1 {
    public final int a;
    public final String b;

    public arf1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arf1)) {
            return false;
        }
        arf1 arf1Var = (arf1) obj;
        return this.a == arf1Var.a && u890.j(this.b, arf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
