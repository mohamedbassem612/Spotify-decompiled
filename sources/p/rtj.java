package p;

import android.content.Context;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rtj implements h8l {
    public Consumer b;
    public final gzj e;
    public final kdn0 a = new kdn0();
    public final hrr0 c = v8r.q(Boolean.FALSE);
    public final ptj d = new ptj(1, this, rtj.class, "dispatchEvent", "dispatchEvent(Ljava/lang/Object;)V", 0, (byte) 0);

    public rtj(Context context, j2i j2iVar) {
        this.e = new gzj(context, new j2i(1222645075, new qtj(this, j2iVar, (byte) 1), true));
    }

    public final Connection L(Consumer consumer) {
        this.b = consumer;
        this.c.setValue(Boolean.TRUE);
        return new otj(this, (byte) 0);
    }

    public final Object getView() {
        return this.e.d;
    }

    public final void start() {
        this.e.getClass();
    }

    public final void stop() {
        this.e.getClass();
    }
}
