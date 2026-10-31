package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class azw implements bzw, Connectable, c7k1 {
    public Consumer X;
    public final View a;
    public final f69 b;
    public final t8h1 c;
    public final Context d;
    public final EditText e;
    public final TextView f;
    public final Button g;
    public final ProgressBar h;
    public Disposable i = EmptyDisposable.a;
    public final Scheduler t;

    public azw(View view, f69 f69Var, t8h1 t8h1Var) {
        this.a = view;
        this.b = f69Var;
        this.c = t8h1Var;
        this.d = view.getContext();
        this.e = (EditText) view.findViewById(2131428590);
        this.f = (TextView) view.findViewById(2131428591);
        this.g = (Button) view.findViewById(2131428593);
        this.h = (ProgressBar) view.findViewById(2131428594);
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        this.t = scheduler;
    }

    public final Connection L(Consumer consumer) {
        this.X = consumer;
        zyw zywVar = new zyw(this, consumer, (byte) 0);
        wyw wywVar = new wyw(consumer, (byte) 0);
        EditText editText = this.e;
        editText.setOnEditorActionListener(wywVar);
        editText.addTextChangedListener(zywVar);
        editText.setOnFocusChangeListener(new xyw(consumer, (byte) 0));
        editText.clearFocus();
        this.g.setOnClickListener(new f1b(consumer, (byte) 6));
        b8k1.s(editText, new String[]{"text/*"}, new a69(new m42(consumer, (byte) 15), (byte) 0));
        return new ibn(this, consumer, zywVar, (byte) 2);
    }

    @Override // p.c7k1
    public final void a() {
        this.e.setEnabled(false);
    }

    @Override // p.c7k1
    public final String b() {
        return this.d.getString(2131962529);
    }

    @Override // p.c7k1
    public final void c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        t8h1.n(this.c, yon1.m5());
        EditText editText = this.e;
        editText.setEnabled(true);
        int i = Build.VERSION.SDK_INT;
        f69 f69Var = this.b;
        if (i >= 26) {
            editText.setImportantForAutofill(((g69) f69Var).a() ? 1 : 8);
        }
        g69 g69Var = (g69) f69Var;
        if (g69Var.a()) {
            if (!g69Var.a()) {
                Logger.k("Autofill is not enabled", new Object[0]);
                return;
            }
            AutofillManager autofillManager = g69Var.b;
            autofillManager.getClass();
            autofillManager.requestAutofill(editText);
        }
    }

    public final void d(boolean z) {
        Context context = this.d;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166230);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131166229);
        if (!z) {
            dimensionPixelSize2 = dimensionPixelSize;
        }
        WeakHashMap weakHashMap = b8k1.a;
        this.e.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize2, 0);
        this.h.setVisibility(z ? 0 : 4);
    }

    public final void e(boolean z) {
        Context context = this.d;
        EditText editText = this.e;
        if (z) {
            Drawable drawable = context.getDrawable(2131231012);
            WeakHashMap weakHashMap = b8k1.a;
            editText.setBackground(drawable);
            editText.setTextColor(context.getColor(2131101773));
            return;
        }
        Drawable drawable2 = context.getDrawable(2131231014);
        WeakHashMap weakHashMap2 = b8k1.a;
        editText.setBackground(drawable2);
        editText.setTextColor(context.getColor(2131101774));
    }
}
