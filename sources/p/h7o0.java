package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class h7o0 implements Function, com.spotify.mobius.functions.Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ax8 b;

    public /* synthetic */ h7o0(ax8 ax8Var, byte b) {
        this.a = b;
        this.b = ax8Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        ax8 ax8Var = this.b;
        switch (b) {
            case 0:
                return (SingleSource) ((o5e0) obj).f(new ncn0((byte) 8), new ncn0((byte) 9), new ncn0((byte) 10), new ncn0((byte) 11), new ncn0((byte) 12), new h7o0(ax8Var, (byte) 1), new ncn0((byte) 13), new ncn0((byte) 14));
            default:
                i5e0 i5e0Var = (i5e0) obj;
                Throwable th = i5e0Var.a;
                g7o0 g7o0Var = i5e0Var.b;
                return g7o0Var != g7o0.d ? Single.just(new i5e0(th, g7o0Var)) : ((Single) ax8Var.b).map(new m6k0(th, (byte) 14));
        }
    }
}
