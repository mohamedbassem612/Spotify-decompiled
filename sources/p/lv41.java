package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.Context;
import com.spotify.player.model.Context$Builder;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.SetShufflingContextCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions$Builder;
import com.spotify.voiceassistants.playermodels.CommandPlayResponse;
import com.spotify.voiceassistants.playermodels.PlayContextWrapper;
import com.spotify.voiceassistants.playermodels.SearchEndpointRequest;
import com.spotify.voiceassistants.playermodels.SearchResponse;
import com.spotify.voiceassistants.playermodels.SpeakeasyDualResponse;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lv41 implements bmk1 {
    public final r75 a;
    public final bge0 b;
    public final a77 c;
    public final AtomicBoolean d;

    public lv41(r75 r75Var, bge0 bge0Var, a77 a77Var, AtomicBoolean atomicBoolean) {
        this.a = r75Var;
        this.b = bge0Var;
        this.c = a77Var;
        this.d = atomicBoolean;
    }

    public final Completable a(SearchEndpointRequest searchEndpointRequest, SpeakeasyDualResponse speakeasyDualResponse, zle1 zle1Var, t45 t45Var, VoiceAssistantLoggingContext voiceAssistantLoggingContext) {
        Context contextBuild;
        Single singleError;
        Completable completableIgnoreElement;
        bge0 bge0Var = this.b;
        g710 g710Var = bge0Var.c;
        if (!(speakeasyDualResponse instanceof SpeakeasyDualResponse.FullSuccessResponse)) {
            if (speakeasyDualResponse instanceof SpeakeasyDualResponse.FailedResponse) {
                SpeakeasyDualResponse.FailedResponse failedResponse = (SpeakeasyDualResponse.FailedResponse) speakeasyDualResponse;
                String searchRequestId = failedResponse.getSearchResponse().getSearchRequestId();
                this.c.b(failedResponse.getSearchResponse().getResponseFeedbackDetails(), voiceAssistantLoggingContext, searchRequestId);
            }
            return CompletableEmpty.a;
        }
        CommandPlayResponse commandPlayResponse = ((SpeakeasyDualResponse.FullSuccessResponse) speakeasyDualResponse).getCommandPlayResponse();
        if (t45Var != null) {
            t45.m(t45Var, VoiceAssistantsPerformance.MEASURE_PLAY_COMMAND, 4);
        }
        Context context = commandPlayResponse.getContext();
        if (context != null) {
            Context$Builder builder = context.toBuilder();
            String strUri = context.uri();
            strUri.getClass();
            builder.uri(g77.a(strUri));
            String strUrl = context.url();
            strUrl.getClass();
            builder.url(g77.a(strUrl));
            contextBuild = builder.build();
            contextBuild.getClass();
        } else {
            contextBuild = Context$Builder.builder().build();
            contextBuild.getClass();
        }
        String interactionId = searchEndpointRequest.getInteractionId();
        searchEndpointRequest.getTextQuery();
        PlayContextWrapper playContextWrapper = new PlayContextWrapper(contextBuild, commandPlayResponse.getPlayOptions(), commandPlayResponse.getPlayOrigin(), commandPlayResponse.getLoggingParams());
        hyv0 hyv0Var = bge0Var.b;
        if (playContextWrapper.getContext() == null || playContextWrapper.getPlayOrigin() == null || playContextWrapper.getPlayOptions() == null) {
            singleError = Single.error(new IllegalArgumentException("Context response was not valid"));
        } else {
            Context context2 = playContextWrapper.getContext();
            if (context2 == null) {
                eg.m("Required value was null.");
                return null;
            }
            PreparePlayOptions playOptions = playContextWrapper.getPlayOptions();
            if (playOptions == null) {
                eg.m("Required value was null.");
                return null;
            }
            PlayOrigin playOrigin = playContextWrapper.getPlayOrigin();
            if (playOrigin == null) {
                eg.m("Required value was null.");
                return null;
            }
            String strUri2 = context2.uri();
            strUri2.getClass();
            if (strUri2.equals(hyv0Var.a)) {
                singleError = g710Var.h(bge0.a(playContextWrapper, interactionId)).doFinally(new wqd0(bge0Var, (byte) 3));
            } else {
                hyv0Var.a = "";
                singleError = g710Var.e(new z610(strUri2, context2, context2.metadata(), playOptions, playOrigin, bge0.a(playContextWrapper, interactionId)));
            }
        }
        Completable completableFlatMapCompletable = singleError.flatMapCompletable(new bju(t45Var, zle1Var));
        if (this.d.get()) {
            completableIgnoreElement = g710Var.j.d(SetShufflingContextCommand.create(true)).ignoreElement();
        } else {
            completableIgnoreElement = CompletableEmpty.a;
        }
        return completableFlatMapCompletable.c(completableIgnoreElement).p(new g931(commandPlayResponse, this, voiceAssistantLoggingContext, (byte) 16));
    }

    public final Completable b(SpeakeasyDualResponse speakeasyDualResponse, mzr0 mzr0Var, VoiceAssistantLoggingContext voiceAssistantLoggingContext) {
        PreparePlayOptions preparePlayOptionsBuild;
        PreparePlayOptions$Builder builder;
        PreparePlayOptions$Builder preparePlayOptions$BuilderInitiallyPaused;
        if (speakeasyDualResponse instanceof SpeakeasyDualResponse.FailedResponse) {
            SpeakeasyDualResponse.FailedResponse failedResponse = (SpeakeasyDualResponse.FailedResponse) speakeasyDualResponse;
            SearchResponse searchResponse = failedResponse.getSearchResponse();
            String errorMsg = failedResponse.getErrorMsg();
            if (errorMsg != null) {
                Logger.d("Voice command failed: %s", new Object[]{errorMsg});
            }
            this.c.b(searchResponse.getResponseFeedbackDetails(), voiceAssistantLoggingContext, (String) null);
            return new CompletableFromAction(new wqd0(mzr0Var, (byte) 20));
        }
        if (this.a.a() && (speakeasyDualResponse instanceof SpeakeasyDualResponse.FullSuccessResponse)) {
            SpeakeasyDualResponse.FullSuccessResponse fullSuccessResponse = (SpeakeasyDualResponse.FullSuccessResponse) speakeasyDualResponse;
            if (fullSuccessResponse.getCommandPlayResponse().getContext() != null) {
                CommandPlayResponse commandPlayResponse = fullSuccessResponse.getCommandPlayResponse();
                Context context = commandPlayResponse.getContext();
                if (context == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                PreparePlayOptions playOptions = commandPlayResponse.getPlayOptions();
                PlayOrigin playOrigin = commandPlayResponse.getPlayOrigin();
                LoggingParams loggingParams = commandPlayResponse.getLoggingParams();
                context.uri();
                String strUri = context.uri();
                j380 j380VarMetadata = context.metadata();
                if (playOptions == null || (builder = playOptions.toBuilder()) == null || (preparePlayOptions$BuilderInitiallyPaused = builder.initiallyPaused(true)) == null || (preparePlayOptionsBuild = preparePlayOptions$BuilderInitiallyPaused.build()) == null) {
                    preparePlayOptionsBuild = PreparePlayOptions.builder().initiallyPaused(true).build();
                }
                PreparePlayOptions preparePlayOptions = preparePlayOptionsBuild;
                if (playOrigin == null) {
                    playOrigin = bge0.d;
                }
                z610 z610Var = new z610(strUri, context, j380VarMetadata, preparePlayOptions, playOrigin, loggingParams);
                bge0 bge0Var = this.b;
                return bge0Var.c.e(z610Var).doOnSuccess(new w090(bge0Var, context, (byte) 11)).ignoreElement().c(mzr0Var.m());
            }
        }
        return mzr0Var.m();
    }
}
