package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kza0 {
    public static final kza0 a;
    public static final kza0 b;
    public static final kza0 c;
    public static final kza0 d;
    public static final kza0 e;
    public static final kza0 f;
    public static final kza0 g;
    public static final kza0 h;
    public static final /* synthetic */ kza0[] i;

    static {
        kza0 kza0Var = new kza0("UNKNOWN", 0);
        a = kza0Var;
        kza0 kza0Var2 = new kza0("CREATED", 1);
        b = kza0Var2;
        kza0 kza0Var3 = new kza0("ALREADY_PENDING", 2);
        c = kza0Var3;
        kza0 kza0Var4 = new kza0("BLOCKED", 3);
        d = kza0Var4;
        kza0 kza0Var5 = new kza0("DAILY_LIMIT_REACHED", 4);
        e = kza0Var5;
        kza0 kza0Var6 = new kza0("ALREADY_ALLOWED", 5);
        f = kza0Var6;
        kza0 kza0Var7 = new kza0("DISABLED", 6);
        g = kza0Var7;
        kza0 kza0Var8 = new kza0("COOLDOWN", 7);
        h = kza0Var8;
        i = new kza0[]{kza0Var, kza0Var2, kza0Var3, kza0Var4, kza0Var5, kza0Var6, kza0Var7, kza0Var8};
    }

    public static kza0 valueOf(String str) {
        return (kza0) Enum.valueOf(kza0.class, str);
    }

    public static kza0[] values() {
        return (kza0[]) i.clone();
    }
}
