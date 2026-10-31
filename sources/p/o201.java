package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o201 extends hab0 implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ phi0 c;
    public final /* synthetic */ lfi1 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ ven0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o201(boolean z, long j, phi0 phi0Var, lfi1 lfi1Var, iu30 iu30Var, ven0 ven0Var) {
        super(0);
        this.a = z;
        this.b = j;
        this.c = phi0Var;
        this.d = lfi1Var;
        this.e = iu30Var;
        this.f = ven0Var;
    }

    public final Object invoke() {
        String strM;
        pux0 pux0Var = (pux0) this.c.d;
        boolean z = this.a;
        iu30 iu30Var = this.e;
        b7x b7xVar = b7x.a;
        lfi1 lfi1Var = this.d;
        if (z) {
            this.f.setValue(new u7h(this.b));
            String str = lfi1Var.b;
            i8h1 i8h1Var = (i8h1) pux0Var.b;
            x6h1 x6h1VarC = ((exk0) pux0Var.c).a.c();
            x6h1VarC.i.add(new a7h1("reaction_row", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_reaction", 1, Collections.singletonMap("reaction_to_be_removed", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            iu30Var.invoke(new q101(lfi1Var.b));
        } else {
            jfi1 jfi1Var = lfi1Var.a;
            if (jfi1Var instanceof ifi1) {
                strM = l1d.m("spotify:user:", ((ifi1) jfi1Var).b);
            } else {
                if (!(jfi1Var instanceof hfi1)) {
                    eg.o();
                    return null;
                }
                strM = ((hfi1) jfi1Var).b;
            }
            i8h1 i8h1Var2 = (i8h1) pux0Var.b;
            x6h1 x6h1VarC2 = ((exk0) pux0Var.c).a.c();
            x6h1VarC2.i.add(new a7h1("reaction_row", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            iu30Var.invoke(new r101(strM, i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strM)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
        }
        return rih1.a;
    }
}
