package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tfy0 extends ef40 {
    public static final tfy0 h;
    public static final tja0 i = new tja0((byte) 13);
    public final qhc b;
    public int c;
    public int d;
    public List e;
    public byte f;
    public int g;

    static {
        tfy0 tfy0Var = new tfy0();
        h = tfy0Var;
        tfy0Var.d = 0;
        tfy0Var.e = Collections.EMPTY_LIST;
    }

    public tfy0(mwg mwgVar, vz00 vz00Var) {
        this.f = (byte) -1;
        this.g = -1;
        boolean z = false;
        this.d = 0;
        this.e = Collections.EMPTY_LIST;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = mwgVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.c |= 1;
                            this.d = mwgVar.k();
                        } else if (iN == 18) {
                            if ((c & 2) != 2) {
                                this.e = new ArrayList();
                                c = 2;
                            }
                            this.e.add(mwgVar.g(efy0.h, vz00Var));
                        } else if (!l(mwgVar, w4c0VarY, vz00Var, iN)) {
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
                    this.e = Collections.unmodifiableList(this.e);
                }
                try {
                    w4c0VarY.F();
                } catch (IOException unused) {
                } finally {
                    this.b = jhcVar.d();
                }
                k();
                throw th;
            }
        }
        if ((c & 2) == 2) {
            this.e = Collections.unmodifiableList(this.e);
        }
        try {
            w4c0VarY.F();
        } catch (IOException unused2) {
        } finally {
            this.b = jhcVar.d();
        }
        k();
    }

    @Override // p.t8
    public final int a() {
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int iG = (this.c & 1) == 1 ? w4c0.g(1, this.d) : 0;
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            iG += w4c0.i(2, (t8) this.e.get(i3));
        }
        int size = this.b.size() + h() + iG;
        this.g = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        sfy0 sfy0Var = new sfy0();
        sfy0Var.f = Collections.EMPTY_LIST;
        return sfy0Var;
    }

    @Override // p.t8
    public final xe40 c() {
        sfy0 sfy0Var = new sfy0();
        sfy0Var.f = Collections.EMPTY_LIST;
        sfy0Var.h(this);
        return sfy0Var;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        kp00 kp00Var = new kp00(this);
        if ((this.c & 1) == 1) {
            w4c0Var.P(1, this.d);
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            w4c0Var.R(2, (t8) this.e.get(i2));
        }
        kp00Var.l(200, w4c0Var);
        w4c0Var.U(this.b);
    }

    @Override // p.u2j0
    public final t8 getDefaultInstanceForType() {
        return h;
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
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            if (!((efy0) this.e.get(i2)).isInitialized()) {
                this.f = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.f = (byte) 1;
            return true;
        }
        this.f = (byte) 0;
        return false;
    }

    public tfy0() {
        this.f = (byte) -1;
        this.g = -1;
        this.b = qhc.a;
    }

    public tfy0(sfy0 sfy0Var) {
        super(sfy0Var);
        this.f = (byte) -1;
        this.g = -1;
        this.b = sfy0Var.a;
    }
}
