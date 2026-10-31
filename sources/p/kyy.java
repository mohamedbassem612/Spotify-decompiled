package p;

import android.content.Context;
import android.text.style.LeadingMarginSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.playindicator.PlayIndicatorComposeView;
import com.spotify.encoremobile.component.icons.EncoreIconView;
import com.spotify.encoremobile.component.slottextview.EncoreTitleView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kyy extends ConstraintLayout implements tlv {
    public final idd1 T0;
    public final yjq U0;
    public final int V0;
    public final int W0;
    public final int X0;
    public final LeadingMarginSpan.Standard Y0;
    public PlayIndicatorComposeView Z0;
    public final q4u a1;

    public kyy(Context context) {
        super(context, null, 0);
        this.T0 = new idd1(new mo2(context, (byte) 21));
        yjq yjqVarS = yjq.s(LayoutInflater.from(context), this);
        yjqVarS.o().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.U0 = yjqVarS;
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165962);
        this.V0 = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165960);
        this.W0 = dimensionPixelSize2;
        this.X0 = getResources().getDimensionPixelSize(2131165963);
        this.Y0 = new LeadingMarginSpan.Standard(dimensionPixelSize + dimensionPixelSize2, 0);
        EncoreIconView encoreIconView = (EncoreIconView) yjqVarS.e;
        int i = encoreIconView.getLayoutParams().width;
        ViewGroup.LayoutParams layoutParams = encoreIconView.getLayoutParams();
        new LeadingMarginSpan.Standard(i + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0), 0);
        this.a1 = nln.w(new q4u[]{nln.x(hyy.b, nln.v(new sty(this, (byte) 8))), nln.x(iyy.b, nln.v(new sty(this, (byte) 9))), nln.x(jyy.b, nln.v(new sty(this, (byte) 10))), nln.x(a9o.N0, nln.v(new s20(this, (byte) 24))), nln.x(auy.e1, nln.v(new nty(this, (byte) 6))), nln.x(gyy.b, nln.v(new sty(this, (byte) 7)))});
    }

    private final bf getAccessibilityBreakpointsHelper() {
        return (bf) this.T0.getValue();
    }

    @Override // p.mi90
    public final void f(Object obj) {
        this.a1.a((vxy) obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void y(ayy ayyVar) throws NoWhenBranchMatchedException {
        int iOrdinal;
        int iOrdinal2 = ayyVar.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
            iOrdinal = ayyVar.ordinal() + 1;
        } else {
            if (iOrdinal2 != 3) {
                eg.o();
                return;
            }
            iOrdinal = Integer.MAX_VALUE;
        }
        int iC = getAccessibilityBreakpointsHelper().c(iOrdinal);
        yjq yjqVar = this.U0;
        if (((EncoreTitleView) yjqVar.f).getMaxLines() != iC) {
            ((EncoreTitleView) yjqVar.f).setMaxLines(iC);
        }
    }
}
