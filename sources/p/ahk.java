package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ahk extends a8d1 implements vu30 {
    public final /* synthetic */ p6r0 X;
    public final /* synthetic */ tv80 Y;
    public final /* synthetic */ String Z;
    public boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ k6k c;
    public final /* synthetic */ bhk d;
    public final /* synthetic */ o0d e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahk(String str, k6k k6kVar, bhk bhkVar, o0d o0dVar, String str2, String str3, String str4, String str5, String str6, p6r0 p6r0Var, tv80 tv80Var, String str7, lnm lnmVar) {
        super(2, lnmVar);
        this.b = str;
        this.c = k6kVar;
        this.d = bhkVar;
        this.e = o0dVar;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.t = str6;
        this.X = p6r0Var;
        this.Y = tv80Var;
        this.Z = str7;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new ahk(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:25:0x0100  */
    /* JADX WARN: Code duplicated, block: B:30:0x011c  */
    public final Object invokeSuspend(Object obj) {
        jhm jhmVar;
        Object objA;
        k6k k6kVar;
        List listSingletonList;
        smc0 smc0VarN;
        String str;
        boolean z = this.a;
        bhk bhkVar = this.d;
        if (!z) {
            hm5.M(obj);
            String str2 = this.b;
            if (str2 != null) {
                this.a = true;
                objA = bhkVar.a(str2, this);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                jhmVar = null;
            }
            k6kVar = this.c;
            if (k6kVar != null) {
                bhkVar.getClass();
                listSingletonList = Collections.singletonList(new jhm("add_to_calendar", (hux) qjx.c, (fhm) null, (Integer) 2131955775, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(rgk.c, rgk.d), new o0d(k6kVar, bhkVar, this.e, (byte) 20)), 244));
            } else {
                listSingletonList = z6x.a;
            }
            List list = listSingletonList;
            smc0VarN = k4p1.n();
            bhkVar.getClass();
            bpx bpxVar = bpx.c;
            ygm ygmVar = new ygm(3);
            rgk rgkVar = rgk.f;
            String str3 = this.f;
            smc0VarN.add(new jhm("not_interested_in_event", (hux) bpxVar, (fhm) null, (Integer) 2131959152, (String) null, false, (tm81) null, new ihm(ygmVar, new ghm(rgkVar, new kak(str3, (byte) 3)), new xgk(bhkVar, str3, (byte) 1)), 244));
            str = this.Z;
            if (str.length() == 0) {
                smc0VarN.add(new jhm("not_interested_in_artist", (hux) tkx.c, (fhm) null, (Integer) 2131959150, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(rgk.e, new kak(str, (byte) 2)), new xgk(bhkVar, str, (byte) 0)), 244));
            }
            if (jhmVar != null) {
                smc0VarN.add(jhmVar);
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            lik1 lik1Var = new lik1(str3);
            zpk zpkVar = bhkVar.a;
            boolean z2 = bhkVar.c;
            String str4 = this.i;
            ypk ypkVar = new ypk(z2, !(str4 != null || str4.length() == 0), this.i, list, smc0VarK, 2);
            String str5 = this.t;
            String str6 = this.f;
            mfm.b(bhkVar.b.a(lik1Var), zpkVar.a(lik1Var, str6, str6, this.g, this.h, ypkVar, str5), this.X, new bjm(6, str3, (String) null), this.Y, 16);
            return rih1.a;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        objA = obj;
        jhmVar = (jhm) objA;
        k6kVar = this.c;
        if (k6kVar != null) {
            bhkVar.getClass();
            listSingletonList = Collections.singletonList(new jhm("add_to_calendar", (hux) qjx.c, (fhm) null, (Integer) 2131955775, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(rgk.c, rgk.d), new o0d(k6kVar, bhkVar, this.e, (byte) 20)), 244));
        } else {
            listSingletonList = z6x.a;
        }
        List list2 = listSingletonList;
        smc0VarN = k4p1.n();
        bhkVar.getClass();
        bpx bpxVar2 = bpx.c;
        ygm ygmVar2 = new ygm(3);
        rgk rgkVar2 = rgk.f;
        String str7 = this.f;
        smc0VarN.add(new jhm("not_interested_in_event", (hux) bpxVar2, (fhm) null, (Integer) 2131959152, (String) null, false, (tm81) null, new ihm(ygmVar2, new ghm(rgkVar2, new kak(str7, (byte) 3)), new xgk(bhkVar, str7, (byte) 1)), 244));
        str = this.Z;
        if (str.length() == 0) {
            smc0VarN.add(new jhm("not_interested_in_artist", (hux) tkx.c, (fhm) null, (Integer) 2131959150, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(rgk.e, new kak(str, (byte) 2)), new xgk(bhkVar, str, (byte) 0)), 244));
        }
        if (jhmVar != null) {
            smc0VarN.add(jhmVar);
        }
        smc0 smc0VarK2 = k4p1.k(smc0VarN);
        lik1 lik1Var2 = new lik1(str7);
        zpk zpkVar2 = bhkVar.a;
        boolean z3 = bhkVar.c;
        String str8 = this.i;
        ypk ypkVar2 = new ypk(z3, !(str8 != null || str8.length() == 0), this.i, list2, smc0VarK2, 2);
        String str9 = this.t;
        String str10 = this.f;
        mfm.b(bhkVar.b.a(lik1Var2), zpkVar2.a(lik1Var2, str10, str10, this.g, this.h, ypkVar2, str9), this.X, new bjm(6, str7, (String) null), this.Y, 16);
        return rih1.a;
    }
}
