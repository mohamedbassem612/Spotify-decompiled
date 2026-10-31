package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ljl implements z291, xlb0 {
    public long a = xpi1.a;
    public ArrayList b = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(lnm lnmVar) throws Throwable {
        kjl kjlVar;
        p811 p811Var;
        Throwable th;
        w4u w4uVar;
        if (lnmVar instanceof kjl) {
            kjlVar = (kjl) lnmVar;
            int i = kjlVar.d;
            if ((i & os00.INVALID_ID) != 0) {
                kjlVar.d = i - os00.INVALID_ID;
            } else {
                kjlVar = new kjl(this, (onm) lnmVar);
            }
        } else {
            kjlVar = new kjl(this, (onm) lnmVar);
        }
        Object obj = kjlVar.b;
        int i2 = kjlVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            if (hjl.l(this.a)) {
                p811 p811Var2 = new p811();
                try {
                    kjlVar.a = p811Var2;
                    kjlVar.d = 1;
                    ohd ohdVar = new ohd(1, aym.t(kjlVar));
                    ohdVar.t();
                    p811Var2.a = ohdVar;
                    this.b.add(ohdVar);
                    Object objR = ohdVar.r();
                    d9n d9nVar = d9n.a;
                    if (objR == d9nVar) {
                        return d9nVar;
                    }
                    p811Var = p811Var2;
                    ArrayList arrayList = this.b;
                    w0h1.i(arrayList).remove(p811Var.a);
                } catch (Throwable th2) {
                    p811Var = p811Var2;
                    th = th2;
                    ArrayList arrayList2 = this.b;
                    w0h1.i(arrayList2).remove(p811Var.a);
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p811Var = kjlVar.a;
            try {
                hm5.M(obj);
                ArrayList arrayList3 = this.b;
                w0h1.i(arrayList3).remove(p811Var.a);
            } catch (Throwable th3) {
                th = th3;
                ArrayList arrayList4 = this.b;
                w0h1.i(arrayList4).remove(p811Var.a);
                throw th;
            }
        }
        long j = this.a;
        int i3 = hjl.i(j);
        w4u w4uVar2 = y4u.a;
        if (i3 != Integer.MAX_VALUE) {
            w4u.a(i3);
            w4uVar = new w4u(i3);
        } else {
            w4uVar = w4uVar2;
        }
        int iH = hjl.h(j);
        if (iH != Integer.MAX_VALUE) {
            w4u.a(iH);
            w4uVar2 = new w4u(iH);
        }
        return new k291(w4uVar, w4uVar2);
    }

    public final void b(long j) {
        this.a = j;
        if (hjl.l(j)) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        this.b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((lnm) it.next()).resumeWith(rih1.a);
        }
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        b(j);
        q5t0 q5t0VarH = afh0Var.H(j);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 4));
    }
}
