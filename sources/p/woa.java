package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface woa {
    static uoa a(woa woaVar, String str, o2u0 o2u0Var, w2k1 w2k1Var, kma kmaVar, List list, boolean z, bas basVar, sn10 sn10Var, int i) {
        if ((i & 2) != 0) {
            o2u0Var = null;
        }
        if ((i & 4) != 0) {
            w2k1Var = new w2k1();
        }
        if ((i & 8) != 0) {
            kmaVar = null;
        }
        if ((i & 16) != 0) {
            list = z6x.a;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            basVar = null;
        }
        if ((i & 256) != 0) {
            sn10Var = new tn10(false);
        }
        return woaVar.b(str, o2u0Var, w2k1Var, kmaVar, list, z, basVar, null, sn10Var);
    }

    uoa b(String str, o2u0 o2u0Var, w2k1 w2k1Var, kma kmaVar, List list, boolean z, bas basVar, sr20 sr20Var, un10 un10Var);

    void c(uoa uoaVar);
}
