package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cp80 {
    public static final cp80 a;
    public static final cp80 b;
    public static final cp80 c;
    public static final cp80 d;
    public static final cp80 e;
    public static final cp80 f;
    public static final /* synthetic */ cp80[] g;

    static {
        cp80 cp80Var = new cp80("Unknown", 0);
        a = cp80Var;
        cp80 cp80Var2 = new cp80("Analysis", 1);
        b = cp80Var2;
        cp80 cp80Var3 = new cp80("AnrReport", 2);
        c = cp80Var3;
        cp80 cp80Var4 = new cp80("CrashReport", 3);
        d = cp80Var4;
        cp80 cp80Var5 = new cp80("CrashShield", 4);
        e = cp80Var5;
        cp80 cp80Var6 = new cp80("ThreadCheck", 5);
        f = cp80Var6;
        g = new cp80[]{cp80Var, cp80Var2, cp80Var3, cp80Var4, cp80Var5, cp80Var6};
    }

    public static cp80 valueOf(String str) {
        return (cp80) Enum.valueOf(cp80.class, str);
    }

    public static cp80[] values() {
        return (cp80[]) g.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return "Analysis";
        }
        if (iOrdinal == 2) {
            return "AnrReport";
        }
        if (iOrdinal == 3) {
            return "CrashReport";
        }
        if (iOrdinal != 4) {
            return iOrdinal != 5 ? "Unknown" : "ThreadCheck";
        }
        return "CrashShield";
    }
}
