package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rmb0 implements hfh0 {
    public final /* synthetic */ hfh0 a;
    public final /* synthetic */ vmb0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ hfh0 d;

    public rmb0(hfh0 hfh0Var, vmb0 vmb0Var, int i, hfh0 hfh0Var2) {
        this.b = vmb0Var;
        this.c = i;
        this.d = hfh0Var2;
        this.a = hfh0Var;
    }

    public final void a() {
        int i = this.c;
        vmb0 vmb0Var = this.b;
        vmb0Var.d = i;
        this.d.a();
        if (vmb0Var.a.i == null) {
            vmb0Var.g(vmb0Var.d);
        }
    }

    public final iu30 b() {
        return this.a.b();
    }

    public final Map c() {
        return this.a.c();
    }

    public final vu30 d() {
        return this.a.d();
    }

    public final iu30 e() {
        return this.a.e();
    }

    public final int getHeight() {
        return this.a.getHeight();
    }

    public final int getWidth() {
        return this.a.getWidth();
    }
}
