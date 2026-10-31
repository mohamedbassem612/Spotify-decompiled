package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.audioduckschedule.v1.DuckSegment;
import com.spotify.audioduckschedule.v1.GetDuckScheduleRequest;
import com.spotify.audioduckschedule.v1.GetDuckScheduleResponse;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.playlist.ai.creation.v2.GetSessionResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ymm0 implements qiw, Function, h5a, SingleOnSubscribe, ya, BiFunction {
    public static final ymm0 c = new ymm0();
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ ymm0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public qo90 a(lv21 lv21Var) {
        int i;
        r89 r89Var = lv21Var.a;
        lp90 lp90VarA0 = ((sjq0) this.b).A0(r89Var.c);
        List list = lv21Var.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            ko90 ko90Var = null;
            if (!it.hasNext()) {
                Set setP1 = o7h.p1(arrayList);
                String str = r89Var.a.a;
                List<a99> list2 = r89Var.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                for (a99 a99Var : list2) {
                    String str2 = a99Var.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList2.add(new po90(a99Var.d, a99Var.e, str2, a99Var.a, a99Var.c));
                }
                List<lda0> list3 = lv21Var.d;
                ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
                for (lda0 lda0Var : list3) {
                    int iOrdinal = lda0Var.d.ordinal();
                    if (iOrdinal == 0) {
                        i = 1;
                    } else if (iOrdinal == 1) {
                        i = 2;
                    } else {
                        if (iOrdinal != 2) {
                            eg.o();
                            return ko90Var;
                        }
                        i = 3;
                    }
                    arrayList3.add(new no90(i, new lo90(lda0Var.b.a), new oo90(lda0Var.c.a)));
                    ko90Var = null;
                }
                boolean z = r89Var.d.a;
                boolean z2 = lp90VarA0.g.c != null;
                ujk1 ujk1Var = lv21Var.b;
                return new qo90(str, setP1, str, arrayList2, lp90VarA0, arrayList3, z, new mo90(z2, ujk1Var.a, ujk1Var.b, ujk1Var.c));
            }
            int iOrdinal2 = ((jw21) it.next()).c.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    ko90Var = ko90.a;
                } else if (iOrdinal2 == 2) {
                    ko90Var = ko90.b;
                } else if (iOrdinal2 == 3) {
                    ko90Var = ko90.c;
                } else if (iOrdinal2 == 4) {
                    ko90Var = ko90.e;
                } else {
                    if (iOrdinal2 != 5) {
                        eg.o();
                        return null;
                    }
                    ko90Var = ko90.d;
                }
            }
            if (ko90Var != null) {
                arrayList.add(ko90Var);
            }
        }
    }

    public boolean accept(Object obj) {
        return ((du4) this.b).a() && ((ksk) obj).c == le30.e;
    }

    public Object apply(Object obj) {
        Boolean bool;
        hvq0 hvq0Var;
        switch (this.a) {
            case 2:
                xq xqVar = (xq) obj;
                ev evVarF = ((jq) ((zq) this.b).a.get()).f();
                return Observable.just(new br(evVarF != null ? evVarF.a : null, xqVar.a, false));
            case 3:
            case 5:
            case 7:
            case 14:
            case 16:
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
            default:
                y87 y87Var = (y87) this.b;
                return y87Var.d.b.switchMap(new em3(y87Var, (s87) obj, (byte) 20));
            case 4:
                return new CompletableFromAction(new bm0((im0) this.b, (mmr0) obj, (byte) 1));
            case 6:
                u11 u11Var = (u11) this.b;
                zxo1 zxo1Var = u11Var.f.a;
                vxe0 vxe0Var = u11Var.g;
                l3f0 l3f0Var = vxe0Var.a;
                uxe0 uxe0Var = (l3f0Var == null || (bool = vxe0Var.b) == null) ? null : new uxe0(l3f0Var, bool.booleanValue());
                y01 y01VarA = u11Var.c.a();
                bk8 bk8Var = y01VarA.a;
                return new pxe0(zxo1Var, uxe0Var, bk8Var != null ? new w01(y01VarA.b, y01VarA.c, bk8Var) : null);
            case 8:
                b301 b301Var = (b301) this.b;
                return new m301(b301Var.a, b301Var.b, b301Var.c, (Throwable) obj);
            case 9:
                l62 l62Var = (l62) obj;
                boolean zA = ((hnl) this.b).a();
                ti tiVar = l62Var.Z;
                boolean z = tiVar instanceof isn;
                ivq0 ivq0Var = ivq0.b;
                if ((z || (tiVar instanceof jsn)) && !zA) {
                    hvq0Var = new hvq0(ivq0Var, false);
                } else {
                    l860 l860Var = l62Var.P0;
                    boolean z2 = l860Var instanceof l860;
                    ivq0 ivq0Var2 = ivq0.c;
                    if (z2) {
                        hvq0Var = new hvq0(ivq0Var2, l860Var.a);
                    } else if (l860Var instanceof m860) {
                        hvq0Var = new hvq0(ivq0Var2, true);
                    } else {
                        if (!(l860Var instanceof k860)) {
                            eg.o();
                            return null;
                        }
                        hvq0Var = new hvq0(ivq0Var, false);
                    }
                }
                return Flowable.I(hvq0Var);
            case 10:
                bg2 bg2Var = (bg2) obj;
                gg2 gg2Var = (gg2) this.b;
                return gg2Var.e.a(tri1.d, String.format(Locale.US, "%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(bg2Var.a), Integer.valueOf(bg2Var.b + 1), Integer.valueOf(bg2Var.c)}, 3))).onErrorReturn(vap1.d).map(new t7o0(gg2Var, bg2Var));
            case 11:
                GetSessionResponse getSessionResponse = (GetSessionResponse) obj;
                j23 j23Var = (j23) this.b;
                String sessionId = getSessionResponse.getSessionId();
                h290 suggestedPromptsList = getSessionResponse.getSuggestedPromptsList();
                List messagesList = getSessionResponse.getMessagesList();
                String welcomeMessage = getSessionResponse.getWelcomeMessage();
                welcomeMessage.getClass();
                return Single.just(messagesList).flatMap(new t7o0(j23Var, (byte) 12)).map(new g23(sessionId, suggestedPromptsList, ihc1.y0(welcomeMessage) ? null : welcomeMessage, (byte) 1));
            case 12:
                return ((bl3) this.b).h(nk3.g, cl3.g);
            case 13:
                return Single.create(new w4b1((f44) this.b, (byte) 17));
            case 15:
                return Single.create(new w4b1((eh4) this.b, (byte) 19));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                String strI = mqn1.i((String) ((ys4) this.b).D.getValue(), (jo70) obj);
                return strI == null ? "" : strI;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Single.create(new w4b1((c26) this.b, (byte) 25));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return ((qs6) this.b).a(Collections.singletonList((String) obj)).toObservable();
        }
    }

    public t54 b() {
        return ((u54) this.b).c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable c(String str, onm onmVar) {
        qq9 qq9Var;
        if (onmVar instanceof qq9) {
            qq9Var = (qq9) onmVar;
            int i = qq9Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qq9Var.c = i - Integer.MIN_VALUE;
            } else {
                qq9Var = new qq9(this, onmVar);
            }
        } else {
            qq9Var = new qq9(this, onmVar);
        }
        Object objA = qq9Var.a;
        int i2 = qq9Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                an40 an40VarN = GetDuckScheduleRequest.n();
                an40VarN.n(str);
                GetDuckScheduleRequest getDuckScheduleRequestBuild = an40VarN.build();
                tm9 tm9Var = (tm9) this.b;
                getDuckScheduleRequestBuild.getClass();
                qq9Var.c = 1;
                objA = tm9Var.a(getDuckScheduleRequestBuild, qq9Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            h290 h290VarN = ((GetDuckScheduleResponse) objA).n();
            ArrayList<DuckSegment> arrayList = new ArrayList();
            for (Object obj : h290VarN) {
                if (((DuckSegment) obj).p() == nev.d) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (DuckSegment duckSegment : arrayList) {
                arrayList2.add(new pq9((long) (duckSegment.o() * 1000.0d), (long) (duckSegment.n() * 1000.0d)));
            }
            return arrayList2;
        } catch (Exception unused) {
            op71.x(qq9Var.getContext());
            return z6x.a;
        }
    }

    public af5 g(x340 x340Var) {
        x340Var.i0(-1391172658);
        fe0 fe0Var = (fe0) this.b;
        ye5 ye5Var = new ye5();
        ge0 ge0Var = fe0Var.a;
        String strO0 = cwl1.o0(x340Var, 2131958178);
        zma1 zma1Var = new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65535);
        boolean zI = x340Var.i(fe0Var);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new ee0(fe0Var, (byte) 0);
            x340Var.s0(objT);
        }
        vhg.a(ye5Var, strO0, "title", zma1Var, (iu30) objT);
        af5 af5VarP = ye5Var.p();
        x340Var.r(false);
        return af5VarP;
    }

    public void subscribe(SingleEmitter singleEmitter) {
        switch (this.a) {
            case 14:
                singleEmitter.onSuccess(new e84(((Boolean) Single.create(new w4b1((g84) this.b, (byte) 18)).blockingGet()).booleanValue()));
                break;
            case 15:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
            default:
                m26 m26Var = (m26) this.b;
                luk lukVar = m26Var.r;
                if (lukVar == null || !lukVar.i("apps-music-libs-eventsender.rate_limiting_rule_3_events_per_time_unit")) {
                    lukVar = m26Var.s;
                }
                if (lukVar != null) {
                    lukVar.e(new k26(singleEmitter, m26Var, (byte) 11));
                }
                break;
            case 16:
                ek4 ek4Var = (ek4) this.b;
                luk lukVar2 = ek4Var.i;
                if (lukVar2 == null || !lukVar2.i("android-gen-alpha-blocking.is_my_allowlisting_requests_page_enabled")) {
                    lukVar2 = ek4Var.j;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new dk4(singleEmitter, ek4Var, (byte) 4));
                }
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ax4 ax4Var = (ax4) this.b;
                singleEmitter.onSuccess(new yw4(((Number) Single.create(new w4b1(ax4Var, (byte) 22)).blockingGet()).intValue(), ((Boolean) Single.create(new e4b1(ax4Var, (byte) 20)).blockingGet()).booleanValue(), ((Boolean) Single.create(new t4d1(ax4Var, (byte) 16)).blockingGet()).booleanValue()));
                break;
        }
    }

    public void v(Object obj) {
        switch (this.a) {
            case 1:
                sp spVar = (sp) this.b;
                an anVar = new an((List) obj, (pp) spVar.c, new qp(spVar, (byte) 2), (byte) 0);
                ajq0 ajq0Var = (ajq0) spVar.b;
                RecyclerView recyclerView = (RecyclerView) ajq0Var.d;
                ((ConstraintLayout) ajq0Var.a).getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.setAdapter(anVar);
                break;
            default:
                b41 b41Var = (p41) obj;
                v51 v51Var = (v51) this.b;
                gid gidVar = v51Var.a;
                PublishSubject publishSubject = v51Var.Z;
                if (!(b41Var instanceof b41)) {
                    if (b41Var instanceof h41) {
                        r21 r21Var = ((h41) b41Var).a;
                        if (r21Var instanceof r21) {
                            publishSubject.onNext(new v41(r21Var.a));
                            ((ohv0) gidVar.b).a(new lhv0("adaptive_authentication", "web_challenge_launcher"));
                        } else if (r21Var instanceof q21) {
                            q21 q21Var = (q21) r21Var;
                            publishSubject.onNext(new z41(q21Var.b, q21Var.a, q21Var.c, q21Var.d));
                        } else if (!(r21Var instanceof p21)) {
                            eg.o();
                        } else {
                            p21 p21Var = (p21) r21Var;
                            publishSubject.onNext(new w41(p21Var.a, p21Var.b, p21Var.c, p21Var.d, p21Var.e, p21Var.f, p21Var.g, p21Var.h, p21Var.i));
                        }
                    } else if (b41Var instanceof o41) {
                        publishSubject.onNext(new b51(((o41) b41Var).a, (lsn0) null));
                    } else if (!(b41Var instanceof f41)) {
                        boolean z = b41Var instanceof g41;
                        e51 e51Var = e51.c;
                        if (z) {
                            v51Var.a(e51Var);
                            g41 g41Var = (g41) b41Var;
                            publishSubject.onNext(g41Var.a ? r41.a : new t41(g41Var.b));
                        } else if (b41Var instanceof n41) {
                            v51Var.a(e51Var);
                            publishSubject.onNext(new x41(((n41) b41Var).a));
                        } else if (b41Var instanceof e41) {
                            v51Var.a(e51Var);
                            publishSubject.onNext(new a51(((e41) b41Var).a));
                        }
                    } else {
                        f41 f41Var = (f41) b41Var;
                        publishSubject.onNext(new s41(f41Var.a, f41Var.b, f41Var.c));
                    }
                } else if (b41Var.c instanceof x31) {
                    ((ohv0) gidVar.b).a(new khv0("adaptive_authentication", 4, (Map) null, "adaptiveauth_successful_challenge"));
                    v51Var.a(l51.c);
                    v51Var.Q0.onNext(scd1.a);
                }
                break;
        }
    }

    public /* synthetic */ ymm0() {
        this.a = (byte) 0;
    }

    public Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (((Boolean) obj).booleanValue()) {
            return wi8.b;
        }
        if (bool.booleanValue()) {
            fmy0 fmy0Var = ((dj8) this.b).I1;
            if (fmy0Var != null) {
                if (!fmy0Var.b().i) {
                    return wi8.c;
                }
            } else {
                u890.C("psesApi");
                throw null;
            }
        }
        return wi8.a;
    }
}
