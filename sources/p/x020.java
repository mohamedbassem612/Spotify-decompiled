package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x020 {
    public static final x020 a;
    public static final x020 b;
    public static final x020 c;
    public static final x020 d;
    public static final x020 e;
    public static final /* synthetic */ x020[] f;

    /* JADX INFO: Fake field, exist only in values array */
    x020 EF0;

    static {
        x020 x020Var = new x020("UNKNOWN", 0);
        x020 x020Var2 = new x020("BACKGROUND_SYNC", 1);
        a = x020Var2;
        x020 x020Var3 = new x020("BLOCKING", 2);
        b = x020Var3;
        x020 x020Var4 = new x020("ASYNC", 3);
        c = x020Var4;
        x020 x020Var5 = new x020("PUSH_INITIATED", 4);
        d = x020Var5;
        x020 x020Var6 = new x020("RECONNECT", 5);
        e = x020Var6;
        f = new x020[]{x020Var, x020Var2, x020Var3, x020Var4, x020Var5, x020Var6, new x020("UNRECOGNIZED", 6)};
    }

    public static x020 valueOf(String str) {
        return (x020) Enum.valueOf(x020.class, str);
    }

    public static x020[] values() {
        return (x020[]) f.clone();
    }
}
