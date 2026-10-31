package p;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.messaging.messagingplatformdebug.items.DelayChooser;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lgh implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public lgh(co6 co6Var, Consumer consumer) {
        this.a = (byte) 5;
        this.c = co6Var;
        this.b = consumer;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((Consumer) obj2).accept(new fph(String.valueOf(editable)));
                ((ogh) obj).b(editable);
                break;
            case 1:
                int i = DelayChooser.c;
                ((iu30) obj2).invoke(Integer.valueOf(((DelayChooser) obj).a()));
                break;
            case 2:
                FindInContextView findInContextView = (FindInContextView) obj2;
                findInContextView.V0.setVisibility((editable == null || editable.length() == 0) ? 8 : 0);
                ((iu30) obj).invoke(new sg20(String.valueOf(editable), findInContextView.U0.isFocused()));
                break;
            case 3:
            case 4:
            case 5:
                break;
            default:
                wts0 wts0Var = (wts0) obj;
                ((Button) ((p1f0) obj2).g).setEnabled(String.valueOf(editable).length() > 0 && wts0Var.Z0().X != null);
                if (editable != null && editable.length() != 0) {
                    yts0 yts0VarZ0 = wts0Var.Z0();
                    if (!yts0VarZ0.t) {
                        yts0VarZ0.t = true;
                        i8h1 i8h1Var = yts0VarZ0.e;
                        h4l0 h4l0Var = yts0VarZ0.h;
                        h4l0Var.getClass();
                        x6h1 x6h1VarC = h4l0Var.b.c();
                        x6h1VarC.i.add(new a7h1("phone_number_field", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        i8h1Var.j(new w7h1("", "", new z7h1("key_stroke", 1, b7x.a), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()));
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String string;
        byte b = this.a;
        Object obj = this.b;
        b7x b7xVar = b7x.a;
        Object obj2 = this.c;
        switch (b) {
            case 3:
                wva0 wva0Var = (wva0) obj2;
                ((Consumer) obj).accept(new mva0(String.valueOf(charSequence), (String) wva0Var.i, (String) wva0Var.h));
                if (!u890.j((String) wva0Var.g, String.valueOf(charSequence))) {
                    ic9 ic9Var = (ic9) wva0Var.b;
                    i8h1 i8h1Var = (i8h1) ic9Var.b;
                    x6h1 x6h1VarC = ((h7l0) ic9Var.c).b.c();
                    x6h1VarC.i.add(new a7h1("birthday_input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "birthday")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                if (charSequence == null || (string = charSequence.toString()) == null) {
                    string = "";
                }
                wva0Var.g = string;
                break;
            case 4:
                ((Consumer) obj).accept(new vli0(String.valueOf(charSequence)));
                yge0 yge0Var = (yge0) ((spk) obj2).c;
                i8h1 i8h1Var2 = (i8h1) yge0Var.b;
                ksk0 ksk0Var = (ksk0) yge0Var.c;
                x6h1 x6h1VarC2 = ksk0Var.c.c();
                x6h1VarC2.i.add(new a7h1("birthday_input_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "birthday")), x6h1VarC2.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
                break;
            case 5:
                j2e0 j2e0Var = (j2e0) ((co6) obj2).c;
                i8h1 i8h1Var3 = (i8h1) j2e0Var.b;
                ksk0 ksk0Var2 = (ksk0) j2e0Var.c;
                x6h1 x6h1VarC3 = ksk0Var2.c.c();
                x6h1VarC3.i.add(new a7h1("name_input_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "name")), x6h1VarC3.a(), ksk0Var2.b, System.currentTimeMillis()), (xj61) null);
                ((Consumer) obj).accept(new kmi0(String.valueOf(charSequence)));
                break;
        }
    }

    public /* synthetic */ lgh(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }
}
