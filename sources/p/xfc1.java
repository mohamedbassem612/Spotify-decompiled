package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class xfc1 {
    public static final Set a = f46.S0(new h661[]{y4h1.b, d5h1.b, t3h1.b, r5h1.b});

    public static final boolean a(h661 h661Var) {
        return h661Var.isInline() && h661Var.equals(fga0.a);
    }

    public static final boolean b(h661 h661Var) {
        return h661Var.isInline() && a.contains(h661Var);
    }
}
