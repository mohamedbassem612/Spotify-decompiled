package p;

import android.app.Application;
import android.graphics.Typeface;
import android.text.Layout;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentDeliveryMode;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.nowplaying.uiusecases.carousel.horizontalvideo.ZoomableView;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nx30 implements Runnable {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public nx30(BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout, avn avnVar, h72 h72Var) {
        this.a = (byte) 15;
        this.b = avnVar;
        this.c = h72Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ksi0 ksi0Var;
        RecyclerView recyclerView;
        tzr0 tzr0Var;
        GridLayoutManager layoutManager;
        Throwable thA;
        byte b = 1;
        lnm lnmVar = null;
        switch (this.a) {
            case 0:
                ix30 ix30Var = (ix30) this.c;
                try {
                    ix30Var.onSuccess(poz0.u((Future) this.b));
                    return;
                } catch (Error e) {
                    e = e;
                    ix30Var.onFailure(e);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    ix30Var.onFailure(e);
                    return;
                } catch (ExecutionException e3) {
                    Throwable cause = e3.getCause();
                    if (cause == null) {
                        ix30Var.onFailure(e3);
                        return;
                    } else {
                        ix30Var.onFailure(cause);
                        return;
                    }
                }
            case 1:
                d60 d60Var = (d60) this.b;
                g60 g60Var = (g60) this.c;
                msi0 msi0Var = g60Var.c;
                if (msi0Var != null && (ksi0Var = msi0Var.e) != null) {
                    ksi0Var.h(msi0Var);
                }
                View view = (View) g60Var.f;
                if (view != null && view.getWindowToken() != null) {
                    if (d60Var.b()) {
                        g60Var.Q0 = d60Var;
                    } else if (((View) d60Var.g) != null) {
                        d60Var.g(0, 0, false, false);
                        g60Var.Q0 = d60Var;
                    }
                }
                g60Var.S0 = null;
                return;
            case 2:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((xg0) this.c);
                return;
            case 3:
                mwn0 mwn0Var = ((b21) this.b).R1;
                if (mwn0Var != null) {
                    nyn1.Q(mwn0Var, (nsn0) this.c);
                    return;
                } else {
                    u890.C("navigationLogger");
                    throw null;
                }
            case 4:
                EditText editText = (EditText) this.b;
                Layout layout = editText.getLayout();
                if (layout == null) {
                    return;
                }
                int lineBottom = layout.getLineBottom(layout.getLineForOffset(((String) this.c).length()));
                lnm parent = editText.getParent();
                lnmVar = parent instanceof View ? (View) parent : null;
                if (lnmVar == null) {
                    return;
                }
                int[] iArr = new int[2];
                lnmVar.getLocationOnScreen(iArr);
                int top = editText.getTop() + iArr[1];
                int i = (int) (editText.getResources().getDisplayMetrics().heightPixels * 0.5f);
                int scrollY = (top + lineBottom) - editText.getScrollY();
                if (scrollY > i) {
                    int lineHeight = editText.getLineHeight() + (scrollY - i);
                    editText.animate().cancel();
                    editText.animate().translationY(-lineHeight).setDuration(200L).start();
                    return;
                }
                return;
            case 5:
                tl7 tl7Var = ((xl7) this.b).a;
                RecyclerView recyclerView2 = (RecyclerView) this.c;
                tl7Var.g(0, Float.valueOf(iro1.u(recyclerView2)), Float.valueOf(iro1.v(recyclerView2)), recyclerView2.getResources().getDisplayMetrics().density);
                return;
            case 6:
                uoa uoaVar = (uoa) this.b;
                p3u0 p3u0Var = uoaVar.f;
                m0u0 m0u0Var = p3u0Var != null ? p3u0Var.i : null;
                if (m0u0Var == null || m0u0Var.equals((m0u0) this.c)) {
                    uoaVar.s((y2g1) null);
                    uoaVar.f = null;
                    return;
                }
                return;
            case 7:
                dn81 dn81Var = (dn81) this.b;
                Typeface typeface = (Typeface) this.c;
                lm5 lm5Var = (lm5) dn81Var.b;
                if (lm5Var != null) {
                    lm5Var.o(typeface);
                    return;
                }
                return;
            case 8:
                ywd ywdVar = (ywd) this.c;
                ArrayList<w611> arrayList = (ArrayList) this.b;
                for (w611 w611Var : arrayList) {
                    oek1 oek1VarC = b8k1.c(w611Var.a);
                    ywdVar.k.add(w611Var);
                    View view2 = w611Var.a;
                    xwd xwdVar = (xwd) view2.getTag(2131430297);
                    float f = xwdVar != null ? xwdVar.a : 1.0f;
                    yyd yydVar = (yyd) view2.getTag(2131430298);
                    if (yydVar != null) {
                        if (yydVar.b == -1) {
                            view2.setTranslationX(-yydVar.c);
                        }
                        if (yydVar.b == 1) {
                            view2.setTranslationX(yydVar.c);
                        }
                    }
                    oek1VarC.a(f);
                    View view3 = (View) oek1VarC.a.get();
                    if (view3 != null) {
                        view3.animate().translationX(0.0f);
                    }
                    oek1VarC.d(300L);
                    oek1VarC.f(new wwd(ywdVar, w611Var, oek1VarC, (byte) 1));
                    oek1VarC.g();
                }
                arrayList.clear();
                ywdVar.j.remove(arrayList);
                return;
            case 9:
                if (((gag) this.b).n) {
                    return;
                }
                try {
                    ((gag) this.b).c();
                    lsm0 lsm0Var = new lsm0((String) this.c, new ksm0(fec1.c, (String) null, (String) null, "chromeless-webview", (String) null, (String) null, ContentDeliveryMode.ON_DEMAND), false, false, (jsm0) null, 0L, (ism0) null, (String) null, true, 0, 1788);
                    r091 r091Var = ((gag) this.b).r;
                    if (r091Var != null) {
                        r091Var.b(lsm0Var);
                    }
                    r091 r091Var2 = ((gag) this.b).r;
                    if (r091Var2 != null) {
                        r091.f(r091Var2, (tv80) null, (Long) null, jjy0.a, 7);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 10:
                if (((wtg) this.b).Y) {
                    return;
                }
                wtg wtgVar = (wtg) this.b;
                Surface surface = ((wsg) this.c).a;
                if (surface == null || !surface.isValid()) {
                    surface = null;
                }
                wtgVar.h = surface;
                wtg wtgVar2 = (wtg) this.b;
                Surface surface2 = wtgVar2.h;
                wtgVar2.i = surface2 == null ? 0 : ((wsg) this.c).b;
                wtgVar2.t = surface2 != null ? ((wsg) this.c).c : 0;
                wtgVar2.e.q(surface2 != null ? ((wsg) this.c).d : null);
                ((wtg) this.b).c();
                ((wtg) this.b).e();
                ((wtg) this.b).d();
                return;
            case 11:
                c9n c9nVar = (c9n) ((p811) this.b).a;
                if (c9nVar != null) {
                    fn31.T(c9nVar, null, 0, new y3h((l24) this.c, lnmVar, b), 3);
                    return;
                }
                return;
            case 12:
                tkh tkhVar = (ukh) this.b;
                if ((tkhVar instanceof tkh) && tkhVar.c && (recyclerView = ((kjh) this.c).Q0) != null) {
                    recyclerView.u0(0);
                    return;
                }
                return;
            case 13:
                qzh qzhVar = ((ljk) this.b).t;
                xik xikVar = (xik) this.c;
                qzhVar.f(new xik(xikVar.a, xikVar.b, xikVar.c, xikVar.d, xikVar.e, xikVar.f, xikVar.g, xikVar.h, xikVar.i, xikVar.j, xikVar.k, xikVar.l, xikVar.m, xikVar.n, xikVar.o, xikVar.f171p, xikVar.q, false, null, xikVar.t, xikVar.u, xikVar.v));
                return;
            case 14:
                Integer num = ((ro41) this.b).Y;
                if (num != null) {
                    ContentPickerFragment contentPickerFragment = (ContentPickerFragment) this.c;
                    int iIntValue = num.intValue();
                    tzr0 tzr0Var2 = contentPickerFragment.Q1;
                    if (tzr0Var2 != null && (layoutManager = ((GridRecyclerView) tzr0Var2.e).getLayoutManager()) != null) {
                        layoutManager.w1(iIntValue, 1);
                    }
                    if (iIntValue == 0 && (tzr0Var = contentPickerFragment.Q1) != null) {
                        ((PickerCollapsingTitleBar) tzr0Var.d).setExpanded(true);
                    }
                    contentPickerFragment.d1().U(wzl.a);
                    return;
                }
                return;
            case 15:
                avn avnVar = (avn) this.b;
                View view4 = avnVar.V0;
                View viewFindViewById = view4.findViewById(2131428881);
                TextView textView = (TextView) view4.findViewById(2131428380);
                h72 h72Var = (h72) this.c;
                ((BehaviorRetainingAppBarLayout) h72Var.b).a(new e260(new ggh(h72Var, textView, avnVar, viewFindViewById, (byte) 11)));
                return;
            case 16:
                u961 u961Var = (u961) this.c;
                for (TextView textView2 : p7h.M(new TextView[]{(TextView) u961Var.d, (TextView) u961Var.c, (TextView) u961Var.b})) {
                    Object parent2 = textView2.getParent();
                    View view5 = parent2 instanceof View ? (View) parent2 : null;
                    int measuredHeight = view5 != null ? view5.getMeasuredHeight() : 0;
                    float top2 = ((measuredHeight - textView2.getTop()) - textView2.getPaddingTop()) - textView2.getPaddingBottom();
                    float lineHeight2 = top2 / textView2.getLineHeight();
                    textView2.setMaxLines((int) ((textView2.getLineHeight() == 0 || top2 < 0.0f) ? 0.0f : (float) (textView2.getBottom() >= measuredHeight ? Math.floor(lineHeight2) : Math.ceil(lineHeight2))));
                }
                return;
            case 17:
                k3s k3sVar = (k3s) this.c;
                ArrayList<i3s> arrayList2 = (ArrayList) this.b;
                for (i3s i3sVar : arrayList2) {
                    ArrayList arrayList3 = k3sVar.r;
                    long j = ((e611) k3sVar).f;
                    w611 w611Var2 = i3sVar.a;
                    View view6 = w611Var2 == null ? null : w611Var2.a;
                    w611 w611Var3 = i3sVar.b;
                    View view7 = w611Var3 != null ? w611Var3.a : null;
                    if (view6 != null) {
                        ViewPropertyAnimator duration = view6.animate().setDuration(j);
                        arrayList3.add(i3sVar.a);
                        duration.translationX(i3sVar.e - i3sVar.c);
                        duration.translationY(i3sVar.f - i3sVar.d);
                        duration.alpha(0.0f).setListener(new h3s(k3sVar, i3sVar, duration, view6, (byte) 0)).start();
                    }
                    if (view7 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view7.animate();
                        arrayList3.add(i3sVar.b);
                        viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new h3s(k3sVar, i3sVar, viewPropertyAnimatorAnimate, view7, (byte) 1)).start();
                    }
                }
                arrayList2.clear();
                k3sVar.n.remove(arrayList2);
                return;
            case 18:
                qs10 qs10VarA = qs10.a();
                int i2 = w4t.d;
                vwl1 vwl1Var = (vwl1) this.b;
                qs10VarA.getClass();
                ((w4t) this.c).a.e(new vwl1[]{vwl1Var});
                return;
            case 19:
                nn61 nn61Var = (nn61) this.b;
                aod aodVar = (aod) ((mxr) this.c).b;
                i8h1 i8h1Var = (i8h1) aodVar.b;
                fjl0 fjl0Var = (fjl0) aodVar.c;
                x6h1 x6h1VarC = fjl0Var.c.c();
                x6h1VarC.i.add(new a7h1("change_image_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("choose_image_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                ilo1.E(new o200(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, fjl0Var.b, System.currentTimeMillis()), (xj61) null).a.a), (ssw0) nn61Var.b);
                return;
            case 20:
                boolean zIsPopupShowing = ((AutoCompleteTextView) this.b).isPopupShowing();
                jav javVar = ((gav) this.c).c;
                javVar.e(zIsPopupShowing);
                javVar.j = zIsPopupShowing;
                return;
            case 21:
                l0w l0wVar = (l0w) this.c;
                m0w m0wVar = (m0w) this.b;
                if (m0wVar.c.get()) {
                    m0wVar.d.onNext(l0wVar);
                    return;
                } else {
                    m0wVar.b.add(l0wVar);
                    return;
                }
            case 22:
                Object obj = this.c;
                q900 q900Var = (q900) this.b;
                if (q900Var.c.get()) {
                    q900Var.d.onNext(obj);
                    return;
                } else {
                    q900Var.b.add(obj);
                    return;
                }
            case 23:
                ((tj00) this.b).t.getLifecycle().d((o5s) this.c);
                return;
            case 24:
                hx30 hx30Var = (hx30) this.c;
                a490 a490Var = (Future) this.b;
                if ((a490Var instanceof a490) && (thA = a490Var.a()) != null) {
                    hx30Var.onFailure(thA);
                    return;
                }
                try {
                    hx30Var.onSuccess(fc11.C(a490Var));
                    return;
                } catch (ExecutionException e4) {
                    hx30Var.onFailure(e4.getCause());
                    return;
                } catch (Throwable th) {
                    hx30Var.onFailure(th);
                    return;
                }
            case 25:
                lag lagVar = ((tr60) this.c).n1;
                ZoomableView zoomableView = (ZoomableView) lagVar.e;
                ZoomableView zoomableView2 = (ZoomableView) lagVar.e;
                if (xoi1.a(zoomableView.getContext())) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zoomableView2.getLayoutParams();
                    layoutParams.topMargin = 0;
                    layoutParams.bottomMargin = 0;
                    zoomableView2.setLayoutParams(layoutParams);
                    return;
                }
                int bottom = ((View) lagVar.b).getBottom();
                int height = ((View) lagVar.d).getHeight() - ((View) lagVar.c).getTop();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) zoomableView2.getLayoutParams();
                layoutParams2.topMargin = bottom;
                layoutParams2.bottomMargin = height;
                zoomableView2.setLayoutParams(layoutParams2);
                return;
            case 26:
                ((x8c0) this.b).a((wku) this.c);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                aym.t((p6b0) this.b).resumeWith(new m231((Throwable) this.c));
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                okk1 okk1Var = (okk1) this.b;
                RecyclerView recyclerView3 = (RecyclerView) this.c;
                if (recyclerView3.getChildCount() != 0) {
                    okk1Var.h(recyclerView3, 0, 0);
                    return;
                }
                return;
            default:
                ((mrd0) this.b).j((tqd0) this.c, false);
                return;
        }
    }

    public String toString() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return nx30.class.getSimpleName() + "," + ((ix30) obj);
            case 24:
                rl1 rl1VarR0 = cwl1.r0(this);
                kqi0 kqi0Var = new kqi0((byte) 10);
                ((kqi0) rl1VarR0.e).c = kqi0Var;
                rl1VarR0.e = kqi0Var;
                kqi0Var.d = (hx30) obj;
                return rl1VarR0.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ nx30(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ nx30(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}
