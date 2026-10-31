package com.spotify.allboarding.allboardingimpl.presentation.summary;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.allboarding.greatpicksloadingview.GreatPicksLoadingView;
import com.spotify.allboarding.uiusecases.contentstack.ContentStackView;
import com.spotify.encoreconsumermobile.elements.loadingdots.ThreeDotsLoaderView;
import com.spotify.encoremobile.facepile.FacePileView;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p.af10;
import p.eg;
import p.en3;
import p.gw70;
import p.k4p1;
import p.l1d;
import p.o7h;
import p.p6m;
import p.q7h;
import p.qpl;
import p.sd10;
import p.td10;
import p.tto1;
import p.u890;
import p.ul4;
import p.x11;
import p.xo41;
import p.yg30;
import p.zf30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/spotify/allboarding/allboardingimpl/presentation/summary/SummaryFragment;", "Lp/zf30;", "Lp/yg30;", "injector", "<init>", "(Lp/yg30;)V", "src_main_java_com_spotify_allboarding_allboardingimpl-allboardingimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SummaryFragment extends zf30 {
    public final yg30 F1;
    public gw70 G1;
    public Scheduler H1;
    public ul4 I1;
    public en3 J1;
    public GreatPicksLoadingView K1;
    public xo41 L1;

    public SummaryFragment(yg30 yg30Var) {
        super(2131626216);
        this.F1 = yg30Var;
    }

    public final void F0(Bundle bundle) {
        xo41 xo41Var = this.L1;
        if (xo41Var != null) {
            bundle.putParcelable("SCREEN", xo41Var);
        } else {
            u890.C("screen");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, com.spotify.allboarding.greatpicksloadingview.GreatPicksLoadingView] */
    public final void I0(View view, Bundle bundle) {
        xo41 xo41Var;
        p6m p6mVar;
        if (bundle == null) {
            en3 en3Var = this.J1;
            if (en3Var == null) {
                u890.C("screenProvider");
                throw null;
            }
            xo41Var = (xo41) en3Var.a;
        } else {
            Parcelable parcelable = bundle.getParcelable("SCREEN");
            parcelable.getClass();
            xo41Var = (xo41) parcelable;
        }
        this.L1 = xo41Var;
        this.K1 = (GreatPicksLoadingView) view.findViewById(2131429038);
        N0().J().a(n0(), new x11((byte) 3, true));
        xo41 xo41Var2 = this.L1;
        if (xo41Var2 == null) {
            u890.C("screen");
            throw null;
        }
        ?? r3 = this.K1;
        if (r3 == 0) {
            u890.C("greatPicksLoadingView");
            throw null;
        }
        Scheduler scheduler = this.H1;
        if (scheduler == null) {
            u890.C("scheduler");
            throw null;
        }
        gw70 gw70Var = this.G1;
        if (gw70Var == null) {
            u890.C("imageLoader");
            throw null;
        }
        List list = xo41Var2.b;
        ArrayList<qpl> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((qpl) obj).h.length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (qpl qplVar : arrayList) {
            int i = qplVar.X;
            String str = qplVar.h;
            int iC = l1d.C(i);
            if (iC == 0) {
                p6mVar = new p6m(str, 2);
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                p6mVar = new p6m(str, 1);
            }
            arrayList2.add(p6mVar);
        }
        ul4 ul4Var = this.I1;
        if (ul4Var == null) {
            u890.C("properties");
            throw null;
        }
        boolean zG = ul4Var.g();
        String str2 = xo41Var2.a;
        TextView textView = r3.X0;
        AnimatorSet animatorSet = r3.Y0;
        ContentStackView contentStackView = r3.U0;
        TextView textView2 = r3.W0;
        textView2.setText(r3.getContext().getString(arrayList2.size() > 1 ? 2131952265 : 2131952264));
        textView.setText(str2);
        textView.setAlpha(0.0f);
        if (zG) {
            contentStackView.setVisibility(0);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((p6m) obj2).b == 2) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (((p6m) obj3).b == 1) {
                    arrayList4.add(obj3);
                }
            }
            int iMin = Math.min(arrayList4.size(), 5 - Math.min(arrayList3.size(), 2));
            contentStackView.d(gw70Var, scheduler, k4p1.C(o7h.N0(o7h.d1(arrayList3, 5 - iMin), o7h.d1(arrayList4, iMin))));
        } else {
            ContentStackView contentStackView2 = r3.V0;
            contentStackView2.setVisibility(0);
            ArrayList arrayList5 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList5.add(new td10(((p6m) it.next()).a, "", (String) null, (sd10) null));
            }
            if (!arrayList5.isEmpty()) {
                arrayList5.subList(1, arrayList5.size());
            }
            tto1.s(gw70Var, (af10) null, ((FacePileView) contentStackView2).a, arrayList5, ((FacePileView) contentStackView2).c, (List) null);
            contentStackView = contentStackView2;
        }
        Property property = ViewGroup.ALPHA;
        ObjectAnimator duration = ObjectAnimator.ofFloat(contentStackView, (Property<ContentStackView, Float>) property, 1.0f, 0.0f).setDuration(1000L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(r3.T0, (Property<ThreeDotsLoaderView, Float>) property, 0.0f, 1.0f).setDuration(1000L);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setStartDelay(2000L);
        animatorSet.playTogether(duration, duration2, animatorSet2);
        animatorSet.start();
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final void z0() {
        ((zf30) this).h1 = true;
        GreatPicksLoadingView greatPicksLoadingView = this.K1;
        if (greatPicksLoadingView != null) {
            greatPicksLoadingView.U0.a();
        } else {
            u890.C("greatPicksLoadingView");
            throw null;
        }
    }
}
