package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class no0 implements zo0 {
    public final mmr0 a;

    public no0(mmr0 mmr0Var) {
        this.a = mmr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof no0) && this.a.equals(((no0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
