package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class wjs extends ias implements b031 {
    public final iuc N0;
    public Parcelable O0;
    public final aim0 Y;
    public final eim0 Z;

    public wjs(c8m0 c8m0Var, aim0 aim0Var, eim0 eim0Var, iuc iucVar, g2h g2hVar, w9k1 w9k1Var) {
        super(c8m0Var, aim0Var, g2hVar, w9k1Var);
        this.Y = aim0Var;
        this.Z = eim0Var;
        this.N0 = iucVar;
    }

    public final void a(Bundle bundle) {
        this.O0 = bundle.getParcelable("Page#model");
    }

    @Override // p.ias
    public final Object l() {
        Parcelable parcelable;
        Parcelable parcelable2 = this.O0;
        return (parcelable2 == null || (parcelable = (Parcelable) this.Z.invoke(parcelable2)) == null) ? (Parcelable) this.Y.invoke() : parcelable;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        MobiusLoop.Controller controller = this.h;
        if (controller == null) {
            return bundle;
        }
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        bundle.putParcelable("Page#model", (Parcelable) this.N0.invoke(controller.a()));
        return bundle;
    }
}
