package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class bgt extends zft implements gma0 {
    public static final /* synthetic */ mma0[] t = {new cey0(bgt.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0)};
    public final mc11 h = jhc1.A((jyc) null, new agt(this, 0));
    public final znb0 i = dm5.S(2, new agt(this, 1));

    public final boolean equals(Object obj) {
        return (obj instanceof bgt) && u890.j(z(), ((bgt) obj).z());
    }

    public final rzc getCaller() {
        return (rzc) this.i.getValue();
    }

    public final String getName() {
        return gvg.k(new StringBuilder("<get-"), z().i, '>');
    }

    public final int hashCode() {
        return z().hashCode();
    }

    public final rgt s() {
        return (rgt) z().getReturnType();
    }

    public final jyc t() {
        mma0 mma0Var = t[0];
        return (zdy0) this.h.invoke();
    }

    public final String toString() {
        return "getter of " + z();
    }

    @Override // p.zft
    public final rdy0 y() {
        mma0 mma0Var = t[0];
        return (zdy0) this.h.invoke();
    }
}
