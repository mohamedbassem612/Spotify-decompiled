package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m6m0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ mjl0 b;

    public m6m0(mjl0 mjl0Var, int i, Integer num, int i2) {
        String str;
        String str2;
        this.b = mjl0Var;
        x6h1 x6h1VarC = mjl0Var.b.c();
        switch (i) {
            case 1:
                str = "artist_count";
                break;
            case 2:
                str = "listening_time";
                break;
            case 3:
                str = "minutes_listened";
                break;
            case 4:
                str = "social_listening_time";
                break;
            case 5:
                str = "social_top_artists";
                break;
            case 6:
                str = "social_top_tracks";
                break;
            case 7:
                str = "top_artists";
                break;
            case 8:
                str = "top_tracks";
                break;
            default:
                throw null;
        }
        String str3 = str;
        switch (i2) {
            case 1:
                str2 = "la_disabled";
                break;
            case 2:
                str2 = "la_enabled_has_data_friends_playing";
                break;
            case 3:
                str2 = "la_enabled_has_data_no_friends_playing";
                break;
            case 4:
                str2 = "la_enabled_no_data_friends_playing";
                break;
            case 5:
                str2 = "la_enabled_no_data_no_friends_playing";
                break;
            case 6:
                str2 = "non_social";
                break;
            default:
                throw null;
        }
        x6h1VarC.i.add(new a7h1("stats_tiles_item", str3, num, (String) null, str2));
        x6h1VarC.j = true;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = this.b.c.b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.a);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).b = this.b.c.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return k7h1Var.a();
    }
}
