package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gnf0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gnf0(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x05a5  */
    public final Object invoke(Object obj) throws Exception {
        y07 l07Var;
        int i = 0;
        Throwable th = null;
        int i2 = 1;
        switch (this.a) {
            case 0:
                lnf0 lnf0Var = (lnf0) this.b;
                Object obj2 = lnf0Var.n;
                ang1 ang1Var = (ang1) this.c;
                xv71 xv71Var = (xv71) this.d;
                synchronized (obj2) {
                    HashMap map = lnf0Var.o;
                    if (map.get(ang1Var) == xv71Var) {
                        map.remove(ang1Var);
                    }
                    break;
                }
                return rih1.a;
            case 1:
                c380 c380Var = (c380) this.b;
                ((epb0) obj).R(c380Var.size(), new ehf0(c380Var, (byte) 3), (vu30) null, new ehf0(c380Var, (byte) 4), new j2i(-1117249557, new mqf0(c380Var, (iu30) this.c, (tyq) this.d), true));
                return rih1.a;
            case 2:
                long j = ((Offset) obj).a;
                if (!((Boolean) ((ven0) this.d).getValue()).booleanValue()) {
                    ((iu30) this.b).invoke(new ktf0(((bmf0) this.c).a));
                }
                return rih1.a;
            case 3:
                return new col0(new qgl0(new qgl0(Integer.valueOf(((vpu0) this.c).a), (String) this.d, ((k3g0) this.b).g), (short) 0));
            case 4:
                rtb0 rtb0Var = (rtb0) obj;
                iu30 iu30Var = (iu30) this.d;
                o3e0 o3e0Var = (o3e0) this.c;
                rtb0.c(rtb0Var, "description", ezi.b, 2);
                ofg0 ofg0Var = (ofg0) this.b;
                Boolean bool = ofg0Var.c;
                if (bool != null) {
                    rtb0.c(rtb0Var, "musicVideoToggle", new j2i(1907989466, new reg0(bool.booleanValue(), ofg0Var, o3e0Var, iu30Var, (byte) 0), true), 2);
                }
                Boolean bool2 = ofg0Var.d;
                if (bool2 != null) {
                    rtb0.c(rtb0Var, "canvasToggle", new j2i(-2084503087, new reg0(bool2.booleanValue(), ofg0Var, o3e0Var, iu30Var, (byte) 1), true), 2);
                }
                Boolean bool3 = ofg0Var.e;
                if (bool3 != null) {
                    rtb0.c(rtb0Var, "otherVideoToggle", new j2i(1834630738, new reg0(bool3.booleanValue(), ofg0Var, o3e0Var, iu30Var, (byte) 2), true), 2);
                    rtb0.c(rtb0Var, "otherVideosFooter", ezi.c, 2);
                }
                return rih1.a;
            case 5:
                rtb0 rtb0Var2 = (rtb0) obj;
                rtb0.c(rtb0Var2, "section-header", hzi.a, 2);
                rtb0.c(rtb0Var2, "section-description", new j2i(-1165212519, new ipy((iu30) this.c, (byte) 15), true), 2);
                ygg0 ygg0Var = (ygg0) this.b;
                List list = ygg0Var.a;
                bhg0 bhg0Var = bhg0.b;
                rtb0Var2.e(list.size(), new ehf0(list), new ehf0(list, (byte) 8), new j2i(802480018, new rf1((byte) 18, (keg0) this.d, ygg0Var, list), true));
                return rih1.a;
            case 6:
                Context context = (Context) obj;
                FrameLayout frameLayout = new FrameLayout(context);
                fqg0 fqg0Var = (fqg0) this.c;
                u601 u601Var = (u601) this.d;
                FrameLayout.LayoutParams layoutParams = fqg0Var.c;
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-2, -2);
                }
                frameLayout.setLayoutParams(layoutParams);
                xhk1.f(frameLayout, u601Var);
                frameLayout.setTag(2131428154, (iu30) this.b);
                isw iswVarA = fqg0Var.a.c().a(context, frameLayout, new lsw(new xcn0()), new dqg0(frameLayout, (byte) 0));
                frameLayout.addView(iswVarA.getView());
                frameLayout.setTag(2131428153, iswVarA);
                return frameLayout;
            case 7:
                dwg0 dwg0Var = (dwg0) obj;
                iu30 iu30Var2 = (iu30) this.b;
                if (dwg0Var.equals(zvg0.a) || dwg0Var.equals(bwg0.a)) {
                    iu30Var2.invoke(dwg0Var);
                    fn31.T((c9n) this.c, (o8n) null, 0, new b((o95) this.d, (lnm) null, (byte) 14), 3);
                } else {
                    iu30Var2.invoke(dwg0Var);
                }
                return rih1.a;
            case 8:
                p811 p811Var = (p811) this.b;
                List<mmr0> list2 = (List) obj;
                jh5 jh5Var = (jh5) this.d;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (mmr0 mmr0Var : list2) {
                        jh5 jh5Var2 = (jh5) mmr0Var.a;
                        k3r k3rVar = (k3r) mmr0Var.b;
                        if (u890.j(jh5Var2, jh5Var) && !(k3rVar instanceof i3r)) {
                            cmh1 cmh1Var = (cmh1) p811Var.a;
                            if (cmh1Var != null) {
                                cmh1Var.dispose();
                            }
                            y7h0 y7h0Var = (y7h0) this.c;
                            if (y7h0Var.g == p811Var.a) {
                                y7h0Var.g = null;
                            }
                        }
                    }
                }
                return rih1.a;
            case 9:
                kex kexVar = (kex) obj;
                ArrayList<bbh0> arrayList = (ArrayList) this.b;
                mah0 mah0Var = (mah0) this.c;
                iu30 iu30Var3 = (iu30) this.d;
                kexVar.a("all", new j2i(676409774, new dah0(arrayList, mah0Var, iu30Var3), true));
                for (bbh0 bbh0Var : arrayList) {
                    kexVar.a(bbh0Var, new j2i(-761135973, new rvg0(bbh0Var, mah0Var, iu30Var3, (byte) 7), true));
                }
                return rih1.a;
            case 10:
                String[] strArr = (String[]) obj;
                i8h1 i8h1Var = (i8h1) this.b;
                m4l0 m4l0Var = (m4l0) ((pt) this.c).i;
                if (m4l0Var == null) {
                    u890.C("eventFactory");
                    throw null;
                }
                x6h1 x6h1VarC = m4l0Var.b.c();
                x6h1VarC.i.add(new a7h1("media_permission_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = m4l0Var.a;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                ((ihg0) this.d).a(strArr);
                return rih1.a;
            case 11:
                LayoutInflater layoutInflaterFrom = LayoutInflater.from((Context) obj);
                blb0 blb0Var = (blb0) this.b;
                ViewGroup viewGroup = (ViewGroup) layoutInflaterFrom.inflate(blb0Var.a, (ViewGroup) null);
                axh0 axh0Var = (axh0) this.c;
                cxh0 cxh0Var = (cxh0) this.d;
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                for (Object obj3 : axh0Var.a) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        Throwable th2 = th;
                        p7h.T();
                        throw th2;
                    }
                    zwh0 zwh0Var = (zwh0) obj3;
                    FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(cxh0Var.b[i3].intValue());
                    if (frameLayout2 != null) {
                        arrayList2.add(frameLayout2);
                        fph0 fph0Var = (fph0) cxh0Var.a.get();
                        fph0Var.getClass();
                        yge0 yge0Var = fph0Var.a;
                        frameLayout2.removeAllViews();
                        frameLayout2.addView((View) yge0Var.b, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
                        gph0 layoutParams2 = frameLayout2.getLayoutParams();
                        String str = "1:1";
                        int iC = l1d.C(zwh0Var.c);
                        if (iC != 0 && iC != 1 && iC == 2) {
                            str = "9:16";
                        }
                        layoutParams2.a = str;
                        xz6 xz6Var = eph0.a[l1d.C(zwh0Var.c)] == 1 ? xz6.d : yz6.d;
                        dq70 dq70Var = zwh0Var.a;
                        g07 g07Var = new g07(dq70Var.a, xz6Var);
                        String str2 = dq70Var.b;
                        int iHashCode = str2.hashCode();
                        if (iHashCode != -1409097913) {
                            if (iHashCode != 92896879) {
                                if (iHashCode == 1879474642 && str2.equals("playlist")) {
                                    l07Var = new y07(g07Var, false);
                                } else {
                                    l07Var = new x07(g07Var, true);
                                }
                            } else if (str2.equals("album")) {
                                l07Var = new k07(g07Var, false);
                            } else {
                                l07Var = new x07(g07Var, true);
                            }
                        } else if (str2.equals("artist")) {
                            l07Var = new l07(g07Var, false);
                        } else {
                            l07Var = new x07(g07Var, true);
                        }
                        ((ArtworkView) yge0Var.c).h(l07Var);
                    }
                    i3 = i4;
                    th = th;
                }
                Throwable th3 = th;
                View view = (View) o7h.q0(arrayList2);
                if (!view.isLaidOut() || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new qo9(cxh0Var, axh0Var, blb0Var, arrayList2, (byte) 7));
                } else {
                    for (Object obj4 : mka.m(view.getWidth(), view.getHeight(), axh0Var.a, blb0Var)) {
                        int i5 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw th3;
                        }
                        zoh0 zoh0Var = (zoh0) obj4;
                        View view2 = (View) arrayList2.get(i);
                        float f = zoh0Var.a;
                        float f2 = zoh0Var.b;
                        view2.setRotation(f);
                        view2.setScaleX(f2);
                        view2.setScaleY(f2);
                        i = i5;
                    }
                }
                return viewGroup;
            case 12:
                ArrayList<View> arrayListD = ((cxh0) this.b).d((ViewGroup) obj);
                boolean zBooleanValue = ((Boolean) ((ven0) this.d).getValue()).booleanValue();
                bxh0 bxh0Var = (bxh0) this.c;
                if (!zBooleanValue) {
                    AnimatorSet animatorSet = bxh0Var.c;
                    if (animatorSet != null) {
                        animatorSet.end();
                    }
                    bxh0Var.c = null;
                    bxh0Var.d = false;
                    for (View view3 : arrayListD) {
                        view3.setAlpha(0.0f);
                        view3.setTranslationY(bxh0Var.a);
                    }
                } else if (!bxh0Var.d) {
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayListD, 10));
                    int i6 = 0;
                    for (Object obj5 : arrayListD) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            p7h.T();
                            throw null;
                        }
                        View view4 = (View) obj5;
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view4, "alpha", 1.0f), ObjectAnimator.ofFloat(view4, "translationY", 0.0f));
                        animatorSet2.setDuration(400L);
                        animatorSet2.setInterpolator(bxh0Var.b);
                        animatorSet2.setStartDelay(((long) i6) * 200);
                        arrayList3.add(animatorSet2);
                        i6 = i7;
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    bxh0Var.c = animatorSet3;
                    animatorSet3.playTogether(arrayList3);
                    animatorSet3.start();
                    bxh0Var.d = true;
                }
                return rih1.a;
            case 13:
                foo1.v((qtr) obj, (lo60) this.b, (vgm) this.c, (dnc) this.d);
                return rih1.a;
            case 14:
                int iIntValue = ((Number) obj).intValue();
                kgi0 kgi0Var = (kgi0) this.d;
                ((iu30) this.b).invoke(new dgi0(iIntValue));
                ArrayList arrayList4 = ((igi0) this.c).b;
                if (!arrayList4.isEmpty()) {
                    int iQ = yoi1.q(iIntValue, p7h.K(arrayList4));
                    kgi0Var.d(((mey0) arrayList4.get(iQ)).a);
                    kgi0Var.a = iQ;
                }
                return rih1.a;
            case 15:
                int iIntValue2 = ((Number) obj).intValue();
                kgi0 kgi0Var2 = (kgi0) this.d;
                ((iu30) this.b).invoke(new jii0(iIntValue2));
                ArrayList arrayList5 = ((pii0) this.c).b;
                if (!arrayList5.isEmpty()) {
                    int iQ2 = yoi1.q(iIntValue2, p7h.K(arrayList5));
                    kgi0Var2.d(((mey0) arrayList5.get(iQ2)).a);
                    kgi0Var2.a = iQ2;
                }
                return rih1.a;
            case 16:
                u501 u501Var = (u501) obj;
                if (!(u501Var instanceof u501)) {
                    eg.o();
                    return null;
                }
                if (u501Var.c) {
                    ((z6h0) this.b).invoke(u501Var.b);
                } else {
                    pcf.a(((bzi0) this.c).a, pcf.j(u501Var.a), (tv80) this.d, (Bundle) null);
                }
                return rih1.a;
            case 17:
                d441 d441VarG1 = ((y341) obj).g1((String) this.b);
                try {
                    Iterator it = ((Set) this.c).iterator();
                    while (it.hasNext()) {
                        d441VarG1.K(i2, (String) it.next());
                        i2++;
                    }
                    int iW = y7y0.w(d441VarG1, "trigger");
                    int iW2 = y7y0.w(d441VarG1, "messageId");
                    int iW3 = y7y0.w(d441VarG1, "message");
                    ArrayList arrayList6 = new ArrayList();
                    while (d441VarG1.f1()) {
                        arrayList6.add(new tug1(d441VarG1.P0(iW), d441VarG1.getLong(iW2), ((wxi0) ((t6j0) this.d).c.getValue()).a(d441VarG1.isNull(iW3) ? null : d441VarG1.getBlob(iW3))));
                        break;
                    }
                    return arrayList6;
                } finally {
                    d441VarG1.close();
                }
            case 18:
                rtb0 rtb0Var3 = (rtb0) obj;
                rtb0.c(rtb0Var3, (Object) null, a1j.b, 3);
                scj0 scj0Var = (scj0) this.b;
                c380 c380Var2 = scj0Var.c;
                rtb0Var3.e(c380Var2.size(), new ehf0(c380Var2, (byte) 16), new ehf0(c380Var2, (byte) 17), new j2i(2039820996, new oi1(c380Var2, (gw70) this.c, scj0Var, (iu30) this.d, (byte) 9), true));
                return rih1.a;
            case 19:
                c380 c380Var3 = (c380) this.b;
                ((rtb0) obj).e(c380Var3.size(), new ehf0(c380Var3, (byte) 18), new ehf0(c380Var3, (byte) 19), new j2i(802480018, new rf1(c380Var3, (r4k0) this.c, (iu30) this.d, (byte) 19), true));
                return rih1.a;
            case 20:
                any anyVarD = ((koc0) this.b).d();
                l6k0 l6k0Var = (l6k0) this.c;
                return h5p1.s((mr20) obj, anyVarD, l6k0Var.b.a, new sv8((z6k0) this.d, l6k0Var, (lnm) null, (byte) 5));
            case 21:
                ((Boolean) obj).getClass();
                qdk0 qdk0Var = qdk0.a;
                iu30 iu30Var4 = (iu30) this.c;
                ven0 ven0Var = (ven0) this.d;
                if (u890.j((iek0) ven0Var.getValue(), dek0.a)) {
                    bek0 bek0Var = ((vdk0) this.b).b;
                    if (bek0Var.equals(wdk0.a)) {
                        iu30Var4.invoke(qdk0Var);
                        ven0Var.setValue(eek0.a);
                    } else if (bek0Var.equals(xdk0.a)) {
                        iu30Var4.invoke(qdk0Var);
                        ven0Var.setValue(hek0.a);
                    } else if (bek0Var.equals(zdk0.a)) {
                        iu30Var4.invoke(qdk0Var);
                        ven0Var.setValue(gek0.a);
                    } else if (!bek0Var.equals(ydk0.a)) {
                        eg.o();
                        return null;
                    }
                }
                return rih1.a;
            case 22:
                return ((r2t) obj).c().a((d0r) this.b, (String) this.c, (String) this.d);
            case 23:
                int iIntValue3 = ((Number) obj).intValue();
                if (!hmk0.d((ven0) this.d) && !((smk0) this.b).c) {
                    ((iu30) this.c).invoke(new mmk0(iIntValue3));
                }
                return rih1.a;
            case 24:
                jyi0 jyi0Var = (lyi0) obj;
                w1j0 w1j0Var = (w1j0) this.c;
                iu30 iu30Var5 = (iu30) this.b;
                if (jyi0Var.equals(eyi0.a)) {
                    iu30Var5.invoke(new o0j0(w1j0Var.getId()));
                } else if (jyi0Var.equals(fyi0.a)) {
                    ((Function0) this.d).invoke();
                } else if (jyi0Var instanceof gyi0) {
                    iu30Var5.invoke(new p0j0(w1j0Var.getId(), ((gyi0) jyi0Var).a));
                } else if (jyi0Var instanceof iyi0) {
                    iu30Var5.invoke(new s0j0(w1j0Var.getId()));
                } else if (jyi0Var instanceof jyi0) {
                    iu30Var5.invoke(new t0j0(w1j0Var.getId(), jyi0Var.a));
                } else if (jyi0Var instanceof kyi0) {
                    iu30Var5.invoke(new v0j0(((kyi0) jyi0Var).a));
                } else if (jyi0Var instanceof dyi0) {
                    iu30Var5.invoke(new m0j0(w1j0Var.getId(), ((dyi0) jyi0Var).a));
                } else {
                    if (!(jyi0Var instanceof hyi0)) {
                        eg.o();
                        return null;
                    }
                    iu30Var5.invoke(new q0j0(w1j0Var.getId(), ((hyi0) jyi0Var).a));
                }
                return rih1.a;
            case 25:
                ((f3b) this.d).a.a("spotify:internal:your-library:messaging", (tv80) obj, mno1.h(new mmr0[]{new mmr0("extra_bottom_sheet_message", new bsm1(Collections.singletonList((String) this.b), (String) this.c))}));
                return rih1.a;
            case 26:
                wfx wfxVar = ((xfx) this.b).c;
                kbs kbsVar = new kbs(wfxVar.b, wfxVar.a);
                kbsVar.n(new hii0((Function0) this.d, (byte) 2));
                kbsVar.f((bqm0) this.c);
                ConstraintLayout constraintLayout = kbsVar.e.a;
                constraintLayout.setTag(kbsVar);
                return constraintLayout;
            case 27:
                float fFloatValue = ((Number) obj).floatValue();
                int i8 = (int) (4.0f * fFloatValue);
                err0 err0Var = (hdn0) this.b;
                if (i8 != err0Var.s()) {
                    err0Var.t(i8);
                    ((ss50) this.c).a(9);
                }
                ((iu30) this.d).invoke(Float.valueOf(fFloatValue));
                return rih1.a;
            case 28:
                List list3 = (List) this.b;
                ((rtb0) obj).e(list3.size(), (iu30) null, new ehf0(list3, (byte) 25), new j2i(802480018, new d4n0(list3, (Set) this.c, (iu30) this.d), true));
                return rih1.a;
            default:
                return new sg((ttm0) this.b, (zau0) this.c, (ven0) this.d, (byte) 12);
        }
    }
}
