package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bfy0 extends kf40 {
    public static final bfy0 P0;
    public static final tja0 Q0 = new tja0((byte) 7);
    public byte N0;
    public int O0;
    public List X;
    public int Y;
    public int Z;
    public final qhc a;
    public int b;
    public afy0 c;
    public long d;
    public float e;
    public double f;
    public int g;
    public int h;
    public int i;
    public efy0 t;

    static {
        bfy0 bfy0Var = new bfy0();
        P0 = bfy0Var;
        bfy0Var.g();
    }

    public bfy0(mwg mwgVar, vz00 vz00Var) {
        dfy0 dfy0Var;
        this.N0 = (byte) -1;
        this.O0 = -1;
        g();
        byte b = 0;
        jhc jhcVar = new jhc((byte) 0);
        w4c0 w4c0VarY = w4c0.y(jhcVar, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = mwgVar.n();
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            int iK = mwgVar.k();
                            afy0 afy0VarA = afy0.a(iK);
                            if (afy0VarA == null) {
                                w4c0VarY.Y(iN);
                                w4c0VarY.Y(iK);
                            } else {
                                this.b |= 1;
                                this.c = afy0VarA;
                                continue;
                            }
                            break;
                        case 16:
                            this.b |= 2;
                            long jL = mwgVar.l();
                            this.d = (-(jL & 1)) ^ (jL >>> 1);
                            continue;
                        case 29:
                            this.b |= 4;
                            this.e = Float.intBitsToFloat(mwgVar.i());
                            continue;
                        case 33:
                            this.b |= 8;
                            this.f = Double.longBitsToDouble(mwgVar.j());
                            continue;
                        case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                            this.b |= 16;
                            this.g = mwgVar.k();
                            continue;
                        case 48:
                            this.b |= 32;
                            this.h = mwgVar.k();
                            continue;
                        case 56:
                            this.b |= 64;
                            this.i = mwgVar.k();
                            continue;
                        case 66:
                            if ((this.b & 128) == 128) {
                                efy0 efy0Var = this.t;
                                efy0Var.getClass();
                                dfy0Var = new dfy0(b);
                                dfy0Var.d = Collections.EMPTY_LIST;
                                dfy0Var.h(efy0Var);
                            } else {
                                dfy0Var = null;
                            }
                            efy0 efy0Var2 = (efy0) mwgVar.g(efy0.h, vz00Var);
                            this.t = efy0Var2;
                            if (dfy0Var != null) {
                                dfy0Var.h(efy0Var2);
                                this.t = dfy0Var.e();
                            }
                            this.b |= 128;
                            continue;
                        case 74:
                            if ((c & 256) != 256) {
                                this.X = new ArrayList();
                                c = 256;
                            }
                            this.X.add(mwgVar.g(Q0, vz00Var));
                            continue;
                        case 80:
                            this.b |= 512;
                            this.Z = mwgVar.k();
                            continue;
                        case 88:
                            this.b |= 256;
                            this.Y = mwgVar.k();
                            continue;
                        default:
                            if (!mwgVar.q(iN, w4c0VarY)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((c & 256) == 256) {
                        this.X = Collections.unmodifiableList(this.X);
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
        if ((c & 256) == 256) {
            this.X = Collections.unmodifiableList(this.X);
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
        int i = this.O0;
        if (i != -1) {
            return i;
        }
        int iF = (this.b & 1) == 1 ? w4c0.f(1, this.c.a) : 0;
        if ((this.b & 2) == 2) {
            long j = this.d;
            iF += w4c0.l((j >> 63) ^ (j << 1)) + w4c0.m(2);
        }
        if ((this.b & 4) == 4) {
            iF += w4c0.m(3) + 4;
        }
        if ((this.b & 8) == 8) {
            iF += w4c0.m(4) + 8;
        }
        if ((this.b & 16) == 16) {
            iF += w4c0.g(5, this.g);
        }
        if ((this.b & 32) == 32) {
            iF += w4c0.g(6, this.h);
        }
        if ((this.b & 64) == 64) {
            iF += w4c0.g(7, this.i);
        }
        if ((this.b & 128) == 128) {
            iF += w4c0.i(8, this.t);
        }
        for (int i2 = 0; i2 < this.X.size(); i2++) {
            iF += w4c0.i(9, (t8) this.X.get(i2));
        }
        if ((this.b & 512) == 512) {
            iF += w4c0.g(10, this.Z);
        }
        if ((this.b & 256) == 256) {
            iF += w4c0.g(11, this.Y);
        }
        int size = this.a.size() + iF;
        this.O0 = size;
        return size;
    }

    @Override // p.t8
    public final xe40 b() {
        return zey0.g();
    }

    @Override // p.t8
    public final xe40 c() {
        zey0 zey0VarG = zey0.g();
        zey0VarG.h(this);
        return zey0VarG;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        if ((this.b & 1) == 1) {
            w4c0Var.O(1, this.c.a);
        }
        if ((this.b & 2) == 2) {
            long j = this.d;
            w4c0Var.a0(2, 0);
            w4c0Var.Z((j >> 63) ^ (j << 1));
        }
        if ((this.b & 4) == 4) {
            float f = this.e;
            w4c0Var.a0(3, 5);
            w4c0Var.W(Float.floatToRawIntBits(f));
        }
        if ((this.b & 8) == 8) {
            double d = this.f;
            w4c0Var.a0(4, 1);
            w4c0Var.X(Double.doubleToRawLongBits(d));
        }
        if ((this.b & 16) == 16) {
            w4c0Var.P(5, this.g);
        }
        if ((this.b & 32) == 32) {
            w4c0Var.P(6, this.h);
        }
        if ((this.b & 64) == 64) {
            w4c0Var.P(7, this.i);
        }
        if ((this.b & 128) == 128) {
            w4c0Var.R(8, this.t);
        }
        for (int i = 0; i < this.X.size(); i++) {
            w4c0Var.R(9, (t8) this.X.get(i));
        }
        if ((this.b & 512) == 512) {
            w4c0Var.P(10, this.Z);
        }
        if ((this.b & 256) == 256) {
            w4c0Var.P(11, this.Y);
        }
        w4c0Var.U(this.a);
    }

    public final void g() {
        this.c = afy0.BYTE;
        this.d = 0L;
        this.e = 0.0f;
        this.f = 0.0d;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.t = efy0.g;
        this.X = Collections.EMPTY_LIST;
        this.Y = 0;
        this.Z = 0;
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
        if ((this.b & 128) == 128 && !this.t.isInitialized()) {
            this.N0 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.X.size(); i++) {
            if (!((bfy0) this.X.get(i)).isInitialized()) {
                this.N0 = (byte) 0;
                return false;
            }
        }
        this.N0 = (byte) 1;
        return true;
    }

    public bfy0() {
        this.N0 = (byte) -1;
        this.O0 = -1;
        this.a = qhc.a;
    }

    public bfy0(zey0 zey0Var) {
        this.N0 = (byte) -1;
        this.O0 = -1;
        this.a = zey0Var.a;
    }
}
