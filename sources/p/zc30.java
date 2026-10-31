package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zc30 {
    public static final zc30 a;
    public static final zc30 b;
    public static final zc30 c;
    public static final /* synthetic */ zc30[] d;

    static {
        zc30 zc30Var = new zc30("NEVER", 0);
        a = zc30Var;
        zc30 zc30Var2 = new zc30("HANDOFF", 1);
        b = zc30Var2;
        zc30 zc30Var3 = new zc30("THROUGHOUT", 2);
        c = zc30Var3;
        d = new zc30[]{zc30Var, zc30Var2, zc30Var3};
    }

    public static zc30 valueOf(String str) {
        return (zc30) Enum.valueOf(zc30.class, str);
    }

    public static zc30[] values() {
        return (zc30[]) d.clone();
    }
}
