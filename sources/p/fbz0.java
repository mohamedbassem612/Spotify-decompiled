package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fbz0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fbz0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x033e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35, types: [p.xpz0] */
    /* JADX WARN: Type inference failed for: r14v94 */
    public final Object invoke(Object obj) {
        String string;
        Instant instant;
        Instant instant2;
        Comparable instant3;
        Instant instant4;
        ?? r14;
        Instant instant5;
        String str;
        List m231Var;
        Object objPutIfAbsent;
        byte b = this.a;
        boolean z = true;
        Object vpz0Var = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (ze21) ((dx0) obj2).d;
            case 1:
                z8z0 z8z0Var = (z8z0) obj;
                ccz0 ccz0Var = (ccz0) obj2;
                if (z8z0Var instanceof m8z0) {
                    ccz0Var.t.b = true;
                }
                ibn ibnVar = ccz0Var.a1;
                if (ibnVar != null) {
                    ibnVar.accept(z8z0Var);
                }
                return rih1Var;
            case 2:
                return (ze21) ((dx0) obj2).d;
            case 3:
                return (ze21) ((dx0) obj2).d;
            case 4:
                String str2 = ((rcz0) obj).a;
                Resources resources = ((Context) ((et90) obj2).c).getResources();
                String string2 = u890.j(str2, "reorder_restricted") ? resources.getString(2131960803) : resources.getString(2131960804);
                string2.getClass();
                return new nhb1(string2, resources.getString(2131960801), resources.getString(2131960802), resources.getString(2131960800), false, (izh1) null, 96);
            case 5:
                ((qtr) obj).b(new f3((rwj) obj2, (lnm) null, (byte) 22));
                return rih1Var;
            case 6:
                String str3 = (String) obj;
                ArrayList arrayList = ((bez0) obj2).b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jgb1 jgb1Var = ((aez0) it.next()).a;
                    jgb1 jgb1Var2 = jgb1Var instanceof jgb1 ? jgb1Var : null;
                    if (jgb1Var2 != null) {
                        arrayList2.add(jgb1Var2);
                    }
                }
                for (Object obj3 : arrayList2) {
                    if (((jgb1) obj3).a.equals(str3)) {
                        vpz0Var = obj3;
                        return (jgb1) vpz0Var;
                    }
                }
                return (jgb1) vpz0Var;
            case 7:
                return ((dez0) ((kuy) obj2).f).c;
            case 8:
                b261.n((e261) obj, ((phz0) obj2).l);
                return rih1Var;
            case 9:
                hkz0 hkz0Var = (hkz0) obj2;
                return d3p1.F(hkz0Var.a, hkz0Var.c, (ekz0) obj);
            case 10:
                cxc0 cxc0Var = (cxc0) obj;
                Map map = cxc0Var.f.q;
                String str4 = (String) map.get("generation_status");
                if (str4 == null || (string = ihc1.e1(str4).toString()) == null) {
                    string = "";
                }
                Set set = h4d0.a;
                h4d0 h4d0VarU = qyo1.u(string);
                if (h4d0VarU == h4d0.b) {
                    h4d0VarU = null;
                }
                if (h4d0VarU == null) {
                    h4d0VarU = qyo1.u("MESSAGE_STATUS_".concat(string));
                }
                long j = cxc0Var.a;
                int i = cxc0Var.c;
                sp00 sp00Var = (sp00) ((apz0) obj2).e;
                h4d0VarU.getClass();
                boolean zContains = h4d0.a.contains(h4d0VarU);
                List list = z6x.a;
                if (zContains && (str = (String) map.get("progress_messages")) != null) {
                    try {
                        m231Var = (List) nfa0.d.a(str, new r36(chc1.a, (byte) 0));
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    if (!(m231Var instanceof m231)) {
                        list = m231Var;
                    }
                    list = list;
                    break;
                }
                String str5 = (String) map.get("refreshed_at");
                String str6 = (String) map.get("failed_at");
                if (str5 != null) {
                    try {
                        instant = OffsetDateTime.parse(str5).toInstant();
                    } catch (Exception e) {
                        Logger.e(e, "Failed to parse timestamp value: %s", new Object[]{str5});
                        instant = null;
                    }
                    instant2 = instant;
                    break;
                } else {
                    instant2 = null;
                }
                if (str6 != null) {
                    try {
                        instant3 = OffsetDateTime.parse(str6).toInstant();
                    } catch (Exception e2) {
                        Logger.e(e2, "Failed to parse timestamp value: %s", new Object[]{str6});
                        instant3 = null;
                    }
                    break;
                } else {
                    instant3 = null;
                }
                Instant instant6 = (Instant) sp00Var.c;
                if ((instant2 == null || (instant5 = (Instant) sp00Var.b) == null || instant2.compareTo(instant5) >= 0) && (instant3 == null || instant6 == null || instant3.compareTo(instant6) >= 0)) {
                    Set set2 = h4d0.a;
                    if (set2.contains(h4d0VarU) && instant3 == null && instant6 != null) {
                        r14 = (xpz0) sp00Var.e;
                    } else {
                        h4d0 h4d0Var = h4d0.f;
                        if (h4d0VarU == h4d0Var && instant3 != null) {
                            lh40 lh40Var = (lh40) sp00Var.d;
                            ih40 ih40Var = lh40Var instanceof ih40 ? (ih40) lh40Var : null;
                            if (u890.j(ih40Var != null ? ih40Var.b : null, instant3)) {
                                r14 = (xpz0) sp00Var.e;
                            }
                        }
                        Instant instant7 = (Instant) sp00Var.b;
                        if (instant7 != null && instant2 != null) {
                            instant7 = (Instant) pap1.y(instant7, instant2);
                        } else if (instant7 == null) {
                            instant7 = instant2;
                        }
                        sp00Var.b = instant7;
                        Comparable comparable = (Instant) sp00Var.c;
                        if (comparable != null && instant3 != null) {
                            comparable = (Instant) pap1.y(comparable, instant3);
                        } else if (comparable == null) {
                            comparable = instant3;
                        }
                        sp00Var.c = comparable;
                        if (!set2.contains(h4d0VarU)) {
                            lh40 lh40Var2 = (lh40) sp00Var.d;
                            jh40 jh40Var = jh40.a;
                            kh40 kh40Var = kh40.a;
                            if (h4d0VarU == h4d0Var) {
                                if (u890.j(lh40Var2, jh40Var)) {
                                    z = false;
                                } else if (lh40Var2 instanceof hh40) {
                                    z = ((hh40) lh40Var2).c;
                                } else if (!(lh40Var2 instanceof ih40) && !u890.j(lh40Var2, kh40Var)) {
                                    eg.o();
                                    return null;
                                }
                                sp00Var.d = new hh40((Instant) sp00Var.b, instant3, z);
                            } else if (h4d0VarU.b() && instant2 != null) {
                                if (lh40Var2 instanceof ih40) {
                                    instant4 = ((ih40) lh40Var2).a;
                                } else if (lh40Var2 instanceof hh40) {
                                    instant4 = ((hh40) lh40Var2).a;
                                } else if (!u890.j(lh40Var2, jh40Var) && !u890.j(lh40Var2, kh40Var)) {
                                    eg.o();
                                    return null;
                                }
                                if (instant4 == null || instant2.compareTo(instant4) > 0) {
                                    sp00Var.d = kh40Var;
                                }
                            }
                            lh40 lh40Var3 = (lh40) sp00Var.d;
                            if (u890.j(lh40Var3, kh40Var)) {
                                vpz0Var = wpz0.a;
                            } else if (lh40Var3 instanceof hh40) {
                                hh40 hh40Var = (hh40) lh40Var3;
                                vpz0Var = new vpz0(hh40Var.b, hh40Var.c);
                            } else if (!u890.j(lh40Var3, jh40Var) && !(lh40Var3 instanceof ih40)) {
                                eg.o();
                                return null;
                            }
                        } else if (!list.isEmpty()) {
                            sp00Var.d = new ih40((Instant) sp00Var.b, (Instant) sp00Var.c);
                            vpz0Var = new upz0(list);
                        }
                        sp00Var.e = vpz0Var;
                        r14 = vpz0Var;
                    }
                } else {
                    r14 = (xpz0) sp00Var.e;
                }
                return new tpz0(j, i, r14);
            case 11:
                return (zob1) ((et90) obj2).e;
            case 12:
                ((qtr) obj).b(new eri0((bs0) obj2, (lnm) null, (byte) 11));
                return rih1Var;
            case 13:
                cir0 cir0Var = (cir0) obj;
                p2o0 p2o0Var = (p2o0) ((jtz0) obj2).c.a.c;
                muz0 muz0Var = (muz0) p2o0Var.c;
                Scheduler scheduler = (Scheduler) ((ntz0) p2o0Var.b).a.get();
                c8o.l(scheduler);
                t01 t01Var = new t01(scheduler, p2o0Var.M(), p2o0Var.L());
                ntz0 ntz0Var = (ntz0) p2o0Var.b;
                kt91 kt91Var = (kt91) ntz0Var.l.get();
                c8o.l(kt91Var);
                Context context = (Context) ntz0Var.m.a;
                c8o.l(context);
                gw70 gw70VarB = ntz0Var.b();
                c8o.l(gw70VarB);
                c8o.l((im4) ntz0Var.g.get());
                yir yirVar = new yir(context, gw70VarB, (byte) 15);
                lzn0 lzn0Var = (lzn0) ntz0Var.n.get();
                c8o.l(lzn0Var);
                return new fsl(muz0Var, t01Var, kt91Var, yirVar, lzn0Var, cir0Var);
            case 14:
                t01 t01Var2 = (t01) ((fsl) obj2).d;
                int i2 = ((vrz0) obj).a;
                t01Var2.a = i2;
                n830 n830VarU = t01Var2.u();
                z = i2 > 0;
                PrimaryButtonView primaryButtonView = (PrimaryButtonView) n830VarU.h;
                if (z) {
                    primaryButtonView.setVisibility(0);
                } else {
                    primaryButtonView.setVisibility(8);
                }
                return rih1Var;
            case 15:
                ((wzz0) obj2).k.invoke(new fzz0((String) obj));
                return rih1Var;
            case 16:
                return new m441(new l4f0((yup0) obj2, ((i001) obj).a, (lnm) null, (byte) 27));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                View view = (View) obj;
                r001 r001Var = (r001) obj2;
                op80 jp80Var = new jp80(view);
                i8h1 i8h1Var = r001Var.b2;
                if (i8h1Var == null) {
                    u890.C("ubiLogger");
                    throw null;
                }
                l6h1 l6h1Var = r001Var.c2;
                if (l6h1Var == null) {
                    u890.C("ubiDwellTimeLogger");
                    throw null;
                }
                op80 eq80Var = new eq80(new e3h1(l6h1Var, (n7h1) null, i8h1Var));
                op80 wchVar = q6x.b;
                if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
                    jp80Var = wchVar;
                } else if (jp80Var.equals(wchVar)) {
                    jp80Var = eq80Var;
                } else if (!eq80Var.equals(wchVar)) {
                    wchVar = new wch(jp80Var, eq80Var);
                    jp80Var = wchVar;
                }
                xhk1.c(view, jp80Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                cas casVar = (a7m0) obj;
                casVar.a = atz0.f;
                casVar.b = RxEventSources.a(new ObservableSource[]{((PublishSubject) ((et90) obj2).c).map(w1x0.e)});
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (p9m) obj2;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new xwm0((q401) obj2, (byte) 14);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((ft0) obj2).invoke();
                return rih1Var;
            case 22:
                return new gdl1((Context) obj, (fza) obj2);
            case 23:
                gdl1 gdl1Var = (gdl1) obj;
                edl1 edl1Var = (edl1) obj2;
                if (edl1Var != null) {
                    if (gdl1Var.Q0) {
                        gdl1Var.g(edl1Var);
                    } else {
                        gdl1Var.post(new sjj1(gdl1Var, edl1Var, (byte) 4));
                    }
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ga01 ga01Var = (ga01) obj;
                dxy dxyVar = (dxy) obj2;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) dxyVar.g;
                Object objE = concurrentHashMap.get(ga01Var);
                if (objE == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(ga01Var, (objE = mgo1.e(0, 1, 0, 5)))) != null) {
                    objE = objPutIfAbsent;
                }
                mr20 mr20Var = (sen0) objE;
                lnm lnmVar = null;
                return new iib(hu20.d(new mr20[]{new m441(new ciw0(dxyVar, ga01Var, lnmVar, (byte) 3)), mr20Var}), new dwf0(mr20Var, dxyVar, ga01Var, lnmVar, (byte) 16), (byte) 6);
            case 25:
                ((Number) obj).intValue();
                return ((ntl0) obj2).b();
            case 26:
                uxy0 uxy0Var = (uxy0) obj2;
                th30 th30Var = (th30) uxy0Var.b;
                uww0 uww0Var = (uww0) uxy0Var.c;
                if (!th30Var.U()) {
                    y901 y901VarA = uww0Var.a();
                    y901VarA.T0(mno1.h(new mmr0[]{new mmr0("episode_uri", (Object) null), new mmr0("transcript_uri", (Object) null)}));
                    y901VarA.g1(th30Var, "read_along_report_issue_dialog");
                }
                return rih1Var;
            case 27:
                ((z2s) obj).R(gl21.class, (dx0) ((s59) obj2).d, k301.Y0, k301.Z0, k301.a1, false, atz0.Y);
                return rih1Var;
            case 28:
                return new xwm0((qb01) obj2, (byte) 15);
            default:
                md01 md01Var = (md01) obj2;
                return d3p1.F(md01Var.a, md01Var.b, (kd01) obj);
        }
    }
}
