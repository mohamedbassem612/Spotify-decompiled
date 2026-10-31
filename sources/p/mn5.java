package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mn5 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mn5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((f85) obj2).invoke();
                pn5 pn5Var = (pn5) obj;
                pn5Var.c.j();
                pn5Var.d = null;
                break;
            case 1:
                ((x1s) obj2).a((yh70) obj, true);
                break;
            case 2:
                ((x1s) obj2).a((ji70) obj, true);
                break;
            case 3:
                x1s x1sVar = (x1s) obj2;
                pi70 pi70Var = (pi70) obj;
                x1sVar.e.a(new xmo0(pi70Var.e, 5));
                x1sVar.a(pi70Var, true);
                break;
            case 4:
                ((x1s) obj2).a((ui70) obj, true);
                break;
            case 5:
                ((x1s) obj2).a((vi70) obj, true);
                break;
            case 6:
                ((x1s) obj2).a((wi70) obj, true);
                break;
            case 7:
                ((x1s) obj2).a((bj70) obj, true);
                break;
            case 8:
                x1s x1sVar2 = (x1s) obj2;
                gj70 gj70Var = (gj70) obj;
                x1sVar2.e.a(new bno0(gj70Var.d, 5));
                x1sVar2.a(gj70Var, true);
                break;
            case 9:
                aod aodVar = (aod) ((mxr) obj2).b;
                i8h1 i8h1Var = (i8h1) aodVar.b;
                fjl0 fjl0Var = (fjl0) aodVar.c;
                x6h1 x6h1VarC = fjl0Var.c.c();
                x6h1VarC.i.add(new a7h1("change_image_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, fjl0Var.b, System.currentTimeMillis()), (xj61) null);
                ilo1.E(t400.a, (ssw0) ((nn61) obj).b);
                break;
            default:
                ((lt8) ((zeu) obj2).b).a.m(cbp1.o().h().e().p(), (xj61) null);
                ((ohd) obj).resumeWith(Boolean.FALSE);
                break;
        }
    }
}
