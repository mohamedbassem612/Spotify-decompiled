package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ume1 extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ane1 b;
    public final /* synthetic */ hdn0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ume1(boolean z, ane1 ane1Var, hdn0 hdn0Var, ven0 ven0Var) {
        super(1);
        this.a = z;
        this.b = ane1Var;
        this.c = hdn0Var;
        this.d = ven0Var;
    }

    public final Object invoke(Object obj) {
        boolean z = this.a;
        ane1 ane1Var = this.b;
        ven0 ven0Var = this.d;
        if (z) {
            sme1 sme1Var = ane1Var.k;
            String str = ane1Var.h;
            int year = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) ane1Var.a.get(this.c.s())).getYear();
            uba ubaVar = sme1Var.b;
            r6h1 r6h1VarB = bcl1.b(sme1Var.a, (hp80) null, str);
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-wrapped-time-machine";
            x6h1VarI.f = "1.0.0";
            x6h1VarI.g = "22.0.0";
            y6h1 y6h1VarA = x6h1VarI.a();
            Integer numValueOf = Integer.valueOf(year);
            x6h1 x6h1VarC = y6h1VarA.c();
            x6h1VarC.i.add(new a7h1("year_content", str, numValueOf, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA2 = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA2;
            ((xjn) k7h1Var).b = r6h1VarB;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            ven0Var.setValue(ubaVar.p(k7h1Var.a(), sme1.d));
        }
        return new w9d0(ane1Var, ven0Var, (byte) 25);
    }
}
