package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xp3 extends hr3 {
    public final d6c0 a;

    public xp3(d6c0 d6c0Var) {
        this.a = d6c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xp3) && this.a.equals(((xp3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
