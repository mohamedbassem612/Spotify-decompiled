package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c900 {
    public static final c900 a;
    public static final c900 b;
    public static final /* synthetic */ c900[] c;

    static {
        c900 c900Var = new c900("CardClicked", 0);
        a = c900Var;
        c900 c900Var2 = new c900("InterestedButtonClicked", 1);
        b = c900Var2;
        c = new c900[]{c900Var, c900Var2};
    }

    public static c900 valueOf(String str) {
        return (c900) Enum.valueOf(c900.class, str);
    }

    public static c900[] values() {
        return (c900[]) c.clone();
    }
}
