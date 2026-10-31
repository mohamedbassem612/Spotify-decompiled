package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b4s {
    public final ynb0 a;
    public final ynb0 b;

    public b4s(ynb0 ynb0Var, ynb0 ynb0Var2) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        a4s a4sVar;
        String str2;
        mfd mfdVar;
        if (onmVar instanceof a4s) {
            a4sVar = (a4s) onmVar;
            int i = a4sVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                a4sVar.d = i - Integer.MIN_VALUE;
            } else {
                a4sVar = new a4s(this, onmVar);
            }
        } else {
            a4sVar = new a4s(this, onmVar);
        }
        Object objI = a4sVar.b;
        int i2 = a4sVar.d;
        boolean z = false;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objI);
                if (ihc1.y0(str)) {
                    return Boolean.FALSE;
                }
                mr20 mr20VarB = ((kbd) this.a.get()).b();
                a4sVar.a = str;
                a4sVar.d = 1;
                objI = b5p1.i(mr20VarB, a4sVar);
                if (objI == d9nVar) {
                }
                return d9nVar;
            }
            if (i2 == 1) {
                str = a4sVar.a;
                hm5.M(objI);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = a4sVar.a;
                hm5.M(objI);
            }
            mfdVar = (mfd) objI;
            if (mfdVar != null && u890.j(mfdVar.a, str2) && mfdVar.b) {
                z = true;
            }
            return Boolean.valueOf(z);
            if (!((Boolean) objI).booleanValue()) {
                return Boolean.FALSE;
            }
            bfd bfdVar = (bfd) this.b.get();
            a4sVar.a = str;
            a4sVar.d = 2;
            bfdVar.getClass();
            objI = bfd.b(bfdVar, str, a4sVar);
            if (objI != d9nVar) {
                str2 = str;
                mfdVar = (mfd) objI;
                if (mfdVar != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            return d9nVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }
}
