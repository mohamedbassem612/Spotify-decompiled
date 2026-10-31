package p;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.spotify.messages.EventSenderStats2NonAuth;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.Function3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class sua implements uua, c290, rl71, n420, Init, ya, av30, fy71, Function3 {
    public final /* synthetic */ byte a;

    public static final boolean i(s8s0 s8s0Var) {
        s8s0 s8s0Var2 = xw21.f;
        return !nhc1.R(s8s0Var.b(), ".class", true);
    }

    public static RectF j(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.d1 || !(view instanceof ghd1)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        ghd1 ghd1Var = (ghd1) view;
        int contentWidth = ghd1Var.getContentWidth();
        int contentHeight = ghd1Var.getContentHeight();
        int iX = (int) o0c.x(ghd1Var.getContext(), 24);
        if (contentWidth < iX) {
            contentWidth = iX;
        }
        int right = (ghd1Var.getRight() + ghd1Var.getLeft()) / 2;
        int bottom = (ghd1Var.getBottom() + ghd1Var.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public static Bundle p(p700 p700Var, View view, View view2) {
        Bundle bundle = new Bundle();
        if (p700Var != null) {
            for (kpr0 kpr0Var : Collections.unmodifiableList(p700Var.c)) {
                String str = kpr0Var.b;
                ArrayList arrayList = kpr0Var.c;
                String str2 = kpr0Var.a;
                if (str.length() > 0) {
                    bundle.putString(str2, kpr0Var.b);
                } else if (arrayList.size() > 0) {
                    for (xwg xwgVar : kpr0Var.d.equals("relative") ? o2p1.h(view2, arrayList, 0, -1, view2.getClass().getSimpleName()) : o2p1.h(view, arrayList, 0, -1, view.getClass().getSimpleName())) {
                        if (xwgVar.a() != null) {
                            String strJ = ibk1.j(xwgVar.a());
                            if (strJ.length() > 0) {
                                bundle.putString(str2, strJ);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static Button r(bro1 bro1Var, ConstraintLayout constraintLayout) {
        int i;
        if ((bro1Var instanceof ris0) || (bro1Var instanceof qis0) || (bro1Var instanceof vis0)) {
            i = 2131623972;
        } else {
            if (!(bro1Var instanceof uis0) && !(bro1Var instanceof wis0) && !(bro1Var instanceof sis0) && !(bro1Var instanceof tis0)) {
                eg.o();
                return null;
            }
            i = 2131623973;
        }
        return (Button) LayoutInflater.from(constraintLayout.getContext()).inflate(i, (ViewGroup) constraintLayout, false);
    }

    public static boolean s(String str) {
        if (str == null) {
            return false;
        }
        Set set = s4b1.f;
        return uic.h(str, new blc0[]{blc0.u1, blc0.A1, blc0.M1, blc0.da});
    }

    public static dd00 u(EventSenderStats2NonAuth eventSenderStats2NonAuth) {
        ArrayList arrayList = new ArrayList();
        if (eventSenderStats2NonAuth.P() == eventSenderStats2NonAuth.H()) {
            int i = 0;
            int i2 = 0;
            for (Object obj : eventSenderStats2NonAuth.Q()) {
                int i3 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                phc phcVar = (phc) obj;
                Integer num = (Integer) eventSenderStats2NonAuth.I().get(i);
                num.getClass();
                int iIntValue = num.intValue() + i2;
                while (i2 < iIntValue) {
                    Integer num2 = (Integer) eventSenderStats2NonAuth.G().get(i2);
                    h290 h290VarF = eventSenderStats2NonAuth.F();
                    num2.getClass();
                    String str = (String) h290VarF.get(num2.intValue());
                    Long l = (Long) eventSenderStats2NonAuth.J().get(i2);
                    Long l2 = (Long) eventSenderStats2NonAuth.K().get(i2);
                    Long l3 = (Long) eventSenderStats2NonAuth.L().get(i2);
                    byte[] bArrT = phcVar.t();
                    bArrT.getClass();
                    String strK = a860.k(bArrT, d860.e);
                    str.getClass();
                    l2.getClass();
                    long jLongValue = l2.longValue();
                    l3.getClass();
                    arrayList.add(new vd00(str + "_" + strK, str, bArrT, strK, l, jLongValue, l3.longValue()));
                    i2++;
                }
                i2 = iIntValue;
                i = i3;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i4 = 0;
        for (Object obj2 : eventSenderStats2NonAuth.O()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                p7h.T();
                throw null;
            }
            Integer num3 = (Integer) obj2;
            int size = eventSenderStats2NonAuth.F().size();
            num3.getClass();
            int iIntValue2 = num3.intValue();
            if (iIntValue2 >= 0 && iIntValue2 < size && eventSenderStats2NonAuth.M() > i4) {
                linkedHashMap.put(eventSenderStats2NonAuth.F().get(num3.intValue()), Integer.valueOf((int) ((Number) eventSenderStats2NonAuth.N().get(i4)).longValue()));
            }
            i4 = i5;
        }
        ArrayList arrayList2 = new ArrayList();
        if (eventSenderStats2NonAuth.V() != 0) {
            arrayList2 = new ArrayList();
            Map mapJ = sqg0.J(new mmr0[]{new mmr0(qd00.e, new ed00(new y0u(0, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListEnteredCountsTotalList", "getStatesListEnteredCountsTotalList()Ljava/util/List;", 0, (byte) 15))), new mmr0(qd00.f, new ed00(new y0u(0, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListRejectedClientCountsTotalList", "getStatesListRejectedClientCountsTotalList()Ljava/util/List;", 0, (byte) 16))), new mmr0(qd00.g, new ed00(new y0u(0, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListDroppedCountsTotalList", "getStatesListDroppedCountsTotalList()Ljava/util/List;", 0, (byte) 17))), new mmr0(qd00.h, new ed00(new y0u(0, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListPersistedCountsTotalList", "getStatesListPersistedCountsTotalList()Ljava/util/List;", 0, (byte) 18))), new mmr0(qd00.i, new ed00(new y0u(0, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListRejectedBackendCountsTotalList", "getStatesListRejectedBackendCountsTotalList()Ljava/util/List;", 0, (byte) 19))), new mmr0(qd00.t, new ed00(new y0u(0, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListDeliveredCountsTotalList", "getStatesListDeliveredCountsTotalList()Ljava/util/List;", 0, (byte) 20))), new mmr0(qd00.X, new ed00(new y0u(0, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListDeletedCountsTotalList", "getStatesListDeletedCountsTotalList()Ljava/util/List;", 0, (byte) 21)))});
            int i6 = 0;
            for (Object obj3 : eventSenderStats2NonAuth.W()) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    p7h.T();
                    throw null;
                }
                Integer num4 = (Integer) obj3;
                h290 h290VarF2 = eventSenderStats2NonAuth.F();
                num4.getClass();
                String str2 = (String) h290VarF2.get(num4.intValue());
                for (Map.Entry entry : mapJ.entrySet()) {
                    qd00 qd00Var = (qd00) entry.getKey();
                    List list = (List) ((ed00) entry.getValue()).a.invoke();
                    if (list.size() > i6 && ((Number) list.get(i6)).longValue() > 0) {
                        str2.getClass();
                        arrayList2.add(new oav(str2, ((Number) list.get(i6)).longValue(), 0L, qd00Var));
                    }
                }
                i6 = i7;
            }
        }
        return new dd00(arrayList, linkedHashMap, arrayList2);
    }

    public static s8s0 v(s8s0 s8s0Var, s8s0 s8s0Var2) {
        return xw21.f.e(ihc1.H0(s8s0Var.a.r(), s8s0Var2.a.r()).replace('\\', '/'));
    }

    public static ArrayList w(ArrayList arrayList) {
        List listW1 = o7h.w1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listW1) {
            mmr0 mmr0Var = (mmr0) obj;
            if (!((kp51) mmr0Var.a).b.equals(((kp51) mmr0Var.b).b)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add((kp51) ((mmr0) it.next()).b);
        }
        return arrayList3;
    }

    public boolean accept(Object obj) {
        return u890.j(((ksk) obj).a, "spotify:list:offline-playable:all");
    }

    public Object apply(Object obj) {
        return bqx0.b.get(obj);
    }

    public mr20 c(foc1 foc1Var) {
        return new huz(cy71.a, (byte) 10);
    }

    public Object convert(int i) {
        psz0 psz0Var;
        if (i == 0) {
            psz0Var = psz0.CONTENT_RATING_TAG_UNSPECIFIED;
        } else if (i == 1) {
            psz0Var = psz0.CONTENT_RATING_TAG_EXPLICIT;
        } else if (i == 2) {
            psz0Var = psz0.CONTENT_RATING_TAG_MOGEF_19;
        } else if (i != 3) {
            psz0Var = i != 4 ? null : psz0.CONTENT_RATING_TAG_EROTIC;
        } else {
            psz0Var = psz0.CONTENT_RATING_TAG_SPOTIFY_18_PLUS;
        }
        return psz0Var == null ? psz0.UNRECOGNIZED : psz0Var;
    }

    public String d() {
        return null;
    }

    public byte[] e() {
        return null;
    }

    public First e0(Object obj) {
        return First.b(bin0.a((bin0) obj, (ArrayList) null, w7x.a, (shn0) null, 11));
    }

    public Object g(k371 k371Var, lnm lnmVar) {
        wa71 wa71Var = k371Var.a;
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0229  */
    /* JADX WARN: Code duplicated, block: B:172:0x02df  */
    /* JADX WARN: Code duplicated, block: B:190:0x0310  */
    /* JADX WARN: Code duplicated, block: B:195:0x0328  */
    /* JADX WARN: Code duplicated, block: B:234:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:240:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:247:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:251:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:253:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:256:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:260:0x0400  */
    /* JADX WARN: Code duplicated, block: B:261:0x0402  */
    /* JADX WARN: Code duplicated, block: B:263:0x0405  */
    /* JADX WARN: Code duplicated, block: B:264:0x0407  */
    /* JADX WARN: Code duplicated, block: B:266:0x040f  */
    /* JADX WARN: Code duplicated, block: B:269:0x041e  */
    /* JADX WARN: Code duplicated, block: B:275:0x0433  */
    /* JADX WARN: Code duplicated, block: B:276:0x043a  */
    /* JADX WARN: Code duplicated, block: B:281:0x0443  */
    /* JADX WARN: Code duplicated, block: B:285:0x044a  */
    /* JADX WARN: Code duplicated, block: B:287:0x044d  */
    /* JADX WARN: Code duplicated, block: B:291:0x0454  */
    /* JADX WARN: Code duplicated, block: B:294:0x045b  */
    /* JADX WARN: Code duplicated, block: B:297:0x0465  */
    /* JADX WARN: Code duplicated, block: B:302:0x0476  */
    /* JADX WARN: Code duplicated, block: B:306:0x0487  */
    /* JADX WARN: Code duplicated, block: B:308:0x0491  */
    /* JADX WARN: Code duplicated, block: B:309:0x0493  */
    /* JADX WARN: Code duplicated, block: B:314:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:315:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:318:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:321:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:325:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:329:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:343:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x0428 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x04cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x04bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0476 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x046f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x045f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x022d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0148  */
    /* JADX WARN: Code duplicated, block: B:97:0x0213  */
    /* JADX WARN: Code duplicated, block: B:99:0x0217  */
    public a8b0 k(uqs uqsVar, a8b0 a8b0Var, List list, n0h1 n0h1Var, boolean z) {
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        rcn0 rcn0Var;
        rcn0 rcn0VarD;
        q8a0[] q8a0VarArr;
        rcn0 rcn0Var2;
        rcn0 rcn0VarE;
        q8a0 q8a0Var;
        boolean z4;
        boolean z5;
        q8a0 q8a0Var2;
        boolean z6;
        fg5 annotations;
        dq20 dq20VarQ;
        boolean z7;
        ArrayList<q8a0> arrayList2;
        Iterator it;
        boolean z8;
        boolean z9;
        Enum r10;
        iep0 iep0Var;
        ArrayList arrayList3;
        ve5 ve5Var;
        Set setP1;
        iep0 iep0Var2;
        iep0 iep0Var3;
        boolean z10;
        boolean z11;
        ArrayList arrayList4;
        Enum r6;
        rcn0 rcn0Var3;
        rcn0 rcn0Var4;
        rcn0 rcn0Var5;
        rcn0 rcn0Var6;
        boolean z12;
        ArrayList arrayList5;
        Iterator it2;
        rcn0 rcn0Var7;
        rcn0 rcn0Var8;
        Iterator it3;
        q8a0 q8a0Var3;
        ArrayList arrayList6;
        Iterator it4;
        Set setP2;
        iep0 iep0Var4;
        iep0 iep0Var5;
        fa faVar;
        rcn0 q8a0Var4;
        e8b0 e8b0Var;
        rcn0 rcn0VarI;
        int iM;
        ve5 ve5Var2 = (ve5) uqsVar.c;
        o860 o860Var = (o860) uqsVar.d;
        List list2 = list;
        boolean z13 = uqsVar.a;
        ArrayList arrayListP = uqsVar.p(a8b0Var);
        ArrayList arrayList7 = new ArrayList(q7h.U(list2, 10));
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            arrayList7.add(uqsVar.p((e8b0) it5.next()));
        }
        if (!z13 || ((list2 instanceof Collection) && list2.isEmpty())) {
            z2 = false;
            break;
        }
        Iterator it6 = list2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                z2 = false;
                break;
            }
            if (!((cao0) ((bao0) ((uw0) o860Var.b).b)).a(a8b0Var, (a8b0) ((e8b0) it6.next()))) {
                z2 = true;
                break;
            }
        }
        int size = arrayListP.size();
        q8a0[] q8a0VarArr2 = new q8a0[size];
        int i = 0;
        while (i < size) {
            znb0 znb0VarS = dm5.S(3, new bki0(uqsVar, arrayListP, i, (byte) 2));
            q8a0 q8a0Var5 = q8a0.f;
            if (i <= 0 || !z2) {
                fa faVar2 = (fa) arrayListP.get(i);
                v7a0 v7a0Var = (v7a0) znb0VarS.getValue();
                e8b0 e8b0Var2 = faVar2.a;
                a1h1 a1h1Var = faVar2.c;
                iep0 iep0Var6 = iep0.a;
                z3 = z13;
                iep0 iep0Var7 = iep0.b;
                iep0 iep0Var8 = iep0.c;
                arrayList = arrayList7;
                if (e8b0Var2 == null) {
                    rcn0Var = null;
                    if (a1h1Var == null) {
                        iM = 0;
                    } else {
                        if (!(a1h1Var instanceof y0h1)) {
                            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb.append(a1h1Var);
                            sb.append(", ");
                            hhg1.f(us71.f(rc11.a, a1h1Var.getClass(), sb));
                            return null;
                        }
                        iM = ozn1.m(((y0h1) a1h1Var).x());
                    }
                    if (iM == 1) {
                        q8a0VarArr = q8a0VarArr2;
                        q8a0Var2 = q8a0Var5;
                        rcn0Var2 = null;
                    }
                    z7 = q8a0Var2.d;
                    arrayList2 = new ArrayList();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        faVar = (fa) o7h.t0(i, (List) it.next());
                        if (faVar != null || (e8b0Var = faVar.a) == null) {
                            q8a0Var4 = rcn0Var2;
                        } else {
                            rcn0 rcn0VarI2 = uqs.i(e8b0Var);
                            if (rcn0VarI2 == null) {
                                a8b0 a8b0VarL = vzn1.l((a8b0) e8b0Var);
                                rcn0VarI = a8b0VarL != null ? uqs.i(a8b0VarL) : rcn0Var2;
                            } else {
                                rcn0VarI = rcn0VarI2;
                            }
                            rcn0 rcn0VarF = uqs.f(e8b0Var);
                            rcn0 rcn0VarF2 = uqs.f(e8b0Var);
                            if (rcn0VarF2 == null) {
                                a8b0 a8b0VarL2 = vzn1.l((a8b0) e8b0Var);
                                rcn0VarF2 = a8b0VarL2 != null ? uqs.f(a8b0VarL2) : rcn0Var2;
                            }
                            qx81 qx81VarR = d0p1.r(e8b0Var);
                            q8a0Var4 = new q8a0(rcn0VarI, rcn0VarF, ((qx81VarR != null ? d0p1.p(qx81VarR) : rcn0Var2) != null) || (((a8b0) e8b0Var).w0() instanceof zgo0), rcn0VarI != rcn0VarI2, rcn0VarF2 != rcn0VarF);
                        }
                        if (q8a0Var4 != null) {
                            arrayList2.add(q8a0Var4);
                        }
                    }
                    if (i == 0 || !z3) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (i == 0 || !(ve5Var2 instanceof tsi1) || ((tsi1) ve5Var2).X == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    r10 = q8a0Var2.b;
                    iep0Var = q8a0Var2.a;
                    arrayList3 = new ArrayList();
                    for (q8a0 q8a0Var6 : arrayList2) {
                        ve5 ve5Var3 = ve5Var2;
                        if (q8a0Var6.d) {
                            iep0Var5 = null;
                        } else {
                            iep0Var5 = q8a0Var6.a;
                        }
                        if (iep0Var5 != null) {
                            arrayList3.add(iep0Var5);
                        }
                        ve5Var2 = ve5Var3;
                    }
                    ve5Var = ve5Var2;
                    setP1 = o7h.p1(arrayList3);
                    if (z7) {
                        iep0Var2 = null;
                    } else {
                        iep0Var2 = iep0Var;
                    }
                    if (iep0Var2 == iep0Var6) {
                        iep0Var3 = iep0Var6;
                    } else {
                        iep0Var3 = (iep0) nyn1.e0(setP1, iep0Var8, iep0Var7, iep0Var2, z8);
                    }
                    if (iep0Var3 == null) {
                        arrayList6 = new ArrayList();
                        it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            iep0Var4 = ((q8a0) it4.next()).a;
                            if (iep0Var4 != null) {
                                arrayList6.add(iep0Var4);
                            }
                        }
                        setP2 = o7h.p1(arrayList6);
                        if (iep0Var != iep0Var6) {
                            iep0Var6 = (iep0) nyn1.e0(setP2, iep0Var8, iep0Var7, iep0Var, z8);
                        }
                    } else {
                        iep0Var6 = iep0Var3;
                    }
                    if (iep0Var6 != null || z || (z9 && iep0Var6 == iep0Var7)) {
                        iep0Var6 = null;
                    }
                    if (iep0Var6 == null && iep0Var3 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (iep0Var6 != iep0Var8) {
                        z11 = false;
                    } else {
                        if (z7 == z10 || !q8a0Var2.c) {
                            if (!arrayList2.isEmpty()) {
                                it3 = arrayList2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        q8a0Var3 = (q8a0) it3.next();
                                        if (q8a0Var3.d == z10 || !q8a0Var3.c) {
                                        }
                                    }
                                }
                            }
                            z11 = false;
                        }
                        z11 = true;
                    }
                    arrayList4 = new ArrayList();
                    for (q8a0 q8a0Var7 : arrayList2) {
                        if (q8a0Var7.e) {
                            rcn0Var8 = null;
                        } else {
                            rcn0Var8 = q8a0Var7.b;
                        }
                        if (rcn0Var8 != null) {
                            arrayList4.add(rcn0Var8);
                        }
                    }
                    Set setP3 = o7h.p1(arrayList4);
                    if (q8a0Var2.e) {
                        r6 = null;
                    } else {
                        r6 = r10;
                    }
                    rcn0Var3 = rcn0.b;
                    rcn0Var4 = rcn0.a;
                    rcn0Var5 = (rcn0) nyn1.e0(setP3, rcn0Var3, rcn0Var4, r6, z8);
                    if (rcn0Var5 == null) {
                        arrayList5 = new ArrayList();
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            rcn0Var7 = ((q8a0) it2.next()).b;
                            if (rcn0Var7 != null) {
                                arrayList5.add(rcn0Var7);
                            }
                        }
                        rcn0Var6 = (rcn0) nyn1.e0(o7h.p1(arrayList5), rcn0Var3, rcn0Var4, r10, z8);
                    } else {
                        rcn0Var6 = rcn0Var5;
                    }
                    if (rcn0Var6 == null && rcn0Var5 == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    q8a0Var5 = new q8a0(iep0Var6, rcn0Var6, z11, z10, z12);
                } else {
                    rcn0Var = null;
                }
                boolean z14 = a1h1Var == null;
                fg5 fg5Var = z6x.a;
                Iterable annotations2 = e8b0Var2 != 0 ? ((a8b0) e8b0Var2).getAnnotations() : fg5Var;
                if (e8b0Var2 == 0) {
                    rcn0VarD = rcn0Var;
                } else {
                    qx81 qx81VarR2 = d0p1.r(e8b0Var2);
                    if (qx81VarR2 == null && ((dq20VarQ = d0p1.q(e8b0Var2)) == null || (qx81VarR2 = d0p1.Z(dq20VarQ)) == null)) {
                        qx81 qx81VarR3 = d0p1.r(e8b0Var2);
                        qx81VarR3.getClass();
                        qx81VarR2 = qx81VarR3;
                    }
                    h0h1 h0h1VarN0 = d0p1.n0(qx81VarR2);
                    if (h0h1VarN0 != null) {
                        rcn0VarD = d0p1.D(h0h1VarN0);
                    } else {
                        rcn0VarD = rcn0Var;
                    }
                }
                boolean z15 = ((wf5) uqsVar.e) == wf5.TYPE_PARAMETER_BOUNDS;
                if (z14) {
                    if (!z15) {
                        Object obj = o860Var.b;
                    }
                    if (ve5Var2 == null || (annotations = ve5Var2.getAnnotations()) == null) {
                        annotations = fg5Var;
                    }
                    annotations2 = o7h.L0(annotations, annotations2);
                }
                bvl1 bvl1VarC = zf5.c(annotations2, new n5(1, (zf5) ((uw0) o860Var.b).Y, zf5.class, "extractMutability", "extractMutability(Ljava/lang/Object;)Lorg/jetbrains/kotlin/load/java/typeEnhancement/WithMigrationStatus;", 0, (byte) 0));
                zf5 zf5Var = (zf5) ((uw0) o860Var.b).Y;
                da daVar = new da((Object) uqsVar, (Object) faVar2, (byte) 0);
                Iterator it7 = annotations2.iterator();
                rcn0 rcn0Var9 = rcn0Var;
                while (true) {
                    if (!it7.hasNext()) {
                        q8a0VarArr = q8a0VarArr2;
                        rcn0Var2 = rcn0Var;
                        break;
                    }
                    Object next = it7.next();
                    Iterator it8 = it7;
                    rcn0 rcn0VarG = zf5Var.g(next, ((Boolean) daVar.invoke(next)).booleanValue());
                    if (rcn0VarG != null) {
                        q8a0VarArr = q8a0VarArr2;
                        rcn0Var2 = rcn0Var;
                    } else {
                        Object objI = zf5Var.i(next);
                        if (objI == null) {
                            q8a0VarArr = q8a0VarArr2;
                        } else {
                            kl21 kl21VarH = zf5Var.h(next);
                            if (kl21VarH == null) {
                                kl21VarH = ((rha0) zf5Var.a.c).a;
                            }
                            q8a0VarArr = q8a0VarArr2;
                            if (kl21VarH == kl21.a) {
                                rcn0VarG = rcn0Var;
                                rcn0Var2 = rcn0VarG;
                            } else {
                                bvl1 bvl1VarG = zf5Var.g(objI, ((Boolean) daVar.invoke(objI)).booleanValue());
                                if (bvl1VarG != null) {
                                    boolean zA = kl21VarH.a();
                                    rcn0Var2 = rcn0Var;
                                    rcn0VarG = bvl1.a(bvl1VarG, rcn0Var2, zA, 1);
                                }
                            }
                            if (rcn0Var9 == null) {
                                rcn0Var9 = rcn0VarG;
                            } else {
                                boolean z16 = rcn0Var9.b;
                                if (rcn0VarG == null && !rcn0VarG.equals(rcn0Var9) && (!(z6 = rcn0VarG.b) || z16)) {
                                    if (z6 || !z16) {
                                        rcn0Var9 = rcn0Var2;
                                        break;
                                    }
                                    rcn0Var9 = rcn0VarG;
                                }
                            }
                            daVar = daVar;
                            q8a0VarArr2 = q8a0VarArr;
                            it7 = it8;
                            rcn0Var = rcn0Var2;
                        }
                        rcn0Var2 = rcn0Var;
                        rcn0VarG = rcn0Var2;
                        if (rcn0Var9 == null) {
                            rcn0Var9 = rcn0VarG;
                        } else {
                            boolean z17 = rcn0Var9.b;
                            if (rcn0VarG == null) {
                                continue;
                            }
                        }
                        daVar = daVar;
                        q8a0VarArr2 = q8a0VarArr;
                        it7 = it8;
                        rcn0Var = rcn0Var2;
                    }
                    if (rcn0Var9 == null) {
                        rcn0Var9 = rcn0VarG;
                    } else {
                        boolean z18 = rcn0Var9.b;
                        if (rcn0VarG == null) {
                            continue;
                        }
                    }
                    daVar = daVar;
                    q8a0VarArr2 = q8a0VarArr;
                    it7 = it8;
                    rcn0Var = rcn0Var2;
                }
                if (rcn0Var9 != null) {
                    Object obj2 = rcn0Var9.a;
                    q8a0Var = new q8a0((iep0) obj2, bvl1VarC != null ? (rcn0) bvl1VarC.a : rcn0Var2, obj2 == iep0Var8 && rcn0VarD != null, rcn0Var9.b, bvl1VarC != null && bvl1VarC.b);
                } else {
                    rcn0 rcn0VarE2 = rcn0VarD != null ? uqsVar.e(rcn0VarD) : rcn0Var2;
                    rcn0 rcn0VarA = rcn0VarE2 != null ? bvl1.a(rcn0VarE2, iep0Var8, false, 2) : v7a0Var != null ? v7a0Var.a : rcn0Var2;
                    boolean z19 = (rcn0VarE2 != null ? (iep0) rcn0VarE2.a : rcn0Var2) == iep0Var8 || !(rcn0VarD == null || v7a0Var == null || !v7a0Var.c);
                    if (a1h1Var == null || (rcn0VarE = uqsVar.e(a1h1Var)) == null) {
                        rcn0VarE = rcn0Var2;
                    } else if (rcn0VarE.a == iep0Var7) {
                        rcn0VarE = bvl1.a(rcn0VarE, iep0Var6, false, 2);
                    }
                    if (rcn0VarE != null) {
                        Object obj3 = rcn0VarE.a;
                        if (rcn0VarA == null) {
                            rcn0VarA = rcn0VarE;
                        } else {
                            Object obj4 = rcn0VarA.a;
                            boolean z20 = rcn0VarA.b;
                            boolean z21 = rcn0VarE.b;
                            if (!z21 || z20) {
                                if (z21 || !z20) {
                                    iep0 iep0Var9 = (iep0) obj3;
                                    Enum r8 = (Enum) obj4;
                                    if (iep0Var9.compareTo(r8) >= 0 && iep0Var9.compareTo(r8) > 0) {
                                        rcn0VarA = rcn0VarE;
                                    }
                                } else {
                                    rcn0VarA = rcn0VarE;
                                }
                            }
                        }
                    }
                    rcn0 rcn0Var10 = rcn0VarA != null ? (iep0) rcn0VarA.a : rcn0Var2;
                    rcn0 rcn0Var11 = bvl1VarC != null ? (rcn0) bvl1VarC.a : rcn0Var2;
                    if (rcn0VarA != null) {
                        z4 = true;
                        boolean z22 = rcn0VarA.b;
                        if (bvl1VarC == null && bvl1VarC.b == z4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        q8a0Var = new q8a0(rcn0Var10, rcn0Var11, z19, z22, z5);
                    } else {
                        z4 = true;
                    }
                    if (bvl1VarC == null) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    q8a0Var = new q8a0(rcn0Var10, rcn0Var11, z19, z22, z5);
                }
                q8a0Var2 = q8a0Var;
                z7 = q8a0Var2.d;
                arrayList2 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    faVar = (fa) o7h.t0(i, (List) it.next());
                    if (faVar != null) {
                        q8a0Var4 = rcn0Var2;
                    } else {
                        q8a0Var4 = rcn0Var2;
                    }
                    if (q8a0Var4 != null) {
                        arrayList2.add(q8a0Var4);
                    }
                }
                if (i == 0) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (i == 0) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                r10 = q8a0Var2.b;
                iep0Var = q8a0Var2.a;
                arrayList3 = new ArrayList();
                while (r14.hasNext()) {
                    ve5 ve5Var4 = ve5Var2;
                    if (q8a0Var6.d) {
                        iep0Var5 = null;
                    } else {
                        iep0Var5 = q8a0Var6.a;
                    }
                    if (iep0Var5 != null) {
                        arrayList3.add(iep0Var5);
                    }
                    ve5Var2 = ve5Var4;
                }
                ve5Var = ve5Var2;
                setP1 = o7h.p1(arrayList3);
                if (z7) {
                    iep0Var2 = null;
                } else {
                    iep0Var2 = iep0Var;
                }
                if (iep0Var2 == iep0Var6) {
                    iep0Var3 = iep0Var6;
                } else {
                    iep0Var3 = (iep0) nyn1.e0(setP1, iep0Var8, iep0Var7, iep0Var2, z8);
                }
                if (iep0Var3 == null) {
                    arrayList6 = new ArrayList();
                    it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        iep0Var4 = ((q8a0) it4.next()).a;
                        if (iep0Var4 != null) {
                            arrayList6.add(iep0Var4);
                        }
                    }
                    setP2 = o7h.p1(arrayList6);
                    if (iep0Var != iep0Var6) {
                        iep0Var6 = (iep0) nyn1.e0(setP2, iep0Var8, iep0Var7, iep0Var, z8);
                    }
                } else {
                    iep0Var6 = iep0Var3;
                }
                if (iep0Var6 != null) {
                    iep0Var6 = null;
                } else {
                    iep0Var6 = null;
                }
                if (iep0Var6 == null) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (iep0Var6 != iep0Var8) {
                    z11 = false;
                } else if (z7 == z10) {
                    if (!arrayList2.isEmpty()) {
                        it3 = arrayList2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                q8a0Var3 = (q8a0) it3.next();
                                if (q8a0Var3.d == z10) {
                                }
                            }
                        }
                    }
                    z11 = false;
                } else {
                    if (!arrayList2.isEmpty()) {
                        it3 = arrayList2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                q8a0Var3 = (q8a0) it3.next();
                                if (q8a0Var3.d == z10) {
                                }
                            }
                        }
                    }
                    z11 = false;
                }
                arrayList4 = new ArrayList();
                while (r5.hasNext()) {
                    if (q8a0Var7.e) {
                        rcn0Var8 = null;
                    } else {
                        rcn0Var8 = q8a0Var7.b;
                    }
                    if (rcn0Var8 != null) {
                        arrayList4.add(rcn0Var8);
                    }
                }
                Set setP4 = o7h.p1(arrayList4);
                if (q8a0Var2.e) {
                    r6 = null;
                } else {
                    r6 = r10;
                }
                rcn0Var3 = rcn0.b;
                rcn0Var4 = rcn0.a;
                rcn0Var5 = (rcn0) nyn1.e0(setP4, rcn0Var3, rcn0Var4, r6, z8);
                if (rcn0Var5 == null) {
                    arrayList5 = new ArrayList();
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        rcn0Var7 = ((q8a0) it2.next()).b;
                        if (rcn0Var7 != null) {
                            arrayList5.add(rcn0Var7);
                        }
                    }
                    rcn0Var6 = (rcn0) nyn1.e0(o7h.p1(arrayList5), rcn0Var3, rcn0Var4, r10, z8);
                } else {
                    rcn0Var6 = rcn0Var5;
                }
                if (rcn0Var6 == null) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                q8a0Var5 = new q8a0(iep0Var6, rcn0Var6, z11, z10, z12);
            } else {
                ve5Var = ve5Var2;
                o860Var = o860Var;
                z3 = z13;
                arrayList = arrayList7;
                size = size;
                q8a0VarArr = q8a0VarArr2;
            }
            q8a0VarArr[i] = q8a0Var5;
            i++;
            ve5Var2 = ve5Var;
            z2 = z2;
            z13 = z3;
            arrayListP = arrayListP;
            arrayList7 = arrayList;
            o860Var = o860Var;
            q8a0VarArr2 = q8a0VarArr;
            size = size;
        }
        return (a8b0) nhc.y(a8b0Var.w0(), new da((Object) n0h1Var, (Object) q8a0VarArr2, (byte) 1), 0, uqsVar.b).c;
    }

    public a8b0 l(o7a0 o7a0Var, hyc hycVar, boolean z, o860 o860Var, wf5 wf5Var, n0h1 n0h1Var, boolean z2, iu30 iu30Var) {
        uqs uqsVar = new uqs(hycVar, z, o860Var, wf5Var, false);
        a8b0 a8b0Var = (a8b0) iu30Var.invoke(o7a0Var);
        Collection<jyc> collectionL = o7a0Var.l();
        ArrayList arrayList = new ArrayList(q7h.U(collectionL, 10));
        for (jyc jycVar : collectionL) {
            jycVar.getClass();
            arrayList.add((a8b0) iu30Var.invoke(jycVar));
        }
        return k(uqsVar, a8b0Var, arrayList, n0h1Var, z2);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0288  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:81:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [p.hyc] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r24v0, types: [p.sua] */
    /* JADX WARN: Type inference failed for: r6v39 */
    public ArrayList m(o860 o860Var, Collection collection) {
        fg5 annotations;
        a8b0 type;
        gmv0 gmv0Var;
        mmr0 mmr0Var;
        int i;
        List list;
        zdy0 zdy0Var;
        j141 j141Var = j141.g;
        Collection<k9> collection2 = collection;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(q7h.U(collection2, 10));
        for (k9 k9VarS : collection2) {
            if (!(k9VarS instanceof o7a0)) {
                i = i2;
            } else if (k9VarS.getKind() == 2 && k9VarS.w1().l().size() == 1) {
                i = 10;
            } else {
                jfg jfgVarK = lm5.k(k9VarS);
                byte b = 0;
                if (jfgVarK == null) {
                    annotations = k9VarS.getAnnotations();
                } else {
                    hqb0 hqb0Var = jfgVarK instanceof hqb0 ? (hqb0) jfgVarK : null;
                    List list2 = hqb0Var != null ? (List) hqb0Var.X.getValue() : null;
                    List list3 = list2;
                    if (list3 == null || list3.isEmpty()) {
                        annotations = k9VarS.getAnnotations();
                    } else {
                        List list4 = list2;
                        ArrayList arrayList2 = new ArrayList(q7h.U(list4, i2));
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new dqb0(o860Var, (cb11) it.next(), true));
                        }
                        ArrayList arrayListL0 = o7h.L0(k9VarS.getAnnotations(), arrayList2);
                        annotations = arrayListL0.isEmpty() ? rzs0.g : new hg5(arrayListL0, b);
                    }
                }
                o860 o860VarP = ryn1.p(o860Var, annotations);
                ?? r12 = (!(k9VarS instanceof f8a0) || (zdy0Var = ((vdy0) k9VarS).X0) == null || zdy0Var.f) ? k9VarS : zdy0Var;
                rob0 rob0VarL = k9VarS.L();
                wf5 wf5Var = wf5.VALUE_PARAMETER;
                if (rob0VarL != null) {
                    ov30 ov30Var = r12 instanceof ov30 ? (ov30) r12 : null;
                    tsi1 tsi1Var = ov30Var != null ? (tsi1) ov30Var.w(c8a0.g1) : null;
                    type = l((o7a0) k9VarS, tsi1Var, false, tsi1Var != null ? ryn1.p(o860VarP, tsi1Var.getAnnotations()) : o860VarP, wf5Var, null, false, j141.d);
                } else {
                    type = null;
                }
                c8a0 c8a0Var = k9VarS instanceof c8a0 ? (c8a0) k9VarS : null;
                if (c8a0Var != null) {
                    beg begVar = (beg) c8a0Var.k();
                    String strM = h0p1.m(c8a0Var, 3);
                    String str = j8a0.a;
                    heg hegVarG = j8a0.g(kht.g(begVar).a);
                    gmv0Var = (gmv0) fmv0.d.get(cy30.l(hegVarG != null ? tia0.e(hegVarG) : si1.k(begVar, njx0.U0), '.', strM));
                    if (gmv0Var != null) {
                        String str2 = gmv0Var.c;
                        if (str2 != null && !nhc1.Y(str2, "2.", false)) {
                            eg.m("Check failed.");
                            return null;
                        }
                        if (str2 != null) {
                            gmv0Var = gmv0Var.d;
                        }
                    } else {
                        gmv0Var = null;
                    }
                } else {
                    gmv0Var = null;
                }
                if (gmv0Var != null) {
                    gmv0Var.b.size();
                    ((c8a0) k9VarS).F().size();
                }
                boolean z = ((p5) ((oi) ((uw0) o860Var.b).N0).d).invoke(d8a0.a) == kl21.c && (k9VarS instanceof ov30) && u890.j(k9VarS.w(c8a0.h1), Boolean.TRUE);
                List<tsi1> listF = r12.F();
                ArrayList arrayList3 = new ArrayList(q7h.U(listF, i2));
                for (tsi1 tsi1Var2 : listF) {
                    arrayList3.add(l((o7a0) k9VarS, tsi1Var2, false, tsi1Var2 != null ? ryn1.p(o860VarP, tsi1Var2.getAnnotations()) : o860VarP, wf5Var, (gmv0Var == null || (list = gmv0Var.b) == null) ? null : (n0h1) o7h.t0(tsi1Var2.g, list), z, new gqb0(tsi1Var2, (byte) 17)));
                }
                tdy0 tdy0Var = k9VarS instanceof tdy0 ? (tdy0) k9VarS : null;
                o7a0 o7a0Var = (o7a0) k9VarS;
                a8b0 a8b0VarL = l(o7a0Var, r12, true, o860VarP, (tdy0Var == null || !nb51.G(tdy0Var)) ? wf5.METHOD_RETURN_TYPE : wf5.FIELD, gmv0Var != null ? gmv0Var.a : null, false, j141.e);
                a8b0 returnType = k9VarS.getReturnType();
                returnType.getClass();
                if (o1h1.c(returnType, j141Var, null)) {
                    mmr0Var = new mmr0(c680.a, new bdt());
                } else {
                    rob0 rob0VarL2 = k9VarS.L();
                    if (rob0VarL2 != null ? o1h1.c(rob0VarL2.getType(), j141Var, null) : false) {
                        mmr0Var = new mmr0(c680.a, new bdt());
                    } else {
                        List listF2 = k9VarS.F();
                        if (!(listF2 instanceof Collection) || !listF2.isEmpty()) {
                            Iterator it2 = listF2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (o1h1.c(((tsi1) it2.next()).getType(), j141Var, null)) {
                                        mmr0Var = new mmr0(c680.a, new bdt());
                                    }
                                }
                            }
                        }
                        mmr0Var = null;
                    }
                }
                if (type == null && a8b0VarL == null) {
                    if (!arrayList3.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((a8b0) it3.next()) != null) {
                                }
                            } else if (mmr0Var != null) {
                                i = 10;
                            }
                        }
                    } else if (mmr0Var != null) {
                        i = 10;
                    }
                }
                if (type == null) {
                    rob0 rob0VarL3 = k9VarS.L();
                    type = rob0VarL3 != null ? rob0VarL3.getType() : null;
                }
                i = 10;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                int i3 = 0;
                for (Object obj : arrayList3) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    a8b0 type2 = (a8b0) obj;
                    if (type2 == null) {
                        type2 = ((tsi1) k9VarS.F().get(i3)).getType();
                    }
                    arrayList4.add(type2);
                    i3 = i4;
                }
                if (a8b0VarL == null) {
                    a8b0VarL = k9VarS.getReturnType();
                    a8b0VarL.getClass();
                }
                k9VarS = o7a0Var.s(type, arrayList4, a8b0VarL, mmr0Var);
            }
            arrayList.add(k9VarS);
            i2 = i;
        }
        return arrayList;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean z = !zBooleanValue3;
        return new pdm(true, false, false, true, zBooleanValue2, zBooleanValue3, z, z, false, false, zBooleanValue, z, z, 48646);
    }

    public synchronized zwg o() {
        zwg zwgVar;
        zwg zwgVar2;
        try {
            zwgVar = null;
            if (dhn.a.contains(zwg.class)) {
                zwgVar2 = null;
            } else {
                try {
                    zwgVar2 = zwg.g;
                } catch (Throwable th) {
                    dhn.a(zwg.class, th);
                    zwgVar2 = null;
                }
            }
            if (zwgVar2 == null) {
                zwg zwgVar3 = new zwg((byte) 0);
                if (!dhn.a.contains(zwg.class)) {
                    try {
                        zwg.g = zwgVar3;
                    } catch (Throwable th2) {
                        dhn.a(zwg.class, th2);
                    }
                }
            }
            if (!dhn.a.contains(zwg.class)) {
                try {
                    zwgVar = zwg.g;
                } catch (Throwable th3) {
                    dhn.a(zwg.class, th3);
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return zwgVar;
    }

    public void q(Rect rect, View view) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX WARN: Code duplicated, block: B:165:0x027a  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:282:0x047b  */
    /* JADX WARN: Code duplicated, block: B:285:0x0488  */
    /* JADX WARN: Code duplicated, block: B:288:0x0495  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:84:0x012c  */
    public woa0 t(KeyEvent keyEvent) {
        woa0 woa0Var;
        woa0 woa0Var2;
        woa0 woa0Var3;
        int iX = irn1.X(keyEvent);
        woa0 woa0Var4 = null;
        if (iX == 9) {
            long jD = mno1.d(keyEvent.getKeyCode());
            if (toa0.a(jD, toa0.g)) {
                woa0Var = woa0.SELECT_LINE_LEFT;
            } else if (toa0.a(jD, toa0.h)) {
                woa0Var = woa0.SELECT_LINE_RIGHT;
            } else if (toa0.a(jD, toa0.e)) {
                woa0Var = woa0.SELECT_HOME;
            } else if (toa0.a(jD, toa0.f)) {
                woa0Var = woa0.SELECT_END;
            } else {
                woa0Var = null;
            }
        } else if (iX == 1) {
            long jD2 = mno1.d(keyEvent.getKeyCode());
            if (toa0.a(jD2, toa0.g)) {
                woa0Var = woa0.LINE_LEFT;
            } else if (toa0.a(jD2, toa0.h)) {
                woa0Var = woa0.LINE_RIGHT;
            } else if (toa0.a(jD2, toa0.e)) {
                woa0Var = woa0.HOME;
            } else if (toa0.a(jD2, toa0.f)) {
                woa0Var = woa0.END;
            } else if (toa0.a(jD2, toa0.t)) {
                woa0Var = woa0.DELETE_FROM_LINE_START;
            } else {
                woa0Var = null;
            }
        } else {
            woa0Var = null;
        }
        if (woa0Var != null) {
            return woa0Var;
        }
        int iX2 = irn1.X(keyEvent);
        long jD3 = mno1.d(keyEvent.getKeyCode());
        boolean zA = toa0.a(jD3, toa0.t);
        woa0 woa0Var5 = woa0.NEW_LINE;
        woa0 woa0Var6 = woa0.DELETE_PREV_CHAR;
        if (zA) {
            if (iX2 == 0 || iX2 == 8 || iX2 == 12) {
                woa0Var2 = woa0Var6;
            } else if (iX2 == 2 || iX2 == 10) {
                woa0Var2 = woa0.DELETE_PREV_WORD;
            } else {
                woa0Var2 = null;
            }
        } else if ((toa0.a(jD3, toa0.s) || toa0.a(jD3, toa0.F)) && (iX2 == 0 || iX2 == 8 || iX2 == 2 || iX2 == 10)) {
            woa0Var2 = woa0Var5;
        } else {
            woa0Var2 = null;
        }
        if (woa0Var2 != null) {
            return woa0Var2;
        }
        int iX3 = irn1.X(keyEvent);
        woa0 woa0Var7 = woa0.SELECT_LINE_START;
        woa0 woa0Var8 = woa0.SELECT_LINE_END;
        if (iX3 == 10) {
            long jD4 = mno1.d(keyEvent.getKeyCode());
            if (toa0.a(jD4, toa0.g) || toa0.a(jD4, toa0.I)) {
                woa0Var3 = woa0.SELECT_LEFT_WORD;
            } else if (toa0.a(jD4, toa0.h) || toa0.a(jD4, toa0.J)) {
                woa0Var3 = woa0.SELECT_RIGHT_WORD;
            } else if (toa0.a(jD4, toa0.e) || toa0.a(jD4, toa0.G)) {
                woa0Var3 = woa0.SELECT_PREV_PARAGRAPH;
            } else if (toa0.a(jD4, toa0.f) || toa0.a(jD4, toa0.H)) {
                woa0Var3 = woa0.SELECT_NEXT_PARAGRAPH;
            } else {
                woa0Var3 = null;
            }
        } else if (iX3 == 2) {
            long jD5 = mno1.d(keyEvent.getKeyCode());
            if (toa0.a(jD5, toa0.g) || toa0.a(jD5, toa0.I)) {
                woa0Var3 = woa0.LEFT_WORD;
            } else if (toa0.a(jD5, toa0.h) || toa0.a(jD5, toa0.J)) {
                woa0Var3 = woa0.RIGHT_WORD;
            } else if (toa0.a(jD5, toa0.e) || toa0.a(jD5, toa0.G)) {
                woa0Var3 = woa0.PREV_PARAGRAPH;
            } else if (toa0.a(jD5, toa0.f) || toa0.a(jD5, toa0.H)) {
                woa0Var3 = woa0.NEXT_PARAGRAPH;
            } else if (toa0.a(jD5, toa0.l)) {
                woa0Var3 = woa0Var6;
            } else if (toa0.a(jD5, toa0.u)) {
                woa0Var3 = woa0.DELETE_NEXT_WORD;
            } else if (toa0.a(jD5, toa0.C)) {
                woa0Var3 = woa0.DESELECT;
            } else {
                woa0Var3 = null;
            }
        } else if (iX3 == 8) {
            long jD6 = mno1.d(keyEvent.getKeyCode());
            if (toa0.a(jD6, toa0.w) || toa0.a(jD6, toa0.K)) {
                woa0Var3 = woa0Var7;
            } else if (toa0.a(jD6, toa0.x) || toa0.a(jD6, toa0.L)) {
                woa0Var3 = woa0Var8;
            } else {
                woa0Var3 = null;
            }
        } else if (iX3 == 1 && toa0.a(mno1.d(keyEvent.getKeyCode()), toa0.u)) {
            woa0Var3 = woa0.DELETE_TO_LINE_END;
        } else {
            woa0Var3 = null;
        }
        if (woa0Var3 != null) {
            return woa0Var3;
        }
        Object obj = obg1.a.b;
        int iX4 = irn1.X(keyEvent);
        if (grn1.n(iX4, 10)) {
            long jR = ern1.r(keyEvent);
            int i = toa0.P;
            if (toa0.a(jR, qqn1.W())) {
                woa0Var4 = woa0.REDO;
            }
        } else if (grn1.n(iX4, 2)) {
            long jR2 = ern1.r(keyEvent);
            int i2 = toa0.P;
            if (toa0.a(jR2, qqn1.m()) || toa0.a(jR2, qqn1.z()) || toa0.a(jR2, qqn1.J())) {
                woa0Var4 = woa0.COPY;
            } else if (toa0.a(jR2, qqn1.T())) {
                woa0Var4 = woa0.PASTE;
            } else if (toa0.a(jR2, qqn1.U())) {
                woa0Var4 = woa0.CUT;
            } else if (toa0.a(jR2, qqn1.j())) {
                woa0Var4 = woa0.SELECT_ALL;
            } else if (toa0.a(jR2, qqn1.V())) {
                woa0Var4 = woa0.REDO;
            } else if (toa0.a(jR2, qqn1.W())) {
                woa0Var4 = woa0.UNDO;
            }
        } else if (grn1.n(iX4, 8)) {
            long jR3 = ern1.r(keyEvent);
            int i3 = toa0.P;
            if (toa0.a(jR3, qqn1.u()) || toa0.a(jR3, qqn1.F())) {
                woa0Var4 = woa0.SELECT_LEFT_CHAR;
            } else if (toa0.a(jR3, qqn1.v()) || toa0.a(jR3, qqn1.G())) {
                woa0Var4 = woa0.SELECT_RIGHT_CHAR;
            } else if (toa0.a(jR3, qqn1.w()) || toa0.a(jR3, qqn1.H())) {
                woa0Var4 = woa0.SELECT_UP;
            } else if (toa0.a(jR3, qqn1.t()) || toa0.a(jR3, qqn1.E())) {
                woa0Var4 = woa0.SELECT_DOWN;
            } else if (toa0.a(jR3, qqn1.P()) || toa0.a(jR3, qqn1.N())) {
                woa0Var4 = woa0.SELECT_PAGE_UP;
            } else if (toa0.a(jR3, qqn1.O()) || toa0.a(jR3, qqn1.M())) {
                woa0Var4 = woa0.SELECT_PAGE_DOWN;
            } else if (toa0.a(jR3, qqn1.B()) || toa0.a(jR3, qqn1.L())) {
                woa0Var4 = woa0Var7;
            } else if (toa0.a(jR3, qqn1.A()) || toa0.a(jR3, qqn1.K())) {
                woa0Var4 = woa0Var8;
            } else if (toa0.a(jR3, qqn1.z()) || toa0.a(jR3, qqn1.J())) {
                woa0Var4 = woa0.PASTE;
            }
        } else if (grn1.n(iX4, 0)) {
            long jR4 = ern1.r(keyEvent);
            int i4 = toa0.P;
            if (toa0.a(jR4, qqn1.u()) || toa0.a(jR4, qqn1.F())) {
                woa0Var4 = woa0.LEFT_CHAR;
            } else if (toa0.a(jR4, qqn1.v()) || toa0.a(jR4, qqn1.G())) {
                woa0Var4 = woa0.RIGHT_CHAR;
            } else if (toa0.a(jR4, qqn1.w()) || toa0.a(jR4, qqn1.H())) {
                woa0Var4 = woa0.UP;
            } else if (toa0.a(jR4, qqn1.t()) || toa0.a(jR4, qqn1.E())) {
                woa0Var4 = woa0.DOWN;
            } else if (toa0.a(jR4, qqn1.s())) {
                woa0Var4 = woa0.CENTER;
            } else if (toa0.a(jR4, qqn1.P()) || toa0.a(jR4, qqn1.N())) {
                woa0Var4 = woa0.PAGE_UP;
            } else if (toa0.a(jR4, qqn1.O()) || toa0.a(jR4, qqn1.M())) {
                woa0Var4 = woa0.PAGE_DOWN;
            } else if (toa0.a(jR4, qqn1.B()) || toa0.a(jR4, qqn1.L())) {
                woa0Var4 = woa0.LINE_START;
            } else if (toa0.a(jR4, qqn1.A()) || toa0.a(jR4, qqn1.K())) {
                woa0Var4 = woa0.LINE_END;
            } else if (toa0.a(jR4, qqn1.x()) || toa0.a(jR4, qqn1.I())) {
                woa0Var4 = woa0Var5;
            } else if (toa0.a(jR4, qqn1.l())) {
                woa0Var4 = woa0Var6;
            } else if (toa0.a(jR4, qqn1.r())) {
                woa0Var4 = woa0.DELETE_NEXT_CHAR;
            } else if (toa0.a(jR4, qqn1.Q())) {
                woa0Var4 = woa0.PASTE;
            } else if (toa0.a(jR4, qqn1.q())) {
                woa0Var4 = woa0.CUT;
            } else if (toa0.a(jR4, qqn1.p())) {
                woa0Var4 = woa0.COPY;
            } else if (toa0.a(jR4, qqn1.R())) {
                woa0Var4 = woa0.TAB;
            }
        }
        return woa0Var4;
    }

    public String toString() {
        switch (this.a) {
            case 26:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    public void y(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFJ = j(tabLayout, view);
        RectF rectFJ2 = j(tabLayout, view2);
        int i = (int) rectFJ.left;
        int i2 = (int) rectFJ2.left;
        LinearInterpolator linearInterpolator = je5.a;
        int iRound = Math.round((i2 - i) * f) + i;
        int i3 = drawable.getBounds().top;
        int i4 = (int) rectFJ.right;
        drawable.setBounds(iRound, i3, Math.round(f * (((int) rectFJ2.right) - i4)) + i4, drawable.getBounds().bottom);
    }

    public ArrayList z(List list) {
        zuc0 zuc0Var;
        Map map;
        String str;
        ba80 ba80VarU1 = o7h.u1(list);
        ArrayList arrayList = new ArrayList();
        ca80 it = ba80VarU1.iterator();
        while (true) {
            ca80 ca80Var = it;
            if (!((Iterator) ca80Var.c).hasNext()) {
                return arrayList;
            }
            aa80 aa80Var = (aa80) ca80Var.next();
            int i = aa80Var.a;
            j7e0 j7e0Var = (l7e0) aa80Var.b;
            kp51 kp51Var = null;
            j7e0 j7e0Var2 = j7e0Var instanceof j7e0 ? j7e0Var : null;
            if (j7e0Var2 != null && (zuc0Var = j7e0Var2.a) != null && (map = zuc0Var.g) != null && (str = (String) map.get("workout.segment.id")) != null) {
                kp51Var = new kp51(i, str, ytw0.f(map));
            }
            if (kp51Var != null) {
                arrayList.add(kp51Var);
            }
        }
    }

    public /* synthetic */ sua(byte b) {
        this.a = b;
    }

    public void a() {
    }

    public void f() {
    }

    public long b(long j) {
        return j;
    }

    public void h(long j, String str) {
    }

    public void x(ifv0 ifv0Var, int i, int i2) {
    }
}
