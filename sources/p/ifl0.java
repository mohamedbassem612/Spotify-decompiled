package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ifl0 implements t9h1, p8h1 {
    public final y6h1 a;
    public final List b;

    public ifl0(int i) {
        String str;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-martini-floating-chat";
        x6h1VarI.f = "1.5.0";
        x6h1VarI.g = "22.0.0";
        switch (i) {
            case 1:
                str = "genpods_prompt_chat";
                break;
            case 2:
                str = "home_dj";
                break;
            case 3:
                str = "new_conversation";
                break;
            case 4:
                str = "npv_dj";
                break;
            case 5:
                str = "npv_martini_chat";
                break;
            case 6:
                str = "npv_reentry_martini_chat";
                break;
            case 7:
                str = "npv_see_more";
                break;
            case 8:
                str = "search_crossword";
                break;
            default:
                throw null;
        }
        x6h1VarI.e = str;
        this.a = x6h1VarI.a();
        this.b = Collections.singletonList("any");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = this.b;
        return k7h1Var.a();
    }
}
