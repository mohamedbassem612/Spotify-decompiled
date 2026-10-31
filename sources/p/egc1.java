package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class egc1 extends nko1 {
    public final int b;
    public final dro c;

    public egc1(int i, dro droVar) {
        this.b = i;
        this.c = droVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egc1)) {
            return false;
        }
        egc1 egc1Var = (egc1) obj;
        return this.b == egc1Var.b && this.c.equals(egc1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }
}
