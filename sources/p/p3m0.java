package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p3m0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ q3m0 b;

    public p3m0(q3m0 q3m0Var, Integer num, String str, String str2) {
        this.b = q3m0Var;
        x6h1 x6h1VarC = q3m0Var.a.c();
        x6h1VarC.i.add(new a7h1("watch_feed_horizontal_item", (String) null, num, str2, str));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }

    public final w7h1 e(Integer num) {
        z7h1 z7h1Var = new z7h1("double_hit", 1, b7x.a);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 h(Integer num, String str) {
        z7h1 z7h1Var = new z7h1("long_hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        mmr0 mmr0Var = new mmr0("currently_played_item", str);
        String strValueOf = String.valueOf(num.intValue());
        return new w7h1("", "", z7h1Var, new x7h1("set_playback_speed", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("playback_speed", strValueOf != null ? strValueOf : "")})), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final o3m0 i(String str, String str2, String str3) {
        return new o3m0(this, str, str2, str3);
    }
}
