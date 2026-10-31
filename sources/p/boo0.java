package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class boo0 {
    public final aoo0 a;

    public boo0(aoo0 aoo0Var) {
        this.a = aoo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof boo0) && this.a.equals(((boo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
