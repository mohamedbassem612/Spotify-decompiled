package p;

import android.content.DialogInterface;
import android.view.View;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h7t implements DialogInterface.OnClickListener {
    public final /* synthetic */ cp31 a;
    public final /* synthetic */ rrk0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;

    public h7t(cp31 cp31Var, rrk0 rrk0Var, String str, boolean z, String str2) {
        this.a = cp31Var;
        this.b = rrk0Var;
        this.c = str;
        this.d = z;
        this.e = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cp31 cp31Var = this.a;
        i8h1 i8h1Var = (i8h1) cp31Var.c;
        x6h1 x6h1VarC = this.b.b.c();
        String str = this.c;
        x6h1VarC.i.add(new a7h1("delete_button", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("delete_episode", 2, Collections.singletonMap("episode_uri", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        kt91 kt91Var = (kt91) cp31Var.e;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962975});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        kt91Var.k(new er91((fs91) null, "", 2131962975, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        fn31.T(cto1.q((dg30) cp31Var.d), (q8n) cp31Var.f, 0, new zlo(cp31Var, str, this.e, (lnm) null, (byte) 23), 2);
        if (this.d) {
            ((lzn0) cp31Var.b).e();
        }
    }
}
