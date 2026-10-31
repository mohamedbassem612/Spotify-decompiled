package p;

import android.view.View;
import android.widget.CheckBox;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e7s implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ goq b;

    public /* synthetic */ e7s(goq goqVar, byte b) {
        this.a = b;
        this.b = goqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        goq goqVar = this.b;
        switch (b) {
            case 0:
                boolean zIsChecked = ((CheckBox) view).isChecked();
                iu30 iu30Var = (iu30) goqVar.f;
                if (!zIsChecked) {
                    iu30Var.invoke(qsg0.a);
                } else {
                    iu30Var.invoke(psg0.a);
                }
                break;
            default:
                ((iu30) goqVar.f).invoke(rsg0.a);
                break;
        }
    }
}
