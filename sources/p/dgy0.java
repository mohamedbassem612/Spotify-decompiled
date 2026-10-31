package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dgy0 extends df40 {
    public int d;
    public mgy0 e;
    public kgy0 f;
    public cgy0 g;
    public List h;

    public static dgy0 h() {
        dgy0 dgy0Var = new dgy0();
        dgy0Var.e = mgy0.e;
        dgy0Var.f = kgy0.e;
        dgy0Var.g = cgy0.X;
        dgy0Var.h = Collections.EMPTY_LIST;
        return dgy0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        egy0 egy0VarG = g();
        if (egy0VarG.isInitialized()) {
            return egy0VarG;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        egy0 egy0Var = null;
        try {
            try {
                egy0.X.getClass();
                i(new egy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                egy0 egy0Var2 = (egy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    egy0Var = egy0Var2;
                    if (egy0Var != null) {
                        i(egy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (egy0Var != null) {
                i(egy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        dgy0 dgy0VarH = h();
        dgy0VarH.i(g());
        return dgy0VarH;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        i((egy0) kf40Var);
        return this;
    }

    public final egy0 g() {
        egy0 egy0Var = new egy0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        egy0Var.d = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        egy0Var.e = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        egy0Var.f = this.g;
        if ((i & 8) == 8) {
            this.h = Collections.unmodifiableList(this.h);
            this.d &= -9;
        }
        egy0Var.g = this.h;
        egy0Var.c = i2;
        return egy0Var;
    }

    public final void i(egy0 egy0Var) {
        cgy0 cgy0Var;
        kgy0 kgy0Var;
        mgy0 mgy0Var;
        if (egy0Var == egy0.t) {
            return;
        }
        if ((egy0Var.c & 1) == 1) {
            mgy0 mgy0Var2 = egy0Var.d;
            if ((this.d & 1) != 1 || (mgy0Var = this.e) == mgy0.e) {
                this.e = mgy0Var2;
            } else {
                lfy0 lfy0Var = new lfy0((byte) 3);
                lfy0Var.d = jvb0.b;
                lfy0Var.l(mgy0Var);
                lfy0Var.l(mgy0Var2);
                this.e = lfy0Var.h();
            }
            this.d |= 1;
        }
        if ((egy0Var.c & 2) == 2) {
            kgy0 kgy0Var2 = egy0Var.e;
            if ((this.d & 2) != 2 || (kgy0Var = this.f) == kgy0.e) {
                this.f = kgy0Var2;
            } else {
                lfy0 lfy0Var2 = new lfy0((byte) 1);
                lfy0Var2.d = Collections.EMPTY_LIST;
                lfy0Var2.k(kgy0Var);
                lfy0Var2.k(kgy0Var2);
                this.f = lfy0Var2.g();
            }
            this.d |= 2;
        }
        if ((egy0Var.c & 4) == 4) {
            cgy0 cgy0Var2 = egy0Var.f;
            if ((this.d & 4) != 4 || (cgy0Var = this.g) == cgy0.X) {
                this.g = cgy0Var2;
            } else {
                bgy0 bgy0VarH = bgy0.h();
                bgy0VarH.i(cgy0Var);
                bgy0VarH.i(cgy0Var2);
                this.g = bgy0VarH.g();
            }
            this.d |= 4;
        }
        if (!egy0Var.g.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = egy0Var.g;
                this.d &= -9;
            } else {
                if ((this.d & 8) != 8) {
                    this.h = new ArrayList(this.h);
                    this.d |= 8;
                }
                this.h.addAll(egy0Var.g);
            }
        }
        e(egy0Var);
        this.a = this.a.c(egy0Var.b);
    }
}
