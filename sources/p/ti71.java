package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ti71 {
    public static final ti71 a;
    public static final ti71 b;
    public static final ti71 c;
    public static final ti71 d;
    public static final /* synthetic */ ti71[] e;

    static {
        ti71 ti71Var = new ti71("VERIFIED", 0);
        a = ti71Var;
        ti71 ti71Var2 = new ti71("UNDERAGE", 1);
        b = ti71Var2;
        ti71 ti71Var3 = new ti71("AGE_ASSURANCE_REQUIRED", 2);
        c = ti71Var3;
        ti71 ti71Var4 = new ti71("UNKNOWN", 3);
        d = ti71Var4;
        e = new ti71[]{ti71Var, ti71Var2, ti71Var3, ti71Var4};
    }

    public static ti71 valueOf(String str) {
        return (ti71) Enum.valueOf(ti71.class, str);
    }

    public static ti71[] values() {
        return (ti71[]) e.clone();
    }
}
