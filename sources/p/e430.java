package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e430 {
    public static final e430 a;
    public static final /* synthetic */ e430[] b;

    static {
        e430 e430Var = new e430("CLICKED", 0);
        a = e430Var;
        b = new e430[]{e430Var};
    }

    public static e430 valueOf(String str) {
        return (e430) Enum.valueOf(e430.class, str);
    }

    public static e430[] values() {
        return (e430[]) b.clone();
    }
}
