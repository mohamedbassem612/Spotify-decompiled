package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a071 {
    public static final /* synthetic */ a071[] a;

    /* JADX INFO: Fake field, exist only in values array */
    a071 EF0;

    static {
        z4p1.g(4294928820L);
        a071 a071Var = new a071("WithConfig", 0);
        z4p1.g(4278255360L);
        a071 a071Var2 = new a071("FromEntityUriType", 1);
        z4p1.g(4278239231L);
        a071 a071Var3 = new a071("FromChatPreview", 2);
        z4p1.g(4294944000L);
        a = new a071[]{a071Var, a071Var2, a071Var3, new a071("Default", 3)};
    }

    public static a071 valueOf(String str) {
        return (a071) Enum.valueOf(a071.class, str);
    }

    public static a071[] values() {
        return (a071[]) a.clone();
    }
}
