package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c741 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e741 b;

    public /* synthetic */ c741(e741 e741Var, byte b) {
        this.a = b;
        this.b = e741Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        e741 e741Var = this.b;
        switch (b) {
            case 0:
                x4f1.b(e741Var.d);
                zdr zdrVar = e741Var.g;
                fq7.C(zdrVar.d).flatMapCompletable(new ydr(zdrVar, e741Var.j, 6, (byte) 0)).subscribe();
                e741Var.a.startActivityForResult(e741Var.f.a(e741Var.j), 5436);
                break;
            default:
                x4f1.b(e741Var.d);
                e741Var.g.a();
                View view2 = e741Var.i;
                if (view2 != null) {
                    x4f1 x4f1Var = e741Var.d;
                    sus susVar = e741Var.e;
                    px81 px81Var = new px81();
                    px81Var.i = e741Var.a.getString(2131959303);
                    ((l5f1) px81Var).b = new b741(e741Var, (byte) 0);
                    ((l5f1) px81Var).c = new b741(e741Var, (byte) 1);
                    x4f1.a(x4f1Var, sus.b(susVar, px81Var), view2, new d741(e741Var, (byte) 0), (g5f1) null, 44);
                }
                break;
        }
    }
}
