package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qd30 {
    public static final qd30 a;
    public static final qd30 b;
    public static final /* synthetic */ qd30[] c;

    static {
        qd30 qd30Var = new qd30("FOREGROUND_KEEPER_SERVICE", 0);
        a = qd30Var;
        qd30 qd30Var2 = new qd30("SPOTIFY_ALARM_LAUNCHER_SERVICE", 1);
        b = qd30Var2;
        c = new qd30[]{qd30Var, qd30Var2};
    }

    public static qd30 valueOf(String str) {
        return (qd30) Enum.valueOf(qd30.class, str);
    }

    public static qd30[] values() {
        return (qd30[]) c.clone();
    }
}
