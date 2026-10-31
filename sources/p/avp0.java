package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class avp0 implements jsw {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public avp0(kly0 kly0Var, pdp0 pdp0Var) {
        this.a = (byte) 0;
        this.b = kly0Var;
        this.c = pdp0Var;
        this.d = new idd1(new pdp0(this, (byte) 14));
        this.e = new idd1(new u6j0(this, (byte) 17));
    }

    public final /* bridge */ /* synthetic */ void a(int i, Object obj, b0k b0kVar, ksw kswVar, iu30 iu30Var) {
        switch (this.a) {
            case 0:
                c((xup0) obj, iu30Var, kswVar, b0kVar, i);
                break;
            default:
                d((ufm1) obj, iu30Var, kswVar, b0kVar, i);
                break;
        }
    }

    public void c(xup0 xup0Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        zup0 zup0Var;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1015853152);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(xup0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i(this) ? 2048 : 1024;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 1027) != 1026)) {
            if (xup0Var instanceof vup0) {
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                int iHashCode = Long.hashCode(tgp1.l(b0kVar2));
                xos0 xos0VarM = b0kVar2.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
                hzj.A.getClass();
                if (((x340) b0kVar2).a == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(hmb0.t1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(mbhVarA, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                ((iuj) ((idd1) this.d).getValue()).a(((vup0) xup0Var).a(), b0kVar2, 0);
                d36 d36Var = new d36(16.0f, true, new um5((byte) 16));
                zzq0 zzq0VarI = uyn1.i(0.0f, 0.0f, 0.0f, 16.0f);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                boolean zI = b0kVar2.i(xup0Var) | b0kVar2.i(this);
                Object objT = b0kVar2.T();
                if (zI || objT == fkj0.X) {
                    objT = new j9n0(xup0Var, this, (byte) 29);
                    b0kVar2.s0(objT);
                }
                s3o1.e(qim0VarF, (xtb0) null, zzq0VarI, d36Var, (pl3) null, (iq20) null, (h3h1) null, (iu30) objT, b0kVar2, 0, 234);
                b0kVar2.r(true);
            } else {
                h311VarV = b0kVar2.v();
                if (h311VarV == null) {
                    return;
                } else {
                    zup0Var = new zup0(this, xup0Var, iu30Var, kswVar, i, (byte) 0);
                }
            }
            h311VarV.d = zup0Var;
        }
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            zup0Var = new zup0(this, xup0Var, iu30Var, kswVar, i, (byte) 1);
            h311VarV.d = zup0Var;
        }
    }

    public void d(ufm1 ufm1Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        Object kdg1Var;
        l4m0 l4m0Var;
        String str;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1983877065);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ufm1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1027) != 1026)) {
            gfm1 gfm1VarB = ufm1Var.g().b();
            if (gfm1VarB instanceof gfm1) {
                x340Var.i0(-459613807);
                e(gfm1VarB.a(), ufm1Var.g().a(), x340Var, (i2 >> 3) & 896);
                x340Var.r(false);
            } else {
                if (!(gfm1VarB instanceof hfm1)) {
                    throw p3d1.k(x340Var, -459614881, false);
                }
                x340Var.i0(-1362937616);
                hfm1 hfm1Var = (hfm1) gfm1VarB;
                boolean zG = x340Var.g(hfm1Var.a());
                Object objT = x340Var.T();
                if (zG || objT == obj) {
                    Map map = dj31.a;
                    objT = nln.y(hfm1Var.a());
                    x340Var.s0(objT);
                }
                Map map2 = (Map) objT;
                boolean zG2 = x340Var.g(ufm1Var.b()) | x340Var.e(ufm1Var.a());
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == obj) {
                    objT2 = qtg.j(((hyl0) this.c).e().e(Integer.valueOf(ufm1Var.a()), ufm1Var.b().a()).b()).b();
                    x340Var.s0(objT2);
                }
                l4m0 l4m0Var2 = (l4m0) objT2;
                boolean zG3 = x340Var.g(ufm1Var.b());
                Object objT3 = x340Var.T();
                if (zG3 || objT3 == obj) {
                    objT3 = ufm1Var.b().b();
                    x340Var.s0(objT3);
                }
                String str2 = (String) objT3;
                boolean zG4 = x340Var.g(str2);
                Object objT4 = x340Var.T();
                if (zG4 || objT4 == obj) {
                    List listP0 = ihc1.P0(str2, new char[]{':'}, 6);
                    objT4 = (String) (2 < listP0.size() ? listP0.get(2) : "");
                    x340Var.s0(objT4);
                }
                String str3 = (String) objT4;
                String strG = ufm1Var.g().g();
                boolean zI = x340Var.i(gfm1VarB) | x340Var.g(map2);
                Object objT5 = x340Var.T();
                if (zI || objT5 == obj) {
                    objT5 = new xx3(hfm1Var, map2, (lnm) null, (byte) 17);
                    x340Var.s0(objT5);
                }
                iu30 iu30Var2 = (iu30) objT5;
                jsl jslVar = new jsl(ufm1Var.g().a());
                boolean zI2 = x340Var.i(this) | x340Var.i(l4m0Var2) | x340Var.g(str3) | x340Var.g(str2) | x340Var.g(strG);
                Object objT6 = x340Var.T();
                if (zI2 || objT6 == obj) {
                    l4m0Var = l4m0Var2;
                    str = str3;
                    kdg1Var = new kdg1(this, l4m0Var, str, str2, strG, (byte) 5);
                    x340Var.s0(kdg1Var);
                } else {
                    kdg1Var = objT6;
                    l4m0Var = l4m0Var2;
                    str = str3;
                }
                iu30 iu30Var3 = (iu30) kdg1Var;
                boolean zI3 = x340Var.i(this) | x340Var.i(l4m0Var) | x340Var.g(str);
                Object objT7 = x340Var.T();
                if (zI3 || objT7 == obj) {
                    objT7 = new vfm1(this, l4m0Var, str, (byte) 0);
                    x340Var.s0(objT7);
                }
                Function0 function0 = (Function0) objT7;
                boolean zI4 = x340Var.i(this) | x340Var.i(l4m0Var) | x340Var.g(str);
                Object objT8 = x340Var.T();
                if (zI4 || objT8 == obj) {
                    objT8 = new vfm1(this, l4m0Var, str, (byte) 1);
                    x340Var.s0(objT8);
                }
                xto.d(iu30Var2, jslVar, iu30Var3, function0, (Function0) objT8, (gm31) this.b, x340Var, 0, 4);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swk1(i, this, ufm1Var, iu30Var, kswVar, (byte) 16);
        }
    }

    public void e(String str, String str2, b0k b0kVar, int i) {
        String str3;
        int i2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(301512388);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = i | (b0kVar2.g(str3) ? 4 : 2);
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.g(str2) ? 32 : 16;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar2.T();
            if (z || objT == m4cVar) {
                objT = xto.t(Boolean.TRUE);
                b0kVar2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Uri uri = Uri.parse(str3);
            as80 as80Var = mif1.P0;
            fwx fwxVarG = hso1.G(box.c, 0L, 0L, b0kVar2, box.d, 30);
            boolean zG = b0kVar2.g(ven0Var);
            Object objT2 = b0kVar2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new e7m1(ven0Var, (byte) 12);
                b0kVar2.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            boolean zG2 = b0kVar2.g(ven0Var);
            Object objT3 = b0kVar2.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new e7m1(ven0Var, (byte) 13);
                b0kVar2.s0(objT3);
            }
            iu30 iu30Var2 = (iu30) objT3;
            boolean zG3 = b0kVar2.g(ven0Var);
            Object objT4 = b0kVar2.T();
            if (zG3 || objT4 == m4cVar) {
                objT4 = new e7m1(ven0Var, (byte) 14);
                b0kVar2.s0(objT4);
            }
            ni7 ni7VarA = oi7.a(uri, null, null, null, null, fwxVarG, false, false, as80Var, iu30Var, iu30Var2, (iu30) objT4, 0L, b0kVar2, 2097152, 48, 100286);
            b0kVar2 = b0kVar2;
            jsl jslVar = new jsl(str2);
            qim0 qim0VarL0 = nim0.a;
            qim0 qim0VarD = u291.d(qim0VarL0, 1.0f);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                qim0VarL0 = cwl1.l0(qim0VarL0, 0L, (hw61) null, 15);
            }
            eso1.h(ni7VarA, jslVar, qim0VarD.then(qim0VarL0), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, b0kVar2, 1797120, 384);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(this, str3, str2, i, (byte) 21);
        }
    }

    public avp0(gm31 gm31Var, hyl0 hyl0Var, i8h1 i8h1Var, g871 g871Var) {
        this.a = (byte) 1;
        this.b = gm31Var;
        this.c = hyl0Var;
        this.d = i8h1Var;
        this.e = g871Var;
    }
}
