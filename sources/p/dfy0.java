package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dfy0 extends xe40 implements u2j0 {
    public final /* synthetic */ byte b;
    public int c;
    public List d;
    public int e;

    public /* synthetic */ dfy0(byte b) {
        this.b = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        switch (this.b) {
            case 0:
                efy0 efy0VarE = e();
                if (efy0VarE.isInitialized()) {
                    return efy0VarE;
                }
                throw new UninitializedMessageException();
            default:
                xgy0 xgy0VarG = g();
                if (xgy0VarG.isInitialized()) {
                    return xgy0VarG;
                }
                throw new UninitializedMessageException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        efy0 efy0Var = null;
        xgy0 xgy0Var = null;
        try {
            switch (this.b) {
                case 0:
                    try {
                        efy0.h.getClass();
                        h(new efy0(mwgVar, vz00Var));
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        efy0 efy0Var2 = (efy0) e.a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            efy0Var = efy0Var2;
                            if (efy0Var != null) {
                                h(efy0Var);
                            }
                            throw th;
                        }
                    }
                default:
                    try {
                        try {
                            xgy0.h.getClass();
                            i(new xgy0(mwgVar, vz00Var));
                            return this;
                        } catch (InvalidProtocolBufferException e2) {
                            xgy0 xgy0Var2 = (xgy0) e2.a;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                xgy0Var = xgy0Var2;
                                if (xgy0Var != null) {
                                    i(xgy0Var);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (xgy0Var != null) {
                            i(xgy0Var);
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
                dfy0 dfy0Var = new dfy0((byte) 0);
                dfy0Var.d = Collections.EMPTY_LIST;
                dfy0Var.h(e());
                return dfy0Var;
            default:
                dfy0 dfy0Var2 = new dfy0((byte) 1);
                dfy0Var2.d = Collections.EMPTY_LIST;
                dfy0Var2.e = -1;
                dfy0Var2.i(g());
                return dfy0Var2;
        }
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        switch (this.b) {
            case 0:
                h((efy0) kf40Var);
                break;
            default:
                i((xgy0) kf40Var);
                break;
        }
        return this;
    }

    public efy0 e() {
        efy0 efy0Var = new efy0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        efy0Var.c = this.e;
        if ((i & 2) == 2) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -3;
        }
        efy0Var.d = this.d;
        efy0Var.b = i2;
        return efy0Var;
    }

    public xgy0 g() {
        xgy0 xgy0Var = new xgy0(this);
        int i = this.c;
        if ((i & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        xgy0Var.c = this.d;
        int i2 = (i & 2) != 2 ? 0 : 1;
        xgy0Var.d = this.e;
        xgy0Var.b = i2;
        return xgy0Var;
    }

    public void h(efy0 efy0Var) {
        if (efy0Var == efy0.g) {
            return;
        }
        if ((efy0Var.b & 1) == 1) {
            int i = efy0Var.c;
            this.c = 1 | this.c;
            this.e = i;
        }
        if (!efy0Var.d.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = efy0Var.d;
                this.c &= -3;
            } else {
                if ((this.c & 2) != 2) {
                    this.d = new ArrayList(this.d);
                    this.c |= 2;
                }
                this.d.addAll(efy0Var.d);
            }
        }
        this.a = this.a.c(efy0Var.a);
    }

    public void i(xgy0 xgy0Var) {
        if (xgy0Var == xgy0.g) {
            return;
        }
        if (!xgy0Var.c.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = xgy0Var.c;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(xgy0Var.c);
            }
        }
        if ((xgy0Var.b & 1) == 1) {
            int i = xgy0Var.d;
            this.c |= 2;
            this.e = i;
        }
        this.a = this.a.c(xgy0Var.a);
    }
}
