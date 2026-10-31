package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r690 {
    public static final r690 a;
    public static final r690 b;
    public static final r690 c;
    public static final r690 d;
    public static final /* synthetic */ r690[] e;

    static {
        r690 r690Var = new r690("Good", 0);
        a = r690Var;
        r690 r690Var2 = new r690("Poor", 1);
        b = r690Var2;
        r690 r690Var3 = new r690("Disabled", 2);
        c = r690Var3;
        r690 r690Var4 = new r690("NotApplicable", 3);
        d = r690Var4;
        e = new r690[]{r690Var, r690Var2, r690Var3, r690Var4};
    }

    public static r690 valueOf(String str) {
        return (r690) Enum.valueOf(r690.class, str);
    }

    public static r690[] values() {
        return (r690[]) e.clone();
    }
}
