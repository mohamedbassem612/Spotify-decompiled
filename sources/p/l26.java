package p;

import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l26 implements SingleOnSubscribe {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m26 b;

    public /* synthetic */ l26(m26 m26Var, byte b) {
        this.a = b;
        this.b = m26Var;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        byte b = this.a;
        m26 m26Var = this.b;
        switch (b) {
            case 0:
                luk lukVar = m26Var.r;
                if (lukVar == null || !lukVar.i("apps-music-libs-eventsender.background_worker_send_on_stop")) {
                    lukVar = m26Var.s;
                }
                if (lukVar != null) {
                    lukVar.e(new k26(singleEmitter, m26Var, (byte) 1));
                }
                break;
            default:
                luk lukVar2 = m26Var.r;
                if (lukVar2 == null || !lukVar2.i("apps-music-libs-eventsender.send_events_on_bcd_event")) {
                    lukVar2 = m26Var.s;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new k26(singleEmitter, m26Var, (byte) 14));
                }
                break;
        }
    }
}
