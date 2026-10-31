package p;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.EditText;
import j$.time.LocalDate;
import java.util.Calendar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l6r implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l6r(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((iu30) ((ven0) obj).getValue()).invoke(LocalDate.of(i, i2 + 1, i3));
                break;
            case 1:
                wva0 wva0Var = (wva0) obj;
                ((EditText) ((p410) wva0Var.d).c).setText(((nwa) wva0Var.c).b((Calendar) wva0Var.e, i3, i2, i));
                break;
            case 2:
                spk spkVar = (spk) obj;
                ((EditText) ((wmy) spkVar.g).b).setText(((nwa) spkVar.b).b((Calendar) spkVar.h, i3, i2, i));
                break;
            default:
                ((iu30) obj).invoke(new qci1(i, i2, i3));
                break;
        }
    }
}
