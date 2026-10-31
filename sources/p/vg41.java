package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vg41 {
    public static final vg41 a;
    public static final vg41 b;
    public static final vg41 c;
    public static final vg41 d;
    public static final /* synthetic */ vg41[] e;
    public static final /* synthetic */ t0z f;

    static {
        vg41 vg41Var = new vg41("IDLE", 0);
        a = vg41Var;
        vg41 vg41Var2 = new vg41("ANIMATED", 1);
        b = vg41Var2;
        vg41 vg41Var3 = new vg41("STATIC", 2);
        c = vg41Var3;
        vg41 vg41Var4 = new vg41("WARNING", 3);
        d = vg41Var4;
        vg41[] vg41VarArr = {vg41Var, vg41Var2, vg41Var3, vg41Var4};
        e = vg41VarArr;
        f = new t0z(vg41VarArr);
    }

    public static vg41 valueOf(String str) {
        return (vg41) Enum.valueOf(vg41.class, str);
    }

    public static vg41[] values() {
        return (vg41[]) e.clone();
    }
}
