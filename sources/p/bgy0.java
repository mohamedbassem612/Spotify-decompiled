package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bgy0 extends df40 {
    public int d;
    public List e;
    public List f;
    public List g;
    public xgy0 h;
    public ehy0 i;

    public static bgy0 h() {
        bgy0 bgy0Var = new bgy0();
        List list = Collections.EMPTY_LIST;
        bgy0Var.e = list;
        bgy0Var.f = list;
        bgy0Var.g = list;
        bgy0Var.h = xgy0.g;
        bgy0Var.i = ehy0.e;
        return bgy0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        cgy0 cgy0VarG = g();
        if (cgy0VarG.isInitialized()) {
            return cgy0VarG;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        cgy0 cgy0Var = null;
        try {
            try {
                cgy0.Y.getClass();
                i(new cgy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                cgy0 cgy0Var2 = (cgy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cgy0Var = cgy0Var2;
                    if (cgy0Var != null) {
                        i(cgy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (cgy0Var != null) {
                i(cgy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        bgy0 bgy0VarH = h();
        bgy0VarH.i(g());
        return bgy0VarH;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        i((cgy0) kf40Var);
        return this;
    }

    public final cgy0 g() {
        int i;
        cgy0 cgy0Var = new cgy0(this);
        int i2 = this.d;
        if ((i2 & 1) == 1) {
            this.e = Collections.unmodifiableList(this.e);
            i = this.d & (-2);
            this.d = i;
        } else {
            i = i2;
        }
        cgy0Var.d = this.e;
        if ((i & 2) == 2) {
            this.f = Collections.unmodifiableList(this.f);
            i = this.d & (-3);
            this.d = i;
        }
        cgy0Var.e = this.f;
        if ((i & 4) == 4) {
            this.g = Collections.unmodifiableList(this.g);
            this.d &= -5;
        }
        cgy0Var.f = this.g;
        int i3 = (i2 & 8) != 8 ? 0 : 1;
        cgy0Var.g = this.h;
        if ((i2 & 16) == 16) {
            i3 |= 2;
        }
        cgy0Var.h = this.i;
        cgy0Var.c = i3;
        return cgy0Var;
    }

    public final void i(cgy0 cgy0Var) {
        ehy0 ehy0Var;
        xgy0 xgy0Var;
        if (cgy0Var == cgy0.X) {
            return;
        }
        if (!cgy0Var.d.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e = cgy0Var.d;
                this.d &= -2;
            } else {
                if ((this.d & 1) != 1) {
                    this.e = new ArrayList(this.e);
                    this.d |= 1;
                }
                this.e.addAll(cgy0Var.d);
            }
        }
        byte b = 2;
        if (!cgy0Var.e.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = cgy0Var.e;
                this.d &= -3;
            } else {
                if ((this.d & 2) != 2) {
                    this.f = new ArrayList(this.f);
                    this.d |= 2;
                }
                this.f.addAll(cgy0Var.e);
            }
        }
        if (!cgy0Var.f.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = cgy0Var.f;
                this.d &= -5;
            } else {
                if ((this.d & 4) != 4) {
                    this.g = new ArrayList(this.g);
                    this.d |= 4;
                }
                this.g.addAll(cgy0Var.f);
            }
        }
        if ((cgy0Var.c & 1) == 1) {
            xgy0 xgy0Var2 = cgy0Var.g;
            if ((this.d & 8) != 8 || (xgy0Var = this.h) == xgy0.g) {
                this.h = xgy0Var2;
            } else {
                dfy0 dfy0VarG = xgy0.g(xgy0Var);
                dfy0VarG.i(xgy0Var2);
                this.h = dfy0VarG.g();
            }
            this.d |= 8;
        }
        if ((cgy0Var.c & 2) == 2) {
            ehy0 ehy0Var2 = cgy0Var.h;
            if ((this.d & 16) != 16 || (ehy0Var = this.i) == ehy0.e) {
                this.i = ehy0Var2;
            } else {
                lfy0 lfy0Var = new lfy0(b);
                lfy0Var.d = Collections.EMPTY_LIST;
                lfy0Var.n(ehy0Var);
                lfy0Var.n(ehy0Var2);
                this.i = lfy0Var.i();
            }
            this.d |= 16;
        }
        e(cgy0Var);
        this.a = this.a.c(cgy0Var.b);
    }
}
