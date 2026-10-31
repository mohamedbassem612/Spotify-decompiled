package p;

import com.spotify.mobius.MobiusLoop;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ill extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ill(xu30 xu30Var, b10 b10Var, int i, int i2) {
        super(0);
        this.d = xu30Var;
        this.e = b10Var;
        this.b = i;
        this.c = i2;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.e;
        int i = this.c;
        int i2 = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ((xu30) obj2).invoke(((b10) obj).b, Integer.valueOf(i2), Integer.valueOf(i));
                return rih1Var;
            default:
                ibz0 ibz0Var = (ibz0) obj2;
                xok0 xok0Var = ibz0Var.U0;
                Integer numValueOf = Integer.valueOf(i2 + i);
                m80 m80Var = (m80) ((p80) obj);
                String str = m80Var.a;
                xok0Var.getClass();
                x6h1 x6h1VarC = xok0Var.b.c();
                x6h1VarC.i.add(new a7h1("queue_item", (String) null, numValueOf, str, (String) null));
                x6h1VarC.j = true;
                w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                tv80 tv80VarM = ibz0Var.R0.m(w7h1Var, (xj61) null);
                ibz0Var.S0.a(w7h1Var, tv80VarM.a);
                MobiusLoop mobiusLoop = ibz0Var.T0;
                if (mobiusLoop != null) {
                    mym.l(mobiusLoop, new o7z0(m80Var, tv80VarM));
                    return rih1Var;
                }
                u890.C("mobiusLoop");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ill(ibz0 ibz0Var, int i, int i2, p80 p80Var) {
        super(0);
        this.d = ibz0Var;
        this.b = i;
        this.c = i2;
        this.e = p80Var;
    }
}
