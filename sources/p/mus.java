package p;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.tooltipsimpl.TooltipContentView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mus {
    public final String a;
    public final ogs b;
    public final iu30 c;
    public final iu30 d;
    public final Function0 e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public View l;
    public View m;
    public Function0 n;
    public wrs o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ngs f95p;
    public View q;
    public View r;
    public int s;
    public long t;
    public final Handler j = new Handler(Looper.getMainLooper());
    public final a6n k = new a6n(this, 10);
    public final eg7 u = new eg7(this, (byte) 11);

    public mus(String str, ogs ogsVar, iu30 iu30Var, iu30 iu30Var2, Function0 function0, int i, int i2, int i3, boolean z) {
        this.a = str;
        this.b = ogsVar;
        this.c = iu30Var;
        this.d = iu30Var2;
        this.e = function0;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = z;
        this.s = i3;
    }

    public static Rect f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public static void j(View view, TooltipContentView tooltipContentView, View view2, int i) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setPivotY(0.0f);
        view.setPivotX(0.0f);
        Rect rectF = f(view2);
        Rect rectF2 = f(view);
        float dimension = tooltipContentView.getContext().getResources().getDimension(2131166777);
        int i2 = bno1.s(tooltipContentView.getContext()) ? -1 : 1;
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        int iC = l1d.C(i);
        if (iC == 0 || iC == 1) {
            float fCenterX = rectF.centerX() - rectF2.centerX();
            float measuredWidth = (tooltipContentView.getMeasuredWidth() / 2.0f) - dimension;
            float fAbs = Math.abs(fCenterX);
            if (measuredWidth > fAbs) {
                measuredWidth = fAbs;
            }
            float fSignum = Math.signum(fCenterX) * measuredWidth;
            float measuredHeight = tooltipContentView.getMeasuredHeight() / 2.0f;
            view.setTranslationX(fSignum * i2);
            if (i != 1) {
                measuredHeight *= -1.0f;
            }
            view.setTranslationY(measuredHeight);
            return;
        }
        if (iC != 2 && iC != 3) {
            eg.o();
            return;
        }
        float fCenterY = rectF.centerY() - rectF2.centerY();
        float measuredHeight2 = (tooltipContentView.getMeasuredHeight() / 2.0f) - dimension;
        float fAbs2 = Math.abs(fCenterY);
        if (measuredHeight2 > fAbs2) {
            measuredHeight2 = fAbs2;
        }
        float fSignum2 = Math.signum(fCenterY) * measuredHeight2;
        float measuredWidth2 = tooltipContentView.getMeasuredWidth() / 2.0f;
        view.setTranslationY(fSignum2);
        float f = i2;
        if (i != 3) {
            measuredWidth2 *= -1.0f;
        }
        view.setTranslationX(f * measuredWidth2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    public final void b(View view, int i, int i2) {
        int i3 = 1;
        int i4 = bno1.s(view.getContext()) ? -1 : 1;
        int i5 = bno1.s(view.getContext()) ? i2 : 0;
        if (bno1.s(view.getContext())) {
            i2 = 0;
        }
        int i6 = this.h;
        int iC = l1d.C(i6);
        if (iC == 0 || iC == 1) {
            i3 = i6;
        } else if (iC != 2) {
            if (iC != 3) {
                eg.o();
                return;
            }
            float f = i2;
            if (view.getX() + (i * i4) > f) {
                i3 = 3;
            } else if (view.getX() + ((view.getMeasuredWidth() + i) * i4) <= f) {
                i3 = 4;
            }
        } else if (view.getX() + (i * i4) < i5) {
            i3 = 4;
        } else if (view.getX() + ((view.getMeasuredWidth() + i) * i4) <= i2) {
            i3 = 3;
        }
        this.s = i3;
    }

    public final void c(View view) {
        View view2 = this.l;
        if (view2 != null && view2.getParent() != null) {
            View view3 = this.l;
            view3.getClass();
            ((ViewGroup) view3.getParent()).removeView(this.l);
        }
        Activity activity = this.b.a;
        ngs ngsVar = new ngs(this.g, activity);
        this.f95p = ngsVar;
        this.r = view;
        View view4 = this.l;
        m3n m3nVar = new m3n(this, ngsVar, view, (byte) 13);
        View view5 = ngsVar.d;
        if (view5 != null) {
            ngsVar.e = m3nVar;
            view5.addOnLayoutChangeListener(ngsVar.f);
        }
        TooltipContentView tooltipContentViewA = ngsVar.a();
        qhl qhlVar = new qhl(-2, -2);
        qhlVar.P = ngsVar.c;
        byte b = 0;
        qhlVar.i = 0;
        qhlVar.l = 0;
        tooltipContentViewA.removeAllViews();
        tooltipContentViewA.addView(view4, qhlVar);
        tooltipContentViewA.measure(-2, -2);
        PopupWindow popupWindow = ngsVar.b;
        popupWindow.getContentView().measure(-2, -2);
        popupWindow.setHeight(-2);
        popupWindow.setWidth(popupWindow.getContentView().getMeasuredWidth());
        if (this.i) {
            popupWindow.setOutsideTouchable(true);
            popupWindow.setTouchInterceptor(new lgs(ngsVar, b));
        }
        View contentView = popupWindow.getContentView();
        this.m = contentView;
        this.q = contentView.findViewById(2131430200);
        contentView.setOnClickListener(new kus(this, (byte) 0));
        popupWindow.getContentView().findViewById(2131430201).setOnSwipeDownListener(new lus(this, (byte) 0));
        popupWindow.setOnDismissListener(new mgs(new lus(this, (byte) 1), (byte) 0));
        ngsVar.g = new lus(this, (byte) 2);
        mmr0 mmr0VarD = d(contentView, view, this.s);
        b(contentView, ((Number) mmr0VarD.a).intValue(), view.getContext().getResources().getDisplayMetrics().widthPixels);
        int i = this.s;
        if (i != this.h) {
            mmr0VarD = d(contentView, view, i);
        }
        int iIntValue = ((Number) mmr0VarD.a).intValue();
        int iIntValue2 = ((Number) mmr0VarD.b).intValue();
        long j = this.t;
        if (j > 0) {
            this.j.postDelayed(this.k, j);
        }
        if (activity.isFinishing()) {
            Logger.d("tooltip won't be shown - activity is finishing", new Object[0]);
        } else {
            try {
                popupWindow.showAsDropDown(view, iIntValue, iIntValue2);
            } catch (RuntimeException e) {
                Logger.d("tooltip won't be shown - exception thrown: " + e, new Object[0]);
            }
        }
        wrs wrsVar = this.o;
        if (wrsVar != null) {
            wrsVar.invoke(this);
        }
        view.addOnLayoutChangeListener(this.u);
    }

    public final mmr0 d(View view, View view2, int i) {
        int iCenterX;
        Rect rectF = f(view2);
        Resources resources = view.getContext().getResources();
        int i2 = this.f;
        int iU = jch0.U(resources.getDimension(i2));
        int i3 = bno1.s(view.getContext()) ? -1 : 1;
        int iC = l1d.C(i);
        if (iC == 0 || iC == 1) {
            iCenterX = rectF.centerX() - ((view.getMeasuredWidth() / 2) + rectF.left);
        } else if (iC == 2) {
            iCenterX = (-1) * (view.getMeasuredWidth() + iU) * i3;
        } else {
            if (iC != 3) {
                eg.o();
                return null;
            }
            iCenterX = (rectF.width() + iU) * i3;
        }
        int measuredHeight = view.getMeasuredHeight();
        int iU2 = jch0.U(view.getContext().getResources().getDimension(i2));
        int iC2 = l1d.C(i);
        if (iC2 == 0) {
            iU2 = -(rectF.height() + measuredHeight + iU2);
        } else if (iC2 != 1) {
            if (iC2 != 2 && iC2 != 3) {
                eg.o();
                return null;
            }
            iU2 = -((rectF.height() + measuredHeight) / 2);
        }
        return new mmr0(Integer.valueOf(iCenterX), Integer.valueOf(iU2));
    }

    public final void e() {
        ngs ngsVar = this.f95p;
        if (ngsVar != null) {
            PopupWindow popupWindow = ngsVar.b;
            View view = ngsVar.d;
            if (view != null) {
                view.removeOnLayoutChangeListener(ngsVar.f);
            }
            if (ngsVar.a.isFinishing()) {
                Logger.d("tooltip won't be dismissed - activity is finishing", new Object[0]);
            } else if (popupWindow.isShowing()) {
                try {
                    popupWindow.dismiss();
                } catch (RuntimeException e) {
                    Logger.d("tooltip won't be dismissed - exception thrown: " + e, new Object[0]);
                }
            }
        }
        this.j.removeCallbacks(this.k);
        View view2 = this.r;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this.u);
        }
        this.q = null;
        this.r = null;
        this.f95p = null;
    }

    public final void g(ssm ssmVar) {
        this.n = ssmVar;
    }

    public final void i(wrs wrsVar) {
        this.o = wrsVar;
    }

    public final void h(vas vasVar) {
    }
}
