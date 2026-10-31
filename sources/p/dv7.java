package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dv7 {
    public static final dv7 a;
    public static final dv7 b;
    public static final /* synthetic */ dv7[] c;

    static {
        dv7 dv7Var = new dv7("AUDIO_FOCUS_GRANTED", 0);
        a = dv7Var;
        dv7 dv7Var2 = new dv7("AUDIO_FOCUS_NOT_GRANTED", 1);
        b = dv7Var2;
        c = new dv7[]{dv7Var, dv7Var2};
    }

    public static dv7 valueOf(String str) {
        return (dv7) Enum.valueOf(dv7.class, str);
    }

    public static dv7[] values() {
        return (dv7[]) c.clone();
    }
}
