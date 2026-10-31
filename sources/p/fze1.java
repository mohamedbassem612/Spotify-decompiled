package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fze1 implements i570, o5s {
    public final upa0 a;
    public final ccc0 b;
    public final uny c;
    public final ek1 d;
    public final q8n e;
    public final vku f;

    public fze1(iac0 iac0Var, upa0 upa0Var, ccc0 ccc0Var, uny unyVar, ek1 ek1Var, q8n q8nVar) {
        this.a = upa0Var;
        this.b = ccc0Var;
        this.c = unyVar;
        this.d = ek1Var;
        this.e = q8nVar;
        iac0Var.getLifecycle().a(this);
        this.f = new vku();
    }

    public final void a(j570 j570Var, u570 u570Var) {
        w7h1 w7h1VarA;
        CompletableSubscribeOn completableSubscribeOnS;
        ps4 ps4Var = ps4.a1;
        Object obj = u570Var.c.get("shouldAddToLibrary");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        String strB = ((sc70) j570Var).b.c.B("uri");
        if (bool == null || strB == null || strB.length() == 0) {
            return;
        }
        Set set = s4b1.f;
        boolean z = uic.g(strB, blc0.g1) || uic.g(strB, blc0.ti) || uic.g(strB, blc0.u1);
        if (z || uic.g(strB, blc0.Pg) || uic.j(strB, nyu0.e)) {
            HubsImmutableComponentBundle hubsImmutableComponentBundleR = u570Var.b.r();
            boolean zBooleanValue = bool.booleanValue();
            x6h1 x6h1VarG = y1a1.G(hubsImmutableComponentBundleR, "");
            x6h1VarG.g = "22.0.0";
            y6h1 y6h1Var = (y6h1) ((x5j1) new x5j1(x6h1VarG.a(), (byte) 12).f().c).b;
            if (zBooleanValue) {
                v7h1 v7h1Var = new v7h1();
                ((xjn) v7h1Var).a = y6h1Var;
                ((xjn) v7h1Var).c = Long.valueOf(System.currentTimeMillis());
                t6h1 t6h1Var = t6h1.f;
                o3b1 o3b1VarJ = f3o1.j();
                o3b1VarJ.c = "hit";
                o3b1VarJ.b = "like";
                o3b1VarJ.a = (byte) 3;
                o3b1.b(o3b1VarJ, "item_to_be_liked", strB);
                v7h1Var.e = o3b1VarJ.a();
                w7h1VarA = (w7h1) v7h1Var.a();
            } else {
                v7h1 v7h1Var2 = new v7h1();
                ((xjn) v7h1Var2).a = y6h1Var;
                ((xjn) v7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                t6h1 t6h1Var2 = t6h1.f;
                o3b1 o3b1VarJ2 = f3o1.j();
                o3b1VarJ2.c = "hit";
                o3b1VarJ2.b = "remove_like";
                o3b1VarJ2.a = (byte) 1;
                o3b1.b(o3b1VarJ2, "item_no_longer_liked", strB);
                v7h1Var2.e = o3b1VarJ2.a();
                w7h1VarA = v7h1Var2.a();
            }
            tv80 tv80VarM = ((i8h1) this.a.b).m(w7h1VarA, (xj61) null);
            vku vkuVar = this.f;
            if (z) {
                vkuVar.a(j2h1.D(this.e, new kv1(bool.booleanValue(), this, strB, new ubc0(tv80VarM), (lnm) null, (byte) 18)).subscribe(ps4Var, new eze1((byte) 0, this, strB, bool.booleanValue())));
                return;
            }
            if (!uic.g(strB, blc0.Pg)) {
                vkuVar.a(((Completable) this.d.invoke(strB, bool)).subscribe(ps4Var, new eze1((byte) 0, this, strB, bool.booleanValue())));
                return;
            }
            boolean zBooleanValue2 = bool.booleanValue();
            uny unyVar = this.c;
            Scheduler scheduler = (Scheduler) unyVar.d;
            rpm1 rpm1Var = (rpm1) unyVar.b;
            if (zBooleanValue2) {
                completableSubscribeOnS = j2h1.D(o6x.a, new qpm1((ppm1) null, rpm1Var, Collections.singletonList(strB), (lnm) null)).g(new ycz(unyVar, (byte) 0)).s(scheduler);
            } else {
                completableSubscribeOnS = rpm1.a(rpm1Var, Collections.singletonList(strB)).g(new ycz(unyVar, (byte) 1)).s(scheduler);
            }
            vkuVar.a(completableSubscribeOnS.subscribe(ps4Var, new eze1((byte) 0, this, strB, bool.booleanValue())));
        }
    }

    public final void onDestroy(iac0 iac0Var) {
        iac0Var.getLifecycle().d(this);
    }

    public final void onStop(iac0 iac0Var) {
        this.f.c();
    }
}
