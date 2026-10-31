package p;

import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class czn0 {
    public static zig1 a(xxn0 xxn0Var, List list, iu30 iu30Var) {
        xg30 xg30VarA;
        xg30 xg30VarA2;
        xun0 xun0VarB = xxn0Var.b();
        e6w0 e6w0Var = null;
        e6w0 e6w0Var2 = (xun0VarB == null || (xg30VarA2 = xun0VarB.a()) == null) ? null : xg30VarA2.d;
        if (list.size() > 1) {
            e6w0Var = (e6w0) iu30Var.invoke(o7h.A0(list));
        } else if (xxn0Var.d() != null) {
            e6w0Var = xxn0Var.d().a().d;
        } else {
            q0a q0aVar = (q0a) ((ArrayDeque) xxn0Var.a()).peek();
            if (q0aVar != null && (xg30VarA = q0aVar.a()) != null) {
                e6w0Var = xg30VarA.d;
            }
        }
        return new zig1(b(e6w0Var, e6w0Var2), e6w0Var2, e6w0Var);
    }

    public static int b(e6w0 e6w0Var, e6w0 e6w0Var2) {
        boolean z = e6w0Var2 instanceof a6w0;
        if (z && (e6w0Var instanceof a6w0)) {
            return 1;
        }
        if (z && (e6w0Var instanceof d6w0)) {
            return 2;
        }
        boolean z2 = e6w0Var2 instanceof d6w0;
        if (z2 && (e6w0Var instanceof d6w0)) {
            return 3;
        }
        if (z2 && (e6w0Var instanceof a6w0)) {
            return 4;
        }
        return (z2 && e6w0Var == null) ? 4 : 1;
    }
}
