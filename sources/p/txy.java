package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.slottextview.EncoreSubtitleView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class txy extends LinearLayout implements tlv {
    public final idd1 a;
    public final zbs b;
    public gw70 c;
    public final yjq d;
    public final q4u e;

    public txy(Context context) {
        super(context, null, 0);
        this.a = new idd1(new mo2(context, (byte) 20));
        zbs zbsVar = new zbs(context);
        this.b = zbsVar;
        yjq yjqVarR = yjq.r(LayoutInflater.from(context), this);
        yjqVarR.o().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView((ConstraintLayout) zbsVar.b.c, indexOfChild((EncoreSubtitleView) yjqVarR.f));
        this.d = yjqVarR;
        this.e = nln.w(new q4u[]{nln.x(oxy.b, nln.v(new sty(this, (byte) 3))), nln.x(pxy.b, nln.v(new sty(this, (byte) 4))), nln.x(qxy.b, nln.v(new sty(this, (byte) 5))), nln.x(rxy.b, nln.v(new sty(this, (byte) 6))), nln.x(sxy.b, nln.v(new sty(this, (byte) 1))), nln.x(nxy.b, nln.v(new sty(this, (byte) 2)))});
    }

    private final bf getAccessibilityBreakpointsHelper() {
        return (bf) this.a.getValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(lxy lxyVar) throws NoWhenBranchMatchedException {
        int iOrdinal;
        int iOrdinal2 = lxyVar.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
            iOrdinal = lxyVar.ordinal() + 1;
        } else {
            if (iOrdinal2 != 3) {
                eg.o();
                return;
            }
            iOrdinal = Integer.MAX_VALUE;
        }
        int iC = getAccessibilityBreakpointsHelper().c(iOrdinal);
        yjq yjqVar = this.d;
        if (((EncoreSubtitleView) yjqVar.f).getMaxLines() != iC) {
            ((EncoreSubtitleView) yjqVar.f).setMaxLines(iC);
        }
    }

    @Override // p.mi90
    public final void f(Object obj) {
        this.e.a((gxy) obj);
    }

    public final gw70 getImageLoader() {
        return this.c;
    }

    public final void setImageLoader(gw70 gw70Var) {
        this.c = gw70Var;
    }
}
