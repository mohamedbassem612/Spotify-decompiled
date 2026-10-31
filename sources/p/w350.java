package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w350 implements zii0 {
    public final /* synthetic */ x350 a;

    public w350(x350 x350Var) {
        this.a = x350Var;
    }

    public final void onMeetingStatusChange(yii0 yii0Var) {
        Logger.b("[LiveSharing] Meeting status received: " + yii0Var + ".", new Object[0]);
        x350 x350Var = this.a;
        ldn1 ldn1Var = (ldn1) yii0Var;
        x350Var.f.onNext(ldn1Var.a);
        x350Var.g.onNext(ldn1Var.b.a);
    }
}
