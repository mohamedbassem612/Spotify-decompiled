package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fgy0 extends df40 {
    public List N0;
    public List O0;
    public zgy0 P0;
    public int Q0;
    public int R0;
    public List S0;
    public List T0;
    public List U0;
    public List V0;
    public List W0;
    public rgy0 X;
    public List X0;
    public int Y;
    public List Y0;
    public List Z;
    public List Z0;
    public mfy0 a1;
    public mfy0 b1;
    public int d;
    public int e;
    public int f;
    public int g;
    public rgy0 h;
    public int i;
    public List t;

    public static fgy0 h() {
        fgy0 fgy0Var = new fgy0();
        fgy0Var.e = 518;
        fgy0Var.f = 2054;
        rgy0 rgy0Var = rgy0.U0;
        fgy0Var.h = rgy0Var;
        List list = Collections.EMPTY_LIST;
        fgy0Var.t = list;
        fgy0Var.X = rgy0Var;
        fgy0Var.Z = list;
        fgy0Var.N0 = list;
        fgy0Var.O0 = list;
        fgy0Var.P0 = zgy0.N0;
        fgy0Var.S0 = list;
        fgy0Var.T0 = list;
        fgy0Var.U0 = list;
        fgy0Var.V0 = list;
        fgy0Var.W0 = list;
        fgy0Var.X0 = list;
        fgy0Var.Y0 = list;
        fgy0Var.Z0 = list;
        mfy0 mfy0Var = mfy0.e;
        fgy0Var.a1 = mfy0Var;
        fgy0Var.b1 = mfy0Var;
        return fgy0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        ggy0 ggy0VarG = g();
        if (ggy0VarG.isInitialized()) {
            return ggy0VarG;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        ggy0 ggy0Var = null;
        try {
            try {
                ggy0.f1.getClass();
                i(new ggy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ggy0 ggy0Var2 = (ggy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    ggy0Var = ggy0Var2;
                    if (ggy0Var != null) {
                        i(ggy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (ggy0Var != null) {
                i(ggy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        fgy0 fgy0VarH = h();
        fgy0VarH.i(g());
        return fgy0VarH;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        i((ggy0) kf40Var);
        return this;
    }

    public final ggy0 g() {
        int i;
        ggy0 ggy0Var = new ggy0(this);
        int i2 = this.d;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        ggy0Var.d = this.e;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        ggy0Var.e = this.f;
        if ((i2 & 4) == 4) {
            i3 |= 4;
        }
        ggy0Var.f = this.g;
        if ((i2 & 8) == 8) {
            i3 |= 8;
        }
        ggy0Var.g = this.h;
        if ((i2 & 16) == 16) {
            i3 |= 16;
        }
        ggy0Var.h = this.i;
        if ((i2 & 32) == 32) {
            this.t = Collections.unmodifiableList(this.t);
            i = this.d & (-33);
            this.d = i;
        } else {
            i = i2;
        }
        ggy0Var.i = this.t;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        ggy0Var.t = this.X;
        if ((i2 & 128) == 128) {
            i3 |= 64;
        }
        ggy0Var.X = this.Y;
        if ((i & 256) == 256) {
            this.Z = Collections.unmodifiableList(this.Z);
            i = this.d & (-257);
            this.d = i;
        }
        ggy0Var.Y = this.Z;
        if ((i & 512) == 512) {
            this.N0 = Collections.unmodifiableList(this.N0);
            i = this.d & (-513);
            this.d = i;
        }
        ggy0Var.Z = this.N0;
        if ((i & 1024) == 1024) {
            this.O0 = Collections.unmodifiableList(this.O0);
            i = this.d & (-1025);
            this.d = i;
        }
        ggy0Var.O0 = this.O0;
        if ((i2 & 2048) == 2048) {
            i3 |= 128;
        }
        ggy0Var.P0 = this.P0;
        if ((i2 & 4096) == 4096) {
            i3 |= 256;
        }
        ggy0Var.Q0 = this.Q0;
        if ((i2 & 8192) == 8192) {
            i3 |= 512;
        }
        ggy0Var.R0 = this.R0;
        if ((i & 16384) == 16384) {
            this.S0 = Collections.unmodifiableList(this.S0);
            i = this.d & (-16385);
            this.d = i;
        }
        ggy0Var.S0 = this.S0;
        if ((i & 32768) == 32768) {
            this.T0 = Collections.unmodifiableList(this.T0);
            i = this.d & (-32769);
            this.d = i;
        }
        ggy0Var.T0 = this.T0;
        if ((i & 65536) == 65536) {
            this.U0 = Collections.unmodifiableList(this.U0);
            i = this.d & (-65537);
            this.d = i;
        }
        ggy0Var.U0 = this.U0;
        if ((i & 131072) == 131072) {
            this.V0 = Collections.unmodifiableList(this.V0);
            i = this.d & (-131073);
            this.d = i;
        }
        ggy0Var.V0 = this.V0;
        if ((i & 262144) == 262144) {
            this.W0 = Collections.unmodifiableList(this.W0);
            i = this.d & (-262145);
            this.d = i;
        }
        ggy0Var.W0 = this.W0;
        if ((i & 524288) == 524288) {
            this.X0 = Collections.unmodifiableList(this.X0);
            i = this.d & (-524289);
            this.d = i;
        }
        ggy0Var.X0 = this.X0;
        if ((i & 1048576) == 1048576) {
            this.Y0 = Collections.unmodifiableList(this.Y0);
            i = this.d & (-1048577);
            this.d = i;
        }
        ggy0Var.Y0 = this.Y0;
        if ((i & 2097152) == 2097152) {
            this.Z0 = Collections.unmodifiableList(this.Z0);
            this.d &= -2097153;
        }
        ggy0Var.Z0 = this.Z0;
        if ((i2 & 4194304) == 4194304) {
            i3 |= 1024;
        }
        ggy0Var.a1 = this.a1;
        if ((i2 & 8388608) == 8388608) {
            i3 |= 2048;
        }
        ggy0Var.b1 = this.b1;
        ggy0Var.c = i3;
        return ggy0Var;
    }

    public final void i(ggy0 ggy0Var) {
        mfy0 mfy0Var;
        mfy0 mfy0Var2;
        zgy0 zgy0Var;
        rgy0 rgy0Var;
        rgy0 rgy0Var2;
        if (ggy0Var == ggy0.e1) {
            return;
        }
        int i = ggy0Var.c;
        if ((i & 1) == 1) {
            int i2 = ggy0Var.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = ggy0Var.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = ggy0Var.f;
            this.d = 4 | this.d;
            this.g = i4;
        }
        if ((i & 8) == 8) {
            rgy0 rgy0Var3 = ggy0Var.g;
            if ((this.d & 8) != 8 || (rgy0Var2 = this.h) == rgy0.U0) {
                this.h = rgy0Var3;
            } else {
                qgy0 qgy0VarP = rgy0.p(rgy0Var2);
                qgy0VarP.i(rgy0Var3);
                this.h = qgy0VarP.g();
            }
            this.d |= 8;
        }
        if ((ggy0Var.c & 16) == 16) {
            int i5 = ggy0Var.h;
            this.d = 16 | this.d;
            this.i = i5;
        }
        if (!ggy0Var.i.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = ggy0Var.i;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.t = new ArrayList(this.t);
                    this.d |= 32;
                }
                this.t.addAll(ggy0Var.i);
            }
        }
        if ((ggy0Var.c & 32) == 32) {
            rgy0 rgy0Var4 = ggy0Var.t;
            if ((this.d & 64) != 64 || (rgy0Var = this.X) == rgy0.U0) {
                this.X = rgy0Var4;
            } else {
                qgy0 qgy0VarP2 = rgy0.p(rgy0Var);
                qgy0VarP2.i(rgy0Var4);
                this.X = qgy0VarP2.g();
            }
            this.d |= 64;
        }
        if ((ggy0Var.c & 64) == 64) {
            int i6 = ggy0Var.X;
            this.d |= 128;
            this.Y = i6;
        }
        if (!ggy0Var.Y.isEmpty()) {
            if (this.Z.isEmpty()) {
                this.Z = ggy0Var.Y;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.Z = new ArrayList(this.Z);
                    this.d |= 256;
                }
                this.Z.addAll(ggy0Var.Y);
            }
        }
        if (!ggy0Var.Z.isEmpty()) {
            if (this.N0.isEmpty()) {
                this.N0 = ggy0Var.Z;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.N0 = new ArrayList(this.N0);
                    this.d |= 512;
                }
                this.N0.addAll(ggy0Var.Z);
            }
        }
        if (!ggy0Var.O0.isEmpty()) {
            if (this.O0.isEmpty()) {
                this.O0 = ggy0Var.O0;
                this.d &= -1025;
            } else {
                if ((this.d & 1024) != 1024) {
                    this.O0 = new ArrayList(this.O0);
                    this.d |= 1024;
                }
                this.O0.addAll(ggy0Var.O0);
            }
        }
        if ((ggy0Var.c & 128) == 128) {
            zgy0 zgy0Var2 = ggy0Var.P0;
            if ((this.d & 2048) != 2048 || (zgy0Var = this.P0) == zgy0.N0) {
                this.P0 = zgy0Var2;
            } else {
                ygy0 ygy0VarH = ygy0.h();
                ygy0VarH.i(zgy0Var);
                ygy0VarH.i(zgy0Var2);
                this.P0 = ygy0VarH.g();
            }
            this.d |= 2048;
        }
        int i7 = ggy0Var.c;
        if ((i7 & 256) == 256) {
            int i8 = ggy0Var.Q0;
            this.d |= 4096;
            this.Q0 = i8;
        }
        if ((i7 & 512) == 512) {
            int i9 = ggy0Var.R0;
            this.d |= 8192;
            this.R0 = i9;
        }
        if (!ggy0Var.S0.isEmpty()) {
            if (this.S0.isEmpty()) {
                this.S0 = ggy0Var.S0;
                this.d &= -16385;
            } else {
                if ((this.d & 16384) != 16384) {
                    this.S0 = new ArrayList(this.S0);
                    this.d |= 16384;
                }
                this.S0.addAll(ggy0Var.S0);
            }
        }
        if (!ggy0Var.T0.isEmpty()) {
            if (this.T0.isEmpty()) {
                this.T0 = ggy0Var.T0;
                this.d &= -32769;
            } else {
                if ((this.d & 32768) != 32768) {
                    this.T0 = new ArrayList(this.T0);
                    this.d |= 32768;
                }
                this.T0.addAll(ggy0Var.T0);
            }
        }
        if (!ggy0Var.U0.isEmpty()) {
            if (this.U0.isEmpty()) {
                this.U0 = ggy0Var.U0;
                this.d &= -65537;
            } else {
                if ((this.d & 65536) != 65536) {
                    this.U0 = new ArrayList(this.U0);
                    this.d |= 65536;
                }
                this.U0.addAll(ggy0Var.U0);
            }
        }
        if (!ggy0Var.V0.isEmpty()) {
            if (this.V0.isEmpty()) {
                this.V0 = ggy0Var.V0;
                this.d &= -131073;
            } else {
                if ((this.d & 131072) != 131072) {
                    this.V0 = new ArrayList(this.V0);
                    this.d |= 131072;
                }
                this.V0.addAll(ggy0Var.V0);
            }
        }
        if (!ggy0Var.W0.isEmpty()) {
            if (this.W0.isEmpty()) {
                this.W0 = ggy0Var.W0;
                this.d &= -262145;
            } else {
                if ((this.d & 262144) != 262144) {
                    this.W0 = new ArrayList(this.W0);
                    this.d |= 262144;
                }
                this.W0.addAll(ggy0Var.W0);
            }
        }
        if (!ggy0Var.X0.isEmpty()) {
            if (this.X0.isEmpty()) {
                this.X0 = ggy0Var.X0;
                this.d &= -524289;
            } else {
                if ((this.d & 524288) != 524288) {
                    this.X0 = new ArrayList(this.X0);
                    this.d |= 524288;
                }
                this.X0.addAll(ggy0Var.X0);
            }
        }
        if (!ggy0Var.Y0.isEmpty()) {
            if (this.Y0.isEmpty()) {
                this.Y0 = ggy0Var.Y0;
                this.d &= -1048577;
            } else {
                if ((this.d & 1048576) != 1048576) {
                    this.Y0 = new ArrayList(this.Y0);
                    this.d |= 1048576;
                }
                this.Y0.addAll(ggy0Var.Y0);
            }
        }
        if (!ggy0Var.Z0.isEmpty()) {
            if (this.Z0.isEmpty()) {
                this.Z0 = ggy0Var.Z0;
                this.d &= -2097153;
            } else {
                if ((this.d & 2097152) != 2097152) {
                    this.Z0 = new ArrayList(this.Z0);
                    this.d |= 2097152;
                }
                this.Z0.addAll(ggy0Var.Z0);
            }
        }
        if ((ggy0Var.c & 1024) == 1024) {
            mfy0 mfy0Var3 = ggy0Var.a1;
            if ((this.d & 4194304) != 4194304 || (mfy0Var2 = this.a1) == mfy0.e) {
                this.a1 = mfy0Var3;
            } else {
                lfy0 lfy0VarG = mfy0.g(mfy0Var2);
                lfy0VarG.j(mfy0Var3);
                this.a1 = lfy0VarG.e();
            }
            this.d |= 4194304;
        }
        if ((ggy0Var.c & 2048) == 2048) {
            mfy0 mfy0Var4 = ggy0Var.b1;
            if ((this.d & 8388608) != 8388608 || (mfy0Var = this.b1) == mfy0.e) {
                this.b1 = mfy0Var4;
            } else {
                lfy0 lfy0VarG2 = mfy0.g(mfy0Var);
                lfy0VarG2.j(mfy0Var4);
                this.b1 = lfy0VarG2.e();
            }
            this.d |= 8388608;
        }
        e(ggy0Var);
        this.a = this.a.c(ggy0Var.b);
    }
}
