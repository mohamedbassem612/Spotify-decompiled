package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import com.spotify.remoteconfig.commons.nebula.GetAttributesResponse;
import com.spotify.ucs.proto.v0.UcsResponseWrapper;
import com.spotify.useraccount.v1.AccountAttribute;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ro8 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ro8(Object obj, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = obj;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new ro8((to8) obj, lnmVar, (byte) 0);
            case 1:
                return new ro8(obj, lnmVar, (byte) 1);
            case 2:
                return new ro8((byte[]) obj, lnmVar, (byte) 2);
            case 3:
                return new ro8((uff) obj, lnmVar, (byte) 3);
            case 4:
                return new ro8((l0k) obj, lnmVar, (byte) 4);
            case 5:
                return new ro8((lwm) obj, lnmVar, (byte) 5);
            case 6:
                return new ro8((l1o) obj, lnmVar, (byte) 6);
            case 7:
                return new ro8((hvo) obj, lnmVar, (byte) 7);
            case 8:
                return new ro8((nqs) obj, lnmVar, (byte) 8);
            case 9:
                return new ro8((ryx) obj, lnmVar, (byte) 9);
            case 10:
                return new ro8((g6y) obj, lnmVar, (byte) 10);
            case 11:
                return new ro8((yzu) obj, lnmVar, (byte) 11);
            case 12:
                return new ro8((qj00) obj, lnmVar, (byte) 12);
            case 13:
                return new ro8((iib0) obj, lnmVar, (byte) 13);
            case 14:
                return new ro8((xdd0) obj, lnmVar, (byte) 14);
            case 15:
                return new ro8((x6h0) obj, lnmVar, (byte) 15);
            case 16:
                return new ro8((wuj0) obj, lnmVar, (byte) 16);
            case 17:
                return new ro8((g3d0) obj, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new ro8((b3s0) obj, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new ro8((niz0) obj, lnmVar, (byte) 19);
            case 20:
                return new ro8((ll01) obj, lnmVar, (byte) 20);
            case 21:
                return new ro8((kx11) obj, lnmVar, (byte) 21);
            case 22:
                return new ro8((zm41) obj, lnmVar, (byte) 22);
            case 23:
                return new ro8((wdm) obj, lnmVar, (byte) 23);
            case 24:
                return new ro8((yq91) obj, lnmVar, (byte) 24);
            case 25:
                return new ro8((j2e1) obj, lnmVar, (byte) 25);
            case 26:
                return new ro8((n4e1) obj, lnmVar, (byte) 26);
            case 27:
                return new ro8((bbc) obj, lnmVar, (byte) 27);
            case 28:
                return new ro8((ww21) obj, lnmVar, (byte) 28);
            default:
                return new ro8((SceneTemplate.TopSongsPlaylistContent.Card1) obj, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.ppb */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.qpb */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.rpb */
    public final Object invoke(Object obj) throws ppb, qpb, rpb {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 1:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 2:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 3:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 5:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 6:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 7:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 8:
                create(lnmVar).invokeSuspend(rih1Var);
                return Boolean.TRUE;
            case 9:
                create(lnmVar).invokeSuspend(rih1Var);
                return Boolean.TRUE;
            case 10:
                ro8 ro8VarCreate = create(lnmVar);
                hm5.M(rih1Var);
                return (g6y) ro8VarCreate.b;
            case 11:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 12:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 13:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 14:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 15:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 16:
                ro8 ro8VarCreate2 = create(lnmVar);
                hm5.M(rih1Var);
                return (wuj0) ro8VarCreate2.b;
            case 17:
                ro8 ro8VarCreate3 = create(lnmVar);
                hm5.M(rih1Var);
                return (g3d0) ro8VarCreate3.b;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create(lnmVar).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 20:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 21:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 22:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 24:
                create(lnmVar).invokeSuspend(rih1Var);
                return Boolean.TRUE;
            case 25:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 26:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create(lnmVar).invokeSuspend(rih1Var);
                return Boolean.TRUE;
            default:
                return create(lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.ppb */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.qpb */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.rpb */
    public final Object invokeSuspend(Object obj) throws ppb, qpb, rpb {
        String strValueOf;
        boolean z = true;
        switch (this.a) {
            case 0:
                hm5.M(obj);
                return ((to8) this.b).b;
            case 1:
                hm5.M(obj);
                Object obj2 = this.b;
                hm5.M(obj2);
                sy21 sy21Var = (sy21) obj2;
                if (!sy21Var.a.Q0) {
                    throw ppb.a;
                }
                GetAttributesResponse getAttributesResponse = (GetAttributesResponse) sy21Var.b;
                if (getAttributesResponse == null) {
                    throw rpb.a;
                }
                byte[] bArr = new byte[0];
                zfo0 zfo0VarP = z0o1.p(getAttributesResponse);
                List list = zfo0VarP.b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Logger.k("Skipping product state attribute %s with invalid timestamp", new Object[]{(String) it.next()});
                }
                uch1 uch1VarR = UcsResponseWrapper.AccountAttributesResponse.r();
                uch1VarR.n(zfo0VarP.a);
                UcsResponseWrapper.AccountAttributesResponse accountAttributesResponseBuild = uch1VarR.build();
                if (accountAttributesResponseBuild.o() == 0) {
                    throw new qpb(list);
                }
                Map mapP = accountAttributesResponseBuild.p();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapP.entrySet()) {
                    if (((AccountAttribute) entry.getValue()).q() != rk.d) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    AccountAttribute accountAttribute = (AccountAttribute) entry2.getValue();
                    rk rkVarQ = accountAttribute.q();
                    int i = rkVarQ == null ? -1 : juw0.a[rkVarQ.ordinal()];
                    if (i == -1) {
                        eg.m("valuecase is null");
                        return null;
                    }
                    if (i == 1) {
                        strValueOf = accountAttribute.getBoolValue() ? "1" : "0";
                    } else if (i == 2) {
                        strValueOf = String.valueOf(accountAttribute.p());
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                eg.o();
                                return null;
                            }
                            eg.m("value not set");
                            return null;
                        }
                        strValueOf = accountAttribute.getStringValue().toString();
                    }
                    linkedHashMap2.put(key, strValueOf);
                }
                return new kzr0(new npb(bArr, linkedHashMap2, accountAttributesResponseBuild.toByteArray()), list);
            case 2:
                hm5.M(obj);
                return ResolveResponse.q((byte[]) this.b);
            case 3:
                hm5.M(obj);
                return ((uff) this.b).e.c;
            case 4:
                hm5.M(obj);
                return ((l0k) this.b).b;
            case 5:
                hm5.M(obj);
                return ((lwm) this.b).f;
            case 6:
                hm5.M(obj);
                return ((l1o) this.b).c;
            case 7:
                hm5.M(obj);
                return ((hvo) this.b).c;
            case 8:
                hm5.M(obj);
                nqs nqsVar = (nqs) this.b;
                nqsVar.c.invoke(nqsVar, kub1.X);
                return Boolean.TRUE;
            case 9:
                hm5.M(obj);
                ((ryx) this.b).dismiss();
                return Boolean.TRUE;
            case 10:
                hm5.M(obj);
                return (g6y) this.b;
            case 11:
                hm5.M(obj);
                if (((k9r) ((yzu) this.b).b).q()) {
                    return "spotify:internal:equalizer";
                }
                return null;
            case 12:
                hm5.M(obj);
                return ((qj00) this.b).k;
            case 13:
                hm5.M(obj);
                return ((iib0) this.b).c;
            case 14:
                hm5.M(obj);
                return ((xdd0) this.b).a;
            case 15:
                hm5.M(obj);
                return ((x6h0) this.b).b;
            case 16:
                hm5.M(obj);
                return (wuj0) this.b;
            case 17:
                hm5.M(obj);
                return (g3d0) this.b;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                b3s0 b3s0Var = (b3s0) this.b;
                if (b3s0Var.a.e0().U()) {
                    z = false;
                } else {
                    rm5 rm5Var = b3s0Var.f;
                    cj3 cj3Var = (cj3) rm5Var.a;
                    int iA = cj3Var.a();
                    if (iA == 0) {
                        long jB = ((yqg) rm5Var.b).b();
                        dma1 dma1Var = cj3Var.c;
                        if (dma1Var == null) {
                            eg.m("setup needs to be called first");
                            return null;
                        }
                        hma1 hma1VarEdit = dma1Var.edit();
                        hma1VarEdit.c(cj3.d, jB);
                        hma1VarEdit.g();
                    }
                    int i2 = iA + 1;
                    dma1 dma1Var2 = cj3Var.c;
                    if (dma1Var2 == null) {
                        eg.m("setup needs to be called first");
                        return null;
                    }
                    hma1 hma1VarEdit2 = dma1Var2.edit();
                    hma1VarEdit2.b(cj3.e, i2);
                    hma1VarEdit2.g();
                    oi oiVar = b3s0Var.h;
                    slc0 slc0Var = new slc0(UUID.randomUUID().toString());
                    int iA2 = b3s0Var.g.a();
                    if (oiVar.b) {
                        aj3 aj3Var = (aj3) oiVar.d;
                        c921.y(aj3Var.g, (o8n) null, 0, new zi3(aj3Var, slc0Var, iA2, (lnm) null, (byte) 0), 3);
                    } else {
                        th30 th30VarE0 = ((gj5) ((cp5) oiVar.c).b).e0();
                        if (!th30VarE0.U()) {
                            pi3 pi3Var = new pi3();
                            Bundle bundle = new Bundle();
                            bundle.putInt("times_shown_extra", iA2);
                            pi3Var.T0(bundle);
                            zf30 zf30VarG = th30VarE0.G("AlexaAccountLinkingBottomSheet");
                            dwb dwbVar = zf30VarG instanceof dwb ? (dwb) zf30VarG : null;
                            if (dwbVar != null) {
                                dwbVar.dismiss();
                            }
                            pi3Var.g1(th30VarE0, "AlexaAccountLinkingBottomSheet");
                        }
                    }
                }
                return Boolean.valueOf(z);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                return ((niz0) this.b).c;
            case 20:
                hm5.M(obj);
                return new gl01(((ll01) this.b).a.a, 0);
            case 21:
                hm5.M(obj);
                return ((kx11) this.b).c;
            case 22:
                hm5.M(obj);
                klm klmVar = ((zm41) this.b).e;
                klmVar.g = hnb1.d;
                for (Map.Entry entry3 : o7h.T0(klmVar.d.entrySet())) {
                    if (klmVar.h == null) {
                        u890.C("scopeName");
                        throw null;
                    }
                    Objects.toString(entry3.getKey());
                    ((dwo) entry3.getValue()).shutdown();
                }
                for (jlq0 jlq0Var : klmVar.f) {
                    if (klmVar.h == null) {
                        u890.C("scopeName");
                        throw null;
                    }
                    jlq0Var.getClass();
                    jlq0Var.c();
                }
                klmVar.g = gnb1.d;
                return rih1.a;
            case 23:
                hm5.M(obj);
                return (String) ((wdm) this.b).f;
            case 24:
                hm5.M(obj);
                ((yq91) this.b).b(3);
                return Boolean.TRUE;
            case 25:
                hm5.M(obj);
                Uri uri = ((j2e1) this.b).d;
                if (uri != null) {
                    return new bkc0(uri.toString(), (String) null, 62, (String) null);
                }
                return null;
            case 26:
                hm5.M(obj);
                ((n4e1) this.b).U0.u.setValue(Boolean.FALSE);
                return rih1.a;
            case 27:
                hm5.M(obj);
                bbc bbcVar = (bbc) this.b;
                rih1 rih1Var = rih1.a;
                bbcVar.l(rih1Var);
                return rih1Var;
            case 28:
                hm5.M(obj);
                ((ww21) this.b).invoke();
                return Boolean.TRUE;
            default:
                hm5.M(obj);
                return Collections.singletonList(new bk41("topSongsPlaylistLayer", Collections.singletonList(new jdf1(new o2b1(new wcf1((SceneTemplate.TopSongsPlaylistContent.Card1) this.b, (byte) 1), (byte) 11)))));
        }
    }
}
