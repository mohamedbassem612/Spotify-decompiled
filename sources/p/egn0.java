package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class egn0 implements ebr0 {
    public final /* synthetic */ byte a;
    public ynb0 b;

    /* JADX WARN: Code duplicated, block: B:49:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x020c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0232  */
    /* JADX WARN: Code duplicated, block: B:75:0x0235 A[Catch: IllegalArgumentException | NoSuchElementException -> 0x0232, TRY_LEAVE, TryCatch #3 {IllegalArgumentException | NoSuchElementException -> 0x0232, blocks: (B:72:0x022a, B:75:0x0235), top: B:89:0x022a }] */
    private final h0r0 c(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        String str;
        String str2;
        String strE;
        String strConcat;
        kvv0 kvv0VarC;
        String str3;
        String str4;
        String strE2;
        String str5;
        String strE3;
        String str6;
        int iO;
        String strF;
        String str7;
        String str8;
        String str9;
        bsv0 bsv0Var = (bsv0) parcelable;
        xrv0 xrv0Var = (xrv0) this.b.get();
        xrv0Var.getClass();
        kly0 kly0Var = xrv0Var.u;
        kly0 kly0Var2 = xrv0Var.b;
        ((rih1) obj).getClass();
        e93 e93Var = new e93(xrv0Var, bsv0Var, q7r0Var);
        gx81 gx81Var = (gx81) xrv0Var.d.get();
        c8o.l(gx81Var);
        kly0 kly0Var3 = xrv0Var.l;
        Context context = (Context) kly0Var3.get();
        c8o.l(context);
        mka mkaVar = new mka((byte) 1);
        xov0 xov0Var = (xov0) xrv0Var.q.get();
        c8o.l(xov0Var);
        avw0 avw0Var = new avw0((byte) 17);
        kly0 kly0Var4 = xrv0Var.c;
        RetrofitMaker retrofitMaker = (RetrofitMaker) kly0Var4.get();
        c8o.l(retrofitMaker);
        Object obj2 = e93Var.f;
        tvv0 tvv0Var = (tvv0) retrofitMaker.createWebgateService(tvv0.class, "android-premiumdestination-destination", new wrv0((jsv0) ((jly0) obj2).get(), (byte) 0));
        RetrofitMaker retrofitMaker2 = (RetrofitMaker) kly0Var4.get();
        c8o.l(retrofitMaker2);
        tvv0 tvv0Var2 = (tvv0) retrofitMaker2.createEarlyAccessWebgateService(tvv0.class, "android-premiumdestination-destination", new wrv0((jsv0) ((jly0) obj2).get(), (byte) 1));
        RetrofitMaker retrofitMaker3 = (RetrofitMaker) kly0Var4.get();
        c8o.l(retrofitMaker3);
        yrv0 yrv0Var = (yrv0) retrofitMaker3.createWebgateService(yrv0.class, "android-premiumdestination-destination");
        RetrofitMaker retrofitMaker4 = (RetrofitMaker) kly0Var4.get();
        c8o.l(retrofitMaker4);
        yrv0 yrv0Var2 = (yrv0) retrofitMaker4.createEarlyAccessWebgateService(yrv0.class, "android-premiumdestination-destination");
        kly0 kly0Var5 = xrv0Var.j;
        dxz0 dxz0Var = (dxz0) kly0Var5.get();
        c8o.l(dxz0Var);
        String strM = e93Var.c().b;
        if (strM.length() == 0) {
            strM = upn1.m();
        }
        String str10 = strM;
        jqt jqtVar = (jqt) xrv0Var.t.get();
        c8o.l(jqtVar);
        String strA = jqtVar.a();
        String str11 = (String) xrv0Var.r.get();
        c8o.l(str11);
        dma1 dma1VarA = xrv0Var.a();
        c8o.l(dma1VarA);
        String strE4 = dma1VarA.e(qrv0.d, (String) null);
        dma1 dma1VarA2 = xrv0Var.a();
        c8o.l(dma1VarA2);
        try {
            String strF2 = dma1VarA2.f(qrv0.e);
            if (strF2 == null || strF2.length() == 0) {
                str = "premium-destination-hubs";
            } else {
                int iN = lzu0.n(strF2);
                if (iN == 1) {
                    str9 = "premium-destination-hubs";
                } else if (iN != 2) {
                    if (iN != 3) {
                        throw null;
                    }
                    str9 = "premium-destination-hubs-staging";
                    str = "premium-destination-hubs";
                } else {
                    str9 = "premium-destination-hubs-dev";
                }
                str = str9;
            }
        } catch (IllegalArgumentException | NoSuchElementException unused) {
        }
        dma1 dma1VarA3 = xrv0Var.a();
        c8o.l(dma1VarA3);
        try {
            String strF3 = dma1VarA3.f(qrv0.c);
            try {
                if (strF3 != null && strF3.length() != 0) {
                    int iM = lzu0.m(strF3);
                    if (iM == 1) {
                        str8 = null;
                    } else if (iM == 2) {
                        str8 = "intro";
                    } else if (iM == 3) {
                        str8 = "nonintro";
                    } else if (iM == 4) {
                        str8 = "winback";
                    } else {
                        try {
                            throw null;
                        } catch (IllegalArgumentException | NoSuchElementException unused2) {
                        }
                    }
                    str2 = str8;
                    dma1 dma1VarA4 = xrv0Var.a();
                    c8o.l(dma1VarA4);
                    strE = dma1VarA4.e(qrv0.a, (String) null);
                    if (strE != null || strE.length() == 0) {
                        strConcat = null;
                    } else {
                        strConcat = strE.concat("T00:00:00");
                    }
                    kvv0VarC = e93Var.c();
                    str3 = ((bsv0) e93Var.c).d;
                    if (str3 == null) {
                        str7 = kvv0VarC.c;
                        if (str7.length() == 0) {
                            str4 = null;
                        } else {
                            str4 = str7;
                        }
                    } else {
                        str4 = str3;
                    }
                    String str12 = Build.MANUFACTURER;
                    dma1 dma1VarA5 = xrv0Var.a();
                    c8o.l(dma1VarA5);
                    strE2 = dma1VarA5.e(qrv0.f, (String) null);
                    if (strE2 != null || strE2.length() == 0) {
                        str5 = null;
                    } else {
                        str5 = strE2;
                    }
                    String id = TimeZone.getDefault().getID();
                    dma1 dma1VarA6 = xrv0Var.a();
                    c8o.l(dma1VarA6);
                    strE3 = dma1VarA6.e(qrv0.g, (String) null);
                    if (strE3 != null || strE3.length() == 0) {
                        str6 = null;
                    } else {
                        str6 = strE3;
                    }
                    Context context2 = (Context) kly0Var3.get();
                    c8o.l(context2);
                    String installerPackageName = context2.getPackageManager().getInstallerPackageName(context2.getPackageName());
                    dma1 dma1VarA7 = xrv0Var.a();
                    c8o.l(dma1VarA7);
                    strF = dma1VarA7.f(qrv0.h);
                    if (strF == null) {
                        iO = 1;
                    } else {
                        iO = lzu0.o(strF);
                    }
                    lzu0.e(iO);
                    mzr0 mzr0Var = new mzr0(context, mkaVar, xov0Var, avw0Var, tvv0Var, tvv0Var2, yrv0Var, yrv0Var2, dxz0Var, new wdm(iO, str10, strA, str11, strE4, str, str2, strConcat, str4, str5, id, str6, installerPackageName));
                    nfa0 nfa0Var = (nfa0) xrv0Var.f.get();
                    c8o.l(nfa0Var);
                    Scheduler scheduler = (Scheduler) kly0Var2.get();
                    c8o.l(scheduler);
                    Scheduler scheduler2 = (Scheduler) xrv0Var.a.get();
                    c8o.l(scheduler2);
                    lzn0 lzn0Var = (lzn0) xrv0Var.g.get();
                    c8o.l(lzn0Var);
                    o241 o241Var = (o241) xrv0Var.h.get();
                    c8o.l(o241Var);
                    dxz0 dxz0Var2 = (dxz0) kly0Var5.get();
                    c8o.l(dxz0Var2);
                    isv0 isv0Var = (isv0) kly0Var.get();
                    c8o.l(isv0Var);
                    bqv0 bqv0Var = (bqv0) xrv0Var.e.get();
                    c8o.l(bqv0Var);
                    dma1 dma1VarA8 = xrv0Var.a();
                    c8o.l(dma1VarA8);
                    gsv0 gsv0Var = new gsv0(dma1VarA8);
                    Context context3 = (Context) xrv0Var.m.get();
                    c8o.l(context3);
                    gal galVar = new gal(gsv0Var, context3, (byte) 7);
                    qil1 qil1Var = (qil1) xrv0Var.k.get();
                    c8o.l(qil1Var);
                    Scheduler scheduler3 = (Scheduler) kly0Var2.get();
                    c8o.l(scheduler3);
                    lk1 lk1Var = new lk1(scheduler3, (byte) 3);
                    aru0 aru0Var = new aru0(new q3c(new fjb((byte) 20)), new dgb(new a0b((byte) 20), new fjb((byte) 20), (byte) 20), new ejb(new fjb((byte) 20), new uic((byte) 15), (byte) 20), new fza(new fjb((byte) 20), (byte) 20), new l7c(new fjb((byte) 20), (byte) 20), new sjb(new a0b((byte) 20), new t2b((byte) 11), new fjb((byte) 20)), new sks0(new sjb(new a0b((byte) 20), new t2b((byte) 11), new fjb((byte) 20)), new fjb((byte) 20)), new nfb(new fjb((byte) 20), (byte) 20));
                    zhq0 zhq0Var = new zhq0(new dgb(new t2b((byte) 15), (byte) 29), new c9c(new eoc((byte) 0), new t2b((byte) 15), (byte) 12), new ekb(new t2b((byte) 15), (byte) 14), new mka(new t2b((byte) 15), (byte) 0), new mta(new t2b((byte) 15), (byte) 24), new cua(new eoc((byte) 0), new hfb((byte) 11), new t2b((byte) 15)), new xgc(new t2b((byte) 15), (byte) 10), new bm00(new cua(new eoc((byte) 0), new hfb((byte) 11), new t2b((byte) 15)), new t2b((byte) 15)), new twb((byte) 20));
                    isv0 isv0Var2 = (isv0) kly0Var.get();
                    c8o.l(isv0Var2);
                    jxp0 jxp0Var = new jxp0(isv0Var2, (byte) 15);
                    Object obj3 = e93Var.e;
                    return new urv0(gx81Var, bsv0Var, new asv0(mzr0Var, nfa0Var, scheduler, scheduler2, lzn0Var, o241Var, dxz0Var2, isv0Var, bqv0Var, galVar, qil1Var, lk1Var, aru0Var, zhq0Var, jxp0Var, (rrv0) ((jly0) obj3).get()), (kyp) ((jly0) e93Var.V0).get(), (rrv0) ((jly0) obj3).get());
                }
                strF = dma1VarA7.f(qrv0.h);
                if (strF == null) {
                    iO = 1;
                } else {
                    iO = lzu0.o(strF);
                }
            } catch (IllegalArgumentException | NoSuchElementException unused3) {
            }
        } catch (IllegalArgumentException | NoSuchElementException unused4) {
        }
        str2 = null;
        dma1 dma1VarA9 = xrv0Var.a();
        c8o.l(dma1VarA9);
        strE = dma1VarA9.e(qrv0.a, (String) null);
        if (strE != null) {
            strConcat = null;
        } else {
            strConcat = null;
        }
        kvv0VarC = e93Var.c();
        str3 = ((bsv0) e93Var.c).d;
        if (str3 == null) {
            str7 = kvv0VarC.c;
            if (str7.length() == 0) {
                str4 = null;
            } else {
                str4 = str7;
            }
        } else {
            str4 = str3;
        }
        String str13 = Build.MANUFACTURER;
        dma1 dma1VarA10 = xrv0Var.a();
        c8o.l(dma1VarA10);
        strE2 = dma1VarA10.e(qrv0.f, (String) null);
        if (strE2 != null) {
            str5 = null;
        } else {
            str5 = null;
        }
        String id2 = TimeZone.getDefault().getID();
        dma1 dma1VarA11 = xrv0Var.a();
        c8o.l(dma1VarA11);
        strE3 = dma1VarA11.e(qrv0.g, (String) null);
        if (strE3 != null) {
            str6 = null;
        } else {
            str6 = null;
        }
        Context context4 = (Context) kly0Var3.get();
        c8o.l(context4);
        String installerPackageName2 = context4.getPackageManager().getInstallerPackageName(context4.getPackageName());
        dma1 dma1VarA12 = xrv0Var.a();
        c8o.l(dma1VarA12);
        lzu0.e(iO);
        mzr0 mzr0Var2 = new mzr0(context, mkaVar, xov0Var, avw0Var, tvv0Var, tvv0Var2, yrv0Var, yrv0Var2, dxz0Var, new wdm(iO, str10, strA, str11, strE4, str, str2, strConcat, str4, str5, id2, str6, installerPackageName2));
        nfa0 nfa0Var2 = (nfa0) xrv0Var.f.get();
        c8o.l(nfa0Var2);
        Scheduler scheduler4 = (Scheduler) kly0Var2.get();
        c8o.l(scheduler4);
        Scheduler scheduler5 = (Scheduler) xrv0Var.a.get();
        c8o.l(scheduler5);
        lzn0 lzn0Var2 = (lzn0) xrv0Var.g.get();
        c8o.l(lzn0Var2);
        o241 o241Var2 = (o241) xrv0Var.h.get();
        c8o.l(o241Var2);
        dxz0 dxz0Var3 = (dxz0) kly0Var5.get();
        c8o.l(dxz0Var3);
        isv0 isv0Var3 = (isv0) kly0Var.get();
        c8o.l(isv0Var3);
        bqv0 bqv0Var2 = (bqv0) xrv0Var.e.get();
        c8o.l(bqv0Var2);
        dma1 dma1VarA13 = xrv0Var.a();
        c8o.l(dma1VarA13);
        gsv0 gsv0Var2 = new gsv0(dma1VarA13);
        Context context5 = (Context) xrv0Var.m.get();
        c8o.l(context5);
        gal galVar2 = new gal(gsv0Var2, context5, (byte) 7);
        qil1 qil1Var2 = (qil1) xrv0Var.k.get();
        c8o.l(qil1Var2);
        Scheduler scheduler6 = (Scheduler) kly0Var2.get();
        c8o.l(scheduler6);
        lk1 lk1Var2 = new lk1(scheduler6, (byte) 3);
        aru0 aru0Var2 = new aru0(new q3c(new fjb((byte) 20)), new dgb(new a0b((byte) 20), new fjb((byte) 20), (byte) 20), new ejb(new fjb((byte) 20), new uic((byte) 15), (byte) 20), new fza(new fjb((byte) 20), (byte) 20), new l7c(new fjb((byte) 20), (byte) 20), new sjb(new a0b((byte) 20), new t2b((byte) 11), new fjb((byte) 20)), new sks0(new sjb(new a0b((byte) 20), new t2b((byte) 11), new fjb((byte) 20)), new fjb((byte) 20)), new nfb(new fjb((byte) 20), (byte) 20));
        zhq0 zhq0Var2 = new zhq0(new dgb(new t2b((byte) 15), (byte) 29), new c9c(new eoc((byte) 0), new t2b((byte) 15), (byte) 12), new ekb(new t2b((byte) 15), (byte) 14), new mka(new t2b((byte) 15), (byte) 0), new mta(new t2b((byte) 15), (byte) 24), new cua(new eoc((byte) 0), new hfb((byte) 11), new t2b((byte) 15)), new xgc(new t2b((byte) 15), (byte) 10), new bm00(new cua(new eoc((byte) 0), new hfb((byte) 11), new t2b((byte) 15)), new t2b((byte) 15)), new twb((byte) 20));
        isv0 isv0Var4 = (isv0) kly0Var.get();
        c8o.l(isv0Var4);
        jxp0 jxp0Var2 = new jxp0(isv0Var4, (byte) 15);
        Object obj4 = e93Var.e;
        return new urv0(gx81Var, bsv0Var, new asv0(mzr0Var2, nfa0Var2, scheduler4, scheduler5, lzn0Var2, o241Var2, dxz0Var3, isv0Var3, bqv0Var2, galVar2, qil1Var2, lk1Var2, aru0Var2, zhq0Var2, jxp0Var2, (rrv0) ((jly0) obj4).get()), (kyp) ((jly0) e93Var.V0).get(), (rrv0) ((jly0) obj4).get());
    }

    public final h0r0 a(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        switch (this.a) {
            case 0:
                cgn0 cgn0Var = (cgn0) this.b.get();
                cgn0Var.getClass();
                ((rih1) obj).getClass();
                lzn0 lzn0Var = (lzn0) cgn0Var.a.get();
                c8o.l(lzn0Var);
                bfd bfdVar = (bfd) cgn0Var.b.get();
                c8o.l(bfdVar);
                qyj qyjVar = (qyj) cgn0Var.c.get();
                c8o.l(qyjVar);
                e27 e27Var = new e27((byte) 9);
                q8n q8nVar = (q8n) cgn0Var.d.get();
                c8o.l(q8nVar);
                q8n q8nVar2 = (q8n) cgn0Var.e.get();
                c8o.l(q8nVar2);
                return new bgn0(lzn0Var, bfdVar, (dgn0) parcelable, qyjVar, e27Var, q8nVar, q8nVar2);
            case 1:
                i2o0 i2o0Var = (i2o0) this.b.get();
                i2o0Var.getClass();
                ((rih1) obj).getClass();
                jly0 jly0VarA = iy81.a(new fyo((byte) 21));
                qyj qyjVar2 = (qyj) i2o0Var.a.get();
                c8o.l(qyjVar2);
                ttp ttpVar = (ttp) jly0VarA.get();
                a1r0 a1r0Var = (a1r0) i2o0Var.b.get();
                c8o.l(a1r0Var);
                Resources resources = (Resources) i2o0Var.c.get();
                c8o.l(resources);
                return new g2o0(qyjVar2, ttpVar, (j2o0) parcelable, a1r0Var, resources);
            case 2:
                s3o0 s3o0Var = (s3o0) parcelable;
                r3o0 r3o0Var = (r3o0) this.b.get();
                r3o0Var.getClass();
                ((rih1) obj).getClass();
                wtp wtpVar = new wtp(r3o0Var, s3o0Var);
                qyj qyjVar3 = (qyj) r3o0Var.a.get();
                c8o.l(qyjVar3);
                utp utpVar = (utp) ((jly0) wtpVar.c).get();
                a1r0 a1r0Var2 = (a1r0) r3o0Var.d.get();
                c8o.l(a1r0Var2);
                Resources resources2 = (Resources) r3o0Var.e.get();
                c8o.l(resources2);
                return new p3o0(qyjVar3, utpVar, s3o0Var, a1r0Var2, resources2);
            case 3:
                f4o0 f4o0Var = (f4o0) parcelable;
                e4o0 e4o0Var = (e4o0) this.b.get();
                e4o0Var.getClass();
                ((rih1) obj).getClass();
                wtp wtpVar2 = new wtp(e4o0Var, f4o0Var);
                qyj qyjVar4 = (qyj) e4o0Var.a.get();
                c8o.l(qyjVar4);
                xtp xtpVar = (xtp) ((jly0) wtpVar2.c).get();
                a1r0 a1r0Var3 = (a1r0) e4o0Var.d.get();
                c8o.l(a1r0Var3);
                return new a4o0(qyjVar4, xtpVar, f4o0Var, a1r0Var3);
            case 4:
                n9o0 n9o0Var = (n9o0) this.b.get();
                n9o0Var.getClass();
                ((rih1) obj).getClass();
                s24 s24Var = new s24(n9o0Var, (o9o0) parcelable, q7r0Var);
                a8e0 a8e0Var = (a8e0) n9o0Var.c.get();
                c8o.l(a8e0Var);
                return new m9o0(a8e0Var, new hvp0((zdz) ((jly0) s24Var.h).get(), (byte) 15), new lo8((r8e0) ((g5t) s24Var.t).get(), (q8e0) ((jly0) s24Var.X).get(), (byte) 12));
            case 5:
                qgo0 qgo0Var = (qgo0) this.b.get();
                qgo0Var.getClass();
                ((rih1) obj).getClass();
                qyj qyjVar5 = (qyj) qgo0Var.a.get();
                c8o.l(qyjVar5);
                ggl gglVar = (ggl) qgo0Var.b.get();
                c8o.l(gglVar);
                gw70 gw70Var = (gw70) qgo0Var.c.get();
                c8o.l(gw70Var);
                i8h1 i8h1Var = (i8h1) qgo0Var.d.get();
                c8o.l(i8h1Var);
                kt91 kt91Var = (kt91) qgo0Var.e.get();
                c8o.l(kt91Var);
                return new pgo0(qyjVar5, (rgo0) parcelable, gglVar, gw70Var, i8h1Var, kt91Var);
            case 6:
                sio0 sio0Var = (sio0) parcelable;
                rio0 rio0Var = (rio0) this.b.get();
                rio0Var.getClass();
                ((rih1) obj).getClass();
                z2p z2pVar = new z2p(rio0Var, sio0Var);
                qyj qyjVar6 = (qyj) rio0Var.a.get();
                c8o.l(qyjVar6);
                los losVar = (los) z2pVar.a.get();
                oio0 oio0Var = (oio0) rio0Var.c.get();
                c8o.l(oio0Var);
                wio0 wio0Var = (wio0) rio0Var.d.get();
                c8o.l(wio0Var);
                return new qio0(sio0Var, qyjVar6, losVar, oio0Var, wio0Var);
            case 7:
                gct gctVar = (gct) this.b.get();
                gctVar.getClass();
                ((rih1) obj).getClass();
                Resources resources3 = (Resources) gctVar.b.get();
                c8o.l(resources3);
                kyj kyjVar = (kyj) gctVar.a.get();
                c8o.l(kyjVar);
                Context context = (Context) gctVar.e.get();
                c8o.l(context);
                Activity activity = (Activity) gctVar.o.get();
                c8o.l(activity);
                qnv0 qnv0Var = (qnv0) gctVar.h.get();
                c8o.l(qnv0Var);
                dto0 dto0Var = (dto0) gctVar.i.get();
                c8o.l(dto0Var);
                lcs lcsVar = (lcs) gctVar.j.get();
                c8o.l(lcsVar);
                uro0 uro0Var = (uro0) gctVar.k.get();
                c8o.l(uro0Var);
                kt91 kt91Var2 = (kt91) gctVar.g.get();
                c8o.l(kt91Var2);
                lzn0 lzn0Var2 = (lzn0) gctVar.n.get();
                c8o.l(lzn0Var2);
                a1r0 a1r0Var4 = (a1r0) gctVar.f.get();
                c8o.l(a1r0Var4);
                kly0 kly0Var = gctVar.c;
                q8n q8nVar3 = (q8n) kly0Var.get();
                c8o.l(q8nVar3);
                kly0 kly0Var2 = gctVar.d;
                q8n q8nVar4 = (q8n) kly0Var2.get();
                c8o.l(q8nVar4);
                cro0 cro0Var = new cro0(context, activity, qnv0Var, dto0Var, lcsVar, uro0Var, kt91Var2, lzn0Var2, a1r0Var4, q8nVar3, q8nVar4);
                q8n q8nVar5 = (q8n) kly0Var.get();
                c8o.l(q8nVar5);
                q8n q8nVar6 = (q8n) kly0Var2.get();
                c8o.l(q8nVar6);
                oro0 oro0Var = new oro0(cro0Var, q8nVar5, q8nVar6);
                i8h1 i8h1Var2 = (i8h1) gctVar.l.get();
                c8o.l(i8h1Var2);
                drj0 drj0Var = new drj0(i8h1Var2, (byte) 14);
                Map map = (Map) gctVar.m.get();
                c8o.l(map);
                return new iqo0(resources3, kyjVar, oro0Var, drj0Var, (qro0) parcelable, map);
            case 8:
                rro0 rro0Var = (rro0) parcelable;
                kqo0 kqo0Var = (kqo0) this.b.get();
                kqo0Var.getClass();
                ((rih1) obj).getClass();
                b6p b6pVar = new b6p(kqo0Var, rro0Var);
                ix81 ix81VarA = kqo0Var.a();
                c8o.l(ix81VarA);
                gw70 gw70VarB = kqo0Var.b();
                c8o.l(gw70VarB);
                pe peVarH = kqo0Var.h();
                c8o.l(peVarH);
                c8o.l(kqo0Var.f());
                qyj qyjVar7 = new qyj(ix81VarA, new q3b1(gw70VarB, peVarH));
                lcs lcsVar2 = (lcs) kqo0Var.b.get();
                c8o.l(lcsVar2);
                Object obj2 = b6pVar.c;
                los losVar2 = (los) ((jly0) obj2).get();
                ck20 ck20Var = (ck20) kqo0Var.a.get();
                c8o.l(ck20Var);
                qnv0 qnv0Var2 = (qnv0) kqo0Var.c.get();
                c8o.l(qnv0Var2);
                return new jqo0(qyjVar7, rro0Var, new res(lcsVar2, losVar2, ck20Var, qnv0Var2), (los) ((jly0) obj2).get());
            case 9:
                vso0 vso0Var = (vso0) this.b.get();
                vso0Var.getClass();
                ((rih1) obj).getClass();
                qyj qyjVar8 = (qyj) vso0Var.a.get();
                hs3 hs3Var = (hs3) vso0Var.b.get();
                c8o.l(hs3Var);
                uso0 uso0Var = new uso0((Activity) vso0Var.c.get(), (dma1) vso0Var.d.get());
                bnj0 bnj0Var = new bnj0((qnv0) vso0Var.e.get());
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new yso0(qyjVar8, hs3Var, uso0Var, bnj0Var, new yvk0(yon1.G1("PUSHOPTIN", "pushoptin", 1604, "pushoptin").c, "spotify:internal:push-opt-in"));
            case 10:
                cwo0 cwo0Var = (cwo0) this.b.get();
                cwo0Var.getClass();
                ((rih1) obj).getClass();
                toj0 toj0Var = new toj0(cwo0Var);
                c881 c881Var = (c881) cwo0Var.d.get();
                c8o.l(c881Var);
                hod0 hod0Var = new hod0(c881Var, (byte) 25);
                a8e0 a8e0Var2 = (a8e0) cwo0Var.m.get();
                c8o.l(a8e0Var2);
                return new awo0(hod0Var, a8e0Var2, (l4h1) ((jly0) toj0Var.g).get());
            case 11:
                pp20 pp20Var = (pp20) parcelable;
                enp0 enp0Var = (enp0) this.b.get();
                enp0Var.getClass();
                ((rih1) obj).getClass();
                qqp qqpVar = new qqp(enp0Var, pp20Var);
                ix81 ix81Var = (ix81) enp0Var.b.get();
                c8o.l(ix81Var);
                return new dnp0(ix81Var, new n59(pp20Var, (qwp) ((jly0) qqpVar.c).get(), (swp) ((jly0) qqpVar.e).get(), (byte) 2));
            case 12:
                mfq0 mfq0Var = (mfq0) this.b.get();
                mfq0Var.getClass();
                ((rih1) obj).getClass();
                jly0 jly0VarA2 = iy81.a(new fyo((byte) 22));
                qyj qyjVar9 = (qyj) mfq0Var.a.get();
                c8o.l(qyjVar9);
                lzn0 lzn0Var3 = (lzn0) mfq0Var.b.get();
                c8o.l(lzn0Var3);
                smp0 smp0Var = new smp0(lzn0Var3, (cxp) jly0VarA2.get());
                n9r0 n9r0Var = (n9r0) mfq0Var.c.get();
                c8o.l(n9r0Var);
                return new lfq0(qyjVar9, (pfq0) parcelable, smp0Var, n9r0Var);
            case 13:
                psq0 psq0Var = (psq0) parcelable;
                bsq0 bsq0Var = (bsq0) this.b.get();
                bsq0Var.getClass();
                ((rih1) obj).getClass();
                qqp qqpVar2 = new qqp(bsq0Var, psq0Var);
                qyj qyjVar10 = (qyj) bsq0Var.a.get();
                c8o.l(qyjVar10);
                dxp dxpVar = (dxp) ((jly0) qqpVar2.b).get();
                e5b0 e5b0Var = (e5b0) ((jly0) qqpVar2.c).get();
                luk lukVar = (luk) bsq0Var.d.get();
                c8o.l(lukVar);
                return new asq0(qyjVar10, psq0Var, dxpVar, e5b0Var, new w8r0(false, lukVar));
            case 14:
                q8r0 q8r0Var = (q8r0) parcelable;
                r8r0 r8r0Var = (r8r0) this.b.get();
                r8r0Var.getClass();
                ((rih1) obj).getClass();
                ib3 ib3Var = new ib3(r8r0Var, q8r0Var, q7r0Var);
                hvj hvjVar = (hvj) r8r0Var.b.get();
                c8o.l(hvjVar);
                d0r d0rVar = (d0r) ((jly0) ib3Var.c).get();
                q8n q8nVar7 = (q8n) r8r0Var.n.get();
                c8o.l(q8nVar7);
                hx60 hx60Var = new hx60(d0rVar, q8r0Var, q8nVar7);
                quc0 quc0Var = (quc0) r8r0Var.p.get();
                c8o.l(quc0Var);
                lmw lmwVar = new lmw(quc0Var, (byte) 23);
                t8r0 t8r0Var = new t8r0(t380.v(new w2((byte) 1), new ow60((byte) 3), new da91((byte) 6), new k2o0((byte) 5)), ern1.y(j380.n(biz.class, (ywp) ib3Var.g, e880.class, (ywp) ib3Var.n, hsc1.class, (ywp) ib3Var.C, asq0.class, (ywp) ib3Var.G)));
                Flowable flowable = (Flowable) r8r0Var.c.get();
                c8o.l(flowable);
                hxp hxpVar = (hxp) ((jly0) ib3Var.H).get();
                o7r0 o7r0Var = (o7r0) r8r0Var.e.get();
                c8o.l(o7r0Var);
                dg0 dg0Var = (dg0) r8r0Var.d.get();
                c8o.l(dg0Var);
                return new p8r0(hvjVar, hx60Var, lmwVar, new o860(t8r0Var, flowable, hxpVar, new uo5(o7r0Var, dg0Var, (ywp) ib3Var.I, (byte) 20), (byte) 3), q8r0Var);
            case 15:
                qsr0 qsr0Var = (qsr0) this.b.get();
                qsr0Var.getClass();
                ((rih1) obj).getClass();
                a680 a680Var = new a680();
                a680Var.a = qsr0Var;
                a680Var.b = q7r0Var;
                a680Var.c = xqu.b(new ywp(a680Var, 0, (byte) 6));
                a680Var.d = new ywp(a680Var, 1, (byte) 6);
                a680Var.e = new ywp(a680Var, 2, (byte) 6);
                a680Var.f = new ywp(a680Var, 3, (byte) 6);
                los losVar3 = (los) ((jly0) a680Var.c).get();
                e2b0 e2b0Var = (e2b0) qsr0Var.b.get();
                c8o.l(e2b0Var);
                ov20 ov20Var = (ov20) qsr0Var.a.get();
                c8o.l(ov20Var);
                a8e0 a8e0VarA = qsr0Var.a();
                c8o.l(a8e0VarA);
                gw70 gw70VarB2 = qsr0Var.b();
                c8o.l(gw70VarB2);
                pe peVarH2 = qsr0Var.h();
                c8o.l(peVarH2);
                c8o.l(qsr0Var.f());
                return new nsr0(losVar3, e2b0Var, ov20Var, new hvj(a8e0VarA, new q3b1(gw70VarB2, peVarH2)), (ywp) a680Var.d, (ywp) a680Var.e, new poj0((ywp) a680Var.f, new h7l0((byte) 15)));
            case 16:
                sur0 sur0Var = (sur0) parcelable;
                rur0 rur0Var = (rur0) this.b.get();
                rur0Var.getClass();
                ((rih1) obj).getClass();
                z2p z2pVar2 = new z2p(rur0Var, sur0Var, q7r0Var);
                ix81 ix81VarA2 = rur0Var.a();
                c8o.l(ix81VarA2);
                gw70 gw70VarB3 = rur0Var.b();
                c8o.l(gw70VarB3);
                pe peVarH3 = rur0Var.h();
                c8o.l(peVarH3);
                c8o.l(rur0Var.f());
                qyj qyjVar11 = new qyj(ix81VarA2, new q3b1(gw70VarB3, peVarH3));
                kly0 kly0Var3 = rur0Var.a;
                skc0 skc0Var = (skc0) kly0Var3.get();
                c8o.l(skc0Var);
                skc0 skc0Var2 = (skc0) kly0Var3.get();
                c8o.l(skc0Var2);
                return new qur0(qyjVar11, sur0Var, skc0Var, new myq0(skc0Var2, new ulc((byte) 18), new rzo0(z2pVar2.a)));
            case 17:
                bns0 bns0Var = (bns0) parcelable;
                ans0 ans0Var = (ans0) this.b.get();
                ans0Var.getClass();
                ((rih1) obj).getClass();
                b6p b6pVar2 = new b6p(ans0Var, bns0Var);
                qyj qyjVar12 = (qyj) ans0Var.d.get();
                c8o.l(qyjVar12);
                Object obj3 = b6pVar2.c;
                los losVar4 = (los) ((jly0) obj3).get();
                vu60 vu60Var = (vu60) ans0Var.b.get();
                c8o.l(vu60Var);
                up90 up90Var = (up90) ans0Var.c.get();
                c8o.l(up90Var);
                c9c0 c9c0Var = (c9c0) ans0Var.a.get();
                c8o.l(c9c0Var);
                yxb0 yxb0Var = new yxb0(losVar4, vu60Var, up90Var, c9c0Var);
                los losVar5 = (los) ((jly0) obj3).get();
                Resources resources4 = (Resources) ans0Var.e.get();
                c8o.l(resources4);
                return new yms0(qyjVar12, yxb0Var, bns0Var, losVar5, resources4);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                f1t0 f1t0Var = (f1t0) parcelable;
                e1t0 e1t0Var = (e1t0) this.b.get();
                e1t0Var.getClass();
                ((rih1) obj).getClass();
                wtp wtpVar3 = new wtp(e1t0Var, f1t0Var, q7r0Var);
                kyj kyjVar2 = (kyj) e1t0Var.a.get();
                c8o.l(kyjVar2);
                bza0 bza0Var = (bza0) e1t0Var.c.get();
                c8o.l(bza0Var);
                dma1 dma1Var = (dma1) e1t0Var.d.get();
                c8o.l(dma1Var);
                kly0 kly0Var4 = e1t0Var.b;
                yqg yqgVar = (yqg) kly0Var4.get();
                c8o.l(yqgVar);
                qes qesVar = new qes(yqgVar, dma1Var);
                yqg yqgVar2 = (yqg) kly0Var4.get();
                c8o.l(yqgVar2);
                ca40 ca40Var = (ca40) e1t0Var.e.get();
                c8o.l(ca40Var);
                ytp0 ytp0Var = new ytp0(bza0Var, qesVar, yqgVar2, ca40Var, f1t0Var, (byte) 7);
                caq caqVar = e1t0Var.f;
                q8n q8nVar8 = (q8n) caqVar.get();
                c8o.l(q8nVar8);
                a1t0 a1t0Var = new a1t0(new l0t0(ytp0Var, q8nVar8));
                ynb0 ynb0VarA = xqu.a((n1p) wtpVar3.c);
                q8n q8nVar9 = (q8n) caqVar.get();
                c8o.l(q8nVar9);
                return new d1t0(kyjVar2, a1t0Var, ynb0VarA, q8nVar9);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                abu abuVar = (abu) parcelable;
                d8u d8uVar = (d8u) this.b.get();
                d8uVar.getClass();
                ((rih1) obj).getClass();
                mxp mxpVar = new mxp(d8uVar, abuVar, q7r0Var);
                a8e0 a8e0VarL = d8uVar.L();
                c8o.l(a8e0VarL);
                return new c4t0(a8e0VarL, mxpVar.l(), (kxp) mxpVar.p2.get(), abuVar, new tzo(abuVar, (byte) 21), brt.D(abuVar));
            case 20:
                b7u0 b7u0Var = (b7u0) parcelable;
                a7u0 a7u0Var = (a7u0) this.b.get();
                a7u0Var.getClass();
                ((rih1) obj).getClass();
                byp bypVar = new byp(a7u0Var, b7u0Var, q7r0Var);
                u9c0 u9c0VarQ = cto1.q(q7r0Var.d.c);
                los losVar6 = (los) ((jly0) bypVar.a).get();
                ywp ywpVar = (ywp) bypVar.h;
                ywp ywpVar2 = (ywp) bypVar.i;
                qyj qyjVar13 = (qyj) a7u0Var.h.get();
                c8o.l(qyjVar13);
                return new z6u0(u9c0VarQ, losVar6, ywpVar, ywpVar2, qyjVar13, b7u0Var);
            case 21:
                fqu0 fqu0Var = (fqu0) parcelable;
                ypu0 ypu0Var = (ypu0) this.b.get();
                ypu0Var.getClass();
                ((rih1) obj).getClass();
                qqp qqpVar3 = new qqp(ypu0Var, fqu0Var, q7r0Var);
                a8e0 a8e0VarA2 = ypu0Var.a();
                c8o.l(a8e0VarA2);
                gw70 gw70VarB4 = ypu0Var.b();
                c8o.l(gw70VarB4);
                pe peVarH4 = ypu0Var.h();
                c8o.l(peVarH4);
                c8o.l(ypu0Var.f());
                hvj hvjVar2 = new hvj(a8e0VarA2, new q3b1(gw70VarB4, peVarH4));
                String str = fqu0Var.a;
                c8o.m(str);
                Flowable flowable2 = (Flowable) ypu0Var.q.get();
                c8o.l(flowable2);
                kbd kbdVar = (kbd) ypu0Var.u.get();
                c8o.l(kbdVar);
                bpu0 bpu0Var = (bpu0) ypu0Var.o.get();
                c8o.l(bpu0Var);
                bfd bfdVar2 = (bfd) ypu0Var.v.get();
                c8o.l(bfdVar2);
                gdx0 gdx0Var = (gdx0) ypu0Var.m.get();
                c8o.l(gdx0Var);
                wmy wmyVar = new wmy(str, flowable2, kbdVar, bpu0Var, bfdVar2, gdx0Var);
                q8n q8nVar10 = (q8n) ypu0Var.a.get();
                c8o.l(q8nVar10);
                q8n q8nVar11 = (q8n) ypu0Var.b.get();
                c8o.l(q8nVar11);
                return new equ0(hvjVar2, fqu0Var, new dqu0(wmyVar, q8nVar10, q8nVar11), (xrp) qqpVar3.c);
            case 22:
                j3v0 j3v0Var = (j3v0) parcelable;
                i3v0 i3v0Var = (i3v0) this.b.get();
                i3v0Var.getClass();
                ((rih1) obj).getClass();
                wdm wdmVar = new wdm(i3v0Var, j3v0Var);
                ix81 ix81Var2 = (ix81) i3v0Var.b.get();
                c8o.l(ix81Var2);
                return new h3v0(ix81Var2, new n59((e3v0) ((jly0) wdmVar.X).get(), (l3v0) ((jly0) wdmVar.Z).get(), (kgr0) ((jly0) wdmVar.e).get(), (byte) 5), j3v0Var);
            case 23:
                r7v0 r7v0Var = (r7v0) parcelable;
                p7v0 p7v0Var = (p7v0) this.b.get();
                p7v0Var.getClass();
                ((rih1) obj).getClass();
                f0a f0aVar = new f0a(p7v0Var, r7v0Var, q7r0Var);
                ix81 ix81Var3 = (ix81) p7v0Var.a.get();
                c8o.l(ix81Var3);
                gj5 gj5Var = (gj5) p7v0Var.b.get();
                c8o.l(gj5Var);
                egs egsVar = new egs(gj5Var);
                kt91 kt91Var3 = (kt91) p7v0Var.g.get();
                c8o.l(kt91Var3);
                return new o7v0(ix81Var3, new n59(new zfr(egsVar, kt91Var3, (byte) 14), (dgs) ((jly0) f0aVar.Q0).get(), r7v0Var, (byte) 6), r7v0Var);
            case 24:
                rgv0 rgv0Var = (rgv0) this.b.get();
                rgv0Var.getClass();
                ((rih1) obj).getClass();
                qqp qqpVar4 = new qqp(rgv0Var, q7r0Var);
                los losVar7 = (los) ((jly0) qqpVar4.b).get();
                qyj qyjVar14 = (qyj) rgv0Var.a.get();
                c8o.l(qyjVar14);
                return new qgv0(losVar7, qyjVar14, new yqu0((jxp) qqpVar4.c));
            case 25:
                aov0 aov0Var = (aov0) this.b.get();
                aov0Var.getClass();
                ((rih1) obj).getClass();
                ix81 ix81VarA3 = aov0Var.a();
                c8o.l(ix81VarA3);
                gw70 gw70VarB5 = aov0Var.b();
                c8o.l(gw70VarB5);
                pe peVarH5 = aov0Var.h();
                c8o.l(peVarH5);
                c8o.l(aov0Var.f());
                qyj qyjVar15 = new qyj(ix81VarA3, new q3b1(gw70VarB5, peVarH5));
                il0 il0Var = (il0) aov0Var.f.get();
                c8o.l(il0Var);
                pcl pclVar = (pcl) aov0Var.d.get();
                c8o.l(pclVar);
                Context context2 = (Context) aov0Var.a.get();
                c8o.l(context2);
                kt91 kt91Var4 = (kt91) aov0Var.b.get();
                c8o.l(kt91Var4);
                xv61 xv61Var = (xv61) aov0Var.c.get();
                c8o.l(xv61Var);
                i9i1 i9i1Var = (i9i1) aov0Var.e.get();
                c8o.l(i9i1Var);
                return new znv0(new oj80(qyjVar15, new tm(il0Var, pclVar, new rwj(context2, kt91Var4, xv61Var, i9i1Var)), (byte) 9));
            case 26:
                ((tpv0) this.b.get()).getClass();
                ((rih1) obj).getClass();
                return new spv0((upv0) parcelable);
            case 27:
                return c(parcelable, q7r0Var, obj);
            case 28:
                hwv0 hwv0Var = (hwv0) this.b.get();
                hwv0Var.getClass();
                ((rih1) obj).getClass();
                tnm tnmVar = new tnm(hwv0Var, q7r0Var);
                los losVar8 = (los) ((jly0) tnmVar.d).get();
                ynb0 ynb0VarA2 = xqu.a((ywp) tnmVar.g);
                qyj qyjVar16 = (qyj) hwv0Var.d.get();
                c8o.l(qyjVar16);
                ywp ywpVar3 = (ywp) tnmVar.h;
                yzh1 yzh1Var = (yzh1) hwv0Var.e.get();
                c8o.l(yzh1Var);
                return new gwv0(losVar8, ynb0VarA2, qyjVar16, ywpVar3, yzh1Var);
            default:
                w2w0 w2w0Var = (w2w0) parcelable;
                v2w0 v2w0Var = (v2w0) this.b.get();
                v2w0Var.getClass();
                ((rih1) obj).getClass();
                em0 em0Var = new em0(v2w0Var, w2w0Var, q7r0Var);
                a8e0 a8e0Var3 = (a8e0) v2w0Var.c.get();
                c8o.l(a8e0Var3);
                kly0 kly0Var5 = v2w0Var.D;
                s4w0 s4w0Var = (s4w0) kly0Var5.get();
                c8o.l(s4w0Var);
                yqu0 yqu0Var = new yqu0(s4w0Var, (g0d0) ((jly0) em0Var.e).get(), (byte) 11);
                Scheduler scheduler = (Scheduler) v2w0Var.b.get();
                c8o.l(scheduler);
                kly0 kly0Var6 = v2w0Var.j;
                lzn0 lzn0Var4 = (lzn0) kly0Var6.get();
                c8o.l(lzn0Var4);
                kly0 kly0Var7 = v2w0Var.K;
                bbm bbmVar = (bbm) kly0Var7.get();
                c8o.l(bbmVar);
                kt91 kt91Var5 = (kt91) v2w0Var.o.get();
                c8o.l(kt91Var5);
                kly0 kly0Var8 = v2w0Var.g;
                dg30 dg30Var = (dg30) kly0Var8.get();
                c8o.l(dg30Var);
                dto0 dto0Var2 = (dto0) v2w0Var.E.get();
                c8o.l(dto0Var2);
                rh4 rh4VarN = em0Var.n();
                dg30 dg30Var2 = (dg30) kly0Var8.get();
                c8o.l(dg30Var2);
                tzx tzxVar = new tzx(kt91Var5, dg30Var, dto0Var2, rh4VarN, new Handler(dg30Var2.getMainLooper()), (byte) 1);
                ssf1 ssf1Var = (ssf1) v2w0Var.h.get();
                c8o.l(ssf1Var);
                tr41 tr41Var = new tr41(ssf1Var, (byte) 20);
                rd3 rd3Var = (rd3) v2w0Var.y.get();
                c8o.l(rd3Var);
                i4q i4qVar = (i4q) v2w0Var.z.get();
                c8o.l(i4qVar);
                qg7 qg7Var = new qg7(w2w0Var, rd3Var, i4qVar, (byte) 24);
                r5h r5hVar = (r5h) v2w0Var.u.get();
                c8o.l(r5hVar);
                s5e0 s5e0Var = new s5e0(r5hVar);
                lzn0 lzn0Var5 = (lzn0) kly0Var6.get();
                c8o.l(lzn0Var5);
                f5b f5bVar = new f5b(lzn0Var5, (byte) 16);
                kly0 kly0Var9 = v2w0Var.i;
                Context context3 = (Context) kly0Var9.get();
                c8o.l(context3);
                xh71 xh71Var = (xh71) v2w0Var.r.get();
                c8o.l(xh71Var);
                z0u0 z0u0Var = new z0u0(context3, xh71Var, (byte) 13);
                cp81 cp81Var = new cp81(em0Var.C0(), (byte) 8);
                s4w0 s4w0Var2 = (s4w0) kly0Var5.get();
                c8o.l(s4w0Var2);
                tuh1 tuh1Var = new tuh1(s4w0Var2, em0Var.e0());
                gr6 gr6Var = (gr6) v2w0Var.C.get();
                c8o.l(gr6Var);
                tr41 tr41Var2 = new tr41(gr6Var, (byte) 11);
                so soVar = new so((g0d0) ((jly0) em0Var.e).get(), new p3w0((ywp) em0Var.f, em0Var.o0()), (byte) 25);
                y390 y390Var = (y390) v2w0Var.H.get();
                c8o.l(y390Var);
                yh2 yh2Var = (yh2) v2w0Var.I.get();
                c8o.l(yh2Var);
                n2w0 n2w0Var = new n2w0(yqu0Var, new o0w0(scheduler, lzn0Var4, bbmVar, tzxVar, tr41Var, qg7Var, s5e0Var, f5bVar, z0u0Var, cp81Var, tuh1Var, tr41Var2, soVar, new lba(y390Var, yh2Var, em0Var.e0(), em0Var.o0())), (g0d0) ((jly0) em0Var.e).get());
                ywp ywpVar4 = (ywp) em0Var.f;
                zok0 zok0VarO0 = em0Var.o0();
                bbm bbmVar2 = (bbm) kly0Var7.get();
                c8o.l(bbmVar2);
                uip0 uip0Var = new uip0(new bfz(ywpVar4, zok0VarO0, bbmVar2), (byte) 20);
                kui0 kui0Var = new kui0((byte) 3);
                kui0 kui0Var2 = new kui0((byte) 4);
                kui0 kui0Var3 = new kui0((byte) 0);
                kui0 kui0Var4 = new kui0((byte) 1);
                kui0 kui0Var5 = new kui0((byte) 2);
                kly0 kly0Var10 = v2w0Var.e;
                xfx xfxVar = (xfx) kly0Var10.get();
                c8o.l(xfxVar);
                p4n p4nVar = new p4n(new uq8((byte) 21, false));
                xfx xfxVar2 = (xfx) kly0Var10.get();
                c8o.l(xfxVar2);
                xfx xfxVar3 = (xfx) kly0Var10.get();
                c8o.l(xfxVar3);
                egx egxVar = new egx(xfxVar3.b, (byte) 4);
                y9p y9pVar = (y9p) ((jly0) em0Var.g).get();
                ywp ywpVar5 = (ywp) em0Var.h;
                luk lukVar2 = (luk) v2w0Var.w.get();
                c8o.l(lukVar2);
                bjx bjxVar = new bjx(xfxVar, p4nVar, new agx(xfxVar2.c, egxVar, y9pVar, ywpVar5, new i3b(new w75(lukVar2), (byte) 8), (byte) 2), em0Var.e0(), (jly0) em0Var.t, new p3w0((ywp) em0Var.f, em0Var.o0()), (byte) 21);
                typ typVar = (typ) ((jly0) em0Var.X).get();
                rh4 rh4VarN2 = em0Var.n();
                kly0 kly0Var11 = v2w0Var.J;
                w62 w62Var = new w62(kui0Var, kui0Var2, kui0Var3, kui0Var4, kui0Var5, bjxVar, typVar, rh4VarN2, new hoc(((Boolean) kly0Var11.get()).booleanValue(), new goc(2131166868, 2131166868)), ((Boolean) kly0Var11.get()).booleanValue());
                xfx xfxVar4 = (xfx) kly0Var10.get();
                c8o.l(xfxVar4);
                woa woaVar = (woa) v2w0Var.m.get();
                c8o.l(woaVar);
                v290 v290Var = (v290) v2w0Var.n.get();
                c8o.l(v290Var);
                kma kmaVar = (kma) v2w0Var.k.get();
                c8o.l(kmaVar);
                ivj1 ivj1Var = new ivj1(woaVar, v290Var, kmaVar, em0Var.e0());
                gw70 gw70Var2 = (gw70) v2w0Var.A.get();
                c8o.l(gw70Var2);
                nww0 nww0Var = (nww0) v2w0Var.B.get();
                c8o.l(nww0Var);
                tzr0 tzr0Var = new tzr0(xfxVar4, ivj1Var, new af10(gw70Var2, nww0Var), em0Var.n(), (byte) 20);
                Context context4 = (Context) kly0Var9.get();
                c8o.l(context4);
                x0w0 x0w0Var = new x0w0(n2w0Var, uip0Var, w62Var, tzr0Var, new fp7(context4, ((Boolean) kly0Var11.get()).booleanValue()));
                xrc0 xrc0Var = (xrc0) v2w0Var.F.get();
                c8o.l(xrc0Var);
                RetrofitMaker retrofitMaker = (RetrofitMaker) v2w0Var.d.get();
                c8o.l(retrofitMaker);
                u0w0 u0w0Var = (u0w0) retrofitMaker.createWebgateService(u0w0.class, "android-prerelease-prerelease");
                o241 o241Var = (o241) v2w0Var.v.get();
                c8o.l(o241Var);
                aru0 aru0Var = new aru0(xrc0Var, u0w0Var, o241Var, (byte) 18);
                rsn0 rsn0Var = (rsn0) v2w0Var.s.get();
                c8o.l(rsn0Var);
                abm abmVar = (abm) v2w0Var.L.get();
                c8o.l(abmVar);
                return new u2w0(a8e0Var3, x0w0Var, aru0Var, w2w0Var, rsn0Var, abmVar, em0Var.n());
        }
    }
}
