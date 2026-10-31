package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g6e {
    public final ynb0 a;
    public final zeu b;

    public g6e(ynb0 ynb0Var, zeu zeuVar) {
        this.a = ynb0Var;
        this.b = zeuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(k6e k6eVar, onm onmVar) {
        f6e f6eVar;
        if (onmVar instanceof f6e) {
            f6eVar = (f6e) onmVar;
            int i = f6eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f6eVar.c = i - Integer.MIN_VALUE;
            } else {
                f6eVar = new f6e(this, onmVar);
            }
        } else {
            f6eVar = new f6e(this, onmVar);
        }
        Object objI = f6eVar.a;
        int i2 = f6eVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objI);
                zeu zeuVar = this.b;
                mr20 mr20VarU = rqt0.u(new ipr(yoi1.g(((uu00) zeuVar.b).b(new oi("categorized_video_list_artist_page", false, new nit(zeuVar, (byte) 19)))), zeuVar, k6eVar.a, (byte) 7));
                f6eVar.c = 1;
                objI = b5p1.i(mr20VarU, f6eVar);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objI);
            }
            return new o6e((b6e) objI);
        } catch (Exception unused) {
            return n6e.a;
        }
    }
}
