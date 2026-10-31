package p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gjn0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hjn0 b;

    public /* synthetic */ gjn0(hjn0 hjn0Var, byte b) {
        this.a = b;
        this.b = hjn0Var;
    }

    public final void accept(Object obj) {
        String string;
        byte b = this.a;
        hjn0 hjn0Var = this.b;
        switch (b) {
            case 0:
                kkn0 kkn0Var = hjn0Var.b;
                dg30 dg30Var = hjn0Var.a;
                int iC = l1d.C(((cjn0) obj).a);
                if (iC == 0) {
                    string = dg30Var.getString(2131963149);
                } else if (iC == 1) {
                    string = dg30Var.getString(2131963140);
                } else if (iC == 2) {
                    string = dg30Var.getString(2131952136);
                } else if (iC == 3) {
                    string = dg30Var.getString(2131952138);
                } else if (iC != 4) {
                    eg.o();
                } else {
                    string = dg30Var.getString(2131952137);
                }
                string.getClass();
                Context context = kkn0Var.a.getContext();
                Uri uri = Uri.parse(string);
                try {
                    oxg1 oxg1Var = new oxg1();
                    ((asn) oxg1Var.d).a = -16777216;
                    oxg1Var.g();
                    oxg1Var.a().j(context, uri);
                } catch (ActivityNotFoundException unused) {
                    kkn0Var.b.a(new khv0("sign_up_display_name", 4, (Map) null, "no_browser"));
                    Toast.makeText(context, 2131958600, 0).show();
                    return;
                }
                break;
            case 1:
                kkn0 kkn0Var2 = hjn0Var.b;
                Context context2 = kkn0Var2.f;
                kkn0Var2.Z.setValue(new j0f0(context2.getString(2131952656), context2.getString(2131952655), null, new h0f0(context2.getString(2131952654), fsm0.O0), null, null, null, null, 244));
                break;
            case 2:
                kkn0 kkn0Var3 = hjn0Var.b;
                Context context3 = kkn0Var3.f;
                kkn0Var3.Z.setValue(new j0f0(context3.getString(2131952660), context3.getString(2131952659), null, new h0f0(context3.getString(2131952654), fsm0.N0), null, null, null, null, 244));
                break;
            default:
                hjn0Var.c.onNext(ip81.a);
                break;
        }
    }
}
