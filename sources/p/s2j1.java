package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s2j1 {
    public static final s2j1 a;
    public static final s2j1 b;
    public static final /* synthetic */ s2j1[] c;

    static {
        s2j1 s2j1Var = new s2j1("PHOTO_ID", 0);
        a = s2j1Var;
        s2j1 s2j1Var2 = new s2j1("CARD", 1);
        b = s2j1Var2;
        c = new s2j1[]{s2j1Var, s2j1Var2};
    }

    public static s2j1 valueOf(String str) {
        return (s2j1) Enum.valueOf(s2j1.class, str);
    }

    public static s2j1[] values() {
        return (s2j1[]) c.clone();
    }
}
