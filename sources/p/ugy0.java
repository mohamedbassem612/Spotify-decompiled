package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ugy0 extends df40 {
    public List X;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public vgy0 h;
    public List i;
    public List t;

    public static ugy0 h() {
        ugy0 ugy0Var = new ugy0();
        ugy0Var.h = vgy0.INV;
        List list = Collections.EMPTY_LIST;
        ugy0Var.i = list;
        ugy0Var.t = list;
        ugy0Var.X = list;
        return ugy0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        wgy0 wgy0VarG = g();
        if (wgy0VarG.isInitialized()) {
            return wgy0VarG;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        wgy0 wgy0Var = null;
        try {
            try {
                wgy0.O0.getClass();
                i(new wgy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                wgy0 wgy0Var2 = (wgy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    wgy0Var = wgy0Var2;
                    if (wgy0Var != null) {
                        i(wgy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (wgy0Var != null) {
                i(wgy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        ugy0 ugy0VarH = h();
        ugy0VarH.i(g());
        return ugy0VarH;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        i((wgy0) kf40Var);
        return this;
    }

    public final wgy0 g() {
        wgy0 wgy0Var = new wgy0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        wgy0Var.d = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        wgy0Var.e = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        wgy0Var.f = this.g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        wgy0Var.g = this.h;
        if ((i & 16) == 16) {
            this.i = Collections.unmodifiableList(this.i);
            i = this.d & (-17);
            this.d = i;
        }
        wgy0Var.h = this.i;
        if ((i & 32) == 32) {
            this.t = Collections.unmodifiableList(this.t);
            i = this.d & (-33);
            this.d = i;
        }
        wgy0Var.i = this.t;
        if ((i & 64) == 64) {
            this.X = Collections.unmodifiableList(this.X);
            this.d &= -65;
        }
        wgy0Var.X = this.X;
        wgy0Var.c = i2;
        return wgy0Var;
    }

    public final void i(wgy0 wgy0Var) {
        if (wgy0Var == wgy0.N0) {
            return;
        }
        int i = wgy0Var.c;
        if ((i & 1) == 1) {
            int i2 = wgy0Var.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = wgy0Var.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            boolean z = wgy0Var.f;
            this.d = 4 | this.d;
            this.g = z;
        }
        if ((i & 8) == 8) {
            vgy0 vgy0Var = wgy0Var.g;
            vgy0Var.getClass();
            this.d = 8 | this.d;
            this.h = vgy0Var;
        }
        if (!wgy0Var.h.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i = wgy0Var.h;
                this.d &= -17;
            } else {
                if ((this.d & 16) != 16) {
                    this.i = new ArrayList(this.i);
                    this.d |= 16;
                }
                this.i.addAll(wgy0Var.h);
            }
        }
        if (!wgy0Var.i.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = wgy0Var.i;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.t = new ArrayList(this.t);
                    this.d |= 32;
                }
                this.t.addAll(wgy0Var.i);
            }
        }
        if (!wgy0Var.X.isEmpty()) {
            if (this.X.isEmpty()) {
                this.X = wgy0Var.X;
                this.d &= -65;
            } else {
                if ((this.d & 64) != 64) {
                    this.X = new ArrayList(this.X);
                    this.d |= 64;
                }
                this.X.addAll(wgy0Var.X);
            }
        }
        e(wgy0Var);
        this.a = this.a.c(wgy0Var.b);
    }
}
