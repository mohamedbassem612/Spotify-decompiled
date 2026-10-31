package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yij0 implements v190 {
    public static final yij0 a;
    public static final /* synthetic */ yij0[] b;

    static {
        yij0 yij0Var = new yij0("STREAMING", 0);
        a = yij0Var;
        b = new yij0[]{yij0Var};
    }

    public static yij0 valueOf(String str) {
        return (yij0) Enum.valueOf(yij0.class, str);
    }

    public static yij0[] values() {
        return (yij0[]) b.clone();
    }

    public final int getNumber() {
        return 0;
    }
}
