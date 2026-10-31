package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.creativeworkplatform.encore.elements.ArtworkShadow;
import com.spotify.creativeworkplatform.encore.elements.ArtworkView;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.nowplaying.uiusecases.seekbar.SuppressLayoutTextView;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h9n implements xi7, rz3, qiw, Function, Producer {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ h9n(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public zxu a() {
        toj0 toj0Var = (toj0) this.b;
        return new zxu(new j2v(new xpp0((vpp0) toj0Var.b, (xde0) toj0Var.c), (ayl) toj0Var.d), (mr20) toj0Var.e, (q8n) toj0Var.f, (q8n) toj0Var.g);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 5:
                uv00 uv00Var = (uv00) obj;
                oi oiVar = (oi) obj2;
                String str = (String) oiVar.d;
                zc8 zc8Var = uv00Var.a(zc8.class, str).b;
                jo70 jo70Var = uv00Var.a(jo70.class, str).b;
                String str2 = jo70Var != null ? jo70Var.a : null;
                pnt pntVar = uv00Var.a(pnt.class, str).b;
                String str3 = pntVar != null ? pntVar.a : null;
                l98 l98Var = uv00Var.a(l98.class, str).b;
                ArrayList<j98> arrayListJ = l98Var != null ? pwo1.j(l98Var.a) : null;
                f7l1 f7l1Var = uv00Var.a(f7l1.class, str).b;
                sqe sqeVar = f7l1Var != null ? f7l1Var.a : null;
                y6l1 y6l1Var = sqeVar instanceof y6l1 ? (y6l1) sqeVar : null;
                ArrayList arrayList = new ArrayList();
                if (oiVar.b && y6l1Var != null) {
                    xid1 xid1Var = xid1.a;
                    arrayList.add(new h8k1(xid1Var, xid1Var));
                }
                if (zc8Var != null && (!ihc1.y0(zc8Var.h)) && (!ihc1.y0(zc8Var.g) || !ihc1.y0(zc8Var.i))) {
                    lid1 lid1Var = lid1.a;
                    arrayList.add(new h8k1(lid1Var, lid1Var));
                }
                if (str2 != null && str2.length() > 67) {
                    nid1 nid1Var = new nid1(str2);
                    arrayList.add(new h8k1(nid1Var, nid1Var));
                }
                if ((zc8Var != null ? a8o.z(zc8Var) : null) instanceof onb) {
                    jid1 jid1Var = jid1.a;
                    arrayList.add(new h8k1(jid1Var, jid1Var));
                }
                if (str3 != null && (!ihc1.y0(str3))) {
                    xhd1 xhd1Var = xhd1.a;
                    arrayList.add(new h8k1(xhd1Var, xhd1Var));
                }
                if (arrayListJ != null && (!arrayListJ.isEmpty())) {
                    hid1 hid1Var = hid1.a;
                    arrayList.add(new h8k1(hid1Var, hid1Var));
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayListJ, 10));
                    for (j98 j98Var : arrayListJ) {
                        arrayList2.add(new did1(j98Var.b, j98Var.a));
                    }
                    fid1 fid1Var = new fid1(arrayList2);
                    arrayList.add(new h8k1(fid1Var, fid1Var));
                }
                if (zc8Var != null) {
                    bid1 bid1Var = bid1.a;
                    arrayList.add(new h8k1(bid1Var, bid1Var));
                    zhd1 zhd1Var = zhd1.a;
                    arrayList.add(new h8k1(zhd1Var, zhd1Var));
                }
                return arrayList;
            case 6:
                ghr ghrVar = (ghr) obj2;
                return ghrVar.j.firstOrError().flatMap(new wcr(ghrVar, (byte) 1)).flatMap(new xap((Object) ghrVar, (byte) 4));
            case 9:
                knr knrVar = (knr) obj2;
                PublishSubject publishSubject = knrVar.g;
                if (publishSubject != null) {
                    return publishSubject.throttleLatest(10L, TimeUnit.SECONDS, knrVar.a);
                }
                u890.C("invocations");
                throw null;
            case 23:
                if (((Boolean) obj).booleanValue()) {
                    return CompletableEmpty.a;
                }
                g6u g6uVar = (g6u) obj2;
                hce1 hce1Var = g6uVar.b;
                return ((Single) ((na) hce1Var.c).invoke()).flatMap(new zb91(hce1Var, (byte) 24)).flattenAsObservable(cq41.Y0).map(uml1.Y0).flatMapCompletable(new her(g6uVar, (byte) 22));
            case 25:
                sn5 sn5Var = (sn5) obj;
                if (sn5Var instanceof rn5) {
                    return new zn5(((un5) obj2).a);
                }
                if (sn5Var.equals(qn5.a)) {
                    return yn5.a;
                }
                eg.o();
                return null;
            case 28:
                List list = (List) obj;
                nkv nkvVar = (nkv) obj2;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r7h.W(((ba51) it.next()).b, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((aa51) it2.next()).d);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList4) {
                    Set set = s4b1.f;
                    blc0 blc0Var = uic.x((String) obj3).c;
                    nkvVar.getClass();
                    if (blc0Var == blc0.ti) {
                        arrayList5.add(obj3);
                    }
                }
                return arrayList5.isEmpty() ? Single.just(list) : nkvVar.a.b("EIS_playability_transformer_impl:search_result_section", arrayList5, true).map(new gmt(list, nkvVar, (byte) 13)).onErrorReturnItem(list);
            default:
                dg30 dg30Var = (dg30) ((otu) obj2).b;
                return new nzv(x74.j(dg30Var, "android.permission.CAMERA") != 0 ? ag0.C0(dg30Var, "android.permission.CAMERA") ? 2 : 3 : 1);
        }
    }

    public void b(Object obj) {
        ((y5t) this.b).l(obj);
    }

    public void c(Exception exc) {
        ((y5t) this.b).m(exc);
    }

    public void d(Bundle bundle) {
        ((nz3) this.b).a("clx", "_ae", bundle);
    }

    public Object get() {
        return new SchedulerWorkRunner(((sss) this.b).c);
    }

    public Single l(Intent intent, th61 th61Var) {
        fns fnsVar = igu.a;
        return rqt0.F(pyf0.a, new hff(this, intent, th61Var, (lnm) null, (byte) 25)).onErrorReturn(pzs0.T0);
    }

    public void v(Object obj) throws Throwable {
        r17 r17Var;
        byte b = this.a;
        int i = 8;
        Throwable th = null;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                v37 v37Var = (v37) obj;
                avn avnVar = (avn) obj2;
                boolean z = v37Var.a;
                String str = v37Var.b;
                vsn vsnVar = v37Var.c;
                boolean z2 = v37Var.d;
                BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = avnVar.a1;
                otn otnVar = avnVar.R0;
                View view = avnVar.V0;
                if (z2) {
                    Context context = avnVar.a;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(2131428372);
                    frameLayout.getClass();
                    int childCount = frameLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        frameLayout.getChildAt(i2).setVisibility(0);
                    }
                    avnVar.e(usn.a);
                    ArtworkShadow artworkShadow = avnVar.d1;
                    if (artworkShadow != null) {
                        artworkShadow.setVisibility(8);
                    }
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(2130968778, typedValue, true);
                    float dimensionPixelSize = otnVar instanceof mtn ? 0.0f : behaviorRetainingAppBarLayout.getResources().getDimensionPixelSize(2131165794);
                    ArtworkView artworkView = avnVar.b1;
                    if (artworkView == null) {
                        u890.C("artworkView");
                        throw null;
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(typedValue.data);
                    gradientDrawable.setCornerRadius(dimensionPixelSize);
                    artworkView.setBackground(gradientDrawable);
                    ArtworkView artworkView2 = avnVar.b1;
                    if (artworkView2 == null) {
                        u890.C("artworkView");
                        throw null;
                    }
                    artworkView2.setClipToOutline(true);
                    Drawable drawable = context.getDrawable(2131231986);
                    Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                    if (drawableMutate != null) {
                        TypedValue typedValue2 = new TypedValue();
                        context.getTheme().resolveAttribute(2130968791, typedValue2, true);
                        drawableMutate.setTint(typedValue2.data);
                    }
                    ArtworkView artworkView3 = avnVar.b1;
                    if (artworkView3 == null) {
                        u890.C("artworkView");
                        throw null;
                    }
                    artworkView3.setImageDrawable(drawableMutate);
                    ArtworkView artworkView4 = avnVar.b1;
                    if (artworkView4 == null) {
                        u890.C("artworkView");
                        throw null;
                    }
                    artworkView4.setScaleType(ImageView.ScaleType.MATRIX);
                    ArtworkView artworkView5 = avnVar.b1;
                    if (artworkView5 != null) {
                        artworkView5.addOnLayoutChangeListener(new yun((byte) 0));
                        return;
                    } else {
                        u890.C("artworkView");
                        throw null;
                    }
                }
                FrameLayout frameLayout2 = (FrameLayout) view.findViewById(2131428372);
                int childCount2 = frameLayout2.getChildCount();
                int i3 = 0;
                while (i3 < childCount2) {
                    Throwable th2 = th;
                    View childAt = frameLayout2.getChildAt(i3);
                    if (str != null && z) {
                        i = 0;
                    }
                    childAt.setVisibility(i);
                    i3++;
                    th = th2;
                    i = 8;
                }
                Throwable th3 = th;
                if (!z) {
                    ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                    if (layoutParams == null) {
                        bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginStart(0);
                        frameLayout2.setLayoutParams(marginLayoutParams);
                    }
                }
                avnVar.e(vsnVar);
                if (!(vsnVar instanceof usn) || str == null || (otnVar instanceof mtn)) {
                    ArtworkShadow artworkShadow2 = avnVar.d1;
                    if (artworkShadow2 != null) {
                        artworkShadow2.setVisibility(8);
                    }
                } else {
                    if (avnVar.d1 == null) {
                        int iB = avnVar.b(vsnVar);
                        int i4 = (iB * 16) / 9;
                        ArtworkView artworkView6 = avnVar.b1;
                        if (artworkView6 == null) {
                            u890.C("artworkView");
                            throw th3;
                        }
                        View artworkShadow3 = new ArtworkShadow(behaviorRetainingAppBarLayout.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                        int dimensionPixelSize2 = behaviorRetainingAppBarLayout.getResources().getDimensionPixelSize(2131165897) * 2;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i4 + dimensionPixelSize2, iB + dimensionPixelSize2);
                        layoutParams2.gravity = 17;
                        artworkShadow3.setLayoutParams(layoutParams2);
                        avnVar.d1 = artworkShadow3;
                        ((FrameLayout) view.findViewById(2131428372)).addView(artworkShadow3, 0);
                        aiq0.a(artworkView6, new oun(artworkView6, artworkShadow3, artworkView6, behaviorRetainingAppBarLayout.getResources().getDimensionPixelSize(2131165794)));
                    }
                    ArtworkShadow artworkShadow4 = avnVar.d1;
                    if (artworkShadow4 != null) {
                        artworkShadow4.setVisibility(0);
                    }
                }
                if (str != null) {
                    ArtworkView artworkView7 = avnVar.b1;
                    if (artworkView7 == null) {
                        u890.C("artworkView");
                        throw th3;
                    }
                    h07 h07Var = new h07(str);
                    if (otnVar instanceof mtn) {
                        r17Var = r17.d;
                    } else {
                        r17Var = avnVar.c1;
                        if (r17Var == null) {
                            u890.C("artworkShape");
                            throw th3;
                        }
                    }
                    p17 p17Var = new p17(h07Var, r17Var);
                    if (artworkView7.getWidth() <= 0 || artworkView7.getHeight() <= 0) {
                        artworkView7.addOnLayoutChangeListener(new x37(artworkView7, p17Var, (byte) 2));
                        return;
                    } else {
                        artworkView7.c(p17Var);
                        return;
                    }
                }
                return;
            case 7:
                Integer num = (Integer) obj;
                EncoreButton encoreButton = ((plr) obj2).a;
                num.getClass();
                encoreButton.setIconTint(plr.a(num.intValue()));
                return;
            case 10:
                oyn oynVar = (oyn) obj;
                err errVar = (err) obj2;
                ComposeView composeView = errVar.t;
                xpw xpwVar = errVar.d;
                if (xpwVar == null) {
                    return;
                }
                composeView.setVisibility(0);
                composeView.setContent(new j2i(-789582031, new wqr(errVar, xpwVar, oynVar, (byte) 1), true));
                return;
            case 12:
                zhm0.b((View) ((d520) ((odr) obj2).b).f, (String) obj);
                return;
            case 14:
                yhv0 yhv0Var = (yhv0) obj;
                yhv0Var.getClass();
                ((nqr) ((ngr) obj2).d).f(new gan(yhv0Var.a, yhv0Var.b, 4));
                return;
            case 15:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((BackButtonView) ((uhs) obj2).d.e).setVisibility(bool.booleanValue() ? 0 : 8);
                return;
            case 18:
                snf1 snf1Var = (snf1) obj;
                snf1Var.getClass();
                ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) ((lvs) obj2).d.g;
                if (snf1Var.l) {
                    contentRestrictionBadgeView.c(k4m.a);
                    return;
                } else {
                    contentRestrictionBadgeView.c(k4m.d);
                    return;
                }
            case 19:
                qws qwsVar = (qws) obj2;
                int iLongValue = (int) ((Number) obj).longValue();
                qwsVar.c.setProgress(iLongValue);
                g931 g931Var = qwsVar.f;
                ((SuppressLayoutTextView) g931Var.b).setTextAdjustingWidth(g931Var.i(iLongValue));
                if (qwsVar.Y == agv.b) {
                    qwsVar.a();
                    return;
                }
                return;
            default:
                Set set = (Set) obj;
                set.getClass();
                MobiusLoop mobiusLoop = ((z1v) obj2).b;
                if (mobiusLoop != null) {
                    mobiusLoop.a(new ewu(set, false));
                    return;
                } else {
                    u890.C("loop");
                    throw null;
                }
        }
    }
}
