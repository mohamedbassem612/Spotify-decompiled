package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lb40 extends rb40 {
    public final int a;
    public final String b;

    public lb40(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb40)) {
            return false;
        }
        lb40 lb40Var = (lb40) obj;
        return this.a == lb40Var.a && this.b.equals(lb40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
