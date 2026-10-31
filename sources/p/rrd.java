package p;

import androidx.car.app.hardware.common.CarResultStub;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class rrd implements z321, plh0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rrd(CarResultStub carResultStub, boolean z, tcc tccVar) {
        this.b = carResultStub;
        this.a = z;
        this.c = tccVar;
    }

    @Override // p.z321
    public Object b() {
        return ((CarResultStub) this.b).lambda$onCarHardwareResult$0(this.a, (tcc) this.c);
    }

    public void f(kh70 kh70Var, int i) {
        kh70Var.f(((rlh0) this.b).c, i, ((po7) this.c).d(), this.a);
    }

    public /* synthetic */ rrd(rlh0 rlh0Var, po7 po7Var, boolean z) {
        this.b = rlh0Var;
        this.c = po7Var;
        this.a = z;
    }
}
