package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class dgt extends zft implements tla0 {
    public static final /* synthetic */ mma0[] t = {new cey0(dgt.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0)};
    public final mc11 h = jhc1.A((jyc) null, new cgt(this, 0));
    public final znb0 i = dm5.S(2, new cgt(this, 1));

    public final boolean equals(Object obj) {
        return (obj instanceof dgt) && u890.j(z(), ((dgt) obj).z());
    }

    public final rzc getCaller() {
        return (rzc) this.i.getValue();
    }

    public final String getName() {
        return gvg.k(new StringBuilder("<set-"), z().i, '>');
    }

    public final int hashCode() {
        return z().hashCode();
    }

    public final rgt s() {
        mma0 mma0Var = t[0];
        return new rgt(kht.e((fey0) this.h.invoke()).x(), b69.f, false);
    }

    public final jyc t() {
        mma0 mma0Var = t[0];
        return (fey0) this.h.invoke();
    }

    public final String toString() {
        return "setter of " + z();
    }

    public final lft x(rka0 rka0Var) {
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // p.zft
    public final rdy0 y() {
        mma0 mma0Var = t[0];
        return (fey0) this.h.invoke();
    }
}
