package p;

import android.os.Trace;
import com.spotify.betamax.player.VideoSurfaceView;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gfw0 implements ubw0 {
    public final bpb1 A;
    public final AtomicReference B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public ayh G;
    public WeakReference H;
    public final jr30 I;
    public final x010 J;
    public int K;
    public final abu0 b;
    public final tl7 c;
    public final p731 d;
    public final q8n e;
    public final q8n f;
    public final yqg g;
    public final ugn0 h;
    public final nwt i;
    public final ggl j;
    public final mlw0 k;
    public final k9k l;
    public final w9u0 m;
    public final hfw0 n;
    public final o35 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bpb1 f4p;
    public final bpb1 q;
    public final bpb1 r;
    public zau0 s;
    public WeakReference t;
    public final bpb1 u;
    public sbw0 v;
    public xab1 w;
    public final xgn0 x;
    public xab1 y;
    public hwt z;

    public gfw0(abu0 abu0Var, tl7 tl7Var, p731 p731Var, q8n q8nVar, q8n q8nVar2, yqg yqgVar, ugn0 ugn0Var, nwt nwtVar, ggl gglVar, mlw0 mlw0Var, oyo oyoVar, k9k k9kVar, w9u0 w9u0Var, hfw0 hfw0Var, jr30 jr30Var, o35 o35Var) {
        this.b = abu0Var;
        this.c = tl7Var;
        this.d = p731Var;
        this.e = q8nVar;
        this.f = q8nVar2;
        this.g = yqgVar;
        this.h = ugn0Var;
        this.i = nwtVar;
        this.j = gglVar;
        this.k = mlw0Var;
        this.l = k9kVar;
        this.m = w9u0Var;
        this.n = hfw0Var;
        this.o = o35Var;
        Boolean bool = Boolean.FALSE;
        this.f4p = gio1.b(bool);
        this.q = gio1.b(bool);
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.r = bpb1VarB;
        this.u = gio1.b((Object) null);
        this.x = ygn0.a();
        this.A = gio1.b((Object) null);
        this.B = new AtomicReference(null);
        this.K = 1;
        this.I = jr30Var == null ? oyoVar.a(p731Var) : jr30Var;
        this.J = new x010(new any(bpb1VarB, (byte) 18), new r6k0(ugn0Var.a, (byte) 15), new agn0(3, (lnm) null, (byte) 1), (byte) 1);
    }

    public static String p(sbw0 sbw0Var) {
        String str = sbw0Var.d.b.e;
        return str == null ? "" : str;
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
        this.t = new WeakReference(videoSurfaceView);
        if (this.C) {
            this.k.m(str, videoSurfaceView);
        }
    }

    @Override // p.ubw0
    public final bpb1 c() {
        return this.f4p;
    }

    @Override // p.ubw0
    public final void d() {
        sbw0 sbw0Var;
        abu0 abu0Var;
        ugn0 ugn0Var = this.h;
        boolean zA = ugn0Var.a();
        ugn0Var.b();
        if (zA || (sbw0Var = this.v) == null) {
            return;
        }
        if (sbw0Var.g) {
            this.C = false;
            this.H = null;
            this.q.m((Object) null, Boolean.FALSE);
            xab1 xab1Var = this.w;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            xab1 xab1Var2 = this.y;
            if (xab1Var2 != null) {
                xab1Var2.d((CancellationException) null);
            }
            mlw0 mlw0Var = this.k;
            if (((r091) mlw0Var.b) != null) {
                AtomicInteger atomicInteger = rfw0.a;
                Trace.beginSection("PreviewCard.Player.release");
                try {
                    mlw0Var.k();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                mlw0Var.k();
            }
            zau0 zau0Var = this.s;
            if (zau0Var != null && (abu0Var = this.b) != null) {
                abu0Var.b(zau0Var);
            }
            sbw0 sbw0Var2 = this.v;
            if (sbw0Var2 != null) {
                r(sbw0Var2);
            }
        }
    }

    @Override // p.ubw0
    public final void e(ksw kswVar, sbw0 sbw0Var, b0k b0kVar, int i) {
        ksw kswVar2;
        int i2;
        iac0 iac0Var;
        byte b;
        byte b2;
        byte b3;
        gfw0 gfw0Var = this;
        vf61 vf61Var = vf61.d1;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1072729880);
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
            i2 |= x340Var.i(gfw0Var) ? 256 : 128;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            String str = sbw0Var.b;
            boolean zG = x340Var.g(str);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                gfw0Var.D = false;
                gfw0Var.E = false;
                gfw0Var.K = 1;
                abu0 abu0Var = gfw0Var.b;
                objT = abu0Var != null ? abu0Var.e(str, false) : null;
                x340Var.s0(objT);
            }
            gfw0Var.s = (zau0) objT;
            boolean zI = x340Var.i(gfw0Var);
            Object objT2 = x340Var.T();
            Object obj = objT2;
            if (zI || objT2 == m4cVar) {
                lew0 lew0Var = new lew0(gfw0Var, (byte) 0);
                x340Var.s0(lew0Var);
                obj = lew0Var;
            }
            Function0 function0 = (Function0) obj;
            boolean zI2 = x340Var.i(gfw0Var);
            Object objT3 = x340Var.T();
            Object obj2 = objT3;
            if (zI2 || objT3 == m4cVar) {
                lew0 lew0Var2 = new lew0(gfw0Var, (byte) 1);
                x340Var.s0(lew0Var2);
                obj2 = lew0Var2;
            }
            i1o1.b(kswVar2, gfw0Var.c, str, function0, (Function0) obj2, x340Var, i3 & 14, 0);
            iac0 iac0Var2 = (iac0) x340Var.k(jfe0.a);
            ven0 ven0VarA = gfe0.a(x340Var);
            boolean zG2 = x340Var.g((op80) ven0VarA.getValue());
            Object objT4 = x340Var.T();
            if (zG2 || objT4 == m4cVar) {
                xir0 xir0VarA = ((op80) ven0VarA.getValue()).a(vf61Var);
                rr20 rr20Var = xir0VarA != null ? xir0VarA.b : null;
                if (rr20Var != null) {
                    vbm[] vbmVarArr = q601.a;
                    objT4 = new kge(rr20Var);
                } else {
                    moy0 moy0VarX = qon1.x((op80) ven0VarA.getValue());
                    if (moy0VarX != null) {
                        vbm[] vbmVarArr2 = q601.a;
                        objT4 = new dy20(new kge(moy0VarX), (byte) 26);
                    } else {
                        objT4 = new huz(sir0.a, (byte) 10);
                    }
                }
                x340Var.s0(objT4);
            }
            mr20 mr20Var = (mr20) objT4;
            boolean zG3 = x340Var.g((op80) ven0VarA.getValue());
            Object objT5 = x340Var.T();
            if (zG3 || objT5 == m4cVar) {
                xir0 xir0VarA2 = ((op80) ven0VarA.getValue()).a(vf61Var);
                w7u0 w7u0Var = xir0VarA2 != null ? xir0VarA2.c : null;
                if (w7u0Var == null) {
                    w7u0Var = w7u0.a;
                }
                objT5 = w7u0Var;
                x340Var.s0(objT5);
            }
            w7u0 w7u0Var2 = (w7u0) objT5;
            boolean zG4 = x340Var.g(iac0Var2);
            Object objT6 = x340Var.T();
            Object obj3 = objT6;
            if (zG4 || objT6 == m4cVar) {
                c1v0 c1v0Var = new c1v0(iac0Var2.getLifecycle().c(), (byte) 8);
                x340Var.s0(c1v0Var);
                obj3 = c1v0Var;
            }
            mr20 mr20Var2 = (mr20) obj3;
            gfw0Var.n.b = (op80) ven0VarA.getValue();
            String strP = p(sbw0Var);
            int i4 = i3 & 112;
            boolean zI3 = x340Var.i(gfw0Var) | (i4 == 32 || ((i3 & 64) != 0 && x340Var.i(sbw0Var)));
            Object objT7 = x340Var.T();
            Object obj4 = objT7;
            if (zI3 || objT7 == m4cVar) {
                new0 new0Var = new new0(gfw0Var, sbw0Var, (lnm) null);
                x340Var.s0(new0Var);
                obj4 = new0Var;
            }
            qxd0.s(str, strP, (vu30) obj4, x340Var);
            boolean zI4 = x340Var.i(gfw0Var) | x340Var.i(iac0Var2) | (i4 == 32 || ((i3 & 64) != 0 && x340Var.i(sbw0Var)));
            Object objT8 = x340Var.T();
            if (zI4 || objT8 == m4cVar) {
                iac0Var = iac0Var2;
                b = 0;
                b2 = 1;
                glu0 glu0Var = new glu0(gfw0Var, iac0Var, sbw0Var, (lnm) null, (byte) 9);
                x340Var.s0(glu0Var);
                objT8 = glu0Var;
            } else {
                iac0Var = iac0Var2;
                b = 0;
                b2 = 1;
            }
            qxd0.s(str, iac0Var, (vu30) objT8, x340Var);
            boolean zI5 = x340Var.i(gfw0Var) | x340Var.i(iac0Var);
            Object objT9 = x340Var.T();
            Object obj5 = objT9;
            if (zI5 || objT9 == m4cVar) {
                pew0 pew0Var = new pew0(gfw0Var, iac0Var, (lnm) null, b2);
                x340Var.s0(pew0Var);
                obj5 = pew0Var;
            }
            qxd0.s(str, iac0Var, (vu30) obj5, x340Var);
            boolean zI6 = x340Var.i(gfw0Var);
            Object objT10 = x340Var.T();
            Object obj6 = objT10;
            if (zI6 || objT10 == m4cVar) {
                qew0 qew0Var = new qew0(gfw0Var, null, b);
                x340Var.s0(qew0Var);
                obj6 = qew0Var;
            }
            qxd0.t(str, x340Var, (vu30) obj6);
            Boolean boolValueOf = Boolean.valueOf(sbw0Var.g);
            Boolean boolValueOf2 = Boolean.valueOf(sbw0Var.h);
            int i5 = ((i4 == 32 || ((i3 & 64) != 0 && x340Var.i(sbw0Var))) ? b2 : (byte) 0) | (x340Var.i(gfw0Var) ? 1 : 0);
            Object objT11 = x340Var.T();
            Object obj7 = objT11;
            if (i5 != 0 || objT11 == m4cVar) {
                new0 new0Var2 = new new0(sbw0Var, gfw0Var, (lnm) null);
                x340Var.s0(new0Var2);
                obj7 = new0Var2;
            }
            qxd0.r(str, boolValueOf, boolValueOf2, (vu30) obj7, x340Var);
            Object[] objArr = {str, iac0Var, mr20Var, w7u0Var2};
            boolean zI7 = x340Var.i(gfw0Var) | x340Var.i(mr20Var) | x340Var.i(mr20Var2) | x340Var.e(w7u0Var2.ordinal()) | (i4 == 32 || ((i3 & 64) != 0 && x340Var.i(sbw0Var)));
            Object objT12 = x340Var.T();
            if (zI7 || objT12 == m4cVar) {
                b3 = 10;
                sew0 sew0Var = new sew0((byte) 0, this, mr20Var, mr20Var2, w7u0Var2, sbw0Var, (lnm) null);
                gfw0Var = this;
                x340Var.s0(sew0Var);
                objT12 = sew0Var;
            } else {
                b3 = 10;
            }
            qxd0.u(objArr, (vu30) objT12, x340Var);
            boolean zI8 = x340Var.i(gfw0Var);
            Object objT13 = x340Var.T();
            Object obj8 = objT13;
            if (zI8 || objT13 == m4cVar) {
                mwv0 mwv0Var = new mwv0(gfw0Var, b3);
                x340Var.s0(mwv0Var);
                obj8 = mwv0Var;
            }
            qxd0.i(rih1.a, (iu30) obj8, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(gfw0Var, kswVar, sbw0Var, i, (byte) 1);
        }
    }

    @Override // p.ubw0
    public final void f(long j) {
        r091 r091Var = (r091) this.k.b;
        if (r091Var != null) {
            r091Var.h(j);
        }
        sbw0 sbw0Var = this.v;
        if (sbw0Var != null && sbw0Var.f) {
            this.B.set(Long.valueOf(j));
            p731 p731Var = this.d;
            if (p731Var != null) {
                p731Var.b(p(sbw0Var), wuh1.a);
            }
        }
    }

    @Override // p.ubw0
    public final void g(tv80 tv80Var) {
        if (this.K != 1) {
            return;
        }
        this.F = true;
        bpb1 bpb1Var = this.h.a;
        sgn0 sgn0Var = new sgn0(tv80Var, false);
        bpb1Var.getClass();
        bpb1Var.m((Object) null, sgn0Var);
    }

    @Override // p.ubw0
    public final void h(tv80 tv80Var) {
        sbw0 sbw0Var;
        r091 r091Var = (r091) this.k.b;
        if (r091Var == null || !(((i091) r091Var.g.getValue()).h instanceof k091) || (sbw0Var = this.v) == null) {
            return;
        }
        AtomicInteger atomicInteger = rfw0.a;
        Trace.beginSection("PreviewCard.Player.load");
        try {
            r091Var.b(q(sbw0Var));
            Trace.endSection();
            Trace.beginSection("PreviewCard.Player.play");
            try {
                r091.f(r091Var, tv80Var, Long.valueOf(this.g.b()), eky0.a, 4);
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // p.ubw0
    public final x010 i() {
        return this.J;
    }

    @Override // p.ubw0
    public final bpb1 j() {
        return this.q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(sbw0 sbw0Var, c9n c9nVar, onm onmVar) {
        vew0 vew0Var;
        if (onmVar instanceof vew0) {
            vew0Var = (vew0) onmVar;
            int i = vew0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vew0Var.e = i - Integer.MIN_VALUE;
            } else {
                vew0Var = new vew0(this, onmVar);
            }
        } else {
            vew0Var = new vew0(this, onmVar);
        }
        Object obj = vew0Var.c;
        int i2 = vew0Var.e;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        byte b = 1;
        if (i2 == 0) {
            hm5.M(obj);
            if (this.K != 1) {
                return rih1Var;
            }
            vew0Var.a = sbw0Var;
            vew0Var.b = c9nVar;
            vew0Var.e = 1;
            Object objN = n(vew0Var);
            Object obj2 = d9n.a;
            if (objN == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9nVar = vew0Var.b;
            sbw0Var = vew0Var.a;
            hm5.M(obj);
        }
        this.y = fn31.T(c9nVar, this.f, 0, new oew0(this, sbw0Var, lnmVar, b), 2);
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(sbw0 sbw0Var, boolean z, onm onmVar) {
        wew0 wew0Var;
        long jLongValue;
        if (onmVar instanceof wew0) {
            wew0Var = (wew0) onmVar;
            int i = wew0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wew0Var.d = i - Integer.MIN_VALUE;
            } else {
                wew0Var = new wew0(this, onmVar);
            }
        } else {
            wew0Var = new wew0(this, onmVar);
        }
        Object objO = wew0Var.b;
        int i2 = wew0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                Long l = sbw0Var.k;
                if (l == null) {
                    jLongValue = sbw0Var.e;
                } else {
                    if (!this.h.a()) {
                        l = null;
                    }
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = sbw0Var.e;
                    }
                }
                if (z || jLongValue <= 0) {
                    return null;
                }
                sbw0Var = sap1.a();
                this.G = sbw0Var;
                lhb lhbVar = new lhb(sbw0Var, (lnm) null, (byte) 4);
                wew0Var.a = sbw0Var;
                wew0Var.d = 1;
                objO = rc2.O(jLongValue, lhbVar, wew0Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sbw0Var = wew0Var.a;
                hm5.M(objO);
            }
            wii1 wii1Var = (wii1) objO;
            if (this.G == sbw0Var) {
                this.G = null;
            }
            return wii1Var;
        } catch (Throwable th) {
            if (this.G == sbw0Var) {
                this.G = null;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(sbw0 sbw0Var, boolean z, onm onmVar) {
        xew0 xew0Var;
        if (onmVar instanceof xew0) {
            xew0Var = (xew0) onmVar;
            int i = xew0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xew0Var.d = i - Integer.MIN_VALUE;
            } else {
                xew0Var = new xew0(this, onmVar);
            }
        } else {
            xew0Var = new xew0(this, onmVar);
        }
        Object obj = xew0Var.b;
        int i2 = xew0Var.d;
        boolean z2 = true;
        if (i2 == 0) {
            hm5.M(obj);
            if (!z) {
                o35 o35Var = this.o;
                if (o35Var.b()) {
                    long jC = o35Var.c();
                    if (jC <= 0) {
                        return Boolean.TRUE;
                    }
                    xew0Var.a = sbw0Var;
                    xew0Var.d = 1;
                    Object objI = hap1.i(jC, xew0Var);
                    d9n d9nVar = d9n.a;
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            return Boolean.TRUE;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sbw0Var = xew0Var.a;
        hm5.M(obj);
        if (!v(sbw0Var) || !fqo1.C(this.z) || (sbw0Var.g && this.h.a())) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public final Object n(onm onmVar) {
        Object objP;
        xab1 xab1Var = this.y;
        this.y = null;
        return (xab1Var == null || (objP = op71.p(xab1Var, onmVar)) != d9n.a) ? rih1.a : objP;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(onm onmVar) {
        yew0 yew0Var;
        int i;
        int i2;
        sbw0 sbw0Var;
        if (onmVar instanceof yew0) {
            yew0Var = (yew0) onmVar;
            int i3 = yew0Var.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yew0Var.d = i3 - Integer.MIN_VALUE;
            } else {
                yew0Var = new yew0(this, onmVar);
            }
        } else {
            yew0Var = new yew0(this, onmVar);
        }
        Object obj = yew0Var.b;
        int i4 = yew0Var.d;
        if (i4 == 0) {
            hm5.M(obj);
            xab1 xab1Var = this.w;
            i = (xab1Var == null || !xab1Var.isActive() || (sbw0Var = this.v) == null || !sbw0Var.f) ? 0 : 1;
            this.w = null;
            if (xab1Var != null) {
                yew0Var.a = i;
                yew0Var.d = 1;
                Object objP = op71.p(xab1Var, yew0Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
                i2 = i;
            }
            if (i != 0) {
                this.I.e();
            }
            return rih1.a;
        }
        if (i4 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = yew0Var.a;
        hm5.M(obj);
        i = i2;
        if (i != 0) {
            this.I.e();
        }
        return rih1.a;
    }

    public final lsm0 q(sbw0 sbw0Var) {
        Long lA;
        boolean z = sbw0Var.f;
        lsm0 lsm0Var = sbw0Var.d;
        if (z && (lA = this.I.a(p(sbw0Var))) != null) {
            return lsm0.a(lsm0Var, (ksm0) null, lsm0Var.e != null ? new jsm0(Long.valueOf(lA.longValue()), (Long) null) : null, 2031);
        }
        return lsm0Var;
    }

    public final void r(sbw0 sbw0Var) {
        zau0 zau0Var;
        abu0 abu0Var;
        if (!sbw0Var.h || this.K != 1 || (zau0Var = this.s) == null || (abu0Var = this.b) == null) {
            return;
        }
        abu0Var.a(zau0Var);
    }

    public final void s(sbw0 sbw0Var) {
        if (sbw0Var.f) {
            this.I.e();
            p731 p731Var = this.d;
            if (p731Var != null) {
                p731Var.c(p(sbw0Var));
            }
            this.B.set(null);
        }
        boolean z = this.v != null;
        hwt hwtVar = this.z;
        boolean z2 = ((hwtVar == null || fqo1.C(hwtVar)) && sbw0Var.i) ? false : true;
        if (z && z2) {
            ugn0 ugn0Var = this.h;
            if (!ugn0Var.a()) {
                ugn0Var.b();
            }
        }
        w();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object t(sbw0 sbw0Var, c9n c9nVar, tv80 tv80Var, onm onmVar) throws Throwable {
        afw0 afw0Var;
        gfw0 gfw0Var;
        c9n c9nVar2;
        ayh ayhVar;
        c9n c9nVar3;
        if (onmVar instanceof afw0) {
            afw0Var = (afw0) onmVar;
            int i = afw0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                afw0Var.d = i - Integer.MIN_VALUE;
            } else {
                afw0Var = new afw0(this, onmVar);
            }
        } else {
            afw0Var = new afw0(this, onmVar);
        }
        afw0 afw0Var2 = afw0Var;
        Object obj = afw0Var2.b;
        int i2 = afw0Var2.d;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (this.K != 1) {
                this.F = false;
                return rih1Var;
            }
            r091 r091Var = (r091) this.k.b;
            boolean z = this.F;
            this.F = false;
            if (r091Var == null) {
                if (sbw0Var == null) {
                    sbw0Var = this.v;
                }
                sbw0 sbw0Var2 = sbw0Var;
                if (!z && sbw0Var2 != null && !sbw0Var2.i) {
                    this.h.b();
                    return rih1Var;
                }
                hwt hwtVar = this.z;
                if (((hwtVar == null || !fqo1.C(hwtVar)) && !z) || sbw0Var2 == null) {
                    gfw0Var = this;
                    c9nVar2 = c9nVar;
                } else {
                    afw0Var2.a = c9nVar;
                    afw0Var2.d = 1;
                    gfw0Var = this;
                    c9nVar2 = c9nVar;
                    Object objU = gfw0Var.u(sbw0Var2, c9nVar2, tv80Var, z, afw0Var2);
                    d9n d9nVar = d9n.a;
                    if (objU == d9nVar) {
                        return d9nVar;
                    }
                }
            } else {
                gfw0Var = this;
                c9nVar2 = c9nVar;
                if (z && (ayhVar = gfw0Var.G) != null) {
                    ayhVar.m0(new wii1(tv80Var));
                }
                r091Var.k();
            }
            c9nVar3 = c9nVar2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9nVar3 = afw0Var2.a;
            hm5.M(obj);
            gfw0Var = this;
        }
        boolean zBooleanValue = ((Boolean) gfw0Var.f4p.getValue()).booleanValue();
        zkm zkmVar = (zkm) ((bpb1) gfw0Var.l.f).getValue();
        if (zkmVar != null && zkmVar.d && zkmVar.c && zBooleanValue) {
            fn31.T(c9nVar3, gfw0Var.f, 0, new qew0(gfw0Var, null, (byte) 1), 2);
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object u(sbw0 sbw0Var, c9n c9nVar, tv80 tv80Var, boolean z, onm onmVar) throws Throwable {
        bfw0 bfw0Var;
        tv80 tv80Var2;
        vgn0 vgn0Var;
        boolean z2;
        sbw0 sbw0Var2;
        c9n c9nVar2;
        int i;
        int i2;
        boolean z3;
        int i3;
        tv80 tv80Var3;
        c9n c9nVar3;
        sbw0 sbw0Var3;
        vgn0 vgn0Var2;
        Throwable th;
        if (onmVar instanceof bfw0) {
            bfw0Var = (bfw0) onmVar;
            int i4 = bfw0Var.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bfw0Var.t = i4 - Integer.MIN_VALUE;
            } else {
                bfw0Var = new bfw0(this, onmVar);
            }
        } else {
            bfw0Var = new bfw0(this, onmVar);
        }
        Object obj = bfw0Var.h;
        int i5 = bfw0Var.t;
        Object obj2 = d9n.a;
        try {
            if (i5 == 0) {
                hm5.M(obj);
                bfw0Var.a = sbw0Var;
                bfw0Var.b = c9nVar;
                tv80Var2 = tv80Var;
                bfw0Var.c = tv80Var2;
                vgn0Var = this.x;
                bfw0Var.d = vgn0Var;
                z2 = z;
                bfw0Var.e = z2;
                bfw0Var.f = 0;
                bfw0Var.t = 1;
                if (vgn0Var.a(bfw0Var) != obj2) {
                    sbw0Var2 = sbw0Var;
                    c9nVar2 = c9nVar;
                    i = 0;
                }
                return obj2;
            }
            if (i5 != 1) {
                if (i5 == 2) {
                    int i6 = bfw0Var.g;
                    int i7 = bfw0Var.f;
                    boolean z4 = bfw0Var.e;
                    vgn0 vgn0Var3 = bfw0Var.d;
                    tv80 tv80Var4 = bfw0Var.c;
                    c9n c9nVar4 = bfw0Var.b;
                    sbw0 sbw0Var4 = bfw0Var.a;
                    try {
                        hm5.M(obj);
                        i3 = i6;
                        z3 = z4;
                        vgn0Var = vgn0Var3;
                        i2 = i7;
                        tv80Var2 = tv80Var4;
                        c9nVar2 = c9nVar4;
                        sbw0Var2 = sbw0Var4;
                        bfw0Var.a = sbw0Var2;
                        bfw0Var.b = c9nVar2;
                        bfw0Var.c = tv80Var2;
                        bfw0Var.d = vgn0Var;
                        bfw0Var.e = z3;
                        bfw0Var.f = i2;
                        bfw0Var.g = i3;
                        bfw0Var.t = 3;
                        if (o(bfw0Var) != obj2) {
                            tv80Var3 = tv80Var2;
                            c9nVar3 = c9nVar2;
                            sbw0Var3 = sbw0Var2;
                        }
                        return obj2;
                    } catch (Throwable th2) {
                        th = th2;
                        vgn0Var2 = vgn0Var3;
                    }
                } else {
                    if (i5 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = bfw0Var.e;
                    vgn0Var2 = bfw0Var.d;
                    tv80Var3 = bfw0Var.c;
                    c9nVar3 = bfw0Var.b;
                    sbw0Var3 = bfw0Var.a;
                    try {
                        hm5.M(obj);
                        vgn0Var = vgn0Var2;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                vgn0Var2.c((Object) null);
                throw th;
            }
            i = bfw0Var.f;
            boolean z5 = bfw0Var.e;
            vgn0Var = bfw0Var.d;
            tv80 tv80Var5 = bfw0Var.c;
            c9nVar2 = bfw0Var.b;
            sbw0Var2 = bfw0Var.a;
            hm5.M(obj);
            z2 = z5;
            tv80Var2 = tv80Var5;
            if (this.K == 1 && this.D && this.E) {
                this.v = sbw0Var3;
                this.C = false;
                this.H = null;
                this.w = fn31.T(c9nVar3, this.f, 0, new cfw0(this, sbw0Var3, z3, tv80Var3, null), 2);
            }
            vgn0Var.c((Object) null);
            return rih1.a;
            if (this.K == 1) {
                bfw0Var.a = sbw0Var2;
                bfw0Var.b = c9nVar2;
                bfw0Var.c = tv80Var2;
                bfw0Var.d = vgn0Var;
                bfw0Var.e = z2;
                bfw0Var.f = i;
                bfw0Var.g = 0;
                bfw0Var.t = 2;
                if (n(bfw0Var) != obj2) {
                    boolean z6 = z2;
                    i2 = i;
                    z3 = z6;
                    i3 = 0;
                    bfw0Var.a = sbw0Var2;
                    bfw0Var.b = c9nVar2;
                    bfw0Var.c = tv80Var2;
                    bfw0Var.d = vgn0Var;
                    bfw0Var.e = z3;
                    bfw0Var.f = i2;
                    bfw0Var.g = i3;
                    bfw0Var.t = 3;
                    if (o(bfw0Var) != obj2) {
                        tv80Var3 = tv80Var2;
                        c9nVar3 = c9nVar2;
                        sbw0Var3 = sbw0Var2;
                        if (this.K == 1) {
                            this.v = sbw0Var3;
                            this.C = false;
                            this.H = null;
                            this.w = fn31.T(c9nVar3, this.f, 0, new cfw0(this, sbw0Var3, z3, tv80Var3, null), 2);
                        }
                    }
                }
                return obj2;
            }
            vgn0Var.c((Object) null);
            return rih1.a;
        } catch (Throwable th4) {
            th = th4;
            vgn0Var2 = vgn0Var;
        }
    }

    public final boolean v(sbw0 sbw0Var) {
        zau0 zau0Var;
        return this.K == 1 && this.v == sbw0Var && this.D && this.E && (zau0Var = this.s) != null && ((Boolean) zau0Var.b.getValue()).booleanValue();
    }

    public final void w() {
        abu0 abu0Var;
        this.t = null;
        this.H = null;
        this.C = false;
        this.u.l((Object) null);
        Boolean bool = Boolean.FALSE;
        this.f4p.m((Object) null, bool);
        this.q.m((Object) null, bool);
        this.v = null;
        xab1 xab1Var = this.w;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        xab1 xab1Var2 = this.y;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        this.y = null;
        this.F = false;
        mlw0 mlw0Var = this.k;
        boolean z = ((r091) mlw0Var.b) != null;
        if (z) {
            AtomicInteger atomicInteger = rfw0.a;
            Trace.beginSection("PreviewCard.Player.stop");
            try {
                r091 r091Var = (r091) mlw0Var.b;
                if (r091Var != null) {
                    r091Var.j();
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (z) {
            AtomicInteger atomicInteger2 = rfw0.a;
            Trace.beginSection("PreviewCard.Player.release");
            try {
                mlw0Var.k();
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } else {
            mlw0Var.k();
        }
        this.r.m((Object) null, new i091());
        zau0 zau0Var = this.s;
        if (zau0Var == null || (abu0Var = this.b) == null) {
            return;
        }
        abu0Var.b(zau0Var);
    }
}
