package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kod1 extends lod1 {
    public final int a;
    public final String b;

    public kod1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kod1)) {
            return false;
        }
        kod1 kod1Var = (kod1) obj;
        return this.a == kod1Var.a && u890.j(this.b, kod1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
