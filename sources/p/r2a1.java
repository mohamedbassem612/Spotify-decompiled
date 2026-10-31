package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.Surface;
import android.widget.RemoteViews;
import com.spotify.adsdisplay.embeddedad.events.proto.EmbeddedNPVAdEvent;
import com.spotify.socialrecs.v1.GetSessionRecsForUserRequest;
import com.spotify.socialrecs.v1.GetSessionRecsForUserResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.observables.GroupedObservable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r2a1 implements Function, jvd, xjh0, l381, m381, FlowableOnSubscribe, ix30 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public r2a1(zvp zvpVar) {
        this.a = (byte) 3;
        this.c = zvpVar;
        Map map = v7a1.g;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(Integer.valueOf(((t7a1) entry.getKey()).ordinal()), entry.getValue());
        }
        this.b = linkedHashMap;
    }

    public static RemoteViews d(Context context, w7b1 w7b1Var) {
        String packageName = context.getPackageName();
        boolean z = w7b1Var.j;
        RemoteViews remoteViews = new RemoteViews(packageName, z ? 2131625199 : 2131626345);
        Bitmap bitmap = w7b1Var.a;
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(2131428273, bitmap);
        } else {
            remoteViews.setImageViewResource(2131428273, 2131234029);
        }
        remoteViews.setTextViewText(2131431356, w7b1Var.d);
        remoteViews.setTextViewText(2131427594, w7b1Var.e);
        if (!z) {
            remoteViews.setInt(2131429642, "setBackgroundColor", w7b1Var.b);
            remoteViews.setInt(2131428246, "setBackgroundColor", w7b1Var.c);
        }
        u(remoteViews, context, w7b1Var.f);
        q(remoteViews, context, w7b1Var.g);
        s(remoteViews, context, w7b1Var.h);
        PendingIntent pendingIntent = w7b1Var.i;
        remoteViews.setOnClickPendingIntent(2131431705, pendingIntent);
        remoteViews.setOnClickPendingIntent(2131428273, pendingIntent);
        remoteViews.setOnClickPendingIntent(2131431356, pendingIntent);
        remoteViews.setOnClickPendingIntent(2131427594, pendingIntent);
        return remoteViews;
    }

    public static void q(RemoteViews remoteViews, Context context, m1p1 m1p1Var) {
        if (m1p1Var instanceof wot0) {
            remoteViews.setViewVisibility(2131427818, 8);
            remoteViews.setViewVisibility(2131427819, 8);
            remoteViews.setViewVisibility(2131427816, 0);
            remoteViews.setViewVisibility(2131427817, 8);
            return;
        }
        if (m1p1Var instanceof xot0) {
            remoteViews.setViewVisibility(2131427818, 8);
            remoteViews.setViewVisibility(2131427819, 8);
            remoteViews.setViewVisibility(2131427816, 8);
            remoteViews.setViewVisibility(2131427817, 0);
            remoteViews.setOnClickPendingIntent(2131427817, PendingIntent.getBroadcast(context, 1, ((xot0) m1p1Var).c, 201326592));
            return;
        }
        if (m1p1Var instanceof yot0) {
            remoteViews.setViewVisibility(2131427818, 0);
            remoteViews.setViewVisibility(2131427819, 8);
            remoteViews.setViewVisibility(2131427816, 8);
            remoteViews.setViewVisibility(2131427817, 8);
            return;
        }
        if (!(m1p1Var instanceof zot0)) {
            eg.o();
            return;
        }
        remoteViews.setViewVisibility(2131427818, 8);
        remoteViews.setViewVisibility(2131427819, 0);
        remoteViews.setViewVisibility(2131427816, 8);
        remoteViews.setViewVisibility(2131427817, 8);
        remoteViews.setOnClickPendingIntent(2131427819, PendingIntent.getBroadcast(context, 1, ((zot0) m1p1Var).c, 201326592));
    }

    public static void s(RemoteViews remoteViews, Context context, hm5 hm5Var) {
        if (!(hm5Var instanceof g591)) {
            remoteViews.setViewVisibility(2131427813, 0);
            remoteViews.setViewVisibility(2131427814, 8);
        } else {
            remoteViews.setViewVisibility(2131427813, 8);
            remoteViews.setViewVisibility(2131427814, 0);
            remoteViews.setOnClickPendingIntent(2131427814, PendingIntent.getBroadcast(context, 1, ((g591) hm5Var).n, 201326592));
        }
    }

    public static void u(RemoteViews remoteViews, Context context, hm5 hm5Var) {
        if (!(hm5Var instanceof g591)) {
            remoteViews.setViewVisibility(2131427820, 0);
            remoteViews.setViewVisibility(2131427821, 8);
        } else {
            remoteViews.setViewVisibility(2131427820, 8);
            remoteViews.setViewVisibility(2131427821, 0);
            remoteViews.setOnClickPendingIntent(2131427821, PendingIntent.getBroadcast(context, 1, ((g591) hm5Var).n, 201326592));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object a(int i, x8d1 x8d1Var, onm onmVar) {
        z8d1 z8d1Var;
        Context context = (Context) this.b;
        if (onmVar instanceof z8d1) {
            z8d1Var = (z8d1) onmVar;
            int i2 = z8d1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z8d1Var.e = i2 - Integer.MIN_VALUE;
            } else {
                z8d1Var = new z8d1(this, onmVar);
            }
        } else {
            z8d1Var = new z8d1(this, onmVar);
        }
        Object objI = z8d1Var.c;
        int i3 = z8d1Var.e;
        if (i3 == 0) {
            hm5.M(objI);
            mr20 mr20VarB = ((bjd) this.c).b();
            z8d1Var.b = x8d1Var;
            z8d1Var.a = i;
            z8d1Var.e = 1;
            objI = b5p1.i(mr20VarB, z8d1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = z8d1Var.a;
            x8d1Var = z8d1Var.b;
            hm5.M(objI);
        }
        x8d1 x8d1Var2 = ((Boolean) objI).booleanValue() ? x8d1Var : null;
        Collection collectionN0 = b9p1.o(context, i).a;
        if (x8d1Var2 != null) {
            collectionN0 = o7h.N0(o7h.d1(collectionN0, 2), Collections.singletonList(x8d1Var2));
        }
        return new y8d1(o7h.O0(new t8d1(Uri.parse("https://sharing-assets.spotifycdn.com/IA/themed_scribbles.png"), context.getString(2131963166)), collectionN0));
    }

    public Object apply(Object obj) {
        bg11 bg11VarP;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                ga61 ga61Var = (ga61) obj;
                Boolean bool = ((s1a1) this.b).a;
                if (bool != null) {
                    r1a1 r1a1Var = (r1a1) this.c;
                    r1a1Var.a.c(new jyh0(r1a1Var, new z0a1(bool.booleanValue()), (byte) 23));
                }
                return new g3a1(ga61Var);
            case 1:
                return ((GroupedObservable) obj).publish(new hp91((b0a0) this.b, (Scheduler) this.c, (byte) 3));
            case 6:
                String str3 = (String) obj;
                yt91 yt91Var = (yt91) this.b;
                r9c r9cVar = (r9c) this.c;
                String str4 = r9cVar.b;
                String str5 = r9cVar.d;
                String str6 = r9cVar.a;
                n57.i(str4.contains("spotify:space_item:"), "The identifier [%s] should be a spaces identifier", new Object[]{str4});
                String str7 = uma1.e.split(str4)[2];
                if (str7.endsWith("]")) {
                    str7 = uma1.d.split(str7)[0];
                }
                String str8 = str7;
                uma1 uma1Var = (uma1) yt91Var.c;
                up41 up41Var = new up41();
                up41Var.p("page", "0");
                up41Var.p("per_page", "50");
                up41Var.p("platform", "android");
                up41Var.p("version", uma1Var.b.e());
                up41Var.p("dt", uma1Var.c.format(new Date(uma1Var.a.b())));
                up41Var.p("suppress404", "1");
                up41Var.p("suppress_response_codes", "1");
                String strM = l1d.m("category:", str6);
                if (!jhc1.F(str6)) {
                    up41Var.p("signal", strM);
                }
                if (!jhc1.F(str5)) {
                    up41Var.p("signal", "client-id:" + str5);
                }
                up41Var.p("locale", upn1.m());
                up41Var.p("region", str3);
                c510 c510Var = (c510) yt91Var.b;
                Set set = (Set) ((HashMap) up41Var.b).get("signal");
                if (set == null) {
                    w280 w280Var = b380.b;
                    bg11VarP = bg11.e;
                } else {
                    bg11VarP = b380.p(set);
                }
                String strK = up41Var.k("page");
                String strK2 = up41Var.k("per_page");
                String strK3 = up41Var.k("region");
                String strK4 = up41Var.k("locale");
                String strK5 = up41Var.k("platform");
                String strK6 = up41Var.k("version");
                String strK7 = up41Var.k("dt");
                String strK8 = up41Var.k("suppress404");
                String strK9 = up41Var.k("suppress_response_codes");
                String str9 = r9cVar.c;
                String str10 = r9cVar.d;
                String str11 = r9cVar.a;
                int i = r9cVar.k;
                if (i == 1) {
                    str = "media_browser_service";
                } else if (i == 2) {
                    str = "inter_app_protocol";
                } else {
                    if (i != 3) {
                        throw null;
                    }
                    str = "unknown";
                }
                String str12 = str;
                int i2 = r9cVar.l;
                if (i2 == 1) {
                    str2 = "protocol_inter_app";
                } else if (i2 == 2) {
                    str2 = "protocol_media_session";
                } else if (i2 == 3) {
                    str2 = "protocol_media_button";
                } else {
                    if (i2 != 4) {
                        throw null;
                    }
                    str2 = "protocol_car_app_library";
                }
                return c510Var.a(str8, bg11VarP, strK, strK2, strK3, strK4, strK5, strK6, strK7, strK8, strK9, str9, str10, str11, str12, str2);
            case 23:
                return ((v491) this.b).j((i) this.c, (List) obj, false);
            default:
                List list = (List) obj;
                hmm0 hmm0Var = (hmm0) this.b;
                return Collections.singletonMap(hmm0Var.e.a, new v491(new ivd(list, !list.isEmpty(), (el51) null, w7x.a, hmm0Var.d).n((List) this.c)));
        }
    }

    public o3r b() {
        switch (this.a) {
            case 13:
                break;
        }
        return (o3r) this.b;
    }

    public void e() {
        fvc1 fvc1Var = (fvc1) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet = fvc1Var.f;
        ewc1 ewc1Var = (ewc1) this.c;
        copyOnWriteArraySet.remove(ewc1Var);
        faa0 faa0Var = (faa0) fvc1Var.g.remove(ewc1Var.getSurface().a());
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        ewc1Var.b();
        muc1 muc1Var = fvc1Var.a;
        c921.y(muc1Var.c, (o8n) null, 0, new ku91(muc1Var, ewc1Var.getSurface(), new md21(), (lnm) null, (byte) 8), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(Intent intent, t0c t0cVar, onm onmVar) {
        b6c1 b6c1Var;
        if (onmVar instanceof b6c1) {
            b6c1Var = (b6c1) onmVar;
            int i = b6c1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                b6c1Var.d = i - Integer.MIN_VALUE;
            } else {
                b6c1Var = new b6c1(this, onmVar);
            }
        } else {
            b6c1Var = new b6c1(this, onmVar);
        }
        Object objB = b6c1Var.b;
        int i2 = b6c1Var.d;
        if (i2 == 0) {
            hm5.M(objB);
            h6c1 h6c1Var = (h6c1) this.b;
            b6c1Var.a = intent;
            b6c1Var.d = 1;
            objB = h6c1Var.b(t0cVar, b6c1Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            intent = b6c1Var.a;
            hm5.M(objB);
        }
        ((cn3) this.c).b(intent, new Uri[]{(Uri) objB});
        return objB;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x002a A[PHI: r3
      0x002a: PHI (r3v1 p.xpt0) = 
      (r3v0 p.xpt0)
      (r3v0 p.xpt0)
      (r3v0 p.xpt0)
      (r3v0 p.xpt0)
      (r3v0 p.xpt0)
      (r3v3 p.xpt0)
      (r3v0 p.xpt0)
      (r3v0 p.xpt0)
      (r3v0 p.xpt0)
      (r3v4 p.xpt0)
     binds: [B:6:0x0011, B:8:0x001b, B:31:0x005d, B:28:0x0054, B:24:0x0048, B:26:0x004b, B:20:0x003d, B:16:0x0032, B:11:0x0025, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    public yjh0 i(g2z g2zVar) {
        xpt0 xpt0Var;
        String str;
        bg11 bg11VarC;
        vyh0 vyh0Var;
        xjh0 xjh0Var = (xjh0) this.c;
        ie30 ie30Var = (ie30) g2zVar.c;
        x8v x8vVar = ie30Var.t;
        xpt0 xpt0Var2 = null;
        String str2 = x8vVar != null ? x8vVar.c : null;
        if (str2 != null) {
            upt0 upt0Var = upt0.a;
            vpt0 vpt0Var = vpt0.a;
            switch (str2) {
                case "cenc/cbcs":
                    xpt0Var = upt0Var;
                    break;
                case "cenc/ctr":
                    xpt0Var = vpt0Var;
                    break;
                case "cbc1":
                    xpt0Var2 = tpt0.a;
                case "cbcs":
                    xpt0Var = upt0Var;
                    break;
                case "cenc":
                    xpt0Var = vpt0Var;
                    break;
                case "cens":
                    xpt0Var2 = wpt0.a;
                default:
                    xpt0Var = xpt0Var2;
                    break;
            }
        } else {
            xpt0Var = xpt0Var2;
        }
        if (xpt0Var == null) {
            return xjh0Var.i(g2zVar);
        }
        String str3 = ie30Var.p;
        String strZ0 = str3 != null ? ihc1.Z0(str3, "/") : "unknown-track";
        hjj0 hjj0Var = ie30Var.m;
        if (hjj0Var == null || (bg11VarC = hjj0Var.c(vyh0.class)) == null || (vyh0Var = (vyh0) o7h.s0(bg11VarC)) == null || (str = vyh0Var.a) == null) {
            str = "";
        }
        return new ua91(xjh0Var.i(g2zVar), (o5n) this.b, xpt0Var, strZ0, str);
    }

    public ywm1 j(r9c r9cVar, String str, s4b1 s4b1Var) {
        boolean z = r9cVar.g;
        uo31 uo31VarA = ((ehp) ((ghp) ((dhp) this.b).a.c).t.get()).a(str, s4b1Var);
        String str2 = r9cVar.b;
        boolean zJ = u890.j(str2, "com.spotify.your-albums");
        jml jmlVar = jml.a;
        if (zJ) {
            return uo31VarA.d(jmlVar, Collections.singletonList(new y4c0())).a();
        }
        if (u890.j(str2, "com.spotify.your-artists")) {
            return uo31VarA.d(jmlVar, Collections.singletonList(new e5c0())).a();
        }
        if (u890.j(str2, "com.spotify.your-playlists")) {
            return uo31VarA.d(jmlVar, Collections.singletonList(new y5c0())).a();
        }
        if (u890.j(str2, "com.spotify.your-podcasts")) {
            return uo31VarA.d(jmlVar, Collections.singletonList(new z5c0())).a();
        }
        if (u890.j(str2, "com.spotify.your-audiobooks")) {
            return uo31VarA.d(jmlVar, Collections.singletonList(new g5c0())).a();
        }
        if (u890.j(str2, "com.spotify.downloaded")) {
            return uo31VarA.d(jmlVar, Collections.singletonList(new b5c0((List) null, 3))).a();
        }
        boolean zJ2 = u890.j(str2, "com.spotify.your-library");
        z6x z6xVar = z6x.a;
        if (zJ2) {
            return !z ? uo31VarA.d(jmlVar, Collections.singletonList(new b5c0((List) null, 3))).a() : uo31VarA.d(jmlVar, z6xVar).a();
        }
        v5b1 v5b1Var = s4b1Var.d;
        return u890.j(v5b1Var != null ? v5b1Var.getType() : null, bzu0.f) ? uo31VarA.d(jmlVar, Collections.singletonList(new y5c0())).a() : uo31VarA.d(jmlVar, z6xVar).a();
    }

    public YourLibraryConfig.YourLibrarySortOrder k(r9c r9cVar, String str, s4b1 s4b1Var) {
        ywm1 ywm1VarJ = j(r9cVar, str, s4b1Var);
        qsm1 qsm1VarN = YourLibraryConfig.YourLibrarySortOrder.n();
        int iOrdinal = ywm1VarJ.ordinal();
        rsm1 rsm1Var = rsm1.g;
        switch (iOrdinal) {
            case 0:
                rsm1Var = rsm1.d;
                break;
            case 1:
                rsm1Var = rsm1.b;
                break;
            case 2:
                rsm1Var = rsm1.c;
                break;
            case 3:
                break;
            case 4:
                rsm1Var = rsm1.e;
                break;
            case 5:
                rsm1Var = rsm1.f;
                break;
            case 6:
                if (new evm1((lw21) this.c).C()) {
                    rsm1Var = rsm1.X;
                }
                break;
            case 7:
                rsm1Var = rsm1.h;
                break;
            case 8:
                rsm1Var = rsm1.i;
                break;
            case 9:
                rsm1Var = rsm1.t;
                break;
            default:
                eg.o();
                return null;
        }
        qsm1VarN.n(rsm1Var);
        return qsm1VarN.build();
    }

    public yrd l(mvd mvdVar) {
        Context context = (Context) ((sp01) this.c).c;
        return new yrd(context.getString(2131952488), context.getString(2131952482), (String) null, "social_recommendations", pud.N0, Collections.singletonList(new avd("items", (String) null, (yud) null, new cvd(((sda) mvdVar).a.a))), false, new vtd((2 & 1) != 0 ? "" : "social_recommendations", ""), 0L, 648);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Comparable m(Intent intent, bnt bntVar, onm onmVar) {
        c6c1 c6c1Var;
        if (onmVar instanceof c6c1) {
            c6c1Var = (c6c1) onmVar;
            int i = c6c1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6c1Var.d = i - Integer.MIN_VALUE;
            } else {
                c6c1Var = new c6c1(this, onmVar);
            }
        } else {
            c6c1Var = new c6c1(this, onmVar);
        }
        Object objC = c6c1Var.b;
        int i2 = c6c1Var.d;
        if (i2 == 0) {
            hm5.M(objC);
            h6c1 h6c1Var = (h6c1) this.b;
            c6c1Var.a = intent;
            c6c1Var.d = 1;
            objC = h6c1Var.c(bntVar, c6c1Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            intent = c6c1Var.a;
            hm5.M(objC);
        }
        Uri uri = (Uri) objC;
        if (uri == null) {
            return null;
        }
        ((cn3) this.c).b(intent, new Uri[]{uri});
        return uri;
    }

    public Observable n(String str, List list) {
        t5a1 t5a1Var = (t5a1) this.b;
        wp40 wp40VarN = GetSessionRecsForUserRequest.n();
        wp40VarN.n();
        Single<GetSessionRecsForUserResponse> singleA = t5a1Var.a((GetSessionRecsForUserRequest) wp40VarN.build());
        sp01 sp01Var = (sp01) this.c;
        return singleA.flatMap(new tz01(sp01Var, (byte) 27)).map(new hp91(sp01Var, list)).toObservable().onErrorReturn(bjx0.P0);
    }

    public void o(String str, fq0 fq0Var) {
        p2x p2xVarN = EmbeddedNPVAdEvent.n();
        p2xVarN.t(str);
        p2xVarN.n(fq0Var.a());
        p2xVarN.q(fq0Var.h());
        p2xVarN.u(((yqg) this.c).b());
        ((t2j0) this.b).a(p2xVarN.build());
    }

    public void onFailure(Throwable th) {
        o0c.q("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof h4d1);
        ((dkl) this.b).accept(new n29(1, (Surface) this.c));
    }

    public void onSuccess(Object obj) {
        ((dkl) this.b).accept(new n29(0, (Surface) this.c));
    }

    public void p() {
        i8h1 i8h1Var = (i8h1) this.b;
        h4l0 h4l0Var = (h4l0) this.c;
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), h4l0Var.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        ueb1 ueb1Var = (ueb1) obj;
        teb1 teb1Var = (teb1) this.c;
        String str = teb1Var.b;
        String str2 = teb1Var.c;
        vnb1 vnb1Var = ueb1Var.b;
        boolean z = vnb1Var != null && vnb1Var.b;
        boolean z2 = vnb1Var != null && vnb1Var.a;
        qxc0 qxc0Var = ueb1Var.a;
        tey0 tey0VarS = dko1.s(vhc1Var, str, z, z2, qxc0Var.h, str2, (String) null, qxc0Var.W0, qxc0Var.X);
        return (tey0VarS instanceof c1x0 ? (c1x0) tey0VarS : null) != null;
    }

    public void subscribe(FlowableEmitter flowableEmitter) {
        loc1 loc1Var = (loc1) this.b;
        Flowable flowable = (Flowable) this.c;
        loc1Var.getClass();
        Disposable disposableSubscribe = flowable.subscribe(new koc1(flowableEmitter, (byte) 0), new koc1(flowableEmitter, (byte) 1), new ruz0(flowableEmitter, (byte) 16));
        flowableEmitter.setCancellable(new fi30("StatefulPlayerApisProvider", loc1Var.b("StatefulPlayerApisProvider", flowableEmitter, disposableSubscribe), loc1Var, disposableSubscribe));
    }

    public boolean t(Object obj) {
        ucb1 ucb1Var = (ucb1) obj;
        edb1 edb1Var = (edb1) this.c;
        qxc0 qxc0Var = ucb1Var.a;
        if (qxc0Var.S0 > 0) {
            Map map = qxc0Var.O0;
            dlc0[] dlc0VarArr = (dlc0[]) edb1Var.S0.toArray(new dlc0[0]);
            if (gyo1.G(map, (dlc0[]) Arrays.copyOf(dlc0VarArr, dlc0VarArr.length)) && !ucb1Var.b) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ r2a1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public r2a1(Context context) {
        this.a = (byte) 15;
        this.b = context.getSharedPreferences("androidx.emoji2.emojipicker.preferences", 0);
        this.c = new idd1(new ww21(this, (byte) 14));
    }

    public r2a1(teb1 teb1Var) {
        this.a = (byte) 14;
        this.c = teb1Var;
        this.b = w3p1.n(new l4r(pwc0.b, 1, seb1.h, new j4r(new veb1(teb1Var, (byte) 0)), seb1.i), new l4r(hvm.b, 2, seb1.f, new j4r(seb1.e), seb1.g), nva1.Y);
    }

    public r2a1(edb1 edb1Var) {
        this.a = (byte) 13;
        this.c = edb1Var;
        this.b = edb1Var.T0;
    }
}
