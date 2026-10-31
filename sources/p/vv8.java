package p;

import android.R;
import android.bluetooth.BluetoothAdapter;
import android.net.Uri;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.betamax.offline.database.BetamaxOfflineDatabase_Impl;
import com.spotify.esperanto.esperanto.Transport;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vv8 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv8(gdq gdqVar, h3b h3bVar) {
        super(0);
        this.a = (byte) 18;
        this.b = h3bVar;
    }

    public final Object invoke() {
        Transport transport;
        switch (this.a) {
            case 0:
                return new kpg0(((aw8) this.b).b, oc8.b1);
            case 1:
                return Integer.valueOf(((ViewGroup) ((ajq0) this.b).c).getResources().getDimensionPixelSize(2131165647));
            case 2:
                wqk0 wqk0Var = (wqk0) this.b;
                if (wqk0Var != null) {
                    return wqk0Var.e();
                }
                return null;
            case 3:
                ((io9) this.b).b.b();
                return rih1.a;
            case 4:
                ro9 ro9Var = (ro9) this.b;
                return Integer.valueOf(((Boolean) ro9Var.o.getValue()).booleanValue() ? 0 : ro9Var.p.s());
            case 5:
                return Long.valueOf(((yy9) this.b).getResources().getInteger(R.integer.config_shortAnimTime));
            case 6:
                return zso1.H(((f0i) ((dg30) ((a680) this.b).d)).a);
            case 7:
                return (i8h1) ((jly0) this.b).get();
            case 8:
                return cto1.q((dg30) ((yu3) this.b).c);
            case 9:
                btl1.a.getClass();
                int iHeight = gtv0.h().a(((haa) this.b).N0()).a().height();
                return Integer.valueOf(iHeight >= 0 ? iHeight : 0);
            case 10:
                ena enaVar = (ena) this.b;
                int iOrdinal = enaVar.e.a().B1.ordinal();
                if (iOrdinal == 0) {
                    return enaVar.c;
                }
                if (iOrdinal == 1) {
                    return enaVar.d;
                }
                eg.o();
                return null;
            case 11:
                return new btp0((BetamaxOfflineDatabase_Impl) this.b);
            case 12:
                uya uyaVar = (uya) this.b;
                return d5p1.t(new iib(new m441(new tya(o4p1.k(new ht20(uyaVar.g, new q82(uyaVar, (lnm) null, (byte) 2)), -1, 2), (lnm) null, (byte) 0)), new xx0(uyaVar, (lnm) null, (byte) 1), (byte) 6), uyaVar.f, new alb1(0L, 0L), b7x.a);
            case 13:
                xya xyaVar = (xya) this.b;
                return d5p1.t(new iib(new m441(new sxa(o4p1.k(new ht20(xyaVar.f, new q82(xyaVar, (lnm) null, (byte) 3)), -1, 2), (lnm) null, xyaVar, (byte) 1)), new xx0(xyaVar, (lnm) null, (byte) 2), (byte) 6), xyaVar.e, new alb1(0L, 0L), z6x.a);
            case 14:
                e0t e0tVar = (e0t) this.b;
                asn asnVar = (asn) ((u2p) e0tVar.e).a.b;
                lzn0 lzn0Var = (lzn0) ((k0q) asnVar.b).b.i.get();
                c8o.l(lzn0Var);
                qop qopVar = (qop) asnVar.a;
                n6r0 n6r0Var = qopVar.c;
                c8o.l(n6r0Var);
                String strD = qopVar.d();
                Set set = s4b1.f;
                String strConcat = "spotify:blend:story:".concat(uic.x(strD).h());
                String strD2 = qopVar.d();
                daq daqVar = ((k0q) asnVar.b).a;
                woa woaVar = (woa) daqVar.W8.get();
                c8o.l(woaVar);
                v290 v290Var = (v290) daqVar.Kn.get();
                c8o.l(v290Var);
                kma kmaVar = (kma) daqVar.a.R5.get();
                c8o.l(kmaVar);
                return new kpg0(new hz5(lzn0Var, n6r0Var, strConcat, strD2, new d9c1(woaVar, v290Var, kmaVar, qopVar.c())), new rs7(e0tVar, (byte) 12));
            case 15:
                return new kpg0((xpw) ((z1p) ((j1b) this.b).e).get(), rza.U0);
            case 16:
                return new cx0((l1b) this.b);
            case 17:
                x1b x1bVar = (x1b) this.b;
                return new kpg0(new ldo(new utw0((th30) ((m0q) ((ham) ((v2p) x1bVar.f).a.b).b).a.m1.get()), new ik(new c64(new x72(((koc0) x1bVar.d).d(), (byte) 9), x1bVar, (byte) 28), (byte) 20)), new t1b(x1bVar, (byte) 1));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                h3b h3bVar = (h3b) this.b;
                return new kpg0(new e27(h3bVar.d, h3bVar.e), new qka(1, h3bVar, h3b.class, "metadataToProps", "metadataToProps(Lcom/spotify/listuxplatform/component/ListMetadata;)Lcom/spotify/referrals/upsell/api/Props;", 0, (byte) 3));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new cx0((fb3) this.b);
            case 20:
                ((kt91) ((ix7) this.b).b).b();
                return rih1.a;
            case 21:
                return v8r.q((md80) this.b);
            case 22:
                return flo1.l(((yfb) this.b).d, guo1.B());
            case 23:
                dhb dhbVar = (dhb) this.b;
                luk lukVar = dhbVar.G;
                if (lukVar != null) {
                    return lukVar.e(new c44(dhbVar, (byte) 10));
                }
                return null;
            case 24:
                krw0.i.f.a(((gjb) this.b).i);
                return rih1.a;
            case 25:
                BluetoothAdapter bluetoothAdapter = ((rjb) this.b).a;
                if (bluetoothAdapter == null) {
                    return null;
                }
                if (!bluetoothAdapter.isEnabled()) {
                    bluetoothAdapter = null;
                }
                if (bluetoothAdapter != null) {
                    return bluetoothAdapter.getBluetoothLeScanner();
                }
                return null;
            case 26:
                fdc fdcVar = (fdc) this.b;
                Uri uri = Uri.parse(fdcVar.U().y());
                return Uri.parse(uri.getScheme() + "://" + uri.getAuthority() + "/__noul__/" + fdcVar.U()).buildUpon().appendQueryParameter("bounce", "true").appendQueryParameter("utm_source", "app_bounce").appendQueryParameter("nd", "1").build();
            case 27:
                z48 z48Var = (z48) this.b;
                synchronized (z48Var) {
                    transport = z48Var.a;
                }
                return new y48(transport);
            case 28:
                kpb kpbVar = (kpb) this.b;
                luk lukVar2 = kpbVar.b;
                if (lukVar2 != null) {
                    return lukVar2.e(new d26(kpbVar, (byte) 4));
                }
                return null;
            default:
                lsb lsbVar = (lsb) this.b;
                c3p c3pVar = lsbVar.c;
                qka qkaVar = new qka(1, lsbVar, lsb.class, "enqueueDismiss", "enqueueDismiss(Lcom/spotify/listuxplatformconsumers/standard/sections/bottomactions/ActiveBottomActions;)V", 0, (byte) 9);
                xe01 xe01Var = lsbVar.o;
                zob1 zob1Var = lsbVar.b.a;
                c3pVar.getClass();
                return new yxb0(zob1Var, xe01Var, qkaVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vv8(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }
}
