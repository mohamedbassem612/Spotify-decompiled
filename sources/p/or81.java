package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class or81 {
    public static final or81 a;
    public static final /* synthetic */ or81[] b;

    static {
        or81 or81Var = new or81("NOTIFICATION_REMOVAL", 0);
        a = or81Var;
        b = new or81[]{or81Var};
    }

    public static or81 valueOf(String str) {
        return (or81) Enum.valueOf(or81.class, str);
    }

    public static or81[] values() {
        return (or81[]) b.clone();
    }
}
