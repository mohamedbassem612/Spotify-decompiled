package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xis0 extends zis0 {
    public final bro1 a;

    public xis0(bro1 bro1Var) {
        this.a = bro1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xis0) && u890.j(this.a, ((xis0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
