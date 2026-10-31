package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vep0 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ cv30 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vep0(g931 g931Var, String str, String str2, String str3, int i, String str4, iu30 iu30Var, qim0 qim0Var, Long l, int i2) {
        super(2);
        this.a = (byte) 1;
        this.e = g931Var;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.b = i;
        this.i = str4;
        this.c = iu30Var;
        this.t = qim0Var;
        this.X = l;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.X;
        iu30 iu30Var = this.c;
        Object obj4 = this.t;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.e;
        switch (b) {
            case 0:
                hav0 hav0Var = (hav0) obj;
                float fFloatValue = ((Number) obj2).floatValue();
                ((tui1) obj9).a(hav0Var.b, hav0Var.c);
                int i2 = this.d;
                fn31.T((c9n) obj8, (o8n) null, 0, new uep0(fFloatValue, (gf6) obj7, (o95) obj6, this.b, (hdn0) obj5, (ss50) obj4, iu30Var, (tr80) obj3, i2, (lnm) null), 3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                int i3 = this.b;
                ((g931) obj9).b((String) obj8, (String) obj7, (String) obj6, i3, (String) obj5, iu30Var, (qim0) obj4, (Long) obj3, (b0k) obj, iP);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                int i4 = this.b;
                qon1.d((String) obj9, (String) obj8, (String) obj7, (String) obj6, (String) obj5, i4, (Function0) obj4, (Function0) iu30Var, (qim0) obj3, (b0k) obj, iP2);
                break;
            default:
                hav0 hav0Var2 = (hav0) obj;
                float fFloatValue2 = ((Number) obj2).floatValue();
                ((tui1) obj9).a(hav0Var2.b, hav0Var2.c);
                int i5 = this.d;
                fn31.T((c9n) obj8, (o8n) null, 0, new uep0((nav0) obj7, fFloatValue2, (o95) obj6, this.b, (hdn0) obj5, (ss50) obj4, iu30Var, (tr80) obj3, i5, (lnm) null), 3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vep0(String str, String str2, String str3, String str4, String str5, int i, Function0 function0, Function0 function1, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.b = i;
        this.t = function0;
        this.c = function1;
        this.X = qim0Var;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vep0(tui1 tui1Var, c9n c9nVar, Object obj, o95 o95Var, int i, hdn0 hdn0Var, ss50 ss50Var, iu30 iu30Var, tr80 tr80Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.e = tui1Var;
        this.f = c9nVar;
        this.g = obj;
        this.h = o95Var;
        this.b = i;
        this.i = hdn0Var;
        this.t = ss50Var;
        this.c = iu30Var;
        this.X = tr80Var;
        this.d = i2;
    }
}
