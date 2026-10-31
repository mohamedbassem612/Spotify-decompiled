package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q35 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q35(String str, String str2, String str3, d520 d520Var, String str4, gbk gbkVar, ArrayList arrayList, List list, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = d520Var;
        this.e = str4;
        this.g = gbkVar;
        this.h = arrayList;
        this.i = list;
        this.t = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.t;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                return new q35((r35) obj6, (yn71) obj5, (p371) obj4, this.b, this.c, this.d, (z771) obj3, this.e, (Context) obj2, lnmVar);
            default:
                return new q35(this.b, this.c, this.d, (d520) obj6, this.e, (gbk) obj5, (ArrayList) obj4, (List) obj3, (iu30) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.t;
        Object obj3 = this.i;
        Object obj4 = this.f;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (b) {
            case 0:
                hm5.M(obj);
                yn71 yn71Var = (yn71) obj6;
                Intent intentB = vnr.b(yn71Var, (p371) obj5);
                String str = this.e;
                String str2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                Context context = (Context) obj2;
                Intent intentCreateChooser = Intent.createChooser(intentB, context.getString(2131962269), ((r35) obj4).b.a(str2, str3, str4, str, (p371) obj5, (z771) obj3, null, (yn71) obj6).getIntentSender());
                intentCreateChooser.addFlags(268435456);
                context.startActivity(intentCreateChooser);
                return new ho71(yn71Var.b, yn71Var.a, yn71Var.d);
            default:
                hm5.M(obj);
                igm igmVar = new igm(this.b, new wfm(Uri.parse(this.c), yfm.c), this.d);
                gbk gbkVar = (gbk) obj6;
                d520 d520Var = (d520) obj4;
                ArrayList arrayList = (ArrayList) obj5;
                List list = (List) obj3;
                iu30 iu30Var = (iu30) obj2;
                smc0 smc0VarN = k4p1.n();
                if (gbkVar != null) {
                    smc0VarN.add(e6p1.h(new gmj(iu30Var, gbkVar, (byte) 8)));
                }
                f971 f971Var = (f971) d520Var.d;
                String str5 = this.e;
                smc0VarN.add(f971Var.a(str5, z6x.a, null));
                smc0VarN.add(new jhm("not_interested_in_events", bpx.c, (fhm) null, 2131956598, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(c6k.e, new irf(str5, (byte) 29)), new o0d(str5, arrayList, d520Var, (byte) 18)), 244));
                if (!list.isEmpty()) {
                    smc0VarN.add(new jhm("not_interested_in_artist", tkx.c, (fhm) null, 2131956596, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(c6k.d, new s6(list, (byte) 19)), new puh(d520Var, list, (byte) 26)), 244));
                }
                smc0VarN.add(((l6d) d520Var.e).a(str5));
                kjm kjmVar = new kjm(igmVar, k4p1.k(smc0VarN), 4);
                i4q i4qVar = (i4q) d520Var.b;
                Parcelable.Creator creator = lik1.CREATOR;
                mfm.c(i4qVar.a(new lik1(str5)), kjmVar, (p6r0) null, (bjm) null, (tv80) null, 22);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q35(r35 r35Var, yn71 yn71Var, p371 p371Var, String str, String str2, String str3, z771 z771Var, String str4, Context context, lnm lnmVar) {
        super(2, lnmVar);
        this.f = r35Var;
        this.g = yn71Var;
        this.h = p371Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.i = z771Var;
        this.e = str4;
        this.t = context;
    }
}
