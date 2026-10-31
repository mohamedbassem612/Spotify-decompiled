package p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetDeviceSettingsRequest;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetDeviceSettingsResponse;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$SetDeviceStreamQualityRequest;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$StatusResponse;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bah1 {
    public final v3u0 a;
    public final dt71 b = mgo1.e(0, 0, 0, 7);

    public bah1(v3u0 v3u0Var) {
        this.a = v3u0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        x9h1 x9h1Var;
        if (onmVar instanceof x9h1) {
            x9h1Var = (x9h1) onmVar;
            int i = x9h1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x9h1Var.c = i - Integer.MIN_VALUE;
            } else {
                x9h1Var = new x9h1(this, onmVar);
            }
        } else {
            x9h1Var = new x9h1(this, onmVar);
        }
        Object objJ = x9h1Var.a;
        int i2 = x9h1Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            f4u0 f4u0VarN = PlaybackSettingsEsperantoService$GetDeviceSettingsRequest.n();
            f4u0VarN.n(str);
            PlaybackSettingsEsperantoService$GetDeviceSettingsRequest playbackSettingsEsperantoService$GetDeviceSettingsRequest = (PlaybackSettingsEsperantoService$GetDeviceSettingsRequest) f4u0VarN.build();
            playbackSettingsEsperantoService$GetDeviceSettingsRequest.getClass();
            Single map = this.a.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "GetDeviceSettings", playbackSettingsEsperantoService$GetDeviceSettingsRequest).map(xj20.Y0);
            x9h1Var.c = 1;
            objJ = fc11.j(map, x9h1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        PlaybackSettingsEsperantoService$GetDeviceSettingsResponse playbackSettingsEsperantoService$GetDeviceSettingsResponse = (PlaybackSettingsEsperantoService$GetDeviceSettingsResponse) objJ;
        return (playbackSettingsEsperantoService$GetDeviceSettingsResponse.o() != l4u0.OK || playbackSettingsEsperantoService$GetDeviceSettingsResponse.n().n().o() == 0) ? ldh0.a : new mdh0(playbackSettingsEsperantoService$GetDeviceSettingsResponse.n().n().o());
    }

    public final ht20 b(String str) {
        return new ht20(new xkb1(new ycd0(this.b, str, (byte) 1), (byte) 8), new q721(str, this, (lnm) null));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i, String str, onm onmVar) {
        aah1 aah1Var;
        int i2;
        int i3;
        if (onmVar instanceof aah1) {
            aah1Var = (aah1) onmVar;
            int i4 = aah1Var.f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aah1Var.f = i4 - Integer.MIN_VALUE;
            } else {
                aah1Var = new aah1(this, onmVar);
            }
        } else {
            aah1Var = new aah1(this, onmVar);
        }
        Object objJ = aah1Var.d;
        int i5 = aah1Var.f;
        d9n d9nVar = d9n.a;
        if (i5 != 0) {
            if (i5 == 1) {
                i = aah1Var.b;
                str = aah1Var.a;
                hm5.M(objJ);
            } else {
                if (i5 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = aah1Var.c;
                hm5.M(objJ);
            }
            i2 = i3;
            return Boolean.valueOf(i2 != 0);
        }
        hm5.M(objJ);
        i4u0 i4u0VarN = PlaybackSettingsEsperantoService$SetDeviceStreamQualityRequest.n();
        i4u0VarN.n(str);
        i4u0VarN.q(i);
        PlaybackSettingsEsperantoService$SetDeviceStreamQualityRequest playbackSettingsEsperantoService$SetDeviceStreamQualityRequest = (PlaybackSettingsEsperantoService$SetDeviceStreamQualityRequest) i4u0VarN.build();
        playbackSettingsEsperantoService$SetDeviceStreamQualityRequest.getClass();
        Single map = this.a.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "SetDeviceStreamQuality", playbackSettingsEsperantoService$SetDeviceStreamQualityRequest).map(zj20.V0);
        aah1Var.a = str;
        aah1Var.b = i;
        aah1Var.f = 1;
        objJ = fc11.j(map, aah1Var);
        if (objJ != d9nVar) {
        }
        return d9nVar;
        i2 = ((PlaybackSettingsEsperantoService$StatusResponse) objJ).n() == l4u0.OK ? 1 : 0;
        if (i2 != 0) {
            w9h1 w9h1Var = new w9h1(str, i);
            aah1Var.a = null;
            aah1Var.b = i;
            aah1Var.c = i2;
            aah1Var.f = 2;
            if (this.b.emit(w9h1Var, aah1Var) != d9nVar) {
                i3 = i2;
                i2 = i3;
            }
            return d9nVar;
        }
        return Boolean.valueOf(i2 != 0);
    }
}
