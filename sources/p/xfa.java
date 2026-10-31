package p;

import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xfa extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xfa(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x00ce  */
    public final Object invoke(Object obj) {
        w7h1 w7h1VarK;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                zga zgaVar = (zga) obj;
                return new sgg1(new uv8(zgaVar, (byte) 26), zgaVar.b(str));
            case 1:
                b261.n((e261) obj, str);
                return rih1Var;
            case 2:
                b261.u((e261) obj, str);
                return rih1Var;
            case 3:
                e261 e261Var = (e261) obj;
                if (str != null) {
                    b261.n(e261Var, str);
                }
                return rih1Var;
            case 4:
                return new vh20(str, new tdr0(new Exception(((jy21) obj).b())));
            case 5:
                blo1.u((n161) obj, str);
                return rih1Var;
            case 6:
                return Boolean.valueOf(u890.j(((qvc0) obj).a(), str));
            default:
                s7b1 s7b1VarV = ((kb61) obj).V();
                vku vkuVar = s7b1VarV.d;
                if (!s7b1VarV.e.get()) {
                    n57.e("Called outside of the lifecycle");
                }
                w9u0 w9u0VarA = ((tau0) s7b1VarV.a.get()).a();
                nqk0 nqk0VarQ = s7b1VarV.c.h().h().q();
                switch (str) {
                    case "com.spotify.music.feature.widget.PAUSE":
                        vkuVar.a(w9u0VarA.a(q9u0.c("SpotifyWidgetPlayerService", false)).subscribe());
                        w7h1VarK = nqk0VarQ.p().k("");
                        ((i8h1) s7b1VarV.b.get()).m(w7h1VarK, (xj61) null);
                    case "com.spotify.music.feature.widget.RESUME":
                        vkuVar.a(w9u0VarA.a(q9u0.e("SpotifyWidgetPlayerService", false)).subscribe());
                        w7h1VarK = nqk0VarQ.p().l("");
                        ((i8h1) s7b1VarV.b.get()).m(w7h1VarK, (xj61) null);
                    case "com.spotify.music.feature.widget.SKIP_NEXT":
                        vkuVar.a(w9u0VarA.a(q9u0.j()).subscribe());
                        w7h1VarK = nqk0VarQ.r().m();
                        ((i8h1) s7b1VarV.b.get()).m(w7h1VarK, (xj61) null);
                    case "com.spotify.music.feature.widget.SKIP_PREV":
                        vkuVar.a(w9u0VarA.a(q9u0.l(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build())).subscribe());
                        w7h1VarK = nqk0VarQ.s().n();
                        ((i8h1) s7b1VarV.b.get()).m(w7h1VarK, (xj61) null);
                    default:
                        n57.e("SpotifyWidgetPlayerService cannot handle ".concat(str));
                }
        }
    }
}
