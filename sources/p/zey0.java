package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zey0 extends xe40 implements u2j0 {
    public List X;
    public int Y;
    public int Z;
    public int b;
    public afy0 c;
    public long d;
    public float e;
    public double f;
    public int g;
    public int h;
    public int i;
    public efy0 t;

    public static zey0 g() {
        zey0 zey0Var = new zey0();
        zey0Var.c = afy0.BYTE;
        zey0Var.t = efy0.g;
        zey0Var.X = Collections.EMPTY_LIST;
        return zey0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        bfy0 bfy0VarE = e();
        if (bfy0VarE.isInitialized()) {
            return bfy0VarE;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        bfy0 bfy0Var = null;
        try {
            try {
                bfy0.Q0.getClass();
                h(new bfy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                bfy0 bfy0Var2 = (bfy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    bfy0Var = bfy0Var2;
                    if (bfy0Var != null) {
                        h(bfy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (bfy0Var != null) {
                h(bfy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        zey0 zey0VarG = g();
        zey0VarG.h(e());
        return zey0VarG;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        h((bfy0) kf40Var);
        return this;
    }

    public final bfy0 e() {
        bfy0 bfy0Var = new bfy0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        bfy0Var.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        bfy0Var.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        bfy0Var.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        bfy0Var.f = this.f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        bfy0Var.g = this.g;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        bfy0Var.h = this.h;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        bfy0Var.i = this.i;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        bfy0Var.t = this.t;
        if ((i & 256) == 256) {
            this.X = Collections.unmodifiableList(this.X);
            this.b &= -257;
        }
        bfy0Var.X = this.X;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        bfy0Var.Y = this.Y;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        bfy0Var.Z = this.Z;
        bfy0Var.b = i2;
        return bfy0Var;
    }

    public final void h(bfy0 bfy0Var) {
        efy0 efy0Var;
        if (bfy0Var == bfy0.P0) {
            return;
        }
        if ((bfy0Var.b & 1) == 1) {
            afy0 afy0Var = bfy0Var.c;
            afy0Var.getClass();
            this.b = 1 | this.b;
            this.c = afy0Var;
        }
        int i = bfy0Var.b;
        if ((i & 2) == 2) {
            long j = bfy0Var.d;
            this.b |= 2;
            this.d = j;
        }
        if ((i & 4) == 4) {
            float f = bfy0Var.e;
            this.b = 4 | this.b;
            this.e = f;
        }
        if ((i & 8) == 8) {
            double d = bfy0Var.f;
            this.b |= 8;
            this.f = d;
        }
        if ((i & 16) == 16) {
            int i2 = bfy0Var.g;
            this.b = 16 | this.b;
            this.g = i2;
        }
        if ((i & 32) == 32) {
            int i3 = bfy0Var.h;
            this.b = 32 | this.b;
            this.h = i3;
        }
        if ((i & 64) == 64) {
            int i4 = bfy0Var.i;
            this.b = 64 | this.b;
            this.i = i4;
        }
        if ((i & 128) == 128) {
            efy0 efy0Var2 = bfy0Var.t;
            if ((this.b & 128) != 128 || (efy0Var = this.t) == efy0.g) {
                this.t = efy0Var2;
            } else {
                dfy0 dfy0Var = new dfy0((byte) 0);
                dfy0Var.d = Collections.EMPTY_LIST;
                dfy0Var.h(efy0Var);
                dfy0Var.h(efy0Var2);
                this.t = dfy0Var.e();
            }
            this.b |= 128;
        }
        if (!bfy0Var.X.isEmpty()) {
            if (this.X.isEmpty()) {
                this.X = bfy0Var.X;
                this.b &= -257;
            } else {
                if ((this.b & 256) != 256) {
                    this.X = new ArrayList(this.X);
                    this.b |= 256;
                }
                this.X.addAll(bfy0Var.X);
            }
        }
        int i5 = bfy0Var.b;
        if ((i5 & 256) == 256) {
            int i6 = bfy0Var.Y;
            this.b |= 512;
            this.Y = i6;
        }
        if ((i5 & 512) == 512) {
            int i7 = bfy0Var.Z;
            this.b |= 1024;
            this.Z = i7;
        }
        this.a = this.a.c(bfy0Var.a);
    }
}
