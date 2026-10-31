package p;

import android.graphics.Bitmap;
import com.spotify.corex.reading.proto.ReadSpan;
import com.spotify.player.model.ContextTrack;
import com.spotify.scrollsita.v1.Section;
import com.spotify.widgets.npvwidget.k;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k96 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k96(byte b, Object obj, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.d = str;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new k96(this.c, obj2, lnmVar, (byte) 0);
            case 1:
                return new k96(this.c, obj2, lnmVar, (byte) 1);
            case 2:
                k96 k96Var = new k96((vb6) obj2, lnmVar, (byte) 2);
                k96Var.c = obj;
                return k96Var;
            case 3:
                return new k96(this.c, obj2, lnmVar, (byte) 3);
            case 4:
                return new k96(this.c, obj2, lnmVar, (byte) 4);
            case 5:
                return new k96(this.c, obj2, lnmVar, (byte) 5);
            case 6:
                return new k96((byte) 6, this.c, (String) obj2, lnmVar);
            case 7:
                return new k96(this.c, obj2, lnmVar, (byte) 7);
            case 8:
                return new k96(this.c, obj2, lnmVar, (byte) 8);
            case 9:
                return new k96(this.c, obj2, lnmVar, (byte) 9);
            case 10:
                return new k96(this.c, obj2, lnmVar, (byte) 10);
            case 11:
                return new k96(this.c, obj2, lnmVar, (byte) 11);
            case 12:
                k96 k96Var2 = new k96((vv7) obj2, lnmVar, (byte) 12);
                k96Var2.c = obj;
                return k96Var2;
            case 13:
                return new k96(this.c, obj2, lnmVar, (byte) 13);
            case 14:
                return new k96(this.c, obj2, lnmVar, (byte) 14);
            case 15:
                return new k96((byte) 15, this.c, (String) obj2, lnmVar);
            case 16:
                return new k96(this.c, obj2, lnmVar, (byte) 16);
            case 17:
                return new k96((dj8) obj2, lnmVar, (byte) 17);
            case 18:
                return new k96(this.c, obj2, lnmVar, (byte) 18);
            case 19:
                return new k96(this.c, obj2, lnmVar, (byte) 19);
            case 20:
                k96 k96Var3 = new k96((va9) obj2, lnmVar, (byte) 20);
                k96Var3.c = obj;
                return k96Var3;
            case 21:
                return new k96(this.c, obj2, lnmVar, (byte) 21);
            case 22:
                return new k96(this.c, obj2, lnmVar, (byte) 22);
            case 23:
                k96 k96Var4 = new k96((rm9) obj2, lnmVar, (byte) 23);
                k96Var4.c = obj;
                return k96Var4;
            case 24:
                return new k96(this.c, obj2, lnmVar, (byte) 24);
            case 25:
                k96 k96Var5 = new k96((yu3) obj2, lnmVar, (byte) 25);
                k96Var5.c = obj;
                return k96Var5;
            case 26:
                return new k96(this.c, obj2, lnmVar, (byte) 26);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new k96(this.c, obj2, lnmVar, (byte) 27);
            case 28:
                k96 k96Var6 = new k96((k) obj2, lnmVar, (byte) 28);
                k96Var6.c = obj;
                return k96Var6;
            default:
                return new k96(this.c, obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((rih1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:270:0x050f  */
    /* JADX WARN: Code duplicated, block: B:273:0x052a A[LOOP:2: B:271:0x0524->B:273:0x052a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:306:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:308:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:311:0x0607  */
    /* JADX WARN: Code duplicated, block: B:315:0x0635  */
    /* JADX WARN: Code duplicated, block: B:318:0x063a  */
    /* JADX WARN: Code duplicated, block: B:319:0x0640  */
    /* JADX WARN: Code duplicated, block: B:322:0x0649  */
    /* JADX WARN: Code duplicated, block: B:323:0x064f  */
    /* JADX WARN: Code duplicated, block: B:326:0x0658  */
    /* JADX WARN: Code duplicated, block: B:327:0x065e  */
    /* JADX WARN: Code duplicated, block: B:330:0x0667  */
    /* JADX WARN: Code duplicated, block: B:331:0x066d  */
    /* JADX WARN: Code duplicated, block: B:334:0x0676  */
    /* JADX WARN: Code duplicated, block: B:429:0x062e A[SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        m231 m231Var;
        Object objJ;
        smr0 smr0VarA;
        List list;
        u7h u7hVarQ;
        c47 c47Var;
        rmr0 rmr0Var;
        c47 c47VarN;
        rmr0 rmr0VarB;
        c47 c47VarN2;
        rmr0 rmr0VarB2;
        c47 c47VarN3;
        rmr0 rmr0VarB3;
        c47 c47VarN4;
        long j;
        Iterator it;
        rmr0 rmr0Var2;
        Object objA;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object objB;
        Object objZ0;
        dj8 dj8Var;
        int i;
        Object objI;
        ou80 m231Var2;
        Object objB2;
        byte b = this.a;
        m231 m231Var3 = rih1.a;
        Object obj2 = this.d;
        Enum r9 = d9n.a;
        int i2 = 1;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return m231Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bs91 bs91Var = ((l96) this.c).r;
                if (bs91Var != null) {
                    this.b = true;
                    return bs91.c(bs91Var, (String) obj2, this, 14) == r9 ? r9 : m231Var3;
                }
                u890.C("snackbarHostState");
                throw null;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                zob1 zob1Var = (zob1) this.c;
                hb0 hb0Var = new hb0((vb6) obj2, (byte) 11);
                this.b = true;
                if (zob1Var.collect(hb0Var, this) == r9) {
                    return r9;
                }
                jah.d();
                return null;
            case 2:
                vb6 vb6Var = (vb6) obj2;
                c9n c9nVar = (c9n) this.c;
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        mr20 mr20Var = vb6Var.g;
                        f64 f64Var = new f64(vb6Var, c9nVar, (byte) 5);
                        this.c = null;
                        this.b = true;
                        if (mr20Var.collect(f64Var, this) == r9) {
                            return r9;
                        }
                    } else {
                        if (!z3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = m231Var3;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA instanceof CancellationException) {
                    return m231Var3;
                }
                vb6Var.Y.a();
                vb6Var.Z.a();
                if (thA == null) {
                    thA = new Exception("Failed to load page definition");
                }
                vb6Var.h(thA);
                return m231Var3;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                js6 js6Var = (js6) this.c;
                fm6 fm6Var = (fm6) obj2;
                this.b = true;
                lik1 lik1Var = fm6Var.b;
                String str = fm6Var.a;
                String str2 = fm6Var.c;
                Object objS = smo1.s(new ds6(js6Var, fm6Var.d, lik1Var, str2 == null ? str : str2, str, (lnm) null), this);
                return objS == r9 ? r9 : objS;
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    Object objB3 = ((js6) this.c).b((String) obj2, this);
                    return objB3 == r9 ? r9 : objB3;
                }
                if (z5) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.b = true;
                    return ((mw6) this.c).a((liu0) obj2, this) == r9 ? r9 : m231Var3;
                }
                if (z6) {
                    hm5.M(obj);
                    return m231Var3;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        if (str3.length() <= 0) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            ixg ixgVarF = ((m27) this.c).a.f(str3);
                            ixgVarF.p(64, 64, 1);
                            ixgVarF.g = false;
                            Single singleI = ixgVarF.i();
                            this.b = true;
                            objJ = fc11.j(singleI, this);
                            if (objJ == r9) {
                                return r9;
                            }
                            tfp0 tfp0Var = new tfp0((Bitmap) objJ);
                            ArrayList arrayList3 = (ArrayList) tfp0Var.e;
                            arrayList3.clear();
                            arrayList3.add(yqi1.b);
                            smr0VarA = tfp0Var.a();
                            list = smr0VarA.a;
                            if (!Collections.unmodifiableList(list).isEmpty()) {
                                u7hVarQ = ywo1.q(smr0VarA);
                                if (u7hVarQ != null) {
                                    j = u7hVarQ.a;
                                    it = Collections.unmodifiableList(list).iterator();
                                    do {
                                        if (it.hasNext()) {
                                            rmr0Var2 = (rmr0) it.next();
                                        } else {
                                            bhn0.t("Collection contains no element matching the predicate.");
                                        }
                                    } while (rmr0Var2.d != z4p1.G(j));
                                    int iG = z4p1.G(mue1.v(j));
                                    rmr0Var2.a();
                                    int i3 = rmr0Var2.g;
                                    rmr0Var2.a();
                                    c47Var = new c47(iG, i3, rmr0Var2.h);
                                } else {
                                    c47Var = null;
                                }
                                rmr0Var = smr0VarA.d;
                                if (rmr0Var != null) {
                                    c47VarN = ioo1.N(rmr0Var);
                                } else {
                                    c47VarN = null;
                                }
                                rmr0VarB = smr0VarA.b(grd1.e);
                                if (rmr0VarB != null) {
                                    c47VarN2 = ioo1.N(rmr0VarB);
                                } else {
                                    c47VarN2 = null;
                                }
                                rmr0VarB2 = smr0VarA.b(grd1.f);
                                if (rmr0VarB2 != null) {
                                    c47VarN3 = ioo1.N(rmr0VarB2);
                                } else {
                                    c47VarN3 = null;
                                }
                                rmr0VarB3 = smr0VarA.b(grd1.h);
                                if (rmr0VarB3 != null) {
                                    c47VarN4 = ioo1.N(rmr0VarB3);
                                } else {
                                    c47VarN4 = null;
                                }
                                rmr0 rmr0VarB4 = smr0VarA.b(grd1.i);
                                return new q37(c47Var, c47VarN, c47VarN2, c47VarN3, c47VarN4, rmr0VarB4 != null ? ioo1.N(rmr0VarB4) : null);
                            }
                        }
                    }
                } else if (z7) {
                    hm5.M(obj);
                    objJ = obj;
                    tfp0 tfp0Var2 = new tfp0((Bitmap) objJ);
                    ArrayList arrayList4 = (ArrayList) tfp0Var2.e;
                    arrayList4.clear();
                    arrayList4.add(yqi1.b);
                    smr0VarA = tfp0Var2.a();
                    list = smr0VarA.a;
                    if (!Collections.unmodifiableList(list).isEmpty()) {
                        u7hVarQ = ywo1.q(smr0VarA);
                        if (u7hVarQ != null) {
                            j = u7hVarQ.a;
                            it = Collections.unmodifiableList(list).iterator();
                            do {
                                if (it.hasNext()) {
                                    rmr0Var2 = (rmr0) it.next();
                                } else {
                                    bhn0.t("Collection contains no element matching the predicate.");
                                }
                            } while (rmr0Var2.d != z4p1.G(j));
                            int iG2 = z4p1.G(mue1.v(j));
                            rmr0Var2.a();
                            int i4 = rmr0Var2.g;
                            rmr0Var2.a();
                            c47Var = new c47(iG2, i4, rmr0Var2.h);
                        } else {
                            c47Var = null;
                        }
                        rmr0Var = smr0VarA.d;
                        if (rmr0Var != null) {
                            c47VarN = ioo1.N(rmr0Var);
                        } else {
                            c47VarN = null;
                        }
                        rmr0VarB = smr0VarA.b(grd1.e);
                        if (rmr0VarB != null) {
                            c47VarN2 = ioo1.N(rmr0VarB);
                        } else {
                            c47VarN2 = null;
                        }
                        rmr0VarB2 = smr0VarA.b(grd1.f);
                        if (rmr0VarB2 != null) {
                            c47VarN3 = ioo1.N(rmr0VarB2);
                        } else {
                            c47VarN3 = null;
                        }
                        rmr0VarB3 = smr0VarA.b(grd1.h);
                        if (rmr0VarB3 != null) {
                            c47VarN4 = ioo1.N(rmr0VarB3);
                        } else {
                            c47VarN4 = null;
                        }
                        rmr0 rmr0VarB5 = smr0VarA.b(grd1.i);
                        return new q37(c47Var, c47VarN, c47VarN2, c47VarN3, c47VarN4, rmr0VarB5 != null ? ioo1.N(rmr0VarB5) : null);
                    }
                } else {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 7:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    m441 m441VarQ = rwq.q(new uk1((kbf0) this.c, (byte) 1));
                    o37 o37Var = new o37(2, (lnm) null, (byte) 0);
                    this.b = true;
                    if (b5p1.j(m441VarQ, o37Var, this) == r9) {
                        return r9;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((ven0) obj2).setValue(Boolean.TRUE);
                return m231Var3;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                    ArrayList<w67> arrayList5 = ((y67) objA).a;
                    arrayList = new ArrayList(q7h.U(arrayList5, 10));
                    for (w67 w67Var : arrayList5) {
                        ArrayList<x67> arrayList6 = w67Var.b;
                        arrayList2 = new ArrayList(q7h.U(arrayList6, 10));
                        for (x67 x67Var : arrayList6) {
                            arrayList2.add(new y2y0(x67Var.a, x67Var.b));
                        }
                        arrayList.add(new x2y0(arrayList2, w67Var.a));
                    }
                    return arrayList;
                }
                hm5.M(obj);
                chr0 chr0Var = (chr0) obj2;
                Object obj3 = ((n67) this.c).a.get(chr0Var);
                if (obj3 == null) {
                    jah.h("No AssistanceDataConfig registered for ", chr0Var, ". Did you include the matching config module in the assistance page entry?");
                    return null;
                }
                this.b = true;
                objA = ((o9b) obj3).a(this);
                if (objA == r9) {
                    return r9;
                }
                ArrayList<w67> arrayList7 = ((y67) objA).a;
                arrayList = new ArrayList(q7h.U(arrayList7, 10));
                while (r0.hasNext()) {
                    ArrayList<x67> arrayList8 = w67Var.b;
                    arrayList2 = new ArrayList(q7h.U(arrayList8, 10));
                    while (r3.hasNext()) {
                        arrayList2.add(new y2y0(x67Var.a, x67Var.b));
                    }
                    arrayList.add(new x2y0(arrayList2, w67Var.a));
                }
                return arrayList;
            case 9:
                s67 s67Var = (s67) this.c;
                boolean z10 = this.b;
                try {
                    if (z10) {
                        if (!z10) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        throw new KotlinNothingValueException();
                    }
                    hm5.M(obj);
                    ay8 ay8VarF = d3p1.F(s67Var.d, (o3r) obj2, m231Var3);
                    hb0 hb0Var2 = new hb0(s67Var, (byte) 14);
                    this.b = true;
                    ay8VarF.collect(hb0Var2, this);
                    return r9;
                } catch (Throwable th2) {
                    s67Var.h(th2);
                    return m231Var3;
                }
            case 10:
                tob1 tob1Var = (tob1) this.c;
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return m231Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                float f = ((qkw0) tob1Var.getValue()).a;
                pxg1 pxg1VarO0 = irn1.o0(((qkw0) tob1Var.getValue()).b, 0, mlv.d, 2);
                lb7 lb7Var = new lb7((drr0) obj2, (byte) 0);
                this.b = true;
                return wwo1.t(f, 1.0f, pxg1VarO0, lb7Var, this, 4) == r9 ? r9 : m231Var3;
            case 11:
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA2 = ((ai7) this.c).e.a((a930) obj2, this);
                    return objA2 == r9 ? r9 : objA2;
                }
                if (z12) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                String str4 = (String) this.c;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return m231Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dc31 dc31Var = ((vv7) obj2).e;
                this.c = null;
                this.b = true;
                return dc31Var.m(str4, this) == r9 ? r9 : m231Var3;
            case 13:
                boolean z14 = this.b;
                if (z14) {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                sen0 sen0Var = (sen0) this.c;
                k96 k96Var = new k96((vv7) obj2, lnmVar, (byte) 12);
                this.b = true;
                if (l4p1.q(sen0Var, k96Var, this) == r9) {
                    return r9;
                }
                eg.m("SharedFlow never completes, this call should never return.");
                return null;
            case 14:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return m231Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441Var = (m441) this.c;
                cu cuVar = new cu((ssw0) obj2, (byte) 1);
                this.b = true;
                return m441Var.collect(cuVar, this) == r9 ? r9 : m231Var3;
            case 15:
                boolean z16 = this.b;
                try {
                    if (!z16) {
                        hm5.M(obj);
                        Set set = s4b1.f;
                        String strJ = uic.x((String) obj2).j();
                        if (strJ == null) {
                            strJ = "";
                        }
                        ka8 ka8Var = (ka8) ((em3) this.c).b;
                        Long l = new Long(0L);
                        this.b = true;
                        objB = ka8Var.b(strJ, l, this);
                        if (objB == r9) {
                            return r9;
                        }
                    } else {
                        if (!z16) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objB = obj;
                    }
                    ReadSpan readSpan = (ReadSpan) ((sy21) objB).b;
                    if (readSpan == null) {
                        return "";
                    }
                    h290 h290VarP = readSpan.p();
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj4 : h290VarP) {
                        if (((com.spotify.corex.reading.proto.Section) obj4).n() == 1) {
                            arrayList9.add(obj4);
                        }
                    }
                    return ihc1.c1(200, o7h.y0(arrayList9, " ", (String) null, (String) null, da8.a, 30));
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                }
                break;
            case 16:
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    this.b = true;
                    return ((xg8) this.c).f((x020) obj2, this) == r9 ? r9 : m231Var3;
                }
                if (z17) {
                    hm5.M(obj);
                    return m231Var3;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                dj8 dj8Var2 = (dj8) obj2;
                CompositeDisposable compositeDisposable = dj8Var2.T1;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    this.c = dj8Var2;
                    this.b = true;
                    objZ0 = dj8Var2.Z0(this);
                    if (objZ0 == r9) {
                        return r9;
                    }
                    dj8Var = dj8Var2;
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dj8 dj8Var3 = (dj8) this.c;
                    hm5.M(obj);
                    dj8Var = dj8Var3;
                    objZ0 = obj;
                }
                ahv0 ahv0Var = (ahv0) objZ0;
                if (ahv0Var != null && (i = ahv0Var.a) != 0) {
                    i2 = i;
                }
                dj8Var.Z1 = i2;
                q5o q5oVar = dj8Var2.P1;
                if (q5oVar == null) {
                    u890.C("credentialsStore");
                    throw null;
                }
                dt71 dt71Var = q5oVar.f;
                o6x o6xVar = o6x.a;
                compositeDisposable.b(yoi1.i(dt71Var, o6xVar).subscribe(new tg(dj8Var2, (byte) 23)));
                n5o parcelable = dj8Var2.O0().getParcelable("credentialManagerCredentials");
                boolean zJ = u890.j(dj8Var2.O0().getString("authSource"), "CREDENTIAL_MANAGER");
                if (zJ && parcelable == null) {
                    dj8Var2.Y0();
                    return m231Var3;
                }
                q5o q5oVar2 = dj8Var2.P1;
                if (q5oVar2 == null) {
                    u890.C("credentialsStore");
                    throw null;
                }
                compositeDisposable.b(yoi1.i(q5oVar2.g, o6xVar).subscribe(new bj8(zJ, parcelable, dj8Var2, (byte) 0)));
                q5o q5oVar3 = dj8Var2.P1;
                if (q5oVar3 != null) {
                    fn31.T(q5oVar3.e, (o8n) null, 0, new wt(q5oVar3, (lnm) null, (byte) 27), 3);
                    return m231Var3;
                }
                u890.C("credentialsStore");
                throw null;
            case 18:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    tzr0 tzr0Var = ((km8) this.c).a;
                    zwe0 zwe0Var = (zwe0) obj2;
                    j4s0 j4s0Var = zwe0Var.a;
                    byte[] bArr = zwe0Var.b.c;
                    this.b = true;
                    objI = tzr0Var.i(j4s0Var, bArr, this);
                    if (objI == r9) {
                        return r9;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = ((e331) obj).a;
                }
                return new e331(objI);
            case 19:
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return m231Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ivy0 ivy0Var = (ivy0) ((em0) this.c).i;
                woa1 woa1Var = ((le20) obj2).c;
                lnmVar = woa1Var != null ? woa1Var.a : null;
                this.b = true;
                return ivy0Var.invoke(lnmVar, this) == r9 ? r9 : m231Var3;
            case 20:
                ssw0 ssw0Var = (ssw0) this.c;
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return m231Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xab1 xab1VarT = fn31.T(ssw0Var, (o8n) null, 0, new ta9(ssw0Var, null, (byte) 0), 3);
                ve01 ve01Var = ((va9) obj2).e.b;
                sa9 sa9Var = new sa9(xab1VarT, ssw0Var, (byte) 0);
                this.c = null;
                this.b = true;
                Object objCollect = ve01Var.a.collect(new o010(sa9Var, (byte) 25), this);
                if (objCollect != r9) {
                    objCollect = m231Var3;
                }
                return objCollect == r9 ? r9 : m231Var3;
            case 21:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    this.b = true;
                    return ((wh9) this.c).e.emit((rh9) obj2, this) == r9 ? r9 : m231Var3;
                }
                if (z22) {
                    hm5.M(obj);
                    return m231Var3;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return m231Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(((ar9) this.c).b);
                mp0 mp0Var = new mp0((ven0) obj2, (byte) 2);
                this.b = true;
                return mr20VarU.collect(mp0Var, this) == r9 ? r9 : m231Var3;
            case 23:
                vr20 vr20Var = (vr20) this.c;
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return m231Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Set setA0 = dm61.A0(((rm9) obj2).a.h);
                this.c = null;
                this.b = true;
                return vr20Var.emit(setA0, this) == r9 ? r9 : m231Var3;
            case 24:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ix7 ix7Var = (ix7) ((yu3) this.c).d;
                ContextTrack contextTrack = ((xp9) obj2).a;
                this.b = true;
                Enum enumF = ix7Var.F(contextTrack, true, this);
                return enumF == r9 ? r9 : enumF;
            case 25:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return m231Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p811 p811VarU = cy30.u(obj);
                p811 p811Var = new p811();
                l811 l811Var = new l811();
                l811Var.a = true;
                mr20 mr20Var2 = (mr20) ((yu3) obj2).b;
                u60 u60Var = new u60(l811Var, p811VarU, p811Var, vr20Var2, (byte) 8);
                this.c = null;
                this.b = true;
                return mr20Var2.collect(u60Var, this) == r9 ? r9 : m231Var3;
            case 26:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qns0 qns0Var = (qns0) ((ix7) this.c).b;
                List listSingletonList = Collections.singletonList(((ContextTrack) obj2).uri());
                this.b = true;
                Object objA3 = qns0Var.a("byom_reactive_guard", listSingletonList, this, true);
                return objA3 == r9 ? r9 : objA3;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return m231Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarG = yoi1.g(((zs9) this.c).b.f);
                hb0 hb0Var3 = new hb0((q01) obj2, (byte) 21);
                this.b = true;
                return ezcVarG.collect(hb0Var3, this) == r9 ? r9 : m231Var3;
            case 28:
                boolean z29 = this.b;
                try {
                    if (!z29) {
                        hm5.M(obj);
                        y210 y210Var = ((k) obj2).d;
                        this.c = null;
                        this.b = true;
                        objB2 = y210Var.b(this);
                        if (objB2 == r9) {
                            return r9;
                        }
                    } else {
                        if (!z29) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objB2 = obj;
                    }
                    m231Var2 = (ou80) objB2;
                    break;
                } catch (Throwable th3) {
                    m231Var2 = new m231(th3);
                }
                return new e331(m231Var2);
            default:
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return m231Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                y6a y6aVar = (y6a) this.c;
                j6w0 j6w0Var = (j6w0) obj2;
                z7a z7aVar = j6w0Var.a;
                d3j0 d3j0Var = j6w0Var.b.b;
                this.b = true;
                return y6aVar.a(z7aVar, d3j0Var, this) == r9 ? r9 : m231Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k96(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k96(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
