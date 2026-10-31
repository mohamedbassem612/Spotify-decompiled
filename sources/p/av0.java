package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class av0 {
    public final f01 a;

    public av0(f01 f01Var) {
        this.a = f01Var;
    }

    public static o2u0 a(fq0 fq0Var, e01 e01Var) {
        xkg0 xkg0Var = new xkg0();
        xkg0Var.put("ad_id", fq0Var.a());
        xkg0Var.put("is_advertisement", "true");
        String str = e01Var.b;
        if (str != null) {
        }
        Long l = e01Var.c;
        if (l != null) {
        }
        xkg0Var.put("ad_playback_id", fq0Var.h());
        return new o2u0(e01Var.a, 4, xkg0Var.b());
    }

    public final o2u0 b(fq0 fq0Var, List list) {
        e01 e01VarA = this.a.a(list);
        if (e01VarA == null) {
            return null;
        }
        return a(fq0Var, e01VarA);
    }
}
