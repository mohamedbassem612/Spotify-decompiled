package p;

import android.graphics.Rect;
import android.media.SoundPool;
import android.util.Base64;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v7v extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7v(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        ov00 ov00VarA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new u7v((w7v) obj);
            case 1:
                ((bbc) obj).l(icv.a);
                return rih1Var;
            case 2:
                return new kpg0((xpw) ((dfv) obj).h.get(), o6v.Z);
            case 3:
                q8n q8nVar = ((uhv) obj).l;
                j0d1 j0d1VarB = guo1.B();
                q8nVar.getClass();
                return flo1.l(q8nVar, j0d1VarB);
            case 4:
                yjq yjqVar = (yjq) obj;
                Set set = (Set) yjqVar.c;
                pv00 pv00Var = (pv00) yjqVar.d;
                Set<lj00> set2 = set;
                int iS = zno1.s(q7h.U(set2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (lj00 lj00Var : set2) {
                    Integer numB = lj00Var.b();
                    Map mapA = lj00Var.a();
                    ArrayList arrayList = new ArrayList(mapA.size());
                    for (Map.Entry entry : mapA.entrySet()) {
                        String strValueOf = String.valueOf(((Number) entry.getKey()).intValue());
                        Iterable<zp21> iterable = (Iterable) entry.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (zp21 zp21Var : iterable) {
                            Integer numValueOf = (!(zp21Var instanceof zp21) || (ov00VarA = pv00Var.a((Class) zp21Var.a)) == null) ? null : Integer.valueOf(ov00VarA.b());
                            if (numValueOf != null) {
                                arrayList2.add(numValueOf);
                            }
                        }
                        arrayList.add(new mmr0(strValueOf, arrayList2));
                    }
                    linkedHashMap.put(numB, sqg0.T(arrayList));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (((Integer) entry2.getKey()) != null) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    Integer num = (Integer) entry3.getKey();
                    Map map = (Map) entry3.getValue();
                    String strValueOf2 = String.valueOf(num);
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry4 : map.entrySet()) {
                        if (!((List) entry4.getValue()).isEmpty()) {
                            linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                        }
                    }
                    arrayList3.add(new mmr0(strValueOf2, linkedHashMap3));
                }
                Map mapT = sqg0.T(arrayList3);
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry5 : mapT.entrySet()) {
                    if (!((Map) entry5.getValue()).isEmpty()) {
                        linkedHashMap4.put(entry5.getKey(), entry5.getValue());
                    }
                }
                TreeMap treeMap = new TreeMap(linkedHashMap4);
                nfa0 nfa0Var = (nfa0) yjqVar.b;
                chc1 chc1Var = chc1.a;
                return Base64.encodeToString(nfa0Var.b(new nlc0(chc1Var, new nlc0(chc1Var, new nlc0(chc1Var, new r36(wr80.a, (byte) 0)))), Collections.singletonMap("mapping", treeMap)).getBytes(nne.a), 0);
            case 5:
                return (SoundPool) ((zkv) obj).a.get();
            case 6:
                iu30 iu30Var = ((ynv) obj).O0;
                if (iu30Var != null) {
                    iu30Var.invoke(wnv.a);
                }
                return rih1Var;
            case 7:
                return new kpg0((xpw) ((jov) obj).b.get(), rnv.X);
            case 8:
                return mqo1.A((bw91) obj);
            case 9:
                ((los) obj).a(ixb.c);
                return rih1Var;
            case 10:
                return new xzq((tyq) ((j7p) ((ca3) obj).d).get(), z6w.P0);
            case 11:
                return Collections.singletonList(new opw((y610) new y52(0, ((now) obj).a, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7).invoke(), (byte) 0));
            case 12:
                ((CountDownLatch) obj).countDown();
                return rih1Var;
            case 13:
                return Boolean.valueOf(((rl1) obj).b);
            case 14:
                return ((ipb1) obj).g();
            case 15:
                Rect rect = new Rect();
                if (!((VideoSurfaceView) obj).getGlobalVisibleRect(rect) || rect.isEmpty()) {
                    return null;
                }
                return new m511(rect.left, rect.top, rect.right, rect.bottom);
            case 16:
                return new yd91(3, new o1x(((p1x) obj).a.b(2), (byte) 0));
            case 17:
                return new yd91(3, new o1x(((c2x) obj).a.b(1), (byte) 1));
            case 18:
                x2x x2xVar = (x2x) obj;
                Object objO = poz0.o(x2xVar.Z0, x2xVar.a1);
                e441 e441Var = (e441) (objO instanceof m231 ? null : objO);
                if (e441Var != null) {
                    ((dt71) x2xVar.X0.b).a(new f441(e441Var));
                }
                return rih1Var;
            case 19:
                return new rcf0(new yjq(((wfx) obj).b));
            case 20:
                cgx cgxVar = (cgx) obj;
                luk lukVar = cgxVar.b;
                if (lukVar != null) {
                    return lukVar.e(new d26(cgxVar, (byte) 15));
                }
                return null;
            case 21:
                return ((kvx) obj).a.findViewById(2131428631);
            case 22:
                return (i8h1) ((r0y) obj).b.get();
            case 23:
                y0y y0yVar = (y0y) obj;
                return y0yVar.l1.a(y0yVar);
            case 24:
                ((s2y) obj).f.l();
                return rih1Var;
            case 25:
                ((j3y) obj).Z0(false, false);
                return rih1Var;
            case 26:
                ((c5y) obj).d.l();
                return rih1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                k6y k6yVar = (k6y) obj;
                fn31.T(k6yVar.g, null, 0, new bu(k6yVar, (lnm) null, (byte) 13), 3);
                k6yVar.b.cancel();
                return rih1Var;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ofb ofbVar = (ofb) obj;
                fn31.T((llm) ofbVar.h, null, 0, new bu(ofbVar, (lnm) null, (byte) 14), 3);
                ((r0z0) ofbVar.c).cancel();
                return rih1Var;
            default:
                ft71 ft71Var = (ft71) obj;
                hrr0 hrr0Var = ft71Var.b;
                Boolean bool = Boolean.FALSE;
                hrr0Var.setValue(bool);
                ft71Var.o(false);
                p1f0 p1f0Var = ft71Var.c;
                ((hrr0) p1f0Var.a).setValue(bool);
                ((hrr0) p1f0Var.c).setValue(bool);
                ((hrr0) p1f0Var.e).setValue(bool);
                ((hrr0) p1f0Var.g).setValue(bool);
                ft71Var.f = u7h.j;
                ft71Var.g = 1.0f;
                ft71Var.h = 1.0f;
                sui1 sui1Var = ft71Var.l;
                if (sui1Var != null) {
                    f46.h0(sui1Var.d, (Object) null);
                    sui1Var.e = 0;
                }
                ft71Var.i = ofg1.b;
                ft71Var.j = 0L;
                ft71Var.k = 1.0f;
                return rih1Var;
        }
    }
}
