package p;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import androidx.compose.ui.geometry.Offset;
import com.spotify.ads.esperanto.proto.UpdateSlotEnabledRequest;
import com.spotify.ads.esperanto.proto.UpdateSlotResponse;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand$Builder;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.scrollsita.v1.Section;
import com.spotify.share.file.api.files.CreateFileException;
import io.reactivex.rxjava3.core.Single;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.fandomcollectibles.protos.Sharing$QueryParameter;
import spotify.fandomcollectibles.protos.Sharing$ShareResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lm61 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm61(np61 np61Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        jx0 jx0Var = jx0.b;
        this.d = np61Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new lm61((nm61) obj2, lnmVar, (byte) 0);
            case 1:
                jx0 jx0Var = jx0.b;
                return new lm61((np61) obj2, lnmVar);
            case 2:
                return new lm61((tqo) this.c, (vqo) obj2, lnmVar, (byte) 2);
            case 3:
                return new lm61((wy61) this.c, (oy61) obj2, lnmVar, (byte) 3);
            case 4:
                return new lm61((r171) this.c, (String) obj2, lnmVar, (byte) 4);
            case 5:
                return new lm61((wh41) this.c, (String) obj2, lnmVar, (byte) 5);
            case 6:
                return new lm61((wy61) this.c, (a371) obj2, lnmVar, (byte) 6);
            case 7:
                return new lm61((x371) this.c, (w371) obj2, lnmVar, (byte) 7);
            case 8:
                return new lm61((n771) this.c, (String) obj2, lnmVar, (byte) 8);
            case 9:
                return new lm61((eyh0) this.c, (String) obj2, lnmVar, (byte) 9);
            case 10:
                lm61 lm61Var = new lm61((af71) obj2, lnmVar, (byte) 10);
                lm61Var.c = obj;
                return lm61Var;
            case 11:
                return new lm61((ki71) this.c, (iu30) obj2, lnmVar, (byte) 11);
            case 12:
                return new lm61((tob1) this.c, (flw0) obj2, lnmVar, (byte) 12);
            case 13:
                return new lm61((mm71) this.c, (drr0) obj2, lnmVar, (byte) 13);
            case 14:
                return new lm61((in71) this.c, (String) obj2, lnmVar, (byte) 14);
            case 15:
                return new lm61((flw0) this.c, (iu30) obj2, lnmVar, (byte) 15);
            case 16:
                lm61 lm61Var2 = new lm61(obj2, lnmVar, (byte) 16);
                lm61Var2.c = obj;
                return lm61Var2;
            case 17:
                return new lm61((xs71) this.c, (n8b1) obj2, lnmVar, (byte) 17);
            case 18:
                lm61 lm61Var3 = new lm61((WifiManager) obj2, lnmVar, (byte) 18);
                lm61Var3.c = obj;
                return lm61Var3;
            case 19:
                return new lm61((iw71) this.c, (ow71) obj2, lnmVar, (byte) 19);
            case 20:
                lm61 lm61Var4 = new lm61((dx71) obj2, lnmVar, (byte) 20);
                lm61Var4.c = obj;
                return lm61Var4;
            case 21:
                return new lm61((yx11) this.c, (ef7) obj2, lnmVar, (byte) 21);
            case 22:
                lm61 lm61Var5 = new lm61((m441) obj2, lnmVar, (byte) 22);
                lm61Var5.c = obj;
                return lm61Var5;
            case 23:
                return new lm61((f210) this.c, (r961) obj2, lnmVar, (byte) 23);
            case 24:
                return new lm61((yon) this.c, (String) obj2, lnmVar, (byte) 24);
            case 25:
                return new lm61((vnd1) this.c, (qi91) obj2, lnmVar, (byte) 25);
            case 26:
                lm61 lm61Var6 = new lm61((oh81) obj2, lnmVar, (byte) 26);
                lm61Var6.c = obj;
                return lm61Var6;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new lm61((ar81) this.c, (oo81) obj2, lnmVar, (byte) 27);
            case 28:
                lm61 lm61Var7 = new lm61((ev81) obj2, lnmVar, (byte) 28);
                lm61Var7.c = obj;
                return lm61Var7;
            default:
                lm61 lm61Var8 = new lm61((w791) obj2, lnmVar, (byte) 29);
                lm61Var8.c = obj;
                return lm61Var8;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((cxc0) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((x791) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [p.lnm] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final Object invokeSuspend(Object obj) {
        Object objI;
        nm61 nm61Var;
        Object objC;
        np61 np61Var;
        Object objJ;
        Object objY;
        ox71 px71Var;
        Object objP;
        Object objJ2;
        Object obj2;
        Object obj3;
        ou80 ou80Var;
        ?? r8 = 0;
        r8 = 0;
        switch (this.a) {
            case 0:
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    nm61 nm61Var2 = (nm61) this.d;
                    mr20 data = nm61Var2.a.getData();
                    this.c = nm61Var2;
                    this.b = true;
                    objI = b5p1.i(data, this);
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                    nm61Var = nm61Var2;
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nm61Var = (nm61) this.c;
                    hm5.M(obj);
                    objI = obj;
                }
                cen0 cen0VarC = ((cen0) objI).c();
                mnv0 mnv0Var = nm61.c;
                nm61Var.c(cen0VarC);
                return rih1.a;
            case 1:
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    np61 np61Var2 = (np61) this.d;
                    oo61 oo61Var = np61Var2.a;
                    ovh1 ovh1VarN = UpdateSlotEnabledRequest.n();
                    jx0 jx0Var = jx0.b;
                    ovh1VarN.q("marquee");
                    ovh1VarN.n();
                    UpdateSlotEnabledRequest updateSlotEnabledRequestBuild = ovh1VarN.build();
                    this.c = np61Var2;
                    this.b = true;
                    objC = oo61Var.c(updateSlotEnabledRequestBuild, this);
                    if (objC == d9nVar2) {
                        return d9nVar2;
                    }
                    np61Var = np61Var2;
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    np61Var = (np61) this.c;
                    hm5.M(obj);
                    objC = obj;
                }
                UpdateSlotResponse updateSlotResponse = (UpdateSlotResponse) objC;
                np61Var.getClass();
                return mp61.a[updateSlotResponse.o().ordinal()] == 1 ? ax0.a : new zw0(updateSlotResponse.o().getNumber(), updateSlotResponse.o().name());
            case 2:
                d9n d9nVar3 = d9n.a;
                boolean z3 = this.b;
                try {
                    if (z3) {
                        if (z3) {
                            hm5.M(obj);
                            r8 = obj;
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return r8;
                    }
                    hm5.M(obj);
                    vu30 vu30Var = ((qqo) ((tqo) this.c)).c;
                    uqo uqoVar = ((vqo) this.d).b;
                    this.b = true;
                    Object objInvoke = vu30Var.invoke(uqoVar, this);
                    r8 = objInvoke == d9nVar3 ? d9nVar3 : objInvoke;
                    break;
                } catch (Exception unused) {
                }
                return r8;
            case 3:
                d9n d9nVar4 = d9n.a;
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
                w701 w701Var = ((wy61) this.c).b;
                String str = ((oy61) this.d).a;
                this.b = true;
                Object objA = w701.a(w701Var, str, this, 6);
                return objA == d9nVar4 ? d9nVar4 : objA;
            case 4:
                d9n d9nVar5 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    w390 w390Var = ((r171) this.c).b1;
                    r6h1 r6h1Var = r6h1.c;
                    w8n w8nVarA = w390Var.a();
                    this.b = true;
                    if (w8nVarA.a(this) == d9nVar5) {
                        return d9nVar5;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 5:
                d9n d9nVar6 = d9n.a;
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
                uvy uvyVar = (uvy) ((wh41) this.c).c;
                String str2 = (String) this.d;
                this.b = true;
                Object objC2 = uvyVar.c(str2, this);
                return objC2 == d9nVar6 ? d9nVar6 : objC2;
            case 6:
                d9n d9nVar7 = d9n.a;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                w701 w701Var2 = ((wy61) this.c).b;
                String str3 = ((a371) this.d).a;
                this.b = true;
                Object objA2 = w701.a(w701Var2, str3, this, 6);
                return objA2 == d9nVar7 ? d9nVar7 : objA2;
            case 7:
                w371 w371Var = (w371) this.d;
                d9n d9nVar8 = d9n.a;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    x371 x371Var = (x371) this.c;
                    Single<Sharing$ShareResponse> singleA = x371Var.a.a(w371Var.a, x371Var.b.g().getID());
                    this.b = true;
                    objJ = fc11.j(singleA, this);
                    if (objJ == d9nVar8) {
                        return d9nVar8;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objJ = obj;
                }
                Sharing$ShareResponse sharing$ShareResponse = (Sharing$ShareResponse) objJ;
                h290<Sharing$QueryParameter> h290VarP = sharing$ShareResponse.p();
                int iS = zno1.s(q7h.U(h290VarP, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Sharing$QueryParameter sharing$QueryParameter : h290VarP) {
                    linkedHashMap.put(sharing$QueryParameter.getKey(), sharing$QueryParameter.getValue());
                }
                f0a f0aVar = new f0a();
                f0aVar.b = sharing$ShareResponse.r();
                f0aVar.h(new jlw0(sharing$ShareResponse.q(), w371Var.b));
                f0aVar.h = tyo1.p(blc0.ng, new String[0]);
                String strN = sharing$ShareResponse.n();
                if (strN != null) {
                    f0aVar.c = strN;
                }
                String strO = sharing$ShareResponse.o();
                if (strO != null) {
                    f0aVar.d = strO;
                }
                ((LinkedHashMap) f0aVar.Z).putAll(linkedHashMap);
                f0aVar.Q0 = new dmt(1);
                return new b871(Collections.singletonList(f0aVar.p()), 0);
            case 8:
                File file = d9n.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    n771 n771Var = (n771) this.c;
                    String str4 = (String) this.d;
                    this.b = true;
                    o771 o771Var = (o771) n771Var;
                    o771Var.getClass();
                    objY = fn31.Y(o771Var.d, new n641(new fh61(o771Var, str4, (byte) 9), null), this);
                    if (objY != file) {
                    }
                    return file;
                }
                if (!z9) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objY = obj;
                l420 l420Var = (l420) objY;
                if (l420Var == null) {
                    return null;
                }
                file = l420Var.b;
                if (file.length() <= 0) {
                    return null;
                }
                return file;
            case 9:
                d9n d9nVar9 = d9n.a;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                l420 l420Var2 = (l420) ((idd1) ((y441) ((eyh0) this.c).c).d).getValue();
                synchronized (eyh0.N0) {
                    if (!l420Var2.b.exists() && !l420Var2.mkdirs()) {
                        throw new CreateFileException(l420Var2);
                    }
                }
                eyh0 eyh0Var = (eyh0) this.c;
                l420 l420Var3 = (l420) ((idd1) ((y441) eyh0Var.c).d).getValue();
                String str5 = (String) this.d;
                this.b = true;
                Object objY2 = fn31.Y((q8n) eyh0Var.d, new i3y0(eyh0Var, l420Var3, str5, (lnm) null, (byte) 24), this);
                return objY2 == d9nVar9 ? d9nVar9 : objY2;
            case 10:
                rih1 rih1Var = rih1.a;
                cxc0 cxc0Var = (cxc0) this.c;
                d9n d9nVar10 = d9n.a;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    kby kbyVar = cxc0Var.f;
                    af71 af71Var = (af71) this.d;
                    if (hd71.a(kbyVar.w, kbyVar.v, wls0.d)) {
                        hq41 hq41Var = af71Var.c;
                        huz huzVar = new huz(new wa71(kbyVar.a, null, null, null, null, null, null, 126), (byte) 10);
                        Bundle bundleR = wpb1.r(kbyVar.b, kbyVar.p, kbyVar.q);
                        this.c = null;
                        this.b = true;
                        Object objH = c921.H(hq41Var.d, new n641(hq41Var, huzVar, bundleR, null, (byte) 6), this);
                        if (objH != d9nVar10) {
                            objH = rih1Var;
                        }
                        if (objH == d9nVar10) {
                            return d9nVar10;
                        }
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 11:
                d9n d9nVar11 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    mr20 mr20VarB = ((ki71) this.c).g.b(new uh71(rc11.a.b(omt.class), null));
                    lm31 lm31Var = new lm31((iu30) this.d, (byte) 4);
                    this.b = true;
                    if (mr20VarB.collect(lm31Var, this) == d9nVar11) {
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
            case 12:
                d9n d9nVar12 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    m441 m441VarQ = rwq.q(new bu2((tob1) this.c, (byte) 21));
                    j0z0 j0z0Var = new j0z0((flw0) this.d, (byte) 22);
                    this.b = true;
                    if (m441VarQ.collect(j0z0Var, this) == d9nVar12) {
                        return d9nVar12;
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 13:
                rih1 rih1Var2 = rih1.a;
                d9n d9nVar13 = d9n.a;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = ((mm71) this.c).a.a;
                j0z0 j0z0Var2 = new j0z0((drr0) this.d, (byte) 23);
                this.b = true;
                dt71Var.collect(new tm61(j0z0Var2, (byte) 23), this);
                return d9nVar13;
            case 14:
                d9n d9nVar14 = d9n.a;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var = ((in71) this.c).a;
                String str6 = (String) this.d;
                this.b = true;
                rsc0 rsc0Var2 = rsc0Var;
                Object objH2 = c921.H(rsc0Var2.c, new fsc0(str6, rsc0Var2, (lnm) null), this);
                return objH2 == d9nVar14 ? d9nVar14 : objH2;
            case 15:
                rih1 rih1Var3 = rih1.a;
                d9n d9nVar15 = d9n.a;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var2 = ((flw0) this.c).a;
                lm31 lm31Var2 = new lm31((iu30) this.d, (byte) 7);
                this.b = true;
                dt71Var2.collect(new tm61(lm31Var2, (byte) 24), this);
                return d9nVar15;
            case 16:
                d9n d9nVar16 = d9n.a;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    vr20 vr20Var = (vr20) this.c;
                    lr71 lr71Var = new lr71(((jr71) this.d).b);
                    this.c = null;
                    this.b = true;
                    if (vr20Var.emit(lr71Var, this) == d9nVar16) {
                        return d9nVar16;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 17:
                d9n d9nVar17 = d9n.a;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    o95 o95Var = ((xs71) this.c).f;
                    Offset offset = new Offset(0L);
                    n8b1 n8b1Var = (n8b1) this.d;
                    this.b = true;
                    if (o95.b(o95Var, offset, n8b1Var, (Float) null, (iu30) null, this, 12) == d9nVar17) {
                        return d9nVar17;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 18:
                vr20 vr20Var2 = (vr20) this.c;
                d9n d9nVar18 = d9n.a;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    WifiManager wifiManager = (WifiManager) this.d;
                    Boolean boolValueOf = Boolean.valueOf(wifiManager != null ? wifiManager.isWifiEnabled() : true);
                    this.c = null;
                    this.b = true;
                    if (vr20Var2.emit(boolValueOf, this) == d9nVar18) {
                        return d9nVar18;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 19:
                ow71 ow71Var = (ow71) this.d;
                String str7 = ow71Var.a;
                iw71 iw71Var = (iw71) this.c;
                Context context = iw71Var.a;
                d9n d9nVar19 = d9n.a;
                boolean z20 = this.b;
                try {
                    if (!z20) {
                        hm5.M(obj);
                        bfd bfdVar = iw71Var.b;
                        op31 op31Var = iw71Var.d;
                        iyc0 iyc0Var = iw71Var.c;
                        cqf cqfVar = ow71Var.b;
                        String string = context.getString(2131962394, ow71Var.c);
                        String string2 = context.getString(2131962392);
                        this.b = true;
                        objP = k4p1.p(bfdVar, op31Var, iyc0Var, str7, cqfVar, string, string2, this);
                        if (objP == d9nVar19) {
                            return d9nVar19;
                        }
                    } else {
                        if (!z20) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objP = obj;
                    }
                    xrn xrnVar = (xrn) objP;
                    px71Var = new ox71(str7, xrnVar.a, xrnVar.b);
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused2) {
                    px71Var = new px71(str7);
                }
                iw71Var.f.accept(px71Var);
                return rih1.a;
            case 20:
                String str8 = (String) this.c;
                d9n d9nVar20 = d9n.a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    rsc0 rsc0Var3 = ((dx71) this.d).e;
                    rxc0 rxc0Var = new rxc0(str8);
                    this.c = null;
                    this.b = true;
                    objJ2 = rsc0Var3.j(rxc0Var, this);
                    if (objJ2 == d9nVar20) {
                        return d9nVar20;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objJ2 = obj;
                }
                qxc0 qxc0Var = (qxc0) ((py21) objJ2).c();
                if (qxc0Var != null) {
                    return Boolean.valueOf(qxc0Var.h);
                }
                return null;
            case 21:
                d9n d9nVar21 = d9n.a;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    by3 by3Var = (by3) ((yx11) this.c).b;
                    ef7 ef7Var = (ef7) this.d;
                    String str9 = ef7Var.d;
                    tv80 tv80Var = ef7Var.e;
                    this.b = true;
                    if (by3Var.a(str9, tv80Var, this) == d9nVar21) {
                        return d9nVar21;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 22:
                vr20 vr20Var3 = (vr20) this.c;
                d9n d9nVar22 = d9n.a;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    w2g1 w2g1Var = new w2g1();
                    m441 m441Var = (m441) this.d;
                    ip61 ip61Var = new ip61((Object) vr20Var3, (Object) w2g1Var, (byte) 8);
                    this.c = null;
                    this.b = true;
                    if (m441Var.collect(ip61Var, this) == d9nVar22) {
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
            case 23:
                d9n d9nVar23 = d9n.a;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    f210 f210Var = (f210) this.c;
                    String str10 = (String) ((r961) this.d).c;
                    this.b = true;
                    Object objA3 = f210Var.a(str10, this);
                    if (objA3 == d9nVar23) {
                        return d9nVar23;
                    }
                    obj2 = objA3;
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    obj2 = ((e331) obj).a;
                }
                return new e331(obj2);
            case 24:
                d9n d9nVar24 = d9n.a;
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
                rsc0 rsc0Var4 = (xrc0) ((yon) this.c).c;
                String str11 = (String) this.d;
                jqz0 jqz0Var = jqz0.a;
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                sku0 sku0VarP = PlaylistDecorationPolicy.p();
                sku0VarP.k0();
                hru0VarS.w(sku0VarP.build());
                trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0Var, (prc0) null, 0, (List) null, 478);
                this.b = true;
                Object objF = rsc0Var4.f(str11, trc0Var, this);
                return objF == d9nVar24 ? d9nVar24 : objF;
            case 25:
                d9n d9nVar25 = d9n.a;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    vnd1 vnd1Var = (vnd1) this.c;
                    this.b = true;
                    if (vnd1Var.t(this) == d9nVar25) {
                        return d9nVar25;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 26:
                ssw0 ssw0Var = (ssw0) this.c;
                d9n d9nVar26 = d9n.a;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    xab1 xab1VarT = fn31.T(ssw0Var, (o8n) null, 0, new ta9(ssw0Var, r8, (byte) 2), 3);
                    mr20 mr20VarA = ((oh81) this.d).a();
                    mib mibVar = new mib(xab1VarT, ssw0Var, (byte) 18);
                    this.c = null;
                    this.b = true;
                    if (mr20VarA.collect(mibVar, this) == d9nVar26) {
                        return d9nVar26;
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                d9n d9nVar27 = d9n.a;
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    hj01 hj01Var = ((ar81) this.c).g;
                    oo81 oo81Var = (oo81) this.d;
                    long j = oo81Var.c;
                    boolean z29 = !oo81Var.d;
                    this.b = true;
                    Object objD = hj01Var.d(j, z29, this);
                    if (objD == d9nVar27) {
                        return d9nVar27;
                    }
                    obj3 = objD;
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    obj3 = ((e331) obj).a;
                }
                return new e331(obj3);
            case 28:
                ev81 ev81Var = (ev81) this.d;
                vr20 vr20Var4 = (vr20) this.c;
                d9n d9nVar28 = d9n.a;
                boolean z30 = this.b;
                if (!z30) {
                    hm5.M(obj);
                    ezc ezcVarF = h4p1.f(new uk71((Object) ev81Var, (Object) ev81Var.d.b(false), (lnm) r8, (byte) 13));
                    this.c = null;
                    this.b = true;
                    if (l4p1.s(vr20Var4, ezcVarF, this) == d9nVar28) {
                        return d9nVar28;
                    }
                } else {
                    if (!z30) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                x791 x791Var = (x791) this.c;
                d9n d9nVar29 = d9n.a;
                boolean z31 = this.b;
                if (!z31) {
                    hm5.M(obj);
                    tv80 tv80Var2 = x791Var.a;
                    ruz ruzVar = ((w791) this.d).b;
                    String str12 = (tv80Var2 == null || (ou80Var = tv80Var2.a) == null) ? null : ou80Var.a;
                    SkipToNextTrackCommand$Builder skipToNextTrackCommand$BuilderBuilder = SkipToNextTrackCommand.builder();
                    if (str12 != null) {
                        skipToNextTrackCommand$BuilderBuilder.loggingParams(LoggingParams.builder().interactionId(str12).build());
                    }
                    Single singleA2 = ruzVar.a(new m9u0(skipToNextTrackCommand$BuilderBuilder.build()));
                    this.c = null;
                    this.b = true;
                    if (fc11.j(singleA2, this) == d9nVar29) {
                        return d9nVar29;
                    }
                } else {
                    if (!z31) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm61(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm61(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }
}
