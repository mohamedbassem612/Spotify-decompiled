package p;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import com.spotify.adsdisplay.products.cmp.CMPActivity;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.podcastinteractivity.commentssheetimpl.page.CommentsSheetPageParameters;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class em0 implements s180, cdr0, and, dl4, t2x {
    public Object X;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    public em0(qe41 qe41Var, ViewGroup viewGroup, iac0 iac0Var, String str, tp60 tp60Var, wo60 wo60Var, wen0 wen0Var, aks0 aks0Var, rsm0 rsm0Var, wl7 wl7Var, i8h1 i8h1Var, nip nipVar, hun0 hun0Var, ew5 ew5Var, lzn0 lzn0Var, c690 c690Var, n431 n431Var, s331 s331Var, mr20 mr20Var, fkk1 fkk1Var, m25 m25Var, kly0 kly0Var) {
        this.a = (byte) 12;
        this.b = viewGroup;
        this.c = iac0Var;
        this.d = tp60Var;
        this.e = wo60Var;
        this.f = wen0Var;
        this.g = rqt0.u(new x010(mr20Var, rqt0.u(new nwd(iac0Var.getLifecycle().c(), (byte) 9)), new vm0(3, (lnm) null, (byte) 7), (byte) 1));
        this.h = new byp(qe41Var, viewGroup.getContext(), new qp60(aks0Var, rsm0Var, wl7Var, nipVar, hun0Var, ew5Var, i8h1Var, m25Var), str, lzn0Var, c690Var, n431Var, s331Var, fkk1Var, new q01(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 28));
    }

    public uwh A() {
        return (uwh) ((daq) this.b).Wq.get();
    }

    public a1r0 A0() {
        return (a1r0) ((teq) this.c).V0.get();
    }

    public Scheduler B() {
        return (Scheduler) ((daq) this.b).r3.get();
    }

    public t8u0 B0() {
        return (t8u0) ((daq) this.b).d9.get();
    }

    public ps7 C() {
        RetrofitMaker retrofitMaker = (RetrofitMaker) ((kpk) this.d).c.get();
        c8o.l(retrofitMaker);
        return new ps7((mrk) retrofitMaker.createWebgateService(mrk.class, "android-liveevents-datasource"), (byte) 26);
    }

    public ruz C0() {
        t8u0 t8u0Var = (t8u0) ((v2w0) this.b).f.get();
        c8o.l(t8u0Var);
        return t8u0Var.a(((q7r0) this.c).d.c.getLifecycle()).a();
    }

    public luk D() {
        return (luk) ((daq) this.b).L1.get();
    }

    public mr20 D0() {
        return (mr20) ((daq) this.b).u5.get();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object E(String str, onm onmVar) {
        xwl xwlVar;
        Object value;
        Object value2;
        Object value3;
        String str2;
        if (onmVar instanceof xwl) {
            xwlVar = (xwl) onmVar;
            int i = xwlVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xwlVar.d = i - Integer.MIN_VALUE;
            } else {
                xwlVar = new xwl(this, onmVar);
            }
        } else {
            xwlVar = new xwl(this, onmVar);
        }
        Object obj = xwlVar.b;
        int i2 = xwlVar.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                str = xwlVar.a;
                hm5.M(obj);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = xwlVar.a;
                hm5.M(obj);
            }
            ((toj0) this.d).f(str2);
            return rih1Var;
        }
        hm5.M(obj);
        bpb1 bpb1Var = (bpb1) this.h;
        do {
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, str));
        fn31.T(cto1.q((iac0) this.g), (o8n) null, 0, new cuk(this, str, (lnm) null, (byte) 11), 3);
        aru0 aru0Var = (aru0) this.c;
        xwlVar.a = str;
        xwlVar.d = 1;
        if (aru0Var.n(str, xwlVar) != d9nVar) {
        }
        return d9nVar;
        String str3 = str;
        bpb1 bpb1Var2 = (bpb1) ((jqd0) this.f).c;
        do {
            value2 = bpb1Var2.getValue();
        } while (!bpb1Var2.k(value2, str3));
        asn asnVar = (asn) this.e;
        xwlVar.a = str3;
        xwlVar.d = 2;
        bpb1 bpb1Var3 = (bpb1) ((lvc1) asnVar.b).c;
        do {
            value3 = bpb1Var3.getValue();
        } while (!bpb1Var3.k(value3, str3));
        Object objB = ((b6e0) asnVar.a).b(str3, xwlVar);
        if (objB != d9nVar) {
            objB = rih1Var;
        }
        if (objB != d9nVar) {
            str2 = str3;
            ((toj0) this.d).f(str2);
            return rih1Var;
        }
        return d9nVar;
    }

    public Flowable E0() {
        return (Flowable) ((daq) this.b).D5.get();
    }

    public unr F() {
        return (unr) ((teq) this.c).a.Db.get();
    }

    public FlowableMap F0() {
        return f2u0.D((Flowable) ((jly0) this.d).get());
    }

    public aor G() {
        return (aor) ((teq) this.c).a.Mb.get();
    }

    public waz0 G0() {
        return (waz0) ((daq) this.b).Kc.get();
    }

    public ror H() {
        return (ror) ((daq) this.b).a.F1.get();
    }

    public t701 H0() {
        return (t701) ((teq) this.c).a.Y.get();
    }

    public i4q I() {
        return (i4q) ((teq) this.c).t2.get();
    }

    public s801 I0() {
        return (s801) ((teq) this.c).a.U6.get();
    }

    public String J(String str) {
        if (str != null) {
            if (ihc1.y0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return ((yo2) this.b).h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object J0(onm onmVar) {
        fo2 fo2Var;
        spq0 spq0VarTrack;
        ContextTrack contextTrack;
        if (onmVar instanceof fo2) {
            fo2Var = (fo2) onmVar;
            int i = fo2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fo2Var.c = i - Integer.MIN_VALUE;
            } else {
                fo2Var = new fo2(this, onmVar);
            }
        } else {
            fo2Var = new fo2(this, onmVar);
        }
        Object objO = fo2Var.a;
        int i2 = fo2Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                qm qmVar = new qm(this, (lnm) null, (byte) 17);
                fo2Var.c = 1;
                objO = rc2.O(500L, qmVar, fo2Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            PlayerState playerState = (PlayerState) objO;
            if (playerState != null && (spq0VarTrack = playerState.track()) != null && (contextTrack = (ContextTrack) spq0VarTrack.h()) != null) {
                return contextTrack.uri();
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return null;
    }

    public q8n K() {
        return (q8n) ((daq) this.b).r2.get();
    }

    public rh11 K0() {
        return (rh11) ((daq) this.b).ia.get();
    }

    public void L() {
        air0 air0Var = (air0) this.t;
        if (air0Var != null) {
            air0Var.a();
        }
        dcr0 dcr0Var = (dcr0) this.i;
        if (dcr0Var != null) {
            dcr0Var.a();
        }
        bo41 bo41Var = (bo41) this.X;
        if (bo41Var != null) {
            bo41Var.a.getLifecycle().d(bo41Var.c);
            bo41Var.b.i(w8c0.a);
        }
        this.X = null;
    }

    public Resources L0() {
        return (Resources) ((teq) this.c).N0.get();
    }

    public void M(iu30 iu30Var) {
        ((b8p1) this.b).j(iu30Var);
    }

    public RetrofitMaker M0() {
        return (RetrofitMaker) ((daq) this.b).Y3.get();
    }

    public csy N() {
        return (csy) ((daq) this.b).Vp.get();
    }

    public o241 N0() {
        return (o241) ((daq) this.b).u4.get();
    }

    public uvy O() {
        return (uvy) ((teq) this.c).a.o5.get();
    }

    public hq41 O0() {
        return (hq41) ((teq) this.c).ug.get();
    }

    public uu00 P() {
        return (uu00) ((daq) this.b).a5.get();
    }

    public void P0(jx11 jx11Var) {
        if (jx11Var == W()) {
            return;
        }
        ((hrr0) this.c).setValue(jx11Var);
        ((hrr0) this.d).setValue((Object) null);
        ((hrr0) this.e).setValue((Object) null);
        ((bpb1) this.f).m(null, new vfm0(jx11Var));
        bpb1 bpb1Var = (bpb1) this.t;
        jx11 jx11VarW = W();
        bpb1Var.m(null, nhc1.W(jx11VarW.a, "{id}", (String) this.b));
    }

    public vd0 Q(rcr0 rcr0Var) {
        ArrayList arrayList = ((vfr0) ((jkp0) this.c).b).c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList arrayList3 = ((ufr0) it.next()).c;
            ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((rfr0) it2.next()).a);
            }
            r7h.W(arrayList4, arrayList2);
        }
        return new vd0((mr20[]) o7h.l1(arrayList2).toArray(new mr20[0]), rcr0Var, this, (byte) 11);
    }

    public void Q0(HashMap map) {
        this.g = map;
    }

    public mnk0 R() {
        return (mnk0) ((teq) this.c).b6.get();
    }

    public void R0(Integer num) {
        this.c = num;
    }

    public Flowable S() {
        return ((Flowable) ((jly0) this.d).get()).j(mo9.O0);
    }

    public void S0(rax raxVar) {
        if (raxVar != null) {
            this.d = raxVar;
        } else {
            bhn0.i("Null encodedPayload");
        }
    }

    public me30 T() {
        return (me30) ((daq) this.b).w7.get();
    }

    public void T0(long j) {
        this.e = Long.valueOf(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable U(String str, ArrayList arrayList, onm onmVar) {
        maf mafVar;
        em0 em0Var;
        LinkedHashMap linkedHashMap;
        if (onmVar instanceof maf) {
            mafVar = (maf) onmVar;
            int i = mafVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mafVar.e = i - Integer.MIN_VALUE;
            } else {
                mafVar = new maf(this, onmVar);
            }
        } else {
            mafVar = new maf(this, onmVar);
        }
        Object objB = mafVar.c;
        int i2 = mafVar.e;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                r630 r630Var = (r630) this.c;
                i430 i430VarC = r630Var.c(pcf.j(str));
                if (i430VarC != null) {
                    r630Var.a(i430.a(i430VarC, false));
                }
                int iS = zno1.s(q7h.U(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w4i1 w4i1Var = ((jwm) it.next()).a;
                    linkedHashMap2.put(w4i1Var.a, w4i1Var);
                }
                j0a1 j0a1Var = (j0a1) this.g;
                List listL1 = o7h.l1(linkedHashMap2.keySet());
                mafVar.a = this;
                mafVar.b = linkedHashMap2;
                mafVar.e = 1;
                objB = j0a1Var.b(str, listL1, yn11.e, mafVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
                em0Var = this;
                linkedHashMap = linkedHashMap2;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                linkedHashMap = mafVar.b;
                em0Var = mafVar.a;
                hm5.M(objB);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : ((Map) objB).entrySet()) {
                String str2 = (String) entry.getKey();
                boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                w4i1 w4i1Var2 = (w4i1) linkedHashMap.get(str2);
                if (w4i1Var2 != null) {
                    String str3 = w4i1Var2.e;
                    i430 i430VarC2 = ((r630) em0Var.c).c(str3);
                    ((r630) em0Var.c).a(i430VarC2 != null ? i430.a(i430VarC2, zBooleanValue) : new i430(str3, 26, zBooleanValue));
                    if (zBooleanValue) {
                        arrayList2.add(w4i1Var2);
                    }
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            if (e331.a(new m231(th)) != null) {
                return z6x.a;
            }
            jah.d();
            return null;
        }
    }

    public void U0(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null transportName");
        }
    }

    public six0 V() {
        return (six0) ((teq) this.c).E8.get();
    }

    public void V0(long j) {
        this.f = Long.valueOf(j);
    }

    public jx11 W() {
        return (jx11) ((hrr0) this.c).getValue();
    }

    public f771 W0() {
        return (f771) ((teq) this.c).p4.get();
    }

    public dma1 X() {
        return (dma1) ((daq) this.b).C1.get();
    }

    public xh71 X0() {
        return (xh71) ((teq) this.c).N3.get();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object Y(sn2 sn2Var, iu30 iu30Var, onm onmVar) {
        yn2 yn2Var;
        String str;
        iu30 iu30Var2;
        Object objI1;
        Object objU0;
        iu30 iu30Var3;
        boolean z;
        sn2 sn2Var2 = sn2Var;
        fq2 fq2Var = (yo2) this.b;
        if (onmVar instanceof yn2) {
            yn2Var = (yn2) onmVar;
            int i = yn2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                yn2Var.g = i - Integer.MIN_VALUE;
            } else {
                yn2Var = new yn2(this, onmVar);
            }
        } else {
            yn2Var = new yn2(this, onmVar);
        }
        Object obj = yn2Var.e;
        int i2 = yn2Var.g;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            str = sn2Var2.d;
            if (!sn2Var2.h) {
                fq2Var.B(true);
            }
            yn2Var.a = sn2Var2;
            iu30Var2 = iu30Var;
            yn2Var.b = iu30Var2;
            yn2Var.c = str;
            yn2Var.g = 1;
            objI1 = i1(sn2Var2, yn2Var);
            if (objI1 != d9nVar) {
            }
        }
        if (i2 == 1) {
            String str2 = yn2Var.c;
            iu30Var2 = yn2Var.b;
            sn2 sn2Var3 = yn2Var.a;
            hm5.M(obj);
            str = str2;
            sn2Var2 = sn2Var3;
            objI1 = obj;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                if (i2 == 4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                if (i2 == 5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = yn2Var.d;
            iu30Var3 = yn2Var.b;
            hm5.M(obj);
        }
        yn2Var.a = null;
        yn2Var.b = null;
        yn2Var.c = null;
        yn2Var.d = z;
        yn2Var.g = 3;
        return iu30Var3.invoke(yn2Var) == d9nVar ? d9nVar : rih1Var;
        boolean zBooleanValue = ((Boolean) objI1).booleanValue();
        boolean z2 = sn2Var2.h;
        String str3 = sn2Var2.k;
        if (!z2) {
            if (str != null && j1p1.t(str)) {
                fq2Var.B(false);
                String strJ = J(str3);
                yn2Var.a = null;
                yn2Var.b = iu30Var2;
                yn2Var.c = null;
                yn2Var.d = zBooleanValue;
                yn2Var.g = 2;
                if (y0(strJ, null, yn2Var, false) != d9nVar) {
                    iu30Var3 = iu30Var2;
                    z = zBooleanValue;
                    yn2Var.a = null;
                    yn2Var.b = null;
                    yn2Var.c = null;
                    yn2Var.d = z;
                    yn2Var.g = 3;
                    if (iu30Var3.invoke(yn2Var) == d9nVar) {
                    }
                }
            } else if (str != null) {
                fq2Var.B(false);
                yn2Var.a = null;
                yn2Var.b = null;
                yn2Var.c = null;
                yn2Var.d = zBooleanValue;
                yn2Var.g = 4;
                if (s0(str, yn2Var) == d9nVar) {
                }
            } else {
                String str4 = sn2Var2.a;
                String str5 = sn2Var2.e;
                yn2Var.a = null;
                yn2Var.b = null;
                yn2Var.c = null;
                yn2Var.d = zBooleanValue;
                yn2Var.g = 5;
                if (str5 != null) {
                    if (str5.length() == 0) {
                        fq2Var.B(false);
                    } else {
                        fq2Var.B(false);
                        objU0 = u0(str5, str3, yn2Var, iu30Var2);
                        if (objU0 != d9nVar) {
                        }
                    }
                    objU0 = rih1Var;
                } else if (zBooleanValue) {
                    objU0 = r0(str4, yn2Var);
                    if (objU0 != d9nVar) {
                        objU0 = rih1Var;
                    }
                } else {
                    fq2Var.B(false);
                    objU0 = y0(J(str3), null, yn2Var, false);
                    if (objU0 != d9nVar) {
                        objU0 = rih1Var;
                    }
                }
                if (objU0 == d9nVar) {
                }
            }
        }
    }

    public hs71 Y0() {
        return (hs71) ((teq) this.c).V6.get();
    }

    public boolean Z() {
        ruf0 ruf0Var = (ruf0) this.b;
        luk lukVar = (luk) ruf0Var.n.get();
        c8o.l(lukVar);
        return td70.b(new qm4(false, lukVar), ((Boolean) ruf0Var.v.get()).booleanValue());
    }

    public dma1 Z0() {
        return (dma1) ((daq) this.b).C5.get();
    }

    public long a(long j) {
        return ((b8p1) this.b).a(j);
    }

    public gw70 a0() {
        return (gw70) ((daq) this.b).d8.get();
    }

    public y991 a1() {
        return (y991) ((teq) this.c).C4.get();
    }

    public tcr0 b() {
        return (tcr0) ((idd1) this.X).getValue();
    }

    public q8n b0() {
        return (q8n) ((daq) this.b).E1.get();
    }

    public vl91 b1() {
        yiq yiqVar = ((teq) this.c).b;
        daq daqVar = yiqVar.a;
        ip91 ip91Var = (ip91) daqVar.g8.get();
        jo91 jo91Var = (jo91) daqVar.r7.get();
        teq teqVar = yiqVar.b;
        return new vl91(ip91Var, jo91Var, (co91) teqVar.Y6.get(), (jp91) teqVar.P5.get(), (tp91) daqVar.t7.get(), (u3q) teqVar.ng.get());
    }

    public q2x c() {
        v5q v5qVar = (v5q) this.d;
        dwp dwpVar = (dwp) v5qVar.Ja.get();
        gwp gwpVar = (gwp) v5qVar.Ka.get();
        daq daqVar = v5qVar.b;
        d1x d1xVarK = daqVar.a.k();
        tjq tjqVar = new tjq((z1x) v5qVar.H4.get(), v5qVar.s(), dwpVar, gwpVar, f42.u((qxo) daqVar.a.a.kb.get()), d1xVarK);
        daq daqVar2 = (daq) this.c;
        return new q2x(tjqVar, new lud0(new vi11((gw70) daqVar2.d8.get(), (d0r) ((jly0) this.e).get(), new uym0(f2u0.j((Flowable) ((jly0) this.f).get()), (Flowable) ((jly0) this.i).get(), ((Flowable) ((jly0) this.f).get()).j(mo9.O0), (w9u0) ((jly0) this.t).get(), (d0r) ((jly0) this.e).get()), new et90(new xu4(false, (luk) daqVar2.L1.get()), f2u0.f((Flowable) ((jly0) this.f).get()), (cbv) daqVar2.vq.get()), v5qVar.i(), (byte) 14), (byte) 2), (rup) ((jly0) this.X).get());
    }

    public c3s c0() {
        return (c3s) ((daq) this.b).e6.get();
    }

    public yp91 c1() {
        switch (this.a) {
            case 21:
                j3q j3qVar = (j3q) this.b;
                uvy uvyVar = (uvy) j3qVar.c.a.o5.get();
                c8o.l(uvyVar);
                luk lukVarA = j3qVar.a();
                c8o.l(lukVarA);
                yu4 yu4Var = new yu4(false, lukVarA);
                q8n q8nVar = (q8n) j3qVar.b.E1.get();
                c8o.l(q8nVar);
                return new yp91(F0(), uvyVar, yu4Var, q8nVar);
            default:
                j3q j3qVar2 = (j3q) this.b;
                uvy uvyVar2 = (uvy) j3qVar2.c.a.o5.get();
                c8o.l(uvyVar2);
                luk lukVarA2 = j3qVar2.a();
                c8o.l(lukVarA2);
                yu4 yu4Var2 = new yu4(false, lukVarA2);
                q8n q8nVar2 = (q8n) j3qVar2.b.E1.get();
                c8o.l(q8nVar2);
                return new yp91(f2u0.D((Flowable) ((jly0) this.d).get()), uvyVar2, yu4Var2, q8nVar2);
        }
    }

    public int d() {
        return ((b8p1) this.c).d();
    }

    public c9c0 d0() {
        return (c9c0) ((daq) this.b).Ed.get();
    }

    public kt91 d1() {
        return (kt91) ((daq) this.b).f8.get();
    }

    public long e(long j) {
        return ((b8p1) this.b).e(j);
    }

    public iac0 e0() {
        iac0 iac0Var = ((q7r0) this.c).d.c;
        c8o.m(iac0Var);
        return iac0Var;
    }

    public Bundle e1() {
        dcr0 dcr0Var = (dcr0) this.i;
        mmr0 mmr0Var = new mmr0("runtime", dcr0Var != null ? dcr0Var.e() : null);
        air0 air0Var = (air0) this.t;
        return mno1.h(new mmr0[]{mmr0Var, new mmr0("ui_runtime", air0Var != null ? air0Var.d() : null)});
    }

    public mr20 f() {
        return (mr20) this.X;
    }

    public byp f0() {
        ruf0 ruf0Var = (ruf0) this.b;
        Resources resources = (Resources) ruf0Var.c.get();
        c8o.l(resources);
        dxz0 dxz0Var = (dxz0) ruf0Var.d.get();
        c8o.l(dxz0Var);
        return new byp(resources, dxz0Var);
    }

    public pta1 f1() {
        return (pta1) ((daq) this.b).Q9.get();
    }

    public pe g() {
        return (pe) ((daq) this.b).p9.get();
    }

    public q8n g0() {
        return (q8n) ((daq) this.b).V2.get();
    }

    public lua1 g1() {
        return (lua1) ((teq) this.c).b.z.get();
    }

    public ao0 h() {
        return (ao0) ((daq) this.b).Hk.get();
    }

    public Scheduler h0() {
        return (Scheduler) ((daq) this.b).z1.get();
    }

    public fza1 h1() {
        return (fza1) ((daq) this.b).Df.get();
    }

    public void i(int i, String str) {
        HashMap map = (HashMap) this.g;
        if (map != null) {
            map.put(str, String.valueOf(i));
        } else {
            eg.m("Property \"autoMetadata\" has not been set");
        }
    }

    public t2j0 i0() {
        return (t2j0) ((daq) this.b).f2.get();
    }

    /* JADX WARN: Code duplicated, block: B:71:0x019e A[Catch: Exception -> 0x01a5, CancellationException -> 0x01b1, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x01b1, Exception -> 0x01a5, blocks: (B:14:0x004f, B:69:0x019a, B:71:0x019e, B:19:0x006a, B:27:0x00a5, B:29:0x00d1, B:30:0x00d3, B:32:0x00d7, B:35:0x00dd, B:38:0x00e3, B:39:0x00e5, B:41:0x00f1, B:44:0x00f8, B:46:0x00ff, B:49:0x0106, B:50:0x010b, B:52:0x011d, B:53:0x0122, B:55:0x0131, B:57:0x0135, B:60:0x013b, B:62:0x0148, B:66:0x0150, B:23:0x007c), top: B:79:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public Object i1(sn2 sn2Var, onm onmVar) {
        go2 go2Var;
        boolean z;
        gv41 gv41Var;
        String str;
        String str2;
        Long l;
        ijg1 ijg1Var;
        List list;
        String str3;
        boolean z2;
        ou80 ou80Var;
        sn2 sn2Var2 = sn2Var;
        fq2 fq2Var = (yo2) this.b;
        if (onmVar instanceof go2) {
            go2Var = (go2) onmVar;
            int i = go2Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                go2Var.t = i - Integer.MIN_VALUE;
            } else {
                go2Var = new go2(this, onmVar);
            }
        } else {
            go2Var = new go2(this, onmVar);
        }
        go2 go2Var2 = go2Var;
        Object obj = go2Var2.h;
        int i2 = go2Var2.t;
        d9n d9nVar = d9n.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    List list2 = go2Var2.g;
                    ijg1Var = go2Var2.f;
                    l = go2Var2.e;
                    str2 = go2Var2.d;
                    str = go2Var2.c;
                    gv41Var = go2Var2.b;
                    sn2 sn2Var3 = go2Var2.a;
                    hm5.M(obj);
                    list = list2;
                    sn2Var2 = sn2Var3;
                } else {
                    if (i2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Map map = go2Var2.g;
                    String str4 = go2Var2.f;
                    jre jreVar = go2Var2.d;
                    sgt0 sgt0Var = go2Var2.b;
                    sn2 sn2Var4 = go2Var2.a;
                    hm5.M(obj);
                    sn2Var2 = sn2Var4;
                    z2 = true;
                }
                if (sn2Var2.i) {
                    fq2Var.x();
                }
                z = z2;
                return Boolean.valueOf(z);
            }
            hm5.M(obj);
            gv41Var = gv41.a;
            str = sn2Var2.a;
            str2 = sn2Var2.b;
            l = sn2Var2.c;
            ijg1Var = sn2Var2.f;
            List list3 = sn2Var2.g;
            go2Var2.a = sn2Var2;
            go2Var2.b = gv41Var;
            go2Var2.c = str;
            go2Var2.d = str2;
            go2Var2.e = l;
            go2Var2.f = ijg1Var;
            go2Var2.g = list3;
            go2Var2.t = 1;
            Object objJ0 = J0(go2Var2);
            if (objJ0 == d9nVar) {
                return d9nVar;
            }
            list = list3;
            obj = objJ0;
            ijg1 ijg1Var2 = ijg1Var;
            Long l2 = l;
            String str5 = str2;
            String str6 = str;
            gv41Var.getClass();
            sgt0 sgt0VarA = gv41.a(str6, str5, l2, ijg1Var2, list, (String) obj);
            zpz zpzVarY = EsPlayOrigin$PlayOrigin.y();
            zpzVarY.s("martini");
            EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = (EsPlayOrigin$PlayOrigin) zpzVarY.build();
            hre hreVar = (jre) fq2Var.s.a.getValue();
            String strQ = too1.q(hreVar);
            if (strQ == null) {
                strQ = sn2Var2.k;
            }
            hre hreVar2 = hreVar instanceof hre ? hreVar : null;
            String str7 = hreVar2 != null ? hreVar2.c : null;
            if (str7 == null) {
                str7 = sn2Var2.l;
            }
            xkg0 xkg0Var = new xkg0();
            xkg0Var.put("agentic_product_type", "martini");
            if (strQ != null && !ihc1.y0(strQ)) {
                xkg0Var.put("martini_conversation_id", strQ);
            }
            if (str7 != null && !ihc1.y0(str7)) {
                xkg0Var.put("play_context_decision_id", str7);
            }
            xkg0 xkg0VarB = xkg0Var.b();
            EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsG = lcc.G(sgt0VarA, sn2Var2.i);
            wpz wpzVarO = EsPlayOptions.PlayOptions.o();
            if (sgt0VarA instanceof ogt0) {
                wpzVarO.r(ypz.c);
            }
            EsPlayOptions.PlayOptions playOptionsBuild = wpzVarO.build();
            coz cozVarR = EsLoggingParams.LoggingParams.r();
            tv80 tv80Var = sn2Var2.j;
            if (tv80Var == null || (ou80Var = tv80Var.a) == null || (str3 = ou80Var.a) == null) {
                str3 = "chat-bubble-autoplay";
            }
            cozVarR.n(str3);
            y6r0 y6r0Var = ((b7r0) this.h).get();
            String str8 = y6r0Var != null ? y6r0Var.a : null;
            if (str8 == null) {
                str8 = "";
            }
            cozVarR.q(str8);
            qpz qpzVarP = EsOptional$OptionalInt64.p();
            qpzVarP.n(((yqg) this.g).b());
            cozVarR.t(qpzVarP);
            EsLoggingParams.LoggingParams loggingParamsBuild = cozVarR.build();
            xrc0 xrc0Var = (xrc0) this.f;
            String contextUri = sgt0VarA.getContextUri();
            esPlayOrigin$PlayOrigin.getClass();
            loggingParamsBuild.getClass();
            go2Var2.a = sn2Var2;
            go2Var2.b = null;
            go2Var2.c = null;
            go2Var2.d = null;
            go2Var2.e = null;
            go2Var2.f = null;
            go2Var2.g = null;
            go2Var2.t = 2;
            z2 = true;
            if (xrc0.b(xrc0Var, contextUri, null, preparePlayOptionsG, esPlayOrigin$PlayOrigin, playOptionsBuild, xkg0VarB, loggingParamsBuild, null, go2Var2, 130) == d9nVar) {
                return d9nVar;
            }
            if (sn2Var2.i) {
                fq2Var.x();
            }
            z = z2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Failed to start playback", e2);
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void j(String str, String str2) {
        HashMap map = (HashMap) this.g;
        if (map != null) {
            map.put(str, str2);
        } else {
            eg.m("Property \"autoMetadata\" has not been set");
        }
    }

    public rxj0 j0() {
        return (rxj0) ((teq) this.c).Y5.get();
    }

    public ssf1 j1() {
        return (ssf1) ((teq) this.c).g6.get();
    }

    public oj3 k() {
        return (oj3) ((teq) this.c).k1.get();
    }

    public z6k0 k0() {
        return (z6k0) ((teq) this.c).Z5.get();
    }

    public ufg1 k1() {
        return (ufg1) ((daq) this.b).xq.get();
    }

    public fl3 l() {
        return (fl3) ((teq) this.c).b.xb.get();
    }

    public xok0 l0() {
        return new xok0(l1d.m("spotify:chat:", ((umf) this.c).a), (byte) 15);
    }

    public yjj1 l1() {
        return (yjj1) ((daq) this.b).zq.get();
    }

    public Activity m() {
        return (Activity) ((teq) this.c).f.a;
    }

    public pdl0 m0() {
        return new pdl0(kmq0.p((b4p0) ((j3q) this.b).d.b).path(), nik1.n1.a, (byte) 1);
    }

    public xyl1 m1() {
        return (xyl1) ((teq) this.c).tg.get();
    }

    public rh4 n() {
        luk lukVar = (luk) ((v2w0) this.b).w.get();
        c8o.l(lukVar);
        return new rh4(lukVar);
    }

    public pdl0 n0() {
        return new pdl0(kmq0.p((b4p0) ((j3q) this.b).d.b).path(), nik1.n1.a, (byte) 3);
    }

    public kn4 o() {
        switch (this.a) {
            case 21:
                luk lukVarA = ((j3q) this.b).a();
                c8o.l(lukVarA);
                return new kn4(false, lukVarA);
            default:
                luk lukVarA2 = ((j3q) this.b).a();
                c8o.l(lukVarA2);
                return new kn4(false, lukVarA2);
        }
    }

    public zok0 o0() {
        w2w0 w2w0Var = (w2w0) this.d;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new zok0(yon1.h4().c, w2w0Var.a);
    }

    public vu4 p() {
        switch (this.a) {
            case 21:
                luk lukVarA = ((j3q) this.b).a();
                c8o.l(lukVarA);
                return new vu4(false, false, false, lukVarA);
            case 22:
                luk lukVar = (luk) ((j3q) this.b).b.L1.get();
                c8o.l(lukVar);
                return new vu4(false, false, false, lukVar);
            case 23:
                luk lukVarA2 = ((j3q) this.b).a();
                c8o.l(lukVarA2);
                return new vu4(false, false, false, lukVarA2);
            default:
                return new vu4(false, false, false, (luk) ((daq) this.c).L1.get());
        }
    }

    public msm0 p0() {
        return (msm0) ((daq) this.b).t9.get();
    }

    public ijr q() {
        return (ijr) ((teq) this.c).n5.get();
    }

    public vbs q0() {
        return (vbs) ((daq) this.b).wf.get();
    }

    public kma r() {
        return (kma) ((daq) this.b).Od.get();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        if (t0(r1) == r8) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object r0(java.lang.String r10, p.onm r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            p.yo2 r0 = (p.yo2) r0
            boolean r1 = r11 instanceof p.zn2
            if (r1 == 0) goto L17
            r1 = r11
            p.zn2 r1 = (p.zn2) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.c = r2
            goto L1c
        L17:
            p.zn2 r1 = new p.zn2
            r1.<init>(r9, r11)
        L1c:
            java.lang.Object r11 = r1.a
            int r2 = r1.c
            r3 = 3
            r4 = 2
            p.rih1 r5 = p.rih1.a
            r6 = 0
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L41
            if (r2 == r7) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L33
            p.hm5.M(r11)
            goto L8f
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r8
        L39:
            p.hm5.M(r11)
            return r5
        L3d:
            p.hm5.M(r11)
            return r5
        L41:
            p.hm5.M(r11)
            java.util.Set r11 = p.s4b1.f
            p.s4b1 r11 = p.uic.x(r10)
            p.v5b1 r2 = r11.d
            if (r2 == 0) goto L52
            p.b3i1 r8 = r2.getType()
        L52:
            p.ixu0 r2 = p.nyu0.e
            boolean r2 = p.u890.j(r8, r2)
            p.d9n r8 = p.d9n.a
            if (r2 == 0) goto L6a
            p.fq2 r0 = (p.fq2) r0
            r0.B(r6)
            r1.c = r7
            java.lang.Object r9 = r9.s0(r10, r1)
            if (r9 != r8) goto La3
            goto La2
        L6a:
            p.blc0 r11 = r11.c
            int r11 = r11.ordinal()
            r2 = 30
            if (r11 == r2) goto L95
            r2 = 44
            if (r11 == r2) goto L95
            r2 = 171(0xab, float:2.4E-43)
            if (r11 == r2) goto L95
            r2 = 860(0x35c, float:1.205E-42)
            if (r11 == r2) goto L95
            r10 = r0
            p.fq2 r10 = (p.fq2) r10
            r10.A(r7)
            r1.c = r3
            java.lang.Object r9 = r9.t0(r1)
            if (r9 != r8) goto L8f
            goto La2
        L8f:
            p.fq2 r0 = (p.fq2) r0
            r0.B(r6)
            return r5
        L95:
            p.fq2 r0 = (p.fq2) r0
            r0.B(r6)
            r1.c = r4
            java.lang.Object r9 = r9.s0(r10, r1)
            if (r9 != r8) goto La3
        La2:
            return r8
        La3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.em0.r0(java.lang.String, p.onm):java.lang.Object");
    }

    public woa s() {
        return (woa) ((daq) this.b).W8.get();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s0(String str, onm onmVar) {
        ao2 ao2Var;
        if (onmVar instanceof ao2) {
            ao2Var = (ao2) onmVar;
            int i = ao2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ao2Var.c = i - Integer.MIN_VALUE;
            } else {
                ao2Var = new ao2(this, onmVar);
            }
        } else {
            ao2Var = new ao2(this, onmVar);
        }
        Object obj = ao2Var.a;
        int i2 = ao2Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                q8n q8nVar = (q8n) this.X;
                k2 k2Var = new k2(this, str, (lnm) null, (byte) 17);
                ao2Var.c = 1;
                Object objY = fn31.Y(q8nVar, k2Var, ao2Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Failed to navigate to entity", e2);
        }
        return rih1.a;
    }

    public void start() {
        switch (this.a) {
            case 6:
                ((mko) this.d).start();
                ((nix0) this.e).a();
                ((stt0) this.f).c();
                ((gst0) this.g).b();
                ((zxu) this.h).c();
                ((oyu) this.t).a();
                ((k740) this.i).c();
                break;
            default:
                dcr0 dcr0Var = (dcr0) this.i;
                if (dcr0Var != null) {
                    dcr0Var.f();
                }
                break;
        }
    }

    public void stop() {
        switch (this.a) {
            case 6:
                ((mko) this.d).stop();
                ((nix0) this.e).b();
                ((stt0) this.f).d();
                ((gst0) this.g).c();
                ((zxu) this.h).d();
                llm llmVar = ((oyu) this.t).n;
                if (llmVar == null) {
                    u890.C("coroutineScope");
                    throw null;
                }
                smo1.p(llmVar, (CancellationException) null);
                ((k740) this.i).e();
                return;
            default:
                dcr0 dcr0Var = (dcr0) this.i;
                if (dcr0Var != null) {
                    dcr0Var.g();
                    return;
                }
                return;
        }
    }

    public s09 t() {
        String strConcat = ((String) this.b) == null ? " transportName" : "";
        if (((rax) this.d) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.e) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.f) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.g) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new s09((String) this.b, (Integer) this.c, (rax) this.d, ((Long) this.e).longValue(), ((Long) this.f).longValue(), (HashMap) this.g, (Integer) this.h, (String) this.i, (byte[]) this.t, (byte[]) this.X);
        }
        eg.m("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object t0(onm onmVar) {
        bo2 bo2Var;
        fq2 fq2Var = (yo2) this.b;
        if (onmVar instanceof bo2) {
            bo2Var = (bo2) onmVar;
            int i = bo2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bo2Var.c = i - Integer.MIN_VALUE;
            } else {
                bo2Var = new bo2(this, onmVar);
            }
        } else {
            bo2Var = new bo2(this, onmVar);
        }
        Object obj = bo2Var.a;
        int i2 = bo2Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                q8n q8nVar = (q8n) this.X;
                kk kkVar = new kk(this, (lnm) null, (byte) 6);
                bo2Var.c = 1;
                Object objY = fn31.Y(q8nVar, kkVar, bo2Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            fq2Var.A(false);
            throw e;
        } catch (Exception e2) {
            fq2Var.A(false);
            n57.t("Failed to navigate to Now Playing", e2);
        }
        return rih1.a;
    }

    public lid u() {
        return (lid) ((daq) this.b).g9.get();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u0(String str, String str2, onm onmVar, iu30 iu30Var) {
        co2 co2Var;
        if (onmVar instanceof co2) {
            co2Var = (co2) onmVar;
            int i = co2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                co2Var.d = i - Integer.MIN_VALUE;
            } else {
                co2Var = new co2(this, onmVar);
            }
        } else {
            co2Var = new co2(this, onmVar);
        }
        Object obj = co2Var.b;
        int i2 = co2Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (j1p1.s(str, "spotify:now-playing")) {
                ((yo2) this.b).A(true);
                co2Var.a = null;
                co2Var.d = 1;
                if (t0(co2Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            }
            if (j1p1.t(str)) {
                String strJ = J(str2);
                co2Var.a = iu30Var;
                co2Var.d = 2;
                if (y0(strJ, null, co2Var, false) != d9nVar) {
                }
            } else {
                co2Var.a = null;
                co2Var.d = 4;
                if (s0(str, co2Var) != d9nVar) {
                    return rih1Var;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(obj);
            return rih1Var;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 4) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        iu30Var = co2Var.a;
        hm5.M(obj);
        co2Var.a = null;
        co2Var.d = 3;
        if (iu30Var.invoke(co2Var) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    public boolean v() {
        return ((Boolean) ((daq) this.b).Aq.get()).booleanValue();
    }

    public mwn0 v0() {
        return (mwn0) ((daq) this.b).Wd.get();
    }

    @Override // p.dl4
    public void w(Object obj) {
        switch (this.a) {
            case 25:
                CMPActivity cMPActivity = (CMPActivity) obj;
                cMPActivity.b1 = (jgu) ((p2p) this.e).get();
                cMPActivity.c1 = new tuk(xqu.a((p2p) this.h));
                break;
            case 26:
            default:
                SocialListeningInfoDialogActivity socialListeningInfoDialogActivity = (SocialListeningInfoDialogActivity) obj;
                socialListeningInfoDialogActivity.b1 = (jgu) ((obq) this.e).get();
                socialListeningInfoDialogActivity.c1 = new tuk(xqu.a((obq) this.h));
                daq daqVar = (daq) this.c;
                socialListeningInfoDialogActivity.h1 = daqVar.n1();
                socialListeningInfoDialogActivity.f1 = vp90.C((uy90) daqVar.hc.get());
                socialListeningInfoDialogActivity.g1 = (lzn0) ((obq) this.X).get();
                break;
            case 27:
                InAppBrowserActivity inAppBrowserActivity = (InAppBrowserActivity) obj;
                inAppBrowserActivity.b1 = (jgu) ((daq) this.c).a.g0.get();
                inAppBrowserActivity.c1 = new tuk(xqu.a((s2q) this.f));
                inAppBrowserActivity.n1 = (c580) ((jly0) this.X).get();
                break;
        }
    }

    public n2p0 w0() {
        return (n2p0) ((teq) this.c).b.Db.get();
    }

    public yqg x() {
        return (yqg) ((daq) this.b).J1.get();
    }

    public g5p0 x0() {
        return (g5p0) ((teq) this.c).D4.get();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b1 -> B:18:0x005a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object y(p.dt0 r16, p.onm r17) {
        /*
            r15 = this;
            r0 = r17
            java.lang.Object r2 = r15.b
            r8 = r2
            p.yo2 r8 = (p.yo2) r8
            boolean r2 = r0 instanceof p.un2
            if (r2 == 0) goto L1a
            r2 = r0
            p.un2 r2 = (p.un2) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.e = r3
            goto L1f
        L1a:
            p.un2 r2 = new p.un2
            r2.<init>(r15, r0)
        L1f:
            java.lang.Object r0 = r2.c
            int r3 = r2.e
            r9 = 2
            r10 = 1
            p.d9n r11 = p.d9n.a
            if (r3 == 0) goto L48
            if (r3 == r10) goto L3d
            if (r3 != r9) goto L36
            p.uac r3 = r2.b
            p.iu30 r4 = r2.a
            p.hm5.M(r0)
            r0 = r4
            goto L5a
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L3d:
            p.uac r3 = r2.b
            p.iu30 r4 = r2.a
            p.hm5.M(r0)
            r5 = r4
        L45:
            r12 = r2
            r13 = r3
            goto L6a
        L48:
            p.hm5.M(r0)
            r0 = r8
            p.fq2 r0 = (p.fq2) r0
            p.bbc r0 = r0.F
            r0.getClass()
            p.uac r3 = new p.uac
            r3.<init>(r0)
            r0 = r16
        L5a:
            r2.a = r0
            r2.b = r3
            r2.e = r10
            java.lang.Object r4 = r3.a(r2)
            if (r4 != r11) goto L67
            goto Lb0
        L67:
            r5 = r0
            r0 = r4
            goto L45
        L6a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            p.rih1 r14 = p.rih1.a
            if (r0 == 0) goto Lb5
            java.lang.Object r0 = r13.c()
            r4 = r0
            p.tn2 r4 = (p.tn2) r4
            r12.a = r5
            r12.b = r13
            r12.e = r9
            r0 = r8
            p.fq2 r0 = (p.fq2) r0
            p.xe01 r2 = r0.s
            p.zob1 r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            boolean r2 = r2 instanceof p.gre
            if (r2 == 0) goto L91
            goto Lae
        L91:
            p.xe01 r0 = r0.H
            p.zob1 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            p.xn2 r0 = new p.xn2
            r6 = 0
            r7 = 0
            r1 = r15
            r0.<init>(r1, r2, r4, r5, r6, r7)
            java.lang.Object r0 = p.smo1.s(r0, r12)
            if (r0 != r11) goto Lae
            r14 = r0
        Lae:
            if (r14 != r11) goto Lb1
        Lb0:
            return r11
        Lb1:
            r0 = r5
            r2 = r12
            r3 = r13
            goto L5a
        Lb5:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p.em0.y(p.dt0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y0(String str, String str2, onm onmVar, boolean z) {
        do2 do2Var;
        q6h0 j6h0Var;
        if (onmVar instanceof do2) {
            do2Var = (do2) onmVar;
            int i = do2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                do2Var.c = i - Integer.MIN_VALUE;
            } else {
                do2Var = new do2(this, onmVar);
            }
        } else {
            do2Var = new do2(this, onmVar);
        }
        Object obj = do2Var.a;
        int i2 = do2Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                long jLongValue = ((Number) ((yo2) this.b).H.a.getValue()).longValue();
                String strJ = J(str);
                if (z) {
                    j6h0Var = q6h0.a;
                } else {
                    j6h0Var = strJ != null ? new j6h0(strJ) : o6h0.a;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("martini-launch-parameters", j6h0Var);
                if (str2 != null) {
                    if (ihc1.y0(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        bundle.putString("martini-source-surface-uri", str2);
                    }
                }
                q8n q8nVar = (q8n) this.X;
                eo2 eo2Var = new eo2(this, jLongValue, bundle, (lnm) null);
                do2Var.c = 1;
                Object objY = fn31.Y(q8nVar, eo2Var, do2Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Failed to navigate to Martini chat", e2);
        }
        return rih1.a;
    }

    public wjh z() {
        luk lukVar = (luk) ((bnh) this.b).l.get();
        c8o.l(lukVar);
        return new wjh(lukVar);
    }

    public gnq0 z0() {
        return (gnq0) ((daq) this.b).m5.get();
    }

    public /* synthetic */ em0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.t = obj9;
        this.X = obj10;
    }

    public em0(swo swoVar, two twoVar, sjq0 sjq0Var, uwo uwoVar, vwo vwoVar, wwo wwoVar, mwo mwoVar, br0 br0Var, cx0 cx0Var, nwo nwoVar, kcx0 kcx0Var) {
        this.a = (byte) 1;
        this.b = swoVar;
        this.c = twoVar;
        this.d = sjq0Var;
        this.e = uwoVar;
        this.f = vwoVar;
        this.g = wwoVar;
        this.h = mwoVar;
        this.i = br0Var;
        this.t = cx0Var;
        this.X = nwoVar;
    }

    public em0(jx11 jx11Var, String str) {
        this.a = (byte) 5;
        this.b = str;
        this.c = v8r.q(jx11Var);
        this.d = v8r.q((Object) null);
        this.e = v8r.q((Object) null);
        bpb1 bpb1VarB = gio1.b(new vfm0(jx11Var));
        this.f = bpb1VarB;
        this.g = d5p1.h(bpb1VarB);
        this.h = rqt0.u(new mt(bpb1VarB, (byte) 4));
        this.i = rqt0.u(new mt(bpb1VarB, (byte) 5));
        bpb1 bpb1VarB2 = gio1.b(nhc1.W(jx11Var.a, "{id}", str));
        this.t = bpb1VarB2;
        this.X = d5p1.h(bpb1VarB2);
    }

    public em0(xu30 xu30Var, epb1 epb1Var, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, xu30 xu30Var2, vu30 vu30Var2, vu30 vu30Var3, int i) {
        this.a = (byte) 9;
        iu30Var = (i & 16) != 0 ? null : iu30Var;
        iu30Var2 = (i & 32) != 0 ? xj.Y : iu30Var2;
        iu30Var3 = (i & 64) != 0 ? xj.Z : iu30Var3;
        iu30Var4 = (i & 128) != 0 ? null : iu30Var4;
        xu30Var2 = (i & 256) != 0 ? null : xu30Var2;
        vu30Var2 = (i & 512) != 0 ? vq9.Z : vu30Var2;
        vu30Var3 = (i & 1024) != 0 ? vq9.N0 : vu30Var3;
        this.b = xu30Var;
        this.c = epb1Var;
        this.d = vu30Var;
        this.e = iu30Var;
        this.f = iu30Var2;
        this.g = iu30Var3;
        this.h = iu30Var4;
        this.i = xu30Var2;
        this.t = vu30Var2;
        this.X = vu30Var3;
    }

    public em0(l1o l1oVar, Set set, sjq0 sjq0Var, lko lkoVar, byu byuVar, pyu pyuVar, pix0 pix0Var, peq peqVar, qeq qeqVar, sbq sbqVar, p6r0 p6r0Var, y2r0 y2r0Var, zob1 zob1Var) {
        this.a = (byte) 6;
        this.b = set;
        this.c = new jkp0(y2r0Var, sjq0Var, zob1Var);
        this.d = lko.a(lkoVar, new c64(Q(kcr0.a), this, (byte) 20), l1oVar.c);
        this.e = pix0.a(pix0Var, Q(jcr0.a), p6r0Var);
        this.f = qeqVar.a(Q(pcr0.a));
        this.g = sbqVar.a(Q(ocr0.a));
        this.h = byuVar.a(Q(lcr0.a));
        k740 k740VarV = a8o.v(peqVar, Q(ncr0.a));
        this.i = k740VarV;
        this.t = pyuVar.a(Q(mcr0.a), k740VarV, new kdn0(zob1Var.getValue()));
        this.X = new idd1(new i26(this, (byte) 27));
    }

    public em0(a1r0 a1r0Var, p5 p5Var, ffr ffrVar, cpr cprVar, hgo hgoVar, x631 x631Var, ivy0 ivy0Var, vqb0 vqb0Var, Scheduler scheduler, q8n q8nVar) {
        this.a = (byte) 8;
        this.b = a1r0Var;
        this.c = p5Var;
        this.e = ffrVar;
        this.f = cprVar;
        this.g = hgoVar;
        this.h = x631Var;
        this.i = ivy0Var;
        this.t = vqb0Var;
        this.d = scheduler;
        this.X = q8nVar;
    }

    public em0(b6e0 b6e0Var, aru0 aru0Var, toj0 toj0Var, asn asnVar, jqd0 jqd0Var, iac0 iac0Var) {
        this.a = (byte) 13;
        this.b = b6e0Var;
        this.c = aru0Var;
        this.d = toj0Var;
        this.e = asnVar;
        this.f = jqd0Var;
        this.g = iac0Var;
        this.h = gio1.b("");
        ht20 ht20Var = b6e0Var.h;
        mr20 mr20VarU = rqt0.u(new rgb(ht20Var, (byte) 3));
        x010 x010Var = (x010) jqd0Var.d;
        mr20 mr20Var = (mr20) asnVar.c;
        this.i = rqt0.u(h5p1.r(mr20VarU, x010Var, mr20Var, (mr20) toj0Var.g, new cxl(5, (lnm) null, (byte) 0)));
        this.t = new i0h(new rgb(ht20Var, (byte) 2), (byte) 6);
        this.X = rqt0.u(new ve1(new x010(x010Var, mr20Var, new wwl(3, (lnm) null, (byte) 0), (byte) 1), (byte) 4));
    }

    public em0(yo2 yo2Var, lzn0 lzn0Var, a1r0 a1r0Var, xrc0 xrc0Var, yqg yqgVar, b7r0 b7r0Var, e7p0 e7p0Var, Flowable flowable, c9n c9nVar, q8n q8nVar) {
        this.a = (byte) 2;
        this.b = yo2Var;
        this.d = lzn0Var;
        this.e = a1r0Var;
        this.f = xrc0Var;
        this.g = yqgVar;
        this.h = b7r0Var;
        this.i = e7p0Var;
        this.c = flowable;
        this.t = c9nVar;
        this.X = q8nVar;
    }

    public em0(ConstraintLayout constraintLayout, AddToButtonView addToButtonView, ArtworkView artworkView, CardView cardView, ArtworkShadow artworkShadow, View view, FrameLayout frameLayout, ArtworkView artworkView2, TextView textView, TextView textView2, TextView textView3) {
        this.a = (byte) 10;
        this.b = constraintLayout;
        this.c = addToButtonView;
        this.d = artworkView;
        this.e = cardView;
        this.f = artworkShadow;
        this.g = view;
        this.h = artworkView2;
        this.i = textView;
        this.t = textView2;
        this.X = textView3;
    }

    public em0(tmf tmfVar, umf umfVar, q7r0 q7r0Var) {
        this.a = (byte) 16;
        this.b = tmfVar;
        this.c = umfVar;
        this.d = q7r0Var;
        this.e = new b2p(this, 0, (byte) 19);
        this.f = iy81.a(new b2p(this, 2, (byte) 19));
        this.g = new b2p(this, 1, (byte) 19);
        this.h = new b2p(this, 3, (byte) 19);
        this.i = new b2p(this, 4, (byte) 19);
        this.t = new b2p(this, 5, (byte) 19);
        this.X = iy81.a(new b2p(this, 6, (byte) 19));
    }

    public em0(kpk kpkVar, zuj zujVar, npk npkVar, q7r0 q7r0Var) {
        this.a = (byte) 19;
        this.b = zujVar;
        this.c = npkVar;
        this.d = kpkVar;
        this.e = q7r0Var;
        this.f = xqu.b(new d7p(this, 0, (byte) 3));
        this.g = new d7p(this, 3, (byte) 3);
        this.h = iy81.a(new d7p(this, 2, (byte) 3));
        this.i = iy81.a(new d7p(this, 4, (byte) 3));
        this.t = new d7p(this, 5, (byte) 3);
        this.X = iy81.a(new d7p(this, 1, (byte) 3));
    }

    public em0(j3q j3qVar, byte b) {
        this.a = (byte) 22;
        this.b = j3qVar;
        this.c = xqu.b(new bsp(this, 1, (byte) 6));
        this.d = xqu.b(new bsp(this, 0, (byte) 6));
        this.e = iy81.a(new bsp(this, 3, (byte) 6));
        this.f = iy81.a(new bsp(this, 4, (byte) 6));
        this.g = iy81.a(new bsp(this, 2, (byte) 6));
        this.h = xqu.b(new bsp(this, 5, (byte) 6));
        this.i = new bsp(this, 6, (byte) 6);
        this.t = iy81.a(new bsp(this, 7, (byte) 6));
        this.X = iy81.a(new bsp(this, 8, (byte) 6));
    }

    public em0(wph wphVar, CommentsSheetPageParameters commentsSheetPageParameters, q7r0 q7r0Var) {
        this.a = (byte) 18;
        this.b = wphVar;
        this.c = q7r0Var;
        this.d = xqu.b(new b2p(this, 0, (byte) 27));
        this.e = xqu.b(new b2p(this, 3, (byte) 27));
        this.f = iy81.a(new b2p(this, 2, (byte) 27));
        this.g = iy81.a(new b2p(this, 4, (byte) 27));
        this.h = iy81.a(new b2p(this, 5, (byte) 27));
        this.i = iy81.a(new b2p(this, 6, (byte) 27));
        this.t = iy81.a(new b2p(this, 7, (byte) 27));
        this.X = iy81.a(new b2p(this, 1, (byte) 27));
    }

    public em0(bnh bnhVar) {
        this.a = (byte) 17;
        this.b = bnhVar;
        this.c = iy81.a(new b2p(this, 0, (byte) 26));
        this.d = xqu.b(new b2p(this, 3, (byte) 26));
        this.e = iy81.a(new b2p(this, 2, (byte) 26));
        this.f = iy81.a(new b2p(this, 4, (byte) 26));
        this.g = iy81.a(new b2p(this, 1, (byte) 26));
        this.h = iy81.a(new b2p(this, 5, (byte) 26));
        this.i = iy81.a(new b2p(this, 6, (byte) 26));
        this.t = iy81.a(new b2p(this, 7, (byte) 26));
        this.X = iy81.a(new b2p(this, 8, (byte) 26));
    }

    public em0(j3q j3qVar, char c) {
        this.a = (byte) 23;
        this.b = j3qVar;
        this.c = xqu.b(new bsp(this, 1, (byte) 7));
        this.d = xqu.b(new bsp(this, 0, (byte) 7));
        this.e = iy81.a(new bsp(this, 3, (byte) 7));
        this.f = iy81.a(new bsp(this, 4, (byte) 7));
        this.g = iy81.a(new bsp(this, 2, (byte) 7));
        this.h = xqu.b(new bsp(this, 5, (byte) 7));
        this.i = new bsp(this, 6, (byte) 7);
        this.t = iy81.a(new bsp(this, 7, (byte) 7));
        this.X = iy81.a(new bsp(this, 8, (byte) 7));
    }

    public em0(j3q j3qVar) {
        this.a = (byte) 21;
        this.b = j3qVar;
        this.c = xqu.b(new bsp(this, 1, (byte) 3));
        this.d = xqu.b(new bsp(this, 0, (byte) 3));
        this.e = iy81.a(new bsp(this, 3, (byte) 3));
        this.f = iy81.a(new bsp(this, 4, (byte) 3));
        this.g = iy81.a(new bsp(this, 2, (byte) 3));
        this.h = xqu.b(new bsp(this, 5, (byte) 3));
        this.i = new bsp(this, 6, (byte) 3);
        this.t = iy81.a(new bsp(this, 7, (byte) 3));
        this.X = iy81.a(new bsp(this, 8, (byte) 3));
    }

    public em0(v2w0 v2w0Var, w2w0 w2w0Var, q7r0 q7r0Var) {
        this.a = (byte) 24;
        this.b = v2w0Var;
        this.c = q7r0Var;
        this.d = w2w0Var;
        this.e = xqu.b(new ywp(this, 0, (byte) 21));
        this.f = new ywp(this, 1, (byte) 21);
        this.g = iy81.a(new ywp(this, 2, (byte) 21));
        this.h = new ywp(this, 3, (byte) 21);
        this.i = xqu.b(new ywp(this, 5, (byte) 21));
        this.t = xqu.b(new ywp(this, 4, (byte) 21));
        this.X = iy81.a(new ywp(this, 6, (byte) 21));
    }

    public em0(b8p1 b8p1Var, ggg1 ggg1Var, xid xidVar, iu30 iu30Var, ooo oooVar, aae1 aae1Var, Function0 function0, e8k1 e8k1Var, iu30 iu30Var2) {
        this.a = (byte) 4;
        this.c = b8p1Var;
        this.d = ggg1Var;
        this.e = xidVar;
        this.f = iu30Var;
        this.g = oooVar;
        this.h = aae1Var;
        this.i = function0;
        this.t = e8k1Var;
        this.X = iu30Var2;
        this.b = b8p1Var;
    }

    public em0(ruf0 ruf0Var, quf0 quf0Var) {
        this.a = (byte) 20;
        this.b = ruf0Var;
        this.c = quf0Var;
        this.d = xqu.b(new blp(this, 3, (byte) 18));
        this.e = xqu.b(new blp(this, 2, (byte) 18));
        this.f = xqu.b(new blp(this, 4, (byte) 18));
        this.g = xqu.b(new blp(this, 1, (byte) 18));
        this.h = xqu.b(new blp(this, 0, (byte) 18));
        this.i = xqu.b(new blp(this, 6, (byte) 18));
        this.t = xqu.b(new blp(this, 7, (byte) 18));
        this.X = xqu.b(new blp(this, 5, (byte) 18));
    }

    public em0(qq qqVar) {
        this.a = (byte) 15;
        this.c = this;
        this.b = qqVar;
        this.d = xqu.b(new fwo(this, 1, (byte) 1));
        this.e = xqu.b(new fwo(this, 0, (byte) 1));
        this.f = new fwo(this, 2, (byte) 1);
        this.g = new fwo(this, 3, (byte) 1);
        this.h = new fwo(this, 4, (byte) 1);
        this.i = new fwo(this, 5, (byte) 1);
        this.t = new fwo(this, 6, (byte) 1);
        this.X = new fwo(this, 7, (byte) 1);
    }

    public em0(daq daqVar, CMPActivity cMPActivity) {
        this.a = (byte) 25;
        this.c = daqVar;
        this.b = cMPActivity;
        this.d = new p2p(daqVar, this, 1, (byte) 21);
        this.e = new p2p(daqVar, this, 0, (byte) 21);
        this.f = xqu.b(new p2p(daqVar, this, 4, (byte) 21));
        this.g = xqu.b(new p2p(daqVar, this, 3, (byte) 21));
        this.h = new p2p(daqVar, this, 2, (byte) 21);
        this.i = xqu.b(new p2p(daqVar, this, 7, (byte) 21));
        this.t = xqu.b(new p2p(daqVar, this, 6, (byte) 21));
        this.X = new p2p(daqVar, this, 5, (byte) 21);
    }

    public em0(daq daqVar, InAppBrowserActivity inAppBrowserActivity) {
        this.a = (byte) 27;
        this.c = daqVar;
        this.b = inAppBrowserActivity;
        this.d = xqu.b(new s2q(daqVar, this, 2, (byte) 7));
        this.e = xqu.b(new s2q(daqVar, this, 1, (byte) 7));
        this.f = new s2q(daqVar, this, 0, (byte) 7);
        this.g = xqu.b(new s2q(daqVar, this, 4, (byte) 7));
        this.h = xqu.b(new s2q(daqVar, this, 7, (byte) 7));
        this.i = xqu.b(new s2q(daqVar, this, 6, (byte) 7));
        this.t = new s2q(daqVar, this, 5, (byte) 7);
        this.X = xqu.b(new s2q(daqVar, this, 3, (byte) 7));
    }

    public em0(daq daqVar, SocialListeningInfoDialogActivity socialListeningInfoDialogActivity) {
        this.a = (byte) 29;
        this.c = daqVar;
        this.b = socialListeningInfoDialogActivity;
        this.d = new obq(daqVar, this, 1, (byte) 2);
        this.e = new obq(daqVar, this, 0, (byte) 2);
        this.f = xqu.b(new obq(daqVar, this, 4, (byte) 2));
        this.g = xqu.b(new obq(daqVar, this, 3, (byte) 2));
        this.h = new obq(daqVar, this, 2, (byte) 2);
        this.i = xqu.b(new obq(daqVar, this, 7, (byte) 2));
        this.t = xqu.b(new obq(daqVar, this, 6, (byte) 2));
        this.X = new obq(daqVar, this, 5, (byte) 2);
    }

    public em0(daq daqVar, v5q v5qVar, q2p0 q2p0Var) {
        this.a = (byte) 26;
        this.c = daqVar;
        this.d = v5qVar;
        this.b = q2p0Var;
        this.e = iy81.a(new s2q(daqVar, this, 0, (byte) 0));
        this.f = iy81.a(new s2q(daqVar, this, 1, (byte) 0));
        this.g = iy81.a(new s2q(daqVar, this, 3, (byte) 0));
        this.h = iy81.a(new s2q(daqVar, this, 4, (byte) 0));
        this.i = iy81.a(new s2q(daqVar, this, 2, (byte) 0));
        this.t = iy81.a(new s2q(daqVar, this, 5, (byte) 0));
        this.X = iy81.a(new s2q(daqVar, this, 6, (byte) 0));
    }

    public em0(daq daqVar, teq teqVar) {
        this.a = (byte) 28;
        this.b = daqVar;
        this.c = teqVar;
        this.d = new p2q(daqVar, teqVar, this, 0, (byte) 5);
        this.e = new p2q(daqVar, teqVar, this, 1, (byte) 5);
        this.f = new p2q(daqVar, teqVar, this, 2, (byte) 5);
        this.g = new p2q(daqVar, teqVar, this, 3, (byte) 5);
        this.h = new p2q(daqVar, teqVar, this, 4, (byte) 5);
        this.i = new p2q(daqVar, teqVar, this, 5, (byte) 5);
        this.t = new p2q(daqVar, teqVar, this, 6, (byte) 5);
        this.X = new p2q(daqVar, teqVar, this, 7, (byte) 5);
    }
}
