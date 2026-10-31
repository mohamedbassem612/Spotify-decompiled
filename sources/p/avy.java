package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class avy {
    public final y4m a;
    public final r840 b;

    public avy(y4m y4mVar, r840 r840Var) {
        this.a = y4mVar;
        this.b = r840Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avy)) {
            return false;
        }
        avy avyVar = (avy) obj;
        return this.a.equals(avyVar.a) && this.b.equals(avyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
