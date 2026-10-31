package p;

import android.content.DialogInterface;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t621 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ t621(byte b, Object obj, String str, boolean z) {
        this.a = b;
        this.b = obj;
        this.c = str;
        this.d = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        String str = this.c;
        byte b2 = 0;
        boolean z = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((mzr0) obj).n(str, z, true);
                break;
            case 1:
                mzr0 mzr0Var = (mzr0) obj;
                ((i8h1) ((wgb) mzr0Var.g).a.get()).f(wgb.a().e(), (Set) null);
                pbh0 pbh0Var = new pbh0((dg30) mzr0Var.a, 0);
                pbh0Var.b(2131954350);
                pbh0 pbh0VarC = pbh0Var.d(2131954349, new t621(b2, mzr0Var, str, z)).c(2131954348, new k6b(mzr0Var));
                ((uh3) pbh0VarC).a.m = new vqt0(mzr0Var);
                pbh0VarC.create().show();
                break;
            default:
                a680 a680Var = (a680) obj;
                i8h1 i8h1Var = (i8h1) a680Var.c;
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-sts-delete-dialog";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarC = x6h1VarI.a().c();
                String str2 = this.c;
                x6h1VarC.i.add(new a7h1("delete_button", (String) null, (Integer) null, str2, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("delete_podcast", 1, Collections.singletonMap("podcast_uri", str2)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                kt91 kt91Var = (kt91) a680Var.e;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962976});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131962976, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                fn31.T(cto1.q((dg30) a680Var.d), (q8n) a680Var.f, 0, new n5s(a680Var, str2, (lnm) null, (byte) 17), 2);
                if (z) {
                    ((lzn0) a680Var.b).e();
                }
                break;
        }
    }
}
