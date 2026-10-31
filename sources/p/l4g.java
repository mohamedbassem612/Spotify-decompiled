package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l4g {
    public final Function0 a;
    public final o95 b;
    public final o95 c;
    public final o95 d;
    public final o95 e;

    public l4g(p3g p3gVar) {
        float f = p3gVar == p3g.b ? 1.0f : 0.0f;
        this.a = nyf.f;
        this.b = c97.b(f);
        this.c = c97.b(1.0f);
        this.d = c97.b(1.0f);
        this.e = c97.b(1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(p3g p3gVar, boolean z, onm onmVar) {
        j4g j4gVar;
        float f;
        Float f2;
        Float f3;
        if (onmVar instanceof j4g) {
            j4gVar = (j4g) onmVar;
            int i = j4gVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                j4gVar.e = i - Integer.MIN_VALUE;
            } else {
                j4gVar = new j4g(this, onmVar);
            }
        } else {
            j4gVar = new j4g(this, onmVar);
        }
        Object obj = j4gVar.c;
        int i2 = j4gVar.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            float f4 = p3gVar == p3g.b ? 1.0f : 0.0f;
            o95 o95Var = this.b;
            if (((Number) o95Var.e.getValue()).floatValue() != f4 || o95Var.f()) {
                if (z) {
                    k4g k4gVar = new k4g(p3gVar, this, f4, null);
                    j4gVar.a = z;
                    j4gVar.b = f4;
                    j4gVar.e = 5;
                    if (smo1.s(k4gVar, j4gVar) == d9nVar) {
                    }
                } else {
                    Float f5 = new Float(f4);
                    j4gVar.a = z;
                    j4gVar.b = f4;
                    j4gVar.e = 1;
                    if (o95Var.g(f5, j4gVar) != d9nVar) {
                        f = f4;
                    }
                }
                return d9nVar;
            }
            return rih1Var;
        }
        if (i2 == 1) {
            f = j4gVar.b;
            z = j4gVar.a;
            hm5.M(obj);
        } else {
            if (i2 == 2) {
                f = j4gVar.b;
                z = j4gVar.a;
                hm5.M(obj);
                f2 = new Float(1.0f);
                j4gVar.a = z;
                j4gVar.b = f;
                j4gVar.e = 3;
                if (this.d.g(f2, j4gVar) != d9nVar) {
                }
                return d9nVar;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                if (i2 == 5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = j4gVar.b;
            z = j4gVar.a;
            hm5.M(obj);
        }
        f3 = new Float(1.0f);
        j4gVar.a = z;
        j4gVar.b = f;
        j4gVar.e = 4;
        if (this.e.g(f3, j4gVar) != d9nVar) {
            return d9nVar;
        }
        return rih1Var;
        Float f6 = new Float(1.0f);
        j4gVar.a = z;
        j4gVar.b = f;
        j4gVar.e = 2;
        if (this.c.g(f6, j4gVar) != d9nVar) {
            f2 = new Float(1.0f);
            j4gVar.a = z;
            j4gVar.b = f;
            j4gVar.e = 3;
            if (this.d.g(f2, j4gVar) != d9nVar) {
                f3 = new Float(1.0f);
                j4gVar.a = z;
                j4gVar.b = f;
                j4gVar.e = 4;
                if (this.e.g(f3, j4gVar) != d9nVar) {
                    return rih1Var;
                }
            }
        }
        return d9nVar;
    }
}
