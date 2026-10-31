package p;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pe41 {
    public final qe41 a;
    public final ww21 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final lqc c = new lqc((byte) 26);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public pe41(qe41 qe41Var, ww21 ww21Var) {
        this.a = qe41Var;
        this.b = ww21Var;
    }

    public final void a() {
        qe41 qe41Var = this.a;
        if (qe41Var.getLifecycle().b() != w8c0.b) {
            eg.m("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                eg.m("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            qe41Var.getLifecycle().a(new wzh(this, (byte) 2));
            this.e = true;
        }
    }
}
