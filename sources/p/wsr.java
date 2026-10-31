package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artistandaddedbyname.ArtistAndAddedByNameView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.queued.QueuedBadgeView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.processors.ReplayProcessor;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class wsr extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wsr(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke(Object obj) {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((ArtistAndAddedByNameView) ((atr) ((lyc) this).receiver).c.c).setText((String) obj);
                return rih1Var;
            case 1:
                s27 s27Var = (s27) obj;
                atr atrVar = (atr) ((lyc) this).receiver;
                pbq pbqVar = atrVar.c;
                ((ArtworkView) pbqVar.b).h(new g17(s27Var.a));
                ArtworkView artworkView = (ArtworkView) pbqVar.b;
                qhl qhlVar = (qhl) artworkView.getLayoutParams();
                int i2 = s27Var.b;
                qhlVar.G = td6.i(i2);
                ((ViewGroup.MarginLayoutParams) qhlVar).width = i2 == 2 ? atrVar.f : atrVar.e;
                artworkView.setLayoutParams(qhlVar);
                return rih1Var;
            case 2:
                ((EnhancedBadgeView) ((atr) ((lyc) this).receiver).c.g).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return rih1Var;
            case 3:
                ((wzr) ((lyc) this).receiver).Y.invoke((hr3) obj);
                return rih1Var;
            case 4:
                ((Consumer) ((lyc) this).receiver).accept((hr3) obj);
                return rih1Var;
            case 5:
                ((wzr) ((lyc) this).receiver).Y.invoke((hr3) obj);
                return rih1Var;
            case 6:
                ((ReplayProcessor) ((lyc) this).receiver).onNext((kdn) obj);
                return rih1Var;
            case 7:
                return Boolean.valueOf(((dis) ((lyc) this).receiver).a.contains(new gp90(((qo90) obj).c)));
            case 8:
                return Boolean.valueOf(((eis) ((lyc) this).receiver).a.contains(new gp90(((qo90) obj).c)));
            case 9:
                int iIntValue = ((Number) obj).intValue();
                z7x0 z7x0Var = ((vis) ((lyc) this).receiver).c;
                ConstraintLayout constraintLayout = z7x0Var.A;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop() + iIntValue, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
                View view = z7x0Var.v;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = -z7x0Var.A.getPaddingTop();
                view.setLayoutParams(marginLayoutParams);
                return rih1Var;
            case 10:
                ams amsVar = (ams) ((lyc) this).receiver;
                amsVar.getClass();
                return hu20.e(new m441(new us0((ils) obj, amsVar, (lnm) null, (byte) 28)), new b7c((lnm) null, amsVar, (byte) 29));
            case 11:
                int iIntValue2 = ((Number) obj).intValue();
                ConstraintLayout constraintLayout2 = ((arl) ((lyc) this).receiver).a;
                constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), constraintLayout2.getPaddingTop() + iIntValue2, constraintLayout2.getPaddingRight(), constraintLayout2.getPaddingBottom());
                return rih1Var;
            case 12:
                ((QueuedBadgeView) ((fws) ((lyc) this).receiver).c.h).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return rih1Var;
            case 13:
                ((ImageView) ((fws) ((lyc) this).receiver).c.f).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return rih1Var;
            case 14:
                ((FrameLayout) ((fws) ((lyc) this).receiver).c.Z).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return rih1Var;
            case 15:
                aak0 aak0Var = (aak0) obj;
                fws fwsVar = (fws) ((lyc) this).receiver;
                fwsVar.i.setValue(aak0Var);
                ((ComposeView) fwsVar.c.g).setVisibility(aak0Var != null ? 0 : 8);
                return rih1Var;
            case 16:
                ezf1 ezf1Var = (ezf1) obj;
                fws fwsVar2 = (fws) ((lyc) this).receiver;
                EncoreButton encoreButton = (EncoreButton) fwsVar2.c.d;
                encoreButton.setVisibility(ezf1Var != ezf1.a ? 0 : 8);
                ezf1 ezf1Var2 = ezf1.b;
                encoreButton.setIconTintResource(ezf1Var == ezf1Var2 ? 2131102464 : 2131104462);
                if (ezf1Var == ezf1Var2) {
                    encoreButton.setOnClickListener(new zfs(fwsVar2, (byte) 2));
                } else {
                    encoreButton.setOnTouchListener(new lgs(fwsVar2, (byte) 2));
                }
                return rih1Var;
            case 17:
                List list = (List) obj;
                fws fwsVar3 = (fws) ((lyc) this).receiver;
                FacePileView facePileView = fwsVar3.d;
                gw70 gw70Var = fwsVar3.b;
                if (!list.isEmpty()) {
                    list.subList(1, list.size());
                }
                tto1.s(gw70Var, (af10) null, facePileView.a, list, facePileView.c, (List) null);
                return rih1Var;
            case 18:
                s27 s27Var2 = (s27) obj;
                fws fwsVar4 = (fws) ((lyc) this).receiver;
                wdm wdmVar = fwsVar4.c;
                ((ArtworkView) wdmVar.c).h(new g17(s27Var2.a));
                ArtworkView artworkView2 = (ArtworkView) wdmVar.c;
                qhl qhlVar2 = (qhl) artworkView2.getLayoutParams();
                int i3 = s27Var2.b;
                qhlVar2.G = td6.i(i3);
                boolean z = s27Var2.c == 2;
                if (i3 == 2) {
                    i = z ? fwsVar4.N0 : fwsVar4.Z;
                } else {
                    i = z ? fwsVar4.Y : fwsVar4.X;
                }
                ((ViewGroup.MarginLayoutParams) qhlVar2).width = i;
                artworkView2.setLayoutParams(qhlVar2);
                return rih1Var;
            case 19:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fws fwsVar5 = (fws) ((lyc) this).receiver;
                wdm wdmVar2 = fwsVar5.c;
                if (zBooleanValue) {
                    fwsVar5.f = true;
                    fwsVar5.g.setValue(Boolean.FALSE);
                    if (!fwsVar5.h) {
                        fwsVar5.h = true;
                        ((ComposeView) wdmVar2.t).setContent(new j2i(-209555658, new pvs(fwsVar5, (byte) 3), true));
                    }
                    p6p1.u((ComposeView) wdmVar2.t, s5u.a, fwsVar5.O0, fwsVar5.t, 0.0f, 1.0f, new tpj1(kvj1.t, (byte) 8));
                }
                return rih1Var;
            case 20:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                fws fwsVar6 = (fws) ((lyc) this).receiver;
                if (fwsVar6.f) {
                    fwsVar6.g.setValue(bool);
                }
                return rih1Var;
            case 21:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                fws fwsVar7 = (fws) ((lyc) this).receiver;
                if (zBooleanValue2) {
                    fwsVar7.getClass();
                } else if (fwsVar7.f) {
                    fwsVar7.f = false;
                    ComposeView composeView = (ComposeView) fwsVar7.c.t;
                    p6p1.u(composeView, s5u.a, fwsVar7.t, fwsVar7.O0, 1.0f, 0.0f, new mws0(composeView, kvj1.i, (byte) 2));
                }
                return rih1Var;
            case 22:
                ((TextView) ((fws) ((lyc) this).receiver).c.Y).setText((String) obj);
                return rih1Var;
            case 23:
                ArtistAndAddedByNameView artistAndAddedByNameView = (ArtistAndAddedByNameView) ((fws) ((lyc) this).receiver).c.X;
                artistAndAddedByNameView.setText(f6o1.k(artistAndAddedByNameView.getResources(), Collections.singletonList((String) obj)));
                return rih1Var;
            case 24:
                ((ContentRestrictionBadgeView) ((fws) ((lyc) this).receiver).c.i).c((k4m) obj);
                return rih1Var;
            case 25:
                ((EnhancedBadgeView) ((fws) ((lyc) this).receiver).c.e).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return rih1Var;
            case 26:
                int iIntValue3 = ((Number) obj).intValue();
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ((jys) ((lyc) this).receiver).d.b;
                constraintLayout3.setPadding(constraintLayout3.getPaddingLeft(), constraintLayout3.getPaddingTop() + iIntValue3, constraintLayout3.getPaddingRight(), constraintLayout3.getPaddingBottom());
                return rih1Var;
            case 27:
                ((k1t) ((lyc) this).receiver).Q0.invoke((hr3) obj);
                return rih1Var;
            case 28:
                ((Consumer) ((lyc) this).receiver).accept((hr3) obj);
                return rih1Var;
            default:
                ((k1t) ((lyc) this).receiver).Q0.invoke((hr3) obj);
                return rih1Var;
        }
    }
}
