package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r2q0 {
    public static final r2q0 a;
    public static final r2q0 b;
    public static final r2q0 c;
    public static final r2q0 d;
    public static final /* synthetic */ r2q0[] e;

    static {
        r2q0 r2q0Var = new r2q0("UNKNOWN", 0);
        a = r2q0Var;
        r2q0 r2q0Var2 = new r2q0("NOT_ON_DEMAND", 1);
        b = r2q0Var2;
        r2q0 r2q0Var3 = new r2q0("ON_DEMAND", 2);
        c = r2q0Var3;
        r2q0 r2q0Var4 = new r2q0("ON_DEMAND_NON_MUSIC_ONLY", 3);
        d = r2q0Var4;
        e = new r2q0[]{r2q0Var, r2q0Var2, r2q0Var3, r2q0Var4};
    }

    public static r2q0 valueOf(String str) {
        return (r2q0) Enum.valueOf(r2q0.class, str);
    }

    public static r2q0[] values() {
        return (r2q0[]) e.clone();
    }
}
