package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ku91 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku91(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return new ku91((adn) this.b, (dw91) obj3, (iu30) obj2, lnmVar, (byte) 0);
            case 1:
                return new ku91((ab8) this.b, (jmb1) obj3, (tv80) obj2, lnmVar, (byte) 1);
            case 2:
                ku91 ku91Var = new ku91((v0b1) obj3, (PlayerState) obj2, lnmVar, (byte) 2);
                ku91Var.b = obj;
                return ku91Var;
            case 3:
                return new ku91((String) this.b, (res) obj3, (ven0) obj2, lnmVar, (byte) 3);
            case 4:
                ku91 ku91Var2 = new ku91((gfb1) obj3, (List) obj2, lnmVar, (byte) 4);
                ku91Var2.b = obj;
                return ku91Var2;
            case 5:
                return new ku91((cn30) this.b, (String) obj3, (yib1) obj2, lnmVar, (byte) 5);
            case 6:
                return new ku91((h6c1) this.b, (Uri) obj3, (l420) obj2, lnmVar, (byte) 6);
            case 7:
                return new ku91((wbc1) this.b, (o0i) obj3, (ubc1) obj2, lnmVar, (byte) 7);
            case 8:
                return new ku91((muc1) this.b, (jwc1) obj3, (pd21) obj2, lnmVar, (byte) 8);
            case 9:
                return new ku91((guc1) this.b, (muc1) obj3, (kwc1) obj2, lnmVar, (byte) 9);
            case 10:
                ku91 ku91Var3 = new ku91((z4e1) obj3, (nav0) obj2, lnmVar, (byte) 10);
                ku91Var3.b = obj;
                return ku91Var3;
            case 11:
                ku91 ku91Var4 = new ku91((r7e1) obj3, (nav0) obj2, lnmVar, (byte) 11);
                ku91Var4.b = obj;
                return ku91Var4;
            case 12:
                return new ku91((c7f1) this.b, (c380) obj3, (rk41) obj2, lnmVar, (byte) 12);
            case 13:
                return new ku91((Integer) this.b, (rk41) obj3, (ven0) obj2, lnmVar, (byte) 13);
            case 14:
                return new ku91((gdf1) this.b, (rk41) obj3, (d3k) obj2, lnmVar, (byte) 14);
            case 15:
                return new ku91((gff1) this.b, (String) obj3, (tv80) obj2, lnmVar, (byte) 15);
            case 16:
                return new ku91((ven0) this.b, (guf1) obj3, (iu30) obj2, lnmVar, (byte) 16);
            case 17:
                return new ku91((jwf1) this.b, (String) obj3, (jmb1) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new ku91((jwf1) this.b, (unb1) obj3, (tv80) obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new ku91((g061) this.b, (List) obj3, (iu30) obj2, lnmVar, (byte) 19);
            case 20:
                return new ku91((twg1) this.b, (rwg1) obj3, (tqw) obj2, lnmVar, (byte) 20);
            case 21:
                ku91 ku91Var5 = new ku91((List) obj3, (fyh1) obj2, lnmVar, (byte) 21);
                ku91Var5.b = obj;
                return ku91Var5;
            case 22:
                return new ku91((w9i1) this.b, (Function0) obj3, (ven0) obj2, lnmVar, (byte) 22);
            case 23:
                ku91 ku91Var6 = new ku91((hii1) obj3, obj2, lnmVar, (byte) 23);
                ku91Var6.b = obj;
                return ku91Var6;
            case 24:
                return new ku91((fni1) this.b, (coi1) obj3, (bni1) obj2, lnmVar, (byte) 24);
            case 25:
                ku91 ku91Var7 = new ku91((bcj1) obj3, (rzo0) obj2, lnmVar, (byte) 25);
                ku91Var7.b = ((gq0) obj).a;
                return ku91Var7;
            case 26:
                return new ku91((woa) this.b, (o2u0) obj3, (fv0) obj2, lnmVar, (byte) 26);
            case 27:
                ku91 ku91Var8 = new ku91((wcj1) obj3, (rzo0) obj2, lnmVar, (byte) 27);
                ku91Var8.b = ((gq0) obj).a;
                return ku91Var8;
            case 28:
                ku91 ku91Var9 = new ku91((qma) obj3, (upy0) obj2, lnmVar, (byte) 28);
                ku91Var9.b = obj;
                return ku91Var9;
            default:
                return new ku91((hke) this.b, (jmb1) obj3, (tv80) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                return create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((Map) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((cen0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                String str = ((gq0) obj).a;
                ku91 ku91Var = new ku91((bcj1) obj4, (rzo0) obj3, (lnm) obj2, (byte) 25);
                ku91Var.b = str;
                ku91Var.invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                String str2 = ((gq0) obj).a;
                ku91 ku91Var2 = new ku91((wcj1) obj4, (rzo0) obj3, (lnm) obj2, (byte) 27);
                ku91Var2.b = str2;
                ku91Var2.invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) throws Exception {
        String str;
        Integer num;
        String strA;
        bpb1 bpb1Var;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Long l;
        Object value5;
        Map map;
        LinkedHashMap linkedHashMap;
        Collection<kuc1> collectionValues;
        int i;
        m231 m231Var;
        byte b = this.a;
        long length = 0;
        hf0Var = null;
        hf0Var = null;
        hf0Var = null;
        hf0 hf0Var = null;
        m231 m231Var2 = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                hm5.M(obj);
                zhd zhdVar = ((adn) this.b).g;
                if (zhdVar != null && (str = zhdVar.c) != null && (num = (Integer) ((dw91) obj2).get(str)) != null) {
                    ((iu30) obj3).invoke(new kcn(str, num.intValue()));
                }
                return m231Var2;
            case 1:
                hm5.M(obj);
                ab8 ab8Var = (ab8) this.b;
                vgm.b(ab8Var.b, ((jmb1) obj2).a.a, ab8Var.c.a, (tv80) obj3, (tgm) null, 8);
                return m231Var2;
            case 2:
                PlayerState playerState = (PlayerState) obj3;
                v0b1 v0b1Var = (v0b1) obj2;
                fza1 fza1Var = v0b1Var.a;
                mmr0 mmr0Var = (mmr0) this.b;
                hm5.M(obj);
                ji0 ji0Var = (ji0) mmr0Var.a;
                if (l4o1.E((ContextTrack) mmr0Var.b) || !fza1Var.b(playerState.contextUri())) {
                    return null;
                }
                if ((ji0Var == null || (strA = ji0Var.c) == null) && (strA = fza1Var.a(playerState.contextUri())) == null) {
                    return null;
                }
                return new vyo0(new x0b1(ji0Var != null ? ji0Var.a : null, strA, playerState.contextUri()), (c1b1) v0b1Var.e.getValue());
            case 3:
                hm5.M(obj);
                if (ihc1.y0((String) this.b) && ((Boolean) ((ven0) obj3).getValue()).booleanValue()) {
                    ((wen0) ((res) obj2).e).l((Object) null);
                }
                return m231Var2;
            case 4:
                Map map2 = (Map) this.b;
                hm5.M(obj);
                bpb1 bpb1Var2 = ((gfb1) obj2).a;
                List list = (List) obj3;
                do {
                    bpb1Var = bpb1Var2;
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, sqg0.O(sqg0.L((Map) value, o7h.p1(list)), map2)));
                return m231Var2;
            case 5:
                hm5.M(obj);
                ser serVar = ((cn30) this.b).b;
                String str2 = nik1.y5.a;
                Bundle bundle = new Bundle();
                bundle.putParcelable("start.jam.confirmation.join.request.sheet.args", (yib1) obj3);
                serVar.a((String) obj2, str2, bundle);
                return m231Var2;
            case 6:
                hm5.M(obj);
                h6c1 h6c1Var = (h6c1) this.b;
                Uri uri = (Uri) obj2;
                InputStream inputStreamOpenInputStream = h6c1Var.c.getContentResolver().openInputStream(uri.getScheme() == null ? uri.buildUpon().scheme("file").build() : uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        Uri uriL = h6c1Var.e.L(inputStreamOpenInputStream, (l420) obj3);
                        inputStreamOpenInputStream.close();
                        if (uriL != null) {
                            return uriL;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u890.p(inputStreamOpenInputStream, th);
                            throw th2;
                        }
                    }
                }
                k220.i(h4b1.d(uri, "Unable to copy video "));
                return null;
            case 7:
                hm5.M(obj);
                mv2 mv2Var = ((wbc1) this.b).c;
                o0i o0iVar = (o0i) obj2;
                ubc1 ubc1Var = (ubc1) obj3;
                String str3 = ubc1Var.h;
                vpl vplVarA = ubc1Var.a();
                mv2Var.z(o0iVar, str3, vplVarA != null ? vplVarA.j() : null);
                return m231Var2;
            case 8:
                hm5.M(obj);
                muc1 muc1Var = (muc1) this.b;
                bpb1 bpb1Var3 = muc1Var.d;
                jwc1 jwc1Var = (jwc1) obj2;
                kuc1 kuc1Var = (kuc1) ((Map) bpb1Var3.getValue()).get(jwc1Var.a());
                md21 md21Var = (pd21) obj3;
                if (kuc1Var == null) {
                    Objects.toString(md21Var);
                } else {
                    kwc1 kwc1Var = kuc1Var.b;
                    guc1 guc1Var = kuc1Var.a;
                    int i2 = kuc1Var.c;
                    if (md21Var.equals(nd21.a)) {
                        if (i2 == 1) {
                            kuc1 kuc1Var2 = new kuc1(guc1Var, kwc1Var, 2);
                            do {
                                value3 = bpb1Var3.getValue();
                            } while (!bpb1Var3.k(value3, sqg0.P((Map) value3, new mmr0(kuc1Var2.a.c.a(), kuc1Var2))));
                            vvc1 vvc1Var = muc1Var.a;
                            ros0 ros0Var = new ros0(sqg0.P(vvc1Var.a().a, new mmr0("nudge", Long.valueOf(vvc1Var.a.b()))));
                            hma1 hma1VarEdit = ((dma1) vvc1Var.e.getValue()).edit();
                            hma1VarEdit.d(wvc1.a, vvc1Var.d.b(ros0.Companion.serializer(), ros0Var));
                            hma1VarEdit.g();
                            muc1Var.b.u(new rvc1(kwc1Var.e(), jwc1Var.a(), guc1Var.a.e()));
                            kuc1Var.c().h(bvc1.a);
                        }
                    } else if (md21Var instanceof md21) {
                        nfu nfuVar = md21Var.a;
                        Objects.toString(nfuVar);
                        muc1Var.a(kuc1Var, nfuVar);
                        kuc1Var.c().h(new avc1(nfuVar));
                        do {
                            value2 = bpb1Var3.getValue();
                        } while (!bpb1Var3.k(value2, sqg0.K(jwc1Var.a(), (Map) value2)));
                    } else {
                        if (!(md21Var instanceof od21)) {
                            eg.o();
                            return null;
                        }
                        if (i2 == 2) {
                            kuc1Var.c().h(new dvc1(((od21) md21Var).a));
                        }
                    }
                }
                return m231Var2;
            case 9:
                kwc1 kwc1Var2 = (kwc1) obj3;
                hm5.M(obj);
                guc1 guc1Var2 = (guc1) this.b;
                muc1 muc1Var2 = (muc1) obj2;
                bpb1 bpb1Var4 = muc1Var2.d;
                if (guc1Var2 == null) {
                    String strE = kwc1Var2.e();
                    do {
                        value5 = bpb1Var4.getValue();
                        map = (Map) value5;
                        linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (u890.j(((kuc1) entry.getValue()).b.e(), strE)) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        collectionValues = linkedHashMap.values();
                    } while (!bpb1Var4.k(value5, sqg0.L(map, linkedHashMap.keySet())));
                    if (!collectionValues.isEmpty()) {
                        collectionValues.size();
                    }
                    for (kuc1 kuc1Var3 : collectionValues) {
                        lfu lfuVar = lfu.a;
                        muc1Var2.a(kuc1Var3, lfuVar);
                        kuc1Var3.c().h(new avc1(lfuVar));
                    }
                } else {
                    bxt bxtVar = guc1Var2.a;
                    jwc1 jwc1Var2 = guc1Var2.c;
                    esa1 esa1Var = muc1Var2.b;
                    kuc1 kuc1Var4 = (kuc1) ((Map) bpb1Var4.getValue()).get(jwc1Var2.a());
                    if (kuc1Var4 == null || u890.j(kuc1Var4.b.e(), kwc1Var2.e())) {
                        vvc1 vvc1Var2 = muc1Var2.a;
                        tdp0 tdp0Var = (tdp0) vvc1Var2.b.get("nudge");
                        if (tdp0Var != null) {
                            long jA = tdp0Var.a.a();
                            if (jA > 0 && (l = (Long) vvc1Var2.a().a.get("nudge")) != null) {
                                long jB = jA - (vvc1Var2.a.b() - l.longValue());
                                if (jB > 0) {
                                    hf0Var = new hf0(jB);
                                }
                            }
                        }
                        if (hf0Var != null) {
                            jwc1Var2.getClass();
                            esa1Var.u(new svc1(kwc1Var2.e(), jwc1Var2.a(), bxtVar.e(), "COOLDOWN"));
                            kwc1Var2.h(new cvc1(new ak11(hf0Var.a)));
                        } else {
                            jwc1Var2.getClass();
                            kuc1 kuc1Var5 = (kuc1) ((Map) bpb1Var4.getValue()).get(jwc1Var2.a());
                            if (kuc1Var5 != null) {
                                jwc1Var2.getClass();
                                hfu hfuVar = hfu.a;
                                muc1Var2.a(kuc1Var5, hfuVar);
                                kuc1Var5.c().h(new avc1(hfuVar));
                            }
                            jwc1Var2.getClass();
                            esa1Var.u(new nvc1(kwc1Var2.e(), jwc1Var2.a(), bxtVar.e()));
                            kuc1 kuc1Var6 = new kuc1(guc1Var2, kwc1Var2, 1);
                            do {
                                value4 = bpb1Var4.getValue();
                            } while (!bpb1Var4.k(value4, sqg0.P((Map) value4, new mmr0(jwc1Var2.a(), kuc1Var6))));
                        }
                    } else {
                        jwc1Var2.getClass();
                        esa1Var.u(new svc1(kwc1Var2.e(), jwc1Var2.a(), bxtVar.e(), "SURFACE_OCCUPIED"));
                        kwc1Var2.h(new cvc1(bk11.a));
                    }
                }
                return m231Var2;
            case 10:
                hm5.M(obj);
                c9n c9nVar = (c9n) this.b;
                z4e1 z4e1Var = (z4e1) obj2;
                r7e1 r7e1Var = z4e1Var.S0;
                nav0 nav0Var = (nav0) obj3;
                qga0 qga0Var = new qga0(r7e1Var, z4e1Var, (byte) 20);
                fn31.T(c9nVar, (o8n) null, 4, new x4e1(r7e1Var, nav0Var, (lnm) null, (byte) 0), 1);
                fn31.T(c9nVar, (o8n) null, 4, new p651(z4e1Var, r7e1Var, nav0Var, qga0Var, (lnm) null, (byte) 26), 1);
                fn31.T(c9nVar, (o8n) null, 4, new bfb1(r7e1Var, nav0Var, qga0Var, (lnm) null, (byte) 9), 1);
                return m231Var2;
            case 11:
                hm5.M(obj);
                c9n c9nVar2 = (c9n) this.b;
                r7e1 r7e1Var2 = (r7e1) obj2;
                nav0 nav0Var2 = (nav0) obj3;
                fn31.T(c9nVar2, (o8n) null, 4, new x4e1(r7e1Var2, nav0Var2, (lnm) null, (byte) 1), 1);
                fn31.T(c9nVar2, (o8n) null, 4, new x4e1(r7e1Var2, nav0Var2, (lnm) null, (byte) 2), 1);
                return fn31.T(c9nVar2, (o8n) null, 4, new x4e1(nav0Var2, r7e1Var2, (lnm) null), 1);
            case 12:
                hm5.M(obj);
                c7f1 c7f1Var = (c7f1) this.b;
                c7f1Var.e.invoke();
                cxm.x((r6f1) ((c380) obj2).get(0), 0, c7f1Var.a.a, (xgm1) ((rk41) obj3).c, c7f1Var.f);
                return m231Var2;
            case 13:
                hm5.M(obj);
                pxg1 pxg1Var = acf1.a;
                egm1 egm1Var = ((wgm1) ((ven0) obj3).getValue()).c;
                Integer num2 = egm1Var.b;
                Integer num3 = (Integer) this.b;
                if (!u890.j(num2, num3) || !egm1Var.c) {
                    ((xgm1) ((rk41) obj2).c).a(new qgm1(num3, true));
                }
                return m231Var2;
            case 14:
                d3k d3kVar = (d3k) obj3;
                hm5.M(obj);
                gdf1 gdf1Var = (gdf1) this.b;
                ejj1 ejj1Var = gdf1Var.c;
                if (gdf1Var.g()) {
                    if (((rk41) obj2).a || d3kVar != null) {
                        ejj1Var.d().f();
                    } else {
                        ejj1Var.f();
                    }
                    if (d3kVar != null) {
                        Logger.k("TopSongJourneyVideoScene playback failure: %s", new Object[]{d3kVar});
                    }
                }
                return m231Var2;
            case 15:
                hm5.M(obj);
                ((gff1) this.b).b.b(new dmf1((String) obj2, nik1.y4, null, new vsf1((String) null, (String) null, false, (String) null, false, false, true, false, false, true, (String) null, false, false, false, true, false, (ugo0) null, (ok51) null, false, (g371) null, false, false, false, false, false, false, false, false, (p860) null, (String) null, false, false, -42465, 63), null), (tv80) obj3);
                return m231Var2;
            case 16:
                hm5.M(obj);
                ven0 ven0Var = (ven0) this.b;
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    guf1 guf1Var = (guf1) obj2;
                    if (guf1Var.d && u890.j(guf1Var.f.h, n091.a)) {
                        ven0Var.setValue(Boolean.FALSE);
                        ((iu30) obj3).invoke(buf1.a);
                    }
                }
                return m231Var2;
            case 17:
                hm5.M(obj);
                yh2 yh2Var = ((jwf1) this.b).i;
                String str4 = (String) obj2;
                sz6 sz6Var = ((jmb1) obj3).b.l;
                sz6 sz6Var2 = sz6Var instanceof sz6 ? sz6Var : null;
                yh2Var.b(str4, sz6Var2 != null ? sz6Var2.c : null);
                return m231Var2;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                ((jwf1) this.b).e.d(((unb1) obj2).a.a, nik1.z0.a, (tv80) obj3, new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -11, 1));
                return m231Var2;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                Set setE = ha71.E((g061) this.b);
                List listZ0 = o7h.Z0(setE);
                List list2 = (List) obj2;
                ArrayList<gx31> arrayList = new ArrayList();
                Iterator it = listZ0.iterator();
                while (it.hasNext()) {
                    Object objT0 = o7h.t0(((Number) it.next()).intValue(), list2);
                    gx31 gx31Var = objT0 instanceof gx31 ? (gx31) objT0 : null;
                    if (gx31Var != null) {
                        arrayList.add(gx31Var);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Integer(((gx31) it2.next()).a));
                }
                boolean zY = setE.isEmpty() ? false : ha71.y(list2, setE);
                iu30 iu30Var = (iu30) obj3;
                int iS = zno1.s(q7h.U(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                for (gx31 gx31Var2 : arrayList) {
                    linkedHashMap2.put(String.valueOf(gx31Var2.a), gx31Var2.c);
                }
                gx31 gx31Var3 = (gx31) o7h.s0(arrayList);
                long j = gx31Var3 != null ? gx31Var3.b : 0L;
                gx31 gx31Var4 = (gx31) o7h.s0(arrayList);
                iu30Var.invoke(new sw31(arrayList2, zY, linkedHashMap2, j, gx31Var4 != null ? gx31Var4.d : false));
                return m231Var2;
            case 20:
                hm5.M(obj);
                tqw tqwVar = (tqw) obj3;
                ((twg1) this.b).a.a(((rwg1) obj2).a, tqwVar != null ? n3o1.y(tqwVar) : null, (Bundle) null);
                return m231Var2;
            case 21:
                fyh1 fyh1Var = (fyh1) obj3;
                c9n c9nVar3 = (c9n) this.b;
                ArrayList arrayListJ = hrt.j(obj);
                List list3 = (List) obj2;
                int size = list3.size() - 3;
                int i3 = size >= 0 ? size : 0;
                try {
                    for (Uri uri2 : o7h.d1(list3, 3)) {
                        op71.x(c9nVar3.J());
                        File fileB = fyh1Var.b(uri2);
                        if (fileB == null) {
                            i = i3 + 1;
                            yah0.p(i3);
                        } else if (fileB.length() > 2097152 || fileB.length() + length > 5242880) {
                            fileB.delete();
                            i = i3 + 1;
                            yah0.p(i3);
                        } else {
                            arrayListJ.add(fileB);
                            length += fileB.length();
                        }
                        i3 = i;
                    }
                    return new gs70(arrayListJ, i3);
                } catch (Exception e) {
                    fyh1Var.getClass();
                    fyh1.d(arrayListJ);
                    throw e;
                }
            case 22:
                hm5.M(obj);
                if (u890.j((Boolean) ((ven0) obj3).getValue(), Boolean.FALSE)) {
                    ((w9i1) this.b).W((Function0) obj2);
                }
                return m231Var2;
            case 23:
                cen0 cen0Var = (cen0) this.b;
                hm5.M(obj);
                cen0Var.a(oqo1.o((hii1) obj2), obj3);
                return m231Var2;
            case 24:
                hm5.M(obj);
                ymi1 ymi1VarC = ((fni1) this.b).c();
                coi1 coi1Var = (coi1) obj2;
                boolean z = ((bni1) obj3).l;
                i8h1 i8h1Var = ymi1VarC.a;
                brl0 brl0Var = ymi1VarC.c;
                y2m0 y2m0VarP = tro1.p(coi1Var);
                brl0Var.getClass();
                x6h1 x6h1VarC = brl0Var.b.c();
                x6h1VarC.i.add(new a7h1("scanning_state", (String) null, (Integer) null, (String) null, y2m0VarP.a));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = brl0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                if (coi1Var instanceof zni1) {
                    brl0 brl0Var2 = ymi1VarC.c;
                    brl0Var2.getClass();
                    x6h1 x6h1VarC2 = brl0Var2.b.c();
                    x6h1VarC2.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA2;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var2.e = brl0Var2.c;
                    i8h1Var.f(k7h1Var2.a(), (Set) null);
                }
                if (z) {
                    brl0 brl0Var3 = ymi1VarC.c;
                    brl0Var3.getClass();
                    x6h1 x6h1VarC3 = brl0Var3.b.c();
                    x6h1VarC3.i.add(new a7h1("show_qr_code_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC3.a();
                    k7h1 k7h1Var3 = new k7h1();
                    ((xjn) k7h1Var3).a = y6h1VarA3;
                    ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var3.e = brl0Var3.c;
                    i8h1Var.f(k7h1Var3.a(), (Set) null);
                }
                return m231Var2;
            case 25:
                String str5 = (String) this.b;
                hm5.M(obj);
                rzo0 rzo0Var = (rzo0) obj3;
                if (rzo0Var != null) {
                    rzo0Var.F(str5, vbh1.W0);
                }
                return m231Var2;
            case 26:
                hm5.M(obj);
                return woa.a((woa) this.b, "embedded-npv-video-sb", (o2u0) obj2, (w2k1) null, (kma) null, Collections.singletonList((fv0) obj3), false, (bas) null, (sn10) null, 1004);
            case 27:
                String str6 = (String) this.b;
                hm5.M(obj);
                rzo0 rzo0Var2 = (rzo0) obj3;
                if (rzo0Var2 != null) {
                    rzo0Var2.F(str6, vbh1.X0);
                }
                return m231Var2;
            case 28:
                hm5.M(obj);
                try {
                    ((huh0) ((upy0) obj3).X).b(fho1.w((qma) obj2));
                    m231Var = m231Var2;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th3) {
                    m231Var = new m231(th3);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    Logger.l(thA, "Failed to update prefetch profile config", new Object[0]);
                }
                return m231Var2;
            default:
                hm5.M(obj);
                vgm.b((vgm) ((hke) this.b).d, ((jmb1) obj2).a.a, (String) null, (tv80) obj3, (tgm) null, 10);
                return m231Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku91(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }
}
