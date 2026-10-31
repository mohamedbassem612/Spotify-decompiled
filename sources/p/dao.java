package p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import com.spotify.wrapped.v1.proto.StoryCard;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dao extends ov61 {
    public final v3u0 a;
    public final lt20 b = new lt20(new yc2(new m441(new wt(this, (lnm) null, (byte) 28)), (byte) 5), new re1(3, null, 16), (byte) 0);

    public dao(v3u0 v3u0Var) {
        this.a = v3u0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, onm onmVar) {
        z9o z9oVar;
        if (onmVar instanceof z9o) {
            z9oVar = (z9o) onmVar;
            int i2 = z9oVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z9oVar.d = i2 - Integer.MIN_VALUE;
            } else {
                z9oVar = new z9o(this, onmVar);
            }
        } else {
            z9oVar = new z9o(this, onmVar);
        }
        Object obj = z9oVar.b;
        int i3 = z9oVar.d;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                if (i < 0) {
                    return new ht61((Integer) null, 0);
                }
                ArrayList arrayList = new ArrayList();
                d4u0 d4u0VarN = PlaybackSettingsEsperantoService.FieldUpdate.n();
                d4u0VarN.n(c4u0.Y);
                e4u0 e4u0VarN = PlaybackSettingsEsperantoService.FieldValue.n();
                e4u0VarN.n(i > 0);
                d4u0VarN.q(e4u0VarN.build());
                arrayList.add(d4u0VarN.build());
                if (i > 0) {
                    d4u0 d4u0VarN2 = PlaybackSettingsEsperantoService.FieldUpdate.n();
                    d4u0VarN2.n(c4u0.Z);
                    e4u0 e4u0VarN2 = PlaybackSettingsEsperantoService.FieldValue.n();
                    e4u0VarN2.q(i * StoryCard.CLASSIC_CONTENT_FIELD_NUMBER);
                    d4u0VarN2.q(e4u0VarN2.build());
                    arrayList.add(d4u0VarN2.build());
                }
                v3u0 v3u0Var = this.a;
                j4u0 j4u0VarQ = PlaybackSettingsEsperantoService.SetSettingsRequest.q();
                j4u0VarQ.n(arrayList);
                Single map = v3u0Var.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "SetSettings", j4u0VarQ.build()).map(ak20.V0);
                z9oVar.a = i;
                z9oVar.d = 1;
                Object objJ = fc11.j(map, z9oVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = z9oVar.a;
                hm5.M(obj);
            }
            return new it61(new Integer(i));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new ht61((Integer) null, 0);
        }
    }

    public final mr20 getValue() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        return a(((Number) obj2).intValue(), (onm) lnmVar);
    }
}
