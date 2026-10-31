package p;

import android.app.Activity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f4u implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ mxr b;
    public final /* synthetic */ nn61 c;

    public f4u(mxr mxrVar, nn61 nn61Var) {
        this.b = mxrVar;
        this.c = nn61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nn61 nn61Var = this.c;
        b7x b7xVar = b7x.a;
        mxr mxrVar = this.b;
        switch (b) {
            case 0:
                aod aodVar = (aod) mxrVar.b;
                i8h1 i8h1Var = (i8h1) aodVar.b;
                fjl0 fjl0Var = (fjl0) aodVar.c;
                x6h1 x6h1VarC = fjl0Var.c.c();
                x6h1VarC.i.add(new a7h1("change_image_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("take_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                String str = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), fjl0Var.b, System.currentTimeMillis()), (xj61) null).a.a;
                ssw0 ssw0Var = (ssw0) nn61Var.b;
                cir0 cir0Var = (cir0) ((ke71) nn61Var.c).c;
                ilo1.E(new n200(str, ag0.C0((Activity) ((Function0) cir0Var.k().b).invoke(), "android.permission.CAMERA"), !cir0Var.k().d("android.permission.CAMERA").equals(cat.c)), ssw0Var);
                break;
            default:
                aod aodVar2 = (aod) mxrVar.b;
                i8h1 i8h1Var2 = (i8h1) aodVar2.b;
                fjl0 fjl0Var2 = (fjl0) aodVar2.c;
                x6h1 x6h1VarC3 = fjl0Var2.c.c();
                x6h1VarC3.i.add(new a7h1("change_image_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("remove_current_image_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), fjl0Var2.b, System.currentTimeMillis()), (xj61) null);
                ilo1.E(a400.a, (ssw0) nn61Var.b);
                break;
        }
    }

    public f4u(nn61 nn61Var, mxr mxrVar) {
        this.c = nn61Var;
        this.b = mxrVar;
    }
}
