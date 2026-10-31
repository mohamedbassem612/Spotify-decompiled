package p;

import com.spotify.accountswitching.v1.Account;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ggy0 extends ef40 {
    public static final ggy0 e1;
    public static final tja0 f1 = new tja0(18);
    public int N0;
    public List O0;
    public zgy0 P0;
    public int Q0;
    public int R0;
    public List S0;
    public List T0;
    public List U0;
    public List V0;
    public List W0;
    public int X;
    public List X0;
    public List Y;
    public List Y0;
    public List Z;
    public List Z0;
    public mfy0 a1;
    public final qhc b;
    public mfy0 b1;
    public int c;
    public byte c1;
    public int d;
    public int d1;
    public int e;
    public int f;
    public rgy0 g;
    public int h;
    public List i;
    public rgy0 t;

    static {
        ggy0 ggy0Var = new ggy0();
        e1 = ggy0Var;
        ggy0Var.o();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    public ggy0(mwg mwgVar, vz00 vz00Var) throws Throwable {
        ygy0 ygy0VarH;
        this.N0 = -1;
        this.c1 = (byte) -1;
        this.d1 = -1;
        o();
        jhc jhcVarL = qhc.l();
        boolean z = true;
        w4c0 w4c0VarY = w4c0.y(jhcVarL, 1);
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = z;
            if (z2) {
                if ((i & 32) == 32) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if ((i & 256) == 256) {
                    this.Y = Collections.unmodifiableList(this.Y);
                }
                if ((i & 512) == 512) {
                    this.Z = Collections.unmodifiableList(this.Z);
                }
                if ((i & 65536) == 65536) {
                    this.U0 = Collections.unmodifiableList(this.U0);
                }
                if ((i & 131072) == 131072) {
                    this.V0 = Collections.unmodifiableList(this.V0);
                }
                if ((i & 262144) == 262144) {
                    this.W0 = Collections.unmodifiableList(this.W0);
                }
                if ((i & 1024) == 1024) {
                    this.O0 = Collections.unmodifiableList(this.O0);
                }
                if ((i & 16384) == 16384) {
                    this.S0 = Collections.unmodifiableList(this.S0);
                }
                if ((i & 32768) == 32768) {
                    this.T0 = Collections.unmodifiableList(this.T0);
                }
                if ((i & 524288) == 524288) {
                    this.X0 = Collections.unmodifiableList(this.X0);
                }
                if ((i & 1048576) == 1048576) {
                    this.Y0 = Collections.unmodifiableList(this.Y0);
                }
                if ((i & 2097152) == 2097152) {
                    this.Z0 = Collections.unmodifiableList(this.Z0);
                }
                try {
                    w4c0VarY.o();
                } catch (IOException unused) {
                } finally {
                    this.b = jhcVarL.d();
                }
                k();
                return;
            }
            try {
                try {
                    int iN = mwgVar.n();
                    Cloneable cloneableG = null;
                    switch (iN) {
                        case 0:
                            z2 = z3;
                            z = z3;
                            break;
                        case 8:
                            this.c |= 2;
                            this.e = mwgVar.k();
                            z = z3;
                            break;
                        case 16:
                            this.c |= 4;
                            this.f = mwgVar.k();
                            z = z3;
                            break;
                        case 26:
                            if ((this.c & 8) == 8) {
                                rgy0 rgy0Var = this.g;
                                rgy0Var.getClass();
                                cloneableG = rgy0.p(rgy0Var);
                            }
                            qgy0 qgy0Var = cloneableG;
                            rgy0 rgy0Var2 = (rgy0) mwgVar.g(rgy0.V0, vz00Var);
                            this.g = rgy0Var2;
                            if (qgy0Var != 0) {
                                qgy0Var.i(rgy0Var2);
                                this.g = qgy0Var.g();
                            }
                            this.c |= 8;
                            z = z3;
                            break;
                        case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                            if ((i & 32) != 32) {
                                this.i = new ArrayList();
                                i |= 32;
                            }
                            this.i.add(mwgVar.g(wgy0.O0, vz00Var));
                            z = z3;
                            break;
                        case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                            if ((this.c & 32) == 32) {
                                rgy0 rgy0Var3 = this.t;
                                rgy0Var3.getClass();
                                cloneableG = rgy0.p(rgy0Var3);
                            }
                            qgy0 qgy0Var2 = cloneableG;
                            rgy0 rgy0Var4 = (rgy0) mwgVar.g(rgy0.V0, vz00Var);
                            this.t = rgy0Var4;
                            if (qgy0Var2 != 0) {
                                qgy0Var2.i(rgy0Var4);
                                this.t = qgy0Var2.g();
                            }
                            this.c |= 32;
                            z = z3;
                            break;
                        case 50:
                            if ((this.c & 128) == 128) {
                                zgy0 zgy0Var = this.P0;
                                zgy0Var.getClass();
                                ygy0VarH = ygy0.h();
                                ygy0VarH.i(zgy0Var);
                            } else {
                                ygy0VarH = null;
                            }
                            zgy0 zgy0Var2 = (zgy0) mwgVar.g(zgy0.O0, vz00Var);
                            this.P0 = zgy0Var2;
                            if (ygy0VarH != null) {
                                ygy0VarH.i(zgy0Var2);
                                this.P0 = ygy0VarH.g();
                            }
                            this.c |= 128;
                            z = z3;
                            break;
                        case 56:
                            this.c |= 256;
                            this.Q0 = mwgVar.k();
                            z = z3;
                            break;
                        case 64:
                            this.c |= 512;
                            this.R0 = mwgVar.k();
                            z = z3;
                            break;
                        case 72:
                            this.c |= 16;
                            this.h = mwgVar.k();
                            z = z3;
                            break;
                        case 80:
                            this.c |= 64;
                            this.X = mwgVar.k();
                            z = z3;
                            break;
                        case 88:
                            this.c |= 1;
                            this.d = mwgVar.k();
                            z = z3;
                            break;
                        case 98:
                            if ((i & 256) != 256) {
                                this.Y = new ArrayList();
                                i |= 256;
                            }
                            this.Y.add(mwgVar.g(rgy0.V0, vz00Var));
                            z = z3;
                            break;
                        case Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER /* 104 */:
                            if ((i & 512) != 512) {
                                this.Z = new ArrayList();
                                i |= 512;
                            }
                            this.Z.add(Integer.valueOf(mwgVar.k()));
                            z = z3;
                            break;
                        case 106:
                            int iE = mwgVar.e(mwgVar.k());
                            if ((i & 512) != 512 && mwgVar.c() > 0) {
                                this.Z = new ArrayList();
                                i |= 512;
                            }
                            while (mwgVar.c() > 0) {
                                this.Z.add(Integer.valueOf(mwgVar.k()));
                            }
                            mwgVar.d(iE);
                            z = z3;
                            break;
                        case 114:
                            if ((i & 65536) != 65536) {
                                this.U0 = new ArrayList();
                                i |= 65536;
                            }
                            this.U0.add(mwgVar.g(efy0.h, vz00Var));
                            z = z3;
                            break;
                        case 122:
                            if ((i & 131072) != 131072) {
                                this.V0 = new ArrayList();
                                i |= 131072;
                            }
                            this.V0.add(mwgVar.g(efy0.h, vz00Var));
                            z = z3;
                            break;
                        case 130:
                            if ((i & 262144) != 262144) {
                                this.W0 = new ArrayList();
                                i |= 262144;
                            }
                            this.W0.add(mwgVar.g(efy0.h, vz00Var));
                            z = z3;
                            break;
                        case 138:
                            if ((i & 1024) != 1024) {
                                this.O0 = new ArrayList();
                                i |= 1024;
                            }
                            this.O0.add(mwgVar.g(zgy0.O0, vz00Var));
                            z = z3;
                            break;
                        case 248:
                            if ((i & 16384) != 16384) {
                                this.S0 = new ArrayList();
                                i |= 16384;
                            }
                            this.S0.add(Integer.valueOf(mwgVar.k()));
                            z = z3;
                            break;
                        case 250:
                            int iE2 = mwgVar.e(mwgVar.k());
                            if ((i & 16384) != 16384 && mwgVar.c() > 0) {
                                this.S0 = new ArrayList();
                                i |= 16384;
                            }
                            while (mwgVar.c() > 0) {
                                this.S0.add(Integer.valueOf(mwgVar.k()));
                            }
                            mwgVar.d(iE2);
                            z = z3;
                            break;
                        case 258:
                            if ((i & 32768) != 32768) {
                                this.T0 = new ArrayList();
                                i |= 32768;
                            }
                            this.T0.add(mwgVar.g(ify0.h, vz00Var));
                            z = z3;
                            break;
                        case 266:
                            if ((i & 524288) != 524288) {
                                this.X0 = new ArrayList();
                                i |= 524288;
                            }
                            this.X0.add(mwgVar.g(efy0.h, vz00Var));
                            z = z3;
                            break;
                        case 274:
                            if ((i & 1048576) != 1048576) {
                                this.Y0 = new ArrayList();
                                i |= 1048576;
                            }
                            this.Y0.add(mwgVar.g(efy0.h, vz00Var));
                            z = z3;
                            break;
                        case 282:
                            if ((i & 2097152) != 2097152) {
                                this.Z0 = new ArrayList();
                                i |= 2097152;
                            }
                            this.Z0.add(mwgVar.g(efy0.h, vz00Var));
                            z = z3;
                            break;
                        case 322:
                            if ((this.c & 1024) == 1024) {
                                mfy0 mfy0Var = this.a1;
                                mfy0Var.getClass();
                                cloneableG = mfy0.g(mfy0Var);
                            }
                            lfy0 lfy0Var = cloneableG;
                            mfy0 mfy0Var2 = (mfy0) mwgVar.g(mfy0.f, vz00Var);
                            this.a1 = mfy0Var2;
                            if (lfy0Var != 0) {
                                lfy0Var.j(mfy0Var2);
                                this.a1 = lfy0Var.e();
                            }
                            this.c |= 1024;
                            z = z3;
                            break;
                        case 330:
                            try {
                                if ((this.c & 2048) == 2048) {
                                    mfy0 mfy0Var3 = this.b1;
                                    mfy0Var3.getClass();
                                    cloneableG = mfy0.g(mfy0Var3);
                                }
                                lfy0 lfy0Var2 = cloneableG;
                                mfy0 mfy0Var4 = (mfy0) mwgVar.g(mfy0.f, vz00Var);
                                this.b1 = mfy0Var4;
                                if (lfy0Var2 != 0) {
                                    lfy0Var2.j(mfy0Var4);
                                    this.b1 = lfy0Var2.e();
                                }
                                this.c |= 2048;
                                z = z3;
                            } catch (InvalidProtocolBufferException e) {
                                e = e;
                                e.a = this;
                                throw e;
                            } catch (IOException e2) {
                                e = e2;
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                invalidProtocolBufferException.a = this;
                                throw invalidProtocolBufferException;
                            } catch (Throwable th) {
                                th = th;
                                if ((i & 32) == 32) {
                                    this.i = Collections.unmodifiableList(this.i);
                                }
                                if ((i & 256) == 256) {
                                    this.Y = Collections.unmodifiableList(this.Y);
                                }
                                if ((i & 512) == 512) {
                                    this.Z = Collections.unmodifiableList(this.Z);
                                }
                                if ((i & 65536) == 65536) {
                                    this.U0 = Collections.unmodifiableList(this.U0);
                                }
                                if ((i & 131072) == 131072) {
                                    this.V0 = Collections.unmodifiableList(this.V0);
                                }
                                if ((i & 262144) == 262144) {
                                    this.W0 = Collections.unmodifiableList(this.W0);
                                }
                                if ((i & 1024) == 1024) {
                                    this.O0 = Collections.unmodifiableList(this.O0);
                                }
                                if ((i & 16384) == 16384) {
                                    this.S0 = Collections.unmodifiableList(this.S0);
                                }
                                if ((i & 32768) == 32768) {
                                    this.T0 = Collections.unmodifiableList(this.T0);
                                }
                                if ((i & 524288) == 524288) {
                                    this.X0 = Collections.unmodifiableList(this.X0);
                                }
                                if ((i & 1048576) == 1048576) {
                                    this.Y0 = Collections.unmodifiableList(this.Y0);
                                }
                                if ((i & 2097152) == 2097152) {
                                    this.Z0 = Collections.unmodifiableList(this.Z0);
                                }
                                try {
                                    w4c0VarY.o();
                                    break;
                                } catch (IOException unused2) {
                                } finally {
                                    this.b = jhcVarL.d();
                                }
                                k();
                                throw th;
                            }
                            break;
                        default:
                            if (!l(mwgVar, w4c0VarY, vz00Var, iN)) {
                                z2 = z3;
                            }
                            z = z3;
                            break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (InvalidProtocolBufferException e4) {
                e = e4;
            }
        }
    }

    @Override // p.t8
    public final int a() {
        List list;
        List list2;
        int i = this.d1;
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
        if ((this.c & 128) == 128) {
            iG += w4c0.i(6, this.P0);
        }
        if ((this.c & 256) == 256) {
            iG += w4c0.g(7, this.Q0);
        }
        if ((this.c & 512) == 512) {
            iG += w4c0.g(8, this.R0);
        }
        if ((this.c & 16) == 16) {
            iG += w4c0.g(9, this.h);
        }
        if ((this.c & 64) == 64) {
            iG += w4c0.g(10, this.X);
        }
        if ((this.c & 1) == 1) {
            iG += w4c0.g(11, this.d);
        }
        for (int i3 = 0; i3 < this.Y.size(); i3++) {
            iG += w4c0.i(12, (t8) this.Y.get(i3));
        }
        int i4 = 0;
        int iH = 0;
        while (true) {
            int size = this.Z.size();
            list = this.Z;
            if (i4 >= size) {
                break;
            }
            iH += w4c0.h(((Integer) list.get(i4)).intValue());
            i4++;
        }
        int i5 = iG + iH;
        if (!list.isEmpty()) {
            i5 = i5 + 1 + w4c0.h(iH);
        }
        this.N0 = iH;
        for (int i6 = 0; i6 < this.U0.size(); i6++) {
            i5 += w4c0.i(14, (t8) this.U0.get(i6));
        }
        for (int i7 = 0; i7 < this.V0.size(); i7++) {
            i5 += w4c0.i(15, (t8) this.V0.get(i7));
        }
        for (int i8 = 0; i8 < this.W0.size(); i8++) {
            i5 += w4c0.i(16, (t8) this.W0.get(i8));
        }
        for (int i9 = 0; i9 < this.O0.size(); i9++) {
            i5 += w4c0.i(17, (t8) this.O0.get(i9));
        }
        int i10 = 0;
        int iH2 = 0;
        while (true) {
            int size2 = this.S0.size();
            list2 = this.S0;
            if (i10 >= size2) {
                break;
            }
            iH2 += w4c0.h(((Integer) list2.get(i10)).intValue());
            i10++;
        }
        int size3 = (list2.size() * 2) + i5 + iH2;
        for (int i11 = 0; i11 < this.T0.size(); i11++) {
            size3 += w4c0.i(32, (t8) this.T0.get(i11));
        }
        for (int i12 = 0; i12 < this.X0.size(); i12++) {
            size3 += w4c0.i(33, (t8) this.X0.get(i12));
        }
        for (int i13 = 0; i13 < this.Y0.size(); i13++) {
            size3 += w4c0.i(34, (t8) this.Y0.get(i13));
        }
        for (int i14 = 0; i14 < this.Z0.size(); i14++) {
            size3 += w4c0.i(35, (t8) this.Z0.get(i14));
        }
        if ((this.c & 1024) == 1024) {
            size3 += w4c0.i(40, this.a1);
        }
        if ((this.c & 2048) == 2048) {
            size3 += w4c0.i(41, this.b1);
        }
        int size4 = this.b.size() + h() + size3;
        this.d1 = size4;
        return size4;
    }

    @Override // p.t8
    public final xe40 b() {
        return fgy0.h();
    }

    @Override // p.t8
    public final xe40 c() {
        fgy0 fgy0VarH = fgy0.h();
        fgy0VarH.i(this);
        return fgy0VarH;
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
        if ((this.c & 128) == 128) {
            w4c0Var.R(6, this.P0);
        }
        if ((this.c & 256) == 256) {
            w4c0Var.P(7, this.Q0);
        }
        if ((this.c & 512) == 512) {
            w4c0Var.P(8, this.R0);
        }
        if ((this.c & 16) == 16) {
            w4c0Var.P(9, this.h);
        }
        if ((this.c & 64) == 64) {
            w4c0Var.P(10, this.X);
        }
        if ((this.c & 1) == 1) {
            w4c0Var.P(11, this.d);
        }
        for (int i2 = 0; i2 < this.Y.size(); i2++) {
            w4c0Var.R(12, (t8) this.Y.get(i2));
        }
        if (this.Z.size() > 0) {
            w4c0Var.Y(106);
            w4c0Var.Y(this.N0);
        }
        for (int i3 = 0; i3 < this.Z.size(); i3++) {
            w4c0Var.Q(((Integer) this.Z.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.U0.size(); i4++) {
            w4c0Var.R(14, (t8) this.U0.get(i4));
        }
        for (int i5 = 0; i5 < this.V0.size(); i5++) {
            w4c0Var.R(15, (t8) this.V0.get(i5));
        }
        for (int i6 = 0; i6 < this.W0.size(); i6++) {
            w4c0Var.R(16, (t8) this.W0.get(i6));
        }
        for (int i7 = 0; i7 < this.O0.size(); i7++) {
            w4c0Var.R(17, (t8) this.O0.get(i7));
        }
        for (int i8 = 0; i8 < this.S0.size(); i8++) {
            w4c0Var.P(31, ((Integer) this.S0.get(i8)).intValue());
        }
        for (int i9 = 0; i9 < this.T0.size(); i9++) {
            w4c0Var.R(32, (t8) this.T0.get(i9));
        }
        for (int i10 = 0; i10 < this.X0.size(); i10++) {
            w4c0Var.R(33, (t8) this.X0.get(i10));
        }
        for (int i11 = 0; i11 < this.Y0.size(); i11++) {
            w4c0Var.R(34, (t8) this.Y0.get(i11));
        }
        for (int i12 = 0; i12 < this.Z0.size(); i12++) {
            w4c0Var.R(35, (t8) this.Z0.get(i12));
        }
        if ((this.c & 1024) == 1024) {
            w4c0Var.R(40, this.a1);
        }
        if ((this.c & 2048) == 2048) {
            w4c0Var.R(41, this.b1);
        }
        kp00Var.l(19000, w4c0Var);
        w4c0Var.U(this.b);
    }

    @Override // p.u2j0
    public final t8 getDefaultInstanceForType() {
        return e1;
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.c1;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.c;
        if ((i & 4) != 4) {
            this.c1 = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.g.isInitialized()) {
            this.c1 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (!((wgy0) this.i.get(i2)).isInitialized()) {
                this.c1 = (byte) 0;
                return false;
            }
        }
        if ((this.c & 32) == 32 && !this.t.isInitialized()) {
            this.c1 = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.Y.size(); i3++) {
            if (!((rgy0) this.Y.get(i3)).isInitialized()) {
                this.c1 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.O0.size(); i4++) {
            if (!((zgy0) this.O0.get(i4)).isInitialized()) {
                this.c1 = (byte) 0;
                return false;
            }
        }
        if ((this.c & 128) == 128 && !this.P0.isInitialized()) {
            this.c1 = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.T0.size(); i5++) {
            if (!((ify0) this.T0.get(i5)).isInitialized()) {
                this.c1 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.U0.size(); i6++) {
            if (!((efy0) this.U0.get(i6)).isInitialized()) {
                this.c1 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.V0.size(); i7++) {
            if (!((efy0) this.V0.get(i7)).isInitialized()) {
                this.c1 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.W0.size(); i8++) {
            if (!((efy0) this.W0.get(i8)).isInitialized()) {
                this.c1 = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.X0.size(); i9++) {
            if (!((efy0) this.X0.get(i9)).isInitialized()) {
                this.c1 = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.Y0.size(); i10++) {
            if (!((efy0) this.Y0.get(i10)).isInitialized()) {
                this.c1 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.Z0.size(); i11++) {
            if (!((efy0) this.Z0.get(i11)).isInitialized()) {
                this.c1 = (byte) 0;
                return false;
            }
        }
        if ((this.c & 1024) == 1024 && !this.a1.isInitialized()) {
            this.c1 = (byte) 0;
            return false;
        }
        if ((this.c & 2048) == 2048 && !this.b1.isInitialized()) {
            this.c1 = (byte) 0;
            return false;
        }
        if (g()) {
            this.c1 = (byte) 1;
            return true;
        }
        this.c1 = (byte) 0;
        return false;
    }

    public final List n() {
        return this.O0;
    }

    public final void o() {
        this.d = 518;
        this.e = 2054;
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
        this.P0 = zgy0.N0;
        this.Q0 = 0;
        this.R0 = 0;
        this.S0 = list;
        this.T0 = list;
        this.U0 = list;
        this.V0 = list;
        this.W0 = list;
        this.X0 = list;
        this.Y0 = list;
        this.Z0 = list;
        mfy0 mfy0Var = mfy0.e;
        this.a1 = mfy0Var;
        this.b1 = mfy0Var;
    }

    public ggy0() {
        this.N0 = -1;
        this.c1 = (byte) -1;
        this.d1 = -1;
        this.b = qhc.a;
    }

    public ggy0(fgy0 fgy0Var) {
        super(fgy0Var);
        this.N0 = -1;
        this.c1 = (byte) -1;
        this.d1 = -1;
        this.b = fgy0Var.a;
    }
}
