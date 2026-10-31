package p;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nl9 implements xpw, cvl1 {
    public final mqw X;
    public final /* synthetic */ byte a;
    public final Object b;
    public final rqw c;
    public final jsw d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object t;

    public nl9(Flowable flowable, Flowable flowable2, yl1 yl1Var, xfx xfxVar, dfm dfmVar, e821 e821Var, rm9 rm9Var, e7p0 e7p0Var, a1r0 a1r0Var) {
        this.a = (byte) 1;
        this.e = yl1Var;
        this.f = xfxVar;
        this.g = dfmVar;
        this.b = rm9Var;
        this.h = e7p0Var;
        this.i = a1r0Var;
        Flowable flowableU = flowable2.J(cq41.X).U(j5.a);
        flowableU.getClass();
        Function function = Functions.a;
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowableU.t(function);
        this.t = q1o1.u(new dx0((FlowableMap) e821Var.b, (FlowableTransformer) e821Var.e, (FlowableTransformer) e821Var.d, (unr) e821Var.a, (aor) e821Var.c), u291.f(nim0.a, 1.0f), (FrameLayout.LayoutParams) null, 6);
        Flowable flowableH = Flowable.h(flowable, flowableDistinctUntilChangedT, drm0.X);
        flowableH.getClass();
        this.X = d4o1.g(flowableH.t(function), fm9.Z0, tj8.Z0, new uv8((Object) this, (byte) 10), 8);
        this.c = n3o1.q(this).a(pn9.d, pn9.e);
        j2i j2iVar = new j2i(-1468326389, new zk9(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return this.c;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return this.d;
    }

    public void e(qim0 qim0Var, b0k b0kVar, int i) {
        yl1 yl1Var = (yl1) this.e;
        xfx xfxVar = (xfx) this.f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(491806071);
        int i2 = i | 6 | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            yla.r(x340Var);
            boolean zG = x340Var.g(xfxVar) | x340Var.g(yl1Var);
            Object objT = x340Var.T();
            qim0 qim0Var2 = nim0.a;
            if (zG || objT == fkj0.X) {
                ver verVarI = voo1.i(xfxVar);
                AddToButtonView addToButtonView = (AddToButtonView) verVarI.b;
                int iU = jch0.U(12.0f * addToButtonView.getResources().getDisplayMetrics().density);
                addToButtonView.setPadding(iU, iU, iU, iU);
                objT = q1o1.u(yl1Var.a(verVarI), u291.r(qim0Var2, 48.0f), (FrameLayout.LayoutParams) null, 6);
                x340Var.s0(objT);
            }
            otw.c((xpw) objT, new sl1(true), qim0Var2, (ipb1) null, x340Var, 384, 8);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new un9(this, qim0Var, i, (byte) 0);
        }
    }

    public void f(qim0 qim0Var, b0k b0kVar, int i) {
        dfm dfmVar = (dfm) this.g;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-547094895);
        int i2 = i | 6 | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            yla.r(x340Var);
            boolean zG = x340Var.g(dfmVar);
            Object objT = x340Var.T();
            qim0 qim0Var2 = nim0.a;
            if (zG || objT == fkj0.X) {
                objT = q1o1.u(dfmVar, uyn1.x(u291.r(qim0Var2, 48.0f), 12.0f), (FrameLayout.LayoutParams) null, 6);
                x340Var.s0(objT);
            }
            otw.c((xpw) objT, new jpt0(hpt0.a, 2), qim0Var2, (ipb1) null, x340Var, 448, 8);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new un9(this, qim0Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, onm onmVar) {
        x0s x0sVar;
        if (onmVar instanceof x0s) {
            x0sVar = (x0s) onmVar;
            int i = x0sVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x0sVar.c = i - Integer.MIN_VALUE;
            } else {
                x0sVar = new x0s(this, onmVar);
            }
        } else {
            x0sVar = new x0s(this, onmVar);
        }
        Object objJ = x0sVar.a;
        int i2 = x0sVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleFirstOrError = ((zxm1) this.h).b(str, (lik1) this.b).onErrorReturnItem(sum1.a).firstOrError();
            x0sVar.c = 1;
            objJ = fc11.j(singleFirstOrError, x0sVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return this.X;
            case 1:
                return this.X;
            case 2:
                return this.X;
            case 3:
                return (k8d1) this.X;
            case 4:
                return this.X;
            case 5:
                return this.X;
            case 6:
                return this.X;
            case 7:
                return this.X;
            case 8:
                return this.X;
            case 9:
                return this.X;
            case 10:
                return this.X;
            default:
                return this.X;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object h(o3r o3rVar, onm onmVar) {
        zev zevVar;
        d0r d0rVar = (d0r) this.i;
        if (onmVar instanceof zev) {
            zevVar = (zev) onmVar;
            int i = zevVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zevVar.d = i - Integer.MIN_VALUE;
            } else {
                zevVar = new zev(this, onmVar);
            }
        } else {
            zevVar = new zev(this, onmVar);
        }
        Object objJ = zevVar.b;
        int i2 = zevVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                f1r f1rVarA = o3rVar.a((String) this.b);
                i1r i1rVarB = d0rVar.b(f1rVarA);
                if (i1rVarB instanceof i1r) {
                    return i1rVarB.a;
                }
                this = d0rVar.c(f1rVarA);
                bpb1 bpb1Var = this.a().a;
                afv afvVar = new afv(2, (lnm) null, (byte) 0);
                zevVar.a = this;
                zevVar.d = 1;
                objJ = b5p1.j(bpb1Var, afvVar, zevVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = zevVar.a;
                hm5.M(objJ);
            }
            Object objG = u890.G((k1r) objJ);
            this.dispose();
            return objG;
        } catch (Throwable th) {
            this.dispose();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        if (p.fn31.Y(r11, r0, r7) == r10) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(java.lang.String r14, p.b960 r15, p.onm r16) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nl9.i(java.lang.String, p.b960, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public Object j(tv80 tv80Var, onm onmVar) {
        bfv bfvVar;
        tv80 tv80Var2;
        Set set;
        tv80 tv80Var3;
        g3d0 g3d0Var;
        tv80 tv80Var4;
        Set set2;
        if (onmVar instanceof bfv) {
            bfvVar = (bfv) onmVar;
            int i = bfvVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bfvVar.f = i - Integer.MIN_VALUE;
            } else {
                bfvVar = new bfv(this, onmVar);
            }
        } else {
            bfvVar = new bfv(this, onmVar);
        }
        bfv bfvVar2 = bfvVar;
        Object objH = bfvVar2.d;
        int i2 = bfvVar2.f;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objH);
            o3r o3rVar = (o3r) this.h;
            tv80Var2 = tv80Var;
            bfvVar2.a = tv80Var2;
            bfvVar2.f = 1;
            objH = h(o3rVar, bfvVar2);
            if (objH != obj) {
            }
        }
        if (i2 == 1) {
            tv80Var2 = bfvVar2.a;
            hm5.M(objH);
        } else {
            if (i2 == 2) {
                set = bfvVar2.b;
                tv80Var3 = bfvVar2.a;
                hm5.M(objH);
                g3d0 g3d0Var2 = (g3d0) objH;
                if (set != null || g3d0Var2 == null) {
                    kt91 kt91Var = (kt91) this.e;
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131953861});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", 2131953861, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    return rih1Var;
                }
                hfv hfvVar = (hfv) this.f;
                bfvVar2.a = tv80Var3;
                bfvVar2.b = set;
                bfvVar2.c = g3d0Var2;
                bfvVar2.f = 3;
                Object objA = hfvVar.a(bfvVar2);
                if (objA != obj) {
                    g3d0Var = g3d0Var2;
                    objH = objA;
                    tv80Var4 = tv80Var3;
                    set2 = set;
                }
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Set set3 = bfvVar2.b;
                hm5.M(objH);
                return rih1Var;
            }
            g3d0 g3d0Var3 = bfvVar2.c;
            Set set4 = bfvVar2.b;
            tv80 tv80Var5 = bfvVar2.a;
            hm5.M(objH);
            g3d0Var = g3d0Var3;
            tv80Var4 = tv80Var5;
            set2 = set4;
        }
        String str = (String) objH;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        ur1 ur1Var = new ur1((byte) 16, this, str, set2, g3d0Var, tv80Var4, (lnm) null);
        bfvVar2.a = null;
        bfvVar2.b = null;
        bfvVar2.c = null;
        bfvVar2.f = 4;
        return fn31.Y(bs50Var, ur1Var, bfvVar2) == obj ? obj : rih1Var;
        Set set5 = (Set) objH;
        o3r o3rVar2 = (o3r) this.t;
        bfvVar2.a = tv80Var2;
        bfvVar2.b = set5;
        bfvVar2.f = 2;
        Object objH2 = h(o3rVar2, bfvVar2);
        if (objH2 != obj) {
            tv80 tv80Var6 = tv80Var2;
            set = set5;
            objH = objH2;
            tv80Var3 = tv80Var6;
            g3d0 g3d0Var4 = (g3d0) objH;
            if (set != null) {
            }
            kt91 kt91Var2 = (kt91) this.e;
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131953861});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var2.k(new er91((fs91) null, "", 2131953861, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            return rih1Var;
        }
    }

    public nl9(fum0 fum0Var, Resources resources, ynb0 ynb0Var, yo31 yo31Var, iul0 iul0Var, f70 f70Var) {
        this.a = (byte) 5;
        this.b = fum0Var;
        this.e = ynb0Var;
        this.f = yo31Var;
        this.g = iul0Var;
        this.h = resources.getString(2131958983);
        this.i = resources.getString(2131958980);
        this.t = resources.getString(2131958981);
        this.X = x3p1.n(new qum0(this, (byte) 0), new qum0(this, (byte) 1), new fhk0(this, (byte) 5), (o8n) null, new qum0(this, (byte) 2), 8);
        this.c = n3o1.q(this).a(new sum0(this, (byte) 0), new sum0(this, (byte) 1));
        this.d = f70Var;
    }

    public nl9(jtl1 jtl1Var, yu3 yu3Var, jjk0 jjk0Var, zwz0 zwz0Var, kt91 kt91Var, q8n q8nVar) {
        this.a = (byte) 6;
        this.b = jtl1Var;
        this.e = yu3Var;
        this.f = jjk0Var;
        this.g = zwz0Var;
        this.h = kt91Var;
        this.i = q8nVar;
        this.X = x3p1.m((mr20) yu3Var.e, v9z0.c, j8y0.W0, (o8n) null, new hox0(this, (byte) 28), 8);
        j2i j2iVar = new j2i(1157197292, new zyy0(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.c = n3o1.q(this).a(g2z0.Y, g2z0.Z);
    }

    public nl9(pkh0 pkh0Var, cie1 cie1Var, ift0 ift0Var, gt70 gt70Var, zrg zrgVar, uu00 uu00Var, qkh0 qkh0Var) {
        this.a = (byte) 4;
        this.b = pkh0Var;
        this.e = cie1Var;
        this.f = ift0Var;
        this.g = gt70Var;
        this.h = zrgVar;
        this.i = uu00Var;
        this.t = qkh0Var;
        this.X = h7w.B(zr70.e, (o8n) null, (iu30) null, new bt70(this, (byte) 0), 6);
        this.c = new eih1();
        j2i j2iVar = new j2i(2102551027, new wv60(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public nl9(rcy rcyVar, a3u0 a3u0Var, yo31 yo31Var, ynb0 ynb0Var, yqg yqgVar, abu0 abu0Var, iac0 iac0Var) {
        this.a = (byte) 9;
        this.b = rcyVar;
        this.e = yo31Var;
        this.f = ynb0Var;
        this.t = yqgVar;
        this.g = abu0Var;
        this.h = iac0Var;
        this.i = a3u0Var.a(iac0Var);
        this.X = x3p1.n(new ruf1(this, (byte) 0), bpf1.b1, new rvd1(this, (byte) 14), (o8n) null, new ruf1(this, (byte) 1), 8);
        this.c = n3o1.q(this).a(vrf1.h, vrf1.i);
        j2i j2iVar = new j2i(1657237434, new y2f1(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public nl9(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5, FlowableMap flowableMap, Flowable flowable) {
        this.a = (byte) 11;
        this.b = ynb0Var;
        this.e = ynb0Var2;
        this.f = ynb0Var3;
        this.g = ynb0Var4;
        this.h = ynb0Var5;
        this.i = flowableMap;
        this.t = flowable;
        this.X = d4o1.f(new zpj1(this, (byte) 0), jmj1.T0, olj1.c, new zpj1(this, (byte) 1), 8);
        j2i j2iVar = rqj.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.c = n3o1.q(this).a(new zbb1(this, (byte) 12), k3j1.Z0);
    }

    public nl9(td01 td01Var, vun vunVar, lqc lqcVar, d0r d0rVar, mz10 mz10Var, ygt0 ygt0Var) {
        this.a = (byte) 7;
        this.b = td01Var;
        this.e = vunVar;
        this.i = d0rVar;
        this.f = mz10Var;
        this.g = ygt0Var;
        this.h = new idd1(new sd01(this, (byte) 0));
        this.t = new idd1(new sd01(this, (byte) 1));
        this.X = h7w.B(oa01.W0, (o8n) null, (iu30) null, new g001(this, (byte) 5), 6);
        this.c = new eih1();
        j2i j2iVar = new j2i(-1208679058, new zyy0(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public nl9(tlp tlpVar, urk0 urk0Var, gw70 gw70Var, zr00 zr00Var, yh2 yh2Var, ov20 ov20Var, f8b f8bVar, t7y t7yVar, ysr0 ysr0Var, iu30 iu30Var) {
        this.a = (byte) 10;
        this.b = gw70Var;
        this.e = zr00Var;
        this.f = yh2Var;
        this.g = ov20Var;
        this.h = f8bVar;
        this.i = t7yVar;
        this.t = tlpVar.a(ysr0Var, iu30Var);
        this.X = h7w.D(uyf1.W0, (bs50) null, uyf1.Y0, new j2i(188169778, new wcy0(this, (byte) 21), true), 2);
        this.c = n3o1.q(this).a(new zm01(urk0Var, (byte) 9), vrf1.R0);
        j2i j2iVar = new j2i(1567011610, new y2f1(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public nl9(rm9 rm9Var, it8 it8Var, w460 w460Var, al9 al9Var, mko mkoVar, d0r d0rVar, yqg yqgVar) {
        this.a = (byte) 0;
        this.b = rm9Var;
        this.e = it8Var;
        this.f = w460Var;
        this.g = al9Var;
        this.h = mkoVar;
        this.i = d0rVar;
        this.t = yqgVar;
        this.X = x3p1.n(new uv8((Object) this, (byte) 6), zv8.b1, tj8.S0, (o8n) null, (iu30) null, 24);
        this.c = n3o1.q(this).a(jb8.X0, jb8.Y0);
        j2i j2iVar = new j2i(1271920447, new zk9(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public nl9(xv61 xv61Var, gpm0 gpm0Var, esa1 esa1Var, q8n q8nVar, q8n q8nVar2, i9i1 i9i1Var, pjm1 pjm1Var, c681 c681Var) {
        this.a = (byte) 8;
        this.b = gpm0Var;
        this.e = esa1Var;
        this.f = q8nVar2;
        this.g = i9i1Var;
        this.h = pjm1Var;
        this.i = c681Var;
        this.t = xv61Var.a(rc11.a.b(r1c1.class), rih1.a);
        axb1 axb1Var = axb1.U0;
        j2i j2iVar = new j2i(-188269496, new wcy0(this, (byte) 16), true);
        xas xasVar = new xas();
        xasVar.a(new qd81(1, (byte) 18), new t491((byte) 20, 2, false));
        this.X = new ljm0(xasVar, axb1Var, q8nVar, j2iVar);
        this.c = n3o1.q(this).a(m1c1.b, m1c1.c);
        j2i j2iVar2 = ilj.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar2, (byte) 0);
    }

    public nl9(d0r d0rVar, String str, kt91 kt91Var, hfv hfvVar, spn spnVar) {
        this.a = (byte) 3;
        this.i = d0rVar;
        this.b = str;
        this.e = kt91Var;
        this.f = hfvVar;
        this.g = spnVar;
        this.h = w3p1.o(new l4r(jd0.D, 1, o6v.h, new j4r(o6v.d), o6v.i), o6v.e);
        this.t = w3p1.o(new l4r(pwc0.e, 1, o6v.t, new j4r(o6v.f), o6v.X), o6v.g);
        this.X = k1o1.u(new r20(this, (lnm) null, (byte) 17));
        this.c = n3o1.r(this).c(riu.Y0, riu.Z0);
        j2i j2iVar = lki.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public nl9(lik1 lik1Var, f1n0 f1n0Var, q7r0 q7r0Var, kt91 kt91Var, agc0 agc0Var, zxm1 zxm1Var, xrm1 xrm1Var, q8n q8nVar, t0t t0tVar) {
        this.a = (byte) 2;
        this.b = lik1Var;
        this.e = f1n0Var;
        this.f = q7r0Var;
        this.g = kt91Var;
        this.h = zxm1Var;
        this.i = q8nVar;
        this.t = t0tVar;
        this.X = x3p1.n(new qrk(this, (byte) 12), nvr.b1, szr.c, (o8n) null, new m4r(this, (byte) 22), 8);
        this.c = n3o1.q(this).a(zyr.g, zyr.h);
        j2i j2iVar = bsi.b;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}
