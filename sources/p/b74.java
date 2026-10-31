package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b74 extends nba {
    public static final t380 A = t380.w("com.spotify.music.extra.CONTEXT_URI", "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", "android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", "android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", "android.media.IS_EXPLICIT", "android.media.extra.PLAYBACK_STATUS", new String[]{"android.media.extra.DOWNLOAD_STATUS", "com.spotify.music.extra.PLAY_ORIGIN", "androidx.media.MediaItem.Extras.COMPLETION_PERCENTAGE", "spotify.ubi"});
    public final a6h1 q;
    public final y6x0 r;
    public final Scheduler s;
    public final oih0 t;
    public final uic u;
    public final PublishSubject v;
    public final LinkedHashMap w;
    public final LinkedHashMap x;
    public final LinkedHashMap y;
    public final boolean z;

    public b74(ruk rukVar, x610 x610Var, lxh0 lxh0Var, yu3 yu3Var, g510 g510Var, oyr oyrVar, k811 k811Var, r8l r8lVar, yqg yqgVar, xgb0 xgb0Var, u210 u210Var, a6h1 a6h1Var, y6x0 y6x0Var, Scheduler scheduler, oih0 oih0Var, uic uicVar) {
        super(rukVar, x610Var, lxh0Var, yu3Var, g510Var, oyrVar, k811Var, r8lVar, yqgVar, xgb0Var, u210Var, oih0Var, uicVar);
        this.q = a6h1Var;
        this.r = y6x0Var;
        this.s = scheduler;
        this.t = oih0Var;
        this.u = uicVar;
        this.v = new PublishSubject();
        this.w = new LinkedHashMap();
        this.x = new LinkedHashMap();
        this.y = new LinkedHashMap();
        this.z = true;
    }

    public static boolean o(String str) {
        return nhc1.R(str, "com.spotify.androidauto.home", false) || nhc1.R(str, "com.spotify.recently-played", false) || nhc1.R(str, "com.spotify.browse", false) || nhc1.R(str, "com.spotify.your-library", false);
    }

    public final void b(vsr0 vsr0Var) {
        String str = vsr0Var.a;
        Disposable disposable = (Disposable) this.x.remove(str);
        if (disposable != null) {
            disposable.dispose();
        }
        this.w.remove(str);
    }

    public final void c(vsr0 vsr0Var, Bundle bundle, iu30 iu30Var) {
        ou80 ou80VarN;
        Observable observableEmpty;
        ou80 ou80VarN2;
        ((nba) this).n = ((nba) this).h.b();
        String str = vsr0Var.a;
        ruk rukVar = ((nba) this).a;
        if ("empty".equals(rukVar.b.a)) {
            super.c(vsr0Var, bundle, iu30Var);
            return;
        }
        LinkedHashMap linkedHashMap = this.x;
        boolean zContainsKey = linkedHashMap.containsKey(str);
        LinkedHashMap linkedHashMap2 = this.w;
        if (zContainsKey) {
            List list = (List) linkedHashMap2.get(str);
            if (list == null) {
                b(vsr0Var);
                c(vsr0Var, bundle, iu30Var);
                return;
            } else {
                iu30Var.invoke(list);
                if (o(str)) {
                    return;
                }
                linkedHashMap2.remove(str);
                return;
            }
        }
        String strZ0 = ihc1.Z0(str, "?ubi=");
        vsr0 vsr0Var2 = new vsr0(strZ0);
        r9c r9cVarM = m(vsr0Var2);
        String str2 = r9cVarM.b;
        Integer numC0 = nhc1.c0(ihc1.U0(str, "?ubi=", str));
        y310 y310Var = numC0 != null ? (y310) this.q.a.get(Integer.valueOf(numC0.intValue())) : null;
        if (y310Var != null) {
            LinkedHashMap linkedHashMap3 = this.y;
            Object obj = linkedHashMap3.get(str2);
            if (obj == null) {
                Boolean bool = Boolean.FALSE;
                this.r.getClass();
                w7h1 w7h1VarC = y6x0.c(2, str2, y310Var);
                if (w7h1VarC != null) {
                    m210 m210Var = rukVar.d;
                    g510 g510Var = ((nba) this).e;
                    ou80VarN2 = g510Var.r(m210Var, g510Var.h.a(str2), w7h1VarC);
                } else {
                    ou80VarN2 = super.n(r9cVarM);
                }
                mmr0 mmr0Var = new mmr0(bool, ou80VarN2);
                linkedHashMap3.put(str2, mmr0Var);
                obj = mmr0Var;
            }
            mmr0 mmr0Var2 = (mmr0) obj;
            ou80VarN = !((Boolean) mmr0Var2.a).booleanValue() ? (ou80) mmr0Var2.b : null;
        } else {
            ou80VarN = n(r9cVarM);
        }
        fdc fdcVarB = ((nba) this).i.b(rukVar.a, str2, u890.j(rukVar.c(), vsr0Var2));
        Observable map = ((c610) ((nba) this).b.a.e.get()).e(r9cVarM, bundle).timeout(Observable.timer(30L, TimeUnit.SECONDS, this.s), mm10.Y).map(new em3(this, y310Var, str2)).map(new km3(this, y310Var, (byte) 3));
        List list2 = (List) linkedHashMap2.get(str);
        if (list2 == null || (observableEmpty = Observable.just(new mmr0(m510.b, list2))) == null) {
            observableEmpty = Observable.empty();
        }
        Disposable disposableSubscribe = map.startWith(observableEmpty).doOnEach(new a21(new n2(new z1(this, str2, ou80VarN, iu30Var, fdcVarB, str, strZ0), new cc2(this, str, (byte) 18), (byte) 29), new n811(), (byte) 7)).onErrorResumeNext(new ow3(str, this, (byte) 2)).subscribe();
        if (disposableSubscribe.isDisposed()) {
            return;
        }
        linkedHashMap.put(str, disposableSubscribe);
    }

    public final void d(String str, Bundle bundle, String str2, q1m q1mVar, iu30 iu30Var, vu30 vu30Var, Function0 function0) {
        ruk rukVar = ((nba) this).a;
        ((nba) this).m.a(this.t.b(new nih0(str2, rukVar.a, str, 0, false, q1mVar, 16)).map(new em3(this, str2 == null ? rukVar.a : str2, (byte) 5)).doOnDispose(new z64(iu30Var, function0, (byte) 0)).subscribe(new a74(iu30Var, (byte) 0), new a21(iu30Var, vu30Var, (byte) 8)));
    }

    public final void destroy() {
        super.destroy();
        Iterator it = this.x.entrySet().iterator();
        while (it.hasNext()) {
            ((Disposable) ((Map.Entry) it.next()).getValue()).dispose();
        }
        this.w.clear();
    }

    public final boolean h() {
        return this.z;
    }

    public final void i(vsr0 vsr0Var) {
        Disposable disposable = (Disposable) this.x.remove(vsr0Var.a);
        if (disposable != null) {
            disposable.dispose();
        }
        this.u.getClass();
        this.y.remove(uic.r(vsr0Var));
    }

    public final ou80 n(r9c r9cVar) {
        String str = r9cVar.b;
        LinkedHashMap linkedHashMap = this.y;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            mmr0 mmr0Var = new mmr0(Boolean.FALSE, super.n(r9cVar));
            linkedHashMap.put(str, mmr0Var);
            obj = mmr0Var;
        }
        mmr0 mmr0Var2 = (mmr0) obj;
        boolean zBooleanValue = ((Boolean) mmr0Var2.a).booleanValue();
        ou80 ou80Var = (ou80) mmr0Var2.b;
        if (zBooleanValue) {
            return null;
        }
        return ou80Var;
    }

    public final void j(vsr0 vsr0Var) {
    }
}
