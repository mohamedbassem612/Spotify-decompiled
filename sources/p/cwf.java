package p;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cwf implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dwf b;

    public /* synthetic */ cwf(dwf dwfVar, byte b) {
        this.a = b;
        this.b = dwfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        dwf dwfVar = this.b;
        switch (b) {
            case 0:
                String str = ((zf30) dwfVar).a1;
                str.getClass();
                awf yvfVar = new yvf(str);
                Bundle bundle = new Bundle();
                bundle.putParcelable("RESULT_KEY", yvfVar);
                sap1.m(dwfVar, "checkout_dialog", bundle);
                bwf bwfVar = dwfVar.W1;
                if (bwfVar != null) {
                    String str2 = ((zf30) dwfVar).a1;
                    str2.getClass();
                    bwfVar.K(str2);
                }
                dwfVar.Z0(false, false);
                break;
            default:
                String str3 = ((zf30) dwfVar).a1;
                str3.getClass();
                awf zvfVar = new zvf(str3);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("RESULT_KEY", zvfVar);
                sap1.m(dwfVar, "checkout_dialog", bundle2);
                bwf bwfVar2 = dwfVar.W1;
                if (bwfVar2 != null) {
                    String str4 = ((zf30) dwfVar).a1;
                    str4.getClass();
                    bwfVar2.t(str4);
                }
                dwfVar.Z0(false, false);
                break;
        }
    }
}
