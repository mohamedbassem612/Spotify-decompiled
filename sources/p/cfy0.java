package p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cfy0 extends kf40 {
    public static final cfy0 g;
    public static final tja0 h = new tja0((byte) 6);
    public final qhc a;
    public int b;
    public int c;
    public bfy0 d;
    public byte e;
    public int f;

    static {
        cfy0 cfy0Var = new cfy0();
        g = cfy0Var;
        cfy0Var.c = 0;
        cfy0Var.d = bfy0.P0;
    }

    public cfy0(mwg mwgVar, vz00 vz00Var) {
        zey0 zey0VarG;
        this.e = (byte) -1;
        this.f = -1;
        boolean z = false;
        this.c = 0;
        this.d = bfy0.P0;
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
                                if ((this.b & 2) == 2) {
                                    bfy0 bfy0Var = this.d;
                                    bfy0Var.getClass();
                                    zey0VarG = zey0.g();
                                    zey0VarG.h(bfy0Var);
                                } else {
                                    zey0VarG = null;
                                }
                                bfy0 bfy0Var2 = (bfy0) mwgVar.g(bfy0.Q0, vz00Var);
                                this.d = bfy0Var2;
                                if (zey0VarG != null) {
                                    zey0VarG.h(bfy0Var2);
                                    this.d = zey0VarG.e();
                                }
                                this.b |= 2;
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
            iG += w4c0.i(2, this.d);
        }
        int size = this.a.size() + iG;
        this.f = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        yey0 yey0Var = new yey0((byte) 0);
        yey0Var.e = bfy0.P0;
        return yey0Var;
    }

    @Override // p.t8
    public final xe40 c() {
        yey0 yey0Var = new yey0((byte) 0);
        yey0Var.e = bfy0.P0;
        yey0Var.h(this);
        return yey0Var;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        if ((this.b & 1) == 1) {
            w4c0Var.P(1, this.c);
        }
        if ((this.b & 2) == 2) {
            w4c0Var.R(2, this.d);
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
        if ((i & 2) != 2) {
            this.e = (byte) 0;
            return false;
        }
        if (this.d.isInitialized()) {
            this.e = (byte) 1;
            return true;
        }
        this.e = (byte) 0;
        return false;
    }

    public cfy0() {
        this.e = (byte) -1;
        this.f = -1;
        this.a = qhc.a;
    }

    public cfy0(yey0 yey0Var) {
        this.e = (byte) -1;
        this.f = -1;
        this.a = yey0Var.a;
    }
}
