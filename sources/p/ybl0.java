package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ybl0 implements t9h1, p8h1 {
    public final y6h1 a;
    public final List b;

    public ybl0(int i) {
        String str;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-jam-permission-upgrade-sheet";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        if (i == 1) {
            str = "add_to_queue";
        } else if (i == 2) {
            str = "host_pause";
        } else if (i == 3) {
            str = "play_new_context";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "unspecified";
        }
        x6h1VarI.e = str;
        this.a = x6h1VarI.a();
        this.b = Collections.singletonList("jam/permissionupgradesheet");
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
