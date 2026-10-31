package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qhe0 extends wnh1 implements t8h1 {
    @Override // p.wnh1
    public final Bundle I() {
        Bundle bundleI = super.I();
        if (bundleI == null) {
            return null;
        }
        bundleI.putString("PBL:PageId", this.Y.a.path());
        bundleI.putSerializable("PBL:PageMetadata", this.Y.d);
        return bundleI;
    }

    @Override // p.uba
    public final void y(Bundle bundle) {
        String string = bundle.getString("PBL:PageId");
        if (string != null) {
            u8h1 serializable = bundle.getSerializable("PBL:PageMetadata");
            u8h1 u8h1VarI = serializable instanceof u8h1 ? serializable : null;
            if (u8h1VarI == null) {
                u8h1VarI = e8h1.b().i();
            }
            this.Y = tba.a(this.Y, new awz0(string), null, u8h1VarI, 6);
        }
        x(bundle);
    }
}
