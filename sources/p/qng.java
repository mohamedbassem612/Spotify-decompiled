package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qng implements tyq {
    public final ljm0 X;
    public final psw Y;
    public final ia00 Z;
    public final d0r a;
    public final tai1 b;
    public final z710 c;
    public final boolean d;
    public final y7e1 e = new y7e1((String) null, 3);
    public final y7e1 f = new y7e1((String) null, 3);
    public final llm g;
    public boolean h;
    public final o3r i;
    public final km1 t;

    public qng(d0r d0rVar, tai1 tai1Var, z710 z710Var, boolean z) {
        this.a = d0rVar;
        this.b = tai1Var;
        this.c = z710Var;
        this.d = z;
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        this.g = smo1.e(flo1.l(j0d1VarB, pyf0.a.f));
        jd11 jd11Var = rc11.a;
        this.i = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 2, tzf.S0, new j4r(tzf.Q0), tzf.T0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, tzf.U0, new j4r(tzf.R0), tzf.V0), eqe.e1);
        this.t = new km1(this, (byte) 9);
        this.X = h7w.B(tzf.P0, (o8n) null, (iu30) null, new zee(this, (byte) 15), 6);
        j2i j2iVar = new j2i(-1851292739, new gtd(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.Y = new psw(j2iVar, (byte) 0);
        this.Z = n3o1.q(this).a(r0f.P0, r0f.Q0);
    }

    public final rqw a() {
        return this.Z;
    }

    public final jsw c() {
        return this.Y;
    }

    public final d0r e() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, Set set, onm onmVar) {
        ong ongVar;
        if (onmVar instanceof ong) {
            ongVar = (ong) onmVar;
            int i = ongVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ongVar.c = i - Integer.MIN_VALUE;
            } else {
                ongVar = new ong(this, onmVar);
            }
        } else {
            ongVar = new ong(this, onmVar);
        }
        Object obj = ongVar.a;
        int i2 = ongVar.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            String string = ihc1.e1(this.f.d().d.toString()).toString();
            if (string.length() != 0 && !set.isEmpty()) {
                mum mumVar = new mum(string);
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    hmg hmgVar = (hmg) it.next();
                    List list = hmgVar.b;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new tjn(new jvm(hmgVar.a, str, (String) it2.next()), mumVar));
                    }
                    r7h.W(arrayList2, arrayList);
                }
                if (!arrayList.isEmpty()) {
                    d0r d0rVar = this.a;
                    hvm hvmVar = hvm.a;
                    mqm mqmVar = new mqm(((tjn) o7h.q0(arrayList)).a, new lqm(Collections.singletonList(ovm.a), Collections.singletonList(cvm.a), (qle1) null, 4));
                    prm prmVar = new prm(arrayList);
                    ongVar.c = 1;
                    d0rVar.getClass();
                    Object objD = d0r.d(d0rVar, hvmVar, mqmVar, prmVar, ongVar);
                    d9n d9nVar = d9n.a;
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, onm onmVar) {
        png pngVar;
        if (onmVar instanceof png) {
            pngVar = (png) onmVar;
            int i = pngVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pngVar.c = i - Integer.MIN_VALUE;
            } else {
                pngVar = new png(this, onmVar);
            }
        } else {
            pngVar = new png(this, onmVar);
        }
        Object obj = pngVar.a;
        int i2 = pngVar.c;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            Object obj2 = ((e331) obj).a;
            return rih1Var;
        }
        hm5.M(obj);
        String string = ihc1.e1(this.e.d().d.toString()).toString();
        if (string.length() > 0) {
            pngVar.c = 1;
            Object objA = this.b.a(str, string, pngVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    public final mqw getBehavior() {
        return this.X;
    }

    public final f4r getData() {
        return this.t;
    }
}
