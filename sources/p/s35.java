package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s35 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c;

    public s35(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
        this.c = new idd1(new k25(this, (byte) 19));
    }

    public final int a() {
        s35 s35Var = (s35) this.c.getValue();
        return s35Var != null ? s35Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("sample_version", "android-system-shared-preferences-size-sampler", a(), 0, Integer.MAX_VALUE));
    }

    public s35(luk lukVar) {
        this(0, lukVar);
    }
}
