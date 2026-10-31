package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kqw implements f4h1, d031 {
    public final CoordinatorLayout a;
    public final ArrayList b;
    public final ArrayList c;
    public Bundle d;
    public final BehaviorProcessor e;

    public kqw(String str, CoordinatorLayout coordinatorLayout, gqw gqwVar, fqw fqwVar, op80 op80Var, qe41 qe41Var, mr20 mr20Var, Bundle bundle) {
        int id;
        this.a = coordinatorLayout;
        fai0 fai0Var = new fai0();
        this.b = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = mno1.g();
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        this.e = behaviorProcessor;
        xhk1.c(coordinatorLayout, j6p1.k(j6p1.k(new jp80(new jqw(this, (byte) 1)), op80Var), new g6r0(mr20Var != null ? yoi1.h(mr20Var, o6x.a) : new FlowableOnBackpressureLatest(behaviorProcessor.t(Functions.a)))));
        laa laaVarA = fqwVar.a(fai0Var);
        tka0 tka0Var = dtw.C;
        coordinatorLayout.addView(mhc.b(coordinatorLayout.getContext(), coordinatorLayout, laaVarA, new dqw(str), z1a1.h(laaVarA, "HeaderElement_key", qe41Var, new dqw(str)), 96).w, new h3n(-1, -2));
        wpw wpwVarA = gqwVar.a(new iqw(this, (byte) 0), new iqw(this, (byte) 1), new jqw(this, (byte) 0));
        Context context = coordinatorLayout.getContext();
        rih1 rih1Var = rih1.a;
        dtw dtwVarB = mhc.b(context, coordinatorLayout, wpwVarA, rih1Var, z1a1.h(wpwVarA, "TabsElement_key", qe41Var, rih1Var), 96);
        View view = dtwVarB.w;
        coordinatorLayout.addView(view);
        h3n h3nVar = new h3n(-1, -1);
        h3nVar.b(new AppBarLayout.ScrollingViewBehavior());
        view.setLayoutParams(h3nVar);
        hqw hqwVar = new hqw(dtwVarB);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(view, hqwVar);
        if (!coordinatorLayout.isLaidOut() || coordinatorLayout.isLayoutRequested()) {
            coordinatorLayout.addOnLayoutChangeListener(new yun((byte) 1));
        } else {
            View viewFindViewWithTag = coordinatorLayout.findViewWithTag("appBarLayout");
            if (viewFindViewWithTag != null) {
                viewFindViewWithTag.setFocusable(false);
                viewFindViewWithTag.setFocusableInTouchMode(false);
            }
            View viewFindViewWithTag2 = coordinatorLayout.findViewWithTag("backButton");
            View viewFindViewWithTag3 = coordinatorLayout.findViewWithTag("find");
            View viewFindViewWithTag4 = coordinatorLayout.findViewWithTag("headerTitle");
            View viewFindViewWithTag5 = coordinatorLayout.findViewWithTag("tabsContainer");
            View viewFindViewWithTag6 = coordinatorLayout.findViewWithTag("lastHeaderAction");
            if (viewFindViewWithTag2 != null) {
                if (viewFindViewWithTag3 != null) {
                    id = viewFindViewWithTag3.getId();
                } else {
                    id = viewFindViewWithTag4 != null ? viewFindViewWithTag4.getId() : -1;
                }
                viewFindViewWithTag2.setNextFocusForwardId(id);
            }
            if (viewFindViewWithTag3 != null) {
                viewFindViewWithTag3.setNextFocusForwardId(viewFindViewWithTag4 != null ? viewFindViewWithTag4.getId() : -1);
            }
            if (viewFindViewWithTag6 != null) {
                viewFindViewWithTag6.setNextFocusForwardId(viewFindViewWithTag5 != null ? viewFindViewWithTag5.getId() : -1);
            }
            if (viewFindViewWithTag2 != null) {
                viewFindViewWithTag2.requestFocus();
            }
        }
        if (bundle != null) {
            this.d = bundle;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((iu30) it.next()).invoke(bundle);
            }
        }
    }

    public final Object getView() {
        return this.a;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((iu30) it.next()).invoke(bundle);
        }
        return bundle;
    }

    public final void start() {
        this.e.onNext(Boolean.TRUE);
    }

    public final void stop() {
        BehaviorProcessor behaviorProcessor = this.e;
        if (behaviorProcessor.f0()) {
            behaviorProcessor.onNext(Boolean.FALSE);
        }
    }
}
