package p;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yyw implements dkl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nxw b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yyw(Object obj, nxw nxwVar, byte b) {
        this.a = b;
        this.c = obj;
        this.b = nxwVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        nxw nxwVar = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                cyw cywVar = (cyw) obj;
                azw azwVar = (azw) obj2;
                Context context = azwVar.d;
                TextView textView = azwVar.f;
                azwVar.d(false);
                Button button = azwVar.g;
                button.setEnabled(false);
                if (!nxwVar.c) {
                    textView.setText(2131962503);
                } else {
                    azwVar.e(false);
                    int i = cywVar.b;
                    if (i == -2) {
                        textView.setText(2131962504);
                    } else if (i == 20) {
                        azwVar.e(true);
                        button.setEnabled(true);
                        textView.setText(context.getString(2131962502) + " " + context.getString(2131962501));
                    } else if (i != 120) {
                        Consumer consumer = azwVar.X;
                        if (consumer != null) {
                            consumer.accept(new exw(nxwVar.b()));
                        }
                    } else {
                        textView.setText(2131962519);
                    }
                    b8k1.t(textView, textView.getText());
                }
                break;
            default:
                dq80 dq80Var = (dq80) obj2;
                boolean z = dq80Var.e;
                ohv0 ohv0Var = dq80Var.a;
                if (!z) {
                    dq80Var.e = true;
                    ohv0Var.a(new mhv0("sign_up_email", "email", ew80.b, (String) null));
                    i8h1 i8h1Var = dq80Var.c;
                    x6h1 x6h1VarC = dq80Var.l.b.c();
                    x6h1VarC.i.add(new a7h1("email_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    i8h1Var.j(new w7h1("", "", new z7h1("key_stroke", 1, b7x.a), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()));
                }
                if (nxwVar.d) {
                    ohv0Var.a(new khv0("sign_up_email", 4, (Map) null, "autofilled_email"));
                }
                break;
        }
    }
}
