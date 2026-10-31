package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tgy0 extends ef40 {
    public static final tgy0 P0;
    public static final tja0 Q0 = new tja0((byte) 24);
    public byte N0;
    public int O0;
    public List X;
    public List Y;
    public List Z;
    public final qhc b;
    public int c;
    public int d;
    public int e;
    public List f;
    public rgy0 g;
    public int h;
    public rgy0 i;
    public int t;

    static {
        tgy0 tgy0Var = new tgy0();
        P0 = tgy0Var;
        tgy0Var.d = 6;
        tgy0Var.e = 0;
        List list = Collections.EMPTY_LIST;
        tgy0Var.f = list;
        rgy0 rgy0Var = rgy0.U0;
        tgy0Var.g = rgy0Var;
        tgy0Var.h = 0;
        tgy0Var.i = rgy0Var;
        tgy0Var.t = 0;
        tgy0Var.X = list;
        tgy0Var.Y = list;
        tgy0Var.Z = list;
    }

    public tgy0(mwg mwgVar, vz00 vz00Var) {
        this.N0 = (byte) -1;
        this.O0 = -1;
        this.d = 6;
        boolean z = false;
        this.e = 0;
        List list = Collections.EMPTY_LIST;
        this.f = list;
        rgy0 rgy0Var = rgy0.U0;
        this.g = rgy0Var;
        this.h = 0;
        this.i = rgy0Var;
        this.t = 0;
        this.X = list;
        this.Y = list;
        this.Z = list;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = mwgVar.n();
                    qgy0 qgy0VarP = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.c |= 1;
                            this.d = mwgVar.k();
                            continue;
                        case 16:
                            this.c |= 2;
                            this.e = mwgVar.k();
                            continue;
                        case 26:
                            if ((i & 4) != 4) {
                                this.f = new ArrayList();
                                i |= 4;
                            }
                            this.f.add(mwgVar.g(wgy0.O0, vz00Var));
                            continue;
                        case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                            if ((this.c & 4) == 4) {
                                rgy0 rgy0Var2 = this.g;
                                rgy0Var2.getClass();
                                qgy0VarP = rgy0.p(rgy0Var2);
                            }
                            rgy0 rgy0Var3 = (rgy0) mwgVar.g(rgy0.V0, vz00Var);
                            this.g = rgy0Var3;
                            if (qgy0VarP != null) {
                                qgy0VarP.i(rgy0Var3);
                                this.g = qgy0VarP.g();
                            }
                            this.c |= 4;
                            continue;
                        case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                            this.c |= 8;
                            this.h = mwgVar.k();
                            continue;
                        case 50:
                            if ((this.c & 16) == 16) {
                                rgy0 rgy0Var4 = this.i;
                                rgy0Var4.getClass();
                                qgy0VarP = rgy0.p(rgy0Var4);
                            }
                            rgy0 rgy0Var5 = (rgy0) mwgVar.g(rgy0.V0, vz00Var);
                            this.i = rgy0Var5;
                            if (qgy0VarP != null) {
                                qgy0VarP.i(rgy0Var5);
                                this.i = qgy0VarP.g();
                            }
                            this.c |= 16;
                            continue;
                        case 56:
                            this.c |= 32;
                            this.t = mwgVar.k();
                            continue;
                        case 66:
                            if ((i & 128) != 128) {
                                this.X = new ArrayList();
                                i |= 128;
                            }
                            this.X.add(mwgVar.g(efy0.h, vz00Var));
                            continue;
                        case 248:
                            if ((i & 256) != 256) {
                                this.Y = new ArrayList();
                                i |= 256;
                            }
                            this.Y.add(Integer.valueOf(mwgVar.k()));
                            continue;
                        case 250:
                            int iE = mwgVar.e(mwgVar.k());
                            if ((i & 256) != 256 && mwgVar.c() > 0) {
                                this.Y = new ArrayList();
                                i |= 256;
                            }
                            while (mwgVar.c() > 0) {
                                this.Y.add(Integer.valueOf(mwgVar.k()));
                            }
                            mwgVar.d(iE);
                            continue;
                        case 258:
                            if ((i & 512) != 512) {
                                this.Z = new ArrayList();
                                i |= 512;
                            }
                            this.Z.add(mwgVar.g(ify0.h, vz00Var));
                            continue;
                        default:
                            if (!l(mwgVar, w4c0VarY, vz00Var, iN)) {
                                break;
                            }
                            break;
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
                if ((i & 4) == 4) {
                    this.f = Collections.unmodifiableList(this.f);
                }
                if ((i & 128) == 128) {
                    this.X = Collections.unmodifiableList(this.X);
                }
                if ((i & 256) == 256) {
                    this.Y = Collections.unmodifiableList(this.Y);
                }
                if ((i & 512) == 512) {
                    this.Z = Collections.unmodifiableList(this.Z);
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
        if ((i & 4) == 4) {
            this.f = Collections.unmodifiableList(this.f);
        }
        if ((i & 128) == 128) {
            this.X = Collections.unmodifiableList(this.X);
        }
        if ((i & 256) == 256) {
            this.Y = Collections.unmodifiableList(this.Y);
        }
        if ((i & 512) == 512) {
            this.Z = Collections.unmodifiableList(this.Z);
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
        int i = this.O0;
        if (i != -1) {
            return i;
        }
        int iG = (this.c & 1) == 1 ? w4c0.g(1, this.d) : 0;
        if ((this.c & 2) == 2) {
            iG += w4c0.g(2, this.e);
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            iG += w4c0.i(3, (t8) this.f.get(i2));
        }
        if ((this.c & 4) == 4) {
            iG += w4c0.i(4, this.g);
        }
        if ((this.c & 8) == 8) {
            iG += w4c0.g(5, this.h);
        }
        if ((this.c & 16) == 16) {
            iG += w4c0.i(6, this.i);
        }
        if ((this.c & 32) == 32) {
            iG += w4c0.g(7, this.t);
        }
        for (int i3 = 0; i3 < this.X.size(); i3++) {
            iG += w4c0.i(8, (t8) this.X.get(i3));
        }
        int i4 = 0;
        int iH = 0;
        while (true) {
            int size = this.Y.size();
            list = this.Y;
            if (i4 >= size) {
                break;
            }
            iH += w4c0.h(((Integer) list.get(i4)).intValue());
            i4++;
        }
        int size2 = (list.size() * 2) + iG + iH;
        for (int i5 = 0; i5 < this.Z.size(); i5++) {
            size2 += w4c0.i(32, (t8) this.Z.get(i5));
        }
        int size3 = this.b.size() + h() + size2;
        this.O0 = size3;
        return size3;
    }

    @Override // p.t8
    public final xe40 b() {
        return sgy0.h();
    }

    @Override // p.t8
    public final xe40 c() {
        sgy0 sgy0VarH = sgy0.h();
        sgy0VarH.i(this);
        return sgy0VarH;
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
        for (int i = 0; i < this.f.size(); i++) {
            w4c0Var.R(3, (t8) this.f.get(i));
        }
        if ((this.c & 4) == 4) {
            w4c0Var.R(4, this.g);
        }
        if ((this.c & 8) == 8) {
            w4c0Var.P(5, this.h);
        }
        if ((this.c & 16) == 16) {
            w4c0Var.R(6, this.i);
        }
        if ((this.c & 32) == 32) {
            w4c0Var.P(7, this.t);
        }
        for (int i2 = 0; i2 < this.X.size(); i2++) {
            w4c0Var.R(8, (t8) this.X.get(i2));
        }
        for (int i3 = 0; i3 < this.Y.size(); i3++) {
            w4c0Var.P(31, ((Integer) this.Y.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.Z.size(); i4++) {
            w4c0Var.R(32, (t8) this.Z.get(i4));
        }
        kp00Var.l(200, w4c0Var);
        w4c0Var.U(this.b);
    }

    @Override // p.u2j0
    public final t8 getDefaultInstanceForType() {
        return P0;
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.N0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.c & 2) != 2) {
            this.N0 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f.size(); i++) {
            if (!((wgy0) this.f.get(i)).isInitialized()) {
                this.N0 = (byte) 0;
                return false;
            }
        }
        if ((this.c & 4) == 4 && !this.g.isInitialized()) {
            this.N0 = (byte) 0;
            return false;
        }
        if ((this.c & 16) == 16 && !this.i.isInitialized()) {
            this.N0 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.X.size(); i2++) {
            if (!((efy0) this.X.get(i2)).isInitialized()) {
                this.N0 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.Z.size(); i3++) {
            if (!((ify0) this.Z.get(i3)).isInitialized()) {
                this.N0 = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.N0 = (byte) 1;
            return true;
        }
        this.N0 = (byte) 0;
        return false;
    }

    public tgy0() {
        this.N0 = (byte) -1;
        this.O0 = -1;
        this.b = qhc.a;
    }

    public tgy0(sgy0 sgy0Var) {
        super(sgy0Var);
        this.N0 = (byte) -1;
        this.O0 = -1;
        this.b = sgy0Var.a;
    }
}
