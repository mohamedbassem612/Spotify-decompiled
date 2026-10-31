package p;

import android.view.accessibility.AccessibilityManager;
import com.spotify.login.loginflowimpl.LoginActivity;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto;
import com.spotify.player.model.PlayerState;
import com.spotify.pses.v1.proto.AuthMethod;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ua20 implements Function, Predicate, BiFunction, Init, av30, s2i1 {
    public final /* synthetic */ byte a;
    public static final ua20 b = new ua20(0);
    public static final ua20 c = new ua20(1);
    public static final ua20 d = new ua20(2);
    public static final ua20 e = new ua20(3);
    public static final ua20 f = new ua20(4);
    public static final ua20 g = new ua20(5);
    public static final ua20 h = new ua20(6);
    public static final ua20 i = new ua20(7);
    public static final ua20 t = new ua20(8);
    public static final ua20 X = new ua20(9);
    public static final ua20 Y = new ua20(11);
    public static final ua20 Z = new ua20(12);
    public static final ua20 N0 = new ua20(13);
    public static final ua20 O0 = new ua20(14);
    public static final ua20 P0 = new ua20(15);
    public static final ua20 Q0 = new ua20(16);
    public static final ua20 R0 = new ua20(17);
    public static final ua20 S0 = new ua20(18);
    public static final ua20 T0 = new ua20(19);
    public static final ua20 U0 = new ua20(20);
    public static final ua20 V0 = new ua20(21);
    public static final ua20 W0 = new ua20(22);
    public static final ua20 X0 = new ua20(23);
    public static final ua20 Y0 = new ua20(24);
    public static final ua20 Z0 = new ua20(25);
    public static final ua20 a1 = new ua20(26);
    public static final ua20 b1 = new ua20(27);
    public static final ua20 c1 = new ua20(28);
    public static final ua20 d1 = new ua20(29);

    public /* synthetic */ ua20(byte b2) {
        this.a = b2;
    }

    public static final tf11 a(wab wabVar, eh8 eh8Var, tf11 tf11Var) {
        Object next;
        if (wabVar != null) {
            Iterator it = wabVar.b.q().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((AuthMethod) next).o() != eh8Var);
            AuthMethod authMethod = (AuthMethod) next;
            if ((authMethod != null ? authMethod.p() : null) == fh8.d) {
                return tf11Var;
            }
        }
        return null;
    }

    public static boolean b(LoginActivity loginActivity) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) loginActivity.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                hb10 hb10Var = (hb10) obj;
                List list = hb10Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r8s0) it.next()).a);
                }
                return new i5w0(new k3c1(hb10Var.c, hb10Var.d, hb10Var.a, arrayList));
            case 1:
                return Boolean.valueOf(!((ne81) obj).a.isEmpty());
            case 2:
                int i2 = Integer.parseInt((String) obj);
                return new lfd((i2 & 1) != 0, (i2 & 2) != 0, (i2 & 4) != 0);
            case 3:
            case 5:
            case 7:
            case 10:
            case 13:
            case 15:
            case 22:
            case 23:
            case 26:
            default:
                return rih1.a;
            case 4:
                return Observable.empty();
            case 6:
                return new byt0((x3s0) obj);
            case 8:
                woc0 woc0Var = (woc0) obj;
                return new ctc0(woc0Var.a, woc0Var.b);
            case 9:
                return ((th61) obj).a;
            case 11:
                return new gif0(((PlayerState) obj).restrictions().disallowSeekingReasons().isEmpty());
            case 12:
                List list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new mig0((fpt) it2.next()));
                }
                return arrayList2;
            case 14:
                return (j331) ((mmr0) obj).b;
            case 16:
                return ((jzo0) obj).c;
            case 17:
                return Boolean.valueOf(((gr41) obj).a > 0);
            case 18:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline.PrepareResourceResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.PrepareResourceResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 19:
                return cqg0.b((EsOffline.GetContextsResponse) obj);
            case 20:
                return Observable.fromIterable(((z310) obj).a);
            case 21:
                return new e331((PaymentSdkNativeServiceProto.GetPaymentSessionResponse) obj);
            case 24:
                return o4p1.o((PlayerState) obj);
            case 25:
                return (Long) ((spq0) obj).b();
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return Boolean.FALSE;
            case 28:
                return Boolean.valueOf(((vov0) obj) instanceof uov0);
        }
    }

    public First e0(Object obj) {
        return First.b((omi0) obj);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new kyu0(str2, str, xkg0Var);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                return !ihc1.y0((String) obj);
            default:
                return ((th61) obj).b;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 7:
                return new sdb0((List) obj, (String) ((spq0) obj2).h());
            case 22:
                return new mmr0((l510) obj, (Map) obj2);
            default:
                return new mmr0((Boolean) obj, (ktl) obj2);
        }
    }
}
