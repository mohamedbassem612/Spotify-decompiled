package p;

import com.spotify.playlist.proto.ModificationRequest;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface op31 {
    static Object a(op31 op31Var, List list, onm onmVar) {
        pp31 pp31Var = (pp31) op31Var;
        pp31Var.getClass();
        com.spotify.playlist.proto.b bVarR = ModificationRequest.r();
        bVarR.B("move");
        bVarR.n(list);
        bVarR.w("start");
        ModificationRequest modificationRequest = (ModificationRequest) bVarR.build();
        modificationRequest.getClass();
        return pp31Var.f(modificationRequest, "rootlist", onmVar);
    }

    static Object b(op31 op31Var, String str, List list, String str2, String str3, np31 np31Var, onm onmVar) {
        pp31 pp31Var = (pp31) op31Var;
        return c921.H(pp31Var.b, new zn0(str, list, np31Var, pp31Var, (String) null, str2, str3, (lnm) null), onmVar);
    }
}
