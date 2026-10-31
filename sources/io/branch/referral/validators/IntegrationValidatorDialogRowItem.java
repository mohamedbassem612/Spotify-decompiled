package io.branch.referral.validators;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import p.kpt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class IntegrationValidatorDialogRowItem extends LinearLayout {
    public static final /* synthetic */ int a = 0;

    public IntegrationValidatorDialogRowItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131625095, (ViewGroup) null);
        addView(viewInflate);
        ((Button) viewInflate.findViewById(2131428464)).setOnClickListener(new kpt(this, context));
    }

    public IntegrationValidatorDialogRowItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
