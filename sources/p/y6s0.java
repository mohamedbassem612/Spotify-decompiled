package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextWatcher;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y6s0 implements z6s0, Connectable, c7k1 {
    public final View a;
    public final f69 b;
    public final t8h1 c;
    public final Context d;
    public final EditText e;
    public final TextView f;
    public final Button g;

    public y6s0(View view, f69 f69Var, t8h1 t8h1Var) {
        this.a = view;
        this.b = f69Var;
        this.c = t8h1Var;
        this.d = view.getContext();
        this.e = (EditText) view.findViewById(2131429651);
        this.f = (TextView) view.findViewById(2131430292);
        this.g = (Button) view.findViewById(2131430294);
    }

    public final Connection L(Consumer consumer) {
        TextWatcher mcaVar = new mca(consumer, (byte) 1);
        EditText editText = this.e;
        editText.addTextChangedListener(mcaVar);
        editText.setOnFocusChangeListener(new xyw(consumer, (byte) 1));
        editText.setOnEditorActionListener(new wyw(consumer, (byte) 1));
        this.g.setOnClickListener(new f1b(consumer, (byte) 12));
        b8k1.s(editText, new String[]{"text/*"}, new a69(new m42(consumer, (byte) 23), (byte) 0));
        return new ibn(this, consumer, mcaVar, (byte) 6);
    }

    @Override // p.c7k1
    public final String b() {
        return this.d.getString(2131962532);
    }

    @Override // p.c7k1
    public final void c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        t8h1.n(this.c, yon1.G1("SIGNUP_PASSWORD", "signup/password", 1895, "signup"));
        int i = Build.VERSION.SDK_INT;
        f69 f69Var = this.b;
        EditText editText = this.e;
        if (i >= 26) {
            editText.setImportantForAutofill(((g69) f69Var).a() ? 1 : 8);
        }
        g69 g69Var = (g69) f69Var;
        if (!g69Var.a()) {
            ryn1.z(editText);
        } else {
            if (!g69Var.a()) {
                Logger.k("Autofill is not enabled", new Object[0]);
                return;
            }
            AutofillManager autofillManager = g69Var.b;
            autofillManager.getClass();
            autofillManager.requestAutofill(editText);
        }
    }

    public final void d(boolean z, boolean z2) {
        Context context = this.d;
        EditText editText = this.e;
        if (z) {
            Drawable drawable = context.getDrawable(2131231012);
            WeakHashMap weakHashMap = b8k1.a;
            editText.setBackground(drawable);
            editText.setTextColor(context.getColor(2131101773));
        } else {
            Drawable drawable2 = context.getDrawable(2131231014);
            WeakHashMap weakHashMap2 = b8k1.a;
            editText.setBackground(drawable2);
            editText.setTextColor(context.getColor(2131103273));
        }
        if (z2) {
            TextView textView = this.f;
            b8k1.t(textView, textView.getText());
        }
    }

    @Override // p.c7k1
    public final void a() {
    }
}
