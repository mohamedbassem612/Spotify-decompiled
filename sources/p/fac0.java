package p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Deprecated
public abstract class fac0 extends zf30 implements l8c0 {
    public final v8c0 F1 = new v8c0();

    @Override // p.zf30
    public void D0() {
        this.h1 = true;
        this.F1.a(u8c0.d);
    }

    @Override // p.zf30
    public void E0() {
        this.h1 = true;
        this.F1.a(u8c0.c);
    }

    @Override // p.zf30
    public void F0(Bundle bundle) {
        this.F1.a(new t8c0(bundle, (byte) 1));
    }

    @Override // p.zf30
    public void G0() {
        this.h1 = true;
        this.F1.a(u8c0.a);
    }

    @Override // p.zf30
    public void H0() {
        this.h1 = true;
        this.F1.a(u8c0.b);
    }

    @Override // p.zf30
    public void I0(View view, Bundle bundle) {
        this.F1.a(new t8c0(bundle, (byte) 2));
        dg30 dg30VarN0 = N0();
        dg30VarN0.c.b(new eac0(this), this);
    }

    public final boolean k(m8c0 m8c0Var) {
        return this.F1.k(m8c0Var);
    }

    public final boolean u(m8c0 m8c0Var) {
        return this.F1.u(m8c0Var);
    }

    @Override // p.zf30
    public final void u0(int i, int i2, Intent intent) {
        super.u0(i, i2, intent);
        v8c0 v8c0Var = this.F1;
        v8c0Var.getClass();
        v8c0Var.a(new n8c0(i, i2, intent));
    }

    @Override // p.zf30
    public void w0(Bundle bundle) {
        super.w0(bundle);
        v8c0 v8c0Var = this.F1;
        v8c0Var.getClass();
        v8c0Var.a(new t8c0(bundle, (byte) 3));
    }

    @Override // p.zf30
    public void y0() {
        this.h1 = true;
        this.F1.a(u8c0.e);
    }
}
