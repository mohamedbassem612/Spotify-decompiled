package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uz70 {
    public static final uz70 a;
    public static final /* synthetic */ uz70[] b;

    /* JADX INFO: Fake field, exist only in values array */
    uz70 EF0;

    static {
        uz70 uz70Var = new uz70("DEFAULT", 0);
        uz70 uz70Var2 = new uz70("SMALL", 1);
        uz70 uz70Var3 = new uz70("LARGE", 2);
        a = uz70Var3;
        b = new uz70[]{uz70Var, uz70Var2, uz70Var3, new uz70("XLARGE", 3)};
    }

    public static uz70 valueOf(String str) {
        return (uz70) Enum.valueOf(uz70.class, str);
    }

    public static uz70[] values() {
        return (uz70[]) b.clone();
    }
}
