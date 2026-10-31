package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class scr {
    public final rtb0 a;
    public final xtb0 b;
    public final ven0 c;
    public final iu30 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public scr(rtb0 rtb0Var, xtb0 xtb0Var, ven0 ven0Var, iu30 iu30Var) {
        this.a = rtb0Var;
        this.b = xtb0Var;
        this.c = ven0Var;
        this.d = iu30Var;
    }

    public static void b(scr scrVar, String str, p3v p3vVar) {
        scrVar.e.add(null);
        scrVar.a.d(((Object) str) + ".divider", "divider", new j2i(-1676663598, new mgl(p3vVar, (byte) 24), true));
    }

    public final void a() {
        if (this.f) {
            this.f = false;
            this.e.add(null);
            rtb0.f(this.a, (Object) null, vhi.b, 3);
        }
    }
}
