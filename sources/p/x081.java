package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x081 {
    public static final x081 a;
    public static final x081 b;
    public static final /* synthetic */ x081[] c;

    static {
        x081 x081Var = new x081("VolumeSlider", 0);
        a = x081Var;
        x081 x081Var2 = new x081("JamToggle", 1);
        b = x081Var2;
        c = new x081[]{x081Var, x081Var2};
    }

    public static x081 valueOf(String str) {
        return (x081) Enum.valueOf(x081.class, str);
    }

    public static x081[] values() {
        return (x081[]) c.clone();
    }
}
