package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d1r0 implements c690 {
    public final a1r0 a;

    public d1r0(a1r0 a1r0Var) {
        this.a = a1r0Var;
    }

    public final void b(String str, String str2, String str3) {
        c(mno1.g(), str, str2, str3);
    }

    public final void c(Bundle bundle, String str, String str2, String str3) {
        bundle.putString("result-receiver-id", str);
        this.a.a(str2, str3, bundle);
    }

    public final void pop() {
        this.a.l();
    }
}
