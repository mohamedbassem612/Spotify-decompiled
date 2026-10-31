package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jza extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kza b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jza(kza kzaVar, byte b) {
        super(1);
        this.a = b;
        this.b = kzaVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 0;
        kza kzaVar = this.b;
        switch (b) {
            case 0:
                it8 it8Var = kzaVar.d;
                i8h1 i8h1Var = (i8h1) it8Var.b;
                fjl0 fjl0Var = (fjl0) it8Var.c;
                x6h1 x6h1VarC = fjl0Var.c.c();
                x6h1VarC.i.add(new a7h1("add_songs_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                kzaVar.j.a(kzaVar.e, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:assisted-curation")), x6h1VarC.a(), fjl0Var.b, System.currentTimeMillis()), (xj61) null));
                return rih1.a;
            default:
                ver verVarA = kzaVar.i.a((l0i) null);
                kzaVar.m = verVarA;
                String string = kzaVar.b.getString(2131952732);
                oe1 oe1Var = (oe1) verVarA.b;
                oe1Var.b.h(i07.a);
                oe1Var.c.setText(string);
                qzh qzhVar = kzaVar.m;
                if (qzhVar == null) {
                    u890.C("component");
                    throw null;
                }
                qzhVar.n(new jza(kzaVar, b2));
                qzh qzhVar2 = kzaVar.m;
                if (qzhVar2 != null) {
                    return qzhVar2.getView();
                }
                u890.C("component");
                throw null;
        }
    }
}
