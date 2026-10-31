package p;

import com.google.protobuf.Timestamp;
import com.spotify.p4p.v1.AgenticListError;
import com.spotify.p4p.v1.c;
import com.spotify.p4p.v1.d;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sx2 extends hab0 implements vu30 {
    public static final sx2 a = new sx2(2);

    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) obj;
        uga0 uga0Var = (uga0) obj2;
        Map map = xx2.a;
        d dVarQ = AgenticListError.CappingExceededError.q();
        ega0 ega0VarB = xx2.b(uga0Var, "reset_timestamp");
        if (ega0VarB != null) {
            Instant instant = OffsetDateTime.parse(xx2.c(ega0VarB)).toInstant();
            sve1 sve1VarR = Timestamp.r();
            sve1VarR.q(instant.getEpochSecond());
            sve1VarR.n(instant.getNano());
            dVarQ.n((Timestamp) sve1VarR.build());
        }
        ega0 ega0VarB2 = xx2.b(uga0Var, "total_allowance");
        if (ega0VarB2 != null) {
            dVarQ.q(fga0.n(fga0.m(ega0VarB2)));
        }
        cVar.s((AgenticListError.CappingExceededError) dVarQ.build());
        return rih1.a;
    }
}
