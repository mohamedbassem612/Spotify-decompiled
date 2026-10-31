package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l360 {
    public static final l360 a;
    public static final l360 b;
    public static final /* synthetic */ l360[] c;

    static {
        l360 l360Var = new l360("CLOSE", 0);
        a = l360Var;
        l360 l360Var2 = new l360("BACK", 1);
        b = l360Var2;
        c = new l360[]{l360Var, l360Var2};
    }

    public static l360 valueOf(String str) {
        return (l360) Enum.valueOf(l360.class, str);
    }

    public static l360[] values() {
        return (l360[]) c.clone();
    }
}
