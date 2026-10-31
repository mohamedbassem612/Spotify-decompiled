package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gms0 {
    public static final gms0 a;
    public static final gms0 b;
    public static final gms0 c;
    public static final gms0 d;
    public static final /* synthetic */ gms0[] e;

    static {
        gms0 gms0Var = new gms0("GRANTED", 0);
        a = gms0Var;
        gms0 gms0Var2 = new gms0("NEVER_ASKED", 1);
        b = gms0Var2;
        gms0 gms0Var3 = new gms0("TEMPORARILY_DENIED", 2);
        c = gms0Var3;
        gms0 gms0Var4 = new gms0("PERMANENTLY_DENIED", 3);
        d = gms0Var4;
        e = new gms0[]{gms0Var, gms0Var2, gms0Var3, gms0Var4};
    }

    public static gms0 valueOf(String str) {
        return (gms0) Enum.valueOf(gms0.class, str);
    }

    public static gms0[] values() {
        return (gms0[]) e.clone();
    }
}
