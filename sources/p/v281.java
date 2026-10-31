package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v281 {
    public static final v281 a;
    public static final v281 b;
    public static final v281 c;
    public static final v281 d;
    public static final v281 e;
    public static final /* synthetic */ v281[] f;

    static {
        v281 v281Var = new v281("UNKNOWN", 0);
        a = v281Var;
        v281 v281Var2 = new v281("ANCHOR_PAYWALL", 1);
        b = v281Var2;
        v281 v281Var3 = new v281("OAP_OTP", 2);
        c = v281Var3;
        v281 v281Var4 = new v281("OAP_LINKING", 3);
        d = v281Var4;
        v281 v281Var5 = new v281("AUDIOBOOK_DIRECT_SALES", 4);
        v281 v281Var6 = new v281("ABP", 5);
        v281 v281Var7 = new v281("AUDIOBOOK_PROMOTION", 6);
        v281 v281Var8 = new v281("RESERVED_LEARNING", 7);
        v281 v281Var9 = new v281("PREMIUM_KPOP_EARLY_ACCESS", 8);
        v281 v281Var10 = new v281("OPAL", 9);
        e = v281Var10;
        f = new v281[]{v281Var, v281Var2, v281Var3, v281Var4, v281Var5, v281Var6, v281Var7, v281Var8, v281Var9, v281Var10};
    }

    public static v281 valueOf(String str) {
        return (v281) Enum.valueOf(v281.class, str);
    }

    public static v281[] values() {
        return (v281[]) f.clone();
    }
}
