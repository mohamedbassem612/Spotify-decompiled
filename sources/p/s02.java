package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s02 {
    public static final s02 a;
    public static final s02 b;
    public static final s02 c;
    public static final s02 d;
    public static final /* synthetic */ s02[] e;

    static {
        s02 s02Var = new s02("SESSION_ENDED_BY_USER", 0);
        a = s02Var;
        s02 s02Var2 = new s02("MEETING_ENDED_BY_USER", 1);
        b = s02Var2;
        s02 s02Var3 = new s02("SESSION_ENDED_UNEXPECTEDLY", 2);
        c = s02Var3;
        s02 s02Var4 = new s02("SESSION_ENDED_DUE_TO_RECORDING_STATE_SYNC_ISSUE", 3);
        d = s02Var4;
        e = new s02[]{s02Var, s02Var2, s02Var3, s02Var4};
    }

    public static s02 valueOf(String str) {
        return (s02) Enum.valueOf(s02.class, str);
    }

    public static s02[] values() {
        return (s02[]) e.clone();
    }
}
