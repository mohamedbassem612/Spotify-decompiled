package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wgy0 extends ef40 {
    public static final wgy0 N0;
    public static final tja0 O0 = new tja0((byte) 25);
    public List X;
    public byte Y;
    public int Z;
    public final qhc b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public vgy0 g;
    public List h;
    public List i;
    public int t;

    static {
        wgy0 wgy0Var = new wgy0();
        N0 = wgy0Var;
        wgy0Var.d = 0;
        wgy0Var.e = 0;
        wgy0Var.f = false;
        wgy0Var.g = vgy0.INV;
        List list = Collections.EMPTY_LIST;
        wgy0Var.h = list;
        wgy0Var.i = list;
        wgy0Var.X = list;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    public wgy0(mwg mwgVar, vz00 vz00Var) {
        this.t = -1;
        this.Y = (byte) -1;
        this.Z = -1;
        this.d = 0;
        this.e = 0;
        this.f = false;
        vgy0 vgy0Var = vgy0.INV;
        this.g = vgy0Var;
        List list = Collections.EMPTY_LIST;
        this.h = list;
        this.i = list;
        this.X = list;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = mwgVar.n();
                        if (iN == 0) {
                            z = true;
                        } else if (iN == 8) {
                            this.c |= 1;
                            this.d = mwgVar.k();
                        } else if (iN == 16) {
                            this.c |= 2;
                            this.e = mwgVar.k();
                        } else if (iN == 24) {
                            this.c |= 4;
                            this.f = mwgVar.l() != 0;
                        } else if (iN == 32) {
                            int iK = mwgVar.k();
                            vgy0 vgy0Var2 = iK != 0 ? iK != 1 ? iK != 2 ? null : vgy0Var : vgy0.OUT : vgy0.IN;
                            if (vgy0Var2 == null) {
                                w4c0VarY.Y(iN);
                                w4c0VarY.Y(iK);
                            } else {
                                this.c |= 8;
                                this.g = vgy0Var2;
                            }
                        } else if (iN == 42) {
                            if ((i & 16) != 16) {
                                this.h = new ArrayList();
                                i |= 16;
                            }
                            this.h.add(mwgVar.g(rgy0.V0, vz00Var));
                        } else if (iN == 48) {
                            if ((i & 32) != 32) {
                                this.i = new ArrayList();
                                i |= 32;
                            }
                            this.i.add(Integer.valueOf(mwgVar.k()));
                        } else if (iN == 50) {
                            int iE = mwgVar.e(mwgVar.k());
                            if ((i & 32) != 32 && mwgVar.c() > 0) {
                                this.i = new ArrayList();
                                i |= 32;
                            }
                            while (mwgVar.c() > 0) {
                                this.i.add(Integer.valueOf(mwgVar.k()));
                            }
                            mwgVar.d(iE);
                        } else if (iN == 802) {
                            if ((i & 64) != 64) {
                                this.X = new ArrayList();
                                i |= 64;
                            }
                            this.X.add(mwgVar.g(efy0.h, vz00Var));
                        } else if (!l(mwgVar, w4c0VarY, vz00Var, iN)) {
                            z = true;
                        }
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
                if ((i & 16) == 16) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if ((i & 32) == 32) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if ((i & 64) == 64) {
                    this.X = Collections.unmodifiableList(this.X);
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
        if ((i & 16) == 16) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if ((i & 32) == 32) {
            this.i = Collections.unmodifiableList(this.i);
        }
        if ((i & 64) == 64) {
            this.X = Collections.unmodifiableList(this.X);
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
        List list;
        int i = this.Z;
        if (i != -1) {
            return i;
        }
        int iG = (this.c & 1) == 1 ? w4c0.g(1, this.d) : 0;
        if ((this.c & 2) == 2) {
            iG += w4c0.g(2, this.e);
        }
        if ((this.c & 4) == 4) {
            iG += w4c0.m(3) + 1;
        }
        if ((this.c & 8) == 8) {
            iG += w4c0.f(4, this.g.a);
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            iG += w4c0.i(5, (t8) this.h.get(i2));
        }
        int i3 = 0;
        int iH = 0;
        while (true) {
            int size = this.i.size();
            list = this.i;
            if (i3 >= size) {
                break;
            }
            iH += w4c0.h(((Integer) list.get(i3)).intValue());
            i3++;
        }
        int i4 = iG + iH;
        if (!list.isEmpty()) {
            i4 = i4 + 1 + w4c0.h(iH);
        }
        this.t = iH;
        for (int i5 = 0; i5 < this.X.size(); i5++) {
            i4 += w4c0.i(100, (t8) this.X.get(i5));
        }
        int size2 = this.b.size() + h() + i4;
        this.Z = size2;
        return size2;
    }

    @Override // p.t8
    public final xe40 b() {
        return ugy0.h();
    }

    @Override // p.t8
    public final xe40 c() {
        ugy0 ugy0VarH = ugy0.h();
        ugy0VarH.i(this);
        return ugy0VarH;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        kp00 kp00Var = new kp00(this);
        if ((this.c & 1) == 1) {
            w4c0Var.P(1, this.d);
        }
        if ((this.c & 2) == 2) {
            w4c0Var.P(2, this.e);
        }
        if ((this.c & 4) == 4) {
            boolean z = this.f;
            w4c0Var.a0(3, 0);
            w4c0Var.T(z ? 1 : 0);
        }
        if ((this.c & 8) == 8) {
            w4c0Var.O(4, this.g.a);
        }
        for (int i = 0; i < this.h.size(); i++) {
            w4c0Var.R(5, (t8) this.h.get(i));
        }
        if (this.i.size() > 0) {
            w4c0Var.Y(50);
            w4c0Var.Y(this.t);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            w4c0Var.Q(((Integer) this.i.get(i2)).intValue());
        }
        for (int i3 = 0; i3 < this.X.size(); i3++) {
            w4c0Var.R(100, (t8) this.X.get(i3));
        }
        kp00Var.l(1000, w4c0Var);
        w4c0Var.U(this.b);
    }

    @Override // p.u2j0
    public final t8 getDefaultInstanceForType() {
        return N0;
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.Y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.c;
        if ((i & 1) != 1) {
            this.Y = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.Y = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (!((rgy0) this.h.get(i2)).isInitialized()) {
                this.Y = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.X.size(); i3++) {
            if (!((efy0) this.X.get(i3)).isInitialized()) {
                this.Y = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.Y = (byte) 1;
            return true;
        }
        this.Y = (byte) 0;
        return false;
    }

    public wgy0() {
        this.t = -1;
        this.Y = (byte) -1;
        this.Z = -1;
        this.b = qhc.a;
    }

    public wgy0(ugy0 ugy0Var) {
        super(ugy0Var);
        this.t = -1;
        this.Y = (byte) -1;
        this.Z = -1;
        this.b = ugy0Var.a;
    }
}
