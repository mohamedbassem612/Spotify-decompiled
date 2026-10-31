package p;

import android.view.View;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mgx0 implements Function, BiFunction, k1q0, Predicate, com.spotify.mobius.functions.Function, Init, s2i1, ps40 {
    public final /* synthetic */ byte a;
    public static final mgx0 b = new mgx0((byte) 0);
    public static final mgx0 c = new mgx0((byte) 1);
    public static final mgx0 d = new mgx0((byte) 3);
    public static final mgx0 e = new mgx0((byte) 4);
    public static final mgx0 f = new mgx0((byte) 5);
    public static final mgx0 g = new mgx0((byte) 6);
    public static final mgx0 h = new mgx0((byte) 7);
    public static final mgx0 i = new mgx0((byte) 8);
    public static final mgx0 t = new mgx0((byte) 9);
    public static final mgx0 X = new mgx0((byte) 10);
    public static final mgx0 Y = new mgx0((byte) 11);
    public static final mgx0 Z = new mgx0((byte) 12);
    public static final mgx0 N0 = new mgx0((byte) 13);
    public static final mgx0 O0 = new mgx0((byte) 14);
    public static final mgx0 P0 = new mgx0((byte) 15);
    public static final mgx0 Q0 = new mgx0((byte) 16);
    public static final mgx0 R0 = new mgx0((byte) 17);
    public static final mgx0 S0 = new mgx0((byte) 18);
    public static final mgx0 T0 = new mgx0((byte) 19);
    public static final mgx0 U0 = new mgx0((byte) 20);
    public static final mgx0 V0 = new mgx0((byte) 21);
    public static final mgx0 W0 = new mgx0((byte) 22);
    public static final mgx0 X0 = new mgx0((byte) 23);
    public static final mgx0 Y0 = new mgx0((byte) 24);
    public static final mgx0 Z0 = new mgx0((byte) 25);
    public static final mgx0 a1 = new mgx0((byte) 26);

    public mgx0(w4b1 w4b1Var) {
        this.a = (byte) 28;
    }

    public static svz0 a(svz0 svz0Var, svz0 svz0Var2) {
        svz0 svz0Var3 = svz0.d;
        Map map = svz0Var.b;
        Map map2 = svz0Var2.b;
        Map map3 = svz0Var3.b;
        if (map2.isEmpty() && map3.isEmpty()) {
            return svz0Var;
        }
        return ulc.m(sc50.a(svz0Var.a, o7h.l1(sqg0.O(sqg0.O(map, map3), map2).values()), 27));
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new zgx0((Map) obj);
            case 1:
                beh behVar = (feh) obj;
                return behVar instanceof beh ? new g7z0(behVar.a) : h7z0.a;
            case 3:
                return new a011((Map) obj);
            case 4:
                return (String) ((spq0) obj).b();
            case 8:
                PlayerState playerState = (PlayerState) obj;
                return Boolean.valueOf(playerState.isBuffering() && playerState.isPlaying() && !playerState.isPaused());
            case 11:
                return ((yp81) obj).a;
            case 13:
                return new nxe0((kww) obj);
            case 14:
                return (re9) o7h.A0((List) obj);
            case 17:
                return Boolean.valueOf(y7y0.z((Map) obj));
            case 18:
                return Integer.valueOf(((l3c1) obj).getFormat());
            case 22:
                a1f1 a1f1Var = (b1f1) obj;
                if (a1f1Var instanceof a1f1) {
                    wze1 wze1Var = a1f1Var.a;
                    return wze1Var.a.length() == 0 ? Single.error(new IllegalStateException("IDT Success received with missing token.")) : Single.just(wze1Var);
                }
                if (!(a1f1Var instanceof z0f1)) {
                    eg.o();
                    return null;
                }
                return Single.error(new RuntimeException("Failure received during IDT exchange. Response: " + a1f1Var));
            default:
                return y6b1.b(f9a.a(phc.m((String) obj).t())).toString();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:43|25|(0)(1:28)) */
    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        r13 = r1;
        r12 = r2;
        r1 = r9;
        r2 = r11;
        r9 = 0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00af -> B:35:0x00b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(p.iu30 r18, p.onm r19) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mgx0.b(p.iu30, p.onm):java.lang.Object");
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 19:
                return First.c((ghm0) obj, Collections.singleton(gcw.a));
            default:
                return First.b((zgm0) obj);
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("account_id");
        if (str4 == null || !gho1.k(str4) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
            return null;
        }
        return new eji1(str4, str3, xkg0Var, str2, str);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 9:
                return !((uv00) obj).f;
            case 10:
                return !((uv00) obj).f;
            case 11:
            case 13:
            case 14:
            default:
                return ((th61) obj).b;
            case 12:
                return ((Boolean) obj).booleanValue();
            case 15:
                return ((PlayerState) obj).track().c();
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(519);
        view.setPadding(nk80VarI.a, nk80VarI.b, nk80VarI.c, nk80VarI.d);
        return hsl1Var;
    }

    public /* synthetic */ mgx0(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 5:
                return new mmr0((dxg0) obj, (Boolean) obj2);
            case 6:
                gbl gblVar = (gbl) obj;
                Boolean bool = (Boolean) obj2;
                if (gblVar.b && gblVar != gbl.Z) {
                    bool.getClass();
                    return Boolean.valueOf(!bool.booleanValue());
                }
                return Boolean.FALSE;
            default:
                return new mmr0((Set) obj, ((ContextTrack) obj2).uri());
        }
    }
}
