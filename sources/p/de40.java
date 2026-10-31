package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class de40 implements xpw {
    public final /* synthetic */ byte a;
    public final i5y0 b;
    public final e7m0 c;
    public final ia00 d;
    public final psw e;

    public de40(n5y0 n5y0Var, i5y0 i5y0Var) {
        this.a = (byte) 1;
        this.b = i5y0Var;
        hox0 hox0Var = new hox0(this, (byte) 12);
        t7p0 t7p0Var = t7p0.o;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        l5y0 l5y0Var = new l5y0(n5y0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p5y0.class), runSequentially.a(l5y0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o5y0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new j5y0(n5y0Var)));
        this.c = sbl.C(hox0Var, t7p0Var, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI), new xgr0((Object) this, (byte) 21), new c6y0(this));
        this.d = n3o1.q(this).a(cnx0.S0, cnx0.T0);
        j2i j2iVar = new j2i(-607213264, new qsu0(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static String f(a6y0 a6y0Var, b0k b0kVar) throws NoWhenBranchMatchedException {
        x340 x340Var;
        int i;
        int i2;
        if (a6y0Var instanceof w5y0) {
            x340Var = (x340) b0kVar;
            i = 2131956202;
            i2 = 395224717;
        } else {
            if (a6y0Var instanceof x5y0) {
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.i0(-632855867);
                x340Var2.r(false);
                return "";
            }
            if (!(a6y0Var instanceof z5y0)) {
                if (!(a6y0Var instanceof y5y0)) {
                    throw p3d1.k((x340) b0kVar, 395223585, false);
                }
                x340 x340Var3 = (x340) b0kVar;
                x340Var3.i0(-632755675);
                x340Var3.r(false);
                return "";
            }
            x340Var = (x340) b0kVar;
            i = 2131956204;
            i2 = 395228203;
        }
        return x0d.k(x340Var, i2, i, x340Var, false);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    public static a6y0 g(v5y0 v5y0Var) {
        boolean z = v5y0Var.e;
        String str = v5y0Var.a;
        List list = v5y0Var.c;
        h4d0 h4d0Var = v5y0Var.b;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((n4y0) it.next()) instanceof g4y0) {
                    return new y5y0(str, 6, false);
                }
            }
        }
        List list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                if (((n4y0) it2.next()) instanceof l4y0) {
                }
            }
            if (h4d0Var != h4d0.h) {
                if (h4d0.a.contains(h4d0Var)) {
                    return new x5y0(str, z, false);
                }
                if (h4d0Var.a()) {
                    return new w5y0(str, z, false);
                }
                return (v5y0Var.d || !h4d0Var.b()) ? new y5y0(str, 6, false) : new w5y0(str, z, false);
            }
        } else if (h4d0Var != h4d0.h) {
            if (h4d0.a.contains(h4d0Var)) {
                return new x5y0(str, z, false);
            }
            if (h4d0Var.a()) {
                return new w5y0(str, z, false);
            }
            if (v5y0Var.d) {
            }
        }
        return new z5y0(str, z, false);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public void e(a6y0 a6y0Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        jax haxVar;
        zzq0 zzq0Var;
        qim0 qim0VarY;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-366324057);
        int i2 = i | (b0kVar3.g(a6y0Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(this) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            idx idxVar = new idx(4);
            gdx gdxVarR = yla.r(b0kVar3);
            if (a6y0Var.getEnabled()) {
                b0kVar3.i0(352163377);
                b0kVar3.r(false);
                haxVar = jax.a;
            } else {
                b0kVar3.i0(352213163);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131956203));
                b0kVar3.r(false);
            }
            b0kVar3.i0(149914103);
            f(a6y0Var, b0kVar3);
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new lpx0(function0, (byte) 4);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            b0kVar3.r(false);
            boolean z2 = a6y0Var instanceof x5y0;
            if (z2) {
                b0kVar3.i0(352480817);
                b0kVar3.r(false);
                zzq0Var = new zzq0(12.0f, 12.0f, 12.0f, 12.0f);
            } else {
                b0kVar3.i0(352528991);
                zzq0Var = yla.r(b0kVar3).a;
                b0kVar3.r(false);
            }
            nim0 nim0Var = nim0.a;
            if (z2) {
                b0kVar3.i0(352650387);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                qim0VarY = u291.r(uyn1.y(nim0Var, 16.0f, 4.0f), 48.0f);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(352854956);
                qim0 qim0VarD = u291.D(nim0Var, (era) null, 3);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                qim0VarY = uyn1.y(qim0VarD, 16.0f, 4.0f);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, idxVar, qim0VarY, haxVar, gdxVarR, zzq0Var, (idn0) null, (ga80) null, a6y0Var instanceof z5y0 ? maj.a : null, (vu30) null, apo.r(-1649640504, new kpw0(a6y0Var, this, (byte) 6), b0kVar3), b0kVar2, 0, 48, 1416);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0((byte) 3, i, (Object) this, (Object) a6y0Var, function0);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public de40(pd40 pd40Var, i5y0 i5y0Var) {
        this.a = (byte) 0;
        this.b = i5y0Var;
        this.c = sbl.B(new zd40(false, (String) null, h4d0.b, false), t2m.x, pd40Var, bp30.Y0, new ce40(this));
        this.d = n3o1.q(this).a(d640.e, d640.f);
        j2i j2iVar = hqi.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }
}
