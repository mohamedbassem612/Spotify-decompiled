package p;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hc5 extends AppCompatImageButton implements tlv {
    public boolean d;
    public boolean e;
    public final cdf0 f;
    public final cdf0 g;

    /* JADX WARN: Multi-variable type inference failed */
    public hc5(Context context) {
        super(context, (AttributeSet) null, 0);
        this.f = bqn1.A(context, 2131886221);
        this.g = bqn1.A(context, 2131886222);
        setId(2131427581);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public final void f(Object obj) {
        pze0.m(obj);
        throw null;
    }

    public final boolean getAnimateNextRender() {
        return this.e;
    }

    public final cdf0 getStopwatchActivate() {
        return this.f;
    }

    public final cdf0 getStopwatchDeactivate() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new cg1(this, iu30Var, (byte) 7));
    }

    public final void setAnimateNextRender(boolean z) {
        this.e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEnabled(boolean z) {
        super/*android.view.View*/.setEnabled(z);
        setAlpha(z ? 1.0f : 0.5f);
    }

    public static /* synthetic */ void getAnimateNextRender$annotations() {
    }

    public static /* synthetic */ void getStopwatchActivate$annotations() {
    }

    public static /* synthetic */ void getStopwatchDeactivate$annotations() {
    }
}
