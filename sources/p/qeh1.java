package p;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.tasks.Task;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.nio.charset.Charset;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qeh1 implements Function, FlowableOnSubscribe, Predicate, WebViewStartUpConfigBoundaryInterface, xgn1, i2q0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public qeh1(so1 so1Var) {
        this.a = (byte) 2;
        this.b = new brh1(so1Var, (byte) 1);
    }

    public c9n a() {
        return ((pjo1) this.b).c.a;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                vnd1 vnd1Var = (vnd1) obj2;
                List list = ((teh1) obj).a;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r7h.W(((peh1) it.next()).a, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    r7h.W(((sf51) it2.next()).b, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(dgo1.w((bi51) it3.next(), (bm00) vnd1Var.c, (aai0) vnd1Var.b, (String) null));
                }
                return new z310(arrayList3, (f410) null, (m510) null, (String) null);
            case 1:
                List list2 = ((y4z0) obj2).d;
                int iS = zno1.s(q7h.U(list2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : list2) {
                    linkedHashMap.put(obj3, null);
                }
                return new e7z0(linkedHashMap);
            case 5:
                boolean zJ = l4o1.J((ContextTrack) obj2);
                Boolean bool = ((to91) obj).a;
                if (bool != null) {
                    zJ = bool.booleanValue();
                }
                return Boolean.valueOf(zJ);
            case 8:
                crk1 crk1Var = (crk1) obj;
                return urk1.b((bih1) obj2, crk1Var, jch0.S(65535.0d * crk1Var.b), crk1Var.b, crk1Var.a.c);
            case 9:
                return ((j1l1) obj2).r.a(vww0.d).map(djx0.X0).toObservable();
            default:
                iqq0 iqq0Var = (iqq0) obj;
                return (iqq0Var == null ? -1 : g4n1.a[iqq0Var.ordinal()]) == 1 ? new an41(new yrm1((dn41) obj2, (byte) 8)) : bn41.a;
        }
    }

    public c9n b() {
        return ((pjo1) this.b).d.a;
    }

    public void c(int i, Object obj, sgo1 sgo1Var) {
        x6o1 x6o1Var = (x6o1) this.b;
        o3o1 o3o1Var = (o3o1) obj;
        x6o1Var.j(i, 2);
        x6o1Var.l(o3o1Var.c(sgo1Var));
        sgo1Var.f(o3o1Var, this);
    }

    public Executor getBackgroundExecutor() {
        return ((sjl1) this.b).a;
    }

    public Set getProfileNamesToLoad() {
        return null;
    }

    public void onComplete(Task task) {
        p3e p3eVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 17:
                fsn1 fsn1Var = (fsn1) obj;
                pue0 pue0Var = fsn1.s;
                boolean z = fsn1Var.p;
                if (task.j()) {
                    Bundle bundle = (Bundle) task.g();
                    boolean z2 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                    pue0Var.a("The module-to-client output switcher flag %s", new Object[]{true != z2 ? "not existed" : "existed"});
                    if (z2) {
                        fsn1Var.q = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                    }
                }
                boolean z3 = fsn1Var.q;
                if (fsn1Var.l != null && (p3eVar = fsn1Var.m) != null) {
                    boolean z4 = p3eVar.X;
                    boolean z5 = p3eVar.t;
                    boolean z6 = z3 && p3eVar.Z;
                    rwh0 rwh0Var = new rwh0();
                    int i = Build.VERSION.SDK_INT;
                    rwh0Var.a = i >= 30;
                    if (i >= 30) {
                        rwh0Var.a = z6;
                        rwh0Var.b = true;
                    }
                    if (i >= 30) {
                        rwh0Var.d = z4;
                    }
                    if (i >= 30) {
                        rwh0Var.c = z5;
                    }
                    boolean z7 = p3eVar.R0;
                    if (i >= 30) {
                        rwh0Var.e = z7;
                    }
                    swh0 swh0Var = new swh0(rwh0Var);
                    owh0.b();
                    kv40 kv40VarC = owh0.c();
                    Context context = kv40VarC.g;
                    cv40 cv40Var = kv40VarC.a;
                    context.getPackageName();
                    Objects.toString(Bundle.EMPTY);
                    swh0 swh0Var2 = kv40VarC.u;
                    kv40VarC.u = swh0Var;
                    boolean zI = kv40VarC.i();
                    bvh0 bvh0Var = kv40VarC.r;
                    if (zI) {
                        if (bvh0Var == null) {
                            bvh0 bvh0Var2 = new bvh0(context, new hl00(kv40VarC, (byte) 9));
                            kv40VarC.r = bvh0Var2;
                            kv40VarC.a(bvh0Var2, true);
                            kv40VarC.m();
                        }
                        bvh0 bvh0Var3 = kv40VarC.r;
                        boolean z8 = swh0Var.e;
                        bvh0Var3.P0 = z8;
                        bvh0Var3.l();
                        h9d0 h9d0Var = kv40VarC.c;
                        h9d0Var.a = z8;
                        h9d0Var.f();
                        if ((swh0Var2 != null && swh0Var2.d) != swh0Var.d) {
                            bvh0 bvh0Var4 = kv40VarC.r;
                            ((rvh0) bvh0Var4).e = kv40VarC.B;
                            if (!((rvh0) bvh0Var4).f) {
                                ((rvh0) bvh0Var4).f = true;
                                ((rvh0) bvh0Var4).c.sendEmptyMessage(2);
                            }
                        }
                    } else if (bvh0Var != null) {
                        kwh0 kwh0VarD = kv40VarC.d(bvh0Var);
                        if (kwh0VarD != null) {
                            owh0.b();
                            ((rvh0) bvh0Var).d = null;
                            bvh0Var.h((hvh0) null);
                            kv40VarC.o(kwh0VarD, (jqd0) null);
                            cv40Var.b(514, kwh0VarD);
                            kv40VarC.l.remove(kwh0VarD);
                        }
                        kv40VarC.r = null;
                        kv40VarC.B = null;
                        kv40VarC.c.f();
                    }
                    cv40Var.b(769, swh0Var);
                    pue0Var.c("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", new Object[]{Boolean.valueOf(z), Boolean.valueOf(z6), Boolean.valueOf(z4), Boolean.valueOf(z5)});
                    ytn1 ytn1Var = fsn1Var.o;
                    if (ytn1Var != null) {
                        ytn1Var.e = z && z6;
                    }
                    if (z && z6) {
                        q5p1.a(y1p1.k1);
                    }
                    if (z4) {
                        q5p1.a(y1p1.l1);
                    }
                    break;
                }
                break;
            default:
                ((wbp1) obj).l.e("launchApplication", task);
                break;
        }
    }

    public boolean shouldRunUiThreadStartUpTasks() {
        return true;
    }

    public void subscribe(FlowableEmitter flowableEmitter) {
        Rect rect = new Rect();
        View view = (View) this.b;
        ViewTreeObserver.OnScrollChangedListener abk1Var = new abk1(view, rect, flowableEmitter);
        if (view.isLaidOut()) {
            abk1Var.onScrollChanged();
        }
        aiq0.a(view, new mqh1(view, abk1Var, (byte) 4));
        view.getViewTreeObserver().addOnScrollChangedListener(abk1Var);
        flowableEmitter.setCancellable(new pc6(view, abk1Var, (byte) 12));
    }

    public boolean test(Object obj) {
        ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
        return u890.j(contextTrack != null ? contextTrack.uri() : null, ((rnh) this.b).a);
    }

    public Object zza(String str) {
        zgn1 zgn1Var = (zgn1) this.b;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                return zgn1Var.a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return zgn1Var.a(str, (Provider) null);
    }

    public qeh1(x6o1 x6o1Var) {
        this.a = (byte) 18;
        Charset charset = wbo1.a;
        this.b = x6o1Var;
        x6o1Var.a = this;
    }

    public /* synthetic */ qeh1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
