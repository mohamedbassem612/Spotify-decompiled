package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bkk extends jkk {
    public final zj51 a;

    public bkk(zj51 zj51Var) {
        this.a = zj51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bkk) && this.a.equals(((bkk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
