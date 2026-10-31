package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sha1 {
    public static final sha1 a;
    public static final sha1 b;
    public static final sha1 c;
    public static final sha1 d;
    public static final /* synthetic */ sha1[] e;

    static {
        sha1 sha1Var = new sha1("SHOW_NAME", 0);
        a = sha1Var;
        sha1 sha1Var2 = new sha1("RECENTLY_ADDED", 1);
        b = sha1Var2;
        sha1 sha1Var3 = new sha1("RELEASE_DATE", 2);
        c = sha1Var3;
        sha1 sha1Var4 = new sha1("CUSTOM", 3);
        d = sha1Var4;
        e = new sha1[]{sha1Var, sha1Var2, sha1Var3, sha1Var4};
    }

    public static sha1 valueOf(String str) {
        return (sha1) Enum.valueOf(sha1.class, str);
    }

    public static sha1[] values() {
        return (sha1[]) e.clone();
    }
}
