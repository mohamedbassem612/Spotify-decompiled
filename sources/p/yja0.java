package p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yja0 extends kf40 {
    public static final tja0 X = new tja0((byte) 2);
    public static final yja0 t;
    public final qhc a;
    public int b;
    public vja0 c;
    public wja0 d;
    public wja0 e;
    public wja0 f;
    public wja0 g;
    public byte h;
    public int i;

    static {
        yja0 yja0Var = new yja0();
        t = yja0Var;
        yja0Var.c = vja0.g;
        wja0 wja0Var = wja0.g;
        yja0Var.d = wja0Var;
        yja0Var.e = wja0Var;
        yja0Var.f = wja0Var;
        yja0Var.g = wja0Var;
    }

    public yja0(mwg mwgVar, vz00 vz00Var) {
        this.h = (byte) -1;
        this.i = -1;
        this.c = vja0.g;
        wja0 wja0Var = wja0.g;
        this.d = wja0Var;
        this.e = wja0Var;
        this.f = wja0Var;
        this.g = wja0Var;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iN = mwgVar.n();
                    if (iN != 0) {
                        uja0 uja0VarK = null;
                        if (iN == 10) {
                            if ((this.b & 1) == 1) {
                                vja0 vja0Var = this.c;
                                vja0Var.getClass();
                                uja0VarK = new uja0((byte) 0);
                                uja0VarK.h(vja0Var);
                            }
                            vja0 vja0Var2 = (vja0) mwgVar.g(vja0.h, vz00Var);
                            this.c = vja0Var2;
                            if (uja0VarK != null) {
                                uja0VarK.h(vja0Var2);
                                this.c = uja0VarK.e();
                            }
                            this.b |= 1;
                        } else if (iN == 18) {
                            if ((this.b & 2) == 2) {
                                wja0 wja0Var2 = this.d;
                                wja0Var2.getClass();
                                uja0VarK = wja0.k(wja0Var2);
                            }
                            wja0 wja0Var3 = (wja0) mwgVar.g(wja0.h, vz00Var);
                            this.d = wja0Var3;
                            if (uja0VarK != null) {
                                uja0VarK.i(wja0Var3);
                                this.d = uja0VarK.g();
                            }
                            this.b |= 2;
                        } else if (iN == 26) {
                            if ((this.b & 4) == 4) {
                                wja0 wja0Var4 = this.e;
                                wja0Var4.getClass();
                                uja0VarK = wja0.k(wja0Var4);
                            }
                            wja0 wja0Var5 = (wja0) mwgVar.g(wja0.h, vz00Var);
                            this.e = wja0Var5;
                            if (uja0VarK != null) {
                                uja0VarK.i(wja0Var5);
                                this.e = uja0VarK.g();
                            }
                            this.b |= 4;
                        } else if (iN == 34) {
                            if ((this.b & 8) == 8) {
                                wja0 wja0Var6 = this.f;
                                wja0Var6.getClass();
                                uja0VarK = wja0.k(wja0Var6);
                            }
                            wja0 wja0Var7 = (wja0) mwgVar.g(wja0.h, vz00Var);
                            this.f = wja0Var7;
                            if (uja0VarK != null) {
                                uja0VarK.i(wja0Var7);
                                this.f = uja0VarK.g();
                            }
                            this.b |= 8;
                        } else if (iN == 42) {
                            if ((this.b & 16) == 16) {
                                wja0 wja0Var8 = this.g;
                                wja0Var8.getClass();
                                uja0VarK = wja0.k(wja0Var8);
                            }
                            wja0 wja0Var9 = (wja0) mwgVar.g(wja0.h, vz00Var);
                            this.g = wja0Var9;
                            if (uja0VarK != null) {
                                uja0VarK.i(wja0Var9);
                                this.g = uja0VarK.g();
                            }
                            this.b |= 16;
                        } else if (!mwgVar.q(iN, w4c0VarY)) {
                        }
                    }
                    z = true;
                } catch (IOException e) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                    invalidProtocolBufferException.a = this;
                    throw invalidProtocolBufferException;
                } catch (InvalidProtocolBufferException e2) {
                    e2.a = this;
                    throw e2;
                }
            } catch (Throwable th) {
                try {
                    w4c0VarY.F();
                } catch (IOException unused) {
                } finally {
                    this.a = jhcVar.d();
                }
                throw th;
            }
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
        int i = this.i;
        if (i != -1) {
            return i;
        }
        int i2 = (this.b & 1) == 1 ? w4c0.i(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            i2 += w4c0.i(2, this.d);
        }
        if ((this.b & 4) == 4) {
            i2 += w4c0.i(3, this.e);
        }
        if ((this.b & 8) == 8) {
            i2 += w4c0.i(4, this.f);
        }
        if ((this.b & 16) == 16) {
            i2 += w4c0.i(5, this.g);
        }
        int size = this.a.size() + i2;
        this.i = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        return xja0.h();
    }

    @Override // p.t8
    public final xe40 c() {
        xja0 xja0VarH = xja0.h();
        xja0VarH.j(this);
        return xja0VarH;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        if ((this.b & 1) == 1) {
            w4c0Var.R(1, this.c);
        }
        if ((this.b & 2) == 2) {
            w4c0Var.R(2, this.d);
        }
        if ((this.b & 4) == 4) {
            w4c0Var.R(3, this.e);
        }
        if ((this.b & 8) == 8) {
            w4c0Var.R(4, this.f);
        }
        if ((this.b & 16) == 16) {
            w4c0Var.R(5, this.g);
        }
        w4c0Var.U(this.a);
    }

    public final wja0 g() {
        return this.g;
    }

    public final boolean h() {
        return (this.b & 16) == 16;
    }

    public final boolean i() {
        return (this.b & 4) == 4;
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
        this.h = (byte) 1;
        return true;
    }

    public yja0() {
        this.h = (byte) -1;
        this.i = -1;
        this.a = qhc.a;
    }

    public yja0(xja0 xja0Var) {
        this.h = (byte) -1;
        this.i = -1;
        this.a = xja0Var.a;
    }
}
