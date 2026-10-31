package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aal implements x9l {
    public final adv0 a;
    public final adv0 b;
    public final eoc c = new eoc((byte) 2);
    public final ThreadLocal d = new ThreadLocal();
    public volatile boolean e;
    public final long f;

    public aal(final ic9 ic9Var, final String str, int i) {
        ytw0 ytw0Var = jfv.b;
        this.f = fdg1.k0(30, ngv.e);
        if (i <= 0) {
            hhg1.n("Maximum number of readers must be greater than 0");
            throw null;
        }
        final byte b = 0;
        this.a = new adv0(i, new Function0() { // from class: p.y9l
            public final Object invoke() {
                byte b2 = b;
                String str2 = str;
                ic9 ic9Var2 = ic9Var;
                switch (b2) {
                    case 0:
                        y341 y341VarB = ic9Var2.b(str2);
                        qxy0.s(y341VarB, "PRAGMA query_only = 1");
                        return y341VarB;
                    default:
                        return ic9Var2.b(str2);
                }
            }
        });
        final byte b2 = 1;
        this.b = new adv0(1, new Function0() { // from class: p.y9l
            public final Object invoke() {
                byte b3 = b2;
                String str2 = str;
                ic9 ic9Var2 = ic9Var;
                switch (b3) {
                    case 0:
                        y341 y341VarB = ic9Var2.b(str2);
                        qxy0.s(y341VarB, "PRAGMA query_only = 1");
                        return y341VarB;
                    default:
                        return ic9Var2.b(str2);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0133  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f A[Catch: all -> 0x0197, TRY_LEAVE, TryCatch #2 {all -> 0x0197, blocks: (B:64:0x011e, B:69:0x0134, B:71:0x013f, B:86:0x019b, B:87:0x01a2), top: B:111:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0177  */
    /* JADX WARN: Code duplicated, block: B:79:0x017b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0188  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b A[Catch: all -> 0x0197, TRY_ENTER, TryCatch #2 {all -> 0x0197, blocks: (B:64:0x011e, B:69:0x0134, B:71:0x013f, B:86:0x019b, B:87:0x01a2), top: B:111:0x011e }] */
    public final Object W(boolean z, vu30 vu30Var, onm onmVar) {
        z9l z9lVar;
        p811 p811Var;
        Throwable th;
        adv0 adv0Var;
        vu30 vu30Var2;
        o8n o8nVar;
        eoc eocVar;
        adv0 adv0Var2;
        p811 p811Var2;
        boolean z2;
        Object obj;
        p811 p811Var3;
        jdv0 jdv0Var;
        boolean z3 = z;
        if (onmVar instanceof z9l) {
            z9lVar = (z9l) onmVar;
            int i = z9lVar.t;
            if ((i & os00.INVALID_ID) != 0) {
                z9lVar.t = i - os00.INVALID_ID;
            } else {
                z9lVar = new z9l(this, onmVar);
            }
        } else {
            z9lVar = new z9l(this, onmVar);
        }
        Object objY = z9lVar.h;
        d9n d9nVar = d9n.a;
        int i2 = z9lVar.t;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(objY);
                return objY;
            }
            if (i2 == 2) {
                hm5.M(objY);
                return objY;
            }
            if (i2 == 3) {
                z3 = z9lVar.a;
                eocVar = z9lVar.g;
                p811 p811Var4 = z9lVar.f;
                o8nVar = z9lVar.e;
                p811 p811Var5 = z9lVar.d;
                adv0Var2 = (adv0) z9lVar.c;
                vu30Var2 = (vu30) z9lVar.b;
                try {
                    hm5.M(objY);
                    p811Var2 = p811Var4;
                    p811Var = p811Var5;
                    try {
                        mbl mblVar = (mbl) objY;
                        mblVar.c = o8nVar;
                        mblVar.d = new Throwable();
                        if (this.a == this.b && z3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        p811Var2.a = new jdv0(eocVar, mblVar, z2);
                        obj = p811Var.a;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        jdv0 jdv0Var2 = (jdv0) obj;
                        o8n o8nVarL = flo1.l(new t8l(this.c, jdv0Var2), new ige1(jdv0Var2, this.d));
                        cuk cukVar = new cuk(vu30Var2, p811Var, (lnm) null, (byte) 5);
                        z9lVar.b = adv0Var2;
                        z9lVar.c = p811Var;
                        z9lVar.d = null;
                        z9lVar.e = null;
                        z9lVar.f = null;
                        z9lVar.g = null;
                        z9lVar.t = 4;
                        objY = fn31.Y(o8nVarL, cukVar, z9lVar);
                        if (objY != d9nVar) {
                            p811Var3 = p811Var;
                            adv0Var = adv0Var2;
                        }
                        return d9nVar;
                    } catch (Throwable th2) {
                        th = th2;
                        adv0Var = adv0Var2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    p811Var = p811Var5;
                    adv0Var = adv0Var2;
                    throw th;
                }
            }
            if (i2 != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p811Var3 = (p811) z9lVar.c;
            adv0Var = (adv0) z9lVar.b;
            try {
                hm5.M(objY);
            } catch (Throwable th4) {
                p811Var = p811Var3;
                th = th4;
            }
            jdv0Var = (jdv0) p811Var3.a;
            if (jdv0Var != null) {
                if (!jdv0Var.e) {
                    jdv0Var.e = true;
                    if (jdv0Var.b.a.V0()) {
                        qxy0.s(jdv0Var.b, "ROLLBACK TRANSACTION");
                    }
                }
                mbl mblVar2 = jdv0Var.b;
                mblVar2.c = null;
                mblVar2.d = null;
                adv0Var.e(mblVar2);
            }
            return objY;
        }
        hm5.M(objY);
        if (this.e) {
            vby0.y(21, "Connection pool is closed");
            throw null;
        }
        jdv0 jdv0Var3 = (jdv0) this.d.get();
        if (jdv0Var3 == null) {
            t8l t8lVar = (t8l) z9lVar.getContext().A(this.c);
            jdv0Var3 = t8lVar != null ? t8lVar.b : null;
        }
        if (jdv0Var3 == null) {
            adv0 adv0Var3 = z3 ? this.a : this.b;
            p811Var = new p811();
            try {
                o8n context = z9lVar.getContext();
                eoc eocVar2 = this.c;
                long j = this.f;
                jea jeaVar = new jea(this, z3, (byte) 1);
                z9lVar.b = vu30Var;
                z9lVar.c = adv0Var3;
                z9lVar.d = p811Var;
                z9lVar.e = context;
                z9lVar.f = p811Var;
                z9lVar.g = eocVar2;
                z9lVar.a = z3;
                z9lVar.t = 3;
                Object objB = adv0Var3.b(j, jeaVar, z9lVar);
                if (objB != d9nVar) {
                    vu30Var2 = vu30Var;
                    o8nVar = context;
                    eocVar = eocVar2;
                    adv0Var2 = adv0Var3;
                    objY = objB;
                    p811Var2 = p811Var;
                    mbl mblVar3 = (mbl) objY;
                    mblVar3.c = o8nVar;
                    mblVar3.d = new Throwable();
                    if (this.a == this.b) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    p811Var2.a = new jdv0(eocVar, mblVar3, z2);
                    obj = p811Var.a;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    jdv0 jdv0Var4 = (jdv0) obj;
                    o8n o8nVarL2 = flo1.l(new t8l(this.c, jdv0Var4), new ige1(jdv0Var4, this.d));
                    cuk cukVar2 = new cuk(vu30Var2, p811Var, (lnm) null, (byte) 5);
                    z9lVar.b = adv0Var2;
                    z9lVar.c = p811Var;
                    z9lVar.d = null;
                    z9lVar.e = null;
                    z9lVar.f = null;
                    z9lVar.g = null;
                    z9lVar.t = 4;
                    objY = fn31.Y(o8nVarL2, cukVar2, z9lVar);
                    if (objY != d9nVar) {
                        p811Var3 = p811Var;
                        adv0Var = adv0Var2;
                        jdv0Var = (jdv0) p811Var3.a;
                        if (jdv0Var != null) {
                            if (!jdv0Var.e) {
                                jdv0Var.e = true;
                                if (jdv0Var.b.a.V0()) {
                                    qxy0.s(jdv0Var.b, "ROLLBACK TRANSACTION");
                                }
                            }
                            mbl mblVar4 = jdv0Var.b;
                            mblVar4.c = null;
                            mblVar4.d = null;
                            adv0Var.e(mblVar4);
                        }
                        return objY;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                adv0Var = adv0Var3;
            }
        } else {
            if (!z3 && jdv0Var3.c) {
                vby0.y(1, "Cannot upgrade connection from reader to writer");
                throw null;
            }
            if (z9lVar.getContext().A(this.c) == null) {
                o8n o8nVarL3 = flo1.l(new t8l(this.c, jdv0Var3), new ige1(jdv0Var3, this.d));
                cuk cukVar3 = new cuk(vu30Var, jdv0Var3, (lnm) null, (byte) 4);
                z9lVar.t = 1;
                Object objY2 = fn31.Y(o8nVarL3, cukVar3, z9lVar);
                if (objY2 != d9nVar) {
                    return objY2;
                }
            } else {
                z9lVar.t = 2;
                Object objInvoke = vu30Var.invoke(jdv0Var3, z9lVar);
                if (objInvoke != d9nVar) {
                    return objInvoke;
                }
            }
        }
        return d9nVar;
        try {
            throw th;
        } catch (Throwable th6) {
            try {
                jdv0 jdv0Var5 = (jdv0) p811Var.a;
                if (jdv0Var5 == null) {
                    throw th6;
                }
                if (!jdv0Var5.e) {
                    jdv0Var5.e = true;
                    if (jdv0Var5.b.a.V0()) {
                        qxy0.s(jdv0Var5.b, "ROLLBACK TRANSACTION");
                    }
                }
                mbl mblVar5 = jdv0Var5.b;
                mblVar5.c = null;
                mblVar5.d = null;
                adv0Var.e(mblVar5);
                throw th6;
            } catch (Throwable th7) {
                j2h1.h(th, th7);
                throw th6;
            }
        }
    }

    public final void close() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.c();
        this.b.c();
    }

    public aal(ic9 ic9Var) {
        ytw0 ytw0Var = jfv.b;
        this.f = fdg1.k0(30, ngv.e);
        adv0 adv0Var = new adv0(1, new hx4(ic9Var, (byte) 19));
        this.a = adv0Var;
        this.b = adv0Var;
    }
}
