package p;

import java.util.function.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hsc0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mwt0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hsc0(Object obj, mwt0 mwt0Var, byte b) {
        this.a = b;
        this.c = obj;
        this.b = mwt0Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte b = this.a;
        mwt0 mwt0Var = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((c2u0) obj).d("esperanto_play_status:".concat(((ly21) obj2).a.a()), mwt0Var);
                break;
            default:
                ((c2u0) obj).d("esperanto_play_exception:".concat((String) obj2), mwt0Var);
                break;
        }
    }
}
