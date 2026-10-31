package p;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oqv extends a8d1 implements xu30 {
    public /* synthetic */ qtb0 a;
    public final /* synthetic */ bw91 b;
    public final /* synthetic */ htv c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ vqv e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ ss50 g;
    public final /* synthetic */ ven0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqv(bw91 bw91Var, htv htvVar, Function0 function0, vqv vqvVar, iu30 iu30Var, ss50 ss50Var, ven0 ven0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.b = bw91Var;
        this.c = htvVar;
        this.d = function0;
        this.e = vqvVar;
        this.f = iu30Var;
        this.g = ss50Var;
        this.h = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ss50 ss50Var = this.g;
        ven0 ven0Var = this.h;
        oqv oqvVar = new oqv(this.b, this.c, this.d, this.e, this.f, ss50Var, ven0Var, (lnm) obj3);
        oqvVar.a = (qtb0) obj2;
        rih1 rih1Var = rih1.a;
        oqvVar.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        u380 u380VarSingleton;
        qtb0 qtb0Var = this.a;
        hm5.M(obj);
        int i = qtb0Var.a;
        bw91 bw91Var = this.b;
        ftv ftvVar = (ftv) bw91Var.get(i);
        ven0 ven0Var = this.h;
        nqm0 nqm0Var = (nqm0) ven0Var.getValue();
        htv htvVar = this.c;
        if (nqm0Var != null) {
            c380 c380Var = htvVar.l;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : c380Var) {
                if (nqm0Var.b.contains(((ftv) obj2).a)) {
                    arrayList.add(obj2);
                }
            }
            bw91Var.remove(i);
            bw91Var.addAll(i, arrayList);
            ven0Var.setValue((Object) null);
            this.d.invoke();
        }
        String str = ftvVar.a;
        String str2 = ftvVar.b;
        c380 c380Var2 = htvVar.l;
        if (nqm0Var == null || (u380VarSingleton = nqm0Var.b) == null) {
            u380VarSingleton = Collections.singleton(str);
        }
        this.e.p(this.b, str, str2, u380VarSingleton, c380Var2, this.f);
        this.g.a(16);
        return rih1.a;
    }
}
