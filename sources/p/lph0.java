package p;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.media3.session.legacy.MediaSessionManager;
import app.p000rive.semantics.SemanticState;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.FlowableEmitter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class lph0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lph0(MediaSessionManager.RemoteUserInfo remoteUserInfo, AtomicReference atomicReference, hsk hskVar, ixh0 ixh0Var, f1i0 f1i0Var) {
        this.a = (byte) 1;
        this.e = f1i0Var;
        this.f = ixh0Var;
        this.b = atomicReference;
        this.c = remoteUserInfo;
        this.d = hskVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                tph0 tph0Var = (tph0) obj5;
                Bundle bundle = (Bundle) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                hsk hskVar = (hsk) obj;
                iqh0 iqh0Var = tph0Var.d;
                v1k v1kVar = tph0Var.c;
                ixh0 ixh0VarO = v1kVar.o((MediaSessionManager.RemoteUserInfo) obj4);
                if (ixh0VarO == null) {
                    hskVar.f();
                    return;
                }
                if (!v1kVar.w(ixh0VarO, 50000)) {
                    hskVar.f();
                    return;
                }
                f280 f280VarH = iqh0Var.H(ixh0VarO, yzb0.d(iqh0Var.f, bundle));
                pph0 pph0Var = new pph0(tph0Var, ixh0VarO, atomicReference, hskVar);
                wkh0 wkh0Var = new wkh0(tph0Var, (byte) 1);
                f280VarH.b(new nx30(f280VarH, pph0Var, (byte) 24), wkh0Var);
                return;
            case 1:
                f1i0 f1i0Var = (f1i0) obj5;
                ixh0 ixh0Var = (ixh0) obj3;
                f280 f280VarS = f1i0Var.b.s(ixh0Var);
                e1i0 e1i0Var = new e1i0((MediaSessionManager.RemoteUserInfo) obj4, (AtomicReference) obj2, (hsk) obj, ixh0Var, f1i0Var);
                f280VarS.b(new nx30(f280VarS, e1i0Var, (byte) 24), new wkh0(f1i0Var, (byte) 5));
                return;
            case 2:
                p811 p811Var = (p811) obj4;
                String str = (String) obj3;
                ReentrantLock reentrantLock = (ReentrantLock) obj2;
                Condition condition = (Condition) obj;
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URL) obj5).openConnection();
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), nne.a), SemanticState.Multiline);
                        StringWriter stringWriter = new StringWriter();
                        char[] cArr = new char[SemanticState.Multiline];
                        for (int i = bufferedReader.read(cArr); i >= 0; i = bufferedReader.read(cArr)) {
                            stringWriter.write(cArr, 0, i);
                        }
                        String string = stringWriter.toString();
                        httpURLConnection.getInputStream().close();
                        p811Var.a = new JSONObject(string).optString(str);
                        httpURLConnection.disconnect();
                        reentrantLock.lock();
                        try {
                            condition.signal();
                        } finally {
                            reentrantLock.unlock();
                        }
                        break;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        reentrantLock.lock();
                        try {
                            condition.signal();
                            throw th;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                    httpURLConnection.disconnect();
                    reentrantLock.lock();
                    try {
                        condition.signal();
                    } finally {
                        reentrantLock.unlock();
                    }
                    break;
                }
                return;
            default:
                nt21 nt21Var = (nt21) obj5;
                FlowableEmitter flowableEmitter = (FlowableEmitter) obj3;
                Activity activity = (Activity) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                try {
                    erw0 erw0Var = (erw0) ((dce) obj4).get();
                    law0 law0VarD = new rpv0((byte) 3).d();
                    xdn0 xdn0Var = (xdn0) new fey((byte) 22).b;
                    xdn0Var.r(xq70.b, 0);
                    xdn0Var.r(xq70.e, 2);
                    xq70 xq70Var = new xq70(eqq0.b(xdn0Var));
                    cx70.C(xq70Var);
                    uq70 uq70Var = new uq70(xq70Var);
                    uq70Var.D((ExecutorService) nt21Var.c, new jf11(flowableEmitter, (byte) 6));
                    x74.N(activity).execute(new iev(nt21Var, erw0Var, activity, viewGroup, law0VarD, uq70Var, (byte) 1));
                    return;
                } catch (InterruptedException | ExecutionException e2) {
                    Logger.d("Error starting camera: %s", new Object[]{e2.getMessage()});
                    flowableEmitter.onError(e2);
                    return;
                }
        }
    }

    public /* synthetic */ lph0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.b = obj4;
        this.d = obj5;
    }
}
