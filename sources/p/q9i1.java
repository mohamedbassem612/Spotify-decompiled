package p;

import java.io.File;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q9i1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ w9i1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9i1(w9i1 w9i1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = w9i1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        w9i1 w9i1Var = this.d;
        switch (b) {
            case 0:
                q9i1 q9i1Var = new q9i1(w9i1Var, lnmVar, (byte) 0);
                q9i1Var.c = obj;
                return q9i1Var;
            case 1:
                q9i1 q9i1Var2 = new q9i1(w9i1Var, lnmVar, (byte) 1);
                q9i1Var2.c = obj;
                return q9i1Var2;
            case 2:
                q9i1 q9i1Var3 = new q9i1(w9i1Var, lnmVar, (byte) 2);
                q9i1Var3.c = obj;
                return q9i1Var3;
            default:
                q9i1 q9i1Var4 = new q9i1(w9i1Var, lnmVar, (byte) 3);
                q9i1Var4.c = obj;
                return q9i1Var4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Boolean m231Var;
        File file;
        String m231Var2;
        Object objS;
        File m231Var3;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        w9i1 w9i1Var = this.d;
        File m231Var4 = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        rv3 rv3Var = w9i1Var.Q0;
                        this.c = null;
                        this.b = true;
                        obj = rv3Var.invoke(this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = (Boolean) obj;
                    m231Var.getClass();
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                return m231Var instanceof m231 ? Boolean.FALSE : m231Var;
            case 1:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        if (w9i1Var.U0) {
                            vgr vgrVar = w9i1Var.b;
                            boolean z3 = w9i1Var.S0;
                            this.c = null;
                            this.b = true;
                            obj = vgrVar.q(z3, this);
                            if (obj == d9nVar) {
                                return d9nVar;
                            }
                        }
                        if (!(m231Var4 instanceof m231) && (file = m231Var4) != null) {
                            w9i1Var.b0(file);
                        }
                        return new e331(m231Var4);
                    }
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    m231Var4 = (File) obj;
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    m231Var4 = new m231(th2);
                }
                if (!(m231Var4 instanceof m231)) {
                    w9i1Var.b0(file);
                }
                return new e331(m231Var4);
            case 2:
                boolean z4 = this.b;
                try {
                    if (!z4) {
                        hm5.M(obj);
                        vgr vgrVar2 = w9i1Var.b;
                        String str = w9i1Var.O0;
                        boolean z5 = w9i1Var.S0;
                        if (!z5) {
                            str = null;
                        }
                        this.c = null;
                        this.b = true;
                        objS = vgrVar2.s(str, z5, z5, this);
                        if (objS == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objS = ((e331) obj).a;
                    }
                    hm5.M(objS);
                    m231Var2 = (String) objS;
                    break;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th3) {
                    m231Var2 = new m231(th3);
                }
                return new e331(m231Var2);
            default:
                boolean z6 = this.b;
                try {
                    if (!z6) {
                        hm5.M(obj);
                        vgr vgrVar3 = w9i1Var.b;
                        boolean z7 = w9i1Var.S0;
                        this.c = null;
                        this.b = true;
                        obj = vgrVar3.q(z7, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z6) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var3 = (File) obj;
                    break;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th4) {
                    m231Var3 = new m231(th4);
                }
                boolean z8 = m231Var3 instanceof m231;
                if (!z8) {
                    w9i1Var.b0(m231Var3);
                }
                return Boolean.valueOf(z8);
        }
    }
}
