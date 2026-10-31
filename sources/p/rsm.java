package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rsm {
    public final lzn0 a;

    public static String b(String str) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        Set setS0 = f46.S0(new b3i1[]{nyu0.e, wyu0.f});
        v5b1 v5b1Var = s4b1VarX.d;
        n57.k(o7h.i0(setS0, v5b1Var != null ? v5b1Var.getType() : null), "Expected playlist URI but got: %s", new Object[]{str});
        return f4i1.f("spotify:internal:playlist-curator-stats:", s4b1VarX.h(), "");
    }

    public jhm a(String str) {
        return new jhm("mute_chat", kpx.c, (fhm) null, 2131958550, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(sbn0.t, sbn0.X), new j9n0(this, str, (byte) 3)), 244);
    }
}
