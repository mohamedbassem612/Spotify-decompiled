package p;

import android.content.Intent;
import android.os.Parcel;
import android.view.ViewGroup;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.spotify.base.java.logging.Logger;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.pending_events.esperanto.proto.CommitPendingEventRequest;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class owf1 implements xi7, mkf1, Function, iui1, wej1, w7r0, BiFunction, ya, vy11, d9d0, h8q0 {
    public final /* synthetic */ byte a;
    public Object b;

    public owf1(float f, float f2, oe5 oe5Var) {
        this.a = (byte) 8;
        int[] iArr = gui1.a;
        this.b = new hce1((oe5Var == null && f == 1.0f && f2 == 1500.0f) ? xss.a : oe5Var != null ? new q881(f, f2, oe5Var) : new i2i1(f, f2));
    }

    public void a(String str) {
        oej1 oej1Var = (oej1) this.b;
        oej1Var.a.invoke(new fej1(oej1Var.b(str), str));
    }

    public void accept(Object obj, Object obj2) {
        bsd1 bsd1Var = (bsd1) obj2;
        i9n1 i9n1VarN = ((s9n1) obj).n();
        dxd1 dxd1Var = (dxd1) this.b;
        Parcel parcelS = i9n1VarN.s();
        p8n1.b(parcelS, dxd1Var);
        try {
            ((z7n1) i9n1VarN).a.transact(1, parcelS, null, 1);
            parcelS.recycle();
            bsd1Var.b((Object) null);
        } catch (Throwable th) {
            parcelS.recycle();
            throw th;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                p6h1 p6h1Var = (p6h1) this.b;
                a9h1 a9h1Var = ((b9h1) obj).c;
                pqh pqhVarN = CommitPendingEventRequest.n();
                pqhVarN.n(a9h1Var.a);
                pqhVarN.q(a9h1Var.b);
                return p6h1Var.a.callSingle("spotify.pending_events.esperanto.proto.PendingEvents", "CommitPendingEvent", pqhVarN.build()).map(xj20.W0).flatMapCompletable(e2x0.V0);
            case 5:
                ArrayList arrayList = ((e5z0) this.b).d;
                int iS = zno1.s(q7h.U(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(obj2, null);
                }
                return new x8z0(linkedHashMap);
            case 12:
                return Observable.timer(800L, TimeUnit.MILLISECONDS, (Scheduler) this.b).map(ytw0.t);
            case 13:
                j0l1 j0l1Var = (j0l1) obj;
                zsc zscVar = ((j1l1) this.b).o;
                return rqt0.F(o6x.a, new gqj1(zscVar, j0l1Var, (lnm) null, (byte) 8)).flatMap(new ilh1(j0l1Var, zscVar, (byte) 20)).flatMap(new qpj1(j0l1Var, zscVar, (byte) 10)).map(new i2i1(j0l1Var, (byte) 7)).onErrorReturn(new a1g1(j0l1Var, (byte) 13)).toObservable();
            default:
                Logger.e((Throwable) obj, "Assisted Curation: Failed to fetch Your Episodes next page", new Object[0]);
                return (ejr0) this.b;
        }
    }

    public boolean b() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v9 java.lang.Object, still in use, count: 2, list:
          (r1v9 java.lang.Object) from 0x004e: PHI (r1 I:??) = (r1v1 java.lang.Object), (r1v9 java.lang.Object) binds: [B:17:0x004d, B:44:0x004e] A[DONT_GENERATE, DONT_INLINE]
          (r1v9 java.lang.Object) from 0x003f: CHECK_CAST (p.l0l) (r1v9 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public void c(java.lang.Object r13) {
        /*
            r12 = this;
            byte r0 = r12.a
            switch(r0) {
                case 20: goto L1d;
                default: goto L5;
            }
        L5:
            java.lang.Object r12 = r12.b
            com.google.android.gms.common.data.DataHolder r12 = (com.google.android.gms.common.data.DataHolder) r12
            p.nwq r13 = (p.nwq) r13
            p.zyq r0 = new p.zyq     // Catch: java.lang.Throwable -> L17
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L17
            r13.b(r0)     // Catch: java.lang.Throwable -> L17
            r12.close()
            return
        L17:
            r0 = move-exception
            r13 = r0
            r12.close()
            throw r13
        L1d:
            p.ay40 r13 = (p.ay40) r13
            java.lang.Object r12 = r12.b
            p.b0u r12 = (p.b0u) r12
            java.lang.String r2 = r12.a
            p.g0l r0 = r13.b
            p.inr r0 = (p.inr) r0
            java.util.List r0 = r0.i()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            r3 = 0
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            r4 = r1
            p.l0l r4 = (p.l0l) r4
            java.lang.String r4 = r4.d()
            r5 = 0
            boolean r4 = p.nhc1.R(r2, r4, r5)
            if (r4 == 0) goto L33
            goto L4e
        L4d:
            r1 = r3
        L4e:
            p.l0l r1 = (p.l0l) r1
            if (r1 != 0) goto L54
            goto Lb6
        L54:
            int r0 = r12.c
            r4 = 4
            r5 = 1
            r6 = 2
            r7 = 3
            if (r0 == r5) goto L69
            if (r0 == r6) goto L66
            if (r0 == r7) goto L63
            r0 = r1
            r1 = r4
            goto L6b
        L63:
            r0 = r1
            r1 = r7
            goto L6b
        L66:
            r0 = r1
            r1 = r6
            goto L6b
        L69:
            r0 = r1
            r1 = r5
        L6b:
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r8 = r8.toString()
            p.by40 r9 = r13.c
            java.lang.String r10 = r0.d()
            p.t2j0 r9 = r9.a
            p.lut r11 = com.spotify.devicepredictability.googledevicesuggestionsimpl.events.proto.DevicePredictabilityIntentEngineSuggestion.n()
            r11.r(r8)
            if (r1 == r5) goto L94
            if (r1 == r6) goto L91
            if (r1 == r7) goto L8e
            if (r1 != r4) goto L8d
            java.lang.String r3 = "UNKNOWN"
            goto L96
        L8d:
            throw r3
        L8e:
            java.lang.String r3 = "HIGH"
            goto L96
        L91:
            java.lang.String r3 = "MID"
            goto L96
        L94:
            java.lang.String r3 = "LOW"
        L96:
            r11.n(r3)
            r11.q(r10)
            com.google.protobuf.h r3 = r11.build()
            r9.a(r3)
            p.dt71 r13 = r13.e
            r3 = r0
            p.sx40 r0 = new p.sx40
            java.lang.String r12 = r12.b
            java.lang.String r5 = r3.d()
            r3 = r12
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r13.a(r0)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.owf1.c(java.lang.Object):void");
    }

    public e711 d(ViewGroup viewGroup, Object obj, v1r0 v1r0Var, y3o0 y3o0Var) {
        qtw qtwVarA;
        kwl kwlVar;
        tp7 tp7Var = (tp7) ((lud0) this.b).b;
        if (tp7Var.a) {
            owp owpVar = (owp) tp7Var.e;
            d0r d0rVar = (d0r) tp7Var.f;
            switch (owpVar.a) {
                case 0:
                    p2p p2pVar = owpVar.b;
                    s24 s24Var = (s24) p2pVar.d;
                    uag1 uag1Var = (uag1) ((teq) ((nwp) s24Var.c).a.c).a.l2.get();
                    c8o.l(uag1Var);
                    o3e0 o3e0Var = new o3e0(uag1Var, (d0r) ((jly0) s24Var.Z).get());
                    toj0 toj0VarB = s24Var.B();
                    jqd0 jqd0VarJ0 = s24Var.j0();
                    lvc1 lvc1Var = new lvc1((Flowable) ((jly0) s24Var.f).get(), f2u0.D((Flowable) ((jly0) s24Var.e).get()));
                    aru0 aru0VarS = s24Var.S();
                    nwp nwpVar = (nwp) p2pVar.c;
                    s801 s801VarI0 = nwpVar.a.I0();
                    c8o.l(s801VarI0);
                    n6r0 n6r0Var = (n6r0) ((jly0) s24Var.h).get();
                    gw70 gw70VarA0 = nwpVar.a.a0();
                    c8o.l(gw70VarA0);
                    woa woaVarS = nwpVar.a.s();
                    c8o.l(woaVarS);
                    kma kmaVarR = nwpVar.a.r();
                    c8o.l(kmaVarR);
                    o7h1 o7h1Var = new o7h1((n6r0) ((jly0) s24Var.h).get(), (i8h1) ((nwp) s24Var.c).Z.get());
                    zhy zhyVarE = s24Var.E();
                    hwp hwpVar = (hwp) nwpVar.T1.get();
                    d4e0 d4e0Var = new d4e0((n6r0) ((jly0) s24Var.h).get(), (byte) 24);
                    hod0 hod0Var = new hod0((n6r0) ((jly0) s24Var.h).get(), (byte) 28);
                    boolean zA = s24Var.s().a();
                    boolean zB = s24Var.s().b();
                    oi oiVarC = s24Var.C();
                    d4q d4qVar = (d4q) ((teq) nwpVar.a.c).b.Bb.get();
                    c8o.l(d4qVar);
                    kwlVar = new kwl(d0rVar, o3e0Var, toj0VarB, jqd0VarJ0, lvc1Var, aru0VarS, s801VarI0, n6r0Var, gw70VarA0, woaVarS, kmaVarR, o7h1Var, zhyVarE, hwpVar, d4e0Var, hod0Var, zA, zB, oiVarC, d4qVar);
                    break;
                default:
                    p2q p2qVar = owpVar.b;
                    uw0 uw0Var = (uw0) p2qVar.e;
                    o3e0 o3e0Var2 = new o3e0((uag1) ((v5q) uw0Var.f).G6.get(), (d0r) ((jly0) uw0Var.N0).get());
                    toj0 toj0VarH = uw0Var.h();
                    jqd0 jqd0VarP = uw0Var.P();
                    lvc1 lvc1Var2 = new lvc1((Flowable) ((jly0) uw0Var.i).get(), f2u0.D((Flowable) ((jly0) uw0Var.h).get()));
                    aru0 aru0VarE = uw0Var.E();
                    v5q v5qVar = p2qVar.d;
                    s801 s801Var = (s801) v5qVar.H6.get();
                    n6r0 n6r0Var2 = (n6r0) ((jly0) uw0Var.X).get();
                    daq daqVar = p2qVar.b;
                    kwlVar = new kwl(d0rVar, o3e0Var2, toj0VarH, jqd0VarP, lvc1Var2, aru0VarE, s801Var, n6r0Var2, (gw70) daqVar.d8.get(), (woa) daqVar.W8.get(), (kma) daqVar.Od.get(), new o7h1((n6r0) ((jly0) uw0Var.X).get(), (i8h1) ((daq) uw0Var.e).A5.get()), ((vhy) ((v5q) uw0Var.f).ua.get()).a(new ruc0((n6r0) ((jly0) uw0Var.X).get(), (byte) 26)), (hwp) v5qVar.va.get(), new d4e0((n6r0) ((jly0) uw0Var.X).get(), (byte) 24), new hod0((n6r0) ((jly0) uw0Var.X).get(), (byte) 28), uw0Var.d().a(), uw0Var.d().b(), uw0Var.i(), (d4q) v5qVar.Ma.get());
                    break;
            }
            qtwVarA = f6o1.A(kwlVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        } else {
            qtwVarA = f6o1.A((maa) ((kly0) tp7Var.c).get(), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        }
        return new neg1(viewGroup, (pt) tp7Var.b, qtwVarA, (uym0) tp7Var.d, (v1k) tp7Var.g, (gkd) tp7Var.h, y3o0Var, (iac0) tp7Var.i, (sn4) tp7Var.j, (et90) tp7Var.k);
    }

    public long e(oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return ((hce1) this.b).e(oe5Var, oe5Var2, oe5Var3);
    }

    public oe5 g(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return ((hce1) this.b).g(j, oe5Var, oe5Var2, oe5Var3);
    }

    public k241 get() {
        return ((cck1) ((hck1) this.b).a(cck1.class)).b;
    }

    public void i(String str, String str2) {
        oej1 oej1Var = (oej1) this.b;
        oej1Var.a.invoke(new gej1(oej1Var.b(str), str, str2));
    }

    public void j(String str, String str2, m4m m4mVar) {
        oej1 oej1Var = (oej1) this.b;
        oej1Var.a.invoke(new dej1(oej1Var.b(str), str, str2, m4mVar));
    }

    public void k() {
        switch (this.a) {
            case 20:
                non1.m.c("Failed to notify listener for onDeviceSuggestionReceived", new Object[0]);
                break;
            default:
                ((DataHolder) this.b).close();
                break;
        }
    }

    public Single l(Intent intent, th61 th61Var) {
        Single singleJust;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        String strE = s4b1VarX.E();
        qwf1 qwf1Var = (qwf1) this.b;
        if (((ug4) ((d4e0) qwf1Var.X.b).b).a() && u890.j(s4b1VarX.n("feature"), "mvcdp")) {
            singleJust = rqt0.F(qwf1Var.Y, new pec1(qwf1Var, s4b1VarX, null, (byte) 26));
        } else {
            singleJust = Single.just(b8n0.a);
            singleJust.getClass();
        }
        return singleJust.flatMap(new hce1((Object) qwf1Var, (Object) s4b1VarX, (Object) strE, (Object) intent, (byte) 7));
    }

    public oe5 m(oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return ((hce1) this.b).m(oe5Var, oe5Var2, oe5Var3);
    }

    public oe5 n(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return ((hce1) this.b).n(j, oe5Var, oe5Var2, oe5Var3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r9 == r6) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(p.qbv r8, p.onm r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.owf1.o(p.qbv, p.onm):java.lang.Object");
    }

    public void onSuccess(Object obj) {
        pao1 pao1Var = (pao1) obj;
        pue0 pue0Var = jvn1.d;
        boolean z = false;
        if (pao1Var != null) {
            fco1 fco1Var = pao1Var.a.a;
            zod.s(fco1Var);
            if (fco1Var.a == 1) {
                z = true;
            }
        }
        ((bsd1) this.b).d(Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(String str, onm onmVar) {
        sxm1 sxm1Var;
        if (onmVar instanceof sxm1) {
            sxm1Var = (sxm1) onmVar;
            int i = sxm1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sxm1Var.c = i - Integer.MIN_VALUE;
            } else {
                sxm1Var = new sxm1(this, onmVar);
            }
        } else {
            sxm1Var = new sxm1(this, onmVar);
        }
        Object objJ = sxm1Var.a;
        int i2 = sxm1Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            mwm1 mwm1Var = (mwm1) this.b;
            ssm1 ssm1VarQ = YourLibraryContainsRequest.q();
            ssm1VarQ.q(str);
            Single singleA = mwm1Var.a(ssm1VarQ.build());
            sxm1Var.c = 1;
            objJ = fc11.j(singleA, sxm1Var);
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
        YourLibraryContainsResponseEntity yourLibraryContainsResponseEntity = (YourLibraryContainsResponseEntity) o7h.s0(((YourLibraryContainsResponse) objJ).o());
        return Boolean.valueOf(yourLibraryContainsResponseEntity != null ? yourLibraryContainsResponseEntity.o() : false);
    }

    public za61 q() {
        za61 za61Var = new za61();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            g4i1 g4i1Var = (g4i1) entry.getValue();
            if (g4i1Var.e) {
                za61Var.a(g4i1Var.a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        j2h1.o("UseCaseAttachState");
        return za61Var;
    }

    public Collection r() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            if (((g4i1) entry.getValue()).e) {
                arrayList.add(((g4i1) entry.getValue()).a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public Collection s() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            if (((g4i1) entry.getValue()).e) {
                arrayList.add(((g4i1) entry.getValue()).b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public boolean t(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (linkedHashMap.containsKey(str)) {
            return ((g4i1) linkedHashMap.get(str)).e;
        }
        return false;
    }

    public void u(String str, bb61 bb61Var, i4i1 i4i1Var, i29 i29Var, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (linkedHashMap.containsKey(str)) {
            g4i1 g4i1Var = new g4i1(bb61Var, i4i1Var, i29Var, list);
            g4i1 g4i1Var2 = (g4i1) linkedHashMap.get(str);
            g4i1Var.e = g4i1Var2.e;
            g4i1Var.f = g4i1Var2.f;
            linkedHashMap.put(str, g4i1Var);
        }
    }

    public boolean accept(Object obj) {
        return ((fn20) this.b).a.b();
    }

    public /* synthetic */ owf1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public owf1(AppMeasurementSdk appMeasurementSdk, oql oqlVar) {
        this.a = (byte) 22;
        this.b = oqlVar;
        appMeasurementSdk.a(new hql1(this));
    }

    public owf1(cjn1 cjn1Var, b0u b0uVar) {
        this.a = (byte) 20;
        this.b = b0uVar;
    }

    public owf1(sck1 sck1Var, q6e0 q6e0Var, u5b u5bVar) {
        this.a = (byte) 11;
        this.b = new hck1(sck1Var, new e931(q6e0Var, u5bVar, (byte) 1));
    }

    public owf1(String str) {
        this.a = (byte) 7;
        this.b = new LinkedHashMap();
    }

    public Object apply(Object obj, Object obj2) {
        Map map = (Map) obj2;
        znl1 znl1Var = (znl1) this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : (List) obj) {
            l0l l0lVar = (l0l) obj3;
            if (l0lVar.l() || l0lVar.n()) {
                if (!l0lVar.o() && !ihc1.y0(l0lVar.d())) {
                    arrayList.add(obj3);
                }
            }
        }
        List<l0l> listA1 = o7h.a1(arrayList, znl1Var.e.a(map));
        ArrayList arrayList2 = new ArrayList(q7h.U(listA1, 10));
        for (l0l l0lVar2 : listA1) {
            arrayList2.add(new dpt(l0lVar2.d(), l0lVar2.getName(), l0lVar2.getType().toString(), l0lVar2.E(), l0lVar2.s(), l0lVar2.l() ? null : (Long) map.get(znl1Var.f.a(l0lVar2.d())), Boolean.valueOf(l0lVar2.l())));
        }
        return arrayList2;
    }
}
