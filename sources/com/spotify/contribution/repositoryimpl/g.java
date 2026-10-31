package com.spotify.contribution.repositoryimpl;

import com.spotify.campfire.contribution.proto.v1.BatchGetContributionsRequest;
import com.spotify.campfire.contribution.proto.v1.BatchGetContributionsResponse;
import com.spotify.campfire.contribution.proto.v1.Contribution;
import com.spotify.campfire.contribution.proto.v1.ContributionFilters;
import com.spotify.campfire.contribution.proto.v1.ContributionPagination;
import com.spotify.campfire.contribution.proto.v1.GetContributionsRequest;
import com.spotify.campfire.contribution.proto.v1.GetContributionsResponse;
import com.spotify.campfire.contribution.proto.v1.GetContributionsResult;
import java.util.ArrayList;
import p.alr0;
import p.cm40;
import p.cqm;
import p.d9n;
import p.eg;
import p.fga;
import p.h290;
import p.hm5;
import p.ium;
import p.lqm;
import p.lvm;
import p.onm;
import p.q7h;
import p.ykr0;
import p.zkr0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g implements ykr0 {
    public final cqm a;

    public g(cqm cqmVar) {
        this.a = cqmVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.contribution.repositoryimpl.ContributionApiError */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(lvm lvmVar, lqm lqmVar, int i, String str, onm onmVar) throws ContributionApiError {
        zkr0 zkr0Var;
        if (onmVar instanceof zkr0) {
            zkr0Var = (zkr0) onmVar;
            int i2 = zkr0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zkr0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                zkr0Var = new zkr0(this, onmVar);
            }
        } else {
            zkr0Var = new zkr0(this, onmVar);
        }
        Object objD = zkr0Var.a;
        int i3 = zkr0Var.c;
        if (i3 == 0) {
            hm5.M(objD);
            ium iumVarN = ContributionPagination.n();
            iumVarN.n(i);
            if (str != null) {
                iumVarN.q(str);
            }
            ContributionPagination contributionPagination = (ContributionPagination) iumVarN.build();
            fga fgaVarQ = BatchGetContributionsRequest.q();
            cm40 cm40VarN = GetContributionsRequest.n();
            cm40VarN.r(h.h(lvmVar));
            ContributionFilters contributionFiltersF = h.f(lqmVar);
            if (contributionFiltersF != null) {
                cm40VarN.n(contributionFiltersF);
            }
            cm40VarN.q(contributionPagination);
            fgaVarQ.q((GetContributionsRequest) cm40VarN.build());
            BatchGetContributionsRequest batchGetContributionsRequestBuild = fgaVarQ.build();
            batchGetContributionsRequestBuild.getClass();
            zkr0Var.c = 1;
            objD = this.a.d(batchGetContributionsRequestBuild, zkr0Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        BatchGetContributionsResponse batchGetContributionsResponse = (BatchGetContributionsResponse) objD;
        if (batchGetContributionsResponse.o() == 0) {
            throw ContributionApiError$EmptyResponse.a;
        }
        GetContributionsResponse getContributionsResponseN = batchGetContributionsResponse.n();
        if (getContributionsResponseN.q()) {
            throw new ContributionApiError$ServerError(getContributionsResponseN.o().n(), getContributionsResponseN.o().getMessage());
        }
        GetContributionsResult getContributionsResultN = getContributionsResponseN.n();
        h290<Contribution> h290VarN = getContributionsResultN.n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (Contribution contribution : h290VarN) {
            contribution.getClass();
            arrayList.add(h.a(contribution));
        }
        return new alr0(arrayList, getContributionsResultN.p() ? getContributionsResultN.getNextPageToken() : null);
    }
}
