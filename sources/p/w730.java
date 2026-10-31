package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface w730 {
    @pr50(hasBody = true, method = "DELETE", path = "socialgraph/v2/dismissed?format=json")
    Single<sy21<uz21>> a(@elb ord1 ord1Var);

    @wyq0("socialgraph/v2/counts?format=json")
    Single<mbn> b(@elb ord1 ord1Var);

    @pr50(hasBody = true, method = "DELETE", path = "socialgraph/v2/following?format=json")
    Single<sy21<uz21>> c(@elb ord1 ord1Var);

    @wyq0("socialgraph/v2/dismissed?format=json")
    Single<sy21<uz21>> d(@elb ord1 ord1Var);

    @wyq0("socialgraph/v2/following?format=json")
    Single<sy21<uz21>> e(@elb ord1 ord1Var);
}
