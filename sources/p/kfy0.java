package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kfy0 extends ef40 {
    public static final kfy0 X;
    public static final tja0 Y = new tja0((byte) 10);
    public final qhc b;
    public int c;
    public int d;
    public List e;
    public List f;
    public List g;
    public List h;
    public byte i;
    public int t;

    static {
        kfy0 kfy0Var = new kfy0();
        X = kfy0Var;
        kfy0Var.d = 6;
        List list = Collections.EMPTY_LIST;
        kfy0Var.e = list;
        kfy0Var.f = list;
        kfy0Var.g = list;
        kfy0Var.h = list;
    }

    public kfy0(mwg mwgVar, vz00 vz00Var) {
        this.i = (byte) -1;
        this.t = -1;
        this.d = 6;
        List list = Collections.EMPTY_LIST;
        this.e = list;
        this.f = list;
        this.g = list;
        this.h = list;
        boolean z = false;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = mwgVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.c |= 1;
                            this.d = mwgVar.k();
                        } else if (iN == 18) {
                            if ((i & 2) != 2) {
                                this.e = new ArrayList();
                                i |= 2;
                            }
                            this.e.add(mwgVar.g(zgy0.O0, vz00Var));
                        } else if (iN == 26) {
                            if ((i & 16) != 16) {
                                this.h = new ArrayList();
                                i |= 16;
                            }
                            this.h.add(mwgVar.g(efy0.h, vz00Var));
                        } else if (iN == 248) {
                            if ((i & 4) != 4) {
                                this.f = new ArrayList();
                                i |= 4;
                            }
                            this.f.add(Integer.valueOf(mwgVar.k()));
                        } else if (iN == 250) {
                            int iE = mwgVar.e(mwgVar.k());
                            if ((i & 4) != 4 && mwgVar.c() > 0) {
                                this.f = new ArrayList();
                                i |= 4;
                            }
                            while (mwgVar.c() > 0) {
                                this.f.add(Integer.valueOf(mwgVar.k()));
                            }
                            mwgVar.d(iE);
                        } else if (iN == 258) {
                            if ((i & 8) != 8) {
                                this.g = new ArrayList();
                                i |= 8;
                            }
                            this.g.add(mwgVar.g(ify0.h, vz00Var));
                        } else if (!l(mwgVar, w4c0VarY, vz00Var, iN)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    if ((i & 16) == 16) {
                        this.h = Collections.unmodifiableList(this.h);
                    }
                    if ((i & 4) == 4) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    if ((i & 8) == 8) {
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
            } catch (InvalidProtocolBufferException e) {
                e.a = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.a = this;
                throw invalidProtocolBufferException;
            }
        }
        if ((i & 2) == 2) {
            this.e = Collections.unmodifiableList(this.e);
        }
        if ((i & 16) == 16) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if ((i & 4) == 4) {
            this.f = Collections.unmodifiableList(this.f);
        }
        if ((i & 8) == 8) {
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
        List list;
        int i = this.t;
        if (i != -1) {
            return i;
        }
        int iG = (this.c & 1) == 1 ? w4c0.g(1, this.d) : 0;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            iG += w4c0.i(2, (t8) this.e.get(i2));
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            iG += w4c0.i(3, (t8) this.h.get(i3));
        }
        int i4 = 0;
        int iH = 0;
        while (true) {
            int size = this.f.size();
            list = this.f;
            if (i4 >= size) {
                break;
            }
            iH += w4c0.h(((Integer) list.get(i4)).intValue());
            i4++;
        }
        int size2 = (list.size() * 2) + iG + iH;
        for (int i5 = 0; i5 < this.g.size(); i5++) {
            size2 += w4c0.i(32, (t8) this.g.get(i5));
        }
        int size3 = this.b.size() + h() + size2;
        this.t = size3;
        return size3;
    }

    @Override // p.t8
    public final xe40 b() {
        return jfy0.h();
    }

    @Override // p.t8
    public final xe40 c() {
        jfy0 jfy0VarH = jfy0.h();
        jfy0VarH.i(this);
        return jfy0VarH;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        kp00 kp00Var = new kp00(this);
        if ((this.c & 1) == 1) {
            w4c0Var.P(1, this.d);
        }
        for (int i = 0; i < this.e.size(); i++) {
            w4c0Var.R(2, (t8) this.e.get(i));
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            w4c0Var.R(3, (t8) this.h.get(i2));
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            w4c0Var.P(31, ((Integer) this.f.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.g.size(); i4++) {
            w4c0Var.R(32, (t8) this.g.get(i4));
        }
        kp00Var.l(19000, w4c0Var);
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
        for (int i = 0; i < this.e.size(); i++) {
            if (!((zgy0) this.e.get(i)).isInitialized()) {
                this.i = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            if (!((ify0) this.g.get(i2)).isInitialized()) {
                this.i = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            if (!((efy0) this.h.get(i3)).isInitialized()) {
                this.i = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.i = (byte) 1;
            return true;
        }
        this.i = (byte) 0;
        return false;
    }

    public kfy0() {
        this.i = (byte) -1;
        this.t = -1;
        this.b = qhc.a;
    }

    public kfy0(jfy0 jfy0Var) {
        super(jfy0Var);
        this.i = (byte) -1;
        this.t = -1;
        this.b = jfy0Var.a;
    }
}
