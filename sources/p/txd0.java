package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class txd0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kt91 b;
    public final /* synthetic */ rzd0 c;
    public final /* synthetic */ Consumer d;

    public /* synthetic */ txd0(kt91 kt91Var, rzd0 rzd0Var, Consumer consumer, byte b) {
        this.a = b;
        this.b = kt91Var;
        this.c = rzd0Var;
        this.d = consumer;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Consumer consumer = this.d;
        rzd0 rzd0Var = this.c;
        kt91 kt91Var = this.b;
        switch (b) {
            case 0:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131957608});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131957608});
                kt91Var.k(new er91((fs91) null, "", 2131957608, (String) null, 2131957607, new kw6(rzd0Var, consumer, (kxd0) obj, (byte) 10), (cvr) null, (xq91) null, false));
                break;
            default:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131957613});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131957613});
                kt91Var.k(new er91((fs91) null, "", 2131957613, (String) null, 2131957607, new kw6(rzd0Var, consumer, (lxd0) obj, (byte) 11), (cvr) null, (xq91) null, false));
                break;
        }
    }
}
