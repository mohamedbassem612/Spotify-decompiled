package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sr60 {
    public final boolean a;
    public final twj1 b;

    public sr60(boolean z, twj1 twj1Var) {
        this.a = z;
        this.b = twj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr60)) {
            return false;
        }
        sr60 sr60Var = (sr60) obj;
        return this.a == sr60Var.a && this.b.equals(sr60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
