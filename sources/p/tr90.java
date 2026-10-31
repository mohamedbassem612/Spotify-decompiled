package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tr90 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ur90 b;
    public final /* synthetic */ pp90 c;
    public final /* synthetic */ aut d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tr90(ur90 ur90Var, pp90 pp90Var, aut autVar, byte b) {
        super(0);
        this.a = b;
        this.b = ur90Var;
        this.c = pp90Var;
        this.d = autVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        aut autVar = this.d;
        pp90 pp90Var = this.c;
        ur90 ur90Var = this.b;
        switch (b) {
            case 0:
                tz5 tz5Var = (tz5) ur90Var.e.b;
                String str = pp90Var.a;
                int i = autVar.b;
                qq80 qq80VarC = ur90.c(autVar);
                String str2 = autVar.i;
                i8h1 i8h1Var = tz5Var.a;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-connect-menu";
                x6h1VarI.f = "6.6.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "connect/devicepicker");
                x6h1VarR.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                y6h1 y6h1VarA = x6h1VarR.a();
                String str3 = qq80VarC.a;
                Integer numValueOf = Integer.valueOf(i);
                x6h1 x6h1VarC = y6h1VarA.c();
                x6h1VarC.i.add(new a7h1("connect_device", (String) null, numValueOf, str3, str2));
                x6h1VarC.j = true;
                y6h1 y6h1VarA2 = x6h1VarC.a();
                String strC = kno1.C(qq80VarC);
                x6h1 x6h1VarC2 = y6h1VarA2.c();
                x6h1VarC2.i.add(new a7h1("jam_session", str, (Integer) null, (String) null, strC));
                x6h1VarC2.j = true;
                zor.k(ur90Var.d, autVar.f, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a, 28);
                break;
            default:
                tz5 tz5Var2 = (tz5) ur90Var.e.b;
                String str4 = pp90Var.a;
                int i2 = autVar.b;
                qq80 qq80VarC2 = ur90.c(autVar);
                String str5 = autVar.i;
                i8h1 i8h1Var2 = tz5Var2.a;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-connect-menu";
                x6h1VarI2.f = "6.6.0";
                x6h1VarI2.g = "22.0.0";
                x6h1 x6h1VarR2 = kk0.r(x6h1VarI2, "connect/devicepicker");
                x6h1VarR2.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR2.j = false;
                y6h1 y6h1VarA3 = x6h1VarR2.a();
                String str6 = qq80VarC2.a;
                Integer numValueOf2 = Integer.valueOf(i2);
                x6h1 x6h1VarC3 = y6h1VarA3.c();
                x6h1VarC3.i.add(new a7h1("connect_device", (String) null, numValueOf2, str6, str5));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA4 = x6h1VarC3.a();
                String strC2 = kno1.C(qq80VarC2);
                x6h1 x6h1VarC4 = y6h1VarA4.c();
                x6h1VarC4.i.add(new a7h1("jam_session", str4, (Integer) null, (String) null, strC2));
                x6h1VarC4.j = true;
                String str7 = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                break;
        }
        return rih1Var;
    }
}
