package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e640 {
    public static final e640 a;
    public static final e640 b;
    public static final /* synthetic */ e640[] c;

    static {
        e640 e640Var = new e640("OkButtonClicked", 0);
        a = e640Var;
        e640 e640Var2 = new e640("DismissButtonClicked", 1);
        b = e640Var2;
        c = new e640[]{e640Var, e640Var2};
    }

    public static e640 valueOf(String str) {
        return (e640) Enum.valueOf(e640.class, str);
    }

    public static e640[] values() {
        return (e640[]) c.clone();
    }
}
