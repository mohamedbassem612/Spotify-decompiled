package com.spotify.allboarding.allboardingimpl.search.ui;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import p.au9;
import p.fa30;
import p.ifb1;
import p.m3f1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public class BackKeyEditText extends AppCompatEditText {
    public au9 h;

    public BackKeyEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public au9 getListener() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        ifb1 ifb1Var;
        if (i != 4 || keyEvent.getAction() != 1 || (ifb1Var = this.h) == null) {
            return super/*android.view.View*/.onKeyPreIme(i, keyEvent);
        }
        ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) ifb1Var.b;
        m3f1 m3f1Var = ToolbarSearchFieldView.R0;
        toolbarSearchFieldView.N0.c();
        return true;
    }

    public void setBackKeyListener(au9 au9Var) {
        this.h = au9Var;
    }

    public BackKeyEditText(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BackKeyEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fa30.a(this, context);
    }
}
