package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bym0 implements cym0 {
    public final qxm0 a;

    public bym0(qxm0 qxm0Var) {
        this.a = qxm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bym0) && this.a.equals(((bym0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
