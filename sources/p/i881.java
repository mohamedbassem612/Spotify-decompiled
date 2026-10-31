package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i881 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r961 b;

    public /* synthetic */ i881(r961 r961Var, byte b) {
        this.a = b;
        this.b = r961Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    public final void accept(Object obj) {
        boolean z;
        w281 w281Var;
        byte b = this.a;
        r961 r961Var = this.b;
        switch (b) {
            case 0:
                ((rfs) r961Var.b).b();
                break;
            default:
                zsq0 zsq0Var = (atq0) obj;
                if (zsq0Var instanceof zsq0) {
                    h881 h881Var = (h881) zsq0Var.a;
                    zoy0 zoy0Var = h881Var.o;
                    if (zoy0Var != null) {
                        z = true;
                        if (!l4o1.R(zoy0Var) || ((w281Var = h881Var.l) != null && w281Var.c)) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    ((rfs) r961Var.b).a(h881Var.m, z);
                }
                break;
        }
    }
}
