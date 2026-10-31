package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rxx0 {
    public static final rxx0 a;
    public static final rxx0 b;
    public static final rxx0 c;
    public static final /* synthetic */ rxx0[] d;

    static {
        rxx0 rxx0Var = new rxx0("PROMPTED_PLAYLIST", 0);
        a = rxx0Var;
        rxx0 rxx0Var2 = new rxx0("BLUEJAY", 1);
        b = rxx0Var2;
        rxx0 rxx0Var3 = new rxx0("PERSONALIZED_SET", 2);
        c = rxx0Var3;
        d = new rxx0[]{rxx0Var, rxx0Var2, rxx0Var3};
    }

    public static rxx0 valueOf(String str) {
        return (rxx0) Enum.valueOf(rxx0.class, str);
    }

    public static rxx0[] values() {
        return (rxx0[]) d.clone();
    }
}
