package p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class frb1 {
    public final yqg a;
    public spq0 b;
    public spq0 c;
    public List d = new ArrayList(1);
    public spq0 e;
    public List f;
    public ArrayList g;
    public int h;
    public int i;
    public spq0 j;

    public frb1(yqg yqgVar) {
        j5 j5Var = j5.a;
        this.e = j5Var;
        this.f = new ArrayList(1);
        this.g = new ArrayList(1);
        this.j = j5Var;
        this.a = yqgVar;
    }

    public final void a() {
        int i = this.h + this.i;
        dm5.u(i, this.g.size());
        this.d = this.g.subList(0, i);
        this.e = spq0.a((ContextTrack) this.g.get(i));
        ArrayList arrayList = this.g;
        this.f = arrayList.subList(i + 1, arrayList.size());
    }
}
