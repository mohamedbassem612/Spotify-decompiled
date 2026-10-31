package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yw7 {
    public boolean a;
    public boolean b;
    public boolean c;

    public /* synthetic */ yw7(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static Map c(yw7 yw7Var) {
        return sqg0.J(new mmr0[]{new mmr0("link", true), new mmr0("name", true), new mmr0("description", true), new mmr0("popularity", true), new mmr0("publisher", true), new mmr0("language", true), new mmr0("isExplicit", true), new mmr0("covers", true), new mmr0("numEpisodes", true), new mmr0("consumptionOrder", true), new mmr0("mediaTypeEnum", true), new mmr0("inCollection", true), new mmr0("trailerUri", true), new mmr0("latestPlayedEpisodeLink", true)});
    }

    public zw7 a() {
        if (this.a || !(this.b || this.c)) {
            return new zw7(this);
        }
        eg.m("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }

    public void b(ArrayList arrayList) {
        if ((this.a || this.b || this.c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((j2t) it.next()).a();
            }
            j2h1.o("ForceCloseDeferrableSurface");
        }
    }
}
