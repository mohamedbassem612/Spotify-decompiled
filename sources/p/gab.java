package p;

import java.io.Serializable;
import java.util.ArrayList;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gab {
    public final exc1 a;
    public final boolean b;

    public gab(exc1 exc1Var, u9b u9bVar) {
        this.a = exc1Var;
        this.b = u9bVar.a.u() && !u9bVar.a();
    }

    public final boolean a() {
        return this.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(onm onmVar) throws HttpException {
        fab fabVar;
        if (onmVar instanceof fab) {
            fabVar = (fab) onmVar;
            int i = fabVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fabVar.c = i - Integer.MIN_VALUE;
            } else {
                fabVar = new fab(this, onmVar);
            }
        } else {
            fabVar = new fab(this, onmVar);
        }
        Object objB = fabVar.a;
        int i2 = fabVar.c;
        if (i2 == 0) {
            hm5.M(objB);
            fabVar.c = 1;
            objB = this.a.b(fabVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        ArrayList<yef1> arrayList = ((zef1) objB).a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (yef1 yef1Var : arrayList) {
            arrayList2.add(new bxc1(yef1Var.a, yef1Var.b, yef1Var.c));
        }
        return arrayList2;
    }
}
