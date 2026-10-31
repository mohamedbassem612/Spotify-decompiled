package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class buj0 {
    public static final long h;
    public final jjk0 a;
    public final d520 b;
    public final bjk0 c;
    public final z9k0 d;
    public final zwz0 e;
    public final lzn0 f;
    public final q8n g;

    static {
        ytw0 ytw0Var = jfv.b;
        h = fdg1.k0(5, ngv.e);
    }

    public buj0(jjk0 jjk0Var, d520 d520Var, bjk0 bjk0Var, z9k0 z9k0Var, zwz0 zwz0Var, lzn0 lzn0Var, q8n q8nVar) {
        this.a = jjk0Var;
        this.b = d520Var;
        this.c = bjk0Var;
        this.d = z9k0Var;
        this.e = zwz0Var;
        this.f = lzn0Var;
        this.g = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:71:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
    
        if (r3 == r13) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        r6 = r3;
        r3 = r0;
        r0 = r6;
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e9, code lost:
    
        if (r3 == r13) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fb, code lost:
    
        if (r3 == r13) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r16, p.tv80 r17, p.onm r18) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.buj0.a(java.lang.String, p.tv80, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        auj0 auj0Var;
        Object objE;
        if (onmVar instanceof auj0) {
            auj0Var = (auj0) onmVar;
            int i = auj0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                auj0Var.d = i - Integer.MIN_VALUE;
            } else {
                auj0Var = new auj0(this, onmVar);
            }
        } else {
            auj0Var = new auj0(this, onmVar);
        }
        Object obj = auj0Var.b;
        int i2 = auj0Var.d;
        jjk0 jjk0Var = this.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            auj0Var.a = str;
            auj0Var.d = 1;
            objE = ((qjk0) jjk0Var).e(str, auj0Var, true);
            if (objE != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = auj0Var.a;
        hm5.M(obj);
        objE = ((e331) obj).a;
        if (!(objE instanceof m231)) {
            return objE;
        }
        auj0Var.a = null;
        auj0Var.d = 2;
        Object objD = ((qjk0) jjk0Var).d(str, auj0Var, true);
        return objD == d9nVar ? d9nVar : objD;
    }
}
