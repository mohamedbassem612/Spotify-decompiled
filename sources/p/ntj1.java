package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ntj1 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ ywv0 b;
    public final /* synthetic */ ktj1 c;
    public final /* synthetic */ tgt0 d;
    public final /* synthetic */ ou80 e;
    public final /* synthetic */ bjx0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntj1(ywv0 ywv0Var, ktj1 ktj1Var, tgt0 tgt0Var, ou80 ou80Var, bjx0 bjx0Var, lnm lnmVar) {
        super(1, lnmVar);
        this.b = ywv0Var;
        this.c = ktj1Var;
        this.d = tgt0Var;
        this.e = ou80Var;
        this.f = bjx0Var;
    }

    public final lnm create(lnm lnmVar) {
        return new ntj1(this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        ywv0 ywv0Var = this.b;
        vku vkuVar = (vku) ywv0Var.i;
        ywv0 ywv0Var2 = (ywv0) ywv0Var.f;
        boolean z = this.a;
        ktj1 ktj1Var = this.c;
        if (!z) {
            hm5.M(obj);
            String str = ((etj1) ktj1Var).b;
            this.a = true;
            obj = ywv0Var2.c(str, this);
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
        ndj1 ndj1Var = (ndj1) obj;
        boolean zJ = u890.j(ndj1Var, ndj1.c);
        bjx0 bjx0Var = this.f;
        if (zJ) {
            LoggingParams.Builder builder = LoggingParams.builder();
            y6r0 y6r0Var = ((b7r0) ywv0Var.a).get();
            String str2 = y6r0Var != null ? y6r0Var.a : null;
            if (str2 == null) {
                str2 = "";
            }
            LoggingParams.Builder builderPageInstanceId = builder.pageInstanceId(str2);
            ou80 ou80Var = this.e;
            if (ou80Var != null) {
                builderPageInstanceId.interactionId(ou80Var.a);
            }
            LoggingParams loggingParamsBuild = builderPageInstanceId.build();
            vkuVar.c();
            etj1 etj1Var = (etj1) ktj1Var;
            vkuVar.a(ywv0Var2.h(PlayCommand.builder(Context.fromUri(etj1Var.b).toBuilder().metadata(sqg0.J(new mmr0[]{new mmr0("has_video", "true"), new mmr0("is_single_track_video_content", "true")})).build(), this.d.a).loggingParams(loggingParamsBuild).options(PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUri(etj1Var.b).build()).build()).build(), etj1Var.b, ou80Var));
            String str3 = etj1Var.b;
            bjx0Var.getClass();
        } else {
            if (!u890.j(ndj1Var, ndj1.b) && !u890.j(ndj1Var, ndj1.a)) {
                eg.o();
                return null;
            }
            bjx0Var.getClass();
        }
        return rih1.a;
    }
}
