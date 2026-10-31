package p;

import android.net.Uri;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zc31 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad31 b;

    public /* synthetic */ zc31(ad31 ad31Var, byte b) {
        this.a = b;
        this.b = ad31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ad31 ad31Var = this.b;
        switch (b) {
            case 0:
                nxf0 nxf0Var = ad31Var.W1;
                if (nxf0Var == null) {
                    u890.C("magicLinkInstrumentor");
                    throw null;
                }
                nxf0Var.a(new tp80(5, 7, 1));
                kg0 kg0Var = ad31Var.V1;
                if (kg0Var == null) {
                    u890.C("zeroNavigator");
                    throw null;
                }
                kg0.e(kg0Var, new ojt(njt.b, (tv80) null), (ifl1) null);
                ad31Var.X1 = true;
                ad31Var.dismiss();
                return;
            default:
                nxf0 nxf0Var2 = ad31Var.W1;
                if (nxf0Var2 == null) {
                    u890.C("magicLinkInstrumentor");
                    throw null;
                }
                nxf0Var2.a(new tp80(5, 8, 1));
                Uri uri = Uri.parse(ad31Var.P0().getString(2131954275));
                wzn wznVar = new wzn(-16777216, (Object) null, (Object) null, (Object) null);
                oxg1 oxg1Var = new oxg1();
                oxg1Var.d(1, wznVar);
                oxg1Var.g();
                oxg1Var.a().j(ad31Var.P0(), uri);
                ad31Var.X1 = true;
                ad31Var.dismiss();
                return;
        }
    }
}
