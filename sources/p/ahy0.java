package p;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ahy0 extends xe40 implements u2j0 {
    public int b;
    public int c;
    public int d;
    public bhy0 e;
    public int f;
    public int g;
    public chy0 h;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        dhy0 dhy0VarE = e();
        if (dhy0VarE.isInitialized()) {
            return dhy0VarE;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        dhy0 dhy0Var = null;
        try {
            try {
                dhy0.Y.getClass();
                g(new dhy0(mwgVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                dhy0 dhy0Var2 = (dhy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    dhy0Var = dhy0Var2;
                    if (dhy0Var != null) {
                        g(dhy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (dhy0Var != null) {
                g(dhy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        ahy0 ahy0Var = new ahy0();
        ahy0Var.e = bhy0.ERROR;
        ahy0Var.h = chy0.LANGUAGE_VERSION;
        ahy0Var.g(e());
        return ahy0Var;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        g((dhy0) kf40Var);
        return this;
    }

    public final dhy0 e() {
        dhy0 dhy0Var = new dhy0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        dhy0Var.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        dhy0Var.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        dhy0Var.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        dhy0Var.f = this.f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        dhy0Var.g = this.g;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        dhy0Var.h = this.h;
        dhy0Var.b = i2;
        return dhy0Var;
    }

    public final void g(dhy0 dhy0Var) {
        if (dhy0Var == dhy0.X) {
            return;
        }
        int i = dhy0Var.b;
        if ((i & 1) == 1) {
            int i2 = dhy0Var.c;
            this.b = 1 | this.b;
            this.c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = dhy0Var.d;
            this.b = 2 | this.b;
            this.d = i3;
        }
        if ((i & 4) == 4) {
            bhy0 bhy0Var = dhy0Var.e;
            bhy0Var.getClass();
            this.b = 4 | this.b;
            this.e = bhy0Var;
        }
        int i4 = dhy0Var.b;
        if ((i4 & 8) == 8) {
            int i5 = dhy0Var.f;
            this.b = 8 | this.b;
            this.f = i5;
        }
        if ((i4 & 16) == 16) {
            int i6 = dhy0Var.g;
            this.b = 16 | this.b;
            this.g = i6;
        }
        if ((i4 & 32) == 32) {
            chy0 chy0Var = dhy0Var.h;
            chy0Var.getClass();
            this.b = 32 | this.b;
            this.h = chy0Var;
        }
        this.a = this.a.c(dhy0Var.a);
    }
}
