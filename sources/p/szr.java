package p;

import android.graphics.Color;
import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class szr extends hab0 implements vu30 {
    public static final szr N0;
    public static final szr O0;
    public static final szr P0;
    public static final szr Q0;
    public static final szr R0;
    public static final szr S0;
    public static final szr T0;
    public static final szr U0;
    public static final szr V0;
    public static final szr W0;
    public static final szr X;
    public static final szr X0;
    public static final szr Y;
    public static final szr Y0;
    public static final szr Z;
    public static final szr Z0;
    public static final szr a1;
    public static final szr b;
    public static final szr b1;
    public static final szr c;
    public static final szr c1;
    public static final szr d;
    public static final szr d1;
    public static final szr e;
    public static final szr e1;
    public static final szr f;
    public static final szr g;
    public static final szr h;
    public static final szr i;
    public static final szr t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new szr(i2, (byte) 0);
        c = new szr(i2, (byte) 1);
        d = new szr(i2, (byte) 2);
        e = new szr(i2, (byte) 3);
        f = new szr(i2, (byte) 4);
        g = new szr(i2, (byte) 5);
        h = new szr(i2, (byte) 6);
        i = new szr(i2, (byte) 7);
        t = new szr(i2, (byte) 8);
        X = new szr(i2, (byte) 9);
        Y = new szr(i2, (byte) 10);
        Z = new szr(i2, (byte) 11);
        N0 = new szr(i2, (byte) 12);
        O0 = new szr(i2, (byte) 13);
        P0 = new szr(i2, (byte) 14);
        Q0 = new szr(i2, (byte) 15);
        R0 = new szr(i2, (byte) 16);
        S0 = new szr(i2, (byte) 17);
        T0 = new szr(i2, (byte) 18);
        U0 = new szr(i2, (byte) 19);
        V0 = new szr(i2, (byte) 20);
        W0 = new szr(i2, (byte) 21);
        X0 = new szr(i2, (byte) 22);
        Y0 = new szr(i2, (byte) 23);
        Z0 = new szr(i2, (byte) 24);
        a1 = new szr(i2, (byte) 25);
        b1 = new szr(i2, (byte) 26);
        c1 = new szr(i2, (byte) 27);
        d1 = new szr(i2, (byte) 28);
        e1 = new szr(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ szr(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        cob1 cob1Var;
        YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoE;
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        gx51 gx51Var;
        gz51 gz51Var;
        String str2;
        pp70 pp70Var;
        mq70 mq70Var2;
        List list;
        up70 up70Var;
        String str3;
        int i2 = 3;
        String str4 = "";
        String name = null;
        switch (this.a) {
            case 0:
                v130 v130Var = (v130) obj;
                String str5 = (k1r) obj2;
                bpb1 bpb1Var = w130.a;
                if (!(v130Var.c instanceof t130)) {
                    return v130Var;
                }
                name = str5 instanceof i1r ? (i1r) str5 : null;
                if (name == null || (cob1Var = (cob1) ((i1r) name).a) == null) {
                    cob1Var = cob1.a;
                }
                return new v130(v130Var.a, v130Var.b, new t130(cob1Var));
            case 1:
                return new d960(((c960) obj).a, (b960) obj2);
            case 2:
                ifj0 ifj0Var = (ifj0) obj;
                return Next.h(jfj0.a((jfj0) obj2, ifj0Var.a, ifj0Var.b, (Set) null, 12));
            case 3:
                ifj0 ifj0Var2 = (ifj0) obj;
                return First.b(jfj0.a((jfj0) obj2, ifj0Var2.a, ifj0Var2.b, (Set) null, 12));
            case 4:
                thj0 thj0Var = (thj0) obj;
                uhj0 uhj0VarA = uhj0.a((uhj0) obj2, thj0Var.a, thj0Var.b, (String) null, false, false, (yhj0) null, false, (shj0) null, (Bundle) null, 508);
                uhj0 uhj0VarA2 = uhj0.a(uhj0VarA, (MessageResponseToken) null, (iwq) null, (String) null, true, false, (yhj0) null, false, (shj0) null, (Bundle) null, 503);
                xj61 xj61Var = new xj61();
                MessageResponseToken messageResponseToken = uhj0VarA.a;
                if (messageResponseToken == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                xj61Var.add(new xgj0(messageResponseToken));
                if (!(uhj0VarA.f instanceof vhj0)) {
                    String str6 = uhj0VarA.c;
                    if (str6 == null) {
                        iwq iwqVar = uhj0VarA.b;
                        if (iwqVar == null) {
                            eg.m("Required value was null.");
                            return null;
                        }
                        str6 = iwqVar.a;
                    }
                    xj61Var.add(new ygj0(str6));
                    xj61Var.add(zgj0.c);
                }
                return First.c(uhj0VarA2, cwl1.j(xj61Var));
            case 5:
                yas yasVar = (yas) obj2;
                List list2 = ((eom0) obj).a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    bzu0 bzu0VarC = oxu0.a.c((String) obj3);
                    if ((bzu0VarC instanceof bzu0 ? bzu0VarC : null) != null) {
                        arrayList.add(obj3);
                    }
                }
                h290 h290Var = yasVar.b;
                ArrayList<YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity> arrayList2 = new ArrayList();
                for (Object obj4 : h290Var) {
                    if (!arrayList.contains(((YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) obj4).e().getUri())) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                for (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity : arrayList2) {
                    arrayList3.add(new fom0(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getUri(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getName()));
                }
                return new gom0(arrayList3, yasVar.a);
            case 6:
                ((Number) obj).intValue();
                return ((fom0) obj2).a;
            case 7:
                yom0 yom0Var = (yom0) obj;
                bbs bbsVar = (bbs) obj2;
                f130 f130Var = bbsVar.a;
                i130 i130Var = (g130) o7h.C0(f130Var.a);
                if (i130Var == null) {
                    i130Var = h130.a;
                }
                List list3 = f130Var.a;
                YourLibraryResponse yourLibraryResponse = bbsVar.b;
                if (yourLibraryResponse.p().length() > 0) {
                    return new zom0(i2);
                }
                List list4 = yom0Var.a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list4) {
                    bzu0 bzu0VarC2 = oxu0.a.c((String) obj5);
                    if ((bzu0VarC2 instanceof bzu0 ? bzu0VarC2 : null) != null) {
                        arrayList4.add(obj5);
                    }
                }
                Set setP1 = o7h.p1(arrayList4);
                h290 h290VarN = yourLibraryResponse.n();
                ArrayList<YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity> arrayList5 = new ArrayList();
                for (Object obj6 : h290VarN) {
                    YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2 = (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) obj6;
                    if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2.C() && !setP1.contains(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2.e().getUri())) {
                        arrayList5.add(obj6);
                    }
                }
                ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                for (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3 : arrayList5) {
                    arrayList6.add(new nom0(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.e().getUri(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.e().getName(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.u().o() > 0));
                }
                boolean z = !list3.isEmpty();
                g130 g130Var = i130Var instanceof g130 ? (g130) i130Var : null;
                return new zom0(z, g130Var != null ? g130Var.b : null, new oom0(arrayList6, bbsVar.c, !list3.isEmpty()));
            case 8:
                ((Number) obj).intValue();
                return ((nom0) obj2).a;
            case 9:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(-112730998);
                qim0 qim0VarR = u291.r(nim0.a, 64.0f);
                x340Var.r(false);
                return qim0VarR;
            case 10:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(621140738);
                fwx fwxVarE = hso1.E(2131232011, u7h.f, false, u7h.j, x340Var2, 0, 4);
                x340Var2.r(false);
                return fwxVarE;
            case 11:
                nc21 nc21Var = (nc21) obj;
                YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity4 = (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) o7h.s0(((YourLibraryDecorateResponse) obj2).o());
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity4 != null && (yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoE = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity4.e()) != null) {
                    name = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoE.getName();
                }
                return new oc21(nc21Var.a, name != null ? name : "");
            case 12:
                return (lls) obj2;
            case 13:
                xkk1 xkk1Var = (xkk1) obj2;
                String str7 = ((jo70) obj).a;
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null && (str = up70VarA.a.a) != null && !ihc1.y0(str)) {
                    name = str;
                }
                return new nls(str7, name);
            case 14:
                List list5 = (List) obj2;
                return new fms(((ems) obj).a, list5, list5.size() > 3);
            case 15:
                String str8 = (k1r) obj2;
                name = str8 instanceof i1r ? (i1r) str8 : null;
                return (name == null || (gx51Var = (gx51) ((i1r) name).a) == null) ? gx51.d : gx51Var;
            case 16:
                String str9 = (k1r) obj2;
                name = str9 instanceof i1r ? (i1r) str9 : null;
                return (name == null || (gz51Var = (gz51) ((i1r) name).a) == null) ? gz51.c : gz51Var;
            case 17:
                ((Number) obj).intValue();
                return ((qpq0) obj2).a.name();
            case 18:
                return (rw91) obj2;
            case 19:
                stk1 stk1Var = (stk1) obj;
                ttk1 ttk1Var = (ttk1) obj2;
                return new ttk1(ttk1Var.a, ttk1Var.b, ttk1Var.c, ttk1Var.d, stk1Var.g == null, stk1Var.i);
            case 20:
                return new b0t((f7l1) obj, (bbl1) obj2);
            case 21:
                mmr0 mmr0Var = (mmr0) obj2;
                return new exm1((List) mmr0Var.a, ((Boolean) mmr0Var.b).booleanValue());
            case 22:
                return Next.j();
            case 23:
                get getVar = (get) obj2;
                return new iet(new ydt(getVar.a, false, Integer.valueOf(((het) obj).c)), getVar.b);
            case 24:
                return new k3h1(((y8e) obj).d);
            case 25:
                return new k3h1(((q9e) obj).c);
            case 26:
                elt eltVar = (elt) obj;
                return new flt(eltVar.a, eltVar.b, (String) u890.k((k1r) obj2, (d0r) null, (n4r) null));
            case 27:
                klt kltVar = (klt) obj;
                plt pltVar = kltVar.g;
                jlt jltVar = (jlt) u890.k((k1r) obj2, (d0r) null, (n4r) null);
                String str10 = kltVar.e;
                if (ihc1.y0(str10)) {
                    str10 = jltVar.c;
                }
                String str11 = str10;
                String str12 = jltVar.a;
                if (ihc1.y0(str12)) {
                    str12 = kltVar.b;
                }
                String str13 = str12;
                boolean z2 = str11.length() > 0;
                bpb1 bpb1Var2 = pltVar.a;
                olt oltVar = (olt) bpb1Var2.getValue();
                String str14 = oltVar.a;
                boolean z3 = oltVar.b;
                if (str14.equals(str13) && z3 == z2) {
                    str2 = str13;
                } else {
                    str2 = str13;
                    bpb1Var2.m((Object) null, olt.a(oltVar, str2, z2, z3 == z2 ? oltVar.c : false, (Integer) null, (Integer) null, 24));
                }
                String str15 = jltVar.b;
                if (ihc1.y0(str15)) {
                    str15 = kltVar.c;
                }
                String str16 = str15;
                afx afxVar = jltVar.d;
                if (afxVar != null) {
                    name = new u7h(afxVar.a.c);
                } else {
                    String str17 = kltVar.d;
                    if (str17 != null) {
                        if (str17.length() <= 0) {
                            str17 = null;
                        }
                        if (str17 != null) {
                            name = new u7h(z4p1.e(Color.parseColor(str17)));
                        }
                    }
                }
                return new llt(str2, str16, str11, name, kltVar.f, pltVar, kltVar.h);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var2 = (xkk1) obj2;
                String str18 = jo70Var != null ? jo70Var.a : null;
                if (str18 == null) {
                    str18 = "";
                }
                String str19 = jo70Var != null ? jo70Var.c : null;
                if (str19 == null) {
                    str19 = "";
                }
                if (xkk1Var2 != null && (mq70Var2 = xkk1Var2.b) != null && (list = mq70Var2.a) != null && (up70Var = (up70) o7h.s0(list)) != null && (str3 = up70Var.a.a) != null) {
                    str4 = str3;
                }
                if (xkk1Var2 != null && (pp70Var = xkk1Var2.d) != null) {
                    name = pp70Var.b;
                }
                return new jlt(str18, str19, str4, name);
            default:
                return new k3h1(((d360) obj).f);
        }
    }
}
