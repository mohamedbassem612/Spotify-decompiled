package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l90 {
    public static final l90 a;
    public static final l90 b;
    public static final /* synthetic */ l90[] c;

    /* JADX INFO: Fake field, exist only in values array */
    l90 EF0;

    static {
        l90 l90Var = new l90("Spanned", 0);
        l90 l90Var2 = new l90("Wrapped", 1);
        a = l90Var2;
        l90 l90Var3 = new l90("SmartSpanned", 2);
        b = l90Var3;
        c = new l90[]{l90Var, l90Var2, l90Var3};
    }

    public static l90 valueOf(String str) {
        return (l90) Enum.valueOf(l90.class, str);
    }

    public static l90[] values() {
        return (l90[]) c.clone();
    }
}
