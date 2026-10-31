package p;

import android.view.View;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;
import com.spotify.encoreconsumermobile.elements.entitymetadata.EntityMetadataView;
import com.spotify.encoremobile.component.icons.EncoreIconView;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import com.spotify.encoremobile.component.slottextview.EncorePretitleView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class gcy extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcy(lly llyVar, byte b) {
        super(1, llyVar, lly.class, "updateRowLayoutSize", "updateRowLayoutSize(Lcom/spotify/encoremobile/component/listrow/EncoreListRowLayoutSize;)V", 0);
        this.a = b;
        switch (b) {
            case 14:
                super(1, llyVar, lly.class, "updateMediaAspectRatio", "updateMediaAspectRatio(Lcom/spotify/encoremobile/component/aspectratio/EncoreAspectRatio;)V", 0);
                break;
            case 15:
                super(1, llyVar, lly.class, "updateRowEnabledState", "updateRowEnabledState(Lcom/spotify/encoreconsumermobile/layout/entitylistrow/EntityListRow$EnabledState;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.View, android.view.ViewGroup, p.tny] */
    /* JADX WARN: Type inference failed for: r9v49, types: [android.view.ViewGroup, java.lang.Object, p.gdy] */
    /* JADX WARN: Type inference failed for: r9v89, types: [android.view.View, java.lang.Object, p.tny] */
    public final Object invoke(Object obj) throws Throwable {
        String string;
        int i;
        byte b = this.a;
        int i2 = 0;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ecy ecyVar = (ecy) obj;
                mcy mcyVar = (mcy) ((lyc) this).receiver;
                mcyVar.setContentDescription(ecyVar != null ? hon1.j(ecyVar, mcyVar.getContext()) : null);
                return rih1Var;
            case 1:
                mcy.a((EntityActionView) ((mcy) ((lyc) this).receiver).a.a, (zby) obj);
                return rih1Var;
            case 2:
                mcy.a((EntityActionView) ((mcy) ((lyc) this).receiver).a.b, (zby) obj);
                return rih1Var;
            case 3:
                mcy.a((EntityActionView) ((mcy) ((lyc) this).receiver).a.d, (zby) obj);
                return rih1Var;
            case 4:
                mcy.a((EntityActionView) ((mcy) ((lyc) this).receiver).a.e, (zby) obj);
                return rih1Var;
            case 5:
                ((EntityActionView) ((qcy) ((lyc) this).receiver).a.c).a((zby) obj);
                return rih1Var;
            case 6:
                ((EntityActionView) ((qcy) ((lyc) this).receiver).a.b).a((zby) obj);
                return rih1Var;
            case 7:
                EntityActionView entityActionView = (EntityActionView) ((lyc) this).receiver;
                int i3 = EntityActionView.d;
                entityActionView.c((zby) obj);
                return rih1Var;
            case 8:
                ((gdy) ((lyc) this).receiver).z((String) obj);
                return rih1Var;
            case 9:
                nmy nmyVar = (nmy) obj;
                zeu zeuVar = ((gdy) ((lyc) this).receiver).U0;
                if (nmyVar != null) {
                    ((EntityMetadataView) ((idd1) zeuVar.c).getValue()).f(nmyVar);
                    ((EntityMetadataView) ((idd1) zeuVar.c).getValue()).setVisibility(0);
                } else {
                    ((EntityMetadataView) ((idd1) zeuVar.c).getValue()).setVisibility(8);
                }
                return rih1Var;
            case 10:
                ?? r9 = (gdy) ((lyc) this).receiver;
                r9.getClass();
                float f = u890.j((Boolean) obj, Boolean.TRUE) ? 0.3f : 1.0f;
                while (i2 < r9.getChildCount()) {
                    int i4 = i2 + 1;
                    View childAt = r9.getChildAt(i2);
                    if (childAt == null) {
                        tw20.p();
                        return null;
                    }
                    if (!childAt.equals(((gdy) r9.U0.a).findViewById(2131428217))) {
                        childAt.setAlpha(f);
                    }
                    i2 = i4;
                }
                return rih1Var;
            case 11:
                ((EncoreTextView) ((qhy) ((lyc) this).receiver).a.b).setText((String) obj);
                return rih1Var;
            case 12:
                qhy qhyVar = (qhy) ((lyc) this).receiver;
                qhyVar.getClass();
                qhyVar.setAlpha(u890.j((Boolean) obj, Boolean.TRUE) ? 0.3f : 1.0f);
                return rih1Var;
            case 13:
                svx svxVar = (svx) obj;
                EncoreListRow encoreListRow = ((lly) ((lyc) this).receiver).c;
                if (encoreListRow.getLayoutSize() != svxVar) {
                    encoreListRow.setLayoutSize(svxVar);
                }
                return rih1Var;
            case 14:
                ((lly) ((lyc) this).receiver).c.setMediaAspectRatio((dcx) obj);
                return rih1Var;
            case 15:
                bjy bjyVar = (cjy) obj;
                lly llyVar = (lly) ((lyc) this).receiver;
                EncoreListRow encoreListRow2 = llyVar.c;
                llyVar.e = bjyVar;
                if (bjyVar instanceof bjy) {
                    encoreListRow2.setEnabled(true);
                    nb51 nb51Var = bjyVar.a;
                    if (nb51Var instanceof xiy) {
                        string = llyVar.a.getString(2131954295, Arrays.copyOf(((xiy) nb51Var).b, 0));
                    } else {
                        if (!(nb51Var instanceof yiy)) {
                            eg.o();
                            return null;
                        }
                        string = "";
                    }
                    string.getClass();
                    encoreListRow2.getBinding().a().setContentDescription(string);
                } else {
                    if (!bjyVar.equals(ajy.a)) {
                        eg.o();
                        return null;
                    }
                    encoreListRow2.getBinding().a().setContentDescription(null);
                    encoreListRow2.setEnabled(true);
                }
                return rih1Var;
            case 16:
                jny jnyVar = (jny) obj;
                EncoreListRow encoreListRow3 = (EncoreListRow) ((lyc) this).receiver;
                kyy kyyVarFindViewById = encoreListRow3.getBinding().a.findViewById(2131430482);
                if (jnyVar != null) {
                    kyyVarFindViewById.setVisibility(0);
                    tny tnyVar = (tny) (kyyVarFindViewById instanceof tny ? kyyVarFindViewById : null);
                    if (tnyVar != null) {
                        tnyVar.f(jnyVar);
                    } else {
                        ?? tnyVar2 = new tny(encoreListRow3.getContext());
                        tnyVar2.V0.a(jnyVar);
                        lvx.n(tnyVar2);
                        k8p1.o(kyyVarFindViewById, (View) tnyVar2);
                    }
                } else {
                    kyyVarFindViewById.setVisibility(8);
                }
                return rih1Var;
            case 17:
                vxy vxyVar = (vxy) obj;
                EncoreListRow encoreListRow4 = (EncoreListRow) ((lyc) this).receiver;
                kyy kyyVarFindViewById2 = encoreListRow4.getBinding().a.findViewById(2131431371);
                if (vxyVar != null) {
                    kyyVarFindViewById2.setVisibility(0);
                    kyy kyyVar = kyyVarFindViewById2 instanceof kyy ? kyyVarFindViewById2 : null;
                    if (kyyVar != null) {
                        kyyVar.f(vxyVar);
                    } else {
                        kyy kyyVar2 = new kyy(encoreListRow4.getContext());
                        kyyVar2.a1.a(vxyVar);
                        lvx.n(kyyVar2);
                        b8k1.q(kyyVar2, true);
                        k8p1.o(kyyVarFindViewById2, kyyVar2);
                    }
                } else {
                    kyyVarFindViewById2.setVisibility(8);
                }
                return rih1Var;
            case 18:
                ((mmy) ((lyc) this).receiver).T0.f().h((o17) obj);
                return rih1Var;
            case 19:
                mmy mmyVar = (mmy) ((lyc) this).receiver;
                mmyVar.getClass();
                mmyVar.setAlpha(u890.j((Boolean) obj, Boolean.TRUE) ? 0.3f : 1.0f);
                return rih1Var;
            case 20:
                lny lnyVar = (lny) obj;
                ?? r10 = (tny) ((lyc) this).receiver;
                r10.getClass();
                if (lnyVar.equals(lny.a)) {
                    i = 2130970440;
                } else if (lnyVar.equals(lny.b)) {
                    i = 2130970419;
                } else {
                    if (!lnyVar.equals(lny.c)) {
                        eg.o();
                        return null;
                    }
                    i = 2130970441;
                }
                ((EncorePretitleView) r10.U0.d).setTextColor(xfo1.r((View) r10, i));
                return rih1Var;
            case 21:
                tlv tlvVar = (tny) ((lyc) this).receiver;
                tlvVar.getClass();
                tlvVar.setAlpha(u890.j((Boolean) obj, Boolean.TRUE) ? 0.3f : 1.0f);
                return rih1Var;
            case 22:
                ((EncorePretitleView) ((tny) ((lyc) this).receiver).U0.d).setText((CharSequence) obj);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((tny) ((lyc) this).receiver).z((mny) obj);
                return rih1Var;
            case 24:
                tny tnyVar3 = (tny) ((lyc) this).receiver;
                tnyVar3.y((EncoreIconView) tnyVar3.U0.b, (kny) obj);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                tny tnyVar4 = (tny) ((lyc) this).receiver;
                tnyVar4.y((EncoreIconView) tnyVar4.U0.c, (kny) obj);
                return rih1Var;
            case 26:
                ((dqy) ((lyc) this).receiver).f((String) obj);
                return rih1Var;
            case 27:
                return hu20.e(((xq51) ((lyc) this).receiver).d, new gio0((lnm) null, (String) obj, (byte) 2));
            case 28:
                return hu20.e(((xq51) ((lyc) this).receiver).d, new gio0((lnm) null, (String) obj, (byte) 1));
            default:
                return hu20.e(((xq51) ((lyc) this).receiver).d, new gio0((lnm) null, (String) obj, (byte) 2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcy(EntityActionView entityActionView) {
        super(1, entityActionView, EntityActionView.class, "updateAction", "updateAction(Lcom/spotify/encoreconsumermobile/elements/entityaction/EntityAction$Model;)V", 0);
        this.a = (byte) 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcy(EncoreListRow encoreListRow, byte b) {
        super(1, encoreListRow, lvx.class, "renderPretitle", "renderPretitle(Lcom/spotify/encoremobile/component/listrow/EncoreListRow;Lcom/spotify/encoreconsumermobile/elements/entitypretitle/EntityPretitle$Model;)V", 1);
        this.a = b;
        switch (b) {
            case 17:
                super(1, encoreListRow, lvx.class, "renderTitle", "renderTitle(Lcom/spotify/encoremobile/component/listrow/EncoreListRow;Lcom/spotify/encoreconsumermobile/elements/entitytitle/EntityTitle$Model;)V", 1);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcy(qcy qcyVar, byte b) {
        super(1, qcyVar, qcy.class, "renderStartAction", "renderStartAction(Lcom/spotify/encoreconsumermobile/elements/entityaction/EntityAction$Model;)V", 0);
        this.a = b;
        switch (b) {
            case 6:
                super(1, qcyVar, qcy.class, "renderEndAction", "renderEndAction(Lcom/spotify/encoreconsumermobile/elements/entityaction/EntityAction$Model;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gcy(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcy(mmy mmyVar, byte b) {
        super(1, mmyVar, mmy.class, "renderArtwork", "renderArtwork(Lcom/spotify/encoreconsumermobile/elements/artwork/Artwork$Model;)V", 0);
        this.a = b;
        switch (b) {
            case 19:
                super(1, mmyVar, mmy.class, "renderLookDisabled", "renderLookDisabled(Ljava/lang/Boolean;)V", 0);
                break;
            default:
                break;
        }
    }
}
