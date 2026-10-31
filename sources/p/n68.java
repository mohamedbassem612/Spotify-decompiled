package p;

import android.content.res.Resources;
import android.os.Bundle;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n68 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n68(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public final void run() {
        String string;
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                a1r0.j((a1r0) ((p68) obj).f, xcg1.i(nik1.u1.a, "?reason=", xcg1.o(i)), (String) null, (Bundle) null, false, 14);
                break;
            case 1:
                ri11 ri11Var = (ri11) obj;
                ri11Var.d.accept(new hu41(i));
                ri11Var.Y.onNext(Boolean.TRUE);
                break;
            case 2:
                ik21 ik21Var = (ik21) obj;
                Resources resources = ik21Var.e.a;
                int iC = l1d.C(i);
                if (iC == 0) {
                    string = resources.getString(2131961259);
                    string.getClass();
                } else if (iC != 1) {
                    eg.o();
                } else {
                    string = resources.getString(2131961260);
                    string.getClass();
                }
                ik21Var.a(string);
                break;
            default:
                grb1 grb1Var = ((crb1) obj).b;
                int iC2 = l1d.C(i);
                if (iC2 == 1) {
                    grb1Var.h = true;
                    grb1Var.g = false;
                } else if (iC2 != 2) {
                    grb1Var.h = false;
                    grb1Var.g = false;
                } else {
                    grb1Var.h = true;
                    grb1Var.g = true;
                }
                grb1Var.g(grb1Var.i, 1, false);
                break;
        }
    }
}
