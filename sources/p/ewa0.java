package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ewa0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gwa0 b;

    public /* synthetic */ ewa0(gwa0 gwa0Var, byte b) {
        this.a = b;
        this.b = gwa0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        byte b = this.a;
        gwa0 gwa0Var = this.b;
        switch (b) {
            case 0:
                ((lzn0) gwa0Var.b).e();
                break;
            default:
                swa0 swa0Var = (swa0) gwa0Var.c;
                Parcelable.Creator creator = twa0.CREATOR;
                rzn1.t();
                swa0Var.d = twa0.N0;
                Bundle bundle = new Bundle();
                t8w t8wVar = (t8w) gwa0Var.e;
                bundle.putInt("entry-point-pages-count", t8wVar.a + 1);
                uxa0 uxa0Var = t8wVar.b;
                if (u890.j(uxa0Var, txa0.a) || (uxa0Var instanceof vxa0)) {
                    str = nik1.r3.a;
                } else if (uxa0Var instanceof uxa0) {
                    str = cfm0.i("spotify:internal:kid-account-transition:consent:", uxa0Var.a, nik1.G3).a;
                } else if (!(uxa0Var instanceof wxa0)) {
                    eg.o();
                } else {
                    eg.m("ParentalConsentTransition should not reach the legacy Education page");
                }
                ((lzn0) gwa0Var.b).a(str, ((c8w) gwa0Var.d).a(str), bundle);
                break;
        }
    }
}
