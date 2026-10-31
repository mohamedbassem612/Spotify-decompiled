package p;

import android.animation.ObjectAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connect.devicessortingimpl.data.DevicePickerSortingDatabase_Impl;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.mediabrowserservice.allowlistpackagevalidator.denylist.cache.db.DenylistDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import spotify.your_library_tags_esperanto.proto.YourLibraryTagsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ots extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ots(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        int i = -1;
        rih1 rih1Var = rih1.a;
        int i2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                uaa bl70Var = new bl70((Context) ((h98) obj).c, null, 0, 2131231808);
                Context context = bl70Var.getContext();
                WeakHashMap weakHashMap = b8k1.a;
                bl70Var.setId(View.generateViewId());
                bl70Var.setImageTintList(x74.E(context, 2131101184));
                bl70Var.setContentDescription(context.getString(2131963003));
                return bl70Var;
            case 1:
                return (nus) ((pus) obj).a.get();
            case 2:
                ((uus) obj).a.e();
                return rih1Var;
            case 3:
                dy1 dy1Var = ((av1) obj).i;
                dy1 dy1Var2 = dy1Var instanceof dy1 ? dy1Var : null;
                if (dy1Var2 != null) {
                    return dy1Var2.a;
                }
                return null;
            case 4:
                ViewStub viewStub = (ViewStub) ((ks6) ((p2o0) obj).c).Y;
                viewStub.setLayoutResource(2131625451);
                return viewStub.inflate();
            case 5:
                return ((lly) ((idd1) ((wyr) obj).c).getValue()).c;
            case 6:
                ngr ngrVar = (ngr) obj;
                View view = (ConstraintLayout) ((d520) ngrVar.e).b;
                boolean z = ((cxf1) ngrVar.d) instanceof bxf1;
                if (z) {
                    view.setBackgroundColor(azo1.p((Context) ngrVar.c, 2130968769));
                }
                if (!z) {
                    return view;
                }
                RoundedConstraintLayout roundedConstraintLayout = new RoundedConstraintLayout(view.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                roundedConstraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                view.setMinHeight(ngrVar.b);
                roundedConstraintLayout.addView(view);
                roundedConstraintLayout.setCornerRadius(view.getContext().getResources().getDimension(2131166933));
                return roundedConstraintLayout;
            case 7:
                ViewStub viewStub2 = (ViewStub) ((ks6) ((hjs) obj).d).Y;
                viewStub2.setLayoutResource(2131625451);
                return viewStub2.inflate();
            case 8:
                fws fwsVar = (fws) obj;
                return nln.w(nln.x(wvs.b, nln.v(new wsr(1, fwsVar, fws.class, "renderTitle", "renderTitle(Ljava/lang/String;)V", 0, (byte) 22))), nln.x(bws.b, nln.v(new wsr(1, fwsVar, fws.class, "renderSubtitle", "renderSubtitle(Ljava/lang/String;)V", 0, (byte) 23))), nln.x(cws.b, nln.v(new wsr(1, fwsVar, fws.class, "renderContentRestriction", "renderContentRestriction(Lcom/spotify/encoreconsumermobile/elements/badge/contentrestriction/ContentRestriction;)V", 0, (byte) 24))), nln.x(dws.b, nln.v(new wsr(1, fwsVar, fws.class, "renderEnhancedRecommendationBadge", "renderEnhancedRecommendationBadge(Z)V", 0, (byte) 25))), nln.x(ews.b, nln.v(new wsr(1, fwsVar, fws.class, "renderQueuedBadge", "renderQueuedBadge(Z)V", 0, (byte) 12))), nln.x(rvs.b, nln.v(new wsr(1, fwsVar, fws.class, "renderKallaxBadge", "renderKallaxBadge(Z)V", 0, (byte) 13))), nln.x(svs.b, nln.v(new wsr(1, fwsVar, fws.class, "renderVideoBadge", "renderVideoBadge(Z)V", 0, (byte) 14))), nln.x(tvs.b, nln.v(new wsr(1, fwsVar, fws.class, "renderMixingMetadata", "renderMixingMetadata(Lcom/spotify/nowplayingqueue/uiusecases/common/MixingMetadata;)V", 0, (byte) 15))), nln.x(uvs.b, nln.v(new wsr(1, fwsVar, fws.class, "renderDraggability", "renderDraggability(Lcom/spotify/nowplayingqueue/uiusecases/trackrow/TrackRowNowPlayingQueue$Draggability;)V", 0, (byte) 16))), nln.x(vvs.b, nln.v(new wsr(1, fwsVar, fws.class, "renderFaces", "renderFaces(Ljava/util/List;)V", 0, (byte) 17))), nln.x(xvs.b, nln.v(new wsr(1, fwsVar, fws.class, "renderCoverArt", "renderCoverArt(Lcom/spotify/nowplayingqueue/uiusecases/currenttrackrow/ArtworkData;)V", 0, (byte) 18))), nln.x(yvs.b, nln.v(new wsr(1, fwsVar, fws.class, "showSelectorIfNeededWithAnimation", "showSelectorIfNeededWithAnimation(Z)V", 0, (byte) 19))), nln.x(zvs.b, nln.v(new wsr(1, fwsVar, fws.class, "renderShouldBeSelected", "renderShouldBeSelected(Z)V", 0, (byte) 20))), nln.x(aws.b, nln.v(new wsr(1, fwsVar, fws.class, "hideSelectorIfNeededWithAnimation", "hideSelectorIfNeededWithAnimation(Z)V", 0, (byte) 21))));
            case 9:
                return flo1.l(((txs) obj).f, guo1.B());
            case 10:
                ((nqs) obj).h();
                return rih1Var;
            case 11:
                return new kpg0(((bzo) ((e0t) obj).e).a(new dgy(4, 78, 90)), mls.d1);
            case 12:
                w0t w0tVar = (w0t) obj;
                return w0tVar.c.b(w0tVar.b, w0tVar.d);
            case 13:
                y0t y0tVar = (y0t) obj;
                shp shpVar = y0tVar.b;
                vas vasVar = new vas(y0tVar, (byte) 23);
                switch (shpVar.a) {
                    case 0:
                        return new x0t(vasVar);
                    default:
                        return new x0t(vasVar);
                }
            case 14:
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-your-library-page-header";
                x6h1VarI.f = "2.2.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                String str = (String) ((h1t) obj).g.getValue();
                x6h1 x6h1VarC = y6h1VarA.c();
                x6h1VarC.i.add(new a7h1("profile_button", (String) null, (Integer) null, str, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA2 = x6h1VarC.a();
                ArrayList arrayList = new ArrayList();
                return c13.m(arrayList, z6x.a, y6h1VarA2, arrayList, (u8h1) null);
            case 15:
                return ((be) ((iir) obj).b).callStream("spotify.your_library_tags_esperanto.proto.YourLibraryTagsService", "StreamYourLibraryTags", y1t.a).map(ybx0.Z0).onErrorReturnItem(YourLibraryTagsResponse.o()).map(stf0.c1).distinctUntilChanged();
            case 16:
                ((t4t) obj).a = null;
                return rih1Var;
            case 17:
                Iterator it = ((kat) obj).c.iterator();
                while (it.hasNext()) {
                    if (((jat) it.next()).d == 3) {
                        i = i2;
                        return new err0(i);
                    }
                    i2++;
                }
                return new err0(i);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new bbt((DenylistDatabase_Impl) obj);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                qdg qdgVar = (qdg) obj;
                try {
                    ((Context) qdgVar.c).startActivity(new Intent("android.media.action.STILL_IMAGE_CAMERA"));
                    break;
                } catch (ActivityNotFoundException unused) {
                }
                ((lzn0) qdgVar.b).e();
                return rih1Var;
            case 20:
                nm1 nm1Var = (nm1) obj;
                l3p l3pVar = (l3p) nm1Var.f;
                d0r d0rVar = (d0r) nm1Var.b;
                lzn0 lzn0VarC = ((i7c) ((s3p) l3pVar.a.c).X0).c();
                c8o.l(lzn0VarC);
                return new hlt(d0rVar, lzn0VarC);
            case 21:
                return new m9c((c460) ((n9c) obj).c.get(), (byte) 1);
            case 22:
                return new art((DevicePickerSortingDatabase_Impl) obj);
            case 23:
                sut sutVar = (sut) obj;
                sutVar.h.clear();
                sutVar.i.clear();
                bvt bvtVar = sutVar.d;
                if (bvtVar.b.c()) {
                    c921.D(new n5s(bvtVar, new zut(bvtVar, (byte) 1), (lnm) null, (byte) 24));
                }
                return rih1Var;
            case 24:
                return (lzt) ((ezt) obj).a.get();
            case 25:
                return Integer.valueOf(f6u.a[l1d.C(((o0g1) obj).b)] == 1 ? 2131428242 : 2131428240);
            case 26:
                return Boolean.valueOf(((yiu) obj).d.a());
            case 27:
                nru nruVar = (nru) obj;
                ObjectAnimator duration = ObjectAnimator.ofInt(nruVar.e, "level", 0, 10000).setDuration(3500L);
                duration.setRepeatCount(-1);
                duration.setRepeatMode(2);
                duration.addUpdateListener(new kb5(nruVar, (byte) 7));
                return duration;
            case 28:
                mwu mwuVar = (mwu) obj;
                pbp pbpVar = mwuVar.b;
                uw0 uw0Var = mwuVar.d;
                t7p t7pVar = (t7p) pbpVar.a.b;
                d0r d0rVar2 = ((lbt) t7pVar.c).a;
                Context context2 = (Context) ((p0q) t7pVar.d).b.x1.a;
                c8o.l(context2);
                return new kpg0(new br0(d0rVar2, context2, ((qop) t7pVar.b).d(), uw0Var), wvu.e);
            default:
                return Boolean.valueOf(((t24) obj).i.getValue() == ma80.b);
        }
    }
}
