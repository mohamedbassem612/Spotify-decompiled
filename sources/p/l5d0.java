package p;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l5d0 {
    public final zle1 a;
    public t45 b;

    public l5d0(zle1 zle1Var) {
        this.a = zle1Var;
    }

    public final void a() {
        t45 t45VarA = this.a.a("list_ux_platform");
        Iterator it = p7h.M(new String[]{"ListPage", "UntilLoadedState", "UntilListComposition"}).iterator();
        while (it.hasNext()) {
            t45.m(t45VarA, (String) it.next(), 2);
        }
        this.b = t45VarA;
    }

    public final void b(int i) {
        String str;
        t45 t45Var = this.b;
        if (t45Var != null) {
            t45Var.g("ListPage");
            switch (i) {
                case 1:
                    str = "SuccessNormal";
                    break;
                case 2:
                    str = "SuccessNoItemList";
                    break;
                case 3:
                    str = "SuccessEmptyItemList";
                    break;
                case 4:
                    str = "FailedLookup";
                    break;
                case 5:
                    str = "FailedTimeout";
                    break;
                case 6:
                    str = "FailedNotFound";
                    break;
                case 7:
                    str = "FailedForbidden";
                    break;
                case 8:
                    str = "FailedUnavailableForLegalReasons";
                    break;
                default:
                    throw null;
            }
            t45Var.a("outcome", str);
            this.a.b(t45Var.e());
        }
        this.b = null;
    }

    public final Object c(h5d0 h5d0Var, Function0 function0) {
        Object objI;
        t45 t45Var = this.b;
        return (t45Var == null || (objI = t45.i(t45Var, h5d0Var.toString(), function0)) == null) ? function0.invoke() : objI;
    }

    public final Object d(h5d0 h5d0Var, iu30 iu30Var) {
        return c(h5d0Var, new dt90((Object) this, (Object) h5d0Var, (Object) iu30Var, (byte) 8));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(h5d0 h5d0Var, iu30 iu30Var, onm onmVar) {
        j5d0 j5d0Var;
        t45 t45Var;
        if (onmVar instanceof j5d0) {
            j5d0Var = (j5d0) onmVar;
            int i = j5d0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                j5d0Var.e = i - Integer.MIN_VALUE;
            } else {
                j5d0Var = new j5d0(this, onmVar);
            }
        } else {
            j5d0Var = new j5d0(this, onmVar);
        }
        Object obj = j5d0Var.c;
        int i2 = j5d0Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            t45Var = this.b;
            d9n d9nVar = d9n.a;
            if (t45Var != null) {
                t45.m(t45Var, h5d0Var.toString(), 2);
                j5d0Var.a = h5d0Var;
                j5d0Var.b = t45Var;
                j5d0Var.e = 1;
                Object objInvoke = iu30Var.invoke(j5d0Var);
                if (objInvoke != d9nVar) {
                    obj = objInvoke;
                }
            } else {
                j5d0Var.a = null;
                j5d0Var.b = null;
                j5d0Var.e = 2;
                Object objInvoke2 = iu30Var.invoke(j5d0Var);
                if (objInvoke2 != d9nVar) {
                    return objInvoke2;
                }
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        t45Var = j5d0Var.b;
        h5d0Var = j5d0Var.a;
        hm5.M(obj);
        t45Var.g(h5d0Var.toString());
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(h5d0 h5d0Var, llm llmVar, ArrayList arrayList, onm onmVar) {
        k5d0 k5d0Var;
        t45 t45Var;
        if (onmVar instanceof k5d0) {
            k5d0Var = (k5d0) onmVar;
            int i = k5d0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                k5d0Var.e = i - Integer.MIN_VALUE;
            } else {
                k5d0Var = new k5d0(this, onmVar);
            }
        } else {
            k5d0Var = new k5d0(this, onmVar);
        }
        Object obj = k5d0Var.c;
        int i2 = k5d0Var.e;
        s45 s45Var = this.a;
        if (i2 == 0) {
            hm5.M(obj);
            t45 t45VarA = s45Var.a("list_ux_platform_" + h5d0Var);
            t45.m(t45VarA, h5d0Var.toString(), 4);
            iu30 nhbVar = new nhb(arrayList, llmVar, this, t45VarA, (lnm) null, (byte) 3);
            k5d0Var.a = h5d0Var;
            k5d0Var.b = t45VarA;
            k5d0Var.e = 1;
            Object objE = e(h5d0Var, nhbVar, k5d0Var);
            Object obj2 = d9n.a;
            if (objE == obj2) {
                return obj2;
            }
            t45Var = t45VarA;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t45Var = k5d0Var.b;
            h5d0Var = k5d0Var.a;
            hm5.M(obj);
        }
        t45Var.g(h5d0Var.toString());
        s45Var.b(t45Var.e());
        return rih1.a;
    }
}
