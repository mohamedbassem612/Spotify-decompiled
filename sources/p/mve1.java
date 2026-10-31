package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mve1 implements e0x {
    public final a2x a;

    public mve1(a2x a2xVar) {
        this.a = a2xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mve1) && u890.j(this.a, ((mve1) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.a);
    }
}
