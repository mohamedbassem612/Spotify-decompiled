package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class kk20 {
    public static final AtomicReference a = new AtomicReference(null);
    public static final bpb1 b;
    public static final bpb1 c;

    static {
        bpb1 bpb1VarB = gio1.b((Object) null);
        b = bpb1VarB;
        c = bpb1VarB;
    }

    public static void a(String str, jk20 jk20Var) {
        d(1, str, jk20Var);
    }

    public static void b(String str, jk20 jk20Var) {
        d(3, str, jk20Var);
    }

    public static void c(String str, jk20 jk20Var) {
        d(2, str, jk20Var);
    }

    public static void d(int i, String str, jk20 jk20Var) {
        AtomicReference atomicReference;
        ik20 ik20Var = new ik20(i, str);
        do {
            atomicReference = a;
            String str2 = null;
            if (atomicReference.compareAndSet(null, ik20Var)) {
                bpb1 bpb1Var = b;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, ik20Var);
                String strE = bb00.e(i);
                String strV0 = ihc1.V0(str, '.', str);
                if (jk20Var != null) {
                    str2 = " " + jk20Var;
                }
                if (str2 == null) {
                    str2 = "";
                }
                Logger.b("Started for %s %s%s", new Object[]{strE, strV0, str2});
                return;
            }
        } while (atomicReference.get() == null);
    }
}
