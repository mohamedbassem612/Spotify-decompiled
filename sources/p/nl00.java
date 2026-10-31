package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nl00 implements ykc1 {
    public final mc3 a;

    public nl00(mc3 mc3Var) {
        this.a = mc3Var;
    }

    @Override // p.ykc1
    public final Bundle a(Bundle bundle, boolean z) {
        Bundle bundle2;
        Bundle bundle3;
        if (z && bundle != null && (bundle2 = bundle.getBundle("runtime")) != null && (bundle3 = bundle2.getBundle("datasource-state")) != null) {
            bundle3.remove("isRestored");
        }
        return bundle;
    }

    @Override // p.ykc1
    public final String b() {
        return "evo";
    }

    @Override // p.ykc1
    public final jqd0 c(String str, xkc1 xkc1Var) {
        return new jqd0(this.a, new vk00(str, xkc1Var.a), true, (byte) 21);
    }
}
