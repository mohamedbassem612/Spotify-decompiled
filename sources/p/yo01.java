package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yo01 {
    public static final yo01 X;
    public static final yo01 Y;
    public static final /* synthetic */ yo01[] Z;
    public static final yo01 a;
    public static final yo01 b;
    public static final yo01 c;
    public static final yo01 d;
    public static final yo01 e;
    public static final yo01 f;
    public static final yo01 g;
    public static final yo01 h;
    public static final yo01 i;
    public static final yo01 t;

    static {
        yo01 yo01Var = new yo01("ALBUM", 0);
        a = yo01Var;
        yo01 yo01Var2 = new yo01("ARTIST", 1);
        b = yo01Var2;
        yo01 yo01Var3 = new yo01("COLLECTION_TRACKS", 2);
        c = yo01Var3;
        yo01 yo01Var4 = new yo01("COLLECTION_EPISODES", 3);
        d = yo01Var4;
        yo01 yo01Var5 = new yo01("DAILY_MIX", 4);
        e = yo01Var5;
        yo01 yo01Var6 = new yo01("EPISODE", 5);
        f = yo01Var6;
        yo01 yo01Var7 = new yo01("PLAYLIST", 6);
        g = yo01Var7;
        yo01 yo01Var8 = new yo01("PROFILE", 7);
        h = yo01Var8;
        yo01 yo01Var9 = new yo01("RADIO", 8);
        i = yo01Var9;
        yo01 yo01Var10 = new yo01("SHOW", 9);
        t = yo01Var10;
        yo01 yo01Var11 = new yo01("TRACK", 10);
        X = yo01Var11;
        yo01 yo01Var12 = new yo01("UNKNOWN", 11);
        Y = yo01Var12;
        Z = new yo01[]{yo01Var, yo01Var2, yo01Var3, yo01Var4, yo01Var5, yo01Var6, yo01Var7, yo01Var8, yo01Var9, yo01Var10, yo01Var11, yo01Var12};
    }

    public static yo01 valueOf(String str) {
        return (yo01) Enum.valueOf(yo01.class, str);
    }

    public static yo01[] values() {
        return (yo01[]) Z.clone();
    }
}
