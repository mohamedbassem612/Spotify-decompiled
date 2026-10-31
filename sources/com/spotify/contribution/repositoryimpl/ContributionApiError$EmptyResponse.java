package com.spotify.contribution.repositoryimpl;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/contribution/repositoryimpl/ContributionApiError$EmptyResponse;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError;", "<init>", "()V", "src_main_java_com_spotify_contribution_repositoryimpl-repositoryimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ContributionApiError$EmptyResponse extends ContributionApiError {
    public static final ContributionApiError$EmptyResponse a = new ContributionApiError$EmptyResponse();

    private ContributionApiError$EmptyResponse() {
        super(0);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ContributionApiError$EmptyResponse);
    }

    public final int hashCode() {
        return -881793179;
    }

    public final String toString() {
        return "EmptyResponse";
    }
}
