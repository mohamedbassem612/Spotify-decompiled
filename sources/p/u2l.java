package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u2l extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w2l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2l(w2l w2lVar, byte b) {
        super(0);
        this.a = b;
        this.b = w2lVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        w2l w2lVar = this.b;
        switch (b) {
            case 0:
                r2l r2lVar = w2lVar.W1;
                if (r2lVar == null) {
                    u890.C("listener");
                    throw null;
                }
                v1k v1kVar = r2lVar.g;
                l0l l0lVarC = r2lVar.e.c();
                String strJ = l0lVarC != null ? l0lVarC.j() : null;
                i8h1 i8h1Var = (i8h1) v1kVar.b;
                x6h1 x6h1VarC = ((dsk0) v1kVar.d).b.c();
                x6h1VarC.i.add(new a7h1("listen_on_this_device_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (strJ == null) {
                    strJ = "";
                }
                zor.i(r2lVar.f, i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("disconnect_from_remote_device", 1, Collections.singletonMap("remote_device_id", strJ)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null).a.a, 6);
                w2lVar.Z0(false, false);
                return rih1Var;
            default:
                r2l r2lVar2 = w2lVar.W1;
                if (r2lVar2 == null) {
                    u890.C("listener");
                    throw null;
                }
                v1k v1kVar2 = r2lVar2.g;
                i8h1 i8h1Var2 = (i8h1) v1kVar2.b;
                x6h1 x6h1VarC2 = ((dsk0) v1kVar2.d).b.c();
                x6h1VarC2.i.add(new a7h1("stay_on_other_device", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                w2lVar.Z0(false, false);
                return rih1Var;
        }
    }
}
