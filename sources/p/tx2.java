package p;

import com.spotify.p4p.v1.AgenticListError;
import com.spotify.p4p.v1.c;
import com.spotify.p4p.v1.h;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tx2 extends hab0 implements vu30 {
    public static final tx2 a = new tx2(2);

    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) obj;
        Map map = xx2.a;
        h hVarN = AgenticListError.PromptRejectedError.n();
        ega0 ega0VarB = xx2.b((uga0) obj2, "support_resources_required");
        if (ega0VarB != null) {
            aha0 aha0VarM = fga0.m(ega0VarB);
            if (aha0VarM.c()) {
                hhg1.n("Expected a JSON boolean");
                return null;
            }
            hVarN.n(fga0.e(aha0VarM));
        }
        cVar.x((AgenticListError.PromptRejectedError) hVarN.build());
        return rih1.a;
    }
}
