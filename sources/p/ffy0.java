package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ffy0 extends df40 {
    public List N0;
    public List O0;
    public List P0;
    public List Q0;
    public List R0;
    public List S0;
    public int T0;
    public rgy0 U0;
    public int V0;
    public List W0;
    public List X;
    public xgy0 X0;
    public List Y;
    public List Y0;
    public List Z;
    public ehy0 Z0;
    public List a1;
    public int d;
    public int e;
    public int f;
    public int g;
    public List h;
    public List i;
    public List t;

    public static ffy0 h() {
        ffy0 ffy0Var = new ffy0();
        ffy0Var.e = 6;
        List list = Collections.EMPTY_LIST;
        ffy0Var.h = list;
        ffy0Var.i = list;
        ffy0Var.t = list;
        ffy0Var.X = list;
        ffy0Var.Y = list;
        ffy0Var.Z = list;
        ffy0Var.N0 = list;
        ffy0Var.O0 = list;
        ffy0Var.P0 = list;
        ffy0Var.Q0 = list;
        ffy0Var.R0 = list;
        ffy0Var.S0 = list;
        ffy0Var.U0 = rgy0.U0;
        ffy0Var.W0 = list;
        ffy0Var.X0 = xgy0.g;
        ffy0Var.Y0 = list;
        ffy0Var.Z0 = ehy0.e;
        ffy0Var.a1 = list;
        return ffy0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        hfy0 hfy0VarG = g();
        if (hfy0VarG.isInitialized()) {
            return hfy0VarG;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        hfy0 hfy0Var = null;
        try {
            try {
                hfy0.h1.getClass();
                i(new hfy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                hfy0 hfy0Var2 = (hfy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    hfy0Var = hfy0Var2;
                    if (hfy0Var != null) {
                        i(hfy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (hfy0Var != null) {
                i(hfy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        ffy0 ffy0VarH = h();
        ffy0VarH.i(g());
        return ffy0VarH;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        i((hfy0) kf40Var);
        return this;
    }

    public final hfy0 g() {
        int i;
        hfy0 hfy0Var = new hfy0(this);
        int i2 = this.d;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        hfy0Var.d = this.e;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        hfy0Var.e = this.f;
        if ((i2 & 4) == 4) {
            i3 |= 4;
        }
        hfy0Var.f = this.g;
        if ((i2 & 8) == 8) {
            this.h = Collections.unmodifiableList(this.h);
            i = this.d & (-9);
            this.d = i;
        } else {
            i = i2;
        }
        hfy0Var.g = this.h;
        if ((i & 16) == 16) {
            this.i = Collections.unmodifiableList(this.i);
            i = this.d & (-17);
            this.d = i;
        }
        hfy0Var.h = this.i;
        if ((i & 32) == 32) {
            this.t = Collections.unmodifiableList(this.t);
            i = this.d & (-33);
            this.d = i;
        }
        hfy0Var.i = this.t;
        if ((i & 64) == 64) {
            this.X = Collections.unmodifiableList(this.X);
            i = this.d & (-65);
            this.d = i;
        }
        hfy0Var.X = this.X;
        if ((i & 128) == 128) {
            this.Y = Collections.unmodifiableList(this.Y);
            i = this.d & (-129);
            this.d = i;
        }
        hfy0Var.Z = this.Y;
        if ((i & 256) == 256) {
            this.Z = Collections.unmodifiableList(this.Z);
            i = this.d & (-257);
            this.d = i;
        }
        hfy0Var.N0 = this.Z;
        if ((i & 512) == 512) {
            this.N0 = Collections.unmodifiableList(this.N0);
            i = this.d & (-513);
            this.d = i;
        }
        hfy0Var.P0 = this.N0;
        if ((i & 1024) == 1024) {
            this.O0 = Collections.unmodifiableList(this.O0);
            i = this.d & (-1025);
            this.d = i;
        }
        hfy0Var.Q0 = this.O0;
        if ((i & 2048) == 2048) {
            this.P0 = Collections.unmodifiableList(this.P0);
            i = this.d & (-2049);
            this.d = i;
        }
        hfy0Var.R0 = this.P0;
        if ((i & 4096) == 4096) {
            this.Q0 = Collections.unmodifiableList(this.Q0);
            i = this.d & (-4097);
            this.d = i;
        }
        hfy0Var.S0 = this.Q0;
        if ((i & 8192) == 8192) {
            this.R0 = Collections.unmodifiableList(this.R0);
            i = this.d & (-8193);
            this.d = i;
        }
        hfy0Var.T0 = this.R0;
        if ((i & 16384) == 16384) {
            this.S0 = Collections.unmodifiableList(this.S0);
            i = this.d & (-16385);
            this.d = i;
        }
        hfy0Var.U0 = this.S0;
        if ((i2 & 32768) == 32768) {
            i3 |= 8;
        }
        hfy0Var.W0 = this.T0;
        if ((i2 & 65536) == 65536) {
            i3 |= 16;
        }
        hfy0Var.X0 = this.U0;
        if ((i2 & 131072) == 131072) {
            i3 |= 32;
        }
        hfy0Var.Y0 = this.V0;
        if ((i & 262144) == 262144) {
            this.W0 = Collections.unmodifiableList(this.W0);
            i = this.d & (-262145);
            this.d = i;
        }
        hfy0Var.Z0 = this.W0;
        if ((i2 & 524288) == 524288) {
            i3 |= 64;
        }
        hfy0Var.a1 = this.X0;
        if ((i & 1048576) == 1048576) {
            this.Y0 = Collections.unmodifiableList(this.Y0);
            i = this.d & (-1048577);
            this.d = i;
        }
        hfy0Var.b1 = this.Y0;
        if ((i2 & 2097152) == 2097152) {
            i3 |= 128;
        }
        hfy0Var.c1 = this.Z0;
        if ((i & 4194304) == 4194304) {
            this.a1 = Collections.unmodifiableList(this.a1);
            this.d &= -4194305;
        }
        hfy0Var.d1 = this.a1;
        hfy0Var.c = i3;
        return hfy0Var;
    }

    public final void i(hfy0 hfy0Var) {
        ehy0 ehy0Var;
        xgy0 xgy0Var;
        rgy0 rgy0Var;
        if (hfy0Var == hfy0.g1) {
            return;
        }
        int i = hfy0Var.c;
        if ((i & 1) == 1) {
            int i2 = hfy0Var.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        byte b = 2;
        if ((i & 2) == 2) {
            int i3 = hfy0Var.e;
            this.d |= 2;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = hfy0Var.f;
            this.d = 4 | this.d;
            this.g = i4;
        }
        if (!hfy0Var.g.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = hfy0Var.g;
                this.d &= -9;
            } else {
                if ((this.d & 8) != 8) {
                    this.h = new ArrayList(this.h);
                    this.d |= 8;
                }
                this.h.addAll(hfy0Var.g);
            }
        }
        if (!hfy0Var.h.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i = hfy0Var.h;
                this.d &= -17;
            } else {
                if ((this.d & 16) != 16) {
                    this.i = new ArrayList(this.i);
                    this.d |= 16;
                }
                this.i.addAll(hfy0Var.h);
            }
        }
        if (!hfy0Var.i.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = hfy0Var.i;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.t = new ArrayList(this.t);
                    this.d |= 32;
                }
                this.t.addAll(hfy0Var.i);
            }
        }
        if (!hfy0Var.X.isEmpty()) {
            if (this.X.isEmpty()) {
                this.X = hfy0Var.X;
                this.d &= -65;
            } else {
                if ((this.d & 64) != 64) {
                    this.X = new ArrayList(this.X);
                    this.d |= 64;
                }
                this.X.addAll(hfy0Var.X);
            }
        }
        if (!hfy0Var.Z.isEmpty()) {
            if (this.Y.isEmpty()) {
                this.Y = hfy0Var.Z;
                this.d &= -129;
            } else {
                if ((this.d & 128) != 128) {
                    this.Y = new ArrayList(this.Y);
                    this.d |= 128;
                }
                this.Y.addAll(hfy0Var.Z);
            }
        }
        if (!hfy0Var.N0.isEmpty()) {
            if (this.Z.isEmpty()) {
                this.Z = hfy0Var.N0;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.Z = new ArrayList(this.Z);
                    this.d |= 256;
                }
                this.Z.addAll(hfy0Var.N0);
            }
        }
        if (!hfy0Var.P0.isEmpty()) {
            if (this.N0.isEmpty()) {
                this.N0 = hfy0Var.P0;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.N0 = new ArrayList(this.N0);
                    this.d |= 512;
                }
                this.N0.addAll(hfy0Var.P0);
            }
        }
        if (!hfy0Var.Q0.isEmpty()) {
            if (this.O0.isEmpty()) {
                this.O0 = hfy0Var.Q0;
                this.d &= -1025;
            } else {
                if ((this.d & 1024) != 1024) {
                    this.O0 = new ArrayList(this.O0);
                    this.d |= 1024;
                }
                this.O0.addAll(hfy0Var.Q0);
            }
        }
        if (!hfy0Var.R0.isEmpty()) {
            if (this.P0.isEmpty()) {
                this.P0 = hfy0Var.R0;
                this.d &= -2049;
            } else {
                if ((this.d & 2048) != 2048) {
                    this.P0 = new ArrayList(this.P0);
                    this.d |= 2048;
                }
                this.P0.addAll(hfy0Var.R0);
            }
        }
        if (!hfy0Var.S0.isEmpty()) {
            if (this.Q0.isEmpty()) {
                this.Q0 = hfy0Var.S0;
                this.d &= -4097;
            } else {
                if ((this.d & 4096) != 4096) {
                    this.Q0 = new ArrayList(this.Q0);
                    this.d |= 4096;
                }
                this.Q0.addAll(hfy0Var.S0);
            }
        }
        if (!hfy0Var.T0.isEmpty()) {
            if (this.R0.isEmpty()) {
                this.R0 = hfy0Var.T0;
                this.d &= -8193;
            } else {
                if ((this.d & 8192) != 8192) {
                    this.R0 = new ArrayList(this.R0);
                    this.d |= 8192;
                }
                this.R0.addAll(hfy0Var.T0);
            }
        }
        if (!hfy0Var.U0.isEmpty()) {
            if (this.S0.isEmpty()) {
                this.S0 = hfy0Var.U0;
                this.d &= -16385;
            } else {
                if ((this.d & 16384) != 16384) {
                    this.S0 = new ArrayList(this.S0);
                    this.d |= 16384;
                }
                this.S0.addAll(hfy0Var.U0);
            }
        }
        int i5 = hfy0Var.c;
        if ((i5 & 8) == 8) {
            int i6 = hfy0Var.W0;
            this.d |= 32768;
            this.T0 = i6;
        }
        if ((i5 & 16) == 16) {
            rgy0 rgy0Var2 = hfy0Var.X0;
            if ((this.d & 65536) != 65536 || (rgy0Var = this.U0) == rgy0.U0) {
                this.U0 = rgy0Var2;
            } else {
                qgy0 qgy0VarP = rgy0.p(rgy0Var);
                qgy0VarP.i(rgy0Var2);
                this.U0 = qgy0VarP.g();
            }
            this.d |= 65536;
        }
        if ((hfy0Var.c & 32) == 32) {
            int i7 = hfy0Var.Y0;
            this.d |= 131072;
            this.V0 = i7;
        }
        if (!hfy0Var.Z0.isEmpty()) {
            if (this.W0.isEmpty()) {
                this.W0 = hfy0Var.Z0;
                this.d &= -262145;
            } else {
                if ((this.d & 262144) != 262144) {
                    this.W0 = new ArrayList(this.W0);
                    this.d |= 262144;
                }
                this.W0.addAll(hfy0Var.Z0);
            }
        }
        if ((hfy0Var.c & 64) == 64) {
            xgy0 xgy0Var2 = hfy0Var.a1;
            if ((this.d & 524288) != 524288 || (xgy0Var = this.X0) == xgy0.g) {
                this.X0 = xgy0Var2;
            } else {
                dfy0 dfy0VarG = xgy0.g(xgy0Var);
                dfy0VarG.i(xgy0Var2);
                this.X0 = dfy0VarG.g();
            }
            this.d |= 524288;
        }
        if (!hfy0Var.b1.isEmpty()) {
            if (this.Y0.isEmpty()) {
                this.Y0 = hfy0Var.b1;
                this.d &= -1048577;
            } else {
                if ((this.d & 1048576) != 1048576) {
                    this.Y0 = new ArrayList(this.Y0);
                    this.d |= 1048576;
                }
                this.Y0.addAll(hfy0Var.b1);
            }
        }
        if ((hfy0Var.c & 128) == 128) {
            ehy0 ehy0Var2 = hfy0Var.c1;
            if ((this.d & 2097152) != 2097152 || (ehy0Var = this.Z0) == ehy0.e) {
                this.Z0 = ehy0Var2;
            } else {
                lfy0 lfy0Var = new lfy0(b);
                lfy0Var.d = Collections.EMPTY_LIST;
                lfy0Var.n(ehy0Var);
                lfy0Var.n(ehy0Var2);
                this.Z0 = lfy0Var.i();
            }
            this.d |= 2097152;
        }
        if (!hfy0Var.d1.isEmpty()) {
            if (this.a1.isEmpty()) {
                this.a1 = hfy0Var.d1;
                this.d &= -4194305;
            } else {
                if ((this.d & 4194304) != 4194304) {
                    this.a1 = new ArrayList(this.a1);
                    this.d |= 4194304;
                }
                this.a1.addAll(hfy0Var.d1);
            }
        }
        e(hfy0Var);
        this.a = this.a.c(hfy0Var.b);
    }
}
