package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ygy0 extends df40 {
    public List X;
    public bfy0 Y;
    public int d;
    public int e;
    public int f;
    public rgy0 g;
    public int h;
    public rgy0 i;
    public int t;

    public static ygy0 h() {
        ygy0 ygy0Var = new ygy0();
        rgy0 rgy0Var = rgy0.U0;
        ygy0Var.g = rgy0Var;
        ygy0Var.i = rgy0Var;
        ygy0Var.X = Collections.EMPTY_LIST;
        ygy0Var.Y = bfy0.P0;
        return ygy0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        zgy0 zgy0VarG = g();
        if (zgy0VarG.isInitialized()) {
            return zgy0VarG;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        zgy0 zgy0Var = null;
        try {
            try {
                zgy0.O0.getClass();
                i(new zgy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                zgy0 zgy0Var2 = (zgy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    zgy0Var = zgy0Var2;
                    if (zgy0Var != null) {
                        i(zgy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (zgy0Var != null) {
                i(zgy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        ygy0 ygy0VarH = h();
        ygy0VarH.i(g());
        return ygy0VarH;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        i((zgy0) kf40Var);
        return this;
    }

    public final zgy0 g() {
        zgy0 zgy0Var = new zgy0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        zgy0Var.d = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        zgy0Var.e = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        zgy0Var.f = this.g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        zgy0Var.g = this.h;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        zgy0Var.h = this.i;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        zgy0Var.i = this.t;
        if ((i & 64) == 64) {
            this.X = Collections.unmodifiableList(this.X);
            this.d &= -65;
        }
        zgy0Var.t = this.X;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        zgy0Var.X = this.Y;
        zgy0Var.c = i2;
        return zgy0Var;
    }

    public final void i(zgy0 zgy0Var) {
        bfy0 bfy0Var;
        rgy0 rgy0Var;
        rgy0 rgy0Var2;
        if (zgy0Var == zgy0.N0) {
            return;
        }
        int i = zgy0Var.c;
        if ((i & 1) == 1) {
            int i2 = zgy0Var.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = zgy0Var.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            rgy0 rgy0Var3 = zgy0Var.f;
            if ((this.d & 4) != 4 || (rgy0Var2 = this.g) == rgy0.U0) {
                this.g = rgy0Var3;
            } else {
                qgy0 qgy0VarP = rgy0.p(rgy0Var2);
                qgy0VarP.i(rgy0Var3);
                this.g = qgy0VarP.g();
            }
            this.d |= 4;
        }
        int i4 = zgy0Var.c;
        if ((i4 & 8) == 8) {
            int i5 = zgy0Var.g;
            this.d = 8 | this.d;
            this.h = i5;
        }
        if ((i4 & 16) == 16) {
            rgy0 rgy0Var4 = zgy0Var.h;
            if ((this.d & 16) != 16 || (rgy0Var = this.i) == rgy0.U0) {
                this.i = rgy0Var4;
            } else {
                qgy0 qgy0VarP2 = rgy0.p(rgy0Var);
                qgy0VarP2.i(rgy0Var4);
                this.i = qgy0VarP2.g();
            }
            this.d |= 16;
        }
        if ((zgy0Var.c & 32) == 32) {
            int i6 = zgy0Var.i;
            this.d = 32 | this.d;
            this.t = i6;
        }
        if (!zgy0Var.t.isEmpty()) {
            if (this.X.isEmpty()) {
                this.X = zgy0Var.t;
                this.d &= -65;
            } else {
                if ((this.d & 64) != 64) {
                    this.X = new ArrayList(this.X);
                    this.d |= 64;
                }
                this.X.addAll(zgy0Var.t);
            }
        }
        if ((zgy0Var.c & 64) == 64) {
            bfy0 bfy0Var2 = zgy0Var.X;
            if ((this.d & 128) != 128 || (bfy0Var = this.Y) == bfy0.P0) {
                this.Y = bfy0Var2;
            } else {
                zey0 zey0VarG = zey0.g();
                zey0VarG.h(bfy0Var);
                zey0VarG.h(bfy0Var2);
                this.Y = zey0VarG.e();
            }
            this.d |= 128;
        }
        e(zgy0Var);
        this.a = this.a.c(zgy0Var.b);
    }
}
