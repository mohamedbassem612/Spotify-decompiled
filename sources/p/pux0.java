package p;

import com.spotify.assistedcuration.v1.RecommendationsProto$RecommendationUrisResponse;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.playlist.ai.creation.v2.GetSessionByMessageIdRequest;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromRunnable;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pux0 implements Function, l381, wua, BiFunction, cyd, au11 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public pux0(List list, xkg0 xkg0Var) {
        this.a = (byte) 7;
        this.b = list;
        ArrayList arrayList = new ArrayList(xkg0Var.i);
        for (Map.Entry entry : xkg0Var.entrySet()) {
            arrayList.add(new mmr0(Integer.valueOf(((qxm0) entry.getKey()).a), Integer.valueOf(((qxm0) entry.getValue()).a)));
        }
        this.c = sqg0.T(arrayList);
    }

    public poy0 a(bs0 bs0Var, dyd dydVar) {
        return y3o1.X(new ak01(this, (byte) 7), t011.X, atz0.d1, new vdv0(dydVar, (byte) 1), 8);
    }

    public Object apply(Object obj) {
        String str;
        Completable completableA;
        ou80 ou80Var;
        byte b = this.a;
        String str2 = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                String str3 = (String) this.c;
                return rqt0.F(o6x.a, new oux0((mzr0) obj2, str3, (String) obj, (lnm) null, (byte) 2)).doOnError(mux0.f).onErrorReturnItem(rih1.a).map(new t4o(str3, (byte) 8));
            case 10:
                l0x0 l0x0Var = (l0x0) obj2;
                return new CompletableFromRunnable(new uu1((feh) obj, l0x0Var, (ou80) this.c, (byte) 28)).s((Scheduler) l0x0Var.b);
            case 11:
                String str4 = (String) obj;
                l0x0 l0x0Var2 = (l0x0) obj2;
                hgz0 hgz0Var = (hgz0) l0x0Var2.b;
                vgz0 vgz0Var = (vgz0) this.c;
                String str5 = vgz0Var.a;
                LocalDateTime localDateTime = vgz0Var.d;
                return hgz0Var.a(new ugz0(new zn21(str5, localDateTime != null ? localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) : null, vgz0Var.b, vgz0Var.c, !((mz4) ((kly0) l0x0Var2.d).get()).a()), new ny01(vgz0Var.f, vgz0Var.e, str4.length() > 0 ? str4 : null)));
            case 14:
                return ((lo01) ((hyy0) obj2).b).a.a((String) this.c).map(l9x0.e).map(new s6z0((Boolean) obj, (byte) 5));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                Single singleA = ((vz01) obj2).b.a(((RecommendationsProto$RecommendationUrisResponse) obj).getUrisList());
                t45 t45Var = (t45) this.c;
                return singleA.doOnSubscribe(new uz01(t45Var, 6, (byte) 0)).doOnSuccess(new uz01(t45Var, 6, (byte) 1));
            case 21:
                wsc0 wsc0Var = (wsc0) obj;
                kby kbyVar = wsc0Var.f;
                String strA = kbyVar.d.a(1);
                List list = wsc0Var.e;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zuc0) it.next()).c);
                }
                boolean zO = ((YourLibraryContainsResponseEntity) o7h.q0(((YourLibraryContainsResponse) obj2).o())).o();
                String str6 = kbyVar.A;
                if (str6 != null) {
                    str2 = str6.length() > 0 ? str6 : null;
                    if (str2 != null) {
                        phi0 phi0Var = (phi0) this.c;
                        nf61 nf61Var = (nf61) phi0Var.c;
                        j23 j23Var = (c23) phi0Var.d;
                        String str7 = kbyVar.b;
                        j23 j23Var2 = j23Var;
                        Single singleB = j23Var2.b(arrayList);
                        r23 r23Var = j23Var2.a;
                        GetSessionByMessageIdRequest.Builder builderNewBuilder = GetSessionByMessageIdRequest.newBuilder();
                        builderNewBuilder.setMessageId(str2);
                        return nf61Var.a(r23Var.g(builderNewBuilder.build()).flatMap(new ymm0(j23Var2, (byte) 11)), Boolean.valueOf(zO), str7, strA, singleB);
                    }
                }
                return Observable.just(atx0.a);
            case 23:
                j380 j380VarMetadata = ((ContextTrack) ((PlayerState) obj).track().b()).metadata();
                if (j380VarMetadata == null || (str = (String) j380VarMetadata.get("image_xlarge_url")) == null) {
                    str = "";
                }
                String str8 = str;
                p2o0 p2o0Var = (p2o0) ((k811) obj2).b;
                tv80 tv80Var = (tv80) this.c;
                return j2h1.D((q8n) p2o0Var.g, new hgo0(p2o0Var, tv80Var != null ? tv80Var.a : null, str8, (lnm) null, (byte) 20));
            case 25:
                t380 t380Var = (t380) obj;
                xi11 xi11Var = (xi11) obj2;
                t380Var.getClass();
                tqw tqwVar = (tqw) this.c;
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                if (t380Var.isEmpty()) {
                    w9u0 w9u0Var = xi11Var.b;
                    if (tv80VarY != null && (ou80Var = tv80VarY.a) != null) {
                        str2 = ou80Var.a;
                    }
                    completableA = w9u0Var.a(new m9u0(SkipToNextTrackCommand.builder().loggingParams(LoggingParams.builder().interactionId(str2).build()).build())).ignoreElement();
                } else {
                    completableA = t380Var.contains("mft_disallow") ? xi11Var.c.a(tv80VarY) : CompletableEmpty.a;
                }
                completableA.getClass();
                return completableA;
            default:
                return ((az11) obj2).b.b((x020) this.c);
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x00e2
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public p.vua c(p.fc10 r17, long r18) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pux0.c(p.fc10, long):p.vua");
    }

    public void d() {
        izr0 izr0Var = (izr0) this.c;
        byte[] bArr = zoi1.b;
        izr0Var.P(bArr, bArr.length);
    }

    public void e(mby mbyVar) {
        ((v280) ((i2i1) this.b).b).c(mbyVar);
    }

    public uw01 f() {
        return new uw01(this);
    }

    public gf81 g(tac0 tac0Var) {
        return new gf81(((t8u0) this.b).a(tac0Var), (b7r0) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01c9 -> B:53:0x01cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object h(java.lang.String r26, p.onm r27) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pux0.h(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object i(String str, onm onmVar) {
        b3y0 b3y0Var;
        if (onmVar instanceof b3y0) {
            b3y0Var = (b3y0) onmVar;
            int i = b3y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b3y0Var.c = i - Integer.MIN_VALUE;
            } else {
                b3y0Var = new b3y0(this, onmVar);
            }
        } else {
            b3y0Var = new b3y0(this, onmVar);
        }
        Object objF = b3y0Var.a;
        int i2 = b3y0Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objF);
            rsc0 rsc0Var = (xrc0) this.b;
            hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
            sku0 sku0VarP = PlaylistDecorationPolicy.p();
            sku0VarP.H();
            hru0VarS.w(sku0VarP.build());
            trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, (mqz0) null, (prc0) null, 0, (List) null, 510);
            b3y0Var.c = 1;
            objF = rsc0Var.f(str, trc0Var, b3y0Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        le30 le30VarA = ((me30) this.c).a(((wsc0) ((py21) objF).d()).f.p);
        if (le30VarA != le30.b1 && le30VarA != le30.c1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void j(int i, String str) {
        i8h1 i8h1Var = (i8h1) this.b;
        exk0 exk0Var = (exk0) this.c;
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = exk0Var.a.c();
        x6h1VarC.i.add(new a7h1("reaction_tab", str, numValueOf, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        tu11 tu11Var = (tu11) this.c;
        o3r o3rVar = tu11Var.h;
        lu11 lu11Var = null;
        if (tu11.d(unb1Var) != null) {
            boolean zEquals = fe00Var.equals(be00.a);
            fu11 fu11Var = fu11.a;
            hu11 hu11Var = hu11.a;
            if (zEquals) {
                if (tu11Var.b()) {
                    String strD = tu11.d(unb1Var);
                    if (strD == null || !u890.j(tu11Var.c(o3rVar, strD), Boolean.TRUE)) {
                        lu11Var = hu11Var;
                    } else {
                        lu11Var = fu11Var;
                    }
                }
            } else if (fe00Var.equals(ce00.a) && tu11Var.c.e) {
                if (tu11Var.b()) {
                    String strD2 = tu11.d(unb1Var);
                    if (strD2 != null && u890.j(tu11Var.c(o3rVar, strD2), Boolean.TRUE)) {
                        lu11Var = fu11Var;
                    }
                } else if (tu11Var.a()) {
                }
                lu11Var = hu11Var;
            }
        }
        return lu11Var == null ? ((au11) this.b).k(fe00Var, unb1Var) : lu11Var;
    }

    public void l() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((exk0) this.c).a.c();
        x6h1VarC.i.add(new a7h1("dismiss_area", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void m() {
        ((i8h1) this.b).f(((exk0) this.c).e(), (Set) null);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:69:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:86:0x0124 A[PHI: r3
      0x0124: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v4 java.lang.String) binds: [B:96:0x0149, B:84:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    public Object n(zuc0 zuc0Var, onm onmVar) {
        j7y0 j7y0Var;
        String str;
        g7y0 g7y0Var;
        String str2;
        String str3;
        io70 io70Var;
        String str4;
        g7y0 g7y0Var2;
        String str5;
        List list;
        ho70 ho70Var;
        if (onmVar instanceof j7y0) {
            j7y0Var = (j7y0) onmVar;
            int i = j7y0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                j7y0Var.f = i - Integer.MIN_VALUE;
            } else {
                j7y0Var = new j7y0(this, onmVar);
            }
        } else {
            j7y0Var = new j7y0(this, onmVar);
        }
        Object objP = j7y0Var.d;
        int i2 = j7y0Var.f;
        String strA = null;
        if (i2 == 0) {
            hm5.M(objP);
            tu00 tu00Var = zuc0Var.q;
            jo70 jo70VarA = tu00Var.a(jo70.class);
            zc8 zc8VarA = tu00Var.a(zc8.class);
            str = "";
            if (zc8VarA != null) {
                p6o p6oVar = zc8VarA.c;
                String str6 = zc8VarA.b;
                if (str6.length() == 0) {
                    String str7 = jo70VarA != null ? jo70VarA.a : null;
                    str6 = str7 == null ? "" : str7;
                }
                den denVarA = tu00Var.a(den.class);
                strA = denVarA != null ? denVarA.a(zdn.c) : null;
                str = strA != null ? strA : "";
                String strY0 = o7h.y0(p6oVar.a, (CharSequence) null, (String) null, (String) null, e6y0.h, 31);
                if (strY0.length() == 0) {
                    strY0 = o7h.y0(p6oVar.b, (CharSequence) null, (String) null, (String) null, e6y0.i, 31);
                }
                return new f7y0(str6, str, strY0, g7y0.c);
            }
            String str8 = jo70VarA != null ? jo70VarA.b : null;
            if (str8 == null) {
                g7y0Var = g7y0.a;
            } else {
                int iHashCode = str8.hashCode();
                if (iHashCode != -1891298259) {
                    if (iHashCode != 2103152) {
                        if (iHashCode == 120215003 && str8.equals("Episode")) {
                            g7y0Var = g7y0.b;
                        } else {
                            g7y0Var = g7y0.a;
                        }
                    } else if (str8.equals("Clip")) {
                        g7y0Var = g7y0.d;
                    } else {
                        g7y0Var = g7y0.a;
                    }
                } else if (str8.equals("Chapter")) {
                    g7y0Var = g7y0.e;
                } else {
                    g7y0Var = g7y0.a;
                }
            }
            str2 = jo70VarA != null ? jo70VarA.a : null;
            if (str2 == null) {
                str2 = "";
            }
            xkk1 xkk1VarA = tu00Var.a(xkk1.class);
            if (xkk1VarA != null) {
                up70 up70VarA = xkk1VarA.a.a(vp70.d);
                if (up70VarA != null) {
                    str3 = up70VarA.a.a;
                } else {
                    str3 = null;
                }
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            int iOrdinal = g7y0Var.ordinal();
            if (iOrdinal == 1) {
                if (jo70VarA != null && (io70Var = jo70VarA.e) != null) {
                    strA = io70Var.a;
                }
                if (strA != null) {
                    str = strA;
                }
            } else if (iOrdinal == 3 || iOrdinal == 4) {
                j7y0Var.a = g7y0Var;
                j7y0Var.b = str2;
                j7y0Var.c = str3;
                j7y0Var.f = 1;
                objP = p(jo70VarA, j7y0Var);
                Object obj = d9n.a;
                if (objP == obj) {
                    return obj;
                }
                str4 = str3;
                g7y0Var2 = g7y0Var;
                str5 = str2;
            } else {
                if (jo70VarA != null && (list = jo70VarA.d) != null && (ho70Var = (ho70) o7h.s0(list)) != null) {
                    strA = ho70Var.a;
                }
                if (strA != null) {
                    str = strA;
                }
            }
            return new f7y0(str2, str3, str, g7y0Var);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str4 = j7y0Var.c;
        str5 = j7y0Var.b;
        g7y0Var2 = j7y0Var.a;
        hm5.M(objP);
        str = (String) objP;
        str2 = str5;
        g7y0Var = g7y0Var2;
        str3 = str4;
        return new f7y0(str2, str3, str, g7y0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(String str, onm onmVar) throws Throwable {
        k7y0 k7y0Var;
        String m231Var;
        if (onmVar instanceof k7y0) {
            k7y0Var = (k7y0) onmVar;
            int i = k7y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k7y0Var.c = i - Integer.MIN_VALUE;
            } else {
                k7y0Var = new k7y0(this, onmVar);
            }
        } else {
            k7y0Var = new k7y0(this, onmVar);
        }
        Object objL = k7y0Var.a;
        int i2 = k7y0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                Set set = s4b1.f;
                if (uic.x(str).s() == null) {
                    return null;
                }
                Observable map = ((uu00) this.c).b(new oi("prompted-playlist-share", false, new zqu0(str, (byte) 24))).filter(u3x0.c).map(new yjp1(str, (byte) 16));
                k7y0Var.c = 1;
                objL = fc11.l(map, 1, (Object) null, k7y0Var);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objL);
            }
            jo70 jo70Var = ((tv00) objL).b;
            m231Var = jo70Var != null ? jo70Var.a : null;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        String str2 = m231Var;
        if (str2 == null || ihc1.y0(str2)) {
            return null;
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(jo70 jo70Var, onm onmVar) {
        l7y0 l7y0Var;
        io70 io70Var;
        io70 io70Var2;
        if (onmVar instanceof l7y0) {
            l7y0Var = (l7y0) onmVar;
            int i = l7y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l7y0Var.c = i - Integer.MIN_VALUE;
            } else {
                l7y0Var = new l7y0(this, onmVar);
            }
        } else {
            l7y0Var = new l7y0(this, onmVar);
        }
        Object objL = l7y0Var.a;
        int i2 = l7y0Var.c;
        String str = null;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                if (jo70Var == null || (io70Var = jo70Var.e) == null) {
                    return "";
                }
                String str2 = io70Var.b;
                Observable map = ((uu00) this.c).b(new oi("episode-share", false, new zqu0(str2, (byte) 25))).filter(a4x0.c).map(new zjp1(str2, (byte) 8));
                l7y0Var.c = 1;
                objL = fc11.l(map, 1, (Object) null, l7y0Var);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objL);
            }
            jo70 jo70Var2 = ((tv00) objL).b;
            if (jo70Var2 != null && (io70Var2 = jo70Var2.e) != null) {
                str = io70Var2.a;
            }
            return str == null ? "" : str;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return "";
        }
    }

    public void q(String str) {
        this.c = str;
    }

    public boolean t(Object obj) {
        xah1 xah1Var = (xah1) obj;
        ih60 ih60Var = (ih60) this.c;
        dlg1 dlg1Var = (dlg1) ih60Var.f;
        qxc0 qxc0Var = xah1Var.a;
        return dlg1Var.p(o4o1.u(qxc0Var), yto.k(xah1Var.b, true) ^ true) && ((Boolean) ((iu30) ih60Var.g).invoke(((zb91) ih60Var.e).f(qxc0Var.X))).booleanValue();
    }

    public pux0() {
        this.a = (byte) 17;
        this.b = new i2i1((byte) 17);
    }

    public pux0(i8h1 i8h1Var) {
        this.a = (byte) 12;
        this.b = i8h1Var;
        this.c = new exk0();
    }

    public pux0(yve1 yve1Var) {
        this.a = (byte) 4;
        this.b = yve1Var;
        this.c = new izr0();
    }

    public /* synthetic */ pux0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public pux0(ih60 ih60Var) {
        this.a = (byte) 1;
        this.c = ih60Var;
        this.b = ih60Var.d;
    }

    public Object apply(Object obj, Object obj2) {
        Map map = (Map) obj2;
        boolean zL = y7y0.L(map);
        return new z310(((dp01) this.b).c(((RecentlyPlayedResponse) obj).getItems(), (r9c) this.c, zL, rh11.c(map)), (f410) null, (m510) null, (String) null);
    }
}
