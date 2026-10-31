package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j120 {
    public static final j120 a;
    public static final /* synthetic */ j120[] b;

    /* JADX INFO: Fake field, exist only in values array */
    j120 EF0;

    static {
        j120 j120Var = new j120("LEGACY", 0);
        j120 j120Var2 = new j120("NO_DATA", 1);
        a = j120Var2;
        b = new j120[]{j120Var, j120Var2};
    }

    public static j120 valueOf(String str) {
        return (j120) Enum.valueOf(j120.class, str);
    }

    public static j120[] values() {
        return (j120[]) b.clone();
    }
}
