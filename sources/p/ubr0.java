package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ubr0 implements c690 {
    public final lzn0 a;

    public ubr0(lzn0 lzn0Var) {
        this.a = lzn0Var;
    }

    @Override // p.c690
    public final void b(String str, String str2, String str3) {
        c(new Bundle(), str, str2, str3);
    }

    @Override // p.c690
    public final void c(Bundle bundle, String str, String str2, String str3) {
        bundle.putString("result-receiver-id", str);
        p1f0 p1f0VarW = rrn1.w(str2);
        if (str3 != null) {
            p1f0VarW.q(new awn0(new ou80(str3)));
        }
        this.a.i(p1f0VarW.h(), bundle);
    }

    @Override // p.c690
    public final void pop() {
        this.a.e();
    }
}
