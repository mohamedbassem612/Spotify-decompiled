package p;

import com.spotify.playlistreaction.v1.ToggleReactionsPayload;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cyz0 {
    public final iyc0 a;

    public cyz0(iyc0 iyc0Var) {
        this.a = iyc0Var;
    }

    public final Object a(String str, boolean z, b941 b941Var) {
        hze1 hze1VarN = ToggleReactionsPayload.n();
        hze1VarN.n(z);
        Object objA = iyc0.a(this.a, str, new ayc0("toggle-reactions", (phc) null, ((ToggleReactionsPayload) hze1VarN.build()).toByteString(), false, (String) null, 26), b941Var);
        return objA == d9n.a ? objA : rih1.a;
    }
}
