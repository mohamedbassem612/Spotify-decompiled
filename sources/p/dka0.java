package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dka0 extends kf40 {
    public static final dka0 g;
    public static final tja0 h = new tja0((byte) 3);
    public final qhc a;
    public List b;
    public List c;
    public int d;
    public byte e;
    public int f;

    static {
        dka0 dka0Var = new dka0();
        g = dka0Var;
        List list = Collections.EMPTY_LIST;
        dka0Var.b = list;
        dka0Var.c = list;
    }

    public dka0(mwg mwgVar, vz00 vz00Var) {
        this.d = -1;
        this.e = (byte) -1;
        this.f = -1;
        List list = Collections.EMPTY_LIST;
        this.b = list;
        this.c = list;
        boolean z = false;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = mwgVar.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if ((i & 1) != 1) {
                                    this.b = new ArrayList();
                                    i |= 1;
                                }
                                this.b.add(mwgVar.g(cka0.N0, vz00Var));
                            } else if (iN == 40) {
                                if ((i & 2) != 2) {
                                    this.c = new ArrayList();
                                    i |= 2;
                                }
                                this.c.add(Integer.valueOf(mwgVar.k()));
                            } else if (iN == 42) {
                                int iE = mwgVar.e(mwgVar.k());
                                if ((i & 2) != 2 && mwgVar.c() > 0) {
                                    this.c = new ArrayList();
                                    i |= 2;
                                }
                                while (mwgVar.c() > 0) {
                                    this.c.add(Integer.valueOf(mwgVar.k()));
                                }
                                mwgVar.d(iE);
                            } else if (!mwgVar.q(iN, w4c0VarY)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.a = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.a = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.b = Collections.unmodifiableList(this.b);
                }
                if ((i & 2) == 2) {
                    this.c = Collections.unmodifiableList(this.c);
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
        if ((i & 1) == 1) {
            this.b = Collections.unmodifiableList(this.b);
        }
        if ((i & 2) == 2) {
            this.c = Collections.unmodifiableList(this.c);
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
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.b.size(); i4++) {
            i3 += w4c0.i(1, (t8) this.b.get(i4));
        }
        int iH = 0;
        while (true) {
            int size = this.c.size();
            list = this.c;
            if (i2 >= size) {
                break;
            }
            iH += w4c0.h(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iH2 = i3 + iH;
        if (!list.isEmpty()) {
            iH2 = iH2 + 1 + w4c0.h(iH);
        }
        this.d = iH;
        int size2 = this.a.size() + iH2;
        this.f = size2;
        return size2;
    }

    @Override // p.t8
    public final xe40 b() {
        zja0 zja0Var = new zja0();
        List list = Collections.EMPTY_LIST;
        zja0Var.c = list;
        zja0Var.d = list;
        return zja0Var;
    }

    @Override // p.t8
    public final xe40 c() {
        zja0 zja0Var = new zja0();
        List list = Collections.EMPTY_LIST;
        zja0Var.c = list;
        zja0Var.d = list;
        zja0Var.g(this);
        return zja0Var;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        for (int i = 0; i < this.b.size(); i++) {
            w4c0Var.R(1, (t8) this.b.get(i));
        }
        if (this.c.size() > 0) {
            w4c0Var.Y(42);
            w4c0Var.Y(this.d);
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            w4c0Var.Q(((Integer) this.c.get(i2)).intValue());
        }
        w4c0Var.U(this.a);
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.e = (byte) 1;
        return true;
    }

    public dka0() {
        this.d = -1;
        this.e = (byte) -1;
        this.f = -1;
        this.a = qhc.a;
    }

    public dka0(zja0 zja0Var) {
        this.d = -1;
        this.e = (byte) -1;
        this.f = -1;
        this.a = zja0Var.a;
    }
}
