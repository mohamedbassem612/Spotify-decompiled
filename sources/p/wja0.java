package p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wja0 extends kf40 {
    public static final wja0 g;
    public static final tja0 h = new tja0((byte) 1);
    public final qhc a;
    public int b;
    public int c;
    public int d;
    public byte e;
    public int f;

    static {
        wja0 wja0Var = new wja0();
        g = wja0Var;
        wja0Var.c = 0;
        wja0Var.d = 0;
    }

    public wja0(mwg mwgVar) {
        this.e = (byte) -1;
        this.f = -1;
        boolean z = false;
        this.c = 0;
        this.d = 0;
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
                        } else if (!mwgVar.q(iN, w4c0VarY)) {
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

    public static uja0 k(wja0 wja0Var) {
        uja0 uja0Var = new uja0((byte) 1);
        uja0Var.i(wja0Var);
        return uja0Var;
    }

    @Override // p.t8
    public final int a() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int iG = (this.b & 1) == 1 ? w4c0.g(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iG += w4c0.g(2, this.d);
        }
        int size = this.a.size() + iG;
        this.f = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        return new uja0((byte) 1);
    }

    @Override // p.t8
    public final xe40 c() {
        return k(this);
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
        w4c0Var.U(this.a);
    }

    public final int g() {
        return this.d;
    }

    public final int h() {
        return this.c;
    }

    public final boolean i() {
        return (this.b & 2) == 2;
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
        this.e = (byte) 1;
        return true;
    }

    public final boolean j() {
        return (this.b & 1) == 1;
    }

    public wja0() {
        this.e = (byte) -1;
        this.f = -1;
        this.a = qhc.a;
    }

    public wja0(uja0 uja0Var) {
        this.e = (byte) -1;
        this.f = -1;
        this.a = uja0Var.a;
    }
}
