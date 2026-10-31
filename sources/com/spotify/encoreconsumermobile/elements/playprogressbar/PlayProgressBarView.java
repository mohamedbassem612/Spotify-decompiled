package com.spotify.encoreconsumermobile.elements.playprogressbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.icons.IconCheckAltFill;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.idd1;
import p.m5n1;
import p.nln;
import p.oqt0;
import p.pqt0;
import p.q4u;
import p.qhl;
import p.qqt0;
import p.r0s0;
import p.tlv;
import p.wao0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/playprogressbar/PlayProgressBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "U0", "Lp/znb0;", "getFullProgressWidth", "()I", "fullProgressWidth", "V0", "getMinProgressWidth", "minProgressWidth", "src_main_java_com_spotify_encoreconsumermobile_elements_playprogressbar-playprogressbar"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlayProgressBarView extends ConstraintLayout implements tlv {
    public static final /* synthetic */ int X0 = 0;
    public final r0s0 T0;
    public final idd1 U0;
    public final idd1 V0;
    public final q4u W0;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131625403, (ViewGroup) this);
        int i2 = 2131427968;
        IconCheckAltFill iconCheckAltFill = (IconCheckAltFill) m5n1.t(this, 2131427968);
        if (iconCheckAltFill != null) {
            i2 = 2131430409;
            ProgressBar progressBar = (ProgressBar) m5n1.t(this, 2131430409);
            if (progressBar != null) {
                i2 = 2131430419;
                EncoreTextView encoreTextViewT = m5n1.t(this, 2131430419);
                if (encoreTextViewT != null) {
                    r0s0 r0s0Var = new r0s0(this, iconCheckAltFill, progressBar, encoreTextViewT, (byte) 15);
                    setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    progressBar.setMax(100);
                    this.T0 = r0s0Var;
                    this.U0 = new idd1(new qqt0(this, (byte) 0));
                    this.V0 = new idd1(new qqt0(this, (byte) 1));
                    this.W0 = nln.w(new q4u[]{nln.v(new wao0(1, this, PlayProgressBarView.class, "renderProgress", "renderProgress(Lcom/spotify/encoreconsumermobile/elements/playprogressbar/PlayProgressBar$Model;)V", 0, (byte) 25)), nln.x(pqt0.a, nln.v(new wao0(1, this, PlayProgressBarView.class, "renderCheckIcon", "renderCheckIcon(Z)V", 0, (byte) 26))), nln.v(new wao0(1, this, PlayProgressBarView.class, "renderText", "renderText(Lcom/spotify/encoreconsumermobile/elements/playprogressbar/PlayProgressBar$Model;)V", 0, (byte) 27))});
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final int getFullProgressWidth() {
        return ((Number) this.U0.getValue()).intValue();
    }

    private final int getMinProgressWidth() {
        return ((Number) this.V0.getValue()).intValue();
    }

    public final void f(Object obj) {
        this.W0.a((oqt0) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        r0s0 r0s0Var = this.T0;
        ProgressBar progressBar = (ProgressBar) r0s0Var.c;
        ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = (qhl) layoutParams;
        ((ViewGroup.MarginLayoutParams) qhlVar).width = getFullProgressWidth();
        progressBar.setLayoutParams(qhlVar);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
        int measuredWidth = getMeasuredWidth();
        if (mode == 0 || measuredWidth <= size) {
            return;
        }
        int fullProgressWidth = size - (measuredWidth - getFullProgressWidth());
        int minProgressWidth = getMinProgressWidth();
        if (fullProgressWidth < minProgressWidth) {
            fullProgressWidth = minProgressWidth;
        }
        int fullProgressWidth2 = getFullProgressWidth();
        if (fullProgressWidth > fullProgressWidth2) {
            fullProgressWidth = fullProgressWidth2;
        }
        ProgressBar progressBar2 = (ProgressBar) r0s0Var.c;
        ViewGroup.LayoutParams layoutParams2 = progressBar2.getLayoutParams();
        if (layoutParams2 == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar2 = (qhl) layoutParams2;
        ((ViewGroup.MarginLayoutParams) qhlVar2).width = fullProgressWidth;
        progressBar2.setLayoutParams(qhlVar2);
        super.onMeasure(i, i2);
    }

    public PlayProgressBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PlayProgressBarView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PlayProgressBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
