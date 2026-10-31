package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class ja11 {
    public static final o3r a = w3p1.n(new l4r(pwc0.b, 3, a411.X0, new j4r(a411.V0), a411.Y0), new l4r(new xv00(rc11.a.b(hll.class)), 3, a411.Z0, new j4r(a411.W0), a411.a1), h211.f);

    public static final blc0 a(String str) {
        blc0 m231Var;
        try {
            Set set = s4b1.f;
            m231Var = uic.x(str).c;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        return m231Var;
    }
}
