package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fjm0 implements Connectable {
    public final Class a;
    public final Connectable b;
    public Object c;

    public fjm0(Class cls, Connectable connectable) {
        this.a = cls;
        this.b = connectable;
    }

    public final Connection L(Consumer consumer) {
        Connection connectionL = this.b.L(new xu2(consumer, (byte) 13));
        return dug.j(new y52(0, connectionL, Connection.class, "dispose", "dispose()V", 0, (byte) 3), new uah0(this, connectionL, (byte) 25));
    }
}
