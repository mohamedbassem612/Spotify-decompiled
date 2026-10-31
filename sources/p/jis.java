package p;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jis implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jis(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                EditText editText = ((oxw0) obj2).c;
                if (i != 6) {
                    return false;
                }
                ryn1.v(editText);
                String string = editText.getText().toString();
                if (ihc1.y0(string)) {
                    return true;
                }
                ((iu30) obj).invoke(new kxw0(string));
                return true;
            default:
                hxf0 hxf0Var = (hxf0) obj2;
                if (i == 6 && !TextUtils.isEmpty(textView.getText())) {
                    hxf0Var.b.a(new tp80(2, 3, 2));
                    qhe0 qhe0Var = hxf0Var.e;
                    ydl0 ydl0Var = hxf0Var.f;
                    ydl0Var.getClass();
                    x6h1 x6h1VarC = ydl0Var.a.c();
                    x6h1VarC.i.add(new a7h1("magiclink_send_request_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    w6b1 w6b1VarA = f7b1.a(blc0.wa);
                    String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                    if (str == null) {
                        str = "";
                    }
                    nyn1.Q(hxf0Var.h, new lsn0((String) null, qhe0Var.j(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis())).a));
                    ((Consumer) obj).accept(new bk80(hxf0Var.P0.getText().toString()));
                }
                return false;
        }
    }
}
