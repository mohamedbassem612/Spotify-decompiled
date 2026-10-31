package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.icons.EncoreIconView;
import com.spotify.encoremobile.component.slottextview.EncorePretitleView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tny extends ConstraintLayout implements tlv {
    public final idd1 T0;
    public final uny U0;
    public final q4u V0;

    /* JADX WARN: Multi-variable type inference failed */
    public tny(Context context) {
        super(context, (AttributeSet) null, 0);
        this.T0 = new idd1(new mo2(context, (byte) 19));
        LayoutInflater.from(context).inflate(2131624594, (ViewGroup) this);
        int i = 2131430481;
        EncoreIconView encoreIconViewT = m5n1.t(this, 2131430481);
        if (encoreIconViewT != null) {
            i = 2131430483;
            EncorePretitleView encorePretitleView = (EncorePretitleView) m5n1.t(this, 2131430483);
            if (encorePretitleView != null) {
                i = 2131430484;
                EncoreIconView encoreIconViewT2 = m5n1.t(this, 2131430484);
                if (encoreIconViewT2 != null) {
                    uny unyVar = new uny(this, encoreIconViewT, encorePretitleView, encoreIconViewT2);
                    setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    this.U0 = unyVar;
                    this.V0 = nln.w(new q4u[]{nln.x(ony.b, nln.v(new gcy(1, this, tny.class, "renderText", "renderText(Ljava/lang/CharSequence;)V", 0, (byte) 22))), nln.x(pny.b, nln.v(new gcy(1, this, tny.class, "renderType", "renderType(Lcom/spotify/encoreconsumermobile/elements/entitypretitle/EntityPretitle$Type;)V", 0, (byte) 23))), nln.x(qny.b, nln.v(new gcy(1, this, tny.class, "renderLeadingIcon", "renderLeadingIcon(Lcom/spotify/encoreconsumermobile/elements/entitypretitle/EntityPretitle$PretitleIcon;)V", 0, (byte) 24))), nln.x(rny.b, nln.v(new gcy(1, this, tny.class, "renderTrailingIcon", "renderTrailingIcon(Lcom/spotify/encoreconsumermobile/elements/entitypretitle/EntityPretitle$PretitleIcon;)V", 0, (byte) 25))), nln.x(sny.b, nln.v(new gcy(1, this, tny.class, "renderTextState", "renderTextState(Lcom/spotify/encoreconsumermobile/elements/entitypretitle/EntityPretitle$TextState;)V", 0, (byte) 20))), nln.x(nny.b, nln.v(new gcy(1, this, tny.class, "renderLookDisabled", "renderLookDisabled(Ljava/lang/Boolean;)V", 0, (byte) 21)))});
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final bf getAccessibilityBreakpointsHelper() {
        return (bf) this.T0.getValue();
    }

    public final void f(Object obj) {
        this.V0.a((jny) obj);
    }

    public final void y(EncoreIconView encoreIconView, kny knyVar) {
        encoreIconView.setVisibility(8);
    }

    public final void z(mny mnyVar) {
        int iOrdinal;
        int iOrdinal2 = mnyVar.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
            iOrdinal = mnyVar.ordinal() + 1;
        } else {
            if (iOrdinal2 != 3) {
                eg.o();
                return;
            }
            iOrdinal = Integer.MAX_VALUE;
        }
        int iC = getAccessibilityBreakpointsHelper().c(iOrdinal);
        uny unyVar = this.U0;
        if (((EncorePretitleView) unyVar.d).getMaxLines() != iC) {
            ((EncorePretitleView) unyVar.d).setMaxLines(iC);
        }
    }
}
