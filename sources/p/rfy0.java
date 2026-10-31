package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rfy0 extends kf40 {
    public static final tja0 X = new tja0((byte) 12);
    public static final rfy0 t;
    public final qhc a;
    public int b;
    public pfy0 c;
    public List d;
    public wfy0 e;
    public qfy0 f;
    public ofy0 g;
    public byte h;
    public int i;

    static {
        rfy0 rfy0Var = new rfy0();
        t = rfy0Var;
        rfy0Var.c = pfy0.RETURNS_CONSTANT;
        rfy0Var.d = Collections.EMPTY_LIST;
        rfy0Var.e = wfy0.Y;
        rfy0Var.f = qfy0.AT_MOST_ONCE;
        rfy0Var.g = ofy0.CONCLUSION_CONDITION;
    }

    public rfy0(mwg mwgVar, vz00 vz00Var) {
        this.h = (byte) -1;
        this.i = -1;
        pfy0 pfy0Var = pfy0.RETURNS_CONSTANT;
        this.c = pfy0Var;
        this.d = Collections.EMPTY_LIST;
        this.e = wfy0.Y;
        qfy0 qfy0Var = qfy0.AT_MOST_ONCE;
        this.f = qfy0Var;
        ofy0 ofy0Var = ofy0.CONCLUSION_CONDITION;
        this.g = ofy0Var;
        boolean z = false;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = mwgVar.n();
                    if (iN != 0) {
                        ofy0 ofy0Var2 = null;
                        pfy0 pfy0Var2 = null;
                        ufy0 ufy0VarG = null;
                        qfy0 qfy0Var2 = null;
                        if (iN == 8) {
                            int iK = mwgVar.k();
                            if (iK == 0) {
                                pfy0Var2 = pfy0Var;
                            } else if (iK == 1) {
                                pfy0Var2 = pfy0.CALLS;
                            } else if (iK == 2) {
                                pfy0Var2 = pfy0.RETURNS_NOT_NULL;
                            }
                            if (pfy0Var2 == null) {
                                w4c0VarY.Y(iN);
                                w4c0VarY.Y(iK);
                            } else {
                                this.b |= 1;
                                this.c = pfy0Var2;
                            }
                        } else if (iN == 18) {
                            int i = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i != 2) {
                                this.d = new ArrayList();
                                c = 2;
                            }
                            this.d.add(mwgVar.g(wfy0.Z, vz00Var));
                        } else if (iN == 26) {
                            if ((this.b & 2) == 2) {
                                wfy0 wfy0Var = this.e;
                                wfy0Var.getClass();
                                ufy0VarG = ufy0.g();
                                ufy0VarG.h(wfy0Var);
                            }
                            wfy0 wfy0Var2 = (wfy0) mwgVar.g(wfy0.Z, vz00Var);
                            this.e = wfy0Var2;
                            if (ufy0VarG != null) {
                                ufy0VarG.h(wfy0Var2);
                                this.e = ufy0VarG.e();
                            }
                            this.b |= 2;
                        } else if (iN == 32) {
                            int iK2 = mwgVar.k();
                            if (iK2 == 0) {
                                qfy0Var2 = qfy0Var;
                            } else if (iK2 == 1) {
                                qfy0Var2 = qfy0.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                qfy0Var2 = qfy0.AT_LEAST_ONCE;
                            }
                            if (qfy0Var2 == null) {
                                w4c0VarY.Y(iN);
                                w4c0VarY.Y(iK2);
                            } else {
                                this.b |= 4;
                                this.f = qfy0Var2;
                            }
                        } else if (iN == 40) {
                            int iK3 = mwgVar.k();
                            if (iK3 == 0) {
                                ofy0Var2 = ofy0Var;
                            } else if (iK3 == 1) {
                                ofy0Var2 = ofy0.RETURNS_CONDITION;
                            } else if (iK3 == 2) {
                                ofy0Var2 = ofy0.HOLDSIN_CONDITION;
                            }
                            if (ofy0Var2 == null) {
                                w4c0VarY.Y(iN);
                                w4c0VarY.Y(iK3);
                            } else {
                                this.b |= 8;
                                this.g = ofy0Var2;
                            }
                        } else if (!mwgVar.q(iN, w4c0VarY)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 2) == 2) {
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
            } catch (InvalidProtocolBufferException e) {
                e.a = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.a = this;
                throw invalidProtocolBufferException;
            }
        }
        if (((c == true ? 1 : 0) & 2) == 2) {
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
        int i = this.i;
        if (i != -1) {
            return i;
        }
        int iF = (this.b & 1) == 1 ? w4c0.f(1, this.c.a) : 0;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            iF += w4c0.i(2, (t8) this.d.get(i2));
        }
        if ((this.b & 2) == 2) {
            iF += w4c0.i(3, this.e);
        }
        if ((this.b & 4) == 4) {
            iF += w4c0.f(4, this.f.a);
        }
        if ((this.b & 8) == 8) {
            iF += w4c0.f(5, this.g.a);
        }
        int size = this.a.size() + iF;
        this.i = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        return xja0.i();
    }

    @Override // p.t8
    public final xe40 c() {
        xja0 xja0VarI = xja0.i();
        xja0VarI.k(this);
        return xja0VarI;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        if ((this.b & 1) == 1) {
            w4c0Var.O(1, this.c.a);
        }
        for (int i = 0; i < this.d.size(); i++) {
            w4c0Var.R(2, (t8) this.d.get(i));
        }
        if ((this.b & 2) == 2) {
            w4c0Var.R(3, this.e);
        }
        if ((this.b & 4) == 4) {
            w4c0Var.O(4, this.f.a);
        }
        if ((this.b & 8) == 8) {
            w4c0Var.O(5, this.g.a);
        }
        w4c0Var.U(this.a);
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
        for (int i = 0; i < this.d.size(); i++) {
            if (!((wfy0) this.d.get(i)).isInitialized()) {
                this.h = (byte) 0;
                return false;
            }
        }
        if ((this.b & 2) != 2 || this.e.isInitialized()) {
            this.h = (byte) 1;
            return true;
        }
        this.h = (byte) 0;
        return false;
    }

    public rfy0() {
        this.h = (byte) -1;
        this.i = -1;
        this.a = qhc.a;
    }

    public rfy0(xja0 xja0Var) {
        this.h = (byte) -1;
        this.i = -1;
        this.a = xja0Var.a;
    }
}
