package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class chr0 {
    public static final chr0 a;
    public static final chr0 b;
    public static final chr0 c;
    public static final /* synthetic */ chr0[] d;
    public static final /* synthetic */ t0z e;

    static {
        chr0 chr0Var = new chr0("PROMPTED_PLAYLIST", 0);
        a = chr0Var;
        chr0 chr0Var2 = new chr0("BLUEJAY", 1);
        b = chr0Var2;
        chr0 chr0Var3 = new chr0("PERSONALIZED_SET", 2);
        c = chr0Var3;
        chr0[] chr0VarArr = {chr0Var, chr0Var2, chr0Var3};
        d = chr0VarArr;
        e = new t0z(chr0VarArr);
    }

    public static chr0 valueOf(String str) {
        return (chr0) Enum.valueOf(chr0.class, str);
    }

    public static chr0[] values() {
        return (chr0[]) d.clone();
    }
}
