package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rt60 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z1s b;

    public /* synthetic */ rt60(z1s z1sVar, byte b) {
        this.a = b;
        this.b = z1sVar;
    }

    public final void accept(Object obj) {
        hj70 yi70Var;
        byte b = this.a;
        z1s z1sVar = this.b;
        switch (b) {
            case 0:
                z1sVar.a(new li70(((ht60) obj).b));
                break;
            case 1:
                z1sVar.a(mi70.c);
                break;
            case 2:
                z1sVar.a(cj70.c);
                break;
            case 3:
                z1sVar.a(dj70.c);
                break;
            case 4:
                fuo0 fuo0Var = (fuo0) obj;
                z1sVar.a(new xi70(fuo0Var.a, fuo0Var.b));
                break;
            case 5:
                guo0 guo0Var = (guo0) obj;
                boolean z = guo0Var.a;
                int iC = l1d.C(guo0Var.b);
                if (iC == 0) {
                    yi70Var = new yi70(z);
                } else if (iC != 1) {
                    eg.o();
                } else {
                    yi70Var = new zi70(z);
                }
                z1sVar.a(yi70Var);
                break;
            case 6:
                luo0 luo0Var = (luo0) obj;
                z1sVar.a(new pi70(luo0Var.a, luo0Var.b, luo0Var.c, luo0Var.e, luo0Var.d));
                break;
            case 7:
                sea0 sea0Var = ((muo0) obj).a;
                z1sVar.a(new si70(sea0Var instanceof qea0, sea0Var.a));
                break;
            case 8:
                nuo0 nuo0Var = (nuo0) obj;
                z1sVar.a(new aj70(nuo0Var.b, nuo0Var.c, nuo0Var.a));
                break;
            default:
                ouo0 ouo0Var = (ouo0) obj;
                z1sVar.a(new gj70(ouo0Var.a, ouo0Var.b));
                break;
        }
    }
}
