package p;

import android.text.Editable;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zyw extends afe1 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Consumer c;
    public final /* synthetic */ Connectable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyw(Consumer consumer, kkn0 kkn0Var) {
        super((byte) 0);
        this.b = (byte) 2;
        this.c = consumer;
        this.d = kkn0Var;
    }

    @Override // p.afe1, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        switch (this.b) {
            case 1:
                hxf0 hxf0Var = (hxf0) this.d;
                if (!hxf0Var.U0) {
                    hxf0Var.U0 = true;
                    qhe0 qhe0Var = hxf0Var.e;
                    ydl0 ydl0Var = hxf0Var.f;
                    ydl0Var.getClass();
                    x6h1 x6h1VarC = ydl0Var.a.c();
                    x6h1VarC.i.add(new a7h1("email_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    qhe0Var.j(new w7h1("", "", new z7h1("key_stroke", 1, b7x.a), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()));
                }
                this.c.accept(new bk80(editable.toString()));
                break;
            default:
                super.afterTextChanged(editable);
                break;
        }
    }

    @Override // p.afe1, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.b;
        Connectable connectable = this.d;
        Consumer consumer = this.c;
        switch (b) {
            case 0:
                if (((azw) connectable).e.isEnabled()) {
                    consumer.accept(new axw(ihc1.e1(charSequence).toString(), false));
                }
                break;
            case 1:
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                break;
            case 2:
                consumer.accept(new pjn0(charSequence.toString(), ((kkn0) connectable).g.hasFocus()));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zyw(Connectable connectable, Consumer consumer, byte b) {
        super((byte) 0);
        this.b = b;
        this.d = connectable;
        this.c = consumer;
    }
}
