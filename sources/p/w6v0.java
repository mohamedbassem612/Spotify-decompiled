package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w6v0 {
    public static final w6v0 a;
    public static final /* synthetic */ w6v0[] b;

    static {
        w6v0 w6v0Var = new w6v0("SwitchToggled", 0);
        a = w6v0Var;
        b = new w6v0[]{w6v0Var};
    }

    public static w6v0 valueOf(String str) {
        return (w6v0) Enum.valueOf(w6v0.class, str);
    }

    public static w6v0[] values() {
        return (w6v0[]) b.clone();
    }
}
