package p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ify0 extends kf40 {
    public static final ify0 g;
    public static final tja0 h = new tja0((byte) 9);
    public final qhc a;
    public int b;
    public int c;
    public qmd0 d;
    public byte e;
    public int f;

    static {
        ify0 ify0Var = new ify0();
        g = ify0Var;
        ify0Var.c = 0;
        ify0Var.d = qhc.a;
    }

    public ify0(mwg mwgVar) {
        this.e = (byte) -1;
        this.f = -1;
        boolean z = false;
        this.c = 0;
        this.d = qhc.a;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iN = mwgVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.b |= 1;
                                this.c = mwgVar.k();
                            } else if (iN == 18) {
                                this.b |= 2;
                                this.d = mwgVar.f();
                            } else if (!mwgVar.q(iN, w4c0VarY)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.a = this;
                        throw e;
                    }
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
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int iG = (this.b & 1) == 1 ? w4c0.g(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            qmd0 qmd0Var = this.d;
            iG += qmd0Var.size() + w4c0.k(qmd0Var.size()) + w4c0.m(2);
        }
        int size = this.a.size() + iG;
        this.f = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        yey0 yey0Var = new yey0((byte) 1);
        yey0Var.e = qhc.a;
        return yey0Var;
    }

    @Override // p.t8
    public final xe40 c() {
        yey0 yey0Var = new yey0((byte) 1);
        yey0Var.e = qhc.a;
        yey0Var.i(this);
        return yey0Var;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        if ((this.b & 1) == 1) {
            w4c0Var.P(1, this.c);
        }
        if ((this.b & 2) == 2) {
            qmd0 qmd0Var = this.d;
            w4c0Var.a0(2, 2);
            w4c0Var.Y(qmd0Var.size());
            w4c0Var.U(qmd0Var);
        }
        w4c0Var.U(this.a);
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.b;
        if ((i & 1) != 1) {
            this.e = (byte) 0;
            return false;
        }
        if ((i & 2) == 2) {
            this.e = (byte) 1;
            return true;
        }
        this.e = (byte) 0;
        return false;
    }

    public ify0() {
        this.e = (byte) -1;
        this.f = -1;
        this.a = qhc.a;
    }

    public ify0(yey0 yey0Var) {
        this.e = (byte) -1;
        this.f = -1;
        this.a = yey0Var.a;
    }
}
