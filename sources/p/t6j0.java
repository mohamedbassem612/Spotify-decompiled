package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t6j0 {
    public final en31 a;
    public final lmd b = new lmd(this, (byte) 5);
    public final idd1 c;

    public t6j0(en31 en31Var) {
        this.c = new idd1(new mmd(en31Var, (byte) 5));
        this.a = en31Var;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(List list) {
        z8b0 z8b0Var = new z8b0();
        en31 en31Var = this.a;
        qyo1.x(en31Var, false, true, z8b0Var);
        qyo1.x(en31Var, false, true, new d(this, (smc0) list, (byte) 11));
    }
}
