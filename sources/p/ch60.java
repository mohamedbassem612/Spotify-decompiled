package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ch60 {
    public static final ch60 a;
    public static final /* synthetic */ ch60[] b;

    static {
        ch60 ch60Var = new ch60("ButtonClicked", 0);
        a = ch60Var;
        b = new ch60[]{ch60Var};
    }

    public static ch60 valueOf(String str) {
        return (ch60) Enum.valueOf(ch60.class, str);
    }

    public static ch60[] values() {
        return (ch60[]) b.clone();
    }
}
