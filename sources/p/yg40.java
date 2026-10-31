package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yg40 implements zg40 {
    public final nmu0 a;

    public yg40(nmu0 nmu0Var) {
        this.a = nmu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg40) && this.a == ((yg40) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
