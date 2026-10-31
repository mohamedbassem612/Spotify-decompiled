package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ksj1 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ ywv0 b;
    public final /* synthetic */ muj1 c;
    public final /* synthetic */ msj1 d;
    public final /* synthetic */ nuj1 e;
    public final /* synthetic */ ouj1 f;
    public final /* synthetic */ ou80 g;
    public final /* synthetic */ tgt0 h;
    public final /* synthetic */ gn10 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksj1(ywv0 ywv0Var, muj1 muj1Var, msj1 msj1Var, nuj1 nuj1Var, ouj1 ouj1Var, ou80 ou80Var, tgt0 tgt0Var, gn10 gn10Var, lnm lnmVar) {
        super(1, lnmVar);
        this.b = ywv0Var;
        this.c = muj1Var;
        this.d = msj1Var;
        this.e = nuj1Var;
        this.f = ouj1Var;
        this.g = ou80Var;
        this.h = tgt0Var;
        this.i = gn10Var;
    }

    public final lnm create(lnm lnmVar) {
        return new ksj1(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object next;
        tgt0 tgt0Var;
        msj1 msj1Var = this.d;
        vku vkuVar = msj1Var.j;
        boolean z = this.a;
        ywv0 ywv0Var = this.b;
        muj1 muj1Var = this.c;
        if (!z) {
            hm5.M(obj);
            String str = ((huj1) muj1Var).b;
            this.a = true;
            obj = ywv0Var.c(str, this);
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
        if (u890.j(ndj1Var, ndj1.c)) {
            vkuVar.c();
            huj1 huj1Var = (huj1) muj1Var;
            ou80 ou80Var = this.g;
            String str2 = ou80Var != null ? ou80Var.a : null;
            Iterator it = this.f.d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((gi90) next).e, huj1Var.b));
            gi90 gi90Var = (gi90) next;
            usd usdVar = usd.a;
            usd usdVar2 = gi90Var != null ? gi90Var.f16p : usdVar;
            usd usdVar3 = usd.b;
            if (usdVar2 == usdVar3) {
                String str3 = this.e.a.equals("unmapped-video-preview-artist-page") ? "video-preview-carousel-artist-unmapped" : this.i.a;
                tgt0Var = new tgt0(PlayOrigin.builder(str3).featureVersion(msj1Var.e).viewUri(msj1Var.i.a).referrerIdentifier(str3).build());
            } else {
                tgt0Var = this.h;
            }
            LoggingParams.Builder builder = LoggingParams.builder();
            y6r0 y6r0Var = msj1Var.b.get();
            String str4 = y6r0Var != null ? y6r0Var.a : null;
            if (str4 == null) {
                str4 = "";
            }
            LoggingParams.Builder builderPageInstanceId = builder.pageInstanceId(str4);
            if (str2 != null) {
                builderPageInstanceId.getClass();
                builderPageInstanceId.interactionId(str2);
            }
            PlayCommand.Builder builderLoggingParams = PlayCommand.builder(Context.fromUri(huj1Var.b).toBuilder().metadata(usdVar2 == usdVar3 ? Collections.singletonMap("has_video", "true") : sqg0.J(new mmr0[]{new mmr0("has_video", "true"), new mmr0("is_single_track_video_content", "true")})).build(), tgt0Var.a).loggingParams(builderPageInstanceId.build());
            if (usdVar2 == usdVar) {
                builderLoggingParams.options(PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUri(huj1Var.b).build()).build());
            }
            vkuVar.a(ywv0Var.h(builderLoggingParams.build(), huj1Var.b, ou80Var));
            String str5 = huj1Var.b;
        } else if (!u890.j(ndj1Var, ndj1.b) && !u890.j(ndj1Var, ndj1.a)) {
            eg.o();
            return null;
        }
        return rih1.a;
    }
}
