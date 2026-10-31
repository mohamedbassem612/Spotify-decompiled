package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ydh0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ pfj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydh0(nm1 nm1Var, pfj1 pfj1Var) {
        super(1);
        this.b = pfj1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pfj1 pfj1Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(nm1.k((List) obj, pfj1Var) instanceof udh0);
            default:
                ((Number) obj).intValue();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-search";
                x6h1VarI.f = "40.4.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                p7h.M(new String[]{"search", "search/albums", "search/artists", "search/audiobooks", "search/genres", "search/music", "search/playlists", "search/podcasts_and_episodes", "search/profiles", "search/recent", "search/songs", "search/videos", "search/last_24_hours", "search/last_week", "search/loading_instant_mix"});
                d8r0 d8r0Var = pfj1Var.e;
                String str = d8r0Var.b;
                String str2 = d8r0Var.e;
                String str3 = d8r0Var.a;
                x6h1 x6h1VarC = y6h1VarA.c();
                x6h1VarC.i.add(new a7h1("page", str, (Integer) null, str2, str3));
                x6h1VarC.j = false;
                y6h1 y6h1VarA2 = x6h1VarC.a();
                String str4 = d8r0Var.d;
                String str5 = str4.length() == 0 ? null : str4;
                x6h1 x6h1VarC2 = y6h1VarA2.c();
                x6h1VarC2.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, str5));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA3 = x6h1VarC2.a();
                String str6 = pfj1Var.d;
                x6h1 x6h1VarC3 = y6h1VarA3.c();
                x6h1VarC3.i.add(new a7h1("online_results", (String) null, (Integer) null, (String) null, str6));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA4 = x6h1VarC3.a();
                Integer numValueOf = Integer.valueOf(pfj1Var.f);
                String str7 = pfj1Var.a;
                x6h1 x6h1VarC4 = y6h1VarA4.c();
                x6h1VarC4.i.add(new a7h1("section", (String) null, numValueOf, str7, ""));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA5 = x6h1VarC4.a();
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA5), (u8h1) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydh0(pfj1 pfj1Var) {
        super(1);
        this.b = pfj1Var;
    }
}
