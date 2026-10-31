package p;

import android.widget.Button;
import android.widget.TextView;
import com.spotify.encoremobile.buttons.TertiaryButtonView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wh70 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh70(uw0 uw0Var, byte b) {
        super(1);
        this.a = b;
        this.b = uw0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uw0 uw0Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                TextView textView = (TextView) uw0Var.f;
                if (textView != null) {
                    textView.setText(str);
                    return rih1Var;
                }
                u890.C("bodyView");
                throw null;
            case 1:
                String str2 = (String) obj;
                Button button = (Button) uw0Var.t;
                if (button == null) {
                    u890.C("positiveButton");
                    throw null;
                }
                button.setText(str2);
                Button button2 = (Button) uw0Var.t;
                if (button2 != null) {
                    button2.setOnClickListener(new xh70(uw0Var, (byte) 0));
                    return rih1Var;
                }
                u890.C("positiveButton");
                throw null;
            default:
                String str3 = (String) obj;
                TertiaryButtonView tertiaryButtonView = (TertiaryButtonView) uw0Var.X;
                if (tertiaryButtonView == null) {
                    u890.C("negativeButton");
                    throw null;
                }
                tertiaryButtonView.setText(str3);
                TertiaryButtonView tertiaryButtonView2 = (TertiaryButtonView) uw0Var.X;
                if (tertiaryButtonView2 != null) {
                    tertiaryButtonView2.setOnClickListener(new xh70(uw0Var, (byte) 1));
                    return rih1Var;
                }
                u890.C("negativeButton");
                throw null;
        }
    }
}
