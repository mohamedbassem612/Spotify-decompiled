package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qcr {
    public final hi a;
    public final mj b;
    public final int c;

    public qcr(hi hiVar, mj mjVar, int i) {
        this.a = hiVar;
        this.b = mjVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcr)) {
            return false;
        }
        qcr qcrVar = (qcr) obj;
        return u890.j(this.a, qcrVar.a) && u890.j(this.b, qcrVar.b) && this.c == qcrVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ qcr(hi hiVar, mj mjVar) {
        this(hiVar, mjVar, 1);
    }
}
