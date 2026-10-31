package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mbk0 {
    public static final mbk0 a;
    public static final mbk0 b;
    public static final mbk0 c;
    public static final /* synthetic */ mbk0[] d;

    static {
        mbk0 mbk0Var = new mbk0("Playing", 0);
        a = mbk0Var;
        mbk0 mbk0Var2 = new mbk0("Stopped", 1);
        b = mbk0Var2;
        mbk0 mbk0Var3 = new mbk0("Loading", 2);
        c = mbk0Var3;
        d = new mbk0[]{mbk0Var, mbk0Var2, mbk0Var3};
    }

    public static mbk0 valueOf(String str) {
        return (mbk0) Enum.valueOf(mbk0.class, str);
    }

    public static mbk0[] values() {
        return (mbk0[]) d.clone();
    }
}
