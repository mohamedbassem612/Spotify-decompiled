package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vzi1 implements wzi1 {
    public final szi1 a;

    public vzi1(szi1 szi1Var) {
        this.a = szi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzi1) && this.a.equals(((vzi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
