package p;

import android.content.Intent;
import android.net.Uri;
import com.spotify.image.esperanto.proto.EsImage$ImageData;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.Map;
import java.util.Set;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wdu0 implements k10, Predicate, Function, BiFunction, n8n, Function3, jrn0 {
    public final /* synthetic */ byte a;
    public static final wdu0 b = new wdu0(0);
    public static final wdu0 c = new wdu0(1);
    public static final wdu0 d = new wdu0(2);
    public static final wdu0 e = new wdu0(3);
    public static final wdu0 f = new wdu0(4);
    public static final wdu0 g = new wdu0(5);
    public static final wdu0 h = new wdu0(6);
    public static final wdu0 i = new wdu0(7);
    public static final wdu0 t = new wdu0(8);
    public static final wdu0 X = new wdu0(9);
    public static final /* synthetic */ wdu0 Y = new wdu0(10);
    public static final wdu0 Z = new wdu0(11);
    public static final wdu0 N0 = new wdu0(12);
    public static final wdu0 O0 = new wdu0(13);
    public static final wdu0 P0 = new wdu0(15);
    public static final wdu0 Q0 = new wdu0(16);
    public static final wdu0 R0 = new wdu0(17);
    public static final wdu0 S0 = new wdu0(18);
    public static final wdu0 T0 = new wdu0(19);
    public static final wdu0 U0 = new wdu0(20);
    public static final wdu0 V0 = new wdu0(21);
    public static final wdu0 W0 = new wdu0(22);
    public static final wdu0 X0 = new wdu0(23);
    public static final wdu0 Y0 = new wdu0(24);
    public static final wdu0 Z0 = new wdu0(25);
    public static final wdu0 a1 = new wdu0(26);
    public static final wdu0 b1 = new wdu0(27);
    public static final wdu0 c1 = new wdu0(28);
    public static final wdu0 d1 = new wdu0(29);

    public /* synthetic */ wdu0(byte b2) {
        this.a = b2;
    }

    public static String a(String str, String str2, n2v n2vVar) {
        String str3 = nik1.C6.a;
        smc0 smc0VarN = k4p1.n();
        if (str != null) {
            smc0VarN.add("entityName=" + Uri.encode(str));
        }
        if (str2 != null) {
            smc0VarN.add("imageUrl=" + Uri.encode(str2));
        }
        if (n2vVar != null) {
            smc0VarN.add("entityType=" + n2vVar.name());
        }
        smc0 smc0VarK = k4p1.k(smc0VarN);
        return smc0VarK.isEmpty() ? str3 : xcg1.i(str3, "?", o7h.y0(smc0VarK, "&", null, null, null, 62));
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                l0l l0lVar = (l0l) ((spq0) obj).h();
                return Boolean.valueOf(l0lVar != null ? l0lVar.l() : true);
            case 6:
                return (Boolean) ((mmr0) obj).a;
            case 7:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionAddRemoveItemsResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.collection.esperanto.proto.CollectionAddRemoveItemsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 9:
                ln41 ln41Var = (ln41) obj;
                if (ln41Var instanceof jn41) {
                    vuk vukVar = (vuk) ((jn41) ln41Var).a;
                    return new vbl(vukVar.f(), vukVar.e());
                }
                if (ln41Var.equals(kn41.a)) {
                    return wbl.b;
                }
                eg.o();
                return null;
            case 11:
                return Boolean.FALSE;
            case 13:
                snz snzVarR = EsImage$ImageData.r();
                snzVarR.n();
                return (EsImage$ImageData) snzVarR.build();
            case 17:
                spq0 spq0Var = (spq0) obj;
                return spq0Var.c() ? new ee10((eww0) spq0Var.b()) : de10.a;
            case 22:
                return k4p1.x(new pxg0(((wug0) obj).a));
            case 23:
                return Boolean.valueOf(y7y0.D((Map) obj));
            case 26:
                return Boolean.valueOf(yto.j((String) obj));
            default:
                return new h9v0((Map) obj);
        }
    }

    @Override // p.jrn0
    public irn0 l(Intent intent, th61 th61Var) {
        hd5 hd5Var = null;
        switch (this.a) {
            case 19:
                String dataString = intent.getDataString();
                if (dataString == null) {
                    dataString = "";
                }
                return lfb.l(m190.class, new o190(dataString, intent.getBooleanExtra("age_assurance_flow_completed", false)), new c6w0(3, false, hd5Var, 14));
            default:
                return new frn0(null, k5e.class);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    public Object n(Object obj, Object obj2, Object obj3) {
        ei30 ei30Var = (ei30) obj;
        Boolean bool = (Boolean) obj3;
        if (!((Boolean) obj2).booleanValue()) {
            return new tir0(2);
        }
        if (ei30Var == ei30.d) {
            return new tir0(1);
        }
        return bool.booleanValue() ? new uir0(3) : xap1.A(ei30Var);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return ((zpd) obj) != zpd.e;
            case 4:
                return ((spq0) obj).c();
            case 18:
                return ((Boolean) obj).booleanValue();
            case 21:
                return ((spq0) obj).c();
            case 27:
                return ((f6r0) obj) instanceof xnh1;
            default:
                return ((spq0) obj).c();
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 5:
                Set set = (Set) obj;
                djb djbVar = (djb) obj2;
                if (djbVar instanceof cjb) {
                    return dm61.x0("social_radar", set);
                }
                if (djbVar instanceof ajb) {
                    return dm61.u0("social_radar", set);
                }
                if (djbVar instanceof bjb) {
                    return w7x.a;
                }
                eg.o();
                return null;
            default:
                return (spq0) obj2;
        }
    }
}
