package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.accessory.categorizer.CategorizerResponse;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hb1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hb1(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
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
                return new hb1((bb1) this.b, (az20) obj3, (k6a1) obj2, lnmVar, (byte) 0);
            case 1:
                return new hb1((wen0) this.b, (vh1) obj3, (rh1) obj2, lnmVar, (byte) 1);
            case 2:
                return new hb1((kbf0) this.b, (ven0) obj3, (ven0) obj2, lnmVar, (byte) 2);
            case 3:
                return new hb1((wm1) this.b, (tm1) obj3, (tqw) obj2, lnmVar, (byte) 3);
            case 4:
                hb1 hb1Var = new hb1((String) obj3, (xtb0) obj2, lnmVar, (byte) 4);
                hb1Var.b = obj;
                return hb1Var;
            case 5:
                return new hb1((mj11) this.b, (upo) obj3, (ven0) obj2, lnmVar, (byte) 5);
            case 6:
                return new hb1((fu1) this.b, (ven0) obj3, (Function0) obj2, lnmVar, (byte) 6);
            case 7:
                return new hb1((String) this.b, (Bundle) obj3, (ra2) obj2, lnmVar, (byte) 7);
            case 8:
                return new hb1((bb3) this.b, (uv11) obj3, (tv80) obj2, lnmVar, (byte) 8);
            case 9:
                return new hb1((bb3) this.b, (jmb1) obj3, (tv80) obj2, lnmVar, (byte) 9);
            case 10:
                return new hb1((tv80) this.b, (se3) obj3, (String) obj2, lnmVar, (byte) 10);
            case 11:
                return new hb1((tv80) this.b, (re3) obj3, (String) obj2, lnmVar, (byte) 11);
            case 12:
                return new hb1((te3) this.b, (jmb1) obj3, (tv80) obj2, lnmVar, (byte) 12);
            case 13:
                return new hb1((te3) this.b, (uv11) obj3, (tv80) obj2, lnmVar, (byte) 13);
            case 14:
                return new hb1((a2r0) this.b, (String) obj3, (p791) obj2, lnmVar, (byte) 14);
            case 15:
                return new hb1((ven0) this.b, (nw4) obj3, (String) obj2, lnmVar, (byte) 15);
            case 16:
                hb1 hb1Var2 = new hb1((lw21) obj3, (kly0) obj2, lnmVar, (byte) 16);
                hb1Var2.b = obj;
                return hb1Var2;
            case 17:
                return new hb1((my6) this.b, (ke2) obj3, (tv80) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new hb1((my6) this.b, (unb1) obj3, (tv80) obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                hb1 hb1Var3 = new hb1((l811) obj3, (r091) obj2, lnmVar, (byte) 19);
                hb1Var3.b = obj;
                return hb1Var3;
            case 20:
                return new hb1((ven0) this.b, (Float) obj3, (String) obj2, lnmVar, (byte) 20);
            case 21:
                return new hb1((Function0) this.b, (wdm) obj3, (ny7) obj2, lnmVar, (byte) 21);
            case 22:
                return new hb1((ab8) this.b, (unb1) obj3, (tv80) obj2, lnmVar, (byte) 22);
            case 23:
                return new hb1((Function0) this.b, (ven0) obj3, (ven0) obj2, lnmVar, (byte) 23);
            case 24:
                return new hb1((bo8) this.b, (String) obj3, (lik1) obj2, lnmVar, (byte) 24);
            case 25:
                return new hb1((sga) this.b, (String) obj3, (vga) obj2, lnmVar, (byte) 25);
            case 26:
                hb1 hb1Var4 = new hb1((m911) obj3, (String) obj2, lnmVar, (byte) 26);
                hb1Var4.b = obj;
                return hb1Var4;
            case 27:
                return new hb1((eus0) this.b, (iu30) obj3, (ven0) obj2, lnmVar, (byte) 27);
            case 28:
                return new hb1((cgb) this.b, (String) obj3, (CategorizerResponse) obj2, lnmVar, (byte) 28);
            default:
                hb1 hb1Var5 = new hb1((EncoreButton) obj3, (hec) obj2, lnmVar, (byte) 29);
                hb1Var5.b = obj;
                return hb1Var5;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.m231 */
    public final Object invoke(Object obj, Object obj2) throws m231, IOException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                return create((ptb0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
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
                return create((i091) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.m231 */
    /* JADX WARN: Code duplicated, block: B:228:0x0579  */
    /* JADX WARN: Code duplicated, block: B:229:0x0585  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b  */
    public final Object invokeSuspend(Object obj) throws m231, IOException {
        ou80 ou80Var;
        Object obj2;
        c9 c9VarA;
        List listX;
        m231 m231VarValueOf;
        long jH;
        long j;
        m231 m231Var;
        gec1 gec1Var;
        Long lValueOf;
        Long lD0;
        String path;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        m0d m0dVar;
        byte b = this.a;
        int i = 10;
        boolean z = false;
        boolean z2 = true;
        m231 m231Var2 = null;
        Object obj3 = null;
        m231 m231Var3 = rih1.a;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (((bb1) this.b).N0 != null) {
                    ((az20) obj4).b(true);
                    b6t b6tVar = (k6a1) obj5;
                    if (b6tVar != null) {
                        b6tVar.a();
                    }
                }
                return m231Var3;
            case 1:
                hm5.M(obj);
                bpb1 bpb1Var = (wen0) this.b;
                rh1 rh1Var = (rh1) obj5;
                ijo ijoVarF = vh1.f(rh1Var.a.a, rh1Var.b);
                bpb1 bpb1Var2 = bpb1Var;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, ijoVarF);
                return m231Var3;
            case 2:
                hm5.M(obj);
                if (((kbf0) this.b).j() && ((Boolean) ((ven0) obj4).getValue()).booleanValue()) {
                    ((Function0) ((ven0) obj5).getValue()).invoke();
                }
                return m231Var3;
            case 3:
                hm5.M(obj);
                tm1 tm1Var = (tm1) obj4;
                tqw tqwVar = (tqw) obj5;
                ((b431) ((wm1) this.b).X.getValue()).a(new qof(tm1Var.a, tm1Var.b), (tqwVar == null || (ou80Var = n3o1.y(tqwVar).a) == null) ? null : ou80Var.a);
                return m231Var3;
            case 4:
                String str = (String) obj4;
                ptb0 ptb0Var = (ptb0) this.b;
                hm5.M(obj);
                if (!ptb0Var.l.isEmpty()) {
                    if (str == null || ((err0) ((xtb0) obj5).e.b).s() > 0) {
                        z = true;
                    } else {
                        List list = ptb0Var.l;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((qtb0) it.next()).l.equals(str)) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                hm5.M(obj);
                vu30 vu30Var = ((mj11) this.b).c;
                if (vu30Var != null) {
                    vu30Var.invoke((upo) obj4, new xj0((ven0) obj5, (byte) 7));
                }
                return m231Var3;
            case 6:
                hm5.M(obj);
                if (((yv51) ((fu1) this.b).b.b.get("atp")) != null && ((Boolean) ((ven0) obj4).getValue()).booleanValue()) {
                    ((Function0) obj5).invoke();
                }
                return m231Var3;
            case 7:
                ra2 ra2Var = (ra2) obj5;
                hm5.M(obj);
                String str2 = (String) this.b;
                Bundle bundle = (Bundle) obj4;
                qe2 qe2Var = new qe2(str2, bundle);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                ycc1 ycc1Var = ra2Var.b;
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(intent.getDataString());
                Iterator it2 = ((Set) ycc1Var.b).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((acr0) next).a().contains(s4b1VarX.c)) {
                            obj2 = next;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                acr0 acr0Var = (acr0) obj2;
                if ((acr0Var != null ? acr0Var.d() : null) instanceof b6w0) {
                    lwq0 lwq0Var = (lwq0) ra2Var.e.invoke();
                    if (lwq0Var != null) {
                        lwq0.d(lwq0Var, qe2Var);
                    }
                } else {
                    aab1 aab1Var = (aab1) ra2Var.d.invoke();
                    if (aab1Var != null) {
                        aab1Var.d(qe2Var, ra2Var.f);
                    }
                }
                return m231Var3;
            case 8:
                hm5.M(obj);
                vu1 vu1Var = ((bb3) this.b).d;
                uv11 uv11Var = (uv11) obj4;
                List listSingletonList = Collections.singletonList(uv11Var.a);
                String str3 = uv11Var.b;
                vu1.b(vu1Var, listSingletonList, str3, str3, (tv80) obj5, (dy1) null, 48);
                return m231Var3;
            case 9:
                hm5.M(obj);
                bb3 bb3Var = (bb3) this.b;
                tgm tgmVarA = (tgm) bb3Var.h.invoke();
                vgm vgmVar = bb3Var.e;
                jmb1 jmb1Var = (jmb1) obj4;
                uv11 uv11Var2 = jmb1Var.a;
                String str4 = uv11Var2.a;
                String str5 = uv11Var2.b;
                tv80 tv80Var = (tv80) obj5;
                if (jmb1Var.m) {
                    tgmVarA = tgm.a(tgmVarA, false, false, 2, false, (sgm) null, (iu30) null, (p860) null, false, -2049);
                }
                vgmVar.d(str4, str5, tv80Var, tgmVarA);
                return m231Var3;
            case 10:
                String str6 = (String) obj5;
                hm5.M(obj);
                tv80 tv80Var2 = (tv80) this.b;
                lzn0 lzn0Var = ((se3) obj4).a;
                if (tv80Var2 != null) {
                    lzn0Var.a(str6, tv80Var2, (Bundle) null);
                } else {
                    lzn0Var.h(str6);
                }
                return m231Var3;
            case 11:
                hm5.M(obj);
                tv80 tv80Var3 = (tv80) this.b;
                if (tv80Var3 == null) {
                    return null;
                }
                ((re3) obj4).a.a((String) obj5, tv80Var3, (Bundle) null);
                return m231Var3;
            case 12:
                hm5.M(obj);
                te3 te3Var = (te3) this.b;
                tgm tgmVarA2 = (tgm) te3Var.g.invoke();
                vgm vgmVar2 = te3Var.l;
                jmb1 jmb1Var2 = (jmb1) obj4;
                uv11 uv11Var3 = jmb1Var2.a;
                String str7 = uv11Var3.a;
                String str8 = uv11Var3.b;
                tv80 tv80Var4 = (tv80) obj5;
                if (jmb1Var2.m) {
                    tgmVarA2 = tgm.a(tgmVarA2, false, false, 2, false, (sgm) null, (iu30) null, (p860) null, false, -2049);
                }
                vgmVar2.d(str7, str8, tv80Var4, tgmVarA2);
                return m231Var3;
            case 13:
                hm5.M(obj);
                vu1 vu1Var2 = ((te3) this.b).d;
                uv11 uv11Var4 = (uv11) obj4;
                List listSingletonList2 = Collections.singletonList(uv11Var4.a);
                String str9 = uv11Var4.b;
                vu1.b(vu1Var2, listSingletonList2, str9, str9, (tv80) obj5, (dy1) null, 48);
                return m231Var3;
            case 14:
                hm5.M(obj);
                a2r0 a2r0Var = (a2r0) this.b;
                String str10 = (String) obj4;
                a2r0Var.a(str10);
                a2r0Var.b(str10);
                if (((p791) obj5) == p791.b) {
                    a2r0Var.d(str10);
                }
                return m231Var3;
            case 15:
                hm5.M(obj);
                ven0 ven0Var = (ven0) this.b;
                nw4 nw4Var = (nw4) obj4;
                String str11 = (String) obj5;
                if (nw4Var.d.g <= 2) {
                    c9VarA = mqo1.s(new String[]{ihc1.e1(str11).toString()});
                } else {
                    ArrayList arrayList = new ArrayList();
                    try {
                        int iCeil = (int) Math.ceil(((double) nw4Var.d.g) / 2.0d);
                        int i2 = 0;
                        int i3 = 0;
                        int iMin = 1;
                        while (i2 < iCeil) {
                            int iB = nw4Var.b(iMin == nw4Var.d.g ? iMin - 1 : iMin, false);
                            arrayList.add(ihc1.e1(ihc1.e1(str11).toString().substring(i3, iB)).toString());
                            iMin = Math.min(iMin + 2, nw4Var.d.g);
                            i2++;
                            i3 = iB;
                        }
                    } catch (Throwable unused) {
                    }
                    c9VarA = mqo1.A(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i4 = 0;
                for (Object obj6 : c9VarA) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        m231 m231Var4 = m231Var2;
                        p7h.T();
                        throw m231Var4;
                    }
                    String str12 = (String) obj6;
                    Pattern patternCompile = Pattern.compile("\\s+");
                    ihc1.N0(0);
                    Matcher matcher = patternCompile.matcher(str12);
                    if (matcher.find()) {
                        ArrayList arrayList2 = new ArrayList(i);
                        int iEnd = 0;
                        do {
                            arrayList2.add(str12.subSequence(iEnd, matcher.start()).toString());
                            iEnd = matcher.end();
                        } while (matcher.find());
                        arrayList2.add(str12.subSequence(iEnd, str12.length()).toString());
                        listX = arrayList2;
                    } else {
                        listX = k4p1.x(str12.toString());
                    }
                    List<String> list2 = listX;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list2, i));
                    int length = 0;
                    for (String str13 : list2) {
                        int i6 = 0;
                        boolean z3 = z2;
                        long j2 = 0;
                        while (i6 < str13.length()) {
                            char cCharAt = str13.charAt(i6);
                            m231 m231Var5 = m231Var2;
                            if (cCharAt == '!') {
                                jH = dqz0.b.h(30, 180);
                                j = 300;
                            } else if (cCharAt == ',') {
                                jH = dqz0.b.h(30, 80);
                                j = 150;
                            } else if (cCharAt == '.' || cCharAt == '?') {
                                jH = dqz0.b.h(30, 180);
                                j = 300;
                            } else if (cCharAt == ':' || cCharAt == ';') {
                                jH = dqz0.b.h(30, 80);
                                j = 150;
                            } else {
                                jH = dqz0.b.h(0, 10);
                                j = 35;
                            }
                            j2 += jH + j;
                            i6++;
                            m231Var2 = m231Var5;
                        }
                        m231 m231Var6 = m231Var2;
                        length += str13.length() + 1;
                        int iP = yoi1.p(length, 0, str12.length());
                        oag1 oag1Var = new oag1(str12.substring(0, iP), str12.substring(iP, str12.length()), j2 + 100);
                        if (linkedHashMap.containsKey(Integer.valueOf(i4))) {
                            List list3 = (List) linkedHashMap.get(Integer.valueOf(i4));
                            m231VarValueOf = list3 != null ? Boolean.valueOf(list3.add(oag1Var)) : m231Var6;
                        } else {
                            linkedHashMap.put(Integer.valueOf(i4), p7h.O(new oag1[]{oag1Var}));
                            m231VarValueOf = m231Var3;
                        }
                        arrayList3.add(m231VarValueOf);
                        z2 = z3;
                        m231Var2 = m231Var6;
                        i = 10;
                    }
                    i4 = i5;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), mqo1.A((Iterable) entry.getValue()));
                }
                ven0Var.setValue(mqo1.B(linkedHashMap2));
                return m231Var3;
            case 16:
                hm5.M(obj);
                kly0 kly0Var = (kly0) obj5;
                try {
                    vb4 vb4Var = new vb4(false, 10, 500, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, (lw21) obj4);
                    qt71 qt71Var = (qt71) kly0Var.get();
                    boolean zA = vb4Var.a();
                    long jD = vb4Var.d();
                    long jC = vb4Var.c();
                    int iB2 = vb4Var.b();
                    hma1 hma1VarEdit = qt71Var.a.edit();
                    hma1VarEdit.a(qt71.b, zA);
                    hma1VarEdit.b(qt71.c, (int) jD);
                    hma1VarEdit.b(qt71.d, (int) jC);
                    hma1VarEdit.b(qt71.e, iB2);
                    hma1VarEdit.g();
                    m231Var = m231Var3;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    Logger.l(thA, "ANR watchdog configuration cache update failed", new Object[0]);
                }
                return m231Var3;
            case 17:
                hm5.M(obj);
                vb2.b(((my6) this.b).n, new db2(((ke2) obj4).b), true, (tv80) obj5);
                return m231Var3;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                my6 my6Var = (my6) this.b;
                my6Var.f.d(((unb1) obj4).a.a, my6Var.a, (tv80) obj5, new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -11, 1));
                return m231Var3;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                l811 l811Var = (l811) obj4;
                r091 r091Var = (r091) obj5;
                i091 i091Var = (i091) this.b;
                hm5.M(obj);
                o091 o091Var = i091Var.h;
                if ((o091Var instanceof j091) || (o091Var instanceof n091)) {
                    l811Var.a = true;
                }
                if (o091Var instanceof k091) {
                    h091 h091Var = ((k091) o091Var).a;
                    if (!h091Var.equals(f091.a) && ((!h091Var.equals(e091.a) || l811Var.a) && !i091Var.g && i091Var.equals(r091Var.g.getValue()) && !((Boolean) r091Var.d.e.getValue()).booleanValue() && !((Boolean) r091Var.e.b.getValue()).booleanValue())) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 20:
                hm5.M(obj);
                ven0 ven0Var2 = (ven0) this.b;
                Float f = (Float) obj4;
                String str14 = (String) obj5;
                smc0 smc0VarN = k4p1.n();
                if (f != null) {
                    smc0VarN.add(String.format("%.1f", Arrays.copyOf(new Object[]{new Float(f.floatValue())}, 1)));
                }
                if (str14 != null) {
                    smc0VarN.add(str14);
                }
                ven0Var2.setValue(k4p1.k(smc0VarN));
                return m231Var3;
            case 21:
                wdm wdmVar = (wdm) obj4;
                hm5.M(obj);
                Function0 function0 = (Function0) this.b;
                if (function0 != null) {
                    wdmVar.t = function0;
                }
                ny7 ny7Var = (ny7) obj5;
                wdmVar.h = ny7Var;
                q9l1 q9l1Var = (q9l1) wdmVar.c;
                boolean z4 = ny7Var.g;
                ju7 ju7Var = ny7Var.a;
                if (z4) {
                    String str15 = ju7Var.e;
                    if (ihc1.y0(str15)) {
                        str15 = "e57a3dcbd5174b20a9bfa81db99ec7d2";
                    }
                    gec1Var = new gec1(str15);
                } else {
                    gec1Var = fec1.c;
                }
                ksm0 ksm0Var = new ksm0(gec1Var, ny7Var.b, q9l1Var.m, q9l1Var.p, "", ny7Var.f, ny7Var.c, q9l1Var.e, q9l1Var.l);
                String strA = ju7Var.a();
                boolean z5 = ny7Var.d;
                String str16 = (String) wdmVar.Y;
                Integer num = ny7Var.e;
                wdmVar.i = new lsm0(strA, ksm0Var, z5, false, ju7Var.f ? null : new jsm0(Long.valueOf(ju7Var.c), Long.valueOf(ju7Var.d)), 0L, num != null ? new ism0(((long) num.intValue()) * 1000) : null, str16, true, 0, 1576);
                return m231Var3;
            case 22:
                hm5.M(obj);
                ab8 ab8Var = (ab8) this.b;
                vgm vgmVar3 = ab8Var.b;
                jmb1 jmb1Var3 = (unb1) obj4;
                String str17 = jmb1Var3.a.a;
                String str18 = ab8Var.c.a;
                tv80 tv80Var5 = (tv80) obj5;
                wa8 wa8Var = (wa8) ((Function0) ab8Var.e).invoke();
                tv11 tv11Var = jmb1Var3.a.f;
                vgmVar3.d(str17, str18, tv80Var5, ywo1.t(wa8.a(wa8Var, tv11Var != null ? tv11Var.a : null), jmb1Var3.a.d));
                return m231Var3;
            case 23:
                hm5.M(obj);
                if (((jl8) ((ven0) obj4).getValue()) instanceof gl8) {
                    ((ven0) obj5).setValue(Boolean.TRUE);
                    ((Function0) this.b).invoke();
                }
                return m231Var3;
            case 24:
                hm5.M(obj);
                return jl21.b(((bo8) this.b).e, (String) obj4, (lik1) obj5);
            case 25:
                hm5.M(obj);
                sga sgaVar = (sga) this.b;
                String str19 = (String) obj4;
                vga vgaVar = (vga) obj5;
                vgaVar.getClass();
                Context context = sgaVar.a;
                try {
                    Uri uri = Uri.parse(str19);
                    String scheme = uri.getScheme();
                    if (scheme == null) {
                        lValueOf = null;
                    } else {
                        int iHashCode = scheme.hashCode();
                        if (iHashCode != 3143036) {
                            if (iHashCode == 951530617 && scheme.equals("content") && (assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r")) != null) {
                                try {
                                    long length2 = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                                    lValueOf = Long.valueOf(length2);
                                    if (length2 <= 0) {
                                        lValueOf = null;
                                    }
                                    assetFileDescriptorOpenAssetFileDescriptor.close();
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        u890.p(assetFileDescriptorOpenAssetFileDescriptor, th2);
                                        throw th3;
                                    }
                                }
                            } else {
                                lValueOf = null;
                            }
                        } else if (scheme.equals("file") && (path = uri.getPath()) != null) {
                            long length3 = new File(path).length();
                            lValueOf = Long.valueOf(length3);
                            if (length3 <= 0) {
                                lValueOf = null;
                            }
                        } else {
                            lValueOf = null;
                        }
                    }
                } catch (Exception e) {
                    Logger.l(e, "Failed to get file size for uri: ".concat(str19), new Object[0]);
                    lValueOf = null;
                }
                if (lValueOf != null && lValueOf.longValue() <= 125829120) {
                    return null;
                }
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(context, Uri.parse(str19));
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                        lD0 = strExtractMetadata != null ? nhc1.d0(10, strExtractMetadata) : null;
                        mediaMetadataRetriever.release();
                    } catch (Throwable th4) {
                        mediaMetadataRetriever.release();
                        throw th4;
                    }
                    break;
                } catch (Exception e2) {
                    Logger.l(e2, "Failed to extract video duration for uri: ".concat(str19), new Object[0]);
                    mediaMetadataRetriever.release();
                    lD0 = null;
                }
                if (lD0 == null || lD0.longValue() <= 0) {
                    Logger.k(f4i1.f("Could not determine video duration for ", str19, ", using default encoder settings"), new Object[0]);
                    return null;
                }
                int iM = rwo1.m(125829120L, lD0.longValue());
                if (iM <= 0) {
                    Logger.k(f4i1.f("Could not calculate bitrate for ", str19, ", using default encoder settings"), new Object[0]);
                    return null;
                }
                int i7 = vgaVar.c.a;
                Integer numValueOf = i7 != 6 ? Integer.valueOf(td6.b(i7) * StoryCard.CLASSIC_CONTENT_FIELD_NUMBER) : null;
                if (numValueOf == null || numValueOf.intValue() >= iM) {
                    return Integer.valueOf(iM);
                }
                return null;
            case 26:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                fn31.T(c9nVar, (o8n) null, 0, new w7a((m911) obj4, (String) obj5, (lnm) null, (byte) 12), 3);
                return m231Var3;
            case 27:
                hm5.M(obj);
                eus0 eus0Var = (eus0) this.b;
                ven0 ven0Var3 = (ven0) obj5;
                for (Object obj7 : eus0Var.a) {
                    m0d m0dVar2 = (m0d) obj7;
                    if (xcg1.i(m0dVar2.a, ":", m0dVar2.b).equals((String) ven0Var3.getValue())) {
                        obj3 = obj7;
                        m0dVar = (m0d) obj3;
                        if (m0dVar != null && !m0dVar.equals(eus0Var.b)) {
                            ((iu30) obj4).invoke(m0dVar);
                        }
                        return m231Var3;
                    }
                }
                m0dVar = (m0d) obj3;
                if (m0dVar != null) {
                    ((iu30) obj4).invoke(m0dVar);
                }
                return m231Var3;
            case 28:
                hm5.M(obj);
                bma1 bma1Var = cgb.i;
                ((cgb) this.b).b((String) obj4, (CategorizerResponse) obj5);
                return m231Var3;
            default:
                mmr0 mmr0Var = (mmr0) this.b;
                hm5.M(obj);
                boolean zBooleanValue = ((Boolean) mmr0Var.a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) mmr0Var.b).booleanValue();
                EncoreButton encoreButton = (EncoreButton) obj4;
                hec hecVar = (hec) obj5;
                sgc1.v(encoreButton, zBooleanValue2 ? hecVar.a : hecVar.b);
                if (!zBooleanValue && zBooleanValue2) {
                    z = true;
                }
                encoreButton.setEnabled(z);
                return m231Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hb1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }
}
