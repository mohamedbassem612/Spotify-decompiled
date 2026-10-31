package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c7p0 {
    public static final c7p0 a;
    public static final c7p0 b;
    public static final /* synthetic */ c7p0[] c;
    public static final /* synthetic */ t0z d;

    static {
        c7p0 c7p0Var = new c7p0("EXPANDED", 0);
        a = c7p0Var;
        c7p0 c7p0Var2 = new c7p0("COLLAPSED", 1);
        b = c7p0Var2;
        c7p0[] c7p0VarArr = {c7p0Var, c7p0Var2};
        c = c7p0VarArr;
        d = new t0z(c7p0VarArr);
    }

    public static c7p0 valueOf(String str) {
        return (c7p0) Enum.valueOf(c7p0.class, str);
    }

    public static c7p0[] values() {
        return (c7p0[]) c.clone();
    }
}
