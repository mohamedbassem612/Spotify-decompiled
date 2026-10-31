package p;

import android.widget.RadioGroup;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lj21 implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ sj21 a;

    public lj21(sj21 sj21Var) {
        this.a = sj21Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        sqw0 pqw0Var;
        sj21 sj21Var = this.a;
        Consumer consumer = sj21Var.b;
        bz11 bz11Var = sj21Var.a;
        if (i == ((MaterialRadioButton) bz11Var.k).getId()) {
            pqw0Var = oqw0.a;
        } else if (i == ((MaterialRadioButton) bz11Var.j).getId()) {
            pqw0Var = rqw0.a;
        } else {
            pqw0Var = i == ((MaterialRadioButton) bz11Var.f).getId() ? new pqw0("") : qqw0.a;
        }
        consumer.accept(new ii21(pqw0Var));
    }
}
