package p;

import com.spotify.p4p.v1.AgenticListError;
import com.spotify.p4p.v1.a;
import com.spotify.p4p.v1.b;
import com.spotify.p4p.v1.c;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vx2 extends hab0 implements vu30 {
    public static final vx2 a = new vx2(2);

    public final Object invoke(Object obj, Object obj2) {
        int i;
        b bVar;
        c cVar = (c) obj;
        Map map = xx2.a;
        a aVarN = AgenticListError.AbortedError.n();
        ega0 ega0VarB = xx2.b((uga0) obj2, "reason");
        if (ega0VarB != null) {
            aha0 aha0VarM = fga0.m(ega0VarB);
            if (aha0VarM.c()) {
                b[] bVarArrValues = b.values();
                int length = bVarArrValues.length;
                i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        bVar = bVarArrValues[i2];
                        if (bVar != b.UNRECOGNIZED && u890.j(bVar.name(), aha0VarM.b())) {
                            break;
                        }
                        i2++;
                    } else {
                        bVar = null;
                        break;
                    }
                }
                if (bVar != null) {
                    i = bVar.getNumber();
                }
            } else {
                i = fga0.i(aha0VarM);
            }
            aVarN.n(i);
        }
        cVar.r((AgenticListError.AbortedError) aVarN.build());
        return rih1.a;
    }
}
