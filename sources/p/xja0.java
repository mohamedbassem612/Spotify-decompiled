package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xja0 extends xe40 implements u2j0 {
    public final /* synthetic */ byte b;
    public int c;
    public Serializable d;
    public Object e;
    public kf40 f;
    public Serializable g;
    public Serializable h;

    public /* synthetic */ xja0(byte b) {
        this.b = b;
    }

    public static xja0 h() {
        xja0 xja0Var = new xja0((byte) 0);
        xja0Var.d = vja0.g;
        wja0 wja0Var = wja0.g;
        xja0Var.e = wja0Var;
        xja0Var.f = wja0Var;
        xja0Var.g = wja0Var;
        xja0Var.h = wja0Var;
        return xja0Var;
    }

    public static xja0 i() {
        xja0 xja0Var = new xja0((byte) 1);
        xja0Var.d = pfy0.RETURNS_CONSTANT;
        xja0Var.e = Collections.EMPTY_LIST;
        xja0Var.f = wfy0.Y;
        xja0Var.g = qfy0.AT_MOST_ONCE;
        xja0Var.h = ofy0.CONCLUSION_CONDITION;
        return xja0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        switch (this.b) {
            case 0:
                yja0 yja0VarE = e();
                if (yja0VarE.isInitialized()) {
                    return yja0VarE;
                }
                throw new UninitializedMessageException();
            default:
                rfy0 rfy0VarG = g();
                if (rfy0VarG.isInitialized()) {
                    return rfy0VarG;
                }
                throw new UninitializedMessageException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        yja0 yja0Var = null;
        rfy0 rfy0Var = null;
        try {
            switch (this.b) {
                case 0:
                    try {
                        yja0.X.getClass();
                        j(new yja0(mwgVar, vz00Var));
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        yja0 yja0Var2 = (yja0) e.a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            yja0Var = yja0Var2;
                            if (yja0Var != null) {
                                j(yja0Var);
                            }
                            throw th;
                        }
                    }
                default:
                    try {
                        try {
                            rfy0.X.getClass();
                            k(new rfy0(mwgVar, vz00Var));
                            return this;
                        } catch (InvalidProtocolBufferException e2) {
                            rfy0 rfy0Var2 = (rfy0) e2.a;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                rfy0Var = rfy0Var2;
                                if (rfy0Var != null) {
                                    k(rfy0Var);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (rfy0Var != null) {
                            k(rfy0Var);
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
                xja0 xja0VarH = h();
                xja0VarH.j(e());
                return xja0VarH;
            default:
                xja0 xja0VarI = i();
                xja0VarI.k(g());
                return xja0VarI;
        }
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        switch (this.b) {
            case 0:
                j((yja0) kf40Var);
                break;
            default:
                k((rfy0) kf40Var);
                break;
        }
        return this;
    }

    public yja0 e() {
        yja0 yja0Var = new yja0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        yja0Var.c = (vja0) this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        yja0Var.d = (wja0) this.e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        yja0Var.e = (wja0) this.f;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        yja0Var.f = (wja0) this.g;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        yja0Var.g = (wja0) this.h;
        yja0Var.b = i2;
        return yja0Var;
    }

    public rfy0 g() {
        rfy0 rfy0Var = new rfy0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        rfy0Var.c = (pfy0) this.d;
        if ((i & 2) == 2) {
            this.e = Collections.unmodifiableList((List) this.e);
            this.c &= -3;
        }
        rfy0Var.d = (List) this.e;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        rfy0Var.e = (wfy0) this.f;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        rfy0Var.f = (qfy0) this.g;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        rfy0Var.g = (ofy0) this.h;
        rfy0Var.b = i2;
        return rfy0Var;
    }

    public void j(yja0 yja0Var) {
        wja0 wja0Var;
        wja0 wja0Var2;
        wja0 wja0Var3;
        wja0 wja0Var4;
        vja0 vja0Var;
        if (yja0Var == yja0.t) {
            return;
        }
        if ((yja0Var.b & 1) == 1) {
            vja0 vja0Var2 = yja0Var.c;
            if ((this.c & 1) != 1 || (vja0Var = (vja0) this.d) == vja0.g) {
                this.d = vja0Var2;
            } else {
                uja0 uja0Var = new uja0((byte) 0);
                uja0Var.h(vja0Var);
                uja0Var.h(vja0Var2);
                this.d = uja0Var.e();
            }
            this.c |= 1;
        }
        if ((yja0Var.b & 2) == 2) {
            wja0 wja0Var5 = yja0Var.d;
            if ((this.c & 2) != 2 || (wja0Var4 = (wja0) this.e) == wja0.g) {
                this.e = wja0Var5;
            } else {
                uja0 uja0VarK = wja0.k(wja0Var4);
                uja0VarK.i(wja0Var5);
                this.e = uja0VarK.g();
            }
            this.c |= 2;
        }
        if (yja0Var.i()) {
            wja0 wja0Var6 = yja0Var.e;
            if ((this.c & 4) != 4 || (wja0Var3 = (wja0) this.f) == wja0.g) {
                this.f = wja0Var6;
            } else {
                uja0 uja0VarK2 = wja0.k(wja0Var3);
                uja0VarK2.i(wja0Var6);
                this.f = uja0VarK2.g();
            }
            this.c |= 4;
        }
        if ((yja0Var.b & 8) == 8) {
            wja0 wja0Var7 = yja0Var.f;
            if ((this.c & 8) != 8 || (wja0Var2 = (wja0) this.g) == wja0.g) {
                this.g = wja0Var7;
            } else {
                uja0 uja0VarK3 = wja0.k(wja0Var2);
                uja0VarK3.i(wja0Var7);
                this.g = uja0VarK3.g();
            }
            this.c |= 8;
        }
        if (yja0Var.h()) {
            wja0 wja0Var8 = yja0Var.g;
            if ((this.c & 16) != 16 || (wja0Var = (wja0) this.h) == wja0.g) {
                this.h = wja0Var8;
            } else {
                uja0 uja0VarK4 = wja0.k(wja0Var);
                uja0VarK4.i(wja0Var8);
                this.h = uja0VarK4.g();
            }
            this.c |= 16;
        }
        this.a = this.a.c(yja0Var.a);
    }

    public void k(rfy0 rfy0Var) {
        wfy0 wfy0Var;
        if (rfy0Var == rfy0.t) {
            return;
        }
        if ((rfy0Var.b & 1) == 1) {
            pfy0 pfy0Var = rfy0Var.c;
            pfy0Var.getClass();
            this.c = 1 | this.c;
            this.d = pfy0Var;
        }
        if (!rfy0Var.d.isEmpty()) {
            if (((List) this.e).isEmpty()) {
                this.e = rfy0Var.d;
                this.c &= -3;
            } else {
                if ((this.c & 2) != 2) {
                    this.e = new ArrayList((List) this.e);
                    this.c |= 2;
                }
                ((List) this.e).addAll(rfy0Var.d);
            }
        }
        if ((rfy0Var.b & 2) == 2) {
            wfy0 wfy0Var2 = rfy0Var.e;
            if ((this.c & 4) != 4 || (wfy0Var = (wfy0) this.f) == wfy0.Y) {
                this.f = wfy0Var2;
            } else {
                ufy0 ufy0VarG = ufy0.g();
                ufy0VarG.h(wfy0Var);
                ufy0VarG.h(wfy0Var2);
                this.f = ufy0VarG.e();
            }
            this.c |= 4;
        }
        if ((rfy0Var.b & 4) == 4) {
            qfy0 qfy0Var = rfy0Var.f;
            qfy0Var.getClass();
            this.c |= 8;
            this.g = qfy0Var;
        }
        if ((rfy0Var.b & 8) == 8) {
            ofy0 ofy0Var = rfy0Var.g;
            ofy0Var.getClass();
            this.c |= 16;
            this.h = ofy0Var;
        }
        this.a = this.a.c(rfy0Var.a);
    }
}
