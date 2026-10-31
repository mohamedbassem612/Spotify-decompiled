package p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobius.MobiusLoop;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ofw0 implements ubw0 {
    public final abu0 b;
    public final tl7 c;
    public final p731 d;
    public final q8n e;
    public final yqg f;
    public final ugn0 g;
    public final nwt h;
    public final clm i;
    public final ggl j;
    public final aru0 k;
    public final w9u0 l;
    public final hfw0 m;
    public final jr30 n;
    public final bpb1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bpb1 f10p;
    public final bpb1 q;
    public jqd0 r;
    public final x010 s;

    public ofw0(abu0 abu0Var, tl7 tl7Var, p731 p731Var, q8n q8nVar, yqg yqgVar, ugn0 ugn0Var, nwt nwtVar, clm clmVar, ggl gglVar, aru0 aru0Var, w9u0 w9u0Var, hfw0 hfw0Var, jr30 jr30Var) {
        this.b = abu0Var;
        this.c = tl7Var;
        this.d = p731Var;
        this.e = q8nVar;
        this.f = yqgVar;
        this.g = ugn0Var;
        this.h = nwtVar;
        this.i = clmVar;
        this.j = gglVar;
        this.k = aru0Var;
        this.l = w9u0Var;
        this.m = hfw0Var;
        this.n = jr30Var;
        Boolean bool = Boolean.FALSE;
        this.o = gio1.b(bool);
        this.f10p = gio1.b(bool);
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.q = bpb1VarB;
        this.s = new x010(new any(bpb1VarB, (byte) 18), new r6k0(ugn0Var.a, (byte) 15), new agn0(3, (lnm) null, (byte) 2), (byte) 1);
    }

    @Override // p.ubw0
    public final rm51 a(int i, long j, int i2) {
        w590 w590VarA;
        r091 r091Var = (r091) this.k.b;
        if (r091Var == null || (w590VarA = r091Var.a()) == null) {
            return null;
        }
        return w590VarA.m(i, j, i2);
    }

    @Override // p.ubw0
    public final void b(String str, VideoSurfaceView videoSurfaceView) {
        WeakReference weakReference = new WeakReference(videoSurfaceView);
        aru0 aru0Var = this.k;
        aru0Var.c = weakReference;
        aru0Var.t();
    }

    @Override // p.ubw0
    public final bpb1 c() {
        return this.o;
    }

    @Override // p.ubw0
    public final void d() {
        k(wdw0.a);
    }

    @Override // p.ubw0
    public final void e(ksw kswVar, sbw0 sbw0Var, b0k b0kVar, int i) {
        ksw kswVar2;
        int i2;
        Object obj;
        dy20 huzVar;
        Object elu0Var;
        zau0 zau0Var;
        lnm lnmVar;
        byte b;
        Object obj2;
        byte b2;
        Object obj3;
        lnm lnmVar2;
        ofw0 ofw0Var = this;
        vf61 vf61Var = vf61.d1;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1711334979);
        if ((i & 6) == 0) {
            kswVar2 = kswVar;
            i2 = (x340Var.i(kswVar2) ? 4 : 2) | i;
        } else {
            kswVar2 = kswVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(sbw0Var) : x340Var.i(sbw0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ofw0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = sbw0Var.b;
            boolean zG = x340Var.g(str);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                abu0 abu0Var = ofw0Var.b;
                objT = abu0Var != null ? abu0Var.e(str, false) : null;
                x340Var.s0(objT);
            }
            zau0 zau0Var2 = (zau0) objT;
            int i3 = i2 & 112;
            boolean zI = x340Var.i(ofw0Var) | x340Var.i(zau0Var2) | (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(sbw0Var)));
            Object objT2 = x340Var.T();
            Object obj4 = objT2;
            if (zI || objT2 == m4cVar) {
                ozu0 ozu0Var = new ozu0(ofw0Var, zau0Var2, sbw0Var, (byte) 8);
                x340Var.s0(ozu0Var);
                obj4 = ozu0Var;
            }
            qxd0.i(str, (iu30) obj4, x340Var);
            boolean zI2 = x340Var.i(ofw0Var) | (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(sbw0Var)));
            Object objT3 = x340Var.T();
            Object obj5 = objT3;
            if (zI2 || objT3 == m4cVar) {
                cqu0 cqu0Var = new cqu0(ofw0Var, sbw0Var, (lnm) null, (byte) 10);
                x340Var.s0(cqu0Var);
                obj5 = cqu0Var;
            }
            qxd0.t(sbw0Var, x340Var, (vu30) obj5);
            boolean zI3 = x340Var.i(ofw0Var);
            Object objT4 = x340Var.T();
            Object obj6 = objT4;
            if (zI3 || objT4 == m4cVar) {
                ifw0 ifw0Var = new ifw0(ofw0Var, (byte) 0);
                x340Var.s0(ifw0Var);
                obj6 = ifw0Var;
            }
            Function0 function0 = (Function0) obj6;
            boolean zI4 = x340Var.i(ofw0Var);
            Object objT5 = x340Var.T();
            if (zI4 || objT5 == m4cVar) {
                ifw0 ifw0Var2 = new ifw0(ofw0Var, (byte) 1);
                x340Var.s0(ifw0Var2);
                obj = ifw0Var2;
            } else {
                obj = objT5;
            }
            i1o1.b(kswVar2, ofw0Var.c, str, function0, (Function0) obj, x340Var, i2 & 14, 0);
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            ven0 ven0VarA = gfe0.a(x340Var);
            boolean zG2 = x340Var.g((op80) ven0VarA.getValue());
            Object objT6 = x340Var.T();
            if (zG2 || objT6 == m4cVar) {
                xir0 xir0VarA = ((op80) ven0VarA.getValue()).a(vf61Var);
                rr20 rr20Var = xir0VarA != null ? xir0VarA.b : null;
                if (rr20Var != null) {
                    vbm[] vbmVarArr = q601.a;
                    objT6 = new kge(rr20Var);
                } else {
                    moy0 moy0VarX = qon1.x((op80) ven0VarA.getValue());
                    if (moy0VarX != null) {
                        vbm[] vbmVarArr2 = q601.a;
                        huzVar = new dy20(new kge(moy0VarX), (byte) 27);
                    } else {
                        huzVar = new huz(sir0.a, (byte) 10);
                    }
                    objT6 = huzVar;
                }
                x340Var.s0(objT6);
            }
            mr20 mr20Var = (mr20) objT6;
            boolean zG3 = x340Var.g((op80) ven0VarA.getValue());
            Object objT7 = x340Var.T();
            if (zG3 || objT7 == m4cVar) {
                xir0 xir0VarA2 = ((op80) ven0VarA.getValue()).a(vf61Var);
                w7u0 w7u0Var = xir0VarA2 != null ? xir0VarA2.c : null;
                if (w7u0Var == null) {
                    w7u0Var = w7u0.a;
                }
                objT7 = w7u0Var;
                x340Var.s0(objT7);
            }
            w7u0 w7u0Var2 = (w7u0) objT7;
            boolean zG4 = x340Var.g(iac0Var);
            Object objT8 = x340Var.T();
            Object obj7 = objT8;
            if (zG4 || objT8 == m4cVar) {
                c1v0 c1v0Var = new c1v0(iac0Var.getLifecycle().c(), (byte) 9);
                x340Var.s0(c1v0Var);
                obj7 = c1v0Var;
            }
            mr20 mr20Var2 = (mr20) obj7;
            ofw0Var.m.b = (op80) ven0VarA.getValue();
            Object[] objArr = {str, mr20Var, mr20Var2, w7u0Var2};
            boolean zI5 = x340Var.i(mr20Var) | x340Var.i(mr20Var2) | x340Var.e(w7u0Var2.ordinal()) | x340Var.i(ofw0Var);
            Object objT9 = x340Var.T();
            if (zI5 || objT9 == m4cVar) {
                zau0Var = zau0Var2;
                lnmVar = null;
                elu0Var = new elu0(mr20Var, mr20Var2, w7u0Var2, ofw0Var, (lnm) null, (byte) 7);
                ofw0Var = ofw0Var;
                x340Var.s0(elu0Var);
            } else {
                lnmVar = null;
                zau0Var = zau0Var2;
                elu0Var = objT9;
            }
            qxd0.u(objArr, (vu30) elu0Var, x340Var);
            boolean zI6 = x340Var.i(ofw0Var);
            Object objT10 = x340Var.T();
            if (zI6 || objT10 == m4cVar) {
                b = 0;
                kfw0 kfw0Var = new kfw0(ofw0Var, lnmVar, b);
                x340Var.s0(kfw0Var);
                obj2 = kfw0Var;
            } else {
                b = 0;
                obj2 = objT10;
            }
            qxd0.t(str, x340Var, (vu30) obj2);
            boolean zI7 = x340Var.i(ofw0Var);
            Object objT11 = x340Var.T();
            if (zI7 || objT11 == m4cVar) {
                b2 = 1;
                kfw0 kfw0Var2 = new kfw0(ofw0Var, lnmVar, b2);
                x340Var.s0(kfw0Var2);
                obj3 = kfw0Var2;
            } else {
                b2 = 1;
                obj3 = objT11;
            }
            qxd0.t(str, x340Var, (vu30) obj3);
            boolean zI8 = x340Var.i(ofw0Var);
            Object objT12 = x340Var.T();
            Object obj8 = objT12;
            if (zI8 || objT12 == m4cVar) {
                kfw0 kfw0Var3 = new kfw0(ofw0Var, lnmVar, (byte) 2);
                x340Var.s0(kfw0Var3);
                obj8 = kfw0Var3;
            }
            qxd0.t(str, x340Var, (vu30) obj8);
            boolean zI9 = x340Var.i(zau0Var) | x340Var.i(ofw0Var);
            Object objT13 = x340Var.T();
            if (zI9 || objT13 == m4cVar) {
                ofw0 ofw0Var2 = ofw0Var;
                lnmVar2 = lnmVar;
                pew0 pew0Var = new pew0(zau0Var, ofw0Var2, false, lnmVar2, (byte) 3);
                ofw0Var = ofw0Var2;
                x340Var.s0(pew0Var);
                objT13 = pew0Var;
            } else {
                lnmVar2 = lnmVar;
            }
            qxd0.s(str, zau0Var, (vu30) objT13, x340Var);
            String str2 = sbw0Var.d.b.e;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            int i4 = (x340Var.i(ofw0Var) ? 1 : 0) | ((i3 == 32 || ((i2 & 64) != 0 && x340Var.i(sbw0Var))) ? b2 : b);
            Object objT14 = x340Var.T();
            if (i4 != 0 || objT14 == m4cVar) {
                pew0 pew0Var2 = new pew0(ofw0Var, sbw0Var, false, lnmVar2, (byte) 2);
                x340Var.s0(pew0Var2);
                objT14 = pew0Var2;
            }
            qxd0.s(str, str3, (vu30) objT14, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(this, kswVar, sbw0Var, i, (byte) 2);
        }
    }

    @Override // p.ubw0
    public final void f(long j) {
        k(new gew0(j));
    }

    @Override // p.ubw0
    public final void g(tv80 tv80Var) {
        k(new jew0(tv80Var));
    }

    @Override // p.ubw0
    public final void h(tv80 tv80Var) {
        k(new dew0(tv80Var));
    }

    @Override // p.ubw0
    public final x010 i() {
        return this.s;
    }

    @Override // p.ubw0
    public final bpb1 j() {
        return this.f10p;
    }

    public final void k(kew0 kew0Var) {
        jqd0 jqd0Var = this.r;
        if (jqd0Var != null) {
            ((MobiusLoop) jqd0Var.c).a(kew0Var);
        }
    }
}
