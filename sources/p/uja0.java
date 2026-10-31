package p;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uja0 extends xe40 implements u2j0 {
    public final /* synthetic */ byte b;
    public int c;
    public int d;
    public int e;

    public /* synthetic */ uja0(byte b) {
        this.b = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        switch (this.b) {
            case 0:
                vja0 vja0VarE = e();
                if (vja0VarE.isInitialized()) {
                    return vja0VarE;
                }
                throw new UninitializedMessageException();
            default:
                wja0 wja0VarG = g();
                if (wja0VarG.isInitialized()) {
                    return wja0VarG;
                }
                throw new UninitializedMessageException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        vja0 vja0Var = null;
        wja0 wja0Var = null;
        try {
            switch (this.b) {
                case 0:
                    try {
                        vja0.h.getClass();
                        h(new vja0(mwgVar));
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        vja0 vja0Var2 = (vja0) e.a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            vja0Var = vja0Var2;
                            if (vja0Var != null) {
                                h(vja0Var);
                            }
                            throw th;
                        }
                    }
                default:
                    try {
                        try {
                            wja0.h.getClass();
                            i(new wja0(mwgVar));
                            return this;
                        } catch (InvalidProtocolBufferException e2) {
                            wja0 wja0Var2 = (wja0) e2.a;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                wja0Var = wja0Var2;
                                if (wja0Var != null) {
                                    i(wja0Var);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (wja0Var != null) {
                            i(wja0Var);
                        }
                        throw th;
                    }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                uja0 uja0Var = new uja0((byte) 0);
                uja0Var.h(e());
                return uja0Var;
            default:
                uja0 uja0Var2 = new uja0((byte) 1);
                uja0Var2.i(g());
                return uja0Var2;
        }
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        switch (this.b) {
            case 0:
                h((vja0) kf40Var);
                break;
            default:
                i((wja0) kf40Var);
                break;
        }
        return this;
    }

    public vja0 e() {
        vja0 vja0Var = new vja0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        vja0Var.c = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        vja0Var.d = this.e;
        vja0Var.b = i2;
        return vja0Var;
    }

    public wja0 g() {
        wja0 wja0Var = new wja0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        wja0Var.c = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        wja0Var.d = this.e;
        wja0Var.b = i2;
        return wja0Var;
    }

    public void h(vja0 vja0Var) {
        if (vja0Var == vja0.g) {
            return;
        }
        int i = vja0Var.b;
        if ((i & 1) == 1) {
            int i2 = vja0Var.c;
            this.c = 1 | this.c;
            this.d = i2;
        }
        if ((i & 2) == 2) {
            int i3 = vja0Var.d;
            this.c = 2 | this.c;
            this.e = i3;
        }
        this.a = this.a.c(vja0Var.a);
    }

    public void i(wja0 wja0Var) {
        if (wja0Var == wja0.g) {
            return;
        }
        if (wja0Var.j()) {
            int i = wja0Var.c;
            this.c |= 1;
            this.d = i;
        }
        if (wja0Var.i()) {
            int i2 = wja0Var.d;
            this.c |= 2;
            this.e = i2;
        }
        this.a = this.a.c(wja0Var.a);
    }
}
