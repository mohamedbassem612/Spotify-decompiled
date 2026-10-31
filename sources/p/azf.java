package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class azf implements g4h1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ azf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final f4h1 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                cir0 cir0Var = (cir0) obj2;
                View viewInflate = layoutInflater.inflate(2131625353, viewGroup, false);
                if (viewInflate != null) {
                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                    return new zyf(cir0Var, new zhq0(frameLayout, frameLayout, (byte) 5), (lyf) obj, bundle);
                }
                bhn0.i("rootView");
                return null;
            case 1:
                return ((l4h1) obj2).a(context, layoutInflater, viewGroup, bundle, this.c);
            default:
                return new awa(layoutInflater.inflate(2131626273, viewGroup, false), (hhf1) obj, (lzn0) obj2, (byte) 3);
        }
    }
}
