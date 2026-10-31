package p;

import com.spotify.accessory.categorizer.BluetoothCategorizer;
import com.spotify.accessory.statemanager.AccessoryStateManager$Event;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vdr implements ck, a4l {
    public final Set a;
    public final BluetoothCategorizer b;
    public final rdr c;
    public final q8n d;
    public c9n e;
    public final bpb1 f;
    public final bpb1 g;
    public List h;

    public vdr(Set set, BluetoothCategorizer bluetoothCategorizer, rdr rdrVar, q8n q8nVar) {
        this.a = set;
        this.b = bluetoothCategorizer;
        this.c = rdrVar;
        this.d = q8nVar;
        this.e = cy30.t(q8nVar);
        z6x z6xVar = z6x.a;
        this.f = gio1.b(z6xVar);
        this.g = gio1.b(AccessoryStateManager$Event.NoAccessoryConnected.INSTANCE);
        this.h = z6xVar;
    }

    @Override // p.a4l
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zj) it.next()).a();
        }
        smo1.q(this.e);
    }

    @Override // p.a4l
    public final void b() {
        for (zj zjVar : this.a) {
            Objects.toString(zjVar);
            zjVar.b();
        }
        c9n c9nVarV = qmo1.v(this.e, new z5o(this, (byte) 17));
        this.e = c9nVarV;
        c921.y(c9nVarV, (o8n) null, 0, new zx0(this, null, (byte) 6), 3);
        c921.y(this.e, (o8n) null, 0, new n1o(this, (lnm) null, (byte) 4), 3);
    }
}
