package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class roz0 extends ConstraintLayout {
    public final xfz0 T0;
    public int U0;
    public final gch0 V0;

    /* JADX WARN: Multi-variable type inference failed */
    public roz0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131625192, (ViewGroup) this);
        gch0 gch0Var = new gch0();
        this.V0 = gch0Var;
        eo11 eo11Var = new eo11(0.5f);
        iw61 iw61Var = gch0Var.a.a;
        iw61Var.getClass();
        zko1 zko1Var = iw61Var.a;
        zko1 zko1Var2 = iw61Var.b;
        zko1 zko1Var3 = iw61Var.c;
        zko1 zko1Var4 = iw61Var.d;
        fmv fmvVar = iw61Var.i;
        fmv fmvVar2 = iw61Var.j;
        fmv fmvVar3 = iw61Var.k;
        fmv fmvVar4 = iw61Var.l;
        iw61 iw61Var2 = new iw61();
        iw61Var2.a = zko1Var;
        iw61Var2.b = zko1Var2;
        iw61Var2.c = zko1Var3;
        iw61Var2.d = zko1Var4;
        iw61Var2.e = eo11Var;
        iw61Var2.f = eo11Var;
        iw61Var2.g = eo11Var;
        iw61Var2.h = eo11Var;
        iw61Var2.i = fmvVar;
        iw61Var2.j = fmvVar2;
        iw61Var2.k = fmvVar3;
        iw61Var2.l = fmvVar4;
        gch0Var.setShapeAppearanceModel(iw61Var2);
        this.V0.m(ColorStateList.valueOf(-1));
        gch0 gch0Var2 = this.V0;
        WeakHashMap weakHashMap = b8k1.a;
        setBackground(gch0Var2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, omz0.F, i, 0);
        this.U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.T0 = new xfz0(this, (byte) 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = b8k1.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            xfz0 xfz0Var = this.T0;
            handler.removeCallbacks(xfz0Var);
            handler.post(xfz0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            xfz0 xfz0Var = this.T0;
            handler.removeCallbacks(xfz0Var);
            handler.post(xfz0Var);
        }
    }

    public final void setBackgroundColor(int i) {
        this.V0.m(ColorStateList.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        kil kilVar = new kil();
        kilVar.f(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != 2131428085 && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.U0;
                gil gilVar = kilVar.l(id).e;
                gilVar.A = 2131428085;
                gilVar.B = i4;
                gilVar.C = f;
                f = (360.0f / (childCount - i)) + f;
            }
        }
        kilVar.b(this);
    }
}
