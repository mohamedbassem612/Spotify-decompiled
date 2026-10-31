package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pga1 extends rga1 {
    public final vga1 a;

    public pga1(vga1 vga1Var) {
        this.a = vga1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pga1) && this.a.equals(((pga1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
