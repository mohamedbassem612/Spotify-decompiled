package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.coroutines.a;
import com.spotify.player.model.PlayOrigin;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.CountryRestrictedException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t8v0 implements wu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u8v0 b;

    public /* synthetic */ t8v0(u8v0 u8v0Var, byte b) {
        this.a = b;
        this.b = u8v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x061f  */
    /* JADX WARN: Code duplicated, block: B:40:0x011d A[PHI: r4
      0x011d: PHI (r4v49 int) = (r4v48 int), (r4v48 int), (r4v50 int) binds: [B:42:0x0120, B:44:0x0126, B:39:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x01a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v74, types: [java.util.ArrayList] */
    public final Object apply(Object obj) {
        int i;
        int i2;
        int i3;
        z6x z6xVar;
        List list;
        boolean z;
        boolean z2;
        d281 d281Var;
        sp11 tp11Var;
        ?? SingletonList;
        sp11 sp11Var;
        String string;
        byte b = this.a;
        u8v0 u8v0Var = this.b;
        switch (b) {
            case 0:
                wdm wdmVar = u8v0Var.f;
                h881 h881Var = (h881) u8v0Var.g.invoke(((dtq0) obj).t.a);
                l8h1 l8h1Var = (l8h1) wdmVar.X;
                String str = h881Var.d;
                String str2 = h881Var.a;
                Set set = s4b1.f;
                String strZ = uic.z((String) wdmVar.h).z();
                iam iamVar = h881Var.m;
                xkk1 xkk1Var = h881Var.n;
                zoy0 zoy0Var = h881Var.o;
                hll hllVar = h881Var.f8p;
                xlw0 xlw0Var = h881Var.q;
                w281 w281Var = h881Var.l;
                iyl iylVar = new iyl(strZ, h881Var.r, iamVar, xkk1Var, zoy0Var, hllVar, xlw0Var, w281Var, h881Var.k);
                zf30 zf30Var = (zf30) wdmVar.b;
                Bundle bundle = zf30Var.f;
                String str3 = "Podcast";
                if (bundle == null || (string = bundle.getString("currentConfiguration")) == null) {
                    i = 0;
                } else {
                    if (string == null) {
                        bhn0.i("Name is null");
                    } else if (string.equals("Audiobook")) {
                        i = 1;
                    } else if (string.equals("AudiobookPreRelease")) {
                        i = 2;
                    } else if (string.equals("Podcast")) {
                        i = 3;
                    } else {
                        hhg1.n("No enum constant com.spotify.showpage.pageidentifiers.ShowPageConfiguration.".concat(string));
                    }
                    i = 0;
                }
                int iC = l1d.C(iamVar.a);
                if (iC == 5) {
                    i2 = 1;
                    i3 = 3;
                } else if (iC != 7) {
                    i3 = 3;
                    i2 = 1;
                } else {
                    if (w281Var != null) {
                        i2 = 1;
                        if (w281Var.c) {
                            i3 = i2;
                        }
                    } else {
                        i2 = 1;
                    }
                    if (zoy0Var == null || l4o1.R(zoy0Var) != i2) {
                        i3 = i2;
                    } else {
                        i3 = 2;
                    }
                }
                if (i == 0) {
                    i = i3;
                }
                Bundle bundle2 = zf30Var.f;
                if (bundle2 != null) {
                    if (i == i2) {
                        str3 = "Audiobook";
                    } else if (i == 2) {
                        str3 = "AudiobookPreRelease";
                    } else if (i != 3) {
                        throw null;
                    }
                    bundle2.putString("currentConfiguration", str3);
                }
                rzq rzqVar = (rzq) wdmVar.Z;
                int iC2 = l1d.C(i);
                z6x z6xVar2 = z6x.a;
                if (iC2 == 0) {
                    w281 w281Var2 = h881Var.l;
                    fdc fdcVar = (fdc) wdmVar.g;
                    boolean z3 = w281Var2 != null && w281Var2.c;
                    if (!ihc1.h0(String.valueOf(fdcVar.U().a), "refresh", false)) {
                        Intent intent = (Intent) ((kly0) fdcVar.d).get();
                        String dataString = intent.getDataString();
                        if (((dataString == null || dataString.length() == 0 || !"android.intent.action.VIEW".equals(intent.getAction())) ? false : fdcVar.U().t()) && !fdcVar.b && !z3) {
                            Uri uri = fdcVar.U().a;
                            if (uri == null) {
                                z2 = false;
                                z = true;
                            } else {
                                z = true;
                                z2 = !uri.getBooleanQueryParameter("bounce", true);
                            }
                            if (!z2) {
                                fdcVar.b = z;
                                CompositeDisposable compositeDisposable = (CompositeDisposable) fdcVar.e;
                                vi11 vi11Var = (vi11) fdcVar.c;
                                compositeDisposable.b(((g341) vi11Var.b).b((Uri) ((idd1) fdcVar.f).getValue()).subscribeOn((Scheduler) vi11Var.d).observeOn((Scheduler) vi11Var.c).subscribe(new lyw0(vi11Var, (byte) 28), mux0.e1));
                            }
                        }
                    }
                    tac0 tac0Var = zf30Var.s1;
                    tac0Var.a(new it0(wdmVar, tac0Var, (byte) 9));
                    Bundle bundle3 = zf30Var.f;
                    ozc0 ozc0Var = bundle3 == null ? null : (ozc0) jhc1.t(bundle3, "extra_list_playback_context", ozc0.class);
                    btr btrVar = (btr) wdmVar.d;
                    Long lZ = l4o1.z(h881Var.o, new h94());
                    boolean z4 = h881Var.i;
                    jo70 jo70Var = h881Var.r;
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    p6r0 p6r0VarG1 = yon1.G1("PODCAST_SHOW_AUDIOBOOK", "podcast/show/audiobook", 1493, "podcast");
                    lik1 lik1Var = (lik1) wdmVar.f;
                    String str4 = (String) wdmVar.i;
                    rbo0 rbo0Var = (rbo0) wdmVar.t;
                    PlayOrigin playOrigin = (PlayOrigin) wdmVar.Y;
                    eto etoVar = (eto) new vd6(zf30Var, jo70Var, str2, p6r0VarG1, lik1Var, str4, playOrigin, rzqVar, ozc0Var, (byte) 4).invoke((dto) btrVar.b.b);
                    f0a f0aVar = new f0a(etoVar);
                    Context context = etoVar.a;
                    c8o.l(context);
                    ycm ycmVar = etoVar.C;
                    c8o.l(ycmVar);
                    zet0 zet0Var = etoVar.v;
                    c8o.l(zet0Var);
                    vyo vyoVar = (vyo) ((jly0) f0aVar.e).get();
                    zwp zwpVar = etoVar.w;
                    c8o.l(zwpVar);
                    t8u0 t8u0Var = etoVar.x;
                    c8o.l(t8u0Var);
                    iac0 iac0Var = etoVar.l0;
                    c8o.l(iac0Var);
                    b0d0 b0d0Var = etoVar.y;
                    c8o.l(b0d0Var);
                    d0r d0rVar = etoVar.q0;
                    c8o.l(d0rVar);
                    ynb0 ynb0VarA = xqu.a((d7p) f0aVar.f);
                    ozc0 ozc0Var2 = etoVar.C0;
                    cp31 cp31Var = new cp31();
                    cp31Var.a = zwpVar;
                    cp31Var.b = b0d0Var;
                    cp31Var.c = d0rVar;
                    cp31Var.d = ynb0VarA;
                    cp31Var.e = ozc0Var2;
                    cp31Var.f = new idd1(new z77(t8u0Var, iac0Var, (byte) 14));
                    boolean z5 = etoVar.B0;
                    boolean z6 = etoVar.x0;
                    hz5 hz5Var = new hz5((byte) 2);
                    lzn0 lzn0Var = etoVar.Z;
                    c8o.l(lzn0Var);
                    na9 na9Var = new na9(lzn0Var, (byte) 2);
                    ncq ncqVar = etoVar.X;
                    c8o.l(ncqVar);
                    se80 se80VarA = ncqVar.a(iac0Var);
                    p6r0 p6r0Var = etoVar.n0;
                    String str5 = etoVar.r0;
                    c8o.l(str5);
                    lik1 lik1Var2 = etoVar.o0;
                    c8o.l(lik1Var2);
                    pob pobVar = etoVar.h;
                    ocq ocqVar = etoVar.f;
                    c8o.l(ocqVar);
                    pcq pcqVar = etoVar.g;
                    c8o.l(pcqVar);
                    inb inbVar = etoVar.s;
                    c8o.l(inbVar);
                    s7p s7pVar = (s7p) ((jly0) f0aVar.g).get();
                    boolean z7 = etoVar.H0;
                    x4e x4eVar = etoVar.i;
                    c8o.l(x4eVar);
                    qcq qcqVar = etoVar.j;
                    c8o.l(qcqVar);
                    aap aapVar = (aap) ((jly0) f0aVar.h).get();
                    rk11 rk11Var = etoVar.o;
                    c8o.l(rk11Var);
                    drj0 drj0Var = new drj0(d0rVar, etoVar.s0, (byte) 3);
                    wcq wcqVar = etoVar.Y;
                    c8o.l(wcqVar);
                    uu00 uu00Var = etoVar.f4p;
                    c8o.l(uu00Var);
                    boolean z8 = etoVar.y0;
                    boolean z9 = etoVar.v0;
                    boolean z10 = etoVar.w0;
                    boolean z11 = etoVar.I0;
                    rsz0 rsz0Var = etoVar.V;
                    c8o.l(rsz0Var);
                    bw2 bw2Var = etoVar.P;
                    c8o.l(bw2Var);
                    e4 e4Var = new e4(uu00Var, z8, z9, z10, z11, rsz0Var, bw2Var, d0rVar, etoVar.W);
                    bap bapVar = (bap) ((jly0) f0aVar.t).get();
                    cap capVar = (cap) ((jly0) f0aVar.X).get();
                    est0 est0Var = etoVar.u;
                    r5h r5hVar = etoVar.q;
                    c8o.l(r5hVar);
                    Scheduler scheduler = etoVar.u0;
                    c8o.l(scheduler);
                    hur hurVar = new hur(r5hVar, scheduler, (byte) 11);
                    ucq ucqVar = etoVar.E;
                    c8o.l(ucqVar);
                    boolean z12 = etoVar.t0;
                    tcq tcqVar = etoVar.t;
                    c8o.l(tcqVar);
                    d7p d7pVar = (d7p) f0aVar.Y;
                    d7p d7pVar2 = (d7p) f0aVar.Z;
                    i8h1 i8h1Var = etoVar.c;
                    c8o.l(i8h1Var);
                    asn asnVar = new asn(d7pVar, d7pVar2, i8h1Var);
                    dvp dvpVar = (dvp) ((d7p) f0aVar.Y).get();
                    xj1 xj1Var = etoVar.T;
                    vcq vcqVar = etoVar.U;
                    c8o.l(vcqVar);
                    ycq ycqVar = etoVar.a0;
                    c8o.l(ycqVar);
                    mmd1 mmd1Var = new mmd1(context, str5, lik1Var2, pobVar, ocqVar, pcqVar, inbVar, s7pVar, z7, x4eVar, qcqVar, aapVar, rk11Var, drj0Var, wcqVar, lzn0Var, e4Var, bapVar, capVar, est0Var, hurVar, ucqVar, z12, tcqVar, asnVar, dvpVar, ycmVar, xj1Var, vcqVar, ycqVar, iac0Var, new q8x(lzn0Var), d0rVar);
                    ahr ahrVar = etoVar.d;
                    c8o.l(ahrVar);
                    vx50 vx50Var = new vx50(new v7l(new xll(str5, d0rVar, (Observable) ((jly0) f0aVar.O0).get()), (byte) 5), new ptj(1, new aml(context, ahrVar), aml.class, "convert", "convert(Lcom/spotify/creativeworkplatform/creativeworkplatformapi/configuration/HeaderConfiguration$ConsumptionConfiguration$ConsumptionState;)Ljava/lang/String;", 0, (byte) 7));
                    d7p d7pVar3 = (d7p) f0aVar.P0;
                    d771 d771Var = etoVar.D;
                    c8o.l(d771Var);
                    ks6 ks6VarX = f0aVar.x();
                    eap eapVar = (eap) ((jly0) f0aVar.Q0).get();
                    String str6 = etoVar.D0;
                    c8o.l(str6);
                    ynb0 ynb0VarA2 = xqu.a((d7p) f0aVar.f);
                    boolean z13 = etoVar.z0;
                    boolean z14 = etoVar.A0;
                    req reqVar = etoVar.A;
                    c8o.l(reqVar);
                    ozc0 ozc0Var3 = etoVar.C0;
                    xrc0 xrc0Var = etoVar.g0;
                    c8o.l(xrc0Var);
                    yqg yqgVar = etoVar.h0;
                    c8o.l(yqgVar);
                    b7r0 b7r0Var = etoVar.i0;
                    c8o.l(b7r0Var);
                    pto ptoVar = new pto(context, ycmVar, zet0Var, vyoVar, cp31Var, z5, z6, hz5Var, na9Var, se80VarA, p6r0Var, mmd1Var, vx50Var, d7pVar3, d771Var, ks6VarX, eapVar, d0rVar, str5, str6, ynb0VarA2, z13, z14, reqVar, ozc0Var3, xrc0Var, yqgVar, b7r0Var);
                    vp11 vp11Var = new vp11(new my50(xj20.e, (zx50) null, (Function0) null, new z5o(ptoVar, (byte) 5), new oto(ptoVar, (byte) 0), new oto(ptoVar, (byte) 1), (yx50) null, vx50Var, (vu30) null, new nto(ptoVar, (byte) 8), true, (String) null, new jx50(new gx50(2), true, 1), new dy50(false, false, false, false, false, false, (String) null, false, 2015), (v3v0) null, (nx50) null, 510278), new nto(ptoVar, (byte) 6), (ep11) null, (vu30) null, new nto(ptoVar, (byte) 7), new vhd(3, new qld1(mmd1Var, (byte) 18)), (up11) null, p6r0Var, (p04) null, 4, false, z14, false, 5452);
                    kvn kvnVar = btrVar.a;
                    if (jo70Var == null || (list = jo70Var.d) == null) {
                        z6xVar = z6xVar2;
                    } else {
                        List<ho70> list2 = list;
                        z6x arrayList = new ArrayList(q7h.U(list2, 10));
                        for (ho70 ho70Var : list2) {
                            arrayList.add(new ap11(ho70Var.a, ho70Var.b, (String) null));
                        }
                        z6xVar = arrayList;
                    }
                    return new lvn(kvnVar.a(new cp11(str2, str, z6xVar, lZ, z6xVar2, z4 ? 2 : 1, (String) null), zf30Var, zf30Var, vp11Var, new fvn(true, false, rbo0Var, false, false, playOrigin, false, (mr20) null, (km90) null, (mr20) null, (guh0) null, false, 16248), l8h1Var, rzqVar).c());
                }
                if (iC2 == 1) {
                    return wdmVar.c(iylVar, rzqVar);
                }
                if (iC2 != 2) {
                    eg.o();
                    return null;
                }
                ctr ctrVar = (ctr) wdmVar.c;
                boolean z15 = h881Var.e;
                String str7 = h881Var.f;
                int iC3 = l1d.C(h881Var.g);
                if (iC3 == 0) {
                    d281Var = d281.a;
                } else if (iC3 == 1) {
                    d281Var = d281.b;
                } else if (iC3 == 2) {
                    d281Var = d281.c;
                } else {
                    if (iC3 != 3) {
                        eg.o();
                        return null;
                    }
                    d281Var = d281.d;
                }
                String str8 = h881Var.c.a;
                jo70 jo70Var2 = h881Var.r;
                r9v0 r9v0Var = h881Var.j;
                boolean z16 = ctrVar.l;
                sp11 sp11Var2 = rp11.a;
                if (z16) {
                    tp11Var = sp11.a;
                } else if (str7 == null) {
                    tp11Var = sp11Var2;
                } else {
                    if (str7.length() <= 0) {
                        str7 = null;
                    }
                    if (str7 != null) {
                        tp11Var = new tp11(str7);
                    } else {
                        tp11Var = sp11Var2;
                    }
                }
                q381 q381Var = new q381(str2, tp11Var, d281Var);
                kto ktoVar = ctrVar.d;
                gu8 gu8Var = ktoVar.f;
                kt91 kt91Var = ktoVar.h;
                iac0 iac0Var2 = ktoVar.i;
                n6r0 n6r0Var = ktoVar.j;
                lzn0 lzn0Var2 = ktoVar.k;
                kl1 kl1Var = ktoVar.l;
                luk lukVar = ktoVar.m;
                Activity activity = ktoVar.n;
                Context context2 = ktoVar.o;
                rk11 rk11Var2 = ktoVar.f18p;
                q8x q8xVar = ktoVar.q;
                z8o0 z8o0Var = ktoVar.g;
                ajq0 ajq0Var = ktoVar.r;
                eu8 eu8Var = ktoVar.s;
                gw70 gw70Var = ktoVar.t;
                Optional optional = ktoVar.u;
                vun vunVar = ktoVar.v;
                ggv ggvVar = ktoVar.w;
                yqg yqgVar2 = ktoVar.x;
                aod aodVar = ktoVar.y;
                boolean z17 = ktoVar.z;
                d5g1 d5g1Var = ktoVar.A;
                d771 d771Var2 = ktoVar.I;
                o241 o241Var = ktoVar.a;
                woa woaVar = ktoVar.b;
                pe peVar = ktoVar.e;
                fpa fpaVar = ktoVar.d;
                kma kmaVar = ktoVar.c;
                zle1 zle1Var = ktoVar.B;
                i8h1 i8h1Var2 = ktoVar.C;
                x3v0 x3v0Var = ktoVar.D;
                String str9 = ktoVar.E;
                String str10 = str9.length() == 0 ? null : str9;
                wr00 wr00Var = ktoVar.F;
                yh2 yh2Var = ktoVar.G;
                y5v0 y5v0Var = ktoVar.H;
                au8 au8Var = ktoVar.J;
                z5h1 z5h1Var = ktoVar.K;
                ofx ofxVar = ktoVar.L;
                a4v0 a4v0Var = ktoVar.M;
                rsz0 rsz0Var2 = ktoVar.N;
                boolean z18 = ktoVar.O;
                brz0 brz0Var = ktoVar.P;
                msn msnVar = ktoVar.Q;
                ycm ycmVar2 = ktoVar.R;
                boolean z19 = ktoVar.T;
                boolean z20 = ktoVar.U;
                boolean z21 = ktoVar.V;
                evn evnVar = ktoVar.W;
                m640 m640Var = ktoVar.S;
                boolean z22 = ktoVar.Y;
                f6g1 f6g1Var = ktoVar.Z;
                pvc pvcVar = ktoVar.X;
                w6e0 w6e0Var = ktoVar.b0;
                x4e x4eVar2 = ktoVar.c0;
                q8n q8nVar = ktoVar.d0;
                boolean z23 = ktoVar.a0;
                Boolean bool = (Boolean) ktoVar.e0.get();
                q8n q8nVar2 = ktoVar.f0;
                q8n q8nVar3 = ktoVar.g0;
                q8n q8nVar4 = ktoVar.h0;
                boolean z24 = ktoVar.i0;
                boolean z25 = ktoVar.j0;
                cab cabVar = ktoVar.k0;
                yzu yzuVar = ktoVar.l0;
                vgm vgmVar = ktoVar.m0;
                vb2 vb2Var = ktoVar.n0;
                y441 y441Var = ktoVar.o0;
                drp0 drp0Var = ktoVar.p0;
                boolean z26 = ktoVar.q0;
                boolean z27 = ktoVar.r0;
                boolean z28 = ktoVar.s0;
                y441 y441Var2 = ktoVar.t0;
                ro30 ro30Var = ktoVar.u0;
                boolean z29 = ktoVar.v0;
                boolean z30 = ktoVar.w0;
                gza gzaVar = ktoVar.x0;
                tji0 tji0Var = ktoVar.y0;
                h9n0 h9n0Var = ktoVar.z0;
                xzj1 xzj1Var = ktoVar.A0;
                iac0Var2.getClass();
                n6r0Var.getClass();
                i8h1Var2.getClass();
                nap napVar = new nap(q381Var, gu8Var, kt91Var, iac0Var2, n6r0Var, lzn0Var2, kl1Var, lukVar, activity, context2, rk11Var2, q8xVar, rzqVar, z8o0Var, ajq0Var, eu8Var, gw70Var, optional, vunVar, ggvVar, yqgVar2, aodVar, d771Var2, Boolean.valueOf(z17), d5g1Var, o241Var, woaVar, peVar, fpaVar, kmaVar, Boolean.valueOf(z21), zle1Var, x3v0Var, str10, wr00Var, yh2Var, y5v0Var, au8Var, z5h1Var, ofxVar, a4v0Var, rsz0Var2, Boolean.valueOf(z18), brz0Var, msnVar, ycmVar2, m640Var, Boolean.valueOf(z19), Boolean.valueOf(z20), evnVar, pvcVar, Boolean.valueOf(z22), f6g1Var, Boolean.valueOf(z23), w6e0Var, x4eVar2, q8nVar, bool, q8nVar2, q8nVar3, q8nVar4, Boolean.valueOf(z24), Boolean.valueOf(z25), cabVar, yzuVar, vgmVar, vb2Var, y441Var, drp0Var, Boolean.valueOf(z26), Boolean.valueOf(z27), Boolean.valueOf(z28), y441Var2, ro30Var, Boolean.valueOf(z29), Boolean.valueOf(z30), gzaVar, tji0Var, h9n0Var, xzj1Var);
                kvn kvnVar2 = ctrVar.a;
                if (jo70Var2 != null) {
                    List<ho70> list3 = jo70Var2.d;
                    SingletonList = new ArrayList(q7h.U(list3, 10));
                    for (ho70 ho70Var2 : list3) {
                        String str11 = ho70Var2.a;
                        String str12 = ho70Var2.b;
                        String strM = str12.length() == 0 ? l1d.m("spotify:search:podcasts-episodes:", Uri.encode(ho70Var2.a)) : str12;
                        if (str12.length() <= 0) {
                            str12 = null;
                        }
                        SingletonList.add(new ap11(str11, strM, str12));
                    }
                } else {
                    SingletonList = Collections.singletonList(new ap11(str8, l1d.m("spotify:search:podcasts-episodes:", Uri.encode(str8)), (String) null));
                }
                ?? r14 = SingletonList;
                if (r9v0Var != null) {
                    ArrayList<q9v0> arrayList2 = r9v0Var.a;
                    z6x arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    for (q9v0 q9v0Var : arrayList2) {
                        arrayList3.add(new bp11(q9v0Var.b, q9v0Var.a));
                    }
                    z6xVar2 = arrayList3;
                }
                cp11 cp11Var = new cp11(str2, str, (List) r14, (Long) null, z6xVar2, 1, (String) null);
                zf30 zf30Var2 = ctrVar.b;
                gap gapVar = (gap) napVar.A0.get();
                hap hapVar = (hap) napVar.B0.get();
                iap iapVar = (iap) napVar.C0.get();
                jap japVar = (jap) napVar.D0.get();
                kap kapVar = (kap) napVar.E0.get();
                bzo bzoVar = (bzo) napVar.G0.get();
                boolean zBooleanValue = napVar.y.booleanValue();
                boolean zBooleanValue2 = napVar.z.booleanValue();
                Boolean bool2 = napVar.A;
                boolean zBooleanValue3 = bool2.booleanValue();
                d0r d0rVar2 = napVar.g;
                w6e0 w6e0Var2 = napVar.w;
                d771 d771Var3 = napVar.x;
                t90 t90Var = new t90(gapVar, d0rVar2, hapVar, iapVar, japVar, kapVar, bzoVar, w6e0Var2, d771Var3, zBooleanValue, zBooleanValue2, zBooleanValue3);
                lap lapVar = (lap) napVar.H0.get();
                Context context3 = napVar.F;
                Context applicationContext = context3.getApplicationContext();
                mta mtaVar = new mta((byte) 11);
                Boolean bool3 = napVar.I;
                boolean zBooleanValue4 = bool3.booleanValue();
                x3v0 x3v0Var2 = napVar.O;
                tzr0 tzr0Var = new tzr0((Object) new z3v0(x3v0Var2), (Object) napVar.P, (Object) napVar.Q, (Object) napVar.R, (byte) 9);
                tzo tzoVar = new tzo(new z3v0(x3v0Var2), (byte) 3);
                map mapVar = (map) napVar.I0.get();
                paz pazVar = new paz();
                yyo yyoVar = (yyo) napVar.J0.get();
                fap fapVar = (fap) napVar.K0.get();
                xyo xyoVar = (xyo) napVar.L0.get();
                vyo vyoVar2 = (vyo) napVar.O0.get();
                uxy0 uxy0Var = new uxy0(napVar.a0, napVar.j, (byte) 4);
                s7p s7pVar2 = (s7p) napVar.P0.get();
                f6g1 f6g1Var2 = napVar.e0;
                yqg yqgVar3 = napVar.M;
                lls0 lls0Var = new lls0(new zsc(yqgVar3, napVar.o, napVar.d0, f6g1Var2, (byte) 19), napVar.f0.booleanValue(), (byte) 6);
                boolean zBooleanValue5 = napVar.h0.booleanValue();
                boolean zBooleanValue6 = napVar.i0.booleanValue();
                boolean zBooleanValue7 = napVar.l0.booleanValue();
                boolean zBooleanValue8 = napVar.m0.booleanValue();
                boolean zBooleanValue9 = napVar.p0.booleanValue();
                boolean zBooleanValue10 = napVar.q0.booleanValue();
                Parcelable.Creator creator = lik1.CREATOR;
                q381 q381Var2 = napVar.a;
                lik1 lik1Var3 = new lik1(q381Var2.a);
                boolean zBooleanValue11 = napVar.s0.booleanValue();
                boolean zBooleanValue12 = napVar.t0.booleanValue();
                ro30 ro30Var2 = napVar.u0;
                o241 o241Var2 = napVar.G;
                rsz0 rsz0Var3 = napVar.H;
                brz0 brz0Var2 = napVar.J;
                rk11 rk11Var3 = napVar.K;
                q8x q8xVar2 = napVar.L;
                d0r d0rVar3 = napVar.g;
                String str13 = napVar.N;
                ycm ycmVar3 = napVar.S;
                drp0 drp0Var2 = napVar.X;
                x4e x4eVar3 = napVar.b0;
                msn msnVar2 = napVar.g0;
                evn evnVar2 = napVar.j0;
                vb2 vb2Var2 = napVar.k0;
                n6r0 n6r0Var2 = napVar.e;
                y441 y441Var3 = napVar.C;
                omd1 omd1Var = new omd1(context3, o241Var2, rsz0Var3, zBooleanValue4, brz0Var2, rk11Var3, q8xVar2, d0rVar3, yqgVar3, str13, d771Var3, tzr0Var, tzoVar, ycmVar3, mapVar, pazVar, yyoVar, fapVar, drp0Var2, xyoVar, vyoVar2, uxy0Var, x4eVar3, s7pVar2, lls0Var, msnVar2, zBooleanValue5, zBooleanValue6, evnVar2, vb2Var2, n6r0Var2, y441Var3, zBooleanValue7, zBooleanValue8, napVar.n0, napVar.Z, napVar.o0, zBooleanValue9, zBooleanValue10, napVar.r0, lik1Var3, zBooleanValue11, zBooleanValue12, ro30Var2);
                boolean zBooleanValue13 = napVar.v0.booleanValue();
                Parcelable.Creator creator2 = lik1.CREATOR;
                cp5 cp5Var = new cp5(new x6o0(new lik1(q381Var2.a), (byte) 15), (byte) 12);
                boolean zBooleanValue14 = bool3.booleanValue();
                boolean zBooleanValue15 = bool2.booleanValue();
                d5g1 d5g1Var2 = napVar.B;
                ajq0 ajq0Var2 = napVar.D;
                n6r0 n6r0Var3 = napVar.e;
                vun vunVar2 = napVar.w0;
                aod aodVar2 = napVar.x0;
                m640 m640Var2 = napVar.y0;
                y441 y441Var4 = napVar.z0;
                d0r d0rVar4 = napVar.g;
                hp11 hp11Var = new hp11(t90Var, d5g1Var2, y441Var3, ajq0Var2, lapVar, context3, mtaVar, omd1Var, n6r0Var3, zBooleanValue13, vunVar2, aodVar2, m640Var2, w6e0Var2, cp5Var, y441Var4, d0rVar4, zBooleanValue14, zBooleanValue15);
                sp11 tp11Var2 = q381Var2.b;
                d281 d281Var2 = q381Var2.c;
                if (zBooleanValue8) {
                    if (str13 != null) {
                        tp11Var2 = new tp11(str13);
                    } else if (zBooleanValue6 || d281Var2 == d281.d) {
                        sp11Var = sp11Var2;
                    }
                    sp11Var = tp11Var2;
                } else {
                    sp11Var = sp11Var2;
                }
                dj20 dj20Var = dj20.e;
                String str14 = q381Var2.a;
                String string2 = applicationContext.getText(2131954794).toString();
                Set set2 = s4b1.f;
                zx50 zx50Var = new zx50(string2, "spotify:internal:show:find:".concat(uic.x(str14).h()));
                v3v0 v3v0Var = new v3v0(1, hp11Var, hp11.class, "basePermissionBadgeView", "basePermissionBadgeView(Landroid/view/ViewGroup;)Landroid/view/View;", 0, (byte) 20);
                String str15 = q381Var2.a;
                my50 my50Var = new my50(dj20Var, zx50Var, (Function0) null, new zkz0(hp11Var, q381Var2, (byte) 23), new fp11(hp11Var, q381Var2, (byte) 0), new fp11(hp11Var, q381Var2, (byte) 1), (yx50) null, (vx50) null, (vu30) null, new tc11(hp11Var, str15, (byte) 9), false, (String) null, (jx50) null, new dy50(false, false, false, zBooleanValue14, false, true, str15, false, 1831), v3v0Var, (nx50) null, 286148);
                ep11 ep11Var = new ep11(hp11Var, (byte) 4);
                ep11 ep11Var2 = new ep11(hp11Var, (byte) 1);
                tc11 tc11Var = !zBooleanValue13 ? new tc11(hp11Var, q381Var2, (byte) 8) : null;
                vhd vhdVar = new vhd(2, new juc1((Object) omd1Var, (Object) str15, (Object) d281Var2, (byte) 4));
                jf4 jf4Var = ((u9b) y441Var4.d).a;
                hvn hvnVarA = kvnVar2.a(cp11Var, zf30Var2, zf30Var2, new vp11(my50Var, ep11Var, ep11Var2, tc11Var, (jf4Var.v() && jf4Var.y()) ? new qm71((Object) d0rVar4, (Object) y441Var4, ((d2w) y441Var4.a).a.get(), (byte) 4) : null, vhdVar, sp11Var, n6r0Var3, new p04(new v72(cp5Var, (byte) 14)), 2, false, false, false, 7168), new fvn(false, true, ctrVar.g, ctrVar.e, ctrVar.f, ctrVar.h, false, (mr20) null, ctrVar.k ? new jm90() : im90.a, (mr20) null, !ctrVar.j ? null : new guh0(new o3e0("predictive-show-page", ctrVar.i)), ((gi4) ctrVar.m.get()).n() != fi4.DISABLED, 2816), l8h1Var, rzqVar);
                ks6 ks6Var = ctrVar.c;
                zf30 zf30Var3 = (zf30) ks6Var.a;
                p730 p730Var = (p730) ks6Var.b;
                a aVar = (a) ks6Var.c;
                a241 a241Var = (a241) ks6Var.d;
                mcs mcsVar = (mcs) ks6Var.e;
                kt91 kt91Var2 = (kt91) ks6Var.f;
                u5g1 u5g1Var = (u5g1) ks6Var.g;
                j2v j2vVar = (j2v) ks6Var.h;
                pae paeVar = (pae) ks6Var.i;
                ku1 ku1Var = (ku1) ks6Var.t;
                ku1 ku1Var2 = (ku1) ks6Var.X;
                u421 u421Var = (u421) ks6Var.Y;
                f9v0 f9v0Var = (f9v0) ks6Var.Z;
                uu00 uu00Var2 = (uu00) ks6Var.N0;
                xrc0 xrc0Var2 = (xrc0) ks6Var.O0;
                xlo xloVar = (xlo) ks6Var.P0;
                m591 m591Var = (m591) ks6Var.Q0;
                q8n q8nVar5 = (q8n) ks6Var.R0;
                q8n q8nVar6 = (q8n) ks6Var.S0;
                zf30Var3.getClass();
                m591Var.getClass();
                ccc0 ccc0Var = p730Var.a;
                g7h g7hVar = p730Var.b;
                q8n q8nVar7 = p730Var.c;
                Context applicationContext2 = zf30Var3.P0().getApplicationContext();
                uu00 uu00Var3 = u5g1Var.a;
                fuw0 fuw0Var = u5g1Var.b;
                kba kbaVar = new kba(aVar, (byte) 28);
                yzu yzuVar2 = new yzu();
                yzuVar2.a = j2vVar;
                yzuVar2.b = ku1Var2;
                yzuVar2.c = u421Var;
                yzuVar2.d = f9v0Var;
                boo0 boo0Var = new boo0(zno0.a);
                qno0 qno0Var = new qno0(str2, str, mcsVar, kt91Var2, new bw8(applicationContext2), q8nVar5, q8nVar6);
                acl aclVar = new acl(str2, mcsVar);
                hvnVarA.a(boo0.class, fmo0.class, tlo0.class, boo0Var, qno0Var);
                hvnVarA.b(boo0.class, new ku1(aclVar, (byte) 24));
                s630 s630Var = new s630(z15);
                j530 j530Var = new j530(str2, g7hVar);
                hvnVarA.a(s630.class, e530.class, o430.class, s630Var, new m630(ccc0Var, str2, q8nVar7));
                hvnVarA.b(s630.class, new ku1(j530Var, (byte) 13));
                ob2 ob2Var = new ob2((byte) 9);
                rih1 rih1Var = rih1.a;
                hvnVarA.a(rih1.class, fmo0.class, o430.class, rih1Var, ob2Var);
                hvnVarA.a(rih1.class, e530.class, tlo0.class, rih1Var, new ob2((byte) 7));
                fcl fclVar = fcl.a;
                ob2 ob2Var2 = a241Var.b;
                acl aclVar2 = a241Var.a;
                hvnVarA.a(fcl.class, ybl.class, rih1.class, fclVar, ob2Var2);
                hvnVarA.b(fcl.class, new eaz0(aclVar2, (byte) 4));
                ull ullVar = new ull((byte) 8);
                acl aclVar3 = new acl(str2, uu00Var2);
                hvnVarA.a(onc1.class, inc1.class, rih1.class, mnc1.a, ullVar);
                hvnVarA.b(onc1.class, new eaz0(aclVar3, (byte) 7));
                v5g1 v5g1Var = v5g1.a;
                ull ullVar2 = new ull((byte) 9);
                acl aclVar4 = new acl(str2, fuw0Var, uu00Var3);
                hvnVarA.a(x5g1.class, m5g1.class, rih1.class, v5g1Var, ullVar2);
                hvnVarA.b(x5g1.class, new eaz0(aclVar4, (byte) 8));
                w7x w7xVar = w7x.a;
                hvnVarA.a(ijo.class, l700.class, piw.class, new ijo(12, w7xVar, w7xVar), new wgo(kbaVar));
                hvnVarA.b(jc91.class, new ed2((byte) 9));
                aca acaVar = new aca(wls0.b);
                ob2 ob2Var3 = new ob2((byte) 2);
                zba zbaVar = new zba(str2, xrc0Var2);
                hvnVarA.a(aca.class, wba.class, rih1.class, acaVar, ob2Var3);
                hvnVarA.b(aca.class, new ku1(zbaVar, (byte) 4));
                jko jkoVar = new jko(false);
                ob2 ob2Var4 = new ob2((byte) 4);
                oio oioVar = new oio(str2, xloVar);
                hvnVarA.a(jko.class, mio.class, rih1.class, jkoVar, ob2Var4);
                hvnVarA.b(jko.class, new ku1(oioVar, (byte) 8));
                hvnVarA.a(k2v.class, hwu.class, wuu.class, new k2v(), new e1v(yzuVar2));
                hvnVarA.a(qae.class, mae.class, rih1.class, new qae(), new ob2((byte) 6));
                hvnVarA.b(qae.class, new d1v(paeVar, (byte) 0));
                hvnVarA.a(g2v0.class, f2v0.class, c2v0.class, new g2v0(false), new ull(yzuVar2, (byte) 3));
                hvnVarA.b(g2v0.class, ku1Var);
                hvnVarA.a(b521.class, a521.class, s421.class, new b521(), new ull(yzuVar2, (byte) 4));
                hvnVarA.a(j9v0.class, i9v0.class, e9v0.class, new j9v0(), new ull(yzuVar2, (byte) 5));
                hvnVarA.b(jc91.class, new ed2((byte) 11));
                hvnVarA.a(bu8.class, yt8.class, xt8.class, new bu8(), new ob2((byte) 1));
                hvnVarA.b(jwn.class, new eaz0(new n591(m591Var, q8nVar5), (byte) 5));
                return new lvn(hvnVarA.c());
            default:
                atq0 atq0Var = ((dtq0) obj).t;
                xsq0 xsq0Var = atq0Var instanceof xsq0 ? (xsq0) atq0Var : null;
                Throwable th = xsq0Var != null ? xsq0Var.a : null;
                th.getClass();
                if (!(th instanceof CountryRestrictedException)) {
                    return new y7r0(2131962428, 2131962427);
                }
                fqq fqqVar = u8v0Var.e;
                jma jmaVar = new jma((byte) 25);
                hqq hqqVar = (hqq) fqqVar.a.c;
                iir iirVar = new iir((i8h1) hqqVar.t.get(), new wqk0(((lik1) hqqVar.h.get()).a, hqqVar.g(), (byte) 29), (byte) 16);
                lzn0 lzn0VarD = hqqVar.a.d();
                c8o.l(lzn0VarD);
                return new yvo0(jmaVar, iirVar, lzn0VarD);
        }
    }
}
