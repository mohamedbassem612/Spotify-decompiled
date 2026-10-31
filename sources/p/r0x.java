package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r0x implements j0x {
    public final boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;

    public r0x(h0x h0xVar, ay0 ay0Var, nu0 nu0Var, xn0 xn0Var, e3x e3xVar, boolean z) {
        this.c = h0xVar;
        this.d = ay0Var;
        this.e = nu0Var;
        this.f = xn0Var;
        this.g = e3xVar;
        this.a = z;
        this.h = gio1.b(Boolean.FALSE);
        this.i = new LinkedHashMap();
    }

    @Override // p.j0x
    public mr20 a(qrd1 qrd1Var) {
        return rqt0.u(new ht20(z4p1.J(new m441(new rzu(this, qrd1Var, (lnm) null, (byte) 7)), new n0x(3, null, (byte) 0)), new qjr(2, (lnm) null, (byte) 19)));
    }

    @Override // p.j0x
    public rm0 b(int i) {
        return new rm0(new k0x(this, null, (byte) 0), ((h0x) this.c).c(i == 2, new ett(this, (lnm) null, (byte) 10)));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x0104  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:14:0x0040, B:19:0x0054, B:22:0x0067, B:61:0x0105, B:63:0x010b, B:66:0x0111, B:68:0x011b, B:72:0x012b, B:25:0x0074, B:58:0x00ed, B:54:0x00d0), top: B:91:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0111 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:14:0x0040, B:19:0x0054, B:22:0x0067, B:61:0x0105, B:63:0x010b, B:66:0x0111, B:68:0x011b, B:72:0x012b, B:25:0x0074, B:58:0x00ed, B:54:0x00d0), top: B:91:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x011a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    /* JADX WARN: Code duplicated, block: B:71:0x012a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0149  */
    /* JADX WARN: Code duplicated, block: B:77:0x014a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0151 A[Catch: all -> 0x016c, TryCatch #1 {all -> 0x016c, blocks: (B:83:0x0168, B:79:0x0151, B:86:0x016e, B:87:0x0175, B:74:0x0143), top: B:92:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0167  */
    /* JADX WARN: Code duplicated, block: B:86:0x016e A[Catch: all -> 0x016c, TryCatch #1 {all -> 0x016c, blocks: (B:83:0x0168, B:79:0x0151, B:86:0x016e, B:87:0x0175, B:74:0x0143), top: B:92:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (r2 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r2 == r7) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(p.qrd1 r19, p.onm r20) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.r0x.c(p.qrd1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object d(qrd1 qrd1Var, onm onmVar) {
        m0x m0xVar;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.i;
        if (onmVar instanceof m0x) {
            m0xVar = (m0x) onmVar;
            int i = m0xVar.d;
            if ((i & os00.INVALID_ID) != 0) {
                m0xVar.d = i - os00.INVALID_ID;
            } else {
                m0xVar = new m0x(this, onmVar);
            }
        } else {
            m0xVar = new m0x(this, onmVar);
        }
        Object objI = m0xVar.b;
        int i2 = m0xVar.d;
        if (i2 == 0) {
            hm5.M(objI);
            if (!linkedHashMap.isEmpty() && !((Boolean) ((bpb1) this.h).getValue()).booleanValue()) {
                xe01 xe01Var = ((ay0) this.d).i;
                m0xVar.a = qrd1Var;
                m0xVar.d = 1;
                objI = b5p1.i(xe01Var, m0xVar);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            }
            return Boolean.FALSE;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qrd1Var = m0xVar.a;
        hm5.M(objI);
        mx0 mx0Var = (px0) objI;
        if ((mx0Var instanceof mx0) && u890.j(linkedHashMap.get(qrd1Var), mx0Var.a)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public r0x(uu00 uu00Var, xrc0 xrc0Var, b7n b7nVar, o241 o241Var, wf4 wf4Var, boolean z, zb91 zb91Var, ioc iocVar, boolean z2, mr20 mr20Var) {
        this.c = uu00Var;
        this.d = xrc0Var;
        this.e = b7nVar;
        this.f = o241Var;
        this.g = wf4Var;
        this.a = z;
        this.h = zb91Var;
        this.i = iocVar;
        this.b = z2;
        this.j = mr20Var;
    }
}
