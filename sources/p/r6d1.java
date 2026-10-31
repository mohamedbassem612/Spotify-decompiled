package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r6d1 implements v6d1 {
    public final a6d1 a;

    public r6d1(a6d1 a6d1Var) {
        this.a = a6d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6d1) && u890.j(this.a, ((r6d1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
