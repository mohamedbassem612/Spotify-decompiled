package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ou01 {
    public static final ou01 a;
    public static final ou01 b;
    public static final ou01 c;
    public static final ou01 d;
    public static final ou01 e;
    public static final ou01 f;
    public static final ou01 g;
    public static final /* synthetic */ ou01[] h;
    public static final /* synthetic */ t0z i;

    static {
        ou01 ou01Var = new ou01("PLAYLISTS", 0);
        a = ou01Var;
        ou01 ou01Var2 = new ou01("PARENTS", 1);
        b = ou01Var2;
        ou01 ou01Var3 = new ou01("PROGRESS", 2);
        c = ou01Var3;
        ou01 ou01Var4 = new ou01("SHARE_PROFILES", 3);
        d = ou01Var4;
        ou01 ou01Var5 = new ou01("SPONSORSHIPS", 4);
        e = ou01Var5;
        ou01 ou01Var6 = new ou01("REACTIONS", 5);
        f = ou01Var6;
        ou01 ou01Var7 = new ou01("WRAPPED_SHARES", 6);
        g = ou01Var7;
        ou01[] ou01VarArr = {ou01Var, ou01Var2, ou01Var3, ou01Var4, ou01Var5, ou01Var6, ou01Var7};
        h = ou01VarArr;
        i = new t0z(ou01VarArr);
    }

    public static ou01 valueOf(String str) {
        return (ou01) Enum.valueOf(ou01.class, str);
    }

    public static ou01[] values() {
        return (ou01[]) h.clone();
    }
}
