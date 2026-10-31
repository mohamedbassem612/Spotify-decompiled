package p;

import java.util.Collections;
import spotify.playlist.esperanto.proto.LensDefinition;
import spotify.playlist.esperanto.proto.PlaylistLensRequest;
import spotify.playlist.esperanto.proto.PlaylistLensResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wyc0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ xyc0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyc0(xyc0 xyc0Var, String str, boolean z, String str2, boolean z2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = xyc0Var;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = z2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new wyc0(this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        String str = this.c;
        if (!z) {
            hm5.M(obj);
            jn7 jn7Var = this.b.d;
            wou0 wou0VarO = PlaylistLensRequest.o();
            wou0VarO.q(str);
            z2c0 z2c0VarN = LensDefinition.n();
            z2c0VarN.n(this.d);
            z2c0VarN.q(this.e);
            z2c0VarN.r(this.f);
            wou0VarO.n(Collections.singletonList(z2c0VarN.build()));
            PlaylistLensRequest playlistLensRequestBuild = wou0VarO.build();
            this.a = true;
            obj = jn7Var.g0(playlistLensRequestBuild, this);
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
        return i2x0.l(((PlaylistLensResponse) obj).o(), str, fnc0.O0);
    }
}
