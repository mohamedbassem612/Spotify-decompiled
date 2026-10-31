package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kgy0 extends kf40 {
    public static final kgy0 e;
    public static final tja0 f = new tja0((byte) 19);
    public final qhc a;
    public List b;
    public byte c;
    public int d;

    static {
        kgy0 kgy0Var = new kgy0();
        e = kgy0Var;
        kgy0Var.b = Collections.EMPTY_LIST;
    }

    public kgy0(mwg mwgVar, vz00 vz00Var) {
        this.c = (byte) -1;
        this.d = -1;
        this.b = Collections.EMPTY_LIST;
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
                            if (!z2) {
                                this.b = new ArrayList();
                                z2 = true;
                            }
                            this.b.add(mwgVar.g(jgy0.i, vz00Var));
                        } else if (!mwgVar.q(iN, w4c0VarY)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.b = Collections.unmodifiableList(this.b);
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
            this.b = Collections.unmodifiableList(this.b);
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += w4c0.i(1, (t8) this.b.get(i3));
        }
        int size = this.a.size() + i2;
        this.d = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        lfy0 lfy0Var = new lfy0((byte) 1);
        lfy0Var.d = Collections.EMPTY_LIST;
        return lfy0Var;
    }

    @Override // p.t8
    public final xe40 c() {
        lfy0 lfy0Var = new lfy0((byte) 1);
        lfy0Var.d = Collections.EMPTY_LIST;
        lfy0Var.k(this);
        return lfy0Var;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        for (int i = 0; i < this.b.size(); i++) {
            w4c0Var.R(1, (t8) this.b.get(i));
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
        for (int i = 0; i < this.b.size(); i++) {
            if (!((jgy0) this.b.get(i)).isInitialized()) {
                this.c = (byte) 0;
                return false;
            }
        }
        this.c = (byte) 1;
        return true;
    }

    public kgy0() {
        this.c = (byte) -1;
        this.d = -1;
        this.a = qhc.a;
    }

    public kgy0(lfy0 lfy0Var) {
        this.c = (byte) -1;
        this.d = -1;
        this.a = lfy0Var.a;
    }
}
