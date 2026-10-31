package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ac4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new wb4(this, (byte) 3));

    public ac4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        ac4 ac4Var = (ac4) this.c.getValue();
        return ac4Var != null ? ac4Var.a() : this.a;
    }

    public final List models() {
        return k4p1.x(new fpb("expandable_description_enabled", "android-creativework-elements-description", a()));
    }
}
