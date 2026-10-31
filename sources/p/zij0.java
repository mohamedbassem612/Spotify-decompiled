package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zij0 implements v190 {
    public static final zij0 a;
    public static final /* synthetic */ zij0[] b;

    static {
        zij0 zij0Var = new zij0("STREAMING", 0);
        a = zij0Var;
        b = new zij0[]{zij0Var};
    }

    public static zij0 valueOf(String str) {
        return (zij0) Enum.valueOf(zij0.class, str);
    }

    public static zij0[] values() {
        return (zij0[]) b.clone();
    }

    public final int getNumber() {
        return 0;
    }
}
