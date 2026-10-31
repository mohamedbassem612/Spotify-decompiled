package p;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ufz0 implements Connectable {
    public final dgz0 a;
    public qfz0 b;
    public RecyclerView c;
    public boolean d = true;
    public int e = -1;
    public int f;

    public ufz0(dgz0 dgz0Var) {
        this.a = dgz0Var;
    }

    public final Connection L(Consumer consumer) {
        return new n1b0(this, (byte) 19);
    }

    public final void a(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        RecyclerView recyclerView = this.c;
        a layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iF1 = linearLayoutManager.f1();
            int iH1 = linearLayoutManager.h1();
            if (iF1 == -1 || iH1 == -1) {
                return;
            }
            int i2 = iH1 - iF1;
            this.d = (i2 > 0 ? ((float) i) / ((float) i2) : 0.0f) < 3.0f;
        }
    }
}
