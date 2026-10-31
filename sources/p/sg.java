package p;

import android.hardware.SensorManager;
import android.os.Bundle;
import android.webkit.WebView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sg implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public sg(q811 q811Var, String str, String str2, int i) {
        this.a = (byte) 9;
        this.b = q811Var;
        this.c = str;
        this.d = str2;
    }

    public final void dispose() {
        otu otuVarS;
        ek60 ek60Var;
        ejw0 ejw0Var;
        switch (this.a) {
            case 0:
                ((Function0) this.b).invoke();
                ((iac0) this.c).getLifecycle().d((rg) this.d);
                return;
            case 1:
                boolean zBooleanValue = ((Boolean) ((ven0) this.c).getValue()).booleanValue();
                o03 o03Var = (o03) this.b;
                r03 r03Var = o03Var.b;
                v03 v03Var = o03Var.f;
                if (zBooleanValue) {
                    v03Var.a.a(new s03(r03Var.a, (tv80) ((ven0) this.d).getValue()));
                    return;
                } else {
                    v03Var.a.a(new t03(r03Var.a));
                    return;
                }
            case 2:
                bw91 bw91Var = (bw91) this.b;
                Object obj = this.c;
                bw91Var.remove(obj);
                ((eb5) this.d).e.k(obj);
                return;
            case 3:
                ((SensorManager) this.b).unregisterListener((ud6) this.c);
                ((wq50) this.d).c = false;
                return;
            case 4:
                ((mmf) this.b).d.g((String) this.c, (hmf) this.d);
                return;
            case 5:
                x1i x1iVar = (x1i) ((cce) this.b).c;
                o1i o1iVar = (o1i) this.c;
                z0i z0iVar = (z0i) this.d;
                LinkedHashMap linkedHashMap = x1iVar.a;
                Class<?> cls = z0iVar.getClass();
                Object arrayList = linkedHashMap.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(cls, arrayList);
                }
                List list = (List) arrayList;
                if (list.size() < 5) {
                    list.add(o1iVar);
                    return;
                }
                return;
            case 6:
                spr sprVar = (spr) this.b;
                qor qorVar = (qor) sprVar.h.getValue();
                fn31.T(qorVar.f, null, 0, new mor(qorVar, ((bnl) this.c).f, (lnm) null, (byte) 1), 3);
                wpr wprVar = (wpr) sprVar.g.getValue();
                kub1 kub1Var = kub1.Z;
                faa0 faa0Var = wprVar.c;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                gh91 gh91Var = wprVar.d;
                if (gh91Var != null) {
                    gh91Var.h.invoke(kub1Var);
                }
                wprVar.d = null;
                ((ven0) this.d).setValue((Object) null);
                return;
            case 7:
                ((iac0) this.c).getLifecycle().d((ek2) this.b);
                vtt vttVar = (vtt) this.d;
                iur iurVar = vttVar.d;
                iurVar.a.m((Object) null, vxs0.b);
                iurVar.b.m((Object) null, Boolean.FALSE);
                iurVar.a.m((Object) null, vxs0.c);
                knr knrVar = vttVar.g;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                yon1.T0();
                knrVar.i();
                vttVar.i.b();
                return;
            case 8:
                e3u e3uVar = (e3u) this.b;
                hnn0 hnn0Var = (hnn0) this.c;
                e3uVar.b().c(hnn0Var);
                ((bw91) this.d).remove(hnn0Var);
                return;
            case 9:
                op80 op80Var = (op80) ((q811) this.b).a;
                if (op80Var == null || (otuVarS = z8p1.s(op80Var)) == null) {
                    return;
                }
                otuVarS.g((String) this.c, (String) this.d);
                return;
            case 10:
                ((iac0) this.c).getLifecycle().d((y9c0) this.b);
                pac0 pac0Var = (pac0) ((p811) this.d).a;
                if (pac0Var != null) {
                    pac0Var.a();
                    return;
                }
                return;
            case 11:
                ((iac0) this.c).getLifecycle().d((y9c0) this.b);
                dbc0 dbc0Var = (dbc0) ((p811) this.d).a;
                if (dbc0Var != null) {
                    dbc0Var.a();
                    return;
                }
                return;
            case 12:
                ((ttm0) this.b).b((zau0) this.c);
                ven0 ven0Var = (ven0) this.d;
                AtomicLong atomicLong = bcn0.a;
                r091 r091Var = (r091) ven0Var.getValue();
                if (r091Var != null) {
                    r091Var.i((VideoSurfaceView) null);
                }
                r091 r091Var2 = (r091) ven0Var.getValue();
                if (r091Var2 != null) {
                    r091Var2.g();
                    return;
                }
                return;
            case 13:
                ((tte0) this.b).g.b.e.d.d((edo0) this.c);
                ((jac0) this.d).a.g(k8c0.ON_DESTROY);
                return;
            case 14:
                bw91 bw91Var2 = (bw91) this.b;
                kwq0 kwq0Var = (kwq0) this.c;
                bw91Var2.remove(kwq0Var);
                ((kd41) this.d).b(kwq0Var.a);
                return;
            case 15:
                UUID uuid = (UUID) this.d;
                bw91 bw91Var3 = ((mwq0) this.b).b;
                if (bw91Var3 == null || !bw91Var3.isEmpty()) {
                    ek60 ek60VarListIterator = bw91Var3.listIterator();
                    do {
                        ek60Var = ek60VarListIterator;
                        if (ek60Var.hasNext()) {
                        }
                    } while (!u890.j(((kwq0) ek60Var.next()).a, uuid));
                    return;
                }
                ((kd41) this.c).b(uuid);
                return;
            case 16:
                WebView webView = (WebView) ((ven0) this.b).getValue();
                if (webView == null) {
                    return;
                }
                webView.stopLoading();
                if (((gpv0) this.c) == null) {
                    webView.saveState((Bundle) this.d);
                    webView.loadUrl("about:blank");
                    return;
                }
                return;
            case 17:
                ((Disposable) this.b).dispose();
                ((MobiusLoop) this.c).dispose();
                fjw0 fjw0Var = (fjw0) this.d;
                synchronized (fjw0Var.b) {
                    ejw0Var = fjw0Var.c;
                }
                if (ejw0Var != null) {
                    ejw0Var.d(3);
                    return;
                }
                return;
            case 18:
                ld41 ld41Var = (ld41) this.b;
                nen0 nen0Var = ld41Var.b;
                Object obj2 = this.c;
                Object objK = nen0Var.k(obj2);
                qd41 qd41Var = (qd41) this.d;
                if (objK == qd41Var) {
                    Map map = ld41Var.a;
                    Map mapE = qd41Var.e();
                    if (mapE.isEmpty()) {
                        map.remove(obj2);
                        return;
                    } else {
                        map.put(obj2, mapE);
                        return;
                    }
                }
                return;
            default:
                w9u0 w9u0Var = (w9u0) this.c;
                yxa1 yxa1Var = (yxa1) this.b;
                bpb1 bpb1Var = yxa1Var.o.a;
                Boolean bool = Boolean.FALSE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                if (((Boolean) ((ven0) this.d).getValue()).booleanValue()) {
                    return;
                }
                lr0 lr0Var = yxa1Var.l;
                w9u0Var.getClass();
                lr0Var.b(w9u0Var);
                return;
        }
    }

    public /* synthetic */ sg(iac0 iac0Var, aac0 aac0Var, Object obj, byte b) {
        this.a = b;
        this.c = iac0Var;
        this.b = aac0Var;
        this.d = obj;
    }

    public /* synthetic */ sg(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
