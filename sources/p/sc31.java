package p;

import android.content.DialogInterface;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sc31 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ SingleSubject c;

    public /* synthetic */ sc31(tc31 tc31Var, iu30 iu30Var, SingleSubject singleSubject, byte b) {
        this.a = b;
        this.b = iu30Var;
        this.c = singleSubject;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        SingleSubject singleSubject = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(pc31.a);
                singleSubject.onSuccess(qc31.a);
                break;
            default:
                iu30Var.invoke(pc31.b);
                singleSubject.onSuccess(qc31.b);
                break;
        }
    }
}
