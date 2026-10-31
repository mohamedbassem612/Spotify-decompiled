package p;

import android.content.Context;
import android.net.Uri;
import androidx.datastore.core.CorruptionException;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import spotify.profile_esperanto.proto.GetProfilesResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fjb implements BiFunction, xyz0, Function, au11, c290, uz71, Function3, n8n, hyd, dsn, Init {
    public final /* synthetic */ byte a;

    public static final vpu e(boolean z, boolean z2, boolean z3) {
        return ((z2 && z3) || z) ? vpu.a : vpu.b;
    }

    public static fkn i(o571 o571Var, s4b1 s4b1Var) {
        boolean zEquals = o571Var.equals(d571.d);
        yy61 yy61Var = yy61.b;
        if (zEquals) {
            fkn fknVar = new fkn((byte) 3);
            mqo1.s(new yy61[]{yy61Var});
            return fknVar;
        }
        if (o571Var.equals(t471.d)) {
            fkn fknVar2 = new fkn((byte) 1);
            mqo1.s(new yy61[]{yy61Var});
            return fknVar2;
        }
        if (o571Var.equals(b571.d)) {
            fkn fknVar3 = new fkn((byte) 2);
            mqo1.s(new yy61[]{yy61Var});
            return fknVar3;
        }
        if (!o571Var.equals(n471.d)) {
            n9v.f(o571Var, " is not an OnPlatform destination");
            return null;
        }
        fkn fknVar4 = new fkn((byte) 0);
        mqo1.s(new yy61[]{yy61Var});
        return fknVar4;
    }

    public static ave0 l(y570 y570Var) {
        Integer numR;
        HubsImmutableComponentBundle[] hubsImmutableComponentBundleArrH = y570Var.r().h("ubi:path");
        HubsImmutableComponentBundle hubsImmutableComponentBundle = hubsImmutableComponentBundleArrH != null ? (HubsImmutableComponentBundle) f46.k0(hubsImmutableComponentBundleArrH) : null;
        int iIntValue = (hubsImmutableComponentBundle == null || (numR = hubsImmutableComponentBundle.r("position")) == null) ? 0 : numR.intValue();
        return new ave0(hubsImmutableComponentBundle != null ? hubsImmutableComponentBundle.B("id") : null, hubsImmutableComponentBundle != null ? hubsImmutableComponentBundle.B("reason") : null, iIntValue, hubsImmutableComponentBundle != null ? hubsImmutableComponentBundle.B("uri") : null);
    }

    public n8h1 a(r6h1 r6h1Var) {
        return new jpk0(new py9(r6h1Var, (byte) 14), (char) 0);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                GetProfilesResponse getProfilesResponse = (GetProfilesResponse) obj;
                int statusCode = getProfilesResponse.getStatusCode();
                return Observable.just(spq0.a((200 > statusCode || statusCode >= 300 || getProfilesResponse.p() <= 0) ? null : v5n.e(getProfilesResponse.o())));
            case 7:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 10:
                return "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ";
            case 16:
                return alj0.b.get(obj);
            case 17:
                return Integer.valueOf(((dma1) obj).l(v1o0.h, 0));
            case 25:
                List list = (List) obj;
                return list.size() > 1 ? new wp91(list) : vp91.a;
            default:
                return fdc1.b.get(obj);
        }
    }

    public long b(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1420523422);
        uwr uwrVar = cbx.a;
        long jA = cbx.a(x340Var).a.b.a();
        x340Var.r(false);
        return jA;
    }

    public /* bridge */ /* synthetic */ w7h1 c(rxd rxdVar) {
        return null;
    }

    public Object convert(int i) {
        xls0 xls0VarA = xls0.a(i);
        return xls0VarA == null ? xls0.h : xls0VarA;
    }

    public long d(boolean z, b0k b0kVar) {
        long jC;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1050932339);
        if (z) {
            x340Var.i0(628666078);
            x340Var.r(false);
            jC = u7h.j;
        } else {
            x340Var.i0(628667708);
            uwr uwrVar = cbx.a;
            jC = cbx.a(x340Var).a.b.c();
            x340Var.r(false);
        }
        x340Var.r(false);
        return jC;
    }

    public First e0(Object obj) {
        kzc kzcVar = (kzc) obj;
        kzcVar.toString();
        return First.b(kzcVar);
    }

    public boolean f(String str) {
        String path;
        Uri uri = Uri.parse(str);
        if (uri.isHierarchical()) {
            String authority = uri.getAuthority();
            if (u890.j(authority != null ? authority.toLowerCase(Locale.ROOT) : null, "open.spotify.com") && (path = uri.getPath()) != null && nhc1.Y(path, "/s/", false) && path.length() > 3) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i) {
        return true;
    }

    public long h(boolean z, b0k b0kVar) {
        long jC;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1966177013);
        if (z) {
            x340Var.i0(-289496866);
            uwr uwrVar = cbx.a;
            jC = cbx.a(x340Var).a.b.c();
            x340Var.r(false);
        } else {
            x340Var.i0(-289496192);
            x340Var.r(false);
            jC = u7h.j;
        }
        x340Var.r(false);
        return jC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(Context context, int i, onm onmVar) {
        clb0 clb0Var;
        dnb0 dnb0VarM;
        if (onmVar instanceof clb0) {
            clb0Var = (clb0) onmVar;
            int i2 = clb0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clb0Var.e = i2 - Integer.MIN_VALUE;
            } else {
                clb0Var = new clb0(this, onmVar);
            }
        } else {
            clb0Var = new clb0(this, onmVar);
        }
        Object objC = clb0Var.c;
        int i3 = clb0Var.e;
        try {
            if (i3 == 0) {
                hm5.M(objC);
                clb0Var.a = context;
                clb0Var.b = i;
                clb0Var.e = 1;
                objC = nt40.a.c(context, tnb0.b, "appWidgetLayout-" + i, clb0Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = clb0Var.b;
                context = clb0Var.a;
                hm5.M(objC);
            }
            dnb0VarM = (dnb0) objC;
        } catch (IOException unused) {
            dnb0VarM = dnb0.m();
        } catch (CorruptionException unused2) {
            dnb0VarM = dnb0.m();
        }
        Context context2 = context;
        int i4 = i;
        f290<fnb0> f290VarN = dnb0VarM.n();
        int iS = zno1.s(q7h.U(f290VarN, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (fnb0 fnb0Var : f290VarN) {
            linkedHashMap.put(fnb0Var.k(), new Integer(fnb0Var.l()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        return new dlb0(context2, linkedHashMap2, dnb0VarM.o(), i4, o7h.o1(linkedHashMap2.values()));
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        if (fe00Var.equals(be00.a)) {
            return eu11.a;
        }
        return null;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        Map map;
        PlayerState playerState = (PlayerState) obj2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        double dDoubleValue = 0.0d;
        if (contextTrack != null && (map = (Map) linkedHashMap.get(playerState.playbackId().e(""))) != null) {
            j380 j380VarMetadata = contextTrack.metadata();
            String str = (String) j380VarMetadata.get("visualization.position_as_of_timestamp");
            long j = str != null ? Long.parseLong(str) : 0L;
            String str2 = (String) j380VarMetadata.get("visualization.playback_speed");
            double dA = ((Scheduler.a(TimeUnit.MILLISECONDS) - playerState.timestamp()) * (str2 != null ? Double.parseDouble(str2) : 0.0d)) + j;
            long j2 = (long) (dA - (dA % 40.0d));
            long j3 = 40 + j2;
            Double d = (Double) map.get(Long.valueOf(j2));
            if (d != null) {
                dDoubleValue = d.doubleValue();
                Double d2 = (Double) map.get(Long.valueOf(j3));
                if (d2 != null) {
                    dDoubleValue += (d2.doubleValue() - dDoubleValue) * ((dA - j2) / 40.0d);
                }
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    public String toString() {
        switch (this.a) {
            case 23:
                int iHashCode = hashCode();
                eth.h(16);
                return cy30.p("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", rc11.a.b(qe41.class).r(), ">");
            default:
                return super.toString();
        }
    }

    public fjb(daq daqVar, teq teqVar) {
        this.a = (byte) 5;
    }

    public Object apply(Object obj, Object obj2) {
        zib zibVar = (zib) obj2;
        return (!(zibVar instanceof yib) || ((Set) obj).contains("social_radar")) ? zibVar : xib.a;
    }
}
