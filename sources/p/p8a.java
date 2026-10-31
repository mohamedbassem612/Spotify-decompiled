package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p8a {
    public int a;
    public float b;
    public final Object c;

    public p8a(int i, boolean z) {
        this.a = 0;
        this.c = new float[i];
        this.b = 1.0f;
    }

    public void a(u8a u8aVar) {
        ArrayList arrayList = u8aVar.o;
        float size = arrayList.size() * 1.0f;
        float f = this.b / 2.0f;
        for (int i = 0; i < size; i++) {
            v8a v8aVar = (v8a) ((rzy) arrayList.get(i));
            if (v8aVar != null) {
                float f2 = ((rzy) v8aVar).c;
                float f3 = ((rzy) v8aVar).a;
                float f4 = f2 - f;
                float f5 = f2 + f;
                float f6 = f3 >= 0.0f ? f3 : 0.0f;
                if (f3 > 0.0f) {
                    f3 = 0.0f;
                }
                if (f6 > 0.0f) {
                    f6 *= 1.0f;
                } else {
                    f3 *= 1.0f;
                }
                float[] fArr = (float[]) this.c;
                int i2 = this.a;
                int i3 = i2 + 1;
                this.a = i3;
                fArr[i2] = f4;
                int i4 = i2 + 2;
                this.a = i4;
                fArr[i3] = f6;
                int i5 = i2 + 3;
                this.a = i5;
                fArr[i4] = f5;
                this.a = i2 + 4;
                fArr[i5] = f3;
            }
        }
        this.a = 0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float b(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        w9e1 w9e1Var = (w9e1) this.c;
        int i2 = 1;
        if (z) {
            int iN = iho1.n(w9e1Var.f, i, z);
            int lineStart = w9e1Var.f.getLineStart(iN);
            int iF = w9e1Var.f(iN);
            if (i == lineStart || i == iF) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        float fJ = z3 ? w9e1Var.j(i, z) : w9e1Var.k(i, z);
        if (z2) {
            this.a = i4;
            this.b = fJ;
        }
        return fJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(float f, onm onmVar) {
        io11 io11Var;
        if (onmVar instanceof io11) {
            io11Var = (io11) onmVar;
            int i = io11Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                io11Var.c = i - os00.INVALID_ID;
            } else {
                io11Var = new io11(this, onmVar);
            }
        } else {
            io11Var = new io11(this, onmVar);
        }
        Object objInvoke = io11Var.a;
        int i2 = io11Var.c;
        if (i2 == 0) {
            hm5.M(objInvoke);
            wxj wxjVar = (wxj) this.c;
            Float f2 = new Float(f);
            io11Var.c = 1;
            objInvoke = wxjVar.invoke(f2, io11Var);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objInvoke);
        }
        this.b += ((Number) objInvoke).floatValue();
        return rih1.a;
    }

    public p8a(int i, wxj wxjVar) {
        this.a = i;
        this.c = wxjVar;
    }

    public p8a(w9e1 w9e1Var) {
        this.c = w9e1Var;
        this.a = -1;
    }
}
