package p;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class dg30 extends g0i {
    public boolean W0;
    public boolean X0;
    public final lmw U0 = lmw.g(new cg30(this));
    public final tac0 V0 = new tac0(this, true);
    public boolean Y0 = true;

    public dg30() {
        this.d.j().c("android:support:lifecycle", new tku(this, (byte) 1));
        Z(new ag30(this, (byte) 0));
        this.Y.add(new ag30(this, (byte) 1));
        this.b.a(new bg30(this));
    }

    public static boolean f0(th30 th30Var) {
        boolean zF0 = false;
        for (zf30 zf30Var : th30Var.c.u()) {
            if (zf30Var != null) {
                tg30 tg30Var = zf30Var.V0;
                if ((tg30Var == null ? null : tg30Var.m0()) != null) {
                    zF0 |= f0(zf30Var.g0());
                }
                lj30 lj30Var = zf30Var.u1;
                w8c0 w8c0Var = w8c0.c;
                w8c0 w8c0Var2 = w8c0.d;
                if (lj30Var != null) {
                    lj30Var.b();
                    if (lj30Var.e.i.a(w8c0Var2)) {
                        zf30Var.u1.e.i(w8c0Var);
                        zF0 = true;
                    }
                }
                if (zf30Var.s1.i.a(w8c0Var2)) {
                    zf30Var.s1.i(w8c0Var);
                    zF0 = true;
                }
            }
        }
        return zF0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.W0);
        printWriter.print(" mResumed=");
        printWriter.print(this.X0);
        printWriter.print(" mStopped=");
        printWriter.print(this.Y0);
        if (getApplication() != null) {
            fad0.g(this).d(str3, fileDescriptor, printWriter, strArr);
        }
        this.U0.t().w(str, fileDescriptor, printWriter, strArr);
    }

    public th30 e0() {
        return this.U0.t();
    }

    @Override // p.g0i, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.U0.u();
        super.onActivityResult(i, i2, intent);
    }

    @Override // p.g0i, p.f0i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.V0.g(k8c0.ON_CREATE);
        this.U0.j();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewV = this.U0.v((View) null, str, context, attributeSet);
        return viewV == null ? super.onCreateView(str, context, attributeSet) : viewV;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.U0.k();
        this.V0.g(k8c0.ON_DESTROY);
    }

    @Override // p.g0i, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.U0.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.X0 = false;
        this.U0.n();
        this.V0.g(k8c0.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.V0.g(k8c0.ON_RESUME);
        this.U0.o();
    }

    @Override // p.g0i, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.U0.u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        lmw lmwVar = this.U0;
        lmwVar.u();
        super.onResume();
        this.X0 = true;
        lmwVar.r();
    }

    @Override // android.app.Activity
    public void onStart() {
        lmw lmwVar = this.U0;
        lmwVar.u();
        super.onStart();
        this.Y0 = false;
        if (!this.W0) {
            this.W0 = true;
            lmwVar.h();
        }
        lmwVar.r();
        this.V0.g(k8c0.ON_START);
        lmwVar.p();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.U0.u();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.Y0 = true;
        while (f0(e0())) {
        }
        this.U0.q();
        this.V0.g(k8c0.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewV = this.U0.v(view, str, context, attributeSet);
        return viewV == null ? super.onCreateView(view, str, context, attributeSet) : viewV;
    }

    public void g0(zf30 zf30Var) {
    }
}
