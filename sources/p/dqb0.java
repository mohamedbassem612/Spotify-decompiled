package p;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dqb0 implements igv0 {
    public static final /* synthetic */ mma0[] h = {new cey0(dqb0.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0), new cey0(dqb0.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new cey0(dqb0.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    public final o860 a;
    public final cb11 b;
    public final soe0 c;
    public final toe0 d;
    public final g141 e;
    public final toe0 f;
    public final boolean g;

    public dqb0(o860 o860Var, cb11 cb11Var, boolean z) {
        this.a = o860Var;
        this.b = cb11Var;
        voe0 voe0Var = (voe0) ((uw0) o860Var.b).d;
        this.c = new soe0(voe0Var, new cqb0(this, (byte) 0));
        this.d = new toe0(voe0Var, new cqb0(this, (byte) 1));
        this.e = wdx0.b(cb11Var);
        this.f = new toe0(voe0Var, new cqb0(this, (byte) 2));
        this.g = z;
    }

    @Override // p.pf5
    public final Map a() {
        mma0 mma0Var = h[2];
        return (Map) this.f.invoke();
    }

    @Override // p.pf5
    public final kf30 b() {
        mma0 mma0Var = h[0];
        return (kf30) this.c.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sgl c(db11 db11Var) {
        zb11 gb11Var;
        a8b0 a8b0VarJ;
        if (db11Var instanceof tb11) {
            return cxo1.b(((tb11) db11Var).b, null);
        }
        if (db11Var instanceof rb11) {
            Enum r6 = ((rb11) db11Var).b;
            Class<?> enclosingClass = r6.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            enclosingClass.getClass();
            return new b1z(bb11.a(enclosingClass), ajn0.e(r6.name()));
        }
        boolean z = db11Var instanceof fb11;
        o860 o860Var = this.a;
        if (z) {
            fb11 fb11Var = (fb11) db11Var;
            ajn0 ajn0Var = fb11Var.a;
            if (ajn0Var == null) {
                ajn0Var = eia0.b;
            }
            ajn0Var.getClass();
            ArrayList arrayListA = fb11Var.a();
            mma0 mma0Var = h[1];
            if (!d4o1.i((qx81) this.d.invoke())) {
                beg begVarD = kht.d(this);
                begVarD.getClass();
                tsi1 tsi1VarW = rc2.w(ajn0Var, begVarD);
                if (tsi1VarW == null || (a8b0VarJ = tsi1VarW.getType()) == null) {
                    a8b0VarJ = ((ajm0) ((uw0) o860Var.b).X).e.j(bkz.b(zjz.d1, new String[0]));
                }
                ArrayList arrayList = new ArrayList(q7h.U(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    sgl sglVarC = c((db11) it.next());
                    if (sglVarC == null) {
                        sglVarC = new fep0(null);
                    }
                    arrayList.add(sglVarC);
                }
                return new q1h1(arrayList, a8b0VarJ);
            }
        } else {
            if (db11Var instanceof eb11) {
                return new dg5(new dqb0(o860Var, new cb11(((eb11) db11Var).b), false));
            }
            if (db11Var instanceof nb11) {
                Class cls = ((nb11) db11Var).b;
                if (cls.isPrimitive()) {
                    gb11Var = new xb11(cls);
                } else if ((cls instanceof GenericArrayType) || cls.isArray()) {
                    gb11Var = new gb11(cls);
                } else {
                    gb11Var = cls instanceof WildcardType ? new cc11((WildcardType) cls) : new ob11(cls);
                }
                a8b0 a8b0VarL = ((st60) o860Var.e).L(gb11Var, bs51.u(2, false, (drb0) null, 7));
                if (!d4o1.i(a8b0VarL)) {
                    a8b0 a8b0VarB = a8b0VarL;
                    int i = 0;
                    while (g6b0.z(a8b0VarB)) {
                        a8b0VarB = ((e1h1) o7h.V0(a8b0VarB.r0())).b();
                        i++;
                    }
                    jfg jfgVarS = a8b0VarB.t0().s();
                    if (jfgVarS instanceof beg) {
                        heg hegVarF = kht.f(jfgVarS);
                        return hegVarF == null ? new fla0(new cla0(a8b0VarL)) : new fla0(hegVarF, i);
                    }
                    if (jfgVarS instanceof y0h1) {
                        kf30 kf30VarI = rfb1.a.i();
                        return new fla0(new heg(kf30VarI.b(), kf30VarI.a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // p.pf5
    public final mka1 getSource() {
        return this.e;
    }

    @Override // p.pf5
    public final a8b0 getType() {
        mma0 mma0Var = h[1];
        return (qx81) this.d.invoke();
    }

    public final String toString() {
        return cht.c.v(this, null);
    }
}
