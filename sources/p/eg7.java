package p;

import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.car.app.navigation.model.Maneuver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.equalizer.uiusecases.equalizerpicker.EqualizerView;
import com.spotify.transcript.list.TranscriptListView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eg7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public eg7(gmt gmtVar, iir0 iir0Var) {
        this.a = (byte) 19;
        this.b = gmtVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Exception {
        etg etgVar;
        int i9;
        m3n m3nVar;
        nk80 nk80VarI;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                mg7 mg7Var = (mg7) obj;
                RecyclerView recyclerView = mg7Var.i;
                int i10 = i4 - i2;
                if (i10 != i8 - i7) {
                    recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), mg7Var.T0 + i10);
                    return;
                }
                return;
            case 1:
                ((i69) obj).a();
                return;
            case 2:
                ((ajq0) obj).W();
                return;
            case 3:
                throw null;
            case 4:
                lag lagVar = (lag) obj;
                ViewGroup viewGroup = (ViewGroup) lagVar.b;
                if (viewGroup == null || (etgVar = (etg) lagVar.c) == null) {
                    return;
                }
                etgVar.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
                return;
            case 5:
                ((cug) obj).f(true);
                return;
            case 6:
                view.removeOnLayoutChangeListener(this);
                o0c.M(((ogh) obj).e.d);
                return;
            case 7:
                ((ujr) obj).D();
                return;
            case 8:
                str strVar = (str) obj;
                if (strVar.f || (i9 = i3 - i) == 0) {
                    return;
                }
                int i11 = i7 - i5;
                ydt ydtVar = strVar.g;
                if (ydtVar == null || i9 == i11) {
                    return;
                }
                strVar.a(ydtVar, new SpannableStringBuilder(ydtVar.a));
                return;
            case 9:
                ngs ngsVar = (ngs) obj;
                View view2 = ngsVar.d;
                if (view2 == null || (m3nVar = ngsVar.e) == null) {
                    return;
                }
                m3nVar.invoke(view2);
                return;
            case 10:
                view.removeOnLayoutChangeListener(this);
                yir yirVar = (yir) obj;
                o0c.M(((FindInContextView) ((l6s) yirVar.b).c).U0);
                iu30 iu30Var = (iu30) yirVar.c;
                if (iu30Var != null) {
                    iu30Var.invoke(h451.b);
                    return;
                }
                return;
            case 11:
                mus musVar = (mus) obj;
                View view3 = musVar.r;
                if (view3 != null) {
                    View view4 = musVar.m;
                    ngs ngsVar2 = musVar.f95p;
                    View view5 = musVar.q;
                    int i12 = view3.getContext().getResources().getDisplayMetrics().widthPixels;
                    if (ngsVar2 == null || view4 == null || view5 == null) {
                        return;
                    }
                    mmr0 mmr0VarD = musVar.d(view4, view3, musVar.s);
                    musVar.b(view4, ((Number) mmr0VarD.a).intValue(), i12);
                    int i13 = musVar.s;
                    if (i13 != musVar.h) {
                        mmr0VarD = musVar.d(view4, view3, i13);
                    }
                    try {
                        ngsVar2.b.update(view3, ((Number) mmr0VarD.a).intValue(), ((Number) mmr0VarD.b).intValue(), -1, -1);
                        break;
                    } catch (RuntimeException e) {
                        Logger.d("tooltip won't be updated - exception thrown: " + e, new Object[0]);
                    }
                    mus.j(view5, ngsVar2.a(), view3, musVar.s);
                    return;
                }
                return;
            case 12:
                a2w a2wVar = (a2w) obj;
                View viewFindFocus = view.findFocus();
                if (viewFindFocus == null) {
                    return;
                }
                WeakHashMap weakHashMap = b8k1.a;
                hsl1 hsl1VarA = s7k1.a(view);
                int i14 = (hsl1VarA == null || (nk80VarI = hsl1VarA.a.i(8)) == null) ? 0 : nk80VarI.d;
                Integer numValueOf = i14 > 0 ? Integer.valueOf(i14) : null;
                if (numValueOf != null) {
                    int height = view.getHeight() - numValueOf.intValue();
                    ScrollView scrollView = a2wVar.N0;
                    Rect rect = a2wVar.V0;
                    rect.setEmpty();
                    scrollView.offsetDescendantRectToMyCoords(viewFindFocus, rect);
                    int scrollY = (rect.bottom - height) - view.getScrollY();
                    if (scrollY > 0) {
                        view.scrollBy(0, scrollY);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                view.removeOnLayoutChangeListener(this);
                int i15 = EqualizerView.Y0;
                ((EqualizerView) obj).z(false);
                return;
            case 14:
                view.removeOnLayoutChangeListener(this);
                FindInContextView findInContextView = (FindInContextView) obj;
                findInContextView.V0.setVisibility(findInContextView.U0.getText().length() > 0 ? 0 : 8);
                return;
            case 15:
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                ze70.Y0((ze70) obj);
                return;
            case 16:
                ((v7v) obj).invoke();
                return;
            case 17:
                ((ssw0) obj).l(Integer.valueOf(i4 - i2));
                return;
            case 18:
                mwg0 mwg0Var = (mwg0) obj;
                if (mwg0Var.k0().getConfiguration().orientation != 1) {
                    return;
                }
                int i16 = (int) (mwg0Var.k0().getDisplayMetrics().density * 24.0f);
                View view6 = mwg0Var.N1;
                if (view6 == null) {
                    u890.C("header");
                    throw null;
                }
                int top = view6.getTop();
                View view7 = mwg0Var.O1;
                if (view7 == null) {
                    u890.C("footer");
                    throw null;
                }
                int bottom = i4 - view7.getBottom();
                int iMax = Math.max(top < i16 ? Math.abs(i16 - top) : 0, bottom < i16 ? Math.abs(i16 - bottom) : 0);
                ImageView imageView = mwg0Var.I1;
                if (imageView == null) {
                    u890.C("coverImageView");
                    throw null;
                }
                qhl layoutParams = imageView.getLayoutParams();
                int marginStart = layoutParams.getMarginStart() + iMax;
                int marginEnd = layoutParams.getMarginEnd() + iMax;
                layoutParams.setMarginStart(marginStart);
                layoutParams.setMarginEnd(marginEnd);
                ImageView imageView2 = mwg0Var.I1;
                if (imageView2 == null) {
                    u890.C("coverImageView");
                    throw null;
                }
                imageView2.setLayoutParams(layoutParams);
                View view8 = mwg0Var.F1;
                if (view8 != null) {
                    view8.removeOnLayoutChangeListener(this);
                    return;
                } else {
                    u890.C("overlayView");
                    throw null;
                }
            case 19:
                view.removeOnLayoutChangeListener(this);
                ConstraintLayout constraintLayout = (ConstraintLayout) ((gmt) obj).b;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) (qx21.a(2131165685, view.getContext().getResources()) * view.getHeight()));
                return;
            case 20:
                view.post(new an90((ccz0) obj, (byte) 29));
                return;
            case 21:
                view.removeOnLayoutChangeListener(this);
                ((l0x0) obj).k();
                return;
            case 22:
                RecyclerView recyclerView2 = (TranscriptListView) obj;
                view.removeOnLayoutChangeListener(this);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                int marginStart2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0;
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                int marginEnd2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() : 0;
                if (marginStart2 == 0 && marginEnd2 == 0) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if (layoutParams4 == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
                view.setLayoutParams(marginLayoutParams);
                recyclerView2.getClass();
                ViewGroup.LayoutParams layoutParams5 = recyclerView2.getLayoutParams();
                if (layoutParams5 == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams5;
                marginLayoutParams2.setMargins(marginStart2, marginLayoutParams2.topMargin, marginEnd2, marginLayoutParams2.bottomMargin);
                recyclerView2.setLayoutParams(marginLayoutParams2);
                return;
            case 23:
                ((n9b1) obj).L();
                return;
            case 24:
                view.removeOnLayoutChangeListener(this);
                ((yee1) obj).a(view);
                return;
            case 25:
                view.removeOnLayoutChangeListener(this);
                View view9 = (View) ((zsc) obj).b;
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view9.getLayoutParams();
                rwq0.s(view9, new ut1(marginLayoutParams3, marginLayoutParams3.bottomMargin, (byte) 12));
                return;
            case 26:
                view.removeOnLayoutChangeListener(this);
                View view10 = (View) ((n2o) obj).c;
                view10.setPivotX(0.0f);
                view10.setPivotY(view.getMeasuredHeight());
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                view.removeOnLayoutChangeListener(this);
                ((keg1) obj).i = Integer.valueOf(view.getWidth());
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                view.removeOnLayoutChangeListener(this);
                ((w7d1) obj).invoke(view);
                return;
            default:
                ((zck1) obj).w();
                return;
        }
    }

    public /* synthetic */ eg7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
