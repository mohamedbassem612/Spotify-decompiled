package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ubc0 {
    public final tv80 a;

    public ubc0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final tv80 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ubc0) && u890.j(this.a, ((ubc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
