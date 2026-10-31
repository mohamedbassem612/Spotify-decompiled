package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bnd1 extends dnd1 {
    public final int a;

    public bnd1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bnd1) && this.a == ((bnd1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
