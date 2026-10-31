package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import p.b8k1;
import p.w611;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b extends w611 {
    public final TextView U0;
    public final MaterialCalendarGridView V0;

    public b(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(2131429999);
        this.U0 = textView;
        b8k1.q(textView, true);
        this.V0 = (MaterialCalendarGridView) linearLayout.findViewById(2131429993);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
