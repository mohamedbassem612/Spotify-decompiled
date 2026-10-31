package com.spotify.contribution.repositoryimpl;

import com.spotify.campfire.contribution.proto.v1.ErrorStatus;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class b {
    public static final ContributionApiError$ServerError a(ErrorStatus errorStatus) {
        return new ContributionApiError$ServerError(errorStatus.n(), errorStatus.getMessage());
    }
}
