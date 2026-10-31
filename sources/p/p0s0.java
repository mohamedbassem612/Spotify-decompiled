package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class p0s0 implements Consumer {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ bjx b;
    public final /* synthetic */ slc0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ p0s0(bjx bjxVar, slc0 slc0Var, int i, String str) {
        this.b = bjxVar;
        this.c = slc0Var;
        this.e = i;
        this.d = str;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        bjx bjxVar = this.b;
        switch (b) {
            case 0:
                lvc lvcVar = (lvc) bjxVar.f;
                ((g1s0) bjxVar.c).getClass();
                String strI = jup0.i(this.e);
                lvcVar.f(this.c, "Samsung", false, (String) obj, strI, this.d);
                break;
            default:
                lvc lvcVar2 = (lvc) bjxVar.f;
                ((g1s0) bjxVar.c).getClass();
                lvcVar2.a(this.c, "Samsung", (String) obj, this.d, 2, this.e);
                break;
        }
    }

    public /* synthetic */ p0s0(bjx bjxVar, slc0 slc0Var, String str, int i) {
        this.b = bjxVar;
        this.c = slc0Var;
        this.d = str;
        this.e = i;
    }
}
