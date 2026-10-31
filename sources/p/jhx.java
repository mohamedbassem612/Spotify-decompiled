package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jhx {
    public final ceo a;
    public final ceo b;
    public final ceo c;

    public jhx(ceo ceoVar, ceo ceoVar2, ceo ceoVar3) {
        this.a = ceoVar;
        this.b = ceoVar2;
        this.c = ceoVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhx)) {
            return false;
        }
        jhx jhxVar = (jhx) obj;
        return this.a.equals(jhxVar.a) && this.b.equals(jhxVar.b) && this.c.equals(jhxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
