package p;

import android.content.Intent;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d3e extends qiv {
    public final phv f;

    public d3e(phv phvVar) {
        this.f = phvVar;
        phvVar.e(new m4d(this, (byte) 8));
    }

    public final boolean d(Intent intent, hwh0 hwh0Var) {
        if (this.f.f(intent, hwh0Var)) {
            return true;
        }
        intent.toString();
        return false;
    }

    public final void e() {
        this.f.a();
    }

    public final void f() {
        this.f.b();
    }

    public final void g(int i) {
        this.f.d(i);
    }

    public final void i(int i) {
        this.f.l();
    }

    public final void j(int i) {
        this.f.j(i);
    }

    public final void l(String str) {
        this.f.i(str);
    }

    public final void m(String str) {
        this.f.c(str);
    }

    public final void n(List list) {
        this.f.g(list);
    }
}
