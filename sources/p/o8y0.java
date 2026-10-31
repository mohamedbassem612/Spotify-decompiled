package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o8y0 {
    public static final o8y0 a;
    public static final o8y0 b;
    public static final /* synthetic */ o8y0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    o8y0 EF0;

    static {
        o8y0 o8y0Var = new o8y0("UNSPECIFIED", 0);
        o8y0 o8y0Var2 = new o8y0("MANUAL", 1);
        a = o8y0Var2;
        o8y0 o8y0Var3 = new o8y0("SCHEDULED", 2);
        o8y0 o8y0Var4 = new o8y0("OUTDATED_PROMPT_VERSION_TRIGGER", 3);
        o8y0 o8y0Var5 = new o8y0("OVERDUE_SCHEDULED_PLAYLIST_OPENED", 4);
        b = o8y0Var5;
        c = new o8y0[]{o8y0Var, o8y0Var2, o8y0Var3, o8y0Var4, o8y0Var5};
    }

    public static o8y0 valueOf(String str) {
        return (o8y0) Enum.valueOf(o8y0.class, str);
    }

    public static o8y0[] values() {
        return (o8y0[]) c.clone();
    }
}
