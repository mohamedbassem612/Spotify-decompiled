package p;

import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h24 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h24(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return new h24((r24) this.c, (xu30) obj, lnmVar, (byte) 0);
            case 1:
                return new h24((vr20) this.c, (p811) obj, lnmVar, (byte) 1);
            case 2:
                return new h24((mxa1) obj, lnmVar);
            default:
                return new h24((mxa1) this.c, (ayh) obj, lnmVar, (byte) 3);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) throws Exception {
        Exception exc;
        h24 h24Var;
        switch (this.a) {
            case 0:
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    r24 r24Var = (r24) this.c;
                    g24 g24Var = new g24(r24Var, (byte) 0);
                    c6 c6Var = new c6((xu30) this.d, r24Var, (lnm) null, (byte) 24);
                    this.b = true;
                    if (c921.o(g24Var, c6Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 1:
                p811 p811Var = (p811) this.d;
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    vr20 vr20Var = (vr20) this.c;
                    jm jmVar = wqn1.a;
                    Object obj2 = p811Var.a;
                    if (obj2 == jmVar) {
                        obj2 = null;
                    }
                    this.b = true;
                    if (vr20Var.emit(obj2, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                p811Var.a = null;
                return rih1.a;
            case 2:
                WebView webView = d9n.a;
                if (!this.b) {
                    hm5.M(obj);
                    mxa1 mxa1Var = (mxa1) this.d;
                    ayh ayhVarA = sap1.a();
                    WebView webViewZ = mxa1.z(mxa1Var, ayhVarA);
                    try {
                        lhb lhbVar = new lhb(ayhVarA, (lnm) null, (byte) 7);
                        this.c = webViewZ;
                        this.b = true;
                        Object objM = rc2.M(15000L, lhbVar, this);
                        if (objM != webView) {
                            webView = webViewZ;
                            obj = objM;
                        }
                        return webView;
                    } catch (Exception e) {
                        exc = e;
                        webView = webViewZ;
                        webView.stopLoading();
                        webView.destroy();
                        throw exc;
                    }
                }
                webView = (WebView) this.c;
                try {
                    hm5.M(obj);
                } catch (Exception e2) {
                    exc = e2;
                    webView.stopLoading();
                    webView.destroy();
                    throw exc;
                }
                return webView;
            default:
                d9n d9nVar3 = d9n.a;
                boolean z3 = this.b;
                hm5.M(obj);
                if (z3) {
                    h24Var = this;
                } else {
                    mxa1 mxa1Var2 = (mxa1) this.c;
                    h2x0 h2x0Var = h2x0.Z0;
                    h24 h24Var2 = new h24(mxa1Var2, null);
                    this.b = true;
                    h24Var = this;
                    obj = h2x0Var.c(3, 100L, 1000L, 2.0d, h24Var2, h24Var);
                    if (obj == d9nVar3) {
                        return d9nVar3;
                    }
                }
                WebView webView2 = (WebView) obj;
                lqo1 lqo1VarD = mxa1.D((mxa1) h24Var.c);
                synchronized (lqo1VarD.a) {
                    lqo1VarD.b = webView2;
                    lqo1VarD.d = null;
                }
                ((ayh) h24Var.d).m0(webView2);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h24(mxa1 mxa1Var, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 2;
        this.d = mxa1Var;
    }
}
