package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ytk extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ auk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ytk(auk aukVar, byte b) {
        super(0);
        this.a = b;
        this.b = aukVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        auk aukVar = this.b;
        switch (b) {
            case 0:
                kg0 kg0Var = aukVar.G1;
                if (kg0Var != null) {
                    kg0Var.c(new ckt(true, true), new ifl1((Object) null, (byte) 25), true);
                    return rih1Var;
                }
                u890.C("zeroNavigator");
                throw null;
            default:
                i8h1 i8h1Var = aukVar.I1;
                if (i8h1Var == null) {
                    u890.C("ubiLogger");
                    throw null;
                }
                r1m0 r1m0Var = aukVar.J1;
                if (r1m0Var == null) {
                    u890.C("startRetryScreenEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC = r1m0Var.a.c();
                x6h1VarC.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()));
                juk jukVar = aukVar.H1;
                if (jukVar != null) {
                    jukVar.a.a(new mhv0("start_retry", "retry", ew80.c, (String) null));
                    return rih1Var;
                }
                u890.C("configurationLoadingTracking");
                throw null;
        }
    }
}
