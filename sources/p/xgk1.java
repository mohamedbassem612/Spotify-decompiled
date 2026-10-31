package p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xgk1 {
    public static final xgk1 a;
    public static final xgk1 b;
    public static final xgk1 c;
    public static final /* synthetic */ xgk1[] d;

    static {
        xgk1 xgk1Var = new xgk1("EMPTY", 0);
        a = xgk1Var;
        xgk1 xgk1Var2 = new xgk1("READY", 1);
        b = xgk1Var2;
        xgk1 xgk1Var3 = new xgk1(SearchEndpointResponseKt.RESULT_ERROR, 2);
        c = xgk1Var3;
        d = new xgk1[]{xgk1Var, xgk1Var2, xgk1Var3};
    }

    public static xgk1 valueOf(String str) {
        return (xgk1) Enum.valueOf(xgk1.class, str);
    }

    public static xgk1[] values() {
        return (xgk1[]) d.clone();
    }
}
