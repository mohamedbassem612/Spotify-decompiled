package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class px61 {
    public static final kiv a = mod.t(new n4k((byte) 26));

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final hw61 a(mx61 mx61Var, int i) throws NoWhenBranchMatchedException {
        switch (l1d.C(i)) {
            case 0:
                return mx61Var.h;
            case 1:
                return mx61Var.e;
            case 2:
                return mx61Var.g;
            case 3:
                return c(mx61Var.e);
            case 4:
                return mx61Var.a;
            case 5:
                return c(mx61Var.a);
            case 6:
                return er31.a;
            case 7:
                return mx61Var.d;
            case 8:
                h8n h8nVar = mx61Var.d;
                q3v q3vVar = nw61.i;
                return h8n.d(h8nVar, q3vVar, null, null, q3vVar, 6);
            case 9:
                return mx61Var.f;
            case 10:
                h8n h8nVar2 = mx61Var.d;
                q3v q3vVar2 = nw61.i;
                return h8n.d(h8nVar2, null, q3vVar2, q3vVar2, null, 9);
            case 11:
                return c(mx61Var.d);
            case 12:
                return mx61Var.c;
            case 13:
                return d4o1.a;
            case 14:
                return mx61Var.b;
            default:
                eg.o();
                return null;
        }
    }

    public static final hw61 b(b0k b0kVar, int i) {
        return a(lgo1.p(b0kVar), i);
    }

    public static h8n c(h8n h8nVar) {
        q3v q3vVar = nw61.i;
        return h8n.d(h8nVar, null, null, q3vVar, q3vVar, 3);
    }
}
