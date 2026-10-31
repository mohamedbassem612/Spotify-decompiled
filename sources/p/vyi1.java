package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vyi1 extends mhz {
    @Override // p.mhz
    public final void a(Object obj, Object obj2, Next next) {
        String strG;
        if (next.c() && next.d()) {
            strG = "next=" + next.g() + "\n\tdispatch=" + next.b();
        } else if (next.d()) {
            strG = gvg.g(next.g(), "next=");
        } else if (next.c()) {
            strG = "dispatch=" + next.b();
        } else {
            strG = "next=Nothing";
        }
        Logger.g("UPDATE:\n\tevent=%s\n\tmodel=%s\n\t%s", new Object[]{obj2, obj, strG});
    }

    @Override // p.mhz
    public final void c(Object obj, First first) {
        Logger.g("INIT:\n\tmodel=%s\n\tinitialized=%s\n\teffects=%s", new Object[]{obj, first.d(), first.a()});
    }
}
