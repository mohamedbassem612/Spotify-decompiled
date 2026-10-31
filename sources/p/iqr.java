package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iqr {
    public static final Set d = dm61.z0(blc0.ALBUM, blc0.COLLECTION_ALBUM);
    public static final Set e = dm61.z0(nyu0.e, wyu0.f);
    public static final Set f = dm61.z0(blc0.TRACK, blc0.SHOW_EPISODE, blc0.KALLAX);
    public final tuz a;
    public final l7m0 b;
    public final waz0 c;

    public iqr(tuz tuzVar, l7m0 l7m0Var, waz0 waz0Var) {
        this.a = tuzVar;
        this.b = l7m0Var;
        this.c = waz0Var;
    }

    public final Single a(int i, String str, String str2, List list) {
        if (list.isEmpty()) {
            Single singleJust = Single.just(az1.a);
            singleJust.getClass();
            return singleJust;
        }
        Single singleFlatMap = this.c.c().firstOrError().flatMap(new o0g1(i, o7h.d1(list, 1000), this, str, str2, (byte) 4));
        singleFlatMap.getClass();
        return singleFlatMap;
    }

    public final Single b(String str, String str2, int i, String str3) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        blc0 blc0Var = s4b1VarX.c;
        String strZ = s4b1VarX.z();
        if (strZ != null) {
            str = strZ;
        }
        if (!d.contains(blc0Var)) {
            Set set2 = e;
            v5b1 v5b1Var = s4b1VarX.d;
            if (!o7h.i0(set2, v5b1Var != null ? v5b1Var.getType() : null)) {
                return f.contains(blc0Var) ? a(i, str2, str3, k4p1.x(ContextTrack.create(str))) : Single.just(zy1.e);
            }
        }
        return rqt0.G(new n5s(str, this.b, (lnm) null, (byte) 1)).flatMap(new b8p1(this, str2, str3, i, (byte) 5));
    }
}
