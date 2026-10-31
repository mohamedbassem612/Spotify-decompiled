package p;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class jti0 implements zdl1 {
    public final Object X;
    public final boolean a;
    public boolean b;
    public final int c;
    public int d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    public jti0(Context context, msi0 msi0Var, View view, boolean z, int i, int i2) {
        this.d = 8388611;
        this.X = new mgs(this, (byte) 1);
        this.e = context;
        this.f = msi0Var;
        this.g = view;
        this.a = z;
        this.c = i;
    }

    public iti0 a() {
        iti0 iti0Var = (iti0) this.i;
        if (iti0Var != null) {
            return iti0Var;
        }
        Object obj = this.e;
        Context context = (Context) obj;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int iMin = Math.min(point.x, point.y);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165206);
        Context context2 = (Context) obj;
        Object obj2 = this.f;
        iti0 a2eVar = iMin >= dimensionPixelSize ? new a2e(context2, (View) this.g, this.c, this.a) : new qfb1(context2, (msi0) obj2, (View) this.g, this.c, this.a);
        a2eVar.j((msi0) obj2);
        a2eVar.r((mgs) this.X);
        a2eVar.l((View) this.g);
        a2eVar.d((oti0) this.h);
        a2eVar.o(this.b);
        a2eVar.p(this.d);
        this.i = a2eVar;
        return a2eVar;
    }

    public boolean b() {
        iti0 iti0Var = (iti0) this.i;
        return iti0Var != null && iti0Var.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = (PopupWindow.OnDismissListener) this.t;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(boolean z) {
        ((iu30) this.t).invoke(Boolean.valueOf(z));
    }

    public void e(int i, boolean z) {
        ((vu30) this.h).invoke(Integer.valueOf(i), Boolean.valueOf(z));
    }

    public void f(boolean z) {
        ((iu30) this.i).invoke(Boolean.valueOf(z));
    }

    public void g(int i, int i2, boolean z, boolean z2) {
        iti0 iti0VarA = a();
        iti0VarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.d, ((View) this.g).getLayoutDirection()) & 7) == 5) {
                i -= ((View) this.g).getWidth();
            }
            iti0VarA.q(i);
            iti0VarA.t(i2);
            int i3 = (int) ((((Context) this.e).getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            iti0VarA.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        iti0VarA.m();
    }

    public jti0(ijf1 ijf1Var, boolean z, boolean z2, int i, int i2, Integer num, Integer num2, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0) {
        this.e = ijf1Var;
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.f = num;
        this.g = num2;
        this.h = vu30Var;
        this.i = iu30Var;
        this.t = iu30Var2;
        this.X = function0;
    }
}
