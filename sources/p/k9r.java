package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.recyclerview.widget.GridLayoutManager;
import com.spotify.culturalmoments.hubscomponents.CMHubsLayoutManager;
import com.spotify.deeplinkimpl.events.proto.DeeplinkOpen;
import com.spotify.libs.sociallistening.events.proto.JamNearbyBroadcastTokenDetected;
import com.spotify.libs.sociallistening.events.proto.SocialConnectHostApprovalRequestResult;
import com.spotify.libs.sociallistening.events.proto.SocialConnectUpgradeRequestResult;
import com.spotify.player.esperanto.proto.EsSignalRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoOnLifecycle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k9r implements Function, p2r0, g9v, SingleTransformer, sd70, hw3 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;

    public k9r(f18[] f18VarArr) {
        this.a = (byte) 8;
        f18 mr81Var = new mr81();
        ((mr81) mr81Var).m = 0;
        ((mr81) mr81Var).o = 0;
        ((mr81) mr81Var).p = 0;
        byte[] bArr = zoi1.b;
        ((mr81) mr81Var).n = bArr;
        ((mr81) mr81Var).q = bArr;
        f18 sfa1Var = new sfa1(false);
        f18[] f18VarArr2 = new f18[f18VarArr.length + 2];
        this.b = f18VarArr2;
        System.arraycopy(f18VarArr, 0, f18VarArr2, 0, f18VarArr.length);
        this.c = mr81Var;
        this.d = sfa1Var;
        f18VarArr2[f18VarArr.length] = mr81Var;
        f18VarArr2[f18VarArr.length + 1] = sfa1Var;
    }

    public static cwr m(poh0 poh0Var) {
        iir iirVar = new iir();
        iirVar.c = null;
        Uri uri = poh0Var.b;
        rl1 rl1Var = new rl1(uri == null ? null : uri.toString(), poh0Var.f, iirVar);
        mjh1 mjh1VarK = poh0Var.c.g().k();
        while (mjh1VarK.hasNext()) {
            Map.Entry entry = (Map.Entry) mjh1VarK.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) rl1Var.e)) {
                ((HashMap) rl1Var.e).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        int i = whc.a;
        ij81 ij81Var = new ij81(-1, (byte) 12);
        UUID uuid = poh0Var.a;
        tw20 tw20Var = ok30.d;
        uuid.getClass();
        boolean z = poh0Var.d;
        boolean z2 = poh0Var.e;
        int[] iArrB0 = bmq0.b0(poh0Var.g);
        for (int i2 : iArrB0) {
            boolean z3 = true;
            if (i2 != 2 && i2 != 1) {
                z3 = false;
            }
            dm5.m(z3);
        }
        cwr cwrVar = new cwr(uuid, tw20Var, rl1Var, map, z, (int[]) iArrB0.clone(), z2, ij81Var);
        byte[] bArr = poh0Var.h;
        cwrVar.l(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null, 0);
        return cwrVar;
    }

    public synchronized nu3 a() {
        nu3 nu3VarA;
        nu3VarA = ((h6s) this.d).c.a();
        ((HashMap) this.b).put(nu3VarA, (dbu0) this.c);
        g6s g6sVar = (g6s) ((h6s) this.d).q.get((dbu0) this.c);
        if (g6sVar != null) {
            synchronized (g6sVar) {
                g6sVar.d++;
            }
        }
        return nu3VarA;
    }

    public Object apply(Object obj) {
        Completable completableA;
        Single singleA;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                gqx0 gqx0Var = (gqx0) obj;
                cwi0 cwi0Var = gqx0Var.a;
                bwi0 bwi0Var = cwi0Var.f;
                if (((hux0) this.c).c && bwi0Var != null && (!bwi0Var.c.isEmpty())) {
                    return new jrx0(cwi0Var.a);
                }
                String strB = cwi0Var.b;
                boolean z = gqx0Var.b;
                dma1 dma1Var = ((jux0) this.d).a;
                bma1 bma1Var = jux0.c;
                if (!dma1Var.h(bma1Var, false) && !z && bwi0Var != null && (!bwi0Var.c.isEmpty())) {
                    hma1 hma1VarEdit = dma1Var.edit();
                    hma1VarEdit.a(bma1Var, true);
                    hma1VarEdit.h();
                    strB = ((qfl1) obj2).b(2131956041, new Object[]{strB});
                }
                return new trx0(cwi0.c(cwi0Var, strB, 0L, 0L, 61), gqx0Var.c);
            default:
                wj3 wj3Var = (wj3) this.c;
                uh80 uh80Var = (uh80) obj2;
                String str = uh80Var.b;
                if (!((Boolean) obj).booleanValue() || uh80Var.a) {
                    return ((oj3) wj3Var.h).c(Collections.singletonList(str), (String) wj3Var.b, uh80Var.e, uh80Var.a, new gj3(27, ((gl3) this.d).a)).ignoreElement();
                }
                jo91 jo91Var = (jo91) wj3Var.i;
                boolean zB = jo91Var.b();
                ip91 ip91Var = (ip91) wj3Var.e;
                if (zB) {
                    ujm ujmVar = (ujm) ip91Var.q.getValue();
                    srz srzVarN = EsSignalRequest.SignalRequest.n();
                    srzVarN.r("plus");
                    completableA = ujmVar.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Signal", srzVarN.build()).map(xbp1.S0).ignoreElement();
                } else {
                    completableA = ip91Var.a(uh80Var.c, str, uh80Var.e);
                }
                CompletableObserveOn completableObserveOnN = completableA.n((Scheduler) wj3Var.X);
                if (((t35) jo91Var.a.get()).C()) {
                    singleA = Single.just(Boolean.TRUE);
                    singleA.getClass();
                } else {
                    singleA = pqs.a((pqs) wj3Var.O0);
                }
                return completableObserveOnN.c(singleA.flatMap(new k2q(wj3Var, uh80Var, (byte) 29)).flatMapCompletable(new lbq(wj3Var, uh80Var, (byte) 23))).p(new l2a(wj3Var, (byte) 29));
        }
    }

    public f9v b(yoh0 yoh0Var) {
        cwr cwrVar;
        yoh0Var.b.getClass();
        poh0 poh0Var = yoh0Var.b.c;
        if (poh0Var == null) {
            return f9v.a;
        }
        synchronized (this.b) {
            try {
                if (!poh0Var.equals((poh0) this.c)) {
                    this.c = poh0Var;
                    this.d = m(poh0Var);
                }
                cwrVar = (cwr) this.d;
                cwrVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return cwrVar;
    }

    public Single c(Single single) {
        ArrayList arrayList = (ArrayList) this.b;
        int i = 0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((j16) it.next()) == j16.b && (i = i + 1) < 0) {
                    p7h.S();
                    throw null;
                }
            }
        }
        int i2 = i;
        int size = arrayList.size() - i2;
        k9r k9rVar = (k9r) this.c;
        hk2 hk2Var = new hk2(i2, k9rVar, (vr60) this.d, size, (byte) 5);
        return single.doOnSuccess(new lgr(hk2Var, k9rVar, (byte) 5)).doOnError(new yrh(hk2Var, (byte) 24));
    }

    public GridLayoutManager create() {
        Activity activity = (Activity) this.b;
        return new CMHubsLayoutManager(activity, (l7m0) this.c, activity.getResources().getInteger(2131492895), (pic) this.d);
    }

    public synchronized void d(z1c z1cVar) {
        ((h6s) this.d).c.d(z1cVar);
        while (z1cVar != null) {
            nu3 nu3Var = (nu3) z1cVar.c;
            nu3Var.getClass();
            w(nu3Var);
            z1cVar = (z1c) z1cVar.d;
            if (z1cVar == null || ((nu3) z1cVar.c) == null) {
                z1cVar = null;
            }
        }
    }

    public synchronized void e() {
        ((h6s) this.d).c.e();
    }

    public synchronized void f(nu3 nu3Var) {
        ((h6s) this.d).c.f(nu3Var);
        w(nu3Var);
    }

    public synchronized int g() {
        ((h6s) this.d).c.getClass();
        return 65536;
    }

    public o2r0 h(q7r0 q7r0Var, Bundle bundle) {
        return new lbq((q1n0) this.b, (x7e0) this.c, bundle, (vu30) this.d);
    }

    public void i(z030 z030Var, iu30 iu30Var, b0k b0kVar, int i) {
        k9r k9rVar;
        z030 z030Var2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1211070807);
        int i2 = (x340Var.i(z030Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.g(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                fip fipVar = (fip) ((thp) this.d).a.c;
                dj81 dj81VarP0 = fipVar.b.p0();
                c8o.l(dj81VarP0);
                acq acqVarJ = fipVar.b.J();
                c8o.l(acqVarJ);
                iu30Var2 = iu30Var;
                tzr tzrVar = new tzr(dj81VarP0, acqVarJ, (String) fipVar.k.get(), fipVar.i(), new ogr(fipVar.d, (byte) 13), iu30Var2);
                x340Var.s0(tzrVar);
                objT = tzrVar;
            } else {
                iu30Var2 = iu30Var;
            }
            tzr tzrVar2 = (tzr) objT;
            boolean zG = x340Var.g(z030Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                String str = z030Var.a;
                String strN = str != null ? qmo1.n((String) this.b, str) : null;
                String str2 = z030Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                objT2 = new v130(str2, strN, strN != null ? new t130(cob1.a) : s130.a);
                x340Var.s0(objT2);
            }
            v130 v130Var = (v130) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = nvr.Z0;
                x340Var.s0(objT3);
            }
            z030Var2 = z030Var;
            k9rVar = this;
            dgo1.c("your_library_folder_page_header", (iu30) objT3, apo.r(-543646053, new sxj(tzrVar2, v130Var, z030Var, this, iu30Var2), x340Var), x340Var, 438);
        } else {
            k9rVar = this;
            z030Var2 = z030Var;
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new won((byte) 10, i, k9rVar, z030Var2, iu30Var2);
        }
    }

    public Uri j(hi hiVar) {
        Uri.Builder builderBuildUpon = ((Uri) this.c).buildUpon();
        for (Map.Entry entry : ((Map) ((iu30) this.d).invoke(hiVar)).entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build();
    }

    public boolean k(hi hiVar) {
        PackageManager packageManager = ((Context) this.b).getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(j(hiVar));
        return !packageManager.queryIntentActivities(intent, 0).isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(lik1 lik1Var, String str, e2t0 e2t0Var, onm onmVar) {
        lmr lmrVar;
        if (onmVar instanceof lmr) {
            lmrVar = (lmr) onmVar;
            int i = lmrVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                lmrVar.f = i - Integer.MIN_VALUE;
            } else {
                lmrVar = new lmr(this, onmVar);
            }
        } else {
            lmrVar = new lmr(this, onmVar);
        }
        Object objL = lmrVar.d;
        int i2 = lmrVar.f;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableB = ((zxm1) this.b).b(str, lik1Var);
            lmrVar.a = lik1Var;
            lmrVar.b = str;
            lmrVar.c = e2t0Var;
            lmrVar.f = 1;
            objL = fc11.l(observableB, 1, (Object) null, lmrVar);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e2t0Var = lmrVar.c;
            str = lmrVar.b;
            lik1Var = lmrVar.a;
            hm5.M(objL);
        }
        vum1 vum1Var = (vum1) objL;
        if (vum1Var.equals(tum1.a)) {
            return ((dlg1) this.d).i(str, e2t0Var);
        }
        if (vum1Var instanceof uum1) {
            return null;
        }
        return ((tzr0) this.c).g(str, e2t0Var, lik1Var);
    }

    public void n() {
        fwi0 fwi0Var = (fwi0) this.d;
        if (fwi0Var == null) {
            return;
        }
        this.d = null;
        eur eurVar = (eur) this.b;
        synchronized (eurVar) {
            try {
                List list = (List) eurVar.a.h();
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((zdz0) obj).a != fwi0Var) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.size() != list.size()) {
                        eurVar.a.onNext(arrayList);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.VideoFrameProcessingException */
    public void o(bg11 bg11Var, ss40 ss40Var) throws VideoFrameProcessingException {
        pbq pbqVar = (pbq) this.c;
        if (((ns40) this.d) == null) {
            try {
                ns40 ns40Var = new ns40((Context) this.b, 2131886226, 2131886134);
                this.d = ns40Var;
                ns40Var.d(fn31.P());
                ((ns40) this.d).f("uTexTransformationMatrix", fn31.A());
            } catch (IOException e) {
                throw new VideoFrameProcessingException(e);
            }
        }
        int i = ss40Var.b;
        int i2 = ss40Var.d;
        int i3 = ss40Var.c;
        fn31.J(i, i3, i2);
        pbqVar.e = new l291(i3, i2);
        fn31.w();
        ns40 ns40Var2 = (ns40) this.d;
        ns40Var2.getClass();
        GLES20.glUseProgram(ns40Var2.a);
        fn31.t();
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        fn31.t();
        for (int i4 = bg11Var.d - 1; i4 >= 0; i4--) {
            is40 is40Var = (is40) bg11Var.get(i4);
            ns40 ns40Var3 = (ns40) this.d;
            ns40Var3.getClass();
            ss40 ss40Var2 = is40Var.a;
            eij1 eij1Var = is40Var.b;
            ns40Var3.h(ss40Var2.a, 0, "uTexSampler");
            ns40Var3.f("uTransformationMatrix", pbqVar.M(new l291(ss40Var2.c, ss40Var2.d), eij1Var));
            ns40Var3.e("uAlphaScale", 1.0f);
            ns40Var3.b();
            GLES20.glDrawArrays(5, 0, 4);
            fn31.t();
        }
        GLES20.glDisable(3042);
        fn31.t();
    }

    public String p() {
        String str;
        pp90 pp90Var = (pp90) ((c9c0) this.b).b.current().getValue();
        return (pp90Var == null || (str = pp90Var.a) == null) ? "unknown" : str;
    }

    public boolean q() {
        return ((Boolean) ((idd1) this.d).getValue()).booleanValue();
    }

    public void r(xcr xcrVar) {
        ucr ucrVarN = DeeplinkOpen.n();
        ucrVarN.r(xcrVar.b);
        ucrVarN.s(((y1k) this.b).a(xcrVar.a));
        ucrVarN.q(((gdr) this.d).a(fdr.LOGGED_IN));
        String str = xcrVar.c;
        if (str != null) {
            ucrVarN.u(str);
            if (m5n1.C(str) != null) {
                ucrVarN.v(m5n1.C(str));
            }
        }
        String str2 = xcrVar.d;
        if (str2 != null) {
            ucrVarN.w(str2);
        }
        ucrVarN.n(xcrVar.f);
        ucrVarN.x(xcrVar.e);
        String str3 = xcrVar.g;
        if (str3 != null) {
            ucrVarN.t(str3);
        }
        DeeplinkOpen deeplinkOpenBuild = ucrVarN.build();
        t2j0 t2j0Var = (t2j0) this.c;
        deeplinkOpenBuild.getClass();
        t2j0Var.a(deeplinkOpenBuild);
        deeplinkOpenBuild.toString();
    }

    public void s(int i, vr60 vr60Var, String str, zu60 zu60Var) {
        int i2;
        String str2;
        String str3;
        String str4;
        String string;
        av60 av60Var = (av60) this.d;
        String strP = p();
        int iC = l1d.C(vr60Var.a);
        if (iC == 0) {
            i2 = 1;
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            i2 = 2;
        }
        if (lv60.a[l1d.C(1)] != 1) {
            eg.o();
            return;
        }
        sx91 sx91VarN = SocialConnectHostApprovalRequestResult.n();
        sx91VarN.s(strP);
        int iC2 = l1d.C(i);
        if (iC2 == 0) {
            str2 = "accepted";
        } else if (iC2 == 1) {
            str2 = "rejected";
        } else {
            if (iC2 != 2) {
                eg.o();
                return;
            }
            str2 = "reject_all";
        }
        sx91VarN.w(str2);
        int iC3 = l1d.C(i2);
        if (iC3 == 0) {
            str3 = "notification";
        } else {
            if (iC3 != 1) {
                eg.o();
                return;
            }
            str3 = "in-app";
        }
        sx91VarN.v(str3);
        if (bv60.a[l1d.C(1)] != 1) {
            eg.o();
            return;
        }
        sx91VarN.t();
        if (str != null) {
            sx91VarN.r(str);
        }
        nnr nnrVarC = av60Var.b.c();
        if (nnrVarC != null) {
            if (nnrVarC instanceof nnr) {
                nnr nnrVar = nnrVarC;
                string = nnrVar.c + "(" + nnrVar.B.a.d + ")";
            } else {
                f0u type = nnrVarC.getType();
                int iP = nnrVarC.p();
                StringBuilder sb = new StringBuilder();
                sb.append(type);
                sb.append("(");
                if (iP != 1) {
                    str4 = iP != 2 ? "null" : "CAST";
                } else {
                    str4 = "CONNECT";
                }
                sb.append(str4);
                sb.append(")");
                string = sb.toString();
            }
            sx91VarN.u(string);
        }
        if (zu60Var != null) {
            if (zu60Var instanceof xu60) {
                sx91VarN.n("client");
                String str5 = ((xu60) zu60Var).a;
                if (str5 == null) {
                    str5 = "Unknown";
                }
                sx91VarN.q(str5);
            } else if (!(zu60Var instanceof yu60)) {
                eg.o();
                return;
            } else {
                sx91VarN.n("server");
                sx91VarN.q(kto1.D((yu60) zu60Var));
            }
        }
        av60Var.a.a(sx91VarN.build());
    }

    public void t(String str, ko90 ko90Var) {
        String str2;
        t2j0 t2j0Var = (t2j0) this.b;
        yy90 yy90VarN = JamNearbyBroadcastTokenDetected.n();
        yy90VarN.q(str);
        int iOrdinal = ko90Var.ordinal();
        if (iOrdinal == 0) {
            str2 = "MDNS";
        } else if (iOrdinal == 1) {
            str2 = "CONNECT";
        } else if (iOrdinal == 2) {
            str2 = "SOCIAL_RADAR_NEARBY";
        } else if (iOrdinal == 3) {
            str2 = "LINK";
        } else {
            if (iOrdinal != 4) {
                eg.o();
                return;
            }
            str2 = "LISTENING_ACTIVITY";
        }
        yy90VarN.n(str2);
        t2j0Var.a(yy90VarN.build());
    }

    public void u(int i, vr60 vr60Var, String str, zu60 zu60Var) {
        int i2;
        String str2;
        String str3;
        av60 av60Var = (av60) this.d;
        String strP = p();
        int iC = l1d.C(vr60Var.a);
        if (iC == 0) {
            i2 = 1;
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            i2 = 2;
        }
        if (lv60.a[l1d.C(1)] != 1) {
            eg.o();
            return;
        }
        py91 py91VarN = SocialConnectUpgradeRequestResult.n();
        py91VarN.s(strP);
        int iC2 = l1d.C(i);
        if (iC2 == 0) {
            str2 = "accepted";
        } else if (iC2 == 1) {
            str2 = "rejected";
        } else {
            if (iC2 != 2) {
                eg.o();
                return;
            }
            str2 = "reject_all";
        }
        py91VarN.v(str2);
        int iC3 = l1d.C(i2);
        if (iC3 == 0) {
            str3 = "notification";
        } else {
            if (iC3 != 1) {
                eg.o();
                return;
            }
            str3 = "in-app";
        }
        py91VarN.u(str3);
        if (bv60.a[l1d.C(1)] != 1) {
            eg.o();
            return;
        }
        py91VarN.t();
        if (str != null) {
            py91VarN.n(str);
        }
        if (zu60Var != null) {
            if (zu60Var instanceof xu60) {
                py91VarN.q("client");
                String str4 = ((xu60) zu60Var).a;
                if (str4 == null) {
                    str4 = "Unknown";
                }
                py91VarN.r(str4);
            } else if (!(zu60Var instanceof yu60)) {
                eg.o();
                return;
            } else {
                py91VarN.q("server");
                py91VarN.r(kto1.D((yu60) zu60Var));
            }
        }
        av60Var.a.a(py91VarN.build());
    }

    public yu60 v(sy21 sy21Var) {
        kv60 kv60Var;
        Integer num;
        Charset charsetA;
        kv60 m231Var;
        ry21 ry21Var = sy21Var.a;
        boolean z = ry21Var.Q0;
        if (z) {
            return null;
        }
        if (z) {
            eg.o();
            return null;
        }
        uz21 uz21Var = sy21Var.c;
        if (uz21Var != null) {
            nfa0 nfa0Var = (nfa0) this.c;
            r8i0 r8i0VarE = uz21Var.e();
            if (r8i0VarE == null || (charsetA = r8i0VarE.a(nne.a)) == null) {
                charsetA = nne.a;
            }
            try {
                m231Var = (kv60) nfa0Var.a(uz21Var.d1().peek().I0(charsetA), kv60.Companion.serializer());
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            kv60Var = m231Var;
        } else {
            kv60Var = null;
        }
        return new yu60((kv60Var == null || (num = kv60Var.a) == null) ? ry21Var.d : num.intValue(), kv60Var != null ? kv60Var.b : null);
    }

    public void w(nu3 nu3Var) {
        dbu0 dbu0Var = (dbu0) ((HashMap) this.b).remove(nu3Var);
        dbu0Var.getClass();
        g6s g6sVar = (g6s) ((h6s) this.d).q.get(dbu0Var);
        if (g6sVar != null) {
            synchronized (g6sVar) {
                g6sVar.d--;
            }
        }
    }

    public fwi0 x() {
        n();
        Context context = (Context) this.c;
        fwi0 fwi0Var = new fwi0(ywi0.a, context.getString(2131952381), context.getString(2131952379), new uvi0(context.getString(2131952380), new m4r(this, (byte) 11)), 16);
        this.d = fwi0Var;
        ((eur) this.b).b(fwi0Var, new y0o(this, fwi0Var, (byte) 14));
        return fwi0Var;
    }

    public Observable y() {
        return Observable.combineLatest(new ObservableFromPublisher((FlowableDoOnLifecycle) this.b).map(m9h.Z0), Observable.combineLatest(((g0l) this.c).d(), yoi1.i(new qer(((c9c0) this.d).b.current(), this, (byte) 14), o6x.a), new nbc(this, (byte) 6)).defaultIfEmpty(Boolean.FALSE), p9w.W0);
    }

    public k9r(Context context, gfz gfzVar, lzn0 lzn0Var) {
        this.a = (byte) 18;
        this.b = lzn0Var;
        this.c = new idd1(new mo2(context, (byte) 8));
        this.d = new idd1(new nxr(gfzVar, this, (byte) 2));
    }

    public k9r(Context context, eur eurVar) {
        this.a = (byte) 7;
        this.b = eurVar;
        this.c = context.getApplicationContext();
    }

    public k9r(k9r k9rVar, cua cuaVar, rm5 rm5Var, x2g1 x2g1Var) {
        this.a = (byte) 4;
        this.b = k9rVar;
        this.c = rm5Var;
        this.d = x2g1Var;
    }

    public k9r(Context context, ViewGroup viewGroup) {
        this.a = (byte) 17;
        this.b = context;
        this.c = viewGroup;
        this.d = new idd1(new dor(this, (byte) 8));
    }

    public k9r(ViewGroup viewGroup) {
        this.a = (byte) 19;
        Context context = viewGroup.getContext();
        this.b = context;
        View viewInflate = LayoutInflater.from(context).inflate(2131625297, viewGroup, false);
        this.c = viewInflate;
        this.d = (TextView) b8k1.n(viewInflate, 2131430147);
    }

    public k9r(xrc0 xrc0Var, String str, agc0 agc0Var, xrm1 xrm1Var, q8n q8nVar, mwm1 mwm1Var) {
        this.a = (byte) 20;
        this.b = xrc0Var;
        this.c = q8nVar;
        this.d = mwm1Var;
    }

    public k9r(Activity activity, ResolveInfo resolveInfo) {
        this.a = (byte) 10;
        this.b = activity;
        this.c = resolveInfo;
        this.d = new idd1(new z5o(this, (byte) 24));
    }

    public k9r() {
        this.a = (byte) 16;
        this.b = new Object();
    }

    public k9r(Context context) {
        this.a = (byte) 13;
        this.b = context;
        this.c = new pbq();
    }

    public /* synthetic */ k9r(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public k9r(h6s h6sVar, dbu0 dbu0Var) {
        this.a = (byte) 29;
        this.d = h6sVar;
        this.b = new HashMap();
        this.c = dbu0Var;
    }
}
