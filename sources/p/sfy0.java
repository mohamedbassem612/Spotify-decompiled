package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sfy0 extends df40 {
    public int d;
    public int e;
    public List f;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        tfy0 tfy0VarG = g();
        if (tfy0VarG.isInitialized()) {
            return tfy0VarG;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        tfy0 tfy0Var = null;
        try {
            try {
                tfy0.i.getClass();
                h(new tfy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                tfy0 tfy0Var2 = (tfy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    tfy0Var = tfy0Var2;
                    if (tfy0Var != null) {
                        h(tfy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (tfy0Var != null) {
                h(tfy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        sfy0 sfy0Var = new sfy0();
        sfy0Var.f = Collections.EMPTY_LIST;
        sfy0Var.h(g());
        return sfy0Var;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        h((tfy0) kf40Var);
        return this;
    }

    public final tfy0 g() {
        tfy0 tfy0Var = new tfy0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        tfy0Var.d = this.e;
        if ((i & 2) == 2) {
            this.f = Collections.unmodifiableList(this.f);
            this.d &= -3;
        }
        tfy0Var.e = this.f;
        tfy0Var.c = i2;
        return tfy0Var;
    }

    public final void h(tfy0 tfy0Var) {
        if (tfy0Var == tfy0.h) {
            return;
        }
        if ((tfy0Var.c & 1) == 1) {
            int i = tfy0Var.d;
            this.d = 1 | this.d;
            this.e = i;
        }
        if (!tfy0Var.e.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = tfy0Var.e;
                this.d &= -3;
            } else {
                if ((this.d & 2) != 2) {
                    this.f = new ArrayList(this.f);
                    this.d |= 2;
                }
                this.f.addAll(tfy0Var.e);
            }
        }
        e(tfy0Var);
        this.a = this.a.c(tfy0Var.b);
    }
}
