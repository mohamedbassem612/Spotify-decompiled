package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rdj0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kcs b;
    public final /* synthetic */ bq21 c;

    public /* synthetic */ rdj0(kcs kcsVar, bq21 bq21Var, byte b) {
        this.a = b;
        this.b = kcsVar;
        this.c = bq21Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        bq21 bq21Var = this.c;
        kcs kcsVar = this.b;
        switch (b) {
            case 0:
                s981 s981Var = (s981) obj;
                SingleSubject singleSubject = (SingleSubject) kcsVar.a.remove(bq21Var.a);
                if (singleSubject != null) {
                    singleSubject.onSuccess(s981Var);
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                Logger.d(l1d.m("Error showing notification: ", th.getMessage()), new Object[0]);
                SingleSubject singleSubject2 = (SingleSubject) kcsVar.a.remove(bq21Var.a);
                if (singleSubject2 != null) {
                    singleSubject2.onError(th);
                }
                break;
        }
    }
}
