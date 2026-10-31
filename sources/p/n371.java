package p;

import android.os.Bundle;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n371 implements i570 {
    public final xh71 a;
    public final lc20 b;

    public n371(xh71 xh71Var, lc20 lc20Var) {
        this.a = xh71Var;
        this.b = lc20Var;
    }

    public final void a(j570 j570Var, u570 u570Var) {
        String strF = ((sc70) j570Var).b.c.F("uri", "");
        HubsImmutableComponentBundle hubsImmutableComponentBundleR = u570Var.b.r();
        lc20 lc20Var = this.b;
        x6h1 x6h1VarG = y1a1.G(hubsImmutableComponentBundleR, ((c4n0) lc20Var.d).getViewUri().a);
        x6h1VarG.g = "22.0.0";
        tv80 tv80VarM = ((i8h1) lc20Var.b).m(new x5j1(x6h1VarG.a(), (byte) 12).f().t(), (xj61) null);
        xh71.b(this.a, new wa71(strF, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126), (Bundle) null, new vm71("cultural-moment"), tv80VarM, (List) null, 18);
    }
}
