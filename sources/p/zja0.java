package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zja0 extends xe40 implements u2j0 {
    public int b;
    public List c;
    public List d;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        dka0 dka0VarE = e();
        if (dka0VarE.isInitialized()) {
            return dka0VarE;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        dka0 dka0Var = null;
        try {
            try {
                dka0.h.getClass();
                g(new dka0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                dka0 dka0Var2 = (dka0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    dka0Var = dka0Var2;
                    if (dka0Var != null) {
                        g(dka0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (dka0Var != null) {
                g(dka0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        zja0 zja0Var = new zja0();
        List list = Collections.EMPTY_LIST;
        zja0Var.c = list;
        zja0Var.d = list;
        zja0Var.g(e());
        return zja0Var;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        g((dka0) kf40Var);
        return this;
    }

    public final dka0 e() {
        dka0 dka0Var = new dka0(this);
        int i = this.b;
        if ((i & 1) == 1) {
            this.c = Collections.unmodifiableList(this.c);
            i = this.b & (-2);
            this.b = i;
        }
        dka0Var.b = this.c;
        if ((i & 2) == 2) {
            this.d = Collections.unmodifiableList(this.d);
            this.b &= -3;
        }
        dka0Var.c = this.d;
        return dka0Var;
    }

    public final void g(dka0 dka0Var) {
        if (dka0Var == dka0.g) {
            return;
        }
        if (!dka0Var.b.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c = dka0Var.b;
                this.b &= -2;
            } else {
                if ((this.b & 1) != 1) {
                    this.c = new ArrayList(this.c);
                    this.b |= 1;
                }
                this.c.addAll(dka0Var.b);
            }
        }
        if (!dka0Var.c.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = dka0Var.c;
                this.b &= -3;
            } else {
                if ((this.b & 2) != 2) {
                    this.d = new ArrayList(this.d);
                    this.b |= 2;
                }
                this.d.addAll(dka0Var.c);
            }
        }
        this.a = this.a.c(dka0Var.a);
    }
}
