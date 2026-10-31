package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sgy0 extends df40 {
    public List N0;
    public int X;
    public List Y;
    public List Z;
    public int d;
    public int e;
    public int f;
    public List g;
    public rgy0 h;
    public int i;
    public rgy0 t;

    public static sgy0 h() {
        sgy0 sgy0Var = new sgy0();
        sgy0Var.e = 6;
        List list = Collections.EMPTY_LIST;
        sgy0Var.g = list;
        rgy0 rgy0Var = rgy0.U0;
        sgy0Var.h = rgy0Var;
        sgy0Var.t = rgy0Var;
        sgy0Var.Y = list;
        sgy0Var.Z = list;
        sgy0Var.N0 = list;
        return sgy0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        tgy0 tgy0VarG = g();
        if (tgy0VarG.isInitialized()) {
            return tgy0VarG;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        tgy0 tgy0Var = null;
        try {
            try {
                tgy0.Q0.getClass();
                i(new tgy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                tgy0 tgy0Var2 = (tgy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    tgy0Var = tgy0Var2;
                    if (tgy0Var != null) {
                        i(tgy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (tgy0Var != null) {
                i(tgy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        sgy0 sgy0VarH = h();
        sgy0VarH.i(g());
        return sgy0VarH;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        i((tgy0) kf40Var);
        return this;
    }

    public final tgy0 g() {
        int i;
        tgy0 tgy0Var = new tgy0(this);
        int i2 = this.d;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        tgy0Var.d = this.e;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        tgy0Var.e = this.f;
        if ((i2 & 4) == 4) {
            this.g = Collections.unmodifiableList(this.g);
            i = this.d & (-5);
            this.d = i;
        } else {
            i = i2;
        }
        tgy0Var.f = this.g;
        if ((i2 & 8) == 8) {
            i3 |= 4;
        }
        tgy0Var.g = this.h;
        if ((i2 & 16) == 16) {
            i3 |= 8;
        }
        tgy0Var.h = this.i;
        if ((i2 & 32) == 32) {
            i3 |= 16;
        }
        tgy0Var.i = this.t;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        tgy0Var.t = this.X;
        if ((i & 128) == 128) {
            this.Y = Collections.unmodifiableList(this.Y);
            i = this.d & (-129);
            this.d = i;
        }
        tgy0Var.X = this.Y;
        if ((i & 256) == 256) {
            this.Z = Collections.unmodifiableList(this.Z);
            i = this.d & (-257);
            this.d = i;
        }
        tgy0Var.Y = this.Z;
        if ((i & 512) == 512) {
            this.N0 = Collections.unmodifiableList(this.N0);
            this.d &= -513;
        }
        tgy0Var.Z = this.N0;
        tgy0Var.c = i3;
        return tgy0Var;
    }

    public final void i(tgy0 tgy0Var) {
        rgy0 rgy0Var;
        rgy0 rgy0Var2;
        if (tgy0Var == tgy0.P0) {
            return;
        }
        int i = tgy0Var.c;
        if ((i & 1) == 1) {
            int i2 = tgy0Var.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = tgy0Var.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if (!tgy0Var.f.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = tgy0Var.f;
                this.d &= -5;
            } else {
                if ((this.d & 4) != 4) {
                    this.g = new ArrayList(this.g);
                    this.d |= 4;
                }
                this.g.addAll(tgy0Var.f);
            }
        }
        if ((tgy0Var.c & 4) == 4) {
            rgy0 rgy0Var3 = tgy0Var.g;
            if ((this.d & 8) != 8 || (rgy0Var2 = this.h) == rgy0.U0) {
                this.h = rgy0Var3;
            } else {
                qgy0 qgy0VarP = rgy0.p(rgy0Var2);
                qgy0VarP.i(rgy0Var3);
                this.h = qgy0VarP.g();
            }
            this.d |= 8;
        }
        int i4 = tgy0Var.c;
        if ((i4 & 8) == 8) {
            int i5 = tgy0Var.h;
            this.d |= 16;
            this.i = i5;
        }
        if ((i4 & 16) == 16) {
            rgy0 rgy0Var4 = tgy0Var.i;
            if ((this.d & 32) != 32 || (rgy0Var = this.t) == rgy0.U0) {
                this.t = rgy0Var4;
            } else {
                qgy0 qgy0VarP2 = rgy0.p(rgy0Var);
                qgy0VarP2.i(rgy0Var4);
                this.t = qgy0VarP2.g();
            }
            this.d |= 32;
        }
        if ((tgy0Var.c & 32) == 32) {
            int i6 = tgy0Var.t;
            this.d |= 64;
            this.X = i6;
        }
        if (!tgy0Var.X.isEmpty()) {
            if (this.Y.isEmpty()) {
                this.Y = tgy0Var.X;
                this.d &= -129;
            } else {
                if ((this.d & 128) != 128) {
                    this.Y = new ArrayList(this.Y);
                    this.d |= 128;
                }
                this.Y.addAll(tgy0Var.X);
            }
        }
        if (!tgy0Var.Y.isEmpty()) {
            if (this.Z.isEmpty()) {
                this.Z = tgy0Var.Y;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.Z = new ArrayList(this.Z);
                    this.d |= 256;
                }
                this.Z.addAll(tgy0Var.Y);
            }
        }
        if (!tgy0Var.Z.isEmpty()) {
            if (this.N0.isEmpty()) {
                this.N0 = tgy0Var.Z;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.N0 = new ArrayList(this.N0);
                    this.d |= 512;
                }
                this.N0.addAll(tgy0Var.Z);
            }
        }
        e(tgy0Var);
        this.a = this.a.c(tgy0Var.b);
    }
}
