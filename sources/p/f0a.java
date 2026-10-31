package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.spotify.blend.tastematch.BlendStoryContainerActivity;
import com.spotify.campaigns.storytelling.container.StorytellingContainerFragment;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.premium.PremiumBadgeView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.playindicator.PlayIndicatorComposeView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.player.model.PlayOrigin;
import com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f0a implements dl4, tzf1 {
    public final Object N0;
    public Object O0;
    public Object P0;
    public Object Q0;
    public Object X;
    public Object Y;
    public final Object Z;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object t;

    public f0a(Context context, int i) {
        this.a = (byte) 11;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.b = constraintLayout;
        this.Q0 = dm61.w0(new Integer[]{2131427413, 2131427417, 2131430716});
        Resources resources = context.getResources();
        int i2 = w6d1.i(context, 2);
        int i3 = w6d1.i(context, 4);
        int i4 = w6d1.i(context, 6);
        int i5 = w6d1.i(context, 8);
        int i6 = w6d1.i(context, 12);
        int i7 = w6d1.i(context, 16);
        int dimensionPixelSize = resources.getDimensionPixelSize(2131167170);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(2131167168);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(2131165860);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(2131165733);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(2131165730);
        constraintLayout.setId(2131430718);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        constraintLayout.setMinHeight(w6d1.i(context, 64));
        constraintLayout.setPaddingRelative(0, i5, 0, i5);
        View guideline = new Guideline(context);
        guideline.setId(2131429057);
        ViewGroup.LayoutParams qhlVar = new qhl(-2, -2);
        ((qhl) qhlVar).V = 1;
        ((qhl) qhlVar).a = i;
        constraintLayout.addView(guideline, qhlVar);
        View guideline2 = new Guideline(context);
        guideline2.setId(2131429056);
        ViewGroup.LayoutParams qhlVar2 = new qhl(-2, -2);
        ((qhl) qhlVar2).V = 1;
        ((qhl) qhlVar2).b = 0;
        constraintLayout.addView(guideline2, qhlVar2);
        int i8 = (int) ((12.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
        ArtworkView artworkView = new ArtworkView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        artworkView.setId(2131427611);
        artworkView.setDuplicateParentStateEnabled(true);
        artworkView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        artworkView.setContentDescription(null);
        artworkView.setPlaceholderInset(i8);
        this.c = artworkView;
        qhl qhlVar3 = new qhl(dimensionPixelSize, dimensionPixelSize);
        qhlVar3.setMarginEnd(i6);
        qhlVar3.s = 2131427417;
        qhlVar3.u = 2131430403;
        qhlVar3.i = 0;
        qhlVar3.l = 0;
        constraintLayout.addView(artworkView, qhlVar3);
        View playIndicatorComposeView = new PlayIndicatorComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        playIndicatorComposeView.setId(2131430403);
        playIndicatorComposeView.setVisibility(8);
        this.g = playIndicatorComposeView;
        qhl qhlVar4 = new qhl(dimensionPixelSize3, dimensionPixelSize3);
        qhlVar4.setMarginEnd(i3);
        ((ViewGroup.MarginLayoutParams) qhlVar4).bottomMargin = i4;
        qhlVar4.k = 2131431115;
        qhlVar4.u = 2131431356;
        qhlVar4.s = 2131427611;
        constraintLayout.addView(playIndicatorComposeView, qhlVar4);
        EncoreTextView encoreTextView = new EncoreTextView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        encoreTextView.setId(2131431356);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        encoreTextView.setEllipsize(truncateAt);
        encoreTextView.setMaxLines(1);
        encoreTextView.setTextAlignment(1);
        encoreTextView.setTextAppearance(2132018003);
        encoreTextView.setTextColor(x74.E(context, 2131101384));
        encoreTextView.setTextDirection(5);
        this.d = encoreTextView;
        ViewGroup.LayoutParams qhlVar5 = new qhl(0, -2);
        ((qhl) qhlVar5).k = 2131431115;
        ((qhl) qhlVar5).u = 2131430571;
        ((qhl) qhlVar5).J = 1;
        ((qhl) qhlVar5).s = 2131430403;
        ((qhl) qhlVar5).j = 2131430482;
        ((qhl) qhlVar5).K = 2;
        ((qhl) qhlVar5).B = i7;
        constraintLayout.addView(encoreTextView, qhlVar5);
        View lockedBadgeView = new LockedBadgeView(context, (AttributeSet) null, 0);
        lockedBadgeView.setId(2131429846);
        lockedBadgeView.setVisibility(8);
        this.i = lockedBadgeView;
        qhl qhlVar6 = new qhl(dimensionPixelSize4, dimensionPixelSize4);
        qhlVar6.setMarginEnd(dimensionPixelSize5);
        qhlVar6.l = 2131431115;
        qhlVar6.u = 2131428664;
        qhlVar6.t = 2131430403;
        qhlVar6.i = 2131431115;
        constraintLayout.addView(lockedBadgeView, qhlVar6);
        View enhancedBadgeView = new EnhancedBadgeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        enhancedBadgeView.setId(2131428664);
        enhancedBadgeView.setVisibility(8);
        this.t = enhancedBadgeView;
        qhl qhlVar7 = new qhl(-2, dimensionPixelSize4);
        qhlVar7.setMarginEnd(dimensionPixelSize5);
        qhlVar7.l = 2131431115;
        qhlVar7.u = 2131428508;
        qhlVar7.s = 2131429846;
        qhlVar7.i = 2131431115;
        constraintLayout.addView(enhancedBadgeView, qhlVar7);
        View downloadBadgeView = new DownloadBadgeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        downloadBadgeView.setId(2131428508);
        downloadBadgeView.setContentDescription(null);
        downloadBadgeView.setVisibility(8);
        this.X = downloadBadgeView;
        qhl qhlVar8 = new qhl(0, dimensionPixelSize4);
        qhlVar8.setMarginEnd(dimensionPixelSize5);
        qhlVar8.H = 1.0f;
        qhlVar8.G = "1:1";
        qhlVar8.J = 0;
        qhlVar8.l = 2131431115;
        qhlVar8.u = 2131430468;
        qhlVar8.s = 2131428664;
        qhlVar8.i = 2131431115;
        constraintLayout.addView(downloadBadgeView, qhlVar8);
        View premiumBadgeView = new PremiumBadgeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.Y = premiumBadgeView;
        premiumBadgeView.setId(2131430468);
        premiumBadgeView.setVisibility(8);
        qhl qhlVar9 = new qhl(-2, dimensionPixelSize4);
        qhlVar9.setMarginEnd(dimensionPixelSize5);
        qhlVar9.l = 2131431115;
        qhlVar9.u = 2131430674;
        qhlVar9.s = 2131428508;
        qhlVar9.i = 2131431115;
        constraintLayout.addView(premiumBadgeView, qhlVar9);
        View contentRestrictionBadgeView = new ContentRestrictionBadgeView(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
        contentRestrictionBadgeView.setId(2131430674);
        contentRestrictionBadgeView.setVisibility(8);
        this.Z = contentRestrictionBadgeView;
        qhl qhlVar10 = new qhl(-2, dimensionPixelSize4);
        qhlVar10.setMarginEnd(dimensionPixelSize5);
        qhlVar10.l = 2131431115;
        qhlVar10.u = 2131431599;
        qhlVar10.s = 2131430468;
        qhlVar10.i = 2131431115;
        constraintLayout.addView(contentRestrictionBadgeView, qhlVar10);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(2131431599);
        frameLayout.setVisibility(8);
        this.h = frameLayout;
        ViewGroup.LayoutParams qhlVar11 = new qhl(-2, -2);
        ((qhl) qhlVar11).l = 2131431115;
        ((qhl) qhlVar11).u = 2131431115;
        ((qhl) qhlVar11).s = 2131430674;
        ((qhl) qhlVar11).i = 2131431115;
        constraintLayout.addView(frameLayout, qhlVar11);
        EncoreTextView encoreTextView2 = new EncoreTextView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        encoreTextView2.setId(2131431115);
        encoreTextView2.setEllipsize(truncateAt);
        encoreTextView2.setMaxLines(1);
        encoreTextView2.setTextAlignment(1);
        encoreTextView2.setTextAppearance(2132018006);
        encoreTextView2.setTextColor(x74.E(context, 2131101383));
        encoreTextView2.setTextDirection(5);
        this.e = encoreTextView2;
        qhl qhlVar12 = new qhl(0, -2);
        ((ViewGroup.MarginLayoutParams) qhlVar12).topMargin = i2;
        qhlVar12.H = 1.0f;
        qhlVar12.l = 0;
        qhlVar12.v = 2131431356;
        qhlVar12.s = 2131431599;
        qhlVar12.j = 2131431356;
        qhlVar12.K = 2;
        constraintLayout.addView(encoreTextView2, qhlVar12);
        View quickActionView = new QuickActionView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        quickActionView.setId(2131430571);
        this.f = quickActionView;
        ViewGroup.LayoutParams qhlVar13 = new qhl(-2, -2);
        ((qhl) qhlVar13).l = 2131427611;
        ((qhl) qhlVar13).u = 2131427413;
        ((qhl) qhlVar13).s = 2131431356;
        ((qhl) qhlVar13).i = 2131427611;
        constraintLayout.addView(quickActionView, qhlVar13);
        View view = new View(context);
        view.setId(2131427413);
        view.setVisibility(8);
        ViewGroup.LayoutParams qhlVar14 = new qhl(dimensionPixelSize2, dimensionPixelSize2);
        ((qhl) qhlVar14).l = 0;
        ((qhl) qhlVar14).v = 2131429056;
        ((qhl) qhlVar14).s = 2131430571;
        ((qhl) qhlVar14).i = 0;
        constraintLayout.addView(view, qhlVar14);
        View view2 = new View(context);
        view2.setId(2131427417);
        view2.setVisibility(8);
        ViewGroup.LayoutParams qhlVar15 = new qhl(dimensionPixelSize2, -1);
        ((qhl) qhlVar15).A = 0;
        ((qhl) qhlVar15).l = 0;
        ((qhl) qhlVar15).t = 2131429057;
        ((qhl) qhlVar15).i = 0;
        constraintLayout.addView(view2, qhlVar15);
        View view3 = new View(context);
        view3.setId(2131430716);
        view3.setVisibility(8);
        ViewGroup.LayoutParams qhlVar16 = new qhl(0, -2);
        ((qhl) qhlVar16).v = 0;
        ((qhl) qhlVar16).t = 0;
        ((qhl) qhlVar16).i = 0;
        constraintLayout.addView(view3, qhlVar16);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(2131430482);
        viewStub.setInflatedId(2131430482);
        this.N0 = viewStub;
        qhl qhlVar17 = new qhl(0, -2);
        ((ViewGroup.MarginLayoutParams) qhlVar17).bottomMargin = i2;
        qhlVar17.k = 2131431356;
        qhlVar17.u = 2131430571;
        qhlVar17.H = 1.0f;
        qhlVar17.s = 2131430403;
        qhlVar17.i = 0;
        qhlVar17.K = 2;
        constraintLayout.addView(viewStub, qhlVar17);
    }

    public FlowableMap A() {
        cbg1 cbg1Var = (cbg1) this.b;
        Flowable flowableF = cbg1Var.f();
        c8o.l(flowableF);
        Scheduler schedulerO = cbg1Var.o();
        c8o.l(schedulerO);
        yqg yqgVarA = cbg1Var.a();
        c8o.l(yqgVarA);
        return new FlowableOnBackpressureLatest(flowableF).j(new xeu0(32L, schedulerO, yqgVarA)).x(dj10.Y0).J(fj10.Y0);
    }

    public jy4 a() {
        luk lukVar = (luk) ((p7v0) this.b).m.get();
        c8o.l(lukVar);
        return new jy4(lukVar);
    }

    public ConstraintLayout b() {
        return (ConstraintLayout) this.b;
    }

    public EnhancedBadgeView c() {
        return (EnhancedBadgeView) this.t;
    }

    public QuickActionView d() {
        return (QuickActionView) this.f;
    }

    public ViewStub e() {
        return (ViewStub) this.N0;
    }

    public View f() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.b;
        ContextMenuButton contextMenuButton = (ContextMenuButton) this.O0;
        if (contextMenuButton != null) {
            return contextMenuButton;
        }
        Context context = constraintLayout.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167168);
        View viewFindViewById = constraintLayout.findViewById(2131427413);
        int iIndexOfChild = constraintLayout.indexOfChild(viewFindViewById);
        qhl layoutParams = viewFindViewById.getLayoutParams();
        constraintLayout.removeView(viewFindViewById);
        ContextMenuButton contextMenuButton2 = new ContextMenuButton(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        contextMenuButton2.setId(2131427413);
        contextMenuButton2.setScaleType(ImageView.ScaleType.CENTER);
        contextMenuButton2.setBackgroundColor(0);
        qhl qhlVar = new qhl(dimensionPixelSize, dimensionPixelSize);
        qhlVar.l = layoutParams.l;
        qhlVar.v = layoutParams.v;
        qhlVar.s = layoutParams.s;
        qhlVar.i = layoutParams.i;
        contextMenuButton2.setLayoutParams(qhlVar);
        constraintLayout.addView(contextMenuButton2, iIndexOfChild);
        this.O0 = contextMenuButton2;
        ((Set) this.Q0).remove(2131427413);
        return contextMenuButton2;
    }

    public View g() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.b;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.P0;
        if (shimmerFrameLayout != null) {
            return shimmerFrameLayout;
        }
        Context context = constraintLayout.getContext();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131167170);
        int i = w6d1.i(context, 8);
        int i2 = w6d1.i(context, 12);
        int i3 = w6d1.i(context, 16);
        int color = context.getColor(2131101757);
        int color2 = context.getColor(2131101758);
        long integer = resources.getInteger(2131492900);
        ShimmerFrameLayout shimmerFrameLayout2 = new ShimmerFrameLayout(context);
        shimmerFrameLayout2.setId(2131429821);
        az71 az71Var = new az71();
        bz71 bz71Var = (bz71) ((k9) az71Var).b;
        bz71Var.e = (bz71Var.e & (-16777216)) | (color & 16777215);
        bz71Var.d = color2;
        shimmerFrameLayout2.b(az71Var.n1(1.0f).q1(1.0f).p1(integer).x0());
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(2131429820);
        View view = new View(context);
        view.setId(2131429823);
        view.setBackgroundColor(color);
        qhl qhlVar = new qhl(dimensionPixelSize, dimensionPixelSize);
        qhlVar.setMarginStart(i3);
        qhlVar.l = 0;
        qhlVar.t = 0;
        qhlVar.i = 0;
        constraintLayout2.addView(view, qhlVar);
        int i4 = (int) (140.0f * resources.getDisplayMetrics().scaledDensity);
        int i5 = (int) (16.0f * resources.getDisplayMetrics().scaledDensity);
        View view2 = new View(context);
        view2.setId(2131429837);
        view2.setBackground(context.getDrawable(2131233478));
        qhl qhlVar2 = new qhl(i4, i5);
        qhlVar2.setMarginStart(i2);
        qhlVar2.k = 2131429834;
        qhlVar2.s = 2131429823;
        qhlVar2.i = 0;
        qhlVar2.K = 2;
        constraintLayout2.addView(view2, qhlVar2);
        int i6 = (int) (130.0f * resources.getDisplayMetrics().scaledDensity);
        int i7 = (int) (13.0f * resources.getDisplayMetrics().scaledDensity);
        View view3 = new View(context);
        view3.setId(2131429834);
        view3.setBackground(context.getDrawable(2131233477));
        qhl qhlVar3 = new qhl(i6, i7);
        qhlVar3.setMarginStart(i2);
        ((ViewGroup.MarginLayoutParams) qhlVar3).topMargin = i;
        qhlVar3.l = 0;
        qhlVar3.s = 2131429823;
        qhlVar3.j = 2131429837;
        constraintLayout2.addView(view3, qhlVar3);
        shimmerFrameLayout2.addView(constraintLayout2, new ViewGroup.LayoutParams(-1, -2));
        View viewFindViewById = constraintLayout.findViewById(2131430716);
        int iIndexOfChild = constraintLayout.indexOfChild(viewFindViewById);
        qhl qhlVar4 = (qhl) viewFindViewById.getLayoutParams();
        constraintLayout.removeView(viewFindViewById);
        ViewGroup.LayoutParams qhlVar5 = new qhl(0, -2);
        ((qhl) qhlVar5).v = qhlVar4.v;
        ((qhl) qhlVar5).t = qhlVar4.t;
        ((qhl) qhlVar5).i = qhlVar4.i;
        shimmerFrameLayout2.setLayoutParams(qhlVar5);
        shimmerFrameLayout2.setId(2131430716);
        constraintLayout.addView(shimmerFrameLayout2, iIndexOfChild);
        this.P0 = shimmerFrameLayout2;
        ((Set) this.Q0).remove(2131430716);
        return shimmerFrameLayout2;
    }

    public ArtworkView getArtwork() {
        return (ArtworkView) this.c;
    }

    public ConstraintLayout getRoot() {
        return (ConstraintLayout) this.b;
    }

    public TextView getSubtitle() {
        return (EncoreTextView) this.e;
    }

    public TextView getTitle() {
        return (EncoreTextView) this.d;
    }

    public void h(llw0 llw0Var) {
        ArrayList arrayList = (ArrayList) this.g;
        arrayList.clear();
        arrayList.add(llw0Var);
    }

    public DownloadBadgeView i() {
        return (DownloadBadgeView) this.X;
    }

    public ContentRestrictionBadgeView j() {
        return (ContentRestrictionBadgeView) this.Z;
    }

    public PremiumBadgeView k() {
        return (PremiumBadgeView) this.Y;
    }

    public PlayIndicatorComposeView l() {
        return (PlayIndicatorComposeView) this.g;
    }

    public FrameLayout m() {
        return (FrameLayout) this.h;
    }

    public void n() {
        mf20 mf20Var = new mf20(z561.T(new mwv0(this, (byte) 24), new i46((ConstraintLayout) this.b, (byte) 8)));
        while (mf20Var.hasNext()) {
            View view = (View) mf20Var.next();
            view.setVisibility(view.getId() != 2131430716 ? 0 : 8);
        }
    }

    public LockedBadgeView o() {
        return (LockedBadgeView) this.i;
    }

    public u771 p() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.Z;
        ArrayList arrayList = (ArrayList) this.g;
        if (arrayList.isEmpty()) {
            eg.m("No backgrounds provided. BackgroundWithStickerShareFormat requires at least one background option");
            return null;
        }
        String str = (String) this.b;
        if (str == null) {
            eg.m("No entity uri provided. BackgroundWithStickerShareFormat requires an entityUri");
            return null;
        }
        z771 z771Var = (z771) this.h;
        if (z771Var != null) {
            return new u771(new t771(new wa71(str, (String) this.e, mqo1.G(linkedHashMap), (dqi1) this.t, (String) this.c, (String) this.d, (Bundle) null, 64), z771Var), new pz61(new y171(rc11.a.b(d0a.class)), new g0a(arrayList, (jlw0) this.i, (String) this.c, (String) this.d, (String) this.e, (dqi1) this.t, linkedHashMap, (String) this.f, (Boolean) this.O0, (pz9) this.X, (oz9) this.Y, (dmt) this.Q0), (ez61) this.P0, arrayList.size() > 1), new bj71((LinkedHashSet) this.N0, true, (String) null, 4));
        }
        eg.m("No share format id provided. BackgroundWithStickerShareFormat requires a shareFormat Id");
        return null;
    }

    public zhy q() {
        vhy vhyVarR = ((cbg1) this.b).r();
        c8o.l(vhyVarR);
        return vhyVarR.a(new zb91(s(), (byte) 18));
    }

    public u710 r() {
        hwp hwpVarJ = ((cbg1) this.b).j();
        c8o.l(hwpVarJ);
        return hwpVarJ.a(new twa());
    }

    public j4f1 s() {
        return new j4f1((j7h1) ((jly0) this.e).get(), (byte) 13);
    }

    public void setEnabled(boolean z) {
        ((ArtworkView) this.c).setEnabled(z);
        ((EncoreTextView) this.d).setEnabled(z);
        ((EncoreTextView) this.e).setEnabled(z);
        ((LockedBadgeView) this.i).setEnabled(z);
        ((EnhancedBadgeView) this.t).setEnabled(z);
        ((DownloadBadgeView) this.X).setEnabled(z);
        ((ContentRestrictionBadgeView) this.Z).setEnabled(z);
        ((PremiumBadgeView) this.Y).setEnabled(z);
    }

    public void t(gw70 gw70Var) {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.b;
        eqq.t(-1, -2, constraintLayout);
        View view = (ArtworkView) this.c;
        view.setViewContext(new f47(gw70Var));
        ((QuickActionView) this.f).setViewContext(new zez0(constraintLayout.getContext(), gw70Var));
        v9w0 v9w0VarQ = b2u.q(constraintLayout);
        Collections.addAll(v9w0VarQ.c, (EncoreTextView) this.d, (EncoreTextView) this.e);
        Collections.addAll(v9w0VarQ.d, view);
        v9w0VarQ.e = false;
        v9w0VarQ.a();
    }

    public et90 u() {
        j4f1 j4f1VarS = s();
        cbg1 cbg1Var = (cbg1) this.b;
        zrg zrgVarN = cbg1Var.n();
        woa woaVarP = cbg1Var.p();
        c8o.l(woaVarP);
        kma kmaVarE0 = cbg1Var.e0();
        c8o.l(kmaVarE0);
        return new et90(j4f1VarS, zrgVarN, woaVarP, kmaVarE0);
    }

    public Map v() {
        return j380.k(h22.class, new h21(xqu.a((s2q) this.h), (byte) 3), qbs0.class, new t700(xqu.a((s2q) this.t), (byte) 24), pyf.class, new h21(xqu.a((s2q) this.X), (byte) 14), mh41.class, new uww0(xqu.a((s2q) this.Y), (byte) 7), rww0.class, new uww0(xqu.a((s2q) this.P0), (byte) 0));
    }

    public void w(Object obj) {
        switch (this.a) {
            case 3:
                ProfileCompletionSheetHostActivity profileCompletionSheetHostActivity = (ProfileCompletionSheetHostActivity) obj;
                daq daqVar = (daq) this.c;
                ((t3b1) profileCompletionSheetHostActivity).b1 = (jgu) daqVar.a.g0.get();
                ((t3b1) profileCompletionSheetHostActivity).c1 = new tuk(xqu.a((s2q) this.g));
                profileCompletionSheetHostActivity.f1 = (a2k) ((jly0) this.Q0).get();
                profileCompletionSheetHostActivity.g1 = v();
                profileCompletionSheetHostActivity.h1 = (b0x0) daqVar.Yb.get();
                break;
            default:
                StorytellingContainerFragment storytellingContainerFragment = (StorytellingContainerFragment) obj;
                ((hip) storytellingContainerFragment).F1 = (jgu) ((p2q) this.f).get();
                storytellingContainerFragment.J1 = (c4c1) ((jly0) this.h).get();
                daq daqVar2 = (daq) this.c;
                storytellingContainerFragment.K1 = (j810) daqVar2.En.get();
                Single singleCreate = Single.create(new zb91((w4c1) ((jly0) this.i).get(), (byte) 7));
                l5b1 l5b1Var = new l5b1((w4c1) ((jly0) this.i).get(), (byte) 20);
                ptj ptjVar = new ptj(1, (c4c1) ((jly0) this.h).get(), c4c1.class, "onStoriesUpdate", "onStoriesUpdate(Lcom/spotify/campaigns/storytelling/api/StoriesUpdate;)V", 0, (byte) 13);
                ewn0 ewn0Var = new ewn0(((jly0) this.t).get(), (byte) 17);
                xq81 xq81Var = new xq81((v6c1) ((jly0) this.X).get(), (byte) 11);
                i7d i7dVar = (i7d) this.d;
                s4b s4bVar = new s4b(((BlendStoryContainerActivity) i7dVar.a).getIntent().getBooleanExtra("apps.music.features.blend-taste-match.key.IS_BLEND_INVITE", false), (lzn0) ((p2p) i7dVar.Q0).get(), i7dVar.g());
                PublishSubject publishSubject = ((k9c1) ((jly0) this.Y).get()).a;
                BehaviorSubject behaviorSubject = ((las0) ((jly0) this.t).get()).a;
                Object obj2 = this.Z;
                BehaviorSubject behaviorSubject2 = ((fb71) ((jly0) obj2).get()).a;
                z4c1 z4c1Var = (z4c1) ((jly0) this.N0).get();
                qy7 qy7Var = (qy7) ((jly0) this.O0).get();
                i8h1 i8h1Var = (i8h1) daqVar2.A5.get();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                String str = yon1.g0().c;
                r6h1 r6h1Var = r6h1.c;
                storytellingContainerFragment.G1 = new kbc1(singleCreate, l5b1Var, ptjVar, ewn0Var, xq81Var, s4bVar, publishSubject, behaviorSubject, behaviorSubject2, z4c1Var, qy7Var, new r2a1(i8h1Var, new h4l0(str, "spotify:blend:story"), (byte) 20), ((fgi1) ((jly0) this.P0).get()).a, (Scheduler) daqVar2.r3.get(), (Scheduler) daqVar2.A2.get(), j5.a, fdb1.v((kq41) ((jly0) this.Q0).get()), yon1.g0().c);
                storytellingContainerFragment.H1 = new ewn0(((jly0) this.t).get(), (byte) 17);
                storytellingContainerFragment.I1 = new ij01((fb71) ((jly0) obj2).get(), (byte) 25);
                break;
        }
    }

    public ks6 x() {
        eto etoVar = (eto) this.b;
        String str = etoVar.r0;
        c8o.l(str);
        String str2 = etoVar.D0;
        c8o.l(str2);
        iac0 iac0Var = etoVar.l0;
        c8o.l(iac0Var);
        rck1 rck1Var = etoVar.m0;
        lko lkoVar = etoVar.F;
        c8o.l(lkoVar);
        peq peqVar = etoVar.G;
        c8o.l(peqVar);
        byu byuVar = etoVar.H;
        c8o.l(byuVar);
        pyu pyuVar = etoVar.I;
        c8o.l(pyuVar);
        qeq qeqVar = etoVar.L;
        c8o.l(qeqVar);
        sbq sbqVar = etoVar.M;
        c8o.l(sbqVar);
        ki01 ki01Var = etoVar.c0;
        p6r0 p6r0Var = etoVar.n0;
        ynb0 ynb0VarA = xqu.a((d7p) this.f);
        Flowable flowable = etoVar.k;
        c8o.l(flowable);
        return new ks6(str, str2, iac0Var, rck1Var, lkoVar, peqVar, byuVar, pyuVar, qeqVar, sbqVar, ki01Var, p6r0Var, ynb0VarA, flowable);
    }

    public ytp0 y() {
        lii1 lii1Var = (lii1) this.b;
        Scheduler scheduler = (Scheduler) lii1Var.k.get();
        c8o.l(scheduler);
        Flowable flowable = (Flowable) lii1Var.o.get();
        c8o.l(flowable);
        return new ytp0((Object) scheduler, (Object) flowable, (Object) ((cyp) ((jly0) this.d).get()).d(), (Object) PlayOrigin.create("listeningstats"), (Object) ((cyp) ((jly0) this.d).get()).a(), (byte) 13);
    }

    public mcu0 z() {
        cbg1 cbg1Var = (cbg1) this.b;
        Flowable flowableF = cbg1Var.f();
        c8o.l(flowableF);
        uot0 uot0Var = (uot0) this.c;
        t8u0 t8u0VarV = cbg1Var.v();
        c8o.l(t8u0VarV);
        iac0 iac0Var = (iac0) this.d;
        muz muzVarD = t8u0VarV.a(iac0Var.getLifecycle()).d();
        t8u0 t8u0VarV2 = cbg1Var.v();
        c8o.l(t8u0VarV2);
        return new mcu0(flowableF, uot0Var, muzVarD, t8u0VarV2.a(iac0Var.getLifecycle()).a());
    }

    public f0a() {
        this.a = (byte) 0;
        this.g = new ArrayList();
        this.X = new pz9((vz9) null, (String) null, (String) null, 63);
        this.Z = new LinkedHashMap();
        this.N0 = new LinkedHashSet();
        this.P0 = dz61.d;
        this.Q0 = new dmt(3);
    }

    public /* synthetic */ f0a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.t = obj9;
        this.X = obj10;
        this.Y = obj11;
        this.Z = obj12;
        this.N0 = obj13;
        this.O0 = obj14;
        this.P0 = obj15;
        this.Q0 = obj16;
    }

    public f0a(MaterialCardView materialCardView, ImageView imageView, View view, LinearLayout linearLayout, View view2, TextView textView, TextView textView2, RecyclerView recyclerView, EncoreButton encoreButton, TextView textView3, TextView textView4, TextView textView5, EncoreButton encoreButton2, EncoreButton encoreButton3, TextView textView6, FrameLayout frameLayout, MaterialCardView materialCardView2) {
        this.a = (byte) 10;
        this.b = imageView;
        this.c = view;
        this.d = linearLayout;
        this.e = view2;
        this.f = textView;
        this.g = textView2;
        this.h = recyclerView;
        this.i = encoreButton;
        this.t = textView3;
        this.X = textView4;
        this.Y = textView5;
        this.Z = encoreButton2;
        this.N0 = encoreButton3;
        this.O0 = textView6;
        this.P0 = frameLayout;
        this.Q0 = materialCardView2;
    }

    public f0a(e401 e401Var, e101 e101Var) {
        this.a = (byte) 5;
        this.b = e401Var;
        this.c = e101Var;
        this.d = iy81.a(new ykq(this, 1, (byte) 10));
        this.e = iy81.a(new ykq(this, 2, (byte) 10));
        this.f = iy81.a(new ykq(this, 3, (byte) 10));
        this.g = iy81.a(new ykq(this, 4, (byte) 10));
        this.h = iy81.a(new ykq(this, 0, (byte) 10));
        this.i = iy81.a(new ykq(this, 5, (byte) 10));
        this.t = iy81.a(new ykq(this, 9, (byte) 10));
        this.X = iy81.a(new ykq(this, 10, (byte) 10));
        this.Y = iy81.a(new ykq(this, 12, (byte) 10));
        this.Z = iy81.a(new ykq(this, 13, (byte) 10));
        this.N0 = iy81.a(new ykq(this, 11, (byte) 10));
        this.O0 = iy81.a(new ykq(this, 8, (byte) 10));
        this.P0 = iy81.a(new ykq(this, 7, (byte) 10));
        this.Q0 = iy81.a(new ykq(this, 6, (byte) 10));
    }

    public f0a(eto etoVar) {
        this.a = (byte) 1;
        this.b = etoVar;
        byte b = 22;
        this.c = new d7p(this, 1, b);
        this.d = new d7p(this, 2, b);
        this.e = iy81.a(new d7p(this, 0, b));
        this.f = new d7p(this, 3, b);
        this.g = iy81.a(new d7p(this, 4, b));
        this.h = iy81.a(new d7p(this, 5, b));
        this.i = iy81.a(new d7p(this, 7, b));
        this.t = iy81.a(new d7p(this, 6, b));
        this.X = iy81.a(new d7p(this, 8, b));
        this.Y = new d7p(this, 9, b);
        this.Z = new d7p(this, 10, b);
        this.N0 = iy81.a(new d7p(this, 12, b));
        this.O0 = xqu.b(new d7p(this, 11, b));
        this.P0 = new d7p(this, 13, b);
        this.Q0 = iy81.a(new d7p(this, 14, b));
    }

    public f0a(z0q z0qVar) {
        this.a = (byte) 6;
        this.b = z0qVar;
        this.c = xqu.b(new ipq(this, 2, (byte) 17));
        this.d = new ipq(this, 4, (byte) 17);
        this.e = new ipq(this, 5, (byte) 17);
        this.f = new ipq(this, 6, (byte) 17);
        this.g = new ipq(this, 7, (byte) 17);
        this.h = xqu.b(new ipq(this, 3, (byte) 17));
        this.i = new ipq(this, 9, (byte) 17);
        this.t = new ipq(this, 10, (byte) 17);
        this.X = new ipq(this, 11, (byte) 17);
        this.Y = new ipq(this, 12, (byte) 17);
        this.Z = xqu.b(new ipq(this, 8, (byte) 17));
        this.N0 = xqu.b(new ipq(this, 13, (byte) 17));
        this.O0 = new ipq(this, 1, (byte) 17);
        this.P0 = new ipq(this, 14, (byte) 17);
        this.Q0 = xqu.b(new ipq(this, 0, (byte) 17));
    }

    public f0a(lii1 lii1Var, kii1 kii1Var) {
        this.a = (byte) 8;
        this.b = lii1Var;
        this.c = kii1Var;
        this.d = xqu.b(new tsq(this, 1, (byte) 12));
        this.e = xqu.b(new tsq(this, 0, (byte) 12));
        this.f = xqu.b(new tsq(this, 2, (byte) 12));
        this.g = xqu.b(new tsq(this, 3, (byte) 12));
        this.h = iy81.a(new tsq(this, 4, (byte) 12));
        this.i = iy81.a(new tsq(this, 6, (byte) 12));
        this.t = iy81.a(new tsq(this, 8, (byte) 12));
        this.X = iy81.a(new tsq(this, 7, (byte) 12));
        this.Y = iy81.a(new tsq(this, 9, (byte) 12));
        this.Z = iy81.a(new tsq(this, 10, (byte) 12));
        this.N0 = iy81.a(new tsq(this, 11, (byte) 12));
        this.O0 = iy81.a(new tsq(this, 12, (byte) 12));
        this.P0 = iy81.a(new tsq(this, 13, (byte) 12));
        this.Q0 = iy81.a(new tsq(this, 5, (byte) 12));
    }

    public f0a(p7v0 p7v0Var, r7v0 r7v0Var, q7r0 q7r0Var) {
        this.a = (byte) 2;
        this.b = p7v0Var;
        this.c = q7r0Var;
        this.d = r7v0Var;
        byte b = 18;
        this.e = xqu.b(new ywp(this, 3, b));
        this.f = xqu.b(new ywp(this, 2, b));
        this.g = xqu.b(new ywp(this, 1, b));
        this.h = new ywp(this, 4, b);
        this.i = xqu.b(new ywp(this, 5, b));
        this.t = xqu.b(new ywp(this, 8, b));
        this.X = xqu.b(new ywp(this, 7, b));
        this.Y = xqu.b(new ywp(this, 6, b));
        this.Z = xqu.b(new ywp(this, 10, b));
        this.N0 = xqu.b(new ywp(this, 9, b));
        this.O0 = xqu.b(new ywp(this, 11, b));
        this.P0 = xqu.b(new ywp(this, 12, b));
        this.Q0 = xqu.b(new ywp(this, 0, b));
    }

    public f0a(cbg1 cbg1Var, uot0 uot0Var, iac0 iac0Var) {
        this.a = (byte) 7;
        this.b = cbg1Var;
        this.c = uot0Var;
        this.d = iac0Var;
        this.e = xqu.b(new tsq(this, 2, (byte) 7));
        this.f = xqu.b(new tsq(this, 4, (byte) 7));
        this.g = iy81.a(new tsq(this, 3, (byte) 7));
        this.h = xqu.b(new tsq(this, 5, (byte) 7));
        this.i = iy81.a(new tsq(this, 6, (byte) 7));
        this.t = xqu.b(new tsq(this, 7, (byte) 7));
        this.X = xqu.b(new tsq(this, 8, (byte) 7));
        this.Y = iy81.a(new tsq(this, 1, (byte) 7));
        this.Z = xqu.b(new tsq(this, 9, (byte) 7));
        this.N0 = iy81.a(new tsq(this, 10, (byte) 7));
        this.O0 = iy81.a(new tsq(this, 0, (byte) 7));
        this.P0 = iy81.a(new tsq(this, 11, (byte) 7));
        this.Q0 = iy81.a(new tsq(this, 12, (byte) 7));
    }

    public f0a(daq daqVar, i7d i7dVar, StorytellingContainerFragment storytellingContainerFragment) {
        this.a = (byte) 4;
        this.c = daqVar;
        this.d = i7dVar;
        this.b = storytellingContainerFragment;
        byte b = 9;
        this.e = new p2q(daqVar, i7dVar, this, 1, b);
        this.f = new p2q(daqVar, i7dVar, this, 0, b);
        this.g = iy81.a(new p2q(daqVar, i7dVar, this, 3, b));
        this.h = xqu.b(new p2q(daqVar, i7dVar, this, 2, b));
        this.i = xqu.b(new p2q(daqVar, i7dVar, this, 4, b));
        this.t = xqu.b(new p2q(daqVar, i7dVar, this, 5, b));
        this.X = xqu.b(new p2q(daqVar, i7dVar, this, 6, b));
        this.Y = xqu.b(new p2q(daqVar, i7dVar, this, 7, b));
        this.Z = xqu.b(new p2q(daqVar, i7dVar, this, 8, b));
        this.N0 = xqu.b(new p2q(daqVar, i7dVar, this, 9, b));
        this.O0 = xqu.b(new p2q(daqVar, i7dVar, this, 10, b));
        this.P0 = xqu.b(new p2q(daqVar, i7dVar, this, 11, b));
        this.Q0 = xqu.b(new p2q(daqVar, i7dVar, this, 12, b));
    }

    public f0a(daq daqVar, ProfileCompletionSheetHostActivity profileCompletionSheetHostActivity) {
        this.a = (byte) 3;
        this.c = daqVar;
        this.b = profileCompletionSheetHostActivity;
        this.d = jo80.a(profileCompletionSheetHostActivity);
        byte b = 27;
        this.e = xqu.b(new s2q(daqVar, this, 2, b));
        this.f = xqu.b(new s2q(daqVar, this, 1, b));
        this.g = new s2q(daqVar, this, 0, b);
        this.h = new s2q(daqVar, this, 4, b);
        this.i = new s2q(daqVar, this, 6, b);
        this.t = new s2q(daqVar, this, 5, b);
        this.X = new s2q(daqVar, this, 7, b);
        this.Y = new s2q(daqVar, this, 8, b);
        this.Z = new s2q(daqVar, this, 10, b);
        this.N0 = new s2q(daqVar, this, 12, b);
        this.O0 = new s2q(daqVar, this, 11, b);
        this.P0 = new s2q(daqVar, this, 9, b);
        this.Q0 = xqu.b(new s2q(daqVar, this, 3, b));
    }
}
