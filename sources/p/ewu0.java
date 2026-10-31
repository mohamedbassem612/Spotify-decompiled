package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ewu0 {
    public static final ewu0 a;
    public static final ewu0 b;
    public static final ewu0 c;
    public static final /* synthetic */ ewu0[] d;

    static {
        ewu0 ewu0Var = new ewu0("AllTime", 0);
        a = ewu0Var;
        ewu0 ewu0Var2 = new ewu0("SevenDays", 1);
        b = ewu0Var2;
        ewu0 ewu0Var3 = new ewu0("ThirtyDays", 2);
        c = ewu0Var3;
        d = new ewu0[]{ewu0Var, ewu0Var2, ewu0Var3};
    }

    public static ewu0 valueOf(String str) {
        return (ewu0) Enum.valueOf(ewu0.class, str);
    }

    public static ewu0[] values() {
        return (ewu0[]) d.clone();
    }
}
