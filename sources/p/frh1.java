package p;

import com.spotify.bluejay.data.api.GenerationServiceException;
import com.spotify.personalizedepisodes.contentservice.v1.CreateOrUpdateScheduleRequest;
import com.spotify.personalizedepisodes.contentservice.v1.CreateOrUpdateScheduleResponse;
import com.spotify.personalizedepisodes.contentservice.v1.GetEntityDetailsResponse;
import com.spotify.personalizedepisodes.contentservice.v1.PromptDetails;
import com.spotify.personalizedepisodes.contentservice.v1.ScheduledPrompt;
import com.spotify.personalizedepisodes.contentservice.v1.ToolSelection;
import com.spotify.personalizedepisodes.contentservice.v1.TriggerGenerationRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class frh1 {
    public final grh1 a;

    public frh1(grh1 grh1Var) {
        this.a = grh1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.data.api.GenerationServiceException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(bn40 bn40Var, onm onmVar) throws GenerationServiceException {
        crh1 crh1Var;
        if (onmVar instanceof crh1) {
            crh1Var = (crh1) onmVar;
            int i = crh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                crh1Var.c = i - Integer.MIN_VALUE;
            } else {
                crh1Var = new crh1(this, onmVar);
            }
        } else {
            crh1Var = new crh1(this, onmVar);
        }
        Object objA = crh1Var.a;
        int i2 = crh1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            String str = bn40Var.a;
            crh1Var.c = 1;
            objA = this.a.a(str, crh1Var);
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
        sy21 sy21Var = (sy21) objA;
        if (!sy21Var.a.Q0) {
            throw ryn1.A(sy21Var);
        }
        Object obj = sy21Var.b;
        if (obj == null) {
            hhg1.n("Response body is null for successful get entity details response");
            return null;
        }
        ScheduledPrompt scheduledPromptN = ((GetEntityDetailsResponse) obj).n();
        String id = scheduledPromptN.getId();
        xk41 xk41VarC = cpn1.C(scheduledPromptN.t());
        PromptDetails promptDetailsS = scheduledPromptN.s();
        ewx0 ewx0Var = new ewx0(promptDetailsS.n(), promptDetailsS.p());
        String strQ = scheduledPromptN.q();
        boolean zP = scheduledPromptN.p();
        boolean zO = scheduledPromptN.o();
        u1f1 u1f1Var = new u1f1(scheduledPromptN.u().p());
        String strR = scheduledPromptN.r();
        return new cn40(new hm41(id, xk41VarC, ewx0Var, strQ, zP, scheduledPromptN.w() ? new zlk1(scheduledPromptN.v().getId(), scheduledPromptN.v().getName(), scheduledPromptN.v().getDescription(), scheduledPromptN.v().o()) : null, zO, u1f1Var, strR.length() > 0 ? strR : null));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.data.api.GenerationServiceException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(jvg1 jvg1Var, onm onmVar) throws GenerationServiceException {
        drh1 drh1Var;
        if (onmVar instanceof drh1) {
            drh1Var = (drh1) onmVar;
            int i = drh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                drh1Var.c = i - Integer.MIN_VALUE;
            } else {
                drh1Var = new drh1(this, onmVar);
            }
        } else {
            drh1Var = new drh1(this, onmVar);
        }
        Object objC = drh1Var.a;
        int i2 = drh1Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            ivg1 ivg1VarN = TriggerGenerationRequest.n();
            ivg1VarN.n(jvg1Var.a);
            TriggerGenerationRequest triggerGenerationRequestBuild = ivg1VarN.build();
            drh1Var.c = 1;
            objC = this.a.c(triggerGenerationRequestBuild, drh1Var);
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
        sy21 sy21Var = (sy21) objC;
        if (sy21Var.a.Q0) {
            return rih1.a;
        }
        throw ryn1.A(sy21Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.data.api.GenerationServiceException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(fvh1 fvh1Var, onm onmVar) throws GenerationServiceException {
        erh1 erh1Var;
        String strN;
        if (onmVar instanceof erh1) {
            erh1Var = (erh1) onmVar;
            int i = erh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                erh1Var.c = i - Integer.MIN_VALUE;
            } else {
                erh1Var = new erh1(this, onmVar);
            }
        } else {
            erh1Var = new erh1(this, onmVar);
        }
        Object objB = erh1Var.a;
        int i2 = erh1Var.c;
        String str = null;
        if (i2 == 0) {
            hm5.M(objB);
            kon konVarN = CreateOrUpdateScheduleRequest.n();
            konVarN.n(fvh1Var.a);
            konVarN.u(fvh1Var.b);
            xk41 xk41Var = fvh1Var.c;
            if (xk41Var != null) {
                konVarN.t(cpn1.D(xk41Var));
            }
            String str2 = fvh1Var.d;
            if (str2 != null) {
                konVarN.s(str2);
            }
            String str3 = fvh1Var.e;
            if (str3 != null) {
                konVarN.w(str3);
            }
            Boolean bool = fvh1Var.f;
            if (bool != null) {
                konVarN.q(bool.booleanValue());
            }
            u1f1 u1f1Var = fvh1Var.g;
            if (u1f1Var != null) {
                t1f1 t1f1VarQ = ToolSelection.q();
                t1f1VarQ.n(u1f1Var.a);
                konVarN.v((ToolSelection) t1f1VarQ.build());
            }
            String str4 = fvh1Var.h;
            if (str4 != null) {
                konVarN.r(str4);
            }
            CreateOrUpdateScheduleRequest createOrUpdateScheduleRequestBuild = konVarN.build();
            erh1Var.c = 1;
            objB = this.a.b(createOrUpdateScheduleRequestBuild, erh1Var);
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
        sy21 sy21Var = (sy21) objB;
        if (!sy21Var.a.Q0) {
            throw ryn1.A(sy21Var);
        }
        CreateOrUpdateScheduleResponse createOrUpdateScheduleResponse = (CreateOrUpdateScheduleResponse) sy21Var.b;
        if (createOrUpdateScheduleResponse != null && (strN = createOrUpdateScheduleResponse.n()) != null && strN.length() > 0) {
            str = strN;
        }
        return new gvh1(str);
    }
}
