package p;

import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ncb0 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qcb0 b;

    public /* synthetic */ ncb0(qcb0 qcb0Var, byte b) {
        this.a = b;
        this.b = qcb0Var;
    }

    public final void b(Object obj) {
        byte b = this.a;
        qcb0 qcb0Var = this.b;
        switch (b) {
            case 0:
                mdb0 mdb0Var = (mdb0) obj;
                mdb0Var.getClass();
                sp00 sp00Var = qcb0Var.N1;
                if (sp00Var == null) {
                    u890.C("viewBinding");
                    throw null;
                }
                boolean z = mdb0Var instanceof idb0;
                ((RecyclerView) sp00Var.d).setVisibility(z ? 0 : 8);
                sp00 sp00Var2 = qcb0Var.N1;
                if (sp00Var2 == null) {
                    u890.C("viewBinding");
                    throw null;
                }
                boolean z2 = mdb0Var instanceof ldb0;
                ((FrameLayout) sp00Var2.c).setVisibility((z2 || (mdb0Var instanceof jdb0)) ? 0 : 8);
                sp00 sp00Var3 = qcb0Var.N1;
                if (sp00Var3 == null) {
                    u890.C("viewBinding");
                    throw null;
                }
                ((ProgressBar) sp00Var3.e).setVisibility(mdb0Var instanceof kdb0 ? 0 : 8);
                List list = z ? ((idb0) mdb0Var).a : z6x.a;
                lcb0 lcb0Var = qcb0Var.G1;
                if (lcb0Var == null) {
                    u890.C("languageSelectionAdaptor");
                    throw null;
                }
                lcb0Var.C(list);
                if (z2) {
                    o3n0 o3n0Var = qcb0Var.K1;
                    if (o3n0Var == null) {
                        u890.C("ubiLogger");
                        throw null;
                    }
                    i8h1 i8h1Var = o3n0Var.a;
                    zbl0 zbl0Var = o3n0Var.b;
                    zbl0Var.getClass();
                    x6h1 x6h1VarC = zbl0Var.a.c();
                    x6h1VarC.i.add(new a7h1("error_view", (String) null, (Integer) null, (String) null, "no_connection"));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = r6h1.c;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                    ver verVar = qcb0Var.M1;
                    if (verVar != null) {
                        verVar.f((e8x) qcb0Var.O1.getValue());
                        return;
                    } else {
                        u890.C("emptyState");
                        throw null;
                    }
                }
                if (mdb0Var instanceof jdb0) {
                    o3n0 o3n0Var2 = qcb0Var.K1;
                    if (o3n0Var2 == null) {
                        u890.C("ubiLogger");
                        throw null;
                    }
                    i8h1 i8h1Var2 = o3n0Var2.a;
                    zbl0 zbl0Var2 = o3n0Var2.b;
                    zbl0Var2.getClass();
                    x6h1 x6h1VarC2 = zbl0Var2.a.c();
                    x6h1VarC2.i.add(new a7h1("error_view", (String) null, (Integer) null, (String) null, "generic_error"));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA2;
                    ((xjn) k7h1Var2).b = r6h1.c;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var2.f(k7h1Var2.a(), (Set) null);
                    ver verVar2 = qcb0Var.M1;
                    if (verVar2 != null) {
                        verVar2.f((e8x) qcb0Var.P1.getValue());
                        return;
                    } else {
                        u890.C("emptyState");
                        throw null;
                    }
                }
                return;
            default:
                cdb0 cdb0Var = (cdb0) obj;
                ocb0 ocb0Var = new ocb0(qcb0Var, (byte) 0);
                if (cdb0Var.a) {
                    return;
                }
                cdb0Var.a = true;
                ocb0Var.invoke(bdb0.a);
                return;
        }
    }
}
