package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class muf implements puf {
    public final a5i1 a;

    public muf(a5i1 a5i1Var) {
        this.a = a5i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof muf) && u890.j(this.a, ((muf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
