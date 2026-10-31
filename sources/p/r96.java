package p;

import android.content.Context;
import android.graphics.Typeface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r96 extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r96(long j, long j2, long j3, String str, String str2, boolean z, ven0 ven0Var) {
        super(1);
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = ven0Var;
    }

    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        EditText editText = new EditText(context);
        editText.setInputType(245761);
        editText.setImeOptions(6);
        editText.setTextColor(r4o1.W(this.a));
        editText.setBackgroundColor(r4o1.W(this.b));
        editText.setHintTextColor(r4o1.W(this.c));
        editText.setHint(this.d);
        Typeface typefaceB = qx21.b(context, 2131296269);
        if (typefaceB == null) {
            typefaceB = Typeface.DEFAULT;
        }
        editText.setTypeface(typefaceB);
        editText.setTextSize(16.0f);
        editText.setFontFeatureSettings("liga 1");
        editText.setGravity(8388659);
        editText.setPadding(0, 0, 0, 0);
        editText.addTextChangedListener(new p96(this.g, (byte) 0));
        String str = this.e;
        editText.setText(str);
        boolean z = this.f;
        editText.setSelection(z ? 0 : str.length());
        if (!z) {
            Object systemService = context.getSystemService("input_method");
            nx2 nx2Var = new nx2(editText, systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null, (byte) 18);
            editText.post(new q96(nx2Var, (byte) 0));
            editText.postDelayed(new q96(nx2Var, (byte) 1), 250L);
        }
        return editText;
    }
}
