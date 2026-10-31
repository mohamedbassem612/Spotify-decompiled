package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class br0 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public br0(gw70 gw70Var, kwp kwpVar, x390 x390Var, v6m v6mVar, lik1 lik1Var, Single single) {
        f8m f8mVar;
        this.a = (byte) 16;
        pbg pbgVar = new pbg(single, (lnm) null, (byte) 6);
        j3r j3rVar = rzq.y;
        rzq rzqVarF = l2p1.f(new w1k(new l2r[]{(dv00) x390Var.b, ((yko) x390Var.c).a((String) null, pbgVar)}));
        switch (kwpVar.a) {
            case 0:
                nwp nwpVar = (nwp) kwpVar.b.c;
                pe peVarG = nwpVar.a.g();
                c8o.l(peVarG);
                gbp gbpVar = nwpVar.f0;
                lwp lwpVar = (lwp) nwpVar.k0.get();
                mwp mwpVar = (mwp) nwpVar.q0.get();
                em0 em0Var = nwpVar.a;
                a1r0 a1r0VarA0 = em0Var.A0();
                c8o.l(a1r0VarA0);
                uk51 uk51Var = new uk51(a1r0VarA0, (byte) 0);
                xh71 xh71VarX0 = em0Var.X0();
                c8o.l(xh71VarX0);
                f8mVar = new f8m(peVarG, gbpVar, lwpVar, mwpVar, uk51Var, new xy61(xh71VarX0), nwpVar.f(), lik1Var, rzqVarF);
                break;
            default:
                thq thqVar = kwpVar.b;
                daq daqVar = thqVar.b;
                pe peVar = (pe) daqVar.p9.get();
                v5q v5qVar = thqVar.c;
                f8mVar = new f8m(peVar, v5qVar.S6, (lwp) v5qVar.W6.get(), (mwp) v5qVar.d7.get(), new uk51((a1r0) v5qVar.k1.get(), (byte) 0), (xy61) v5qVar.e7.get(), (mr4) daqVar.ri.get(), lik1Var, rzqVarF);
                break;
        }
        this.c = f8mVar;
        this.e = n3o1.q(this).a(ngl.R0, ngl.S0);
        m7m m7mVar = new m7m("", j7m.a);
        t2m t2mVar = t2m.c;
        rhg0 rhg0Var = new rhg0(rzqVarF, (ukj0) null);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        u6m u6mVar = new u6m(v6mVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x6m.class), runSequentially.a(u6mVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(w6m.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s6m(rhg0Var, v6mVar)));
        this.d = sbl.B(m7mVar, t2mVar, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI), u2m.c, z4m.O0);
        j2i j2iVar = new j2i(-115400352, new t20(gw70Var, this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public static final /* synthetic */ bpb1 f(br0 br0Var) {
        return (bpb1) br0Var.c;
    }

    public static String g(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return nik1.L0.a;
        }
        if (iC == 1) {
            return nik1.M0.a;
        }
        if (iC == 2) {
            return nik1.x1.a;
        }
        if (iC == 3) {
            return "spotify:presents:import-music";
        }
        eg.o();
        return null;
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                return (ia00) obj;
            case 1:
                return (eih1) obj;
            case 2:
                return (eih1) obj;
            case 3:
                return (hy00) obj;
            case 4:
                return (ia00) obj;
            case 5:
                return (eih1) obj;
            case 6:
                return n3o1.q(this).a(k63.W0, k63.X0);
            case 7:
                return (ia00) obj;
            case 8:
                return (ia00) obj;
            case 9:
                return (ia00) obj;
            case 10:
                return (ia00) obj;
            case 11:
                return (ia00) obj;
            case 12:
                return (eih1) obj;
            case 13:
                return (eih1) obj;
            case 14:
                return (ia00) obj;
            case 15:
                return (i7h1) obj;
            case 16:
                return (ia00) obj;
            case 17:
                return (ia00) obj;
            case 18:
                return (ia00) obj;
            case 19:
                return (hy00) obj;
            case 20:
                return (eih1) obj;
            case 21:
                return (ia00) obj;
            case 22:
                return (ia00) obj;
            case 23:
                return (ia00) obj;
            case 24:
                return (hy00) obj;
            case 25:
                return (ia00) obj;
            case 26:
                return (ybo) this.d;
            case 27:
                return (ia00) obj;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return (ia00) obj;
            default:
                return (ia00) obj;
        }
    }

    public final jsw c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (psw) obj;
            case 1:
                return (psw) obj;
            case 2:
                return (psw) obj;
            case 3:
                return (psw) obj;
            case 4:
                return (psw) obj;
            case 5:
                return (psw) obj;
            case 6:
                return (psw) obj;
            case 7:
                return (psw) obj;
            case 8:
                return (psw) obj;
            case 9:
                return (psw) obj;
            case 10:
                return (psw) obj;
            case 11:
                return (psw) obj;
            case 12:
                j2i j2iVar = new j2i(-1060795553, new gtd(this, (byte) 24), true);
                ien0 ien0Var = qsw.a;
                return new psw(j2iVar, (byte) 0);
            case 13:
                return (psw) obj;
            case 14:
                return (psw) obj;
            case 15:
                return (psw) obj;
            case 16:
                return (psw) obj;
            case 17:
                return (psw) obj;
            case 18:
                return (psw) obj;
            case 19:
                return (psw) obj;
            case 20:
                return (psw) obj;
            case 21:
                return (psw) obj;
            case 22:
                return (psw) obj;
            case 23:
                return (psw) obj;
            case 24:
                return (psw) obj;
            case 25:
                return (psw) obj;
            case 26:
                return (psw) obj;
            case 27:
                return (psw) obj;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return (psw) obj;
            default:
                return (psw) obj;
        }
    }

    public void e(evu evuVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        l1v l1vVar;
        String str;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-240142618);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(evuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            kwp0 kwp0Var = evuVar.c;
            boolean zG = x340Var.g(kwp0Var);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = Boolean.valueOf(kwp0Var instanceof swp0);
                x340Var.s0(objT);
            }
            boolean zBooleanValue = ((Boolean) objT).booleanValue();
            boolean zG2 = x340Var.g(kwp0Var);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                if (kwp0Var instanceof mwp0) {
                    l1vVar = l1v.a;
                } else if (kwp0Var instanceof wwp0) {
                    l1vVar = n1v.a;
                } else if (kwp0Var instanceof iwp0) {
                    l1vVar = i1v.a;
                } else {
                    if ((kwp0Var instanceof uwp0) || (kwp0Var instanceof qwp0) || (kwp0Var instanceof owp0) || (kwp0Var instanceof swp0)) {
                        l1vVar = h1v.a;
                    } else {
                        if (!(kwp0Var instanceof kwp0)) {
                            eg.o();
                            return;
                        }
                        float f = kwp0Var.c / 100.0f;
                        if (f < 0.0f) {
                            f = 0.0f;
                        }
                        objT2 = new k1v(Float.valueOf(f));
                    }
                    x340Var.s0(objT2);
                }
                objT2 = l1vVar;
                x340Var.s0(objT2);
            }
            p1v p1vVar = (p1v) objT2;
            if (p1vVar instanceof m1v) {
                str = "none";
            } else if (p1vVar instanceof l1v) {
                str = "error";
            } else if (p1vVar instanceof n1v) {
                str = "pending";
            } else if (p1vVar instanceof f1v) {
                str = "disabled";
            } else if (p1vVar instanceof i1v) {
                str = "downloaded";
            } else if (p1vVar instanceof k1v) {
                str = "downloading";
            } else {
                if (!(p1vVar instanceof h1v)) {
                    eg.o();
                    return;
                }
                str = "downloadable";
            }
            qim0 qim0VarN = anm1.N("standard_header_download_element_button_state_".concat(str), nim0.a);
            sru sruVar = new sru(p1vVar, (String) null, ((Context) this.c).getString(2131962903), evuVar.a.b, 2);
            boolean zH = x340Var.h(zBooleanValue) | ((i2 & 112) == 32);
            Object objT3 = x340Var.T();
            if (zH || objT3 == obj) {
                objT3 = new z20(iu30Var, zBooleanValue, (byte) 13);
                x340Var.s0(objT3);
            }
            hqq0.f(sruVar, new gbx(z50.c, (Function0) objT3), qim0VarN, x340Var, 0, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(this, evuVar, iu30Var, i, (byte) 8);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return (js20) obj2;
            case 1:
                return (poy0) obj2;
            case 2:
                return (poy0) obj2;
            case 3:
                return (rey0) obj2;
            case 4:
                return (k8d1) obj2;
            case 5:
                return (rey0) obj2;
            case 6:
                return (rey0) obj;
            case 7:
                return (rey0) obj2;
            case 8:
                return (rey0) obj2;
            case 9:
                return (ljm0) obj2;
            case 10:
                return (rey0) obj2;
            case 11:
                return (js20) obj2;
            case 12:
                return (rey0) this.b;
            case 13:
                return (rey0) obj2;
            case 14:
                return (rey0) obj2;
            case 15:
                return (rey0) obj2;
            case 16:
                return (e7m0) obj2;
            case 17:
                return (rey0) obj2;
            case 18:
                return (js20) obj2;
            case 19:
                return (rey0) obj2;
            case 20:
                return (rey0) obj2;
            case 21:
                return (k8d1) obj2;
            case 22:
                return (rey0) obj2;
            case 23:
                return (rey0) obj2;
            case 24:
                return (js20) obj2;
            case 25:
                return (k8d1) obj2;
            case 26:
                return (rey0) obj;
            case 27:
                return (rey0) obj2;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return (js20) obj2;
            default:
                return (js20) obj2;
        }
    }

    public br0(ez01 ez01Var) {
        this.a = (byte) 17;
        this.c = ez01Var;
        this.d = new rey0(new mgl(this, (byte) 21));
        this.e = n3o1.q(this).a(h40.Z, zho.i);
        j2i j2iVar = ohi.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(i4m0 i4m0Var) {
        this.a = (byte) 27;
        this.c = i4m0Var;
        this.d = k1o1.p();
        j2i j2iVar = hmi.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.e = n3o1.q(this).a(new k9s(this, (byte) 23), c9x.Z);
    }

    public br0(mxr mxrVar, kp5 kp5Var, st60 st60Var, oj80 oj80Var, jtl1 jtl1Var) {
        this.a = (byte) 18;
        this.c = jtl1Var;
        c9c0 c9c0Var = (c9c0) mxrVar.a;
        this.d = x3p1.m(new qer(new any(new x010(c9c0Var.b.current(), c9c0Var.e.a(), new mnl(3, (lnm) null, (byte) 14), (byte) 1), (byte) 18), mxrVar, (byte) 23), r5r.S0, ido.T0, (o8n) null, new m4r(kp5Var, (byte) 10), 8);
        this.e = n3o1.q(this).a(new sc0(oj80Var, (byte) 0), new sc0(oj80Var, (byte) 1));
        j2i j2iVar = new j2i(-549965988, new t20(this, st60Var, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(rg51 rg51Var) {
        this.a = (byte) 14;
        this.c = rg51Var;
        this.d = new rey0(new okg(this, (byte) 4));
        this.e = n3o1.q(this).a(r0f.b1, r0f.c1);
        j2i j2iVar = kdi.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(t2j0 t2j0Var) {
        this.a = (byte) 7;
        this.c = t2j0Var;
        this.d = k1o1.p();
        this.e = n3o1.q(this).a(k63.d1, k63.e1);
        j2i j2iVar = new j2i(1574475761, new i43(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(q8n q8nVar, lzn0 lzn0Var) {
        this.a = (byte) 9;
        this.c = lzn0Var;
        this.d = h7w.B(db8.Z, q8nVar, (iu30) null, new j2i(238915700, new v72(this, (byte) 26), true), 4);
        this.e = n3o1.q(this).a(d27.c1, d27.d1);
        j2i j2iVar = y7i.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(luj lujVar) {
        this.a = (byte) 5;
        this.c = lujVar;
        this.d = k1o1.p();
        this.e = new eih1();
        j2i j2iVar = new j2i(-352077151, new i43(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(tdo tdoVar) {
        this.a = (byte) 25;
        this.c = tdoVar;
        this.d = k1o1.u(new td1(this, (lnm) null, (byte) 2));
        this.e = n3o1.q(this).a(riu.S0, riu.T0);
        j2i j2iVar = eki.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(ys9 ys9Var) {
        this.a = (byte) 11;
        this.c = ys9Var;
        this.d = z0o1.k(ys9Var.k, tj8.U0, new uv8(this, (byte) 8), 4);
        this.e = n3o1.q(this).a(jb8.b1, jb8.c1);
        j2i j2iVar = p8i.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(urk0 urk0Var) {
        this.a = (byte) 26;
        this.c = urk0Var;
        this.d = new ybo(n3o1.q(this).a(new k9s(this, (byte) 19), lnv.S0), (byte) 2);
        this.e = k1o1.p();
        j2i j2iVar = kli.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(ve20 ve20Var) {
        this.a = (byte) 29;
        this.c = ve20Var;
        this.d = x3p1.n(new ie20(this, (byte) 0), vd20.c, wo10.Q0, (o8n) null, new ie20(this, (byte) 1), 8);
        this.e = n3o1.q(this).a(je20.b, je20.c);
        j2i j2iVar = woi.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(xf60 xf60Var, u6x u6xVar) {
        this.a = (byte) 12;
        this.c = xf60Var;
        this.d = u6xVar;
        this.b = new rey0(new dwd(this, (byte) 23));
        this.e = new eih1();
    }

    public br0(rzo rzoVar, kko kkoVar, epb1 epb1Var) {
        this.a = (byte) 1;
        this.c = rzoVar;
        this.d = f2p1.q(new s20(epb1Var, (byte) 0), new bom1(this, (byte) 9), (iu30) null, 12);
        this.e = new eih1();
        j2i j2iVar = new j2i(1431114046, new t20(kkoVar, this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(g5l0 g5l0Var) {
        this.a = (byte) 23;
        this.c = g5l0Var;
        this.d = new rey0(zrj.e1);
        this.e = n3o1.q(this).a(new k9s(this, (byte) 2), njs.b1);
        j2i j2iVar = sii.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(zhh1 zhh1Var, Activity activity) {
        this.a = (byte) 10;
        this.c = zhh1Var;
        this.d = new rey0(new wf(this, activity, (byte) 29));
        this.e = n3o1.q(this).a(jb8.h, jb8.t);
        j2i j2iVar = b8i.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(Observable observable, Resources resources) {
        this.a = (byte) 2;
        this.c = resources;
        this.d = d4o1.g(observable.toFlowable(BackpressureStrategy.d), di0.X, new ab(this, (byte) 16), (iu30) null, 24);
        this.e = new eih1();
        j2i j2iVar = j3i.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(aas aasVar) {
        this.a = (byte) 4;
        this.c = aasVar;
        this.d = k1o1.u(new r20(this, (lnm) null, (byte) 6));
        this.e = n3o1.q(this).a(mm1.R0, mm1.S0);
        j2i j2iVar = w4i.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(gw70 gw70Var, lzn0 lzn0Var) {
        this.a = (byte) 15;
        this.c = gw70Var;
        this.d = new rey0(new q8e(lzn0Var, (byte) 1));
        this.e = new i7h1(c9k.Y0, c9k.Z0);
        j2i j2iVar = new j2i(-1739505825, new rxg(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(evm1 evm1Var) {
        this.a = (byte) 20;
        this.c = evm1Var;
        this.d = k1o1.p();
        this.e = new eih1();
        j2i j2iVar = new j2i(-1906207206, new i6r(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(tbr0 tbr0Var) {
        this.a = (byte) 21;
        this.c = tbr0Var;
        this.d = k1o1.u(new vd2(this, (lnm) null, (byte) 14));
        this.e = n3o1.q(this).a(njs.d, njs.e);
        j2i j2iVar = idj.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(fvq fvqVar) {
        this.a = (byte) 22;
        this.c = fvqVar;
        this.d = k1o1.p();
        this.e = n3o1.q(this).a(njs.X0, njs.Y0);
        j2i j2iVar = new j2i(-1679843097, new i6r(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(Function0 function0, Function0 function1) {
        this.a = (byte) 6;
        this.c = function0;
        this.d = function1;
        j2i j2iVar = e6i.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.e = new rey0(new ub3(this, (byte) 5));
    }

    public br0(j720 j720Var) {
        this.a = (byte) 28;
        this.c = j720Var;
        this.d = x3p1.m(j720Var.getTitle(), zs10.Y0, wo10.Y, (o8n) null, new gi00(this, (byte) 15), 8);
        this.e = n3o1.q(this).a(jq00.a1, jq00.b1);
        j2i j2iVar = new j2i(-1592526201, new yhy(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(ksk0 ksk0Var) {
        this.a = (byte) 8;
        this.c = ksk0Var;
        this.d = k1o1.p();
        this.e = n3o1.q(this).a(new v72(this, (byte) 23), d27.g);
        j2i j2iVar = j7i.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(sks0 sks0Var) {
        this.a = (byte) 13;
        this.c = sks0Var;
        this.d = k1o1.p();
        this.e = new eih1();
        j2i j2iVar = new j2i(-2129522896, new rxg(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(sb7 sb7Var) {
        this.a = (byte) 3;
        this.c = sb7Var;
        this.d = new rey0(new o2(this, (byte) 17));
        j2i j2iVar = i4i.c;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.e = n3o1.r(this).c(fp0.V0, fp0.W0);
    }

    public br0(ft30 ft30Var) {
        this.a = (byte) 19;
        this.c = ft30Var;
        this.d = new rey0(new b1s((Object) this, (byte) 14));
        this.e = n3o1.r(this).c(new kds(this, (byte) 0), new kds(this, (byte) 1));
        j2i j2iVar = w4j.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(d0r d0rVar, Context context, String str, uw0 uw0Var) {
        this.a = (byte) 24;
        this.c = context;
        this.d = x3p1.m(new vvu(d3p1.F(d0rVar, w3p1.o(new l4r(pwc0.e, 1, juu.e1, new j4r(juu.a1), wvu.b), juu.b1), str), (byte) 0), juu.V0, qlt.X0, (o8n) null, new wrs(this, uw0Var, (byte) 16), 8);
        this.e = n3o1.r(this).c(riu.O0, riu.Q0);
        j2i j2iVar = new j2i(629920431, new ent(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public br0(mr20 mr20Var, mr20 mr20Var2, pxc pxcVar, gw70 gw70Var, boolean z, xj0 xj0Var, Function0 function0) {
        this.a = (byte) 0;
        this.c = gio1.b(Boolean.valueOf(z));
        this.d = x3p1.n(new d4(mr20Var, this, (byte) 7), di0.P0, e3.S0, (o8n) null, new db(xj0Var, this, pxcVar, mr20Var2, (byte) 2), 8);
        j2i j2iVar = new j2i(-1788337552, new t20(gw70Var, function0, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.e = n3o1.q(this).a(fp0.d, fp0.e);
    }
}
