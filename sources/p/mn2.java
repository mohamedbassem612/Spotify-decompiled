package p;

import android.widget.DatePicker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mn2 implements DatePicker.OnDateChangedListener {
    public final /* synthetic */ nn2 a;

    public mn2(nn2 nn2Var) {
        this.a = nn2Var;
    }

    @Override // android.widget.DatePicker.OnDateChangedListener
    public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        this.a.g.onNext(new qh2(new bi2(i, i2, i3)));
    }
}
