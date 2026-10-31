package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jbq implements ecz0, t8n, m8b, bbg1 {
    public final daq a;
    public final teq b;

    public /* synthetic */ jbq(daq daqVar, teq teqVar) {
        this.a = daqVar;
        this.b = teqVar;
    }

    public au90 A0() {
        return this.a.J1();
    }

    public fh4 D0() {
        return new fh4(false, (luk) this.a.L1.get());
    }

    public Flowable c() {
        return (Flowable) this.a.D5.get();
    }

    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public u8n m726create() {
        return new vjq(this.a, this.b, (byte) 0);
    }

    public kt91 j() {
        return (kt91) this.a.f8.get();
    }

    public i8h1 m() {
        return (i8h1) this.a.A5.get();
    }

    public g5p0 w0() {
        return (g5p0) this.b.D4.get();
    }

    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public n8b m725create() {
        return new vjq(this.a, this.b, (byte) 1);
    }

    public cbg1 create() {
        return new vjq(this.a, this.b, (byte) 2);
    }
}
