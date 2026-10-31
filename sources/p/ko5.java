package p;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ko5 implements h8l {
    public final LinearLayout a;
    public final hv41 b;
    public final idd1 c;

    public ko5(LinearLayout linearLayout, pp ppVar) {
        this.a = linearLayout;
        this.b = new hv41(ppVar);
        idd1 idd1Var = new idd1(new f85(this, (byte) 17));
        this.c = idd1Var;
        rwq0.s((RecyclerView) idd1Var.getValue(), o40.Z);
    }

    public final Connection L(Consumer consumer) {
        m42 m42Var = new m42(consumer, (byte) 1);
        hv41 hv41Var = this.b;
        hv41Var.g = m42Var;
        hv41Var.h = new m42(consumer, (byte) 2);
        return new rp(this, (byte) 5);
    }

    public final Object getView() {
        return this.a;
    }

    public final Bundle serialize() {
        return mno1.g();
    }

    public final void start() {
        ((RecyclerView) this.c.getValue()).setAdapter(this.b);
    }

    public final void stop() {
    }
}
