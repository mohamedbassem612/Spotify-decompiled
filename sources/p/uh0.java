package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uh0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh0(woa woaVar, kma kmaVar, Function0 function0, String str, ven0 ven0Var) {
        super(1);
        this.a = (byte) 13;
        this.b = woaVar;
        this.c = kmaVar;
        this.e = function0;
        this.d = str;
        this.f = ven0Var;
    }

    private final Object a(Object obj) {
        long j = ((Offset) obj).a;
        ViewParent parent = ((View) this.b).getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        ((ven0) this.f).setValue(((ee21) this.c).a.getId());
        kaa0.j(0L, (ven0) this.d);
        ((ven0) this.e).setValue((Object) null);
        return rih1.a;
    }

    private final Object d(Object obj) {
        fn31.T((c9n) this.b, (o8n) null, 0, new p18((cr41) this.c, (u5u) this.d, ((Offset) obj).a, (pob0) this.e, (g6o0) this.f, (lnm) null, (byte) 3), 3);
        return rih1.a;
    }

    private final Object e(Object obj) {
        Flowable flowableT = ((Flowable) this.b).T(Flowable.I(PlayerState.EMPTY));
        Observable observable = ((o241) this.c).a;
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
        Flowable flowableT2 = observable.toFlowable(backpressureStrategy).T(Flowable.I(b7x.a));
        Flowable flowableH = yoi1.h(((zr00) this.d).a, o6x.a);
        Boolean bool = Boolean.FALSE;
        Flowable flowableT3 = flowableH.T(Flowable.I(bool));
        Flowable flowableT4 = ((yh2) this.e).a().toFlowable(backpressureStrategy).T(Flowable.I(bool));
        rwj rwjVar = (rwj) this.f;
        waz0 waz0Var = (waz0) rwjVar.g;
        return Flowable.c(flowableT, flowableT2, flowableT3, flowableT4, waz0Var.d().U(waz0Var.a()), new x390(rwjVar, (sna0) obj, (byte) 11));
    }

    private final Object f(Object obj) {
        epb0 epb0Var = (epb0) obj;
        List list = (List) this.b;
        qih1 qih1Var = (qih1) this.c;
        gs90 gs90Var = new gs90(qih1Var, (byte) 26);
        tvb0 tvb0Var = (tvb0) this.d;
        epb0Var.R(list.size(), new svb0(gs90Var, list, (byte) 0), new ek1(new yy80(tvb0Var, (byte) 22), list, (byte) 9), new svb0(list, tvb0Var), new j2i(-1942245546, new cbf(list, (i4d0) this.e, tvb0Var, list, qih1Var, (iu30) this.f, (byte) 2), true));
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:204:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:207:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:213:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:215:0x0902  */
    /* JADX WARN: Code duplicated, block: B:218:0x090c  */
    /* JADX WARN: Code duplicated, block: B:221:0x0917  */
    /* JADX WARN: Code duplicated, block: B:224:0x0925  */
    /* JADX WARN: Code duplicated, block: B:226:0x0928  */
    /* JADX WARN: Code duplicated, block: B:229:0x092e  */
    /* JADX WARN: Code duplicated, block: B:230:0x0933  */
    /* JADX WARN: Code duplicated, block: B:234:0x094b A[LOOP:4: B:232:0x0945->B:234:0x094b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:237:0x0960  */
    /* JADX WARN: Code duplicated, block: B:240:0x0967  */
    /* JADX WARN: Code duplicated, block: B:243:0x097e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0987  */
    /* JADX WARN: Code duplicated, block: B:247:0x098b  */
    /* JADX WARN: Code duplicated, block: B:248:0x0995  */
    /* JADX WARN: Code duplicated, block: B:251:0x099a  */
    /* JADX WARN: Code duplicated, block: B:252:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:255:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:258:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:260:0x09b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:267:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:268:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:271:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:274:0x0a31  */
    /* JADX WARN: Code duplicated, block: B:276:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:277:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:279:0x0a3d  */
    /* JADX WARN: Code duplicated, block: B:286:0x0a7c  */
    /* JADX WARN: Code duplicated, block: B:288:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:290:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:309:0x0b23  */
    /* JADX WARN: Code duplicated, block: B:315:0x0b39  */
    /* JADX WARN: Code duplicated, block: B:337:0x08d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x08db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x08c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0b19 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x0b34 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0b32 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:? A[LOOP:7: B:307:0x0b1d->B:350:?, LOOP_END, SYNTHETIC] */
    public final Object invoke(Object obj) throws Throwable {
        mju mjuVar;
        ArrayList arrayList;
        rmc0 rmc0VarListIterator;
        rmc0 rmc0Var;
        ArrayList arrayList2;
        Iterator it;
        boolean zHasNext;
        b220 z120Var;
        Iterator it2;
        Object obj2;
        c220 c220Var;
        Object next;
        xwx0 xwx0Var;
        String str;
        int i;
        Map map;
        String str2;
        String str3;
        Iterator it3;
        xwx0 xwx0Var2;
        ArrayList arrayList3;
        mju mjuVar2;
        c220 c220Var2;
        String str4;
        ArrayList arrayList4;
        LinkedHashMap linkedHashMapB;
        Double d;
        Integer numValueOf;
        Double d2;
        Integer numValueOf2;
        Double d3;
        Integer numValueOf3;
        Double dA0;
        int iIntValue;
        int iU;
        int iIntValue2;
        int iDoubleValue;
        ArrayList arrayListE;
        String str5;
        Integer num;
        int iIntValue3;
        ArrayList arrayList5;
        Iterator it4;
        Integer num2;
        Object next2;
        w7h1 w7h1Var;
        byte b = this.a;
        int i2 = 2;
        int i3 = 0;
        Throwable th = null;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                lh0 lh0Var = (lh0) obj3;
                lh0Var.a = ((sh0) obj4).h((String) obj5, (o1p1) obj7, new th0((ven0) obj6, (byte) 0));
                return new rm(lh0Var, (byte) 1);
            case 1:
                Scheduler scheduler = (Scheduler) obj4;
                cas casVar = (a7m0) obj;
                casVar.d = new mw1(scheduler, (byte) 0);
                casVar.e = new mw1(scheduler, (byte) 1);
                dt1 dt1Var = (dt1) obj3;
                FlowEventSources.Companion companion = FlowEventSources.a;
                q8n q8nVar = dt1Var.h;
                mr20[] mr20VarArr = {new gk(new any(dt1Var.a.W0, (byte) 18), dt1Var, (byte) 11), dt1Var.c.i, dt1Var.d.i, dt1Var.e.j, dt1Var.f.e, dt1Var.g.b};
                companion.getClass();
                casVar.b = new b(q8nVar, mr20VarArr);
                so1 so1Var = (so1) obj5;
                casVar.a = new ab(so1Var, (byte) 25);
                casVar.a(im1.c1, new lw1((av1) obj7, so1Var, (tx4) obj6, (byte) 1));
                return rih1Var;
            case 2:
                return new hp0(((los) obj3).c(new db((i8h1) obj4, (String) obj5, (c2b0) obj7, (AtomicBoolean) obj6, (byte) 11)), (byte) 1);
            case 3:
                ven0 ven0Var = (ven0) obj6;
                sy5 sy5Var = new sy5((k6a1) obj4, ven0Var, (byte) 0);
                ven0 ven0Var2 = (ven0) obj7;
                nx2 nx2Var = new nx2((az20) obj5, ven0Var2, (byte) 17);
                los losVar = (los) obj3;
                return new ty5(losVar.b(new ve3(sy5Var, (byte) 14)), losVar.d(new xs3(ven0Var2, ven0Var, (byte) 1)), losVar.c(new cc2(sy5Var, nx2Var, (byte) 23)), sy5Var, nx2Var, (ven0) obj7);
            case 4:
                return new e96((l96) obj3, (ven0) obj6, (ven0) obj4, (ven0) obj5, (ven0) obj7, (byte) 0);
            case 5:
                String str6 = (String) obj;
                l96 l96Var = (l96) obj3;
                ((ven0) obj6).setValue(str6);
                upx0 upx0VarI = l96Var.g.i();
                ((axx0) obj4).getClass();
                r4o1.R(upx0VarI, axx0.b(str6), ((fa6) obj5).a.k, l96Var.a, (iu30) obj7);
                return rih1Var;
            case 6:
                xwx0 xwx0Var3 = (xwx0) obj;
                l96 l96Var2 = (l96) obj4;
                String str7 = xwx0Var3.a;
                int iC = l1d.C(xwx0Var3.c());
                if (iC == 0) {
                    smc0 smc0VarA = axx0.a((axx0) obj3, (String) ((ven0) obj6).getValue());
                    mjuVar = l96Var2.i;
                    arrayList = new ArrayList();
                    rmc0VarListIterator = smc0VarA.listIterator(0);
                    while (true) {
                        rmc0Var = rmc0VarListIterator;
                        if (rmc0Var.hasNext()) {
                            next2 = rmc0Var.next();
                            if (next2 instanceof wxx0) {
                                arrayList.add(next2);
                            }
                        } else {
                            arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                            it = arrayList.iterator();
                            while (true) {
                                zHasNext = it.hasNext();
                                z120Var = a220.a;
                                if (zHasNext) {
                                    xwx0Var = ((wxx0) it.next()).a;
                                    str = xwx0Var.c;
                                    if (xwx0Var.c() == i2 || !u890.j(xwx0Var.l, "artist")) {
                                        i = i3;
                                    } else {
                                        i = 1;
                                    }
                                    map = xwx0Var.t;
                                    str2 = xwx0Var.b;
                                    int i4 = i2;
                                    str3 = xwx0Var.a;
                                    if (i != 0) {
                                        arrayListE = rrn1.E(xwx0Var);
                                        str5 = xwx0Var.r;
                                        if (arrayListE.size() != 1) {
                                            str5 = null;
                                        }
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        num = xwx0Var.n;
                                        if (num != null) {
                                            iIntValue3 = num.intValue();
                                        } else {
                                            iIntValue3 = 1;
                                        }
                                        it3 = it;
                                        arrayList5 = new ArrayList(q7h.U(arrayListE, 10));
                                        it4 = arrayListE.iterator();
                                        while (it4.hasNext()) {
                                            arrayList5.add(new ll51((String) it4.next(), str5));
                                        }
                                        num2 = xwx0Var.o;
                                        if (num2 != null || num2.intValue() < iIntValue3) {
                                            num2 = null;
                                        }
                                        c220Var2 = new c220(str3, str2, new x120(iIntValue3, num2, (String) map.get("fixed-seed"), arrayList5));
                                    } else {
                                        it3 = it;
                                        if (xwx0Var.c() == 1) {
                                            d = xwx0Var.f;
                                            if (d != null) {
                                                numValueOf = Integer.valueOf((int) d.doubleValue());
                                            } else {
                                                numValueOf = null;
                                            }
                                            d2 = xwx0Var.g;
                                            if (d2 != null) {
                                                numValueOf2 = Integer.valueOf((int) d2.doubleValue());
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            d3 = xwx0Var.h;
                                            if (d3 != null) {
                                                iDoubleValue = (int) d3.doubleValue();
                                                numValueOf3 = Integer.valueOf(iDoubleValue);
                                                if (iDoubleValue <= 0) {
                                                    numValueOf3 = null;
                                                }
                                            } else {
                                                numValueOf3 = null;
                                            }
                                            if (numValueOf != null && numValueOf2 != null && numValueOf3 != null && numValueOf2.intValue() >= numValueOf.intValue()) {
                                                dA0 = nhc1.a0(str);
                                                if (dA0 != null) {
                                                    iIntValue = (int) dA0.doubleValue();
                                                } else {
                                                    iIntValue = numValueOf.intValue();
                                                }
                                                iU = jch0.U((yoi1.p(iIntValue, numValueOf.intValue(), numValueOf2.intValue()) - numValueOf.intValue()) / numValueOf3.intValue());
                                                iIntValue2 = (numValueOf2.intValue() - numValueOf.intValue()) / numValueOf3.intValue();
                                                if (iU > iIntValue2) {
                                                    iU = iIntValue2;
                                                }
                                                z120Var = new y120((numValueOf3.intValue() * iU) + numValueOf.intValue(), numValueOf.intValue(), numValueOf2.intValue(), numValueOf3.intValue(), xwx0Var.e, xwx0Var.d);
                                            }
                                            c220Var2 = new c220(str3, str2, z120Var);
                                        } else {
                                            if (xwx0Var.c() == 3) {
                                                xwx0Var2 = xwx0Var;
                                            } else {
                                                xwx0Var2 = null;
                                            }
                                            if (xwx0Var2 != null || (linkedHashMapB = xwx0Var2.b(mjuVar)) == null) {
                                                arrayList3 = null;
                                            } else {
                                                ArrayList arrayList6 = new ArrayList(linkedHashMapB.size());
                                                for (Iterator it5 = linkedHashMapB.entrySet().iterator(); it5.hasNext(); it5 = it5) {
                                                    Map.Entry entry = (Map.Entry) it5.next();
                                                    arrayList6.add(new fr51((String) entry.getKey(), (String) entry.getValue()));
                                                }
                                                arrayList3 = arrayList6;
                                            }
                                            if (arrayList3 != null || arrayList3.isEmpty()) {
                                                mjuVar2 = mjuVar;
                                            } else {
                                                String str8 = xwx0Var.i;
                                                String str9 = xwx0Var.j;
                                                String str10 = xwx0Var.f52p;
                                                String str11 = (String) map.get("format-multiple");
                                                if (str11 != null) {
                                                    str4 = str8;
                                                    LinkedHashMap linkedHashMapB2 = xwx0.a(xwx0Var, str11, null, 1048559).b(mjuVar);
                                                    if (linkedHashMapB2 != null) {
                                                        ArrayList arrayList7 = new ArrayList(linkedHashMapB2.size());
                                                        for (Map.Entry entry2 : linkedHashMapB2.entrySet()) {
                                                            arrayList7.add(new fr51((String) entry2.getKey(), (String) entry2.getValue()));
                                                            mjuVar = mjuVar;
                                                        }
                                                        mjuVar2 = mjuVar;
                                                        arrayList4 = arrayList7;
                                                    }
                                                    z120Var = new z120(str, str4, str9, str10, (String) map.get("max-label-multiple"), arrayList3, arrayList4);
                                                } else {
                                                    str4 = str8;
                                                }
                                                mjuVar2 = mjuVar;
                                                arrayList4 = null;
                                                z120Var = new z120(str, str4, str9, str10, (String) map.get("max-label-multiple"), arrayList3, arrayList4);
                                            }
                                            c220Var2 = new c220(str3, str2, z120Var);
                                        }
                                        arrayList2.add(c220Var2);
                                        it = it3;
                                        mjuVar = mjuVar2;
                                        i2 = i4;
                                        i3 = 0;
                                    }
                                    mjuVar2 = mjuVar;
                                    arrayList2.add(c220Var2);
                                    it = it3;
                                    mjuVar = mjuVar2;
                                    i2 = i4;
                                    i3 = 0;
                                } else {
                                    it2 = arrayList2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (u890.j(((c220) next).a, str7)) {
                                                obj2 = next;
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    c220Var = (c220) obj2;
                                    if (c220Var != null && !u890.j(c220Var.c, z120Var)) {
                                        ((ven0) obj7).setValue(str7);
                                        a1r0.j(l96Var2.l, "spotify:internal:magpie:field-editor", (String) null, mno1.h(new mmr0[]{new mmr0("fields", new ArrayList(arrayList2)), new mmr0("initialFieldName", str7)}), false, 10);
                                    }
                                }
                            }
                        }
                    }
                } else if (iC != 1) {
                    if (iC != 2) {
                        if (iC != 3 && iC != 4) {
                            eg.o();
                            return null;
                        }
                        ((iu30) obj5).invoke(new y76(xwx0Var3));
                    } else {
                        smc0 smc0VarA2 = axx0.a((axx0) obj3, (String) ((ven0) obj6).getValue());
                        mjuVar = l96Var2.i;
                        arrayList = new ArrayList();
                        rmc0VarListIterator = smc0VarA2.listIterator(0);
                        while (true) {
                            rmc0Var = rmc0VarListIterator;
                            if (rmc0Var.hasNext()) {
                                next2 = rmc0Var.next();
                                if (next2 instanceof wxx0) {
                                    arrayList.add(next2);
                                }
                            } else {
                                arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                                it = arrayList.iterator();
                                while (true) {
                                    zHasNext = it.hasNext();
                                    z120Var = a220.a;
                                    if (zHasNext) {
                                        xwx0Var = ((wxx0) it.next()).a;
                                        str = xwx0Var.c;
                                        if (xwx0Var.c() == i2) {
                                            i = i3;
                                        } else {
                                            i = i3;
                                        }
                                        map = xwx0Var.t;
                                        str2 = xwx0Var.b;
                                        int i5 = i2;
                                        str3 = xwx0Var.a;
                                        if (i != 0) {
                                            arrayListE = rrn1.E(xwx0Var);
                                            str5 = xwx0Var.r;
                                            if (arrayListE.size() != 1) {
                                                str5 = null;
                                            }
                                            if (str5 == null) {
                                                str5 = "";
                                            }
                                            num = xwx0Var.n;
                                            if (num != null) {
                                                iIntValue3 = num.intValue();
                                            } else {
                                                iIntValue3 = 1;
                                            }
                                            it3 = it;
                                            arrayList5 = new ArrayList(q7h.U(arrayListE, 10));
                                            it4 = arrayListE.iterator();
                                            while (it4.hasNext()) {
                                                arrayList5.add(new ll51((String) it4.next(), str5));
                                            }
                                            num2 = xwx0Var.o;
                                            if (num2 != null) {
                                                num2 = null;
                                            } else {
                                                num2 = null;
                                            }
                                            c220Var2 = new c220(str3, str2, new x120(iIntValue3, num2, (String) map.get("fixed-seed"), arrayList5));
                                        } else {
                                            it3 = it;
                                            if (xwx0Var.c() == 1) {
                                                d = xwx0Var.f;
                                                if (d != null) {
                                                    numValueOf = Integer.valueOf((int) d.doubleValue());
                                                } else {
                                                    numValueOf = null;
                                                }
                                                d2 = xwx0Var.g;
                                                if (d2 != null) {
                                                    numValueOf2 = Integer.valueOf((int) d2.doubleValue());
                                                } else {
                                                    numValueOf2 = null;
                                                }
                                                d3 = xwx0Var.h;
                                                if (d3 != null) {
                                                    iDoubleValue = (int) d3.doubleValue();
                                                    numValueOf3 = Integer.valueOf(iDoubleValue);
                                                    if (iDoubleValue <= 0) {
                                                        numValueOf3 = null;
                                                    }
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                if (numValueOf != null) {
                                                    dA0 = nhc1.a0(str);
                                                    if (dA0 != null) {
                                                        iIntValue = (int) dA0.doubleValue();
                                                    } else {
                                                        iIntValue = numValueOf.intValue();
                                                    }
                                                    iU = jch0.U((yoi1.p(iIntValue, numValueOf.intValue(), numValueOf2.intValue()) - numValueOf.intValue()) / numValueOf3.intValue());
                                                    iIntValue2 = (numValueOf2.intValue() - numValueOf.intValue()) / numValueOf3.intValue();
                                                    if (iU > iIntValue2) {
                                                        iU = iIntValue2;
                                                    }
                                                    z120Var = new y120((numValueOf3.intValue() * iU) + numValueOf.intValue(), numValueOf.intValue(), numValueOf2.intValue(), numValueOf3.intValue(), xwx0Var.e, xwx0Var.d);
                                                }
                                                c220Var2 = new c220(str3, str2, z120Var);
                                            } else {
                                                if (xwx0Var.c() == 3) {
                                                    xwx0Var2 = xwx0Var;
                                                } else {
                                                    xwx0Var2 = null;
                                                }
                                                if (xwx0Var2 != null) {
                                                    arrayList3 = null;
                                                } else {
                                                    arrayList3 = null;
                                                }
                                                if (arrayList3 != null) {
                                                    mjuVar2 = mjuVar;
                                                } else {
                                                    mjuVar2 = mjuVar;
                                                }
                                                c220Var2 = new c220(str3, str2, z120Var);
                                            }
                                            arrayList2.add(c220Var2);
                                            it = it3;
                                            mjuVar = mjuVar2;
                                            i2 = i5;
                                            i3 = 0;
                                        }
                                        mjuVar2 = mjuVar;
                                        arrayList2.add(c220Var2);
                                        it = it3;
                                        mjuVar = mjuVar2;
                                        i2 = i5;
                                        i3 = 0;
                                    } else {
                                        it2 = arrayList2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                next = it2.next();
                                                if (u890.j(((c220) next).a, str7)) {
                                                    obj2 = next;
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        c220Var = (c220) obj2;
                                        if (c220Var != null) {
                                            ((ven0) obj7).setValue(str7);
                                            a1r0.j(l96Var2.l, "spotify:internal:magpie:field-editor", (String) null, mno1.h(new mmr0[]{new mmr0("fields", new ArrayList(arrayList2)), new mmr0("initialFieldName", str7)}), false, 10);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (xwx0Var3.c() == 2 && u890.j(xwx0Var3.l, "artist")) {
                    smc0 smc0VarA3 = axx0.a((axx0) obj3, (String) ((ven0) obj6).getValue());
                    mjuVar = l96Var2.i;
                    arrayList = new ArrayList();
                    rmc0VarListIterator = smc0VarA3.listIterator(0);
                    while (true) {
                        rmc0Var = rmc0VarListIterator;
                        if (rmc0Var.hasNext()) {
                            next2 = rmc0Var.next();
                            if (next2 instanceof wxx0) {
                                arrayList.add(next2);
                            }
                        } else {
                            arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                            it = arrayList.iterator();
                            while (true) {
                                zHasNext = it.hasNext();
                                z120Var = a220.a;
                                if (zHasNext) {
                                    xwx0Var = ((wxx0) it.next()).a;
                                    str = xwx0Var.c;
                                    if (xwx0Var.c() == i2) {
                                        i = i3;
                                    } else {
                                        i = i3;
                                    }
                                    map = xwx0Var.t;
                                    str2 = xwx0Var.b;
                                    int i6 = i2;
                                    str3 = xwx0Var.a;
                                    if (i != 0) {
                                        arrayListE = rrn1.E(xwx0Var);
                                        str5 = xwx0Var.r;
                                        if (arrayListE.size() != 1) {
                                            str5 = null;
                                        }
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        num = xwx0Var.n;
                                        if (num != null) {
                                            iIntValue3 = num.intValue();
                                        } else {
                                            iIntValue3 = 1;
                                        }
                                        it3 = it;
                                        arrayList5 = new ArrayList(q7h.U(arrayListE, 10));
                                        it4 = arrayListE.iterator();
                                        while (it4.hasNext()) {
                                            arrayList5.add(new ll51((String) it4.next(), str5));
                                        }
                                        num2 = xwx0Var.o;
                                        if (num2 != null) {
                                            num2 = null;
                                        } else {
                                            num2 = null;
                                        }
                                        c220Var2 = new c220(str3, str2, new x120(iIntValue3, num2, (String) map.get("fixed-seed"), arrayList5));
                                    } else {
                                        it3 = it;
                                        if (xwx0Var.c() == 1) {
                                            d = xwx0Var.f;
                                            if (d != null) {
                                                numValueOf = Integer.valueOf((int) d.doubleValue());
                                            } else {
                                                numValueOf = null;
                                            }
                                            d2 = xwx0Var.g;
                                            if (d2 != null) {
                                                numValueOf2 = Integer.valueOf((int) d2.doubleValue());
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            d3 = xwx0Var.h;
                                            if (d3 != null) {
                                                iDoubleValue = (int) d3.doubleValue();
                                                numValueOf3 = Integer.valueOf(iDoubleValue);
                                                if (iDoubleValue <= 0) {
                                                    numValueOf3 = null;
                                                }
                                            } else {
                                                numValueOf3 = null;
                                            }
                                            if (numValueOf != null) {
                                                dA0 = nhc1.a0(str);
                                                if (dA0 != null) {
                                                    iIntValue = (int) dA0.doubleValue();
                                                } else {
                                                    iIntValue = numValueOf.intValue();
                                                }
                                                iU = jch0.U((yoi1.p(iIntValue, numValueOf.intValue(), numValueOf2.intValue()) - numValueOf.intValue()) / numValueOf3.intValue());
                                                iIntValue2 = (numValueOf2.intValue() - numValueOf.intValue()) / numValueOf3.intValue();
                                                if (iU > iIntValue2) {
                                                    iU = iIntValue2;
                                                }
                                                z120Var = new y120((numValueOf3.intValue() * iU) + numValueOf.intValue(), numValueOf.intValue(), numValueOf2.intValue(), numValueOf3.intValue(), xwx0Var.e, xwx0Var.d);
                                            }
                                            c220Var2 = new c220(str3, str2, z120Var);
                                        } else {
                                            if (xwx0Var.c() == 3) {
                                                xwx0Var2 = xwx0Var;
                                            } else {
                                                xwx0Var2 = null;
                                            }
                                            if (xwx0Var2 != null) {
                                                arrayList3 = null;
                                            } else {
                                                arrayList3 = null;
                                            }
                                            if (arrayList3 != null) {
                                                mjuVar2 = mjuVar;
                                            } else {
                                                mjuVar2 = mjuVar;
                                            }
                                            c220Var2 = new c220(str3, str2, z120Var);
                                        }
                                        arrayList2.add(c220Var2);
                                        it = it3;
                                        mjuVar = mjuVar2;
                                        i2 = i6;
                                        i3 = 0;
                                    }
                                    mjuVar2 = mjuVar;
                                    arrayList2.add(c220Var2);
                                    it = it3;
                                    mjuVar = mjuVar2;
                                    i2 = i6;
                                    i3 = 0;
                                } else {
                                    it2 = arrayList2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (u890.j(((c220) next).a, str7)) {
                                                obj2 = next;
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    c220Var = (c220) obj2;
                                    if (c220Var != null) {
                                        ((ven0) obj7).setValue(str7);
                                        a1r0.j(l96Var2.l, "spotify:internal:magpie:field-editor", (String) null, mno1.h(new mmr0[]{new mmr0("fields", new ArrayList(arrayList2)), new mmr0("initialFieldName", str7)}), false, 10);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    ((iu30) obj5).invoke(new y76(xwx0Var3));
                }
                return rih1Var;
            case 7:
                int iIntValue4 = ((Number) obj).intValue();
                ven0 ven0Var3 = (ven0) obj6;
                lf6 lf6Var = (lf6) obj4;
                dw91 dw91Var = (dw91) obj3;
                Object obj8 = dw91Var.get(Integer.valueOf(iIntValue4));
                Boolean bool = Boolean.TRUE;
                boolean zJ = u890.j(obj8, bool);
                tf6 tf6Var = tf6.a;
                tf6 tf6Var2 = tf6.b;
                tf6 tf6Var3 = zJ ? tf6Var2 : tf6Var;
                ue6 ue6Var = (ue6) lf6Var.f;
                m5d0 m5d0VarY = wgo1.y((se6) ue6Var.b.get(iIntValue4), iIntValue4, tf6Var3);
                ven0Var3.setValue((Object) null);
                if (m5d0VarY != null) {
                    xf6 xf6Var = (xf6) lf6Var.g;
                    String str12 = (String) lf6Var.h;
                    uf6 uf6Var = m5d0VarY.a;
                    int i7 = m5d0VarY.b;
                    String str13 = m5d0VarY.c;
                    tf6 tf6Var4 = m5d0VarY.d;
                    i8h1 i8h1Var = xf6Var.c;
                    y3m0 y3m0VarB = xf6Var.b(str12, uf6Var, i7, str13, tf6Var4);
                    b7x b7xVar = b7x.a;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y3m0VarB.b, y3m0VarB.c.b, System.currentTimeMillis()), (xj61) null);
                }
                int i8 = ue6Var.c;
                if (i8 != 0) {
                    ((qam1) obj7).a(i8);
                }
                dw91Var.put(Integer.valueOf(iIntValue4), Boolean.valueOf(!u890.j(dw91Var.get(Integer.valueOf(iIntValue4)), bool)));
                if (!lf6Var.d) {
                    boolean zJ2 = u890.j(dw91Var.get(Integer.valueOf(iIntValue4)), bool);
                    ((dw91) obj5).put(Integer.valueOf(iIntValue4), Boolean.valueOf(!zJ2));
                    ven0Var3.setValue(wgo1.y((se6) ue6Var.b.get(iIntValue4), iIntValue4, !zJ2 ? tf6Var : tf6Var2));
                }
                return rih1Var;
            case 8:
                vf6 vf6Var = (vf6) obj;
                ji6 ji6Var = (ji6) obj3;
                ven0 ven0Var4 = (ven0) obj6;
                if (((pd31) ven0Var4.getValue()) == pd31.a) {
                    ((ven0) obj7).setValue((Object) null);
                    xf6 xf6Var2 = (xf6) ji6Var.c;
                    wh6 wh6Var = (wh6) ji6Var.b;
                    opl0 opl0VarA = xf6Var2.a(wh6Var.l);
                    r6h1 r6h1Var = opl0VarA.b;
                    x6h1 x6h1VarC = opl0VarA.c.c();
                    x6h1VarC.i.add(new a7h1("card_pack", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    int i9 = vf6Var == null ? -1 : wf6.a[vf6Var.ordinal()];
                    b7x b7xVar2 = b7x.a;
                    if (i9 == -1) {
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_reveal", 1, b7xVar2), y6h1VarA, r6h1Var, System.currentTimeMillis());
                    } else if (i9 == 1) {
                        w7h1Var = new w7h1("", "", new z7h1("swipe", 1, b7xVar2), new x7h1("ui_reveal", 1, b7xVar2), y6h1VarA, r6h1Var, System.currentTimeMillis());
                    } else if (i9 == 2) {
                        w7h1Var = new w7h1("", "", new z7h1("swipe_left", 1, b7xVar2), new x7h1("ui_reveal", 1, b7xVar2), y6h1VarA, r6h1Var, System.currentTimeMillis());
                    } else {
                        if (i9 != 3) {
                            eg.o();
                            return null;
                        }
                        w7h1Var = new w7h1("", "", new z7h1("swipe_right", 1, b7xVar2), new x7h1("ui_reveal", 1, b7xVar2), y6h1VarA, r6h1Var, System.currentTimeMillis());
                    }
                    xf6Var2.c.m(w7h1Var, (xj61) null);
                    ys50 ys50Var = (ys50) obj4;
                    if (ys50Var != null) {
                        ys50Var.a((c9n) obj5);
                    }
                    ven0Var4.setValue(wh6Var.r ? pd31.b : pd31.c);
                }
                return rih1Var;
            case 9:
                qzh qzhVar = (qzh) obj3;
                dh7 dh7Var = (dh7) obj4;
                ArrayList arrayList8 = dh7Var.a;
                ArrayList<sm8> arrayList9 = dh7Var.b;
                ArrayList arrayList10 = new ArrayList(q7h.U(arrayList9, 10));
                for (sm8 sm8Var : arrayList9) {
                    arrayList10.add(new fh7(sm8Var.e, sm8Var.a, sm8Var.b, sm8Var.c, sm8Var.d));
                }
                qzhVar.f(new gh7(dh7Var.c, dh7Var.d, arrayList8, arrayList10));
                if (((Boolean) ((ven0) obj6).getValue()).booleanValue()) {
                    mgr mgrVar = (mgr) qzhVar;
                    mgrVar.f = true;
                    gh7 gh7Var = mgrVar.g;
                    if (gh7Var != null) {
                        mgrVar.a(gh7Var);
                    }
                } else {
                    mgr mgrVar2 = (mgr) qzhVar;
                    mgrVar2.f = false;
                    mgrVar2.e.a();
                    ((ViewPager2) mgrVar2.c.d).setCurrentItem(0);
                }
                ((mgr) qzhVar).n(new xg6((jh7) obj5, (o0i) obj7, (byte) 22));
                return rih1Var;
            case 10:
                li7 li7Var = (li7) obj;
                iu30 iu30Var = (iu30) obj3;
                if (iu30Var != null) {
                    iu30Var.invoke(li7Var);
                }
                xb10 xb10Var = (xb10) obj4;
                if (xb10Var != null) {
                    fn31.T((c9n) obj5, (o8n) null, 0, new el0(xb10Var, li7Var, (yqi1) obj7, (q8n) obj6, (lnm) null), 3);
                }
                return rih1Var;
            case 11:
                eg80 eg80Var = (eg80) obj;
                String string = ((y7e1) obj3).d().d.toString();
                md80 md80Var = md80.b;
                ((ven0) obj6).setValue(md80Var);
                ((iu30) obj4).invoke(new lg80((at80) obj5, md80Var, ihc1.y0(string) ? 5 : 1, eg80Var));
                ((iu30) obj7).invoke(new bdb(string));
                return rih1Var;
            case 12:
                c380 c380Var = (c380) obj3;
                ((kex) obj).b(c380Var.size(), new j2i(-1673449743, new jb1(c380Var, (azb) obj4, (ven0) obj6, (iu30) obj5, (j2i) obj7, (byte) 5), true), new s6(c380Var, (byte) 14));
                return rih1Var;
            case 13:
                String str14 = (String) obj5;
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
                Object tag = videoSurfaceView.getTag(2131427913);
                uoa uoaVarA = tag instanceof uoa ? (uoa) tag : null;
                if (uoaVarA == null) {
                    uoaVarA = woa.a((woa) obj3, "campfire-share-card-video-container", (o2u0) null, (w2k1) null, (kma) obj4, Collections.singletonList(new cv7((Function0) obj7, (byte) 3)), false, (bas) null, (sn10) null, 998);
                    uoaVarA.q(true);
                    uoaVarA.p(2);
                    uoaVarA.d(videoSurfaceView);
                }
                m0u0 m0u0VarE = uoaVarA.e();
                if (!u890.j(m0u0VarE != null ? m0u0VarE.a.a : null, str14)) {
                    uoaVarA.h(new o2u0(str14, 14, (Map) null), new oot0(0L, 0L, true, false, (hu7) null, (tne1) null, false, 243));
                }
                ((ven0) obj6).setValue(uoaVarA);
                videoSurfaceView.setTag(2131427913, uoaVarA);
                return rih1Var;
            case 14:
                jgh jghVarA = jgh.a(LayoutInflater.from((Context) obj).inflate(2131624426, (ViewGroup) null, false));
                ConstraintLayout constraintLayout = jghVarA.a;
                eqq.t(-1, -2, constraintLayout);
                xmh xmhVar = (xmh) obj3;
                ogh oghVarA = xmhVar.X.a(jghVarA, (cce) null, xmhVar.Y);
                Connection connectionL = oghVarA.L(new dfh((iu30) obj7, (byte) 1));
                ((ven0) obj6).setValue(oghVarA);
                xmhVar.R0 = oghVarA;
                ((ven0) obj4).setValue(connectionL);
                ((ven0) obj5).setValue(jghVarA);
                return constraintLayout;
            case 15:
                rtb0 rtb0Var = (rtb0) obj;
                pfl pflVar = (pfl) obj3;
                ArrayList arrayList11 = pflVar.c;
                rtb0Var.e(arrayList11.size(), new ry4(arrayList11, (byte) 8), new ry4(arrayList11, (byte) 9), new j2i(802480018, new zdl(arrayList11, (idl) obj4, (iu30) obj5, (iu30) obj7, (vu30) obj6, (byte) 0), true));
                ArrayList arrayList12 = pflVar.d;
                if (!arrayList12.isEmpty()) {
                    rtb0.c(rtb0Var, "connected-apps-header", cfi.a, 2);
                }
                rtb0Var.e(arrayList12.size(), new ry4(arrayList12, (byte) 10), new ry4(arrayList12, (byte) 11), new j2i(802480018, new zdl(arrayList12, (idl) obj4, (iu30) obj5, (iu30) obj7, (vu30) obj6, (byte) 1), true));
                return rih1Var;
            case 16:
                return new fsl((cir0) obj, (gsl) obj3, (d0r) obj4, (qim0) obj5, (qxl) obj7, (j2i) obj6, (byte) 0);
            case 17:
                rtb0 rtb0Var2 = (rtb0) obj;
                c380 c380Var2 = (c380) obj4;
                dvp dvpVar = (dvp) obj5;
                kko kkoVar = (kko) obj7;
                for (Object obj9 : (c380) obj3) {
                    int i10 = i3 + 1;
                    if (i3 < 0) {
                        Throwable th2 = th;
                        p7h.T();
                        throw th2;
                    }
                    pwm pwmVar = (pwm) obj9;
                    String str15 = pwmVar.a;
                    if (str15 != null) {
                        rtb0.c(rtb0Var2, f4i1.c(i3, "group_header_"), new j2i(1313988221, new kaf(str15, (byte) 21), true), 2);
                    }
                    ArrayList arrayList13 = pwmVar.b;
                    rtb0Var2.e(arrayList13.size(), new da((Object) new uv4(i3, (byte) 14), (Object) arrayList13, (byte) 16), new ry4(arrayList13, (byte) 13), new j2i(802480018, new rf1((byte) 8, dvpVar, kkoVar, arrayList13), true));
                    i3 = i10;
                    th = th;
                }
                if (!c380Var2.isEmpty()) {
                    rtb0.c(rtb0Var2, "sources_header", dhi.a, 2);
                    rtb0Var2.e(c380Var2.size(), new f1m(c380Var2, (byte) 14), new f1m(c380Var2, (byte) 15), new j2i(802480018, new sf1(c380Var2, (byte) 1), true));
                }
                rtb0.c(rtb0Var2, "report_error_button", new j2i(126051562, new mgl((xj1) obj6, (byte) 15), true), 2);
                return rih1Var;
            case 18:
                u2r u2rVar = (u2r) obj;
                hto htoVar = (hto) obj3;
                u2rVar.b(htoVar.b);
                u2rVar.b(htoVar.a);
                u2rVar.b(htoVar.o);
                u2rVar.b(htoVar.d.a(true));
                u2rVar.b(htoVar.e);
                u2rVar.b(htoVar.f);
                u2rVar.b(htoVar.h);
                n6r0 n6r0Var = (n6r0) obj4;
                u2rVar.b(htoVar.k.a(n6r0Var, true, true));
                u2rVar.b(htoVar.g.a((String) obj5, new pbg(htoVar, (lnm) null, (byte) 8)));
                u2rVar.b(htoVar.i.a("cwp"));
                u2rVar.b(htoVar.l);
                u2rVar.b(htoVar.m);
                u2rVar.b(htoVar.n);
                u2rVar.b(htoVar.f21p);
                u2rVar.b(htoVar.q);
                u2rVar.b(htoVar.r);
                u2rVar.b(htoVar.s);
                u2rVar.b(htoVar.t);
                u2rVar.b(htoVar.u);
                lql1 lql1Var = (lql1) obj7;
                u2rVar.b(lql1Var);
                u2rVar.b(htoVar.v.a(n6r0Var, (r3d0) null, lql1Var.b));
                u2rVar.e.add(htoVar.w);
                u2rVar.b(htoVar.x);
                ((iu30) obj6).invoke(u2rVar);
                return rih1Var;
            case 19:
                List list = (List) obj;
                return ((zu30) obj3).J(((l4r) obj4).e.invoke(list.get(0)), ((l4r) obj5).e.invoke(list.get(1)), ((l4r) obj7).e.invoke(list.get(2)), ((l4r) obj6).e.invoke(list.get(3)));
            case 20:
                iu30 iu30Var2 = (iu30) obj4;
                scr scrVar = new scr((rtb0) obj, (xtb0) obj3, (ven0) obj6, iu30Var2);
                ((iu30) obj5).invoke(scrVar);
                if (iu30Var2 != null) {
                    ((ven0) obj7).setValue(mqo1.F(scrVar.e));
                }
                return rih1Var;
            case 21:
                z98 z98Var = (z98) obj3;
                bhr bhrVar = (bhr) obj7;
                return ((gtk) obj).a(z98Var.a, z98Var, (lik1) obj4, (zf30) obj5, bhrVar.c, bhrVar.d, (d0r) obj6);
            case 22:
                fdc fdcVar = (fdc) obj3;
                dp5 dp5Var = (dp5) fdcVar.e;
                dg30 dg30Var = (dg30) fdcVar.c;
                String string2 = dg30Var.getString(2131954064);
                String string3 = dg30Var.getString(2131954063);
                String string4 = dg30Var.getString(2131954062);
                String string5 = dg30Var.getString(2131954061);
                vt1 vt1Var = new vt1(fdcVar, (String) obj5, (String) obj4, (ahh) obj7, (syf) obj6, (byte) 12);
                u6t u6tVar = u6t.c;
                mw40 mw40VarT = yoi1.T((dg30) dp5Var.b, string2, string3);
                wzk wzkVar = new wzk(vt1Var, (byte) 0);
                mw40VarT.a = string4;
                mw40VarT.c = wzkVar;
                wzk wzkVar2 = new wzk(u6tVar, (byte) 1);
                mw40VarT.b = string5;
                mw40VarT.d = wzkVar2;
                mw40VarT.b().b();
                return rih1Var;
            case 23:
                elb0 elb0Var = (elb0) obj;
                ((ven0) obj6).setValue(Float.valueOf(Float.intBitsToFloat((int) (elb0Var.O(0L) & 4294967295L))));
                bs51.d((ven0) obj3, (ss50) obj4, (xtb0) obj5, (ven0) obj7, new vy((int) (elb0Var.b() & 4294967295L)));
                return rih1Var;
            case 24:
                String str16 = (String) obj7;
                pbq pbqVar = (pbq) obj3;
                return ((qe4) pbqVar.d).a() ? f6o1.A(new xzq(((s1p) pbqVar.c).a(igu.a, (d0r) obj4), new kov(str16, (byte) 20)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : cso1.y(new jpg0(((d771) pbqVar.h).a(), new os((String) obj6, str16, (byte) 13)), d5p1.t(new m441(new rzu(pbqVar, (String) obj5, (lnm) null, (byte) 9)), cto1.q((iac0) pbqVar.f), ey71.a, Boolean.TRUE), yty.h);
            case 25:
                return a(obj);
            case 26:
                return d(obj);
            case 27:
                return e(obj);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return f(obj);
            default:
                o0i o0iVar = (o0i) obj6;
                p811 p811Var = (p811) obj5;
                abc0 abc0Var = (abc0) obj7;
                p811 p811Var2 = (p811) obj3;
                p811 p811Var3 = (p811) obj4;
                int iOrdinal = ((n1i) obj).ordinal();
                if (iOrdinal == 0) {
                    faa0 faa0Var = (faa0) p811Var.a;
                    if (faa0Var != null) {
                        faa0Var.d((CancellationException) null);
                    }
                    faa0 faa0Var2 = (faa0) p811Var3.a;
                    if (faa0Var2 != null) {
                        faa0Var2.d((CancellationException) null);
                    }
                    faa0 faa0Var3 = (faa0) p811Var2.a;
                    if (faa0Var3 != null) {
                        faa0Var3.d((CancellationException) null);
                    }
                    Function0 function0 = abc0Var.d;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else if (iOrdinal == 1) {
                    faa0 faa0Var4 = (faa0) p811Var2.a;
                    if (faa0Var4 != null) {
                        faa0Var4.d((CancellationException) null);
                    }
                    faa0 faa0Var5 = (faa0) p811Var3.a;
                    if (faa0Var5 != null) {
                        faa0Var5.d((CancellationException) null);
                    }
                    faa0 faa0Var6 = (faa0) p811Var.a;
                    if (faa0Var6 != null) {
                        faa0Var6.d((CancellationException) null);
                    }
                    vu30 vu30Var = abc0Var.a;
                    if (vu30Var != null) {
                        p811Var.a = fn31.T(o0iVar.a, (o8n) null, 0, new dt40(vu30Var, (lnm) null, (byte) 1), 3);
                    }
                } else if (iOrdinal == 2) {
                    faa0 faa0Var7 = (faa0) p811Var3.a;
                    if (faa0Var7 != null) {
                        faa0Var7.d((CancellationException) null);
                    }
                    vu30 vu30Var2 = abc0Var.b;
                    if (vu30Var2 != null) {
                        p811Var3.a = fn31.T(o0iVar.a, (o8n) null, 0, new dt40(vu30Var2, (lnm) null, (byte) 2), 3);
                    }
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    faa0 faa0Var8 = (faa0) p811Var2.a;
                    if (faa0Var8 != null) {
                        faa0Var8.d((CancellationException) null);
                    }
                    vu30 vu30Var3 = abc0Var.c;
                    if (vu30Var3 != null) {
                        p811Var2.a = fn31.T(o0iVar.a, (o8n) null, 0, new dt40(vu30Var3, (lnm) null, (byte) 3), 3);
                    }
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uh0(Object obj, Object obj2, Object obj3, ven0 ven0Var, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.f = ven0Var;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uh0(Object obj, Object obj2, ven0 ven0Var, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.f = ven0Var;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uh0(Object obj, ven0 ven0Var, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.f = ven0Var;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uh0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh0(fdc fdcVar, String str, String str2, ahh ahhVar, syf syfVar) {
        super(1);
        this.a = (byte) 22;
        this.b = fdcVar;
        this.d = str;
        this.c = str2;
        this.e = ahhVar;
        this.f = syfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh0(ven0 ven0Var, ven0 ven0Var2, ss50 ss50Var, xtb0 xtb0Var, ven0 ven0Var3) {
        super(1);
        this.a = (byte) 23;
        this.f = ven0Var;
        this.b = ven0Var2;
        this.c = ss50Var;
        this.d = xtb0Var;
        this.e = ven0Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh0(hwx0 hwx0Var, l96 l96Var, axx0 axx0Var, fa6 fa6Var, iu30 iu30Var, ven0 ven0Var) {
        super(1);
        this.a = (byte) 5;
        this.b = l96Var;
        this.c = axx0Var;
        this.d = fa6Var;
        this.e = iu30Var;
        this.f = ven0Var;
    }
}
