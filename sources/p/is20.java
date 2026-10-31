package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class is20 implements lqw {
    public final /* synthetic */ byte a = 0;
    public llm b;
    public final pqw c;
    public Object d;
    public Object e;
    public volatile boolean f;
    public final /* synthetic */ h141 g;
    public final /* synthetic */ mqw h;

    public is20(js20 js20Var, Object obj, h141 h141Var) {
        vnd1 hurVar;
        is20 is20Var;
        js20 js20Var2;
        this.h = js20Var;
        this.g = h141Var;
        o7g1 o7g1VarA = h7g1.a();
        llm llmVarE = o7g1VarA == null ? smo1.e(flo1.l(op71.f(), js20Var.f)) : null;
        this.b = llmVarE;
        if (o7g1VarA != null) {
            hurVar = new vnd1(o7g1VarA, (byte) 13);
        } else {
            llmVarE.getClass();
            hurVar = new hur(llmVarE, (byte) 26);
        }
        this.c = hurVar;
        this.d = obj;
        if (!js20Var.d.a || this.f) {
            is20Var = this;
            js20Var2 = js20Var;
        } else {
            llm llmVarE2 = this.b;
            if (llmVarE2 == null) {
                llmVarE2 = smo1.e(flo1.l(op71.f(), js20Var.f));
                this.b = llmVarE2;
            }
            is20Var = this;
            js20Var2 = js20Var;
            fn31.T(llmVarE2, (o8n) null, 0, new ary(is20Var, (lnm) null, js20Var2, this, h141Var), 3);
        }
        if (!js20Var2.g) {
            is20Var.a(new t3x((Object) js20Var2, (Object) is20Var, (byte) 29));
            return;
        }
        zob1 zob1Var = (mr20) js20Var2.a.invoke(obj);
        Object value = zob1Var.getValue();
        is20Var.e = value;
        is20Var.b(js20Var2.c.invoke(obj, value));
        is20Var.a(new gs20(zob1Var, (byte) 0));
    }

    public void a(Function0 function0) {
        iu30 zf10Var = new zf10(this, this.h, (byte) 15);
        ytw0 ytw0Var = jfv.b;
        this.c.a(function0, zf10Var);
    }

    public synchronized void b(Object obj) {
        if (!u890.j(this.g.getState(), obj)) {
            this.g.e(obj);
        }
    }

    public synchronized void c(Object obj) {
        if (!u890.j(this.g.getState(), obj)) {
            this.g.e(obj);
        }
    }

    public final void d(Object obj) {
        Object objInvoke;
        Object objInvoke2;
        switch (this.a) {
            case 0:
                if (!this.f) {
                    this.d = obj;
                    js20 js20Var = this.h;
                    if (!js20Var.e || this.e == null) {
                        Object obj2 = this.e;
                        if (obj2 == null || (objInvoke = js20Var.c.invoke(obj, obj2)) == null) {
                            objInvoke = this.h.b.invoke(this.d);
                        }
                        b(objInvoke);
                    } else {
                        this.e = null;
                    }
                    js20 js20Var2 = this.h;
                    if (js20Var2.e) {
                        if (js20Var2.g) {
                            zob1 zob1Var = (mr20) js20Var2.a.invoke(obj);
                            Object value = zob1Var.getValue();
                            js20 js20Var3 = this.h;
                            this.e = value;
                            b(js20Var3.c.invoke(obj, value));
                            a(new gs20(zob1Var, (byte) 1));
                        } else {
                            a(new hs20(js20Var2, obj, (byte) 0));
                        }
                    }
                    js20 js20Var4 = this.h;
                    if (js20Var4.d.c && !this.f) {
                        llm llmVarE = this.b;
                        if (llmVarE == null) {
                            llmVarE = smo1.e(flo1.l(op71.f(), this.h.f));
                            this.b = llmVarE;
                        }
                        fn31.T(llmVarE, (o8n) null, 0, new lqv(this, (lnm) null, js20Var4, obj), 3);
                        break;
                    }
                }
                break;
            default:
                if (!this.f) {
                    this.d = obj;
                    poy0 poy0Var = (poy0) this.h;
                    if (!poy0Var.e || this.e == null) {
                        Object obj3 = this.e;
                        if (obj3 == null || (objInvoke2 = poy0Var.c.invoke(obj, obj3)) == null) {
                            objInvoke2 = ((poy0) this.h).b.invoke(this.d);
                        }
                        c(objInvoke2);
                    } else {
                        this.e = null;
                    }
                    poy0 poy0Var2 = (poy0) this.h;
                    if (poy0Var2.e) {
                        pqw pqwVar = this.c;
                        g1x0 g1x0Var = new g1x0(poy0Var2, this, (byte) 22);
                        j3y0 j3y0Var = new j3y0(this, poy0Var2, (byte) 2);
                        ytw0 ytw0Var = jfv.b;
                        pqwVar.a(g1x0Var, j3y0Var);
                    }
                    poy0 poy0Var3 = (poy0) this.h;
                    if (poy0Var3.d.c && !this.f) {
                        llm llmVarE2 = this.b;
                        if (llmVarE2 == null) {
                            llmVarE2 = smo1.e(flo1.l(op71.f(), ((poy0) this.h).f));
                            this.b = llmVarE2;
                        }
                        fn31.T(llmVarE2, (o8n) null, 0, new elu0(this, (lnm) null, poy0Var3, obj), 3);
                        break;
                    }
                }
                break;
        }
    }

    public final void dispose() {
        o8n o8nVar;
        faa0 faa0VarA;
        o8n o8nVar2;
        faa0 faa0VarA2;
        switch (this.a) {
            case 0:
                this.f = true;
                this.c.cancel();
                llm llmVar = this.b;
                if (llmVar != null && (o8nVar = llmVar.a) != null && (faa0VarA = o8nVar.A(fkj0.W0)) != null) {
                    faa0VarA.d((CancellationException) null);
                    break;
                }
                break;
            default:
                this.f = true;
                this.c.cancel();
                llm llmVar2 = this.b;
                if (llmVar2 != null && (o8nVar2 = llmVar2.a) != null && (faa0VarA2 = o8nVar2.A(fkj0.W0)) != null) {
                    faa0VarA2.d((CancellationException) null);
                    break;
                }
                break;
        }
    }

    public final void k(Object obj, tqw tqwVar) {
        switch (this.a) {
            case 0:
                js20 js20Var = this.h;
                if (js20Var.d.e) {
                    h141 h141Var = this.g;
                    if (!this.f) {
                        llm llmVarE = this.b;
                        if (llmVarE == null) {
                            llmVarE = smo1.e(flo1.l(op71.f(), this.h.f));
                            this.b = llmVarE;
                        }
                        fn31.T(llmVarE, (o8n) null, 0, new zn0(this, (lnm) null, js20Var, this, h141Var, obj, tqwVar, (byte) 12), 3);
                    }
                }
                break;
            default:
                poy0 poy0Var = (poy0) this.h;
                if (poy0Var.d.e) {
                    h141 h141Var2 = this.g;
                    if (!this.f) {
                        llm llmVarE2 = this.b;
                        if (llmVarE2 == null) {
                            llmVarE2 = smo1.e(flo1.l(op71.f(), ((poy0) this.h).f));
                            this.b = llmVarE2;
                        }
                        fn31.T(llmVarE2, (o8n) null, 0, new zn0(this, (lnm) null, poy0Var, this, h141Var2, obj, tqwVar, (byte) 16), 3);
                    }
                }
                break;
        }
    }

    public is20(poy0 poy0Var, Object obj, h141 h141Var) {
        vnd1 hurVar;
        is20 is20Var;
        poy0 poy0Var2;
        this.h = poy0Var;
        this.g = h141Var;
        o7g1 o7g1VarA = h7g1.a();
        llm llmVarE = o7g1VarA == null ? smo1.e(flo1.l(op71.f(), poy0Var.f)) : null;
        this.b = llmVarE;
        if (o7g1VarA != null) {
            hurVar = new vnd1(o7g1VarA, (byte) 13);
        } else {
            llmVarE.getClass();
            hurVar = new hur(llmVarE, (byte) 26);
        }
        this.c = hurVar;
        this.d = obj;
        if (!poy0Var.d.a || this.f) {
            is20Var = this;
            poy0Var2 = poy0Var;
        } else {
            llm llmVarE2 = this.b;
            if (llmVarE2 == null) {
                llmVarE2 = smo1.e(flo1.l(op71.f(), poy0Var.f));
                this.b = llmVarE2;
            }
            is20Var = this;
            poy0Var2 = poy0Var;
            fn31.T(llmVarE2, (o8n) null, 0, new sew0(is20Var, (lnm) null, poy0Var2, this, h141Var, (byte) 5), 3);
        }
        Function0 g1x0Var = new g1x0(poy0Var2, is20Var, (byte) 22);
        iu30 j3y0Var = new j3y0(is20Var, poy0Var2, (byte) 2);
        ytw0 ytw0Var = jfv.b;
        hurVar.a(g1x0Var, j3y0Var);
    }
}
