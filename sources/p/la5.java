package p;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class la5 extends AppCompatImageButton implements tlv {
    public final cdf0 d;
    public final cdf0 e;
    public cja f;
    public boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public la5(Context context) {
        super(context, (AttributeSet) null, 0);
        this.d = bqn1.A(context, 2131886085);
        this.e = bqn1.A(context, 2131886086);
        this.f = new cja();
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(cja cjaVar) {
        if (getDrawable() == null || !cjaVar.equals(this.f)) {
            this.f = cjaVar;
            cdf0 cdf0Var = cjaVar.a == dja.b ? this.d : this.e;
            setImageDrawable(cdf0Var);
            if (this.g) {
                cdf0Var.k();
                this.g = false;
            } else {
                cdf0Var.o((int) cdf0Var.b.k());
            }
            setContentDescription(cjaVar.b);
        }
    }

    public final cdf0 getBell() {
        return this.e;
    }

    public final cdf0 getBellActive() {
        return this.d;
    }

    public dja getState() {
        return this.f.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new cg1(this, iu30Var, (byte) 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEnabled(boolean z) {
        super/*android.view.View*/.setEnabled(z);
        setAlpha(z ? 1.0f : 0.5f);
    }

    public static /* synthetic */ void getBell$annotations() {
    }

    public static /* synthetic */ void getBellActive$annotations() {
    }
}
