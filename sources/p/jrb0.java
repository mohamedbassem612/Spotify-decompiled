package p;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jrb0 implements pua0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ iu30 b;
    public Object c;
    public final /* synthetic */ qua0 d;

    public jrb0(p811 p811Var, krb0 krb0Var, iu30 iu30Var) {
        this.c = p811Var;
        this.d = krb0Var;
        this.b = iu30Var;
    }

    public final Map a(Set set) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        iu30 iu30Var = this.b;
        qua0 qua0Var = this.d;
        switch (b) {
            case 0:
                p811 p811Var = (p811) this.c;
                if (p811Var.a == null && set.isEmpty()) {
                    return b7xVar;
                }
                pua0 pua0VarC = (pua0) p811Var.a;
                if (pua0VarC == null) {
                    pua0VarC = ((qua0) ((krb0) qua0Var).b.getValue()).c(iu30Var);
                    p811Var.a = pua0VarC;
                }
                return pua0VarC.a(set);
            default:
                i1c0 i1c0Var = (i1c0) qua0Var;
                lnm lnmVar = null;
                if (((xab1) this.c) == null) {
                    i1c0Var.f.a();
                    this.c = fn31.T(smo1.e(i1c0Var.c), (o8n) null, 0, new ss90(i1c0Var, iu30Var, lnmVar, (byte) 16), 3);
                }
                i1c0Var.e.m((Object) null, set);
                return b7xVar;
        }
    }

    public final void b(Set set) {
        switch (this.a) {
            case 0:
                pua0 pua0Var = (pua0) ((p811) this.c).a;
                if (pua0Var != null) {
                    pua0Var.b(set);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object c(List list, onm onmVar) {
        f1c0 f1c0Var;
        Iterator it;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        qua0 qua0Var = this.d;
        switch (b) {
            case 0:
                p811 p811Var = (p811) this.c;
                pua0 pua0VarC = (pua0) p811Var.a;
                if (pua0VarC == null) {
                    pua0VarC = ((qua0) ((krb0) qua0Var).b.getValue()).c(this.b);
                    p811Var.a = pua0VarC;
                }
                Object objC = pua0VarC.c(list, onmVar);
                return objC == d9nVar ? objC : rih1Var;
            default:
                i1c0 i1c0Var = (i1c0) qua0Var;
                boolean z = i1c0Var.d;
                zxl zxlVar = i1c0Var.a;
                if (onmVar instanceof f1c0) {
                    f1c0Var = (f1c0) onmVar;
                    int i = f1c0Var.d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        f1c0Var.d = i - Integer.MIN_VALUE;
                    } else {
                        f1c0Var = new f1c0(this, onmVar);
                    }
                } else {
                    f1c0Var = new f1c0(this, onmVar);
                }
                Object obj = f1c0Var.b;
                int i2 = f1c0Var.d;
                if (i2 != 0) {
                    if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                        it = f1c0Var.a;
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                it = list.iterator();
                while (it.hasNext()) {
                    mmr0 mmr0Var = (mmr0) it.next();
                    Object obj2 = mmr0Var.b;
                    Object obj3 = mmr0Var.a;
                    d10 d10Var = (d10) obj2;
                    if (u890.j(d10Var, qz.a)) {
                        zxlVar.a.j(new String[]{(String) obj3}, true);
                        if (z) {
                            List listSingletonList = Collections.singletonList(obj3);
                            f1c0Var.a = it;
                            f1c0Var.d = 1;
                            if (i1c0Var.f(listSingletonList, f1c0Var) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            continue;
                        }
                    } else if (u890.j(d10Var, rz.a)) {
                        zxlVar.a((String) obj3);
                        if (z) {
                            List listSingletonList2 = Collections.singletonList(obj3);
                            f1c0Var.a = it;
                            f1c0Var.d = 2;
                            if (i1c0Var.g(listSingletonList2, f1c0Var) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            continue;
                        }
                    } else if (d10Var instanceof sz) {
                        List list2 = ((sz) d10Var).a;
                        zxlVar.a.j((String[]) list2.toArray(new String[0]), true);
                        if (z) {
                            f1c0Var.a = it;
                            f1c0Var.d = 3;
                            if (i1c0Var.f(list2, f1c0Var) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (!(d10Var instanceof tz)) {
                            eg.o();
                            return null;
                        }
                        List list3 = ((tz) d10Var).a;
                        zxlVar.a.j((String[]) list3.toArray(new String[0]), false);
                        if (z) {
                            f1c0Var.a = it;
                            f1c0Var.d = 4;
                            if (i1c0Var.g(list3, f1c0Var) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return rih1Var;
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                pua0 pua0Var = (pua0) ((p811) this.c).a;
                if (pua0Var != null) {
                    pua0Var.dispose();
                }
                break;
            default:
                if (((xab1) this.c) != null) {
                    this.d.f.b();
                    xab1 xab1Var = (xab1) this.c;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    this.c = null;
                }
                break;
        }
    }

    public jrb0(i1c0 i1c0Var, iu30 iu30Var) {
        this.d = i1c0Var;
        this.b = iu30Var;
    }

    private final void d(Set set) {
    }
}
