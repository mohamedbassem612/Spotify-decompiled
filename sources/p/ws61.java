package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ws61 {
    public static final ws61 a;
    public static final ws61 b;
    public static final ws61 c;
    public static final /* synthetic */ ws61[] d;
    public static final /* synthetic */ t0z e;

    static {
        ws61 ws61Var = new ws61("DURATION", 0);
        a = ws61Var;
        ws61 ws61Var2 = new ws61("MUSIC", 1);
        b = ws61Var2;
        ws61 ws61Var3 = new ws61("WORKOUT_TYPE", 2);
        ws61 ws61Var4 = new ws61("AUDIO_GUIDE", 3);
        c = ws61Var4;
        ws61[] ws61VarArr = {ws61Var, ws61Var2, ws61Var3, ws61Var4, new ws61("BEAT_MATCHING", 4)};
        d = ws61VarArr;
        e = new t0z(ws61VarArr);
    }

    public static ws61 valueOf(String str) {
        return (ws61) Enum.valueOf(ws61.class, str);
    }

    public static ws61[] values() {
        return (ws61[]) d.clone();
    }
}
