package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zgy0 extends ef40 {
    public static final zgy0 N0;
    public static final tja0 O0 = new tja0((byte) 27);
    public bfy0 X;
    public byte Y;
    public int Z;
    public final qhc b;
    public int c;
    public int d;
    public int e;
    public rgy0 f;
    public int g;
    public rgy0 h;
    public int i;
    public List t;

    static {
        zgy0 zgy0Var = new zgy0();
        N0 = zgy0Var;
        zgy0Var.d = 0;
        zgy0Var.e = 0;
        rgy0 rgy0Var = rgy0.U0;
        zgy0Var.f = rgy0Var;
        zgy0Var.g = 0;
        zgy0Var.h = rgy0Var;
        zgy0Var.i = 0;
        zgy0Var.t = Collections.EMPTY_LIST;
        zgy0Var.X = bfy0.P0;
    }

    public zgy0(mwg mwgVar, vz00 vz00Var) {
        this.Y = (byte) -1;
        this.Z = -1;
        boolean z = false;
        this.d = 0;
        this.e = 0;
        rgy0 rgy0Var = rgy0.U0;
        this.f = rgy0Var;
        this.g = 0;
        this.h = rgy0Var;
        this.i = 0;
        this.t = Collections.EMPTY_LIST;
        this.X = bfy0.P0;
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
                        } else if (iN != 16) {
                            zey0 zey0VarG = null;
                            qgy0 qgy0VarP = null;
                            qgy0 qgy0VarP2 = null;
                            if (iN == 26) {
                                if ((this.c & 4) == 4) {
                                    rgy0 rgy0Var2 = this.f;
                                    rgy0Var2.getClass();
                                    qgy0VarP = rgy0.p(rgy0Var2);
                                }
                                rgy0 rgy0Var3 = (rgy0) mwgVar.g(rgy0.V0, vz00Var);
                                this.f = rgy0Var3;
                                if (qgy0VarP != null) {
                                    qgy0VarP.i(rgy0Var3);
                                    this.f = qgy0VarP.g();
                                }
                                this.c |= 4;
                            } else if (iN == 34) {
                                if ((this.c & 16) == 16) {
                                    rgy0 rgy0Var4 = this.h;
                                    rgy0Var4.getClass();
                                    qgy0VarP2 = rgy0.p(rgy0Var4);
                                }
                                rgy0 rgy0Var5 = (rgy0) mwgVar.g(rgy0.V0, vz00Var);
                                this.h = rgy0Var5;
                                if (qgy0VarP2 != null) {
                                    qgy0VarP2.i(rgy0Var5);
                                    this.h = qgy0VarP2.g();
                                }
                                this.c |= 16;
                            } else if (iN == 40) {
                                this.c |= 8;
                                this.g = mwgVar.k();
                            } else if (iN == 48) {
                                this.c |= 32;
                                this.i = mwgVar.k();
                            } else if (iN == 58) {
                                int i = (c == true ? 1 : 0) & '@';
                                c = c;
                                if (i != 64) {
                                    this.t = new ArrayList();
                                    c = '@';
                                }
                                this.t.add(mwgVar.g(efy0.h, vz00Var));
                            } else if (iN == 66) {
                                if ((this.c & 64) == 64) {
                                    bfy0 bfy0Var = this.X;
                                    bfy0Var.getClass();
                                    zey0VarG = zey0.g();
                                    zey0VarG.h(bfy0Var);
                                }
                                bfy0 bfy0Var2 = (bfy0) mwgVar.g(bfy0.Q0, vz00Var);
                                this.X = bfy0Var2;
                                if (zey0VarG != null) {
                                    zey0VarG.h(bfy0Var2);
                                    this.X = zey0VarG.e();
                                }
                                this.c |= 64;
                            } else if (!l(mwgVar, w4c0VarY, vz00Var, iN)) {
                            }
                        } else {
                            this.c |= 2;
                            this.e = mwgVar.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '@') == 64) {
                        this.t = Collections.unmodifiableList(this.t);
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
        if (((c == true ? 1 : 0) & '@') == 64) {
            this.t = Collections.unmodifiableList(this.t);
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
        int i = this.Z;
        if (i != -1) {
            return i;
        }
        int iG = (this.c & 1) == 1 ? w4c0.g(1, this.d) : 0;
        if ((this.c & 2) == 2) {
            iG += w4c0.g(2, this.e);
        }
        if ((this.c & 4) == 4) {
            iG += w4c0.i(3, this.f);
        }
        if ((this.c & 16) == 16) {
            iG += w4c0.i(4, this.h);
        }
        if ((this.c & 8) == 8) {
            iG += w4c0.g(5, this.g);
        }
        if ((this.c & 32) == 32) {
            iG += w4c0.g(6, this.i);
        }
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            iG += w4c0.i(7, (t8) this.t.get(i2));
        }
        if ((this.c & 64) == 64) {
            iG += w4c0.i(8, this.X);
        }
        int size = this.b.size() + h() + iG;
        this.Z = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        return ygy0.h();
    }

    @Override // p.t8
    public final xe40 c() {
        ygy0 ygy0VarH = ygy0.h();
        ygy0VarH.i(this);
        return ygy0VarH;
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
            w4c0Var.R(3, this.f);
        }
        if ((this.c & 16) == 16) {
            w4c0Var.R(4, this.h);
        }
        if ((this.c & 8) == 8) {
            w4c0Var.P(5, this.g);
        }
        if ((this.c & 32) == 32) {
            w4c0Var.P(6, this.i);
        }
        for (int i = 0; i < this.t.size(); i++) {
            w4c0Var.R(7, (t8) this.t.get(i));
        }
        if ((this.c & 64) == 64) {
            w4c0Var.R(8, this.X);
        }
        kp00Var.l(200, w4c0Var);
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
        if ((i & 2) != 2) {
            this.Y = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.f.isInitialized()) {
            this.Y = (byte) 0;
            return false;
        }
        if ((this.c & 16) == 16 && !this.h.isInitialized()) {
            this.Y = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            if (!((efy0) this.t.get(i2)).isInitialized()) {
                this.Y = (byte) 0;
                return false;
            }
        }
        if ((this.c & 64) == 64 && !this.X.isInitialized()) {
            this.Y = (byte) 0;
            return false;
        }
        if (g()) {
            this.Y = (byte) 1;
            return true;
        }
        this.Y = (byte) 0;
        return false;
    }

    public final int n() {
        return this.e;
    }

    public zgy0() {
        this.Y = (byte) -1;
        this.Z = -1;
        this.b = qhc.a;
    }

    public zgy0(ygy0 ygy0Var) {
        super(ygy0Var);
        this.Y = (byte) -1;
        this.Z = -1;
        this.b = ygy0Var.a;
    }
}
