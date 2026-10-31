package p;

import androidx.compose.foundation.gestures.FlingCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y14 implements bs41 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y14(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final float f(float f) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                a24 a24Var = (a24) obj2;
                float fE = a24Var.j1.e(f);
                float fS = fE - a24Var.j1.j.s();
                ((o24) obj).a(fE, 0.0f);
                return fS;
            default:
                du41 du41Var = (du41) obj2;
                if (Math.abs(f) == 0.0f || ((Boolean) du41Var.h.invoke()).booleanValue()) {
                    return du41Var.e(du41Var.h(((cu41) obj).a(2, du41Var.f(du41Var.i(f)))));
                }
                throw new FlingCancellationException();
        }
    }
}
