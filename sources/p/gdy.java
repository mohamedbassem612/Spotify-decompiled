package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gdy extends ConstraintLayout implements tlv {
    public final idd1 T0;
    public final zeu U0;
    public final q4u V0;

    /* JADX WARN: Multi-variable type inference failed */
    public gdy(Context context) {
        super(context, (AttributeSet) null, 0);
        LayoutInflater.from(context).inflate(2131624587, (ViewGroup) this);
        this.T0 = new idd1(new mo2(context, (byte) 16));
        zeu zeuVar = new zeu(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.U0 = zeuVar;
        this.V0 = nln.w(new q4u[]{nln.x(cdy.b, nln.v(new v6a(1, this, gdy.class, "renderContentInformation", "renderContentInformation(Lcom/spotify/encoreconsumermobile/elements/entitybody/EntityBody$ContentInformationModel;)V", 0, (byte) 1))), nln.x(ddy.b, nln.v(new gcy(1, this, gdy.class, "renderDescription", "renderDescription(Ljava/lang/String;)V", 0, (byte) 8))), nln.x(edy.b, nln.v(new gcy(1, this, gdy.class, "renderMetadataModel", "renderMetadataModel(Lcom/spotify/encoreconsumermobile/elements/entitymetadata/EntityMetadata$Model;)V", 0, (byte) 9))), nln.x(fdy.b, nln.v(new gcy(1, this, gdy.class, "renderLookDisabled", "renderLookDisabled(Ljava/lang/Boolean;)V", 0, (byte) 10)))});
    }

    private final bf getAccessibilityBreakpointsHelper() {
        return (bf) this.T0.getValue();
    }

    public static final void y(gdy gdyVar, ady adyVar) {
        zeu zeuVar = gdyVar.U0;
        if (adyVar == null) {
            ((gdy) zeuVar.a).findViewById(2131428217).setVisibility(8);
        } else {
            k8p1.o(((gdy) zeuVar.a).findViewById(2131428217), adyVar.a);
            ((gdy) zeuVar.a).findViewById(2131428217).setVisibility(0);
        }
    }

    public final void f(Object obj) {
        this.V0.a((bdy) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(String str) {
        zeu zeuVar = this.U0;
        if (str == null || ihc1.y0(str)) {
            ((EncoreTextView) ((idd1) zeuVar.b).getValue()).setVisibility(8);
            return;
        }
        idd1 idd1Var = (idd1) zeuVar.b;
        idd1 idd1Var2 = (idd1) zeuVar.b;
        ((EncoreTextView) idd1Var.getValue()).setText(ihc1.c1(getContext().getResources().getInteger(2131492887), str));
        ((EncoreTextView) idd1Var2.getValue()).setVisibility(0);
        int iC = getAccessibilityBreakpointsHelper().c(2);
        if (((EncoreTextView) idd1Var2.getValue()).getMaxLines() != iC) {
            ((EncoreTextView) idd1Var2.getValue()).setMaxLines(iC);
        }
    }
}
