package p;

import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import io.reactivex.rxjava3.functions.Function;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cx01 implements Function {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ gx01 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ tv80 e;
    public final /* synthetic */ String f;

    public cx01(gx01 gx01Var, String str, String str2, String str3, tv80 tv80Var) {
        this.b = gx01Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.e = tv80Var;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                gx01 gx01Var = this.b;
                q7j0 q7j0Var = gx01Var.h;
                q8n q8nVar = gx01Var.k;
                String str = this.f;
                boolean zB = q7j0Var.b(str);
                String str2 = this.d;
                tv80 tv80Var = this.e;
                if (zB) {
                    return j2h1.D(q8nVar, new glu0(gx01Var, str2, tv80Var, (lnm) null, (byte) 29));
                }
                return q7j0.c(str) ? gx01Var.a(str).flatMapCompletable(new cx01(gx01Var, str, str2, tv80Var, this.c)) : j2h1.D(q8nVar, new glu0(gx01Var, str2, tv80Var, (lnm) null, (byte) 29));
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str3 = this.d;
                gx01 gx01Var2 = this.b;
                if (!zBooleanValue) {
                    g7h g7hVar = gx01Var2.i;
                    gx01Var2.h.a();
                    return g7hVar.a("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", Collections.singletonList(str3), false).map(new t4o(str3, (byte) 9)).flatMapCompletable(new l0x0(gx01Var2, str3, this.e, (byte) 25));
                }
                rsc0 rsc0Var = gx01Var2.d;
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
                vwu0VarR.x();
                hru0VarS.y(vwu0VarR.build());
                return yoi1.i(rsc0Var.m(this.c, str3, hru0VarS.build()), o6x.a).firstOrError().map(rdx0.d).flatMapCompletable(new ytp0(this.b, this.d, this.c, this.e, this.f, (byte) 25));
        }
    }

    public cx01(gx01 gx01Var, String str, String str2, tv80 tv80Var, String str3) {
        this.b = gx01Var;
        this.c = str;
        this.d = str2;
        this.e = tv80Var;
        this.f = str3;
    }
}
