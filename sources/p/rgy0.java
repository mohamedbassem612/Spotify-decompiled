package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rgy0 extends ef40 {
    public static final rgy0 U0;
    public static final tja0 V0 = new tja0(22);
    public int N0;
    public rgy0 O0;
    public int P0;
    public int Q0;
    public List R0;
    public byte S0;
    public int T0;
    public int X;
    public int Y;
    public rgy0 Z;
    public final qhc b;
    public int c;
    public List d;
    public boolean e;
    public int f;
    public rgy0 g;
    public int h;
    public int i;
    public int t;

    static {
        rgy0 rgy0Var = new rgy0();
        U0 = rgy0Var;
        rgy0Var.o();
    }

    public rgy0(mwg mwgVar, vz00 vz00Var) {
        this.S0 = (byte) -1;
        this.T0 = -1;
        o();
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = mwgVar.n();
                    tja0 tja0Var = V0;
                    qgy0 qgy0VarP = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.c |= 4096;
                            this.Q0 = mwgVar.k();
                            continue;
                        case 18:
                            if ((i & 1) != 1) {
                                this.d = new ArrayList();
                                i |= 1;
                            }
                            this.d.add(mwgVar.g(pgy0.i, vz00Var));
                            continue;
                        case 24:
                            this.c |= 1;
                            this.e = mwgVar.l() != 0;
                            continue;
                        case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                            this.c |= 2;
                            this.f = mwgVar.k();
                            continue;
                        case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                            if ((this.c & 4) == 4) {
                                rgy0 rgy0Var = this.g;
                                rgy0Var.getClass();
                                qgy0VarP = p(rgy0Var);
                            }
                            rgy0 rgy0Var2 = (rgy0) mwgVar.g(tja0Var, vz00Var);
                            this.g = rgy0Var2;
                            if (qgy0VarP != null) {
                                qgy0VarP.i(rgy0Var2);
                                this.g = qgy0VarP.g();
                            }
                            this.c |= 4;
                            continue;
                        case 48:
                            this.c |= 16;
                            this.i = mwgVar.k();
                            continue;
                        case 56:
                            this.c |= 32;
                            this.t = mwgVar.k();
                            continue;
                        case 64:
                            this.c |= 8;
                            this.h = mwgVar.k();
                            continue;
                        case 72:
                            this.c |= 64;
                            this.X = mwgVar.k();
                            continue;
                        case 82:
                            if ((this.c & 256) == 256) {
                                rgy0 rgy0Var3 = this.Z;
                                rgy0Var3.getClass();
                                qgy0VarP = p(rgy0Var3);
                            }
                            rgy0 rgy0Var4 = (rgy0) mwgVar.g(tja0Var, vz00Var);
                            this.Z = rgy0Var4;
                            if (qgy0VarP != null) {
                                qgy0VarP.i(rgy0Var4);
                                this.Z = qgy0VarP.g();
                            }
                            this.c |= 256;
                            continue;
                        case 88:
                            this.c |= 512;
                            this.N0 = mwgVar.k();
                            continue;
                        case 96:
                            this.c |= 128;
                            this.Y = mwgVar.k();
                            continue;
                        case 106:
                            if ((this.c & 1024) == 1024) {
                                rgy0 rgy0Var5 = this.O0;
                                rgy0Var5.getClass();
                                qgy0VarP = p(rgy0Var5);
                            }
                            rgy0 rgy0Var6 = (rgy0) mwgVar.g(tja0Var, vz00Var);
                            this.O0 = rgy0Var6;
                            if (qgy0VarP != null) {
                                qgy0VarP.i(rgy0Var6);
                                this.O0 = qgy0VarP.g();
                            }
                            this.c |= 1024;
                            continue;
                        case 112:
                            this.c |= 2048;
                            this.P0 = mwgVar.k();
                            continue;
                        case 802:
                            if ((i & 16384) != 16384) {
                                this.R0 = new ArrayList();
                                i |= 16384;
                            }
                            this.R0.add(mwgVar.g(efy0.h, vz00Var));
                            continue;
                        default:
                            if (!l(mwgVar, w4c0VarY, vz00Var, iN)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.a = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.a = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.d = Collections.unmodifiableList(this.d);
                }
                if ((i & 16384) == 16384) {
                    this.R0 = Collections.unmodifiableList(this.R0);
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
        if ((i & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
        }
        if ((i & 16384) == 16384) {
            this.R0 = Collections.unmodifiableList(this.R0);
        }
        try {
            w4c0VarY.F();
        } catch (IOException unused2) {
        } finally {
            this.b = jhcVar.d();
        }
        k();
    }

    public static qgy0 p(rgy0 rgy0Var) {
        qgy0 qgy0VarH = qgy0.h();
        qgy0VarH.i(rgy0Var);
        return qgy0VarH;
    }

    @Override // p.t8
    public final int a() {
        int i = this.T0;
        if (i != -1) {
            return i;
        }
        int iG = (this.c & 4096) == 4096 ? w4c0.g(1, this.Q0) : 0;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            iG += w4c0.i(2, (t8) this.d.get(i2));
        }
        if ((this.c & 1) == 1) {
            iG += w4c0.m(3) + 1;
        }
        if ((this.c & 2) == 2) {
            iG += w4c0.g(4, this.f);
        }
        if ((this.c & 4) == 4) {
            iG += w4c0.i(5, this.g);
        }
        if ((this.c & 16) == 16) {
            iG += w4c0.g(6, this.i);
        }
        if ((this.c & 32) == 32) {
            iG += w4c0.g(7, this.t);
        }
        if ((this.c & 8) == 8) {
            iG += w4c0.g(8, this.h);
        }
        if ((this.c & 64) == 64) {
            iG += w4c0.g(9, this.X);
        }
        if ((this.c & 256) == 256) {
            iG += w4c0.i(10, this.Z);
        }
        if ((this.c & 512) == 512) {
            iG += w4c0.g(11, this.N0);
        }
        if ((this.c & 128) == 128) {
            iG += w4c0.g(12, this.Y);
        }
        if ((this.c & 1024) == 1024) {
            iG += w4c0.i(13, this.O0);
        }
        if ((this.c & 2048) == 2048) {
            iG += w4c0.g(14, this.P0);
        }
        for (int i3 = 0; i3 < this.R0.size(); i3++) {
            iG += w4c0.i(100, (t8) this.R0.get(i3));
        }
        int size = this.b.size() + h() + iG;
        this.T0 = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        return qgy0.h();
    }

    @Override // p.t8
    public final xe40 c() {
        return p(this);
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        kp00 kp00Var = new kp00(this);
        if ((this.c & 4096) == 4096) {
            w4c0Var.P(1, this.Q0);
        }
        for (int i = 0; i < this.d.size(); i++) {
            w4c0Var.R(2, (t8) this.d.get(i));
        }
        if ((this.c & 1) == 1) {
            boolean z = this.e;
            w4c0Var.a0(3, 0);
            w4c0Var.T(z ? 1 : 0);
        }
        if ((this.c & 2) == 2) {
            w4c0Var.P(4, this.f);
        }
        if ((this.c & 4) == 4) {
            w4c0Var.R(5, this.g);
        }
        if ((this.c & 16) == 16) {
            w4c0Var.P(6, this.i);
        }
        if ((this.c & 32) == 32) {
            w4c0Var.P(7, this.t);
        }
        if ((this.c & 8) == 8) {
            w4c0Var.P(8, this.h);
        }
        if ((this.c & 64) == 64) {
            w4c0Var.P(9, this.X);
        }
        if ((this.c & 256) == 256) {
            w4c0Var.R(10, this.Z);
        }
        if ((this.c & 512) == 512) {
            w4c0Var.P(11, this.N0);
        }
        if ((this.c & 128) == 128) {
            w4c0Var.P(12, this.Y);
        }
        if ((this.c & 1024) == 1024) {
            w4c0Var.R(13, this.O0);
        }
        if ((this.c & 2048) == 2048) {
            w4c0Var.P(14, this.P0);
        }
        for (int i2 = 0; i2 < this.R0.size(); i2++) {
            w4c0Var.R(100, (t8) this.R0.get(i2));
        }
        kp00Var.l(200, w4c0Var);
        w4c0Var.U(this.b);
    }

    @Override // p.u2j0
    public final t8 getDefaultInstanceForType() {
        return U0;
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.S0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (!((pgy0) this.d.get(i)).isInitialized()) {
                this.S0 = (byte) 0;
                return false;
            }
        }
        if ((this.c & 4) == 4 && !this.g.isInitialized()) {
            this.S0 = (byte) 0;
            return false;
        }
        if ((this.c & 256) == 256 && !this.Z.isInitialized()) {
            this.S0 = (byte) 0;
            return false;
        }
        if ((this.c & 1024) == 1024 && !this.O0.isInitialized()) {
            this.S0 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.R0.size(); i2++) {
            if (!((efy0) this.R0.get(i2)).isInitialized()) {
                this.S0 = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.S0 = (byte) 1;
            return true;
        }
        this.S0 = (byte) 0;
        return false;
    }

    public final boolean n() {
        return (this.c & 16) == 16;
    }

    public final void o() {
        List list = Collections.EMPTY_LIST;
        this.d = list;
        this.e = false;
        this.f = 0;
        rgy0 rgy0Var = U0;
        this.g = rgy0Var;
        this.h = 0;
        this.i = 0;
        this.t = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = rgy0Var;
        this.N0 = 0;
        this.O0 = rgy0Var;
        this.P0 = 0;
        this.Q0 = 0;
        this.R0 = list;
    }

    public rgy0() {
        this.S0 = (byte) -1;
        this.T0 = -1;
        this.b = qhc.a;
    }

    public rgy0(qgy0 qgy0Var) {
        super(qgy0Var);
        this.S0 = (byte) -1;
        this.T0 = -1;
        this.b = qgy0Var.a;
    }
}
