package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tdh0 {
    public static final tdh0 a;
    public static final tdh0 b;
    public static final tdh0 c;
    public static final /* synthetic */ tdh0[] d;

    static {
        tdh0 tdh0Var = new tdh0("Loading", 0);
        a = tdh0Var;
        tdh0 tdh0Var2 = new tdh0("Loaded", 1);
        b = tdh0Var2;
        tdh0 tdh0Var3 = new tdh0("Failed", 2);
        c = tdh0Var3;
        d = new tdh0[]{tdh0Var, tdh0Var2, tdh0Var3};
    }

    public static tdh0 valueOf(String str) {
        return (tdh0) Enum.valueOf(tdh0.class, str);
    }

    public static tdh0[] values() {
        return (tdh0[]) d.clone();
    }
}
