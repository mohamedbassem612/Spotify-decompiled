package p;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v881 implements nma0 {
    public static final v881 a = new v881();
    public static final nlc0 b;
    public static final h661 c;

    static {
        nlc0 nlc0Var = new nlc0(chc1.a, gpb.a);
        b = nlc0Var;
        c = nlc0Var.c;
    }

    public final Object deserialize(dar darVar) {
        return new u3h(new HashMap((Map) b.deserialize(darVar)));
    }

    public final h661 getDescriptor() {
        return c;
    }

    public final void serialize(uax uaxVar, Object obj) {
        b.serialize(uaxVar, ((u3h) obj).a);
    }
}
