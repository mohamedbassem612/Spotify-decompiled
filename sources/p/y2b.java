package p;

import android.os.Parcelable;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y2b implements h0r0 {
    public final qyj a;
    public final b3b b;
    public final n4b c;
    public final kt91 d;
    public final it8 e;
    public final cbr0 f;

    public y2b(qyj qyjVar, b3b b3bVar, n4b n4bVar, kt91 kt91Var, it8 it8Var) {
        this.a = qyjVar;
        this.b = b3bVar;
        this.c = n4bVar;
        this.d = kt91Var;
        this.e = it8Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarC0 = yon1.c0();
        Parcelable.Creator creator = lik1.CREATOR;
        this.f = new cbr0(new dbr0[]{new bn70(p6r0VarC0, oap1.i(d3b.a()), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, true, (nsm0) null, 3837)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return this.a.a(apo.j(514657027, new cka(this, (byte) 6), true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        x2b x2bVar;
        if (onmVar instanceof x2b) {
            x2bVar = (x2b) onmVar;
            int i = x2bVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x2bVar.d = i - Integer.MIN_VALUE;
            } else {
                x2bVar = new x2b(this, onmVar);
            }
        } else {
            x2bVar = new x2b(this, onmVar);
        }
        Object objS = x2bVar.b;
        int i2 = x2bVar.d;
        z6x z6xVar = z6x.a;
        try {
            if (i2 == 0) {
                hm5.M(objS);
                b3b b3bVar = this.b;
                if (ihc1.y0(b3bVar.a())) {
                    return new cuc1(z6xVar);
                }
                n4b n4bVar = this.c;
                String strA = b3bVar.a();
                x2bVar.a = str;
                x2bVar.d = 1;
                objS = n4bVar.s(strA, x2bVar);
                Object obj = d9n.a;
                if (objS == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = x2bVar.a;
                hm5.M(objS);
            }
            return new cuc1((List) objS);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            this.d.k(k4k.q(str).c());
            return new cuc1(z6xVar);
        }
    }
}
