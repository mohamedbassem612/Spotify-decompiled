package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kas0 {
    public static final kas0 a;
    public static final kas0 b;
    public static final /* synthetic */ kas0[] c;

    static {
        kas0 kas0Var = new kas0("PAUSED", 0);
        a = kas0Var;
        kas0 kas0Var2 = new kas0("RESUMED", 1);
        b = kas0Var2;
        c = new kas0[]{kas0Var, kas0Var2};
    }

    public static kas0 valueOf(String str) {
        return (kas0) Enum.valueOf(kas0.class, str);
    }

    public static kas0[] values() {
        return (kas0[]) c.clone();
    }
}
