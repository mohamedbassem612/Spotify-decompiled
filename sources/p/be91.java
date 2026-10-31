package p;

import com.spotify.ads.esperanto.proto.SubSlotRequest;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class be91 {
    public final pf91 a;
    public final z32 b;
    public final by0 c;
    public final xn0 d;
    public final q8n e;

    public be91(pf91 pf91Var, z32 z32Var, by0 by0Var, xn0 xn0Var, q8n q8nVar) {
        this.a = pf91Var;
        this.b = z32Var;
        this.c = by0Var;
        this.d = xn0Var;
        this.e = q8nVar;
    }

    public static Object a(be91 be91Var, jx0 jx0Var, qc91 qc91Var, Map map, onm onmVar, int i) {
        if ((i & 4) != 0) {
            map = b7x.a;
        }
        return c921.H(be91Var.e, new hgo0((byte) 21, qc91Var, jx0Var, be91Var, map, (i & 8) != 0 ? "" : "sponsored_context_switch", (lnm) null), onmVar);
    }

    public final wzv0 b(jx0 jx0Var) {
        clc1 clc1VarN = SubSlotRequest.n();
        clc1VarN.n(jx0Var.a);
        SubSlotRequest subSlotRequest = (SubSlotRequest) clc1VarN.build();
        subSlotRequest.getClass();
        return new wzv0(new tu41(this.a.callStream("spotify.ads.esperanto.proto.Slots", "SubSlot", subSlotRequest), (byte) 27), (byte) 28);
    }
}
