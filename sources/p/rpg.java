package p;

import android.content.res.Resources;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rpg implements qey {
    public final /* synthetic */ byte a;
    public final zwm1 b;

    public /* synthetic */ rpg(zwm1 zwm1Var, byte b) {
        this.a = b;
        this.b = zwm1Var;
    }

    @Override // p.qey
    public final String a(ttm1 ttm1Var, pey peyVar) {
        byte b = this.a;
        zwm1 zwm1Var = this.b;
        aey aeyVar = aey.t;
        switch (b) {
            case 0:
                aey aeyVar2 = ttm1Var.e;
                if (aeyVar2 == aeyVar) {
                    boolean zContains = peyVar.e.contains("playlists");
                    Resources resources = zwm1Var.b;
                    return !zContains ? resources.getString(2131956877) : resources.getString(2131956876);
                }
                n57.e("This decorator is meant to be used with PLAYLIST entities (Clips), and was used with " + aeyVar2 + ", this should not happen");
                return null;
            default:
                Set set = peyVar.e;
                aey aeyVar3 = ttm1Var.e;
                if (aeyVar3 == aeyVar) {
                    boolean z = (set.contains("playlists") || set.contains("podcasts")) ? false : true;
                    Resources resources2 = zwm1Var.b;
                    return z ? resources2.getString(2131956874) : resources2.getString(2131956875);
                }
                n57.e("This decorator is meant to be used with PLAYLIST entities (Your Episodes), and was used with " + aeyVar3 + ", this should not happen");
                return null;
        }
    }
}
