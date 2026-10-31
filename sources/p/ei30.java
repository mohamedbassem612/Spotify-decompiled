package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ei30 {
    public static final ei30 a;
    public static final ei30 b;
    public static final ei30 c;
    public static final ei30 d;
    public static final /* synthetic */ ei30[] e;

    static {
        ei30 ei30Var = new ei30("CURRENT", 0);
        a = ei30Var;
        ei30 ei30Var2 = new ei30("OCCLUDED_BY_NAVIGATION_OVERLAY", 1);
        b = ei30Var2;
        ei30 ei30Var3 = new ei30("OCCLUDED_BY_DIALOG", 2);
        c = ei30Var3;
        ei30 ei30Var4 = new ei30("NOT_CURRENT", 3);
        d = ei30Var4;
        e = new ei30[]{ei30Var, ei30Var2, ei30Var3, ei30Var4};
    }

    public static ei30 valueOf(String str) {
        return (ei30) Enum.valueOf(ei30.class, str);
    }

    public static ei30[] values() {
        return (ei30[]) e.clone();
    }
}
