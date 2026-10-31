package p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dhy0 extends kf40 {
    public static final dhy0 X;
    public static final tja0 Y = new tja0((byte) 28);
    public final qhc a;
    public int b;
    public int c;
    public int d;
    public bhy0 e;
    public int f;
    public int g;
    public chy0 h;
    public byte i;
    public int t;

    static {
        dhy0 dhy0Var = new dhy0();
        X = dhy0Var;
        dhy0Var.c = 0;
        dhy0Var.d = 0;
        dhy0Var.e = bhy0.ERROR;
        dhy0Var.f = 0;
        dhy0Var.g = 0;
        dhy0Var.h = chy0.LANGUAGE_VERSION;
    }

    public dhy0(mwg mwgVar) {
        this.i = (byte) -1;
        this.t = -1;
        boolean z = false;
        this.c = 0;
        this.d = 0;
        bhy0 bhy0Var = bhy0.ERROR;
        this.e = bhy0Var;
        this.f = 0;
        this.g = 0;
        chy0 chy0Var = chy0.LANGUAGE_VERSION;
        this.h = chy0Var;
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
                        } else if (iN != 16) {
                            chy0 chy0Var2 = null;
                            bhy0 bhy0Var2 = null;
                            if (iN == 24) {
                                int iK = mwgVar.k();
                                if (iK == 0) {
                                    bhy0Var2 = bhy0.WARNING;
                                } else if (iK == 1) {
                                    bhy0Var2 = bhy0Var;
                                } else if (iK == 2) {
                                    bhy0Var2 = bhy0.HIDDEN;
                                }
                                if (bhy0Var2 == null) {
                                    w4c0VarY.Y(iN);
                                    w4c0VarY.Y(iK);
                                } else {
                                    this.b |= 4;
                                    this.e = bhy0Var2;
                                }
                            } else if (iN == 32) {
                                this.b |= 8;
                                this.f = mwgVar.k();
                            } else if (iN == 40) {
                                this.b |= 16;
                                this.g = mwgVar.k();
                            } else if (iN == 48) {
                                int iK2 = mwgVar.k();
                                if (iK2 == 0) {
                                    chy0Var2 = chy0Var;
                                } else if (iK2 == 1) {
                                    chy0Var2 = chy0.COMPILER_VERSION;
                                } else if (iK2 == 2) {
                                    chy0Var2 = chy0.API_VERSION;
                                }
                                if (chy0Var2 == null) {
                                    w4c0VarY.Y(iN);
                                    w4c0VarY.Y(iK2);
                                } else {
                                    this.b |= 32;
                                    this.h = chy0Var2;
                                }
                            } else if (!mwgVar.q(iN, w4c0VarY)) {
                            }
                        } else {
                            this.b |= 2;
                            this.d = mwgVar.k();
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.a = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.a = this;
                    throw invalidProtocolBufferException;
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
        int i = this.t;
        if (i != -1) {
            return i;
        }
        int iG = (this.b & 1) == 1 ? w4c0.g(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iG += w4c0.g(2, this.d);
        }
        if ((this.b & 4) == 4) {
            iG += w4c0.f(3, this.e.a);
        }
        if ((this.b & 8) == 8) {
            iG += w4c0.g(4, this.f);
        }
        if ((this.b & 16) == 16) {
            iG += w4c0.g(5, this.g);
        }
        if ((this.b & 32) == 32) {
            iG += w4c0.f(6, this.h.a);
        }
        int size = this.a.size() + iG;
        this.t = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        ahy0 ahy0Var = new ahy0();
        ahy0Var.e = bhy0.ERROR;
        ahy0Var.h = chy0.LANGUAGE_VERSION;
        return ahy0Var;
    }

    @Override // p.t8
    public final xe40 c() {
        ahy0 ahy0Var = new ahy0();
        ahy0Var.e = bhy0.ERROR;
        ahy0Var.h = chy0.LANGUAGE_VERSION;
        ahy0Var.g(this);
        return ahy0Var;
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
        if ((this.b & 8) == 8) {
            w4c0Var.P(4, this.f);
        }
        if ((this.b & 16) == 16) {
            w4c0Var.P(5, this.g);
        }
        if ((this.b & 32) == 32) {
            w4c0Var.O(6, this.h.a);
        }
        w4c0Var.U(this.a);
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.i;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.i = (byte) 1;
        return true;
    }

    public dhy0() {
        this.i = (byte) -1;
        this.t = -1;
        this.a = qhc.a;
    }

    public dhy0(ahy0 ahy0Var) {
        this.i = (byte) -1;
        this.t = -1;
        this.a = ahy0Var.a;
    }
}
