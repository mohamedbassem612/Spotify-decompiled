package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yfy0 extends ef40 {
    public static final yfy0 Y0;
    public static final tja0 Z0 = new tja0((byte) 15);
    public int N0;
    public List O0;
    public List P0;
    public xgy0 Q0;
    public List R0;
    public mfy0 S0;
    public List T0;
    public List U0;
    public List V0;
    public byte W0;
    public int X;
    public int X0;
    public List Y;
    public List Z;
    public final qhc b;
    public int c;
    public int d;
    public int e;
    public int f;
    public rgy0 g;
    public int h;
    public List i;
    public rgy0 t;

    static {
        yfy0 yfy0Var = new yfy0();
        Y0 = yfy0Var;
        yfy0Var.o();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    /* JADX WARN: Code duplicated, block: B:134:0x0339  */
    /* JADX WARN: Code duplicated, block: B:137:0x0345  */
    /* JADX WARN: Code duplicated, block: B:140:0x0351  */
    /* JADX WARN: Code duplicated, block: B:143:0x035d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0369  */
    /* JADX WARN: Code duplicated, block: B:149:0x0375  */
    /* JADX WARN: Code duplicated, block: B:152:0x0381  */
    /* JADX WARN: Code duplicated, block: B:155:0x038f  */
    /* JADX WARN: Code duplicated, block: B:158:0x039d  */
    /* JADX WARN: Multi-variable type inference failed */
    public yfy0(mwg mwgVar, vz00 vz00Var) throws Throwable {
        int i;
        this.N0 = -1;
        this.W0 = (byte) -1;
        this.X0 = -1;
        o();
        boolean z = false;
        jhc jhcVar = new jhc((byte) 0);
        boolean z2 = true;
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        int i2 = 0;
        while (true) {
            int i3 = 32768;
            int i4 = 131072;
            boolean z3 = z2;
            if (z) {
                if ((i2 & 32) == 32) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if ((i2 & 2048) == 2048) {
                    this.P0 = Collections.unmodifiableList(this.P0);
                }
                if ((i2 & 256) == 256) {
                    this.Y = Collections.unmodifiableList(this.Y);
                }
                if ((i2 & 512) == 512) {
                    this.Z = Collections.unmodifiableList(this.Z);
                }
                if ((i2 & 65536) == 65536) {
                    this.U0 = Collections.unmodifiableList(this.U0);
                }
                if ((i2 & 1024) == 1024) {
                    this.O0 = Collections.unmodifiableList(this.O0);
                }
                if ((i2 & 8192) == 8192) {
                    this.R0 = Collections.unmodifiableList(this.R0);
                }
                if ((i2 & 32768) == 32768) {
                    this.T0 = Collections.unmodifiableList(this.T0);
                }
                if ((i2 & 131072) == 131072) {
                    this.V0 = Collections.unmodifiableList(this.V0);
                }
                try {
                    w4c0VarY.F();
                } catch (IOException unused) {
                } finally {
                    this.b = jhcVar.d();
                }
                k();
                return;
            }
            try {
                int iN = mwgVar.n();
                Cloneable cloneableP = null;
                switch (iN) {
                    case 0:
                        z = z3;
                        z2 = z3;
                        break;
                    case 8:
                        this.c |= 2;
                        this.e = mwgVar.k();
                        z2 = z3;
                        break;
                    case 16:
                        this.c |= 4;
                        this.f = mwgVar.k();
                        z2 = z3;
                        break;
                    case 26:
                        if ((this.c & 8) == 8) {
                            rgy0 rgy0Var = this.g;
                            rgy0Var.getClass();
                            cloneableP = rgy0.p(rgy0Var);
                        }
                        qgy0 qgy0Var = cloneableP;
                        rgy0 rgy0Var2 = (rgy0) mwgVar.g(rgy0.V0, vz00Var);
                        this.g = rgy0Var2;
                        if (qgy0Var != 0) {
                            qgy0Var.i(rgy0Var2);
                            this.g = qgy0Var.g();
                        }
                        this.c |= 8;
                        z2 = z3;
                        break;
                    case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                        if ((i2 & 32) != 32) {
                            this.i = new ArrayList();
                            i2 |= 32;
                        }
                        this.i.add(mwgVar.g(wgy0.O0, vz00Var));
                        z2 = z3;
                        break;
                    case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                        if ((this.c & 32) == 32) {
                            rgy0 rgy0Var3 = this.t;
                            rgy0Var3.getClass();
                            cloneableP = rgy0.p(rgy0Var3);
                        }
                        qgy0 qgy0Var2 = cloneableP;
                        rgy0 rgy0Var4 = (rgy0) mwgVar.g(rgy0.V0, vz00Var);
                        this.t = rgy0Var4;
                        if (qgy0Var2 != 0) {
                            qgy0Var2.i(rgy0Var4);
                            this.t = qgy0Var2.g();
                        }
                        this.c |= 32;
                        z2 = z3;
                        break;
                    case 50:
                        if ((i2 & 2048) != 2048) {
                            this.P0 = new ArrayList();
                            i2 |= 2048;
                        }
                        this.P0.add(mwgVar.g(zgy0.O0, vz00Var));
                        z2 = z3;
                        break;
                    case 56:
                        this.c |= 16;
                        this.h = mwgVar.k();
                        z2 = z3;
                        break;
                    case 64:
                        this.c |= 64;
                        this.X = mwgVar.k();
                        z2 = z3;
                        break;
                    case 72:
                        this.c |= 1;
                        this.d = mwgVar.k();
                        z2 = z3;
                        break;
                    case 82:
                        if ((i2 & 256) != 256) {
                            this.Y = new ArrayList();
                            i2 |= 256;
                        }
                        this.Y.add(mwgVar.g(rgy0.V0, vz00Var));
                        z2 = z3;
                        break;
                    case 88:
                        if ((i2 & 512) != 512) {
                            this.Z = new ArrayList();
                            i2 |= 512;
                        }
                        this.Z.add(Integer.valueOf(mwgVar.k()));
                        z2 = z3;
                        break;
                    case 90:
                        int iE = mwgVar.e(mwgVar.k());
                        if ((i2 & 512) != 512 && mwgVar.c() > 0) {
                            this.Z = new ArrayList();
                            i2 |= 512;
                        }
                        while (mwgVar.c() > 0) {
                            this.Z.add(Integer.valueOf(mwgVar.k()));
                        }
                        mwgVar.d(iE);
                        z2 = z3;
                        break;
                    case 98:
                        if ((i2 & 65536) != 65536) {
                            this.U0 = new ArrayList();
                            i2 |= 65536;
                        }
                        this.U0.add(mwgVar.g(efy0.h, vz00Var));
                        z2 = z3;
                        break;
                    case 106:
                        if ((i2 & 1024) != 1024) {
                            this.O0 = new ArrayList();
                            i2 |= 1024;
                        }
                        this.O0.add(mwgVar.g(zgy0.O0, vz00Var));
                        z2 = z3;
                        break;
                    case 242:
                        if ((this.c & 128) == 128) {
                            xgy0 xgy0Var = this.Q0;
                            xgy0Var.getClass();
                            cloneableP = xgy0.g(xgy0Var);
                        }
                        dfy0 dfy0Var = cloneableP;
                        xgy0 xgy0Var2 = (xgy0) mwgVar.g(xgy0.h, vz00Var);
                        this.Q0 = xgy0Var2;
                        if (dfy0Var != 0) {
                            dfy0Var.i(xgy0Var2);
                            this.Q0 = dfy0Var.g();
                        }
                        this.c |= 128;
                        z2 = z3;
                        break;
                    case 248:
                        if ((i2 & 8192) != 8192) {
                            this.R0 = new ArrayList();
                            i2 |= 8192;
                        }
                        this.R0.add(Integer.valueOf(mwgVar.k()));
                        z2 = z3;
                        break;
                    case 250:
                        i4 = 131072;
                        int iE2 = mwgVar.e(mwgVar.k());
                        if ((i2 & 8192) != 8192 && mwgVar.c() > 0) {
                            this.R0 = new ArrayList();
                            i2 |= 8192;
                        }
                        while (mwgVar.c() > 0) {
                            i = i3;
                            try {
                                try {
                                    this.R0.add(Integer.valueOf(mwgVar.k()));
                                    i3 = i;
                                } catch (Throwable th) {
                                    th = th;
                                    if ((i2 & 32) == 32) {
                                        this.i = Collections.unmodifiableList(this.i);
                                    }
                                    if ((i2 & 2048) == 2048) {
                                        this.P0 = Collections.unmodifiableList(this.P0);
                                    }
                                    if ((i2 & 256) == 256) {
                                        this.Y = Collections.unmodifiableList(this.Y);
                                    }
                                    if ((i2 & 512) == 512) {
                                        this.Z = Collections.unmodifiableList(this.Z);
                                    }
                                    if ((i2 & 65536) == 65536) {
                                        this.U0 = Collections.unmodifiableList(this.U0);
                                    }
                                    if ((i2 & 1024) == 1024) {
                                        this.O0 = Collections.unmodifiableList(this.O0);
                                    }
                                    if ((i2 & 8192) == 8192) {
                                        this.R0 = Collections.unmodifiableList(this.R0);
                                    }
                                    if ((i2 & i) == i) {
                                        this.T0 = Collections.unmodifiableList(this.T0);
                                    }
                                    if ((i2 & i4) == i4) {
                                        this.V0 = Collections.unmodifiableList(this.V0);
                                    }
                                    try {
                                        w4c0VarY.F();
                                        break;
                                    } catch (IOException unused2) {
                                    } finally {
                                        this.b = jhcVar.d();
                                    }
                                    k();
                                    throw th;
                                }
                            } catch (IOException e) {
                                e = e;
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                invalidProtocolBufferException.a = this;
                                throw invalidProtocolBufferException;
                            } catch (InvalidProtocolBufferException e2) {
                                e = e2;
                                e.a = this;
                                throw e;
                            }
                        }
                        mwgVar.d(iE2);
                        z2 = z3;
                        break;
                    case 258:
                        if ((this.c & 256) == 256) {
                            mfy0 mfy0Var = this.S0;
                            mfy0Var.getClass();
                            cloneableP = mfy0.g(mfy0Var);
                        }
                        lfy0 lfy0Var = cloneableP;
                        mfy0 mfy0Var2 = (mfy0) mwgVar.g(mfy0.f, vz00Var);
                        this.S0 = mfy0Var2;
                        if (lfy0Var != 0) {
                            lfy0Var.j(mfy0Var2);
                            this.S0 = lfy0Var.e();
                        }
                        this.c |= 256;
                        z2 = z3;
                        break;
                    case 266:
                        if ((i2 & 32768) != 32768) {
                            this.T0 = new ArrayList();
                            i2 |= 32768;
                        }
                        this.T0.add(mwgVar.g(ify0.h, vz00Var));
                        z2 = z3;
                        break;
                    case 274:
                        if ((i2 & 131072) != 131072) {
                            this.V0 = new ArrayList();
                            i2 |= 131072;
                        }
                        try {
                            try {
                                this.V0.add(mwgVar.g(efy0.h, vz00Var));
                                z2 = z3;
                            } catch (IOException e3) {
                                e = e3;
                                InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e.getMessage());
                                invalidProtocolBufferException2.a = this;
                                throw invalidProtocolBufferException2;
                            } catch (InvalidProtocolBufferException e4) {
                                e = e4;
                                e.a = this;
                                throw e;
                            } catch (Throwable th2) {
                                th = th2;
                                i = 32768;
                                if ((i2 & 32) == 32) {
                                    this.i = Collections.unmodifiableList(this.i);
                                }
                                if ((i2 & 2048) == 2048) {
                                    this.P0 = Collections.unmodifiableList(this.P0);
                                }
                                if ((i2 & 256) == 256) {
                                    this.Y = Collections.unmodifiableList(this.Y);
                                }
                                if ((i2 & 512) == 512) {
                                    this.Z = Collections.unmodifiableList(this.Z);
                                }
                                if ((i2 & 65536) == 65536) {
                                    this.U0 = Collections.unmodifiableList(this.U0);
                                }
                                if ((i2 & 1024) == 1024) {
                                    this.O0 = Collections.unmodifiableList(this.O0);
                                }
                                if ((i2 & 8192) == 8192) {
                                    this.R0 = Collections.unmodifiableList(this.R0);
                                }
                                if ((i2 & i) == i) {
                                    this.T0 = Collections.unmodifiableList(this.T0);
                                }
                                if ((i2 & i4) == i4) {
                                    this.V0 = Collections.unmodifiableList(this.V0);
                                }
                                w4c0VarY.F();
                                k();
                                throw th;
                            }
                        } catch (InvalidProtocolBufferException e5) {
                            e = e5;
                        } catch (IOException e6) {
                            e = e6;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        break;
                    default:
                        if (!l(mwgVar, w4c0VarY, vz00Var, iN)) {
                            z = z3;
                        }
                        z2 = z3;
                        break;
                }
            } catch (InvalidProtocolBufferException e7) {
                e = e7;
            } catch (IOException e8) {
                e = e8;
            } catch (Throwable th4) {
                th = th4;
                i = 32768;
                i4 = 131072;
            }
        }
    }

    @Override // p.t8
    public final int a() {
        List list;
        List list2;
        int i = this.X0;
        if (i != -1) {
            return i;
        }
        int iG = (this.c & 2) == 2 ? w4c0.g(1, this.e) : 0;
        if ((this.c & 4) == 4) {
            iG += w4c0.g(2, this.f);
        }
        if ((this.c & 8) == 8) {
            iG += w4c0.i(3, this.g);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            iG += w4c0.i(4, (t8) this.i.get(i2));
        }
        if ((this.c & 32) == 32) {
            iG += w4c0.i(5, this.t);
        }
        for (int i3 = 0; i3 < this.P0.size(); i3++) {
            iG += w4c0.i(6, (t8) this.P0.get(i3));
        }
        if ((this.c & 16) == 16) {
            iG += w4c0.g(7, this.h);
        }
        if ((this.c & 64) == 64) {
            iG += w4c0.g(8, this.X);
        }
        if ((this.c & 1) == 1) {
            iG += w4c0.g(9, this.d);
        }
        for (int i4 = 0; i4 < this.Y.size(); i4++) {
            iG += w4c0.i(10, (t8) this.Y.get(i4));
        }
        int i5 = 0;
        int iH = 0;
        while (true) {
            int size = this.Z.size();
            list = this.Z;
            if (i5 >= size) {
                break;
            }
            iH += w4c0.h(((Integer) list.get(i5)).intValue());
            i5++;
        }
        int i6 = iG + iH;
        if (!list.isEmpty()) {
            i6 = i6 + 1 + w4c0.h(iH);
        }
        this.N0 = iH;
        for (int i7 = 0; i7 < this.U0.size(); i7++) {
            i6 += w4c0.i(12, (t8) this.U0.get(i7));
        }
        for (int i8 = 0; i8 < this.O0.size(); i8++) {
            i6 += w4c0.i(13, (t8) this.O0.get(i8));
        }
        if ((this.c & 128) == 128) {
            i6 += w4c0.i(30, this.Q0);
        }
        int i9 = 0;
        int iH2 = 0;
        while (true) {
            int size2 = this.R0.size();
            list2 = this.R0;
            if (i9 >= size2) {
                break;
            }
            iH2 += w4c0.h(((Integer) list2.get(i9)).intValue());
            i9++;
        }
        int size3 = (list2.size() * 2) + i6 + iH2;
        if ((this.c & 256) == 256) {
            size3 += w4c0.i(32, this.S0);
        }
        for (int i10 = 0; i10 < this.T0.size(); i10++) {
            size3 += w4c0.i(33, (t8) this.T0.get(i10));
        }
        for (int i11 = 0; i11 < this.V0.size(); i11++) {
            size3 += w4c0.i(34, (t8) this.V0.get(i11));
        }
        int size4 = this.b.size() + h() + size3;
        this.X0 = size4;
        return size4;
    }

    @Override // p.t8
    public final xe40 b() {
        return xfy0.h();
    }

    @Override // p.t8
    public final xe40 c() {
        xfy0 xfy0VarH = xfy0.h();
        xfy0VarH.i(this);
        return xfy0VarH;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        kp00 kp00Var = new kp00(this);
        if ((this.c & 2) == 2) {
            w4c0Var.P(1, this.e);
        }
        if ((this.c & 4) == 4) {
            w4c0Var.P(2, this.f);
        }
        if ((this.c & 8) == 8) {
            w4c0Var.R(3, this.g);
        }
        for (int i = 0; i < this.i.size(); i++) {
            w4c0Var.R(4, (t8) this.i.get(i));
        }
        if ((this.c & 32) == 32) {
            w4c0Var.R(5, this.t);
        }
        for (int i2 = 0; i2 < this.P0.size(); i2++) {
            w4c0Var.R(6, (t8) this.P0.get(i2));
        }
        if ((this.c & 16) == 16) {
            w4c0Var.P(7, this.h);
        }
        if ((this.c & 64) == 64) {
            w4c0Var.P(8, this.X);
        }
        if ((this.c & 1) == 1) {
            w4c0Var.P(9, this.d);
        }
        for (int i3 = 0; i3 < this.Y.size(); i3++) {
            w4c0Var.R(10, (t8) this.Y.get(i3));
        }
        if (this.Z.size() > 0) {
            w4c0Var.Y(90);
            w4c0Var.Y(this.N0);
        }
        for (int i4 = 0; i4 < this.Z.size(); i4++) {
            w4c0Var.Q(((Integer) this.Z.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.U0.size(); i5++) {
            w4c0Var.R(12, (t8) this.U0.get(i5));
        }
        for (int i6 = 0; i6 < this.O0.size(); i6++) {
            w4c0Var.R(13, (t8) this.O0.get(i6));
        }
        if ((this.c & 128) == 128) {
            w4c0Var.R(30, this.Q0);
        }
        for (int i7 = 0; i7 < this.R0.size(); i7++) {
            w4c0Var.P(31, ((Integer) this.R0.get(i7)).intValue());
        }
        if ((this.c & 256) == 256) {
            w4c0Var.R(32, this.S0);
        }
        for (int i8 = 0; i8 < this.T0.size(); i8++) {
            w4c0Var.R(33, (t8) this.T0.get(i8));
        }
        for (int i9 = 0; i9 < this.V0.size(); i9++) {
            w4c0Var.R(34, (t8) this.V0.get(i9));
        }
        kp00Var.l(19000, w4c0Var);
        w4c0Var.U(this.b);
    }

    @Override // p.u2j0
    public final t8 getDefaultInstanceForType() {
        return Y0;
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.W0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.c;
        if ((i & 4) != 4) {
            this.W0 = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.g.isInitialized()) {
            this.W0 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (!((wgy0) this.i.get(i2)).isInitialized()) {
                this.W0 = (byte) 0;
                return false;
            }
        }
        if ((this.c & 32) == 32 && !this.t.isInitialized()) {
            this.W0 = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.Y.size(); i3++) {
            if (!((rgy0) this.Y.get(i3)).isInitialized()) {
                this.W0 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.O0.size(); i4++) {
            if (!((zgy0) this.O0.get(i4)).isInitialized()) {
                this.W0 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.P0.size(); i5++) {
            if (!((zgy0) this.P0.get(i5)).isInitialized()) {
                this.W0 = (byte) 0;
                return false;
            }
        }
        if ((this.c & 128) == 128 && !this.Q0.isInitialized()) {
            this.W0 = (byte) 0;
            return false;
        }
        if ((this.c & 256) == 256 && !this.S0.isInitialized()) {
            this.W0 = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.T0.size(); i6++) {
            if (!((ify0) this.T0.get(i6)).isInitialized()) {
                this.W0 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.U0.size(); i7++) {
            if (!((efy0) this.U0.get(i7)).isInitialized()) {
                this.W0 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.V0.size(); i8++) {
            if (!((efy0) this.V0.get(i8)).isInitialized()) {
                this.W0 = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.W0 = (byte) 1;
            return true;
        }
        this.W0 = (byte) 0;
        return false;
    }

    public final List n() {
        return this.O0;
    }

    public final void o() {
        this.d = 6;
        this.e = 6;
        this.f = 0;
        rgy0 rgy0Var = rgy0.U0;
        this.g = rgy0Var;
        this.h = 0;
        List list = Collections.EMPTY_LIST;
        this.i = list;
        this.t = rgy0Var;
        this.X = 0;
        this.Y = list;
        this.Z = list;
        this.O0 = list;
        this.P0 = list;
        this.Q0 = xgy0.g;
        this.R0 = list;
        this.S0 = mfy0.e;
        this.T0 = list;
        this.U0 = list;
        this.V0 = list;
    }

    public yfy0() {
        this.N0 = -1;
        this.W0 = (byte) -1;
        this.X0 = -1;
        this.b = qhc.a;
    }

    public yfy0(xfy0 xfy0Var) {
        super(xfy0Var);
        this.N0 = -1;
        this.W0 = (byte) -1;
        this.X0 = -1;
        this.b = xfy0Var.a;
    }
}
