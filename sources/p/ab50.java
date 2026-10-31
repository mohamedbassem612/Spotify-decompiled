package p;

import android.content.Intent;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ab50 implements dyf0 {
    public final Observer a;

    public ab50(Observer observer) {
        this.a = observer;
    }

    @Override // p.dyf0
    public final void a(Intent intent) {
        String dataString = intent.getDataString();
        if (dataString == null || dataString.equals("null") || ihc1.h0(dataString, "graduation", false)) {
            return;
        }
        this.a.onNext(ya50.a);
    }
}
