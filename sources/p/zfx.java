package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zfx implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wfx b;

    public /* synthetic */ zfx(wfx wfxVar, byte b) {
        this.a = b;
        this.b = wfxVar;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        byte b2 = 7;
        ai4 ai4Var = ai4.b;
        wfx wfxVar = this.b;
        switch (b) {
            case 0:
                if (l0iVar == null) {
                    return new nzj(wfxVar.b, voi.a);
                }
                bhn0.d();
                return null;
            case 1:
                return new h98(wfxVar.b, wfxVar.a, ai4Var, (byte) 9);
            case 2:
                return new c1s(wfxVar.b, wfxVar.a, false, false, false, false);
            case 3:
                return new ver(wfxVar.b, (byte) 8);
            case 4:
                if (l0iVar == null) {
                    return new yir(wfxVar.b, wfxVar.a, (byte) 7);
                }
                bhn0.d();
                return null;
            case 5:
                if (l0iVar == null) {
                    return new odr(wfxVar.b, wfxVar.a, (byte) 3);
                }
                bhn0.d();
                return null;
            case 6:
                if (l0iVar == null) {
                    return new yir(wfxVar.b, wfxVar.a, (byte) 8);
                }
                bhn0.d();
                return null;
            case 7:
                if (l0iVar == null) {
                    return new zbs(wfxVar.b);
                }
                bhn0.d();
                return null;
            case 8:
                if (l0iVar == null) {
                    return new eds(wfxVar.b, wfxVar.a);
                }
                bhn0.d();
                return null;
            case 9:
                if (l0iVar == null) {
                    return new nwr(wfxVar.b, wfxVar.a, (byte) 1);
                }
                bhn0.d();
                return null;
            case 10:
                hhg1.n("Required value was null.");
                return null;
            case 11:
                if (l0iVar == null) {
                    return new eos(wfxVar.b, wfxVar.a, (byte) 8);
                }
                bhn0.d();
                return null;
            case 12:
                return new afr(wfxVar.b, wfxVar.a, false, ai4.b, (byte) 2);
            case 13:
                if (l0iVar == null) {
                    return new yir(wfxVar.b, wfxVar.a, (byte) 12);
                }
                bhn0.d();
                return null;
            case 14:
                if (l0iVar == null) {
                    return new mfs(wfxVar.b);
                }
                bhn0.d();
                return null;
            case 15:
                if (l0iVar == null) {
                    return new lkr(wfxVar.b, (byte) 3);
                }
                bhn0.d();
                return null;
            case 16:
                return new yir(new zfr(wfxVar.b, wfxVar.a));
            case 17:
                return new yir(new zfr(wfxVar.b, (byte) 25), (byte) 0);
            case 18:
                if (l0iVar == null) {
                    return new yxr(wfxVar.b, (byte) 2);
                }
                bhn0.d();
                return null;
            case 19:
                return new h98(wfxVar.b, wfxVar.a, ai4Var, (byte) 14);
            case 20:
                nzj nzjVar = new nzj(wfxVar.b, new j2i(1852832427, new op(wfxVar, (byte) 3), true));
                nzjVar.d.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return nzjVar;
            case 21:
                return new zgr(wfxVar.b, wfxVar.a, false, (byte) 1);
            case 22:
                return new rhr(wfxVar.b, wfxVar.a, ai4Var, false);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (l0iVar == null) {
                    return new yir(wfxVar.b, (byte) 18);
                }
                bhn0.d();
                return null;
            case 24:
                if (l0iVar == null) {
                    return new odr(wfxVar.b);
                }
                bhn0.d();
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (l0iVar == null) {
                    return new yir(wfxVar.b, (byte) 20);
                }
                bhn0.d();
                return null;
            case 26:
                hhg1.n("Required value was null.");
                return null;
            case 27:
                if (l0iVar == null) {
                    return new hjs(wfxVar.b, wfxVar.a, new zfx(wfxVar, b2));
                }
                bhn0.d();
                return null;
            case 28:
                l0i ixf1Var = (kxf1) l0iVar;
                if (ixf1Var == null) {
                    ixf1Var = new ixf1();
                }
                gw70 gw70Var = wfxVar.a;
                Context context = wfxVar.b;
                if (ixf1Var instanceof jxf1) {
                    return new yir(context, gw70Var, (byte) 27);
                }
                if (ixf1Var instanceof ixf1) {
                    return new odr(context, gw70Var, new zfx(wfxVar, b2));
                }
                eg.o();
                return null;
            default:
                return new iws(wfxVar.b, wfxVar.a, false, ai4Var);
        }
    }
}
