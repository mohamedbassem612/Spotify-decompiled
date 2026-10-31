package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zl80 {
    public static final zl80 a;
    public static final zl80 b;
    public static final /* synthetic */ zl80[] c;

    static {
        zl80 zl80Var = new zl80("Track", 0);
        a = zl80Var;
        zl80 zl80Var2 = new zl80("Artist", 1);
        b = zl80Var2;
        c = new zl80[]{zl80Var, zl80Var2};
    }

    public static zl80 valueOf(String str) {
        return (zl80) Enum.valueOf(zl80.class, str);
    }

    public static zl80[] values() {
        return (zl80[]) c.clone();
    }
}
