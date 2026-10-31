package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lwq0 {
    public final /* synthetic */ mwq0 a;

    public lwq0(mwq0 mwq0Var) {
        this.a = mwq0Var;
    }

    public static boolean a(lwq0 lwq0Var) {
        p9m p9mVar = smg1.a;
        mwq0 mwq0Var = lwq0Var.a;
        if (!mwq0Var.a()) {
            return false;
        }
        mwq0Var.d = p9mVar;
        r7h.e0(mwq0Var.b);
        return true;
    }

    public static void b(lwq0 lwq0Var) {
        p9m p9mVar = smg1.a;
        mwq0 mwq0Var = lwq0Var.a;
        mwq0Var.d = p9mVar;
        bw91 bw91Var = mwq0Var.b;
        bw91Var.size();
        bw91Var.clear();
    }

    public static void c(lwq0 lwq0Var, qwq0 qwq0Var) {
        p9m p9mVar = smg1.a;
        mwq0 mwq0Var = lwq0Var.a;
        mwq0Var.d = p9mVar;
        kwq0 kwq0Var = new kwq0(UUID.randomUUID(), qwq0Var);
        bw91 bw91Var = mwq0Var.b;
        if (bw91Var.isEmpty()) {
            bw91Var.add(kwq0Var);
        } else {
            bw91Var.set(p7h.L(bw91Var), kwq0Var);
        }
    }

    public static void d(lwq0 lwq0Var, Object obj) {
        p9m p9mVar = smg1.a;
        mwq0 mwq0Var = lwq0Var.a;
        mwq0Var.d = p9mVar;
        mwq0Var.b.add(new kwq0(UUID.randomUUID(), obj));
    }
}
