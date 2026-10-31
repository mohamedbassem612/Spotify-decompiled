package p;

import android.content.res.Resources;
import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.image.EncoreImageView;
import com.spotify.encoreconsumermobile.elements.badge.badgegroup.BadgeGroupView;
import com.spotify.encoreconsumermobile.elements.badge.video.VideoBadgeView;
import com.spotify.encoremobile.component.icons.EncoreIconView;
import com.spotify.encoremobile.component.slottextview.EncoreSubtitleView;
import com.spotify.encoremobile.component.slottextview.EncoreTitleView;
import com.spotify.home.evopage.mobius.State;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class sty extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sty(ad00 ad00Var, byte b) {
        super(1, ad00Var, ad00.class, "addStatesListEnteredCountsTotal", "addStatesListEnteredCountsTotal(J)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;", 0);
        this.a = b;
        switch (b) {
            case 12:
                super(1, ad00Var, ad00.class, "addStatesListRejectedClientCountsTotal", "addStatesListRejectedClientCountsTotal(J)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;", 0);
                break;
            case 13:
                super(1, ad00Var, ad00.class, "addStatesListDroppedCountsTotal", "addStatesListDroppedCountsTotal(J)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;", 0);
                break;
            case 14:
                super(1, ad00Var, ad00.class, "addStatesListPersistedCountsTotal", "addStatesListPersistedCountsTotal(J)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;", 0);
                break;
            case 15:
                super(1, ad00Var, ad00.class, "addStatesListRejectedBackendCountsTotal", "addStatesListRejectedBackendCountsTotal(J)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;", 0);
                break;
            case 16:
                super(1, ad00Var, ad00.class, "addStatesListDeliveredCountsTotal", "addStatesListDeliveredCountsTotal(J)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;", 0);
                break;
            case 17:
                super(1, ad00Var, ad00.class, "addStatesListDeletedCountsTotal", "addStatesListDeletedCountsTotal(J)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;", 0);
                break;
            default:
                break;
        }
    }

    public final Object invoke(Object obj) {
        int i;
        byte b = this.a;
        int i2 = 2;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return hu20.e(((xq51) ((lyc) this).receiver).d, new gio0((lnm) null, (String) obj, (byte) 2));
            case 1:
                txy txyVar = (txy) ((lyc) this).receiver;
                txyVar.getClass();
                txyVar.setAlpha(u890.j((Boolean) obj, Boolean.TRUE) ? 0.3f : 1.0f);
                return rih1Var;
            case 2:
                kxy kxyVar = (kxy) obj;
                txy txyVar2 = (txy) ((lyc) this).receiver;
                yjq yjqVar = txyVar2.d;
                zbs zbsVar = txyVar2.b;
                if (kxyVar.equals(ixy.a)) {
                    ((VideoBadgeView) yjqVar.b).setVisibility(0);
                    ((ConstraintLayout) zbsVar.b.c).setVisibility(8);
                } else if (kxyVar instanceof jxy) {
                    ((VideoBadgeView) yjqVar.b).setVisibility(8);
                    ((ConstraintLayout) zbsVar.b.c).setVisibility(0);
                    int iC = l1d.C(((jxy) kxyVar).a);
                    if (iC == 0) {
                        i2 = 1;
                    } else if (iC != 1) {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        i2 = 3;
                    }
                    zbsVar.a(new tan0(i2, true));
                } else {
                    if (!kxyVar.equals(hxy.a)) {
                        eg.o();
                        return null;
                    }
                    ((VideoBadgeView) yjqVar.b).setVisibility(8);
                    ((ConstraintLayout) zbsVar.b.c).setVisibility(8);
                }
                return rih1Var;
            case 3:
                String str = (String) obj;
                yjq yjqVar2 = ((txy) ((lyc) this).receiver).d;
                if (str != null) {
                    ((EncoreSubtitleView) yjqVar2.f).setVisibility(0);
                    ((EncoreSubtitleView) yjqVar2.f).setText(str);
                } else {
                    ((EncoreSubtitleView) yjqVar2.f).setVisibility(8);
                }
                return rih1Var;
            case 4:
                String str2 = (String) obj;
                txy txyVar3 = (txy) ((lyc) this).receiver;
                yjq yjqVar3 = txyVar3.d;
                gw70 gw70Var = txyVar3.c;
                if (gw70Var == null || str2 == null) {
                    ((EncoreImageView) yjqVar3.e).setVisibility(8);
                } else {
                    EncoreImageView encoreImageView = (EncoreImageView) yjqVar3.e;
                    encoreImageView.setImageLoader(gw70Var);
                    encoreImageView.setVisibility(0);
                    encoreImageView.setSource(new sux(Uri.parse(str2)));
                    ((EncoreSubtitleView) yjqVar3.f).setTextAppearance(2132018018);
                }
                return rih1Var;
            case 5:
                ((txy) ((lyc) this).receiver).a((lxy) obj);
                return rih1Var;
            case 6:
                b2a b2aVar = (b2a) obj;
                yjq yjqVar4 = ((txy) ((lyc) this).receiver).d;
                if (b2aVar != null) {
                    ((BadgeGroupView) yjqVar4.d).z(b2aVar);
                    ((BadgeGroupView) yjqVar4.d).setVisibility(0);
                } else {
                    ((BadgeGroupView) yjqVar4.d).setVisibility(8);
                }
                return rih1Var;
            case 7:
                kyy kyyVar = (kyy) ((lyc) this).receiver;
                kyyVar.getClass();
                kyyVar.setAlpha(u890.j((Boolean) obj, Boolean.TRUE) ? 0.3f : 1.0f);
                return rih1Var;
            case 8:
                ((kyy) ((lyc) this).receiver).y((ayy) obj);
                return rih1Var;
            case 9:
                kyy kyyVar2 = (kyy) ((lyc) this).receiver;
                kyyVar2.getClass();
                int iOrdinal = ((xxy) obj).ordinal();
                if (iOrdinal == 0) {
                    i = 2132018003;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i = 2132018006;
                }
                ((EncoreTitleView) kyyVar2.U0.f).setTextAppearance(i);
                return rih1Var;
            case 10:
                ((EncoreIconView) ((kyy) ((lyc) this).receiver).U0.b).setVisibility(8);
                return rih1Var;
            case 11:
                long jLongValue = ((Number) obj).longValue();
                ad00 ad00Var = (ad00) ((lyc) this).receiver;
                ad00Var.B(jLongValue);
                return ad00Var;
            case 12:
                long jLongValue2 = ((Number) obj).longValue();
                ad00 ad00Var2 = (ad00) ((lyc) this).receiver;
                ad00Var2.F(jLongValue2);
                return ad00Var2;
            case 13:
                long jLongValue3 = ((Number) obj).longValue();
                ad00 ad00Var3 = (ad00) ((lyc) this).receiver;
                ad00Var3.A(jLongValue3);
                return ad00Var3;
            case 14:
                long jLongValue4 = ((Number) obj).longValue();
                ad00 ad00Var4 = (ad00) ((lyc) this).receiver;
                ad00Var4.D(jLongValue4);
                return ad00Var4;
            case 15:
                long jLongValue5 = ((Number) obj).longValue();
                ad00 ad00Var5 = (ad00) ((lyc) this).receiver;
                ad00Var5.E(jLongValue5);
                return ad00Var5;
            case 16:
                long jLongValue6 = ((Number) obj).longValue();
                ad00 ad00Var6 = (ad00) ((lyc) this).receiver;
                ad00Var6.z(jLongValue6);
                return ad00Var6;
            case 17:
                long jLongValue7 = ((Number) obj).longValue();
                ad00 ad00Var7 = (ad00) ((lyc) this).receiver;
                ad00Var7.y(jLongValue7);
                return ad00Var7;
            case 18:
                int iIntValue = ((Number) obj).intValue();
                ConstraintLayout constraintLayout = (ConstraintLayout) ((xe00) ((lyc) this).receiver).e.b;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop() + iIntValue, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
                return rih1Var;
            case 19:
                ((snc0) ((lyc) this).receiver).a((qnc0) obj);
                return rih1Var;
            case 20:
                State.Content content = (State) obj;
                ((el00) ((lyc) this).receiver).getClass();
                if (content instanceof State.Content) {
                    return content.getModel();
                }
                return null;
            case 21:
                ((iv00) ((lyc) this).receiver).f.remove((fv00) obj);
                return rih1Var;
            case 22:
                iv00 iv00Var = (iv00) ((lyc) this).receiver;
                iv00Var.getClass();
                ConcurrentHashMap concurrentHashMap = iv00Var.g;
                Iterator it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    concurrentHashMap.remove((jh5) it.next());
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((yc10) ((lyc) this).receiver).getClass();
                if (((cd8) obj).a.isEmpty()) {
                    return z6x.a;
                }
                oc10 oc10Var = oc10.a;
                h8k1 h8k1Var = new h8k1(oc10Var, oc10Var);
                nc10 nc10Var = nc10.a;
                return p7h.M(new h8k1[]{h8k1Var, new h8k1(nc10Var, nc10Var)});
            case 24:
                fp10 fp10Var = (fp10) obj;
                lp10 lp10Var = (lp10) ((lyc) this).receiver;
                lp10Var.getClass();
                ap10 ap10Var = fp10Var.b;
                cp10 cp10Var = ap10Var.c;
                boolean z = cp10Var instanceof dp10;
                cp10 cp10Var2 = cp10Var instanceof cp10 ? cp10Var : null;
                Long l = cp10Var2 != null ? cp10Var2.a : null;
                d0r d0rVar = lp10Var.a;
                return new x010(new x010(d3p1.F(d0rVar, kzd.a, z6b1.a(fp10Var.a)), d3p1.F(d0rVar, kzd.b, ap10Var.a), new wc10(3, (lnm) null, (byte) 1), (byte) 1), new m441(new tfb0(z, l, lp10Var.b, lp10Var.c, false, (lnm) null)), new mnl(3, (lnm) null, (byte) 24), (byte) 1);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                jw20 jw20Var = (jw20) ((lyc) this).receiver;
                AtomicLongFieldUpdater atomicLongFieldUpdater = jw20.g;
                return jw20Var.B0((lnm) obj);
            case 26:
                Resources resources = ((ax20) ((lyc) this).receiver).a.getResources();
                xw20 xw20Var = ((yw20) obj).a;
                return new nhb1(resources.getString(xw20Var.a), resources.getString(xw20Var.b), resources.getString(((dn90) xw20Var.c).b), resources.getString(2131956056), false, (izh1) null, 96);
            case 27:
                p330 p330Var = (p330) obj;
                d430 d430Var = (d430) ((lyc) this).receiver;
                d430Var.getClass();
                k330 k330Var = p330Var.b;
                evz evzVar = new evz(d430Var.c.a(), p330Var, (byte) 17);
                g7h g7hVar = d430Var.b;
                String str3 = p330Var.a;
                return new x010(evzVar, new evz(yoi1.g(g7h.d(g7hVar, str3, new String[]{str3})), p330Var, (byte) 16), new c430(k330Var, (lnm) null), (byte) 1);
            case 28:
                ((snc0) ((lyc) this).receiver).a((qnc0) obj);
                return rih1Var;
            default:
                lq61 lq61Var = (lq61) obj;
                ((rb30) ((lyc) this).receiver).getClass();
                return new qb30(lq61Var.e, lq61Var.f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sty(txy txyVar, byte b) {
        super(1, txyVar, txy.class, "renderLookDisabled", "renderLookDisabled(Ljava/lang/Boolean;)V", 0);
        this.a = b;
        switch (b) {
            case 2:
                super(1, txyVar, txy.class, "renderSpecialTypeBadge", "renderSpecialTypeBadge(Lcom/spotify/encoreconsumermobile/elements/entitysubtitle/EntitySubtitle$SpecialTypeBadge;)V", 0);
                break;
            case 3:
                super(1, txyVar, txy.class, "renderSubtitleText", "renderSubtitleText(Ljava/lang/String;)V", 0);
                break;
            case 4:
                super(1, txyVar, txy.class, "renderSubtitleImage", "renderSubtitleImage(Ljava/lang/String;)V", 0);
                break;
            case 5:
                super(1, txyVar, txy.class, "renderType", "renderType(Lcom/spotify/encoreconsumermobile/elements/entitysubtitle/EntitySubtitle$Type;)V", 0);
                break;
            case 6:
                super(1, txyVar, txy.class, "renderBadgeGroup", "renderBadgeGroup(Lcom/spotify/encoreconsumermobile/elements/badge/badgegroup/BadgeGroup$Model;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sty(kyy kyyVar, byte b) {
        super(1, kyyVar, kyy.class, "renderLookDisabled", "renderLookDisabled(Ljava/lang/Boolean;)V", 0);
        this.a = b;
        switch (b) {
            case 8:
                super(1, kyyVar, kyy.class, "renderType", "renderType(Lcom/spotify/encoreconsumermobile/elements/entitytitle/EntityTitle$Type;)V", 0);
                break;
            case 9:
                super(1, kyyVar, kyy.class, "renderSize", "renderSize(Lcom/spotify/encoreconsumermobile/elements/entitytitle/EntityTitle$Size;)V", 0);
                break;
            case 10:
                super(1, kyyVar, kyy.class, "renderIconEnd", "renderIconEnd(Lcom/spotify/encoreconsumermobile/elements/entitytitle/EntityTitle$TitleIcon;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sty(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sty(el00 el00Var) {
        super(1, el00Var, el00.class, "optionalModel", "optionalModel(Lcom/spotify/home/evopage/mobius/State;)Lcom/spotify/home/evopage/mobius/model/Model;", 0);
        this.a = (byte) 20;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sty(iv00 iv00Var, byte b) {
        super(1, iv00Var, iv00.class, "removeSubscription", "removeSubscription(Lcom/spotify/kodiak/extendedmetadataimpl/ExtendedMetadataDataSourceImpl$MetadataSubscription;)V", 0);
        this.a = b;
        switch (b) {
            case 22:
                super(1, iv00Var, iv00.class, "invalidateCache", "invalidateCache(Ljava/util/Set;)V", 0);
                break;
            default:
                break;
        }
    }
}
