package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xgy0 extends kf40 {
    public static final xgy0 g;
    public static final tja0 h = new tja0(26);
    public final qhc a;
    public int b;
    public List c;
    public int d;
    public byte e;
    public int f;

    static {
        xgy0 xgy0Var = new xgy0();
        g = xgy0Var;
        xgy0Var.c = Collections.EMPTY_LIST;
        xgy0Var.d = -1;
    }

    public xgy0(mwg mwgVar, vz00 vz00Var) {
        this.e = (byte) -1;
        this.f = -1;
        this.c = Collections.EMPTY_LIST;
        this.d = -1;
        boolean z = false;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iN = mwgVar.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if (!z2) {
                                    this.c = new ArrayList();
                                    z2 = true;
                                }
                                this.c.add(mwgVar.g(rgy0.V0, vz00Var));
                            } else if (iN == 16) {
                                this.b |= 1;
                                this.d = mwgVar.k();
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
                if (z2) {
                    this.c = Collections.unmodifiableList(this.c);
                }
                try {
                    w4c0VarY.F();
                } catch (IOException unused) {
                } finally {
                    this.a = jhcVar.d();
                }
                throw th;
            }
        }
        if (z2) {
            this.c = Collections.unmodifiableList(this.c);
        }
        try {
            w4c0VarY.F();
        } catch (IOException unused2) {
        } finally {
            this.a = jhcVar.d();
        }
    }

    public static dfy0 g(xgy0 xgy0Var) {
        dfy0 dfy0Var = new dfy0((byte) 1);
        dfy0Var.d = Collections.EMPTY_LIST;
        dfy0Var.e = -1;
        dfy0Var.i(xgy0Var);
        return dfy0Var;
    }

    @Override // p.t8
    public final int a() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int iG = 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            iG += w4c0.i(1, (t8) this.c.get(i2));
        }
        if ((this.b & 1) == 1) {
            iG += w4c0.g(2, this.d);
        }
        int size = this.a.size() + iG;
        this.f = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        dfy0 dfy0Var = new dfy0((byte) 1);
        dfy0Var.d = Collections.EMPTY_LIST;
        dfy0Var.e = -1;
        return dfy0Var;
    }

    @Override // p.t8
    public final xe40 c() {
        return g(this);
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        for (int i = 0; i < this.c.size(); i++) {
            w4c0Var.R(1, (t8) this.c.get(i));
        }
        if ((this.b & 1) == 1) {
            w4c0Var.P(2, this.d);
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
        for (int i = 0; i < this.c.size(); i++) {
            if (!((rgy0) this.c.get(i)).isInitialized()) {
                this.e = (byte) 0;
                return false;
            }
        }
        this.e = (byte) 1;
        return true;
    }

    public xgy0() {
        this.e = (byte) -1;
        this.f = -1;
        this.a = qhc.a;
    }

    public xgy0(dfy0 dfy0Var) {
        this.e = (byte) -1;
        this.f = -1;
        this.a = dfy0Var.a;
    }
}
