package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rxi0 {
    public static final rxi0 a;
    public static final rxi0 b;
    public static final /* synthetic */ rxi0[] c;

    static {
        rxi0 rxi0Var = new rxi0("DismissButtonClicked", 0);
        a = rxi0Var;
        rxi0 rxi0Var2 = new rxi0("ActionButtonClicked", 1);
        b = rxi0Var2;
        c = new rxi0[]{rxi0Var, rxi0Var2};
    }

    public static rxi0 valueOf(String str) {
        return (rxi0) Enum.valueOf(rxi0.class, str);
    }

    public static rxi0[] values() {
        return (rxi0[]) c.clone();
    }
}
