package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class HelpTextView extends LinearLayout {
    TextView bodyTextView;
    TextView headerTextView;

    public HelpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setTextAndVisibility(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    public View asView() {
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(2131427934);
        textView.getClass();
        this.headerTextView = textView;
        TextView textView2 = (TextView) findViewById(2131427933);
        textView2.getClass();
        this.bodyTextView = textView2;
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        setTextAndVisibility(this.headerTextView, charSequence);
        setTextAndVisibility(this.bodyTextView, charSequence2);
    }
}
