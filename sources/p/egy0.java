package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class egy0 extends ef40 {
    public static final tja0 X = new tja0((byte) 17);
    public static final egy0 t;
    public final qhc b;
    public int c;
    public mgy0 d;
    public kgy0 e;
    public cgy0 f;
    public List g;
    public byte h;
    public int i;

    static {
        egy0 egy0Var = new egy0();
        t = egy0Var;
        egy0Var.d = mgy0.e;
        egy0Var.e = kgy0.e;
        egy0Var.f = cgy0.X;
        egy0Var.g = Collections.EMPTY_LIST;
    }

    public egy0(mwg mwgVar, vz00 vz00Var) {
        this.h = (byte) -1;
        this.i = -1;
        this.d = mgy0.e;
        this.e = kgy0.e;
        this.f = cgy0.X;
        this.g = Collections.EMPTY_LIST;
        boolean z = false;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = mwgVar.n();
                    if (iN != 0) {
                        bgy0 bgy0VarH = null;
                        lfy0 lfy0Var = null;
                        lfy0 lfy0Var2 = null;
                        if (iN == 10) {
                            if ((this.c & 1) == 1) {
                                mgy0 mgy0Var = this.d;
                                mgy0Var.getClass();
                                lfy0Var = new lfy0((byte) 3);
                                lfy0Var.d = jvb0.b;
                                lfy0Var.l(mgy0Var);
                            }
                            mgy0 mgy0Var2 = (mgy0) mwgVar.g(mgy0.f, vz00Var);
                            this.d = mgy0Var2;
                            if (lfy0Var != null) {
                                lfy0Var.l(mgy0Var2);
                                this.d = lfy0Var.h();
                            }
                            this.c |= 1;
                        } else if (iN == 18) {
                            if ((this.c & 2) == 2) {
                                kgy0 kgy0Var = this.e;
                                kgy0Var.getClass();
                                lfy0Var2 = new lfy0((byte) 1);
                                lfy0Var2.d = Collections.EMPTY_LIST;
                                lfy0Var2.k(kgy0Var);
                            }
                            kgy0 kgy0Var2 = (kgy0) mwgVar.g(kgy0.f, vz00Var);
                            this.e = kgy0Var2;
                            if (lfy0Var2 != null) {
                                lfy0Var2.k(kgy0Var2);
                                this.e = lfy0Var2.g();
                            }
                            this.c |= 2;
                        } else if (iN == 26) {
                            if ((this.c & 4) == 4) {
                                cgy0 cgy0Var = this.f;
                                cgy0Var.getClass();
                                bgy0VarH = bgy0.h();
                                bgy0VarH.i(cgy0Var);
                            }
                            cgy0 cgy0Var2 = (cgy0) mwgVar.g(cgy0.Y, vz00Var);
                            this.f = cgy0Var2;
                            if (bgy0VarH != null) {
                                bgy0VarH.i(cgy0Var2);
                                this.f = bgy0VarH.g();
                            }
                            this.c |= 4;
                        } else if (iN == 34) {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.g = new ArrayList();
                                c = '\b';
                            }
                            this.g.add(mwgVar.g(hfy0.h1, vz00Var));
                        } else if (!l(mwgVar, w4c0VarY, vz00Var, iN)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '\b') == 8) {
                        this.g = Collections.unmodifiableList(this.g);
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
            } catch (IOException e) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                invalidProtocolBufferException.a = this;
                throw invalidProtocolBufferException;
            } catch (InvalidProtocolBufferException e2) {
                e2.a = this;
                throw e2;
            }
        }
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.g = Collections.unmodifiableList(this.g);
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
        int i = this.i;
        if (i != -1) {
            return i;
        }
        int i2 = (this.c & 1) == 1 ? w4c0.i(1, this.d) : 0;
        if ((this.c & 2) == 2) {
            i2 += w4c0.i(2, this.e);
        }
        if ((this.c & 4) == 4) {
            i2 += w4c0.i(3, this.f);
        }
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            i2 += w4c0.i(4, (t8) this.g.get(i3));
        }
        int size = this.b.size() + h() + i2;
        this.i = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        return dgy0.h();
    }

    @Override // p.t8
    public final xe40 c() {
        dgy0 dgy0VarH = dgy0.h();
        dgy0VarH.i(this);
        return dgy0VarH;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        kp00 kp00Var = new kp00(this);
        if ((this.c & 1) == 1) {
            w4c0Var.R(1, this.d);
        }
        if ((this.c & 2) == 2) {
            w4c0Var.R(2, this.e);
        }
        if ((this.c & 4) == 4) {
            w4c0Var.R(3, this.f);
        }
        for (int i = 0; i < this.g.size(); i++) {
            w4c0Var.R(4, (t8) this.g.get(i));
        }
        kp00Var.l(200, w4c0Var);
        w4c0Var.U(this.b);
    }

    @Override // p.u2j0
    public final t8 getDefaultInstanceForType() {
        return t;
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.c & 2) == 2 && !this.e.isInitialized()) {
            this.h = (byte) 0;
            return false;
        }
        if ((this.c & 4) == 4 && !this.f.isInitialized()) {
            this.h = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            if (!((hfy0) this.g.get(i)).isInitialized()) {
                this.h = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.h = (byte) 1;
            return true;
        }
        this.h = (byte) 0;
        return false;
    }

    public egy0() {
        this.h = (byte) -1;
        this.i = -1;
        this.b = qhc.a;
    }

    public egy0(dgy0 dgy0Var) {
        super(dgy0Var);
        this.h = (byte) -1;
        this.i = -1;
        this.b = dgy0Var.a;
    }
}
