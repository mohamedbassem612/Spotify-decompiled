package p;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cka0 extends kf40 {
    public static final tja0 N0 = new tja0((byte) 4);
    public static final cka0 Z;
    public byte X;
    public int Y;
    public final qhc a;
    public int b;
    public int c;
    public int d;
    public Object e;
    public bka0 f;
    public List g;
    public int h;
    public List i;
    public int t;

    static {
        cka0 cka0Var = new cka0();
        Z = cka0Var;
        cka0Var.c = 1;
        cka0Var.d = 0;
        cka0Var.e = "";
        cka0Var.f = bka0.NONE;
        List list = Collections.EMPTY_LIST;
        cka0Var.g = list;
        cka0Var.i = list;
    }

    public cka0(mwg mwgVar) {
        this.h = -1;
        this.t = -1;
        this.X = (byte) -1;
        this.Y = -1;
        this.c = 1;
        boolean z = false;
        this.d = 0;
        this.e = "";
        bka0 bka0Var = bka0.NONE;
        this.f = bka0Var;
        List list = Collections.EMPTY_LIST;
        this.g = list;
        this.i = list;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = mwgVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.b |= 1;
                            this.c = mwgVar.k();
                        } else if (iN == 16) {
                            this.b |= 2;
                            this.d = mwgVar.k();
                        } else if (iN == 24) {
                            int iK = mwgVar.k();
                            bka0 bka0Var2 = iK != 0 ? iK != 1 ? iK != 2 ? null : bka0.DESC_TO_CLASS_ID : bka0.INTERNAL_TO_CLASS_ID : bka0Var;
                            if (bka0Var2 == null) {
                                w4c0VarY.Y(iN);
                                w4c0VarY.Y(iK);
                            } else {
                                this.b |= 8;
                                this.f = bka0Var2;
                            }
                        } else if (iN == 32) {
                            if ((i & 16) != 16) {
                                this.g = new ArrayList();
                                i |= 16;
                            }
                            this.g.add(Integer.valueOf(mwgVar.k()));
                        } else if (iN == 34) {
                            int iE = mwgVar.e(mwgVar.k());
                            if ((i & 16) != 16 && mwgVar.c() > 0) {
                                this.g = new ArrayList();
                                i |= 16;
                            }
                            while (mwgVar.c() > 0) {
                                this.g.add(Integer.valueOf(mwgVar.k()));
                            }
                            mwgVar.d(iE);
                        } else if (iN == 40) {
                            if ((i & 32) != 32) {
                                this.i = new ArrayList();
                                i |= 32;
                            }
                            this.i.add(Integer.valueOf(mwgVar.k()));
                        } else if (iN == 42) {
                            int iE2 = mwgVar.e(mwgVar.k());
                            if ((i & 32) != 32 && mwgVar.c() > 0) {
                                this.i = new ArrayList();
                                i |= 32;
                            }
                            while (mwgVar.c() > 0) {
                                this.i.add(Integer.valueOf(mwgVar.k()));
                            }
                            mwgVar.d(iE2);
                        } else if (iN == 50) {
                            qmd0 qmd0VarF = mwgVar.f();
                            this.b |= 4;
                            this.e = qmd0VarF;
                        } else if (!mwgVar.q(iN, w4c0VarY)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    if ((i & 32) == 32) {
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
            } catch (InvalidProtocolBufferException e) {
                e.a = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.a = this;
                throw invalidProtocolBufferException;
            }
        }
        if ((i & 16) == 16) {
            this.g = Collections.unmodifiableList(this.g);
        }
        if ((i & 32) == 32) {
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
        List list;
        List list2;
        qhc qmd0Var;
        int i = this.Y;
        if (i != -1) {
            return i;
        }
        int iG = (this.b & 1) == 1 ? w4c0.g(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iG += w4c0.g(2, this.d);
        }
        if ((this.b & 8) == 8) {
            iG += w4c0.f(3, this.f.a);
        }
        int i2 = 0;
        int iH = 0;
        while (true) {
            int size = this.g.size();
            list = this.g;
            if (i2 >= size) {
                break;
            }
            iH += w4c0.h(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iH2 = iG + iH;
        if (!list.isEmpty()) {
            iH2 = iH2 + 1 + w4c0.h(iH);
        }
        this.h = iH;
        int i3 = 0;
        int iH3 = 0;
        while (true) {
            int size2 = this.i.size();
            list2 = this.i;
            if (i3 >= size2) {
                break;
            }
            iH3 += w4c0.h(((Integer) list2.get(i3)).intValue());
            i3++;
        }
        int size3 = iH2 + iH3;
        if (!list2.isEmpty()) {
            size3 = size3 + 1 + w4c0.h(iH3);
        }
        this.t = iH3;
        if ((this.b & 4) == 4) {
            Object obj = this.e;
            if (obj instanceof String) {
                try {
                    qmd0Var = new qmd0(((String) obj).getBytes("UTF-8"));
                    this.e = qmd0Var;
                } catch (UnsupportedEncodingException e) {
                    bhn0.o("UTF-8 not supported?", e);
                    return 0;
                }
            } else {
                qmd0Var = (qhc) obj;
            }
            size3 += qmd0Var.size() + w4c0.k(qmd0Var.size()) + w4c0.m(6);
        }
        int size4 = this.a.size() + size3;
        this.Y = size4;
        return size4;
    }

    @Override // p.t8
    public final xe40 b() {
        return aka0.g();
    }

    @Override // p.t8
    public final xe40 c() {
        aka0 aka0VarG = aka0.g();
        aka0VarG.h(this);
        return aka0VarG;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        qhc qmd0Var;
        a();
        if ((this.b & 1) == 1) {
            w4c0Var.P(1, this.c);
        }
        if ((this.b & 2) == 2) {
            w4c0Var.P(2, this.d);
        }
        if ((this.b & 8) == 8) {
            w4c0Var.O(3, this.f.a);
        }
        if (this.g.size() > 0) {
            w4c0Var.Y(34);
            w4c0Var.Y(this.h);
        }
        for (int i = 0; i < this.g.size(); i++) {
            w4c0Var.Q(((Integer) this.g.get(i)).intValue());
        }
        if (this.i.size() > 0) {
            w4c0Var.Y(42);
            w4c0Var.Y(this.t);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            w4c0Var.Q(((Integer) this.i.get(i2)).intValue());
        }
        if ((this.b & 4) == 4) {
            Object obj = this.e;
            if (obj instanceof String) {
                try {
                    qmd0Var = new qmd0(((String) obj).getBytes("UTF-8"));
                    this.e = qmd0Var;
                } catch (UnsupportedEncodingException e) {
                    bhn0.o("UTF-8 not supported?", e);
                    return;
                }
            } else {
                qmd0Var = (qhc) obj;
            }
            w4c0Var.a0(6, 2);
            w4c0Var.Y(qmd0Var.size());
            w4c0Var.U(qmd0Var);
        }
        w4c0Var.U(this.a);
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.X;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.X = (byte) 1;
        return true;
    }

    public cka0() {
        this.h = -1;
        this.t = -1;
        this.X = (byte) -1;
        this.Y = -1;
        this.a = qhc.a;
    }

    public cka0(aka0 aka0Var) {
        this.h = -1;
        this.t = -1;
        this.X = (byte) -1;
        this.Y = -1;
        this.a = aka0Var.a;
    }
}
