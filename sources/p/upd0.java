package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class upd0 implements wpw {
    public final /* synthetic */ byte a;
    public final poy0 b;
    public final nsw c;
    public final eih1 d;

    public upd0(Flowable flowable, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = y3o1.Y(flowable, god0.X, x5d0.O0, (iu30) null, 24);
                this.c = jch0.j(i2d0.e1);
                this.d = new eih1();
                break;
            case 2:
                this.b = y3o1.Y(flowable, kex0.O0, gbw0.Q0, (iu30) null, 24);
                this.c = jch0.j(nzv0.Y0);
                this.d = new eih1();
                break;
            default:
                this.b = y3o1.Y(flowable, god0.t, x5d0.N0, (iu30) null, 24);
                this.c = jch0.j(i2d0.d1);
                this.d = new eih1();
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d;
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b;
    }
}
