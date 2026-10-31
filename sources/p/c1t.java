package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c1t implements Connectable {
    public final bpb1 a;
    public final xe01 b;

    public c1t() {
        bpb1 bpb1VarB = gio1.b(new mum1());
        this.a = bpb1VarB;
        this.b = d5p1.h(bpb1VarB);
    }

    public final Connection L(Consumer consumer) {
        return new rp(this, (byte) 21);
    }
}
