package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zz4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new uz4(this, (byte) 4));

    public zz4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        zz4 zz4Var = (zz4) this.c.getValue();
        return zz4Var != null ? zz4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enabled", "android-referrals-jam", a()));
    }
}
