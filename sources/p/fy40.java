package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fy40 implements Consumer {
    public final /* synthetic */ gy40 a;
    public final /* synthetic */ w8l b;
    public final /* synthetic */ t45 c;

    public fy40(gy40 gy40Var, w8l w8lVar, t45 t45Var) {
        this.a = gy40Var;
        this.b = w8lVar;
        this.c = t45Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        w8l w8lVar = this.b;
        gy40 gy40Var = this.a;
        gy40.b(gy40Var, w8lVar);
        t45 t45Var = this.c;
        t45Var.g("create_bluetooth_socket");
        ((s45) gy40.a(gy40Var)).b(t45Var.e());
    }
}
