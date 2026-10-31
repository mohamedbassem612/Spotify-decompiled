package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mlu extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nlu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mlu(nlu nluVar, byte b) {
        super(1);
        this.a = b;
        this.b = nluVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nlu nluVar = this.b;
        switch (b) {
            case 0:
                rxr rxrVar = nluVar.a;
                String str = ((jbz) obj).f13p;
                dlg1 dlg1Var = rxrVar.g;
                String str2 = dlg1Var.l().b.h.b;
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-podcast-episode-card";
                x6h1VarI.f = "8.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str2;
                x6h1VarI.d = str;
                y6h1 y6h1VarA = x6h1VarI.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                ((i8h1) dlg1Var.a).f(k7h1Var.a(), (Set) null);
                return Boolean.TRUE;
            default:
                jbz jbzVar = (jbz) obj;
                boolean z = false;
                if (nluVar.b && (jbzVar.u || jbzVar.v)) {
                    rxr rxrVar2 = nluVar.a;
                    String str3 = jbzVar.f13p;
                    int i = jbzVar.o;
                    dlg1 dlg1Var2 = rxrVar2.g;
                    bpl0 bpl0VarL = dlg1Var2.l();
                    Integer numValueOf = Integer.valueOf(i);
                    x6h1 x6h1VarC = bpl0VarL.b.c();
                    x6h1VarC.i.add(new a7h1("episode_card_container", (String) null, numValueOf, str3, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("video_episode_label", (String) null, (Integer) null, str3, (String) null));
                    z = true;
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA2;
                    ((xjn) k7h1Var2).b = bpl0VarL.a;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    ((i8h1) dlg1Var2.a).f(k7h1Var2.a(), (Set) null);
                }
                return Boolean.valueOf(z);
        }
    }
}
