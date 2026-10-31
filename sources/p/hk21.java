package p;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hk21 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ik21 b;

    public /* synthetic */ hk21(ik21 ik21Var, byte b) {
        this.a = b;
        this.b = ik21Var;
    }

    public final void accept(Object obj) {
        String string;
        String string2;
        String string3;
        byte b = this.a;
        ek21 ek21Var = ek21.a;
        ik21 ik21Var = this.b;
        switch (b) {
            case 0:
                ik21Var.a(ik21Var.e.a.getString(2131961258));
                break;
            case 1:
                ik21Var.a(ik21Var.e.a.getString(2131961250));
                break;
            case 2:
                ik21Var.h = (gk21) obj;
                break;
            case 3:
                ik21Var.h = ek21Var;
                break;
            default:
                gk21 gk21Var = (gk21) obj;
                ik21Var.h = gk21Var;
                th30 th30Var = ik21Var.c;
                uww0 uww0Var = ik21Var.f;
                i8h1 i8h1Var = ik21Var.a;
                Resources resources = ik21Var.e.a;
                if (gk21Var instanceof fk21) {
                    int iB = ik21Var.b();
                    if (iB != 0) {
                        dsk0 dsk0Var = new dsk0(1, ik21Var.j);
                        i8h1Var.f(dsk0Var.e(), (Set) null);
                        ik21Var.k = dsk0Var;
                        String string4 = resources.getString(2131961257);
                        int iC = l1d.C(iB);
                        if (iC == 0) {
                            string3 = resources.getString(2131961255);
                            string3.getClass();
                        } else if (iC != 1) {
                            eg.o();
                        } else {
                            string3 = resources.getString(2131961256);
                            string3.getClass();
                        }
                        Parcelable ck21Var = new ck21(string4, string3, resources.getString(2131961254), resources.getString(2131961253));
                        zj21 zj21VarA = uww0Var.a();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("model", ck21Var);
                        zj21VarA.T0(bundle);
                        zj21VarA.g1(th30Var, "ReportBlockingDialogFragment");
                    }
                    break;
                } else if (gk21Var instanceof dk21) {
                    String str = ((dk21) gk21Var).a;
                    int iB2 = ik21Var.b();
                    if (iB2 != 0) {
                        dsk0 dsk0Var2 = new dsk0(2, ik21Var.j);
                        i8h1Var.f(dsk0Var2.e(), (Set) null);
                        ik21Var.k = dsk0Var2;
                        int iC2 = l1d.C(iB2);
                        if (iC2 == 0) {
                            string = resources.getString(2131961248);
                        } else if (iC2 != 1) {
                            eg.o();
                        } else {
                            string = resources.getString(2131961249);
                        }
                        int iC3 = l1d.C(iB2);
                        if (iC3 == 0) {
                            string2 = resources.getString(2131961246, str);
                            string2.getClass();
                        } else if (iC3 != 1) {
                            eg.o();
                        } else {
                            string2 = resources.getString(2131961247, str);
                            string2.getClass();
                        }
                        Parcelable ck21Var2 = new ck21(string, string2, resources.getString(2131961245), resources.getString(2131961244));
                        zj21 zj21VarA2 = uww0Var.a();
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("model", ck21Var2);
                        zj21VarA2.T0(bundle2);
                        zj21VarA2.g1(th30Var, "ReportBlockingDialogFragment");
                    }
                    break;
                } else if (!gk21Var.equals(ek21Var)) {
                    eg.o();
                } else {
                    ik21Var.i.c();
                    ik21Var.h = null;
                }
                break;
        }
    }
}
