package p;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hgy0 extends xe40 implements u2j0 {
    public int b;
    public int c;
    public int d;
    public igy0 e;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        jgy0 jgy0VarE = e();
        if (jgy0VarE.isInitialized()) {
            return jgy0VarE;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        jgy0 jgy0Var = null;
        try {
            try {
                jgy0.i.getClass();
                g(new jgy0(mwgVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                jgy0 jgy0Var2 = (jgy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jgy0Var = jgy0Var2;
                    if (jgy0Var != null) {
                        g(jgy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (jgy0Var != null) {
                g(jgy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        hgy0 hgy0Var = new hgy0();
        hgy0Var.c = -1;
        hgy0Var.e = igy0.PACKAGE;
        hgy0Var.g(e());
        return hgy0Var;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        g((jgy0) kf40Var);
        return this;
    }

    public final jgy0 e() {
        jgy0 jgy0Var = new jgy0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        jgy0Var.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        jgy0Var.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        jgy0Var.e = this.e;
        jgy0Var.b = i2;
        return jgy0Var;
    }

    public final void g(jgy0 jgy0Var) {
        if (jgy0Var == jgy0.h) {
            return;
        }
        int i = jgy0Var.b;
        if ((i & 1) == 1) {
            int i2 = jgy0Var.c;
            this.b = 1 | this.b;
            this.c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = jgy0Var.d;
            this.b = 2 | this.b;
            this.d = i3;
        }
        if ((i & 4) == 4) {
            igy0 igy0Var = jgy0Var.e;
            igy0Var.getClass();
            this.b = 4 | this.b;
            this.e = igy0Var;
        }
        this.a = this.a.c(jgy0Var.a);
    }
}
