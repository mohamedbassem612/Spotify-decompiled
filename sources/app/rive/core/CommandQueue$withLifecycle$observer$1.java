package app.rive.core;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import p.iac0;
import p.l811;
import p.o5s;
import p.p811;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"app/rive/core/CommandQueue$withLifecycle$observer$1", "Lp/o5s;", "Lp/iac0;", "owner", "Lp/rih1;", "onResume", "(Lp/iac0;)V", "onPause", "onDestroy", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class CommandQueue$withLifecycle$observer$1 implements o5s {
    final /* synthetic */ l811 $audioAcquired;
    final /* synthetic */ p811 $onClose;

    public CommandQueue$withLifecycle$observer$1(l811 l811Var, p811 p811Var) {
        this.$audioAcquired = l811Var;
        this.$onClose = p811Var;
    }

    @Override // p.o5s
    public /* bridge */ /* synthetic */ void onCreate(iac0 iac0Var) {
    }

    @Override // p.o5s
    public void onDestroy(iac0 owner) {
        Object obj = this.$onClose.a;
        if (obj != null) {
            ((CloseOnce) obj).close();
        } else {
            u890.C("onClose");
            throw null;
        }
    }

    @Override // p.o5s
    public void onPause(iac0 owner) {
        if (this.$audioAcquired.a) {
            AudioEngine.INSTANCE.release();
            this.$audioAcquired.a = false;
        }
    }

    @Override // p.o5s
    public void onResume(iac0 owner) {
        if (this.$audioAcquired.a) {
            return;
        }
        AudioEngine.INSTANCE.acquire();
        this.$audioAcquired.a = true;
    }

    @Override // p.o5s
    public /* bridge */ /* synthetic */ void onStart(iac0 iac0Var) {
    }

    @Override // p.o5s
    public /* bridge */ /* synthetic */ void onStop(iac0 iac0Var) {
    }
}
