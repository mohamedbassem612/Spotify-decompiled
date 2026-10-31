package p;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class je41 implements ne41 {
    public final oe41 a;
    public boolean b;
    public Bundle c;
    public final idd1 d;

    public je41(oe41 oe41Var, sck1 sck1Var) {
        this.a = oe41Var;
        this.d = new idd1(new g24(sck1Var, (byte) 8));
    }

    @Override // p.ne41
    public final Bundle a() {
        Bundle bundleH = mno1.h((mmr0[]) Arrays.copyOf(new mmr0[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleH.putAll(bundle);
        }
        for (Map.Entry entry : ((ke41) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((fe41) entry.getValue()).b.w().a();
            if (!mue1.K(bundleA)) {
                bundleH.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleH;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleH = mno1.h((mmr0[]) Arrays.copyOf(new mmr0[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleH.putAll(bundle);
        }
        if (bundleA != null) {
            bundleH.putAll(bundleA);
        }
        this.c = bundleH;
        this.b = true;
    }
}
