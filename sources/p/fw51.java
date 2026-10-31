package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fw51 {
    public static final fw51 a;
    public static final /* synthetic */ fw51[] b;

    static {
        fw51 fw51Var = new fw51("EditableText", 0);
        a = fw51Var;
        b = new fw51[]{fw51Var, new fw51("StaticText", 1)};
    }

    public static fw51 valueOf(String str) {
        return (fw51) Enum.valueOf(fw51.class, str);
    }

    public static fw51[] values() {
        return (fw51[]) b.clone();
    }
}
