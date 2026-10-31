package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class chf0 {
    public static final chf0 a;
    public static final chf0 b;
    public static final chf0 c;
    public static final chf0 d;
    public static final /* synthetic */ chf0[] e;
    public static final /* synthetic */ t0z f;

    static {
        chf0 chf0Var = new chf0("CLASSIC", 0);
        a = chf0Var;
        chf0 chf0Var2 = new chf0("WIDE", 1);
        b = chf0Var2;
        chf0 chf0Var3 = new chf0("NARROW", 2);
        c = chf0Var3;
        chf0 chf0Var4 = new chf0("SLANTED", 3);
        d = chf0Var4;
        chf0[] chf0VarArr = {chf0Var, chf0Var2, chf0Var3, chf0Var4};
        e = chf0VarArr;
        f = new t0z(chf0VarArr);
    }

    public static chf0 valueOf(String str) {
        return (chf0) Enum.valueOf(chf0.class, str);
    }

    public static chf0[] values() {
        return (chf0[]) e.clone();
    }
}
