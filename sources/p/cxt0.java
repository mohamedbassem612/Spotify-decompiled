package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cxt0 {
    public static final cxt0 a;
    public static final cxt0 b;
    public static final cxt0 c;
    public static final /* synthetic */ cxt0[] d;

    static {
        cxt0 cxt0Var = new cxt0("ChapteredTrack", 0);
        a = cxt0Var;
        cxt0 cxt0Var2 = new cxt0("SingleTrack", 1);
        b = cxt0Var2;
        cxt0 cxt0Var3 = new cxt0("Undefined", 2);
        c = cxt0Var3;
        d = new cxt0[]{cxt0Var, cxt0Var2, cxt0Var3};
    }

    public static cxt0 valueOf(String str) {
        return (cxt0) Enum.valueOf(cxt0.class, str);
    }

    public static cxt0[] values() {
        return (cxt0[]) d.clone();
    }
}
