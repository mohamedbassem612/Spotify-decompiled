package p;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yey0 extends xe40 implements u2j0 {
    public final /* synthetic */ byte b;
    public int c;
    public int d;
    public Object e;

    public /* synthetic */ yey0(byte b) {
        this.b = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        switch (this.b) {
            case 0:
                cfy0 cfy0VarE = e();
                if (cfy0VarE.isInitialized()) {
                    return cfy0VarE;
                }
                throw new UninitializedMessageException();
            default:
                ify0 ify0VarG = g();
                if (ify0VarG.isInitialized()) {
                    return ify0VarG;
                }
                throw new UninitializedMessageException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        cfy0 cfy0Var = null;
        ify0 ify0Var = null;
        try {
            switch (this.b) {
                case 0:
                    try {
                        cfy0.h.getClass();
                        h(new cfy0(mwgVar, vz00Var));
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        cfy0 cfy0Var2 = (cfy0) e.a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            cfy0Var = cfy0Var2;
                            if (cfy0Var != null) {
                                h(cfy0Var);
                            }
                            throw th;
                        }
                    }
                default:
                    try {
                        try {
                            ify0.h.getClass();
                            i(new ify0(mwgVar));
                            return this;
                        } catch (InvalidProtocolBufferException e2) {
                            ify0 ify0Var2 = (ify0) e2.a;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                ify0Var = ify0Var2;
                                if (ify0Var != null) {
                                    i(ify0Var);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (ify0Var != null) {
                            i(ify0Var);
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
                yey0 yey0Var = new yey0((byte) 0);
                yey0Var.e = bfy0.P0;
                yey0Var.h(e());
                return yey0Var;
            default:
                yey0 yey0Var2 = new yey0((byte) 1);
                yey0Var2.e = qhc.a;
                yey0Var2.i(g());
                return yey0Var2;
        }
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        switch (this.b) {
            case 0:
                h((cfy0) kf40Var);
                break;
            default:
                i((ify0) kf40Var);
                break;
        }
        return this;
    }

    public cfy0 e() {
        cfy0 cfy0Var = new cfy0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        cfy0Var.c = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        cfy0Var.d = (bfy0) this.e;
        cfy0Var.b = i2;
        return cfy0Var;
    }

    public ify0 g() {
        ify0 ify0Var = new ify0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ify0Var.c = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ify0Var.d = (qmd0) this.e;
        ify0Var.b = i2;
        return ify0Var;
    }

    public void h(cfy0 cfy0Var) {
        bfy0 bfy0Var;
        if (cfy0Var == cfy0.g) {
            return;
        }
        int i = cfy0Var.b;
        if ((i & 1) == 1) {
            int i2 = cfy0Var.c;
            this.c = 1 | this.c;
            this.d = i2;
        }
        if ((i & 2) == 2) {
            bfy0 bfy0Var2 = cfy0Var.d;
            if ((this.c & 2) != 2 || (bfy0Var = (bfy0) this.e) == bfy0.P0) {
                this.e = bfy0Var2;
            } else {
                zey0 zey0VarG = zey0.g();
                zey0VarG.h(bfy0Var);
                zey0VarG.h(bfy0Var2);
                this.e = zey0VarG.e();
            }
            this.c |= 2;
        }
        this.a = this.a.c(cfy0Var.a);
    }

    public void i(ify0 ify0Var) {
        if (ify0Var == ify0.g) {
            return;
        }
        int i = ify0Var.b;
        if ((i & 1) == 1) {
            int i2 = ify0Var.c;
            this.c = 1 | this.c;
            this.d = i2;
        }
        if ((i & 2) == 2) {
            qmd0 qmd0Var = ify0Var.d;
            qmd0Var.getClass();
            this.c = 2 | this.c;
            this.e = qmd0Var;
        }
        this.a = this.a.c(ify0Var.a);
    }
}
