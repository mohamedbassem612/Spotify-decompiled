package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jfy0 extends df40 {
    public int d;
    public int e;
    public List f;
    public List g;
    public List h;
    public List i;

    public static jfy0 h() {
        jfy0 jfy0Var = new jfy0();
        jfy0Var.e = 6;
        List list = Collections.EMPTY_LIST;
        jfy0Var.f = list;
        jfy0Var.g = list;
        jfy0Var.h = list;
        jfy0Var.i = list;
        return jfy0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        kfy0 kfy0VarG = g();
        if (kfy0VarG.isInitialized()) {
            return kfy0VarG;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        kfy0 kfy0Var = null;
        try {
            try {
                kfy0.Y.getClass();
                i(new kfy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                kfy0 kfy0Var2 = (kfy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    kfy0Var = kfy0Var2;
                    if (kfy0Var != null) {
                        i(kfy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (kfy0Var != null) {
                i(kfy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        jfy0 jfy0VarH = h();
        jfy0VarH.i(g());
        return jfy0VarH;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        i((kfy0) kf40Var);
        return this;
    }

    public final kfy0 g() {
        kfy0 kfy0Var = new kfy0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        kfy0Var.d = this.e;
        if ((i & 2) == 2) {
            this.f = Collections.unmodifiableList(this.f);
            i = this.d & (-3);
            this.d = i;
        }
        kfy0Var.e = this.f;
        if ((i & 4) == 4) {
            this.g = Collections.unmodifiableList(this.g);
            i = this.d & (-5);
            this.d = i;
        }
        kfy0Var.f = this.g;
        if ((i & 8) == 8) {
            this.h = Collections.unmodifiableList(this.h);
            i = this.d & (-9);
            this.d = i;
        }
        kfy0Var.g = this.h;
        if ((i & 16) == 16) {
            this.i = Collections.unmodifiableList(this.i);
            this.d &= -17;
        }
        kfy0Var.h = this.i;
        kfy0Var.c = i2;
        return kfy0Var;
    }

    public final void i(kfy0 kfy0Var) {
        if (kfy0Var == kfy0.X) {
            return;
        }
        if ((kfy0Var.c & 1) == 1) {
            int i = kfy0Var.d;
            this.d = 1 | this.d;
            this.e = i;
        }
        if (!kfy0Var.e.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = kfy0Var.e;
                this.d &= -3;
            } else {
                if ((this.d & 2) != 2) {
                    this.f = new ArrayList(this.f);
                    this.d |= 2;
                }
                this.f.addAll(kfy0Var.e);
            }
        }
        if (!kfy0Var.f.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = kfy0Var.f;
                this.d &= -5;
            } else {
                if ((this.d & 4) != 4) {
                    this.g = new ArrayList(this.g);
                    this.d |= 4;
                }
                this.g.addAll(kfy0Var.f);
            }
        }
        if (!kfy0Var.g.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = kfy0Var.g;
                this.d &= -9;
            } else {
                if ((this.d & 8) != 8) {
                    this.h = new ArrayList(this.h);
                    this.d |= 8;
                }
                this.h.addAll(kfy0Var.g);
            }
        }
        if (!kfy0Var.h.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i = kfy0Var.h;
                this.d &= -17;
            } else {
                if ((this.d & 16) != 16) {
                    this.i = new ArrayList(this.i);
                    this.d |= 16;
                }
                this.i.addAll(kfy0Var.h);
            }
        }
        e(kfy0Var);
        this.a = this.a.c(kfy0Var.b);
    }
}
