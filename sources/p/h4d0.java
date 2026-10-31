package p;

import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h4d0 {
    public static final Set a;
    public static final h4d0 b;
    public static final h4d0 c;
    public static final h4d0 d;
    public static final h4d0 e;
    public static final h4d0 f;
    public static final h4d0 g;
    public static final h4d0 h;
    public static final /* synthetic */ h4d0[] i;

    static {
        h4d0 h4d0Var = new h4d0("MESSAGE_STATUS_UNKNOWN", 0);
        b = h4d0Var;
        h4d0 h4d0Var2 = new h4d0("MESSAGE_STATUS_SUCCESS", 1);
        c = h4d0Var2;
        h4d0 h4d0Var3 = new h4d0("MESSAGE_STATUS_QUEUED", 2);
        d = h4d0Var3;
        h4d0 h4d0Var4 = new h4d0("MESSAGE_STATUS_PROCESSING", 3);
        e = h4d0Var4;
        h4d0 h4d0Var5 = new h4d0("MESSAGE_STATUS_ERROR", 4);
        f = h4d0Var5;
        h4d0 h4d0Var6 = new h4d0("UNGENERATED", 5);
        g = h4d0Var6;
        h4d0 h4d0Var7 = new h4d0("NO_CONTENT", 6);
        h = h4d0Var7;
        i = new h4d0[]{h4d0Var, h4d0Var2, h4d0Var3, h4d0Var4, h4d0Var5, h4d0Var6, h4d0Var7};
        a = f46.S0(new h4d0[]{h4d0Var3, h4d0Var4});
    }

    public static h4d0 valueOf(String str) {
        return (h4d0) Enum.valueOf(h4d0.class, str);
    }

    public static h4d0[] values() {
        return (h4d0[]) i.clone();
    }

    public final boolean a() {
        return this == g;
    }

    public final boolean b() {
        return this == c;
    }
}
