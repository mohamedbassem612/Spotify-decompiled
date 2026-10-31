package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sq71 extends a8d1 implements vu30 {
    public Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public String b;
    public Object c;
    public byte d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq71(iu30 iu30Var, Uri uri, wkt wktVar, xwa xwaVar, vwa vwaVar, String str, xwa xwaVar2, lnm lnmVar) {
        super(2, lnmVar);
        this.h = iu30Var;
        this.i = uri;
        this.t = wktVar;
        this.X = xwaVar;
        this.Y = vwaVar;
        this.b = str;
        this.Z = xwaVar2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                sq71 sq71Var = new sq71((il71) this.X, (exy) obj3, (tq71) this.i, this.b, (z771) obj2, lnmVar);
                sq71Var.g = obj;
                return sq71Var;
            case 1:
                sq71 sq71Var2 = new sq71((b1g1) obj3, (f1g1) obj2, lnmVar);
                sq71Var2.e = obj;
                return sq71Var2;
            default:
                return new sq71((iu30) this.h, (Uri) this.i, (wkt) this.t, (xwa) this.X, (vwa) obj3, this.b, (xwa) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0242  */
    /* JADX WARN: Code duplicated, block: B:56:0x0246  */
    /* JADX WARN: Code duplicated, block: B:58:0x0249  */
    /* JADX WARN: Code duplicated, block: B:62:0x027e  */
    /* JADX WARN: Code duplicated, block: B:65:0x028b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0299  */
    /* JADX WARN: Code duplicated, block: B:68:0x029d  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:76:0x02b8  */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        llw0 llw0Var;
        tq71 tq71Var;
        Object objQ;
        l2t l2tVarQ;
        llw0 llw0Var2;
        s2t s2tVar;
        Object objE;
        tq71 tq71Var2;
        llw0 llw0Var3;
        jq71 jq71Var;
        Object objE2;
        wa71 wa71VarA;
        l2t l2tVarQ2;
        Object objQ2;
        String str;
        ay61 ay61Var;
        Object objE3;
        List list;
        ay61 ay61Var2;
        String str2;
        p0g1 p0g1Var;
        List list2;
        String str3;
        Object obj2;
        Object objC;
        p0g1 p0g1Var2;
        List list3;
        ay61 ay61Var3;
        String str4;
        int iD;
        String str5;
        iu30 iu30Var;
        Object objA2;
        Uri uri;
        wkt wktVar;
        Uri uri2;
        Object objA3;
        iu30 iu30Var2;
        Uri uri3;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        Object obj3 = this.Y;
        Object obj4 = this.Z;
        Uri uri4 = null;
        switch (b) {
            case 0:
                String str6 = this.b;
                tq71 tq71Var3 = (tq71) this.i;
                c9n c9nVar = (c9n) this.g;
                byte b2 = this.d;
                Uri uri5 = null;
                if (b2 == 0) {
                    hm5.M(obj);
                    il71 il71Var = (il71) this.X;
                    p651 p651Var = new p651((Object) tq71Var3, (Object) il71Var, (Object) str6, (lnm) uri5, (byte) 14);
                    this.g = c9nVar;
                    this.d = (byte) 1;
                    objA = il71Var.a("fetching_canvas", p651Var, this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            l2tVarQ = (l2t) this.e;
                            s2tVar = (s2t) this.c;
                            llw0 llw0Var4 = (llw0) this.f;
                            hm5.M(obj);
                            llw0Var2 = llw0Var4;
                            uri5 = null;
                            this.g = uri5;
                            this.f = llw0Var2;
                            this.c = uri5;
                            this.e = l2tVarQ;
                            this.h = tq71Var3;
                            this.d = (byte) 3;
                            objE = s2tVar.E(this);
                            if (objE == d9nVar) {
                                return d9nVar;
                            }
                            llw0 llw0Var5 = llw0Var2;
                            tq71Var2 = tq71Var3;
                            llw0Var3 = llw0Var5;
                            jq71Var = (jq71) objE;
                            this.g = uri5;
                            this.f = llw0Var3;
                            this.c = uri5;
                            this.e = uri5;
                            this.h = tq71Var2;
                            this.t = jq71Var;
                            this.d = (byte) 4;
                            objE2 = l2tVarQ.E(this);
                            if (objE2 == d9nVar) {
                                return d9nVar;
                            }
                        } else if (b2 == 3) {
                            tq71 tq71Var4 = (tq71) this.h;
                            l2tVarQ = (l2t) this.e;
                            llw0 llw0Var6 = (llw0) this.f;
                            hm5.M(obj);
                            llw0Var3 = llw0Var6;
                            uri5 = null;
                            tq71Var2 = tq71Var4;
                            objE = obj;
                            jq71Var = (jq71) objE;
                            this.g = uri5;
                            this.f = llw0Var3;
                            this.c = uri5;
                            this.e = uri5;
                            this.h = tq71Var2;
                            this.t = jq71Var;
                            this.d = (byte) 4;
                            objE2 = l2tVarQ.E(this);
                            if (objE2 == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            if (b2 != 4) {
                                if (b2 != 5) {
                                    eg.m("call to 'resume' before 'invoke' with coroutine");
                                    return uri4;
                                }
                                tq71 tq71Var5 = (tq71) this.e;
                                llw0 llw0Var7 = (llw0) this.f;
                                hm5.M(obj);
                                llw0Var = llw0Var7;
                                uri5 = null;
                                tq71Var = tq71Var5;
                                objQ = obj;
                                return tq71Var.a((jq71) objQ, uri5, llw0Var, str6);
                            }
                            jq71 jq71Var2 = (jq71) this.t;
                            tq71 tq71Var6 = (tq71) this.h;
                            llw0Var3 = (llw0) this.f;
                            hm5.M(obj);
                            tq71Var2 = tq71Var6;
                            jq71Var = jq71Var2;
                            objE2 = obj;
                        }
                        return tq71Var2.a(jq71Var, (jq71) objE2, llw0Var3, str6);
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                llw0Var = (llw0) objA;
                if (llw0Var != null) {
                    s2t s2tVarQ = fn31.q(c9nVar, uri5, 0, new qq71((byte) 4, this.b, null, (z771) obj4, (il71) this.X, tq71Var3), 3);
                    if (!(((exy) obj3).b instanceof n1f1)) {
                        tq71Var = tq71Var3;
                        this.g = uri5;
                        this.f = llw0Var;
                        this.c = uri5;
                        this.e = tq71Var;
                        this.d = (byte) 5;
                        objQ = s2tVarQ.Q(this);
                        if (objQ == d9nVar) {
                            return d9nVar;
                        }
                        return tq71Var.a((jq71) objQ, uri5, llw0Var, str6);
                    }
                    l2tVarQ = fn31.q(c9nVar, uri5, 0, new qq71((byte) 5, this.b, null, (z771) obj4, (il71) this.X, tq71Var3), 3);
                    l2t[] l2tVarArr = {s2tVarQ, l2tVarQ};
                    this.g = uri5;
                    this.f = llw0Var;
                    this.c = s2tVarQ;
                    this.e = l2tVarQ;
                    this.d = (byte) 2;
                    if (o1p1.v(l2tVarArr, this) == d9nVar) {
                        return d9nVar;
                    }
                    llw0Var2 = llw0Var;
                    s2tVar = s2tVarQ;
                    this.g = uri5;
                    this.f = llw0Var2;
                    this.c = uri5;
                    this.e = l2tVarQ;
                    this.h = tq71Var3;
                    this.d = (byte) 3;
                    objE = s2tVar.E(this);
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                    llw0 llw0Var8 = llw0Var2;
                    tq71Var2 = tq71Var3;
                    llw0Var3 = llw0Var8;
                    jq71Var = (jq71) objE;
                    this.g = uri5;
                    this.f = llw0Var3;
                    this.c = uri5;
                    this.e = uri5;
                    this.h = tq71Var2;
                    this.t = jq71Var;
                    this.d = (byte) 4;
                    objE2 = l2tVarQ.E(this);
                    if (objE2 == d9nVar) {
                        return d9nVar;
                    }
                    return tq71Var2.a(jq71Var, (jq71) objE2, llw0Var3, str6);
                }
                return uri4;
            case 1:
                f1g1 f1g1Var = (f1g1) obj4;
                c9n c9nVar2 = (c9n) this.e;
                byte b3 = this.d;
                if (b3 != 0) {
                    if (b3 == 1) {
                        l2t l2tVar = (s2t) this.c;
                        ay61Var = (ay61) this.g;
                        String str7 = this.b;
                        wa71 wa71Var = (wa71) this.f;
                        hm5.M(obj);
                        wa71VarA = wa71Var;
                        str = str7;
                        l2tVarQ2 = l2tVar;
                        objQ2 = obj;
                    } else {
                        if (b3 == 2) {
                            list2 = (ArrayList) this.t;
                            List list4 = (List) this.i;
                            p0g1 p0g1Var3 = (p0g1) this.h;
                            ay61 ay61Var4 = (ay61) this.g;
                            String str8 = this.b;
                            wa71 wa71Var2 = (wa71) this.f;
                            hm5.M(obj);
                            list = list4;
                            wa71VarA = wa71Var2;
                            str2 = str8;
                            ay61Var2 = ay61Var4;
                            p0g1Var = p0g1Var3;
                            objE3 = obj;
                            list2.addAll((Collection) objE3);
                            str3 = p0g1Var.c;
                            if (str3 != null) {
                                if (p0g1Var.d != null) {
                                    obj2 = null;
                                } else {
                                    obj2 = null;
                                    wa71VarA = wa71.a(wa71VarA, str3, null, null, 126);
                                }
                                wa71 wa71Var3 = wa71VarA;
                                String str9 = p0g1Var.c;
                                z771 z771VarP = tyo1.p(blc0.ug, new String[0]);
                                this.e = obj2;
                                this.f = obj2;
                                this.b = str2;
                                this.g = ay61Var2;
                                this.c = obj2;
                                this.h = p0g1Var;
                                List list5 = list;
                                this.i = list5;
                                this.t = obj2;
                                this.X = list5;
                                this.d = (byte) 3;
                                Set set = f1g1.i;
                                objC = f1g1Var.c(str9, wa71Var3, z771VarP, p0g1Var, this);
                                if (objC == d9nVar) {
                                    return d9nVar;
                                }
                                p0g1Var2 = p0g1Var;
                                list3 = list;
                                ay61Var3 = ay61Var2;
                                str4 = str2;
                            }
                            if (ay61Var2 != null) {
                                iD = f1g1.d(list, tyo1.p(blc0.sg, new String[0]));
                            } else if (p0g1Var.a && p0g1Var.d == null) {
                                iD = 0;
                            } else {
                                iD = f1g1.d(list, tyo1.p(blc0.ug, new String[0]));
                            }
                            str5 = p0g1Var.b;
                            if (str5 != null) {
                                str2 = str5;
                            }
                            return new b871(syo1.D(str2, list), iD);
                        }
                        if (b3 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list6 = (List) this.X;
                        list3 = (List) this.i;
                        p0g1Var2 = (p0g1) this.h;
                        ay61Var3 = (ay61) this.g;
                        str4 = this.b;
                        hm5.M(obj);
                        list = list6;
                        objC = obj;
                    }
                    list.add(objC);
                    list = list3;
                    ay61Var2 = ay61Var3;
                    str2 = str4;
                    p0g1Var = p0g1Var2;
                    if (ay61Var2 != null) {
                        iD = f1g1.d(list, tyo1.p(blc0.sg, new String[0]));
                    } else if (p0g1Var.a) {
                        iD = f1g1.d(list, tyo1.p(blc0.ug, new String[0]));
                    } else {
                        iD = f1g1.d(list, tyo1.p(blc0.ug, new String[0]));
                    }
                    str5 = p0g1Var.b;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    return new b871(syo1.D(str2, list), iD);
                }
                hm5.M(obj);
                wa71VarA = ((b1g1) obj3).a;
                String str10 = wa71VarA.a;
                ay61 ay61Var5 = (ay61) jhc1.t(wa71VarA.g, "lyrics.share.asset_content", ay61.class);
                s2t s2tVarQ2 = fn31.q(c9nVar2, (o8n) null, 0, new pec1(f1g1Var, wa71VarA, uri4, (byte) 27), 3);
                l2tVarQ2 = fn31.q(c9nVar2, (o8n) null, 0, new hgo0((byte) 27, ay61Var5, f1g1Var, wa71VarA, str10, s2tVarQ2, (lnm) null), 3);
                this.e = c9nVar2;
                this.f = wa71VarA;
                this.b = str10;
                this.g = ay61Var5;
                this.c = l2tVarQ2;
                this.d = (byte) 1;
                objQ2 = s2tVarQ2.Q(this);
                if (objQ2 == d9nVar) {
                    return d9nVar;
                }
                str = str10;
                ay61Var = ay61Var5;
                p0g1 p0g1Var4 = (p0g1) objQ2;
                ArrayList arrayList = z6x.a;
                if (p0g1Var4 == null) {
                    l2tVarQ2.d((CancellationException) null);
                    return new b871(arrayList, 0);
                }
                String str11 = p0g1Var4.b;
                if (str11 != null) {
                    wa71 wa71VarA2 = wa71.a(wa71VarA, str11, null, null, 126);
                    Set set2 = f1g1.i;
                    List<u771> listSingletonList = Collections.singletonList(new u771(new t771(wa71VarA2, tyo1.p(blc0.mg, new String[0])), new pz61(new y171(rc11.a.b(ghb1.class)), new fhb1(false), dz61.d, true), new bj71(null, true, f1g1Var.a.getString(2131963363), 1)));
                    arrayList = new ArrayList(q7h.U(listSingletonList, 10));
                    for (u771 u771Var : listSingletonList) {
                        arrayList.add(u771.a(u771Var, t771.a(u771Var.a, (wa71) null, tyo1.p(blc0.mg, new String[0]), 1), (pz61) null, (bj71) null, 6));
                    }
                    uri4 = null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(arrayList);
                this.e = uri4;
                this.f = wa71VarA;
                this.b = str;
                this.g = ay61Var;
                this.c = uri4;
                this.h = p0g1Var4;
                this.i = arrayList2;
                this.t = arrayList2;
                this.d = (byte) 2;
                objE3 = l2tVarQ2.E(this);
                if (objE3 == d9nVar) {
                    return d9nVar;
                }
                list = arrayList2;
                ay61Var2 = ay61Var;
                str2 = str;
                p0g1Var = p0g1Var4;
                list2 = list;
                list2.addAll((Collection) objE3);
                str3 = p0g1Var.c;
                if (str3 != null) {
                    if (p0g1Var.d != null) {
                        obj2 = null;
                    } else {
                        obj2 = null;
                        wa71VarA = wa71.a(wa71VarA, str3, null, null, 126);
                    }
                    wa71 wa71Var4 = wa71VarA;
                    String str12 = p0g1Var.c;
                    z771 z771VarP2 = tyo1.p(blc0.ug, new String[0]);
                    this.e = obj2;
                    this.f = obj2;
                    this.b = str2;
                    this.g = ay61Var2;
                    this.c = obj2;
                    this.h = p0g1Var;
                    List list7 = list;
                    this.i = list7;
                    this.t = obj2;
                    this.X = list7;
                    this.d = (byte) 3;
                    Set set3 = f1g1.i;
                    objC = f1g1Var.c(str12, wa71Var4, z771VarP2, p0g1Var, this);
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                    p0g1Var2 = p0g1Var;
                    list3 = list;
                    ay61Var3 = ay61Var2;
                    str4 = str2;
                    list.add(objC);
                    list = list3;
                    ay61Var2 = ay61Var3;
                    str2 = str4;
                    p0g1Var = p0g1Var2;
                }
                if (ay61Var2 != null) {
                    iD = f1g1.d(list, tyo1.p(blc0.sg, new String[0]));
                } else if (p0g1Var.a) {
                    iD = f1g1.d(list, tyo1.p(blc0.ug, new String[0]));
                } else {
                    iD = f1g1.d(list, tyo1.p(blc0.ug, new String[0]));
                }
                str5 = p0g1Var.b;
                if (str5 != null) {
                    str2 = str5;
                }
                return new b871(syo1.D(str2, list), iD);
            default:
                vwa vwaVar = (vwa) obj3;
                byte b4 = this.d;
                if (b4 != 0) {
                    if (b4 == 1) {
                        wkt wktVar2 = (wkt) this.e;
                        Uri uri6 = (Uri) this.c;
                        iu30 iu30Var3 = (iu30) this.f;
                        hm5.M(obj);
                        wktVar = wktVar2;
                        iu30Var = iu30Var3;
                        uri = uri6;
                        objA2 = obj;
                    } else {
                        if (b4 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uri3 = (Uri) this.g;
                        wktVar = (wkt) this.e;
                        uri = (Uri) this.c;
                        iu30 iu30Var4 = (iu30) this.f;
                        hm5.M(obj);
                        iu30Var2 = iu30Var4;
                        objA3 = obj;
                    }
                    uri4 = ((wwa) o7h.V0((List) objA3)).b;
                    uri2 = uri3;
                    iu30Var = iu30Var2;
                    iu30Var.invoke(new d5k1(uri, uri2, uri4, wktVar));
                    return rih1.a;
                }
                hm5.M(obj);
                iu30Var = (iu30) this.h;
                Uri uri7 = (Uri) this.i;
                wkt wktVar3 = (wkt) this.t;
                this.f = iu30Var;
                this.c = uri7;
                this.e = wktVar3;
                this.d = (byte) 1;
                objA2 = ((xwa) this.X).a(new vwa[]{vwaVar}, this);
                if (objA2 == d9nVar) {
                    return d9nVar;
                }
                uri = uri7;
                wktVar = wktVar3;
                uri2 = ((wwa) o7h.V0((List) objA2)).b;
                if (this.b == null) {
                    this.f = iu30Var;
                    this.c = uri;
                    this.e = wktVar;
                    this.g = uri2;
                    this.d = (byte) 2;
                    objA3 = ((xwa) obj4).a(new vwa[]{vwaVar}, this);
                    if (objA3 == d9nVar) {
                        return d9nVar;
                    }
                    iu30Var2 = iu30Var;
                    uri3 = uri2;
                    uri4 = ((wwa) o7h.V0((List) objA3)).b;
                    uri2 = uri3;
                    iu30Var = iu30Var2;
                }
                iu30Var.invoke(new d5k1(uri, uri2, uri4, wktVar));
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq71(il71 il71Var, exy exyVar, tq71 tq71Var, String str, z771 z771Var, lnm lnmVar) {
        super(2, lnmVar);
        this.X = il71Var;
        this.Y = exyVar;
        this.i = tq71Var;
        this.b = str;
        this.Z = z771Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq71(b1g1 b1g1Var, f1g1 f1g1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.Y = b1g1Var;
        this.Z = f1g1Var;
    }
}
