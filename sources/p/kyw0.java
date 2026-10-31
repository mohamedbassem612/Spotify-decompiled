package p;

import android.content.DialogInterface;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kyw0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SingleSubject b;

    public /* synthetic */ kyw0(SingleSubject singleSubject, byte b) {
        this.a = b;
        this.b = singleSubject;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        SingleSubject singleSubject = this.b;
        switch (b) {
            case 0:
                singleSubject.onSuccess(vyw0.a);
                break;
            default:
                singleSubject.onSuccess(uyw0.a);
                break;
        }
    }
}
