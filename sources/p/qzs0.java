package p;

import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.Map;
import spotify.collection.esperanto.proto.CollectionGetArtistViewResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qzs0 implements vzs0, Function, BiFunction, Predicate, xkb, Function5 {
    public final /* synthetic */ byte a;
    public static final qzs0 b = new qzs0(0);
    public static final qzs0 c = new qzs0(1);
    public static final qzs0 d = new qzs0(2);
    public static final qzs0 e = new qzs0(3);
    public static final qzs0 f = new qzs0(4);
    public static final qzs0 g = new qzs0(5);
    public static final qzs0 h = new qzs0(6);
    public static final qzs0 i = new qzs0(7);
    public static final qzs0 t = new qzs0(8);
    public static final qzs0 X = new qzs0(9);
    public static final qzs0 Y = new qzs0(10);
    public static final qzs0 Z = new qzs0(11);
    public static final qzs0 N0 = new qzs0(12);
    public static final qzs0 O0 = new qzs0(13);
    public static final qzs0 P0 = new qzs0(14);
    public static final qzs0 Q0 = new qzs0(15);
    public static final qzs0 R0 = new qzs0(16);
    public static final qzs0 S0 = new qzs0(17);
    public static final qzs0 T0 = new qzs0(18);
    public static final qzs0 U0 = new qzs0(19);
    public static final qzs0 V0 = new qzs0(20);
    public static final qzs0 W0 = new qzs0(21);
    public static final qzs0 X0 = new qzs0(22);
    public static final qzs0 Y0 = new qzs0(23);
    public static final qzs0 Z0 = new qzs0(24);
    public static final qzs0 a1 = new qzs0(25);
    public static final qzs0 b1 = new qzs0(26);
    public static final qzs0 c1 = new qzs0(27);
    public static final qzs0 d1 = new qzs0(28);
    public static final qzs0 e1 = new qzs0(29);

    public /* synthetic */ qzs0(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj) {
        int i2;
        b231 b231Var = null;
        switch (this.a) {
            case 1:
                return xo.a;
            case 2:
            case 3:
            case 6:
            case 10:
            case 12:
            case 13:
            case 14:
            case 18:
            case 20:
            case 21:
            case 22:
            case 27:
            default:
                return (String) ((PlayerState) obj).playbackId().e("absent");
            case 4:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "An unexpected error occurred";
                }
                return new r13(message);
            case 5:
                return Boolean.valueOf(((fb4) obj).a);
            case 7:
                return Boolean.valueOf(((Map) obj).containsValue(Boolean.TRUE));
            case 8:
                return new k78(((umb) obj).equals(qmb.a));
            case 9:
                return (dma1) ((mmr0) obj).b;
            case 11:
                spq0 spq0Var = (j331) obj;
                b231Var = spq0Var instanceof b231 ? (b231) spq0Var : null;
                return (b231Var == null || !((i2 = b231Var.b) == 12 || i2 == 2 || i2 == 6)) ? Single.just(spq0Var) : Single.error(new lta(spq0Var));
            case 15:
                return ((CollectionGetArtistViewResponse) obj).n();
            case 16:
                njh njhVar = (njh) obj;
                return new rfh(njhVar.a, njhVar.b);
            case 17:
                b231 b231Var2 = (spq0) obj;
                if (b231Var2.c() && ((nnr) b231Var2.b()).B.a.d == luq0.e) {
                    b231Var = b231Var2;
                }
                return b231Var == null ? j5.a : b231Var;
            case 19:
                crj1 crj1Var = n9n.a;
                Logger.e((Throwable) obj, "Error trying to send request to ContextPlayer", new Object[0]);
                return Observable.empty();
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return u991.a;
            case 24:
                b141 b141Var = (d141) obj;
                if (b141Var instanceof b141) {
                    return b141Var.a.c.map(pzs0.Y0);
                }
                if (b141Var.equals(c141.a)) {
                    return Observable.just(Boolean.FALSE);
                }
                eg.o();
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 26:
                Logger.e((Throwable) obj, "Error calling getSessionStatus()", new Object[0]);
                return wxz.a;
            case 28:
                String message2 = ((Throwable) obj).getMessage();
                if (message2 == null) {
                    message2 = "Unknown Error";
                }
                return new vdz(message2);
        }
    }

    public Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new of7(((Boolean) obj4).booleanValue(), ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj5).booleanValue());
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                yvg1 yvg1Var = (yvg1) obj;
                return u890.j(((ji0) yvg1Var.a).a, ((ContextTrack) ((PlayerState) yvg1Var.b).track().b()).metadata().get("ad_id"));
            case 10:
                fkb fkbVar = (fkb) obj;
                return fkbVar == fkb.c || fkbVar == fkb.a;
            case 13:
                return ((bmc) obj) instanceof zlc;
            case 14:
                return !((uv00) obj).f;
            case 22:
                return ((th61) obj).b;
            default:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                return new mmr0((String) obj, (Restrictions) obj2);
            default:
                s1l s1lVar = (s1l) obj;
                qul1 qul1Var = (qul1) obj2;
                if (s1lVar.d == 6) {
                    return new s1l(qul1Var == qul1.a ? 2 : 6, s1lVar.e, s1lVar.a, s1lVar.b, s1lVar.c);
                }
                return s1lVar;
        }
    }
}
