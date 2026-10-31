package p;

import com.spotify.mobius.Loop;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jlm extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlm(klm klmVar, String str, dwo dwoVar) {
        super(0);
        this.a = (byte) 1;
        this.b = klmVar;
        this.c = str;
        this.d = dwoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        abu0 abu0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((l811) obj2).a = ((klm) obj3).d.containsKey((String) obj);
                return rih1Var;
            case 1:
                ((klm) obj3).d.put((String) obj, (dwo) obj2);
                return rih1Var;
            case 2:
                u601 u601Var = (u601) obj;
                iu30 iu30Var = (iu30) obj3;
                euu euuVar = (euu) obj2;
                if (!luu.l(euuVar)) {
                    h2v h2vVarF = euuVar.f();
                    if (h2vVarF.equals(f2v.a)) {
                        n8h1 n8h1VarC = mno1.C((op80) u601Var.getValue());
                        iu30Var.invoke(new ytu(n8h1VarC != null ? n8h1VarC.b() : null));
                    } else if (h2vVarF.equals(c2v.a)) {
                        n8h1 n8h1VarC2 = mno1.C((op80) u601Var.getValue());
                        iu30Var.invoke(new ztu(n8h1VarC2 != null ? n8h1VarC2.b() : null));
                    } else if ((h2vVarF instanceof e2v) || h2vVarF.equals(g2v.a)) {
                        iu30Var.invoke(xtu.a);
                    } else if (!h2vVarF.equals(d2v.a)) {
                        eg.o();
                        return null;
                    }
                }
                return rih1Var;
            case 3:
                qhd1 qhd1Var = (qhd1) obj;
                if (((apd) obj2).a() instanceof g80) {
                    cqn0 cqn0Var = cqn0.a;
                    w7h1 w7h1VarA = ((py9) obj3).i().a("spotify:collection");
                    ou80 ou80Var = qhd1.g(qhd1Var).m(w7h1VarA, null).a;
                    qhd1.e(qhd1Var).a(w7h1VarA, ou80Var);
                    Loop loopF = qhd1.f(qhd1Var);
                    if (loopF != null) {
                        mym.l(loopF, new rgd1(ou80Var, cqn0Var));
                    }
                }
                return rih1Var;
            default:
                qtg.h((ven0) obj3);
                zau0 zau0Var = (zau0) obj2;
                if (zau0Var != null && (abu0Var = (abu0) ((Function0) obj).invoke()) != null) {
                    abu0Var.a(zau0Var);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jlm(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlm(luu luuVar, euu euuVar, iu30 iu30Var, u601 u601Var) {
        super(0);
        this.a = (byte) 2;
        this.d = euuVar;
        this.b = iu30Var;
        this.c = u601Var;
    }
}
