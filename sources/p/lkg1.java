package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lkg1 implements flc0 {
    public static final lkg1 b = new lkg1(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ lkg1(byte b2) {
        this.a = b2;
    }

    @Override // p.flc0
    public final kmv0 a(kqu0 kqu0Var) {
        byte b2 = this.a;
        osm1 osm1Var = osm1.b;
        osm1 osm1Var2 = osm1.d;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new kmv0((osm1) null, (osm1) null, (osm1) null, 15);
            case 1:
                Set set = kqu0Var.a;
                return set != null ? dro.J(set) : new kmv0(osm1.c, osm1Var2, osm1Var, 8);
            case 2:
                Set set2 = kqu0Var.a;
                return set2 != null ? kmv0.a(dro.J(set2), 11) : new kmv0((osm1) null, (osm1) null, osm1Var2, 11);
            case 3:
                Set set3 = kqu0Var.a;
                return set3 != null ? dro.J(set3) : new kmv0((osm1) null, (osm1) null, (osm1) null, 15);
            case 4:
                Set set4 = kqu0Var.a;
                return set4 != null ? dro.J(set4) : new kmv0((osm1) null, osm1Var2, osm1Var, 9);
            default:
                Set set5 = kqu0Var.a;
                return set5 != null ? dro.J(set5) : new kmv0(osm1Var2, (osm1) null, (osm1) null, 14);
        }
    }
}
