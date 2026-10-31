package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kit0 {
    public static final kit0 a;
    public static final kit0 b;
    public static final kit0 c;
    public static final /* synthetic */ kit0[] d;

    static {
        kit0 kit0Var = new kit0("Playing", 0);
        a = kit0Var;
        kit0 kit0Var2 = new kit0("Paused", 1);
        b = kit0Var2;
        kit0 kit0Var3 = new kit0("None", 2);
        c = kit0Var3;
        d = new kit0[]{kit0Var, kit0Var2, kit0Var3};
    }

    public static kit0 valueOf(String str) {
        return (kit0) Enum.valueOf(kit0.class, str);
    }

    public static kit0[] values() {
        return (kit0[]) d.clone();
    }
}
