package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class it6 {
    public static final it6 a;
    public static final /* synthetic */ it6[] b;

    static {
        it6 it6Var = new it6("RowClicked", 0);
        a = it6Var;
        b = new it6[]{it6Var};
    }

    public static it6 valueOf(String str) {
        return (it6) Enum.valueOf(it6.class, str);
    }

    public static it6[] values() {
        return (it6[]) b.clone();
    }
}
