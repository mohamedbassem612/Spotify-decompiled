package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ecr {
    public final hi a;
    public final int b;

    public ecr(hi hiVar, int i) {
        this.a = hiVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecr)) {
            return false;
        }
        ecr ecrVar = (ecr) obj;
        return this.a.equals(ecrVar.a) && this.b == ecrVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
