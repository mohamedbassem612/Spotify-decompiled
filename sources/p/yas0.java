package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yas0 implements xpw {
    public final iu30 a;
    public final rey0 b = new rey0(new n1r0(this, (byte) 14));
    public final ia00 c = n3o1.q(this).a(new aaq0(this, (byte) 4), f2s0.e);
    public final psw d;

    public yas0(iu30 iu30Var) {
        this.a = iu30Var;
        j2i j2iVar = new j2i(-609525750, new xyh(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public static c10 e(lbt0 lbt0Var) {
        c10 c10Var;
        nk nkVar = lbt0Var.b;
        Map map = lbt0Var.c;
        im imVar = nkVar.h;
        if (imVar.c) {
            c10 c10Var2 = (c10) map.get(t80.e);
            if (c10Var2 != null) {
                return c10.a(c10Var2);
            }
            return null;
        }
        if (!imVar.i || (c10Var = (c10) map.get(t80.f)) == null) {
            return null;
        }
        return c10.a(c10Var);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
