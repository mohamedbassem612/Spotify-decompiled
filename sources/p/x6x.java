package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x6x implements flc0 {
    public final /* synthetic */ byte a;
    public final vlo b;

    public /* synthetic */ x6x(vlo vloVar, byte b) {
        this.a = b;
        this.b = vloVar;
    }

    @Override // p.flc0
    public final kmv0 a(kqu0 kqu0Var) {
        kmv0 kmv0VarJ;
        byte b = this.a;
        cho choVar = cho.c;
        osm1 osm1Var = osm1.d;
        vlo vloVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Set setY0 = kqu0Var.a;
                if (setY0 == null) {
                    kmv0VarJ = new kmv0(osm1.c, osm1Var, (osm1) null, 12);
                } else if (vloVar.b(blc0.ti)) {
                    if (kqu0Var.b == choVar) {
                        setY0 = dm61.y0(setY0, f46.S0(new String[]{"spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt"}));
                    }
                    kmv0VarJ = dro.J(setY0);
                } else {
                    kmv0VarJ = vloVar.b(blc0.Pg) ? dro.J(setY0) : dro.J(dm61.x0("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", setY0));
                }
                return kmv0.a(kmv0VarJ, 11);
            case 1:
                Set set = kqu0Var.a;
                if (set == null || !vloVar.b(blc0.Pg)) {
                    return set != null ? dro.J(dm61.x0("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", set)) : new kmv0((osm1) null, osm1Var, osm1.b, 9);
                }
                return dro.J(set);
            default:
                Set setS0 = kqu0Var.a;
                if (setS0 == null || !vloVar.b(blc0.ti)) {
                    return setS0 != null ? dro.J(setS0) : new kmv0(osm1Var, (osm1) null, (osm1) null, 14);
                }
                if (kqu0Var.b == choVar) {
                    setS0 = f46.S0(new String[]{"spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt"});
                }
                return dro.J(setS0);
        }
    }
}
