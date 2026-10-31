package p;

import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class nf30 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zf30 b;

    public /* synthetic */ nf30(zf30 zf30Var, Bundle bundle) {
        this.a = (byte) 3;
        this.b = zf30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zf30 zf30Var = this.b;
        switch (b) {
            case 0:
                zf30Var.u1.a(k8c0.ON_STOP);
                break;
            case 1:
                zf30Var.s1.g(k8c0.ON_STOP);
                break;
            case 2:
                zf30Var.H0();
                break;
            case 3:
                zf30Var.t0();
                break;
            case 4:
                zf30Var.G0();
                break;
            case 5:
                zf30Var.s1.g(k8c0.ON_START);
                break;
            case 6:
                zf30Var.u1.a(k8c0.ON_START);
                break;
            case 7:
                zf30Var.v0(zf30Var.V0.e);
                break;
            case 8:
                zf30Var.u1.a(k8c0.ON_PAUSE);
                break;
            case 9:
                zf30Var.s1.g(k8c0.ON_PAUSE);
                break;
            case 10:
                zf30Var.D0();
                break;
            case 11:
                zf30Var.s1.g(k8c0.ON_DESTROY);
                break;
            case 12:
                zf30Var.y0();
                break;
            case 13:
                zf30Var.A0();
                break;
            case 14:
                zf30Var.E0();
                break;
            case 15:
                zf30Var.s1.g(k8c0.ON_RESUME);
                break;
            case 16:
                zf30Var.u1.a(k8c0.ON_RESUME);
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                zf30Var.u1.a(k8c0.ON_DESTROY);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                zf30Var.z0();
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                zf30Var.s1.g(k8c0.ON_CREATE);
                break;
            default:
                zf30Var.u1.a(k8c0.ON_CREATE);
                break;
        }
    }

    public /* synthetic */ nf30(zf30 zf30Var, byte b) {
        this.a = b;
        this.b = zf30Var;
    }
}
