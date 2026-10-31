package p;

import android.app.Activity;
import com.spotify.player.model.ContextTrack;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q6z implements a6z {
    public final kqi0 A;
    public final q8n B;
    public final l2a C;
    public final r9b D;
    public final xlr E;
    public final vbs F;
    public final o3r G;
    public final o3r H;
    public final o3r I;
    public final o3r J;
    public final o3r K;
    public final Activity a;
    public final o241 b;
    public final pqc1 c;
    public final b221 d;
    public final bl3 e;
    public final boolean f;
    public final a2q g;
    public final boolean h;
    public final boolean i;
    public final y4q j;
    public final t6z k;
    public final suu l;
    public final x1v m;
    public final g7h n;
    public final Flowable o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rsz0 f29p;
    public final f771 q;
    public final u35 r;
    public final gjc1 s;
    public final r2r t;
    public final ogr u;
    public final cp31 v;
    public final h3v w;
    public final gmt x;
    public final o860 y;
    public final go41 z;

    public q6z(Activity activity, o241 o241Var, pqc1 pqc1Var, b221 b221Var, bl3 bl3Var, boolean z, a2q a2qVar, boolean z2, boolean z3, y4q y4qVar, t6z t6zVar, suu suuVar, x1v x1vVar, g7h g7hVar, Flowable flowable, rsz0 rsz0Var, f771 f771Var, u35 u35Var, gjc1 gjc1Var, r2r r2rVar, ogr ogrVar, cp31 cp31Var, m4c m4cVar, h3v h3vVar, gmt gmtVar, o860 o860Var, go41 go41Var, kqi0 kqi0Var, q8n q8nVar, l2a l2aVar, r9b r9bVar, xlr xlrVar, vbs vbsVar) {
        this.a = activity;
        this.b = o241Var;
        this.c = pqc1Var;
        this.d = b221Var;
        this.e = bl3Var;
        this.f = z;
        this.g = a2qVar;
        this.h = z2;
        this.i = z3;
        this.j = y4qVar;
        this.k = t6zVar;
        this.l = suuVar;
        this.m = x1vVar;
        this.n = g7hVar;
        this.o = flowable;
        this.f29p = rsz0Var;
        this.q = f771Var;
        this.r = u35Var;
        this.s = gjc1Var;
        this.t = r2rVar;
        this.u = ogrVar;
        this.v = cp31Var;
        this.w = h3vVar;
        this.x = gmtVar;
        this.y = o860Var;
        this.z = go41Var;
        this.A = kqi0Var;
        this.B = q8nVar;
        this.C = l2aVar;
        this.D = r9bVar;
        this.E = xlrVar;
        this.F = vbsVar;
        jd11 jd11Var = rc11.a;
        this.G = w3p1.o(new l4r(new wlu(jd11Var.b(mtl.class)), 3, w4z.b1, new j4r(w4z.Y), w4z.c1), w4z.Z);
        this.H = w3p1.o(new l4r(new wlu(jd11Var.b(jo70.class)), 2, w4z.T0, new j4r(w4z.P0), w4z.U0), w4z.Q0);
        this.I = w3p1.o(new l4r(jd0.h, 2, w4z.V0, new j4r(w4z.t), w4z.W0), w4z.X);
        this.J = w3p1.o(new l4r(pwc0.b, 1, w4z.Z0, new j4r(w4z.R0), w4z.a1), w4z.S0);
        this.K = w3p1.o(new l4r(jd0.q, 2, w4z.X0, new j4r(w4z.N0), w4z.Y0), w4z.O0);
    }

    public static void e(i1z i1zVar, LinkedHashMap linkedHashMap, r6z r6zVar, lik1 lik1Var, iu30 iu30Var) {
        if (!i1zVar.f11p || r6zVar.e) {
            return;
        }
        l1z l1zVarA = i1zVar.D.a(l1z.class);
        if ((l1zVarA != null ? l1zVarA.e : false) || i1zVar.m) {
            return;
        }
        HashMap map = new HashMap();
        map.putAll(i1zVar.d());
        map.putAll(linkedHashMap);
        map.put("context_uri", lik1Var.a);
        iu30Var.invoke(ContextTrack.builder(i1zVar.a).metadata(map).build());
    }

    public static void f(smc0 smc0Var, i1z i1zVar, boolean z, boolean z2, z9p z9pVar, r6z r6zVar, c221 c221Var) {
        if (o(z, z2, i1zVar, r6zVar) && c221Var.a) {
            smc0Var.add(((k811) z9pVar.p).b(((i1z) z9pVar.A).a, 0, c221Var.b));
        }
    }

    public static void g(smc0 smc0Var, z9p z9pVar, i1z i1zVar, r6z r6zVar) {
        c821 c821Var = r6zVar.r;
        String str = r6zVar.a;
        if (!(c821Var instanceof a821) || str == null) {
            return;
        }
        String str2 = i1zVar.a;
        smc0Var.add(((e821) z9pVar.t).g(((a821) c821Var).a, str2, str, ((i1z) z9pVar.A).A));
    }

    public static void h(smc0 smc0Var, z9p z9pVar, i1z i1zVar, int i, r6z r6zVar) {
        d991 d991Var;
        if (r6zVar.h) {
            if (i1zVar.m) {
                d991Var = d991.c;
            } else if (i == 1) {
                d991Var = d991.d;
            } else {
                d991Var = i == 2 ? d991.e : d991.b;
            }
            smc0Var.add(((ke71) z9pVar.f).e(i1zVar.a, d991Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    public static void i(smc0 smc0Var, z9p z9pVar, i1z i1zVar, LinkedHashMap linkedHashMap, r6z r6zVar) {
        hux huxVar;
        Integer numC0;
        Object next;
        if (r6zVar.f) {
            String str = (String) linkedHashMap.get("episode_speed");
            Enum r0 = null;
            Object obj = null;
            r0 = null;
            tta1 tta1Var = new tta1(i1zVar.m ? n9x0.P0 : i1zVar.B == d1z.b ? o9x0.P0 : s9x0.Q0, (sta1) null);
            r2a1 r2a1Var = (r2a1) z9pVar.i;
            lik1 lik1Var = (lik1) z9pVar.z;
            if (str != null && (numC0 = nhc1.c0(str)) != null) {
                int iIntValue = numC0.intValue();
                t0z t0zVar = a5u0.e;
                Iterator it = t0zVar.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((a5u0) next).a != iIntValue);
                Enum r3 = (a5u0) next;
                if (r3 == null) {
                    for (Object obj2 : t0zVar) {
                        if (((a5u0) obj2).a == (iIntValue / 10) * 10) {
                            obj = obj2;
                            break;
                        }
                    }
                    r0 = (a5u0) obj;
                } else {
                    r0 = r3;
                }
            }
            oss ossVarA = ((lua1) r2a1Var.c).a((dg30) r2a1Var.b, lik1Var);
            if (r0 != null) {
                switch (r0.ordinal()) {
                    case 0:
                        huxVar = aqx.c;
                        break;
                    case 1:
                        huxVar = bqx.c;
                        break;
                    case 2:
                        huxVar = cqx.c;
                        break;
                    case 3:
                        huxVar = eqx.c;
                        break;
                    case 4:
                        huxVar = fqx.c;
                        break;
                    case 5:
                        huxVar = pqx.c;
                        break;
                    case 6:
                        huxVar = gqx.c;
                        break;
                    case 7:
                        huxVar = hqx.c;
                        break;
                    case 8:
                        huxVar = hqx.c;
                        break;
                    case 9:
                        huxVar = iqx.c;
                        break;
                    case 10:
                        huxVar = jqx.c;
                        break;
                    case 11:
                        huxVar = kqx.c;
                        break;
                    case 12:
                        huxVar = lqx.c;
                        break;
                    case 13:
                        huxVar = mqx.c;
                        break;
                    case 14:
                        huxVar = nqx.c;
                        break;
                    case 15:
                        huxVar = nqx.c;
                        break;
                    case 16:
                        huxVar = oqx.c;
                        break;
                    case 17:
                        huxVar = zqx.c;
                        break;
                    case 18:
                        huxVar = qqx.c;
                        break;
                    case 19:
                        huxVar = rqx.c;
                        break;
                    case 20:
                        huxVar = sqx.c;
                        break;
                    case 21:
                        huxVar = tqx.c;
                        break;
                    case 22:
                        huxVar = uqx.c;
                        break;
                    case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                        huxVar = vqx.c;
                        break;
                    case 24:
                        huxVar = wqx.c;
                        break;
                    case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                        huxVar = xqx.c;
                        break;
                    case 26:
                        huxVar = yqx.c;
                        break;
                    case 27:
                        huxVar = frx.c;
                        break;
                    case 28:
                        huxVar = arx.c;
                        break;
                    case 29:
                        huxVar = brx.c;
                        break;
                    case 30:
                        huxVar = crx.c;
                        break;
                    case 31:
                        huxVar = drx.c;
                        break;
                    case 32:
                        huxVar = erx.c;
                        break;
                    default:
                        eg.o();
                        return;
                }
                if (huxVar == null) {
                    huxVar = pqx.c;
                }
            } else {
                huxVar = pqx.c;
            }
            smc0Var.add(new jhm("podcast_playback_speed_control", huxVar, (fhm) null, 2131954450, (String) null, false, (tm81) null, new ihm(new bhm(2), r0 == a5u0.b ? hhm.a : hhm.b, new ghm(hea1.b1, hea1.c1), new iv81(ossVarA, tta1Var, (byte) 25)), 244));
        }
    }

    public static String m(i1z i1zVar) {
        String str;
        if (!i1zVar.m) {
            return i1zVar.a;
        }
        g281 g281Var = i1zVar.z;
        if (g281Var != null && (str = g281Var.a) != null) {
            return str;
        }
        hhg1.n("ShowUri should not be empty");
        return null;
    }

    public static boolean n(lik1 lik1Var, i1z i1zVar, String str) {
        if (i1zVar.m) {
            return false;
        }
        String str2 = lik1Var.a;
        Set set = s4b1.f;
        return ((!uic.i(str2, s4b1.g) && !uic.g(str2, blc0.Yc)) || str == null || ihc1.y0(str)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
    public static boolean o(boolean z, boolean z2, i1z i1zVar, r6z r6zVar) {
        boolean z3;
        boolean z4 = i1zVar.m;
        if (z4) {
            z = z2;
        }
        if (z && r6zVar.b) {
            if (i1zVar.f11p) {
                z3 = true;
            } else {
                xwp0 xwp0Var = i1zVar.A;
                xwp0Var.getClass();
                if (xwp0Var instanceof rwp0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            l1z l1zVarA = i1zVar.D.a(l1z.class);
            if (!(l1zVarA != null ? l1zVarA.e : false) && z3 && i1zVar.B != d1z.c && !z4) {
                return true;
            }
        }
        return false;
    }

    public final void b(smc0 smc0Var, z9p z9pVar, r6z r6zVar) {
        if (r6zVar.i) {
            List list = this.c.f;
            eyh0 eyh0Var = (eyh0) z9pVar.s;
            etx etxVar = etx.c;
            dp5 dp5Var = (dp5) eyh0Var.c;
            dg30 dg30Var = (dg30) eyh0Var.b;
            StringBuilder sb = new StringBuilder(dg30Var.getText(2131963804));
            String strJ = dp5Var.j(dg30Var);
            sb.append(" • ");
            sb.append(strJ);
            String string = sb.toString();
            pqc1 pqc1Var = (pqc1) dp5Var.b;
            smc0Var.add(new jhm("betamax_video_subtitles", etxVar, (fhm) null, (Integer) null, string, !pqc1Var.e ? list.isEmpty() : pqc1Var.f.isEmpty(), (tm81) null, new ihm(new bhm(2), new ghm(ny1.c, ny1.d), new jm1(eyh0Var, (byte) 5)), 172));
        }
    }

    public final void c(smc0 smc0Var, i1z i1zVar, boolean z, boolean z2, boolean z3, z9p z9pVar, v1v v1vVar, r6z r6zVar) {
        if (o(z, z2, i1zVar, r6zVar)) {
            boolean z4 = true;
            boolean z5 = !r6zVar.m;
            yjq yjqVar = (yjq) z9pVar.o;
            lik1 lik1Var = (lik1) z9pVar.z;
            i1z i1zVar2 = (i1z) z9pVar.A;
            xwp0 xwp0Var = i1zVar2.A;
            xwp0Var.getClass();
            if (!(xwp0Var instanceof vwp0) && !(xwp0Var instanceof jwp0) && !(xwp0Var instanceof hwp0)) {
                z4 = false;
            }
            smc0Var.add(new jhm("episode_download", z4 ? umx.c : tmx.c, (fhm) null, Integer.valueOf(z4 ? 2131954466 : 2131954365), (String) null, false, (tm81) null, new ihm(new ygm(2), z4 ? hhm.b : hhm.a, new ghm(wvu.c, new awu(z4, i1zVar2)), new cwu(z3, yjqVar, i1zVar2, this.l, v1vVar, lik1Var, ((z4q) yjqVar.b).a(lik1Var), z5)), 244));
        }
    }

    public final void d(smc0 smc0Var, i1z i1zVar, LinkedHashMap linkedHashMap, r6z r6zVar, lik1 lik1Var, z9p z9pVar) {
        boolean z = this.i;
        if (z) {
            e(i1zVar, linkedHashMap, r6zVar, lik1Var, new f6z(smc0Var, z9pVar, (byte) 0));
        }
        e(i1zVar, linkedHashMap, r6zVar, lik1Var, new f6z(smc0Var, z9pVar, (byte) 1));
        if (z) {
            return;
        }
        if (!r6zVar.e || r6zVar.c) {
            smc0Var.add(((cab) z9pVar.g).n());
        }
    }

    public final void j(smc0 smc0Var, i1z i1zVar, g281 g281Var, lik1 lik1Var, c6z c6zVar, boolean z) {
        String str = i1zVar.a;
        x7i1 x7i1Var = c6zVar.a;
        u35 u35Var = this.r;
        if (u35Var.e()) {
            exc0 exc0Var = x7i1Var.g;
            if (exc0Var.a || exc0Var.b || exc0Var.c) {
                smc0Var.add(this.u.I(str));
            }
        }
        boolean zF = c6zVar.c ? u35Var.f() : u35Var.d();
        if (!z && zF && x7i1Var.a) {
            String str2 = g281Var.a;
            smc0Var.add(new jhm("sts_delete_episode_item", cmx.c, (fhm) null, 2131962953, (String) null, false, (tm81) null, new ihm(new ygm(3), hhm.c, new ghm(z6t.d, z6t.e), new o96(this.v, i1zVar.c, str, u890.j(lik1Var.a, str), str2)), 244));
        }
    }

    public final Observable k(String str, String str2, Map map, lik1 lik1Var, r6z r6zVar) {
        Map map2 = map == null ? b7x.a : map;
        t6z t6zVar = this.k;
        x3v0 x3v0Var = (x3v0) t6zVar.b.b;
        List listSingletonList = Collections.singletonList(str);
        Boolean bool = Boolean.TRUE;
        return Observable.combineLatest(x3v0Var.b(listSingletonList, new t3v0(sqg0.J(new mmr0[]{new mmr0("available", bool), new mmr0("backgroundable", bool), new mmr0("covers", bool), new mmr0("description", bool), new mmr0("freezeFrames", bool), new mmr0("isFollowingShow", bool), new mmr0("isExplicit", bool), new mmr0("is19PlusOnly", bool), new mmr0("isInListenLater", bool), new mmr0("isMusicAndTalk", bool), new mmr0("isNew", bool), new mmr0("isCurated", bool), new mmr0("isPlayed", bool), new mmr0("isPlayable", bool), new mmr0("lastPlayedAt", bool), new mmr0("length", bool), new mmr0("link", bool), new mmr0("manifestId", bool), new mmr0("mediaTypeEnum", bool), new mmr0("name", bool), new mmr0("offline", bool), new mmr0("playable", bool), new mmr0("playabilityRestriction", bool), new mmr0("previewId", bool), new mmr0("previewManifestId", bool), new mmr0("publishDate", bool), new mmr0("syncProgress", bool), new mmr0("timeLeft", bool), new mmr0("type", bool), new mmr0("isBookChapter", bool)}), sqg0.J(new mmr0[]{new mmr0("link", bool), new mmr0("name", bool), new mmr0("description", bool), new mmr0("popularity", bool), new mmr0("publisher", bool), new mmr0("language", bool), new mmr0("isExplicit", bool), new mmr0("covers", bool), new mmr0("numEpisodes", bool), new mmr0("consumptionOrder", bool), new mmr0("mediaTypeEnum", bool), new mmr0("inCollection", bool), new mmr0("trailerUri", bool), new mmr0("latestPlayedEpisodeLink", bool), new mmr0("resumeEpisodeLink", bool)}), (Map) null, Collections.singletonList(30), (List) null, 167)).firstOrError().map(new akp1(str, (byte) 3)).timeout(10L, TimeUnit.SECONDS).onErrorResumeNext(o9p1.c1).toObservable(), t6zVar.a.b().take(1L).map(vap1.Z0), new sso(map2)).flatMap(new yzu(this, str2, lik1Var, r6zVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(who0 who0Var, String str, rzq rzqVar, onm onmVar) {
        i6z i6zVar;
        if (onmVar instanceof i6z) {
            i6zVar = (i6z) onmVar;
            int i = i6zVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i6zVar.d = i - Integer.MIN_VALUE;
            } else {
                i6zVar = new i6z(this, onmVar);
            }
        } else {
            i6zVar = new i6z(this, onmVar);
        }
        Object objJ = i6zVar.b;
        int i2 = i6zVar.d;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objJ);
            ay8 ay8VarF = d3p1.F(rzqVar, this.J, str);
            afv afvVar = new afv(2, (lnm) null, (byte) 7);
            i6zVar.a = who0Var;
            i6zVar.d = 1;
            objJ = b5p1.j(ay8VarF, afvVar, i6zVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            who0Var = i6zVar.a;
            hm5.M(objJ);
        }
        i1r i1rVar = (k1r) objJ;
        if (!(i1rVar instanceof i1r)) {
            return who0Var;
        }
        qxc0 qxc0Var = (qxc0) i1rVar.a;
        if (!qxc0Var.h && !qxc0Var.t.i) {
            z = false;
        }
        return who0.a(who0Var, z);
    }
}
