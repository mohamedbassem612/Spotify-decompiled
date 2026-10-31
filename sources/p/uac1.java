package p;

import android.os.Parcelable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uac1 implements Consumer {
    public final /* synthetic */ r2a1 a;
    public final /* synthetic */ z4c1 b;
    public final /* synthetic */ ptj c;
    public final /* synthetic */ ewn0 d;
    public final /* synthetic */ xh71 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ cmt g;

    public uac1(r2a1 r2a1Var, z4c1 z4c1Var, ptj ptjVar, ewn0 ewn0Var, xh71 xh71Var, String str, cmt cmtVar) {
        this.a = r2a1Var;
        this.b = z4c1Var;
        this.c = ptjVar;
        this.d = ewn0Var;
        this.e = xh71Var;
        this.f = str;
        this.g = cmtVar;
    }

    public final void accept(Object obj) {
        lac1 lac1Var = (lac1) obj;
        r2a1 r2a1Var = this.a;
        i8h1 i8h1Var = (i8h1) r2a1Var.b;
        h4l0 h4l0Var = (h4l0) r2a1Var.c;
        b7x b7xVar = b7x.a;
        tv80 tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), h4l0Var.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
        int i = lac1Var.c;
        z4c1 z4c1Var = this.b;
        z4c1Var.b = i;
        k7b1 k7b1Var = z4c1Var.a;
        this.c.invoke(e5c1.a);
        this.d.f(kas0.a);
        xh71 xh71Var = this.e;
        if (xh71Var != null) {
            n9c1 n9c1Var = (n9c1) k7b1Var.invoke(Integer.valueOf(z4c1Var.b));
            if (!(n9c1Var instanceof l9c1) && !(n9c1Var instanceof m9c1)) {
                eg.o();
                return;
            }
            l9c1 l9c1Var = (n9c1) k7b1Var.invoke(Integer.valueOf(z4c1Var.b));
            if (!(l9c1Var instanceof l9c1)) {
                if (l9c1Var instanceof m9c1) {
                    eg.m("Cannot call story without it being initialised");
                    return;
                } else {
                    eg.o();
                    return;
                }
            }
            ey61 ey61VarC = l9c1Var.a.c();
            if (u890.j(ey61VarC, dy61.a)) {
                k220.f("Trying to share a non shareable story for feature ".concat(this.f));
            } else if (ey61VarC instanceof ey61) {
                xh71Var.a((wa71) null, mno1.h(new mmr0[]{new mmr0("storytelling.share.loader_params", (Parcelable) ey61VarC.a.create().b), new mmr0("storytelling.share.destination_list_configuration", this.g)}), new vm71(lac1Var.d), tv80VarM, Collections.singletonList(acc1.a));
            } else {
                eg.o();
            }
        }
    }
}
