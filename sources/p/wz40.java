package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wz40 implements byf0 {
    public xab1 X;
    public final ljg a;
    public final k9r b;
    public final boolean c;
    public final ynb0 d;
    public final ynb0 e;
    public final hz40 f;
    public final Context g;
    public final q8n h;
    public final q8n i;
    public llm t;

    public wz40(ljg ljgVar, k9r k9rVar, boolean z, ynb0 ynb0Var, ynb0 ynb0Var2, hz40 hz40Var, Context context, q8n q8nVar, q8n q8nVar2) {
        this.a = ljgVar;
        this.b = k9rVar;
        this.c = z;
        this.d = ynb0Var;
        this.e = ynb0Var2;
        this.f = hz40Var;
        this.g = context;
        this.h = q8nVar;
        this.i = q8nVar2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, onm onmVar) {
        vz40 vz40Var;
        slc0 slc0VarN;
        wz40 wz40Var;
        slc0 slc0Var;
        MessagePresentationStatus.Dismissed dismissed;
        Object objH;
        if (onmVar instanceof vz40) {
            vz40Var = (vz40) onmVar;
            int i = vz40Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vz40Var.e = i - Integer.MIN_VALUE;
            } else {
                vz40Var = new vz40(this, onmVar);
            }
        } else {
            vz40Var = new vz40(this, onmVar);
        }
        Object objH2 = vz40Var.c;
        int i2 = vz40Var.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objH2);
            slc0VarN = rwo1.n();
            oy3 oy3Var = new oy3(this, z, (lnm) null, (byte) 6);
            vz40Var.b = slc0VarN;
            vz40Var.a = z;
            vz40Var.e = 1;
            objH2 = c921.H(this.h, oy3Var, vz40Var);
            if (objH2 != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            z = vz40Var.a;
            slc0VarN = vz40Var.b;
            hm5.M(objH2);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objH2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = vz40Var.a;
            slc0Var = vz40Var.b;
            hm5.M(objH2);
            wz40Var = this;
        }
        dismissed = (MessagePresentationStatus) objH2;
        if (dismissed != null && (dismissed instanceof MessagePresentationStatus.Dismissed)) {
            vz40Var.b = null;
            vz40Var.a = z;
            vz40Var.e = 3;
            objH = c921.H(wz40Var.i, new sz40(dismissed, wz40Var, slc0Var, (lnm) null), vz40Var);
            if (objH != d9nVar) {
                objH = rih1Var;
            }
            if (objH == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
        slc0 slc0Var2 = slc0VarN;
        MessageResponse messageResponse = (MessageResponse) objH2;
        if (messageResponse instanceof MessageResponse.Success) {
            wz40Var = this;
            fu20 fu20VarQ = f5p1.q(yoi1.g(this.a.e().b(((MessageResponse.Success) messageResponse).getMessageRequestId())), new lqv(new l811(), wz40Var, slc0Var2, (lnm) null, (byte) 20));
            afv afvVar = new afv((byte) 17);
            vz40Var.b = slc0Var2;
            vz40Var.a = z;
            vz40Var.e = 2;
            objH2 = b5p1.l(fu20VarQ, afvVar, vz40Var);
            if (objH2 != d9nVar) {
                slc0Var = slc0Var2;
                dismissed = (MessagePresentationStatus) objH2;
                if (dismissed != null) {
                    vz40Var.b = null;
                    vz40Var.a = z;
                    vz40Var.e = 3;
                    objH = c921.H(wz40Var.i, new sz40(dismissed, wz40Var, slc0Var, (lnm) null), vz40Var);
                    if (objH != d9nVar) {
                        objH = rih1Var;
                    }
                    if (objH == d9nVar) {
                    }
                }
            }
            return d9nVar;
        }
        return rih1Var;
    }

    @Override // p.byf0
    public final void c() {
        if (this.c) {
            xab1 xab1Var = this.X;
            if (xab1Var == null || !xab1Var.isActive()) {
                llm llmVarE = smo1.e(ha71.A(guo1.B(), this.h));
                this.t = llmVarE;
                this.X = l4p1.u(llmVarE, f5p1.q(new any(rqt0.u(yoi1.g(this.b.y())), (byte) 27), new uz40(this, (lnm) null, (byte) 0)));
                l4p1.u(llmVarE, f5p1.q(yoi1.g(this.f.a), new uz40(this, (lnm) null, (byte) 1)));
            }
        }
    }

    @Override // p.byf0
    public final void d() {
        llm llmVar = this.t;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        this.t = null;
        this.X = null;
    }

    @Override // p.byf0
    public final void g(ViewGroup viewGroup) {
    }
}
