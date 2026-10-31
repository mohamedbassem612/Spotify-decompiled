package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xfy0 extends df40 {
    public List N0;
    public List O0;
    public List P0;
    public xgy0 Q0;
    public List R0;
    public mfy0 S0;
    public List T0;
    public List U0;
    public List V0;
    public rgy0 X;
    public int Y;
    public List Z;
    public int d;
    public int e;
    public int f;
    public int g;
    public rgy0 h;
    public int i;
    public List t;

    public static xfy0 h() {
        xfy0 xfy0Var = new xfy0();
        xfy0Var.e = 6;
        xfy0Var.f = 6;
        rgy0 rgy0Var = rgy0.U0;
        xfy0Var.h = rgy0Var;
        List list = Collections.EMPTY_LIST;
        xfy0Var.t = list;
        xfy0Var.X = rgy0Var;
        xfy0Var.Z = list;
        xfy0Var.N0 = list;
        xfy0Var.O0 = list;
        xfy0Var.P0 = list;
        xfy0Var.Q0 = xgy0.g;
        xfy0Var.R0 = list;
        xfy0Var.S0 = mfy0.e;
        xfy0Var.T0 = list;
        xfy0Var.U0 = list;
        xfy0Var.V0 = list;
        return xfy0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        yfy0 yfy0VarG = g();
        if (yfy0VarG.isInitialized()) {
            return yfy0VarG;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        yfy0 yfy0Var = null;
        try {
            try {
                yfy0.Z0.getClass();
                i(new yfy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                yfy0 yfy0Var2 = (yfy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    yfy0Var = yfy0Var2;
                    if (yfy0Var != null) {
                        i(yfy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (yfy0Var != null) {
                i(yfy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        xfy0 xfy0VarH = h();
        xfy0VarH.i(g());
        return xfy0VarH;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        i((yfy0) kf40Var);
        return this;
    }

    public final yfy0 g() {
        int i;
        yfy0 yfy0Var = new yfy0(this);
        int i2 = this.d;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        yfy0Var.d = this.e;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        yfy0Var.e = this.f;
        if ((i2 & 4) == 4) {
            i3 |= 4;
        }
        yfy0Var.f = this.g;
        if ((i2 & 8) == 8) {
            i3 |= 8;
        }
        yfy0Var.g = this.h;
        if ((i2 & 16) == 16) {
            i3 |= 16;
        }
        yfy0Var.h = this.i;
        if ((i2 & 32) == 32) {
            this.t = Collections.unmodifiableList(this.t);
            i = this.d & (-33);
            this.d = i;
        } else {
            i = i2;
        }
        yfy0Var.i = this.t;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        yfy0Var.t = this.X;
        if ((i2 & 128) == 128) {
            i3 |= 64;
        }
        yfy0Var.X = this.Y;
        if ((i & 256) == 256) {
            this.Z = Collections.unmodifiableList(this.Z);
            i = this.d & (-257);
            this.d = i;
        }
        yfy0Var.Y = this.Z;
        if ((i & 512) == 512) {
            this.N0 = Collections.unmodifiableList(this.N0);
            i = this.d & (-513);
            this.d = i;
        }
        yfy0Var.Z = this.N0;
        if ((i & 1024) == 1024) {
            this.O0 = Collections.unmodifiableList(this.O0);
            i = this.d & (-1025);
            this.d = i;
        }
        yfy0Var.O0 = this.O0;
        if ((i & 2048) == 2048) {
            this.P0 = Collections.unmodifiableList(this.P0);
            i = this.d & (-2049);
            this.d = i;
        }
        yfy0Var.P0 = this.P0;
        if ((i2 & 4096) == 4096) {
            i3 |= 128;
        }
        yfy0Var.Q0 = this.Q0;
        if ((i & 8192) == 8192) {
            this.R0 = Collections.unmodifiableList(this.R0);
            i = this.d & (-8193);
            this.d = i;
        }
        yfy0Var.R0 = this.R0;
        if ((i2 & 16384) == 16384) {
            i3 |= 256;
        }
        yfy0Var.S0 = this.S0;
        if ((i & 32768) == 32768) {
            this.T0 = Collections.unmodifiableList(this.T0);
            i = (-32769) & this.d;
            this.d = i;
        }
        yfy0Var.T0 = this.T0;
        if ((i & 65536) == 65536) {
            this.U0 = Collections.unmodifiableList(this.U0);
            i = (-65537) & this.d;
            this.d = i;
        }
        yfy0Var.U0 = this.U0;
        if ((i & 131072) == 131072) {
            this.V0 = Collections.unmodifiableList(this.V0);
            this.d &= -131073;
        }
        yfy0Var.V0 = this.V0;
        yfy0Var.c = i3;
        return yfy0Var;
    }

    public final void i(yfy0 yfy0Var) {
        mfy0 mfy0Var;
        xgy0 xgy0Var;
        rgy0 rgy0Var;
        rgy0 rgy0Var2;
        if (yfy0Var == yfy0.Y0) {
            return;
        }
        int i = yfy0Var.c;
        if ((i & 1) == 1) {
            int i2 = yfy0Var.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = yfy0Var.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = yfy0Var.f;
            this.d = 4 | this.d;
            this.g = i4;
        }
        if ((i & 8) == 8) {
            rgy0 rgy0Var3 = yfy0Var.g;
            if ((this.d & 8) != 8 || (rgy0Var2 = this.h) == rgy0.U0) {
                this.h = rgy0Var3;
            } else {
                qgy0 qgy0VarP = rgy0.p(rgy0Var2);
                qgy0VarP.i(rgy0Var3);
                this.h = qgy0VarP.g();
            }
            this.d |= 8;
        }
        if ((yfy0Var.c & 16) == 16) {
            int i5 = yfy0Var.h;
            this.d = 16 | this.d;
            this.i = i5;
        }
        if (!yfy0Var.i.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = yfy0Var.i;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.t = new ArrayList(this.t);
                    this.d |= 32;
                }
                this.t.addAll(yfy0Var.i);
            }
        }
        if ((yfy0Var.c & 32) == 32) {
            rgy0 rgy0Var4 = yfy0Var.t;
            if ((this.d & 64) != 64 || (rgy0Var = this.X) == rgy0.U0) {
                this.X = rgy0Var4;
            } else {
                qgy0 qgy0VarP2 = rgy0.p(rgy0Var);
                qgy0VarP2.i(rgy0Var4);
                this.X = qgy0VarP2.g();
            }
            this.d |= 64;
        }
        if ((yfy0Var.c & 64) == 64) {
            int i6 = yfy0Var.X;
            this.d |= 128;
            this.Y = i6;
        }
        if (!yfy0Var.Y.isEmpty()) {
            if (this.Z.isEmpty()) {
                this.Z = yfy0Var.Y;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.Z = new ArrayList(this.Z);
                    this.d |= 256;
                }
                this.Z.addAll(yfy0Var.Y);
            }
        }
        if (!yfy0Var.Z.isEmpty()) {
            if (this.N0.isEmpty()) {
                this.N0 = yfy0Var.Z;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.N0 = new ArrayList(this.N0);
                    this.d |= 512;
                }
                this.N0.addAll(yfy0Var.Z);
            }
        }
        if (!yfy0Var.O0.isEmpty()) {
            if (this.O0.isEmpty()) {
                this.O0 = yfy0Var.O0;
                this.d &= -1025;
            } else {
                if ((this.d & 1024) != 1024) {
                    this.O0 = new ArrayList(this.O0);
                    this.d |= 1024;
                }
                this.O0.addAll(yfy0Var.O0);
            }
        }
        if (!yfy0Var.P0.isEmpty()) {
            if (this.P0.isEmpty()) {
                this.P0 = yfy0Var.P0;
                this.d &= -2049;
            } else {
                if ((this.d & 2048) != 2048) {
                    this.P0 = new ArrayList(this.P0);
                    this.d |= 2048;
                }
                this.P0.addAll(yfy0Var.P0);
            }
        }
        if ((yfy0Var.c & 128) == 128) {
            xgy0 xgy0Var2 = yfy0Var.Q0;
            if ((this.d & 4096) != 4096 || (xgy0Var = this.Q0) == xgy0.g) {
                this.Q0 = xgy0Var2;
            } else {
                dfy0 dfy0VarG = xgy0.g(xgy0Var);
                dfy0VarG.i(xgy0Var2);
                this.Q0 = dfy0VarG.g();
            }
            this.d |= 4096;
        }
        if (!yfy0Var.R0.isEmpty()) {
            if (this.R0.isEmpty()) {
                this.R0 = yfy0Var.R0;
                this.d &= -8193;
            } else {
                if ((this.d & 8192) != 8192) {
                    this.R0 = new ArrayList(this.R0);
                    this.d |= 8192;
                }
                this.R0.addAll(yfy0Var.R0);
            }
        }
        if ((yfy0Var.c & 256) == 256) {
            mfy0 mfy0Var2 = yfy0Var.S0;
            if ((this.d & 16384) != 16384 || (mfy0Var = this.S0) == mfy0.e) {
                this.S0 = mfy0Var2;
            } else {
                lfy0 lfy0VarG = mfy0.g(mfy0Var);
                lfy0VarG.j(mfy0Var2);
                this.S0 = lfy0VarG.e();
            }
            this.d |= 16384;
        }
        if (!yfy0Var.T0.isEmpty()) {
            if (this.T0.isEmpty()) {
                this.T0 = yfy0Var.T0;
                this.d &= -32769;
            } else {
                if ((this.d & 32768) != 32768) {
                    this.T0 = new ArrayList(this.T0);
                    this.d |= 32768;
                }
                this.T0.addAll(yfy0Var.T0);
            }
        }
        if (!yfy0Var.U0.isEmpty()) {
            if (this.U0.isEmpty()) {
                this.U0 = yfy0Var.U0;
                this.d &= -65537;
            } else {
                if ((this.d & 65536) != 65536) {
                    this.U0 = new ArrayList(this.U0);
                    this.d |= 65536;
                }
                this.U0.addAll(yfy0Var.U0);
            }
        }
        if (!yfy0Var.V0.isEmpty()) {
            if (this.V0.isEmpty()) {
                this.V0 = yfy0Var.V0;
                this.d &= -131073;
            } else {
                if ((this.d & 131072) != 131072) {
                    this.V0 = new ArrayList(this.V0);
                    this.d |= 131072;
                }
                this.V0.addAll(yfy0Var.V0);
            }
        }
        e(yfy0Var);
        this.a = this.a.c(yfy0Var.b);
    }
}
