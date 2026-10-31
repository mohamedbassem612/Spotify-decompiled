package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class txk1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ vxk1 a;

    public txk1(vxk1 vxk1Var) {
        this.a = vxk1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        rxk1 rxk1Var = (rxk1) obj;
        vxk1 vxk1Var = this.a;
        dzp0 dzp0Var = vxk1Var.c;
        i8h1 i8h1Var = (i8h1) ((jly0) dzp0Var.b).get();
        x6h1 x6h1VarC = ((brl0) dzp0Var.d).b.c();
        x6h1VarC.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        xh71.b(vxk1Var.b, new wa71(rxk1Var.a, (String) null, (cqs0) null, (dqi1) null, rxk1Var.b, (String) null, (Bundle) null, 110), mno1.h(new mmr0[]{new mmr0("voting.share.urls", new ArrayList(f46.i0(new String[]{rxk1Var.c})))}), new vm71("voting-experience-share-card"), i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null), (List) null, 16);
        return rih1.a;
    }
}
