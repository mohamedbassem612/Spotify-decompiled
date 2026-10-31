package p;

import android.os.Bundle;
import androidx.media3.session.legacy.MediaSessionManager;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e1i0 implements hx30 {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ MediaSessionManager.RemoteUserInfo b;
    public final /* synthetic */ ixh0 c;
    public final /* synthetic */ hsk d;
    public final /* synthetic */ f1i0 e;

    public e1i0(MediaSessionManager.RemoteUserInfo remoteUserInfo, AtomicReference atomicReference, hsk hskVar, ixh0 ixh0Var, f1i0 f1i0Var) {
        this.e = f1i0Var;
        this.a = atomicReference;
        this.b = remoteUserInfo;
        this.c = ixh0Var;
        this.d = hskVar;
    }

    public final void onFailure(Throwable th) {
        qa61 qa61Var = qa61.b;
        m8u0 m8u0Var = m8u0.b;
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        this.a.set(new gxh0(false, qa61Var, m8u0Var, bg11Var, bg11Var, Bundle.EMPTY));
        this.d.f();
    }

    public final void onSuccess(Object obj) {
        gxh0 gxh0Var = (gxh0) obj;
        this.a.set(gxh0Var);
        if (gxh0Var.a) {
            this.e.c.b(this.b, this.c, gxh0Var.b, gxh0Var.c);
        }
        this.d.f();
    }
}
