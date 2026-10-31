package p;

import android.preference.PreferenceManager;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.home.evopage.mobius.State;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rjd implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rjd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onPause(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ne neVar = (ne) obj;
                ((LinkedHashSet) neVar.b).clear();
                ((rku) neVar.d).a();
                break;
            case 1:
                uoa uoaVar = (uoa) ((ven0) obj).getValue();
                if (uoaVar != null) {
                    uoaVar.f();
                }
                break;
            case 2:
                ((FlowableEmitter) obj).onNext(Boolean.FALSE);
                break;
            case 3:
                el00 el00Var = (el00) obj;
                ho60 ho60Var = el00Var.e;
                RecyclerView recyclerView = el00Var.T0;
                ho60Var.e = false;
                faa0 faa0Var = ho60Var.j;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                ho60Var.j = null;
                ho60Var.k.c(ho60.l[0], ho60Var, Boolean.FALSE);
                ho60Var.b.a(wdu0.c);
                k611 k611Var = ho60Var.g;
                if (k611Var != null) {
                    recyclerView.p0(k611Var);
                }
                go60 go60Var = ho60Var.h;
                if (go60Var != null) {
                    recyclerView.p0(go60Var);
                }
                break;
            case 4:
                ((Consumer) obj).accept(new x050(false));
                break;
            case 5:
                ((tr60) obj).l1.a();
                break;
            case 6:
                djr0 djr0Var = (djr0) obj;
                djr0Var.g = false;
                djr0Var.h();
                break;
            case 7:
                q450 q450Var = ((h751) obj).d;
                q450Var.c = ((m251) ((bpb1) ((z72) ((g931) q450Var.i).c).X).getValue()).b;
                break;
            case 8:
                ((y5j1) obj).f1.a();
                break;
            default:
                ((tij1) obj).g1.a();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    public final void onResume(iac0 iac0Var) {
        ArrayList arrayListL;
        chm0 model;
        View view;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ne) obj).a0();
                break;
            case 1:
                uoa uoaVar = (uoa) ((ven0) obj).getValue();
                if (uoaVar != null) {
                    uoaVar.l();
                }
                break;
            case 2:
                ((FlowableEmitter) obj).onNext(Boolean.TRUE);
                break;
            case 3:
                el00 el00Var = (el00) obj;
                ho60 ho60Var = el00Var.e;
                RecyclerView recyclerView = el00Var.T0;
                State.Content content = (State) el00Var.c.Q0.e();
                if (content == null) {
                    arrayListL = z6x.a;
                } else {
                    State.Content content2 = content instanceof State.Content ? content : null;
                    if (content2 == null || (model = content2.getModel()) == null) {
                        arrayListL = z6x.a;
                    } else {
                        arrayListL = apo.l(model);
                    }
                }
                ArrayList arrayList = arrayListL;
                boolean z = el00Var.i;
                cir0 cir0Var = el00Var.t;
                ho60Var.e = true;
                ho60Var.f = z;
                k611 k611Var = ho60Var.g;
                if (k611Var != null) {
                    recyclerView.p0(k611Var);
                }
                go60 go60Var = ho60Var.h;
                if (go60Var != null) {
                    recyclerView.p0(go60Var);
                }
                faa0 faa0Var = ho60Var.j;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                iac0 iac0VarE = cir0Var.e();
                ho60Var.j = fn31.T(cto1.q(iac0VarE), (o8n) null, 0, new f530(cir0Var, iac0VarE, ho60Var, (lnm) null, (byte) 17), 3);
                boolean z2 = ho60Var.f;
                Object systemService = recyclerView.getContext().getSystemService("accessibility");
                AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                boolean z3 = accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
                boolean z4 = ho60Var.c;
                xvy xvyVar = new xvy(ho60Var, recyclerView, arrayList, (byte) 15);
                to60 to60Var = z4 ? new to60(xvyVar) : new zl7(xvyVar, (byte) 6);
                ho60Var.g = to60Var;
                recyclerView.m(to60Var);
                go60 go60Var2 = new go60(ho60Var, arrayList, z2, z3, recyclerView);
                ho60Var.h = go60Var2;
                recyclerView.m(go60Var2);
                recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new pq00(recyclerView, ho60Var, arrayList, (byte) 1));
                PreferenceManager.getDefaultSharedPreferences(recyclerView.getContext().getApplicationContext());
                break;
            case 4:
                ((Consumer) obj).accept(new x050(true));
                break;
            case 5:
                tr60 tr60Var = (tr60) obj;
                if (tr60Var.i1.k) {
                    dtw dtwVar = tr60Var.q1;
                    view = dtwVar != null ? dtwVar.w : null;
                } else {
                    view = tr60Var.p1;
                }
                tr60Var.l1.b(Observable.combineLatest(tr60Var.Y0.e, tr60Var.X0.a().startWithItem(new rwj1(w7x.a)), new lhc(tr60Var, (byte) 12)).distinctUntilChanged().observeOn(tr60Var.f1).subscribe(new lgr(tr60Var, view, (byte) 27)));
                break;
            case 6:
                djr0 djr0Var = (djr0) obj;
                djr0Var.g = true;
                if (djr0Var.h) {
                    djr0Var.f();
                }
                break;
            case 7:
                q450 q450Var = ((h751) obj).d;
                if (q450Var.c) {
                    ((z72) ((g931) q450Var.i).c).k(q450Var.b);
                }
                break;
            case 8:
                y5j1 y5j1Var = (y5j1) obj;
                y5j1Var.f1.b(y5j1Var.U0.distinctUntilChanged().observeOn(y5j1Var.X0).subscribe(new z2a1(y5j1Var, (byte) 29)));
                break;
            default:
                tij1 tij1Var = (tij1) obj;
                tij1Var.g1.b(Observable.combineLatest(tij1Var.V0.e, tij1Var.U0, n9x0.V0).distinctUntilChanged().observeOn(tij1Var.Y0).subscribe(new rdj1(tij1Var, (byte) 1)));
                break;
        }
    }
}
