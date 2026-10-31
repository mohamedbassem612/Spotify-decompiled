package p;

import com.spotify.common.uri.SpotifyUriParserException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dmm implements nma0 {
    public static final dmm a = new dmm();
    public static final chc1 b = chc1.a;
    public static final nma0 c;
    public static final mlc0 d;

    static {
        nma0 nma0VarSerializer = ega0.Companion.serializer();
        c = nma0VarSerializer;
        d = new mlc0("kotlin.collections.LinkedHashMap", chc1.b, nma0VarSerializer.getDescriptor());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    public final Object deserialize(dar darVar) {
        String strB;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        mlc0 mlc0Var = d;
        x1k x1kVarB = darVar.b(mlc0Var);
        for (int iP = x1kVarB.p(mlc0Var); iP != -1; iP = x1kVarB.p(mlc0Var)) {
            cmm cmmVar = null;
            String str = (String) x1kVarB.A(mlc0Var, iP, b, (Object) null);
            ega0 ega0Var = (ega0) x1kVarB.A(mlc0Var, x1kVarB.p(mlc0Var), c, (Object) null);
            aha0 aha0Var = ega0Var instanceof aha0 ? (aha0) ega0Var : null;
            if (aha0Var == null) {
                strB = null;
            } else {
                if (!aha0Var.c()) {
                    aha0Var = null;
                }
                if (aha0Var != null) {
                    strB = aha0Var.b();
                } else {
                    strB = null;
                }
            }
            try {
                cmmVar = new cmm(str);
            } catch (SpotifyUriParserException unused) {
            }
            if (cmmVar != null && strB != null) {
                linkedHashMap.put(cmmVar, strB);
            }
        }
        x1kVarB.a(mlc0Var);
        return linkedHashMap;
    }

    public final h661 getDescriptor() {
        return d;
    }

    public final void serialize(uax uaxVar, Object obj) {
        Map map = (Map) obj;
        int size = map.size();
        mlc0 mlc0Var = d;
        z1k z1kVarG0 = uaxVar.g0(mlc0Var, size);
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            cmm cmmVar = (cmm) entry.getKey();
            String str = (String) entry.getValue();
            int i2 = i + 1;
            z1kVarG0.k(mlc0Var, i, b, cmmVar.toString());
            i += 2;
            z1kVarG0.k(mlc0Var, i2, c, fga0.c(str));
        }
        z1kVarG0.a(mlc0Var);
    }
}
