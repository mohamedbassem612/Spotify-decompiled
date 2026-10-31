package p;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e4t {
    public final lxg a;
    public final q8n b;
    public final q8n c;
    public final Set d;
    public final bpb1 e = gio1.b(b4t.c);

    public e4t(lxg lxgVar, q8n q8nVar, q8n q8nVar2, t380 t380Var) {
        this.a = lxgVar;
        this.b = q8nVar;
        this.c = q8nVar2;
        this.d = t380Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007f A[LOOP:0: B:29:0x0079->B:31:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(ViewGroup viewGroup, onm onmVar) {
        d4t d4tVar;
        Iterator it;
        if (onmVar instanceof d4t) {
            d4tVar = (d4t) onmVar;
            int i = d4tVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d4tVar.d = i - Integer.MIN_VALUE;
            } else {
                d4tVar = new d4t(this, onmVar);
            }
        } else {
            d4tVar = new d4t(this, onmVar);
        }
        Object obj = d4tVar.b;
        int i2 = d4tVar.d;
        Object obj2 = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                viewGroup = d4tVar.a;
                hm5.M(obj);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                viewGroup = d4tVar.a;
                hm5.M(obj);
            }
            it = this.d.iterator();
            while (it.hasNext()) {
                ((byf0) ((ynb0) it.next()).get()).g(viewGroup);
            }
            vr20 skrVar = new skr(this, (byte) 14);
            d4tVar.a = null;
            d4tVar.d = 3;
            this.e.collect(skrVar, d4tVar);
        }
        hm5.M(obj);
        d4tVar.a = viewGroup;
        d4tVar.d = 1;
        Object objH = c921.H(this.c, new n1o(this.a, (lnm) null, (byte) 23), d4tVar);
        if (objH != obj2) {
            objH = rih1.a;
        }
        if (objH == obj2) {
            return;
        }
        n3s n3sVar = new n3s(this, (lnm) null, (byte) 2);
        d4tVar.a = viewGroup;
        d4tVar.d = 2;
        if (c921.H(this.b, n3sVar, d4tVar) == obj2) {
            return;
        }
        it = this.d.iterator();
        while (it.hasNext()) {
            ((byf0) ((ynb0) it.next()).get()).g(viewGroup);
        }
        vr20 skrVar2 = new skr(this, (byte) 14);
        d4tVar.a = null;
        d4tVar.d = 3;
        this.e.collect(skrVar2, d4tVar);
    }

    public final void b(b4t b4tVar) {
        bpb1 bpb1Var = this.e;
        if (bpb1Var.getValue() == b4t.c && b4tVar == b4t.b) {
            return;
        }
        bpb1Var.m(null, b4tVar);
    }
}
