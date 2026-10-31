package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i511 {
    public static final i511 a;
    public static final /* synthetic */ i511[] b;

    static {
        i511 i511Var = new i511("Clicked", 0);
        a = i511Var;
        b = new i511[]{i511Var};
    }

    public static i511 valueOf(String str) {
        return (i511) Enum.valueOf(i511.class, str);
    }

    public static i511[] values() {
        return (i511[]) b.clone();
    }
}
