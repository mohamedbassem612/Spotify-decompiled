package p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jgy0 extends kf40 {
    public static final jgy0 h;
    public static final tja0 i = new tja0((byte) 20);
    public final qhc a;
    public int b;
    public int c;
    public int d;
    public igy0 e;
    public byte f;
    public int g;

    static {
        jgy0 jgy0Var = new jgy0();
        h = jgy0Var;
        jgy0Var.c = -1;
        jgy0Var.d = 0;
        jgy0Var.e = igy0.PACKAGE;
    }

    public jgy0(mwg mwgVar) {
        this.f = (byte) -1;
        this.g = -1;
        this.c = -1;
        boolean z = false;
        this.d = 0;
        igy0 igy0Var = igy0.PACKAGE;
        this.e = igy0Var;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        while (!z) {
            try {
                try {
                    int iN = mwgVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.b |= 1;
                            this.c = mwgVar.k();
                        } else if (iN == 16) {
                            this.b |= 2;
                            this.d = mwgVar.k();
                        } else if (iN == 24) {
                            int iK = mwgVar.k();
                            igy0 igy0Var2 = iK != 0 ? iK != 1 ? iK != 2 ? null : igy0.LOCAL : igy0Var : igy0.CLASS;
                            if (igy0Var2 == null) {
                                w4c0VarY.Y(iN);
                                w4c0VarY.Y(iK);
                            } else {
                                this.b |= 4;
                                this.e = igy0Var2;
                            }
                        } else if (!mwgVar.q(iN, w4c0VarY)) {
                        }
                    }
                    z = true;
                } catch (IOException e) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                    invalidProtocolBufferException.a = this;
                    throw invalidProtocolBufferException;
                } catch (InvalidProtocolBufferException e2) {
                    e2.a = this;
                    throw e2;
                }
            } catch (Throwable th) {
                try {
                    w4c0VarY.F();
                } catch (IOException unused) {
                } finally {
                    this.a = jhcVar.d();
                }
                throw th;
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
        int iG = (this.b & 1) == 1 ? w4c0.g(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iG += w4c0.g(2, this.d);
        }
        if ((this.b & 4) == 4) {
            iG += w4c0.f(3, this.e.a);
        }
        int size = this.a.size() + iG;
        this.g = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        hgy0 hgy0Var = new hgy0();
        hgy0Var.c = -1;
        hgy0Var.e = igy0.PACKAGE;
        return hgy0Var;
    }

    @Override // p.t8
    public final xe40 c() {
        hgy0 hgy0Var = new hgy0();
        hgy0Var.c = -1;
        hgy0Var.e = igy0.PACKAGE;
        hgy0Var.g(this);
        return hgy0Var;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        if ((this.b & 1) == 1) {
            w4c0Var.P(1, this.c);
        }
        if ((this.b & 2) == 2) {
            w4c0Var.P(2, this.d);
        }
        if ((this.b & 4) == 4) {
            w4c0Var.O(3, this.e.a);
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
        if ((this.b & 2) == 2) {
            this.f = (byte) 1;
            return true;
        }
        this.f = (byte) 0;
        return false;
    }

    public jgy0() {
        this.f = (byte) -1;
        this.g = -1;
        this.a = qhc.a;
    }

    public jgy0(hgy0 hgy0Var) {
        this.f = (byte) -1;
        this.g = -1;
        this.a = hgy0Var.a;
    }
}
