package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nd4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public nd4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new wb4(this, (byte) 20));
    }

    public final boolean a() {
        nd4 nd4Var = (nd4) this.c.getValue();
        return nd4Var != null ? nd4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("registration_enabled", "android-deviceproxy-registrar", a()));
    }

    public nd4(luk lukVar) {
        this(false, lukVar);
    }
}
