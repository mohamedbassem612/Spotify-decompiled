package p;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tpd0 implements isw {
    public final /* synthetic */ byte a;
    public final ProgressBar b;

    public tpd0(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                ProgressBar progressBar = new ProgressBar(context, null, 0);
                progressBar.setProgressDrawable(context.getDrawable(2131233471));
                progressBar.setPadding(0, 0, 0, 0);
                this.b = progressBar;
                break;
            case 2:
                ProgressBar progressBar2 = new ProgressBar(context, null, 0);
                progressBar2.setProgressDrawable(context.getDrawable(2131233783));
                progressBar2.setPadding(0, 0, 0, 0);
                this.b = progressBar2;
                break;
            default:
                ProgressBar progressBar3 = new ProgressBar(context, null, 0);
                progressBar3.setProgressDrawable(context.getDrawable(2131233471));
                progressBar3.setPadding(0, 0, 0, 0);
                this.b = progressBar3;
                break;
        }
    }

    public final void a(Object obj, ysw yswVar) {
        byte b = this.a;
        ProgressBar progressBar = this.b;
        switch (b) {
            case 0:
                rpd0 rpd0Var = (rpd0) obj;
                progressBar.setMax(rpd0Var.b);
                progressBar.setProgress((int) rpd0Var.a);
                break;
            case 1:
                spd0 spd0Var = (spd0) obj;
                progressBar.setMax(spd0Var.b);
                progressBar.setProgress((int) spd0Var.a);
                break;
            default:
                kjx0 kjx0Var = (kjx0) obj;
                progressBar.setMax((int) kjx0Var.b);
                progressBar.setProgress((int) kjx0Var.a);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        return this.b;
    }
}
