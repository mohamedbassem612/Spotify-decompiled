package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.proto.SyncRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import spotify.playlist.esperanto.proto.PlaylistClearTokenRequest;
import spotify.playlist.esperanto.proto.PlaylistClearTokenResponse;
import spotify.playlist.esperanto.proto.PlaylistGetRequest;
import spotify.playlist.esperanto.proto.PlaylistGetResponse;
import spotify.playlist.esperanto.proto.PlaylistResyncResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ss90 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss90(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public static final void e(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, ssw0 ssw0Var, vnc0 vnc0Var, Object obj, l811 l811Var, LinkedHashSet linkedHashSet, Set set) {
        LinkedHashSet linkedHashSet2;
        Set setP1;
        Set set2;
        synchronized (obj) {
            try {
                if (set == null) {
                    l811Var.a = true;
                    linkedHashSet2 = linkedHashSet;
                } else {
                    linkedHashSet2 = linkedHashSet;
                    linkedHashSet2.addAll(set);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!atomicBoolean.compareAndSet(false, true)) {
            atomicBoolean2.set(true);
            return;
        }
        atomicBoolean2.set(false);
        synchronized (obj) {
            try {
                if (l811Var.a) {
                    l811Var.a = false;
                    linkedHashSet2.clear();
                    setP1 = null;
                } else {
                    setP1 = o7h.p1(linkedHashSet2);
                    linkedHashSet2.clear();
                }
                set2 = setP1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0r d0rVar = vnc0Var.a;
        kx70 kx70Var = new kx70(atomicBoolean, atomicBoolean2, ssw0Var, vnc0Var, obj, l811Var, linkedHashSet2, (byte) 1);
        mmr0 mmr0VarB = zz81.b(d0rVar);
        if (ssw0Var.l(new rz81((ioj0) mmr0VarB.a, (d0r) mmr0VarB.b, set2, kx70Var)) instanceof pge) {
            atomicBoolean2.set(false);
            atomicBoolean.set(false);
        }
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ss90 ss90Var = new ss90((ts90) obj2, lnmVar, (byte) 0);
                ss90Var.c = obj;
                return ss90Var;
            case 1:
                return new ss90((o95) this.c, (Function0) obj2, lnmVar, (byte) 1);
            case 2:
                ss90 ss90Var2 = new ss90((yxb0) obj2, lnmVar, (byte) 2);
                ss90Var2.c = obj;
                return ss90Var2;
            case 3:
                return new ss90((bs91) this.c, (ven0) obj2, lnmVar, (byte) 3);
            case 4:
                return new ss90((mta0) this.c, (iu30) obj2, lnmVar, (byte) 4);
            case 5:
                ss90 ss90Var3 = new ss90((haa0) obj2, lnmVar, (byte) 5);
                ss90Var3.c = obj;
                return ss90Var3;
            case 6:
                return new ss90((w5b0) this.c, (ayh) obj2, lnmVar, (byte) 6);
            case 7:
                ss90 ss90Var4 = new ss90((ArrayList) obj2, lnmVar, (byte) 7);
                ss90Var4.c = obj;
                return ss90Var4;
            case 8:
                ss90 ss90Var5 = new ss90((ffb0) obj2, lnmVar, (byte) 8);
                ss90Var5.c = obj;
                return ss90Var5;
            case 9:
                return new ss90((nib0) this.c, (r091) obj2, lnmVar, (byte) 9);
            case 10:
                return new ss90((nav0) this.c, (jkr0) obj2, lnmVar, (byte) 10);
            case 11:
                return new ss90((myb0) this.c, (String) obj2, lnmVar, (byte) 11);
            case 12:
                return new ss90((myb0) this.c, (vpu0) obj2, lnmVar, (byte) 12);
            case 13:
                return new ss90((vzb0) this.c, (bh) obj2, lnmVar, (byte) 13);
            case 14:
                ss90 ss90Var6 = new ss90((xzb0) obj2, lnmVar, (byte) 14);
                ss90Var6.c = obj;
                return ss90Var6;
            case 15:
                return new ss90((h0c0) this.c, (iu30) obj2, lnmVar, (byte) 15);
            case 16:
                return new ss90((i1c0) this.c, (iu30) obj2, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new ss90((m7c0) this.c, (b7c0) obj2, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ss90 ss90Var7 = new ss90((x8c0) obj2, lnmVar, (byte) 18);
                ss90Var7.c = obj;
                return ss90Var7;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new ss90((mr20) this.c, (uh0) obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new ss90((lcc0) this.c, (List) obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ss90 ss90Var8 = new ss90((zdc0) obj2, lnmVar, (byte) 21);
                ss90Var8.c = obj;
                return ss90Var8;
            case 22:
                return new ss90((aec0) obj2, lnmVar, (byte) 22);
            case 23:
                ss90 ss90Var9 = new ss90((vnc0) obj2, lnmVar, (byte) 23);
                ss90Var9.c = obj;
                return ss90Var9;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new ss90((rsc0) this.c, (rxc0) obj2, lnmVar, (byte) 24);
            case 25:
                return new ss90((hwc0) this.c, (r9c) obj2, lnmVar, (byte) 25);
            case 26:
                return new ss90((d0r) this.c, (wsc0) obj2, lnmVar, (byte) 26);
            case 27:
                return new ss90((xyc0) this.c, (String) obj2, lnmVar, (byte) 27);
            case 28:
                return new ss90((xyc0) this.c, (List) obj2, lnmVar, (byte) 28);
            default:
                return new ss90((mzc0) this.c, (String) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 5:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 14:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object objU;
        Object objI;
        Object objC;
        aec0 aec0Var;
        Object objQ;
        Object objG;
        Object objI0;
        boolean z = false;
        byte b = 1;
        switch (this.a) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                d9n d9nVar = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    Boolean boolValueOf = Boolean.valueOf(((ts90) this.d).b.a());
                    this.c = null;
                    this.b = true;
                    if (vr20Var.emit(boolValueOf, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 1:
                d9n d9nVar2 = d9n.a;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    o95 o95Var = (o95) this.c;
                    Float f = new Float(1.0f);
                    pxg1 pxg1VarO0 = irn1.o0(1050, 0, mlv.d, 2);
                    this.b = true;
                    if (o95.b(o95Var, f, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((Function0) this.d).invoke();
                return rih1.a;
            case 2:
                vr20 vr20Var2 = (vr20) this.c;
                d9n d9nVar3 = d9n.a;
                boolean z4 = this.b;
                if (!z4) {
                    af0 af0Var = new af0(this.d, (Object) cy30.u(obj), (Object) vr20Var2, (lnm) null, (byte) 13);
                    this.c = null;
                    this.b = true;
                    if (smo1.s(af0Var, this) == d9nVar3) {
                        return d9nVar3;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 3:
                bs91 bs91Var = (bs91) this.c;
                d9n d9nVar4 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    wr91 wr91VarA = bs91Var.a();
                    if (wr91VarA != null) {
                        wr91VarA.a();
                    }
                    String str = (String) ((ven0) this.d).getValue();
                    this.b = true;
                    if (bs91.c(bs91Var, str, this, 14) == d9nVar4) {
                        return d9nVar4;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 4:
                d9n d9nVar5 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    xe01 xe01Var = ((mta0) this.c).b.Z;
                    qv7 qv7Var = new qv7((iu30) this.d, (byte) 19);
                    this.b = true;
                    if (xe01Var.a.collect(qv7Var, this) == d9nVar5) {
                        return d9nVar5;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                jah.d();
                return null;
            case 5:
                vr20 vr20Var3 = (vr20) this.c;
                d9n d9nVar6 = d9n.a;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    haa0 haa0Var = (haa0) this.d;
                    ay8 ay8VarF = d3p1.F((d0r) haa0Var.b, cr11.a, (String) haa0Var.c);
                    this.c = null;
                    this.b = true;
                    if (l4p1.s(vr20Var3, ay8VarF, this) == d9nVar6) {
                        return d9nVar6;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 6:
                ayh ayhVar = (ayh) this.d;
                d9n d9nVar7 = d9n.a;
                boolean z8 = this.b;
                try {
                    if (z8) {
                        if (!z8) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        throw new KotlinNothingValueException();
                    }
                    hm5.M(obj);
                    w5b0 w5b0Var = (w5b0) this.c;
                    int iA = w5b0Var.c.a();
                    this.b = true;
                    w5b0Var.i(iA, ayhVar, this);
                    return d9nVar7;
                } catch (Throwable th) {
                    ayhVar.m0(rih1.a);
                    throw th;
                }
            case 7:
                c9n c9nVar = (c9n) this.c;
                d9n d9nVar8 = d9n.a;
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(fn31.q(c9nVar, (o8n) null, 0, new no70((c0r) it.next(), (lnm) null, (byte) 19), 3));
                }
                this.c = null;
                this.b = true;
                Object objU2 = o1p1.u(arrayList2, this);
                return objU2 == d9nVar8 ? d9nVar8 : objU2;
            case 8:
                vr20 vr20Var4 = (vr20) this.c;
                d9n d9nVar9 = d9n.a;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    ffb0 ffb0Var = (ffb0) this.d;
                    gh4 gh4Var = ffb0Var.b;
                    if (gh4Var.g() && ffb0Var.a.h(gfb0.b(), gh4Var.f())) {
                        z = true;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    this.c = null;
                    this.b = true;
                    if (vr20Var4.emit(boolValueOf2, this) == d9nVar9) {
                        return d9nVar9;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 9:
                d9n d9nVar10 = d9n.a;
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return rih1.a;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                nib0 nib0Var = (nib0) this.c;
                r091 r091Var = (r091) this.d;
                this.b = true;
                nib0Var.b(r091Var, this);
                return d9nVar10;
            case 10:
                d9n d9nVar11 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    nav0 nav0Var = (nav0) this.c;
                    lhg lhgVar = new lhg((jkr0) this.d, (lnm) null, (byte) 2);
                    this.b = true;
                    if (s9p1.D(nav0Var, lhgVar, this) == d9nVar11) {
                        return d9nVar11;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 11:
                d9n d9nVar12 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    xyc0 xyc0Var = ((myb0) this.c).f;
                    String str2 = (String) this.d;
                    ddd1 ddd1Var = ddd1.a1;
                    this.b = true;
                    objU = xyc0Var.u(str2, ddd1Var, this);
                    if (objU == d9nVar12) {
                        return d9nVar12;
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objU = obj;
                }
                ((py21) objU).d();
                return rih1.a;
            case 12:
                d9n d9nVar13 = d9n.a;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    myb0 myb0Var = (myb0) this.c;
                    vpu0 vpu0Var = (vpu0) this.d;
                    this.b = true;
                    if (myb0Var.i(vpu0Var, this) == d9nVar13) {
                        return d9nVar13;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 13:
                d9n d9nVar14 = d9n.a;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vzb0 vzb0Var = (vzb0) this.c;
                bh bhVar = (bh) this.d;
                this.b = true;
                udt0.a(vzb0Var, bhVar, this);
                return d9nVar14;
            case 14:
                vr20 vr20Var5 = (vr20) this.c;
                d9n d9nVar15 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    Boolean boolValueOf3 = Boolean.valueOf(((xzb0) this.d).a.h(xzb0.b, true));
                    this.c = null;
                    this.b = true;
                    if (vr20Var5.emit(boolValueOf3, this) == d9nVar15) {
                        return d9nVar15;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 15:
                rih1 rih1Var = rih1.a;
                h0c0 h0c0Var = (h0c0) this.c;
                d9n d9nVar16 = d9n.a;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    mr20 status = h0c0Var.c.getStatus();
                    mr20 mr20Var = h0c0Var.b;
                    xx0 xx0Var = new xx0(3, (lnm) null, (byte) 12);
                    qv7 qv7Var2 = new qv7((iu30) this.d, (byte) 20);
                    this.b = true;
                    Object objS = fc11.s(vrl.c, this, qv7Var2, new ekv(xx0Var, (lnm) null), new mr20[]{status, mr20Var});
                    if (objS != d9nVar16) {
                        objS = rih1Var;
                    }
                    if (objS == d9nVar16) {
                        return d9nVar16;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 16:
                d9n d9nVar17 = d9n.a;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var = ((i1c0) this.c).f.h;
                qv7 qv7Var3 = new qv7((iu30) this.d, (byte) 21);
                this.b = true;
                bpb1Var.collect(qv7Var3, this);
                return d9nVar17;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                d9n d9nVar18 = d9n.a;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    zo51 zo51VarB = ((m7c0) this.c).b.b();
                    this.b = true;
                    objI = b5p1.i(zo51VarB, this);
                    if (objI == d9nVar18) {
                        return d9nVar18;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                hma1 hma1VarEdit = ((dma1) objI).edit();
                j7c0.a.getClass();
                hma1VarEdit.d(i7c0.b, ((b7c0) this.d).name());
                hma1VarEdit.h();
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                x8c0 x8c0Var = (x8c0) this.d;
                d9n d9nVar19 = d9n.a;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    ssw0 ssw0Var = (ssw0) this.c;
                    uzs uzsVar = new uzs(ssw0Var, (byte) 1);
                    x8c0Var.a(uzsVar);
                    qga0 qga0Var = new qga0(x8c0Var, uzsVar, (byte) 6);
                    this.b = true;
                    if (jch0.s(ssw0Var, qga0Var, this) == d9nVar19) {
                        return d9nVar19;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                d9n d9nVar20 = d9n.a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    mr20 mr20Var2 = (mr20) this.c;
                    p5b0 p5b0Var = new p5b0((uh0) this.d, b);
                    this.b = true;
                    if (mr20Var2.collect(p5b0Var, this) == d9nVar20) {
                        return d9nVar20;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                d9n d9nVar21 = d9n.a;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    ccc0 ccc0Var = ((lcc0) this.c).b;
                    List list = (List) this.d;
                    this.b = true;
                    if (ccc0Var.g(list, false, (ubc0) null, this) == d9nVar21) {
                        return d9nVar21;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return bjo.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                List list2 = (List) this.c;
                d9n d9nVar22 = d9n.a;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    zdc0 zdc0Var = (zdc0) this.d;
                    this.c = null;
                    this.b = true;
                    PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = zdc0.R0;
                    if (zdc0Var.l(list2, this) == d9nVar22) {
                        return d9nVar22;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 22:
                d9n d9nVar23 = d9n.a;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    aec0 aec0Var2 = (aec0) this.d;
                    ff20 ff20Var = aec0Var2.c;
                    this.c = aec0Var2;
                    this.b = true;
                    objC = ff20Var.c(this);
                    if (objC == d9nVar23) {
                        return d9nVar23;
                    }
                    aec0Var = aec0Var2;
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aec0Var = (aec0) this.c;
                    hm5.M(obj);
                    objC = obj;
                }
                aec0Var.e = ((Boolean) objC).booleanValue();
                return rih1.a;
            case 23:
                vnc0 vnc0Var = (vnc0) this.d;
                ssw0 ssw0Var2 = (ssw0) this.c;
                d9n d9nVar24 = d9n.a;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                    tnc0 tnc0Var = new tnc0(atomicBoolean, atomicBoolean2, ssw0Var2, vnc0Var, new Object(), new l811(), new LinkedHashSet());
                    vnc0Var.a.a(tnc0Var);
                    jzm jzmVar = new jzm(atomicBoolean2, atomicBoolean, vnc0Var, tnc0Var, (byte) 25);
                    this.c = null;
                    this.b = true;
                    if (jch0.s(ssw0Var2, jzmVar, this) == d9nVar24) {
                        return d9nVar24;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                String str3 = ((rxc0) this.d).a;
                rsc0 rsc0Var = (rsc0) this.c;
                d9n d9nVar25 = d9n.a;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    jn7 jn7Var = rsc0Var.f;
                    PlaylistGetRequest playlistGetRequestD = rsc0Var.d(str3, rsc0Var.e.a(), xsc0.b);
                    playlistGetRequestD.getClass();
                    this.b = true;
                    objQ = jn7Var.q(playlistGetRequestD, this);
                    if (objQ == d9nVar25) {
                        return d9nVar25;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objQ = obj;
                }
                PlaylistGetResponse playlistGetResponse = (PlaylistGetResponse) objQ;
                return i2x0.l(playlistGetResponse.r(), str3, new dsc0(rsc0Var, playlistGetResponse, b));
            case 25:
                d9n d9nVar26 = d9n.a;
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
                hwc0 hwc0Var = (hwc0) this.c;
                r9c r9cVar = (r9c) this.d;
                this.b = true;
                Object objD = hwc0Var.d(r9cVar, this);
                return objD == d9nVar26 ? d9nVar26 : objD;
            case 26:
                d9n d9nVar27 = d9n.a;
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x880 x880Var = new x880(rqt0.u(o4p1.k(h4p1.f(new ymu((d0r) this.c, (lnm) null, (byte) 13)), -1, 2)), (wsc0) this.d, (byte) 24);
                this.b = true;
                Object objI2 = b5p1.i(x880Var, this);
                return objI2 == d9nVar27 ? d9nVar27 : objI2;
            case 27:
                String str4 = (String) this.d;
                d9n d9nVar28 = d9n.a;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    jn7 jn7Var2 = ((xyc0) this.c).d;
                    zgu0 zgu0VarN = PlaylistClearTokenRequest.n();
                    zgu0VarN.n(str4);
                    PlaylistClearTokenRequest playlistClearTokenRequestBuild = zgu0VarN.build();
                    this.b = true;
                    objG = jn7Var2.g(playlistClearTokenRequestBuild, this);
                    if (objG == d9nVar28) {
                        return d9nVar28;
                    }
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objG = obj;
                }
                return i2x0.l(((PlaylistClearTokenResponse) objG).n(), str4, fnc0.h);
            case 28:
                List list3 = (List) this.d;
                d9n d9nVar29 = d9n.a;
                boolean z30 = this.b;
                if (!z30) {
                    hm5.M(obj);
                    jn7 jn7Var3 = ((xyc0) this.c).d;
                    ncd1 ncd1VarO = SyncRequest.o();
                    ncd1VarO.n(list3);
                    SyncRequest syncRequestBuild = ncd1VarO.build();
                    this.b = true;
                    objI0 = jn7Var3.i0(syncRequestBuild, this);
                    if (objI0 == d9nVar29) {
                        return d9nVar29;
                    }
                } else {
                    if (!z30) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI0 = obj;
                }
                return i2x0.l(((PlaylistResyncResponse) objI0).o(), (String) o7h.q0(list3), fnc0.R0);
            default:
                d9n d9nVar30 = d9n.a;
                boolean z31 = this.b;
                if (z31) {
                    if (z31) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mzc0 mzc0Var = (mzc0) this.c;
                mnc0 mnc0Var = new mnc0(mzc0Var.b.k((String) this.d, (trc0) mzc0Var.d.getValue()), (byte) 5);
                this.b = true;
                Object objI3 = b5p1.i(mnc0Var, this);
                return objI3 == d9nVar30 ? d9nVar30 : objI3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss90(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
