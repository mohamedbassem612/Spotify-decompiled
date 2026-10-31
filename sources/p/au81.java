package p;

import com.spotify.dj.interactionmanager.v0.GenerateAndPlayRecsRequest;
import com.spotify.dj.interactionmanager.v0.GenerateAndPlayRecsResponse;
import com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsRequest;
import com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsResponse;
import com.spotify.dj.interactionmanager.v0.GetSuggestedPromptsRequest;
import com.spotify.dj.interactionmanager.v0.GetSuggestedPromptsResponse;
import com.spotify.dj.interactionmanager.v0.Problem;
import com.spotify.dj.interactionmanager.v0.SubmitFeedbackRequest;
import com.spotify.dj.interactionmanager.v0.SubmitFeedbackResponse;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class au81 {
    public final rs81 a;

    public au81(rs81 rs81Var) {
        this.a = rs81Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, String str4, String str5, String str6, onm onmVar) {
        wt81 wt81Var;
        if (onmVar instanceof wt81) {
            wt81Var = (wt81) onmVar;
            int i = wt81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wt81Var.c = i - Integer.MIN_VALUE;
            } else {
                wt81Var = new wt81(this, onmVar);
            }
        } else {
            wt81Var = new wt81(this, onmVar);
        }
        Object objE = wt81Var.a;
        int i2 = wt81Var.c;
        if (i2 == 0) {
            hm5.M(objE);
            GenerateAndPlayRecsRequest.Builder builderNewBuilder = GenerateAndPlayRecsRequest.newBuilder();
            builderNewBuilder.setPrompt(str);
            builderNewBuilder.setSessionId(str2);
            builderNewBuilder.setDeviceId(str3);
            if (str4 != null) {
                builderNewBuilder.setCurrentSegmentId(str4);
            }
            if (str5 != null) {
                builderNewBuilder.setCurrentTrackUri(str5);
            }
            builderNewBuilder.setAckCommentaryText(str6);
            GenerateAndPlayRecsRequest generateAndPlayRecsRequest = (GenerateAndPlayRecsRequest) builderNewBuilder.build();
            generateAndPlayRecsRequest.getClass();
            wt81Var.c = 1;
            objE = this.a.e(generateAndPlayRecsRequest, wt81Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        GenerateAndPlayRecsResponse generateAndPlayRecsResponse = (GenerateAndPlayRecsResponse) objE;
        System.out.println(generateAndPlayRecsResponse.getStatusCode());
        System.out.println((Object) generateAndPlayRecsResponse.getStatusMessage());
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, String str3, String str4, onm onmVar) {
        xt81 xt81Var;
        if (onmVar instanceof xt81) {
            xt81Var = (xt81) onmVar;
            int i = xt81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xt81Var.c = i - Integer.MIN_VALUE;
            } else {
                xt81Var = new xt81(this, onmVar);
            }
        } else {
            xt81Var = new xt81(this, onmVar);
        }
        Object objA = xt81Var.a;
        int i2 = xt81Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            GetAckCommentaryAndPrepareRecsRequest.Builder builderNewBuilder = GetAckCommentaryAndPrepareRecsRequest.newBuilder();
            builderNewBuilder.setSessionId(str2);
            builderNewBuilder.setDeviceId(str3);
            builderNewBuilder.setCurrentSegmentId(str4);
            builderNewBuilder.setPrompt(str);
            GetAckCommentaryAndPrepareRecsRequest getAckCommentaryAndPrepareRecsRequest = (GetAckCommentaryAndPrepareRecsRequest) builderNewBuilder.build();
            getAckCommentaryAndPrepareRecsRequest.getClass();
            xt81Var.c = 1;
            objA = this.a.a(getAckCommentaryAndPrepareRecsRequest, xt81Var);
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
        GetAckCommentaryAndPrepareRecsResponse getAckCommentaryAndPrepareRecsResponse = (GetAckCommentaryAndPrepareRecsResponse) objA;
        return new ot81(getAckCommentaryAndPrepareRecsResponse.getAudioCdnUrl(), getAckCommentaryAndPrepareRecsResponse.getAckCommentaryText());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        yt81 yt81Var;
        if (onmVar instanceof yt81) {
            yt81Var = (yt81) onmVar;
            int i = yt81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yt81Var.c = i - Integer.MIN_VALUE;
            } else {
                yt81Var = new yt81(this, onmVar);
            }
        } else {
            yt81Var = new yt81(this, onmVar);
        }
        Object objC = yt81Var.a;
        int i2 = yt81Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            GetSuggestedPromptsRequest.Builder builderNewBuilder = GetSuggestedPromptsRequest.newBuilder();
            builderNewBuilder.setUnused(true);
            if (str != null) {
                builderNewBuilder.setCurrentTrackUri(str);
            }
            GetSuggestedPromptsRequest getSuggestedPromptsRequest = (GetSuggestedPromptsRequest) builderNewBuilder.build();
            yt81Var.c = 1;
            objC = this.a.c(getSuggestedPromptsRequest, yt81Var);
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
        return ((GetSuggestedPromptsResponse) objC).getSuggestedPromptsList();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ut81 ut81Var, onm onmVar) throws NoWhenBranchMatchedException {
        zt81 zt81Var;
        mmr0 mmr0VarN;
        if (onmVar instanceof zt81) {
            zt81Var = (zt81) onmVar;
            int i = zt81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zt81Var.c = i - Integer.MIN_VALUE;
            } else {
                zt81Var = new zt81(this, onmVar);
            }
        } else {
            zt81Var = new zt81(this, onmVar);
        }
        Object objB = zt81Var.a;
        int i2 = zt81Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            if (u890.j(ut81Var, tt81.a)) {
                mmr0VarN = oqn1.n(Problem.PROBLEM_WRONG_MUSIC, (Object) null);
            } else if (u890.j(ut81Var, rt81.a)) {
                mmr0VarN = oqn1.n(Problem.PROBLEM_MISUNDERSTOOD_WORDS, (Object) null);
            } else if (u890.j(ut81Var, pt81.a)) {
                mmr0VarN = oqn1.n(Problem.PROBLEM_INACCURATE_STATEMENT, (Object) null);
            } else if (u890.j(ut81Var, qt81.a)) {
                mmr0VarN = oqn1.n(Problem.PROBLEM_MISPRONUNCIATION, (Object) null);
            } else {
                if (!(ut81Var instanceof st81)) {
                    eg.o();
                    return null;
                }
                mmr0VarN = oqn1.n(Problem.PROBLEM_OTHER_OR_GENERIC, ((st81) ut81Var).a());
            }
            Problem problem = (Problem) mmr0VarN.a;
            String str = (String) mmr0VarN.b;
            SubmitFeedbackRequest.Builder builderNewBuilder = SubmitFeedbackRequest.newBuilder();
            builderNewBuilder.setProblem(problem);
            if (str != null) {
                builderNewBuilder.setProblemDetail(str);
            }
            SubmitFeedbackRequest submitFeedbackRequest = (SubmitFeedbackRequest) builderNewBuilder.build();
            zt81Var.c = 1;
            objB = this.a.b(submitFeedbackRequest, zt81Var);
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
        return ((SubmitFeedbackResponse) objB).getMessageAcknowledgement();
    }
}
