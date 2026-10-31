package p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ond implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ond(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((iu30) obj2).invoke((lnd) obj);
                break;
            case 1:
                ((iu30) obj2).invoke(new ijy(((lly) obj).e));
                break;
            default:
                try {
                    ((Context) obj2).startActivity((Intent) obj);
                } catch (ActivityNotFoundException unused) {
                    return;
                }
                break;
        }
    }
}
