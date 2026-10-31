package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.localfiles.localfilesmonorepo.AddedLocalFile;
import com.spotify.localfiles.localfilesmonorepo.AudioMimeIntentChecker;
import com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature;
import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rde0 implements anc0, mqb1 {
    public final Intent a;
    public final i8h1 b;
    public final yzc0 c;
    public final LocalFilesFeature d;
    public final xde0 e;
    public final q8n f;
    public final fjl0 g;
    public xab1 h;
    public boolean i;

    public rde0(Intent intent, i8h1 i8h1Var, yzc0 yzc0Var, LocalFilesFeature localFilesFeature, xde0 xde0Var, q8n q8nVar, r6h1 r6h1Var) {
        this.a = intent;
        this.b = i8h1Var;
        this.c = yzc0Var;
        this.d = localFilesFeature;
        this.e = xde0Var;
        this.f = q8nVar;
        this.g = new fjl0(r6h1Var, (byte) 11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(AddedLocalFile addedLocalFile, onm onmVar) {
        ode0 ode0Var;
        if (onmVar instanceof ode0) {
            ode0Var = (ode0) onmVar;
            int i = ode0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ode0Var.c = i - Integer.MIN_VALUE;
            } else {
                ode0Var = new ode0(this, onmVar);
            }
        } else {
            ode0Var = new ode0(this, onmVar);
        }
        Object objP = ode0Var.a;
        int i2 = ode0Var.c;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objP);
            long j = sde0.a;
            q4d0 q4d0Var = new q4d0(this, addedLocalFile, lnmVar, (byte) 27);
            ode0Var.c = 1;
            objP = rc2.P(j, q4d0Var, ode0Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        Boolean bool = (Boolean) objP;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    @Override // p.mqb1
    public final void e(Bundle bundle) {
        this.i = bundle != null ? bundle.getBoolean("local_files_add_and_play_has_triggered") : false;
    }

    @Override // p.mqb1
    public final void f(Bundle bundle) {
        bundle.putBoolean("local_files_add_and_play_has_triggered", this.i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable i(onm onmVar) {
        qde0 qde0Var;
        Boolean m231Var;
        if (onmVar instanceof qde0) {
            qde0Var = (qde0) onmVar;
            int i = qde0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qde0Var.c = i - Integer.MIN_VALUE;
            } else {
                qde0Var = new qde0(this, onmVar);
            }
        } else {
            qde0Var = new qde0(this, onmVar);
        }
        Object objP = qde0Var.a;
        int i2 = qde0Var.c;
        lnm lnmVar = null;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                long j = sde0.b;
                p6d0 p6d0Var = new p6d0((Object) this, lnmVar, (byte) 8);
                qde0Var.c = 1;
                objP = rc2.P(j, p6d0Var, qde0Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objP);
            }
            m231Var = (Boolean) objP;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    @Override // p.anc0
    public final void n() {
        String dataString;
        if (this.i) {
            return;
        }
        AudioMimeIntentChecker audioMimeIntentChecker = AudioMimeIntentChecker.INSTANCE;
        Intent intent = this.a;
        if (audioMimeIntentChecker.isAudioMimeIntent(intent) && (dataString = intent.getDataString()) != null) {
            xab1 xab1Var = this.h;
            lnm lnmVar = null;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.h = fn31.T(smo1.e(this.f), (o8n) null, 0, new xtz(this, dataString, lnmVar, (byte) 29), 3);
        }
    }

    @Override // p.anc0
    public final void q() {
        xab1 xab1Var = this.h;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }
}
