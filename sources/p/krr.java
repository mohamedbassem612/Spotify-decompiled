package p;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class krr extends CountDownTimer {
    public final /* synthetic */ her a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krr(long j, her herVar) {
        super(j, 1000L);
        this.a = herVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        jnq jnqVar = (jnq) ((h98) this.a.b).b;
        ((r4u) jnqVar.d).e(new jan(0L, 0L, 0L, 0L));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        long j2 = j / 86400000;
        long j3 = j % 86400000;
        long j4 = j3 / 3600000;
        long j5 = j3 % 3600000;
        ((r4u) ((jnq) ((h98) this.a.b).b).d).e(new jan(j2, j4, j5 / 60000, (j5 % 60000) / 1000));
    }
}
