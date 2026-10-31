package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ng60 {
    public static final ng60 a;
    public static final ng60 b;
    public static final ng60 c;
    public static final /* synthetic */ ng60[] d;

    static {
        ng60 ng60Var = new ng60("CardClicked", 0);
        a = ng60Var;
        ng60 ng60Var2 = new ng60("ButtonClicked", 1);
        b = ng60Var2;
        ng60 ng60Var3 = new ng60("DismissButtonClicked", 2);
        c = ng60Var3;
        d = new ng60[]{ng60Var, ng60Var2, ng60Var3};
    }

    public static ng60 valueOf(String str) {
        return (ng60) Enum.valueOf(ng60.class, str);
    }

    public static ng60[] values() {
        return (ng60[]) d.clone();
    }
}
