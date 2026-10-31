package com.spotify.contribution.repositoryimpl;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0007\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/spotify/contribution/repositoryimpl/ContributionApiError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "RequestFailed", "InvalidResponseData", "InvalidUri", "MissingPayload", "MissingTarget", "EmptyResponse", "ServerError", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$EmptyResponse;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$InvalidResponseData;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$InvalidUri;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$MissingPayload;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$MissingTarget;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$RequestFailed;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$ServerError;", "src_main_java_com_spotify_contribution_repositoryimpl-repositoryimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public abstract class ContributionApiError extends Exception {
    public /* synthetic */ ContributionApiError(int i) {
        this();
    }

    private ContributionApiError() {
    }
}
