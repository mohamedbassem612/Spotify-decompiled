package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class om61 {
    public static final om61 a;
    public static final /* synthetic */ om61[] b;

    static {
        om61 om61Var = new om61("ButtonClicked", 0);
        a = om61Var;
        b = new om61[]{om61Var};
    }

    public static om61 valueOf(String str) {
        return (om61) Enum.valueOf(om61.class, str);
    }

    public static om61[] values() {
        return (om61[]) b.clone();
    }
}
