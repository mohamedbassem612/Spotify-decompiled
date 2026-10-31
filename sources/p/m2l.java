package p;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class m2l {
    public static final Map a = mp10.l();

    public static void a(Context context, lik1 lik1Var) {
        String string = context.getString(2131954959);
        Map map = a;
        p7s0 p7s0Var = (p7s0) map.get("gaia.content_not_supported");
        if (p7s0Var == null || !p7s0Var.isShowing()) {
            q7s0 q7s0Var = new q7s0(context, 2132018150);
            ((zog) q7s0Var).d = context.getResources().getText(2131954961);
            ((zog) q7s0Var).e = string;
            k6b k6bVar = new k6b((byte) 15);
            ((zog) q7s0Var).f = context.getResources().getText(2131954960);
            ((zog) q7s0Var).g = k6bVar;
            ((zog) q7s0Var).h = new vqt0((byte) 1);
            ((zog) q7s0Var).i = new l2l();
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0 p6r0VarS1 = yon1.s1();
            qir0 qir0VarA = lik1Var.a();
            q7s0Var.j = (vkg) context;
            q7s0Var.k = p6r0VarS1;
            q7s0Var.l = qir0VarA;
            r7s0 r7s0VarG = q7s0Var.g();
            r7s0VarG.show();
            map.put("gaia.content_not_supported", r7s0VarG);
        }
    }
}
