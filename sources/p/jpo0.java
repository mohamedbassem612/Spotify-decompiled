package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jpo0 {
    public static final jpo0 a;
    public static final jpo0 b;
    public static final jpo0 c;
    public static final jpo0 d;
    public static final /* synthetic */ jpo0[] e;

    static {
        jpo0 jpo0Var = new jpo0("IDLE", 0);
        a = jpo0Var;
        jpo0 jpo0Var2 = new jpo0("LOADING", 1);
        b = jpo0Var2;
        jpo0 jpo0Var3 = new jpo0("SUCCESS", 2);
        c = jpo0Var3;
        jpo0 jpo0Var4 = new jpo0("ERROR", 3);
        d = jpo0Var4;
        e = new jpo0[]{jpo0Var, jpo0Var2, jpo0Var3, jpo0Var4};
    }

    public static jpo0 valueOf(String str) {
        return (jpo0) Enum.valueOf(jpo0.class, str);
    }

    public static jpo0[] values() {
        return (jpo0[]) e.clone();
    }
}
