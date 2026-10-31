package p;

import com.spotify.player.model.command.options.LoggingParams;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dve0 implements nma0 {
    public static final dve0 a = new dve0();
    public static final j661 b;

    static {
        h661[] h661VarArr = new h661[0];
        if (ihc1.y0("com.spotify.player.model.command.options.LoggingParams")) {
            hhg1.n("Blank serial names are prohibited");
            return;
        }
        neg negVar = new neg("com.spotify.player.model.command.options.LoggingParams");
        neg.b(negVar, "command_initiated_time", oma.b, 4);
        b = new j661("com.spotify.player.model.command.options.LoggingParams", uic1.h, negVar.c.size(), f46.Q0(h661VarArr), negVar);
    }

    public final Object deserialize(dar darVar) {
        LoggingParams.Builder builder = LoggingParams.builder();
        j661 j661Var = b;
        x1k x1kVarB = darVar.b(j661Var);
        while (true) {
            int iP = x1kVarB.p(j661Var);
            if (iP == -1) {
                x1kVarB.a(j661Var);
                return builder.build();
            }
            if (iP != 0) {
                uh61.j(f4i1.c(iP, "Unexpected LoggingParams field index "));
                return null;
            }
            builder.commandInitiatedTime((Long) x1kVarB.A(j661Var, iP, oma.a, (Object) null));
        }
    }

    public final h661 getDescriptor() {
        return b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final void serialize(uax uaxVar, Object obj) throws SerializationException {
        throw new SerializationException("Serializing LoggingParams is not supported");
    }
}
