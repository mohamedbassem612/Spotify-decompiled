package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lk90 {
    public static final lk90 a;
    public static final lk90 b;
    public static final /* synthetic */ lk90[] c;

    static {
        lk90 lk90Var = new lk90("Continue", 0);
        a = lk90Var;
        lk90 lk90Var2 = new lk90("Break", 1);
        b = lk90Var2;
        c = new lk90[]{lk90Var, lk90Var2};
    }

    public static lk90 valueOf(String str) {
        return (lk90) Enum.valueOf(lk90.class, str);
    }

    public static lk90[] values() {
        return (lk90[]) c.clone();
    }
}
