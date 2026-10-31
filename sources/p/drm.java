package p;

import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class drm extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boh0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ pt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drm(pt ptVar, boh0 boh0Var, iu30 iu30Var) {
        super(3);
        this.d = ptVar;
        this.b = boh0Var;
        this.c = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        Object lrmVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                vy30 vy30Var = (vy30) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                List list = this.b.a;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(vy30Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    this.d.x(vy30Var, true, list.indexOf(vy30Var), list.size(), this.c, x340Var2, (iIntValue & 14) | 48);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                pv71 pv71Var = (pv71) obj;
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                qim0 qim0VarD = u291.d(nim0.a, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarD, ((vex) zex.a.e).g, d4o1.a);
                x340 x340Var4 = x340Var3;
                u85 u85Var = (erl1) x340Var4.k(szf0.b);
                if (u85Var == null) {
                    x340Var4.i0(-241884180);
                    WeakHashMap weakHashMap = osl1.x;
                    u85Var = lhc.g(x340Var4).g;
                } else {
                    x340Var4.i0(-241885792);
                }
                x340Var4.r(false);
                qim0 qim0VarY = too1.y(qim0VarF, u85Var);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var3, 0);
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarY);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(hmb0.t1);
                } else {
                    x340Var5.v0();
                }
                nko1.H(mbhVarA, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                boh0 boh0Var = this.b;
                aoh0 aoh0Var = boh0Var.b;
                boolean z = aoh0Var instanceof ynh0;
                iu30 iu30Var = this.c;
                if (z) {
                    x340Var5.i0(-1632812093);
                    w4i1 w4i1Var = boh0Var.c;
                    String str = boh0Var.d;
                    String str2 = boh0Var.e;
                    boolean z2 = boh0Var.f;
                    vy30 vy30Var2 = ((ynh0) aoh0Var).a;
                    boolean zG = x340Var5.g(iu30Var);
                    Object objT = x340Var5.T();
                    if (zG || objT == m4cVar) {
                        objT = new usj(iu30Var, (byte) 27);
                        x340Var5.s0(objT);
                    }
                    lrmVar = new mrm(w4i1Var, str, str2, z2, vy30Var2, (iu30) objT);
                    x340Var5.r(false);
                } else if (aoh0Var instanceof znh0) {
                    x340Var5.i0(-1632797683);
                    x340Var5.r(false);
                    lrmVar = new lrm(boh0Var.d, boh0Var.e, Collections.singletonList(((znh0) aoh0Var).a), boh0Var.c, boh0Var.f);
                } else {
                    if (!(aoh0Var instanceof xnh0)) {
                        throw p3d1.k(x340Var5, -1632815576, false);
                    }
                    x340Var5.i0(-1632786014);
                    x340Var5.r(false);
                    lrmVar = new lrm(boh0Var.d, boh0Var.e, boh0Var.a, boh0Var.c, boh0Var.f);
                }
                Object obj4 = lrmVar;
                pt ptVar = this.d;
                otw.c((res) ptVar.d, obj4, (qim0) null, (ipb1) null, x340Var3, 0, 12);
                aoh0 aoh0Var2 = boh0Var.b;
                Object objT2 = x340Var5.T();
                if (objT2 == m4cVar) {
                    objT2 = crm.e;
                    x340Var5.s0(objT2);
                }
                hm5.a(aoh0Var2, (qim0) null, (iu30) null, (tl3) null, "media_gallery_content", (iu30) objT2, apo.r(2051293637, new d34(pv71Var, ptVar, boh0Var, iu30Var, (byte) 2), x340Var3), x340Var3, 1794048, 14);
                x340Var5.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drm(boh0 boh0Var, iu30 iu30Var, pt ptVar) {
        super(3);
        this.b = boh0Var;
        this.c = iu30Var;
        this.d = ptVar;
    }
}
