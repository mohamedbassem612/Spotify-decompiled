package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zvc1 {
    public final iys0 a;

    public zvc1(iys0 iys0Var) {
        this.a = iys0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zvc1) && u890.j(this.a, ((zvc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
