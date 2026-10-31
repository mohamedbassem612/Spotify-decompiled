package p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hgx0 implements BiFunction, Function, Predicate, k1q0, com.spotify.mobius.functions.Function, BiPredicate, s2i1, jgg1, tax {
    public final /* synthetic */ byte a;
    public static final hgx0 b = new hgx0(0);
    public static final hgx0 c = new hgx0(1);
    public static final hgx0 d = new hgx0(2);
    public static final hgx0 e = new hgx0(3);
    public static final hgx0 f = new hgx0(4);
    public static final hgx0 g = new hgx0(5);
    public static final hgx0 h = new hgx0(6);
    public static final hgx0 i = new hgx0(7);
    public static final hgx0 t = new hgx0(8);
    public static final hgx0 X = new hgx0(9);
    public static final hgx0 Y = new hgx0(10);
    public static final hgx0 Z = new hgx0(11);
    public static final hgx0 N0 = new hgx0(12);
    public static final hgx0 O0 = new hgx0(13);
    public static final hgx0 P0 = new hgx0(14);
    public static final hgx0 Q0 = new hgx0(15);
    public static final hgx0 R0 = new hgx0(16);
    public static final hgx0 S0 = new hgx0(17);
    public static final hgx0 T0 = new hgx0(18);
    public static final hgx0 U0 = new hgx0(19);
    public static final hgx0 V0 = new hgx0(20);
    public static final hgx0 W0 = new hgx0(21);
    public static final hgx0 X0 = new hgx0(22);
    public static final hgx0 Y0 = new hgx0(23);
    public static final hgx0 Z0 = new hgx0(24);
    public static final /* synthetic */ hgx0 a1 = new hgx0(25);
    public static final hgx0 b1 = new hgx0(26);

    public /* synthetic */ hgx0(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(xm41 xm41Var, onm onmVar) {
        ong1 ong1Var;
        if (onmVar instanceof ong1) {
            ong1Var = (ong1) onmVar;
            int i2 = ong1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ong1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                ong1Var = new ong1(this, onmVar);
            }
        } else {
            ong1Var = new ong1(this, onmVar);
        }
        Object objI = ong1Var.a;
        int i3 = ong1Var.c;
        if (i3 == 0) {
            hm5.M(objI);
            ph11 ph11Var = new ph11(eth.V(xm41Var), (byte) 15);
            ong1Var.c = 1;
            objI = b5p1.i(ph11Var, ong1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        return ((kb61) ((jn41) objI).a).U();
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return new l7z0(b7x.a);
            case 3:
                Logger.e((Throwable) obj, "Assisted Curation: Failed to fetch Item Specific Recommendations", new Object[0]);
                return z6x.a;
            case 4:
                return ((PlayerState) obj).restrictions().disallowSkippingNextReasons();
            case 5:
                yvg1 yvg1Var = (yvg1) obj;
                Boolean bool = (Boolean) yvg1Var.a;
                List list = (List) yvg1Var.b;
                String str = (String) yvg1Var.c;
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((lc40) it.next()).a);
                }
                if (bool.booleanValue()) {
                    return new dk21(str);
                }
                return !arrayList.isEmpty() ? new fk21(arrayList) : ek21.a;
            case 6:
                return new h231(9, (Throwable) obj);
            case 8:
                String str2 = (String) ((ContextTrack) ((PlayerState) obj).track().b()).metadata().get("previous_accumulative_ms");
                Long lValueOf = str2 != null ? Long.valueOf(Long.parseLong(str2)) : null;
                return Long.valueOf(lValueOf != null ? lValueOf.longValue() : -1L);
            case 11:
                return new ro81((fjn0) obj);
            case 12:
                return ((th61) obj).a;
            case 13:
                bxe0 bxe0Var = (bxe0) obj;
                return ((Single) bxe0Var.b.i.invoke(bxe0Var.a)).map(new c681(bxe0Var, (byte) 7)).onErrorReturn(gex0.O0);
            case 15:
                return String.valueOf(((Boolean) obj).booleanValue());
            case 23:
                Logger.e((Throwable) obj, "Welcome clip entrypoint failed", new Object[0]);
                return Optional.empty();
            default:
                return (byte[]) obj;
        }
    }

    public void c(xax xaxVar) {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            boolean zB = xaxVar.b();
            sb = xaxVar.c;
            if (!zB) {
                break;
            }
            sb2.append(xaxVar.a());
            int i2 = xaxVar.d + 1;
            xaxVar.d = i2;
            if (eko1.A(i2, 5, xaxVar.a) != 5) {
                xaxVar.e = 0;
                break;
            }
        }
        int length = sb2.length() - 1;
        int length2 = sb.length() + length + 1;
        xaxVar.c(length2);
        boolean z = xaxVar.f.b - length2 > 0;
        if (xaxVar.b() || z) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length > 1555) {
                eg.m("Message length not in valid ranges: ".concat(String.valueOf(length)));
                return;
            } else {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            }
        }
        int length3 = sb2.length();
        for (int i3 = 0; i3 < length3; i3++) {
            int length4 = (((sb.length() + 1) * 149) % 255) + 1 + sb2.charAt(i3);
            if (length4 > 255) {
                length4 -= 256;
            }
            xaxVar.d((char) length4);
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4;
        switch (this.a) {
            case 20:
                String str5 = (String) linkedHashMap.get("account_id");
                if (str5 == null || !gho1.k(str5) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
                    return null;
                }
                return new dji1(str5, str3, xkg0Var, str2, str);
            default:
                String str6 = (String) linkedHashMap.get("contest_id");
                if (str6 != null && gho1.n(str6) && (str4 = (String) linkedHashMap.get("award_id")) != null && gho1.n(str4)) {
                    return new vyk1(str6, str4, xkg0Var, str2, str);
                }
                return null;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return !((uv00) obj).f;
            case 9:
                return !((uv00) obj).f;
            case 10:
                return !((uv00) obj).f;
            case 14:
                return !((List) obj).isEmpty();
            case 16:
                return voo1.p((th61) obj);
            default:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        view.setPadding(view.getPaddingLeft(), hsl1Var.a.i(519).b, view.getPaddingRight(), view.getPaddingBottom());
        return hsl1Var;
    }

    public boolean test(Object obj, Object obj2) {
        return ((evf1) obj).a == ((evf1) obj2).a;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return sqg0.O((Map) obj, (Map) obj2);
            default:
                ContextTrack contextTrack = (ContextTrack) obj;
                return Boolean.valueOf(l4o1.X(contextTrack) && l4o1.Z(contextTrack) && (((twj1) obj2) instanceof swj1));
        }
    }
}
