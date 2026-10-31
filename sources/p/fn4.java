package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fn4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new om4(this, (byte) 14));

    public fn4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        fn4 fn4Var = (fn4) this.c.getValue();
        return fn4Var != null ? fn4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("should_use_vit", "android-libs-nowplaying-elements-mixingtransitionelement", a()));
    }
}
