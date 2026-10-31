package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i9f0 {
    public static final i9f0 a;
    public static final i9f0 b;
    public static final i9f0 c;
    public static final i9f0 d;
    public static final i9f0 e;
    public static final /* synthetic */ i9f0[] f;

    static {
        i9f0 i9f0Var = new i9f0("WifiOrCellular", 0);
        a = i9f0Var;
        i9f0 i9f0Var2 = new i9f0("Connect", 1);
        b = i9f0Var2;
        i9f0 i9f0Var3 = new i9f0("Download", 2);
        c = i9f0Var3;
        i9f0 i9f0Var4 = new i9f0("Cache", 3);
        d = i9f0Var4;
        i9f0 i9f0Var5 = new i9f0("LocalFile", 4);
        e = i9f0Var5;
        f = new i9f0[]{i9f0Var, i9f0Var2, i9f0Var3, i9f0Var4, i9f0Var5};
    }

    public static i9f0 valueOf(String str) {
        return (i9f0) Enum.valueOf(i9f0.class, str);
    }

    public static i9f0[] values() {
        return (i9f0[]) f.clone();
    }
}
