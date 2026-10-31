package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.view.Window;
import android.webkit.URLUtil;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.transformer.ExportException;
import com.spotify.playlist4.proto.Playlist4ApiProto;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a1g1 implements Function, pe5, qiw, s2k1, ya, BiFunction, vy11, d5q0, tso1, ijp1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ a1g1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public static final List h(String str, a1g1 a1g1Var) {
        Bundle extras;
        String string;
        String str2;
        Uri uriX = bno1.x(str);
        if (!u890.j(uriX != null ? uriX.getScheme() : null, "intent")) {
            return Collections.singletonList(new mrn0(str));
        }
        Intent intentW = bno1.w(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new mrn0(str));
        if (intentW != null && (str2 = intentW.getPackage()) != null) {
            arrayList.add(new mrn0(u890.j(((gap1) a1g1Var.b).b, "com.amazon.venezia") ? "https://www.amazon.com/gp/mas/dl/android?p=".concat(str2) : "https://play.google.com/store/apps/details?id=".concat(str2)));
        }
        if (intentW != null && (extras = intentW.getExtras()) != null && (string = extras.getString("browser_fallback_url")) != null && URLUtil.isNetworkUrl(string)) {
            arrayList.add(new ljq0(string));
        }
        return arrayList;
    }

    public void a() {
        nsl1 lsl1Var;
        Window window = (Window) this.b;
        d55.i(window, false);
        up41 up41Var = new up41(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            lsl1Var = new nsl1(window, up41Var);
        } else if (i >= 30) {
            lsl1Var = new msl1(window, up41Var);
        } else {
            lsl1Var = i >= 26 ? new lsl1(window, up41Var) : new ksl1(window, up41Var);
        }
        lsl1Var.L(519);
    }

    public void accept(Object obj, Object obj2) {
        bsd1 bsd1Var = (bsd1) obj2;
        h9n1 h9n1VarN = ((f8n1) obj).n();
        e8n1 e8n1Var = (e8n1) this.b;
        Parcel parcelS = h9n1VarN.s();
        p8n1.b(parcelS, e8n1Var);
        try {
            ((z7n1) h9n1VarN).a.transact(1, parcelS, null, 1);
            parcelS.recycle();
            bsd1Var.b((Object) null);
        } catch (Throwable th) {
            parcelS.recycle();
            throw th;
        }
    }

    public Object apply(Object obj) {
        lnm lnmVar;
        Completable completableIgnoreElement;
        lnm lnmVar2;
        o8n o8nVar;
        String str;
        Completable completableIgnoreElement2;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                z4z0 z4z0Var = (z4z0) obj;
                return ((nmh1) obj2).a.b(new oi("up-next-card", false, new n6z0(z4z0Var, (byte) 1))).filter(r3x0.V0).take(1L).map(new o6z0(z4z0Var, (byte) 1)).onErrorReturn(new c681((Object) z4z0Var, (byte) 28));
            case 5:
                zwu0 zwu0Var = ((erx0) obj).a;
                tj1 tj1Var = (tj1) obj2;
                mzr0 mzr0Var = tj1Var.b;
                String str2 = zwu0Var.h;
                String str3 = zwu0Var.k;
                boolean z = zwu0Var.l;
                if (str2 == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                String strC = mka.c(str2);
                byte[] bArr = new byte[16];
                dqz0.b.l().nextBytes(bArr);
                String strA = f9a.a(bArr);
                String strC2 = mka.c(strA);
                agu0 agu0Var = (vfu0) mzr0Var.d;
                List<String> list = zwu0Var.c;
                if (str2 == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                agu0 agu0Var2 = agu0Var;
                agu0Var2.getClass();
                Playlist4ApiProto.ListUpdateRequest.Builder builderNewBuilder = Playlist4ApiProto.ListUpdateRequest.newBuilder();
                for (String str4 : list) {
                    Playlist4ApiProto.Item.Builder builderNewBuilder2 = Playlist4ApiProto.Item.newBuilder();
                    builderNewBuilder2.setUri(str4);
                    builderNewBuilder.addItems(builderNewBuilder2.build());
                }
                Playlist4ApiProto.ListUpdateRequest listUpdateRequestBuild = builderNewBuilder.build();
                if (agu0Var2.d.b.a()) {
                    completableIgnoreElement = ud.a((ud) agu0Var2.e.b, (String) null, 1, (Object) null).map(aj20.a1).flatMapCompletable(new xfu0(agu0Var2, str2, listUpdateRequestBuild)).p(new yfu0(agu0Var2, str2, listUpdateRequestBuild));
                    lnmVar = null;
                } else {
                    lnmVar = null;
                    completableIgnoreElement = hrh1.b(agu0Var2.a, str2, listUpdateRequestBuild, (wf90) null, 4, (Object) null).doOnError(zfu0.a).ignoreElement();
                }
                CompletablePeek completablePeekG = completableIgnoreElement.g(new nux0(mzr0Var, strC2, zwu0Var, strA, (byte) 1));
                rih1 rih1Var = rih1.a;
                Completable completableIgnoreElement3 = completablePeekG.x(rih1Var).ignoreElement();
                String str5 = zwu0Var.b;
                String str6 = zwu0Var.i;
                String str7 = z ? str6 : str5;
                boolean zJ = u890.j(zwu0Var.g, Boolean.FALSE);
                o8n o8nVar2 = o6x.a;
                if (zJ) {
                    lnmVar2 = lnmVar;
                    o8nVar = o8nVar2;
                    str = strC;
                    completableIgnoreElement2 = rqt0.F(o8nVar, new pew0(mzr0Var, str, false, lnmVar2, (byte) 18)).doOnError(xfs0.d1).map(new xrh(str, (byte) 4)).ignoreElement();
                } else {
                    lnmVar2 = lnmVar;
                    o8nVar = o8nVar2;
                    str = strC;
                    completableIgnoreElement2 = CompletableEmpty.a;
                }
                completableIgnoreElement2.getClass();
                Completable completable = completableIgnoreElement2;
                Single singleF = rqt0.F(o8nVar, new oux0(mzr0Var, str, str7, lnmVar2, (byte) 1));
                Single singleDoOnError = rqt0.F(o8nVar, new oux0(mzr0Var, str, str3, lnmVar2, (byte) 0)).doOnError(mux0.e);
                Completable completableIgnoreElement4 = (z || str5.equals(str6)) ? CompletableEmpty.a : mzr0Var.e(str3, str, zwu0Var.f).flatMap(new pux0(mzr0Var, str, (byte) 0)).onErrorReturnItem(str).ignoreElement();
                completableIgnoreElement4.getClass();
                Flowable flowableK = Flowable.k(Single.wrap(mzr0Var.z(zwu0Var).e(Single.just(new bsx0(zwu0Var.a, str3, zwu0Var.d, zwu0Var.e)))).toFlowable(), completableIgnoreElement3.c(Single.zip(singleF, singleDoOnError, completableIgnoreElement4.x(rih1Var), completable.x(rih1Var), m9x0.V0).ignoreElement()).c(tj1Var.c.z(gvx0.a)).v());
                flowableK.getClass();
                Predicate predicate = Functions.h;
                Objects.requireNonNull(predicate, "predicate is null");
                return new ObservableFromPublisher(new FlowableOnErrorComplete(flowableK, predicate));
            case 9:
                return new FlowableTake(((ioj1) obj2).d.k1.J(new yc31(goj1.b)).x(gex0.V0));
            case 12:
                return Observable.timer(800L, TimeUnit.MILLISECONDS, (Scheduler) obj2).map(new i2i1((irk1) obj, (byte) 6));
            case 13:
                int i = ((j0l1) obj2).a;
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Failed to create playlist";
                }
                return new u1l1(i, message);
            default:
                sjj0 sjj0Var = (sjj0) ((hmm0) obj2).f;
                List list2 = ((wsc0) obj).e;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zuc0) it.next()).c);
                }
                return sjj0Var.a(arrayList);
        }
    }

    public void b(cvo1 cvo1Var, File file, boolean z) {
        cik1 cik1Var = (cik1) this.b;
        ((HashSet) cik1Var.c).add(file);
        if (z) {
            return;
        }
        ((AtomicBoolean) cik1Var.d).set(false);
    }

    public void c(dt00 dt00Var, ExportException exportException) {
        kgg1 kgg1Var = (kgg1) this.b;
        kgg1Var.c();
        kgg1Var.g.h(-1, new h341(this, dt00Var, exportException));
        if (kgg1Var.a()) {
            ij81 ij81Var = new ij81((byte) 25);
            if (Looper.myLooper() != kgg1Var.m) {
                eg.m("Transformer is accessed on the wrong thread.");
                return;
            }
            myr myrVar = kgg1Var.q;
            int i = (myrVar == null ? 0 : myrVar.b(ij81Var)) == 2 ? ij81Var.b : -1;
            if (kgg1Var.u == null) {
                kgg1Var.d();
            }
            n4w n4wVar = kgg1Var.u;
            n4wVar.getClass();
            n4wVar.f(i, exportException, dt00Var);
        }
        kgg1Var.q = null;
    }

    public void d() {
        uoa uoaVar = ((ivj1) this.b).d;
        if (uoaVar != null) {
            uoaVar.f();
        }
    }

    public void e() {
        uoa uoaVar = ((ivj1) this.b).d;
        if (uoaVar != null) {
            uoaVar.l();
        }
    }

    public List f(String str, iu30 iu30Var) {
        int iC = l1d.C(o0p1.k(str));
        if (iC == 0) {
            return Collections.singletonList(new nrn0(str));
        }
        if (iC == 1) {
            List listH = h(str, this);
            iu30Var.invoke(str);
            return listH;
        }
        if (iC == 2) {
            return h(str, this);
        }
        eg.o();
        return null;
    }

    public uq20 get(int i) {
        return (uq20) this.b;
    }

    public /* synthetic */ void i(Exception exc) {
        bsd1 bsd1Var = (bsd1) this.b;
        jvn1.d.b("get checkbox consent failed", new Object[0]);
        bsd1Var.d(Boolean.FALSE);
    }

    public Observable j() {
        return ((o241) this.b).a("is-eligible-premium-unboxing", "0").map(avw0.i).onErrorReturnItem(Boolean.FALSE).distinctUntilChanged();
    }

    public void v(Object obj) {
        mmr0 mmr0Var = (mmr0) obj;
        cej1 cej1Var = (cej1) this.b;
        plb0 plb0Var = cej1Var.e;
        ConstraintLayout constraintLayout = plb0Var.a;
        Context context = constraintLayout.getContext();
        Object obj2 = mmr0Var.a;
        Object obj3 = mmr0Var.b;
        zx9 zx9Var = (zx9) obj2;
        constraintLayout.setBackground(context.getDrawable(zx9Var.a));
        int iOrdinal = zx9Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cej1Var.f((String) obj3);
                return;
            } else {
                eg.o();
                return;
            }
        }
        if (((CharSequence) obj3).length() == 0) {
            cej1Var.f(plb0Var.a.getContext().getResources().getString(2131961032));
        } else {
            cej1Var.f((String) obj3);
        }
    }

    public boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((ijp1[]) this.b)[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    public tjp1 zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            ijp1 ijp1Var = ((ijp1[]) this.b)[i];
            if (ijp1Var.zzb(cls)) {
                return ijp1Var.zzc(cls);
            }
        }
        hhg1.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public void g() {
    }

    public boolean accept(Object obj) {
        return ((m5l1) this.b).a();
    }

    public Object apply(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        xum1 xum1Var = (xum1) this.b;
        int i = (zBooleanValue && zBooleanValue2) ? 2 : 1;
        Context context = xum1Var.a;
        ynb0 ynb0Var = xum1Var.d;
        String string = context.getString(2131959364);
        ((upp0) ynb0Var.get()).getClass();
        l7c l7cVar = blc0.a;
        String strF = oap1.f();
        ((upp0) ynb0Var.get()).getClass();
        return new uut0(string, strF, i, upp0.a());
    }
}
