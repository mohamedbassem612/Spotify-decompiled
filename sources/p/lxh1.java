package p;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.interappprotocol.NotAuthorizedException;
import com.spotify.interapp.service.IapException;
import com.spotify.player.model.ContextTrack;
import com.spotify.yourupdates.badgingstate.models.BadgingState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function7;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lxh1 implements Function, s891, Function7, ya, y4l1, qjl1, lrm1, i2q0, gon1, e4o1 {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ lxh1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void a(sjl1 sjl1Var, qpj1 qpj1Var) {
        ((WebViewProviderFactoryBoundaryInterface) this.b).startUpWebView(new rjl1(sjl1Var, (byte) 2), new rjl1(qpj1Var, (byte) 0), new rjl1(qpj1Var, (byte) 1));
    }

    public boolean accept(Object obj) {
        return ((wgz0) this.b).b;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                List list = (List) obj;
                return !list.isEmpty() ? new i5w0(zgo1.w((tul1) o7h.q0(list), ((Boolean) ((x5u) ((hce1) this.b).d).invoke()).booleanValue())) : j5.a;
            case 4:
                ((ych1) ((e821) this.b).a).g();
                return hp3.a;
            case 10:
                if (((Boolean) obj).booleanValue() && Build.VERSION.SDK_INT >= 26) {
                    rx5 rx5Var = ((ppl1) this.b).d;
                    return Single.fromCallable(new px5(rx5Var)).onErrorReturn(y580.e).timeout(2L, TimeUnit.SECONDS, rx5Var.c, Single.just(Boolean.FALSE));
                }
                Single singleJust = Single.just(Boolean.FALSE);
                singleJust.getClass();
                return singleJust;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                i0n1 i0n1Var = (i0n1) this.b;
                if (!zBooleanValue) {
                    ic9 ic9Var = i0n1Var.b;
                    Single singleOnErrorResumeNext = ((y2n1) ic9Var.b).d().map(new cp5(ic9Var, (byte) 29)).onErrorResumeNext(kuw0.X);
                    return singleOnErrorResumeNext.toObservable().concatMap(new zxl1(i0n1Var, singleOnErrorResumeNext, (byte) 10));
                }
                i0n1Var.a.b.onNext(BadgingState.HIDE_BADGE);
                Observable observableEmpty = Observable.empty();
                observableEmpty.getClass();
                return observableEmpty;
        }
    }

    public void b() {
        ((nni1) this.b).e = null;
    }

    public void c(sjl1 sjl1Var, iyh1 iyh1Var) {
        ((WebViewProviderFactoryBoundaryInterface) this.b).startUpWebView(new s0c(new qeh1(sjl1Var, (byte) 12)), new s0c(new o2b1(new iyh1(iyh1Var, (byte) 15), (byte) 29)));
    }

    public void d(int i, String str) {
        mxa1 mxa1Var = (mxa1) this.b;
        i8h1 i8h1Var = (i8h1) mxa1Var.b;
        x4m0 x4m0Var = (x4m0) mxa1Var.c;
        x4m0Var.getClass();
        x6h1 x6h1VarC = x4m0Var.a.c();
        x6h1VarC.i.add(new a7h1("list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("option", str, numValueOf, (String) null, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void e(int i, String str) {
        mxa1 mxa1Var = (mxa1) this.b;
        i8h1 i8h1Var = (i8h1) mxa1Var.b;
        x4m0 x4m0Var = (x4m0) mxa1Var.c;
        x4m0Var.getClass();
        x6h1 x6h1VarC = x4m0Var.a.c();
        x6h1VarC.i.add(new a7h1("list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("option", str, numValueOf, (String) null, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA2;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public void f(m8b0 m8b0Var) {
        m7h m7hVar;
        nk70 nk70Var;
        Observable observableError;
        s24 s24Var = (s24) this.b;
        if (m8b0Var.a() != 48) {
            hhg1.n(f4i1.c(m8b0Var.a(), "Message must be of type CALL(48), but was "));
            return;
        }
        ifl1 ifl1Var = new ifl1(m8b0Var, (byte) 9);
        String strD = m8b0Var.d(3);
        Collection collectionEntrySet = ((HashMap) s24Var.g).entrySet();
        yax yaxVar = new yax(strD, (byte) 1);
        if (collectionEntrySet instanceof m7h) {
            m7h m7hVar2 = (m7h) collectionEntrySet;
            m7hVar = new m7h(m7hVar2.a, u890.e(m7hVar2.b, yaxVar));
        } else {
            collectionEntrySet.getClass();
            m7hVar = new m7h(collectionEntrySet, yaxVar);
        }
        if (m7hVar.size() == 1) {
            nk70Var = (nk70) ((Map.Entry) ((ao90) m7hVar.iterator()).next()).getValue();
        } else {
            if (m7hVar.size() > 1) {
                eg.m(gvg.h("More than one matching handler registered matching call ", strD, " : ", Arrays.toString(new n7h(m7hVar, new cwa((byte) 27)).toArray(new String[m7hVar.size()]))));
                return;
            }
            nk70Var = (nk70) s24Var.f;
        }
        nk70Var.getClass();
        try {
            nk70Var.a.run();
            observableError = m8b0Var.d(3);
            try {
                u5y u5yVar = (u5y) nk70Var.d.get(observableError);
                if (u5yVar == null) {
                    String str = "No IAP endpoint for URI: \"" + ((String) observableError) + "\".";
                    Logger.d(str, new Object[0]);
                    observableError = Observable.error(new IapException(str, "wamp.error.invalid_uri"));
                } else {
                    nk70Var.b.accept(Integer.valueOf(u5yVar.b()));
                    observableError = u5yVar.a(nk70Var.c.a(ifl1Var, u5yVar));
                }
            } catch (IapException e) {
                Logger.e(e, "Exception calling IAP endpoint on URI: \"%s\".", new Object[]{observableError});
                observableError = Observable.error(e);
            } catch (Exception e2) {
                Logger.e(e2, "Exception calling IAP endpoint on URI: \"%s\".", new Object[]{observableError});
                observableError = Observable.error(new IapException(e2.getClass().getName(), e2));
            }
        } catch (NotAuthorizedException e3) {
            observableError = Observable.error(e3);
        }
        ((CompositeDisposable) s24Var.h).b(observableError.take(1L).timeout(30L, TimeUnit.SECONDS, Observable.error(new TimeoutException())).subscribe(new x4l1(this, ifl1Var, (byte) 0), new x4l1(this, ifl1Var, (byte) 1)));
    }

    public void g(long j, long j2, long j3, String str) {
        wpn1 wpn1Var = (wpn1) this.b;
        try {
            wpn1Var.g(new won1(wpn1Var, new Status(2103, (String) null, (PendingIntent) null, (lal) null)));
        } catch (IllegalStateException unused) {
            e321.j.c("Result already set when calling onRequestReplaced", new Object[0]);
        }
        Iterator it = wpn1Var.f38p.h.iterator();
        while (it.hasNext()) {
            ((oxo1) it.next()).e(str, j, 2103, j2, j3);
        }
    }

    public void h(String str, long j, int i, Object obj, long j2, long j3) {
        int i2;
        wpn1 wpn1Var = (wpn1) this.b;
        try {
            i2 = i;
            try {
                wpn1Var.g(new won1(new Status(i2, (String) null, (PendingIntent) null, (lal) null)));
            } catch (IllegalStateException unused) {
                e321.j.c("Result already set when calling onRequestCompleted", new Object[0]);
            }
        } catch (IllegalStateException unused2) {
            i2 = i;
        }
        Iterator it = wpn1Var.f38p.h.iterator();
        while (it.hasNext()) {
            ((oxo1) it.next()).e(str, j, i2, j2, j3);
            i2 = i;
        }
    }

    public Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        ContextTrack contextTrack = (ContextTrack) obj4;
        boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
        boolean zBooleanValue5 = ((Boolean) obj6).booleanValue();
        boolean zBooleanValue6 = ((Boolean) obj7).booleanValue();
        yjj1 yjj1Var = (yjj1) this.b;
        r380 r380Var = new r380(4);
        if (zBooleanValue6) {
            r380Var.g(ujj1.e);
        }
        if (!zBooleanValue5) {
            r380Var.g(ujj1.d);
        }
        if (zBooleanValue) {
            r380Var.g(ujj1.a);
        }
        if (zBooleanValue2 && zBooleanValue3 && !zBooleanValue4) {
            Object obj8 = contextTrack.metadata().get("media.manifest_id");
            if (obj8 == null) {
                obj8 = "";
            }
            yjj1Var.f.getClass();
            if (!t9p1.i((kru) yjj1Var.e.b.g.get(wqn1.n((String) obj8)))) {
                Object obj9 = contextTrack.metadata().get("media.type");
                if ("mixed".equals(obj9 != null ? obj9 : "") || Boolean.parseBoolean((String) contextTrack.metadata().get("is_podcast_advertisement"))) {
                    r380Var.g(ujj1.b);
                }
            }
        }
        if (!l4o1.Z(contextTrack)) {
            r380Var.g(ujj1.c);
        }
        t380 t380VarI = r380Var.i();
        return t380VarI.isEmpty() ? swj1.a : new rwj1(t380VarI);
    }

    public String[] j() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    public amk1 k(roa0 roa0Var) {
        amk1 amk1Var = (amk1) ((xkg0) this.b).get(roa0Var);
        if (amk1Var != null) {
            return amk1Var;
        }
        k220.q("Can not handle assistant %s", Arrays.copyOf(new Object[]{roa0Var.a}, 1));
        return null;
    }

    public void l() {
        Messenger messenger;
        ffl1 ffl1Var = (ffl1) this.b;
        if (ffl1Var == null || (messenger = ffl1Var.d) == null) {
            return;
        }
        try {
            String str = ffl1Var.c;
            Message messageObtain = Message.obtain((Handler) null, 101);
            Bundle bundle = new Bundle();
            bundle.putString("token", str);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(String str, onm onmVar) throws AbortFlowException {
        kxh1 kxh1Var;
        if (onmVar instanceof kxh1) {
            kxh1Var = (kxh1) onmVar;
            int i = kxh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kxh1Var.c = i - Integer.MIN_VALUE;
            } else {
                kxh1Var = new kxh1(this, onmVar);
            }
        } else {
            kxh1Var = new kxh1(this, onmVar);
        }
        Object objI = kxh1Var.a;
        int i2 = kxh1Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            mt mtVarG = ((q9i0) this.b).g(str);
            kxh1Var.c = 1;
            objI = b5p1.i(mtVarG, kxh1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        return new l3f((List) objI);
    }

    public void onComplete(Task task) {
        cdo1 cdo1Var = (cdo1) this.b;
        try {
            if (task.j()) {
                cdo1Var.g1((byte[]) task.g(), true);
            } else {
                task.f();
                cdo1Var.g1(null, false);
            }
        } catch (RemoteException unused) {
        }
    }

    public boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((e4o1[]) this.b)[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    public g6o1 zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            e4o1 e4o1Var = ((e4o1[]) this.b)[i];
            if (e4o1Var.zzb(cls)) {
                return e4o1Var.zzc(cls);
            }
        }
        hhg1.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public lxh1() {
        this.a = (byte) 8;
    }
}
