package p;

import android.graphics.Color;
import android.view.ViewGroup;
import com.spotify.eventcardinfoservice.v1.EventCardInfoResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class afm0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afm0(int i, byte b) {
        super(2);
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        goj0 goj0VarA;
        a7q0 a7q0Var;
        String str;
        String str2;
        mq70 mq70Var;
        up70 up70VarA;
        Object obj3;
        Object obj4;
        t3a t3aVar;
        byte b = this.a;
        Set setSingleton = w7x.a;
        int i = 3;
        int i2 = 0;
        objArr = 0;
        Object[] objArr = 0;
        objArr = 0;
        Object[] objArr2 = 0;
        numValueOf = null;
        numValueOf = null;
        Integer numValueOf = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                bfm0.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                bfm0.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                bfm0.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                a7q0 a7q0Var2 = ((vjm0) obj2).a;
                Long l = a7q0Var2 != null ? a7q0Var2.b : null;
                return new zjm0(l != null ? xgc.p(l.longValue(), new Locale(upn1.m())) : null);
            case 4:
                hoj0 hoj0VarC = ((ioj0) obj2).c(a7q0.class, ((yjm0) obj).a);
                Long l2 = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (a7q0Var = (a7q0) goj0VarA.a) == null) ? null : a7q0Var.b;
                return new zjm0(l2 != null ? xgc.p(l2.longValue(), new Locale(upn1.m())) : null);
            case 5:
                gqm0 gqm0Var = (gqm0) obj;
                List list = (List) u890.k((k1r) obj2, (d0r) null, (n4r) null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                List list2 = gqm0Var.a;
                List<String> list3 = list2;
                for (Object obj5 : list3) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str3 = (String) obj5;
                    int i4 = i2 * 2;
                    int i5 = i4 + 1;
                    if (i4 < list.size() && (obj4 = list.get(i4)) != null) {
                        linkedHashMap.put(str3, (jo70) obj4);
                    }
                    if (i5 < list.size() && (obj3 = list.get(i5)) != null) {
                        linkedHashMap2.put(str3, (xkk1) obj3);
                    }
                    i2 = i3;
                }
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                for (String str4 : list3) {
                    jo70 jo70Var = (jo70) linkedHashMap.get(str4);
                    xkk1 xkk1Var = (xkk1) linkedHashMap2.get(str4);
                    if (jo70Var == null || (str = jo70Var.a) == null) {
                        str = "";
                    }
                    if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null || (str2 = up70VarA.a.a) == null) {
                        str2 = "";
                    }
                    arrayList.add(new cqm0(str4, str, str2));
                }
                return new hqm0(list2, arrayList, gqm0Var.b);
            case 6:
                ((Number) obj2).intValue();
                crm0.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                u7n0.j((b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                rwq0.j((b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                cob1 cob1Var = (cob1) obj2;
                String str5 = ((jo70) obj).a;
                int i6 = cob1Var == null ? -1 : x2n0.a[cob1Var.ordinal()];
                if (i6 == -1 || i6 == 1) {
                    i = 1;
                } else if (i6 == 2) {
                    i = 2;
                } else if (i6 != 3) {
                    eg.o();
                    return null;
                }
                return new w2n0(str5, i);
            case 10:
                jo70 jo70Var2 = (jo70) obj;
                cob1 cob1Var2 = (cob1) obj2;
                String str6 = jo70Var2.a;
                int i7 = cob1Var2 == null ? -1 : r4n0.a[cob1Var2.ordinal()];
                if (i7 == -1 || i7 == 1) {
                    i = 1;
                } else if (i7 == 2) {
                    i = 2;
                } else if (i7 != 3) {
                    eg.o();
                    return null;
                }
                io70 io70Var = jo70Var2.e;
                String str7 = io70Var != null ? io70Var.a : null;
                return new q4n0(i, str6, str7 != null ? str7 : "");
            case 11:
                ((Number) obj2).intValue();
                ha71.f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                y1a1.d((b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                z1a1.d((b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                vpb1.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                return f6o1.A(new kpg0(new nu((byte) 21), sbn0.P0), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 16:
                l5o0 l5o0Var = (l5o0) obj2;
                if (l5o0Var instanceof k5o0) {
                    k5o0 k5o0Var = (k5o0) l5o0Var;
                    t3aVar = new t3a(48, k5o0Var.a, k5o0Var.b, (String) null, true, false);
                } else {
                    if (!(l5o0Var instanceof j5o0)) {
                        eg.o();
                        return null;
                    }
                    j5o0 j5o0Var = (j5o0) l5o0Var;
                    t3aVar = new t3a(32, j5o0Var.a, j5o0Var.b, j5o0Var.e, j5o0Var.c, j5o0Var.d);
                }
                return t3aVar;
            case 17:
                ((Number) obj2).intValue();
                iho1.g((b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                oho1.k((b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                nko1.l((b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                nko1.m((b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                nko1.o((b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                nko1.q((b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                d1p0 d1p0Var = ((f1p0) obj).b;
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj2).track().h();
                if (contextTrack != null && !s3o1.v(contextTrack, false)) {
                    try {
                        numValueOf = Integer.valueOf(vno1.j(0.3f, Color.parseColor(l4o1.y(contextTrack))));
                        break;
                    } catch (Exception unused) {
                    }
                }
                return new g1p0(d1p0Var, numValueOf);
            case 24:
                ((Number) obj2).intValue();
                jap1.g((b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var2, 2131963392), uyn1.z(0.0f, 8.0f, 1, u291.f(nim0.a, 1.0f).then(new tq60(een.Q0))), (lee1) null, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2028);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 26:
                k900 k900Var = (k900) obj;
                q9q0 q9q0Var = (q9q0) obj2;
                EventCardInfoResponse eventCardInfoResponse = k900Var.a;
                if (q9q0Var.a == null && eventCardInfoResponse.p() == 1) {
                    objArr2 = 1;
                }
                q9q0 q9q0VarA = q9q0.a(q9q0Var, k900Var, (Boolean) null, 2);
                if (objArr2 != 0) {
                    setSingleton = Collections.singleton(new w9q0(eventCardInfoResponse.t().p()));
                }
                return Next.i(q9q0VarA, setSingleton);
            case 27:
                k900 k900Var2 = (k900) obj;
                q9q0 q9q0Var2 = (q9q0) obj2;
                EventCardInfoResponse eventCardInfoResponse2 = k900Var2.a;
                if (q9q0Var2.a == null && eventCardInfoResponse2.p() == 1) {
                    objArr = 1;
                }
                q9q0 q9q0VarA2 = q9q0.a(q9q0Var2, k900Var2, (Boolean) null, 2);
                if (objArr != 0) {
                    setSingleton = Collections.singleton(new w9q0(eventCardInfoResponse2.t().p()));
                }
                return First.c(q9q0VarA2, setSingleton);
            case 28:
                ((Number) obj2).intValue();
                w2g0.b((b0k) obj, czo1.p(7));
                return rih1Var;
            default:
                id41 id41Var = (id41) obj;
                mwq0 mwq0Var = (mwq0) obj2;
                bw91 bw91Var = mwq0Var.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(bw91Var, 10));
                ek60 ek60VarListIterator = bw91Var.listIterator();
                while (true) {
                    ek60 ek60Var = ek60VarListIterator;
                    if (ek60Var.hasNext()) {
                        arrayList2.add(((kwq0) ek60Var.next()).a);
                    } else {
                        df41 df41Var = j2h1.b;
                        ArrayList arrayList3 = new ArrayList(q7h.U(bw91Var, 10));
                        ek60 ek60VarListIterator2 = bw91Var.listIterator();
                        while (true) {
                            ek60 ek60Var2 = ek60VarListIterator2;
                            if (!ek60Var2.hasNext()) {
                                return sqg0.J(new mmr0[]{new mmr0("ids", arrayList2), new mmr0("targets", arrayList3), new mmr0("overlayMode", mwq0Var.a)});
                            }
                            arrayList3.add(df41Var.a.invoke(id41Var, ((kwq0) ek60Var2.next()).b));
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afm0(byte b, int i, boolean z) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afm0(Object obj, byte b) {
        super(2);
        this.a = b;
    }
}
