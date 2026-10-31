package p;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tjf0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjf0(kly0 kly0Var, sqs0 sqs0Var, eof0 eof0Var, kly0 kly0Var2, kly0 kly0Var3) {
        super(1);
        this.a = (byte) 0;
        this.b = kly0Var;
        this.e = sqs0Var;
        this.f = eof0Var;
        this.c = kly0Var2;
        this.d = kly0Var3;
    }

    private final Object a(Object obj) {
        dhl dhlVar = (dhl) obj;
        xid xidVar = dhlVar.f;
        dhlVar.g(new e5u((p3v) null, "spread"));
        ube ubeVar = dhlVar.e;
        ihl ihlVar = dhlVar.c;
        yf.p(ubeVar, ihlVar.e, 4.0f, 4);
        yf.p(dhlVar.g, ihlVar.g, 4.0f, 4);
        Integer num = (Integer) this.b;
        xid xidVar2 = dhlVar.d;
        if (num != null) {
            xid.r(xidVar2, ((ihl) this.c).f, 0.0f, 6);
        } else {
            xid.r(xidVar2, ihlVar.d, 12.0f, 4);
        }
        if (((Function0) this.d) == null && ((txd1) this.e) == null) {
            xid.r(xidVar, ihlVar.f, 12.0f, 4);
        } else {
            xid.r(xidVar, ((ihl) this.f).d, 0.0f, 6);
        }
        return rih1.a;
    }

    private final Object d(Object obj) {
        Integer num = (Integer) obj;
        ((ven0) this.f).setValue(Boolean.TRUE);
        if (((j7s) this.b).b) {
            sam1.b((qam1) this.c);
        }
        if (num != null) {
            ((iu30) this.d).invoke(num);
        } else {
            ((Function0) this.e).invoke();
        }
        return rih1.a;
    }

    private final Object e(Object obj) {
        y9e1 y9e1Var = (y9e1) obj;
        af5 af5Var = (af5) this.d;
        af5 af5Var2 = (af5) this.c;
        ven0 ven0Var = (ven0) this.e;
        if (!((Boolean) ven0Var.getValue()).booleanValue() && y9e1Var.d()) {
            ven0Var.setValue(Boolean.TRUE);
            int i = ((cjc0) this.b).a - 1;
            zrm0 zrm0Var = y9e1Var.b;
            if (i < zrm0Var.f) {
                int iC = zrm0Var.c(i, true);
                String str = af5Var2.f(0, iC).b;
                int length = iC - af5Var.b.length();
                if (length < 0) {
                    length = 0;
                }
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (!(i3 < str.length())) {
                        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Integer.valueOf(((aa80) it.next()).a));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            if (((Number) obj2).intValue() < length) {
                                arrayList3.add(obj2);
                            }
                        }
                        Integer num = (Integer) o7h.D0(arrayList3);
                        if (num != null) {
                            length = num.intValue();
                        }
                        af5 af5VarF = af5Var2.f(0, length);
                        ven0 ven0Var2 = (ven0) this.f;
                        ye5 ye5Var = new ye5();
                        ye5Var.h(af5VarF);
                        ye5Var.h(af5Var);
                        ven0Var2.setValue(ye5Var.p());
                        break;
                    }
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    int i5 = i3 + 1;
                    char cCharAt = str.charAt(i3);
                    aa80 aa80Var = new aa80(i2, Character.valueOf(cCharAt));
                    if (cCharAt == 8226) {
                        arrayList.add(aa80Var);
                    }
                    i2 = i4;
                    i3 = i5;
                }
            }
        }
        return rih1.a;
    }

    private final Object f(Object obj) {
        Object o8z0Var;
        ue ueVar;
        fzf1 fzf1Var = (fzf1) obj;
        dzf1 dzf1Var = (dzf1) this.b;
        hjf1 hjf1Var = (hjf1) this.c;
        int i = hjf1Var.f;
        ContextTrack contextTrack = hjf1Var.h;
        fn90 fn90Var = (fn90) this.d;
        iu30 iu30Var = (iu30) this.e;
        nsm0 nsm0Var = (nsm0) this.f;
        int iOrdinal = fzf1Var.ordinal();
        if (iOrdinal == 0) {
            if (hjf1Var.r) {
                o8z0Var = hjf1Var.s ? new o8z0(contextTrack, false) : new o8z0(contextTrack, true);
            } else {
                o8z0Var = hjf1Var.o ? new m8z0(i, contextTrack) : new j8z0(i, contextTrack, ypf1.a);
            }
            iu30Var.invoke(o8z0Var);
        } else if (iOrdinal == 1) {
            fn90Var.s(dzf1Var);
        } else if (iOrdinal == 7) {
            iu30Var.invoke(new j8z0(i, contextTrack, xpf1.a));
        } else if (iOrdinal == 8) {
            iu30Var.invoke(new o8z0(contextTrack, true));
        } else if (iOrdinal != 9) {
            int iOrdinal2 = fzf1Var.ordinal();
            if (iOrdinal2 == 2) {
                ueVar = se.a;
            } else if (iOrdinal2 == 3) {
                ueVar = re.a;
            } else if (iOrdinal2 == 4) {
                ueVar = qe.a;
            } else if (iOrdinal2 != 5) {
                ueVar = iOrdinal2 != 6 ? null : ue.a;
            } else {
                ueVar = te.a;
            }
            if (ueVar != null) {
                nsm0Var.invoke(ueVar, Integer.valueOf(dzf1Var.n()));
            }
        } else {
            iu30Var.invoke(new o8z0(contextTrack, false));
        }
        return rih1.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v64, types: [p.mr20[]] */
    /* JADX WARN: Type inference failed for: r30v0, types: [p.pfm0] */
    public final Object invoke(Object obj) {
        Object kfm0Var;
        xwp0 xwp0Var;
        w771 w771Var;
        ue ueVar;
        byte b = this.a;
        int i = 2;
        int i2 = 1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.b;
        Object obj5 = this.c;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                wjf0 wjf0Var = (wjf0) obj;
                int iOrdinal = wjf0Var.b.ordinal();
                if (iOrdinal == 0) {
                    kfm0Var = ifm0.a;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    kfm0Var = new kfm0(new p061(w7x.a, false), wjf0Var.c);
                }
                ?? r30 = kfm0Var;
                cr4 cr4Var = (cr4) ((kly0) obj4).get();
                return new ojf0(dof1.e, "absent", wpf0.a, new bff0(a860.e("FF353535"), a860.e("FF565656"), a860.e("FFFFFFFF"), a860.e("FFCDCDCD"), a860.e("FF1ED760"), true), ((eof0) obj3).a.a(), false, ((sm4) ((kly0) obj5).get()).a(), new yng1(wjf0Var.a), cr4Var.b() ? (String) ((sqs0) obj6).b.getValue() : null, wx81.a, z6x.a, cr4Var.b(), ((er4) ((kly0) obj2).get()).b(), false, r30, r30, false, cr4Var.c(), null, null);
            case 1:
                dhl dhlVar = (dhl) obj;
                hrt.m((p3v) null, "parent", dhlVar, (p3v) null, "spread");
                yf.p(dhlVar.e, uhl.g((xhl) obj4, new nnb0[]{(ihl) obj5, (ihl) obj2, (ihl) obj6, (ihl) obj3}), 0.0f, 6);
                yf.p(dhlVar.g, dhlVar.c.g, 0.0f, 6);
                return rih1Var;
            case 2:
                kai0 kai0Var = (kai0) obj5;
                return z8p1.n((mey0) obj, (clm) obj2, (epb1) obj6, (nwt) obj3, (kko) ((ng20) obj4).b, false, false, false, false, false, false, false, false, false, (ytp0) null, (uvy) null, true, kai0Var.a, kai0Var.b, 1572448);
            case 3:
                mey0 mey0Var = (mey0) obj;
                Object value = ((epb1) obj4).Y.getValue();
                value.getClass();
                ioj0 ioj0Var = (ioj0) value;
                kai0 kai0Var2 = (kai0) obj5;
                return ioo1.F(mey0Var, new t810(ioj0Var, (zkm) null, (hwt) null, (ijo) null, false, false, false, false, false, false, false, false, (y2u0) null, (sq51) null, true, kai0Var2.a, kai0Var2.b, 261950), ng20.k(ioj0Var, mey0Var), (fza) obj2, (km3) obj6, (ytp0) obj3);
            case 4:
                mey0 mey0Var2 = (mey0) obj;
                Object value2 = ((epb1) obj4).Y.getValue();
                value2.getClass();
                ioj0 ioj0Var2 = (ioj0) value2;
                gei0 gei0Var = (gei0) obj5;
                return aqo1.t(mey0Var2, new t810(ioj0Var2, (zkm) null, (hwt) null, (ijo) null, false, false, false, false, false, false, false, false, (y2u0) null, (sq51) null, true, gei0Var.b, gei0Var.c, 261950), umf0.e(ioj0Var2, mey0Var2), (fza) obj6, (ytp0) obj3, new eei0((vu30) ((umf0) obj2).e, mey0Var2, (byte) 1));
            case 5:
                qtr qtrVar = (qtr) obj;
                p731 p731Var = ((thi0) obj4).b;
                qtrVar.c(new zbi0((kko) obj6, null, (byte) 1));
                qtrVar.b(new nhi0((lzn0) obj5, (dnc) obj3, (vgm) obj2, p731Var, (lnm) null, (byte) 0));
                return rih1Var;
            case 6:
                List list = (List) obj4;
                ((rtb0) obj).e(list.size(), new iio0(list, (byte) 2), new iio0(list, (byte) 3), new j2i(2039820996, new a87(list, (vu30) obj5, (vu30) obj2, (Set) obj6, (String) obj3, (byte) 6), true));
                return rih1Var;
            case 7:
                wvp0 wvp0Var = (wvp0) obj;
                p410 p410Var = (p410) obj3;
                waz0 waz0Var = (waz0) p410Var.h;
                Flowable flowable = (Flowable) obj4;
                mr20 mr20Var = ((zr00) obj5).a;
                o6x o6xVar = o6x.a;
                Flowable flowableH = yoi1.h(mr20Var, o6xVar);
                Observable observableA = ((yh2) obj2).a();
                BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
                Flowable flowable2 = observableA.toFlowable(backpressureStrategy);
                ne neVar = (ne) obj6;
                String str = wvp0Var.a;
                Flowable flowableH2 = yoi1.h(neVar.H(str), o6xVar);
                Flowable flowableA = Flowable.a(flowable, flowableH, flowable2, sgy.b(str) ? new FlowableOnBackpressureLatest(flowableH2.L((Scheduler) neVar.e)) : flowableH2, g7h.d((g7h) neVar.c, "", new String[]{str}).toFlowable(backpressureStrategy).J(new vdn1(str, (byte) 14)), waz0Var.d().U(waz0Var.a()), new bnj0((Object) p410Var, (Object) wvp0Var, (byte) 25));
                flowableA.getClass();
                return flowableA.t(Functions.a);
            case 8:
                fws0 fws0Var = (fws0) obj4;
                List list2 = fws0Var.a;
                ((epb0) obj).R(list2.size(), new svb0(new qm0((List) obj5, (byte) 6), list2, (byte) 3), new ek1(new n1r0(fws0Var, (byte) 22), list2, (byte) 12), new iio0(list2, (byte) 8), new j2i(-1942245546, new oi1(list2, (jua0) obj2, (iu30) obj6, (qim0) obj3, (byte) 11), true));
                return rih1Var;
            case 9:
                DrawScope drawScope = (DrawScope) obj;
                tw4 tw4Var = (tw4) obj4;
                ArrayList<q9v> arrayList = (ArrayList) obj2;
                cab cabVarA1 = drawScope.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).i(tw4Var, 1);
                    u84 u84VarP = drawScope.a1().p();
                    for (q9v q9vVar : arrayList) {
                        Canvas canvas = v84.a;
                        Canvas canvas2 = u84VarP.a;
                        n511 n511Var = q9vVar.b;
                        float f = n511Var.a;
                        float f2 = n511Var.b;
                        float f3 = n511Var.c;
                        float f4 = n511Var.d;
                        float f5 = q9vVar.c;
                        canvas2.drawRoundRect(f, f2, f3, f4, f5, f5, q9vVar.a);
                    }
                    i3a.n(cabVarA1, jU);
                    tw4 tw4Var2 = (tw4) obj5;
                    tw4 tw4Var3 = (tw4) obj6;
                    Paint paint = (Paint) obj3;
                    cab cabVarA2 = drawScope.a1();
                    long jU2 = cabVarA2.u();
                    cabVarA2.p().q();
                    try {
                        ((dg8) cabVarA2.b).i(tw4Var2, 1);
                        u84 u84VarP2 = drawScope.a1().p();
                        Canvas canvas3 = v84.a;
                        u84VarP2.a.drawPath(tw4Var3.a, paint);
                        return rih1Var;
                    } finally {
                        i3a.n(cabVarA2, jU2);
                    }
                } catch (Throwable th) {
                    i3a.n(cabVarA1, jU);
                    throw th;
                }
            case 10:
                svh0 svh0Var = (svh0) obj4;
                if (!svh0Var.b) {
                    svh0Var.b = true;
                    ((Bundle) obj5).putBoolean("stsHasSynced", true);
                    fn31.T(cto1.q((iac0) obj2), (o8n) null, 0, new glu0((byte) 2, (iyc0) obj6, (String) obj3, (lnm) null), 3);
                }
                return rih1Var;
            case 11:
                rtb0 rtb0Var = (rtb0) obj;
                rtb0.c(rtb0Var, (Object) null, rbj.a, 3);
                rtb0.c(rtb0Var, (Object) null, new j2i(-1443711106, new hov0((dc8) obj5, (String) obj2, (byte) 12), true), 3);
                List list3 = (List) obj4;
                if (!list3.isEmpty()) {
                    rtb0.c(rtb0Var, (Object) null, rbj.b, 3);
                    rtb0Var.e(list3.size(), new iio0(list3, (byte) 20), new iio0(list3, (byte) 21), new j2i(802480018, new rf1(list3, (lgu0) obj6, (iu30) obj3, (byte) 29), true));
                }
                return rih1Var;
            case 12:
                rtb0 rtb0Var2 = (rtb0) obj;
                String str2 = (String) obj4;
                rtb0.c(rtb0Var2, str2, new j2i(-1214567306, new iww0(str2, (byte) 5), true), 2);
                c380 c380Var = (c380) obj5;
                rtb0Var2.e(c380Var.size(), new svb0(new q4z0((String) obj6, (byte) 23), c380Var, (byte) 7), new rw11(c380Var, (byte) 2), new j2i(802480018, new ot(c380Var, (cm0) obj3, (byte) 19), true));
                String str3 = (String) obj2;
                rtb0.c(rtb0Var2, str3, new j2i(-692998227, new iww0(str3, (byte) 6), true), 2);
                return rih1Var;
            case 13:
                e821 e821Var = (e821) obj2;
                tv80 tv80Var = (tv80) obj;
                String str4 = (String) obj4;
                if (str4.equals("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt") && (xwp0Var = (xwp0) obj5) != null && (xwp0Var instanceof hwp0)) {
                    yh71 yh71Var = (yh71) e821Var.e;
                    kbp0 kbp0Var = new kbp0(e821Var, str4, (String) obj6, (String) obj3, tv80Var, (byte) 15);
                    n521 n521Var = n521.d;
                    Activity activity = yh71Var.a;
                    mw40 mw40VarT = yoi1.T(activity, activity.getString(2131963988), activity.getString(2131963987));
                    mw40VarT.e = true;
                    String string = activity.getString(2131963986);
                    wzk wzkVar = new wzk(kbp0Var, (byte) 9);
                    mw40VarT.a = string;
                    mw40VarT.c = wzkVar;
                    String string2 = activity.getString(2131963985);
                    wzk wzkVar2 = new wzk(n521Var, (byte) 9);
                    mw40VarT.b = string2;
                    mw40VarT.d = wzkVar2;
                    mw40VarT.b().b();
                } else {
                    e821Var.t(str4, (String) obj6, (String) obj3, tv80Var);
                }
                return rih1Var;
            case 14:
                e821 e821Var2 = (e821) obj4;
                String str5 = (String) obj5;
                kbp0 kbp0Var2 = new kbp0(e821Var2, (String) obj2, (String) obj6, str5, (Function0) obj3, (byte) 16);
                dg30 dg30Var = (dg30) e821Var2.b;
                String string3 = dg30Var.getString(2131961157);
                String string4 = dg30Var.getString(2131961156);
                mw40 mw40VarT2 = yoi1.T(dg30Var, dg30Var.getString(2131961158, str5), dg30Var.getString(2131961155));
                oad oadVar = new oad(kbp0Var2, (byte) 29);
                mw40VarT2.a = string3;
                mw40VarT2.c = oadVar;
                k6b k6bVar = k6b.Y;
                mw40VarT2.b = string4;
                mw40VarT2.d = k6bVar;
                mw40VarT2.b().b();
                return rih1Var;
            case 15:
                kdy0 kdy0Var = (kdy0) obj4;
                jp91 jp91Var = (jp91) kdy0Var.e;
                dg30 dg30Var2 = (dg30) kdy0Var.c;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                fn31.T(cto1.q(dg30Var2), (o8n) null, 0, new hgo0((byte) 10, kdy0Var, jp91Var.a(dg30Var2, (lik1) obj5, yon1.G1("CONTEXTMENU_TRACK", "contextmenu/track", 442, "contextmenu")), (String) obj2, (String) obj6, (String) obj3, (lnm) null), 3);
                return rih1Var;
            case 16:
                Offset offset = (Offset) obj;
                long j = offset.a;
                fn31.T((c9n) obj4, (o8n) null, 0, new m311((de21) obj2, (ven0) obj6, (ven0) obj3, (lnm) null, (byte) 14), 3);
                ((iu30) obj5).invoke(offset);
                return rih1Var;
            case 17:
                ne neVar2 = (ne) obj4;
                fn31.T(cto1.q((dg30) neVar2.b), (o8n) null, 0, new af0((List) obj5, neVar2, (tv80) obj, (String) obj2, (String) obj6, (String) obj3, (lnm) null), 3);
                return rih1Var;
            case 18:
                fvj1 fvj1Var = (fvj1) obj;
                dc31 dc31Var = (dc31) obj4;
                if (!(fvj1Var instanceof evj1)) {
                    if (!(fvj1Var instanceof dvj1)) {
                        if (fvj1Var instanceof cvj1) {
                            i = 1;
                        } else {
                            eg.o();
                        }
                    }
                    return null;
                }
                i = 3;
                i8h1 i8h1Var = (i8h1) dc31Var.b;
                l4m0 l4m0Var = (l4m0) obj5;
                x6h1 x6h1VarC = l4m0Var.b.c();
                x6h1VarC.i.add(new a7h1("video_preview", (String) obj2, (Integer) null, (String) null, z3m0.b(i)));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = l4m0Var.a;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                if (fvj1Var instanceof cvj1) {
                    g871 g871Var = (g871) dc31Var.c;
                    cvj1 cvj1Var = (cvj1) fvj1Var;
                    String str6 = (String) obj6;
                    String str7 = (String) obj3;
                    if (cvj1Var instanceof bvj1) {
                        w771Var = new w771(200, str6, str7, "Param resolution failed", null);
                    } else if (cvj1Var instanceof zuj1) {
                        w771Var = new w771(201, str6, str7, "Rive file load failed", j2h1.I(((zuj1) cvj1Var).a));
                    } else {
                        if (!(cvj1Var instanceof avj1)) {
                            eg.o();
                            return null;
                        }
                        w771Var = new w771(202, str6, str7, "Terminal error (not a Rive asset)", null);
                    }
                    g871Var.b(w771Var);
                }
                return rih1Var;
            case 19:
                xb51 xb51Var = (xb51) obj2;
                ((lsl) obj).s1();
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj4;
                if (!atomicBoolean.get() && (!((Boolean) ((iu30) ((ven0) obj5).getValue()).invoke(xb51Var)).booleanValue() || (((Boolean) ((Function0) ((ven0) obj6).getValue()).invoke()).booleanValue() && ((Boolean) ((iu30) ((ven0) obj3).getValue()).invoke(xb51Var)).booleanValue()))) {
                    atomicBoolean.set(true);
                }
                return rih1Var;
            case 20:
                jp61 jp61Var = (jp61) obj;
                no5 no5Var = (no5) obj4;
                igb1 igb1Var = jp61Var.c;
                evz evzVarR = h5p1.r(jmo1.e((mr20[]) new mr20[]{jp61Var.b.l, ((iu30) obj5).invoke(igb1Var)}), (mr20) ((iu30) obj2).invoke(igb1Var), (mr20) ((iu30) obj6).invoke(igb1Var), (mr20) ((iu30) obj3).invoke(igb1Var), new k1(jp61Var, (lnm) null, (byte) 29));
                no5Var.getClass();
                return new lt20(evzVarR, new dwf0(no5Var, jp61Var, (lnm) null, (byte) 21), (byte) 0);
            case 21:
                o2u0 o2u0Var = (o2u0) obj2;
                frr0 frr0Var = (frr0) obj3;
                frr0 frr0Var2 = (frr0) obj6;
                uoa uoaVar = (uoa) obj4;
                uoaVar.d((VideoSurfaceView) obj);
                ta71 ta71Var = (ta71) obj5;
                boolean z = ta71Var.i;
                Uri uri = ta71Var.a;
                long j2 = ta71Var.f;
                long j3 = ta71Var.e;
                uoaVar.q(z);
                int iOrdinal2 = ta71Var.c.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 1;
                    m0u0 m0u0VarE = uoaVar.e();
                    if (u890.j(m0u0VarE != null ? m0u0VarE.a.a : null, uri.toString()) && frr0Var2.s() == j3 && frr0Var.s() == j2) {
                        uoaVar.l();
                    } else {
                        uoaVar.h(o2u0Var, new oot0(ta71Var.e, ta71Var.f, true, false, (hu7) null, (tne1) null, false, 240));
                    }
                } else if (iOrdinal2 == 1) {
                    m0u0 m0u0VarE2 = uoaVar.e();
                    if (!u890.j(m0u0VarE2 != null ? m0u0VarE2.a.a : null, uri.toString()) || frr0Var2.s() != j3 || frr0Var.s() != j2) {
                        uoaVar = uoaVar;
                        uoaVar.h(o2u0Var, new oot0(ta71Var.e, ta71Var.f, false, false, (hu7) null, (tne1) null, false, 240));
                    }
                    uoaVar.f();
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    uoaVar.u();
                    i2 = 1;
                }
                frr0Var2.t(j3);
                frr0Var.t(j2);
                int i3 = ta71Var.h ? 3 : i2;
                if (uoaVar.h != i3) {
                    uoaVar.p(i3);
                }
                return rih1Var;
            case 22:
                mo71 mo71Var = new mo71((uoa) obj5, (ta71) obj2, (woa) obj6);
                ((iac0) obj4).getLifecycle().a(mo71Var);
                return new e96((l811) obj3, (iac0) obj4, mo71Var, (uoa) obj5, (woa) obj6, (byte) 3);
            case 23:
                i3f1 i3f1Var = (i3f1) obj;
                yt91 yt91Var = (yt91) obj5;
                i8h1 i8h1Var2 = (i8h1) yt91Var.b;
                WebView webView = (WebView) ((ven0) obj2).getValue();
                ven0 ven0Var = (ven0) obj6;
                String str8 = (String) ven0Var.getValue();
                String str9 = (String) ((ven0) obj3).getValue();
                Activity activity2 = ((cg0) obj4).a;
                int iOrdinal3 = i3f1Var.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        try {
                            activity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str8)));
                            break;
                        } catch (ActivityNotFoundException unused) {
                        }
                    } else {
                        if (iOrdinal3 != 2) {
                            if (iOrdinal3 == 3) {
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND");
                                intent.setFlags(319291392);
                                if (str9.length() > 0 && !str9.equals(str8)) {
                                    intent.putExtra("android.intent.extra.SUBJECT", str9);
                                }
                                intent.putExtra("android.intent.extra.TEXT", str8);
                                intent.setType("text/plain");
                                activity2.startActivity(Intent.createChooser(intent, null));
                            } else {
                                eg.o();
                            }
                            return null;
                        }
                        ((ClipboardManager) activity2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str9, str8));
                        Toast.makeText(activity2, activity2.getString(2131962860), 0).show();
                    }
                } else if (webView != null) {
                    webView.reload();
                }
                int iOrdinal4 = i3f1Var.ordinal();
                b7x b7xVar = b7x.a;
                if (iOrdinal4 == 0) {
                    bqk0 bqk0Var = (bqk0) yt91Var.c;
                    if (bqk0Var != null) {
                        x6h1 x6h1VarC2 = bqk0Var.b.c();
                        x6h1VarC2.i.add(new a7h1("more_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                        x6h1VarC3.i.add(new a7h1("refresh_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                } else if (iOrdinal4 == 1) {
                    String str10 = (String) ven0Var.getValue();
                    bqk0 bqk0Var2 = (bqk0) yt91Var.c;
                    if (bqk0Var2 != null) {
                        x6h1 x6h1VarC4 = bqk0Var2.b.c();
                        x6h1VarC4.i.add(new a7h1("more_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                        x6h1VarC5.i.add(new a7h1("open_in_external_browser_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str10)), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                } else if (iOrdinal4 == 2) {
                    bqk0 bqk0Var3 = (bqk0) yt91Var.c;
                    if (bqk0Var3 != null) {
                        x6h1 x6h1VarC6 = bqk0Var3.b.c();
                        x6h1VarC6.i.add(new a7h1("more_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                        x6h1VarC7.i.add(new a7h1("copy_link_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("copy_to_clipboard", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                } else {
                    if (iOrdinal4 != 3) {
                        eg.o();
                        return null;
                    }
                    bqk0 bqk0Var4 = (bqk0) yt91Var.c;
                    if (bqk0Var4 != null) {
                        x6h1 x6h1VarC8 = bqk0Var4.b.c();
                        x6h1VarC8.i.add(new a7h1("more_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                        x6h1VarC9.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC9.a();
                        String str11 = (String) yt91Var.d;
                        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", str11 != null ? str11 : ""), new mmr0("share_id", "split-browser-share-id")})), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                }
                return rih1Var;
            case 24:
                return a(obj);
            case 25:
                long j4 = ((Offset) obj).a;
                y9e1 y9e1Var = (y9e1) obj4;
                if (y9e1Var != null) {
                    cde1 cde1Var = (cde1) obj5;
                    String str12 = (String) obj2;
                    int iG = y9e1Var.b.g(j4);
                    int iQ = o6p1.q(iG, str12);
                    int iP = o6p1.p(iG, str12);
                    cde1Var.c = iQ;
                    cde1Var.d = iP;
                    cde1Var.f(iQ);
                    cde1Var.e(iP);
                    ((Function0) obj6).invoke();
                    ((Function0) obj3).invoke();
                }
                return rih1Var;
            case 26:
                return d(obj);
            case 27:
                return e(obj);
            case 28:
                return f(obj);
            default:
                fzf1 fzf1Var = (fzf1) obj;
                hjf1 hjf1Var = (hjf1) obj5;
                int i4 = hjf1Var.f;
                ContextTrack contextTrack = hjf1Var.h;
                iu30 iu30Var = (iu30) obj2;
                n2g1 n2g1Var = (n2g1) obj4;
                int iOrdinal5 = fzf1Var.ordinal();
                if (iOrdinal5 == 0) {
                    iu30Var.invoke(hjf1Var.r ? hjf1Var.s ? new o8z0(contextTrack, false) : new o8z0(contextTrack, true) : hjf1Var.o ? new m8z0(i4, contextTrack) : new j8z0(i4, contextTrack, ypf1.a));
                } else if (iOrdinal5 == 1) {
                    ((fn90) obj6).s(n2g1Var);
                } else if (iOrdinal5 == 7) {
                    iu30Var.invoke(new j8z0(i4, contextTrack, xpf1.a));
                } else if (iOrdinal5 == 8) {
                    iu30Var.invoke(new o8z0(contextTrack, true));
                } else if (iOrdinal5 != 9) {
                    int iOrdinal6 = fzf1Var.ordinal();
                    if (iOrdinal6 == 2) {
                        ueVar = se.a;
                    } else if (iOrdinal6 == 3) {
                        ueVar = re.a;
                    } else if (iOrdinal6 == 4) {
                        ueVar = qe.a;
                    } else if (iOrdinal6 != 5) {
                        ueVar = iOrdinal6 != 6 ? null : ue.a;
                    } else {
                        ueVar = te.a;
                    }
                    if (ueVar != null) {
                        ((nsm0) obj3).invoke(ueVar, Integer.valueOf(n2g1Var.n()));
                    }
                } else {
                    iu30Var.invoke(new o8z0(contextTrack, false));
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tjf0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjf0(epb1 epb1Var, kai0 kai0Var, ng20 ng20Var, fza fzaVar, km3 km3Var, ytp0 ytp0Var) {
        super(1);
        this.a = (byte) 3;
        this.b = epb1Var;
        this.c = kai0Var;
        this.d = fzaVar;
        this.e = km3Var;
        this.f = ytp0Var;
    }
}
