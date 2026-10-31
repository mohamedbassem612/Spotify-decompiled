package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fsv0 implements i8l {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public /* synthetic */ fsv0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }

    public final h8l a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        switch (b) {
            case 0:
                CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131625436, (ViewGroup) null, false);
                int i = 2131428723;
                FrameLayout frameLayout = (FrameLayout) m5n1.t(coordinatorLayoutInflate, 2131428723);
                if (frameLayout != null) {
                    i = 2131430312;
                    AppBarLayout appBarLayoutT = m5n1.t(coordinatorLayoutInflate, 2131430312);
                    if (appBarLayoutT != null) {
                        CoordinatorLayout coordinatorLayout = coordinatorLayoutInflate;
                        i = 2131430314;
                        NestedScrollView nestedScrollViewT = m5n1.t(coordinatorLayoutInflate, 2131430314);
                        if (nestedScrollViewT != null) {
                            i = 2131430315;
                            LinearLayout linearLayout = (LinearLayout) m5n1.t(coordinatorLayoutInflate, 2131430315);
                            if (linearLayout != null) {
                                i = 2131430317;
                                if (m5n1.t(coordinatorLayoutInflate, 2131430317) != null) {
                                    i = 2131430531;
                                    ProgressBar progressBar = (ProgressBar) m5n1.t(coordinatorLayoutInflate, 2131430531);
                                    if (progressBar != null) {
                                        return new wva0(context, new mzr0(coordinatorLayout, frameLayout, appBarLayoutT, coordinatorLayout, nestedScrollViewT, linearLayout, progressBar), (ekb) obj2, (mzr0) obj3, (uvv0) obj, (PublishSubject) obj4, (lyp) obj8, (myp) obj7, (nyp) obj6, (rrv0) obj5);
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(coordinatorLayoutInflate.getResources().getResourceName(i)));
                return null;
            default:
                nm1 nm1VarA = ((afs) obj8).a((u9u0) obj7, cwl1.C((q7r0) obj6));
                sd41 sd41Var = (sd41) ((cxi1) ((goq) ((fuq) obj3).a.c).g).l.get();
                c8o.l(sd41Var);
                return new gxi1(layoutInflater, (t8r0) obj5, bundle, (jqr) obj4, new ng20(sd41Var), (xfx) obj2, (gw70) obj, new j2i(-756899275, new sgi1(this, nm1VarA, (byte) 4), true));
        }
    }
}
