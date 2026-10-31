package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l3q0 {
    public final y6b1 a;

    public l3q0(String str) {
        this.a = new y6b1(str, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l3q0) {
            return ((l3q0) obj).a.j(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
