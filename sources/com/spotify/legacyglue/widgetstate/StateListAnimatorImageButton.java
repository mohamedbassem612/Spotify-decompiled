package com.spotify.legacyglue.widgetstate;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import java.util.Collections;
import p.b2u;
import p.v9w0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Deprecated
public class StateListAnimatorImageButton extends AppCompatImageButton {
    /* JADX WARN: Multi-variable type inference failed */
    public StateListAnimatorImageButton(Context context) {
        super(context);
        v9w0 v9w0VarO = b2u.o(this);
        Collections.addAll(v9w0VarO.d, this);
        v9w0VarO.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StateListAnimatorImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        v9w0 v9w0VarO = b2u.o(this);
        Collections.addAll(v9w0VarO.d, this);
        v9w0VarO.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StateListAnimatorImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        v9w0 v9w0VarO = b2u.o(this);
        Collections.addAll(v9w0VarO.d, this);
        v9w0VarO.a();
    }
}
