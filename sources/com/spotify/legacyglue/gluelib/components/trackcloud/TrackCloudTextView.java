package com.spotify.legacyglue.gluelib.components.trackcloud;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import p.fa30;
import p.zkf1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
class TrackCloudTextView extends EncoreTextView {
    public zkf1 i;

    /* JADX WARN: Multi-variable type inference failed */
    public TrackCloudTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fa30.a(this, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*androidx.appcompat.widget.AppCompatTextView*/.onLayout(z, i, i2, i3, i4);
        zkf1 zkf1Var = this.i;
        String str = zkf1Var.e;
        boolean z2 = zkf1Var.f;
        int lineCount = getLineCount();
        int i5 = lineCount - 1;
        if (TextUtils.isEmpty(str) || lineCount <= 0 || getLayout().getEllipsisCount(i5) <= 0) {
            return;
        }
        SpannableString spannableStringA = zkf1.a(getContext());
        SpannableString spannableString = new SpannableString(str);
        if (z2) {
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
        } else {
            spannableString.setSpan(new ForegroundColorSpan(getContext().getColor(2131101506)), 0, spannableString.length(), 33);
        }
        int lineEnd = getLayout().getLineEnd(i5) - getLayout().getEllipsisCount(i5);
        int length = str.length() + spannableStringA.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        int i6 = lineEnd - length;
        if (i6 >= 0) {
            spannableStringBuilder.delete(i6, spannableStringBuilder.length());
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.delete(this.i.b(length2), length2);
            spannableStringBuilder.append((CharSequence) spannableStringA);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        setText(spannableStringBuilder);
    }

    public TrackCloudTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackCloudTextView(Context context) {
        this(context, null);
    }
}
