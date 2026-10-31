package p;

import android.view.View;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t9x0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uip0 b;
    public final /* synthetic */ kt91 c;

    public /* synthetic */ t9x0(uip0 uip0Var, kt91 kt91Var, byte b) {
        this.a = b;
        this.b = uip0Var;
        this.c = kt91Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        kt91 kt91Var = this.c;
        uip0 uip0Var = this.b;
        switch (b) {
            case 0:
                String strA = uip0Var.a(2131952757, new String[]{((b9x0) obj).c});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, strA, (Integer) null, (String) null, 2131959373, d37.h, (cvr) null, (xq91) null, false));
                break;
            case 1:
                String strA2 = uip0Var.a(2131960551, new String[]{((i9x0) obj).c});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, strA2, (Integer) null, (String) null, 2131959373, d37.t, (cvr) null, (xq91) null, false));
                break;
            case 2:
                kt91Var.k(new er91((fs91) null, uip0Var.a(2131960511, new String[0]), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            case 3:
                kt91Var.k(new er91((fs91) null, uip0Var.a(2131960439, new String[]{((d9x0) obj).c}), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            case 4:
                kt91Var.k(new er91((fs91) null, uip0Var.a(2131960437, new String[0]), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            case 5:
                kt91Var.k(new er91((fs91) null, uip0Var.a(2131960482, new String[]{((f9x0) obj).c}), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            default:
                kt91Var.k(new er91((fs91) null, uip0Var.a(2131960481, new String[0]), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
    }
}
