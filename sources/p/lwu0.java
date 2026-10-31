package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lwu0 {
    public static final lwu0 a;
    public static final lwu0 b;
    public static final lwu0 c;
    public static final /* synthetic */ lwu0[] d;

    static {
        lwu0 lwu0Var = new lwu0("Saves", 0);
        a = lwu0Var;
        lwu0 lwu0Var2 = new lwu0("Listeners", 1);
        b = lwu0Var2;
        lwu0 lwu0Var3 = new lwu0("HoursListened", 2);
        c = lwu0Var3;
        d = new lwu0[]{lwu0Var, lwu0Var2, lwu0Var3};
    }

    public static lwu0 valueOf(String str) {
        return (lwu0) Enum.valueOf(lwu0.class, str);
    }

    public static lwu0[] values() {
        return (lwu0[]) d.clone();
    }
}
