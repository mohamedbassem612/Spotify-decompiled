package p;

import android.database.SQLException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jdv0 implements v7g1, uvz0 {
    public final eoc a;
    public final mbl b;
    public final boolean c;
    public final n36 d = new n36();
    public volatile boolean e;

    public jdv0(eoc eocVar, mbl mblVar, boolean z) {
        this.a = eocVar;
        this.b = mblVar;
        this.c = z;
    }

    public final Object a(u7g1 u7g1Var, vu30 vu30Var, a8d1 a8d1Var) {
        if (this.e) {
            vby0.y(21, "Connection is recycled");
            throw null;
        }
        t8l t8lVar = (t8l) a8d1Var.getContext().A(this.a);
        if (t8lVar != null && t8lVar.b == this) {
            return g(u7g1Var, vu30Var, a8d1Var);
        }
        vby0.y(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    public final y341 b() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, iu30 iu30Var, onm onmVar) {
        idv0 idv0Var;
        mbl mblVar;
        if (onmVar instanceof idv0) {
            idv0Var = (idv0) onmVar;
            int i = idv0Var.f;
            if ((i & os00.INVALID_ID) != 0) {
                idv0Var.f = i - os00.INVALID_ID;
            } else {
                idv0Var = new idv0(this, onmVar);
            }
        } else {
            idv0Var = new idv0(this, onmVar);
        }
        Object obj = idv0Var.d;
        d9n d9nVar = d9n.a;
        int i2 = idv0Var.f;
        if (i2 == 0) {
            hm5.M(obj);
            if (this.e) {
                vby0.y(21, "Connection is recycled");
                throw null;
            }
            t8l t8lVar = (t8l) idv0Var.getContext().A(this.a);
            if (t8lVar == null || t8lVar.b != this) {
                vby0.y(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            mblVar = this.b;
            idv0Var.a = str;
            idv0Var.b = iu30Var;
            idv0Var.c = mblVar;
            idv0Var.f = 1;
            if (mblVar.b.a(idv0Var) == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mbl mblVar2 = idv0Var.c;
            iu30Var = idv0Var.b;
            String str2 = idv0Var.a;
            hm5.M(obj);
            mblVar = mblVar2;
            str = str2;
        }
        try {
            d441 cdv0Var = new cdv0(this, this.b.g1(str));
            try {
                Object objInvoke = iu30Var.invoke(cdv0Var);
                o0c.v(cdv0Var, (Throwable) null);
                mblVar.c((Object) null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    o0c.v(cdv0Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            mblVar.c((Object) null);
            throw th3;
        }
    }

    public final Boolean d(lnm lnmVar) {
        if (this.e) {
            vby0.y(21, "Connection is recycled");
            throw null;
        }
        t8l t8lVar = (t8l) lnmVar.getContext().A(this.a);
        if (t8lVar != null && t8lVar.b == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.a.V0());
        }
        vby0.y(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(u7g1 u7g1Var, onm onmVar) {
        fdv0 fdv0Var;
        mbl mblVar;
        n36 n36Var = this.d;
        if (onmVar instanceof fdv0) {
            fdv0Var = (fdv0) onmVar;
            int i = fdv0Var.e;
            if ((i & os00.INVALID_ID) != 0) {
                fdv0Var.e = i - os00.INVALID_ID;
            } else {
                fdv0Var = new fdv0(this, onmVar);
            }
        } else {
            fdv0Var = new fdv0(this, onmVar);
        }
        Object obj = fdv0Var.c;
        int i2 = fdv0Var.e;
        mbl mblVar2 = this.b;
        if (i2 == 0) {
            hm5.M(obj);
            fdv0Var.a = u7g1Var;
            fdv0Var.b = mblVar2;
            fdv0Var.e = 1;
            Object objA = mblVar2.b.a(fdv0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            mblVar = mblVar2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mbl mblVar3 = fdv0Var.b;
            u7g1 u7g1Var2 = fdv0Var.a;
            hm5.M(obj);
            mblVar = mblVar3;
            u7g1Var = u7g1Var2;
        }
        try {
            int i3 = n36Var.c;
            if (n36Var.isEmpty()) {
                int iOrdinal = u7g1Var.ordinal();
                if (iOrdinal == 0) {
                    qxy0.s(mblVar2, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    qxy0.s(mblVar2, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qxy0.s(mblVar2, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                qxy0.s(mblVar2, "SAVEPOINT '" + i3 + '\'');
            }
            n36Var.addLast(new edv0(i3));
            rih1 rih1Var = rih1.a;
            mblVar.c((Object) null);
            return rih1Var;
        } catch (Throwable th) {
            mblVar.c((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(boolean z, onm onmVar) {
        gdv0 gdv0Var;
        mbl mblVar;
        n36 n36Var = this.d;
        if (onmVar instanceof gdv0) {
            gdv0Var = (gdv0) onmVar;
            int i = gdv0Var.e;
            if ((i & os00.INVALID_ID) != 0) {
                gdv0Var.e = i - os00.INVALID_ID;
            } else {
                gdv0Var = new gdv0(this, onmVar);
            }
        } else {
            gdv0Var = new gdv0(this, onmVar);
        }
        Object obj = gdv0Var.c;
        int i2 = gdv0Var.e;
        mbl mblVar2 = this.b;
        if (i2 == 0) {
            hm5.M(obj);
            gdv0Var.b = mblVar2;
            gdv0Var.a = z;
            gdv0Var.e = 1;
            Object objA = mblVar2.b.a(gdv0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            mblVar = mblVar2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = gdv0Var.a;
            mblVar = gdv0Var.b;
            hm5.M(obj);
        }
        try {
            if (n36Var.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            edv0 edv0Var = (edv0) r7h.d0(n36Var);
            if (z) {
                edv0Var.getClass();
                if (n36Var.isEmpty()) {
                    qxy0.s(mblVar2, "END TRANSACTION");
                } else {
                    qxy0.s(mblVar2, "RELEASE SAVEPOINT '" + edv0Var.a + '\'');
                }
            } else if (n36Var.isEmpty()) {
                qxy0.s(mblVar2, "ROLLBACK TRANSACTION");
            } else {
                qxy0.s(mblVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + edv0Var.a + '\'');
            }
            rih1 rih1Var = rih1.a;
            mblVar.c((Object) null);
            return rih1Var;
        } catch (Throwable th) {
            mblVar.c((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    public final Object g(u7g1 u7g1Var, vu30 vu30Var, onm onmVar) throws Throwable {
        hdv0 hdv0Var;
        SQLException e;
        Throwable th;
        if (onmVar instanceof hdv0) {
            hdv0Var = (hdv0) onmVar;
            int i = hdv0Var.f;
            if ((i & os00.INVALID_ID) != 0) {
                hdv0Var.f = i - os00.INVALID_ID;
            } else {
                hdv0Var = new hdv0(this, onmVar);
            }
        } else {
            hdv0Var = new hdv0(this, onmVar);
        }
        Object objInvoke = hdv0Var.d;
        int i2 = hdv0Var.f;
        boolean z = true;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objInvoke);
                if (u7g1Var == null) {
                    u7g1Var = u7g1.a;
                }
                hdv0Var.a = vu30Var;
                hdv0Var.f = 1;
                if (e(u7g1Var, hdv0Var) != d9nVar) {
                }
                return d9nVar;
            }
            if (i2 == 1) {
                vu30Var = (vu30) hdv0Var.a;
                hm5.M(objInvoke);
            } else {
                if (i2 != 2) {
                    if (i2 == 3 || i2 == 4) {
                        Object obj = hdv0Var.a;
                        hm5.M(objInvoke);
                        return obj;
                    }
                    if (i2 != 5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = hdv0Var.b;
                    th = (Throwable) hdv0Var.a;
                    try {
                        hm5.M(objInvoke);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        j2h1.h(th, e);
                        throw th;
                    }
                }
                z = hdv0Var.c;
                hm5.M(objInvoke);
            }
            hdv0Var.a = objInvoke;
            hdv0Var.f = 3;
            this = f(z, hdv0Var);
            if (this != d9nVar) {
                return d9nVar;
            }
            return objInvoke;
            ddv0 ddv0Var = new ddv0(this);
            hdv0Var.a = null;
            hdv0Var.c = true;
            hdv0Var.f = 2;
            objInvoke = vu30Var.invoke(ddv0Var, hdv0Var);
            if (objInvoke != d9nVar) {
                hdv0Var.a = objInvoke;
                hdv0Var.f = 3;
                this = f(z, hdv0Var);
                if (this != d9nVar) {
                    return objInvoke;
                }
            }
            return d9nVar;
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    hdv0Var.a = th;
                    hdv0Var.b = th3;
                    hdv0Var.f = 5;
                    if (this.f(false, hdv0Var) != d9nVar) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    j2h1.h(th, e);
                    throw th;
                }
            }
        }
    }
}
