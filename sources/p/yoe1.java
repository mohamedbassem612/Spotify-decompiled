package p;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yoe1 extends ClickableSpan {
    public final /* synthetic */ long a;
    public final /* synthetic */ azj b;

    public yoe1(azj azjVar, long j) {
        this.b = azjVar;
        this.a = j;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ((qlr) this.b.b).b.invoke(new eet(this.a));
    }
}
