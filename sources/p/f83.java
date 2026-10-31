package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f83 {
    public static final f83 a;
    public static final f83 b;
    public static final /* synthetic */ f83[] c;

    static {
        f83 f83Var = new f83("Tour", 0);
        a = f83Var;
        f83 f83Var2 = new f83("Concert", 1);
        b = f83Var2;
        c = new f83[]{f83Var, f83Var2};
    }

    public static f83 valueOf(String str) {
        return (f83) Enum.valueOf(f83.class, str);
    }

    public static f83[] values() {
        return (f83[]) c.clone();
    }
}
