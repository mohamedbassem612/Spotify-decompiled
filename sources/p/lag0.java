package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lag0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lag0() {
        super(3, (lnm) null);
        this.a = (byte) 10;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                lag0 lag0Var = new lag0(this.d, (lnm) obj3, (byte) 0);
                lag0Var.c = (vr20) obj;
                return lag0Var.invokeSuspend(rih1Var);
            case 1:
                lag0 lag0Var2 = new lag0(this.d, (lnm) obj3, (byte) 1);
                lag0Var2.c = (th61) obj2;
                return lag0Var2.invokeSuspend(rih1Var);
            case 2:
                lag0 lag0Var3 = new lag0(this.d, (lnm) obj3, (byte) 2);
                lag0Var3.c = (Intent) obj;
                return lag0Var3.invokeSuspend(rih1Var);
            case 3:
                lag0 lag0Var4 = new lag0((wf2) this.d, (lnm) obj3, b2);
                lag0Var4.c = (th61) obj2;
                return lag0Var4.invokeSuspend(rih1Var);
            case 4:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                lag0 lag0Var5 = new lag0(this.d, (lnm) obj3, (byte) 4);
                lag0Var5.c = (Boolean) obj;
                lag0Var5.b = zBooleanValue;
                return lag0Var5.invokeSuspend(rih1Var);
            case 5:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                lag0 lag0Var6 = new lag0(this.d, (lnm) obj3, (byte) 5);
                lag0Var6.b = zBooleanValue2;
                lag0Var6.c = (List) obj2;
                return lag0Var6.invokeSuspend(rih1Var);
            case 6:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                lag0 lag0Var7 = new lag0(this.d, (lnm) obj3, (byte) 6);
                lag0Var7.c = (vir0) obj;
                lag0Var7.b = zBooleanValue3;
                return lag0Var7.invokeSuspend(rih1Var);
            case 7:
                lag0 lag0Var8 = new lag0(this.d, (lnm) obj3, (byte) 7);
                lag0Var8.c = (Intent) obj;
                return lag0Var8.invokeSuspend(rih1Var);
            case 8:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                lag0 lag0Var9 = new lag0(this.d, (lnm) obj3, (byte) 8);
                lag0Var9.b = zBooleanValue4;
                lag0Var9.c = (List) obj2;
                return lag0Var9.invokeSuspend(rih1Var);
            case 9:
                lag0 lag0Var10 = new lag0(this.d, (lnm) obj3, (byte) 9);
                lag0Var10.c = (vr20) obj;
                return lag0Var10.invokeSuspend(rih1Var);
            case 10:
                lag0 lag0Var11 = new lag0((int) b2, (lnm) obj3, (byte) 10);
                lag0Var11.c = (vr20) obj;
                lag0Var11.d = (nhv) obj2;
                return lag0Var11.invokeSuspend(rih1Var);
            case 11:
                lag0 lag0Var12 = new lag0(this.d, (lnm) obj3, (byte) 11);
                lag0Var12.c = (smy) obj2;
                return lag0Var12.invokeSuspend(rih1Var);
            case 12:
                lag0 lag0Var13 = new lag0((int) b2, (lnm) obj3, (byte) 12);
                lag0Var13.c = (vr20) obj;
                lag0Var13.d = (w18) obj2;
                return lag0Var13.invokeSuspend(rih1Var);
            case 13:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                lag0 lag0Var14 = new lag0(this.d, (lnm) obj3, (byte) 13);
                lag0Var14.b = zBooleanValue5;
                lag0Var14.c = (d3x) obj2;
                return lag0Var14.invokeSuspend(rih1Var);
            case 14:
                lag0 lag0Var15 = new lag0(this.d, (lnm) obj3, (byte) 14);
                lag0Var15.c = (Intent) obj;
                return lag0Var15.invokeSuspend(rih1Var);
            case 15:
                lag0 lag0Var16 = new lag0(this.d, (lnm) obj3, (byte) 15);
                lag0Var16.c = (String) obj;
                return lag0Var16.invokeSuspend(rih1Var);
            case 16:
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                lag0 lag0Var17 = new lag0(this.d, (lnm) obj3, (byte) 16);
                lag0Var17.c = (ea6) obj;
                lag0Var17.b = zBooleanValue6;
                return lag0Var17.invokeSuspend(rih1Var);
            case 17:
                lag0 lag0Var18 = new lag0(this.d, (lnm) obj3, (byte) 17);
                lag0Var18.c = (km61) obj;
                return lag0Var18.invokeSuspend(rih1Var);
            default:
                lag0 lag0Var19 = new lag0(this.d, (lnm) obj3, (byte) 18);
                lag0Var19.c = (Intent) obj;
                return lag0Var19.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:221:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:246:0x043c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x0183  */
    public final Object invokeSuspend(Object obj) {
        Integer numValueOf;
        String strJ0;
        String strK;
        String queryParameter;
        String dataString;
        String str;
        Object m231Var;
        c0d1 c0d1Var;
        Object value;
        boolean z;
        byte b = this.a;
        d9n d9nVar = rih1.a;
        crn0 crn0Var = crn0.a;
        boolean z2 = false;
        d9n d9nVar2 = d9n.a;
        String lowerCase = null;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                uag0 uag0Var = new uag0(!((dag0) this.d).d);
                this.c = null;
                this.b = true;
                return vr20Var.emit(uag0Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 1:
                th61 th61Var = (th61) this.c;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ru9 ru9Var = (ru9) this.d;
                q8n q8nVar = (q8n) ru9Var.c;
                d7i0 d7i0Var = new d7i0(ru9Var, th61Var, (lnm) null, (byte) 10);
                this.c = null;
                this.b = true;
                Object objY = fn31.Y(q8nVar, d7i0Var, this);
                return objY == d9nVar2 ? d9nVar2 : objY;
            case 2:
                Intent intent = (Intent) this.c;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    Uri data = intent.getData();
                    if (data == null) {
                        return crn0Var;
                    }
                    kqi0 kqi0Var = (kqi0) ((b72) this.d).b;
                    this.c = null;
                    this.b = true;
                    obj = kqi0Var.n(data, this);
                    if (obj == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return crn0Var;
            case 3:
                th61 th61Var2 = (th61) this.c;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    mr20 mr20VarA = ((ov20) ((wf2) this.d).b).a("has-podcasts-available", false);
                    this.c = th61Var2;
                    this.b = true;
                    obj = b5p1.i(mr20VarA, this);
                    if (obj == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return ((Boolean) obj).booleanValue() ? new frn0(mno1.h(new mmr0[]{new mmr0("username", th61Var2.a)}), i9o0.class) : crn0Var;
            case 4:
                Boolean bool = (Boolean) this.c;
                boolean z7 = this.b;
                hm5.M(obj);
                if (((f35) ((rzo0) this.d).d).a() && bool.booleanValue() && z7) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 5:
                boolean z8 = this.b;
                List list = (List) this.c;
                hm5.M(obj);
                if (!z8) {
                    return z6x.a;
                }
                List list2 = list;
                s1v0 s1v0Var = (s1v0) this.d;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new rrj0(((Number) it.next()).intValue(), s1v0Var.a));
                }
                return arrayList;
            case 6:
                vir0 vir0Var = (vir0) this.c;
                boolean z9 = this.b;
                hm5.M(obj);
                if (z9 && j0o1.o(vir0Var, (w7u0) this.d)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 7:
                Intent intent2 = (Intent) this.c;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                iib iibVar = ((rsz0) ((wf2) this.d).b).a;
                this.c = intent2;
                this.b = true;
                obj = b5p1.k(iibVar, this);
                if (obj == d9nVar2) {
                    return d9nVar2;
                }
                if (!u890.j(obj, Boolean.TRUE)) {
                    return crn0Var;
                }
                Bundle extras = intent2.getExtras();
                if (extras != null) {
                    int i = extras.getInt("preselected_rating", -1);
                    numValueOf = Integer.valueOf(i);
                    if (i < 0 || i >= 6) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(intent2.getDataString());
                String strZ = s4b1VarX.z();
                if (strZ != null) {
                    Uri uri = s4b1VarX.a;
                    strJ0 = ihc1.J0(strZ, ":" + (uri != null ? uri.getLastPathSegment() : null));
                } else {
                    strJ0 = null;
                }
                if (strJ0 == null || (strK = zjy.k(intent2)) == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                Bundle extras2 = intent2.getExtras();
                if (extras2 == null || !extras2.getBoolean("is_book", false)) {
                    Uri uri2 = uic.x(intent2.getDataString()).a;
                    if (uri2 != null && (queryParameter = uri2.getQueryParameter("is_book")) != null) {
                        lowerCase = queryParameter.toLowerCase(Locale.ROOT);
                    }
                    z2 = u890.j(lowerCase, "true");
                }
                return new hrn0(jtz0.class, new muz0(strJ0, strK, z2, numValueOf), a6w0.a);
            case 8:
                boolean z11 = this.b;
                List list3 = (List) this.c;
                hm5.M(obj);
                return z11 ? new j791(list3) : i791.a;
            case 9:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bm91 bm91Var = ((tm91) this.d).h;
                this.c = null;
                this.b = true;
                return vr20Var2.emit(bm91Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 10:
                vr20 vr20Var3 = (vr20) this.c;
                nhv nhvVar = (nhv) this.d;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                this.c = null;
                this.d = nhvVar;
                this.b = true;
                if (vr20Var3.emit(nhvVar, this) == d9nVar2) {
                    return d9nVar2;
                }
                if (!u890.j(nhvVar, jhv.a) && !(nhvVar instanceof khv) && !u890.j(nhvVar, jhv.b) && !u890.j(nhvVar, mhv.a)) {
                    if (!u890.j(nhvVar, jhv.e) && !(nhvVar instanceof lhv) && !u890.j(nhvVar, jhv.d) && !u890.j(nhvVar, jhv.c)) {
                        eg.o();
                        return null;
                    }
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 11:
                smy smyVar = (smy) this.c;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r2a1 r2a1Var = (r2a1) this.d;
                this.c = null;
                this.b = true;
                Object objU = xyn1.u(smyVar, r2a1Var, this);
                return objU == d9nVar2 ? d9nVar2 : objU;
            case 12:
                vr20 vr20Var4 = (vr20) this.c;
                w18 w18Var = (w18) this.d;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    this.c = null;
                    this.d = w18Var;
                    this.b = true;
                    if (vr20Var4.emit(w18Var, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf((w18Var instanceof t18) || (w18Var instanceof r18));
            case 13:
                boolean z16 = this.b;
                d3x d3xVar = (d3x) this.c;
                hm5.M(obj);
                if (p7h.M(new c8c0[]{c8c0.d, c8c0.e}).contains(((gdc1) this.d).a) && !z16 && d3xVar == d3x.d) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 14:
                ru9 ru9Var2 = (ru9) this.d;
                Intent intent3 = (Intent) this.c;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (((e25) ru9Var2.d).a() && (dataString = intent3.getDataString()) != null) {
                    if (!nhc1.Y(dataString, "spotify:", false) ? false : u890.j((String) o7h.q0(ihc1.Q0(dataString.substring(8), new String[]{"?"}, 2, 2)), "sc-pair:v1")) {
                        List listQ0 = ihc1.Q0(dataString.substring(8), new String[]{"?"}, 2, 2);
                        if (listQ0.size() != 2) {
                            c0d1Var = null;
                        } else {
                            List listQ1 = ihc1.Q0((String) listQ0.get(1), new String[]{"&"}, 0, 6);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = listQ1.iterator();
                            while (it2.hasNext()) {
                                List listQ2 = ihc1.Q0((String) it2.next(), new String[]{"="}, 2, 2);
                                mmr0 mmr0Var = listQ2.size() == 2 ? new mmr0(listQ2.get(0), listQ2.get(1)) : null;
                                if (mmr0Var != null) {
                                    arrayList2.add(mmr0Var);
                                }
                            }
                            Map mapT = sqg0.T(arrayList2);
                            String str2 = (String) mapT.get("k");
                            if (str2 == null) {
                                c0d1Var = null;
                            } else {
                                if (str2.length() <= 0) {
                                    str2 = null;
                                }
                                if (str2 == null || (str = (String) mapT.get("hierarchyId")) == null) {
                                    c0d1Var = null;
                                } else {
                                    if (str.length() <= 0) {
                                        str = null;
                                    }
                                    if (str == null) {
                                        c0d1Var = null;
                                    } else {
                                        try {
                                            m231Var = Base64.getUrlDecoder().decode(str2);
                                        } catch (Throwable th) {
                                            m231Var = new m231(th);
                                        }
                                        if (m231Var instanceof m231) {
                                            m231Var = null;
                                        }
                                        byte[] bArr = (byte[]) m231Var;
                                        if (bArr != null && bArr.length == 32) {
                                            c0d1Var = new c0d1(str, bArr);
                                        } else {
                                            c0d1Var = null;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        c0d1Var = null;
                    }
                    if (c0d1Var != null) {
                        q8n q8nVar2 = (q8n) ru9Var2.c;
                        kwb1 kwb1Var = new kwb1(ru9Var2, c0d1Var, (lnm) null, (byte) 3);
                        this.c = null;
                        this.b = true;
                        Object objY2 = fn31.Y(q8nVar2, kwb1Var, this);
                        return objY2 == d9nVar2 ? d9nVar2 : objY2;
                    }
                    break;
                }
                return crn0Var;
            case 15:
                String str3 = (String) this.c;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                y861 y861Var = ((yag1) this.d).a;
                this.c = null;
                this.b = true;
                bpb1 bpb1Var = (bpb1) y861Var.c;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, str3));
                return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
            case 16:
                ea6 ea6Var = (ea6) this.c;
                boolean z19 = this.b;
                hm5.M(obj);
                rxx0 rxx0Var = ea6Var.a;
                l2r0 l2r0Var = ea6Var.b;
                int iOrdinal = rxx0Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                    } else if (l2r0Var == l2r0.b && ea6Var.f) {
                        z = true;
                    }
                    z = false;
                } else if (l2r0Var == l2r0.c || !z19) {
                    z = false;
                } else {
                    z = true;
                }
                if (((wph1) this.d).d.i().contains(ea6Var.a) && z) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 17:
                km61 km61Var = (km61) this.c;
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                alg1 alg1Var = (alg1) ((r4h1) this.d).e;
                this.c = null;
                this.b = true;
                Object objS = smo1.s(new ae1(alg1Var, km61Var, lowerCase, (byte) 23), this);
                if (objS != d9nVar2) {
                    objS = d9nVar;
                }
                return objS == d9nVar2 ? d9nVar2 : d9nVar;
            default:
                ru9 ru9Var3 = (ru9) this.d;
                Intent intent4 = (Intent) this.c;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    if (!((z0t) ru9Var3.d).a.n()) {
                        this.c = intent4;
                        this.b = true;
                        obj = fn31.Y((q8n) ru9Var3.b, new fkj1(ru9Var3, (lnm) null, (byte) 28), this);
                        if (obj == d9nVar2) {
                            return d9nVar2;
                        }
                    }
                    return new hrn0(lxm1.class, new nxm1(intent4.getIntExtra("VIEW_ID_TO_ALIGN_TOP_WITH_EXTRA", -1), intent4.getBooleanExtra("START_IN_EDIT_MODE", false)), new b6w0(true));
                }
                if (!z21) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return crn0Var;
                }
                return new hrn0(lxm1.class, new nxm1(intent4.getIntExtra("VIEW_ID_TO_ALIGN_TOP_WITH_EXTRA", -1), intent4.getBooleanExtra("START_IN_EDIT_MODE", false)), new b6w0(true));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lag0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lag0(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
