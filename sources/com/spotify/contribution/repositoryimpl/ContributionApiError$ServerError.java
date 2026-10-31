package com.spotify.contribution.repositoryimpl;

import kotlin.Metadata;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/contribution/repositoryimpl/ContributionApiError$ServerError;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError;", "src_main_java_com_spotify_contribution_repositoryimpl-repositoryimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ContributionApiError$ServerError extends ContributionApiError {
    public final int a;
    public final String b;

    public ContributionApiError$ServerError(int i, String str) {
        super(0);
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContributionApiError$ServerError)) {
            return false;
        }
        ContributionApiError$ServerError contributionApiError$ServerError = (ContributionApiError$ServerError) obj;
        return this.a == contributionApiError$ServerError.a && u890.j(this.b, contributionApiError$ServerError.b);
    }

    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
