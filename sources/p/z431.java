package p;

import com.google.protobuf.Duration;
import com.spotify.musicquizservice.v1.GetResultsRequest;
import com.spotify.musicquizservice.v1.GetResultsResponse;
import com.spotify.musicquizservice.v1.LottieAnimation;
import com.spotify.musicquizservice.v1.Result;
import com.spotify.musicquizservice.v1.ResultAnimations;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z431 {
    public final g631 a;

    public z431(g631 g631Var) {
        this.a = g631Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[PHI: r6
      0x005d: PHI (r6v2 int) = (r6v1 int), (r6v4 int) binds: [B:12:0x0052, B:17:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    public static o531 b(GetResultsResponse getResultsResponse) {
        String strU = getResultsResponse.u();
        String strV = getResultsResponse.v();
        ggi1 ggi1VarC = c(getResultsResponse.w());
        int iQ = getResultsResponse.q();
        int i = iQ == 0 ? -1 : x431.b[l1d.C(iQ)];
        int i2 = 1;
        yap1 syhVar = tyh.c;
        if (i != 1) {
            int i3 = 2;
            if (i == 2) {
                ggi1 ggi1VarC2 = c(getResultsResponse.p().o());
                String strP = getResultsResponse.p().p();
                int i4 = x431.a[getResultsResponse.p().q().ordinal()];
                if (i4 == 1) {
                    i2 = i3;
                } else if (i4 == 2) {
                    i2 = 3;
                } else if (i4 != 3) {
                    i3 = 4;
                    if (i4 == 4) {
                        i2 = i3;
                    }
                }
                syhVar = new syh(new ice(ggi1VarC2, strP, i2, new kce(getResultsResponse.p().r().o())));
            }
        }
        yap1 yap1Var = syhVar;
        String strO = getResultsResponse.o();
        boolean zR = getResultsResponse.r();
        ResultAnimations resultAnimationsN = getResultsResponse.n();
        LottieAnimation lottieAnimationP = resultAnimationsN.p();
        pbf0 pbf0Var = new pbf0(lottieAnimationP.p(), lottieAnimationP.o());
        LottieAnimation lottieAnimationN = resultAnimationsN.n();
        q331 q331Var = new q331(pbf0Var, new pbf0(lottieAnimationN.p(), lottieAnimationN.o()));
        boolean zS = getResultsResponse.s();
        String strT = getResultsResponse.t();
        strT.getClass();
        if (ihc1.y0(strT)) {
            strT = null;
        }
        return new o531(strU, strV, ggi1VarC, yap1Var, strO, zR, q331Var, zS, strT);
    }

    public static ggi1 c(Result result) {
        Integer numValueOf;
        int iO = result.p().o();
        if (result.q()) {
            Duration durationN = result.n();
            numValueOf = Integer.valueOf((int) (((((long) durationN.o()) / 1000000) + TimeUnit.SECONDS.toMillis(durationN.p())) / 1000));
        } else {
            numValueOf = null;
        }
        return new ggi1(numValueOf, iO);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(String str, onm onmVar) {
        y431 y431Var;
        if (onmVar instanceof y431) {
            y431Var = (y431) onmVar;
            int i = y431Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y431Var.c = i - Integer.MIN_VALUE;
            } else {
                y431Var = new y431(this, onmVar);
            }
        } else {
            y431Var = new y431(this, onmVar);
        }
        Object objA = y431Var.a;
        int i2 = y431Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                tp40 tp40VarN = GetResultsRequest.n();
                tp40VarN.n(str);
                GetResultsRequest getResultsRequest = (GetResultsRequest) tp40VarN.build();
                g631 g631Var = this.a;
                getResultsRequest.getClass();
                y431Var.c = 1;
                objA = g631Var.a(getResultsRequest, y431Var);
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
            if (sy21Var.a.Q0) {
                Object obj = sy21Var.b;
                if (obj != null) {
                    return b((GetResultsResponse) obj);
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new m231(new Exception("Failed to get results: HTTP " + sy21Var.a.d));
        } catch (Exception e) {
            return new m231(e);
        }
    }
}
