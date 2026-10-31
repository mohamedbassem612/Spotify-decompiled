package com.spotify.campaigns.paragraph.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import p.eg;
import p.fpr0;
import p.gpr0;
import p.hpr0;
import p.i15;
import p.ihc1;
import p.ipr0;
import p.ktg0;
import p.l0e1;
import p.l1d;
import p.ma30;
import p.o7h;
import p.ohc0;
import p.p7h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/spotify/campaigns/paragraph/view/ParagraphView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "p/ipr0", "p/gpr0", "p/fpr0", "p/hpr0", "src_main_java_com_spotify_campaigns_paragraph_view-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ParagraphView extends AppCompatTextView {
    public ParagraphView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(SpannableStringBuilder spannableStringBuilder, ipr0 ipr0Var) {
        int length = spannableStringBuilder.length();
        String str = ipr0Var.a;
        int i = ipr0Var.d;
        fpr0 fpr0Var = ipr0Var.e;
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new l0e1(getContext(), ipr0Var.b, ipr0Var.c), length, spannableStringBuilder.length(), 17);
        Integer num = ipr0Var.g;
        if (num != null) {
            spannableStringBuilder.setSpan(new ma30(getContext(), num.intValue()), length, spannableStringBuilder.length(), 17);
        }
        if (fpr0Var != null) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(y(fpr0Var)), length, spannableStringBuilder.length(), 17);
        }
        fpr0 fpr0Var2 = ipr0Var.f;
        if (fpr0Var2 != null) {
            int iY = y(fpr0Var2);
            spannableStringBuilder.setSpan(Build.VERSION.SDK_INT == 29 ? i15.k(iY) : new ohc0(iY), length, spannableStringBuilder.length(), 17);
        }
        if (Color.alpha(i) > 0) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(i), length, spannableStringBuilder.length(), 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(gpr0 gpr0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ipr0 ipr0Var = gpr0Var.a;
        List list = gpr0Var.b;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            ipr0 ipr0Var2 = (ipr0) obj;
            String str = String.format(Locale.ENGLISH, "$%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            int iW0 = ihc1.w0(ipr0Var.a, str, 0, false, 6);
            if (iW0 != -1) {
                arrayList.add(new hpr0(iW0, str.length() + iW0, ipr0Var2));
            }
            i = i2;
        }
        List<hpr0> listL1 = o7h.l1(o7h.a1(arrayList, new ktg0((byte) 11)));
        int i3 = 0;
        for (hpr0 hpr0Var : listL1) {
            w(spannableStringBuilder, ipr0.a(ipr0Var, ipr0Var.a.substring(i3, hpr0Var.a)));
            w(spannableStringBuilder, hpr0Var.c);
            i3 = hpr0Var.b;
        }
        hpr0 hpr0Var2 = (hpr0) o7h.C0(listL1);
        int i4 = hpr0Var2 != null ? hpr0Var2.b : 0;
        if (i4 < ipr0Var.a.length()) {
            w(spannableStringBuilder, ipr0.a(ipr0Var, ipr0Var.a.substring(i4)));
        }
        setText(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int y(fpr0 fpr0Var) {
        float fApplyDimension = fpr0Var.a;
        int iC = l1d.C(fpr0Var.b);
        if (iC != 0) {
            if (iC == 1) {
                fApplyDimension = TypedValue.applyDimension(1, fApplyDimension, getResources().getDisplayMetrics());
            } else {
                if (iC != 2) {
                    eg.o();
                    return 0;
                }
                fApplyDimension = TypedValue.applyDimension(2, fApplyDimension, getResources().getDisplayMetrics());
            }
        }
        return (int) fApplyDimension;
    }

    public ParagraphView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ParagraphView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
