package p;

import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hqb0 extends ceg {
    public final o60 N0;
    public final boolean O0;
    public final vht P0;
    public final lqb0 Q0;
    public final io41 R0;
    public final ph80 S0;
    public final brb0 T0;
    public final eqb0 U0;
    public final toe0 V0;
    public final idd1 X;
    public final int Y;
    public final int Z;
    public final o860 g;
    public final mb11 h;
    public final beg i;
    public final o860 t;

    static {
        f46.S0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    public hqb0(o860 o860Var, n9r n9rVar, mb11 mb11Var, beg begVar) {
        super((voe0) ((uw0) o860Var.b).d, n9rVar, mb11Var.f(), wdx0.b(mb11Var));
        this.g = o860Var;
        this.h = mb11Var;
        this.i = begVar;
        int i = 4;
        o860 o860VarO = ryn1.o(o860Var, this, mb11Var, 4);
        this.t = o860VarO;
        voe0 voe0Var = (voe0) ((uw0) o860VarO.b).d;
        this.X = new idd1(new fqb0(this, (byte) 0));
        Class cls = mb11Var.a;
        this.Y = cls.isAnnotation() ? 5 : cls.isInterface() ? 2 : cls.isEnum() ? 3 : 1;
        if (cls.isAnnotation() || cls.isEnum()) {
            i = 1;
        } else {
            boolean zJ = mb11Var.j();
            boolean z = mb11Var.j() || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            if (zJ) {
                i = 2;
            } else if (!z) {
                if (zIsFinal) {
                    i = 1;
                } else {
                    i = 3;
                }
            }
        }
        this.Z = i;
        int modifiers = cls.getModifiers();
        this.N0 = Modifier.isPublic(modifiers) ? k9a0.O0 : Modifier.isPrivate(modifiers) ? k9a0.Y : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? k9a0.g : k9a0.f : k9a0.e;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.O0 = ((declaringClass != null ? new mb11(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.P0 = new vht(this);
        lqb0 lqb0Var = new lqb0(o860VarO, this, mb11Var, begVar != null, null);
        this.Q0 = lqb0Var;
        twb twbVar = io41.d;
        gqb0 gqb0Var = new gqb0(this, (byte) 0);
        twbVar.getClass();
        this.R0 = new io41(this, voe0Var, gqb0Var);
        this.S0 = new ph80(lqb0Var);
        this.T0 = new brb0(o860VarO, mb11Var, this);
        this.U0 = flo1.n(o860VarO, mb11Var);
        this.V0 = new toe0(voe0Var, new fqb0(this, (byte) 1));
    }

    @Override // p.beg
    public final xdg B() {
        return null;
    }

    @Override // p.y5, p.beg
    public final zpi0 O() {
        return this.S0;
    }

    @Override // p.beg
    public final ksi1 Q() {
        return null;
    }

    @Override // p.y5, p.beg
    public final zpi0 R() {
        return (lqb0) super.R();
    }

    @Override // p.zji0
    public final boolean S() {
        return false;
    }

    @Override // p.beg
    public final boolean U() {
        return false;
    }

    @Override // p.beg
    public final boolean W() {
        return false;
    }

    @Override // p.zji0
    public final boolean Z() {
        return false;
    }

    @Override // p.beg
    public final zpi0 a0() {
        return this.T0;
    }

    @Override // p.wim0
    public final zpi0 c0(g8b0 g8b0Var) {
        io41 io41Var = this.R0;
        y5 y5Var = io41Var.a;
        int i = kht.a;
        iht.c(y5Var);
        toe0 toe0Var = io41Var.c;
        mma0 mma0Var = io41.e[0];
        return (lqb0) ((zpi0) toe0Var.invoke());
    }

    @Override // p.beg
    public final int e0() {
        return this.Y;
    }

    @Override // p.jfg
    public final h0h1 g() {
        return this.P0;
    }

    public final fg5 getAnnotations() {
        return this.U0;
    }

    @Override // p.beg, p.zji0, p.s9r
    public final lht getVisibility() {
        lht lhtVar = mht.a;
        o60 o60Var = this.N0;
        if (u890.j(o60Var, lhtVar)) {
            Class<?> declaringClass = this.h.a.getDeclaringClass();
            if ((declaringClass != null ? new mb11(declaringClass) : null) == null) {
                return y7a0.a;
            }
        }
        return kuo1.k(o60Var);
    }

    @Override // p.beg
    public final Collection h() {
        return (List) this.Q0.q.invoke();
    }

    @Override // p.beg
    public final boolean isInline() {
        return false;
    }

    @Override // p.kfg
    public final boolean j() {
        return this.O0;
    }

    @Override // p.beg, p.kfg
    public final List n() {
        return (List) this.V0.invoke();
    }

    @Override // p.beg, p.zji0
    public final int o() {
        return this.Z;
    }

    @Override // p.beg
    public final boolean p() {
        return false;
    }

    @Override // p.beg
    public final boolean p0() {
        return false;
    }

    public final lqb0 r0() {
        return (lqb0) super.R();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lazy Java class ");
        int i = kht.a;
        sb.append(iht.f(this));
        return sb.toString();
    }
}
