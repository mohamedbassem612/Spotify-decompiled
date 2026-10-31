package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b2z {
    public static final b2z a;
    public static final b2z b;
    public static final /* synthetic */ b2z[] c;

    static {
        b2z b2zVar = new b2z("CardClicked", 0);
        a = b2zVar;
        b2z b2zVar2 = new b2z("CardLongClicked", 1);
        b = b2zVar2;
        c = new b2z[]{b2zVar, b2zVar2};
    }

    public static b2z valueOf(String str) {
        return (b2z) Enum.valueOf(b2z.class, str);
    }

    public static b2z[] values() {
        return (b2z[]) c.clone();
    }
}
