package p;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z7k1 implements OnReceiveContentListener {
    public final y7q0 a;

    public z7k1(y7q0 y7q0Var) {
        this.a = y7q0Var;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        ful fulVar = new ful(new rcl(contentInfo));
        ful fulVarA = this.a.a(view, fulVar);
        if (fulVarA == null) {
            return null;
        }
        return fulVarA == fulVar ? contentInfo : fulVarA.c();
    }
}
