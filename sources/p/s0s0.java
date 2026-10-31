package p;

import android.view.View;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s0s0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t0s0 b;

    public /* synthetic */ s0s0(t0s0 t0s0Var, byte b) {
        this.a = b;
        this.b = t0s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        t0s0 t0s0Var = this.b;
        switch (b) {
            case 0:
                tzr0 tzr0Var = t0s0Var.F1;
                if (tzr0Var == null) {
                    u890.C("logger");
                    throw null;
                }
                slc0 slc0Var = t0s0Var.H1;
                if (slc0Var == null) {
                    u890.C("linkingId");
                    throw null;
                }
                x6h1 x6h1VarC = ((pdl0) tzr0Var.e).b.c();
                x6h1VarC.i.add(new a7h1("account_linking_error_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                fq7.C((xov0) tzr0Var.c).flatMapCompletable(new r0s0((Object) tzr0Var, (Object) slc0Var, (Object) ((i8h1) tzr0Var.d).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "com.osp.app.signin")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a, (byte) 0)).subscribe();
                v0s0 v0s0Var = t0s0Var.G1;
                if (v0s0Var != null) {
                    v0s0Var.a();
                    return;
                } else {
                    u890.C("navigator");
                    throw null;
                }
            case 1:
                dg30 dg30VarF0 = t0s0Var.f0();
                if (dg30VarF0 != null) {
                    th30 th30VarE0 = dg30VarF0.e0();
                    th30VarE0.getClass();
                    nu9 nu9Var = new nu9(th30VarE0);
                    nu9Var.m(t0s0Var);
                    nu9Var.f();
                    dg30VarF0.finish();
                    return;
                }
                return;
            default:
                dg30 dg30VarF1 = t0s0Var.f0();
                if (dg30VarF1 != null) {
                    th30 th30VarE1 = dg30VarF1.e0();
                    th30VarE1.getClass();
                    nu9 nu9Var2 = new nu9(th30VarE1);
                    nu9Var2.m(t0s0Var);
                    nu9Var2.f();
                    dg30VarF1.finish();
                    return;
                }
                return;
        }
    }
}
