package p;

import android.content.Context;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.collection_esperanto.proto.SnoozeRequest;
import com.spotify.collection_esperanto.proto.Status;
import com.spotify.collection_esperanto.proto.UnbanInPlayContextRequest;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class swn extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swn(boolean z, y7e1 y7e1Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 29;
        this.b = z;
        this.c = y7e1Var;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
    }

    private final Object e(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            c9n c9nVar = (c9n) this.c;
            l6v l6vVar = (l6v) this.d;
            xu30 xu30Var = l6vVar.m1;
            long jH = qui1.h(l6vVar.n1 ? -1.0f : 1.0f, ((n4v) this.e).a);
            qqq0 qqq0Var = (qqq0) this.f;
            bz0 bz0Var = k6v.a;
            Float f = new Float(qqq0Var == qqq0.a ? qui1.e(jH) : qui1.d(jH));
            this.b = true;
            Object objInvoke = xu30Var.invoke(c9nVar, f, this);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 0);
            case 1:
                swn swnVar = new swn((d0r) obj3, (hga) obj2, lnmVar, (byte) 1);
                swnVar.d = obj;
                return swnVar;
            case 2:
                swn swnVar2 = new swn((d0r) obj3, (n4r) obj2, lnmVar, (byte) 2);
                swnVar2.d = obj;
                return swnVar2;
            case 3:
                swn swnVar3 = new swn((d0r) obj3, (f1r) obj2, lnmVar, (byte) 3);
                swnVar3.d = obj;
                return swnVar3;
            case 4:
                swn swnVar4 = new swn(obj3, (String) this.d, obj2, lnmVar, (byte) 4);
                swnVar4.c = obj;
                return swnVar4;
            case 5:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 5);
            case 6:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 6);
            case 7:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 7);
            case 8:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 8);
            case 9:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 9);
            case 10:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 10);
            case 11:
                return new swn(this.d, obj3, obj2, lnmVar, (byte) 11);
            case 12:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 12);
            case 13:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 13);
            case 14:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 14);
            case 15:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 15);
            case 16:
                swn swnVar5 = new swn(obj3, (String) this.d, obj2, lnmVar, (byte) 16);
                swnVar5.c = obj;
                return swnVar5;
            case 17:
                swn swnVar6 = new swn(this.d, obj3, obj2, lnmVar, (byte) 17);
                swnVar6.c = obj;
                return swnVar6;
            case 18:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 18);
            case 19:
                swn swnVar7 = new swn((hur) obj3, (uf20) obj2, lnmVar, (byte) 19);
                swnVar7.d = obj;
                return swnVar7;
            case 20:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 20);
            case 21:
                return new swn((ezt) this.c, (iu30) obj3, (bxt) obj2, (String) this.d, lnmVar);
            case 22:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 22);
            case 23:
                return new swn(this.d, obj3, obj2, lnmVar, (byte) 23);
            case 24:
                return new swn(obj3, (String) this.d, obj2, lnmVar, (byte) 24);
            case 25:
                swn swnVar8 = new swn((p811) obj3, (m5v) obj2, lnmVar, (byte) 25);
                swnVar8.d = obj;
                return swnVar8;
            case 26:
                swn swnVar9 = new swn(this.d, obj3, obj2, lnmVar, (byte) 26);
                swnVar9.c = obj;
                return swnVar9;
            case 27:
                swn swnVar10 = new swn(this.d, obj3, obj2, lnmVar, (byte) 27);
                swnVar10.c = obj;
                return swnVar10;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new swn(this.c, this.d, obj3, obj2, lnmVar, (byte) 28);
            default:
                return new swn(this.b, (y7e1) this.c, (ven0) this.d, (ven0) obj3, (ven0) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((iu30) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((p24) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    /* JADX WARN: Code duplicated, block: B:500:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [p.c0r] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v146 */
    /* JADX WARN: Type inference failed for: r1v147 */
    /* JADX WARN: Type inference failed for: r1v148 */
    /* JADX WARN: Type inference failed for: r1v149 */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v150 */
    /* JADX WARN: Type inference failed for: r1v151 */
    /* JADX WARN: Type inference failed for: r1v152 */
    /* JADX WARN: Type inference failed for: r1v153 */
    /* JADX WARN: Type inference failed for: r1v154 */
    /* JADX WARN: Type inference failed for: r1v155 */
    /* JADX WARN: Type inference failed for: r1v16, types: [p.c0r] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [p.c0r] */
    /* JADX WARN: Type inference failed for: r1v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v47, types: [p.qku] */
    /* JADX WARN: Type inference failed for: r1v55, types: [p.qku] */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0145 -> B:63:0x0147). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x014a -> B:65:0x014d). Please report as a decompilation issue!!! */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objQ;
        Integer m231Var;
        Object objJ;
        Object objC;
        Object objB;
        qku qkuVarL;
        Object obj2;
        Object objInvoke;
        ?? r1;
        Status m231Var2;
        Object objJ2;
        Object objQ2;
        war0 war0VarB0;
        mr20 mr20VarF;
        ArrayList arrayList;
        Object objJ3;
        List m231Var3;
        pfu pfuVar;
        ven0 ven0Var;
        Object objA;
        iu30 iu30Var;
        Object obj3;
        iu30 iu30Var2;
        p811 p811Var;
        o4v o4vVar;
        Object objR;
        byte b = this.a;
        y231 y231Var = l231.a;
        rih1 rih1Var = rih1.a;
        rih1 rih1Var2 = d9n.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    c7g1 c7g1Var = (c7g1) ((h72) obj4).g;
                    this.b = true;
                    objQ = ((w6e0) this.c).q((String) this.d, (kp00) obj5, c7g1Var, this);
                    if (objQ == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objQ = ((e331) obj).a;
                }
                return new e331(objQ);
            case 1:
                vr20 vr20Var = (vr20) this.d;
                ?? r2 = this.b;
                try {
                    if (r2 == 0) {
                        hm5.M(obj);
                        c0r c0rVarC = ((d0r) obj5).c((hga) obj4);
                        ien0 ien0VarA = c0rVarC.a();
                        e0r e0rVar = new e0r(vr20Var, (lnm) null, (byte) 0);
                        this.d = null;
                        this.c = c0rVarC;
                        this.b = true;
                        ien0VarA.b(e0rVar, this);
                        rih1Var = rih1Var2;
                        r2 = c0rVarC;
                    } else {
                        if (r2 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c0r c0rVar = (c0r) this.c;
                        hm5.M(obj);
                        c0rVar.dispose();
                        r2 = c0rVar;
                    }
                    return rih1Var;
                } catch (Throwable th) {
                    r2.dispose();
                    throw th;
                }
            case 2:
                vr20 vr20Var2 = (vr20) this.d;
                ?? r3 = this.b;
                try {
                    if (r3 == 0) {
                        hm5.M(obj);
                        c0r c0rVarC2 = ((d0r) obj5).c((n4r) obj4);
                        ien0 ien0VarA2 = c0rVarC2.a();
                        e0r e0rVar2 = new e0r(vr20Var2, (lnm) null, (byte) 1);
                        this.d = null;
                        this.c = c0rVarC2;
                        this.b = true;
                        ien0VarA2.b(e0rVar2, this);
                        rih1Var = rih1Var2;
                        r3 = c0rVarC2;
                    } else {
                        if (r3 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c0r c0rVar2 = (c0r) this.c;
                        hm5.M(obj);
                        c0rVar2.dispose();
                        r3 = c0rVar2;
                    }
                    return rih1Var;
                } catch (Throwable th2) {
                    r3.dispose();
                    throw th2;
                }
            case 3:
                vr20 vr20Var3 = (vr20) this.d;
                ?? r4 = this.b;
                try {
                    if (r4 == 0) {
                        hm5.M(obj);
                        c0r c0rVarC3 = ((d0r) obj5).c((f1r) obj4);
                        ien0 ien0VarA3 = c0rVarC3.a();
                        e0r e0rVar3 = new e0r(vr20Var3, (lnm) null, (byte) 2);
                        this.d = null;
                        this.c = c0rVarC3;
                        this.b = true;
                        ien0VarA3.b(e0rVar3, this);
                        rih1Var = rih1Var2;
                        r4 = c0rVarC3;
                    } else {
                        if (r4 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c0r c0rVar3 = (c0r) this.c;
                        hm5.M(obj);
                        c0rVar3.dispose();
                        r4 = c0rVar3;
                    }
                    return rih1Var;
                } catch (Throwable th3) {
                    r4.dispose();
                    throw th3;
                }
            case 4:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        zfr zfrVar = (zfr) obj5;
                        String str = (String) this.d;
                        String str2 = (String) obj4;
                        r5h r5hVar = (r5h) zfrVar.b;
                        hgh1 hgh1VarN = UnbanInPlayContextRequest.n();
                        hgh1VarN.q(str);
                        hgh1VarN.n(str2);
                        Single map = r5hVar.callSingle("spotify.collection_esperanto.proto.CollectionService", "UnbanInPlayContext", hgh1VarN.build()).map(p9w.R0).map(p9w.V0);
                        this.c = null;
                        this.b = true;
                        objJ = fc11.j(map, this);
                        if (objJ == rih1Var2) {
                            return rih1Var2;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objJ = obj;
                    }
                    m231Var = (Integer) objJ;
                    break;
                } catch (Throwable th4) {
                    m231Var = new m231(th4);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null && (thA instanceof CancellationException)) {
                    throw thA;
                }
                if (e331.a(m231Var) != null) {
                    m231Var = new Integer(500);
                }
                int iIntValue = m231Var.intValue();
                tr80 tr80Var = s4a.a;
                return (iIntValue > ((rr80) tr80Var).b || ((rr80) tr80Var).a > iIntValue) ? p4a.a : q4a.a;
            case 5:
                akr akrVar = (akr) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                List list = akr.A;
                any anyVar = new any(qqn1.f(akrVar.f()), (byte) 18);
                ur1 ur1Var = new ur1(akrVar, (zf30) this.d, (BottomSheetBehavior) obj5, (ujr) obj4, (lnm) null, (byte) 14);
                this.b = true;
                return l4p1.q(anyVar, ur1Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 6:
                hcr0 hcr0Var = (hcr0) this.c;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!((zf30) hcr0Var).s1.i.a(w8c0.c)) {
                    return rih1Var;
                }
                mr20 mr20VarF2 = qqn1.f(hcr0Var.b0(cxb.class));
                sr1 sr1Var = new sr1((ujr) this.d, (nhr0) obj5, (akr) obj4, null, (byte) 9);
                this.b = true;
                return l4p1.q(mr20VarF2, sr1Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 7:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    zor zorVar = (zor) this.c;
                    nhb nhbVar = new nhb(zorVar, (String) this.d, (String) obj5, (String) obj4, (lnm) null, (byte) 1);
                    this.b = true;
                    objC = zorVar.c(nhbVar, this);
                    if (objC == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC = obj;
                }
                return rih1Var;
            case 8:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xyc0 xyc0Var = (iyc0) ((yjq) this.c).c;
                tv80 tv80Var = ((gj3) obj4).c;
                this.b = true;
                Object objL = xyc0Var.l((String) this.d, (List) obj5, this, tv80Var);
                return objL == rih1Var2 ? rih1Var2 : objL;
            case 9:
                c8z c8zVar = (c8z) this.d;
                qxr qxrVar = (qxr) this.c;
                rmr rmrVar = qxrVar.a;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    xrc0 xrc0Var = qxrVar.d;
                    String str3 = c8zVar.a;
                    trc0 trc0VarC = rmrVar.c();
                    EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsA = lyg.A(qot0.a((SkipToTrack) obj5, c8zVar.c, null, ((g7z) rmrVar.b).i, 4));
                    EsPlayOrigin.PlayOrigin playOriginA = tot0.a(qxrVar.b);
                    EsLoggingParams.LoggingParams loggingParams = (EsLoggingParams.LoggingParams) obj4;
                    loggingParams.getClass();
                    this.b = true;
                    objB = xrc0.b(xrc0Var, str3, trc0VarC, preparePlayOptionsA, playOriginA, (EsPlayOptions.PlayOptions) null, (Map) null, loggingParams, (ayc0) null, this, 176);
                    if (objB == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                ((py21) objB).d();
                return rih1Var;
            case 10:
                nl9 nl9Var = (nl9) this.c;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ((q7r0) nl9Var.f).d.c.getLifecycle().a(new a1s((String) this.d, nl9Var, (hsm1) obj4, (vum1) obj5));
                f1n0 f1n0Var = (f1n0) nl9Var.e;
                this.b = true;
                return f1n0Var.a(this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 11:
                f4s f4sVar = (f4s) obj5;
                i4s i4sVar = (i4s) this.d;
                ?? r5 = this.b;
                try {
                    if (r5 == 0) {
                        hm5.M(obj);
                        f4s f4sVar2 = (f4s) i4sVar.b.get();
                        if (f4sVar2 != null) {
                            if (f4sVar2 != f4sVar || !f4sVar2.b.isActive()) {
                                f4sVar2 = null;
                            }
                            if (f4sVar2 != null) {
                                qkuVarL = f4sVar2.b.L(new h4s(op71.z(getContext()), (byte) 0));
                                op71.x(getContext());
                                if (i4sVar.b(f4sVar)) {
                                    this.c = qkuVarL;
                                    this.b = true;
                                    objInvoke = ((iu30) obj4).invoke(this);
                                    if (objInvoke == rih1Var2) {
                                        r5 = qkuVarL;
                                        return rih1Var2;
                                    }
                                    r5 = qkuVarL;
                                    obj2 = objInvoke;
                                    r1 = r5;
                                } else {
                                    obj2 = null;
                                    r1 = qkuVarL;
                                }
                            }
                            break;
                        }
                        return null;
                    }
                    if (r5 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qku qkuVar = (qku) this.c;
                    hm5.M(obj);
                    objInvoke = obj;
                    r5 = qkuVar;
                    r5 = qkuVarL;
                    obj2 = objInvoke;
                    r1 = r5;
                    break;
                    r1.dispose();
                    return obj2;
                } catch (Throwable th5) {
                    r5.dispose();
                    throw th5;
                }
            case 12:
                z72 z72Var = (z72) this.d;
                dom0 dom0Var = (dom0) obj4;
                rih1 rih1Var3 = (rih1) this.c;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    if (rih1Var3 != null) {
                        y231Var = new y231(new lom0(((eom0) obj5).a, ((com0) dom0Var).a));
                    }
                    tbr0 tbr0Var = (tbr0) z72Var.Z;
                    if (tbr0Var != null) {
                        tbr0Var.a(y231Var);
                    } else {
                        f1n0 f1n0Var2 = (f1n0) z72Var.f;
                        this.b = true;
                        if (f1n0Var2.a(this) == rih1Var2) {
                            return rih1Var2;
                        }
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                z72Var.Z = null;
                if (rih1Var3 == null) {
                    return rih1Var;
                }
                String string = ((Context) z72Var.e).getString(2131964107, ((com0) dom0Var).b);
                x8c0 lifecycle = ((q7r0) z72Var.g).d.c.getLifecycle();
                lifecycle.a(new zw3(z72Var, string, lifecycle, (byte) 1));
                return rih1Var;
            case 13:
                uwl uwlVar = (uwl) this.d;
                i130 i130Var = (i130) obj4;
                rih1 rih1Var4 = (rih1) this.c;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                if (rih1Var4 != null) {
                    y231Var = new y231(new lom0(((yom0) obj5).a, ((g130) i130Var).a));
                }
                tbr0 tbr0Var2 = (tbr0) uwlVar.N0;
                if (tbr0Var2 != null) {
                    tbr0Var2.a(y231Var);
                } else {
                    f1n0 f1n0Var3 = (f1n0) uwlVar.f;
                    this.b = true;
                    if (f1n0Var3.a(this) == rih1Var2) {
                        return rih1Var2;
                    }
                }
                uwlVar.N0 = null;
                if (rih1Var4 != null) {
                    String string2 = ((Context) uwlVar.e).getString(2131964107, ((g130) i130Var).b);
                    x8c0 lifecycle2 = ((q7r0) uwlVar.g).d.c.getLifecycle();
                    lifecycle2.a(new zw3(uwlVar, string2, lifecycle2, (byte) 2));
                    return rih1Var;
                }
                return null;
            case 14:
                uwl uwlVar2 = (uwl) this.d;
                tom0 tom0Var = (tom0) obj4;
                rih1 rih1Var5 = (rih1) this.c;
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                if (rih1Var5 != null) {
                    y231Var = new y231(new lom0(((yom0) obj5).a, tom0Var.a));
                }
                tbr0 tbr0Var3 = (tbr0) uwlVar2.N0;
                if (tbr0Var3 != null) {
                    tbr0Var3.a(y231Var);
                } else {
                    f1n0 f1n0Var4 = (f1n0) uwlVar2.f;
                    this.b = true;
                    if (f1n0Var4.a(this) == rih1Var2) {
                        return rih1Var2;
                    }
                }
                uwlVar2.N0 = null;
                if (rih1Var5 != null) {
                    String string3 = ((Context) uwlVar2.e).getString(2131964107, tom0Var.b);
                    x8c0 lifecycle3 = ((q7r0) uwlVar2.g).d.c.getLifecycle();
                    lifecycle3.a(new zw3(uwlVar2, string3, lifecycle3, (byte) 2));
                    return rih1Var;
                }
                return null;
            case 15:
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                frh1 frh1Var = ((dgs) this.c).m;
                o60 o60Var = (o60) obj4;
                fvh1 fvh1Var = new fvh1((String) this.d, ((cn40) obj5).a.a, (xk41) o60Var.c, Boolean.valueOf(o60Var.b));
                this.b = true;
                Object objC2 = frh1Var.c(fvh1Var, this);
                return objC2 == rih1Var2 ? rih1Var2 : objC2;
            case 16:
                lrs lrsVar = (lrs) obj5;
                et61 et61Var = lrsVar.a;
                boolean z13 = this.b;
                try {
                    if (!z13) {
                        hm5.M(obj);
                        String str4 = (String) this.d;
                        String str5 = (String) obj4;
                        r5h r5hVar2 = lrsVar.b;
                        dx91 dx91VarN = SnoozeRequest.n();
                        dx91VarN.r(str4);
                        if (str5 != null) {
                            dx91VarN.q(str5);
                        }
                        dx91VarN.n();
                        Single map2 = r5hVar2.callSingle("spotify.collection_esperanto.proto.CollectionService", "Snooze", dx91VarN.build()).map(wcp1.P0);
                        this.c = null;
                        this.b = true;
                        objJ2 = fc11.j(map2, this);
                        if (objJ2 == rih1Var2) {
                            return rih1Var2;
                        }
                    } else {
                        if (!z13) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objJ2 = obj;
                    }
                    m231Var2 = (Status) objJ2;
                    break;
                } catch (Throwable th6) {
                    m231Var2 = new m231(th6);
                }
                Throwable thA2 = e331.a(m231Var2);
                gx91 gx91Var = fx91.a;
                if (thA2 != null) {
                    et61Var.invoke(gx91Var);
                    return rih1Var;
                }
                tr80 tr80Var2 = cx91.a;
                int i = ((rr80) tr80Var2).a;
                int i2 = ((rr80) tr80Var2).b;
                int iN = m231Var2.n();
                if (i <= iN && iN <= i2) {
                    gx91Var = gx91.a;
                }
                et61Var.invoke(gx91Var);
                return rih1Var;
            case 17:
                c9n c9nVar = (c9n) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 4, new nxs((txs) obj5, (j4e) obj4, (lnm) null, (byte) 1), 1);
                    try {
                        ((gg61) this.d).b.b(true);
                        this.c = null;
                        this.b = true;
                        objQ2 = s2tVarQ.Q(this);
                        if (objQ2 == rih1Var2) {
                            return rih1Var2;
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        s2tVarQ.d((CancellationException) null);
                        v8i0.j("Failed to end Cast session before route selection: ", e2.getMessage());
                        return rih1Var;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objQ2 = obj;
                }
                if (objQ2 != null) {
                    return rih1Var;
                }
                n57.s("Timed out waiting for Cast session to end before route selection");
                return rih1Var;
            case 18:
                yzs yzsVar = (yzs) this.c;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bbr0 bbr0Var = (bbr0) obj5;
                mr20 mr20VarU = rqt0.u(new x010(h4p1.f(new n5s((gj5) this.d, null, (byte) 14)), (bbr0Var == null || (war0VarB0 = bbr0Var.b0(f6w0.class)) == null || (mr20VarF = qqn1.f(war0VarB0)) == null) ? new huz(Boolean.TRUE, (byte) 10) : new x3s(mr20VarF, (byte) 2), new ce2(3, (lnm) null, (byte) 13), (byte) 1));
                ryr ryrVar = new ryr(yzsVar, (a8l) obj4, (byte) 12);
                this.b = true;
                return mr20VarU.collect(ryrVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 19:
                hur hurVar = (hur) obj5;
                uf20 uf20Var = (uf20) obj4;
                psw0 psw0Var = (nsw0) this.d;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    vod1 vod1Var = uf20Var.f;
                    List list2 = z6x.a;
                    ArrayList arrayListN0 = o7h.N0(uf20Var.g, vod1Var != null ? Collections.singletonList(vod1Var) : list2);
                    boolean zIsEmpty = arrayListN0.isEmpty();
                    try {
                        f6c0 f6c0Var = (f6c0) hurVar.b;
                        boolean z17 = uf20Var.d;
                        c380 c380Var = uf20Var.h;
                        List list3 = !zIsEmpty ? list2 : uf20Var.i;
                        if (zIsEmpty) {
                            list2 = uf20Var.j;
                        }
                        Single singleA = f6c0Var.a(c380Var, list3, list2, z17);
                        this.d = psw0Var;
                        this.c = arrayListN0;
                        this.b = true;
                        objJ3 = fc11.j(singleA, this);
                        if (objJ3 == rih1Var2) {
                            return rih1Var2;
                        }
                        arrayList = arrayListN0;
                    } catch (Throwable th7) {
                        th = th7;
                        arrayList = arrayListN0;
                        m231Var3 = new m231(th);
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = (ArrayList) this.c;
                    try {
                        hm5.M(obj);
                        objJ3 = obj;
                    } catch (Throwable th8) {
                        th = th8;
                        m231Var3 = new m231(th);
                    }
                }
                m231Var3 = (List) objJ3;
                ArrayList arrayList2 = arrayList;
                if (e331.a(m231Var3) != null) {
                    psw0Var.setValue((Object) null);
                    return rih1Var;
                }
                List list4 = m231Var3;
                int i3 = uf20Var.a;
                boolean z18 = uf20Var.c;
                int i4 = uf20Var.b;
                list4.getClass();
                psw0Var.setValue(new ztm1(arrayList2, list4, i4, i3, z18, uf20Var.e));
                return rih1Var;
            case 20:
                o95 o95Var = (o95) this.c;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (u890.j(o95Var.e.getValue(), ((v3t) this.d).a.getValue())) {
                    return rih1Var;
                }
                this.b = true;
                return o95.b(o95Var, (Integer) obj5, (ni20) obj4, (Float) null, (iu30) null, this, 12) == rih1Var2 ? rih1Var2 : rih1Var;
            case 21:
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    ezt eztVar = (ezt) this.c;
                    mr20 mr20VarK = r4p1.k(new ld2(eztVar.h, (String) this.d, (byte) 7), eztVar.e.b());
                    nw5 nw5Var = new nw5(2, (lnm) null, (byte) 11);
                    this.b = true;
                    if (b5p1.j(mr20VarK, nw5Var, this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((iu30) obj5).invoke((bxt) obj4);
                return rih1Var;
            case 22:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!((Boolean) ((ven0) this.d).getValue()).booleanValue()) {
                    return rih1Var;
                }
                x8c0 lifecycle4 = ((iac0) this.c).getLifecycle();
                ymu ymuVar = new ymu((fnu) obj5, (iu30) obj4, (lnm) null, (byte) 1);
                this.b = true;
                return z8p1.t(lifecycle4, w8c0.e, ymuVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 23:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    pfuVar = (pfu) ((ven0) this.d).getValue();
                    if (pfuVar == null) {
                        return rih1Var;
                    }
                    if (pfuVar.b) {
                        ((Function0) ((ven0) obj5).getValue()).invoke();
                    }
                    wiu wiuVar = wiu.Q0;
                    this.c = pfuVar;
                    this.b = true;
                    if (s110.h(getContext()).D(wiuVar, this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pfuVar = (pfu) this.c;
                    hm5.M(obj);
                }
                ((iu30) ((ven0) obj4).getValue()).invoke(Boolean.valueOf(pfuVar.a));
                return rih1Var;
            case 24:
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    ven0Var = (ven0) obj4;
                    h9n0 h9n0Var = (h9n0) ((ovu) obj5).c.get();
                    String str6 = (String) this.d;
                    this.c = ven0Var;
                    this.b = true;
                    objA = h9n0Var.a(str6, this);
                    if (objA == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ven0Var = (ven0) this.c;
                    hm5.M(obj);
                    objA = obj;
                }
                ven0Var.setValue(((Boolean) objA).booleanValue() ? xuu.c : xuu.b);
                return rih1Var;
            case 25:
                p811 p811Var2 = (p811) obj5;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    iu30Var = (iu30) this.d;
                    obj3 = p811Var2.a;
                    if (!(obj3 instanceof n4v) || (obj3 instanceof k4v)) {
                        return rih1Var;
                    }
                    l4v l4vVar = obj3 instanceof l4v ? (l4v) obj3 : null;
                    if (l4vVar != null) {
                        iu30Var.invoke(l4vVar);
                    }
                    bbc bbcVar = ((m5v) obj4).U0;
                    if (bbcVar != null) {
                        this.d = iu30Var;
                        this.c = p811Var2;
                        this.b = true;
                        objR = bbcVar.r(this);
                        if (objR == rih1Var2) {
                            return rih1Var2;
                        }
                        iu30Var2 = iu30Var;
                        p811Var = p811Var2;
                    } else {
                        iu30Var2 = iu30Var;
                        p811Var = p811Var2;
                        o4vVar = null;
                    }
                    p811Var.a = o4vVar;
                    iu30Var = iu30Var2;
                    obj3 = p811Var2.a;
                    if (obj3 instanceof n4v) {
                        return rih1Var;
                    }
                    return rih1Var;
                }
                if (!z24) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p811 p811Var3 = (p811) this.c;
                iu30 iu30Var3 = (iu30) this.d;
                hm5.M(obj);
                iu30Var2 = iu30Var3;
                p811Var = p811Var3;
                objR = obj;
                o4vVar = (o4v) objR;
                p811Var.a = o4vVar;
                iu30Var = iu30Var2;
                obj3 = p811Var2.a;
                if (obj3 instanceof n4v) {
                    return rih1Var;
                }
                return rih1Var;
            case 26:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                p24 p24Var = (p24) this.c;
                swn swnVar = (swn) this.d;
                pg pgVar = new pg(p24Var, (l6v) obj5, (qqq0) obj4, (byte) 14);
                this.b = true;
                return swnVar.invoke(pgVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 27:
                return e(obj);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                hdv hdvVar = (hdv) this.c;
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                g431 g431Var = hdvVar.a;
                b431 b431VarA = g431Var != null ? g431Var.a(uj1.r, new yw1((ven0) this.d, (byte) 2)) : null;
                mfe mfeVar = hdvVar.i.b;
                u60 u60Var = new u60(b431VarA, hdvVar, (ven0) obj5, (ven0) obj4, (byte) 18);
                this.b = true;
                return mfeVar.collect(u60Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            default:
                ven0 ven0Var2 = (ven0) obj5;
                hm5.M(obj);
                ven0 ven0Var3 = (ven0) this.d;
                if (((Boolean) ven0Var3.getValue()).booleanValue() && this.b && !((Boolean) ven0Var2.getValue()).booleanValue()) {
                    y7e1 y7e1Var = (y7e1) this.c;
                    h4e1 h4e1VarH = y7e1Var.h();
                    try {
                        h4e1VarH.p(e6p1.e(0, h4e1VarH.c.length()));
                        y7e1Var.a(h4e1VarH);
                        y7e1Var.c();
                        ven0Var2.setValue(Boolean.TRUE);
                    } catch (Throwable th9) {
                        y7e1Var.c();
                        throw th9;
                    }
                }
                Boolean bool = (Boolean) ven0Var3.getValue();
                bool.booleanValue();
                ((ven0) obj4).setValue(bool);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swn(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swn(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swn(Object obj, String str, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.d = str;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swn(ezt eztVar, iu30 iu30Var, bxt bxtVar, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 21;
        this.c = eztVar;
        this.e = iu30Var;
        this.f = bxtVar;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swn(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
