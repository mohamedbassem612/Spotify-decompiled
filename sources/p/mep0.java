package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mep0 implements nma0 {
    public final nma0 a;
    public final i661 b;

    public mep0(nma0 nma0Var) {
        this.a = nma0Var;
        this.b = new i661(nma0Var.getDescriptor());
    }

    @Override // p.nma0
    public final Object deserialize(dar darVar) {
        if (darVar.X()) {
            return darVar.Y(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mep0.class == obj.getClass() && u890.j(this.a, ((mep0) obj).a);
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        if (obj != null) {
            uaxVar.i(this.a, obj);
        } else {
            uaxVar.J();
        }
    }
}
