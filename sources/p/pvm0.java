package p;

import com.spotify.familyverify.v1.GetQrCodeVerificationOnboardingRequest;
import com.spotify.familyverify.v1.GetQrCodeVerificationOnboardingResponse;
import com.spotify.familyverify.v1.StartQrCodeVerificationFlowRequest;
import com.spotify.familyverify.v1.StartQrCodeVerificationFlowResponse;
import com.spotify.familyverify.v1.TriggerQrCodeVerificationStartNotificationRequest;
import com.spotify.familyverify.v1.VerifyQrCodeRequest;
import com.spotify.familyverify.v1.VerifyQrCodeResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pvm0 {
    public final qvm0 a;

    public pvm0(qvm0 qvm0Var) {
        this.a = qvm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, onm onmVar) {
        mvm0 mvm0Var;
        if (onmVar instanceof mvm0) {
            mvm0Var = (mvm0) onmVar;
            int i = mvm0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvm0Var.c = i - Integer.MIN_VALUE;
            } else {
                mvm0Var = new mvm0(this, onmVar);
            }
        } else {
            mvm0Var = new mvm0(this, onmVar);
        }
        Object objA = mvm0Var.a;
        int i2 = mvm0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            cp40 cp40VarO = GetQrCodeVerificationOnboardingRequest.o();
            cp40VarO.n();
            cp40VarO.q(z);
            GetQrCodeVerificationOnboardingRequest getQrCodeVerificationOnboardingRequest = (GetQrCodeVerificationOnboardingRequest) cp40VarO.build();
            getQrCodeVerificationOnboardingRequest.getClass();
            mvm0Var.c = 1;
            objA = this.a.a(getQrCodeVerificationOnboardingRequest, mvm0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        return e4p1.p((GetQrCodeVerificationOnboardingResponse) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(boolean z, onm onmVar) {
        nvm0 nvm0Var;
        if (onmVar instanceof nvm0) {
            nvm0Var = (nvm0) onmVar;
            int i = nvm0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nvm0Var.c = i - Integer.MIN_VALUE;
            } else {
                nvm0Var = new nvm0(this, onmVar);
            }
        } else {
            nvm0Var = new nvm0(this, onmVar);
        }
        Object objB = nvm0Var.a;
        int i2 = nvm0Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            ekb1 ekb1VarO = StartQrCodeVerificationFlowRequest.o();
            ekb1VarO.n();
            ekb1VarO.q(z);
            StartQrCodeVerificationFlowRequest startQrCodeVerificationFlowRequest = (StartQrCodeVerificationFlowRequest) ekb1VarO.build();
            startQrCodeVerificationFlowRequest.getClass();
            nvm0Var.c = 1;
            objB = this.a.b(startQrCodeVerificationFlowRequest, nvm0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        return e4p1.q((StartQrCodeVerificationFlowResponse) objB);
    }

    public final Object c(boolean z, jzi1 jzi1Var) {
        lvg1 lvg1VarO = TriggerQrCodeVerificationStartNotificationRequest.o();
        lvg1VarO.n();
        lvg1VarO.q(z);
        TriggerQrCodeVerificationStartNotificationRequest triggerQrCodeVerificationStartNotificationRequest = (TriggerQrCodeVerificationStartNotificationRequest) lvg1VarO.build();
        triggerQrCodeVerificationStartNotificationRequest.getClass();
        Object objD = this.a.d(triggerQrCodeVerificationStartNotificationRequest, jzi1Var);
        return objD == d9n.a ? objD : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) {
        ovm0 ovm0Var;
        if (onmVar instanceof ovm0) {
            ovm0Var = (ovm0) onmVar;
            int i = ovm0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovm0Var.c = i - Integer.MIN_VALUE;
            } else {
                ovm0Var = new ovm0(this, onmVar);
            }
        } else {
            ovm0Var = new ovm0(this, onmVar);
        }
        Object objC = ovm0Var.a;
        int i2 = ovm0Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            p3j1 p3j1VarO = VerifyQrCodeRequest.o();
            p3j1VarO.n(str);
            VerifyQrCodeRequest verifyQrCodeRequest = (VerifyQrCodeRequest) p3j1VarO.build();
            verifyQrCodeRequest.getClass();
            ovm0Var.c = 1;
            objC = this.a.c(verifyQrCodeRequest, ovm0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        return e4p1.r((VerifyQrCodeResponse) objC);
    }
}
