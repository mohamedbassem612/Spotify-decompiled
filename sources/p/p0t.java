package p;

import com.google.android.gms.common.api.AvailabilityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p0t {
    public p0t() {
        Object obj = lz40.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(s0o1 s0o1Var, onm onmVar) {
        o0t o0tVar;
        if (onmVar instanceof o0t) {
            o0tVar = (o0t) onmVar;
            int i = o0tVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0tVar.c = i - Integer.MIN_VALUE;
            } else {
                o0tVar = new o0t(this, onmVar);
            }
        } else {
            o0tVar = new o0t(this, onmVar);
        }
        Object obj = o0tVar.a;
        int i2 = o0tVar.c;
        boolean z = false;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                hfp1 hfp1VarD = lz40.d(s0o1Var, new kz40[0]);
                o0tVar.c = 1;
                Object objL = u890.l(hfp1VarD, o0tVar);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            z = true;
        } catch (AvailabilityException unused) {
        }
        return Boolean.valueOf(z);
    }
}
