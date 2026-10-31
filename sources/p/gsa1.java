package p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gsa1 implements isw {
    public final FrameLayout a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ AppCompatTextView c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Context f;

    public gsa1(FrameLayout frameLayout, AppCompatTextView appCompatTextView, float f, float f2, Context context) {
        this.b = frameLayout;
        this.c = appCompatTextView;
        this.d = f;
        this.e = f2;
        this.f = context;
        this.a = frameLayout;
    }

    public final void a(Object obj, ysw yswVar) {
        String str;
        dsa1 dsa1Var = (dsa1) obj;
        boolean z = dsa1Var.d;
        FrameLayout frameLayout = this.b;
        frameLayout.setEnabled(z);
        frameLayout.setAlpha(z ? 1.0f : 0.3f);
        int iR = xfo1.r(frameLayout, dsa1Var.c ? 2130968788 : 2130968787);
        AppCompatTextView appCompatTextView = this.c;
        appCompatTextView.setTextColor(iR);
        int i = ((dsa1Var.b + 2) / 5) * 5;
        int i2 = i % 100;
        boolean z2 = i2 == 0;
        appCompatTextView.setTextSize(0, z2 ? this.d : this.e);
        appCompatTextView.setLetterSpacing(z2 ? 0.1f : 0.0f);
        float f = i / 100.0f;
        Locale localeForLanguageTag = Locale.forLanguageTag(upn1.p());
        boolean z3 = i2 == 0;
        if (z3) {
            str = String.format(localeForLanguageTag, "%.0f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        } else {
            str = i % 10 != 0 ? String.format(localeForLanguageTag, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)) : String.format(localeForLanguageTag, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        }
        appCompatTextView.setText(str.concat(z3 ? "×" : "\n×"));
        Context context = this.f;
        frameLayout.setContentDescription(i == 100 ? context.getString(2131959261) : context.getString(2131959262, String.format("%sx", Arrays.copyOf(new Object[]{new DecimalFormat("#.##").format(Float.valueOf(f))}, 1))));
    }

    public final View getView() {
        return this.a;
    }
}
