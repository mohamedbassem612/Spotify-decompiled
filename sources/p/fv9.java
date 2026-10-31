package p;

import android.content.Context;
import com.google.protobuf.h;
import com.spotify.pam.v2.Account;
import com.spotify.pam.v2.AccountFlags;
import com.spotify.pam.v2.Action;
import com.spotify.pam.v2.ActionTypeMap;
import com.spotify.pam.v2.AstroOn;
import com.spotify.pam.v2.Benefit;
import com.spotify.pam.v2.GetAvailablePlansViewRequest;
import com.spotify.pam.v2.GetAvailablePlansViewResponse;
import com.spotify.pam.v2.GetPlanOverviewViewRequest;
import com.spotify.pam.v2.GetPlanOverviewViewResponse;
import com.spotify.pam.v2.Member;
import com.spotify.pam.v2.MembershipVerification;
import com.spotify.pam.v2.Plan;
import com.spotify.pam.v2.PlanCard;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fv9 {
    public final enr0 a;
    public final enr0 b;
    public final wpv0 c;

    public /* synthetic */ fv9(enr0 enr0Var, enr0 enr0Var2, dma1 dma1Var, wpv0 wpv0Var) {
        this.a = enr0Var;
        this.b = enr0Var2;
        this.c = wpv0Var;
    }

    public static String a(long j) {
        return new SimpleDateFormat(Pattern.compile("\\by{1,2}\\b").matcher(((SimpleDateFormat) DateFormat.getDateInstance(3)).toPattern()).replaceAll("yyyy"), Locale.getDefault()).format(new Date(j));
    }

    public static c10 e(Action action) {
        String title = action.getTitle();
        String str = title == null ? "" : title;
        String subtitle = action.getSubtitle();
        String str2 = subtitle == null ? "" : subtitle;
        String uri = action.getUri();
        String str3 = uri == null ? "" : uri;
        String note = action.getNote();
        return new c10(str, 97, str2, note == null ? "" : note, false, str3);
    }

    public static t80 f(s80 s80Var) {
        switch (s80Var) {
            case CANCEL_FLOW:
                return t80.a;
            case AVAILABLE_PLANS:
                return t80.b;
            case INVITE_USER:
                return t80.c;
            case EDIT_ADDRESS:
                return t80.d;
            case PREPAID_TOPUP:
                return t80.e;
            case RENEW_SUBSCRIPTION:
                return t80.f;
            case CHANGE_PIN:
                return t80.h;
            case INVITE_HELP:
                return t80.i;
            case AUDIOBOOK_ENTRY:
                return t80.t;
            case INVITE_OR_REMOVE_SUBACCOUNT:
                return t80.X;
            case ADD_SUBACCOUNT:
                return t80.Y;
            case REMOVE_SUBACCOUNT:
                return t80.Z;
            case INVITE_SUBACCOUNT:
                return t80.N0;
            case ASTRO_GET_DETAILS:
            case ASTRO_ENROLL:
            case ASTRO_REQUEST:
            default:
                return t80.g;
            case ASTRO_MANAGE:
                return t80.O0;
            case REMOVE_EXPIRING_ACCOUNT:
                return t80.P0;
            case MULTI_USER_PLAN_VERIFICATION:
                return t80.Q0;
            case PARENTAL_CONTROLS:
                return t80.R0;
        }
    }

    public static gji0 g(Member member) {
        int i;
        int iOrdinal = member.s().ordinal();
        int i2 = 1;
        if (iOrdinal == 0) {
            i = i2;
        } else {
            if (iOrdinal != 1) {
                i2 = 3;
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        i2 = 4;
                    }
                }
                i = i2;
            }
            i = 2;
        }
        boolean zQ = member.q();
        String name = member.getName();
        String str = name == null ? "" : name;
        String description = member.getDescription();
        String str2 = description == null ? "" : description;
        String strP = member.p();
        String str3 = strP == null ? "" : strP;
        String strU = member.u();
        String str4 = strU == null ? "" : strU;
        String strR = member.r();
        String str5 = strR == null ? "" : strR;
        String childId = member.getChildId();
        String str6 = childId == null ? "" : childId;
        String strO = member.o();
        String strN = member.n();
        String str7 = strN == null ? "" : strN;
        String strT = member.t();
        return new gji0(zQ, str, str2, str3, i, str4, str5, str6, strO, str7, strT == null ? "" : strT);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object b(boolean z, onm onmVar) {
        ev9 ev9Var;
        GetAvailablePlansViewResponse getAvailablePlansViewResponse;
        int iG;
        boolean z2 = z;
        if (onmVar instanceof ev9) {
            ev9Var = (ev9) onmVar;
            int i = ev9Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ev9Var.d = i - Integer.MIN_VALUE;
            } else {
                ev9Var = new ev9(this, onmVar);
            }
        } else {
            ev9Var = new ev9(this, onmVar);
        }
        Object obj = ev9Var.b;
        int i2 = ev9Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            d9n d9nVar = d9n.a;
            if (z2) {
                enr0.a.getClass();
                fl40 fl40VarN = GetAvailablePlansViewRequest.n();
                fl40VarN.n();
                h hVarBuild = fl40VarN.build();
                hVarBuild.getClass();
                ev9Var.a = z2;
                ev9Var.d = 1;
                Object objQ = this.b.q((GetAvailablePlansViewRequest) hVarBuild, ev9Var);
                if (objQ != d9nVar) {
                    obj = objQ;
                    getAvailablePlansViewResponse = (GetAvailablePlansViewResponse) obj;
                }
            } else {
                enr0.a.getClass();
                fl40 fl40VarN2 = GetAvailablePlansViewRequest.n();
                fl40VarN2.n();
                h hVarBuild2 = fl40VarN2.build();
                hVarBuild2.getClass();
                ev9Var.a = z2;
                ev9Var.d = 2;
                Object objQ2 = this.a.q((GetAvailablePlansViewRequest) hVarBuild2, ev9Var);
                if (objQ2 != d9nVar) {
                    obj = objQ2;
                    getAvailablePlansViewResponse = (GetAvailablePlansViewResponse) obj;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            z2 = ev9Var.a;
            hm5.M(obj);
            getAvailablePlansViewResponse = (GetAvailablePlansViewResponse) obj;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = ev9Var.a;
            hm5.M(obj);
            getAvailablePlansViewResponse = (GetAvailablePlansViewResponse) obj;
        }
        boolean z3 = z2;
        h290<Plan> h290VarQ = getAvailablePlansViewResponse.q();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
        for (Plan plan : h290VarQ) {
            plan.getClass();
            String planName = this.c.b.I() ? plan.getPlanName() : plan.C();
            planName.getClass();
            String strP = plan.p();
            String strW = plan.w();
            String strS = plan.s();
            cqs0 cqs0Var = huj.a;
            try {
                if (strS.length() > 0) {
                    strS = ((Object) String.valueOf(strS.charAt(0)).toUpperCase(Locale.ROOT)) + strS.substring(1);
                }
                iG = rjx.G(strS);
            } catch (IllegalArgumentException unused) {
                iG = 7;
            }
            arrayList.add(new s2c1(planName, strW, iG, plan.x(), mqo1.A(plan.o()), plan.t(), plan.u(), plan.y() != dct0.PLAN_TIER_YOPLAIT, plan.n(), (String) null, (String) null, (c380) null, false, strP, 8192));
        }
        c380 c380VarA = mqo1.A(arrayList);
        h290<PlanCard> h290VarP = getAvailablePlansViewResponse.p();
        ArrayList arrayList2 = new ArrayList(q7h.U(h290VarP, 10));
        for (PlanCard planCard : h290VarP) {
            planCard.getClass();
            arrayList2.add(new p7t0(planCard.z(), planCard.n(), planCard.x(), huj.e(planCard.y()), planCard.q(), planCard.r(), planCard.s(), mqo1.A(planCard.o()), planCard.t(), planCard.u(), planCard.v(), planCard.w(), planCard.p()));
        }
        c380 c380VarA2 = mqo1.A(arrayList2);
        h290<AstroOn> h290VarN = getAvailablePlansViewResponse.n();
        ArrayList arrayList3 = new ArrayList(q7h.U(h290VarN, 10));
        for (AstroOn astroOn : h290VarN) {
            astroOn.getClass();
            String title = astroOn.getTitle();
            String strS2 = astroOn.s();
            String strR = astroOn.r();
            c380 c380VarA3 = mqo1.A(z6x.a);
            String description = astroOn.getDescription();
            boolean zQ = astroOn.q();
            h290 h290VarN2 = astroOn.n();
            ArrayList arrayList4 = new ArrayList(q7h.U(h290VarN2, 10));
            Iterator it = h290VarN2.iterator();
            while (it.hasNext()) {
                arrayList4.add((ActionTypeMap) it.next());
            }
            arrayList3.add(new s2c1(title, strS2, 0, strR, c380VarA3, false, false, true, "", astroOn.p(), description, mqo1.A(arrayList4), zQ, (String) null, 16516));
        }
        return new aa9(c380VarA, mqo1.A(arrayList3), c380VarA2, getAvailablePlansViewResponse.getTitle(), mqo1.A(getAvailablePlansViewResponse.r()), z3, getAvailablePlansViewResponse.o());
    }

    /* JADX WARN: Code duplicated, block: B:131:0x025a  */
    /* JADX WARN: Code duplicated, block: B:74:0x013a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0153  */
    public Object c(boolean z, onm onmVar) {
        nv9 nv9Var;
        boolean z2;
        GetPlanOverviewViewResponse getPlanOverviewViewResponse;
        int i;
        int i2;
        String strC;
        int i3;
        int i4;
        int i5;
        kvm0 kvm0Var;
        List listL1;
        String str;
        oh4 oh4Var = this.c.b;
        if (onmVar instanceof nv9) {
            nv9Var = (nv9) onmVar;
            int i6 = nv9Var.d;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                nv9Var.d = i6 - Integer.MIN_VALUE;
            } else {
                nv9Var = new nv9(this, onmVar);
            }
        } else {
            nv9Var = new nv9(this, onmVar);
        }
        Object objC = nv9Var.b;
        int i7 = nv9Var.d;
        if (i7 == 0) {
            hm5.M(objC);
            dnr0 dnr0Var = enr0.a;
            boolean zU = oh4Var.u();
            dnr0Var.getClass();
            to40 to40VarN = GetPlanOverviewViewRequest.n();
            to40VarN.n(zU);
            to40VarN.q();
            h hVarBuild = to40VarN.build();
            hVarBuild.getClass();
            GetPlanOverviewViewRequest getPlanOverviewViewRequest = (GetPlanOverviewViewRequest) hVarBuild;
            d9n d9nVar = d9n.a;
            if (z) {
                nv9Var.a = z;
                nv9Var.d = 1;
                objC = this.b.c(getPlanOverviewViewRequest, nv9Var);
                if (objC != d9nVar) {
                    z2 = z;
                    getPlanOverviewViewResponse = (GetPlanOverviewViewResponse) objC;
                }
            } else {
                nv9Var.a = z;
                nv9Var.d = 2;
                objC = this.a.c(getPlanOverviewViewRequest, nv9Var);
                if (objC != d9nVar) {
                    z2 = z;
                    getPlanOverviewViewResponse = (GetPlanOverviewViewResponse) objC;
                }
            }
            return d9nVar;
        }
        if (i7 == 1) {
            z2 = nv9Var.a;
            hm5.M(objC);
            getPlanOverviewViewResponse = (GetPlanOverviewViewResponse) objC;
        } else {
            if (i7 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = nv9Var.a;
            hm5.M(objC);
            getPlanOverviewViewResponse = (GetPlanOverviewViewResponse) objC;
        }
        boolean z3 = z2;
        Plan planT = getPlanOverviewViewResponse.t();
        boolean zI = oh4Var.I();
        String planName = planT.getPlanName();
        String str2 = planName == null ? "" : planName;
        String strC2 = planT.C();
        String str3 = strC2 == null ? "" : strC2;
        h290<Benefit> h290VarR = planT.r();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarR, 10));
        for (Benefit benefit : h290VarR) {
            benefit.getClass();
            String strN = benefit.n();
            String str4 = strN == null ? "" : strN;
            String title = benefit.getTitle();
            String str5 = title == null ? "" : title;
            String subtitle = benefit.getSubtitle();
            String str6 = subtitle == null ? "" : subtitle;
            String strO = benefit.o();
            String str7 = strO == null ? "#FFFFFF" : strO;
            boolean zP = benefit.p();
            String uri = benefit.getUri();
            arrayList.add(new gja(str4, str5, str6, str7, zP, uri == null ? "" : uri));
        }
        String strW = planT.w();
        String str8 = strW == null ? "#FFFFFF" : strW;
        String strV = planT.v();
        String str9 = strV == null ? "" : strV;
        int iOrdinal = planT.z().ordinal();
        if (iOrdinal == 1) {
            i = 1;
        } else if (iOrdinal == 2) {
            i = 2;
        } else if (iOrdinal == 3) {
            i = 3;
        } else if (iOrdinal != 4) {
            i = 1;
        } else {
            i = 4;
        }
        int iOrdinal2 = planT.y().ordinal();
        if (iOrdinal2 == 1) {
            i2 = 1;
        } else if (iOrdinal2 == 2) {
            i2 = 4;
        } else if (iOrdinal2 != 4) {
            i2 = 1;
        } else {
            i2 = 3;
        }
        String str10 = (!zI ? (strC = planT.C()) == null : (strC = planT.getPlanName()) == null) ? strC : "";
        switch (planT.B().ordinal()) {
            case 1:
                i3 = 1;
                break;
            case 2:
                i3 = 2;
                break;
            case 3:
                i3 = 3;
                break;
            case 4:
                i3 = 4;
                break;
            case 5:
                i4 = 5;
                i3 = i4;
                break;
            case 6:
                i4 = 6;
                i3 = i4;
                break;
            case 7:
                i4 = 7;
                i3 = i4;
                break;
            case 8:
            default:
                i4 = 0;
                i3 = i4;
                break;
            case 9:
                i4 = 8;
                i3 = i4;
                break;
            case 10:
                i4 = 9;
                i3 = i4;
                break;
            case 11:
                i3 = 10;
                break;
            case 12:
                i4 = 11;
                i3 = i4;
                break;
            case 13:
                i4 = 12;
                i3 = i4;
                break;
            case 14:
                i4 = 13;
                i3 = i4;
                break;
            case 15:
                i4 = 14;
                i3 = i4;
                break;
            case 16:
                i4 = 15;
                i3 = i4;
                break;
        }
        d7t0 d7t0Var = new d7t0(str2, str3, arrayList, str8, str9, i, i2, str10, i3);
        Account accountN = getPlanOverviewViewResponse.n();
        int iOrdinal3 = accountN.A().ordinal();
        int i8 = iOrdinal3 != 0 ? iOrdinal3 != 1 ? 3 : 2 : 1;
        String strO2 = accountN.o();
        String str11 = strO2 == null ? "" : strO2;
        boolean zS = accountN.s();
        boolean zT = accountN.t();
        long jQ = accountN.q();
        h290<Member> h290VarV = accountN.v();
        ArrayList arrayList2 = new ArrayList(q7h.U(h290VarV, 10));
        for (Member member : h290VarV) {
            member.getClass();
            arrayList2.add(g(member));
        }
        int iN = (int) accountN.n();
        AccountFlags accountFlagsR = accountN.r();
        im imVar = new im(accountFlagsR.o(), accountFlagsR.s(), accountFlagsR.t(), accountFlagsR.p(), accountFlagsR.w(), accountFlagsR.v(), accountFlagsR.n(), accountFlagsR.r(), accountFlagsR.z(), accountFlagsR.q(), accountFlagsR.y());
        int iY = accountN.y();
        int i9 = mv9.a[accountN.z().ordinal()];
        if (i9 == 1) {
            i5 = 1;
        } else if (i9 == 2) {
            i5 = 2;
        } else if (i9 == 3) {
            i5 = 3;
        } else if (i9 != 4) {
            i5 = 1;
        } else {
            i5 = 4;
        }
        nk nkVar = new nk(i8, str11, zS, zT, jQ, arrayList2, iN, imVar, iY, i5, accountN.x(), accountN.u() != 0 ? accountN.u() : 1);
        h290<ActionTypeMap> h290VarO = getPlanOverviewViewResponse.o();
        ArrayList arrayList3 = new ArrayList(q7h.U(h290VarO, 10));
        for (ActionTypeMap actionTypeMap : h290VarO) {
            arrayList3.add(new mmr0(f(actionTypeMap.o()), e(actionTypeMap.n())));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            t80 t80Var = t80.g;
            if (!zHasNext) {
                Map mapT = sqg0.T(arrayList4);
                String strQ = getPlanOverviewViewResponse.q();
                String str12 = strQ == null ? "" : strQ;
                String strP = getPlanOverviewViewResponse.p();
                String str13 = strP == null ? "" : strP;
                h290<AstroOn> h290VarR2 = getPlanOverviewViewResponse.r();
                ArrayList arrayList5 = new ArrayList(q7h.U(h290VarR2, 10));
                for (AstroOn astroOn : h290VarR2) {
                    h290<ActionTypeMap> h290VarN = astroOn.n();
                    ArrayList arrayList6 = new ArrayList(q7h.U(h290VarN, 10));
                    for (ActionTypeMap actionTypeMap2 : h290VarN) {
                        arrayList6.add(new mmr0(f(actionTypeMap2.o()), e(actionTypeMap2.n())));
                    }
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj : arrayList6) {
                        if (((mmr0) obj).a != t80Var) {
                            arrayList7.add(obj);
                        }
                    }
                    Map mapT2 = sqg0.T(arrayList7);
                    String strP2 = astroOn.p();
                    String str14 = strP2 == null ? "" : strP2;
                    String title2 = astroOn.getTitle();
                    String str15 = title2 == null ? "" : title2;
                    String subtitle2 = astroOn.getSubtitle();
                    String str16 = subtitle2 == null ? "" : subtitle2;
                    String strR = astroOn.r();
                    String str17 = strR == null ? "" : strR;
                    c10 c10Var = (c10) mapT2.get(t80.O0);
                    arrayList5.add(new xe1(str14, str15, str16, str17, (c10Var == null || (str = c10Var.e) == null) ? "" : str));
                }
                if (getPlanOverviewViewResponse.n().B()) {
                    MembershipVerification membershipVerificationW = getPlanOverviewViewResponse.n().w();
                    boolean zU2 = oh4Var.u();
                    String title3 = membershipVerificationW.getTitle();
                    String str18 = title3 == null ? "" : title3;
                    String description = membershipVerificationW.getDescription();
                    String str19 = description == null ? "" : description;
                    c10 c10VarE = e(membershipVerificationW.n());
                    Long lValueOf = membershipVerificationW.r() ? Long.valueOf(membershipVerificationW.o()) : null;
                    if (membershipVerificationW.q().isEmpty()) {
                        listL1 = null;
                    } else {
                        h290<Member> h290VarQ = membershipVerificationW.q();
                        ArrayList arrayList8 = new ArrayList(q7h.U(h290VarQ, 10));
                        for (Member member2 : h290VarQ) {
                            member2.getClass();
                            arrayList8.add(g(member2));
                        }
                        listL1 = o7h.l1(arrayList8);
                    }
                    kvm0Var = new kvm0(str18, str19, c10VarE, zU2, lValueOf, listL1);
                } else {
                    kvm0Var = null;
                }
                return new lbt0(d7t0Var, nkVar, mapT, str12, str13, arrayList5, false, false, z3, kvm0Var);
            }
            Object next = it.next();
            if (((mmr0) next).a != t80Var) {
                arrayList4.add(next);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0391  */
    /* JADX WARN: Code duplicated, block: B:105:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:107:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object d(Context context, boolean z, onm onmVar) {
        sv9 sv9Var;
        boolean z2;
        GetPlanOverviewViewResponse getPlanOverviewViewResponse;
        String strM;
        p60 p60Var;
        Object next;
        Context context2 = context;
        oh4 oh4Var = this.c.b;
        if (onmVar instanceof sv9) {
            sv9Var = (sv9) onmVar;
            int i = sv9Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sv9Var.e = i - Integer.MIN_VALUE;
            } else {
                sv9Var = new sv9(this, onmVar);
            }
        } else {
            sv9Var = new sv9(this, onmVar);
        }
        Object obj = sv9Var.c;
        int i2 = sv9Var.e;
        z811 x811Var = null;
        if (i2 == 0) {
            hm5.M(obj);
            d9n d9nVar = d9n.a;
            if (z) {
                enr0.a.getClass();
                to40 to40VarN = GetPlanOverviewViewRequest.n();
                to40VarN.n(false);
                to40VarN.q();
                h hVarBuild = to40VarN.build();
                hVarBuild.getClass();
                sv9Var.a = context2;
                sv9Var.b = z;
                sv9Var.e = 1;
                Object objC = this.b.c((GetPlanOverviewViewRequest) hVarBuild, sv9Var);
                if (objC != d9nVar) {
                    obj = objC;
                    z2 = z;
                    getPlanOverviewViewResponse = (GetPlanOverviewViewResponse) obj;
                }
            } else {
                enr0.a.getClass();
                to40 to40VarN2 = GetPlanOverviewViewRequest.n();
                to40VarN2.n(false);
                to40VarN2.q();
                h hVarBuild2 = to40VarN2.build();
                hVarBuild2.getClass();
                sv9Var.a = context2;
                sv9Var.b = z;
                sv9Var.e = 2;
                Object objC2 = this.a.c((GetPlanOverviewViewRequest) hVarBuild2, sv9Var);
                if (objC2 != d9nVar) {
                    obj = objC2;
                    z2 = z;
                    getPlanOverviewViewResponse = (GetPlanOverviewViewResponse) obj;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            z2 = sv9Var.b;
            context2 = sv9Var.a;
            hm5.M(obj);
            getPlanOverviewViewResponse = (GetPlanOverviewViewResponse) obj;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = sv9Var.b;
            context2 = sv9Var.a;
            hm5.M(obj);
            getPlanOverviewViewResponse = (GetPlanOverviewViewResponse) obj;
        }
        boolean z3 = z2;
        int i3 = rv9.a[getPlanOverviewViewResponse.n().A().ordinal()];
        String string = i3 != 1 ? i3 != 2 ? context2.getString(2131964200) : context2.getString(2131964199) : context2.getString(2131964201);
        boolean z4 = (getPlanOverviewViewResponse.t().y() == dct0.PLAN_TIER_PREMIUM && getPlanOverviewViewResponse.t().z() != gct0.PLAN_TYPE_BASIC) || getPlanOverviewViewResponse.n().r().w();
        String string2 = getPlanOverviewViewResponse.n().r().w() ? context2.getString(2131964208) : oh4Var.I() ? getPlanOverviewViewResponse.t().getPlanName() : getPlanOverviewViewResponse.t().C();
        string2.getClass();
        String strW = getPlanOverviewViewResponse.t().w();
        h290<Member> h290VarV = getPlanOverviewViewResponse.n().v();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarV, 10));
        for (Member member : h290VarV) {
            arrayList.add(new iji0(member.getName(), member.p()));
        }
        ArrayList arrayList2 = new ArrayList();
        if (getPlanOverviewViewResponse.n().A() == kcs0.TRIAL) {
            arrayList2.add(new p60("TIME", null, context2.getString(2131964209, a(getPlanOverviewViewResponse.n().q())), null, null, 0.0f, null, null, null, 0, null, null, 4090));
        } else if (getPlanOverviewViewResponse.n().A() == kcs0.PREPAID) {
            arrayList2.add(new p60("TIME", null, context2.getString(2131964210, a(getPlanOverviewViewResponse.n().q())), null, null, 0.0f, null, null, null, 0, null, null, 4090));
        }
        for (AstroOn astroOn : getPlanOverviewViewResponse.r()) {
            arrayList2.add(new p60(astroOn.p(), null, astroOn.o(), null, null, 0.0f, null, null, null, 0, null, null, 4090));
        }
        e7t0 e7t0Var = new e7t0(string, z4, string2, strW, arrayList, new p60(null, null, context2.getString(2131964207), null, z3 ? oon1.m(nik1.W1) : nik1.W1.a, 0.0f, null, null, null, 0, null, null, 4075), arrayList2);
        h290 h290VarR = getPlanOverviewViewResponse.t().r();
        ArrayList<Benefit> arrayList3 = new ArrayList();
        for (Object obj2 : h290VarR) {
            if (!u890.j(((Benefit) obj2).n(), "AUDIOBOOK")) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        for (Benefit benefit : arrayList3) {
            arrayList4.add(new p60(benefit.n(), benefit.o(), benefit.getTitle(), null, null, 0.0f, null, null, null, 0, null, null, 4088));
        }
        String string3 = oh4Var.K() ? context2.getString(2131964206) : "";
        string3.getClass();
        jja jjaVar = new jja(arrayList4, new p60(null, null, string3, null, z3 ? oon1.m(nik1.p3) : nik1.p3.a, 0.0f, null, null, null, 0, null, null, 4075), 5);
        if (getPlanOverviewViewResponse.n().r().v()) {
            String string4 = context2.getString(2131964198);
            String string5 = context2.getString(2131964197);
            if (z3) {
                strM = oon1.m(nik1.S1);
            } else {
                strM = nik1.S1.a;
            }
            p60Var = new p60("AUDIOBOOK", null, string4, string5, strM, 0.0f, null, null, null, 0, null, null, 4066);
        } else {
            Iterator it = getPlanOverviewViewResponse.t().r().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((Benefit) next).n(), "AUDIOBOOK"));
            if (next != null) {
                String string6 = context2.getString(2131964198);
                String string7 = context2.getString(2131964197);
                if (z3) {
                    strM = oon1.m(nik1.S1);
                } else {
                    strM = nik1.S1.a;
                }
                p60Var = new p60("AUDIOBOOK", null, string6, string7, strM, 0.0f, null, null, null, 0, null, null, 4066);
            } else {
                p60Var = new p60(null, null, null, null, null, 0.0f, null, null, null, 0, null, null, 4095);
            }
        }
        h290<Action> h290VarS = getPlanOverviewViewResponse.s();
        ArrayList arrayList5 = new ArrayList(q7h.U(h290VarS, 10));
        for (Action action : h290VarS) {
            arrayList5.add(new p60(action.p(), null, action.getTitle(), action.getSubtitle(), action.getUri(), 0.0f, null, null, null, 0, null, null, 4066));
        }
        kyh1 kyh1Var = new kyh1();
        if (getPlanOverviewViewResponse.v()) {
            int iQ = getPlanOverviewViewResponse.u().q();
            int i4 = iQ == 0 ? -1 : rv9.b[l1d.C(iQ)];
            if (i4 != -1) {
                if (i4 == 1) {
                    x811Var = new x811(getPlanOverviewViewResponse.u().n().n(), getPlanOverviewViewResponse.u().n().p());
                } else if (i4 == 2) {
                    x811Var = new y811(getPlanOverviewViewResponse.u().p().r(), getPlanOverviewViewResponse.u().p().q(), getPlanOverviewViewResponse.u().p().p(), getPlanOverviewViewResponse.u().p().o());
                } else if (i4 != 3) {
                    eg.o();
                    return null;
                }
            }
        }
        return new hzm1(new drq0(e7t0Var, jjaVar, p60Var, kyh1Var, z3, getPlanOverviewViewResponse.n().r().x(), getPlanOverviewViewResponse.n().r().A(), getPlanOverviewViewResponse.n().r().C(), getPlanOverviewViewResponse.n().r().B(), arrayList5, x811Var, 32));
    }

    public fv9(enr0 enr0Var, enr0 enr0Var2, wpv0 wpv0Var, dma1 dma1Var) {
        this.a = enr0Var;
        this.b = enr0Var2;
        this.c = wpv0Var;
    }
}
