package p;

import com.spotify.ondemandtrials.trialstartimpl.proto.CheckEligibilityRequest;
import com.spotify.ondemandtrials.trialstartimpl.proto.CheckEligibilityResponse;
import com.spotify.ondemandtrials.trialstartimpl.proto.GetTrialRequest;
import com.spotify.ondemandtrials.trialstartimpl.proto.GetTrialResponse;
import com.spotify.ondemandtrials.trialstartimpl.proto.StartTrialRequest;
import com.spotify.ondemandtrials.trialstartimpl.proto.StartTrialResponse;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k4q0 {
    public final l4q0 a;

    public k4q0(l4q0 l4q0Var) {
        this.a = l4q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        h4q0 h4q0Var;
        if (onmVar instanceof h4q0) {
            h4q0Var = (h4q0) onmVar;
            int i = h4q0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h4q0Var.c = i - Integer.MIN_VALUE;
            } else {
                h4q0Var = new h4q0(this, onmVar);
            }
        } else {
            h4q0Var = new h4q0(this, onmVar);
        }
        Object objD = h4q0Var.a;
        int i2 = h4q0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objD);
                l4q0 l4q0Var = this.a;
                ktf ktfVarO = CheckEligibilityRequest.o();
                ktfVarO.n();
                CheckEligibilityRequest checkEligibilityRequest = (CheckEligibilityRequest) ktfVarO.build();
                h4q0Var.c = 1;
                objD = l4q0Var.d(checkEligibilityRequest, h4q0Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objD);
            }
            CheckEligibilityResponse checkEligibilityResponse = (CheckEligibilityResponse) objD;
            boolean zP = checkEligibilityResponse.p();
            Integer numP = yah0.p(checkEligibilityResponse.o());
            if (!checkEligibilityResponse.s()) {
                numP = null;
            }
            Long lQ = yah0.q(checkEligibilityResponse.q().q());
            if (!checkEligibilityResponse.t()) {
                lQ = null;
            }
            Boolean boolM = checkEligibilityResponse.r() ? yah0.m(checkEligibilityResponse.n()) : null;
            return new org1(numP, lQ, zP, boolM != null ? boolM.booleanValue() : false);
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        i4q0 i4q0Var;
        if (onmVar instanceof i4q0) {
            i4q0Var = (i4q0) onmVar;
            int i = i4q0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i4q0Var.c = i - Integer.MIN_VALUE;
            } else {
                i4q0Var = new i4q0(this, onmVar);
            }
        } else {
            i4q0Var = new i4q0(this, onmVar);
        }
        Object objC = i4q0Var.a;
        int i2 = i4q0Var.c;
        boolean z = true;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                l4q0 l4q0Var = this.a;
                xq40 xq40VarO = GetTrialRequest.o();
                xq40VarO.n();
                GetTrialRequest getTrialRequest = (GetTrialRequest) xq40VarO.build();
                i4q0Var.c = 1;
                objC = l4q0Var.c(getTrialRequest, i4q0Var);
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
            GetTrialResponse getTrialResponse = (GetTrialResponse) objC;
            ZonedDateTime zonedDateTimeWith = getTrialResponse.q() ? ZonedDateTime.now().with(ChronoField.INSTANT_SECONDS, getTrialResponse.n().q()) : null;
            if (getTrialResponse.p() != yq40.e) {
                z = false;
            }
            Integer numP = yah0.p(getTrialResponse.o());
            return new rrg1(zonedDateTimeWith, z, numP.intValue() > 0 ? numP : null);
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(onm onmVar) {
        j4q0 j4q0Var;
        if (onmVar instanceof j4q0) {
            j4q0Var = (j4q0) onmVar;
            int i = j4q0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j4q0Var.c = i - Integer.MIN_VALUE;
            } else {
                j4q0Var = new j4q0(this, onmVar);
            }
        } else {
            j4q0Var = new j4q0(this, onmVar);
        }
        Object objA = j4q0Var.a;
        int i2 = j4q0Var.c;
        boolean z = true;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                l4q0 l4q0Var = this.a;
                okb1 okb1VarO = StartTrialRequest.o();
                okb1VarO.n();
                StartTrialRequest startTrialRequest = (StartTrialRequest) okb1VarO.build();
                j4q0Var.c = 1;
                objA = l4q0Var.a(startTrialRequest, j4q0Var);
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
            if (((StartTrialResponse) objA).n() != vkb1.b) {
                z = false;
            }
            return yah0.m(z);
        } catch (Throwable th) {
            return new m231(th);
        }
    }
}
