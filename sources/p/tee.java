package p;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tee extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h72 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tee(h72 h72Var, byte b) {
        super(0);
        this.a = b;
        this.b = h72Var;
    }

    public final Object invoke() {
        byte b = this.a;
        h72 h72Var = this.b;
        switch (b) {
            case 0:
                return (Group) ((View) h72Var.f).findViewById(2131428216);
            case 1:
                return (LinearLayout) ((View) h72Var.f).findViewById(2131428873);
            case 2:
                return (TextView) ((View) h72Var.f).findViewById(2131430553);
            default:
                return (EditText) ((View) h72Var.f).findViewById(2131430854);
        }
    }
}
