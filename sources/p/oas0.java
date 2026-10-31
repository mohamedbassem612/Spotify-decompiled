package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oas0 implements ky11 {
    public final Set a;
    public final bfn0 b = new bfn0(0, new b440[16]);

    public oas0(Set set) {
        this.a = set;
    }

    public final void b() {
        bfn0 bfn0Var = this.b;
        Object[] objArr = bfn0Var.a;
        int i = bfn0Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ky11 ky11Var = ((b440) objArr[i2]).a;
            this.a.remove(ky11Var);
            ky11Var.b();
        }
    }

    public final void f() {
    }

    public final void h() {
    }
}
