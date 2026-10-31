package p;

import java.io.IOException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class sw {
    public final nfa0 a;

    public sw(nfa0 nfa0Var) {
        this.a = nfa0Var;
    }

    public final lw a(String str) throws IOException {
        try {
            return tv.a((rw) this.a.a(str, rw.Companion.serializer()));
        } catch (SerializationException e) {
            throw new IOException("Failed to deserialize AccountSwitchingUserInfo", e);
        }
    }

    public final String b(lw lwVar) throws IOException {
        try {
            rw rwVarB = tv.b(lwVar);
            if (rwVarB != null) {
                return this.a.b(rw.Companion.serializer(), rwVarB);
            }
            return null;
        } catch (SerializationException e) {
            throw new IOException("Failed to serialize AccountSwitchingUserInfo", e);
        }
    }
}
