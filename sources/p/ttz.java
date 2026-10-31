package p;

import com.google.protobuf.Empty;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ttz {
    public final xe01 a;

    public ttz(jn7 jn7Var, q8n q8nVar) {
        llm llmVarE = smo1.e(ilo1.B(q8nVar, new z8n("EsperantoConnectionQualityMonitor")).y(guo1.B()));
        pzs pzsVar = new pzs(jn7Var.H0(Empty.n()), this, (byte) 29);
        cal calVar = cal.a;
        this.a = d5p1.t(pzsVar, llmVarE, ey71.a, new ial(calVar, calVar));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static cal a(zlz zlzVar) throws NoWhenBranchMatchedException {
        int iOrdinal = zlzVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return cal.b;
            }
            if (iOrdinal == 2) {
                return cal.c;
            }
            if (iOrdinal == 3) {
                return cal.d;
            }
            if (iOrdinal != 4) {
                eg.o();
                return null;
            }
        }
        return cal.a;
    }
}
