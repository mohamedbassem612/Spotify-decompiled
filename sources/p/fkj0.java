package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.connectivity.esperanto.proto.GetStateResponse;
import com.spotify.image.esperanto.proto.EsImage;
import com.spotify.offline_esperanto.proto.EsOffline;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;
import spotify.mdata.proto.Mdata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fkj0 implements Predicate, Function, BiFunction, Function3, n8n, v8v, sar0 {
    public static boolean c;
    public final /* synthetic */ byte a;
    public static final fkj0 b = new fkj0(0);
    public static final fkj0 d = new fkj0(1);
    public static final fkj0 e = new fkj0(2);
    public static final fkj0 f = new fkj0(3);
    public static final fkj0 g = new fkj0(4);
    public static final fkj0 h = new fkj0(5);
    public static final fkj0 i = new fkj0(6);
    public static final fkj0 t = new fkj0(7);
    public static final m4c X = new m4c((byte) 2);
    public static final fkj0 Y = new fkj0(9);
    public static final fkj0 Z = new fkj0(10);
    public static final fkj0 N0 = new fkj0(11);
    public static final fkj0 O0 = new fkj0(12);
    public static final fkj0 P0 = new fkj0(13);
    public static final fkj0 Q0 = new fkj0(14);
    public static final fkj0 R0 = new fkj0(15);
    public static final fkj0 S0 = new fkj0(16);
    public static final fkj0 T0 = new fkj0(17);
    public static final fkj0 U0 = new fkj0(18);
    public static final fkj0 V0 = new fkj0(19);
    public static final /* synthetic */ fkj0 W0 = new fkj0(20);
    public static final fkj0 X0 = new fkj0(21);
    public static final fkj0 Y0 = new fkj0(22);
    public static final fkj0 Z0 = new fkj0(23);
    public static final fkj0 a1 = new fkj0(24);
    public static final fkj0 b1 = new fkj0(25);
    public static final fkj0 c1 = new fkj0(26);
    public static final fkj0 d1 = new fkj0(27);
    public static final fkj0 e1 = new fkj0(28);
    public static final fkj0 f1 = new fkj0(29);

    public /* synthetic */ fkj0(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return Boolean.valueOf(((o54) obj).a);
            case 7:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionPlatformEsperantoItemsResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 9:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return GetStateResponse.q(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.esperanto.proto.GetStateResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 11:
                return Boolean.valueOf(yto.j((String) obj));
            case 12:
                return Boolean.valueOf(((vge0) obj) == vge0.a);
            case 13:
                return Observable.just((rih1) obj).delay(1500L, TimeUnit.MILLISECONDS);
            case 17:
                return Boolean.valueOf("premium".equals((String) obj));
            case 19:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return EsImage.ImageData.s(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.image.esperanto.proto.EsImage.ImageData: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 23:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return Mdata.LocalBatchedExtensionResponse.n(bArr4);
                } catch (Exception e5) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.mdata.proto.Mdata.LocalBatchedExtensionResponse: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e5);
                    return null;
                }
            case 26:
                byte[] bArr5 = (byte[]) obj;
                try {
                    return EsOffline.GetDevicesResponse.o(bArr5);
                } catch (Exception e6) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.GetDevicesResponse: '", Base64.getEncoder().encodeToString(bArr5), "' (Base64)"), e6);
                    return null;
                }
            default:
                return new e2v0(((Boolean) obj).booleanValue());
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 10:
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                ((Boolean) obj3).getClass();
                return oqn1.n((idu0) obj, bool);
            case 14:
                Boolean bool2 = (Boolean) obj;
                return new v1v((List) obj3, bool2.booleanValue(), !bool2.booleanValue() && ((Boolean) obj2).booleanValue());
            default:
                return (Boolean) obj;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((nhv) obj) instanceof mhv;
            case 3:
                return ((vge0) obj) == vge0.b;
            case 5:
                gfb gfbVar = (gfb) obj;
                return gfbVar.a && gfbVar.b != null;
            case 18:
                return !((wv00) ((uv00) obj)).f;
            case 22:
                return ((Boolean) obj).booleanValue();
            case 24:
                return ((a4n0) obj) != a4n0.a;
            default:
                return !((k650) obj).c().l();
        }
    }

    @Override // p.v8v
    public void c() {
    }

    @Override // p.v8v
    public void f(int i2) {
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 6:
                mmr0 mmr0Var = (mmr0) obj2;
                return new vqd(((Boolean) obj).booleanValue(), ((Boolean) mmr0Var.a).booleanValue(), (String) mmr0Var.b);
            default:
                return (((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue()) ? vge0.a : vge0.b;
        }
    }
}
