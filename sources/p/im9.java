package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class im9 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ rm9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im9(rm9 rm9Var, String str, String str2, String str3, lnm lnmVar) {
        super(2, lnmVar);
        this.b = rm9Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new im9(this.b, this.c, this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        try {
            if (!z) {
                hm5.M(obj);
                rm9 rm9Var = this.b;
                muz muzVarD = rm9Var.d.a(rm9Var.e).d();
                PlayCommand.Builder builder = PlayCommand.builder(Context.fromUri(this.c), PlayOrigin.builder("byom").build());
                PreparePlayOptions.Builder builderAlwaysPlaySomething = PreparePlayOptions.builder().alwaysPlaySomething(true);
                String str = this.d;
                if (str != null) {
                    builderAlwaysPlaySomething.skipTo(SkipToTrack.fromUri(str));
                }
                PlayCommand.Builder builderOptions = builder.options(builderAlwaysPlaySomething.build());
                String str2 = this.e;
                if (str2 != null) {
                    builderOptions.loggingParams(LoggingParams.builder().interactionId(str2).build());
                }
                Single singleA = muzVarD.a(builderOptions.build());
                this.a = true;
                obj = fc11.j(singleA, this);
                d9n d9nVar = d9n.a;
                if (obj == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            obj.getClass();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return rih1.a;
    }
}
