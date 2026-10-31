package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cxe0 {
    public final l3f0 a;

    public cxe0(l3f0 l3f0Var) {
        this.a = l3f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cxe0) && u890.j(this.a, ((cxe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
