package p;

import com.spotify.mobius.Connection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class otj implements Connection {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h8l b;

    public /* synthetic */ otj(h8l h8lVar, byte b) {
        this.a = b;
        this.b = h8lVar;
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        byte b = this.a;
        x700 x700Var = this.b;
        switch (b) {
            case 0:
                rtj.c((rtj) x700Var).m(obj);
                break;
            default:
                x700 x700Var2 = x700Var;
                w8e0 w8e0VarA = ((hpz0) obj).a();
                if (w8e0VarA instanceof x8e0) {
                    x700.b(x700Var2).a(ee70.b());
                } else if (w8e0VarA instanceof w8e0) {
                    x700.b(x700Var2).a(w8e0VarA.z());
                } else if (!(w8e0VarA instanceof y8e0)) {
                    eg.o();
                } else {
                    x700.b(x700Var2).a(((y8e0) w8e0VarA).z());
                }
                break;
        }
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        switch (this.a) {
            case 0:
                rtj rtjVar = this.b;
                rtj.b(rtjVar).setValue(Boolean.FALSE);
                rtj.d(rtjVar);
                break;
        }
    }

    private final void a() {
    }
}
