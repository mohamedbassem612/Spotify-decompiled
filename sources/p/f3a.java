package p;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f3a implements vc31, e2j0 {
    public int a;
    public int b;

    public f3a(Context context, int i) {
        this.a = i;
        this.b = context.getResources().getDimensionPixelSize(2131165425);
    }

    public int a() {
        return this.a;
    }

    public f3a b() {
        return new f3a(this);
    }

    public int c() {
        int i = this.b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public int d() {
        return this.b | this.a;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.b;
    }

    public boolean g() {
        return true;
    }

    public int h() {
        return this.a;
    }

    public void i(int i) {
        this.a = i;
    }

    public void j(int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.a = i;
        }
    }

    public void k() {
        this.a = 0;
    }

    public void l(int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }

    public void m(w611 w611Var) {
        View view = w611Var.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public void n(int i) {
        this.b = i;
    }

    public void o(int i) {
        this.a = i;
    }

    public /* synthetic */ f3a(boolean z) {
    }

    public /* synthetic */ f3a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public f3a() {
        this.a = 0;
        this.b = 0;
    }

    public f3a(f3a f3aVar) {
        this.a = f3aVar.a;
        this.b = f3aVar.b;
    }

    public f3a(int i, int i2, int i3) {
        this.a = (-i2) + i3;
        this.b = i + 1;
    }
}
