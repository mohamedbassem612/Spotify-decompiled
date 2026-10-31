package p;

import java.io.Closeable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lxc {
    public final cxc a;

    public /* synthetic */ lxc(cxc cxcVar) {
        this.a = cxcVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(cxc cxcVar, d8o0 d8o0Var, p7o0 p7o0Var, onm onmVar) {
        kxc kxcVar;
        p7o0 p7o0Var2;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (onmVar instanceof kxc) {
            kxcVar = (kxc) onmVar;
            int i = kxcVar.d;
            if ((i & os00.INVALID_ID) != 0) {
                kxcVar.d = i - os00.INVALID_ID;
            } else {
                kxcVar = new kxc(onmVar);
            }
        } else {
            kxcVar = new kxc(onmVar);
        }
        Object objX = kxcVar.c;
        int i2 = kxcVar.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objX);
            kxcVar.a = p7o0Var;
            kxcVar.b = cxcVar;
            kxcVar.d = 1;
            objX = pwo1.x(d8o0Var, kxcVar);
            if (objX != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable2 = (Closeable) kxcVar.b;
                try {
                    hm5.M(objX);
                    u890.p(closeable2, (Throwable) null);
                    return objX;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        u890.p(closeable2, th);
                        throw th3;
                    }
                }
            }
            p7o0Var2 = kxcVar.a;
            hm5.M(objX);
            closeable = (Closeable) objX;
            try {
                i8o0 i8o0VarW = pwo1.w((ry21) closeable);
                kxcVar.a = null;
                kxcVar.b = closeable;
                kxcVar.d = 3;
                objX = p7o0Var2.invoke(i8o0VarW, kxcVar);
                if (objX != d9nVar) {
                    closeable2 = closeable;
                    u890.p(closeable2, (Throwable) null);
                    return objX;
                }
                return d9nVar;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        cxcVar = (cxc) kxcVar.b;
        p7o0Var = kxcVar.a;
        hm5.M(objX);
        jf01 jf01VarA = cxcVar.a((ln21) objX);
        kxcVar.a = p7o0Var;
        kxcVar.b = null;
        kxcVar.d = 2;
        ohd ohdVar = new ohd(1, aym.t(kxcVar));
        ohdVar.t();
        da daVar = new da(jf01VarA, ohdVar, (byte) 14);
        jf01VarA.d(daVar);
        ohdVar.n(daVar);
        objX = ohdVar.r();
        if (objX != d9nVar) {
            p7o0Var2 = p7o0Var;
            closeable = (Closeable) objX;
            i8o0 i8o0VarW2 = pwo1.w((ry21) closeable);
            kxcVar.a = null;
            kxcVar.b = closeable;
            kxcVar.d = 3;
            objX = p7o0Var2.invoke(i8o0VarW2, kxcVar);
            if (objX != d9nVar) {
                closeable2 = closeable;
                u890.p(closeable2, (Throwable) null);
                return objX;
            }
        }
        return d9nVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lxc) {
            return u890.j(this.a, ((lxc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + ')';
    }
}
