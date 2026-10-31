package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ki71 implements xpw {
    public final psw X;
    public final yfc0 a;
    public final kp00 b;
    public final ayl0 c;
    public final i8h1 d;
    public final gmt e;
    public final g871 f;
    public final wh71 g;
    public final ol71 h;
    public final ljm0 i;
    public final ia00 t;

    public ki71(yfc0 yfc0Var, kp00 kp00Var, ayl0 ayl0Var, i8h1 i8h1Var, gmt gmtVar, g871 g871Var, wh71 wh71Var, q8n q8nVar, ol71 ol71Var) {
        this.a = yfc0Var;
        this.b = kp00Var;
        this.c = ayl0Var;
        this.d = i8h1Var;
        this.e = gmtVar;
        this.f = g871Var;
        this.g = wh71Var;
        this.h = ol71Var;
        s571 s571Var = s571.c1;
        byte b = 7;
        j2i j2iVar = new j2i(-888917666, new wcy0(this, b), true);
        xas xasVar = new xas();
        xasVar.a(s571.d1, ea71.f);
        this.i = new ljm0(xasVar, s571Var, q8nVar, j2iVar);
        this.t = n3o1.q(this).a(new ji71(this, (byte) 0), new ji71(this, (byte) 1));
        j2i j2iVar2 = new j2i(1807899206, new c771(this, b), true);
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar2, (byte) 0);
    }

    public final rqw a() {
        return this.t;
    }

    public final jsw c() {
        return this.X;
    }

    public final void e(ii71 ii71Var, iu30 iu30Var, b0k b0kVar, int i) {
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1524173594);
        int i2 = (i & 6) == 0 ? (x340Var.g(ii71Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(this) ? 256 : 128;
        }
        boolean z2 = false;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z3 = ii71Var instanceof gi71;
            nim0 nim0Var = nim0.a;
            rih1 rih1Var = rih1.a;
            lnm lnmVar = null;
            if (z3) {
                x340Var.i0(261457501);
                boolean z4 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object objT = x340Var.T();
                if (z4 || objT == m4cVar) {
                    objT = new lm61(this, iu30Var, lnmVar, (byte) 11);
                    x340Var.s0(objT);
                }
                qxd0.t(rih1Var, x340Var, (vu30) objT);
                gi71 gi71Var = (gi71) ii71Var;
                Object obj = gi71Var.b;
                boolean zG = x340Var.g(obj);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    x340Var.s0(obj);
                } else {
                    obj = objT2;
                }
                List list = (List) obj;
                if (list.isEmpty()) {
                    x340Var.i0(262077129);
                    y3o1.d(new cbo0(cwl1.o0(x340Var, 2131962342), cwl1.o0(x340Var, 2131962341), (bbo0) null, 12), u291.f(nim0Var, 1.0f), x340Var, 48);
                    x340Var.r(false);
                    z = false;
                } else {
                    x340Var.i0(262517236);
                    x340Var.i0(147017892);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    int i3 = 0;
                    for (Object obj2 : list2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            lnm lnmVar2 = lnmVar;
                            p7h.T();
                            throw lnmVar2;
                        }
                        lnm lnmVar3 = lnmVar;
                        zh71 zh71Var = new zh71(gi71Var.d, gi71Var.e, gi71Var.f, gi71Var.g, gi71Var.a.b(), (p571) obj2, i3, gi71Var.h);
                        Object objT3 = x340Var.T();
                        if (objT3 == m4cVar) {
                            objT3 = (xpw) new pdp0(this.a, (byte) 4).invoke();
                            x340Var.s0(objT3);
                        }
                        arrayList.add(new yq60(zh71Var, (xpw) objT3));
                        i3 = i4;
                        lnmVar = lnmVar3;
                        z2 = false;
                    }
                    x340Var.r(z2);
                    c9 c9VarF = mqo1.F(arrayList);
                    qim0 qim0VarN = anm1.N("share.sheet.share.destination_list", u291.z(u291.f(nim0Var, 1.0f), lnmVar, 3));
                    Object objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = ea71.e;
                        x340Var.s0(objT4);
                    }
                    wro1.p(c9VarF, qim0VarN, (vu30) objT4, x340Var, 432, 0);
                    z = false;
                    x340Var.r(false);
                }
                x340Var.r(z);
            } else if (ii71Var instanceof hi71) {
                x340Var.i0(147042232);
                h5p1.e((qim0) null, x340Var, 0);
                x340Var.r(false);
            } else {
                if (!(ii71Var instanceof fi71)) {
                    throw p3d1.k(x340Var, 146980499, false);
                }
                x340Var.i0(263402844);
                int i5 = i2 & 112;
                boolean z5 = i5 == 32;
                Object objT5 = x340Var.T();
                if (z5 || objT5 == m4cVar) {
                    objT5 = new v5a(iu30Var, (lnm) null, (byte) 13);
                    x340Var.s0(objT5);
                }
                qxd0.t(rih1Var, x340Var, (vu30) objT5);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                boolean z6 = i5 == 32;
                Object objT6 = x340Var.T();
                if (z6 || objT6 == m4cVar) {
                    objT6 = new m861(iu30Var, (byte) 14);
                    x340Var.s0(objT6);
                }
                x2g0.g(6, (Function0) objT6, x340Var, qim0VarF);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(this, ii71Var, iu30Var, i, (byte) 19);
        }
    }

    public final mqw getBehavior() {
        return this.i;
    }
}
