package p;

import android.media.SoundPool;
import android.view.ViewManager;
import android.view.ViewParent;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i83 implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i83(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onDestroy(iac0 iac0Var) {
        axn0 axn0Var;
        switch (this.a) {
            case 0:
                ((stt0) this.b).d();
                iac0Var.getLifecycle().d(this);
                return;
            case 1:
                ((b93) this.b).stop();
                return;
            case 2:
                z6b z6bVar = (z6b) this.b;
                ViewParent parent = z6bVar.getParent();
                ViewManager viewManager = parent instanceof ViewManager ? (ViewManager) parent : null;
                if (viewManager != null) {
                    viewManager.removeView(z6bVar);
                    return;
                }
                return;
            case 3:
                ((Disposable) this.b).dispose();
                return;
            case 4:
                ((p1b0) this.b).a = null;
                return;
            case 5:
                s9x s9xVar = (s9x) this.b;
                s9xVar.f.c();
                ((f0i) s9xVar.b).a.d(this);
                return;
            case 6:
                gi30 gi30Var = (gi30) this.b;
                int i = gi30Var.f - 1;
                if (i < 0) {
                    i = 0;
                }
                gi30Var.f = i;
                WeakReference weakReference = gi30Var.d;
                if (weakReference != null && (axn0Var = (axn0) weakReference.get()) != null) {
                    axn0Var.c.onNext(Boolean.valueOf(gi30Var.f > 0));
                }
                gi30Var.c();
                iac0Var.getLifecycle().d(this);
                return;
            case 7:
                t740 t740Var = (t740) this.b;
                t740Var.e.c();
                ((f0i) t740Var.a).a.d(this);
                return;
            case 8:
                ((Disposable) ((wp20) this.b).e).dispose();
                return;
            case 9:
                iac0Var.getLifecycle().d(this);
                h9c0 h9c0Var = (h9c0) this.b;
                LinkedHashSet linkedHashSet = h9c0Var.c;
                List<uoa> listL1 = o7h.l1(linkedHashSet);
                linkedHashSet.clear();
                for (uoa uoaVar : listL1) {
                    uoaVar.u();
                    h9c0Var.b.c(uoaVar);
                }
                return;
            case 10:
                ((mko) this.b).stop();
                return;
            case 11:
                ((jpd0) this.b).a.stop();
                return;
            case 12:
                ipe0 ipe0Var = (ipe0) this.b;
                if (ipe0Var.b == iac0Var) {
                    ipe0Var.b = null;
                    return;
                }
                return;
            case 13:
                LinkedHashMap linkedHashMap = ((lnn0) this.b).b;
                Iterator it = o7h.l1(linkedHashMap.values()).iterator();
                while (it.hasNext()) {
                    ((knn0) it.next()).b.invoke();
                }
                linkedHashMap.clear();
                return;
            case 14:
                jvn0 jvn0Var = (jvn0) this.b;
                nt21 nt21Var = jvn0Var.f;
                ((un41) nt21Var.b).b = true;
                vn41 vn41Var = (vn41) nt21Var.c;
                Object obj = vn41Var.b;
                un41 un41Var = (un41) nt21Var.b;
                synchronized (obj) {
                    vn41Var.d.remove(un41Var);
                }
                jvn0Var.a.getLifecycle().d(jvn0Var.g);
                iac0Var.getLifecycle().d(this);
                return;
            case 15:
                ((ydb) this.b).e();
                return;
            case 16:
                ((shq0) this.b).invoke();
                return;
            case 17:
                x841 x841Var = (x841) this.b;
                x841Var.f.c();
                ((f0i) x841Var.b).a.d(this);
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                x841 x841Var2 = (x841) this.b;
                x841Var2.f.c();
                ((f0i) x841Var2.b).a.d(this);
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((sw41) this.b).a.stop();
                return;
            case 20:
                ((s551) this.b).destroy();
                return;
            case 21:
                ((pf61) this.b).c--;
                return;
            case 22:
                zja1 zja1Var = (zja1) this.b;
                smo1.p(zja1Var.e, (CancellationException) null);
                ((SoundPool) zja1Var.g.getValue()).release();
                return;
            case 23:
                zjb1 zjb1Var = (zjb1) this.b;
                zjb1Var.d.c();
                ((f0i) zjb1Var.a).a.d(this);
                return;
            case 24:
                s9x s9xVar2 = (s9x) this.b;
                s9xVar2.f.c();
                ((f0i) s9xVar2.b).a.d(this);
                return;
            case 25:
                neg1 neg1Var = (neg1) this.b;
                neg1Var.I();
                neg1Var.d1.clear();
                return;
            default:
                ((cll1) this.b).g.a();
                return;
        }
    }
}
