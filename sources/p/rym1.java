package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rym1 {
    public final byte a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public rym1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rym1)) {
            return false;
        }
        rym1 rym1Var = (rym1) obj;
        return this.a == rym1Var.a && u890.j(this.b, rym1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
