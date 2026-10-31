package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qgy0 extends df40 {
    public rgy0 N0;
    public int O0;
    public rgy0 P0;
    public int Q0;
    public int R0;
    public List S0;
    public int X;
    public int Y;
    public int Z;
    public int d;
    public List e;
    public boolean f;
    public int g;
    public rgy0 h;
    public int i;
    public int t;

    public static qgy0 h() {
        qgy0 qgy0Var = new qgy0();
        List list = Collections.EMPTY_LIST;
        qgy0Var.e = list;
        rgy0 rgy0Var = rgy0.U0;
        qgy0Var.h = rgy0Var;
        qgy0Var.N0 = rgy0Var;
        qgy0Var.P0 = rgy0Var;
        qgy0Var.S0 = list;
        return qgy0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        rgy0 rgy0VarG = g();
        if (rgy0VarG.isInitialized()) {
            return rgy0VarG;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        rgy0 rgy0Var = null;
        try {
            try {
                rgy0.V0.getClass();
                i(new rgy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                rgy0 rgy0Var2 = (rgy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    rgy0Var = rgy0Var2;
                    if (rgy0Var != null) {
                        i(rgy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (rgy0Var != null) {
                i(rgy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        qgy0 qgy0VarH = h();
        qgy0VarH.i(g());
        return qgy0VarH;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        i((rgy0) kf40Var);
        return this;
    }

    public final rgy0 g() {
        int i;
        rgy0 rgy0Var = new rgy0(this);
        int i2 = this.d;
        if ((i2 & 1) == 1) {
            this.e = Collections.unmodifiableList(this.e);
            i = this.d & (-2);
            this.d = i;
        } else {
            i = i2;
        }
        rgy0Var.d = this.e;
        int i3 = (i2 & 2) != 2 ? 0 : 1;
        rgy0Var.e = this.f;
        if ((i2 & 4) == 4) {
            i3 |= 2;
        }
        rgy0Var.f = this.g;
        if ((i2 & 8) == 8) {
            i3 |= 4;
        }
        rgy0Var.g = this.h;
        if ((i2 & 16) == 16) {
            i3 |= 8;
        }
        rgy0Var.h = this.i;
        if ((i2 & 32) == 32) {
            i3 |= 16;
        }
        rgy0Var.i = this.t;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        rgy0Var.t = this.X;
        if ((i2 & 128) == 128) {
            i3 |= 64;
        }
        rgy0Var.X = this.Y;
        if ((i2 & 256) == 256) {
            i3 |= 128;
        }
        rgy0Var.Y = this.Z;
        if ((i2 & 512) == 512) {
            i3 |= 256;
        }
        rgy0Var.Z = this.N0;
        if ((i2 & 1024) == 1024) {
            i3 |= 512;
        }
        rgy0Var.N0 = this.O0;
        if ((i2 & 2048) == 2048) {
            i3 |= 1024;
        }
        rgy0Var.O0 = this.P0;
        if ((i2 & 4096) == 4096) {
            i3 |= 2048;
        }
        rgy0Var.P0 = this.Q0;
        if ((i2 & 8192) == 8192) {
            i3 |= 4096;
        }
        rgy0Var.Q0 = this.R0;
        if ((i & 16384) == 16384) {
            this.S0 = Collections.unmodifiableList(this.S0);
            this.d &= -16385;
        }
        rgy0Var.R0 = this.S0;
        rgy0Var.c = i3;
        return rgy0Var;
    }

    public final qgy0 i(rgy0 rgy0Var) {
        rgy0 rgy0Var2;
        rgy0 rgy0Var3;
        rgy0 rgy0Var4;
        rgy0 rgy0Var5 = rgy0.U0;
        if (rgy0Var == rgy0Var5) {
            return this;
        }
        if (!rgy0Var.d.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e = rgy0Var.d;
                this.d &= -2;
            } else {
                if ((this.d & 1) != 1) {
                    this.e = new ArrayList(this.e);
                    this.d |= 1;
                }
                this.e.addAll(rgy0Var.d);
            }
        }
        int i = rgy0Var.c;
        if ((i & 1) == 1) {
            boolean z = rgy0Var.e;
            this.d |= 2;
            this.f = z;
        }
        if ((i & 2) == 2) {
            int i2 = rgy0Var.f;
            this.d |= 4;
            this.g = i2;
        }
        if ((i & 4) == 4) {
            rgy0 rgy0Var6 = rgy0Var.g;
            if ((this.d & 8) != 8 || (rgy0Var4 = this.h) == rgy0Var5) {
                this.h = rgy0Var6;
            } else {
                qgy0 qgy0VarP = rgy0.p(rgy0Var4);
                qgy0VarP.i(rgy0Var6);
                this.h = qgy0VarP.g();
            }
            this.d |= 8;
        }
        if ((rgy0Var.c & 8) == 8) {
            int i3 = rgy0Var.h;
            this.d |= 16;
            this.i = i3;
        }
        if (rgy0Var.n()) {
            int i4 = rgy0Var.i;
            this.d |= 32;
            this.t = i4;
        }
        int i5 = rgy0Var.c;
        if ((i5 & 32) == 32) {
            int i6 = rgy0Var.t;
            this.d |= 64;
            this.X = i6;
        }
        if ((i5 & 64) == 64) {
            int i7 = rgy0Var.X;
            this.d |= 128;
            this.Y = i7;
        }
        if ((i5 & 128) == 128) {
            int i8 = rgy0Var.Y;
            this.d |= 256;
            this.Z = i8;
        }
        if ((i5 & 256) == 256) {
            rgy0 rgy0Var7 = rgy0Var.Z;
            if ((this.d & 512) != 512 || (rgy0Var3 = this.N0) == rgy0Var5) {
                this.N0 = rgy0Var7;
            } else {
                qgy0 qgy0VarP2 = rgy0.p(rgy0Var3);
                qgy0VarP2.i(rgy0Var7);
                this.N0 = qgy0VarP2.g();
            }
            this.d |= 512;
        }
        int i9 = rgy0Var.c;
        if ((i9 & 512) == 512) {
            int i10 = rgy0Var.N0;
            this.d |= 1024;
            this.O0 = i10;
        }
        if ((i9 & 1024) == 1024) {
            rgy0 rgy0Var8 = rgy0Var.O0;
            if ((this.d & 2048) != 2048 || (rgy0Var2 = this.P0) == rgy0Var5) {
                this.P0 = rgy0Var8;
            } else {
                qgy0 qgy0VarP3 = rgy0.p(rgy0Var2);
                qgy0VarP3.i(rgy0Var8);
                this.P0 = qgy0VarP3.g();
            }
            this.d |= 2048;
        }
        int i11 = rgy0Var.c;
        if ((i11 & 2048) == 2048) {
            int i12 = rgy0Var.P0;
            this.d |= 4096;
            this.Q0 = i12;
        }
        if ((i11 & 4096) == 4096) {
            int i13 = rgy0Var.Q0;
            this.d |= 8192;
            this.R0 = i13;
        }
        if (!rgy0Var.R0.isEmpty()) {
            if (this.S0.isEmpty()) {
                this.S0 = rgy0Var.R0;
                this.d &= -16385;
            } else {
                if ((this.d & 16384) != 16384) {
                    this.S0 = new ArrayList(this.S0);
                    this.d |= 16384;
                }
                this.S0.addAll(rgy0Var.R0);
            }
        }
        e(rgy0Var);
        this.a = this.a.c(rgy0Var.b);
        return this;
    }
}
