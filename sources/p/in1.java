package p;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class in1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public in1(gu8 gu8Var, String str, Function0 function0) {
        this.c = gu8Var;
        this.b = str;
        this.d = function0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.d;
        b7x b7xVar = b7x.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                eyh0 eyh0Var = (eyh0) ((d520) obj2).d;
                rrk0 rrk0VarM = eyh0Var.m(((rmy) obj).d, this.b);
                i8h1 i8h1Var = (i8h1) eyh0Var.b;
                x6h1 x6h1VarC = rrk0VarM.b.c();
                x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                whh1 whh1Var = ((gu8) obj2).b;
                jtk0 jtk0Var = whh1Var.b;
                jtk0Var.getClass();
                x6h1 x6h1VarC2 = jtk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("unfollow_dialog", (String) null, (Integer) null, this.b, (String) null));
                x6h1VarC2.j = true;
                whh1Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), jtk0Var.a, System.currentTimeMillis()), (xj61) null);
                ((Function0) obj).invoke();
                break;
        }
    }

    public in1(d520 d520Var, rmy rmyVar, String str) {
        this.c = d520Var;
        this.d = rmyVar;
        this.b = str;
    }
}
