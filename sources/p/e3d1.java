package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e3d1 {
    public static final e3d1 a;
    public static final e3d1 b;
    public static final /* synthetic */ e3d1[] c;

    static {
        e3d1 e3d1Var = new e3d1("Placeholder", 0);
        a = e3d1Var;
        e3d1 e3d1Var2 = new e3d1("Video", 1);
        b = e3d1Var2;
        c = new e3d1[]{e3d1Var, e3d1Var2};
    }

    public static e3d1 valueOf(String str) {
        return (e3d1) Enum.valueOf(e3d1.class, str);
    }

    public static e3d1[] values() {
        return (e3d1[]) c.clone();
    }
}
