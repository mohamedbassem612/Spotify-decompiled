package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vr90 {
    public static final vr90 a;
    public static final vr90 b;
    public static final vr90 c;
    public static final /* synthetic */ vr90[] d;

    static {
        vr90 vr90Var = new vr90("ToggleVolumeControl", 0);
        a = vr90Var;
        vr90 vr90Var2 = new vr90("TogglePlaybackControl", 1);
        b = vr90Var2;
        vr90 vr90Var3 = new vr90("NavigateBack", 2);
        c = vr90Var3;
        d = new vr90[]{vr90Var, vr90Var2, vr90Var3};
    }

    public static vr90 valueOf(String str) {
        return (vr90) Enum.valueOf(vr90.class, str);
    }

    public static vr90[] values() {
        return (vr90[]) d.clone();
    }
}
