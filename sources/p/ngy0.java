package p;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ngy0 extends xe40 implements u2j0 {
    public int b;
    public ogy0 c;
    public rgy0 d;
    public int e;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        pgy0 pgy0VarE = e();
        if (pgy0VarE.isInitialized()) {
            return pgy0VarE;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        pgy0 pgy0Var = null;
        try {
            try {
                pgy0.i.getClass();
                g(new pgy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                pgy0 pgy0Var2 = (pgy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    pgy0Var = pgy0Var2;
                    if (pgy0Var != null) {
                        g(pgy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (pgy0Var != null) {
                g(pgy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        ngy0 ngy0Var = new ngy0();
        ngy0Var.c = ogy0.INV;
        ngy0Var.d = rgy0.U0;
        ngy0Var.g(e());
        return ngy0Var;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        g((pgy0) kf40Var);
        return this;
    }

    public final pgy0 e() {
        pgy0 pgy0Var = new pgy0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        pgy0Var.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        pgy0Var.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        pgy0Var.e = this.e;
        pgy0Var.b = i2;
        return pgy0Var;
    }

    public final void g(pgy0 pgy0Var) {
        rgy0 rgy0Var;
        if (pgy0Var == pgy0.h) {
            return;
        }
        if ((pgy0Var.b & 1) == 1) {
            ogy0 ogy0Var = pgy0Var.c;
            ogy0Var.getClass();
            this.b = 1 | this.b;
            this.c = ogy0Var;
        }
        if ((pgy0Var.b & 2) == 2) {
            rgy0 rgy0Var2 = pgy0Var.d;
            if ((this.b & 2) != 2 || (rgy0Var = this.d) == rgy0.U0) {
                this.d = rgy0Var2;
            } else {
                qgy0 qgy0VarP = rgy0.p(rgy0Var);
                qgy0VarP.i(rgy0Var2);
                this.d = qgy0VarP.g();
            }
            this.b |= 2;
        }
        if ((pgy0Var.b & 4) == 4) {
            int i = pgy0Var.e;
            this.b = 4 | this.b;
            this.e = i;
        }
        this.a = this.a.c(pgy0Var.a);
    }
}
