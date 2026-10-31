package p;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.queued.QueuedBadgeView;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.mobius.functions.Consumer;
import com.spotify.scrollsita.v1.Section;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class ptj extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptj(gbn gbnVar, byte b) {
        super(1, gbnVar, gbn.class, "createModel", "createModel(Landroid/os/Bundle;)Lcom/spotify/checkout/countrypickerimpl/domain/CountryPickerModel;", 0);
        this.a = b;
        switch (b) {
            case 16:
                super(1, gbnVar, gbn.class, "saveModel", "saveModel(Lcom/spotify/checkout/countrypickerimpl/domain/CountryPickerModel;)Landroid/os/Bundle;", 0);
                break;
            default:
                break;
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Consumer consumer = ((rtj) ((lyc) this).receiver).b;
                if (consumer != null) {
                    consumer.accept(obj);
                }
                return rih1Var;
            case 1:
                return ((g3h) ((lyc) this).receiver).b((fkt) obj);
            case 2:
                ((Number) obj).intValue();
                ((tbk) ((lyc) this).receiver).getClass();
                return rih1Var;
            case 3:
                ((Consumer) ((lyc) this).receiver).accept((vlk) obj);
                return rih1Var;
            case 4:
                int iIntValue = ((Number) obj).intValue();
                ConstraintLayout constraintLayout = (ConstraintLayout) ((mpk) ((lyc) this).receiver).c.b;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop() + iIntValue, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
                return rih1Var;
            case 5:
                ((f65) ((lyc) this).receiver).a((String) obj);
                return rih1Var;
            case 6:
                return ((sel) ((lyc) this).receiver).a((lnm) obj);
            case 7:
                tx50 tx50Var = (ux50) obj;
                aml amlVar = (aml) ((lyc) this).receiver;
                Context context = amlVar.a;
                ahr ahrVar = amlVar.b;
                boolean z = tx50Var instanceof tx50;
                ngv ngvVar = ngv.e;
                ngv ngvVar2 = ngv.d;
                if (z) {
                    ytw0 ytw0Var = jfv.b;
                    return ahrVar.a(jfv.u(fdg1.l0(tx50Var.a, ngvVar2), ngvVar));
                }
                if (tx50Var instanceof sx50) {
                    sx50 sx50Var = (sx50) tx50Var;
                    long j = sx50Var.b - sx50Var.a;
                    ytw0 ytw0Var2 = jfv.b;
                    String string = context.getString(2131952603, ahrVar.a(jfv.u(fdg1.l0(j, ngvVar2), ngvVar)));
                    string.getClass();
                    return string;
                }
                if (!tx50Var.equals(rx50.a)) {
                    eg.o();
                    return null;
                }
                String string2 = context.getString(2131952600);
                string2.getClass();
                return string2;
            case 8:
                return ((List) ((lyc) this).receiver).get(((Number) obj).intValue());
            case 9:
                return ((List) ((lyc) this).receiver).get(((Number) obj).intValue());
            case 10:
                return ((v3h1) ((lyc) this).receiver).i(((Number) obj).intValue());
            case 11:
                p1m p1mVar = (p1m) ((lyc) this).receiver;
                p1mVar.getClass();
                p1mVar.a(new tzl((txs0) obj));
                return rih1Var;
            case 12:
                p1m p1mVar2 = (p1m) ((lyc) this).receiver;
                p1mVar2.getClass();
                p1mVar2.a(new tzl((txs0) obj));
                return rih1Var;
            case 13:
                ((c4c1) ((lyc) this).receiver).a((l5c1) obj);
                return rih1Var;
            case 14:
                return ((b7n) ((lyc) this).receiver).a((x6n) obj);
            case 15:
                Bundle bundle = (Bundle) obj;
                gbn gbnVar = (gbn) ((lyc) this).receiver;
                gbnVar.getClass();
                ebn ebnVar = bundle != null ? (ebn) jhc1.t(bundle, "VM_STATE_KEY", ebn.class) : null;
                return ebnVar == null ? new ebn(gbnVar.a, "", z6x.a) : ebnVar;
            case 16:
                ((gbn) ((lyc) this).receiver).getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("VM_STATE_KEY", (ebn) obj);
                return bundle2;
            case 17:
                return ((quc0) ((lyc) this).receiver).a((List) obj);
            case 18:
                sbo sboVar = (sbo) obj;
                d8r0 d8r0Var = sboVar.c;
                zbo zboVar = (zbo) ((lyc) this).receiver;
                if (!zboVar.a.l()) {
                    return new ubo(sboVar.e, sboVar.f, sboVar.g, sboVar.i, sboVar.j, sboVar.k, (i2n) null, d8r0Var, sboVar.d, sboVar.b, sboVar.a);
                }
                obo oboVarA = zboVar.b.a.a(sboVar.l.a);
                if (!(oboVarA instanceof mbo)) {
                    return oboVarA instanceof lbo ? tbo.a : new vbo(null);
                }
                mbo mboVar = (mbo) oboVarA;
                sbo sboVar2 = mboVar.a;
                return new ubo(sboVar2.e, sboVar2.f, sboVar2.g, sboVar2.i, sboVar2.j, sboVar2.k, mboVar.b, d8r0Var, sboVar.d, sboVar.b, sboVar.a);
            case 19:
                return ((sko) ((lyc) this).receiver).a.invoke((lnm) obj);
            case 20:
                int iIntValue2 = ((Number) obj).intValue();
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ((imr) ((lyc) this).receiver).b.b;
                constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), constraintLayout2.getPaddingTop() + iIntValue2, constraintLayout2.getPaddingRight(), constraintLayout2.getPaddingBottom());
                return rih1Var;
            case 21:
                int iIntValue3 = ((Number) obj).intValue();
                zmr zmrVar = (zmr) ((lyc) this).receiver;
                zmrVar.U0 = iIntValue3;
                zmrVar.u();
                return rih1Var;
            case 22:
                nqs nqsVar = (nqs) ((lyc) this).receiver;
                nqsVar.c.invoke(nqsVar, (kub1) obj);
                return rih1Var;
            case 23:
                ((QueuedBadgeView) ((atr) ((lyc) this).receiver).c.t).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return rih1Var;
            case 24:
                ((FrameLayout) ((atr) ((lyc) this).receiver).c.e).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return rih1Var;
            case 25:
                ((ContentRestrictionBadgeView) ((atr) ((lyc) this).receiver).c.X).c((k4m) obj);
                return rih1Var;
            case 26:
                zkt0 zkt0Var = (zkt0) obj;
                atr atrVar = (atr) ((lyc) this).receiver;
                atrVar.g.setValue(zkt0Var);
                ((ComposeView) atrVar.c.i).setVisibility(zkt0Var != zkt0.c ? 0 : 8);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                List list = (List) obj;
                atr atrVar2 = (atr) ((lyc) this).receiver;
                FacePileView facePileView = atrVar2.d;
                gw70 gw70Var = atrVar2.a;
                if (!list.isEmpty()) {
                    list.subList(1, list.size());
                }
                tto1.s(gw70Var, (af10) null, facePileView.a, list, facePileView.c, (List) null);
                return rih1Var;
            case 28:
                aak0 aak0Var = (aak0) obj;
                atr atrVar3 = (atr) ((lyc) this).receiver;
                atrVar3.h.setValue(aak0Var);
                ((ComposeView) atrVar3.c.h).setVisibility(aak0Var != null ? 0 : 8);
                return rih1Var;
            default:
                ((TextView) ((atr) ((lyc) this).receiver).c.d).setText((String) obj);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ptj(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }
}
