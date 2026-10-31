package com.spotify.encoreconsumermobile.elements.badge.badgegroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.paid.PaidBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.premium.PremiumBadgeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b2a;
import p.c2a;
import p.d2a;
import p.e2a;
import p.eg;
import p.eqq;
import p.jd11;
import p.k4m;
import p.k8p1;
import p.n5;
import p.n57;
import p.nln;
import p.o1v;
import p.o7h;
import p.oys0;
import p.q4u;
import p.q7h;
import p.rc11;
import p.slr0;
import p.tka0;
import p.tlv;
import p.u1a;
import p.u890;
import p.v1a;
import p.w1a;
import p.x1a;
import p.y1a;
import p.yo31;
import p.z1a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/badgegroup/BadgeGroupView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_badgegroup-badgegroup"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class BadgeGroupView extends ConstraintLayout implements tlv {
    public static final /* synthetic */ int V0 = 0;
    public final yo31 T0;
    public final q4u U0;

    public BadgeGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131624080, this);
        yo31 yo31Var = new yo31(this, (byte) 27);
        eqq.t(-2, -2, yo31Var.h());
        this.T0 = yo31Var;
        this.U0 = nln.w(new q4u[]{nln.x(c2a.b, nln.v(new n5(this, (byte) 27))), nln.x(d2a.b, nln.v(new n5(this, (byte) 28))), nln.x(e2a.b, nln.v(new n5(this, (byte) 29)))});
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void A(View view, z1a z1aVar) throws NoWhenBranchMatchedException {
        tka0 tka0VarB;
        ContentRestrictionBadgeView contentRestrictionBadgeView;
        if (z1aVar == null) {
            view.setVisibility(8);
            return;
        }
        if ((view.getTag(2131427681) instanceof u1a) && (z1aVar instanceof u1a)) {
            if (((u1a) view.getTag(2131427681)).c().equals(((u1a) z1aVar).c())) {
                return;
            }
            view.setVisibility(0);
            k8p1.o(view, y(z1aVar));
            return;
        }
        Class<?> cls = view.getClass();
        jd11 jd11Var = rc11.a;
        tka0 tka0VarB2 = jd11Var.b(cls);
        boolean z = z1aVar instanceof y1a;
        if (z) {
            tka0VarB = jd11Var.b(ContentRestrictionBadgeView.class);
        } else if (z1aVar instanceof v1a) {
            tka0VarB = jd11Var.b(DownloadBadgeView.class);
        } else if (z1aVar.equals(w1a.b)) {
            tka0VarB = jd11Var.b(EnhancedBadgeView.class);
        } else if (z1aVar instanceof x1a) {
            tka0VarB = jd11Var.b(PaidBadgeView.class);
        } else if (z1aVar.equals(w1a.d)) {
            tka0VarB = jd11Var.b(PremiumBadgeView.class);
        } else if (z1aVar.equals(w1a.c)) {
            tka0VarB = jd11Var.b(oys0.class);
        } else {
            if (!(z1aVar instanceof u1a)) {
                eg.o();
                return;
            }
            tka0VarB = jd11Var.b(View.class);
        }
        if (!tka0VarB2.equals(tka0VarB)) {
            view.setVisibility(0);
            k8p1.o(view, y(z1aVar));
            return;
        }
        if (z) {
            contentRestrictionBadgeView = view instanceof ContentRestrictionBadgeView ? (ContentRestrictionBadgeView) view : null;
            if (contentRestrictionBadgeView != null) {
                contentRestrictionBadgeView.c(((y1a) z1aVar).b());
                return;
            } else {
                k8p1.o(view, y(z1aVar));
                return;
            }
        }
        if (z1aVar instanceof v1a) {
            contentRestrictionBadgeView = view instanceof DownloadBadgeView ? (DownloadBadgeView) view : null;
            if (contentRestrictionBadgeView != null) {
                contentRestrictionBadgeView.c(((v1a) z1aVar).b());
                return;
            } else {
                k8p1.o(view, y(z1aVar));
                return;
            }
        }
        if (z1aVar instanceof x1a) {
            contentRestrictionBadgeView = view instanceof PaidBadgeView ? (PaidBadgeView) view : null;
            if (contentRestrictionBadgeView != null) {
                contentRestrictionBadgeView.c(new slr0(((x1a) z1aVar).b()));
            } else {
                k8p1.o(view, y(z1aVar));
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final View y(z1a z1aVar) throws NoWhenBranchMatchedException {
        ContentRestrictionBadgeView contentRestrictionBadgeViewB;
        if (z1aVar instanceof y1a) {
            Context context = getContext();
            k4m k4mVarB = ((y1a) z1aVar).b();
            contentRestrictionBadgeViewB = new ContentRestrictionBadgeView(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
            contentRestrictionBadgeViewB.c(k4mVarB);
        } else if (z1aVar instanceof v1a) {
            Context context2 = getContext();
            o1v o1vVarB = ((v1a) z1aVar).b();
            contentRestrictionBadgeViewB = new DownloadBadgeView(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            contentRestrictionBadgeViewB.c(o1vVarB);
        } else if (u890.j(z1aVar, w1a.b)) {
            contentRestrictionBadgeViewB = new EnhancedBadgeView(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        } else if (z1aVar instanceof x1a) {
            contentRestrictionBadgeViewB = new PaidBadgeView(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            contentRestrictionBadgeViewB.c(new slr0(((x1a) z1aVar).b()));
        } else if (u890.j(z1aVar, w1a.d)) {
            ContentRestrictionBadgeView premiumBadgeView = new PremiumBadgeView(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            premiumBadgeView.c(true);
            contentRestrictionBadgeViewB = premiumBadgeView;
        } else if (u890.j(z1aVar, w1a.c)) {
            ContentRestrictionBadgeView oys0Var = new oys0(getContext(), 0);
            oys0Var.c(true);
            contentRestrictionBadgeViewB = oys0Var;
        } else {
            if (!(z1aVar instanceof u1a)) {
                eg.o();
                return null;
            }
            contentRestrictionBadgeViewB = ((u1a) z1aVar).b();
        }
        contentRestrictionBadgeViewB.setTag(2131427681, z1aVar);
        return contentRestrictionBadgeViewB;
    }

    @Override // p.mi90
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void f(b2a b2aVar) {
        Set set = b2aVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!(((z1a) obj) instanceof u1a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(rc11.a.b(((z1a) it.next()).getClass()));
        }
        if (o7h.j0(arrayList2).size() < arrayList.size()) {
            n57.e("BadgeGroup's Model shouldn't contain duplicate badge types");
        }
        setVisibility(set.isEmpty() ? 8 : 0);
        this.U0.a(b2aVar);
    }

    public BadgeGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BadgeGroupView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BadgeGroupView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
