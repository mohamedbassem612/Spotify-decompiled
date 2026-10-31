package p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mgy0 extends kf40 {
    public static final mgy0 e;
    public static final tja0 f = new tja0((byte) 21);
    public final qhc a;
    public ovb0 b;
    public byte c;
    public int d;

    static {
        mgy0 mgy0Var = new mgy0();
        e = mgy0Var;
        mgy0Var.b = jvb0.b;
    }

    public mgy0(mwg mwgVar) {
        this.c = (byte) -1;
        this.d = -1;
        this.b = jvb0.b;
        boolean z = false;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = mwgVar.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            qmd0 qmd0VarF = mwgVar.f();
                            if (!z2) {
                                this.b = new jvb0();
                                z2 = true;
                            }
                            this.b.N0(qmd0VarF);
                        } else if (!mwgVar.q(iN, w4c0VarY)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.b = this.b.g();
                    }
                    try {
                        w4c0VarY.F();
                    } catch (IOException unused) {
                    } finally {
                        this.a = jhcVar.d();
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e2) {
                e2.a = this;
                throw e2;
            } catch (IOException e3) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                invalidProtocolBufferException.a = this;
                throw invalidProtocolBufferException;
            }
        }
        if (z2) {
            this.b = this.b.g();
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
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int size = 0;
        while (true) {
            int size2 = this.b.size();
            ovb0 ovb0Var = this.b;
            if (i2 >= size2) {
                int size3 = this.a.size() + ovb0Var.size() + size;
                this.d = size3;
                return size3;
            }
            qhc qhcVarC0 = ovb0Var.c0(i2);
            size += qhcVarC0.size() + w4c0.k(qhcVarC0.size());
            i2++;
        }
    }

    @Override // p.t8
    public final xe40 b() {
        lfy0 lfy0Var = new lfy0((byte) 3);
        lfy0Var.d = jvb0.b;
        return lfy0Var;
    }

    @Override // p.t8
    public final xe40 c() {
        lfy0 lfy0Var = new lfy0((byte) 3);
        lfy0Var.d = jvb0.b;
        lfy0Var.l(this);
        return lfy0Var;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        for (int i = 0; i < this.b.size(); i++) {
            qhc qhcVarC0 = this.b.c0(i);
            w4c0Var.a0(1, 2);
            w4c0Var.Y(qhcVarC0.size());
            w4c0Var.U(qhcVarC0);
        }
        w4c0Var.U(this.a);
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.c;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.c = (byte) 1;
        return true;
    }

    public mgy0() {
        this.c = (byte) -1;
        this.d = -1;
        this.a = qhc.a;
    }

    public mgy0(lfy0 lfy0Var) {
        this.c = (byte) -1;
        this.d = -1;
        this.a = lfy0Var.a;
    }
}
