package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class qo01 {
    public static final Map a;
    public static final Set b;

    static {
        mmr0 mmr0Var = new mmr0("album", yo01.a);
        mmr0 mmr0Var2 = new mmr0("artist", yo01.b);
        yo01 yo01Var = yo01.c;
        mmr0 mmr0Var3 = new mmr0("collection", yo01Var);
        mmr0 mmr0Var4 = new mmr0("collectionunion", yo01Var);
        mmr0 mmr0Var5 = new mmr0("collectionyourepisodes", yo01.d);
        mmr0 mmr0Var6 = new mmr0("dailymix", yo01.e);
        yo01 yo01Var2 = yo01.f;
        mmr0 mmr0Var7 = new mmr0("episode", yo01Var2);
        yo01 yo01Var3 = yo01.g;
        mmr0 mmr0Var8 = new mmr0("playlist", yo01Var3);
        mmr0 mmr0Var9 = new mmr0("toplist", yo01Var3);
        mmr0 mmr0Var10 = new mmr0("profile", yo01.h);
        yo01 yo01Var4 = yo01.i;
        mmr0 mmr0Var11 = new mmr0("radio", yo01Var4);
        mmr0 mmr0Var12 = new mmr0("station", yo01Var4);
        yo01 yo01Var5 = yo01.t;
        a = sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, mmr0Var6, mmr0Var7, mmr0Var8, mmr0Var9, mmr0Var10, mmr0Var11, mmr0Var12, new mmr0("show", yo01Var5), new mmr0("track", yo01.X)});
        b = f46.S0(new yo01[]{yo01Var5, yo01Var2});
    }
}
