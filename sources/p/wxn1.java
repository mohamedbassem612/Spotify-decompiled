package p;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wxn1 extends zf30 implements bac0 {
    public static final WeakHashMap G1 = new WeakHashMap();
    public final ftn1 F1 = new ftn1();

    @Override // p.zf30
    public final void E0() {
        this.h1 = true;
        this.F1.e();
    }

    @Override // p.zf30
    public final void F0(Bundle bundle) {
        this.F1.g(bundle);
    }

    @Override // p.zf30
    public final void G0() {
        this.h1 = true;
        this.F1.d();
    }

    @Override // p.zf30
    public final void H0() {
        this.h1 = true;
        this.F1.h();
    }

    @Override // p.bac0
    public final void a(c8n1 c8n1Var) {
        this.F1.b(c8n1Var);
    }

    @Override // p.zf30
    public final void d0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.d0(str, fileDescriptor, printWriter, strArr);
        this.F1.j();
    }

    @Override // p.bac0
    public final c8n1 l() {
        return this.F1.a();
    }

    @Override // p.zf30
    public final void u0(int i, int i2, Intent intent) {
        super.u0(i, i2, intent);
        this.F1.f(i, i2, intent);
    }

    @Override // p.zf30
    public final void w0(Bundle bundle) {
        super.w0(bundle);
        this.F1.c(bundle);
    }

    @Override // p.zf30
    public final void y0() {
        this.h1 = true;
        this.F1.i();
    }
}
