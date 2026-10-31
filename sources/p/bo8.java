package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bo8 implements sdm {
    public final jo8 a;
    public final sp00 b;
    public final f971 c;
    public final oh41 d;
    public final jl21 e;
    public final k9r f;
    public final gmt g;
    public final o860 h;
    public final boolean i;

    public bo8(jo8 jo8Var, sp00 sp00Var, f971 f971Var, oh41 oh41Var, jl21 jl21Var, k9r k9rVar, gmt gmtVar, o860 o860Var, boolean z) {
        this.a = jo8Var;
        this.b = sp00Var;
        this.c = f971Var;
        this.d = oh41Var;
        this.e = jl21Var;
        this.f = k9rVar;
        this.g = gmtVar;
        this.h = o860Var;
        this.i = z;
    }

    public final Object a(oim oimVar, us0 us0Var) {
        co8 co8Var = (co8) oimVar;
        return smo1.s(new zn8(co8Var.d, this, co8Var.a, co8Var.b, null), us0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        ao8 ao8Var;
        if (onmVar instanceof ao8) {
            ao8Var = (ao8) onmVar;
            int i = ao8Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ao8Var.c = i - Integer.MIN_VALUE;
            } else {
                ao8Var = new ao8(this, onmVar);
            }
        } else {
            ao8Var = new ao8(this, onmVar);
        }
        Object objB = ao8Var.a;
        int i2 = ao8Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            ao8Var.c = 1;
            objB = this.a.b(str, ao8Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        ho8 ho8Var = (ho8) objB;
        String str2 = ho8Var.c;
        Uri uri = (str2 == null || ihc1.y0(str2)) ? Uri.EMPTY : Uri.parse(ho8Var.c);
        String str3 = ho8Var.b;
        uri.getClass();
        return new igm(str3, new wfm(uri, agm.c), (String) null, 4);
    }
}
