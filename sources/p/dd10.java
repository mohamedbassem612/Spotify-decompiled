package p;

import com.spotify.mobius.MobiusLoop;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dd10 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ed10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dd10(ed10 ed10Var, byte b) {
        super(1);
        this.a = b;
        this.b = ed10Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ed10 ed10Var = this.b;
        switch (b) {
            case 0:
                MobiusLoop mobiusLoop = ed10Var.P0;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                    return rih1Var;
                }
                u890.C("fabLoop");
                throw null;
            default:
                cd10 cd10Var = (cd10) obj;
                idd1 idd1Var = ed10Var.O0;
                t64 t64Var = ed10Var.N0;
                i8h1 i8h1Var = ed10Var.Y;
                boolean zEquals = cd10Var.equals(ad10.c);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    fqn0 fqn0Var = fqn0.a;
                    nuk0 nuk0Var = (nuk0) idd1Var.getValue();
                    nuk0Var.getClass();
                    x6h1 x6h1VarC = nuk0Var.b.c();
                    x6h1VarC.i.add(new a7h1("npv_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:now-playing-view")), x6h1VarC.a(), nuk0Var.a, System.currentTimeMillis());
                    ou80 ou80Var = i8h1Var.m(w7h1Var, (xj61) null).a;
                    t64Var.a(w7h1Var, ou80Var);
                    MobiusLoop mobiusLoop2 = ed10Var.P0;
                    if (mobiusLoop2 != null) {
                        mym.l(mobiusLoop2, new id10(ou80Var));
                        return rih1Var;
                    }
                    u890.C("fabLoop");
                    throw null;
                }
                if (!cd10Var.equals(bd10.c)) {
                    eg.o();
                    return null;
                }
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                yon1.U4();
                nuk0 nuk0Var2 = (nuk0) idd1Var.getValue();
                nuk0Var2.getClass();
                x6h1 x6h1VarC2 = nuk0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("search_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                w7h1 w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:search")), x6h1VarC2.a(), nuk0Var2.a, System.currentTimeMillis());
                ou80 ou80Var2 = i8h1Var.m(w7h1Var2, (xj61) null).a;
                t64Var.a(w7h1Var2, ou80Var2);
                MobiusLoop mobiusLoop3 = ed10Var.P0;
                if (mobiusLoop3 != null) {
                    mym.l(mobiusLoop3, new jd10(ou80Var2));
                    return rih1Var;
                }
                u890.C("fabLoop");
                throw null;
        }
    }
}
