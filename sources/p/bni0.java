package p;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bni0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gwa0 b;

    public /* synthetic */ bni0(gwa0 gwa0Var, byte b) {
        this.a = b;
        this.b = gwa0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        gwa0 gwa0Var = this.b;
        switch (b) {
            case 0:
                hwa0 hwa0Var = (hwa0) gwa0Var.d;
                lik1 lik1Var = nik1.x3;
                String str = lik1Var.a;
                boolean z = hwa0Var.b;
                if (z) {
                    str = nik1.P3.a;
                }
                vnd1 vnd1Var = (vnd1) gwa0Var.c;
                i8h1 i8h1Var = (i8h1) vnd1Var.b;
                x6h1 x6h1VarC = ((pdl0) vnd1Var.c).b.c();
                x6h1VarC.i.add(new a7h1("create_kid_account_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                Bundle bundle = null;
                tv80 tv80VarM = i8h1Var.m(w7h1Var, (xj61) null);
                String str2 = lik1Var.a;
                String str3 = z ? nik1.P3.a : str2;
                if (u890.j(str3, str2)) {
                    bundle = new Bundle();
                    bundle.putInt("education-entry-point-pages-count", 1);
                }
                hwa0Var.a.a(str3, tv80VarM, bundle);
                break;
            default:
                ((vnd1) gwa0Var.c).p();
                t2b.n(((gni0) gwa0Var.b).g, ((FrameLayout) gwa0Var.g).getContext());
                break;
        }
    }
}
