package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class efy0 extends kf40 {
    public static final efy0 g;
    public static final tja0 h = new tja0((byte) 5);
    public final qhc a;
    public int b;
    public int c;
    public List d;
    public byte e;
    public int f;

    static {
        efy0 efy0Var = new efy0();
        g = efy0Var;
        efy0Var.c = 0;
        efy0Var.d = Collections.EMPTY_LIST;
    }

    public efy0(mwg mwgVar, vz00 vz00Var) {
        this.e = (byte) -1;
        this.f = -1;
        boolean z = false;
        this.c = 0;
        this.d = Collections.EMPTY_LIST;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = mwgVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.b |= 1;
                            this.c = mwgVar.k();
                        } else if (iN == 18) {
                            if ((c & 2) != 2) {
                                this.d = new ArrayList();
                                c = 2;
                            }
                            this.d.add(mwgVar.g(cfy0.h, vz00Var));
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
                if ((c & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
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
        if ((c & 2) == 2) {
            this.d = Collections.unmodifiableList(this.d);
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
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            iG += w4c0.i(2, (t8) this.d.get(i2));
        }
        int size = this.a.size() + iG;
        this.f = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        dfy0 dfy0Var = new dfy0((byte) 0);
        dfy0Var.d = Collections.EMPTY_LIST;
        return dfy0Var;
    }

    @Override // p.t8
    public final xe40 c() {
        dfy0 dfy0Var = new dfy0((byte) 0);
        dfy0Var.d = Collections.EMPTY_LIST;
        dfy0Var.h(this);
        return dfy0Var;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        if ((this.b & 1) == 1) {
            w4c0Var.P(1, this.c);
        }
        for (int i = 0; i < this.d.size(); i++) {
            w4c0Var.R(2, (t8) this.d.get(i));
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
        if ((this.b & 1) != 1) {
            this.e = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (!((cfy0) this.d.get(i)).isInitialized()) {
                this.e = (byte) 0;
                return false;
            }
        }
        this.e = (byte) 1;
        return true;
    }

    public efy0() {
        this.e = (byte) -1;
        this.f = -1;
        this.a = qhc.a;
    }

    public efy0(dfy0 dfy0Var) {
        this.e = (byte) -1;
        this.f = -1;
        this.a = dfy0Var.a;
    }
}
