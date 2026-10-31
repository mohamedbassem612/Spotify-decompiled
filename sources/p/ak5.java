package p;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ak5 extends p0i implements lj5 {
    public yj5 d;
    public final zj5 e;

    public ak5(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130969143, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.e = new zj5(this);
        rj5 rj5VarD = d();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(2130969143, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((yj5) rj5VarD).r1 = i;
        rj5VarD.c();
    }

    @Override // p.p0i, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        yj5 yj5Var = (yj5) d();
        yj5Var.v();
        ((ViewGroup) yj5Var.Z0.findViewById(R.id.content)).addView(view, layoutParams);
        yj5Var.Z.a(yj5Var.Y.getCallback());
    }

    public final rj5 d() {
        yj5 yj5Var = this.d;
        if (yj5Var != null) {
            return yj5Var;
        }
        qj5 qj5Var = rj5.a;
        yj5 yj5Var2 = new yj5(getContext(), getWindow(), this, this);
        this.d = yj5Var2;
        return yj5Var2;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        d().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return wqn1.q(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        yj5 yj5Var = (yj5) d();
        yj5Var.v();
        return yj5Var.Y.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().a();
    }

    @Override // p.p0i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        yj5 yj5Var = (yj5) d();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(yj5Var.X);
        if (layoutInflaterFrom.getFactory() == null) {
            tho1.t(layoutInflaterFrom, yj5Var);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        d().c();
    }

    @Override // p.p0i, android.app.Dialog
    public final void onStop() {
        super.onStop();
        yj5 yj5Var = (yj5) d();
        yj5Var.y();
        fc11 fc11Var = yj5Var.N0;
        if (fc11Var != null) {
            fc11Var.e0(false);
        }
    }

    @Override // p.p0i, android.app.Dialog
    public void setContentView(int i) {
        b();
        d().i(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().l(getContext().getString(i));
    }

    @Override // p.p0i, android.app.Dialog
    public void setContentView(View view) {
        b();
        d().j(view);
    }

    @Override // p.p0i, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        d().k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().l(charSequence);
    }
}
