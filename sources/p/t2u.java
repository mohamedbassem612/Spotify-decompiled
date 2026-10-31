package p;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class t2u extends zf30 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler F1;
    public boolean O1;
    public Dialog Q1;
    public boolean R1;
    public boolean S1;
    public boolean T1;
    public final a6n G1 = new a6n(this, (byte) 12);
    public final vae H1 = new vae(this, (byte) 4);
    public final whr I1 = new whr(this, (byte) 1);
    public int J1 = 0;
    public int K1 = 0;
    public boolean L1 = true;
    public boolean M1 = true;
    public int N1 = -1;
    public final xjr P1 = new xjr(this, (byte) 1);
    public boolean U1 = false;

    @Override // p.zf30
    public void A0() {
        this.h1 = true;
        if (!this.T1 && !this.S1) {
            this.S1 = true;
        }
        this.v1.k(this.P1);
    }

    @Override // p.zf30
    public final LayoutInflater B0(Bundle bundle) {
        LayoutInflater layoutInflaterB0 = super.B0(bundle);
        boolean z = this.M1;
        if (z && !this.O1) {
            if (z && !this.U1) {
                try {
                    this.O1 = true;
                    Dialog dialogC1 = c1(bundle);
                    this.Q1 = dialogC1;
                    if (this.M1) {
                        f1(dialogC1, this.J1);
                        Context contextH0 = h0();
                        if (contextH0 instanceof Activity) {
                            this.Q1.setOwnerActivity((Activity) contextH0);
                        }
                        this.Q1.setCancelable(this.L1);
                        this.Q1.setOnCancelListener(this.H1);
                        this.Q1.setOnDismissListener(this.I1);
                        this.U1 = true;
                    } else {
                        this.Q1 = null;
                    }
                    this.O1 = false;
                } catch (Throwable th) {
                    this.O1 = false;
                    throw th;
                }
            }
            if (th30.P(2)) {
                toString();
            }
            Dialog dialog = this.Q1;
            if (dialog != null) {
                return layoutInflaterB0.cloneInContext(dialog.getContext());
            }
        } else if (th30.P(2)) {
            toString();
        }
        return layoutInflaterB0;
    }

    @Override // p.zf30
    public void F0(Bundle bundle) {
        Dialog dialog = this.Q1;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.J1;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.K1;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.L1;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.M1;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.N1;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // p.zf30
    public void G0() {
        this.h1 = true;
        Dialog dialog = this.Q1;
        if (dialog != null) {
            this.R1 = false;
            dialog.show();
            View decorView = this.Q1.getWindow().getDecorView();
            x9p1.p(decorView, this);
            lap1.o(decorView, this);
            hm5.J(decorView, this);
        }
    }

    @Override // p.zf30
    public void H0() {
        this.h1 = true;
        Dialog dialog = this.Q1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p.zf30
    public final void J0(Bundle bundle) {
        Bundle bundle2;
        this.h1 = true;
        if (this.Q1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.Q1.onRestoreInstanceState(bundle2);
    }

    @Override // p.zf30
    public final void K0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.K0(layoutInflater, viewGroup, bundle);
        if (this.j1 != null || this.Q1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.Q1.onRestoreInstanceState(bundle2);
    }

    public void Y0() {
        Z0(true, false);
    }

    public final void Z0(boolean z, boolean z2) {
        if (this.S1) {
            return;
        }
        this.S1 = true;
        this.T1 = false;
        Dialog dialog = this.Q1;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.Q1.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.F1.getLooper()) {
                    onDismiss(this.Q1);
                } else {
                    this.F1.post(this.G1);
                }
            }
        }
        this.R1 = true;
        if (this.N1 >= 0) {
            th30 th30VarJ0 = j0();
            int i = this.N1;
            if (i < 0) {
                hhg1.n(f4i1.c(i, "Bad id: "));
                return;
            } else {
                th30VarJ0.y(new qh30(th30VarJ0, (String) null, i, 1), z);
                this.N1 = -1;
                return;
            }
        }
        nu9 nu9Var = new nu9(j0());
        nu9Var.r = true;
        nu9Var.m(this);
        if (z) {
            nu9Var.g(true, true);
        } else {
            nu9Var.f();
        }
    }

    public Dialog a1() {
        return this.Q1;
    }

    public int b1() {
        return this.K1;
    }

    @Override // p.zf30
    public final jch0 c0() {
        return new s2u(this, new uf30(this));
    }

    public Dialog c1(Bundle bundle) {
        if (th30.P(3)) {
            toString();
        }
        return new p0i(P0(), b1());
    }

    public final Dialog d1() {
        Dialog dialogA1 = a1();
        if (dialogA1 != null) {
            return dialogA1;
        }
        bhn0.u("DialogFragment ", this, " does not have a Dialog.");
        return null;
    }

    public void dismiss() {
        Z0(false, false);
    }

    public final void e1(int i, int i2) {
        if (th30.P(2)) {
            toString();
        }
        this.J1 = i;
        if (i == 2 || i == 3) {
            this.K1 = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.K1 = i2;
        }
    }

    public void f1(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void g1(th30 th30Var, String str) {
        this.S1 = false;
        this.T1 = true;
        th30Var.getClass();
        nu9 nu9Var = new nu9(th30Var);
        nu9Var.r = true;
        nu9Var.k(0, this, str, 1);
        nu9Var.f();
    }

    public void h1(th30 th30Var, String str) {
        this.S1 = false;
        this.T1 = true;
        th30Var.getClass();
        nu9 nu9Var = new nu9(th30Var);
        nu9Var.r = true;
        nu9Var.k(0, this, str, 1);
        nu9Var.h();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.R1) {
            return;
        }
        if (th30.P(3)) {
            toString();
        }
        Z0(true, true);
    }

    public void t() {
        Y0();
    }

    @Override // p.zf30
    public final void t0() {
        this.h1 = true;
    }

    @Override // p.zf30
    public void v0(Context context) {
        super.v0(context);
        this.v1.g(this.P1);
        if (this.T1) {
            return;
        }
        this.S1 = false;
    }

    @Override // p.zf30
    public void w0(Bundle bundle) {
        super.w0(bundle);
        this.F1 = new Handler();
        this.M1 = this.Z0 == 0;
        if (bundle != null) {
            this.J1 = bundle.getInt("android:style", 0);
            this.K1 = bundle.getInt("android:theme", 0);
            this.L1 = bundle.getBoolean("android:cancelable", true);
            this.M1 = bundle.getBoolean("android:showsDialog", this.M1);
            this.N1 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // p.zf30
    public void z0() {
        this.h1 = true;
        Dialog dialog = this.Q1;
        if (dialog != null) {
            this.R1 = true;
            dialog.setOnDismissListener(null);
            this.Q1.dismiss();
            if (!this.S1) {
                onDismiss(this.Q1);
            }
            this.Q1 = null;
            this.U1 = false;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
