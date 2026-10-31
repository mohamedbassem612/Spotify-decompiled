package p;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.material.tabs.TabLayout;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import com.spotify.allboarding.allboardingimpl.search.ui.ToolbarSearchFieldView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import com.spotify.mobius.functions.Consumer;
import com.spotify.nowplaying.carousel.CarouselView;
import com.spotify.puffin.setup.setupflow.manualselect.ui.ManualSelectView;
import com.spotify.transcript.list.TranscriptListView;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zl7 extends k611 {
    public final /* synthetic */ byte a;
    public final Object b;

    public zl7() {
        this.a = (byte) 17;
        this.b = new Rect();
    }

    public void c(RecyclerView recyclerView, int i) {
        int i2;
        int i3;
        InputMethodManager inputMethodManager;
        int iC1;
        int i4;
        un11 un11VarN;
        int iC2;
        int iC3;
        byte b = this.a;
        b151 b151Var = b151.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    ((tl7) obj).i(Float.valueOf(iro1.u(recyclerView)), Float.valueOf(iro1.v(recyclerView)), recyclerView.getResources().getDisplayMetrics().density);
                    return;
                }
                return;
            case 1:
                qwd qwdVar = (qwd) obj;
                if (i == 0) {
                    Bundle bundleC = qwdVar.c();
                    int i5 = bundleC != null ? bundleC.getInt("LIST_SCROLL_POSITION") : 0;
                    int iC4 = recyclerView.getLayoutManager().c1();
                    Bundle bundle = new Bundle();
                    bundle.putInt("LIST_SCROLL_POSITION", iC4);
                    yfu yfuVar = qwdVar.e;
                    if (yfuVar == null) {
                        u890.C("state");
                        throw null;
                    }
                    y570 y570Var = qwdVar.d;
                    if (y570Var == null) {
                        u890.C("data");
                        throw null;
                    }
                    yfuVar.r(y570Var, bundle);
                    asn asnVar = qwdVar.b;
                    ((TabLayout) asnVar.c).j(((TabLayout) asnVar.c).g(iC4), true);
                    uzd uzdVar = qwdVar.c;
                    int i6 = i5 - iC4;
                    if (i6 < 0) {
                        y570 y570Var2 = qwdVar.d;
                        if (y570Var2 == null) {
                            u890.C("data");
                            throw null;
                        }
                        x6h1 x6h1VarG = y1a1.G(y570Var2.r(), uzdVar.b.getViewUri().a);
                        x6h1VarG.g = "22.0.0";
                        y6h1 y6h1VarA = x6h1VarG.a();
                        v7h1 v7h1Var = new v7h1();
                        ((xjn) v7h1Var).a = y6h1VarA;
                        ((xjn) v7h1Var).c = Long.valueOf(System.currentTimeMillis());
                        t6h1 t6h1Var = t6h1.f;
                        o3b1 o3b1VarJ = f3o1.j();
                        o3b1VarJ.c = "swipe_left";
                        o3b1VarJ.b = "ui_reveal";
                        o3b1VarJ.a = (byte) 1;
                        v7h1Var.e = o3b1VarJ.a();
                        uzdVar.a.m(v7h1Var.a(), (xj61) null);
                        return;
                    }
                    if (i6 > 0) {
                        y570 y570Var3 = qwdVar.d;
                        if (y570Var3 == null) {
                            u890.C("data");
                            throw null;
                        }
                        x6h1 x6h1VarG2 = y1a1.G(y570Var3.r(), uzdVar.b.getViewUri().a);
                        x6h1VarG2.g = "22.0.0";
                        y6h1 y6h1VarA2 = x6h1VarG2.a();
                        v7h1 v7h1Var2 = new v7h1();
                        ((xjn) v7h1Var2).a = y6h1VarA2;
                        ((xjn) v7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                        t6h1 t6h1Var2 = t6h1.f;
                        o3b1 o3b1VarJ2 = f3o1.j();
                        o3b1VarJ2.c = "swipe_right";
                        o3b1VarJ2.b = "ui_reveal";
                        o3b1VarJ2.a = (byte) 1;
                        v7h1Var2.e = o3b1VarJ2.a();
                        uzdVar.a.m(v7h1Var2.a(), (xj61) null);
                        return;
                    }
                    return;
                }
                return;
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
            case 13:
            case 14:
            case 17:
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
            case 22:
            default:
                return;
            case 4:
                if (i == 1) {
                    ((SearchView) ((jbn) obj).a.e).clearFocus();
                    return;
                }
                return;
            case 6:
                if (i == 0) {
                    ((xvy) obj).invoke();
                    return;
                }
                return;
            case 9:
                t8d0 t8d0Var = (t8d0) obj;
                if (i == 0) {
                    a layoutManager = recyclerView.getLayoutManager();
                    layoutManager.getClass();
                    View viewI = t8d0Var.i(layoutManager);
                    int iV = viewI != null ? a.V(viewI) : -1;
                    if (t8d0Var.h && iV < (i3 = t8d0Var.g)) {
                        if (i3 != -1) {
                            a layoutManager2 = recyclerView.getLayoutManager();
                            layoutManager2.getClass();
                            wic0 wic0VarD = t8d0Var.d(layoutManager2);
                            wic0VarD.getClass();
                            wic0VarD.a = i3;
                            layoutManager2.S0(wic0VarD);
                        }
                        int i7 = t8d0Var.g;
                        lo9 lo9Var = t8d0Var.l;
                        if (i7 > iV) {
                            if (lo9Var != null) {
                                lo9Var.r();
                                return;
                            }
                            return;
                        } else {
                            if (lo9Var != null) {
                                lo9Var.s();
                                return;
                            }
                            return;
                        }
                    }
                    if (!t8d0Var.i || iV <= (i2 = t8d0Var.g)) {
                        int i8 = t8d0Var.g;
                        if (i8 != iV) {
                            kba kbaVar = t8d0Var.k;
                            if (i8 > iV) {
                                if (kbaVar != null) {
                                    ((CarouselView) kbaVar.b).n2.invoke();
                                }
                            } else if (kbaVar != null) {
                                ((CarouselView) kbaVar.b).m2.invoke();
                            }
                            t8d0Var.g = iV;
                            return;
                        }
                        return;
                    }
                    if (i2 != -1) {
                        a layoutManager3 = recyclerView.getLayoutManager();
                        layoutManager3.getClass();
                        wic0 wic0VarD2 = t8d0Var.d(layoutManager3);
                        wic0VarD2.getClass();
                        wic0VarD2.a = i2;
                        layoutManager3.S0(wic0VarD2);
                    }
                    int i9 = t8d0Var.g;
                    lo9 lo9Var2 = t8d0Var.l;
                    if (i9 > iV) {
                        if (lo9Var2 != null) {
                            lo9Var2.r();
                            return;
                        }
                        return;
                    } else {
                        if (lo9Var2 != null) {
                            lo9Var2.s();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 10:
                RecyclerView recyclerView2 = (RecyclerView) ((dxy) obj).f;
                if (i != 1 || (inputMethodManager = (InputMethodManager) recyclerView2.getContext().getSystemService("input_method")) == null) {
                    return;
                }
                inputMethodManager.hideSoftInputFromWindow(recyclerView2.getWindowToken(), 0);
                return;
            case 11:
                if (i == 1) {
                    o0c.C(((ManualSelectView) obj).getBinding().c.U0);
                    return;
                }
                return;
            case 15:
                return;
            case 16:
                vn11 vn11Var = (vn11) obj;
                if (i != 0 || (iC1 = recyclerView.getLayoutManager().c1()) < 0 || iC1 >= ((emc0) vn11Var).d.f.size() || (i4 = vn11Var.O0) == iC1) {
                    return;
                }
                RecyclerView recyclerView3 = vn11Var.P0;
                if (recyclerView3 != null && (un11VarN = recyclerView3.N(i4)) != null) {
                    un11VarN.U0.b(wnp0.b);
                }
                vn11Var.O0 = iC1;
                vn11Var.D(iC1);
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (i == 1) {
                    ((rw41) obj).a.invoke(b151Var);
                    return;
                }
                return;
            case 20:
                if (i == 1) {
                    ((h551) obj).b.invoke(b151Var);
                    return;
                }
                return;
            case 21:
                qvb1 qvb1Var = (qvb1) obj;
                qvb1Var.f(pvb1.a(qvb1Var.c(), i, false, false, 6));
                return;
            case 23:
                PublishSubject publishSubject = ((TranscriptListView) obj).l2;
                if (i == 0) {
                    publishSubject.onNext(Boolean.FALSE);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    publishSubject.onNext(Boolean.TRUE);
                    return;
                }
            case 24:
                cej1 cej1Var = (cej1) obj;
                if (i != 0 || (iC2 = recyclerView.getLayoutManager().c1()) <= -1) {
                    return;
                }
                List list = (List) cej1Var.f.e();
                if (iC2 >= (list != null ? list.size() : -1) || iC2 == cej1Var.g) {
                    return;
                }
                cej1Var.g = iC2;
                cej1Var.e(iC2);
                return;
            case 25:
                oej1 oej1Var = (oej1) obj;
                iu30 iu30Var = oej1Var.a;
                bpb1 bpb1Var = oej1Var.c;
                if (i != 0 || (iC3 = recyclerView.getLayoutManager().c1()) <= -1 || iC3 >= ((List) bpb1Var.getValue()).size() || iC3 == oej1Var.d) {
                    return;
                }
                oej1Var.d = iC3;
                iu30Var.invoke(new hej1(iC3));
                if (iC3 <= -1 || iC3 >= ((List) bpb1Var.getValue()).size() || iC3 == oej1Var.d) {
                    return;
                }
                List list2 = (List) bpb1Var.getValue();
                oej1Var.d = iC3;
                iu30Var.invoke(new eej1(iC3, ((jej1) list2.get(iC3)).e));
                return;
            case 26:
                if (i == 0) {
                    ((l0x0) ((o0g1) obj).e).k();
                    return;
                }
                return;
            case 27:
                kl1 kl1Var = ((y9l1) obj).c;
                if (i != 0) {
                    kl1Var.a = false;
                    return;
                } else {
                    kl1Var.a = true;
                    kl1Var.F();
                    return;
                }
        }
    }

    public void h(RecyclerView recyclerView, int i, int i2) {
        View view;
        yfu yfuVar;
        yfu yfuVar2;
        bhk1 bhk1Var;
        List list;
        byte b = this.a;
        int height = 0;
        String string = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((tl7) obj).g(i2, Float.valueOf(iro1.u(recyclerView)), Float.valueOf(iro1.v(recyclerView)), recyclerView.getResources().getDisplayMetrics().density);
                return;
            case 1:
            case 4:
            case 6:
            case 9:
            case 10:
            case 11:
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
            case 20:
            case 24:
            default:
                return;
            case 2:
                w611 w611VarN = recyclerView.N(0);
                if (w611VarN != null && (view = w611VarN.a) != null) {
                    height = view.getHeight();
                }
                ((iu30) obj).invoke(Float.valueOf(height > 0 ? yoi1.o(recyclerView.computeVerticalScrollOffset() / height, 0.0f, 1.0f) : 1.0f));
                return;
            case 3:
                String layoutManager = recyclerView.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null) != null) {
                    kjh kjhVar = (kjh) obj;
                    if (!kjhVar.R0 || i2 <= 0 || recyclerView.canScrollVertically(1)) {
                        return;
                    }
                    kjhVar.Z.onNext(vkh.a);
                    recyclerView.p0(this);
                    recyclerView.m(kjhVar.N0);
                    return;
                }
                return;
            case 5:
                kl10 kl10Var = (kl10) obj;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i3 = kl10Var.a;
                int iComputeVerticalScrollRange = kl10Var.S0.computeVerticalScrollRange();
                int i4 = kl10Var.R0;
                kl10Var.T0 = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
                int iComputeHorizontalScrollRange = kl10Var.S0.computeHorizontalScrollRange();
                int i5 = kl10Var.Q0;
                boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
                kl10Var.U0 = z;
                boolean z2 = kl10Var.T0;
                if (!z2 && !z) {
                    if (kl10Var.V0 != 0) {
                        kl10Var.l(0);
                        return;
                    }
                    return;
                }
                if (z2) {
                    float f = i4;
                    kl10Var.Y = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                    kl10Var.X = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
                }
                if (kl10Var.U0) {
                    float f2 = i5;
                    kl10Var.O0 = (int) ((((f2 / 2.0f) + iComputeHorizontalScrollOffset) * f2) / iComputeHorizontalScrollRange);
                    kl10Var.N0 = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
                }
                byte b2 = kl10Var.V0;
                if (b2 == 0 || b2 == 1) {
                    kl10Var.l(1);
                    return;
                }
                return;
            case 7:
                d570 d570Var = (d570) obj;
                y570 y570Var = d570Var.e;
                if (y570Var == null || (yfuVar = d570Var.f) == null) {
                    return;
                }
                yfuVar.r(y570Var, d570Var.c.x0());
                return;
            case 8:
                d570 d570Var2 = (d570) obj;
                y570 y570Var2 = d570Var2.e;
                if (y570Var2 == null || (yfuVar2 = d570Var2.f) == null) {
                    return;
                }
                yfuVar2.r(y570Var2, d570Var2.c.x0());
                return;
            case 12:
                ((PublishSubject) obj).onNext(Integer.valueOf(recyclerView.getLayoutManager().f1()));
                return;
            case 13:
                if (i2 > 0) {
                    String layoutManager2 = recyclerView.getLayoutManager();
                    string = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                    if (string == null) {
                        return;
                    }
                    if (string.h1() >= string.R() - 3) {
                        ((Consumer) obj).accept(vax0.a);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                String layoutManager3 = recyclerView.getLayoutManager();
                string = layoutManager3 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager3 : null;
                if (string == null) {
                    return;
                }
                int iF1 = string.f1();
                int iH1 = string.h1();
                if (iF1 == -1 || iH1 == -1) {
                    return;
                }
                bdz0 bdz0Var = (bdz0) obj;
                int i6 = (iF1 + iH1) / 2;
                bdz0Var.d = i6;
                aek1 aek1Var = bdz0Var.b;
                if (aek1Var.c == null || !aek1Var.b(i6)) {
                    return;
                }
                aek1Var.a(i6);
                bdz0Var.a();
                return;
            case 15:
                RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) obj;
                if (recyclerViewFastScroller.isEnabled()) {
                    if (Math.abs(i2) > 15) {
                        int i7 = RecyclerViewFastScroller.T0;
                        if (!recyclerViewFastScroller.t) {
                            ObjectAnimator objectAnimator = recyclerViewFastScroller.S0;
                            if (objectAnimator != null && objectAnimator.isRunning()) {
                                recyclerViewFastScroller.S0.cancel();
                                recyclerViewFastScroller.S0 = null;
                            }
                            recyclerViewFastScroller.setVisibility(0);
                            recyclerViewFastScroller.setTranslationX(bno1.t(recyclerViewFastScroller) ? -recyclerViewFastScroller.getMeasuredWidth() : recyclerViewFastScroller.getMeasuredWidth());
                            recyclerViewFastScroller.setAlpha(0.0f);
                            recyclerViewFastScroller.getViewTreeObserver().addOnPreDrawListener(new d711(recyclerViewFastScroller));
                        }
                        recyclerViewFastScroller.t = true;
                    }
                    if (recyclerViewFastScroller.t) {
                        recyclerViewFastScroller.c();
                        eba ebaVar = recyclerViewFastScroller.h;
                        if (recyclerViewFastScroller.e) {
                            return;
                        }
                        if (!(recyclerViewFastScroller.a.getLayoutManager() instanceof LinearLayoutManager)) {
                            eg.m("Must be instance of LinearLayoutManager!");
                            return;
                        }
                        recyclerViewFastScroller.g = recyclerViewFastScroller.a.getLayoutManager();
                        if (recyclerViewFastScroller.a.getChildCount() == 0) {
                            ebaVar.g(0.0f);
                            return;
                        }
                        int iComputeVerticalScrollRange2 = recyclerViewFastScroller.a.computeVerticalScrollRange() - recyclerViewFastScroller.a.computeVerticalScrollExtent();
                        ebaVar.g(iComputeVerticalScrollRange2 > 0 ? recyclerViewFastScroller.a.computeVerticalScrollOffset() / iComputeVerticalScrollRange2 : 0.0f);
                        WeakHashMap weakHashMap = b8k1.a;
                        recyclerViewFastScroller.postInvalidateOnAnimation();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                if (i == 0 && i2 == 0 && recyclerView.getLayoutManager().c1() == 0) {
                    ((vn11) obj).D(0);
                    return;
                }
                return;
            case 17:
                Rect rect = (Rect) obj;
                int childCount = recyclerView.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = recyclerView.getChildAt(i8);
                    int paddingLeft = recyclerView.getPaddingLeft();
                    int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    RecyclerView.V(rect, childAt);
                    int i9 = paddingLeft - rect.left;
                    if (i9 < 0) {
                        i9 = 0;
                    }
                    int i10 = rect.right - width;
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    float fWidth = ((1.0f - ((i9 + i10) / rect.width())) * 2.0f) - 1.0f;
                    if (fWidth < 0.0f) {
                        fWidth = 0.0f;
                    } else if (fWidth > 1.0f) {
                        fWidth = 1.0f;
                    }
                    childAt.setAlpha(fWidth);
                }
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                SearchFragment searchFragment = (SearchFragment) obj;
                LinearLayoutManager layoutManager4 = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager4 instanceof LinearLayoutManager ? layoutManager4 : null;
                if (linearLayoutManager == null) {
                    return;
                }
                int iH2 = linearLayoutManager.h1();
                z511 adapter = recyclerView.getAdapter();
                if (iH2 > (adapter != null ? adapter.e() : 0) - 4) {
                    kd51 kd51VarB1 = searchFragment.b1();
                    u961 u961Var = searchFragment.Z1;
                    if (u961Var == null) {
                        u890.C("searchField");
                        throw null;
                    }
                    Editable text = ((ToolbarSearchFieldView) u961Var.d).getQueryEditText().getText();
                    string = text != null ? text.toString() : null;
                    String str = string != null ? string : "";
                    kdn0 kdn0Var = kd51VarB1.t;
                    if (str.length() == 0) {
                        return;
                    }
                    Disposable disposable = kd51VarB1.h;
                    if ((disposable == null || disposable.isDisposed()) && (bhk1Var = (bhk1) kdn0Var.e()) != null && bhk1Var.h) {
                        Disposable disposable2 = kd51VarB1.h;
                        if (disposable2 != null) {
                            disposable2.dispose();
                        }
                        g931 g931Var = kd51VarB1.c;
                        String url = kd51VarB1.X.getUrl();
                        bhk1 bhk1Var2 = (bhk1) kdn0Var.e();
                        if (bhk1Var2 != null && (list = bhk1Var2.d) != null) {
                            height = list.size();
                        }
                        kd51VarB1.h = g931Var.w(height, url, str).map(new m021(kd51VarB1, str, (byte) 23)).subscribeOn(kd51VarB1.e).observeOn(kd51VarB1.d).subscribe(new jd51(kd51VarB1, (byte) 2));
                        return;
                    }
                    return;
                }
                return;
            case 21:
                qvb1 qvb1Var = (qvb1) obj;
                if (qvb1Var.isEnabled() && qvb1Var.c().b()) {
                    ovb1 ovb1Var = qvb1Var.f;
                    if (qvb1Var.c().b) {
                        int iF2 = qvb1Var.b().f1();
                        bgz0 bgz0Var = qvb1Var.e;
                        if (bgz0Var == null) {
                            u890.C("ignoredItemsProvider");
                            throw null;
                        }
                        if (bgz0Var.a()) {
                            qvb1Var.f(pvb1.a(qvb1Var.c(), 0, false, true, 11));
                        } else {
                            qvb1Var.f(pvb1.a(qvb1Var.c(), 0, false, false, 11));
                            cgz0 cgz0Var = qvb1Var.d;
                            if (cgz0Var == null) {
                                u890.C("labelProvider");
                                throw null;
                            }
                            string = cgz0Var.e(iF2);
                        }
                    }
                    ovb1Var.b.c(ovb1.h[0], ovb1Var, string);
                    qvb1Var.h();
                    return;
                }
                return;
            case 22:
                gdc1 gdc1Var = (gdc1) obj;
                lcb0 lcb0Var = gdc1Var.c;
                LinearLayoutManager layoutManager5 = recyclerView.getLayoutManager();
                int iF3 = layoutManager5.f1();
                int iH3 = layoutManager5.h1();
                recyclerView.getGlobalVisibleRect(new Rect());
                ArrayList arrayList = new ArrayList();
                if (iF3 <= iH3) {
                    while (true) {
                        View viewD = layoutManager5.D(iF3);
                        if (viewD != null) {
                            Rect rect2 = new Rect();
                            if ((!viewD.getLocalVisibleRect(rect2) ? 0.0d : 100.0d * (((double) rect2.width()) / ((double) viewD.getMeasuredWidth()))) >= 50.0d) {
                                arrayList.add(((emc0) lcb0Var).d.f.get(iF3));
                            }
                        }
                        if (iF3 != iH3) {
                            iF3++;
                        }
                    }
                }
                List list2 = ((emc0) lcb0Var).d.f;
                pbq pbqVar = gdc1Var.i;
                LinkedHashSet linkedHashSet = (LinkedHashSet) pbqVar.d;
                ua91 ua91Var = (ua91) pbqVar.h;
                ArrayList<ji0> arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!linkedHashSet.contains(((ji0) obj2).h)) {
                        arrayList2.add(obj2);
                    }
                }
                for (ji0 ji0Var : arrayList2) {
                    linkedHashSet.add(ji0Var.h);
                    r6h1 r6h1Var = r6h1.c;
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-ads-cta-cards";
                    x6h1VarI.f = "2.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.c = null;
                    x6h1VarI.e = "playlist";
                    y6h1 y6h1VarA = x6h1VarI.a();
                    String str2 = ji0Var.h;
                    String str3 = ji0Var.e;
                    x6h1 x6h1VarC = y6h1VarA.c();
                    x6h1VarC.i.add(new a7h1("cta_card", str2, (Integer) null, str3, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA2;
                    ((xjn) k7h1Var).b = r6h1Var;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    ((i8h1) ua91Var.b).f(k7h1Var.a(), (Set) null);
                    hr0 hr0Var = (hr0) pbqVar.i;
                    String str4 = (String) pbqVar.e;
                    hr0Var.b(list2.indexOf(ji0Var), str4 == null ? "" : str4, ji0Var.h, ji0Var.t, d3d1.d);
                    String str5 = ji0Var.h;
                    z6x z6xVar = (List) ji0Var.Q0.get("viewed");
                    if (z6xVar == null) {
                        z6xVar = z6x.a;
                    }
                    ua91Var.A(str5, z6xVar, "viewed", ji0Var.t);
                }
                return;
            case 23:
                ((TranscriptListView) obj).n2.onNext(rih1.a);
                return;
            case 25:
                if (i == 0 && i2 == 0) {
                    ((oej1) obj).a.invoke(new hej1(recyclerView.getLayoutManager().c1()));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ zl7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void i(RecyclerView recyclerView, int i) {
    }
}
