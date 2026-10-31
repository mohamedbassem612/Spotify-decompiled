package p;

import com.spotify.adsdisplay.products.cmp.CMPActivity;
import com.spotify.tap.spoton.SpotOnService;
import com.spotify.tome.pageactivity.PageActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r0q implements cl4 {
    public final /* synthetic */ byte a;
    public final dl4 b;

    public r0q(daq daqVar, teq teqVar) {
        this.a = (byte) 4;
        this.b = teqVar;
    }

    @Override // p.cl4
    public final dl4 a(Object obj) {
        byte b = this.a;
        dl4 dl4Var = this.b;
        switch (b) {
            case 0:
                return new em0((daq) dl4Var, (CMPActivity) obj);
            case 1:
                return new s7q((daq) dl4Var, (PageActivity) obj);
            case 2:
                return new wtp((daq) dl4Var, (SpotOnService) obj);
            case 3:
                return new q0q((daq) dl4Var, (byte) 7);
            default:
                return new q2q((teq) dl4Var);
        }
    }

    public /* synthetic */ r0q(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }
}
