package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ufy0 extends xe40 implements u2j0 {
    public int b;
    public int c;
    public int d;
    public vfy0 e;
    public rgy0 f;
    public int g;
    public List h;
    public List i;

    public static ufy0 g() {
        ufy0 ufy0Var = new ufy0();
        ufy0Var.e = vfy0.TRUE;
        ufy0Var.f = rgy0.U0;
        List list = Collections.EMPTY_LIST;
        ufy0Var.h = list;
        ufy0Var.i = list;
        return ufy0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        wfy0 wfy0VarE = e();
        if (wfy0VarE.isInitialized()) {
            return wfy0VarE;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        wfy0 wfy0Var = null;
        try {
            try {
                wfy0.Z.getClass();
                h(new wfy0(mwgVar, vz00Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                wfy0 wfy0Var2 = (wfy0) e.a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    wfy0Var = wfy0Var2;
                    if (wfy0Var != null) {
                        h(wfy0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (wfy0Var != null) {
                h(wfy0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        ufy0 ufy0VarG = g();
        ufy0VarG.h(e());
        return ufy0VarG;
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        h((wfy0) kf40Var);
        return this;
    }

    public final wfy0 e() {
        wfy0 wfy0Var = new wfy0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        wfy0Var.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        wfy0Var.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        wfy0Var.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        wfy0Var.f = this.f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        wfy0Var.g = this.g;
        if ((i & 32) == 32) {
            this.h = Collections.unmodifiableList(this.h);
            i = this.b & (-33);
            this.b = i;
        }
        wfy0Var.h = this.h;
        if ((i & 64) == 64) {
            this.i = Collections.unmodifiableList(this.i);
            this.b &= -65;
        }
        wfy0Var.i = this.i;
        wfy0Var.b = i2;
        return wfy0Var;
    }

    public final void h(wfy0 wfy0Var) {
        rgy0 rgy0Var;
        if (wfy0Var == wfy0.Y) {
            return;
        }
        int i = wfy0Var.b;
        if ((i & 1) == 1) {
            int i2 = wfy0Var.c;
            this.b = 1 | this.b;
            this.c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = wfy0Var.d;
            this.b = 2 | this.b;
            this.d = i3;
        }
        if ((i & 4) == 4) {
            vfy0 vfy0Var = wfy0Var.e;
            vfy0Var.getClass();
            this.b = 4 | this.b;
            this.e = vfy0Var;
        }
        if ((wfy0Var.b & 8) == 8) {
            rgy0 rgy0Var2 = wfy0Var.f;
            if ((this.b & 8) != 8 || (rgy0Var = this.f) == rgy0.U0) {
                this.f = rgy0Var2;
            } else {
                qgy0 qgy0VarP = rgy0.p(rgy0Var);
                qgy0VarP.i(rgy0Var2);
                this.f = qgy0VarP.g();
            }
            this.b |= 8;
        }
        if ((wfy0Var.b & 16) == 16) {
            int i4 = wfy0Var.g;
            this.b = 16 | this.b;
            this.g = i4;
        }
        if (!wfy0Var.h.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = wfy0Var.h;
                this.b &= -33;
            } else {
                if ((this.b & 32) != 32) {
                    this.h = new ArrayList(this.h);
                    this.b |= 32;
                }
                this.h.addAll(wfy0Var.h);
            }
        }
        if (!wfy0Var.i.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i = wfy0Var.i;
                this.b &= -65;
            } else {
                if ((this.b & 64) != 64) {
                    this.i = new ArrayList(this.i);
                    this.b |= 64;
                }
                this.i.addAll(wfy0Var.i);
            }
        }
        this.a = this.a.c(wfy0Var.a);
    }
}
