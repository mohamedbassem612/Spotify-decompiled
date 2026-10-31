package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mf51 {
    public static final mf51 a;
    public static final mf51 b;
    public static final /* synthetic */ mf51[] c;

    static {
        mf51 mf51Var = new mf51("Normal", 0);
        a = mf51Var;
        mf51 mf51Var2 = new mf51("ChipBar", 1);
        b = mf51Var2;
        c = new mf51[]{mf51Var, mf51Var2};
    }

    public static mf51 valueOf(String str) {
        return (mf51) Enum.valueOf(mf51.class, str);
    }

    public static mf51[] values() {
        return (mf51[]) c.clone();
    }
}
