package p;

import android.view.View;
import android.widget.Button;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cgg extends fy31 {
    public final /* synthetic */ byte U0;
    public final Button V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cgg(View view, Button button, byte b) {
        super(view);
        this.U0 = b;
        this.V0 = button;
    }

    public final void E(bw31 bw31Var, List list, ym ymVar) {
        byte b = this.U0;
        Button button = this.V0;
        switch (b) {
            case 0:
                button.setOnClickListener(new c20(ymVar, (byte) 17));
                break;
            default:
                button.setOnClickListener(new wa21(ymVar, (qv31) bw31Var, (byte) 6));
                break;
        }
    }
}
