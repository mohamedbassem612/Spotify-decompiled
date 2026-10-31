package p;

import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class am51 implements wpw {
    public final FlowableDistinctUntilChanged a;
    public final Flowable b;
    public final w9u0 c;
    public final im51 d;
    public final poy0 e;
    public final ia00 f;
    public final nsw g;

    public am51(FlowableMap flowableMap, FlowableDistinctUntilChanged flowableDistinctUntilChanged, Flowable flowable, Flowable flowable2, w9u0 w9u0Var, yp91 yp91Var, im51 im51Var, kn4 kn4Var) {
        this.a = flowableDistinctUntilChanged;
        this.b = flowable2;
        this.c = w9u0Var;
        this.d = im51Var;
        this.e = y3o1.Y(Flowable.g(flowableMap, flowable, kn4Var.a() ? Flowable.I(vp91.a) : yp91Var.c, flowable2, i5x0.i), th51.Z, jh31.Z0, new mn41(this, (byte) 14), 8);
        this.f = n3o1.q(this).a(v451.R0, v451.S0);
        this.g = jch0.j(v451.T0);
    }

    public static j9u0 e(long j, SeekToCommand.Relative relative, String str) {
        SeekToCommand.Builder builder = SeekToCommand.builder(j);
        CommandOptions.Builder builder2 = CommandOptions.builder();
        if (str != null) {
            builder2.getClass();
            builder2.onlyForPlaybackId(str);
        }
        return new j9u0(builder.options(builder2.build()).relative(relative).build());
    }

    public final rqw a() {
        return this.f;
    }

    public final rsw c() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
