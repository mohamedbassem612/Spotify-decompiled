package p;

import com.spotify.kidsgraduation.v1.GetPrivacyPolicyAcceptanceRequest;
import com.spotify.kidsgraduation.v1.PendingGraduationRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f0b0 {
    public final g0b0 a;

    public f0b0(g0b0 g0b0Var) {
        this.a = g0b0Var;
    }

    public final Single a(String str) {
        cgs0 cgs0VarN = PendingGraduationRequest.n();
        cgs0VarN.n(str);
        PendingGraduationRequest pendingGraduationRequest = (PendingGraduationRequest) cgs0VarN.build();
        pendingGraduationRequest.getClass();
        return this.a.h(pendingGraduationRequest).map(si10.i);
    }

    public final Single b() {
        vo40 vo40VarN = GetPrivacyPolicyAcceptanceRequest.n();
        vo40VarN.n();
        GetPrivacyPolicyAcceptanceRequest getPrivacyPolicyAcceptanceRequest = (GetPrivacyPolicyAcceptanceRequest) vo40VarN.build();
        getPrivacyPolicyAcceptanceRequest.getClass();
        return this.a.i(getPrivacyPolicyAcceptanceRequest).map(xi10.i);
    }
}
