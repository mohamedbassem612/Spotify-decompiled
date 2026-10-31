package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wht extends y5 implements n9r {
    public final vht N0;
    public final io41 O0;
    public final mxr P0;
    public final n9r Q0;
    public final soe0 R0;
    public final toe0 S0;
    public final soe0 T0;
    public final ihy0 U0;
    public final fg5 V0;
    public final int X;
    public final byp Y;
    public final aqi0 Z;
    public final hfy0 e;
    public final ava f;
    public final mka1 g;
    public final heg h;
    public final int i;
    public final lht t;

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    public wht(byp bypVar, hfy0 hfy0Var, zjn0 zjn0Var, ava avaVar, mka1 mka1Var) {
        int i;
        lht lhtVar;
        int i2;
        int i3;
        aqi0 csb1Var;
        super((s1c1) ((ks6) bypVar.b).a, dem1.x(zjn0Var, hfy0Var.e).f());
        this.e = hfy0Var;
        this.f = avaVar;
        this.g = mka1Var;
        this.h = dem1.x(zjn0Var, hfy0Var.e);
        agy0 agy0Var = (agy0) no20.e.d(hfy0Var.d);
        int i4 = agy0Var == null ? -1 : phy0.a[agy0Var.ordinal()];
        byte b = 3;
        if (i4 == 1) {
            i = 1;
        } else if (i4 == 2) {
            i = 3;
        } else if (i4 == 3) {
            i = 4;
        } else if (i4 != 4) {
            i = 1;
        } else {
            i = 2;
        }
        this.i = i;
        fhy0 fhy0Var = (fhy0) no20.d.d(hfy0Var.d);
        switch (fhy0Var == null ? -1 : qhy0.b[fhy0Var.ordinal()]) {
            case 1:
                lhtVar = mht.d;
                break;
            case 2:
                lhtVar = mht.a;
                break;
            case 3:
                lhtVar = mht.b;
                break;
            case 4:
                lhtVar = mht.c;
                break;
            case 5:
                lhtVar = mht.e;
                break;
            case 6:
                lhtVar = mht.f;
                break;
            default:
                lhtVar = mht.a;
                break;
        }
        this.t = lhtVar;
        gfy0 gfy0Var = (gfy0) no20.f.d(hfy0Var.d);
        switch (gfy0Var != null ? phy0.b[gfy0Var.ordinal()] : -1) {
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i3 = 5;
                i2 = i3;
                break;
            case 6:
            case 7:
                i3 = 6;
                i2 = i3;
                break;
            default:
                i2 = 1;
                break;
        }
        this.X = i2;
        List list = hfy0Var.g;
        l141 l141Var = new l141(hfy0Var.a1);
        y3j1 y3j1Var = y3j1.b;
        byp bypVarG = bypVar.g(this, list, zjn0Var, l141Var, l0p1.h(hfy0Var.c1), avaVar);
        ks6 ks6Var = (ks6) bypVarG.b;
        s1c1 s1c1Var = (s1c1) ks6Var.a;
        this.Y = bypVarG;
        boolean zBooleanValue = no20.m.d(hfy0Var.d).booleanValue();
        byte b2 = 0;
        if (i2 == 3) {
            csb1Var = new csb1(s1c1Var, this, zBooleanValue || u890.j(((s0z) ks6Var.R0).g(), Boolean.TRUE));
        } else {
            csb1Var = ypi0.b;
        }
        this.Z = csb1Var;
        this.N0 = new vht(this);
        twb twbVar = io41.d;
        ((cao0) ((bao0) ks6Var.P0)).getClass();
        r1t r1tVar = new r1t(1, this, uht.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0, (byte) 4);
        twbVar.getClass();
        this.O0 = new io41(this, s1c1Var, r1tVar);
        this.P0 = i2 == 3 ? new mxr(this) : null;
        n9r n9rVar = (n9r) bypVar.a;
        this.Q0 = n9rVar;
        this.R0 = new soe0((voe0) s1c1Var, new qht(this, b2));
        this.S0 = new toe0((voe0) s1c1Var, new qht(this, (byte) 1));
        new soe0((voe0) s1c1Var, new qht(this, (byte) 2));
        this.T0 = new soe0((voe0) s1c1Var, new qht(this, b));
        zjn0 zjn0Var2 = (zjn0) bypVarG.c;
        l141 l141Var2 = (l141) bypVarG.d;
        wht whtVar = n9rVar instanceof wht ? (wht) n9rVar : null;
        this.U0 = new ihy0(hfy0Var, zjn0Var2, l141Var2, mka1Var, whtVar != null ? whtVar.U0 : null);
        this.V0 = !no20.c.d(hfy0Var.d).booleanValue() ? rzs0.g : new leo0(s1c1Var, new qht(this, (byte) 4));
    }

    @Override // p.beg
    public final xdg B() {
        return (xdg) this.R0.invoke();
    }

    @Override // p.beg
    public final ksi1 Q() {
        return (ksi1) this.T0.invoke();
    }

    @Override // p.zji0
    public final boolean S() {
        return false;
    }

    @Override // p.y5, p.beg
    public final List T() {
        byp bypVar = this.Y;
        List listM = p2o1.m(this.e, (l141) bypVar.d);
        ArrayList arrayList = new ArrayList(q7h.U(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(new rob0(q0(), new gbm(this, ((mxa1) bypVar.h).m((rgy0) it.next()), null, (byte) 0), rzs0.g));
        }
        return arrayList;
    }

    @Override // p.beg
    public final boolean U() {
        return no20.f.d(this.e.d) == gfy0.COMPANION_OBJECT;
    }

    @Override // p.beg
    public final boolean W() {
        return no20.l.d(this.e.d).booleanValue();
    }

    @Override // p.zji0
    public final boolean Z() {
        return no20.j.d(this.e.d).booleanValue();
    }

    @Override // p.beg
    public final zpi0 a0() {
        return this.Z;
    }

    @Override // p.wim0
    public final zpi0 c0(g8b0 g8b0Var) {
        io41 io41Var = this.O0;
        y5 y5Var = io41Var.a;
        int i = kht.a;
        iht.c(y5Var);
        toe0 toe0Var = io41Var.c;
        mma0 mma0Var = io41.e[0];
        return (zpi0) toe0Var.invoke();
    }

    @Override // p.beg
    public final int e0() {
        return this.X;
    }

    @Override // p.jfg
    public final h0h1 g() {
        return this.N0;
    }

    public final fg5 getAnnotations() {
        return this.V0;
    }

    @Override // p.p9r
    public final mka1 getSource() {
        return this.g;
    }

    @Override // p.beg, p.zji0, p.s9r
    public final lht getVisibility() {
        return this.t;
    }

    @Override // p.beg
    public final Collection h() {
        return (Collection) this.S0.invoke();
    }

    @Override // p.zji0
    public final boolean isExternal() {
        return no20.i.d(this.e.d).booleanValue();
    }

    @Override // p.beg
    public final boolean isInline() {
        if (!no20.k.d(this.e.d).booleanValue()) {
            return false;
        }
        ava avaVar = this.f;
        int i = avaVar.b;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = avaVar.c;
            if (i2 >= 4 && (i2 > 4 || avaVar.d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // p.kfg
    public final boolean j() {
        return no20.g.d(this.e.d).booleanValue();
    }

    @Override // p.n9r
    public final n9r k() {
        return this.Q0;
    }

    @Override // p.beg, p.kfg
    public final List n() {
        return ((mxa1) this.Y.h).c();
    }

    @Override // p.beg, p.zji0
    public final int o() {
        return this.i;
    }

    @Override // p.beg
    public final boolean p() {
        return no20.k.d(this.e.d).booleanValue() && this.f.a(1, 4, 2);
    }

    @Override // p.beg
    public final boolean p0() {
        return no20.h.d(this.e.d).booleanValue();
    }

    public final byp r0() {
        return this.Y;
    }

    public final hfy0 s0() {
        return this.e;
    }

    public final uht t0() {
        ((cao0) ((bao0) ((ks6) this.Y.b).P0)).getClass();
        io41 io41Var = this.O0;
        y5 y5Var = io41Var.a;
        int i = kht.a;
        iht.c(y5Var);
        toe0 toe0Var = io41Var.c;
        mma0 mma0Var = io41.e[0];
        return (uht) ((zpi0) toe0Var.invoke());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(Z() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    public final ava u0() {
        return this.f;
    }

    public final qx81 v0(ajn0 ajn0Var) {
        Iterator it = t0().a(ajn0Var, 18).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            tdy0 tdy0Var = (tdy0) next;
            if (tdy0Var.L() == null && tdy0Var.g0().isEmpty()) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        tdy0 tdy0Var2 = (tdy0) obj;
        return (qx81) (tdy0Var2 != null ? tdy0Var2.getType() : null);
    }
}
