package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jm41 {
    public static final jm41 a;
    public static final jm41 b;
    public static final jm41 c;
    public static final /* synthetic */ jm41[] d;

    static {
        jm41 jm41Var = new jm41("NETWORK_UNMETERED", 0);
        a = jm41Var;
        jm41 jm41Var2 = new jm41("DEVICE_IDLE", 1);
        b = jm41Var2;
        jm41 jm41Var3 = new jm41("DEVICE_CHARGING", 2);
        c = jm41Var3;
        d = new jm41[]{jm41Var, jm41Var2, jm41Var3};
    }

    public static jm41 valueOf(String str) {
        return (jm41) Enum.valueOf(jm41.class, str);
    }

    public static jm41[] values() {
        return (jm41[]) d.clone();
    }
}
