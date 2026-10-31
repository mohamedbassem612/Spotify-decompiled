package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u1n1 {
    public static final u1n1 a;
    public static final /* synthetic */ u1n1[] b;

    static {
        u1n1 u1n1Var = new u1n1("RowClicked", 0);
        a = u1n1Var;
        b = new u1n1[]{u1n1Var};
    }

    public static u1n1 valueOf(String str) {
        return (u1n1) Enum.valueOf(u1n1.class, str);
    }

    public static u1n1[] values() {
        return (u1n1[]) b.clone();
    }
}
