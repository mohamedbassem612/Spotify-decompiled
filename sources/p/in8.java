package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class in8 implements k3i1, xeu, kvn0 {
    public final lzn0 a;

    public /* synthetic */ in8(lzn0 lzn0Var) {
        this.a = lzn0Var;
    }

    public void a(String str, tv80 tv80Var, Bundle bundle) {
        lzn0 lzn0Var = this.a;
        if (tv80Var != null) {
            lzn0Var.a(str, tv80Var, bundle);
        } else if (bundle != null) {
            lzn0Var.g(bundle, str);
        } else {
            lzn0Var.h(str);
        }
    }

    public void b(String str) {
        this.a.f(new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
    }

    public jhm c(String str, String str2, boolean z) {
        return new jhm("episode_browse", z ? pkx.c : mrx.c, (fhm) null, Integer.valueOf(z ? 2131954331 : 2131954332), (String) null, false, (tm81) null, new ihm(ahm.c, new ghm(iub.N0, new nb9(str, (byte) 29)), new oo6((Object) this, (Object) str, (Object) str2, (byte) 25)), 244);
    }

    public void dismiss() {
        this.a.e();
    }

    public void h(String str) {
        this.a.e();
    }
}
