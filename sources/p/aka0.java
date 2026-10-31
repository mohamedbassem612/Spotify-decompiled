package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aka0 extends xe40 implements u2j0 {
    public int b;
    public int c;
    public int d;
    public Object e;
    public bka0 f;
    public List g;
    public List h;

    public static aka0 g() {
        aka0 aka0Var = new aka0();
        aka0Var.c = 1;
        aka0Var.e = "";
        aka0Var.f = bka0.NONE;
        List list = Collections.EMPTY_LIST;
        aka0Var.g = list;
        aka0Var.h = list;
        return aka0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        cka0 cka0VarE = e();
        if (cka0VarE.isInitialized()) {
            return cka0VarE;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        cka0 cka0Var = null;
        try {
            try {
                cka0.N0.getClass();
                h(new cka0(mwgVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                cka0 cka0Var2 = (cka0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cka0Var = cka0Var2;
                    if (cka0Var != null) {
                        h(cka0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (cka0Var != null) {
                h(cka0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        aka0 aka0VarG = g();
        aka0VarG.h(e());
        return aka0VarG;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        h((cka0) kf40Var);
        return this;
    }

    public final cka0 e() {
        cka0 cka0Var = new cka0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        cka0Var.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        cka0Var.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        cka0Var.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        cka0Var.f = this.f;
        if ((i & 16) == 16) {
            this.g = Collections.unmodifiableList(this.g);
            i = this.b & (-17);
            this.b = i;
        }
        cka0Var.g = this.g;
        if ((i & 32) == 32) {
            this.h = Collections.unmodifiableList(this.h);
            this.b &= -33;
        }
        cka0Var.i = this.h;
        cka0Var.b = i2;
        return cka0Var;
    }

    public final void h(cka0 cka0Var) {
        if (cka0Var == cka0.Z) {
            return;
        }
        int i = cka0Var.b;
        if ((i & 1) == 1) {
            int i2 = cka0Var.c;
            this.b = 1 | this.b;
            this.c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = cka0Var.d;
            this.b = 2 | this.b;
            this.d = i3;
        }
        if ((i & 4) == 4) {
            this.b |= 4;
            this.e = cka0Var.e;
        }
        if ((i & 8) == 8) {
            bka0 bka0Var = cka0Var.f;
            bka0Var.getClass();
            this.b = 8 | this.b;
            this.f = bka0Var;
        }
        if (!cka0Var.g.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = cka0Var.g;
                this.b &= -17;
            } else {
                if ((this.b & 16) != 16) {
                    this.g = new ArrayList(this.g);
                    this.b |= 16;
                }
                this.g.addAll(cka0Var.g);
            }
        }
        if (!cka0Var.i.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = cka0Var.i;
                this.b &= -33;
            } else {
                if ((this.b & 32) != 32) {
                    this.h = new ArrayList(this.h);
                    this.b |= 32;
                }
                this.h.addAll(cka0Var.i);
            }
        }
        this.a = this.a.c(cka0Var.a);
    }
}
