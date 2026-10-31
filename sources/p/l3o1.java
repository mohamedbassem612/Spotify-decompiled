package p;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.recaptcha.internal.zzhm;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l3o1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3o1(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new l3o1((p3o1) obj2, lnmVar, (byte) 0);
            case 1:
                return new l3o1((cnn1) obj2, lnmVar, (byte) 1);
            default:
                return new l3o1((cik1) obj2, lnmVar, (byte) 2);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws zzhm {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) throws zzhm {
        qun1 tun1Var;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                tgo1 tgo1Var = tgo1.c;
                String strValueOf = "";
                hm5.M(obj);
                p3o1 p3o1Var = (p3o1) this.b;
                Cursor cursorQuery = p3o1Var.a.query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
                if (cursorQuery != null && cursorQuery.moveToFirst() && cursorQuery.getColumnCount() >= 2) {
                    try {
                        strValueOf = String.valueOf(Long.parseLong(cursorQuery.getString(1)));
                        break;
                    } catch (Exception unused) {
                    }
                    cursorQuery.close();
                }
                if (strValueOf.length() == 0) {
                    if (Build.VERSION.SDK_INT > 34) {
                        throw new zzhm(tgo1Var, ij81.q1, null, null);
                    }
                    throw new zzhm(tgo1Var, ij81.r1, null, null);
                }
                rnn1 rnn1VarY = unn1.y();
                snn1 snn1VarX = tnn1.x();
                snn1VarX.j(strValueOf);
                rnn1VarY.i(Collections.singletonList(snn1VarX.e()));
                return bmq0.l0(p3o1Var, (unn1) rnn1VarY.e());
            case 1:
                hm5.M(obj);
                if (((cnn1) this.b).x().w()) {
                    throw new zzhm(tgo1.c, ij81.I1, null, null);
                }
                return rih1.a;
            default:
                hm5.M(obj);
                mxa1 mxa1Var = (mxa1) ((cik1) this.b).d;
                if (((AtomicBoolean) mxa1Var.h).compareAndSet(false, true)) {
                    ((Context) mxa1Var.b).getApplicationContext().registerComponentCallbacks(new nk4(mxa1Var, (byte) 1));
                }
                lqo1 lqo1Var = (lqo1) mxa1Var.g;
                synchronized (lqo1Var.a) {
                    try {
                        WebView webView = (WebView) lqo1Var.b;
                        ayh ayhVar = (ayh) lqo1Var.c;
                        if (webView != null) {
                            tun1Var = new qun1(webView);
                        } else if (ayhVar != null) {
                            tun1Var = new nun1();
                        } else {
                            ayh ayhVarA = sap1.a();
                            lqo1Var.c = ayhVarA;
                            tun1Var = new tun1(ayhVarA);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (tun1Var instanceof qun1) {
                    new ayh((faa0) null).m0(tun1Var.a);
                } else if (!(tun1Var instanceof nun1)) {
                    if (!(tun1Var instanceof tun1)) {
                        eg.o();
                        return null;
                    }
                    ayh ayhVar2 = ((tun1) tun1Var).a;
                    xab1 xab1VarQ = ((dmj1) mxa1Var.d).g(new h24(mxa1Var, ayhVar2, (lnm) null, (byte) 3)).q(new svb0(mxa1Var, ayhVar2, (byte) 13), (gla0) null);
                    synchronized (lqo1Var.a) {
                        try {
                            if (((ayh) lqo1Var.c) != null) {
                                lqo1Var.d = xab1VarQ;
                            } else {
                                xab1VarQ.d((CancellationException) null);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return rih1.a;
        }
    }
}
