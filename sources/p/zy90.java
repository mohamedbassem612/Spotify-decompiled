package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zy90 {
    public static final zy90 a;
    public static final zy90 b;
    public static final zy90 c;
    public static final /* synthetic */ zy90[] d;

    static {
        zy90 zy90Var = new zy90("ToggleVolumeControl", 0);
        a = zy90Var;
        zy90 zy90Var2 = new zy90("ToggleQueueOnlyMode", 1);
        b = zy90Var2;
        zy90 zy90Var3 = new zy90("NavigateBack", 2);
        c = zy90Var3;
        d = new zy90[]{zy90Var, zy90Var2, zy90Var3};
    }

    public static zy90 valueOf(String str) {
        return (zy90) Enum.valueOf(zy90.class, str);
    }

    public static zy90[] values() {
        return (zy90[]) d.clone();
    }
}
