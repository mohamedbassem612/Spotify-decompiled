package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cgy0 extends ef40 {
    public static final cgy0 X;
    public static final tja0 Y = new tja0((byte) 16);
    public final qhc b;
    public int c;
    public List d;
    public List e;
    public List f;
    public xgy0 g;
    public ehy0 h;
    public byte i;
    public int t;

    static {
        cgy0 cgy0Var = new cgy0();
        X = cgy0Var;
        List list = Collections.EMPTY_LIST;
        cgy0Var.d = list;
        cgy0Var.e = list;
        cgy0Var.f = list;
        cgy0Var.g = xgy0.g;
        cgy0Var.h = ehy0.e;
    }

    public cgy0(mwg mwgVar, vz00 vz00Var) {
        this.i = (byte) -1;
        this.t = -1;
        List list = Collections.EMPTY_LIST;
        this.d = list;
        this.e = list;
        this.f = list;
        this.g = xgy0.g;
        this.h = ehy0.e;
        boolean z = false;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        int i = 0;
        while (true) {
            byte b = 2;
            if (z) {
                break;
            }
            try {
                try {
                    int iN = mwgVar.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 != 1) {
                                this.d = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.d.add(mwgVar.g(yfy0.Z0, vz00Var));
                        } else if (iN == 34) {
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 != 2) {
                                this.e = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.e.add(mwgVar.g(ggy0.f1, vz00Var));
                        } else if (iN != 42) {
                            lfy0 lfy0Var = null;
                            dfy0 dfy0VarG = null;
                            if (iN == 242) {
                                if ((this.c & 1) == 1) {
                                    xgy0 xgy0Var = this.g;
                                    xgy0Var.getClass();
                                    dfy0VarG = xgy0.g(xgy0Var);
                                }
                                xgy0 xgy0Var2 = (xgy0) mwgVar.g(xgy0.h, vz00Var);
                                this.g = xgy0Var2;
                                if (dfy0VarG != null) {
                                    dfy0VarG.i(xgy0Var2);
                                    this.g = dfy0VarG.g();
                                }
                                this.c |= 1;
                            } else if (iN == 258) {
                                if ((this.c & 2) == 2) {
                                    ehy0 ehy0Var = this.h;
                                    ehy0Var.getClass();
                                    lfy0Var = new lfy0(b);
                                    lfy0Var.d = Collections.EMPTY_LIST;
                                    lfy0Var.n(ehy0Var);
                                }
                                ehy0 ehy0Var2 = (ehy0) mwgVar.g(ehy0.f, vz00Var);
                                this.h = ehy0Var2;
                                if (lfy0Var != null) {
                                    lfy0Var.n(ehy0Var2);
                                    this.h = lfy0Var.i();
                                }
                                this.c |= 2;
                            } else if (!l(mwgVar, w4c0VarY, vz00Var, iN)) {
                            }
                        } else {
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 != 4) {
                                this.f = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.f.add(mwgVar.g(tgy0.Q0, vz00Var));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((i == true ? 1 : 0) & 1) == 1) {
                        this.d = Collections.unmodifiableList(this.d);
                    }
                    if (((i == true ? 1 : 0) & 2) == 2) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    if (((i == true ? 1 : 0) & 4) == 4) {
                        this.f = Collections.unmodifiableList(this.f);
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
            } catch (InvalidProtocolBufferException e) {
                e.a = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.a = this;
                throw invalidProtocolBufferException;
            }
        }
        if (((i == true ? 1 : 0) & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
        }
        if (((i == true ? 1 : 0) & 2) == 2) {
            this.e = Collections.unmodifiableList(this.e);
        }
        if (((i == true ? 1 : 0) & 4) == 4) {
            this.f = Collections.unmodifiableList(this.f);
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
        int i = this.t;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.d.size(); i3++) {
            i2 += w4c0.i(3, (t8) this.d.get(i3));
        }
        for (int i4 = 0; i4 < this.e.size(); i4++) {
            i2 += w4c0.i(4, (t8) this.e.get(i4));
        }
        for (int i5 = 0; i5 < this.f.size(); i5++) {
            i2 += w4c0.i(5, (t8) this.f.get(i5));
        }
        if ((this.c & 1) == 1) {
            i2 += w4c0.i(30, this.g);
        }
        if ((this.c & 2) == 2) {
            i2 += w4c0.i(32, this.h);
        }
        int size = this.b.size() + h() + i2;
        this.t = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        return bgy0.h();
    }

    @Override // p.t8
    public final xe40 c() {
        bgy0 bgy0VarH = bgy0.h();
        bgy0VarH.i(this);
        return bgy0VarH;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        kp00 kp00Var = new kp00(this);
        for (int i = 0; i < this.d.size(); i++) {
            w4c0Var.R(3, (t8) this.d.get(i));
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            w4c0Var.R(4, (t8) this.e.get(i2));
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            w4c0Var.R(5, (t8) this.f.get(i3));
        }
        if ((this.c & 1) == 1) {
            w4c0Var.R(30, this.g);
        }
        if ((this.c & 2) == 2) {
            w4c0Var.R(32, this.h);
        }
        kp00Var.l(200, w4c0Var);
        w4c0Var.U(this.b);
    }

    @Override // p.u2j0
    public final t8 getDefaultInstanceForType() {
        return X;
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
        for (int i = 0; i < this.d.size(); i++) {
            if (!((yfy0) this.d.get(i)).isInitialized()) {
                this.i = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            if (!((ggy0) this.e.get(i2)).isInitialized()) {
                this.i = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            if (!((tgy0) this.f.get(i3)).isInitialized()) {
                this.i = (byte) 0;
                return false;
            }
        }
        if ((this.c & 1) == 1 && !this.g.isInitialized()) {
            this.i = (byte) 0;
            return false;
        }
        if (g()) {
            this.i = (byte) 1;
            return true;
        }
        this.i = (byte) 0;
        return false;
    }

    public cgy0() {
        this.i = (byte) -1;
        this.t = -1;
        this.b = qhc.a;
    }

    public cgy0(bgy0 bgy0Var) {
        super(bgy0Var);
        this.i = (byte) -1;
        this.t = -1;
        this.b = bgy0Var.a;
    }
}
