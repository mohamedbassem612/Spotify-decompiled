package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mi61 {
    public final Object a;
    public final yh0 b;
    public boolean c = false;

    public mi61(Object obj, yh0 yh0Var) {
        this.a = obj;
        this.b = yh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mi61) {
            mi61 mi61Var = (mi61) obj;
            if (this.a == mi61Var.a && this.b == mi61Var.b && this.c == mi61Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
