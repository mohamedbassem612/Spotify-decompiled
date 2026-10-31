package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zue0 {
    public static final zue0 a;
    public static final zue0 b;
    public static final zue0 c;
    public static final zue0 d;
    public static final /* synthetic */ zue0[] e;

    static {
        zue0 zue0Var = new zue0("REQUESTS", 0);
        a = zue0Var;
        zue0 zue0Var2 = new zue0("INCLUDE_ACCESS_TOKENS", 1);
        zue0 zue0Var3 = new zue0("INCLUDE_RAW_RESPONSES", 2);
        b = zue0Var3;
        zue0 zue0Var4 = new zue0("CACHE", 3);
        zue0 zue0Var5 = new zue0("APP_EVENTS", 4);
        c = zue0Var5;
        zue0 zue0Var6 = new zue0("DEVELOPER_ERRORS", 5);
        d = zue0Var6;
        e = new zue0[]{zue0Var, zue0Var2, zue0Var3, zue0Var4, zue0Var5, zue0Var6, new zue0("GRAPH_API_DEBUG_WARNING", 6), new zue0("GRAPH_API_DEBUG_INFO", 7)};
    }

    public static zue0 valueOf(String str) {
        return (zue0) Enum.valueOf(zue0.class, str);
    }

    public static zue0[] values() {
        return (zue0[]) e.clone();
    }
}
