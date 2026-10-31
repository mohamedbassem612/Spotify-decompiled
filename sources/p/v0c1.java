package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v0c1 {
    public static final v0c1 a;
    public static final v0c1 b;
    public static final v0c1 c;
    public static final v0c1 d;
    public static final v0c1 e;
    public static final v0c1 f;
    public static final /* synthetic */ v0c1[] g;

    static {
        v0c1 v0c1Var = new v0c1("StorageManagerCache", 0);
        a = v0c1Var;
        v0c1 v0c1Var2 = new v0c1("StorageManagerSettings", 1);
        b = v0c1Var2;
        v0c1 v0c1Var3 = new v0c1("InternalCache", 2);
        c = v0c1Var3;
        v0c1 v0c1Var4 = new v0c1("ExternalCache", 3);
        d = v0c1Var4;
        v0c1 v0c1Var5 = new v0c1("InternalFiles", 4);
        e = v0c1Var5;
        v0c1 v0c1Var6 = new v0c1("ExternalFiles", 5);
        f = v0c1Var6;
        g = new v0c1[]{v0c1Var, v0c1Var2, v0c1Var3, v0c1Var4, v0c1Var5, v0c1Var6, new v0c1("SharedPreferences", 6), new v0c1("Unknown", 7)};
    }

    public static v0c1 valueOf(String str) {
        return (v0c1) Enum.valueOf(v0c1.class, str);
    }

    public static v0c1[] values() {
        return (v0c1[]) g.clone();
    }
}
