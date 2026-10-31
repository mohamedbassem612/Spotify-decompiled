package p;

import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class mgt extends lft implements ic11 {
    public final Object X;
    public final znb0 Y;
    public final mc11 Z;
    public final mla0 h;
    public final String i;
    public final String t;
    public static final /* synthetic */ mma0[] O0 = {new cey0(mgt.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0)};
    public static final ubc N0 = new ubc((byte) 7);
    public static final Object P0 = new Object();

    public mgt(mla0 mla0Var, String str, String str2, tdy0 tdy0Var, Object obj, rka0 rka0Var) {
        super(rka0Var);
        this.h = mla0Var;
        this.i = str;
        this.t = str2;
        this.X = obj;
        this.Y = dm5.S(2, new b9o(this, (byte) 2));
        this.Z = jhc1.A(tdy0Var, new yft(this, (byte) 0));
    }

    public abstract bgt A();

    @Override // p.dc11
    public final mla0 a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        ic11 ic11VarC = bpi1.c(obj);
        return ic11VarC != null && u890.j(this.h, ic11VarC.a()) && u890.j(this.i, ic11VarC.getName()) && u890.j(this.t, ic11VarC.getSignature()) && u890.j(this.X, ic11VarC.u());
    }

    @Override // p.q6b0
    public final GenericDeclaration findJavaDeclaration() {
        return f3o1.k(this.h, this.t);
    }

    @Override // p.dc11
    public final rzc g() {
        A().getClass();
        return null;
    }

    @Override // p.dc11
    public final rzc getCaller() {
        return A().getCaller();
    }

    @Override // p.qka0
    public final String getName() {
        return this.i;
    }

    @Override // p.ic11
    public final String getSignature() {
        return this.t;
    }

    public final int hashCode() {
        return this.t.hashCode() + cy30.d(this.h.hashCode() * 31, 31, this.i);
    }

    @Override // p.qka0
    public final boolean isSuspend() {
        return false;
    }

    @Override // p.ic11
    public final Field q() {
        return (Field) this.Y.getValue();
    }

    @Override // p.lft
    public final rgt s() {
        a8b0 returnType = t().getReturnType();
        returnType.getClass();
        return new rgt(returnType, u1p1.z(this) ? null : new yft(this, (byte) 1));
    }

    public final String toString() {
        return f4x0.p(this);
    }

    @Override // p.dc11
    public final Object u() {
        return this.X;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public final Member y() throws i9n {
        if (!t().z()) {
            return null;
        }
        heg hegVar = i141.a;
        rja0 rja0VarB = i141.b(t());
        if (rja0VarB instanceof rja0) {
            rja0 rja0Var = rja0VarB;
            if (rja0Var.F().h()) {
                wja0 wja0VarG = rja0Var.F().g();
                if (!wja0VarG.j() || !wja0VarG.i()) {
                    return null;
                }
                return this.h.z(rja0Var.D().getString(wja0VarG.h()), rja0Var.D().getString(wja0VarG.g()));
            }
        }
        return q();
    }

    @Override // p.lft
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final tdy0 t() {
        mma0 mma0Var = O0[0];
        return (tdy0) this.Z.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mgt(mla0 mla0Var, String str, String str2, Object obj) {
        this(mla0Var, str, str2, null, obj, qpn1.l());
        rka0 rka0Var = rka0.i;
    }

    public mgt(mla0 mla0Var, tdy0 tdy0Var, rka0 rka0Var) {
        this(mla0Var, tdy0Var.getName().b(), i141.b(tdy0Var).n(), tdy0Var, lyc.NO_RECEIVER, rka0Var);
    }
}
