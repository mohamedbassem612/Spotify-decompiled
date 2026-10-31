package p;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.StatsDetailsResponse;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eoc implements s7v, n8n, Init, c290, de70, hj71, BiPredicate, jrn0, np80, BiFunction, Predicate, zfa, Function {
    public final /* synthetic */ byte a;

    public /* synthetic */ eoc(byte b) {
        this.a = b;
    }

    public static e1h1 c(y0h1 y0h1Var, o8a0 o8a0Var, a8b0 a8b0Var) {
        boolean z;
        if (!o8a0Var.c) {
            o8a0Var = o8a0Var.b(1);
        }
        int iC = l1d.C(o8a0Var.b);
        if (iC != 0 && iC != 1) {
            if (iC == 2) {
                return new f1h1(1, a8b0Var);
            }
            eg.o();
            return null;
        }
        int iX = y0h1Var.x();
        if (iX == 1) {
            z = true;
        } else if (iX != 2) {
            if (iX != 3) {
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return !a8b0Var.t0().getParameters().isEmpty() ? new f1h1(3, a8b0Var) : o1h1.k(y0h1Var, o8a0Var);
        }
        return new f1h1(1, kht.e(y0h1Var).o());
    }

    public static boolean e(y570 y570Var) {
        return (((id70) y570Var.n()).a.a == null && ((id70) y570Var.n()).a.b == null && ((id70) y570Var.n()).a.d == null) ? false : true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void a(wda0 wda0Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-649511818);
        int i2 = i | (x340Var.g(wda0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 2048 : 1024) | (x340Var.i(function3) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            if (wda0Var instanceof uda0) {
                x340Var.i0(-778645434);
                mth1.c((uda0) wda0Var, function0, function1, function2, function3, x340Var, i2 & 524286);
                x340Var.r(false);
            } else {
                if (!wda0Var.equals(vda0.a)) {
                    throw p3d1.k(x340Var, -1410592171, false);
                }
                x340Var.i0(-778369317);
                x340Var.r(false);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5(this, wda0Var, function0, function1, function2, function3, qim0Var2, i, (byte) 23);
        }
    }

    public Object apply(Object obj, Object obj2) {
        String str = (String) obj;
        wsc0 wsc0Var = (wsc0) obj2;
        kby kbyVar = wsc0Var.f;
        String str2 = kbyVar.b;
        List list = wsc0Var.e;
        ArrayList<zuc0> arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (((zuc0) obj3).p instanceof k1z) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (zuc0 zuc0Var : arrayList) {
            k1z k1zVar = zuc0Var.p;
            String str3 = zuc0Var.c;
            String str4 = zuc0Var.i;
            boolean zC = zuc0Var.c();
            String str5 = kbyVar.b;
            boolean z = zuc0Var.k;
            String str6 = k1zVar.b;
            long j = k1zVar.h;
            String strA = k1zVar.a(1);
            long j2 = k1zVar.m;
            String str7 = (String) zuc0Var.r.getValue();
            String strW = "";
            if (str7 != null && str7.length() != 0) {
                strW = nhc1.W(str, "{id}", str7);
            }
            arrayList2.add(new jh90(str3, str4, strA, str5, strW, str6, z, zC, j, j2));
        }
        return new hey(str2, arrayList2);
    }

    public y570 b(y570 y570Var) {
        if (!u970.d.a.equals(y570Var.h().a()) || (((dd70) y570Var.k()).a.d == null && !e(y570Var))) {
            return y570Var;
        }
        String strA = y570Var.a();
        ld70 ld70Var = ((dd70) y570Var.k()).a.d;
        gd70 gd70Var = gd70.c;
        wwo1 wwo1VarE = gd70Var.a.Q(u970.c).E(strA == null ? null : strA.concat("-container"));
        cd70 cd70Var = dd70.c.a;
        boolean zJ = u890.j(cd70Var.d, ld70Var);
        uwo1 uwo1Var = cd70Var;
        if (!zJ) {
            bd70 bd70Var = new bd70(cd70Var);
            bd70Var.d = ld70Var;
            uwo1Var = bd70Var;
        }
        wwo1 wwo1VarF = wwo1VarE.F(uwo1Var.k());
        if (e(y570Var)) {
            String strA2 = y570Var.a();
            j670 j670VarN = y570Var.n();
            wwo1 wwo1VarE2 = gd70Var.a.Q(bc70.b).E(strA2 == null ? null : strA2.concat("-header"));
            i670 i670VarD = id70.c.a.d(((id70) j670VarN).a.a);
            hd70 hd70Var = ((id70) j670VarN).a;
            wwo1VarF = wwo1VarF.n(new y570[]{wwo1VarE2.L(i670VarD.b(hd70Var.b).a(hd70Var.d)).x()});
        }
        return wwo1VarF.n(new y570[]{y570Var.toBuilder().M(null).F((x570) null).x()}).x();
    }

    public Object convert(int i) {
        uqu0 uqu0Var = null;
        switch (this.a) {
            case 9:
                hz00 hz00VarB = hz00.b(i);
                return hz00VarB == null ? hz00.V5 : hz00VarB;
            case 10:
                if (i == 0) {
                    uqu0Var = zn01.b;
                } else if (i == 1) {
                    uqu0Var = zn01.c;
                } else if (i == 2) {
                    uqu0Var = zn01.d;
                } else if (i == 3) {
                    uqu0Var = zn01.e;
                } else if (i == 4) {
                    uqu0Var = zn01.f;
                }
                return uqu0Var == null ? zn01.g : uqu0Var;
            case 11:
                nig nigVarA = nig.a(i);
                return nigVarA == null ? nig.e : nigVarA;
            default:
                switch (i) {
                    case 0:
                        uqu0Var = uqu0.b;
                        break;
                    case 1:
                        uqu0Var = uqu0.c;
                        break;
                    case 2:
                        uqu0Var = uqu0.d;
                        break;
                    case 3:
                        uqu0Var = uqu0.e;
                        break;
                    case 4:
                        uqu0Var = uqu0.f;
                        break;
                    case 5:
                        uqu0Var = uqu0.g;
                        break;
                    case 6:
                        uqu0Var = uqu0.h;
                        break;
                    case 7:
                        uqu0Var = uqu0.i;
                        break;
                    case 8:
                        uqu0Var = uqu0.t;
                        break;
                    case 9:
                        uqu0Var = uqu0.X;
                        break;
                    case 10:
                        uqu0Var = uqu0.Y;
                        break;
                    case 11:
                        uqu0Var = uqu0.Z;
                        break;
                    case 12:
                        uqu0Var = uqu0.N0;
                        break;
                    case 13:
                        uqu0Var = uqu0.O0;
                        break;
                    case 14:
                        uqu0Var = uqu0.P0;
                        break;
                    case 15:
                        uqu0Var = uqu0.Q0;
                        break;
                    case 16:
                        uqu0Var = uqu0.R0;
                        break;
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        uqu0Var = uqu0.S0;
                        break;
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        uqu0Var = uqu0.T0;
                        break;
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        uqu0Var = uqu0.U0;
                        break;
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        uqu0Var = uqu0.V0;
                        break;
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        uqu0Var = uqu0.W0;
                        break;
                }
                return uqu0Var == null ? uqu0.X0 : uqu0Var;
        }
    }

    public vfa d() {
        return new xbd1();
    }

    public First e0(Object obj) {
        return First.b((ayq) obj);
    }

    public Drawable f(Bitmap bitmap) {
        bitmap.getClass();
        return new bcg(bitmap);
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Object next;
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        Uri uri = Uri.parse(dataString);
        String queryParameter = uri.getQueryParameter("session");
        Iterator it = vur0.g.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((vur0) next).a.equals(uri.getQueryParameter("source")));
        vur0 vur0Var = (vur0) next;
        if (vur0Var == null) {
            vur0Var = vur0.e;
        }
        return qv3.c(th61Var.a, queryParameter, vur0Var, (String) null, nik1.P3);
    }

    public Object n(k371 k371Var, lnm lnmVar) {
        String string;
        wa71 wa71Var = k371Var.a;
        if (wa71Var == null || ((String) wa71Var.c.get("challenge_id")) == null || wa71Var.e == null || (string = k371Var.b.getString("music_quiz.share.completion_id")) == null) {
            return null;
        }
        Set set = s4b1.f;
        return new qj71(Collections.singletonList(new u771(new t771(wa71Var, new z771(uic.x("spotify:shareformat:entity"))), new pz61(new y171(rc11.a.b(i7n0.class)), new k7n0(new Uri.Builder().encodedPath(wa71Var.a).appendQueryParameter("completion_id", string).build().toString()), az61.d, false))), 0, puk.d);
    }

    public boolean test(Object obj, Object obj2) {
        switch (this.a) {
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                return y7y0.L(map) == y7y0.L(map2) && u890.j(map.get("pick-and-shuffle"), map2.get("pick-and-shuffle"));
            default:
                z6x0 z6x0Var = (z6x0) obj;
                z6x0 z6x0Var2 = (z6x0) obj2;
                z6x0Var.getClass();
                z6x0Var2.getClass();
                return z6x0Var.Y == z6x0Var2.Y;
        }
    }

    public /* synthetic */ eoc(Object obj, Object obj2, byte b) {
        this.a = b;
    }

    public boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        if (!playerState.track().c()) {
            return false;
        }
        j380 j380VarMetadata = ((ContextTrack) playerState.track().b()).metadata();
        return j380VarMetadata.containsKey("title") && j380VarMetadata.containsKey("artist_name") && j380VarMetadata.containsKey("album_title");
    }

    public Object apply(Object obj) {
        StatsDetailsResponse statsDetailsResponse = (StatsDetailsResponse) obj;
        try {
            ArrayList arrayList = new ArrayList();
            zso1.X(statsDetailsResponse, arrayList);
            vbx0.g(statsDetailsResponse, arrayList);
            return new vhi1(o7h.l1(arrayList), m2f1.a);
        } catch (Throwable th) {
            return n3o1.t(th);
        }
    }
}
