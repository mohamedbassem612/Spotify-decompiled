package p;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.util.Calendar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ioh1 implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ ptf1 a;
    public final /* synthetic */ y7e1 b;
    public final /* synthetic */ iu30 c;

    public ioh1(ptf1 ptf1Var, y7e1 y7e1Var, iu30 iu30Var) {
        this.a = ptf1Var;
        this.b = y7e1Var;
        this.c = iu30Var;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        ptf1 ptf1Var = this.a;
        String strB = ((nwa) ptf1Var.b).b((Calendar) ptf1Var.c, i3, i2, i);
        y7e1 y7e1Var = this.b;
        h4e1 h4e1VarH = y7e1Var.h();
        try {
            h4e1VarH.k(0, h4e1VarH.c.length(), strB);
            y7e1Var.a(h4e1VarH);
            y7e1Var.c();
            this.c.invoke(new dph1(strB));
        } catch (Throwable th) {
            y7e1Var.c();
            throw th;
        }
    }
}
