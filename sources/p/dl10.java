package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dl10 implements xbc1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dl10(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(Parcelable parcelable, zbc1 zbc1Var) {
        switch (this.a) {
            case 0:
                return b((w371) parcelable, zbc1Var);
            default:
                cik1 cik1VarJ = ((xap) this.b).j();
                return fn31.Y((q8n) cik1VarJ.e, new agm1((phm1) parcelable, cik1VarJ, (lnm) null), zbc1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(w371 w371Var, onm onmVar) {
        cl10 cl10Var;
        if (onmVar instanceof cl10) {
            cl10Var = (cl10) onmVar;
            int i = cl10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cl10Var.c = i - Integer.MIN_VALUE;
            } else {
                cl10Var = new cl10(this, onmVar);
            }
        } else {
            cl10Var = new cl10(this, onmVar);
        }
        Object objY = cl10Var.a;
        int i2 = cl10Var.c;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objY);
            x371 x371Var = (x371) this.b;
            cl10Var.c = 1;
            objY = fn31.Y(b3s.c, new lm61(x371Var, w371Var, lnmVar, (byte) 7), cl10Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return ((b871) objY).a;
    }
}
