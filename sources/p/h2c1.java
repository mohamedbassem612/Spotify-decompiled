package p;

import com.spotify.mobius.Connectable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h2c1 implements sve0 {
    public final sck1 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public h2c1(sck1 sck1Var) {
        this.a = sck1Var;
    }

    @Override // p.sve0
    public final void a(Class cls, Class cls2, Class cls3, Object obj, nve0 nve0Var) {
        this.b.put(cls, obj);
        this.c.add(new hjm0(cls, cls2, cls3, nve0Var));
    }

    @Override // p.sve0
    public final void b(Class cls, Connectable connectable) {
        this.d.add(new fjm0(cls, connectable));
    }
}
