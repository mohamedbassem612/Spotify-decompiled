package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/nwv0;", "Lp/uim0;", "Lp/owv0;", "src_main_java_com_spotify_signalling_uiusecases_premium-premium"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class nwv0 extends uim0 {
    public final hw61 a;

    public nwv0(hw61 hw61Var) {
        this.a = hw61Var;
    }

    public final pim0 a() {
        owv0 owv0Var = new owv0();
        owv0Var.O0 = this.a;
        owv0Var.P0 = u7h.k;
        owv0Var.Q0 = z6x.a;
        return owv0Var;
    }

    public final void b(pim0 pim0Var) {
        ((owv0) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nwv0) && this.a.equals(((nwv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
