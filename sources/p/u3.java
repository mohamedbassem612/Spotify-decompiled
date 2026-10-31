package p;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.creativeworkplatform.encore.elements.releasedate.ReleaseDateView;
import com.spotify.creativeworkplatform.headerelement.CreativeWorkHeaderStickyBehavior;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.nowplaying.carousel.CarouselView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.transcript.uiusecases.zoomimageview.ZoomImageView;
import io.reactivex.rxjava3.core.Scheduler;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u3 implements isw {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;

    public u3(Context context, qzo0 qzo0Var, iu30 iu30Var) {
        this.a = (byte) 7;
        this.f = qzo0Var;
        CarouselView carouselView = new CarouselView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        carouselView.setContentDescription(context.getResources().getString(2131954289));
        carouselView.setHorizontalScrollBarEnabled(false);
        azo0 azo0Var = qzo0Var.c;
        carouselView.setAdapter(azo0Var);
        carouselView.m(new zl7());
        tro0 tro0Var = new tro0(iu30Var, (byte) 1);
        tro0 tro0Var2 = new tro0(iu30Var, (byte) 2);
        tro0 tro0Var3 = new tro0(iu30Var, (byte) 3);
        ivn0 ivn0Var = new ivn0(this, (byte) 14);
        xrc xrcVar = xrc.R0;
        carouselView.m2 = tro0Var;
        carouselView.n2 = tro0Var2;
        carouselView.o2 = tro0Var3;
        carouselView.p2 = xrcVar;
        carouselView.q2 = new w5j1(ivn0Var);
        azo0Var.h = new tro0(iu30Var, (byte) 4);
        this.c = carouselView;
        this.d = r4u.c(new r4u[]{r4u.d(ua20.Q0, r4u.a(new mre0(this, (byte) 17))), r4u.d(va20.Q0, new r4u(new l1e(context.getResources()), new m4e0(this, (byte) 18)))});
        this.e = carouselView;
    }

    /* JADX WARN: Code duplicated, block: B:274:0x068a  */
    /* JADX WARN: Code duplicated, block: B:352:0x080d  */
    public final void a(Object obj, ysw yswVar) {
        String str;
        String string;
        Object value;
        iun iunVar;
        u3 u3Var;
        ftn etnVar;
        ftn ftnVar;
        ssn ssnVar;
        View viewB;
        int i;
        d0r d0rVar;
        jkj0 jkj0Var;
        jkj0 jkj0Var2;
        jkj0 jkj0Var3;
        jkj0 jkj0Var4;
        jkj0 jkj0Var5;
        jkj0 jkj0Var6;
        jkj0 jkj0Var7;
        View viewB2;
        mr20 mr20Var;
        View viewB3;
        View view;
        otn otnVar;
        int i2;
        int i3;
        int iC;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ey50 ey50Var;
        vu30 vu30Var;
        int paddingStart;
        dtw dtwVarB;
        byte b = this.a;
        int i4 = 0;
        xzf1 xzf1Var = null;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.c;
                t3 t3Var = (t3) obj;
                b3 b3Var = new b3(t3Var.a, t3Var.b, t3Var.c);
                p811 p811Var = (p811) this.d;
                Object obj3 = p811Var.a;
                if (obj3 != null) {
                    tka0 tka0Var = dtw.C;
                    ((dtw) obj3).k(b3Var, goa0.a, (vu30) null);
                    return;
                } else {
                    tka0 tka0Var2 = dtw.C;
                    dtw dtwVarB2 = mhc.b((Context) this.e, frameLayout, (n3) ((v3) obj2).f.getValue(), b3Var, (ipb1) null, 112);
                    p811Var.a = dtwVarB2;
                    frameLayout.addView(dtwVarB2.w);
                    return;
                }
            case 1:
                jg3 jg3Var = (jg3) obj;
                dx0 dx0Var = (dx0) obj2;
                TextView textView = (TextView) this.d;
                String str2 = jg3Var.a;
                long j = jg3Var.c;
                int i5 = jg3Var.b;
                if (!jg3Var.d || i5 <= 0 || j <= 0) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    Resources resources = (Resources) this.e;
                    Integer numValueOf = Integer.valueOf(i5);
                    Resources resources2 = ((lb) dx0Var.d).a.getResources();
                    long j2 = j / 60;
                    long j3 = j2 / 60;
                    long j4 = j2 % 60;
                    long j5 = j - ((j4 * 60) + (3600 * j3));
                    if (j < 60) {
                        string = resources2.getString(2131961574, Long.valueOf(j));
                        string.getClass();
                    } else if (j2 < 60) {
                        string = resources2.getString(2131958599, Long.valueOf(j4), Long.valueOf(j5));
                        string.getClass();
                    } else {
                        string = resources2.getString(2131956637, Long.valueOf(j3), Long.valueOf(j4));
                        string.getClass();
                    }
                    textView.setText(resources.getQuantityString(2131820568, i5, numValueOf, string));
                }
                if (ihc1.y0(str2)) {
                    return;
                }
                TextView textView2 = (TextView) this.c;
                try {
                    Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(str2);
                    str = date != null ? new SimpleDateFormat("MMMM d, yyyy", Locale.getDefault()).format(date) : null;
                    break;
                } catch (Exception unused) {
                }
                textView2.setText(str);
                return;
            case 2:
                xxd xxdVar = (yxd) obj;
                View view2 = (View) this.d;
                Button button = (Button) this.c;
                if (xxdVar.equals(wxd.a)) {
                    view2.setVisibility(8);
                    return;
                }
                if (!(xxdVar instanceof xxd)) {
                    eg.o();
                    return;
                }
                view2.setVisibility(0);
                kdn0 kdn0Var = (kdn0) ((bs0) this.e).b;
                xxd xxdVar2 = xxdVar;
                txd txdVar = xxdVar2.c;
                kdn0Var.m(xxdVar2.b);
                ((TextView) this.b).setText(xxdVar2.a);
                if (txdVar != null) {
                    button.setVisibility(0);
                    button.setText(txdVar.a);
                    button.setOnClickListener(new cg1((iu30) obj2, xxdVar, (byte) 18));
                    return;
                }
                return;
            case 3:
                bwh bwhVar = (bwh) obj;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                boolean z5 = bwhVar.c;
                EncoreTextView encoreTextView = (EncoreTextView) this.d;
                if (z5) {
                    encoreTextView.setText(2131953452);
                } else {
                    encoreTextView.setText(2131953453);
                }
                bs0 bs0Var = (bs0) obj2;
                lwh lwhVar = (lwh) bs0Var.b;
                iac0 iac0Var = (iac0) bs0Var.d;
                List list = bwhVar.d;
                yq41 yq41Var = (yq41) bs0Var.e;
                k9k k9kVar = (k9k) lwhVar.f.a.c;
                xrc0 xrc0VarL = ((bxd) k9kVar.b).l();
                c8o.l(xrc0VarL);
                p2o0 p2o0Var = new p2o0(iac0Var, xrc0VarL, (b2p) k9kVar.c, (b2p) k9kVar.d);
                bpb1 bpb1Var = (bpb1) p2o0Var.f;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, uyd.a((uyd) value, null, t110.a(list), false, 13)));
                owh owhVar = new owh(lwhVar.a, p2o0Var, lwhVar.d.a(yq41Var.a), lwhVar.b, lwhVar.c, lwhVar.e, yq41Var);
                String str3 = z5 ? bwhVar.a : bwhVar.b;
                tka0 tka0Var3 = dtw.C;
                dtw dtwVarB3 = mhc.b((Context) this.e, frameLayout2, f6o1.A(owhVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new iwh(str3, 4, false), (ipb1) null, 48);
                frameLayout2.removeAllViews();
                frameLayout2.addView(dtwVarB3.w);
                return;
            case 4:
                iun iunVar2 = (iun) obj;
                kun kunVar = (kun) this.d;
                if (iunVar2 instanceof hun) {
                    String str4 = "creativeWorkHeader";
                    if (((htn) this.c) == null) {
                        qp11 qp11Var = kunVar.c;
                        lls0 lls0Var = kunVar.a;
                        cp11 cp11Var = ((hun) iunVar2).a;
                        String str5 = cp11Var.a;
                        ViewGroup viewGroup = (ViewGroup) this.e;
                        d0r d0rVar2 = qp11Var.h;
                        y1c1 y1c1Var = qp11Var.f;
                        List list2 = cp11Var.c;
                        List list3 = cp11Var.e;
                        vp11 vp11Var = qp11Var.a;
                        my50 my50Var = vp11Var.a;
                        iunVar = iunVar2;
                        int i6 = vp11Var.j;
                        zx50 zx50Var = my50Var.b;
                        if (zx50Var != null) {
                            rt01 rt01Var = qp11Var.d;
                            String str6 = zx50Var.a;
                            if (!(zx50Var instanceof zx50)) {
                                eg.o();
                                return;
                            }
                            viewB = qp11.b(rt01Var, viewGroup, new gg20(str6, new fg20(zx50Var.b)));
                        } else {
                            viewB = null;
                        }
                        jx50 jx50Var = my50Var.m;
                        String str7 = my50Var.l;
                        dy50 dy50Var = my50Var.n;
                        iu30 iu30Var = my50Var.e;
                        vu30 vu30Var2 = ((fx50) iu30Var.invoke(y1c1Var)).a.b;
                        View viewA = vu30Var2 != null ? qp11Var.a(vu30Var2, cp11Var, viewGroup) : null;
                        fx50 fx50Var = (fx50) iu30Var.invoke(y1c1Var);
                        yw50 yw50Var = fx50Var.a;
                        if (yw50Var.c != null && yw50Var.d != null && yw50Var.e != null && yw50Var.f != null) {
                            dx50 dx50Var = fx50Var.b;
                            if ((dx50Var != null ? dx50Var.b : null) != null) {
                                eg.m("Do not provide all the actions as they will overlap.");
                                return;
                            }
                        }
                        ax50 ax50Var = ((fx50) iu30Var.invoke(y1c1Var)).a.a;
                        if (ax50Var != null) {
                            if (ax50Var instanceof zw50) {
                                paddingStart = (!((zw50) ax50Var).a || viewA == null) ? 0 : viewA.getPaddingStart();
                            } else {
                                if (!(ax50Var instanceof ax50)) {
                                    eg.o();
                                    return;
                                }
                                paddingStart = ax50Var.a;
                            }
                            i = paddingStart;
                        } else {
                            i = 0;
                        }
                        vu30 vu30Var3 = ((fx50) iu30Var.invoke(y1c1Var)).a.c;
                        View viewA2 = vu30Var3 != null ? qp11Var.a(vu30Var3, cp11Var, viewGroup) : null;
                        vu30 vu30Var4 = ((fx50) iu30Var.invoke(y1c1Var)).a.d;
                        View viewA3 = vu30Var4 != null ? qp11Var.a(vu30Var4, cp11Var, viewGroup) : null;
                        vu30 vu30Var5 = ((fx50) iu30Var.invoke(y1c1Var)).a.e;
                        View viewA4 = vu30Var5 != null ? qp11Var.a(vu30Var5, cp11Var, viewGroup) : null;
                        vu30 vu30Var6 = ((fx50) iu30Var.invoke(y1c1Var)).a.f;
                        View viewA5 = vu30Var6 != null ? qp11Var.a(vu30Var6, cp11Var, viewGroup) : null;
                        dx50 dx50Var2 = ((fx50) iu30Var.invoke(y1c1Var)).b;
                        itn itnVar = new itn(i, viewA, viewA2, viewA3, viewA4, viewA5, (dx50Var2 == null || (vu30Var = dx50Var2.b) == null) ? null : qp11Var.a(vu30Var, cp11Var, viewGroup));
                        vu30 vu30Var7 = ((fx50) iu30Var.invoke(y1c1Var)).c;
                        View viewA6 = vu30Var7 != null ? qp11Var.a(vu30Var7, cp11Var, viewGroup) : null;
                        dx50 dx50Var3 = ((fx50) iu30Var.invoke(y1c1Var)).b;
                        boolean z6 = (dx50Var3 == null || (ey50Var = dx50Var3.a) == null || !ey50Var.a) ? false : true;
                        vu30 vu30Var8 = my50Var.i;
                        View viewA7 = vu30Var8 != null ? qp11Var.a(vu30Var8, cp11Var, viewGroup) : null;
                        vu30 vu30Var9 = my50Var.j;
                        View viewA8 = vu30Var9 != null ? qp11Var.a(vu30Var9, cp11Var, viewGroup) : null;
                        vu30 vu30Var10 = vp11Var.b;
                        View viewA9 = vu30Var10 != null ? qp11Var.a(vu30Var10, cp11Var, viewGroup) : null;
                        vu30 vu30Var11 = vp11Var.c;
                        View viewA10 = vu30Var11 != null ? qp11Var.a(vu30Var11, cp11Var, viewGroup) : null;
                        vu30 vu30Var12 = vp11Var.d;
                        View viewA11 = vu30Var12 != null ? qp11Var.a(vu30Var12, cp11Var, viewGroup) : null;
                        vu30 vu30Var13 = vp11Var.e;
                        View viewA12 = vu30Var13 != null ? qp11Var.a(vu30Var13, cp11Var, viewGroup) : null;
                        if (!qp11Var.o) {
                            d0rVar = d0rVar2;
                            int i7 = cp11Var.f;
                            Long l = cp11Var.d;
                            if (i7 != 2) {
                                i7 = 0;
                            }
                            if (i7 != 0) {
                                ContentRestrictionBadgeView contentRestrictionBadgeView = new ContentRestrictionBadgeView(viewGroup.getContext(), (AttributeSet) null, 2, (DefaultConstructorMarker) null);
                                contentRestrictionBadgeView.setId(2131428370);
                                contentRestrictionBadgeView.c(k4m.b);
                                jkj0Var = new jkj0(contentRestrictionBadgeView, true);
                            } else {
                                jkj0Var = null;
                            }
                            if (str7 != null) {
                                EncoreTextView encoreTextView2 = new EncoreTextView(viewGroup.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                                encoreTextView2.setId(2131428367);
                                encoreTextView2.setText(str7);
                                encoreTextView2.setTextAppearance(2132018006);
                                encoreTextView2.setTextColor(encoreTextView2.getContext().getColor(2131101506));
                                jkj0Var2 = new jkj0(encoreTextView2, false);
                            } else {
                                jkj0Var2 = null;
                            }
                            iu30 iu30Var2 = my50Var.f;
                            if (iu30Var2 != null) {
                                l0x0 l0x0Var = qp11Var.b;
                                kdn0 kdn0Var2 = (ymd0) iu30Var2.invoke(y1c1Var);
                                if (kdn0Var2 == null) {
                                    kdn0Var2 = new kdn0(gy50.b);
                                }
                                jkj0Var3 = new jkj0(qp11.b(new bs0((ofx) l0x0Var.b, (w3l0) l0x0Var.c, (lzn0) l0x0Var.d, kdn0Var2, new hsz0(vp11Var.l)), viewGroup, new wsz0(str5)), false);
                            } else {
                                jkj0Var3 = null;
                            }
                            List<bp11> list4 = list3;
                            ArrayList arrayList = new ArrayList(q7h.U(list4, 10));
                            for (bp11 bp11Var : list4) {
                                EncoreTextView encoreTextView3 = new EncoreTextView(viewGroup.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                                encoreTextView3.setId(View.generateViewId());
                                encoreTextView3.setText(bp11Var.a);
                                encoreTextView3.setTextAppearance(2132018006);
                                encoreTextView3.setTextColor(encoreTextView3.getContext().getColor(2131101506));
                                arrayList.add(new jkj0(encoreTextView3, false));
                            }
                            if (l != 0) {
                                long jLongValue = l.longValue();
                                ReleaseDateView releaseDateView = new ReleaseDateView(viewGroup.getContext(), (AttributeSet) null, 2, (DefaultConstructorMarker) null);
                                releaseDateView.setViewContext(new to11(qp11Var.k));
                                releaseDateView.setTextColor(releaseDateView.getContext().getColor(2131101506));
                                releaseDateView.w(new so11(Long.valueOf(jLongValue)));
                                jkj0Var4 = new jkj0(releaseDateView, false);
                            } else {
                                jkj0Var4 = null;
                            }
                            if (dy50Var == null || !dy50Var.a) {
                                l = null;
                            }
                            if (l != null) {
                                long jLongValue2 = l.longValue();
                                ro11 ro11Var = new ro11(viewGroup.getContext());
                                ro11Var.a(new qo11(jLongValue2));
                                if (!ro11Var.e) {
                                    ro11Var = null;
                                }
                                ComposeView composeView = ro11Var != null ? ro11Var.d : null;
                                if (composeView != null) {
                                    jkj0Var5 = new jkj0(composeView, false);
                                } else {
                                    jkj0Var5 = null;
                                }
                            } else {
                                jkj0Var5 = null;
                            }
                            boolean z7 = (qp11Var.m && i6 == 4) || i6 == 3;
                            Boolean boolValueOf = Boolean.valueOf(z7);
                            if (!z7) {
                                boolValueOf = null;
                            }
                            if (boolValueOf != null) {
                                jkj0Var6 = new jkj0(qp11.b(new u63((zob1) qp11Var.l.invoke(), 1), viewGroup, new sfv(str5, 0, 6)), false);
                            } else {
                                vx50 vx50Var = my50Var.h;
                                jkj0Var6 = vx50Var != null ? new jkj0(qp11.b(new dx0((ymd0) vx50Var.a.invoke(y1c1Var), vx50Var.b), viewGroup, rih1.a), false) : null;
                            }
                            ComposeView composeView2 = new ComposeView(viewGroup.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                            composeView2.setContent(ahi.b);
                            jkj0 jkj0Var8 = new jkj0(composeView2, true);
                            iu30 iu30Var3 = my50Var.o;
                            jkj0 jkj0Var9 = iu30Var3 != null ? new jkj0((View) iu30Var3.invoke(viewGroup), false) : null;
                            if (dy50Var == null || (mr20Var = dy50Var.i) == null) {
                                jkj0Var7 = null;
                            } else {
                                ComposeView composeView3 = new ComposeView(viewGroup.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                                composeView3.setContent(new j2i(1676927521, new cvn(mr20Var, (byte) 2), true));
                                jkj0Var7 = new jkj0(composeView3, false);
                            }
                            viewB2 = qp11.b(qp11Var.e, viewGroup, new rmj0(jkj0Var, jkj0Var2, jkj0Var3, arrayList, jkj0Var4, jkj0Var5, jkj0Var6, jkj0Var7, jkj0Var8, my50Var.k, jkj0Var9));
                        } else {
                            if (d0rVar2 == null) {
                                hhg1.n("Required value was null.");
                                return;
                            }
                            w6e0 w6e0Var = qp11Var.n;
                            boolean z8 = dy50Var != null && dy50Var.g;
                            xmu0 xmu0Var = (xmu0) w6e0Var.d;
                            lmj0 lmj0Var = new lmj0(d0rVar2, f6o1.A(new kls0((lzn0) xmu0Var.b, (o241) xmu0Var.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (opv0) w6e0Var.b, new pfv(d0rVar2), (ofx) w6e0Var.e, (yqg) w6e0Var.c);
                            boolean z9 = my50Var.k;
                            if (dy50Var == null || dy50Var.e) {
                                z = true;
                                z2 = false;
                            } else {
                                z = true;
                                z2 = true;
                            }
                            boolean z10 = !z2;
                            boolean z11 = (dy50Var == null || dy50Var.a != z) ? false : z;
                            boolean z12 = (dy50Var != null && dy50Var.b == z) || i6 == 4 || i6 == 3;
                            if (dy50Var == null || dy50Var.c) {
                                z3 = true;
                                z4 = false;
                            } else {
                                z3 = true;
                                z4 = true;
                            }
                            fju fjuVar = new fju(z9, z10, z11, z12, !z4, (dy50Var == null || dy50Var.d != z3) ? false : z3, vp11Var.l, !((dy50Var == null || dy50Var.f) ? false : z3), z8, dy50Var != null ? dy50Var.h : null, dy50Var != null ? dy50Var.i : null, dy50Var != null ? dy50Var.j : null, dy50Var != null && dy50Var.k);
                            List list5 = list3;
                            ArrayList arrayList2 = new ArrayList(q7h.U(list5, 10));
                            Iterator it = list5.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((bp11) it.next()).a);
                            }
                            viewB2 = qp11.b(lmj0Var, viewGroup, new fmj0(str5, fjuVar, str7, arrayList2));
                            d0rVar = d0rVar2;
                        }
                        View view3 = viewB2;
                        if (list2.isEmpty()) {
                            viewB3 = null;
                        } else if (u890.j(jx50Var != null ? jx50Var.a : null, hx50.a)) {
                            viewB3 = null;
                        } else {
                            qfv qfvVarM0 = fdg1.m0(qp11Var.j, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
                            ix50 ix50Var = jx50Var != null ? jx50Var.a : null;
                            gx50 gx50Var = ix50Var instanceof gx50 ? (gx50) ix50Var : null;
                            if (gx50Var == null || (iC = l1d.C(gx50Var.a)) == 0) {
                                i2 = 2;
                                i3 = 3;
                            } else if (iC != 1) {
                                i2 = 2;
                                if (iC == 2) {
                                    i3 = 1;
                                } else {
                                    if (iC != 3) {
                                        eg.o();
                                        return;
                                    }
                                    i3 = 4;
                                }
                            } else {
                                i2 = 2;
                                i3 = 2;
                            }
                            List<ap11> list6 = list2;
                            ArrayList arrayList3 = new ArrayList(q7h.U(list6, 10));
                            for (ap11 ap11Var : list6) {
                                String str8 = ap11Var.a;
                                String str9 = ap11Var.b;
                                if (str9.length() <= 0) {
                                    str9 = null;
                                }
                                arrayList3.add(new e5o(str8, str9, ap11Var.c));
                            }
                            int i8 = jx50Var != null ? jx50Var.c : 0;
                            if ((i8 == 0 ? -1 : y4o.a[l1d.C(i8)]) != 1) {
                                i2 = 1;
                            }
                            viewB3 = qp11.b(qfvVarM0, viewGroup, new f5o(arrayList3, i3, i2));
                        }
                        yx50 yx50Var = my50Var.g;
                        if (yx50Var instanceof xx50) {
                            xx50 xx50Var = (xx50) yx50Var;
                            het hetVar = new het(cp11Var.a, vp11Var.h.path(), xx50Var.a, new ziz0(qp11Var, (byte) 28), xx50Var.b);
                            tka0 tka0Var4 = dtw.C;
                            view = mhc.b(viewGroup.getContext(), viewGroup, new let(d0rVar), hetVar, (ipb1) null, 112).w;
                        } else {
                            if (!(yx50Var instanceof wx50)) {
                                eg.o();
                                return;
                            }
                            view = null;
                        }
                        boolean z13 = my50Var.q;
                        jy50 jy50Var = my50Var.a;
                        if (jy50Var.equals(dj20.e)) {
                            otnVar = ktn.c;
                        } else if (jy50Var.equals(xj20.e)) {
                            otnVar = ltn.c;
                        } else if (jy50Var.equals(zj20.e)) {
                            otnVar = ntn.c;
                        } else {
                            if (!jy50Var.equals(yj20.e)) {
                                eg.o();
                                return;
                            }
                            otnVar = mtn.c;
                        }
                        kunVar = kunVar;
                        avn avnVar = (htn) new lun(kunVar.b.d, kunVar.P0, (byte) 0).a(new jtn(viewB, itnVar, viewA6, z6, view, view3, viewA7, viewA8, viewA9, viewA10, viewA11, viewA12, viewB3, z13, otnVar));
                        u3Var = this;
                        u3Var.c = avnVar;
                        k8p1.o((FrameLayout) u3Var.b, avnVar.a1);
                        avn avnVar2 = (htn) u3Var.c;
                        if (avnVar2 == null) {
                            u890.C(str4);
                            throw null;
                        }
                        avn avnVar3 = avnVar2;
                        avnVar3.S0 = new usj((iu30) obj2, kunVar);
                        if (lls0Var != 0) {
                            CoordinatorLayout parent = avnVar3.a1.getParent();
                            tka0 tka0Var5 = dtw.C;
                            View view4 = mhc.b(parent.getContext(), parent, (laa) lls0Var.c, cp11Var, (ipb1) null, 112).w;
                            Resources resources3 = parent.getResources();
                            if (lls0Var.b) {
                                view4.setTranslationZ(TypedValue.applyDimension(1, 10.0f, resources3.getDisplayMetrics()));
                                View viewFindViewById = parent.findViewById(2131428362);
                                viewFindViewById.setVisibility(4);
                                view4.setTag("primarySticky");
                                h3n h3nVar = new h3n(-2, -2);
                                h3nVar.setMarginEnd(resources3.getDimensionPixelSize(2131165290));
                                h3nVar.c = 8388613;
                                h3nVar.b(new CreativeWorkHeaderStickyBehavior(viewFindViewById));
                                parent.addView(view4, h3nVar);
                            } else {
                                ((FrameLayout) parent.findViewById(2131428375)).addView(view4);
                            }
                            View viewFindViewWithTag = parent.findViewWithTag("primarySticky");
                            if (viewFindViewWithTag != null) {
                                gal galVar = new gal(viewFindViewWithTag, parent, (byte) 15);
                                WeakHashMap weakHashMap = b8k1.a;
                                r7k1.c(viewFindViewWithTag, galVar);
                            }
                        }
                    } else {
                        iunVar = iunVar2;
                        str4 = "creativeWorkHeader";
                        u3Var = this;
                    }
                    avn avnVar4 = (htn) u3Var.c;
                    if (avnVar4 == null) {
                        u890.C(str4);
                        throw null;
                    }
                    hun hunVar = (hun) iunVar;
                    cp11 cp11Var2 = hunVar.a;
                    List list7 = cp11Var2.c;
                    String str10 = hunVar.j;
                    if (str10 == null && (str10 = hunVar.k) == null && (str10 = hunVar.l) == null) {
                        str10 = cp11Var2.b;
                    }
                    String str11 = str10;
                    quc0 quc0Var = kunVar.i;
                    List list8 = list7;
                    ArrayList arrayList4 = new ArrayList(q7h.U(list8, 10));
                    Iterator it2 = list8.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((ap11) it2.next()).a);
                    }
                    String strA = quc0Var.a(arrayList4);
                    ap11 ap11Var2 = (ap11) o7h.s0(list7);
                    gtn gtnVar = new gtn(strA, ap11Var2 != null ? ap11Var2.b : null);
                    CharSequence charSequence = hunVar.b;
                    fun funVar = hunVar.c;
                    if (funVar instanceof cun) {
                        ftnVar = ctn.a;
                    } else {
                        if (funVar instanceof dun) {
                            etnVar = new dtn(((dun) funVar).a);
                        } else {
                            if (!(funVar instanceof eun)) {
                                eg.o();
                                return;
                            }
                            etnVar = new etn(((eun) funVar).a);
                        }
                        ftnVar = etnVar;
                    }
                    Integer num = hunVar.d;
                    nx50 nx50Var = kunVar.Z;
                    boolean z14 = nx50Var instanceof kx50;
                    boolean z15 = !z14;
                    tsn tsnVar = tsn.a;
                    if (z14) {
                        ssnVar = new ssn(null, tsnVar);
                    } else {
                        String str12 = hunVar.f;
                        mmr0 mmr0Var = str12 != null ? new mmr0(str12, usn.a) : new mmr0(hunVar.e, tsnVar);
                        String str13 = (String) mmr0Var.a;
                        vsn vsnVar = (vsn) mmr0Var.b;
                        if (kunVar.Y != null && !(nx50Var instanceof lx50) && (!hunVar.h || str13 == null || str13.equals(hunVar.g))) {
                            str13 = null;
                        }
                        ssnVar = new ssn(str13, vsnVar);
                    }
                    avnVar4.f(new btn(charSequence, str11, gtnVar, ftnVar, num, z15, ssnVar, hunVar.i, hunVar.m, hunVar.n));
                    return;
                }
                return;
            case 5:
                fhy fhyVar = (fhy) obj;
                rku rkuVar = (rku) this.b;
                w2s w2sVar = (w2s) this.d;
                rkuVar.b(pd80.a((pd80) w2sVar.f, (Context) this.e, (iac0) w2sVar.b, fhyVar.b, (DynamicTagsMetadata) null, 24).observeOn((Scheduler) w2sVar.h).subscribe(new qg7(this, w2sVar, fhyVar, (byte) 6)));
                return;
            case 6:
                ps70 ps70Var = (ps70) obj;
                p410 p410Var = (p410) this.b;
                ((ZoomImageView) p410Var.g).post(new xwn1(p410Var, ps70Var, (byte) 22));
                ((ZoomImageView) p410Var.g).setContentDescription(ps70Var.e);
                EncoreTextView encoreTextView4 = (EncoreTextView) p410Var.f;
                String str14 = ps70Var.f;
                encoreTextView4.setText(str14);
                encoreTextView4.setVisibility((str14 == null || str14.length() == 0) ? 8 : 0);
                String str15 = ps70Var.j;
                FrameLayout frameLayout3 = (FrameLayout) p410Var.h;
                if (str15 != null) {
                    frameLayout3.setVisibility(0);
                    ((dtw) ((idd1) obj2).getValue()).f(new t710(ps70Var.b, 32, str15, (String) null, true, (String) null));
                } else {
                    frameLayout3.setVisibility(8);
                }
                ((View) p410Var.e).setOnClickListener(new zfs(this, (byte) 20));
                return;
            case 7:
                jzo0 jzo0Var = (jzo0) obj;
                this.b = jzo0Var.e;
                ((r4u) this.d).e(jzo0Var);
                return;
            case 8:
                b7v0 b7v0Var = (b7v0) obj;
                rt01 rt01Var2 = (rt01) obj2;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                int i9 = b7v0Var.c;
                boolean z16 = b7v0Var.b;
                int iC2 = l1d.C(b7v0Var.a);
                rih1 rih1Var = rih1.a;
                if (iC2 == 0) {
                    dtwVarB = (dtw) this.d;
                    if (dtwVarB == null) {
                        iu30 iu30Var4 = (iu30) rt01Var2.c;
                        int iC3 = l1d.C(i9);
                        if (iC3 != 0) {
                            if (iC3 != 1) {
                                eg.o();
                                return;
                            }
                            xzf1Var = xzf1.a;
                        }
                        jpg0 jpg0Var = new jpg0((laa) iu30Var4.invoke(xzf1Var), new mj10((byte) 18, z16));
                        tka0 tka0Var6 = dtw.C;
                        dtwVarB = mhc.b(frameLayout4.getContext(), frameLayout4, jpg0Var, rih1Var, (ipb1) null, 112);
                        View view5 = dtwVarB.w;
                        WeakHashMap weakHashMap2 = b8k1.a;
                        view5.setId(View.generateViewId());
                        this.d = dtwVarB;
                    }
                } else {
                    if (iC2 != 1) {
                        eg.o();
                        return;
                    }
                    dtwVarB = (dtw) this.e;
                    if (dtwVarB == null) {
                        jpg0 jpg0Var2 = new jpg0((laa) ((Function0) rt01Var2.d).invoke(), new y28((byte) 1, i9, z16));
                        tka0 tka0Var7 = dtw.C;
                        dtwVarB = mhc.b(frameLayout4.getContext(), frameLayout4, jpg0Var2, rih1Var, (ipb1) null, 112);
                        View view6 = dtwVarB.w;
                        WeakHashMap weakHashMap3 = b8k1.a;
                        view6.setId(View.generateViewId());
                        this.e = dtwVarB;
                    }
                }
                View view7 = dtwVarB.w;
                if (u890.j(view7.getParent(), frameLayout4)) {
                    return;
                }
                m87.q(frameLayout4);
                frameLayout4.removeAllViews();
                frameLayout4.addView(view7);
                return;
            case 9:
                xsv0 xsv0Var = (xsv0) obj;
                aq50 aq50Var = xsv0Var.a;
                l811 l811Var = (l811) this.d;
                if (!l811Var.a) {
                    qzh qzhVar = (qzh) this.c;
                    String str16 = aq50Var.b;
                    String str17 = aq50Var.c;
                    z511 adapter = ((RecyclerView) this.e).getAdapter();
                    if (adapter == null) {
                        adapter = null;
                    }
                    qzhVar.f(new vsv0(str16, str17, adapter));
                    l811Var.a = true;
                }
                kdn0 kdn0Var3 = (kdn0) obj2;
                List list9 = aq50Var.e;
                ArrayList arrayList5 = new ArrayList(q7h.U(list9, 10));
                for (Object obj4 : list9) {
                    int i10 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList5.add(new ysv0((ktv0) obj4, xsv0Var.b + i4 + 1));
                    i4 = i10;
                }
                kdn0Var3.m(arrayList5);
                return;
            default:
                id81 id81Var = (id81) obj;
                dtw dtwVar = (dtw) ((idd1) this.d).getValue();
                ud81 ud81Var = id81Var.a;
                String str18 = id81Var.b;
                joa0 joa0Var = new joa0(str18);
                tka0 tka0Var8 = dtw.C;
                dtwVar.k(ud81Var, joa0Var, (vu30) null);
                ((dtw) obj2).k(id81Var, new joa0(str18), (vu30) null);
                return;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                return (FrameLayout) this.b;
            case 1:
                return (View) this.b;
            case 2:
                return (View) this.d;
            case 3:
                return (View) this.c;
            case 4:
                return (FrameLayout) this.b;
            case 5:
                return (ViewGroup) this.c;
            case 6:
                return (View) this.e;
            case 7:
                return (CarouselView) this.e;
            case 8:
                return (FrameLayout) this.c;
            case 9:
                return (View) this.b;
            default:
                return (LinearLayout) this.e;
        }
    }

    public u3(Context context, ViewGroup viewGroup, bs0 bs0Var) {
        this.a = (byte) 3;
        this.e = context;
        this.f = bs0Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131624317, viewGroup, false);
        this.c = viewInflate;
        this.d = viewInflate.findViewById(2131430777);
        this.b = (FrameLayout) viewInflate.findViewById(2131429615);
    }

    public u3(Context context, ViewGroup viewGroup, dx0 dx0Var) {
        this.a = (byte) 1;
        this.f = dx0Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131626285, viewGroup, false);
        this.b = viewInflate;
        this.c = (TextView) viewInflate.findViewById(2131430631);
        this.d = (TextView) viewInflate.findViewById(2131431470);
        this.e = context.getResources();
    }

    public u3(w2s w2sVar, Context context, View view) {
        this.a = (byte) 5;
        this.d = w2sVar;
        this.e = context;
        this.f = view;
        this.b = new rku();
        ViewGroup viewGroup = (ViewGroup) w2sVar.t;
        if (viewGroup != null) {
            ((ViewGroup) viewGroup.getParent()).removeAllViews();
            ((ViewGroup) view).addView((ViewGroup) w2sVar.t, new ViewGroup.LayoutParams(-1, -2));
        }
        this.c = (ViewGroup) view;
    }

    public u3(FrameLayout frameLayout, p811 p811Var, Context context, v3 v3Var) {
        this.a = (byte) 0;
        this.c = frameLayout;
        this.d = p811Var;
        this.e = context;
        this.f = v3Var;
        this.b = frameLayout;
    }

    public u3(Context context, rt01 rt01Var) {
        this.a = (byte) 8;
        this.f = rt01Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        this.c = frameLayout;
    }

    public u3(Context context, ViewGroup viewGroup, bs0 bs0Var, ne neVar, iu30 iu30Var) {
        this.a = (byte) 2;
        this.e = bs0Var;
        this.f = iu30Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131624315, viewGroup, false);
        this.b = (TextView) viewInflate.findViewById(2131431356);
        this.c = (Button) viewInflate.findViewById(2131430896);
        RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131427921);
        recyclerViewFindViewById.j((fyd) bs0Var.f);
        neVar.f(recyclerViewFindViewById, new LinearLayoutManager(0), false);
        this.d = viewInflate;
    }

    public u3(qzh qzhVar, l811 l811Var, RecyclerView recyclerView, kdn0 kdn0Var) {
        this.a = (byte) 9;
        this.c = qzhVar;
        this.d = l811Var;
        this.e = recyclerView;
        this.f = kdn0Var;
        this.b = qzhVar.getView();
    }

    public u3(Context context, ViewGroup viewGroup, zhc0 zhc0Var, int i) {
        this.a = (byte) 10;
        this.b = new idd1(new gf6(this, i, (byte) 12));
        this.c = new idd1(new fe81(zhc0Var, (byte) 0));
        this.d = new idd1(new fh61(context, this, (byte) 23));
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(2131626132, viewGroup, false);
        this.e = linearLayout;
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, linearLayout, (qtw) zhc0Var.c, (drw) null, 24);
        ((FrameLayout) linearLayout.findViewById(2131430967)).addView(dtwVarD.w);
        this.f = dtwVarD;
    }

    public u3(p410 p410Var, u710 u710Var, iu30 iu30Var) {
        this.a = (byte) 6;
        this.b = p410Var;
        this.c = u710Var;
        this.d = iu30Var;
        this.e = (View) p410Var.e;
        this.f = new idd1(new nd70(this, (byte) 7));
    }

    public u3(Context context, kun kunVar, ViewGroup viewGroup, iu30 iu30Var) {
        this.a = (byte) 4;
        this.d = kunVar;
        this.e = viewGroup;
        this.f = iu30Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(2131427590);
        this.b = frameLayout;
    }
}
