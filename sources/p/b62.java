package p;

import com.spotify.nowplayingmodes.adsmode.data.AdsModeModel;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b62 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c62 b;

    public /* synthetic */ b62(c62 c62Var, byte b) {
        this.a = b;
        this.b = c62Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        c62 c62Var = this.b;
        switch (b) {
            case 0:
                l62 l62Var = (l62) obj;
                if (l62Var.Z instanceof lsn) {
                    c62Var.R0.a(new l6d1(l62Var.i, l62Var.t, l62Var.X));
                }
                break;
            default:
                mmr0 mmr0Var = (mmr0) obj;
                l62 l62Var2 = (l62) mmr0Var.a;
                pxc.a(c62Var.S0, l62Var2, (Long) mmr0Var.b, "cover_art", "ad_npv", 16);
                j62 j62Var = c62Var.Q0;
                String str = l62Var2.i;
                String str2 = l62Var2.V0;
                String str3 = l62Var2.h;
                AdsModeModel.Format format = l62Var2.R0;
                AdsModeModel.Product product = l62Var2.S0;
                g5l0 g5l0VarB = j62Var.b();
                String strA = format.a(product);
                x6h1 x6h1VarC = g5l0VarB.c.c();
                x6h1VarC.i.add(new a7h1("cover_art", str, (Integer) null, str2, strA));
                x6h1VarC.j = false;
                j62Var.b.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str3)), x6h1VarC.a(), g5l0VarB.b, System.currentTimeMillis()), (xj61) null);
                break;
        }
    }
}
