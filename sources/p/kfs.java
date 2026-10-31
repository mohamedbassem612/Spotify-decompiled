package p;

import android.view.View;
import android.widget.TextView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kfs implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;
    public final /* synthetic */ k9k c;

    public /* synthetic */ kfs(View view, k9k k9kVar, byte b) {
        this.a = b;
        this.b = view;
        this.c = k9kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k9k k9kVar = this.c;
        switch (b) {
            case 0:
                j7p1.w(p7h.M(new TextView[]{(TextView) k9kVar.f, (TextView) k9kVar.d}));
                break;
            default:
                j7p1.w(Collections.singletonList((TextView) k9kVar.d));
                break;
        }
    }
}
