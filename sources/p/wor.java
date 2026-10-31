package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wor implements Consumer {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ mwh b;

    public wor(String str, String str2, mwh mwhVar) {
        this.b = mwhVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        mwh mwhVar = this.b;
        switch (b) {
            case 0:
                mwhVar.invoke(Boolean.FALSE);
                ((Throwable) obj).getMessage();
                break;
            default:
                ao80 ao80Var = (ao80) obj;
                if (ao80Var.a >= 100) {
                    ao80Var.toString();
                    mwhVar.invoke(Boolean.FALSE);
                } else if (ao80Var == ao80.PAIRING) {
                    mwhVar.invoke(Boolean.TRUE);
                }
                break;
        }
    }

    public wor(mwh mwhVar, String str, String str2) {
        this.b = mwhVar;
    }
}
