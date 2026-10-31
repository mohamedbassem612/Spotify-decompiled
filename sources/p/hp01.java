package p;

import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hp01 {
    public static final Set a;
    public static final hp01 b;
    public static final hp01 c;
    public static final hp01 d;
    public static final hp01 e;
    public static final hp01 f;
    public static final /* synthetic */ hp01[] g;

    /* JADX INFO: Fake field, exist only in values array */
    hp01 EF0;

    static {
        hp01 hp01Var = new hp01("SHOWS", 0);
        hp01 hp01Var2 = new hp01("RADIO", 1);
        hp01 hp01Var3 = new hp01("DAILY_MIX", 2);
        hp01 hp01Var4 = new hp01("HIDDEN_ENTITIES", 3);
        b = hp01Var4;
        hp01 hp01Var5 = new hp01("COLLECTION_TRACKS", 4);
        c = hp01Var5;
        hp01 hp01Var6 = new hp01("COLLECTION_EPISODES", 5);
        d = hp01Var6;
        hp01 hp01Var7 = new hp01("OWN_DELETED_PLAYLISTS", 6);
        e = hp01Var7;
        hp01 hp01Var8 = new hp01("PODCAST_SHORTS", 7);
        f = hp01Var8;
        g = new hp01[]{hp01Var, hp01Var2, hp01Var3, hp01Var4, hp01Var5, hp01Var6, hp01Var7, hp01Var8};
        a = f46.S0(new hp01[]{hp01Var, hp01Var2, hp01Var3, hp01Var5, hp01Var6, hp01Var8});
    }

    public static hp01 valueOf(String str) {
        return (hp01) Enum.valueOf(hp01.class, str);
    }

    public static hp01[] values() {
        return (hp01[]) g.clone();
    }
}
