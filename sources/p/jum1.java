package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jum1 {
    public static final jum1 a;
    public static final jum1 b;
    public static final jum1 c;
    public static final jum1 d;
    public static final /* synthetic */ jum1[] e;

    static {
        jum1 jum1Var = new jum1("ALBUM", 0);
        a = jum1Var;
        jum1 jum1Var2 = new jum1("AUDIOBOOK", 1);
        b = jum1Var2;
        jum1 jum1Var3 = new jum1("LIKED_SONGS", 2);
        c = jum1Var3;
        jum1 jum1Var4 = new jum1("PLAYLIST", 3);
        d = jum1Var4;
        e = new jum1[]{jum1Var, jum1Var2, jum1Var3, jum1Var4};
    }

    public static jum1 valueOf(String str) {
        return (jum1) Enum.valueOf(jum1.class, str);
    }

    public static jum1[] values() {
        return (jum1[]) e.clone();
    }
}
