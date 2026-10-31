package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s841 {
    public static final s841 a;
    public static final s841 b;
    public static final /* synthetic */ s841[] c;

    static {
        s841 s841Var = new s841("KeepEditingButtonClicked", 0);
        a = s841Var;
        s841 s841Var2 = new s841("SaveAndContinueButtonClicked", 1);
        b = s841Var2;
        c = new s841[]{s841Var, s841Var2};
    }

    public static s841 valueOf(String str) {
        return (s841) Enum.valueOf(s841.class, str);
    }

    public static s841[] values() {
        return (s841[]) c.clone();
    }
}
