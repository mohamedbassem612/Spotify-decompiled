package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rtm0 {
    public final ttm0 a;
    public final q8n b;
    public final bpb1 c;
    public final xe01 d;
    public itm0 e;
    public poj0 f;
    public zau0 g;
    public long h;

    public rtm0(ttm0 ttm0Var, bs50 bs50Var) {
        this.a = ttm0Var;
        this.b = bs50Var;
        bpb1 bpb1VarB = gio1.b(oaw0.a);
        this.c = bpb1VarB;
        this.d = d5p1.h(bpb1VarB);
        this.e = htm0.a;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0162  */
    public final void a(etm0 etm0Var) {
        ktm0 ktm0Var;
        Object paw0Var;
        r091 r091Var;
        r091 r091Var2;
        itm0 itm0Var = this.e;
        boolean z = etm0Var instanceof atm0;
        gtm0 gtm0Var = gtm0.a;
        if (z) {
            jtm0 jtm0Var = ((atm0) etm0Var).a;
            ktm0Var = itm0Var.equals(gtm0Var) ? new ktm0(itm0Var, null) : new ktm0(new ftm0(jtm0Var, 1), new usm0(jtm0Var));
        } else if (etm0Var.equals(dtm0.a)) {
            ktm0Var = hqq0.F(itm0Var, true);
        } else if (etm0Var.equals(ysm0.a)) {
            if (itm0Var.equals(gtm0Var)) {
                ktm0Var = new ktm0(itm0Var, null);
            } else {
                ftm0 ftm0Var = itm0Var instanceof ftm0 ? (ftm0) itm0Var : null;
                ktm0Var = new ktm0(gtm0Var, new tsm0(ftm0Var != null ? Long.valueOf(ftm0Var.a.a) : null));
            }
        } else if (etm0Var instanceof btm0) {
            long j = ((btm0) etm0Var).a;
            ftm0 ftm0Var2 = itm0Var instanceof ftm0 ? (ftm0) itm0Var : null;
            if (ftm0Var2 == null) {
                ktm0Var = new ktm0(itm0Var, null);
            } else {
                jtm0 jtm0Var2 = ftm0Var2.a;
                ktm0Var = (jtm0Var2.a == j && ftm0Var2.b == 1) ? new ktm0(new ftm0(jtm0Var2, 2), new wsm0(jtm0Var2)) : new ktm0(itm0Var, null);
            }
        } else if (etm0Var instanceof ctm0) {
            ctm0 ctm0Var = (ctm0) etm0Var;
            ftm0 ftm0Var3 = itm0Var instanceof ftm0 ? (ftm0) itm0Var : null;
            if (ftm0Var3 == null) {
                ktm0Var = new ktm0(itm0Var, null);
            } else {
                jtm0 jtm0Var3 = ftm0Var3.a;
                int i = ftm0Var3.b;
                if (jtm0Var3.a != ctm0Var.a || i == 1) {
                    ktm0Var = new ktm0(itm0Var, null);
                } else {
                    k091 k091Var = ctm0Var.b;
                    if (u890.j(k091Var, j091.a)) {
                        ktm0Var = new ktm0(new ftm0(jtm0Var3, 2), null);
                    } else if (u890.j(k091Var, n091.a)) {
                        ktm0Var = new ktm0(new ftm0(jtm0Var3, 3), null);
                    } else if (k091Var instanceof k091) {
                        ktm0Var = (i == 2 && k091Var.a.equals(f091.a)) ? new ktm0(ftm0Var3, null) : hqq0.F(ftm0Var3, true);
                    } else {
                        if (!u890.j(k091Var, l091.a) && !u890.j(k091Var, m091.a)) {
                            eg.o();
                            return;
                        }
                        ktm0Var = new ktm0(ftm0Var3, null);
                    }
                }
            }
        } else {
            if (!(etm0Var instanceof zsm0)) {
                eg.o();
                return;
            }
            ftm0 ftm0Var4 = itm0Var instanceof ftm0 ? (ftm0) itm0Var : null;
            if (ftm0Var4 != null) {
                zsm0 zsm0Var = (zsm0) etm0Var;
                if (ftm0Var4.a.a == zsm0Var.a) {
                    ktm0Var = hqq0.F(itm0Var, zsm0Var.b);
                } else {
                    ktm0Var = new ktm0(itm0Var, null);
                }
            } else {
                ktm0Var = new ktm0(itm0Var, null);
            }
        }
        itm0 itm0Var2 = ktm0Var.a;
        this.e = itm0Var2;
        xsm0 xsm0Var = ktm0Var.b;
        boolean z2 = xsm0Var instanceof vsm0;
        ttm0 ttm0Var = this.a;
        if (z2) {
            vsm0 vsm0Var = (vsm0) xsm0Var;
            long j2 = vsm0Var.a;
            boolean z3 = vsm0Var.b;
            poj0 poj0Var = this.f;
            if (poj0Var != null) {
                if (((jtm0) poj0Var.b).a != j2) {
                    poj0Var = null;
                }
                if (poj0Var != null) {
                    this.f = null;
                    poj0Var.F(z3);
                }
            }
        } else if (xsm0Var instanceof tsm0) {
            Long l = ((tsm0) xsm0Var).a;
            if (l != null) {
                long jLongValue = l.longValue();
                poj0 poj0Var2 = this.f;
                if (poj0Var2 != null) {
                    if (((jtm0) poj0Var2.b).a != jLongValue) {
                        poj0Var2 = null;
                    }
                    if (poj0Var2 != null) {
                        this.f = null;
                        poj0Var2.F(true);
                    }
                }
            }
            zau0 zau0Var = this.g;
            this.g = null;
            if (zau0Var != null) {
                ttm0Var.b(zau0Var);
            }
        }
        if (u890.j(this.e, itm0Var2)) {
            itm0 itm0Var3 = this.e;
            if (itm0Var3.equals(htm0.a) || itm0Var3.equals(gtm0Var)) {
                paw0Var = oaw0.a;
            } else {
                if (!(itm0Var3 instanceof ftm0)) {
                    eg.o();
                    return;
                }
                ftm0 ftm0Var5 = (ftm0) itm0Var3;
                naw0 naw0Var = ftm0Var5.a.b;
                int iC = l1d.C(ftm0Var5.b);
                if (iC == 0) {
                    paw0Var = null;
                } else if (iC == 1) {
                    paw0Var = new paw0(naw0Var.a);
                } else {
                    if (iC != 2) {
                        eg.o();
                        return;
                    }
                    paw0Var = new qaw0(naw0Var.a);
                }
            }
            if (paw0Var != null) {
                this.c.m((Object) null, paw0Var);
            }
            if (!(xsm0Var instanceof usm0)) {
                if (xsm0Var instanceof wsm0) {
                    jtm0 jtm0Var4 = ((wsm0) xsm0Var).a;
                    r091 r091Var3 = this.f;
                    if (r091Var3 != null) {
                        long j3 = ((jtm0) ((poj0) r091Var3).b).a;
                        long j4 = jtm0Var4.a;
                        r091 r091Var4 = j3 == j4 ? r091Var3 : null;
                        if (r091Var4 == null || (r091Var = (r091) ((poj0) r091Var4).c) == null) {
                            return;
                        }
                        try {
                            c(r091Var4, r091Var);
                            for (Function0 function0 : p7h.M(new Function0[]{new dvg0(r091Var, jtm0Var4, (byte) 22), new qtm0(r091Var, (byte) 0), new qtm0(r091Var, (byte) 1), new dt90(this, r091Var4, r091Var, (byte) 26)})) {
                                if (!b(j4)) {
                                    return;
                                } else {
                                    function0.invoke();
                                }
                            }
                            return;
                        } catch (IllegalStateException unused) {
                            a(new zsm0(j4, true));
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            jtm0 jtm0Var5 = ((usm0) xsm0Var).a;
            long j5 = jtm0Var5.a;
            if (b(j5)) {
                poj0 poj0Var3 = this.f;
                if (poj0Var3 != null) {
                    smo1.p((llm) poj0Var3.d, (CancellationException) null);
                    r091Var2 = (r091) poj0Var3.c;
                    poj0Var3.c = null;
                } else {
                    r091Var2 = null;
                }
                poj0 poj0Var4 = new poj0(this, jtm0Var5, r091Var2);
                this.f = poj0Var4;
                try {
                    zau0 zau0VarC = this.g;
                    if (zau0VarC == null) {
                        zau0VarC = ttm0Var.c(true);
                        this.g = zau0VarC;
                    }
                    if (!((Boolean) zau0VarC.b.getValue()).booleanValue()) {
                        ttm0Var.a(zau0VarC);
                    }
                    if (b(j5)) {
                        r091 r091VarA = (r091) poj0Var4.c;
                        if (r091VarA == null) {
                            r091VarA = zau0VarC.a();
                        }
                        poj0Var4.c = r091VarA;
                        if (b(j5)) {
                            a((r091VarA == null || ((Boolean) r091VarA.e.b.getValue()).booleanValue() || ((Boolean) r091VarA.d.e.getValue()).booleanValue()) ? new zsm0(j5, true) : new btm0(j5));
                            return;
                        }
                        poj0 poj0Var5 = this.f;
                        if ((poj0Var5 != null ? (r091) poj0Var5.c : null) != r091VarA) {
                            poj0Var4.F(true);
                        }
                    }
                } catch (IllegalStateException unused2) {
                    a(new zsm0(j5, true));
                }
            }
        }
    }

    public final boolean b(long j) {
        itm0 itm0Var = this.e;
        ftm0 ftm0Var = itm0Var instanceof ftm0 ? (ftm0) itm0Var : null;
        return ftm0Var != null && ftm0Var.a.a == j;
    }

    public final void c(poj0 poj0Var, r091 r091Var) {
        zau0 zau0Var = this.g;
        if (zau0Var == null) {
            eg.m("Required value was null.");
            return;
        }
        jtm0 jtm0Var = (jtm0) poj0Var.b;
        llm llmVar = (llm) poj0Var.d;
        i091 i091Var = (i091) r091Var.g.getValue();
        fn31.T(llmVar, (o8n) null, 4, new ofk0(r091Var, zau0Var, this, jtm0Var, (lnm) null, (byte) 2), 1);
        fn31.T(llmVar, (o8n) null, 4, new ofk0(r091Var, jtm0Var, i091Var, this, (lnm) null, (byte) 3), 1);
    }
}
