package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wfy0 extends kf40 {
    public static final wfy0 Y;
    public static final tja0 Z = new tja0((byte) 14);
    public int X;
    public final qhc a;
    public int b;
    public int c;
    public int d;
    public vfy0 e;
    public rgy0 f;
    public int g;
    public List h;
    public List i;
    public byte t;

    static {
        wfy0 wfy0Var = new wfy0();
        Y = wfy0Var;
        wfy0Var.c = 0;
        wfy0Var.d = 0;
        wfy0Var.e = vfy0.TRUE;
        wfy0Var.f = rgy0.U0;
        wfy0Var.g = 0;
        List list = Collections.EMPTY_LIST;
        wfy0Var.h = list;
        wfy0Var.i = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wfy0(mwg mwgVar, vz00 vz00Var) {
        vfy0 vfy0Var;
        this.t = (byte) -1;
        this.X = -1;
        boolean z = false;
        this.c = 0;
        this.d = 0;
        vfy0 vfy0Var2 = vfy0.TRUE;
        this.e = vfy0Var2;
        this.f = rgy0.U0;
        this.g = 0;
        List list = Collections.EMPTY_LIST;
        this.h = list;
        this.i = list;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = mwgVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.b |= 1;
                                this.c = mwgVar.k();
                            } else if (iN != 16) {
                                Object objP = null;
                                if (iN == 24) {
                                    int iK = mwgVar.k();
                                    if (iK != 0) {
                                        if (iK == 1) {
                                            objP = vfy0.FALSE;
                                        } else if (iK == 2) {
                                            objP = vfy0.NULL;
                                        }
                                        vfy0Var = objP;
                                    } else {
                                        vfy0Var = vfy0Var2;
                                    }
                                    if (vfy0Var == 0) {
                                        w4c0VarY.Y(iN);
                                        w4c0VarY.Y(iK);
                                    } else {
                                        this.b |= 4;
                                        this.e = vfy0Var;
                                    }
                                } else if (iN == 34) {
                                    if ((this.b & 8) == 8) {
                                        rgy0 rgy0Var = this.f;
                                        rgy0Var.getClass();
                                        objP = rgy0.p(rgy0Var);
                                    }
                                    qgy0 qgy0Var = objP;
                                    rgy0 rgy0Var2 = (rgy0) mwgVar.g(rgy0.V0, vz00Var);
                                    this.f = rgy0Var2;
                                    if (qgy0Var != 0) {
                                        qgy0Var.i(rgy0Var2);
                                        this.f = qgy0Var.g();
                                    }
                                    this.b |= 8;
                                } else if (iN != 40) {
                                    tja0 tja0Var = Z;
                                    if (iN == 50) {
                                        if ((i & 32) != 32) {
                                            this.h = new ArrayList();
                                            i |= 32;
                                        }
                                        this.h.add(mwgVar.g(tja0Var, vz00Var));
                                    } else if (iN == 58) {
                                        if ((i & 64) != 64) {
                                            this.i = new ArrayList();
                                            i |= 64;
                                        }
                                        this.i.add(mwgVar.g(tja0Var, vz00Var));
                                    } else if (!mwgVar.q(iN, w4c0VarY)) {
                                    }
                                } else {
                                    this.b |= 16;
                                    this.g = mwgVar.k();
                                }
                            } else {
                                this.b |= 2;
                                this.d = mwgVar.k();
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                        invalidProtocolBufferException.a = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    e2.a = this;
                    throw e2;
                }
            } catch (Throwable th) {
                if ((i & 32) == 32) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if ((i & 64) == 64) {
                    this.i = Collections.unmodifiableList(this.i);
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
        if ((i & 32) == 32) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if ((i & 64) == 64) {
            this.i = Collections.unmodifiableList(this.i);
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
        int i = this.X;
        if (i != -1) {
            return i;
        }
        int iG = (this.b & 1) == 1 ? w4c0.g(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iG += w4c0.g(2, this.d);
        }
        if ((this.b & 4) == 4) {
            iG += w4c0.f(3, this.e.a);
        }
        if ((this.b & 8) == 8) {
            iG += w4c0.i(4, this.f);
        }
        if ((this.b & 16) == 16) {
            iG += w4c0.g(5, this.g);
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            iG += w4c0.i(6, (t8) this.h.get(i2));
        }
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            iG += w4c0.i(7, (t8) this.i.get(i3));
        }
        int size = this.a.size() + iG;
        this.X = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        return ufy0.g();
    }

    @Override // p.t8
    public final xe40 c() {
        ufy0 ufy0VarG = ufy0.g();
        ufy0VarG.h(this);
        return ufy0VarG;
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
        if ((this.b & 4) == 4) {
            w4c0Var.O(3, this.e.a);
        }
        if ((this.b & 8) == 8) {
            w4c0Var.R(4, this.f);
        }
        if ((this.b & 16) == 16) {
            w4c0Var.P(5, this.g);
        }
        for (int i = 0; i < this.h.size(); i++) {
            w4c0Var.R(6, (t8) this.h.get(i));
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            w4c0Var.R(7, (t8) this.i.get(i2));
        }
        w4c0Var.U(this.a);
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.t;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.b & 8) == 8 && !this.f.isInitialized()) {
            this.t = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.h.size(); i++) {
            if (!((wfy0) this.h.get(i)).isInitialized()) {
                this.t = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (!((wfy0) this.i.get(i2)).isInitialized()) {
                this.t = (byte) 0;
                return false;
            }
        }
        this.t = (byte) 1;
        return true;
    }

    public wfy0() {
        this.t = (byte) -1;
        this.X = -1;
        this.a = qhc.a;
    }

    public wfy0(ufy0 ufy0Var) {
        this.t = (byte) -1;
        this.X = -1;
        this.a = ufy0Var.a;
    }
}
