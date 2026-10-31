package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.spotify.encoreconsumermobile.elements.metadatarow.MetadataRow;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dx0 implements wpw {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    /* JADX WARN: Code duplicated, block: B:20:0x0099  */
    /* JADX WARN: Code duplicated, block: B:8:0x0039  */
    public dx0(rl1 rl1Var, ymd0 ymd0Var, qmj0 qmj0Var, c1v0 c1v0Var, mr20 mr20Var) {
        fai0 fai0VarQ;
        fai0 fai0VarQ2;
        hy50 hy50Var;
        Boolean bool;
        this.a = (byte) 10;
        vll vllVar = vll.f;
        ymd0 ymd0Var2 = (ymd0) rl1Var.e;
        ymd0 ymd0Var3 = (ymd0) rl1Var.d;
        this.d = qmj0Var;
        fai0 fai0Var = new fai0();
        boolean z = rl1Var.b;
        if (z) {
            if (ymd0Var2 != null) {
                fai0VarQ = w6d1.q(ymd0Var2, new v7l(rl1Var, (byte) 6));
            } else {
                fai0VarQ = null;
            }
        } else if (ymd0Var3 != null) {
            fai0VarQ = w6d1.q(ymd0Var3, vllVar);
        } else {
            fai0VarQ = null;
        }
        if (fai0VarQ != null) {
            fai0Var.n(fai0VarQ, new df3(fai0Var, (byte) 11));
        }
        if (ymd0Var != null) {
            fai0Var.n(ymd0Var, new df3(fai0Var, (byte) 12));
        }
        y8n y8nVarJ = t5p1.j(qmj0Var.b, 3);
        fai0Var.n(y8nVarJ, new jp5(fai0Var, y8nVarJ, (byte) 7));
        fai0Var.n(t5p1.j(c1v0Var, 3), new df3(fai0Var, (byte) 13));
        fai0Var.n(t5p1.j(mr20Var, 3), new df3(fai0Var, (byte) 14));
        if (z) {
            if (ymd0Var2 != null) {
                fai0VarQ2 = w6d1.q(ymd0Var2, new v7l(rl1Var, (byte) 6));
            } else {
                fai0VarQ2 = null;
            }
        } else if (ymd0Var3 != null) {
            fai0VarQ2 = w6d1.q(ymd0Var3, vllVar);
        } else {
            fai0VarQ2 = null;
        }
        boolean zBooleanValue = (fai0VarQ2 == null || (bool = (Boolean) fai0VarQ2.e()) == null) ? true : bool.booleanValue();
        hy50 hy50Var2 = (ymd0Var == null || (hy50Var = (hy50) ymd0Var.e()) == null) ? gy50.a : hy50Var;
        Object objE = y8nVarJ.e();
        omj0 omj0Var = objE instanceof omj0 ? (omj0) objE : null;
        fai0Var.m(new mmj0(zBooleanValue, hy50Var2, omj0Var != null ? omj0Var.a : null, false, false));
        r7j0 r7j0Var = new r7j0(this, (byte) 8);
        yih0 yih0Var = new yih0(this, (byte) 19);
        bhh1 bhh1Var = igu.b;
        qtr qtrVar = new qtr();
        qtrVar.b(new xia(5, (lnm) null, (byte) 4));
        this.e = new poy0(new w8z(fai0Var, (byte) 3), r7j0Var, yih0Var, qtrVar, false, bhh1Var);
        this.c = new eih1();
        this.b = jch0.j(new pah0(this, (byte) 11));
    }

    public static final /* synthetic */ t740 e(dx0 dx0Var) {
        return (t740) dx0Var.d;
    }

    public static void f(MetadataRow metadataRow, kkj0 kkj0Var, boolean z) {
        ViewGroup viewGroup;
        if (kkj0Var instanceof jkj0) {
            View view = ((jkj0) kkj0Var).a;
            ViewParent parent = view.getParent();
            viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            MetadataRow.y(metadataRow, view, z);
            return;
        }
        if (!(kkj0Var instanceof ikj0)) {
            eg.o();
            return;
        }
        ikj0 ikj0Var = (ikj0) kkj0Var;
        qtw qtwVar = ikj0Var.a;
        tka0 tka0Var = dtw.C;
        View view2 = mhc.b(metadataRow.getContext(), metadataRow, qtwVar, ikj0Var.b, (ipb1) null, 112).w;
        ViewParent parent2 = view2.getParent();
        viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.removeView(view2);
        }
        MetadataRow.y(metadataRow, view2, z);
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return (eih1) obj2;
            case 1:
                return (eih1) obj2;
            case 2:
                return (ia00) obj;
            case 3:
                return (eih1) obj2;
            case 4:
                return (ia00) obj2;
            case 5:
                return (ia00) this.e;
            case 6:
                return (ia00) obj2;
            case 7:
                return (eih1) obj2;
            case 8:
                return (eih1) obj2;
            case 9:
                return (eih1) obj2;
            case 10:
                return (eih1) obj2;
            case 11:
                return (u7h1) obj;
            case 12:
                return (ia00) obj;
            case 13:
                return (ia00) obj2;
            case 14:
                return new nw2(n3o1.q(this).a(new wh((n6r0) obj, (lik1) obj2, (byte) 25), gou0.R0));
            case 15:
                return new ghz(this, (byte) 6);
            case 16:
                return new ghz(this, (byte) 7);
            case 17:
                return (ia00) obj2;
            case 18:
                return (ia00) obj2;
            case 19:
                return (ia00) obj2;
            case 20:
                return (ia00) obj2;
            case 21:
                return (eih1) obj2;
            case 22:
                return (eih1) obj2;
            default:
                return (eih1) obj2;
        }
    }

    public final rsw c() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (kjv) obj2;
            case 1:
                return (kjv) obj2;
            case 2:
                return (nsw) obj;
            case 3:
                return (nsw) obj2;
            case 4:
                return (kjv) obj2;
            case 5:
                return (eyn) obj;
            case 6:
                return (nsw) this.e;
            case 7:
                return (nsw) obj2;
            case 8:
                return (nsw) obj2;
            case 9:
                return (kjv) obj2;
            case 10:
                return (nsw) obj2;
            case 11:
                return (nsw) obj;
            case 12:
                return (nsw) obj;
            case 13:
                return (kjv) obj2;
            case 14:
                jqd0 jqd0Var = (jqd0) this.d;
                jqd0Var.getClass();
                return lnn1.g(new xbv0(jqd0Var, (byte) 0), o5v0.U0, new xbv0(jqd0Var, (byte) 1));
            case 15:
                return (nsw) obj;
            case 16:
                return (nsw) obj;
            case 17:
                return (kjv) obj2;
            case 18:
                return (kjv) obj2;
            case 19:
                return (kjv) obj2;
            case 20:
                return (nsw) obj2;
            case 21:
                return (nsw) obj2;
            case 22:
                return (nsw) obj2;
            default:
                return (nsw) obj2;
        }
    }

    public void g(htv0 htv0Var, int i, tv80 tv80Var) {
        hp20 hp20Var = (hp20) this.d;
        String str = htv0Var != null ? htv0Var.b.b : null;
        qp20 qp20Var = htv0Var != null ? htv0Var.d : null;
        if (qp20Var != null) {
            hp20Var.b(i, qp20Var, tv80Var);
        } else {
            if (str == null || str.length() == 0) {
                return;
            }
            hp20Var.a(htv0Var.b);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.b;
        byte b2 = 1;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return (rey0) obj2;
            case 1:
                return (poy0) obj2;
            case 2:
                return (js20) obj2;
            case 3:
                return (rey0) obj2;
            case 4:
                return (rey0) obj2;
            case 5:
                return (poy0) obj;
            case 6:
                return (e7m0) obj;
            case 7:
                return (poy0) obj2;
            case 8:
                return (rey0) obj2;
            case 9:
                return (rey0) obj2;
            case 10:
                return (poy0) obj2;
            case 11:
                return (poy0) obj2;
            case 12:
                return (poy0) obj2;
            case 13:
                return (rey0) obj2;
            case 14:
                tzr0 tzr0Var = (tzr0) obj2;
                tzr0Var.getClass();
                tbv0 tbv0Var = new tbv0(new icv0(""), "");
                yeu0 yeu0Var = (yeu0) tzr0Var.b;
                st60 st60Var = (st60) tzr0Var.d;
                lik1 lik1Var = (lik1) tzr0Var.c;
                RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
                subtypeEffectHandlerBuilderC.g(kbv0.class, new wbv0(yeu0Var, (byte) 0));
                subtypeEffectHandlerBuilderC.c(jbv0.class, new z0u0((Object) st60Var, (Object) lik1Var, (byte) 3));
                subtypeEffectHandlerBuilderC.g(lbv0.class, new wbv0(yeu0Var, b2));
                return sbl.z(tbv0Var, t7p0.i, RxConnectables.a(subtypeEffectHandlerBuilderC.h()), vbv0.b, new n5u0(tzr0Var, (byte) 19));
            case 15:
                return (rey0) obj2;
            case 16:
                return new fm10(b2);
            case 17:
                return (poy0) obj2;
            case 18:
                return (poy0) obj2;
            case 19:
                return (poy0) obj2;
            case 20:
                return (poy0) obj2;
            case 21:
                return (rey0) obj2;
            case 22:
                return (e7m0) obj2;
            default:
                return (poy0) obj2;
        }
    }

    public ArrayList h(rmj0 rmj0Var, boolean z, boolean z2, boolean z3, boolean z4, afv0 afv0Var) {
        ArrayList arrayList = new ArrayList();
        jkj0 jkj0Var = rmj0Var.i;
        ArrayList arrayList2 = rmj0Var.d;
        if (!z3) {
            jkj0Var = null;
        }
        if (jkj0Var != null) {
            arrayList.add(jkj0Var);
        }
        if (afv0Var != null) {
            arrayList.add(new ikj0(((qmj0) this.d).a, afv0Var));
        }
        kkj0 kkj0Var = rmj0Var.a;
        if (kkj0Var != null) {
            arrayList.add(kkj0Var);
        }
        kkj0 kkj0Var2 = rmj0Var.k;
        if (kkj0Var2 != null) {
            if (!z4) {
                kkj0Var2 = null;
            }
            if (kkj0Var2 != null) {
                arrayList.add(kkj0Var2);
            }
        }
        kkj0 kkj0Var3 = rmj0Var.c;
        if (kkj0Var3 != null) {
            if (!z2) {
                kkj0Var3 = null;
            }
            if (kkj0Var3 != null) {
                arrayList.add(kkj0Var3);
            }
        }
        kkj0 kkj0Var4 = rmj0Var.b;
        if (kkj0Var4 != null) {
            arrayList.add(kkj0Var4);
        }
        if (afv0Var == null) {
            arrayList.addAll(arrayList2);
        } else if (!arrayList2.isEmpty()) {
            arrayList.add(o7h.q0(arrayList2));
        }
        kkj0 kkj0Var5 = rmj0Var.e;
        if (kkj0Var5 != null) {
            if (!z) {
                kkj0Var5 = null;
            }
            if (kkj0Var5 != null) {
                arrayList.add(kkj0Var5);
            }
        }
        kkj0 kkj0Var6 = rmj0Var.f;
        if (kkj0Var6 != null) {
            kkj0 kkj0Var7 = z ? kkj0Var6 : null;
            if (kkj0Var7 != null) {
                arrayList.add(kkj0Var7);
            }
        }
        kkj0 kkj0Var8 = rmj0Var.g;
        if (kkj0Var8 != null) {
            arrayList.add(kkj0Var8);
        }
        kkj0 kkj0Var9 = rmj0Var.h;
        if (kkj0Var9 != null) {
            arrayList.add(kkj0Var9);
        }
        return arrayList;
    }

    public dx0(bs0 bs0Var, ze21 ze21Var, byte b) {
        this.a = (byte) 19;
        this.d = ze21Var;
        this.e = (poy0) bs0Var.f;
        this.b = lnn1.h(v9z0.U0, v9z0.V0, new fbz0(this, (byte) 3));
        this.c = bs0Var.g;
    }

    public dx0(dx0 dx0Var, ze21 ze21Var) {
        this.a = (byte) 17;
        this.d = ze21Var;
        this.e = (poy0) dx0Var.e;
        this.b = lnn1.h(v9z0.d, v9z0.e, new fbz0(this, (byte) 0));
        this.c = (ia00) dx0Var.c;
    }

    public dx0(yfx yfxVar) {
        this.a = (byte) 9;
        this.d = yfxVar;
        this.e = ila0.D();
        this.c = new eih1();
        this.b = lnn1.h(v160.Z, v160.N0, new zi50(this, (byte) 10));
    }

    public dx0(zfx zfxVar) {
        this.a = (byte) 4;
        this.d = zfxVar;
        this.e = new rey0(o40.T0);
        this.c = n3o1.q(this).a(oy5.V0, oy5.Y0);
        this.b = lnn1.h(cv6.R0, cv6.T0, new rr6(this, (byte) 2));
    }

    public dx0(zfx zfxVar, byte b) {
        this.a = (byte) 13;
        this.d = zfxVar;
        this.e = new rey0(mgn0.O0);
        this.c = n3o1.q(this).a(gou0.f, gou0.h);
        this.b = lnn1.h(lqu0.Z, lqu0.P0, new n5u0(this, (byte) 10));
    }

    public dx0(String str) {
        this.a = (byte) 8;
        this.d = str;
        this.e = ila0.D();
        this.c = new eih1();
        this.b = jch0.j(new wx00(this, (byte) 10));
    }

    public dx0(jqd0 jqd0Var, tzr0 tzr0Var, n6r0 n6r0Var, lik1 lik1Var) {
        this.a = (byte) 14;
        this.d = jqd0Var;
        this.e = tzr0Var;
        this.b = n6r0Var;
        this.c = lik1Var;
    }

    public dx0(tk21 tk21Var) {
        this.a = (byte) 21;
        this.d = tk21Var;
        this.e = new rey0(new lw11(this, (byte) 11));
        this.c = new eih1();
        this.b = jch0.j(ve21.h);
    }

    public dx0(FlowableMap flowableMap, lkr lkrVar) {
        this.a = (byte) 1;
        this.d = lkrVar;
        this.e = y3o1.Y(flowableMap, gx0.f, e3.b1, (iu30) null, 24);
        this.b = lnn1.h(gx0.h, gx0.i, new j2(this, (byte) 24));
        this.c = new eih1();
    }

    public dx0(f06 f06Var, z04 z04Var, lik1 lik1Var, y04 y04Var, int i) {
        this.a = (byte) 6;
        this.d = lik1Var;
        this.e = jch0.j(new cml(y04Var, (byte) 25));
        this.b = sbl.z(new u04(w04.a), n4.i, new ku1(z04Var, (byte) 3), p83.c1, new ym(f06Var, i, (byte) 2));
        this.c = n3o1.q(this).a(new cml(this, (byte) 24), zho.Z);
    }

    public dx0(ymd0 ymd0Var, ptj ptjVar) {
        this.a = (byte) 7;
        this.d = ptjVar;
        utt uttVar = new utt(this, (byte) 13);
        bhh1 bhh1Var = igu.b;
        this.e = new poy0(new w8z(ymd0Var, (byte) 4), new j2d0(uttVar, ymd0Var, (byte) 6), uttVar, new qtr(), false, bhh1Var);
        this.c = new eih1();
        this.b = jch0.j(riu.a1);
    }

    public dx0(qzh qzhVar) {
        this.a = (byte) 0;
        this.d = qzhVar;
        this.e = ila0.D();
        this.b = lnn1.h(di0.a1, di0.b1, new j2(this, (byte) 22));
        this.c = new eih1();
    }

    public dx0(op20 op20Var, yxk0 yxk0Var) {
        this.a = (byte) 12;
        this.d = yxk0Var;
        this.e = c2p1.n(new onp0(op20Var, (byte) 0), new onp0(op20Var, (byte) 1), ofo0.W0, new onp0(op20Var, (byte) 2), 8);
        this.b = n3o1.q(this).a(new x3o0(this, (byte) 8), rmp0.c);
        this.c = jch0.j(new x3o0(op20Var, (byte) 9));
    }

    public dx0(pp ppVar, urk0 urk0Var, f8b f8bVar, g7h g7hVar, ccc0 ccc0Var, yqg yqgVar, hz5 hz5Var, di4 di4Var, iu30 iu30Var) {
        this.a = (byte) 5;
        this.d = di4Var;
        this.e = n3o1.q(this).a(new z63(urk0Var, (byte) 3), oy5.Z0);
        this.b = y3o1.X(new rx6(f8bVar, di4Var, g7hVar), cv6.V0, ad5.b1, new xg6(iu30Var, ccc0Var, (byte) 18), 8);
        this.c = new eyn(lnn1.h(cv6.S0, new vf3(yqgVar, (byte) 2), new xg6(ppVar, this, (byte) 17)), new rr6(this, (byte) 4), hz5Var);
    }

    public dx0(lb lbVar) {
        this.a = (byte) 3;
        this.d = lbVar;
        this.e = ila0.D();
        this.c = new eih1();
        this.b = jch0.j(new v72(this, (byte) 7));
    }

    public dx0(FlowableMap flowableMap, FlowableTransformer flowableTransformer, FlowableTransformer flowableTransformer2, unr unrVar, aor aorVar) {
        this.a = (byte) 23;
        this.d = aorVar;
        this.e = y3o1.Y(Flowable.g(flowableMap, flowableMap.j(flowableTransformer).J(b4x0.S0), flowableMap.j(flowableTransformer2).J(c4x0.T0), yoi1.h(unrVar.c, o6x.a), e4x0.S0), bpf1.P0, ggf1.g, (iu30) null, 24);
        this.b = jch0.j(new nsb1(this, (byte) 27));
        this.c = new eih1();
    }

    public dx0(fd3 fd3Var, mr20 mr20Var, t740 t740Var, q8n q8nVar) {
        this.a = (byte) 2;
        this.d = t740Var;
        this.e = a4p1.h(new cc2(fd3Var, mr20Var, (byte) 10), ra3.Z0, p83.V0, q8nVar, new cc2(this, fd3Var, (byte) 11));
        this.b = n3o1.q(this).a(k63.Y, k63.Z);
        this.c = jch0.j(k63.N0);
    }

    public dx0(dpq dpqVar, gpq gpqVar, by51 by51Var, yce1 yce1Var) {
        this.a = (byte) 22;
        this.d = dpqVar;
        z6x z6xVar = z6x.a;
        ly51 ly51Var = new ly51("", 0, 0, z6xVar, z6xVar, w7x.a, 0, 0, 0);
        t7p0 t7p0Var = t7p0.z;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        ay51 ay51Var = new ay51(by51Var, (byte) 0);
        Scheduler scheduler = by51Var.a;
        subtypeEffectHandlerBuilderC.d(fy51.class, ay51Var, scheduler);
        subtypeEffectHandlerBuilderC.d(gy51.class, new ay51(by51Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.g(ey51.class, new yx11(by51Var, (byte) 10));
        this.e = sbl.z(ly51Var, t7p0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()), new my51(by51Var, this, (byte) 0), new ny51(yce1Var, by51Var, this, (byte) 0));
        this.c = new eih1();
        this.b = jch0.j(new juy0(this, gpqVar, (byte) 4));
    }

    public dx0(zfx zfxVar, ryp rypVar, yxk0 yxk0Var, m4c m4cVar) {
        this.a = (byte) 16;
        this.d = zfxVar;
        this.e = rypVar;
        this.b = yxk0Var;
        this.c = jch0.j(new ixt0(this, (byte) 7));
    }

    public dx0(bs0 bs0Var, ze21 ze21Var) {
        this.a = (byte) 18;
        this.d = ze21Var;
        this.e = (poy0) bs0Var.f;
        this.b = lnn1.h(v9z0.S0, v9z0.T0, new fbz0(this, (byte) 2));
        this.c = bs0Var.g;
    }

    public dx0(Flowable flowable, lzn0 lzn0Var) {
        this.a = (byte) 11;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new q5m0(new h0p0(yon1.Y2().c, nik1.m1.a));
        this.e = y3o1.Y(flowable, pzo0.d, new afm0((Object) this, (byte) 23), new qc30(lzn0Var, (byte) 2), 8);
        this.b = new u7h1(new nso0(this, (byte) 1), new ac8(this, (byte) 20));
        this.c = jch0.j(n3o0.X0);
    }

    public dx0(Flowable flowable, xbu0 xbu0Var) {
        this.a = (byte) 20;
        this.d = xbu0Var;
        this.e = y3o1.Y(flowable.s(wbx0.g), ma21.P0, ibi0.Z0, new zw11(this, (byte) 7), 8);
        this.b = jch0.j(ve21.c);
        this.c = n3o1.q(this).a(ok11.e1, ve21.b);
    }

    public dx0(hp20 hp20Var, yxk0 yxk0Var, m4c m4cVar) {
        this.a = (byte) 15;
        this.d = hp20Var;
        this.b = yxk0Var;
        this.e = new rey0(new dvt0(this, (byte) 9));
        this.c = jch0.j(new ixt0(this, (byte) 6));
    }
}
