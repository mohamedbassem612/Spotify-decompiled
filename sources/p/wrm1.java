package p;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wrm1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xfx b;
    public final /* synthetic */ p1f0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wrm1(xfx xfxVar, p1f0 p1f0Var, byte b) {
        super(0);
        this.a = b;
        this.b = xfxVar;
        this.c = p1f0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        p1f0 p1f0Var = this.c;
        xfx xfxVar = this.b;
        switch (b) {
            case 0:
                b6s b6sVar = new b6s(xfxVar.e.a(), (byte) 1);
                String string = ((View) ((idd1) p1f0Var.a).getValue()).getContext().getString(2131963990);
                TextView textView = (TextView) b6sVar.d;
                b6sVar.c.setText(string);
                textView.setVisibility(8);
                return b6sVar;
            default:
                b6s b6sVar2 = new b6s(xfxVar.e.a(), (byte) 1);
                String string2 = ((View) ((idd1) p1f0Var.a).getValue()).getContext().getString(2131963991);
                TextView textView2 = (TextView) b6sVar2.d;
                b6sVar2.c.setText(string2);
                textView2.setVisibility(8);
                return b6sVar2;
        }
    }
}
