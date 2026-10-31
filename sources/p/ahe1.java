package p;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ahe1 implements View.OnClickListener {
    public final short a;
    public final b1c1 b;
    public long c;

    /* JADX WARN: Multi-variable type inference failed */
    public ahe1(int i, b1c1 b1c1Var) {
        this.a = i;
        this.b = b1c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.a;
        long j2 = jElapsedRealtime + j;
        if (j2 - this.c < j) {
            return;
        }
        this.c = j2;
        this.b.invoke(view);
    }
}
