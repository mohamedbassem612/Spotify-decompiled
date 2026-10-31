package p;

import com.spotify.playlist.proto.ModificationRequest;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pp31 implements op31 {
    public final dmr a;
    public final q8n b;
    public final jn7 c;

    public pp31(dmr dmrVar, q8n q8nVar, jn7 jn7Var) {
        this.a = dmrVar;
        this.b = q8nVar;
        this.c = jn7Var;
    }

    public final Object c(String str, lnm lnmVar) {
        com.spotify.playlist.proto.b bVarR = ModificationRequest.r();
        bVarR.B("add");
        bVarR.w("start");
        bVarR.s(str);
        ModificationRequest modificationRequest = (ModificationRequest) bVarR.build();
        modificationRequest.getClass();
        return f(modificationRequest, str, lnmVar);
    }

    public final Object d(List list, boolean z, onm onmVar) {
        com.spotify.playlist.proto.b bVarR = ModificationRequest.r();
        bVarR.B("set");
        bVarR.n(list);
        com.spotify.playlist.proto.a aVarN = ModificationRequest.Attributes.n();
        aVarN.t(z);
        bVarR.u(aVarN);
        ModificationRequest modificationRequest = (ModificationRequest) bVarR.build();
        modificationRequest.getClass();
        String str = (String) o7h.s0(list);
        if (str == null) {
            str = "";
        }
        return f(modificationRequest, str, onmVar);
    }

    public final Object e(String str, List list, onm onmVar) {
        com.spotify.playlist.proto.b bVarR = ModificationRequest.r();
        bVarR.B("move");
        bVarR.n(list);
        if (str == null) {
            str = "end";
        }
        bVarR.t(str);
        ModificationRequest modificationRequest = (ModificationRequest) bVarR.build();
        modificationRequest.getClass();
        return f(modificationRequest, "rootlist", onmVar);
    }

    public final Object f(ModificationRequest modificationRequest, String str, lnm lnmVar) {
        return c921.H(this.b, new m311(this, modificationRequest, str, (lnm) null, (byte) 26), lnmVar);
    }

    public final Object g(String str, onm onmVar) {
        com.spotify.playlist.proto.b bVarR = ModificationRequest.r();
        bVarR.B("remove");
        bVarR.n(k4p1.x(str));
        bVarR.x(false);
        ModificationRequest modificationRequest = (ModificationRequest) bVarR.build();
        modificationRequest.getClass();
        return f(modificationRequest, str, onmVar);
    }
}
