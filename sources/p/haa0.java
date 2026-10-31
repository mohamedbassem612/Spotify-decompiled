package p;

import android.app.Activity;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.util.Base64;
import android.view.View;
import com.comscore.streaming.State;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.spotify.base.java.logging.Logger;
import com.spotify.identity.proto.v3.Identity;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$FilterSet;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$ListFilteringStore;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StringList;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$UserFilters;
import com.spotify.listuxplatformconsumers.likedsongs.sections.likedsongsfilterchips.logging.events.proto.LikedSongsPageLoadResult;
import com.spotify.player.model.PlayerState;
import com.spotify.yourlibrary.uiusecases.filterrow.chips.LibraryChipsContainerView;
import com.spotify.yourlibrary.uiusecases.filterrow.chips.LibraryChipsScrollView;
import com.spotify.yourlibrary.uiusecases.filterrow.chips.LibraryChipsTransitionView;
import com.spotify.yourlibrary.uiusecases.filterrow.chips.LibraryChipsView;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import j$.time.Duration;
import j$.time.Instant;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.Adler32;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class haa0 implements Function, com.spotify.mobius.functions.Function, e5a {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public haa0(d0r d0rVar, String str, u9c0 u9c0Var, c1v0 c1v0Var) {
        this.a = (byte) 9;
        this.b = d0rVar;
        this.c = "spotify:list:available-releases:artist-popular_".concat(str);
        lnm lnmVar = null;
        this.d = d5p1.t(hu20.e(new x010(new m441(new ss90(this, lnmVar, (byte) 5)), rqt0.u(c1v0Var), new vv70(3, (lnm) null, (byte) 5), (byte) 1), new zz90(lnmVar, (Object) this, (byte) 1)), u9c0Var, new alb1(0L, 0L), rev0.a);
    }

    public static String l(String str, Map map) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return str2;
        }
        Logger.d(l1d.m("BUZZ: ListeningActivityButton — no display name for username=", str), new Object[0]);
        return null;
    }

    public static sh51 m(uf51 uf51Var) {
        int i = uf51Var.t;
        String str = uf51Var.h;
        String str2 = uf51Var.a;
        boolean z = i == 3 && v(uf51Var) == null;
        if ((str2 == null || str2.length() == 0) && (str == null || str.length() == 0)) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return new sh51(str2, uf51Var.b, !z ? uf51Var.g : null, (str == null || z) ? null : str, uf51Var.d);
    }

    public static LinkedHashSet n(Set set, Set set2) {
        Set set3 = set2;
        ArrayList arrayList = new ArrayList(q7h.U(set3, 10));
        Iterator it = set3.iterator();
        while (it.hasNext()) {
            arrayList.add(rc11.a.b(((orc0) it.next()).getClass()));
        }
        Set setP1 = o7h.p1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (!setP1.contains(rc11.a.b(((orc0) obj).getClass()))) {
                arrayList2.add(obj);
            }
        }
        return dm61.y0(o7h.p1(arrayList2), set3);
    }

    public static ArrayList u(List list) {
        Parcelable qbd0Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qp10 qp10Var = (sp10) it.next();
            if (qp10Var instanceof rp10) {
                rp10 rp10Var = (rp10) qp10Var;
                qbd0Var = new obd0(rp10Var.a, x(rp10Var.b), 1);
            } else if (qp10Var instanceof op10) {
                op10 op10Var = (op10) qp10Var;
                qbd0Var = new obd0(op10Var.a, x(op10Var.b), 2);
            } else {
                if (!(qp10Var instanceof qp10)) {
                    eg.o();
                    return null;
                }
                qp10 qp10Var2 = qp10Var;
                String str = qp10Var2.b;
                String str2 = qp10Var2.a;
                ArrayList<pp10> arrayList2 = qp10Var2.c;
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                for (pp10 pp10Var : arrayList2) {
                    String str3 = pp10Var.a;
                    eo10 eo10Var = pp10Var.b;
                    arrayList3.add(new pbd0(str3, eo10Var != null ? x(eo10Var) : null));
                }
                qbd0Var = new qbd0(str, str2, arrayList3);
            }
            arrayList.add(qbd0Var);
        }
        return arrayList;
    }

    public static ni00 v(uf51 uf51Var) {
        String str;
        String str2;
        String str3;
        if (uf51Var.t != 3 || (str = uf51Var.a) == null) {
            return null;
        }
        if (ihc1.y0(str)) {
            str = null;
        }
        if (str == null || (str2 = uf51Var.h) == null) {
            return null;
        }
        if (ihc1.y0(str2)) {
            str2 = null;
        }
        if (str2 == null || (str3 = uf51Var.X) == null) {
            return null;
        }
        if (ihc1.y0(str3)) {
            str3 = null;
        }
        if (str3 == null) {
            return null;
        }
        return new ni00(str, uf51Var.b, str2, str3);
    }

    public static pi00 w(haa0 haa0Var, a6x a6xVar, int i) {
        boolean z = (i & 2) == 0;
        String str = a6xVar.b;
        String str2 = a6xVar.c;
        oxc oxcVar = a6xVar.d;
        return new pi00(new fgz(ggz.g, new dgz(str, str2, oxcVar != null ? new cgz(oxcVar.a, oxcVar.b) : null, z), 2));
    }

    public static nbd0 x(eo10 eo10Var) {
        return new nbd0(eo10Var.a, eo10Var.b, eo10Var.c ? lbd0.a : new kbd0(eo10Var.d));
    }

    public void a(h8a h8aVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        hrr0 hrr0Var = (hrr0) this.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1166709678);
        if ((i & 48) == 0) {
            i2 = (x340Var.i(qim0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 145) != 144)) {
            Function0 function0 = (Function0) ((hrr0) this.d).getValue();
            x4a x4aVar = (x4a) ((hrr0) this.c).getValue();
            if (function0 == null || x4aVar == null) {
                x340Var.i0(1722697910);
                ltn1.q((d8a) hrr0Var.getValue(), x4aVar, function0, anm1.N("standard_banner", qim0Var), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1722490148);
                e9p1.b((d8a) hrr0Var.getValue(), x4aVar, function0, anm1.N("compact_banner", qim0Var), x340Var, 0);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(this, h8aVar, qim0Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0418  */
    /* JADX WARN: Code duplicated, block: B:176:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:177:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:183:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:190:0x04df  */
    /* JADX WARN: Code duplicated, block: B:193:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:194:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:196:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:197:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:199:0x0507  */
    /* JADX WARN: Code duplicated, block: B:200:0x050a  */
    /* JADX WARN: Code duplicated, block: B:202:0x050d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0510  */
    /* JADX WARN: Code duplicated, block: B:206:0x051b  */
    /* JADX WARN: Code duplicated, block: B:208:0x051e  */
    /* JADX WARN: Code duplicated, block: B:211:0x0522  */
    /* JADX WARN: Code duplicated, block: B:212:0x0524  */
    /* JADX WARN: Code duplicated, block: B:213:0x0526  */
    /* JADX WARN: Code duplicated, block: B:216:0x052f  */
    /* JADX WARN: Code duplicated, block: B:217:0x053a  */
    /* JADX WARN: Code duplicated, block: B:219:0x0543  */
    /* JADX WARN: Code duplicated, block: B:220:0x0545  */
    /* JADX WARN: Code duplicated, block: B:223:0x0563  */
    /* JADX WARN: Code duplicated, block: B:224:0x056b  */
    /* JADX WARN: Code duplicated, block: B:226:0x0571  */
    /* JADX WARN: Code duplicated, block: B:227:0x057a  */
    /* JADX WARN: Code duplicated, block: B:255:0x041b A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:227:0x057a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public Object apply(Object obj) {
        Object next;
        ui00 ui00Var;
        int i;
        ArrayList arrayList;
        ti00 ti00Var;
        ri00 ri00Var;
        String str;
        String str2;
        Context context;
        i5r i5rVar;
        List list;
        Object obj2;
        f470 f470Var;
        m0p1 j920Var;
        int i2;
        int i3;
        int i4;
        String string;
        boolean z;
        String string2;
        zu50 zu50Var;
        w160 w160Var;
        zu50 zu50Var2;
        mhe0 mhe0Var;
        a6x a6xVar;
        int i5;
        qi00 xi00Var;
        qi00 zi00Var;
        int i6;
        zu50 zu50Var3;
        nod0 ood0Var;
        int i7;
        int i8;
        Uri uri;
        byte b = this.a;
        int i9 = 3;
        int i10 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 6:
                Identity.UserProfile userProfile = (Identity.UserProfile) obj;
                Iterator it = userProfile.p().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int iO = ((Identity.Image) next).o();
                        do {
                            Object next2 = it.next();
                            int iO2 = ((Identity.Image) next2).o();
                            if (iO > iO2) {
                                next = next2;
                                iO = iO2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Identity.Image image = (Identity.Image) next;
                return new i5w0(new p0b0((di8) obj5, image != null ? image.getUrl() : null, userProfile.s().getValue(), !userProfile.q().getValue(), Long.valueOf(((wza0) obj4).b.b()), ((p0b0) obj3).f));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return ((l3s0) obj).a(((rkd0) obj3).d, (String) obj5, ((y6b1) obj4).toString());
            case 22:
                uod0 uod0Var = (uod0) obj;
                rod0 rod0Var = uod0Var.a;
                if (rod0Var == null || (zu50Var3 = rod0Var.a) == null) {
                    ui00Var = null;
                } else {
                    String str3 = zu50Var3.b;
                    mhe0 mhe0Var2 = zu50Var3.c;
                    if (!(mhe0Var2 instanceof ihe0)) {
                        if (mhe0Var2 instanceof jhe0) {
                            ood0Var = new ood0(((jhe0) mhe0Var2).a);
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    ood0Var = new nod0(((ihe0) mhe0Var2).a);
                    String str4 = zu50Var3.a;
                    f470 f470Var2 = zu50Var3.d.a;
                    if (f470Var2 == null || (i8 = f470Var2.a) == 0) {
                        i7 = 0;
                    } else {
                        int iC = l1d.C(i8);
                        i7 = iC != 1 ? iC != 2 ? 3 : 2 : 1;
                    }
                    ui00Var = new ui00(new pod0(str3, ood0Var, i7, str4, 48));
                }
                if (rod0Var != null) {
                    List<uf51> list2 = rod0Var.b;
                    boolean zB = ((xrk) obj3).b();
                    arrayList = new ArrayList();
                    for (uf51 uf51Var : list2) {
                        swd swdVar = uf51Var.c;
                        if (swdVar instanceof a6x) {
                            zi00Var = new qi00(w(this, (a6x) swdVar, i9));
                        } else {
                            if (swdVar == null) {
                                String str5 = uf51Var.a;
                                zi00Var = str5 != null ? new zi00(new sh51(str5, (String) null, (String) null, (String) null, (String) null)) : null;
                            } else {
                                int i11 = 10;
                                if (swdVar instanceof swd) {
                                    sh51 sh51VarM = m(uf51Var);
                                    ArrayList arrayList2 = swdVar.b;
                                    i5 = i10;
                                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        Iterator it3 = it2;
                                        ArrayList arrayList4 = new ArrayList(q7h.U((List) it2.next(), i11));
                                        for (Iterator it4 = r9.iterator(); it4.hasNext(); it4 = it4) {
                                            arrayList4.add(new y6b1((String) it4.next(), false));
                                        }
                                        arrayList3.add(arrayList4);
                                        it2 = it3;
                                        i11 = 10;
                                    }
                                    xi00Var = new xi00(sh51VarM, 2, arrayList3, uf51Var.d, v(uf51Var));
                                } else {
                                    i5 = i10;
                                    if (swdVar instanceof qf50) {
                                        sh51 sh51VarM2 = m(uf51Var);
                                        ArrayList arrayList5 = ((qf50) swdVar).b;
                                        int i12 = 10;
                                        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                                        Iterator it5 = arrayList5.iterator();
                                        while (it5.hasNext()) {
                                            Iterator it6 = it5;
                                            ArrayList arrayList7 = new ArrayList(q7h.U((List) it5.next(), i12));
                                            for (Iterator it7 = r10.iterator(); it7.hasNext(); it7 = it7) {
                                                arrayList7.add(new y6b1((String) it7.next(), false));
                                            }
                                            arrayList6.add(arrayList7);
                                            it5 = it6;
                                            i12 = 10;
                                        }
                                        xi00Var = new xi00(sh51VarM2, 3, arrayList6, uf51Var.d, v(uf51Var));
                                    } else if (swdVar instanceof o660) {
                                        ArrayList arrayList8 = ((o660) swdVar).b;
                                        ArrayList arrayList9 = new ArrayList();
                                        for (Object obj6 : arrayList8) {
                                            List list3 = (List) obj6;
                                            if (!zB) {
                                                String str6 = (String) o7h.s0(list3);
                                                if (str6 != null) {
                                                    Set set = s4b1.f;
                                                    i6 = !uic.g(str6, blc0.X4) ? 1 : 0;
                                                } else {
                                                    i6 = i5;
                                                }
                                                if (i6 != 0) {
                                                }
                                            }
                                            arrayList9.add(obj6);
                                        }
                                        if (arrayList9.isEmpty()) {
                                            zi00Var = null;
                                        } else {
                                            sh51 sh51VarM3 = m(uf51Var);
                                            int i13 = 10;
                                            ArrayList arrayList10 = new ArrayList(q7h.U(arrayList9, 10));
                                            Iterator it8 = arrayList9.iterator();
                                            while (it8.hasNext()) {
                                                Iterator it9 = it8;
                                                ArrayList arrayList11 = new ArrayList(q7h.U((List) it8.next(), i13));
                                                for (Iterator it10 = r10.iterator(); it10.hasNext(); it10 = it10) {
                                                    arrayList11.add(new y6b1((String) it10.next(), false));
                                                }
                                                arrayList10.add(arrayList11);
                                                it8 = it9;
                                                i13 = 10;
                                            }
                                            xi00Var = new xi00(sh51VarM3, 4, arrayList10, uf51Var.d, v(uf51Var));
                                        }
                                    } else if (swdVar instanceof pnc0) {
                                        sh51 sh51VarM4 = m(uf51Var);
                                        ArrayList arrayList12 = ((pnc0) swdVar).b;
                                        int i14 = 10;
                                        ArrayList arrayList13 = new ArrayList(q7h.U(arrayList12, 10));
                                        Iterator it11 = arrayList12.iterator();
                                        while (it11.hasNext()) {
                                            Iterator it12 = it11;
                                            ArrayList arrayList14 = new ArrayList(q7h.U((List) it11.next(), i14));
                                            for (Iterator it13 = r10.iterator(); it13.hasNext(); it13 = it13) {
                                                arrayList14.add(new y6b1((String) it13.next(), false));
                                            }
                                            arrayList13.add(arrayList14);
                                            it11 = it12;
                                            i14 = 10;
                                        }
                                        xi00Var = new xi00(sh51VarM4, 1, arrayList13, uf51Var.d, v(uf51Var));
                                    } else {
                                        if (!(swdVar instanceof hol1)) {
                                            eg.o();
                                            return null;
                                        }
                                        sh51 sh51VarM5 = m(uf51Var);
                                        ArrayList arrayList15 = ((hol1) swdVar).b;
                                        int i15 = 10;
                                        ArrayList arrayList16 = new ArrayList(q7h.U(arrayList15, 10));
                                        Iterator it14 = arrayList15.iterator();
                                        while (it14.hasNext()) {
                                            Iterator it15 = it14;
                                            ArrayList arrayList17 = new ArrayList(q7h.U((List) it14.next(), i15));
                                            for (Iterator it16 = r10.iterator(); it16.hasNext(); it16 = it16) {
                                                arrayList17.add(new y6b1((String) it16.next(), false));
                                            }
                                            arrayList16.add(arrayList17);
                                            it14 = it15;
                                            i15 = 10;
                                        }
                                        xi00Var = new xi00(sh51VarM5, 5, arrayList16, uf51Var.d, v(uf51Var));
                                    }
                                }
                                zi00Var = xi00Var;
                            }
                            if (zi00Var != null) {
                                arrayList.add(zi00Var);
                            }
                            i10 = i5;
                            i9 = 3;
                        }
                        i5 = i10;
                        if (zi00Var != null) {
                            arrayList.add(zi00Var);
                        }
                        i10 = i5;
                        i9 = 3;
                    }
                    i = i10;
                } else {
                    i = 1;
                    arrayList = z6x.a;
                }
                ArrayList arrayList18 = arrayList;
                if (rod0Var != null) {
                    pa30 pa30Var = rod0Var.c;
                    ti00Var = pa30Var != null ? new ti00(new m7u(pa30Var.a)) : null;
                } else {
                    ti00Var = null;
                }
                pi00 pi00VarW = (rod0Var == null || (a6xVar = rod0Var.d) == null) ? null : w(this, a6xVar, i);
                jyb jybVar = uod0Var.c;
                if (jybVar instanceof kyb) {
                    kyb kybVar = (kyb) jybVar;
                    ri00Var = new ri00(new x720(true, new v720(kybVar.c, kybVar.d)));
                } else {
                    if (!(jybVar instanceof jyb)) {
                        if (u890.j(jybVar, lyb.c)) {
                            ri00Var = new ri00(new x720(true, w720.c));
                        } else {
                            if (!u890.j(jybVar, myb.c)) {
                                eg.o();
                                return null;
                            }
                            str = null;
                            ri00Var = new ri00(new x720(false, null));
                        }
                        if (rod0Var != null) {
                            str2 = rod0Var.e;
                        } else {
                            str2 = str;
                        }
                        context = ((qfl1) obj4).a;
                        i5rVar = uod0Var.e;
                        list = uod0Var.f;
                        if (rod0Var != null || (zu50Var2 = rod0Var.a) == null) {
                            obj2 = str;
                        } else {
                            mhe0Var = zu50Var2.c;
                        }
                        if (rod0Var != null || (zu50Var = rod0Var.a) == null || (w160Var = zu50Var.d) == null) {
                            obj2 = mhe0Var;
                            obj2 = mhe0Var;
                            obj2 = mhe0Var;
                            f470Var = str;
                        } else {
                            obj2 = mhe0Var;
                            f470Var = w160Var.a;
                        }
                        if (obj2 instanceof ihe0) {
                            j920Var = new i920(((ihe0) obj2).a);
                        } else if (obj2 instanceof jhe0) {
                            j920Var = new j920(((jhe0) obj2).a);
                        } else {
                            j920Var = new j920("");
                        }
                        if (f470Var != 0) {
                            i2 = f470Var.a;
                        } else {
                            i2 = 0;
                        }
                        if (i2 == 0) {
                            i3 = -1;
                        } else {
                            i3 = vod0.a[l1d.C(i2)];
                        }
                        if (i3 != 1) {
                            i4 = 3;
                        } else if (i3 != 2) {
                            i4 = 3;
                            if (i3 == 3) {
                                i4 = 2;
                            }
                        } else {
                            i4 = 1;
                        }
                        k920 k920Var = new k920(new l920(j920Var, i4));
                        if (i5rVar != null) {
                            string = ((fod0) obj5).c(i5rVar.a, i5rVar.b);
                        } else {
                            string = context.getString(2131954911);
                        }
                        if (i5rVar != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        List listM = p7h.M(new h920[]{k920Var, new f920(string, z)});
                        if (list.isEmpty()) {
                            string2 = context.getString(2131954914);
                        } else if (list.size() == 1) {
                            string2 = ((p5k) o7h.q0(list)).b;
                        } else {
                            string2 = ((p5k) o7h.q0(list)).b + " +" + (list.size() - 1);
                        }
                        return new cj00(ui00Var, arrayList18, ti00Var, pi00VarW, ri00Var, str2, new si00(new m920(o7h.N0(Collections.singletonList(new e920(string2, !list.isEmpty())), listM))), 148);
                    }
                    jyb jybVar2 = jybVar;
                    ri00Var = new ri00(new x720(true, new u720(jybVar2.d, jybVar2.c)));
                }
                str = null;
                if (rod0Var != null) {
                    str2 = rod0Var.e;
                } else {
                    str2 = str;
                }
                context = ((qfl1) obj4).a;
                i5rVar = uod0Var.e;
                list = uod0Var.f;
                if (rod0Var != null) {
                    obj2 = str;
                } else {
                    obj2 = str;
                }
                if (rod0Var != null) {
                    obj2 = mhe0Var;
                    obj2 = mhe0Var;
                    obj2 = mhe0Var;
                    f470Var = str;
                } else {
                    obj2 = mhe0Var;
                    obj2 = mhe0Var;
                    obj2 = mhe0Var;
                    f470Var = str;
                }
                if (obj2 instanceof ihe0) {
                    j920Var = new i920(((ihe0) obj2).a);
                } else if (obj2 instanceof jhe0) {
                    j920Var = new j920(((jhe0) obj2).a);
                } else {
                    j920Var = new j920("");
                }
                if (f470Var != 0) {
                    i2 = f470Var.a;
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    i3 = -1;
                } else {
                    i3 = vod0.a[l1d.C(i2)];
                }
                if (i3 != 1) {
                    i4 = 3;
                } else if (i3 != 2) {
                    i4 = 3;
                    if (i3 == 3) {
                        i4 = 2;
                    }
                } else {
                    i4 = 1;
                }
                k920 k920Var2 = new k920(new l920(j920Var, i4));
                if (i5rVar != null) {
                    string = ((fod0) obj5).c(i5rVar.a, i5rVar.b);
                } else {
                    string = context.getString(2131954911);
                }
                if (i5rVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                List listM2 = p7h.M(new h920[]{k920Var2, new f920(string, z)});
                if (list.isEmpty()) {
                    string2 = context.getString(2131954914);
                } else if (list.size() == 1) {
                    string2 = ((p5k) o7h.q0(list)).b;
                } else {
                    string2 = ((p5k) o7h.q0(list)).b + " +" + (list.size() - 1);
                }
                return new cj00(ui00Var, arrayList18, ti00Var, pi00VarW, ri00Var, str2, new si00(new m920(o7h.N0(Collections.singletonList(new e920(string2, !list.isEmpty())), listM2))), 148);
            default:
                wpd0 wpd0Var = (wpd0) obj;
                String str7 = wpd0Var.c;
                if (str7.length() <= 0) {
                    str7 = null;
                }
                if (str7 == null || (uri = Uri.parse(str7)) == null) {
                    uri = Uri.EMPTY;
                }
                String str8 = wpd0Var.b;
                String str9 = wpd0Var.g;
                if (str9 == null) {
                    str9 = wpd0Var.d;
                }
                uri.getClass();
                igm igmVar = new igm(str8, new wfm(uri), str9);
                p410 p410Var = (p410) obj5;
                String str10 = (String) obj4;
                bqd0 bqd0Var = (bqd0) obj3;
                smc0 smc0VarN = k4p1.n();
                h0y h0yVar = (h0y) p410Var.g;
                String strR = u2p1.r(str10);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(strR));
                smc0VarN.add(new jhm("liveroom_how_to_report_users", (hux) cnx.c, (fhm) null, (Integer) 2131957563, (String) null, false, (tm81) null, new ihm(zgm.c, new ghm(hh60.Q0, new ry40(strR, (byte) 11)), new fz40(h0yVar, intent, (byte) 24)), 244));
                xpd0 xpd0Var = wpd0Var.e;
                if (xpd0Var != null) {
                    smc0VarN.add(((i6c) p410Var.f).a(xpd0Var.a, xpd0Var.b));
                }
                nqd0 nqd0Var = wpd0Var.f;
                if (nqd0Var != null) {
                    smc0VarN.add(((dg8) p410Var.d).n(3, nqd0Var.a, nqd0Var.b));
                }
                if (bqd0Var.a) {
                    smc0VarN.add(((cab) p410Var.e).n());
                }
                if (bqd0Var.c) {
                    smc0VarN.add(((xlr) p410Var.h).a());
                }
                smc0VarN.add(f971.b((f971) p410Var.b, wpd0Var.a, bqd0Var.b ? str10 : null));
                return new kjm(igmVar, (List) k4p1.k(smc0VarN), 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object c(String str, orc0 orc0Var, onm onmVar) {
        xtc0 xtc0Var;
        Object value;
        Map map;
        ArrayList arrayList;
        Object value2;
        Map mapK;
        bpb1 bpb1Var = (bpb1) this.d;
        if (onmVar instanceof xtc0) {
            xtc0Var = (xtc0) onmVar;
            int i = xtc0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                xtc0Var.f = i - Integer.MIN_VALUE;
            } else {
                xtc0Var = new xtc0(this, onmVar);
            }
        } else {
            xtc0Var = new xtc0(this, onmVar);
        }
        Object objI = xtc0Var.d;
        int i2 = xtc0Var.f;
        if (i2 != 0) {
            if (i2 == 1) {
                orc0 orc0Var2 = xtc0Var.b;
                String str2 = xtc0Var.a;
                hm5.M(objI);
                do {
                    value2 = bpb1Var.getValue();
                    mapK = (Map) value2;
                    Set set = (Set) mapK.get(str2);
                    if (set != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : set) {
                            if (((orc0) obj).getClass() != orc0Var2.getClass()) {
                                arrayList2.add(obj);
                            }
                        }
                        Set setP1 = o7h.p1(arrayList2);
                        mapK = setP1.isEmpty() ? sqg0.K(str2, mapK) : sqg0.P(mapK, new mmr0(str2, setP1));
                    }
                } while (!bpb1Var.k(value2, mapK));
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = xtc0Var.c;
                orc0Var = xtc0Var.b;
                str = xtc0Var.a;
                hm5.M(objI);
            }
            return rih1.a;
        }
        hm5.M(objI);
        mr20 data = ((r4r) this.c).getData();
        xtc0Var.a = str;
        xtc0Var.b = orc0Var;
        xtc0Var.c = this;
        xtc0Var.f = 2;
        objI = b5p1.i(data, xtc0Var);
        d9n d9nVar = d9n.a;
        if (objI == d9nVar) {
            return d9nVar;
        }
        Set setR = this.r((ListFilteringProto$ListFilteringStore) objI, str);
        do {
            value = bpb1Var.getValue();
            map = (Map) value;
            Set set2 = (Set) map.get(str);
            Set set3 = w7x.a;
            if (set2 == null) {
                set2 = set3;
            }
            if (!setR.isEmpty() || !set2.isEmpty()) {
                set3 = set2;
            }
            arrayList = new ArrayList();
            for (Object obj2 : set3) {
                if (((orc0) obj2).getClass() != orc0Var.getClass()) {
                    arrayList.add(obj2);
                }
            }
        } while (!bpb1Var.k(value, sqg0.P(map, new mmr0(str, dm61.x0(orc0Var, o7h.p1(arrayList))))));
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Object d(onm onmVar) {
        sxa0 sxa0Var;
        swa0 swa0Var = (swa0) this.d;
        if (onmVar instanceof sxa0) {
            sxa0Var = (sxa0) onmVar;
            int i = sxa0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sxa0Var.c = i - Integer.MIN_VALUE;
            } else {
                sxa0Var = new sxa0(this, onmVar);
            }
        } else {
            sxa0Var = new sxa0(this, onmVar);
        }
        sxa0 sxa0Var2 = sxa0Var;
        Object objA = sxa0Var2.a;
        int i2 = sxa0Var2.c;
        if (i2 == 0) {
            hm5.M(objA);
            String str = swa0Var.d.t;
            if (str == null) {
                str = "";
            }
            if (str.length() != 0) {
                return str;
            }
            bza0 bza0Var = (bza0) this.b;
            rmc1 rmc1Var = (rmc1) this.c;
            String str2 = rmc1Var.a;
            String str3 = rmc1Var.b;
            String str4 = rmc1Var.c;
            dxr0 dxr0Var = rmc1Var.d;
            sxa0Var2.c = 1;
            objA = bza0Var.a(str2, str3, str4, dxr0Var, sxa0Var2);
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
        String str5 = (String) objA;
        swa0Var.d = twa0.a(swa0Var.d, (String) null, (String) null, (String) null, (dxr0) null, (String) null, (String) null, false, false, 0, str5, (yxa0) null, (tpw0) null, 7679);
        return str5;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable e(onm onmVar) {
        bbb0 bbb0Var;
        if (onmVar instanceof bbb0) {
            bbb0Var = (bbb0) onmVar;
            int i = bbb0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bbb0Var.c = i - Integer.MIN_VALUE;
            } else {
                bbb0Var = new bbb0(this, onmVar);
            }
        } else {
            bbb0Var = new bbb0(this, onmVar);
        }
        Object objK = bbb0Var.a;
        int i2 = bbb0Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            zx60 zx60Var = new zx60(yoi1.g(((dw7) this.b).f), (byte) 9);
            bbb0Var.c = 1;
            objK = b5p1.k(zx60Var, bbb0Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        Locale locale = (Locale) objK;
        return locale == null ? Locale.ROOT : locale;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable f(String str, onm onmVar) {
        ytc0 ytc0Var;
        Map mapO;
        bpb1 bpb1Var = (bpb1) this.d;
        if (onmVar instanceof ytc0) {
            ytc0Var = (ytc0) onmVar;
            int i = ytc0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ytc0Var.d = i - Integer.MIN_VALUE;
            } else {
                ytc0Var = new ytc0(this, onmVar);
            }
        } else {
            ytc0Var = new ytc0(this, onmVar);
        }
        Object objI = ytc0Var.b;
        int i2 = ytc0Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 data = ((r4r) this.c).getData();
            ytc0Var.a = str;
            ytc0Var.d = 1;
            objI = b5p1.i(data, ytc0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = ytc0Var.a;
            hm5.M(objI);
        }
        ListFilteringProto$ListFilteringStore listFilteringProto$ListFilteringStore = (ListFilteringProto$ListFilteringStore) objI;
        ListFilteringProto$UserFilters listFilteringProto$UserFilters = (ListFilteringProto$UserFilters) listFilteringProto$ListFilteringStore.o().get((String) this.b);
        boolean z = (listFilteringProto$UserFilters == null || (mapO = listFilteringProto$UserFilters.o()) == null || !mapO.containsKey(str)) ? false : true;
        boolean zContainsKey = ((Map) bpb1Var.getValue()).containsKey(str);
        w7x w7xVar = w7x.a;
        if (!z && !zContainsKey) {
            return w7xVar;
        }
        Set setR = r(listFilteringProto$ListFilteringStore, str);
        w7x w7xVar2 = (Set) ((Map) bpb1Var.getValue()).get(str);
        if (w7xVar2 != null) {
            w7xVar = w7xVar2;
        }
        return n(setR, w7xVar);
    }

    public fbb0 g() {
        return (fbb0) this.c;
    }

    public fbb0 h() {
        return (fbb0) this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(onm onmVar) {
        l2e0 l2e0Var;
        if (onmVar instanceof l2e0) {
            l2e0Var = (l2e0) onmVar;
            int i = l2e0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l2e0Var.c = i - Integer.MIN_VALUE;
            } else {
                l2e0Var = new l2e0(this, onmVar);
            }
        } else {
            l2e0Var = new l2e0(this, onmVar);
        }
        Object objM = l2e0Var.a;
        int i2 = l2e0Var.c;
        byte b = 1;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objM);
            FlowableMap flowableMapJ = ((Flowable) this.d).x(ta20.X).J(ua20.X);
            l2e0Var.c = 1;
            objM = u890.m(flowableMapJ, 1, l2e0Var);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objM);
        }
        String str = (String) objM;
        Set set = s4b1.f;
        String strZ = uic.C(str, (String) null).z();
        if (strZ == null) {
            return new huz(new inm1(new IllegalStateException("Cannot create URI for user: ".concat(str))), (byte) 10);
        }
        ay8 ay8VarF = d3p1.F((d0r) this.c, kzd.a, strZ);
        r4h1 r4h1Var = (r4h1) this.b;
        return new lt20(hu20.e(new x010(hu20.e(((b7n) r4h1Var.a).a(r6n.a), new cpm1(lnmVar, r4h1Var, b)), ay8VarF, new vv70(3, (lnm) null, (byte) 15), (byte) 1), new vmj1(b, this, str, lnmVar)), new w1e0(3, lnmVar, (byte) 2), (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0081 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:14:0x002c, B:36:0x007d, B:38:0x0081, B:39:0x0086, B:18:0x0036, B:21:0x003c, B:27:0x0052, B:29:0x005a, B:32:0x006d, B:24:0x0043), top: B:43:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(vr81 vr81Var, onm onmVar) {
        sha0 sha0Var;
        vr81 vr81Var2;
        nw80 nw80Var;
        if (onmVar instanceof sha0) {
            sha0Var = (sha0) onmVar;
            int i = sha0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sha0Var.d = i - Integer.MIN_VALUE;
            } else {
                sha0Var = new sha0(this, onmVar);
            }
        } else {
            sha0Var = new sha0(this, onmVar);
        }
        Object objM = sha0Var.b;
        int i2 = sha0Var.d;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objM);
                Flowable flowable = (Flowable) this.b;
                sha0Var.a = vr81Var;
                sha0Var.d = 1;
                objM = u890.m(flowable, 1, sha0Var);
                if (objM == d9nVar) {
                }
                return d9nVar;
            }
            if (i2 == 1) {
                vr81Var = sha0Var.a;
                hm5.M(objM);
            } else if (i2 == 2) {
                hm5.M(objM);
            } else {
                if (i2 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vr81Var2 = sha0Var.a;
                hm5.M(objM);
                nw80Var = (nw80) objM;
                if (nw80Var != null) {
                    nw80Var.e(vr81Var2.a);
                }
            }
            return zs81.a;
            if (o4p1.t((PlayerState) objM)) {
                Completable completableA = zq51.a((zq51) this.c);
                sha0Var.a = null;
                sha0Var.d = 2;
                if (fc11.i(completableA, sha0Var) == d9nVar) {
                }
                return zs81.a;
            }
            p3t p3tVar = (p3t) this.d;
            sha0Var.a = vr81Var;
            sha0Var.d = 3;
            objM = b5p1.k(p3tVar, sha0Var);
            if (objM != d9nVar) {
                vr81Var2 = vr81Var;
                nw80Var = (nw80) objM;
                if (nw80Var != null) {
                    nw80Var.e(vr81Var2.a);
                }
                return zs81.a;
            }
            return d9nVar;
        } catch (Exception unused) {
            op71.x(sha0Var.getContext());
            return vs81.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r10 == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r10 == r6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(p.onm r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            p.thg1 r0 = (p.thg1) r0
            boolean r1 = r10 instanceof p.jya0
            if (r1 == 0) goto L17
            r1 = r10
            p.jya0 r1 = (p.jya0) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.c = r2
            goto L1c
        L17:
            p.jya0 r1 = new p.jya0
            r1.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r1.a
            int r2 = r1.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            p.hm5.M(r10)
            goto L74
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r3
        L33:
            p.hm5.M(r10)
            goto L53
        L37:
            p.hm5.M(r10)
            p.yig1 r10 = r0.b
            boolean r2 = r10 instanceof p.xig1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L5f
            java.lang.Object r9 = r9.d
            p.w0g r9 = (p.w0g) r9
            p.xig1 r10 = (p.xig1) r10
            java.lang.String r10 = r10.a
            r1.c = r5
            java.lang.Object r10 = r9.c(r10, r1)
            if (r10 != r6) goto L53
            goto L73
        L53:
            p.rmg1 r10 = (p.rmg1) r10
            p.iya0 r9 = new p.iya0
            java.lang.String r1 = r10.a
            java.lang.String r10 = r10.c
            r9.<init>(r1, r10)
            goto L7f
        L5f:
            boolean r2 = r10 instanceof p.wig1
            if (r2 == 0) goto L93
            java.lang.Object r9 = r9.c
            p.gj10 r9 = (p.gj10) r9
            p.wig1 r10 = (p.wig1) r10
            java.lang.String r10 = r10.a
            r1.c = r4
            java.lang.Object r10 = r9.e(r10, r1)
            if (r10 != r6) goto L74
        L73:
            return r6
        L74:
            p.y0x0 r10 = (p.y0x0) r10
            p.iya0 r9 = new p.iya0
            java.lang.String r1 = r10.a
            java.lang.String r10 = r10.b
            r9.<init>(r1, r10)
        L7f:
            p.mya0 r1 = new p.mya0
            java.lang.String r2 = r0.a
            p.yig1 r3 = r0.b
            p.yxa0 r6 = r0.c
            p.yq00 r7 = r0.f
            boolean r8 = r0.g
            java.lang.String r4 = r9.a
            java.lang.String r5 = r9.b
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L93:
            p.eg.o()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.haa0.k(p.onm):java.lang.Object");
    }

    public mr20 o(String str) {
        return rqt0.u(new x010(new qsc0(((r4r) this.c).getData(), this, str, (byte) 1), new iib((bpb1) this.d, str, (byte) 7), new cuc0(this, str, (lnm) null), (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object p(String str, orc0 orc0Var, onm onmVar) {
        duc0 duc0Var;
        Object value;
        Map mapK;
        Object value2;
        r4r r4rVar = (r4r) this.c;
        bpb1 bpb1Var = (bpb1) this.d;
        if (onmVar instanceof duc0) {
            duc0Var = (duc0) onmVar;
            int i = duc0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                duc0Var.f = i - Integer.MIN_VALUE;
            } else {
                duc0Var = new duc0(this, onmVar);
            }
        } else {
            duc0Var = new duc0(this, onmVar);
        }
        Object objI = duc0Var.d;
        int i2 = duc0Var.f;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 data = r4rVar.getData();
            duc0Var.a = str;
            duc0Var.b = orc0Var;
            duc0Var.c = this;
            duc0Var.f = 1;
            objI = b5p1.i(data, duc0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objI);
                return rih1Var;
            }
            this = duc0Var.c;
            orc0Var = duc0Var.b;
            str = duc0Var.a;
            hm5.M(objI);
        }
        Set setR = this.r((ListFilteringProto$ListFilteringStore) objI, str);
        w7x w7xVar = (Set) ((Map) bpb1Var.getValue()).get(str);
        if (w7xVar == null) {
            w7xVar = w7x.a;
        }
        if (setR.isEmpty() && w7xVar.isEmpty()) {
            Set setP1 = o7h.p1(new ArrayList());
            do {
                value2 = bpb1Var.getValue();
            } while (!bpb1Var.k(value2, sqg0.P((Map) value2, new mmr0(str, setP1))));
        } else {
            do {
                value = bpb1Var.getValue();
                mapK = (Map) value;
                Set set = (Set) mapK.get(str);
                if (set != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : set) {
                        if (((orc0) obj).getClass() != orc0Var.getClass()) {
                            arrayList.add(obj);
                        }
                    }
                    Set setP2 = o7h.p1(arrayList);
                    mapK = setP2.isEmpty() ? sqg0.K(str, mapK) : sqg0.P(mapK, new mmr0(str, setP2));
                }
            } while (!bpb1Var.k(value, mapK));
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[LOOP:0: B:24:0x0071->B:37:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(onm onmVar) {
        tfc0 tfc0Var;
        cxc0 cxc0Var;
        xe20 xe20Var;
        String strW;
        if (onmVar instanceof tfc0) {
            tfc0Var = (tfc0) onmVar;
            int i = tfc0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tfc0Var.d = i - Integer.MIN_VALUE;
            } else {
                tfc0Var = new tfc0(this, onmVar);
            }
        } else {
            tfc0Var = new tfc0(this, onmVar);
        }
        Object objI = tfc0Var.b;
        int i2 = tfc0Var.d;
        Object obj = null;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            any anyVarD = ((roc0) ((koc0) this.b)).d();
            tfc0Var.d = 1;
            objI = b5p1.i(anyVarD, tfc0Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objI);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cxc0Var = tfc0Var.a;
            hm5.M(objI);
        }
        dmr dmrVar = (dmr) this.d;
        int i3 = cxc0Var.b;
        for (Object obj2 : (List) objI) {
            if (((xe20) obj2).d) {
                obj = obj2;
                break;
            }
        }
        xe20Var = (xe20) obj;
        if (xe20Var == null) {
            strW = "";
        } else {
            strW = nhc1.W(xe20Var.b.toLowerCase(Locale.US), " ", "_");
        }
        sfc0 sfc0VarN = LikedSongsPageLoadResult.n();
        sfc0VarN.q();
        sfc0VarN.r(i3);
        sfc0VarN.n(strW);
        LikedSongsPageLoadResult likedSongsPageLoadResult = (LikedSongsPageLoadResult) sfc0VarN.build();
        t2j0 t2j0Var = dmrVar.a;
        likedSongsPageLoadResult.getClass();
        t2j0Var.a(likedSongsPageLoadResult);
        return rih1.a;
        cxc0 cxc0Var2 = (cxc0) objI;
        lt20 lt20Var = ((ff20) this.c).c;
        tfc0Var.a = cxc0Var2;
        tfc0Var.d = 2;
        Object objI2 = b5p1.i(lt20Var, tfc0Var);
        if (objI2 != d9nVar) {
            cxc0Var = cxc0Var2;
            objI = objI2;
            dmr dmrVar2 = (dmr) this.d;
            int i4 = cxc0Var.b;
            while (r8.hasNext()) {
                if (((xe20) obj2).d) {
                    obj = obj2;
                    break;
                }
            }
            xe20Var = (xe20) obj;
            if (xe20Var == null) {
                strW = "";
            } else {
                strW = nhc1.W(xe20Var.b.toLowerCase(Locale.US), " ", "_");
            }
            sfc0 sfc0VarN2 = LikedSongsPageLoadResult.n();
            sfc0VarN2.q();
            sfc0VarN2.r(i4);
            sfc0VarN2.n(strW);
            LikedSongsPageLoadResult likedSongsPageLoadResult2 = (LikedSongsPageLoadResult) sfc0VarN2.build();
            t2j0 t2j0Var2 = dmrVar2.a;
            likedSongsPageLoadResult2.getClass();
            t2j0Var2.a(likedSongsPageLoadResult2);
            return rih1.a;
        }
        return d9nVar;
    }

    public Set r(ListFilteringProto$ListFilteringStore listFilteringProto$ListFilteringStore, String str) {
        arc0 jrc0Var;
        Map mapO;
        ListFilteringProto$UserFilters listFilteringProto$UserFilters = (ListFilteringProto$UserFilters) listFilteringProto$ListFilteringStore.o().get((String) this.b);
        ListFilteringProto$FilterSet listFilteringProto$FilterSet = (listFilteringProto$UserFilters == null || (mapO = listFilteringProto$UserFilters.o()) == null) ? null : (ListFilteringProto$FilterSet) mapO.get(str);
        if (listFilteringProto$FilterSet == null) {
            return w7x.a;
        }
        h290<ListFilteringProto$StoredFilter> h290VarO = listFilteringProto$FilterSet.o();
        ArrayList arrayList = new ArrayList();
        for (ListFilteringProto$StoredFilter listFilteringProto$StoredFilter : h290VarO) {
            listFilteringProto$StoredFilter.getClass();
            int iO = listFilteringProto$StoredFilter.o();
            switch (iO == 0 ? -1 : ra20.a[l1d.C(iO)]) {
                case State.UNDEFINED /* -1 */:
                case 25:
                    jrc0Var = null;
                    break;
                case 0:
                default:
                    eg.o();
                    return null;
                case 1:
                    jrc0Var = nrc0.a;
                    break;
                case 2:
                    jrc0Var = krc0.a;
                    break;
                case 3:
                    jrc0Var = zqc0.a;
                    break;
                case 4:
                    jrc0Var = frc0.a;
                    break;
                case 5:
                    jrc0Var = sqc0.a;
                    break;
                case 6:
                    jrc0Var = new jrc0(listFilteringProto$StoredFilter.s());
                    break;
                case 7:
                    jrc0Var = crc0.a;
                    break;
                case 8:
                    jrc0Var = uqc0.a;
                    break;
                case 9:
                    jrc0Var = vqc0.a;
                    break;
                case 10:
                    jrc0Var = brc0.a;
                    break;
                case 11:
                    jrc0Var = new hrc0(listFilteringProto$StoredFilter.q());
                    break;
                case 12:
                    jrc0Var = yqc0.a;
                    break;
                case 13:
                    jrc0Var = drc0.a;
                    break;
                case 14:
                    jrc0Var = erc0.a;
                    break;
                case 15:
                    jrc0Var = pqc0.a;
                    break;
                case 16:
                    jrc0Var = lrc0.a;
                    break;
                case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                    jrc0Var = mrc0.a;
                    break;
                case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                    jrc0Var = tqc0.a;
                    break;
                case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                    jrc0Var = new qqc0(listFilteringProto$StoredFilter.n());
                    break;
                case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                    jrc0Var = grc0.a;
                    break;
                case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                    jrc0Var = xqc0.a;
                    break;
                case 22:
                    jrc0Var = wqc0.a;
                    break;
                case 23:
                    h290 h290VarO2 = listFilteringProto$StoredFilter.p().o();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO2, 10));
                    Iterator it = h290VarO2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(o7h.l1(((ListFilteringProto$StringList) it.next()).n()));
                    }
                    jrc0Var = new arc0(arrayList2);
                    break;
                case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                    jrc0Var = new irc0(o7h.p1(listFilteringProto$StoredFilter.r().o()));
                    break;
            }
            if (jrc0Var != null) {
                arrayList.add(jrc0Var);
            }
        }
        return o7h.p1(arrayList);
    }

    public void s(s29 s29Var, int i, boolean z) {
        y19 y19Var = (y19) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = s29Var.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        xnw0 xnw0Var = s29Var.c;
        adler32.update(byteBufferAllocate.putInt(aow0.a(xnw0Var)).array());
        byte[] bArr = s29Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    pdp1.i("JobInfoScheduler", s29Var, "Upload for context %s is already scheduled. Returning...");
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((c441) this.c).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(aow0.a(xnw0Var))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(y19Var.a(xnw0Var, jLongValue, i));
            Set set = ((z19) y19Var.b.get(xnw0Var)).c;
            if (set.contains(jm41.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(jm41.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(jm41.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", aow0.a(xnw0Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            pdp1.j("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[]{s29Var, Integer.valueOf(value), Long.valueOf(y19Var.a(xnw0Var, jLongValue, i)), lValueOf, Integer.valueOf(i)});
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void t(int i) {
        er91 er91Var = new er91((fs91) null, ((dg30) this.b).getString(i), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        kt91 kt91Var = (kt91) this.c;
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
    }

    public void y(d8a d8aVar, x4a x4aVar, Function0 function0) {
        ((hrr0) this.b).setValue(d8aVar);
        ((hrr0) this.c).setValue(x4aVar);
        ((hrr0) this.d).setValue(function0);
    }

    public CompletableAndThenCompletable z(Instant instant) {
        return ((g0l) this.c).m().filter(rh20.h).firstOrError().ignoreElement().c(Single.fromCallable(new e71(instant, this, (byte) 11)).flatMapCompletable(new bm00(this, (byte) 23)));
    }

    public haa0(Activity activity, mwn0 mwn0Var, c2r0 c2r0Var, lhc lhcVar) {
        this.a = (byte) 12;
        this.b = activity;
        this.c = mwn0Var;
        this.d = c2r0Var;
    }

    public haa0(jed0 jed0Var, hgd0 hgd0Var) {
        this.a = (byte) 19;
        this.b = jed0Var;
        this.c = hgd0Var;
        this.d = new idd1(new nzb0(this, (byte) 27));
    }

    public haa0(koc0 koc0Var, ff20 ff20Var, twb twbVar, dmr dmrVar) {
        this.a = (byte) 16;
        this.b = koc0Var;
        this.c = ff20Var;
        this.d = dmrVar;
    }

    public haa0(d8a d8aVar, x4a x4aVar, Function0 function0) {
        this.a = (byte) 25;
        this.b = v8r.q(d8aVar);
        this.c = v8r.q(x4aVar);
        this.d = v8r.q(function0);
    }

    public haa0(Scheduler scheduler, g0l g0lVar) {
        this.a = (byte) 3;
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        this.b = scheduler;
        this.c = g0lVar;
        this.d = durationOfSeconds;
    }

    public haa0(dw7 dw7Var) {
        this.a = (byte) 10;
        this.b = dw7Var;
        this.c = new fbb0(yoi1.g(dw7Var.f), this, (byte) 0);
        this.d = new fbb0(yoi1.g(dw7Var.b), this, (byte) 1);
    }

    public /* synthetic */ haa0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public haa0(LibraryChipsContainerView libraryChipsContainerView, LibraryChipsView libraryChipsView, LibraryChipsScrollView libraryChipsScrollView, LibraryChipsTransitionView libraryChipsTransitionView) {
        this.a = (byte) 14;
        this.b = libraryChipsView;
        this.c = libraryChipsScrollView;
        this.d = libraryChipsTransitionView;
    }

    public haa0(Context context, String str) {
        this.a = (byte) 17;
        this.b = str;
        this.c = (r4r) euc0.b.a(context, euc0.a[0]);
        this.d = gio1.b(b7x.a);
    }

    public haa0(iib0 iib0Var, blp blpVar) {
        this.a = (byte) 13;
        this.b = blpVar;
        tdl0 tdl0Var = new tdl0(iib0Var.b.a, (byte) 19);
        this.c = tdl0Var;
        this.d = new tnl0(14, tdl0Var.b());
    }

    public haa0(fod0 fod0Var, qfl1 qfl1Var, boolean z, xrk xrkVar) {
        this.a = (byte) 22;
        this.b = fod0Var;
        this.c = qfl1Var;
        this.d = xrkVar;
    }
}
