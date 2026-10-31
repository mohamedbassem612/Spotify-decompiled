package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.spotify.checkout.elements.utils.AdditionalInfoView;
import com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.premium.PremiumBadgeView;
import com.spotify.encoreconsumermobile.elements.playindicator.PlayIndicatorComposeView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.mobius.coroutines.a;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ks6 implements dl4 {
    public final Object N0;
    public final Object O0;
    public final Object P0;
    public final Object Q0;
    public final Object R0;
    public final Object S0;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public ks6(ntv ntvVar, ptv ptvVar, q7r0 q7r0Var) {
        this.a = ntvVar;
        this.b = ptvVar;
        this.c = q7r0Var;
        this.d = xqu.b(new lbp(this, 1, (byte) 6));
        this.e = xqu.b(new lbp(this, 0, (byte) 6));
        this.f = iy81.a(new lbp(this, 3, (byte) 6));
        this.g = xqu.b(new lbp(this, 2, (byte) 6));
        this.h = xqu.b(new lbp(this, 6, (byte) 6));
        this.i = iy81.a(new lbp(this, 7, (byte) 6));
        this.t = iy81.a(new lbp(this, 5, (byte) 6));
        this.X = xqu.b(new lbp(this, 8, (byte) 6));
        this.Y = iy81.a(new lbp(this, 9, (byte) 6));
        this.Z = new lbp(this, 4, (byte) 6);
        this.N0 = xqu.b(new lbp(this, 10, (byte) 6));
        this.O0 = iy81.a(new lbp(this, 13, (byte) 6));
        this.P0 = xqu.b(new lbp(this, 12, (byte) 6));
        this.Q0 = iy81.a(new lbp(this, 15, (byte) 6));
        this.R0 = xqu.b(new lbp(this, 14, (byte) 6));
        this.S0 = xqu.b(new lbp(this, 11, (byte) 6));
    }

    public static ks6 g(LayoutInflater layoutInflater) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131626042, (ViewGroup) null, false);
        int i = 2131427413;
        ViewStub viewStub = (ViewStub) m5n1.t(constraintLayoutInflate, 2131427413);
        if (viewStub != null) {
            i = 2131427417;
            ViewStub viewStub2 = (ViewStub) m5n1.t(constraintLayoutInflate, 2131427417);
            if (viewStub2 != null) {
                i = 2131427611;
                ArtworkView artworkViewT = m5n1.t(constraintLayoutInflate, 2131427611);
                if (artworkViewT != null) {
                    i = 2131428508;
                    DownloadBadgeView downloadBadgeViewT = m5n1.t(constraintLayoutInflate, 2131428508);
                    if (downloadBadgeViewT != null) {
                        i = 2131428664;
                        EnhancedBadgeView enhancedBadgeViewT = m5n1.t(constraintLayoutInflate, 2131428664);
                        if (enhancedBadgeViewT != null) {
                            i = 2131429056;
                            Guideline guidelineT = m5n1.t(constraintLayoutInflate, 2131429056);
                            if (guidelineT != null) {
                                i = 2131429057;
                                Guideline guidelineT2 = m5n1.t(constraintLayoutInflate, 2131429057);
                                if (guidelineT2 != null) {
                                    i = 2131429846;
                                    LockedBadgeView lockedBadgeViewT = m5n1.t(constraintLayoutInflate, 2131429846);
                                    if (lockedBadgeViewT != null) {
                                        i = 2131430403;
                                        PlayIndicatorComposeView playIndicatorComposeViewT = m5n1.t(constraintLayoutInflate, 2131430403);
                                        if (playIndicatorComposeViewT != null) {
                                            i = 2131430468;
                                            PremiumBadgeView premiumBadgeViewT = m5n1.t(constraintLayoutInflate, 2131430468);
                                            if (premiumBadgeViewT != null) {
                                                i = 2131430482;
                                                ViewStub viewStub3 = (ViewStub) m5n1.t(constraintLayoutInflate, 2131430482);
                                                if (viewStub3 != null) {
                                                    i = 2131430485;
                                                    ViewStub viewStub4 = (ViewStub) m5n1.t(constraintLayoutInflate, 2131430485);
                                                    if (viewStub4 != null) {
                                                        i = 2131430571;
                                                        QuickActionView quickActionViewT = m5n1.t(constraintLayoutInflate, 2131430571);
                                                        if (quickActionViewT != null) {
                                                            i = 2131430674;
                                                            ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(constraintLayoutInflate, 2131430674);
                                                            if (contentRestrictionBadgeViewT != null) {
                                                                i = 2131430716;
                                                                ViewStub viewStub5 = (ViewStub) m5n1.t(constraintLayoutInflate, 2131430716);
                                                                if (viewStub5 != null) {
                                                                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                                    i = 2131431115;
                                                                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                                                                    if (textView != null) {
                                                                        i = 2131431356;
                                                                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                                                        if (textView2 != null) {
                                                                            i = 2131431599;
                                                                            FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131431599);
                                                                            if (frameLayout != null) {
                                                                                return new ks6(constraintLayout, viewStub, viewStub2, artworkViewT, downloadBadgeViewT, enhancedBadgeViewT, guidelineT, guidelineT2, lockedBadgeViewT, playIndicatorComposeViewT, premiumBadgeViewT, viewStub3, viewStub4, quickActionViewT, contentRestrictionBadgeViewT, viewStub5, constraintLayout, textView, textView2, frameLayout);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public static ks6 h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624560, viewGroup, false);
        int i = 2131427525;
        AdditionalInfoView additionalInfoViewT = m5n1.t(constraintLayoutInflate, 2131427525);
        if (additionalInfoViewT != null) {
            i = 2131427742;
            View viewT = m5n1.t(constraintLayoutInflate, 2131427742);
            if (viewT != null) {
                i = 2131428437;
                if (m5n1.t(constraintLayoutInflate, 2131428437) != null) {
                    i = 2131429090;
                    Group groupT = m5n1.t(constraintLayoutInflate, 2131429090);
                    if (groupT != null) {
                        i = 2131429612;
                        ShapeableImageView shapeableImageViewT = m5n1.t(constraintLayoutInflate, 2131429612);
                        if (shapeableImageViewT != null) {
                            i = 2131429631;
                            Barrier barrierT = m5n1.t(constraintLayoutInflate, 2131429631);
                            if (barrierT != null) {
                                i = 2131430252;
                                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131430252);
                                if (textView != null) {
                                    i = 2131430493;
                                    TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131430493);
                                    if (textView2 != null) {
                                        i = 2131430494;
                                        TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131430494);
                                        if (textView3 != null) {
                                            i = 2131430495;
                                            Group groupT2 = m5n1.t(constraintLayoutInflate, 2131430495);
                                            if (groupT2 != null) {
                                                i = 2131430507;
                                                CardView cardViewT = m5n1.t(constraintLayoutInflate, 2131430507);
                                                if (cardViewT != null) {
                                                    i = 2131430508;
                                                    RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131430508);
                                                    if (recyclerViewT != null) {
                                                        i = 2131430596;
                                                        FaceView faceViewT = m5n1.t(constraintLayoutInflate, 2131430596);
                                                        if (faceViewT != null) {
                                                            i = 2131430597;
                                                            FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131430597);
                                                            if (frameLayout != null) {
                                                                i = 2131431115;
                                                                TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                                                                if (textView4 != null) {
                                                                    i = 2131431217;
                                                                    TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate, 2131431217);
                                                                    if (textView5 != null) {
                                                                        i = 2131431344;
                                                                        RecyclerView recyclerViewT2 = m5n1.t(constraintLayoutInflate, 2131431344);
                                                                        if (recyclerViewT2 != null) {
                                                                            i = 2131431356;
                                                                            TextView textView6 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                                                            if (textView6 != null) {
                                                                                i = 2131431422;
                                                                                View viewT2 = m5n1.t(constraintLayoutInflate, 2131431422);
                                                                                if (viewT2 != null) {
                                                                                    return new ks6(constraintLayoutInflate, additionalInfoViewT, viewT, groupT, shapeableImageViewT, barrierT, textView, textView2, textView3, groupT2, cardViewT, recyclerViewT, faceViewT, frameLayout, textView4, textView5, recyclerViewT2, textView6, viewT2);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public beg a(heg hegVar) {
        return (beg) ((geg) this.S0).b.invoke(new feg(hegVar, (ydg) null));
    }

    public void b(Function0 function0, Function0 function1) {
        ((iac0) this.c).getLifecycle().a(new xm8(function0, function1, (byte) 2));
    }

    public jtv c() {
        s061 s061Var = (s061) ((jly0) this.g).get();
        String strI = i();
        ntv ntvVar = (ntv) this.a;
        c8o.l((z6k0) ntvVar.j.get());
        rxj0 rxj0Var = (rxj0) ntvVar.q.get();
        c8o.l(rxj0Var);
        vek0 vek0Var = (vek0) ntvVar.A.get();
        c8o.l(vek0Var);
        mhk0 mhk0Var = (mhk0) ntvVar.E.get();
        c8o.l(mhk0Var);
        yzu yzuVar = new yzu();
        yzuVar.a = strI;
        yzuVar.b = rxj0Var;
        yzuVar.c = vek0Var;
        yzuVar.d = mhk0Var;
        return new jtv(s061Var, yzuVar);
    }

    public k740 d(y1c1 y1c1Var) {
        return (k740) ((AtomicReference) this.O0).updateAndGet(new ycr0(this, y1c1Var, (byte) 1));
    }

    public ConstraintLayout e() {
        return (ConstraintLayout) this.a;
    }

    public s1c1 f() {
        return (s1c1) this.a;
    }

    public String i() {
        String str = ((ptv) this.b).b;
        c8o.m(str);
        return str;
    }

    public yt91 j() {
        i8h1 i8h1Var = (i8h1) ((daq) this.b).A5.get();
        CulturalMomentsStoryActivity culturalMomentsStoryActivity = (CulturalMomentsStoryActivity) this.a;
        String str = culturalMomentsStoryActivity.getViewUri().a;
        c8o.m(str);
        String strC = vwn.c();
        r6h1 r6h1Var = r6h1.c;
        return new yt91(i8h1Var, culturalMomentsStoryActivity, new yok0(strC, str, (byte) 12), (byte) 25);
    }

    public void w(Object obj) {
        CulturalMomentsStoryActivity culturalMomentsStoryActivity = (CulturalMomentsStoryActivity) obj;
        ((t3b1) culturalMomentsStoryActivity).b1 = (jgu) ((p2p) this.d).get();
        ((t3b1) culturalMomentsStoryActivity).c1 = new tuk(xqu.a((p2p) this.g));
        culturalMomentsStoryActivity.f1 = (a2k) ((jly0) this.Z).get();
    }

    public ks6(s1c1 s1c1Var, zim0 zim0Var, zdg zdgVar, kf5 kf5Var, fzq0 fzq0Var, siz sizVar, eq20 eq20Var, Iterable iterable, poj0 poj0Var, yz1 yz1Var, qct0 qct0Var, vz00 vz00Var, bao0 bao0Var, List list, s0z s0zVar) {
        u321 u321Var = u321.Y0;
        d710 d710Var = d710.Y;
        this.a = s1c1Var;
        this.b = zim0Var;
        this.c = u321Var;
        this.d = zdgVar;
        this.e = kf5Var;
        this.f = fzq0Var;
        this.g = d710Var;
        this.h = sizVar;
        this.i = eq20Var;
        this.t = iterable;
        this.X = poj0Var;
        this.Y = eom.a;
        this.Z = yz1Var;
        this.N0 = qct0Var;
        this.O0 = vz00Var;
        this.P0 = bao0Var;
        this.Q0 = list;
        this.R0 = s0zVar;
        this.S0 = new geg(this);
    }

    public ks6(zf30 zf30Var, p730 p730Var, a aVar, a241 a241Var, mcs mcsVar, kt91 kt91Var, u5g1 u5g1Var, cu8 cu8Var, j2v j2vVar, pae paeVar, ku1 ku1Var, ku1 ku1Var2, u421 u421Var, f9v0 f9v0Var, uu00 uu00Var, rsz0 rsz0Var, brz0 brz0Var, boolean z, xrc0 xrc0Var, xlo xloVar, f771 f771Var, u35 u35Var, m591 m591Var, q8n q8nVar, q8n q8nVar2) {
        this.a = zf30Var;
        this.b = p730Var;
        this.c = aVar;
        this.d = a241Var;
        this.e = mcsVar;
        this.f = kt91Var;
        this.g = u5g1Var;
        this.h = j2vVar;
        this.i = paeVar;
        this.t = ku1Var;
        this.X = ku1Var2;
        this.Y = u421Var;
        this.Z = f9v0Var;
        this.N0 = uu00Var;
        this.O0 = xrc0Var;
        this.P0 = xloVar;
        this.Q0 = m591Var;
        this.R0 = q8nVar;
        this.S0 = q8nVar2;
    }

    public ks6(String str, String str2, iac0 iac0Var, rck1 rck1Var, lko lkoVar, peq peqVar, byu byuVar, pyu pyuVar, qeq qeqVar, sbq sbqVar, ki01 ki01Var, p6r0 p6r0Var, ynb0 ynb0Var, Flowable flowable) {
        this.b = str;
        this.a = str2;
        this.c = iac0Var;
        this.d = rck1Var;
        this.e = lkoVar;
        this.f = peqVar;
        this.g = byuVar;
        this.h = pyuVar;
        this.i = qeqVar;
        this.t = sbqVar;
        this.X = ki01Var;
        this.Y = ynb0Var;
        this.Z = flowable;
        this.N0 = new AtomicReference();
        this.O0 = new AtomicReference();
        this.P0 = new AtomicReference();
        this.Q0 = new AtomicReference();
        this.R0 = new AtomicReference();
        this.S0 = new AtomicReference();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ks6(s1c1 s1c1Var, zim0 zim0Var, lqr lqrVar, km3 km3Var, hzq0 hzq0Var, Iterable iterable, poj0 poj0Var, yz1 yz1Var, qct0 qct0Var, vz00 vz00Var, bao0 bao0Var, int i) {
        bao0 bao0Var2;
        si10 si10Var = si10.c;
        ios iosVar = yi20.h;
        if ((i & 65536) != 0) {
            bao0.b.getClass();
            bao0Var2 = aao0.b;
        } else {
            bao0Var2 = bao0Var;
        }
        this(s1c1Var, zim0Var, lqrVar, km3Var, hzq0Var, siz.F, si10Var, iterable, poj0Var, yz1Var, qct0Var, vz00Var, bao0Var2, Collections.singletonList(cys.a), (i & 524288) != 0 ? ios.b1 : iosVar);
    }

    public ks6(ConstraintLayout constraintLayout, ViewStub viewStub, ViewStub viewStub2, ArtworkView artworkView, DownloadBadgeView downloadBadgeView, EnhancedBadgeView enhancedBadgeView, Guideline guideline, Guideline guideline2, LockedBadgeView lockedBadgeView, PlayIndicatorComposeView playIndicatorComposeView, PremiumBadgeView premiumBadgeView, ViewStub viewStub3, ViewStub viewStub4, QuickActionView quickActionView, ContentRestrictionBadgeView contentRestrictionBadgeView, ViewStub viewStub5, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, FrameLayout frameLayout) {
        this.a = constraintLayout;
        this.b = viewStub;
        this.c = viewStub2;
        this.d = artworkView;
        this.e = downloadBadgeView;
        this.f = enhancedBadgeView;
        this.g = guideline;
        this.h = guideline2;
        this.i = lockedBadgeView;
        this.t = playIndicatorComposeView;
        this.X = premiumBadgeView;
        this.Y = viewStub3;
        this.Z = quickActionView;
        this.N0 = contentRestrictionBadgeView;
        this.O0 = viewStub5;
        this.P0 = constraintLayout2;
        this.Q0 = textView;
        this.R0 = textView2;
        this.S0 = frameLayout;
    }

    public /* synthetic */ ks6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
        this.i = obj9;
        this.t = obj10;
        this.X = obj11;
        this.Y = obj12;
        this.Z = obj13;
        this.N0 = obj14;
        this.O0 = obj15;
        this.P0 = obj16;
        this.Q0 = obj17;
        this.R0 = obj18;
        this.S0 = obj19;
    }

    public ks6(daq daqVar, CulturalMomentsStoryActivity culturalMomentsStoryActivity) {
        this.b = daqVar;
        this.a = culturalMomentsStoryActivity;
        byte b = 27;
        this.c = new p2p(daqVar, this, 1, b);
        this.d = new p2p(daqVar, this, 0, b);
        this.e = xqu.b(new p2p(daqVar, this, 4, b));
        this.f = xqu.b(new p2p(daqVar, this, 3, b));
        this.g = new p2p(daqVar, this, 2, b);
        this.h = new p2p(daqVar, this, 6, b);
        this.i = new p2p(daqVar, this, 8, b);
        this.t = new p2p(daqVar, this, 7, b);
        this.X = new p2p(daqVar, this, 9, b);
        this.Y = new p2p(daqVar, this, 10, b);
        this.Z = xqu.b(new p2p(daqVar, this, 5, b));
        this.N0 = iy81.a(new p2p(daqVar, this, 11, b));
        this.O0 = xqu.b(new p2p(daqVar, this, 15, b));
        this.P0 = xqu.b(new p2p(daqVar, this, 14, b));
        this.Q0 = new p2p(daqVar, this, 13, b);
        this.R0 = xqu.b(new p2p(daqVar, this, 12, b));
        this.S0 = iy81.a(new p2p(daqVar, this, 16, b));
    }
}
