package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w4c1 {
    public final Function0 a;
    public m4c1 b = new m4c1(z6x.a);
    public ArrayList c = new ArrayList();

    public w4c1(Function0 function0) {
        this.a = function0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, onm onmVar) {
        v4c1 v4c1Var;
        w7c1 w7c1VarB;
        if (onmVar instanceof v4c1) {
            v4c1Var = (v4c1) onmVar;
            int i2 = v4c1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v4c1Var.d = i2 - Integer.MIN_VALUE;
            } else {
                v4c1Var = new v4c1(this, onmVar);
            }
        } else {
            v4c1Var = new v4c1(this, onmVar);
        }
        Object objA = v4c1Var.b;
        int i3 = v4c1Var.d;
        if (i3 == 0) {
            hm5.M(objA);
            if (i < 0 || i >= this.b.a.size()) {
                bhn0.x(i, "Story request before cache is initialized: ");
                return null;
            }
            e8c1 e8c1Var = (e8c1) this.b.a.get(i);
            if (e8c1Var instanceof c8c1) {
                v4c1Var.a = i;
                v4c1Var.d = 1;
                objA = ((c8c1) e8c1Var).a(v4c1Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!(e8c1Var instanceof d8c1)) {
                    eg.o();
                    return null;
                }
                w7c1VarB = ((d8c1) e8c1Var).b();
            }
            if (!(w7c1VarB instanceof u7c1)) {
                k220.p(f4i1.c(i, "Can't load story "), ((u7c1) w7c1VarB).a);
                return null;
            }
            if (w7c1VarB instanceof v7c1) {
                eg.o();
                return null;
            }
            ArrayList arrayList = this.c;
            a6c1 a6c1Var = ((v7c1) w7c1VarB).a;
            arrayList.set(i, new l9c1(a6c1Var));
            return a6c1Var;
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = v4c1Var.a;
        hm5.M(objA);
        w7c1VarB = (w7c1) objA;
        if (!(w7c1VarB instanceof u7c1)) {
            k220.p(f4i1.c(i, "Can't load story "), ((u7c1) w7c1VarB).a);
            return null;
        }
        if (w7c1VarB instanceof v7c1) {
            eg.o();
            return null;
        }
        ArrayList arrayList2 = this.c;
        a6c1 a6c1Var2 = ((v7c1) w7c1VarB).a;
        arrayList2.set(i, new l9c1(a6c1Var2));
        return a6c1Var2;
    }

    public final Object b(int i, a8d1 a8d1Var) {
        n9c1 n9c1Var = m9c1.a;
        n9c1 n9c1Var2 = (i < 0 || i >= this.c.size()) ? n9c1Var : (n9c1) this.c.get(i);
        if (n9c1Var2 instanceof l9c1) {
            return ((l9c1) n9c1Var2).a;
        }
        if (u890.j(n9c1Var2, n9c1Var)) {
            return a(i, a8d1Var);
        }
        eg.o();
        return null;
    }
}
