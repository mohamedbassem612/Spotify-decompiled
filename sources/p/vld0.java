package p;

import com.spotify.liveroom.listeningparty.messagesourcefactory.PartyMessageSourceInstallException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vld0 implements f961 {
    public final zip0 a;
    public final q3s0 b;
    public final llm c;
    public final Object d = new Object();
    public boolean e = true;

    public vld0(zip0 zip0Var, q3s0 q3s0Var, q8n q8nVar) {
        this.a = zip0Var;
        this.b = q3s0Var;
        this.c = us71.h(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) throws PartyMessageSourceInstallException {
        rld0 rld0Var;
        String str2;
        String str3;
        if (onmVar instanceof rld0) {
            rld0Var = (rld0) onmVar;
            int i = rld0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rld0Var.e = i - Integer.MIN_VALUE;
            } else {
                rld0Var = new rld0(this, onmVar);
            }
        } else {
            rld0Var = new rld0(this, onmVar);
        }
        Object objK = rld0Var.c;
        int i2 = rld0Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objK);
            ezc ezcVarG = yoi1.g(this.a.a(new y6b1(str, false)));
            rld0Var.a = str;
            rld0Var.e = 1;
            objK = b5p1.k(ezcVarG, rld0Var);
            if (objK != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            str = rld0Var.a;
            hm5.M(objK);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = rld0Var.b;
            hm5.M(objK);
        }
        return new qld0((l3s0) objK, str3);
        s3s0 s3s0Var = (s3s0) objK;
        if (s3s0Var == null || (str2 = s3s0Var.a) == null) {
            return null;
        }
        rld0Var.a = null;
        rld0Var.b = str2;
        rld0Var.e = 2;
        Object objB = this.b.b(str, rld0Var);
        if (objB != d9nVar) {
            objK = objB;
            str3 = str2;
            return new qld0((l3s0) objK, str3);
        }
        return d9nVar;
    }

    public final void shutdown() {
        synchronized (this.d) {
            if (this.e) {
                this.e = false;
                smo1.p(this.c, (CancellationException) null);
            }
        }
    }

    public final Object getApi() {
        return this;
    }
}
