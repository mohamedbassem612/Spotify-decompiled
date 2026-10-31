package p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pgy0 extends kf40 {
    public static final pgy0 h;
    public static final tja0 i = new tja0((byte) 23);
    public final qhc a;
    public int b;
    public ogy0 c;
    public rgy0 d;
    public int e;
    public byte f;
    public int g;

    static {
        pgy0 pgy0Var = new pgy0();
        h = pgy0Var;
        pgy0Var.c = ogy0.INV;
        pgy0Var.d = rgy0.U0;
        pgy0Var.e = 0;
    }

    public pgy0(mwg mwgVar, vz00 vz00Var) {
        this.f = (byte) -1;
        this.g = -1;
        ogy0 ogy0Var = ogy0.INV;
        this.c = ogy0Var;
        this.d = rgy0.U0;
        boolean z = false;
        this.e = 0;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        while (!z) {
            try {
                try {
                    int iN = mwgVar.n();
                    if (iN != 0) {
                        qgy0 qgy0VarP = null;
                        ogy0 ogy0Var2 = null;
                        if (iN == 8) {
                            int iK = mwgVar.k();
                            if (iK == 0) {
                                ogy0Var2 = ogy0.IN;
                            } else if (iK == 1) {
                                ogy0Var2 = ogy0.OUT;
                            } else if (iK == 2) {
                                ogy0Var2 = ogy0Var;
                            } else if (iK == 3) {
                                ogy0Var2 = ogy0.STAR;
                            }
                            if (ogy0Var2 == null) {
                                w4c0VarY.Y(iN);
                                w4c0VarY.Y(iK);
                            } else {
                                this.b |= 1;
                                this.c = ogy0Var2;
                            }
                        } else if (iN == 18) {
                            if ((this.b & 2) == 2) {
                                rgy0 rgy0Var = this.d;
                                rgy0Var.getClass();
                                qgy0VarP = rgy0.p(rgy0Var);
                            }
                            rgy0 rgy0Var2 = (rgy0) mwgVar.g(rgy0.V0, vz00Var);
                            this.d = rgy0Var2;
                            if (qgy0VarP != null) {
                                qgy0VarP.i(rgy0Var2);
                                this.d = qgy0VarP.g();
                            }
                            this.b |= 2;
                        } else if (iN == 24) {
                            this.b |= 4;
                            this.e = mwgVar.k();
                        } else if (!mwgVar.q(iN, w4c0VarY)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        w4c0VarY.F();
                    } catch (IOException unused) {
                    } finally {
                        this.a = jhcVar.d();
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                e.a = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.a = this;
                throw invalidProtocolBufferException;
            }
        }
        try {
            w4c0VarY.F();
        } catch (IOException unused2) {
        } finally {
            this.a = jhcVar.d();
        }
    }

    @Override // p.t8
    public final int a() {
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int iF = (this.b & 1) == 1 ? w4c0.f(1, this.c.a) : 0;
        if ((this.b & 2) == 2) {
            iF += w4c0.i(2, this.d);
        }
        if ((this.b & 4) == 4) {
            iF += w4c0.g(3, this.e);
        }
        int size = this.a.size() + iF;
        this.g = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        ngy0 ngy0Var = new ngy0();
        ngy0Var.c = ogy0.INV;
        ngy0Var.d = rgy0.U0;
        return ngy0Var;
    }

    @Override // p.t8
    public final xe40 c() {
        ngy0 ngy0Var = new ngy0();
        ngy0Var.c = ogy0.INV;
        ngy0Var.d = rgy0.U0;
        ngy0Var.g(this);
        return ngy0Var;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        if ((this.b & 1) == 1) {
            w4c0Var.O(1, this.c.a);
        }
        if ((this.b & 2) == 2) {
            w4c0Var.R(2, this.d);
        }
        if ((this.b & 4) == 4) {
            w4c0Var.P(3, this.e);
        }
        w4c0Var.U(this.a);
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.b & 2) != 2 || this.d.isInitialized()) {
            this.f = (byte) 1;
            return true;
        }
        this.f = (byte) 0;
        return false;
    }

    public pgy0() {
        this.f = (byte) -1;
        this.g = -1;
        this.a = qhc.a;
    }

    public pgy0(ngy0 ngy0Var) {
        this.f = (byte) -1;
        this.g = -1;
        this.a = ngy0Var.a;
    }
}
