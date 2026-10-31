package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vt7 {
    public static final vt7 a;
    public static final vt7 b;
    public static final vt7 c;
    public static final vt7 d;
    public static final /* synthetic */ vt7[] e;

    static {
        vt7 vt7Var = new vt7("AUDIO_FOCUS", 0);
        a = vt7Var;
        vt7 vt7Var2 = new vt7("BYOM", 1);
        b = vt7Var2;
        vt7 vt7Var3 = new vt7("VOICE_SESSION", 2);
        vt7 vt7Var4 = new vt7("SLEEP_TIMER", 3);
        c = vt7Var4;
        vt7 vt7Var5 = new vt7("WORKOUT_CUE", 4);
        d = vt7Var5;
        e = new vt7[]{vt7Var, vt7Var2, vt7Var3, vt7Var4, vt7Var5};
    }

    public static vt7 valueOf(String str) {
        return (vt7) Enum.valueOf(vt7.class, str);
    }

    public static vt7[] values() {
        return (vt7[]) e.clone();
    }
}
