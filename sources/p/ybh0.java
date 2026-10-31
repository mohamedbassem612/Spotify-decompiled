package p;

import android.view.View;
import com.google.android.material.datepicker.c;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Calendar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ybh0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c b;
    public final /* synthetic */ zbh0 c;

    public /* synthetic */ ybh0(zbh0 zbh0Var, c cVar, byte b) {
        this.a = b;
        this.c = zbh0Var;
        this.b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        c cVar = this.b;
        zbh0 zbh0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iF1 = zbh0Var.M1.getLayoutManager().f1() + 1;
                if (iF1 < zbh0Var.M1.getAdapter().e()) {
                    Calendar calendarA = foi1.a(cVar.e.a.a);
                    calendarA.add(2, iF1);
                    zbh0Var.Z0(new tjm0(calendarA));
                }
                break;
            default:
                int iH1 = zbh0Var.M1.getLayoutManager().h1() - 1;
                if (iH1 >= 0) {
                    Calendar calendarA2 = foi1.a(cVar.e.a.a);
                    calendarA2.add(2, iH1);
                    zbh0Var.Z0(new tjm0(calendarA2));
                }
                break;
        }
    }
}
