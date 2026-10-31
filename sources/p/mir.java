package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mir implements Update {
    public final /* synthetic */ nir a;

    public mir(nir nirVar) {
        this.a = nirVar;
    }

    public final Next a(Object obj, Object obj2) {
        td9 td9Var = (td9) obj;
        md9 md9Var = (md9) obj2;
        td9Var.getClass();
        md9Var.getClass();
        nir nirVar = this.a;
        return p1p1.G(td9Var, md9Var, nirVar.g, nirVar.i.isEnabled());
    }
}
