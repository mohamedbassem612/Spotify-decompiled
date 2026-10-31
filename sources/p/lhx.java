package p;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lhx extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lhx(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final Object a(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((iu30) ((ven0) this.c).getValue()).invoke(new qra0(zBooleanValue));
        if (zBooleanValue) {
            fn31.T((c9n) this.b, (o8n) null, 0, new ss90((bs91) this.d, (ven0) this.e, (lnm) null, (byte) 3), 3);
        }
        return rih1.a;
    }

    private final Object d(Object obj) {
        cib0 cib0Var = (cib0) this.b;
        List list = cib0Var.d;
        ((rtb0) obj).e(list.size(), new xg50(list, (byte) 15), new xg50(list, (byte) 16), new j2i(2039820996, new a87(list, cib0Var, (dw91) this.c, (zgb0) this.d, (bjb0) this.e, (byte) 3), true));
        return rih1.a;
    }

    private final Object e(Object obj) {
        eod eodVar = (fod) obj;
        if (eodVar instanceof eod) {
            pbr0 pbr0Var = (pbr0) this.b;
            String string = eodVar.a.toString();
            string.getClass();
            pbr0Var.accept(new b2f(((yqg) this.c).b() / 1000, Collections.singletonList(new a2f(1, 2, 0L, string, string))));
        } else if (eodVar.equals(cod.a)) {
            ((ven0) this.d).setValue(Boolean.TRUE);
        } else if (eodVar.equals(dod.a)) {
            ((ven0) this.e).setValue(Boolean.TRUE);
        } else if (!eodVar.equals(bod.a)) {
            eg.o();
            return null;
        }
        return rih1.a;
    }

    private final Object f(Object obj) {
        kil kilVar = (kil) obj;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.e;
        View view = (View) this.b;
        op71.t(view, kilVar);
        View view2 = (View) this.c;
        op71.t(view2, kilVar);
        smc0 smc0Var = (smc0) this.d;
        Iterator it = smc0Var.iterator();
        while (it.hasNext()) {
            op71.t((View) it.next(), kilVar);
        }
        kilVar.g(view.getId(), 6, constraintLayout.getId(), 6);
        kilVar.g(view.getId(), 7, view2.getId(), 6);
        kilVar.g(view2.getId(), 7, ((View) o7h.q0(smc0Var)).getId(), 6);
        for (mmr0 mmr0Var : o7h.w1(smc0Var)) {
            kilVar.g(((View) mmr0Var.a).getId(), 7, ((View) mmr0Var.b).getId(), 6);
        }
        kilVar.g(((View) o7h.A0(smc0Var)).getId(), 7, constraintLayout.getId(), 7);
        return rih1.a;
    }

    private final Object g(Object obj) {
        ((jyb0) ((upa0) this.b).b).a((String) this.c, (String) this.d, (String) this.e);
        return rih1.a;
    }

    private final Object h(Object obj) {
        int i;
        dxy dxyVar = (dxy) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        qxc0 qxc0Var = (qxc0) this.e;
        pbh0 pbh0Var = new pbh0((dg30) dxyVar.d, 0);
        pbh0Var.f(2131960061);
        if (qxc0Var.i == wls0.c) {
            i = 2131960056;
        } else {
            i = qxc0Var.t.b ? 2131960058 : 2131960057;
        }
        pbh0Var.b(i);
        pbh0Var.d(2131960060, new ok5(dxyVar, str, str2, qxc0Var, (byte) 2)).c(2131960059, new oad(dxyVar, (byte) 18)).create().show();
        return rih1.a;
    }

    private final Object i(Object obj) {
        c9 c9VarSingletonList;
        kex kexVar = (kex) obj;
        iu30 iu30Var = (iu30) this.c;
        lec0 lec0Var = (lec0) this.b;
        jec0 jec0Var = lec0Var.b;
        iec0 iec0Var = iec0.a;
        if (!jec0Var.equals(iec0Var)) {
            kexVar.a("LeadingChip", new j2i(-2045211860, new vx90(lec0Var, iu30Var, (byte) 19), true));
        }
        if (jec0Var.equals(iec0Var)) {
            c9VarSingletonList = lec0Var.a;
        } else {
            if (!(jec0Var instanceof jec0)) {
                eg.o();
                return null;
            }
            c9VarSingletonList = Collections.singletonList(jec0Var.a);
        }
        jec0 jec0Var2 = jec0Var instanceof jec0 ? jec0Var : null;
        kexVar.b(c9VarSingletonList.size(), new j2i(-1673449743, new cy00(c9VarSingletonList, jec0Var2 != null ? jec0Var2.a : null, iu30Var, (byte) 21), true), new nec0(c9VarSingletonList, (byte) 0));
        if (lec0Var.c != null) {
            kexVar.a("GraduationChip", new j2i(-117277483, new mb90((ven0) this.d, iu30Var, (Context) this.e, (byte) 22), true));
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x02bf  */
    public final Object invoke(Object obj) {
        m5y m5yVarA;
        String str;
        ofg1 ofg1Var;
        epb0 epb0Var;
        int i;
        maa maaVarA;
        boolean z;
        int itemCount;
        ClipData clipData;
        ClipData.Item itemAt;
        Uri uri;
        ClipData clipData2;
        int i2 = 10;
        char c = 1;
        switch (this.a) {
            case 0:
                c3z c3zVar = (c3z) obj;
                mhx mhxVar = (mhx) this.c;
                p811 p811Var = (p811) this.b;
                e2z e2zVar = (e2z) p811Var.a;
                boolean z2 = c3zVar.a;
                boolean z3 = c3zVar.b;
                Integer num = c3zVar.c;
                e2z e2zVar2 = new e2z(e2zVar.a, e2zVar.b, e2zVar.c, e2zVar.d, e2zVar.e, e2zVar.f, e2zVar.g, num != null ? num.intValue() : e2zVar.h, z3, z2, e2zVar.k, e2zVar.l);
                p811Var.a = e2zVar2;
                mhxVar.e.f(e2zVar2);
                ((yfu) this.d).r((y570) this.e, mno1.h(new mmr0[]{new mmr0("progressKey", Integer.valueOf(((e2z) p811Var.a).h))}));
                return rih1.a;
            case 1:
                String str2 = (String) obj;
                l5y l5yVar = (l5y) ((ven0) this.b).getValue();
                suo suoVar = (suo) ((ven0) this.c).getValue();
                k5y k5yVar = l5yVar.b;
                nrs0 nrs0Var = (nrs0) this.d;
                muo muoVar = (muo) this.e;
                boolean z4 = l5yVar.e;
                suoVar.getClass();
                j5y j5yVar = k5yVar instanceof j5y ? (j5y) k5yVar : null;
                if (j5yVar != null) {
                    ruo ruoVarB = suo.b(j5yVar, str2, nrs0Var);
                    if (ruoVarB != null) {
                        m5yVarA = ruoVarB.a;
                    } else {
                        m5yVarA = suo.a(j5yVar, str2, nrs0Var);
                        if (m5yVarA != null) {
                        }
                    }
                    if (muoVar != null) {
                        m3n m3nVar = new m3n((Object) ruoVarB, (Object) suoVar, (Object) str2, (byte) 3);
                        rtm0 rtm0Var = muoVar.a;
                        String str3 = m5yVarA.a;
                        if (z4 && (str = m5yVarA.e) != null) {
                            boolean zJ = u890.j(((raw0) rtm0Var.d.a.getValue()).getIdentifier(), str3);
                            m3nVar.invoke(Boolean.valueOf(zJ));
                            if (zJ) {
                                rtm0Var.a(dtm0.a);
                            } else {
                                naw0 naw0Var = new naw0(str3, str, new ksm0(fec1.c, (String) null, (String) null, "dj-voice-preview", str, (String) null, 486));
                                if (!u890.j(rtm0Var.e, gtm0.a) && h7w.E(str) != null) {
                                    long j = rtm0Var.h + 1;
                                    rtm0Var.h = j;
                                    rtm0Var.a(new atm0(new jtm0(j, naw0Var)));
                                }
                            }
                        }
                    }
                }
                return rih1.a;
            case 2:
                ln00 ln00Var = (ln00) this.d;
                int iOrdinal = ((pay) obj).ordinal();
                if (iOrdinal == 0) {
                    eg41 eg41Var = ((bby) this.c).a.d;
                    if (eg41Var != null) {
                        ofg1Var = new ofg1(eg41Var.b);
                    } else {
                        eg41 eg41Var2 = ln00Var.a.d;
                        ofg1Var = eg41Var2 != null ? new ofg1(eg41Var2.b) : null;
                    }
                } else if (iOrdinal == 1) {
                    ofg1Var = (ofg1) this.b;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    eg41 eg41Var3 = ln00Var.a.d;
                    ofg1Var = new ofg1(eg41Var3 != null ? eg41Var3.b : ((ft71) this.e).i);
                }
                return new ofg1(ofg1Var != null ? ofg1Var.a : ofg1.b);
            case 3:
                cas casVar = (a7m0) obj;
                casVar.a = new htu((lhc) this.d, (byte) 13);
                casVar.d = oxx.O0;
                casVar.e = oxx.P0;
                casVar.c = new lud((oud) this.b, (q8n) this.c, new bz9((wh71) this.e, (lnm) null, (byte) 1));
                casVar.a(new qrk(1, (byte) 28), new qrk(1, (byte) 29));
                return rih1.a;
            case 4:
                pbq pbqVar = (pbq) this.b;
                ycm ycmVar = (ycm) pbqVar.i;
                return f6o1.A(new kpg0(new idm(new uny(pbqVar, (y1c1) obj, (String) this.c, (byte) 3), ycmVar.a, ycmVar.b, ycmVar.c, ycmVar.d), new go8((String) this.d, (ucm) this.e, (byte) 1)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 5:
                bv31 bv31Var = (bw31) this.e;
                boolean z5 = ((odz) this.d).U0;
                ym ymVar = (ym) this.b;
                int iOrdinal2 = ((t9z) obj).ordinal();
                if (iOrdinal2 == 1) {
                    ymVar.invoke(new nc7((jh90) this.c));
                } else if (iOrdinal2 != 2) {
                    if (iOrdinal2 == 3 && z5) {
                        jh90 jh90Var = bv31Var.a;
                        ymVar.invoke(new rc7(jh90Var.a, jh90Var.e));
                    }
                } else if (z5) {
                    jh90 jh90Var2 = bv31Var.a;
                    ymVar.invoke(new sc7(jh90Var2.a, jh90Var2.e, jh90Var2.h, false, jh90Var2.g, false));
                }
                return rih1.a;
            case 6:
                ue00 ue00Var = (ue00) this.b;
                LinkedList linkedList = (LinkedList) this.c;
                LinkedList linkedList2 = (LinkedList) this.d;
                ld00 ld00Var = (ld00) this.e;
                qyo1.x(ue00Var.b, false, true, new f0z(ue00Var, linkedList, (byte) 15));
                qyo1.x(ld00Var.a, false, true, new f0z(ld00Var, linkedList2, (byte) 10));
                return rih1.a;
            case 7:
                int i3 = 2;
                epb0 epb0Var2 = (epb0) obj;
                i7d i7dVar = (i7d) this.b;
                cj00 cj00Var = (cj00) this.c;
                ArrayList arrayList = new ArrayList();
                List list = cj00Var.b;
                if (list.isEmpty()) {
                    pi00 pi00Var = cj00Var.d;
                    if (pi00Var != null) {
                        arrayList.add(pi00Var);
                    }
                } else {
                    int i4 = 0;
                    for (Object obj2 : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            p7h.T();
                            throw null;
                        }
                        li00 li00Var = (li00) obj2;
                        if (li00Var instanceof zi00) {
                            arrayList.add(((zi00) li00Var).a);
                        } else if (li00Var instanceof qi00) {
                            arrayList.add(((qi00) li00Var).a.a);
                        } else {
                            if (!(li00Var instanceof xi00)) {
                                eg.o();
                                return null;
                            }
                            xi00 xi00Var = (xi00) li00Var;
                            ArrayList arrayList2 = xi00Var.c;
                            String str4 = xi00Var.d;
                            sh51 sh51Var = xi00Var.a;
                            if (sh51Var != null) {
                                ni00 ni00Var = xi00Var.e;
                                if (ni00Var == null) {
                                    arrayList.add(sh51Var);
                                } else {
                                    arrayList.add(new oi00(ni00Var));
                                }
                            }
                            int iC = l1d.C(xi00Var.b);
                            if (iC == 0) {
                                epb0Var = epb0Var2;
                                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                                int i6 = 0;
                                for (Object obj3 : arrayList2) {
                                    int i7 = i6 + 1;
                                    if (i6 < 0) {
                                        p7h.T();
                                        throw null;
                                    }
                                    arrayList3.add(new yi00((y6b1) o7h.q0((List) obj3), str4, Integer.valueOf(i4), Integer.valueOf(i6)));
                                    i6 = i7;
                                }
                                arrayList.addAll(arrayList3);
                            } else if (iC == 1) {
                                epb0Var = epb0Var2;
                                List listL1 = o7h.l1(o7h.p1(arrayList2));
                                ArrayList arrayList4 = new ArrayList(q7h.U(listL1, 10));
                                Iterator it = listL1.iterator();
                                while (it.hasNext()) {
                                    arrayList4.add((y6b1) o7h.q0((List) it.next()));
                                }
                                arrayList.add(new ki00(Integer.valueOf(i4), str4, arrayList4));
                            } else if (iC == i3) {
                                epb0Var = epb0Var2;
                                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList2, 10));
                                int i8 = 0;
                                for (Object obj4 : arrayList2) {
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        p7h.T();
                                        throw null;
                                    }
                                    List list2 = (List) obj4;
                                    arrayList5.add(list2.size() > 1 ? new ji00(list2, str4, Integer.valueOf(i4), Integer.valueOf(i8)) : new ii00((y6b1) o7h.q0(list2), str4, Integer.valueOf(i4), Integer.valueOf(i8)));
                                    i8 = i9;
                                }
                                arrayList.addAll(arrayList5);
                            } else if (iC == 3) {
                                ArrayList arrayList6 = new ArrayList(q7h.U(arrayList2, 10));
                                int i10 = 0;
                                for (Object obj5 : arrayList2) {
                                    int i11 = i10 + 1;
                                    if (i10 < 0) {
                                        p7h.T();
                                        throw null;
                                    }
                                    List list3 = (List) obj5;
                                    y6b1 y6b1Var = (y6b1) o7h.q0(list3);
                                    Set set = s4b1.f;
                                    epb0 epb0Var3 = epb0Var2;
                                    arrayList6.add(uic.g(y6b1Var.toString(), blc0.X4) ? new udk(y6b1Var.toString(), (String) null, 3, fnw.a, 98) : list3.size() > 1 ? new wi00(list3, str4, Integer.valueOf(i4), Integer.valueOf(i10)) : new vi00(y6b1Var, str4, Integer.valueOf(i4), Integer.valueOf(i10)));
                                    epb0Var2 = epb0Var3;
                                    i10 = i11;
                                }
                                epb0Var = epb0Var2;
                                arrayList.addAll(arrayList6);
                            } else {
                                if (iC != 4) {
                                    eg.o();
                                    return null;
                                }
                                ArrayList arrayList7 = new ArrayList(q7h.U(arrayList2, i2));
                                int i12 = 0;
                                for (Object obj6 : arrayList2) {
                                    int i13 = i12 + 1;
                                    if (i12 < 0) {
                                        p7h.T();
                                        throw null;
                                    }
                                    List list4 = (List) obj6;
                                    arrayList7.add(list4.size() > 1 ? new bj00(list4, str4, Integer.valueOf(i4), Integer.valueOf(i12)) : new aj00((y6b1) o7h.q0(list4), str4, Integer.valueOf(i4), Integer.valueOf(i12)));
                                    i12 = i13;
                                }
                                arrayList.addAll(arrayList7);
                            }
                            epb0Var2 = epb0Var;
                            i4 = i5;
                            i2 = 10;
                            i3 = 2;
                        }
                        epb0Var = epb0Var2;
                        epb0Var2 = epb0Var;
                        i4 = i5;
                        i2 = 10;
                        i3 = 2;
                    }
                }
                epb0 epb0Var4 = epb0Var2;
                ti00 ti00Var = cj00Var.c;
                if (ti00Var != null) {
                    arrayList.add(ti00Var.a);
                }
                epb0Var4.R(arrayList.size(), (iu30) null, new x94(arrayList, (byte) 7), new ry4(arrayList, (byte) 23), new j2i(-1942245546, new oi1(arrayList, i7dVar, (iu30) this.d, (iu30) this.e, (byte) 7), true));
                return rih1.a;
            case 8:
                wz20 wz20Var = (wz20) obj;
                ((ven0) this.d).setValue(Boolean.valueOf(wz20Var.b()));
                ((iu30) this.b).invoke(Boolean.valueOf(wz20Var.b()));
                if (wz20Var.b()) {
                    fn31.T((c9n) this.c, (o8n) null, 0, new lw10((j5c) this.e, (lnm) null, (byte) 0), 3);
                }
                return rih1.a;
            case 9:
                n511 n511VarL = nho1.l((elb0) obj);
                HashMap map = (HashMap) this.b;
                otl otlVar = ((ee21) this.c).a;
                n511 n511Var = (n511) map.get(otlVar.getId());
                if (!u890.j(n511Var, n511VarL)) {
                    if (n511Var != null && u890.j((String) ((ven0) this.d).getValue(), otlVar.getId())) {
                        ven0 ven0Var = (ven0) this.e;
                        kaa0.j(Offset.g(((Offset) ven0Var.getValue()).a, Offset.f(n511Var.h(), n511VarL.h())), ven0Var);
                    }
                    map.put(otlVar.getId(), n511VarL);
                }
                return rih1.a;
            case 10:
                fn31.T((c9n) this.b, (o8n) null, 0, new lqv((iu30) this.c, (rb30) this.d, (kq61) this.e, (lnm) null, (byte) 15, (byte) 0), 3);
                return rih1.a;
            case 11:
                Choreographer.FrameCallback frameCallback = (dk30) this.b;
                if (!((dk30) frameCallback).d) {
                    ((dk30) frameCallback).d = true;
                    ((dk30) frameCallback).a.postFrameCallback(frameCallback);
                }
                tgp1.d = (dk30) this.b;
                Window window = ((Activity) this.c).getWindow();
                dk30 dk30Var = (dk30) this.b;
                HandlerThread handlerThread = new HandlerThread("FrameProfilerMetrics");
                handlerThread.start();
                Handler handler = new Handler(handlerThread.getLooper());
                yj30 yj30Var = new yj30(dk30Var, (byte) 1);
                window.addOnFrameMetricsAvailableListener(yj30Var, handler);
                return new e96((dk30) this.b, (uqt) this.e, new dh30(yj30Var, handlerThread, (byte) 1), (Activity) this.c, gk30.d((Context) this.d, (dk30) this.b), (byte) 1);
            case 12:
                abc0 abc0Var = (abc0) obj;
                lu50 lu50Var = (lu50) this.b;
                mjh mjhVar = (mjh) this.c;
                abc0Var.c = new sr1(lu50Var, mjhVar, (o0i) this.d, (ven0) this.e, (lnm) null, (byte) 22);
                abc0Var.a = new h210((ven0) this.e, mjhVar, (lnm) null, (byte) 28);
                return rih1.a;
            case 13:
                abc0 abc0Var2 = (abc0) obj;
                qu50 qu50Var = (qu50) this.b;
                abc0Var2.c = new sr1(qu50Var, (o0i) this.c, (List) this.d, (pu50) this.e, (lnm) null, (byte) 23);
                abc0Var2.a = new h210((List) this.d, qu50Var, (lnm) null, (byte) 29);
                return rih1.a;
            case 14:
                b160 b160Var = (b160) this.b;
                kko kkoVar = (kko) this.c;
                zob1 zob1Var = (zob1) this.d;
                k9p k9pVar = b160Var.c;
                l1o l1oVar = b160Var.a;
                String str5 = l1oVar.a;
                ky50 ky50Var = (ky50) b160Var.i.getValue();
                u9p u9pVar = (u9p) k9pVar.a.c;
                iac0 iac0VarO = u9pVar.o();
                ycm ycmVar2 = (ycm) ((i1o) u9pVar.C).y.get();
                c8o.l(ycmVar2);
                q8u0 q8u0Var = (q8u0) xqu.a(u9pVar.W).get();
                jyo jyoVar = (jyo) u9pVar.x.get();
                i1o i1oVar = (i1o) u9pVar.C;
                axr axrVar = (axr) i1oVar.K.get();
                c8o.l(axrVar);
                ze81 ze81Var = (ze81) i1oVar.a0.get();
                c8o.l(ze81Var);
                d771 d771Var = (d771) i1oVar.L.get();
                c8o.l(d771Var);
                rzo rzoVar = (rzo) u9pVar.y.get();
                cq6 cq6Var = (cq6) i1oVar.V.get();
                c8o.l(cq6Var);
                d0r d0rVar = (d0r) u9pVar.f.get();
                tbq tbqVar = (tbq) i1oVar.T.get();
                c8o.l(tbqVar);
                ubq ubqVar = (ubq) i1oVar.U.get();
                c8o.l(ubqVar);
                vbq vbqVar = (vbq) i1oVar.W.get();
                c8o.l(vbqVar);
                ieq ieqVar = (ieq) i1oVar.X.get();
                c8o.l(ieqVar);
                wbq wbqVar = (wbq) i1oVar.Y.get();
                c8o.l(wbqVar);
                xbq xbqVar = (xbq) i1oVar.Z.get();
                c8o.l(xbqVar);
                xf4 xf4VarC = u9pVar.c();
                oy50 oy50Var = new oy50(iac0VarO, ycmVar2, q8u0Var, jyoVar, axrVar, ze81Var, d771Var, rzoVar, cq6Var, d0rVar, tbqVar, ubqVar, vbqVar, ieqVar, wbqVar, xbqVar, xf4VarC, u9pVar.f(), str5, kkoVar, ky50Var, zob1Var);
                ex50 ex50Var = ky50Var.a;
                r7q r7qVar = xbqVar.a;
                teq teqVar = r7qVar.d;
                psy psyVar = new psy((z710) teqVar.q9.get(), (lzn0) teqVar.i.get(), (i8h1) r7qVar.b.A5.get(), d0rVar);
                h3j1 h3j1VarB = b3o1.B(str5, xf4VarC);
                j9p j9pVar = b160Var.b;
                bkj0 bkj0Var = ky50Var.b;
                maa maaVarA2 = bkj0Var != null ? oy50Var.a(bkj0Var.a) : null;
                r7q r7qVar2 = wbqVar.a;
                teq teqVar2 = r7qVar2.d;
                kpg0 kpg0Var = new kpg0(new yxb0((z710) teqVar2.q9.get(), (lzn0) teqVar2.i.get(), (i8h1) r7qVar2.b.A5.get(), zob1Var), new ny50(oy50Var, (byte) 0));
                xzq xzqVar = new xzq(psyVar, new zi50(h3j1VarB, (byte) 8));
                yv8 yv8Var = new yv8(h5p1.s(d3p1.H(d0rVar, (o3r) psyVar.i, h3j1VarB), d3p1.H(d0rVar, (o3r) psyVar.t, h3j1VarB), d3p1.H(d0rVar, (o3r) psyVar.X, h3j1VarB), new w63(h3j1VarB, (lnm) null, (byte) 9)), (byte) 4);
                bkj0 bkj0Var2 = ky50Var.c;
                maa maaVarA3 = bkj0Var2 != null ? oy50Var.a(bkj0Var2.a) : null;
                bkj0 bkj0Var3 = ky50Var.d;
                maa maaVarA4 = bkj0Var3 != null ? oy50Var.a(bkj0Var3.a) : null;
                xw50 xw50Var = ky50Var.a.a;
                List listI0 = f46.i0(new bkj0[]{xw50Var.a, xw50Var.b, xw50Var.c, xw50Var.d, null});
                ArrayList arrayList8 = new ArrayList();
                Iterator it2 = listI0.iterator();
                while (it2.hasNext()) {
                    arrayList8.add(oy50Var.a(((bkj0) it2.next()).a));
                }
                cx50 cx50Var = ex50Var.b;
                List listI1 = f46.i0(new bkj0[]{cx50Var != null ? cx50Var.a : null, cx50Var != null ? cx50Var.b : null});
                ArrayList arrayList9 = new ArrayList();
                Iterator it3 = listI1.iterator();
                while (it3.hasNext()) {
                    arrayList9.add(oy50Var.a(((bkj0) it3.next()).a));
                }
                bkj0 bkj0Var4 = ex50Var.c;
                if (bkj0Var4 != null) {
                    k260 k260Var = bkj0Var4.a;
                    if (k260Var == uq71.b) {
                        i = 1;
                        maaVarA = new kpg0(ycm.a(oy50Var.b), new ny50(oy50Var, (byte) 1));
                    } else {
                        i = 1;
                        maaVarA = oy50Var.a(k260Var);
                    }
                } else {
                    i = 1;
                    maaVarA = null;
                }
                int iC2 = l1d.C(l1oVar.b);
                if (iC2 == 0) {
                    z = b160Var.d;
                } else {
                    if (iC2 != i) {
                        eg.o();
                        return null;
                    }
                    z = b160Var.e;
                }
                boolean z6 = z;
                zob1 zob1Var2 = (zob1) this.d;
                g050 g050Var = new g050(psyVar, (byte) 9);
                u9p u9pVar2 = (u9p) j9pVar.a.c;
                lzn0 lzn0Var = (lzn0) u9pVar2.G.get();
                i1o i1oVar2 = (i1o) u9pVar2.C;
                xfx xfxVarD = i1oVar2.d();
                c8o.l(xfxVarD);
                jus jusVar = (jus) i1oVar2.e.get();
                c8o.l(jusVar);
                boolean zBooleanValue = ((Boolean) i1oVar2.y0.get()).booleanValue();
                fns fnsVar = igu.a;
                c8o.m(fnsVar);
                return new jpg0(new s060(lzn0Var, xfxVarD, jusVar, maaVarA4, maaVarA3, maaVarA2, kpg0Var, xzqVar, yv8Var, g050Var, arrayList8, arrayList9, maaVarA, z6, zBooleanValue, zob1Var2, fnsVar), new zi50((j060) this.e, (byte) 9));
            case 15:
                drr0 drr0Var = (drr0) this.e;
                float fB = ((int) (((elb0) obj).b() & 4294967295L)) - ((drr0) this.d).s();
                erl1 erl1Var = (erl1) this.b;
                wat watVar = (wat) this.c;
                drr0Var.t((fB - erl1Var.c(watVar)) - erl1Var.d(watVar));
                return rih1.a;
            case 16:
                kd31 kd31Var = (kd31) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (kd31Var.R0 & 4294967295L)) / 2.0f;
                float fS = ((b8f1) this.c).c.s() + ((Number) ((tob1) this.b).getValue()).floatValue();
                float fS2 = (fS - ((hdn0) this.d).s()) - Float.intBitsToFloat((int) (kd31Var.R0 & 4294967295L));
                drr0 drr0Var2 = (drr0) this.e;
                kd31Var.E(yoi1.o(fS2, drr0Var2.s() - fIntBitsToFloat, Math.max(fS, drr0Var2.s())));
                return rih1.a;
            case 17:
                s760 s760Var = new s760((uoa) this.c, (ven0) this.d, (ven0) this.e, (byte) 0);
                iac0 iac0Var = (iac0) this.b;
                iac0Var.getLifecycle().a(s760Var);
                return new ht0(iac0Var, s760Var, (byte) 22);
            case 18:
                Context context = (Context) obj;
                bju bjuVar = (bju) this.b;
                ji0 ji0Var = ((f070) this.c).a;
                String str6 = ji0Var.a;
                String str7 = ji0Var.t;
                if (bjuVar.b == null) {
                    t45 t45VarA = bjuVar.a.a("html-ad");
                    t45VarA.h = "android-html-ad";
                    t45VarA.f.put("request_identifier", str7);
                    t45VarA.f.put("ad_id", str6);
                    bjuVar.b = t45VarA;
                }
                bz60 bz60Var = new bz60((yqg) this.e, (iu30) this.d);
                t45 t45Var = ((bju) this.b).b;
                if (t45Var != null) {
                    t45.m(t45Var, kx40.f(1), 4);
                }
                WebView webViewP = kw7.p(context, (iu30) this.d, bz60Var, (bju) this.b);
                bju bjuVar2 = (bju) this.b;
                f070 f070Var = (f070) this.c;
                t45 t45Var2 = bjuVar2.b;
                if (t45Var2 != null) {
                    t45Var2.g(kx40.f(1));
                }
                webViewP.loadDataWithBaseURL("https://open.spotifycdn.com", f070Var.b, "text/html", "UTF-8", null);
                return webViewP;
            case 19:
                ah0 ah0Var = (ah0) obj;
                ven0 ven0Var2 = (ven0) this.e;
                wmy wmyVar = (wmy) this.b;
                Uri uri2 = (Uri) ((ven0) this.d).getValue();
                int i14 = ah0Var.a;
                Intent intent = ah0Var.b;
                if (i14 == -1 && ((ix70) wmyVar.e).a) {
                    uri = uri2;
                } else if (i14 == -1) {
                    if ((intent != null ? intent.getData() : null) != null) {
                        if (intent != null) {
                            uri = intent.getData();
                        } else {
                            uri = null;
                        }
                    } else if (i14 != -1) {
                        uri = null;
                    } else {
                        if (intent != null) {
                            itemCount = 0;
                        } else {
                            itemCount = 0;
                        }
                        if (itemCount > 0) {
                            uri = null;
                        } else {
                            uri = null;
                        }
                    }
                } else if (i14 != -1) {
                    uri = null;
                } else {
                    if (intent != null || (clipData2 = intent.getClipData()) == null) {
                        itemCount = 0;
                    } else {
                        itemCount = clipData2.getItemCount();
                    }
                    if (itemCount > 0 || intent == null || (clipData = intent.getClipData()) == null || (itemAt = clipData.getItemAt(0)) == null) {
                        uri = null;
                    } else {
                        uri = itemAt.getUri();
                    }
                }
                ven0Var2.setValue(uri);
                if (((Uri) ven0Var2.getValue()) == null) {
                    ppo1.q((cir0) this.c);
                }
                return rih1.a;
            case 20:
                lsl lslVar = (lsl) obj;
                char c2 = ' ';
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lslVar.j() >> 32));
                Set set2 = (u380) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Bitmap bitmap2 = (Bitmap) this.d;
                Bitmap bitmap3 = (Bitmap) this.e;
                u84 u84VarP = lslVar.a1().p();
                int i15 = 0;
                while (i15 < 36) {
                    int i16 = i15 / 6;
                    char c3 = c2;
                    int i17 = i15 % 6;
                    float f = i17;
                    int iU = jch0.U((f * fIntBitsToFloat2) / 6.0f);
                    float f2 = i17 + 1;
                    char c4 = c;
                    int iU2 = jch0.U((f2 * fIntBitsToFloat2) / 6.0f);
                    float f3 = i16;
                    int iU3 = jch0.U((f3 * fIntBitsToFloat2) / 6.0f);
                    float f4 = i16 + 1;
                    float f5 = fIntBitsToFloat2;
                    int iU4 = jch0.U((f4 * fIntBitsToFloat2) / 6.0f);
                    Bitmap bitmap4 = bitmap;
                    int i18 = iU2 - iU;
                    Bitmap bitmap5 = bitmap2;
                    int i19 = iU4 - iU3;
                    boolean zContains = set2.contains(Integer.valueOf(i15));
                    Bitmap bitmap6 = zContains ? bitmap4 : bitmap5;
                    Set set3 = set2;
                    float width = bitmap6.getWidth();
                    Rect rect = new Rect(jch0.U((f * width) / 6.0f), jch0.U((f3 * width) / 6.0f), jch0.U((f2 * width) / 6.0f), jch0.U((f4 * width) / 6.0f));
                    float f6 = iU;
                    float f7 = iU3;
                    RectF rectF = new RectF(f6, f7, iU2, iU4);
                    Canvas canvas = v84.a;
                    u84VarP.a.drawBitmap(bitmap6, rect, rectF, (Paint) null);
                    if (!zContains) {
                        int pixel = bitmap3.getPixel(i17, i16);
                        float[] fArr = new float[3];
                        Color.colorToHSV(pixel, fArr);
                        float[] fArrCopyOf = Arrays.copyOf(fArr, 3);
                        float f8 = fArr[c4];
                        float f9 = fArr[2];
                        if (f8 < 0.1f || f9 < 0.1f) {
                            fArrCopyOf[0] = 30.0f;
                        }
                        fArrCopyOf[c4] = 0.05f;
                        fArrCopyOf[2] = 0.75f;
                        long jB = u7h.b(z4p1.e(Color.HSVToColor(fArrCopyOf)), 0.9f, 0.0f, 0.0f, 0.0f, 14);
                        float[] fArrCopyOf2 = Arrays.copyOf(fArr, 3);
                        float f10 = fArr[c4];
                        float f11 = fArr[2];
                        if (f10 < 0.1f || f11 < 0.1f) {
                            fArrCopyOf2[0] = 30.0f;
                        }
                        fArrCopyOf2[c4] = 0.1f;
                        fArrCopyOf2[2] = 0.45f;
                        long jB2 = u7h.b(z4p1.e(Color.HSVToColor(fArrCopyOf2)), 0.9f, 0.0f, 0.0f, 0.0f, 14);
                        float f12 = i18;
                        float f13 = i19;
                        DrawScope.d0(lslVar, jB, (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (((long) Float.floatToRawIntBits(f6)) << c3), (((long) Float.floatToRawIntBits(f12)) << c3) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), 0.0f, (phc1) null, (ColorFilter) null, 120);
                        DrawScope.d0(lslVar, jB2, (((long) Float.floatToRawIntBits(f6 + 0.5f)) << c3) | (((long) Float.floatToRawIntBits(f7 + 0.5f)) & 4294967295L), (((long) Float.floatToRawIntBits(f12 - 1.0f)) << c3) | (((long) Float.floatToRawIntBits(f13 - 1.0f)) & 4294967295L), 0.0f, new phc1(1.0f, 0.0f, 0, 0, (uw4) null, 30), (ColorFilter) null, 104);
                    }
                    i15++;
                    bitmap3 = bitmap3;
                    c2 = c3;
                    c = c4;
                    fIntBitsToFloat2 = f5;
                    bitmap = bitmap4;
                    bitmap2 = bitmap5;
                    set2 = set3;
                }
                return rih1.a;
            case 21:
                String strC1 = (String) obj;
                Integer num2 = (Integer) this.b;
                if (num2 != null && strC1.length() > num2.intValue()) {
                    strC1 = ihc1.c1(num2.intValue(), strC1);
                }
                ((ven0) this.c).setValue(strC1);
                ((iu30) this.d).invoke(new jj80(strC1, ((s220) this.e).a));
                return rih1.a;
            case 22:
                return a(obj);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return d(obj);
            case 24:
                return e(obj);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return f(obj);
            case 26:
                return g(obj);
            case 27:
                return h(obj);
            case 28:
                return i(obj);
            default:
                List list5 = (List) this.b;
                ((rtb0) obj).e(list5.size(), new xg50(list5, (byte) 25), new xg50(list5, (byte) 26), new j2i(2039820996, new oi1(list5, (k6a1) this.c, (az20) this.d, (vu30) this.e, (byte) 8), true));
                return rih1.a;
        }
    }
}
