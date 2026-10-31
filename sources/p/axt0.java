package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class axt0 {
    public final int a;
    public final Object b;

    public axt0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axt0)) {
            return false;
        }
        axt0 axt0Var = (axt0) obj;
        return this.a == axt0Var.a && this.b.equals(axt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
