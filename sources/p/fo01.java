package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fo01 {
    public static final fo01 a;
    public static final fo01 b;
    public static final /* synthetic */ fo01[] c;

    static {
        fo01 fo01Var = new fo01("None", 0);
        a = fo01Var;
        fo01 fo01Var2 = new fo01("Prompted", 1);
        b = fo01Var2;
        c = new fo01[]{fo01Var, fo01Var2};
    }

    public static fo01 valueOf(String str) {
        return (fo01) Enum.valueOf(fo01.class, str);
    }

    public static fo01[] values() {
        return (fo01[]) c.clone();
    }
}
