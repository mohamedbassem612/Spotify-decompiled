package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class isb0 implements ifh0 {
    public final dsb0 a;
    public final tlc1 b;
    public final esb0 c;
    public final fdn0 d;
    public final fdn0 e;

    public isb0(dsb0 dsb0Var, tlc1 tlc1Var) {
        this.a = dsb0Var;
        this.b = tlc1Var;
        this.c = (esb0) dsb0Var.b.invoke();
        fdn0 fdn0Var = pr80.a;
        this.d = new fdn0();
        this.e = new fdn0();
    }

    @Override // p.ifh0
    public final hfh0 B(int i, int i2, Map map, iu30 iu30Var, iu30 iu30Var2) {
        return this.b.B(i, i2, map, iu30Var, iu30Var2);
    }

    @Override // p.wat
    public final long I(int i) {
        return this.b.I(i);
    }

    @Override // p.wat
    public final long L(float f) {
        return this.b.L(f);
    }

    @Override // p.wat
    public final float M0(int i) {
        return this.b.M0(i);
    }

    @Override // p.wat
    public final float N0(float f) {
        return this.b.N0(f);
    }

    @Override // p.ifh0
    public final hfh0 S(int i, int i2, Map map, iu30 iu30Var) {
        return this.b.S(i, i2, map, iu30Var);
    }

    @Override // p.wat
    public final float U0() {
        return this.b.U0();
    }

    @Override // p.p890
    public final boolean W() {
        return this.b.W();
    }

    @Override // p.wat
    public final float X0(float f) {
        return this.b.X0(f);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final List a(int i) {
        fdn0 fdn0Var = this.e;
        List list = (List) fdn0Var.b(i);
        if (list != null) {
            return list;
        }
        esb0 esb0Var = this.c;
        Object objD = esb0Var.d(i);
        List listP = this.b.P(objD, this.a.a(i, objD, esb0Var.b(i)));
        fdn0Var.i(i, listP);
        return listP;
    }

    @Override // p.p890
    public final flb0 getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override // p.wat
    public final float h() {
        return this.b.h();
    }

    @Override // p.wat
    public final int i0(float f) {
        return this.b.i0(f);
    }

    @Override // p.wat
    public final long k1(long j) {
        return this.b.k1(j);
    }

    @Override // p.wat
    public final float q0(long j) {
        return this.b.q0(j);
    }

    @Override // p.wat
    public final long s(float f) {
        return this.b.s(f);
    }

    @Override // p.wat
    public final long t(long j) {
        return this.b.t(j);
    }

    @Override // p.wat
    public final float y(long j) {
        return this.b.y(j);
    }
}
