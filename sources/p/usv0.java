package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class usv0 {
    public static final usv0 a;
    public static final usv0 b;
    public static final /* synthetic */ usv0[] c;

    static {
        usv0 usv0Var = new usv0("COLLAPSED", 0);
        a = usv0Var;
        usv0 usv0Var2 = new usv0("EXPANDED", 1);
        b = usv0Var2;
        c = new usv0[]{usv0Var, usv0Var2};
    }

    public static usv0 valueOf(String str) {
        return (usv0) Enum.valueOf(usv0.class, str);
    }

    public static usv0[] values() {
        return (usv0[]) c.clone();
    }
}
