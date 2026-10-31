package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x8z extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8z(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.t = str9;
        this.X = str10;
        this.Y = str11;
        this.Z = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        Object obj6 = this.t;
        Object obj7 = this.i;
        Object obj8 = this.h;
        Object obj9 = this.g;
        Object obj10 = this.f;
        Object obj11 = this.e;
        Object obj12 = this.d;
        Object obj13 = this.c;
        Object obj14 = this.b;
        switch (b) {
            case 0:
                ymd0 ymd0Var = (ymd0) obj;
                iac0 iac0Var = (iac0) obj2;
                tae taeVarA = ((yyo) obj14).a(cto1.q(iac0Var), (zob1) ((iu30) obj13).invoke(iac0Var));
                slq0 slq0VarA = ((fap) obj8).a(cto1.q(iac0Var), (b2v0) ((iu30) obj12).invoke(iac0Var), ymd0Var);
                slq0 slq0VarA2 = xyo.a((xyo) obj7, cto1.q(iac0Var), (p421) ((iu30) obj11).invoke(iac0Var), (bpb1) null, 4);
                m9v0 m9v0Var = new m9v0(cto1.q(iac0Var), (c9v0) ((iu30) obj10).invoke(iac0Var));
                o241 o241Var = (o241) obj6;
                tae taeVar = new tae(o241Var, ymd0Var, cto1.q(iac0Var), (drp0) obj5);
                return l6o1.A(new jpg0(f6o1.A(((vyo) obj4).a((wxu) ((iu30) obj9).invoke(iac0Var), f46.i0(new slq0[]{new m9v0(o241Var, ymd0Var, cto1.q(iac0Var)), taeVar, m9v0Var, taeVarA, slq0VarA, slq0VarA2}), (q8n) obj3), new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2), new w8z(ymd0Var, (byte) 2)));
            default:
                ((Number) obj2).intValue();
                j1p1.h((String) obj14, (String) obj13, (String) obj12, (String) obj11, (String) obj10, (String) obj9, (String) obj8, (String) obj7, (String) obj6, (String) obj5, (String) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8z(yyo yyoVar, iu30 iu30Var, fap fapVar, iu30 iu30Var2, xyo xyoVar, iu30 iu30Var3, iu30 iu30Var4, o241 o241Var, drp0 drp0Var, vyo vyoVar, iu30 iu30Var5, q8n q8nVar) {
        super(2);
        this.b = yyoVar;
        this.c = iu30Var;
        this.h = fapVar;
        this.d = iu30Var2;
        this.i = xyoVar;
        this.e = iu30Var3;
        this.f = iu30Var4;
        this.t = o241Var;
        this.X = drp0Var;
        this.Y = vyoVar;
        this.g = iu30Var5;
        this.Z = q8nVar;
    }
}
