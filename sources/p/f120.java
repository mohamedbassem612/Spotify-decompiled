package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f120 {
    public static final f120 a;
    public static final f120 b;
    public static final f120 c;
    public static final f120 d;
    public static final /* synthetic */ f120[] e;

    static {
        f120 f120Var = new f120("NOT_LOADED", 0);
        a = f120Var;
        f120 f120Var2 = new f120("LOADING", 1);
        b = f120Var2;
        f120 f120Var3 = new f120("SUCCESS", 2);
        c = f120Var3;
        f120 f120Var4 = new f120("ERROR", 3);
        d = f120Var4;
        e = new f120[]{f120Var, f120Var2, f120Var3, f120Var4};
    }

    public static f120 valueOf(String str) {
        return (f120) Enum.valueOf(f120.class, str);
    }

    public static f120[] values() {
        return (f120[]) e.clone();
    }
}
