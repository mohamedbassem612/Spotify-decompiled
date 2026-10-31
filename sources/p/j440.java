package p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j440 extends ov61 {
    public final v3u0 a;
    public final lt20 b = new lt20(new yc2(new m441(new xe2(this, (lnm) null, (byte) 2)), (byte) 11), new i440(3, null, (byte) 0), (byte) 0);

    public j440(v3u0 v3u0Var) {
        this.a = v3u0Var;
    }

    public final mr20 getValue() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setValue(Boolean bool, boolean z, tv80 tv80Var, lnm lnmVar) {
        f440 f440Var;
        if (lnmVar instanceof f440) {
            f440Var = (f440) lnmVar;
            int i = f440Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f440Var.d = i - Integer.MIN_VALUE;
            } else {
                f440Var = new f440(this, (onm) lnmVar);
            }
        } else {
            f440Var = new f440(this, (onm) lnmVar);
        }
        Object obj = f440Var.b;
        int i2 = f440Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                v3u0 v3u0Var = this.a;
                j4u0 j4u0VarQ = PlaybackSettingsEsperantoService.SetSettingsRequest.q();
                d4u0 d4u0VarN = PlaybackSettingsEsperantoService.FieldUpdate.n();
                d4u0VarN.n(c4u0.X);
                e4u0 e4u0VarN = PlaybackSettingsEsperantoService.FieldValue.n();
                e4u0VarN.n(z);
                d4u0VarN.q(e4u0VarN.build());
                j4u0VarQ.r(d4u0VarN.build());
                Single map = v3u0Var.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "SetSettings", j4u0VarQ.build()).map(ak20.V0);
                f440Var.a = z;
                f440Var.d = 1;
                Object objJ = fc11.j(map, f440Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = f440Var.a;
                hm5.M(obj);
            }
            return new it61(Boolean.valueOf(z));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new ht61((Integer) null, 0);
        }
    }

    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), tv80Var, lnmVar);
    }
}
