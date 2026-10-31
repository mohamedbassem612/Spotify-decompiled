package p;

import com.spotify.mobius.MobiusLoop;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rie extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sie b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rie(sie sieVar, byte b) {
        super(0);
        this.a = b;
        this.b = sieVar;
    }

    public final Object invoke() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        sie sieVar = this.b;
        switch (b) {
            case 0:
                bqk0 bqk0Var = sieVar.U0;
                bqk0Var.getClass();
                x6h1 x6h1VarC = bqk0Var.b.c();
                x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            default:
                bqk0 bqk0Var2 = sieVar.U0;
                vpn0 vpn0Var = sieVar.T0;
                String str = vpn0Var.a;
                bqk0Var2.getClass();
                x6h1 x6h1VarC3 = bqk0Var2.b.c();
                x6h1VarC3.i.add(new a7h1("full_episode_row", (String) null, (Integer) null, str, (String) null));
                x6h1VarC3.j = true;
                w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", vpn0Var.a)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                tv80 tv80VarM = sieVar.R0.m(w7h1Var, (xj61) null);
                sieVar.S0.a(w7h1Var, tv80VarM.a);
                MobiusLoop mobiusLoop = sieVar.V0;
                if (mobiusLoop != null) {
                    mym.l(mobiusLoop, new hie(tv80VarM));
                    return rih1.a;
                }
                u890.C("mobiusLoop");
                throw null;
        }
    }
}
