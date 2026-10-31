package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mny {
    public static final mny a;
    public static final /* synthetic */ mny[] b;

    static {
        mny mnyVar = new mny("SingleLine", 0);
        a = mnyVar;
        b = new mny[]{mnyVar, new mny("TwoLines", 1), new mny("ThreeLines", 2), new mny("Multiline", 3)};
    }

    public static mny valueOf(String str) {
        return (mny) Enum.valueOf(mny.class, str);
    }

    public static mny[] values() {
        return (mny[]) b.clone();
    }
}
