package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class un30 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ g2z c;

    public /* synthetic */ un30(String str, g2z g2zVar, byte b) {
        this.a = b;
        this.b = str;
        this.c = g2zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        g2z g2zVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                if (str != null) {
                    ((lzn0) g2zVar.e).h(pcf.g(str));
                }
                break;
            default:
                if (str != null) {
                    ((lzn0) g2zVar.e).h(pcf.g(str));
                }
                break;
        }
    }
}
