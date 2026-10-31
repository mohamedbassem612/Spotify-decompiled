package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ydg {
    public final zjn0 a;
    public final hfy0 b;
    public final ava c;
    public final mka1 d;

    public ydg(zjn0 zjn0Var, hfy0 hfy0Var, ava avaVar, mka1 mka1Var) {
        this.a = zjn0Var;
        this.b = hfy0Var;
        this.c = avaVar;
        this.d = mka1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydg)) {
            return false;
        }
        ydg ydgVar = (ydg) obj;
        return u890.j(this.a, ydgVar.a) && u890.j(this.b, ydgVar.b) && this.c.equals(ydgVar.c) && u890.j(this.d, ydgVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
