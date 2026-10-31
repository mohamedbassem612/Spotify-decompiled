package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hqa extends iqa {
    public final int a;
    public final w8d1 b;

    public hqa(int i, w8d1 w8d1Var) {
        this.a = i;
        this.b = w8d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqa)) {
            return false;
        }
        hqa hqaVar = (hqa) obj;
        return this.a == hqaVar.a && this.b.equals(hqaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
