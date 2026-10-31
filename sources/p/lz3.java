package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class lz3 {
    public static final kz3 Companion;
    public static final znb0 a;
    public static final lz3 b;
    public static final /* synthetic */ lz3[] c;

    static {
        lz3 lz3Var = new lz3("AIRPODS", 0);
        b = lz3Var;
        c = new lz3[]{lz3Var, new lz3("OTHER", 1)};
        Companion = new kz3();
        a = dm5.S(2, ou1.V0);
    }

    public static lz3 valueOf(String str) {
        return (lz3) Enum.valueOf(lz3.class, str);
    }

    public static lz3[] values() {
        return (lz3[]) c.clone();
    }
}
