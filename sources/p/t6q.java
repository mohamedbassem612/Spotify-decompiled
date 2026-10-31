package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t6q implements fl3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ t6q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final k2q a(String str, Flowable flowable) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                s7q s7qVar = (s7q) r7qVar.d;
                return new k2q((hl3) s7qVar.l9.get(), (x4q) s7qVar.m9.get(), str, flowable);
            default:
                teq teqVar = ((thq) r7qVar).c;
                return new k2q((hl3) teqVar.b.vb.get(), (x4q) teqVar.b.wb.get(), str, flowable);
        }
    }
}
