package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b4t {
    public static final b4t a;
    public static final b4t b;
    public static final b4t c;
    public static final /* synthetic */ b4t[] d;

    static {
        b4t b4tVar = new b4t("SHOWN", 0);
        a = b4tVar;
        b4t b4tVar2 = new b4t("HIDDEN", 1);
        b = b4tVar2;
        b4t b4tVar3 = new b4t("UNKNOWN", 2);
        c = b4tVar3;
        d = new b4t[]{b4tVar, b4tVar2, b4tVar3};
    }

    public static b4t valueOf(String str) {
        return (b4t) Enum.valueOf(b4t.class, str);
    }

    public static b4t[] values() {
        return (b4t[]) d.clone();
    }
}
