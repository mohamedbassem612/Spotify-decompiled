package p;

import android.util.CloseGuard;
import android.view.autofill.AutofillValue;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class c9r implements hc10, jn10, Function {
    public static final c9r b = new c9r(0);
    public static final c9r c = new c9r(1);
    public static final c9r d = new c9r(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ c9r(byte b2) {
        this.a = b2;
    }

    public static /* bridge */ /* synthetic */ CloseGuard e(Object obj) {
        return (CloseGuard) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue h(Object obj) {
        return (AutofillValue) obj;
    }

    public Object a(Object obj, Object obj2) {
        switch (this.a) {
            case 9:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new e73((byte) 0);
            case 10:
                bct bctVar = (bct) obj2;
                ((qop) obj).getClass();
                bctVar.getClass();
                return new g73(bctVar.d, new nu((byte) 6));
            case 11:
                bct bctVar2 = (bct) obj2;
                ((qop) obj).getClass();
                bctVar2.getClass();
                return new g73(bctVar2.d, new d83((byte) 0));
            case 12:
                ((qop) obj).getClass();
                ((pbt) obj2).getClass();
                return new q93((byte) 0);
            default:
                ((c8c0) obj).getClass();
                ((izu0) obj2).getClass();
                return new ic3((byte) 0);
        }
    }

    public Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        if (!playerState.isPlaying() || playerState.isPaused()) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(playerState.audioStream() == AudioStream.ALARM);
    }

    public List b(String str, boolean z, boolean z2) {
        return hkh0.f(str, z, z2);
    }

    @Override // p.hc10
    public ec10[] g() {
        switch (this.a) {
            case 3:
                return new ec10[]{new ta()};
            case 4:
                return new ec10[]{new va()};
            default:
                return new ec10[]{new p72(0)};
        }
    }

    public void i(boolean z) {
        if (z) {
            wwg wwgVar = wwg.a;
            if (dhn.a.contains(wwg.class)) {
                return;
            }
            try {
                wwg.f.set(true);
                return;
            } catch (Throwable th) {
                dhn.a(wwg.class, th);
                return;
            }
        }
        wwg wwgVar2 = wwg.a;
        if (dhn.a.contains(wwg.class)) {
            return;
        }
        try {
            wwg.f.set(false);
        } catch (Throwable th2) {
            dhn.a(wwg.class, th2);
        }
    }
}
