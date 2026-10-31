package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.playlistmixing.proto.BackendTransition;
import com.spotify.playlistmixing.proto.ExplicitFeedback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nd70 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nd70(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x049a  */
    /* JADX WARN: Code duplicated, block: B:141:0x049d  */
    /* JADX WARN: Code duplicated, block: B:143:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:145:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:146:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:148:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:149:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:151:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:152:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:154:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:156:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:157:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:160:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:166:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:169:0x0500  */
    /* JADX WARN: Code duplicated, block: B:170:0x0502 A[PHI: r16
      0x0502: PHI (r16v11 boolean) = (r16v6 boolean), (r16v12 boolean) binds: [B:178:0x052f, B:169:0x0500] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:171:0x0507  */
    /* JADX WARN: Code duplicated, block: B:180:0x0532  */
    /* JADX WARN: Code duplicated, block: B:182:0x054e  */
    /* JADX WARN: Code duplicated, block: B:185:0x055a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0593  */
    /* JADX WARN: Code duplicated, block: B:189:0x059e  */
    /* JADX WARN: Code duplicated, block: B:192:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:195:0x05ca A[Catch: Exception -> 0x05de, TRY_LEAVE, TryCatch #0 {Exception -> 0x05de, blocks: (B:193:0x05b0, B:195:0x05ca), top: B:298:0x05b0 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:204:0x05f6 A[Catch: Exception -> 0x05da, TryCatch #2 {Exception -> 0x05da, blocks: (B:197:0x05d3, B:201:0x05e3, B:202:0x05f0, B:204:0x05f6, B:206:0x0603, B:207:0x0607, B:208:0x060b, B:210:0x0611, B:213:0x0627, B:215:0x0631), top: B:302:0x05d3 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0611 A[Catch: Exception -> 0x05da, TryCatch #2 {Exception -> 0x05da, blocks: (B:197:0x05d3, B:201:0x05e3, B:202:0x05f0, B:204:0x05f6, B:206:0x0603, B:207:0x0607, B:208:0x060b, B:210:0x0611, B:213:0x0627, B:215:0x0631), top: B:302:0x05d3 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x0621  */
    /* JADX WARN: Code duplicated, block: B:213:0x0627 A[Catch: Exception -> 0x05da, TryCatch #2 {Exception -> 0x05da, blocks: (B:197:0x05d3, B:201:0x05e3, B:202:0x05f0, B:204:0x05f6, B:206:0x0603, B:207:0x0607, B:208:0x060b, B:210:0x0611, B:213:0x0627, B:215:0x0631), top: B:302:0x05d3 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x0631 A[Catch: Exception -> 0x05da, TRY_LEAVE, TryCatch #2 {Exception -> 0x05da, blocks: (B:197:0x05d3, B:201:0x05e3, B:202:0x05f0, B:204:0x05f6, B:206:0x0603, B:207:0x0607, B:208:0x060b, B:210:0x0611, B:213:0x0627, B:215:0x0631), top: B:302:0x05d3 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0659  */
    /* JADX WARN: Code duplicated, block: B:227:0x0680  */
    /* JADX WARN: Code duplicated, block: B:229:0x0683  */
    /* JADX WARN: Code duplicated, block: B:232:0x068b  */
    /* JADX WARN: Code duplicated, block: B:235:0x0696  */
    /* JADX WARN: Code duplicated, block: B:238:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:240:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:241:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:243:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:246:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:248:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:250:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:298:0x05b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0669 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0603 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x05f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0389  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke() {
        Map map;
        nig1 nig1Var;
        kkg1 kkg1Var;
        pvc0 pvc0Var;
        pvc0 pvc0Var2;
        Map map2;
        Map map3;
        Map map4;
        boolean zC;
        boolean z;
        qxc0 qxc0Var;
        Map map5;
        lhg1 lhg1Var;
        kkg1 kkg1Var2;
        lhg1 lhg1Var2;
        String str;
        lhg1 lhg1VarA;
        ruq0 ruq0Var;
        boolean z2;
        String str2;
        String str3;
        lhg1 lhg1VarA2;
        String str4;
        List listC;
        String str5;
        lhg1 lhg1Var3;
        ExplicitFeedback explicitFeedbackP;
        smc0 smc0VarN;
        ArrayList arrayList;
        Iterator it;
        BackendTransition backendTransition;
        lhg1 lhg1VarA3;
        String strO;
        sr10 sr10Var;
        boolean z3;
        boolean z4;
        String str6;
        Float fValueOf;
        String str7;
        Float fValueOf2;
        Float fB0;
        float fFloatValue;
        x7i1 x7i1Var;
        o3r o3rVar;
        lhg1 lhg1Var4;
        boolean z5;
        lhg1 lhg1Var5;
        Map map6;
        x7i1 x7i1Var2;
        nq80 nq80Var;
        switch (this.a) {
            case 0:
                return Integer.valueOf(Objects.hash(((od70) this.b).a));
            case 1:
                return Integer.valueOf(Objects.hash(((rd70) this.b).a));
            case 2:
                return ((emc0) ((rm70) this.b)).d.f;
            case 3:
                return new ku70((lu70) this.b);
            case 4:
                wu70 wu70Var = (wu70) this.b;
                return new lu70(wu70Var.e(), new au70(), wu70Var.b, wu70Var.c, wu70Var.d, wu70Var.i, wu70Var.N0, wu70Var.t);
            case 5:
                return (FrameLayout) b8k1.n(((dv70) this.b).i, 2131429104);
            case 6:
                nm1 nm1Var = (nm1) this.b;
                h3p h3pVar = (h3p) nm1Var.f;
                d0r d0rVar = (d0r) nm1Var.b;
                s3p s3pVar = (s3p) h3pVar.a.c;
                lzn0 lzn0VarC = ((i7c) s3pVar.X0).c();
                c8o.l(lzn0VarC);
                gw70 gw70VarB = ((i7c) s3pVar.X0).b();
                c8o.l(gw70VarB);
                return new bmt(lzn0VarC, gw70VarB, brt.y(), d0rVar);
            case 7:
                u3 u3Var = (u3) this.b;
                qtw qtwVarA = f6o1.A((u710) u3Var.c, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
                tka0 tka0Var = dtw.C;
                p410 p410Var = (p410) u3Var.b;
                Context context = ((FrameLayout) p410Var.h).getContext();
                FrameLayout frameLayout = (FrameLayout) p410Var.h;
                dtw dtwVarD = mhc.d(context, frameLayout, qtwVarA, (drw) null, 24);
                frameLayout.addView(dtwVarD.w);
                return dtwVarD;
            case 8:
                return (n7h1) ((y380) this.b).b.get();
            case 9:
                st60 st60Var = (st60) this.b;
                Context context2 = (Context) st60Var.d;
                return PendingIntent.getActivity(context2, 0, ((xs80) st60Var.b).a(context2), 67108864);
            case 10:
                v480 v480Var = (v480) this.b;
                w2z w2zVar = v480Var.g;
                if (w2zVar != null) {
                    v480Var.a.e(w2zVar);
                    v480Var.g = null;
                    v480Var.h = 1;
                }
                return rih1.a;
            case 11:
                HashMap map7 = ((y680) this.b).a;
                if (map7.isEmpty()) {
                    return v7x.a;
                }
                Collection collectionValues = map7.values();
                ArrayList arrayList2 = new ArrayList();
                long j = 0;
                for (Object obj : collectionValues) {
                    n700 n700Var = (n700) obj;
                    if (j <= 102400) {
                        long length = j + 4 + ((long) n700Var.b.length()) + ((long) n700Var.c.size()) + 8;
                        int size = 0;
                        for (mmr0 mmr0Var : n700Var.e) {
                            size += ((phc) mmr0Var.b).size() + ((String) mmr0Var.a).length();
                        }
                        j = length + ((long) size);
                    }
                    if (j <= 102400) {
                        arrayList2.add(obj);
                    }
                }
                return new i46(arrayList2, (byte) 1);
            case 12:
                dbk0 dbk0Var = dbk0.a;
                Map map8 = b7x.a;
                s24 s24Var = (s24) this.b;
                kkg1 kkg1Var3 = (kkg1) s24Var.d;
                d0r d0rVar2 = (d0r) s24Var.b;
                o3r o3rVar2 = (o3r) s24Var.X;
                o3r o3rVar3 = (o3r) s24Var.Z;
                o3r o3rVar4 = (o3r) s24Var.Y;
                o3r o3rVar5 = (o3r) s24Var.i;
                cbk0 cbk0Var = (cbk0) s24Var.c;
                bt31 bt31Var = cbk0Var.b;
                String str8 = bt31Var.a;
                bt31 bt31Var2 = cbk0Var.c;
                nig1 nig1Var2 = (nig1) u890.k(d0rVar2.b(o3rVar5.a(new hy31(str8, bt31Var2.a, bt31Var.c, bt31Var2.c))), (d0r) null, (n4r) null);
                lhg1 lhg1Var6 = nig1Var2.a;
                lhg1 lhg1VarA4 = lhg1.a(lhg1Var6, (q6w0) null, ruq0.a(lhg1Var6.b, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, cbk0Var.b.b, cbk0Var.c.b, 0, 0, 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 524095), false, false, 13);
                ruq0 ruq0Var2 = lhg1VarA4.b;
                String str9 = cbk0Var.d;
                dbk0 dbk0Var2 = cbk0Var.e;
                if (str9 != null) {
                    lhg1 lhg1Var7 = cbk0Var.i;
                    if (lhg1Var7 == null || !s24Var.N(lhg1Var7, lhg1VarA4)) {
                        lhg1Var7 = null;
                    }
                    boolean z6 = cbk0Var.j;
                    lhg1 lhg1Var8 = z6 ? null : lhg1Var7;
                    lhg1 lhg1Var9 = z6 ? null : cbk0Var.i;
                    if (z6) {
                        lhg1Var4 = lhg1Var7;
                        o3rVar = o3rVar4;
                    } else {
                        o3rVar = o3rVar4;
                        lhg1Var4 = null;
                    }
                    if (z6) {
                        cbk0Var.h = str9;
                    } else {
                        cbk0Var.g = str9;
                    }
                    if (!cbk0Var.k) {
                        return s24.w(s24Var, nig1Var2, lhg1VarA4, lhg1Var8, lhg1Var9, (lhg1) null, lhg1Var4, true, false, cbk0Var.e, (String) null, (Float) null, (Float) null, false, (List) null, (smc0) null, (List) null, 236544);
                    }
                    lhg1 lhg1Var10 = lhg1Var9;
                    pvc0 pvc0Var3 = (pvc0) u890.k(d0rVar2.b(o3rVar.a(cbk0Var.b.b)), (d0r) null, (n4r) null);
                    if (pvc0Var3 != null ? z6k0.c(pvc0Var3.e) : true) {
                        z5 = true;
                    } else {
                        dbk0Var2.getClass();
                        if (dbk0Var2 == dbk0Var) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                    }
                    qxc0 qxc0Var2 = (qxc0) u890.k(d0rVar2.b(o3rVar3.a(cbk0Var.a)), (d0r) null, (n4r) null);
                    boolean z7 = (qxc0Var2 == null || (x7i1Var2 = qxc0Var2.t) == null) ? false : x7i1Var2.b;
                    i1r i1rVarB = d0rVar2.b(o3rVar2.a(cbk0Var.b.b));
                    boolean z8 = i1rVarB instanceof i1r;
                    i1r i1rVar = z8 ? i1rVarB : null;
                    if (i1rVar == null || (map6 = (Map) i1rVar.a) == null) {
                        lhg1Var5 = null;
                    } else {
                        lhg1 lhg1VarB = kkg1.b(map6);
                        lhg1Var5 = (lhg1VarB == null || !s24Var.N(lhg1VarB, lhg1VarA4)) ? null : lhg1VarB;
                    }
                    return s24.w(s24Var, nig1Var2, lhg1VarA4, lhg1Var8, lhg1Var10, (lhg1) null, lhg1Var4, z5, z7, cbk0Var.e, (String) null, (Float) null, (Float) null, (z5 || !z8 || u890.j(lhg1Var8, lhg1Var5)) ? false : true, (List) null, s24Var.v(map8, lhg1VarA4, lhg1Var4, false), (List) null, 183296);
                }
                Map map9 = (Map) u890.k(d0rVar2.b(o3rVar2.a(cbk0Var.b.b)), (d0r) null, (n4r) null);
                String str10 = (String) map9.get("automix.transition_uri");
                lhg1 lhg1VarB2 = kkg1.b(map9);
                if (str10 != null && lhg1VarB2 != null) {
                    map = map8;
                    ruq0 ruq0Var3 = lhg1VarB2.b;
                    nig1Var = nig1Var2;
                    kkg1Var = kkg1Var3;
                    if (!u890.j(ruq0Var3.g, cbk0Var.b.b) || !u890.j(ruq0Var3.h, cbk0Var.c.b) || !u890.j(ruq0Var3.a, cbk0Var.b.a) || !u890.j(ruq0Var3.b, cbk0Var.c.a) || !s24Var.N(lhg1VarB2, lhg1VarA4)) {
                    }
                    cbk0Var.g = str10;
                    pvc0Var = (pvc0) u890.k(d0rVar2.b(o3rVar4.a(cbk0Var.b.b)), (d0r) null, (n4r) null);
                    pvc0Var2 = (pvc0) u890.k(d0rVar2.b(o3rVar4.a(cbk0Var.c.b)), (d0r) null, (n4r) null);
                    if (pvc0Var != null) {
                        map2 = pvc0Var.f;
                    } else {
                        map2 = null;
                    }
                    if (map2 == null) {
                        map2 = map;
                    }
                    if (pvc0Var2 != null) {
                        map3 = pvc0Var2.f;
                    } else {
                        map3 = null;
                    }
                    if (map3 == null) {
                        map4 = map;
                    } else {
                        map4 = map3;
                    }
                    if (pvc0Var != null) {
                        zC = z6k0.c(pvc0Var.e);
                    } else {
                        zC = true;
                    }
                    if (zC) {
                        z = true;
                    } else {
                        dbk0Var2.getClass();
                        if (dbk0Var2 == dbk0Var) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    qxc0Var = (qxc0) u890.k(d0rVar2.b(o3rVar3.a(cbk0Var.a)), (d0r) null, (n4r) null);
                    if (lhg1VarB2 != null) {
                        map5 = map2;
                        kkg1Var2 = kkg1Var;
                        lhg1Var = lhg1VarB2;
                        if (!lnn1.m(lhg1VarB2, kkg1Var2, cbk0Var.b.a, cbk0Var.c.a, map5, map4) && s24.M(lhg1Var, lhg1VarA4)) {
                            lhg1Var2 = lhg1Var;
                        }
                        if (!((rxj0) s24Var.e).G && (str = (String) map9.get("automix.backend_auto_transition")) != null && (lhg1VarA = kkg1.a(str)) != null) {
                            ruq0Var = lhg1VarA.b;
                            z2 = z;
                            if (lnn1.m(lhg1VarA, kkg1Var2, cbk0Var.b.a, cbk0Var.c.a, map5, map4)) {
                                ruq0 ruq0Var4 = lhg1VarA.b;
                                String str11 = cbk0Var.b.b;
                                String str12 = cbk0Var.c.b;
                                String str13 = ruq0Var2.c;
                                String str14 = ruq0Var2.d;
                                str2 = ruq0Var2.e;
                                if (str2.length() == 0) {
                                    str2 = ruq0Var.e;
                                }
                                String str15 = str2;
                                str3 = ruq0Var2.f;
                                if (str3.length() == 0) {
                                    str3 = ruq0Var.f;
                                }
                                lhg1VarA2 = lhg1.a(lhg1VarA, (q6w0) null, ruq0.a(ruq0Var4, (String) null, (String) null, str13, str14, str15, str3, str11, str12, 0, 0, 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 524035), false, false, 1);
                            }
                            if (lhg1VarA2 != null) {
                                str4 = (String) map9.get("automix.arm_id");
                            } else {
                                str4 = null;
                            }
                            listC = z6x.a;
                            str5 = (String) map9.get("automix.explicit_feedback");
                            if (str5 != null) {
                                try {
                                    explicitFeedbackP = ExplicitFeedback.p(n9a.b(n9a.e, str5.getBytes(nne.a)));
                                    smc0VarN = k4p1.n();
                                    if (explicitFeedbackP.n()) {
                                        lhg1Var3 = lhg1VarA2;
                                        try {
                                            smc0VarN.add(new sr10("Core", "core", lhg1VarA4, false));
                                        } catch (Exception unused) {
                                            listC = listC;
                                            listC = listC;
                                            if (lhg1Var3 != null) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            smc0 smc0VarV = s24Var.v(map9, lhg1VarA4, (lhg1) null, z3);
                                            if (qxc0Var != null) {
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                            }
                                            dbk0 dbk0Var3 = cbk0Var.e;
                                            str6 = (String) map5.get("item.speed");
                                            if (str6 != null) {
                                                fB0 = nhc1.b0(str6);
                                                if (fB0 != null) {
                                                    fFloatValue = fB0.floatValue();
                                                } else {
                                                    fFloatValue = 1.0f;
                                                }
                                                fValueOf = Float.valueOf(fFloatValue);
                                            } else {
                                                fValueOf = null;
                                            }
                                            str7 = (String) map4.get("item.speed");
                                            if (str7 != null) {
                                                Float fB1 = nhc1.b0(str7);
                                                fValueOf2 = Float.valueOf(fB1 != null ? fB1.floatValue() : 1.0f);
                                            } else {
                                                fValueOf2 = null;
                                            }
                                            return s24.w(s24Var, nig1Var, lhg1VarA4, lhg1Var2, lhg1Var, lhg1Var3, (lhg1) null, z2, z4, dbk0Var3, str4, fValueOf, fValueOf2, false, listC, smc0VarV, listC, 28672);
                                        }
                                    } else {
                                        lhg1Var3 = lhg1VarA2;
                                    }
                                    h290 h290VarO = explicitFeedbackP.o();
                                    arrayList = new ArrayList();
                                    for (Object obj2 : h290VarO) {
                                        if (((BackendTransition) obj2).p()) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        backendTransition = (BackendTransition) it.next();
                                        lhg1VarA3 = kkg1.a(backendTransition.q());
                                        if (lhg1VarA3 == null) {
                                            it = it;
                                            listC = listC;
                                            sr10Var = null;
                                        } else {
                                            strO = backendTransition.o();
                                            if (strO.length() > 0) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append((Object) String.valueOf(strO.charAt(0)).toUpperCase(Locale.ROOT));
                                                sb.append(strO.substring(1));
                                                strO = sb.toString();
                                            }
                                            sr10Var = new sr10(strO, backendTransition.o(), lhg1VarA3, false);
                                        }
                                        if (sr10Var != null) {
                                            try {
                                                smc0VarN.add(sr10Var);
                                            } catch (Exception unused2) {
                                                listC = listC;
                                                if (lhg1Var3 != null) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                smc0 smc0VarV2 = s24Var.v(map9, lhg1VarA4, (lhg1) null, z3);
                                                if (qxc0Var != null) {
                                                    z4 = false;
                                                } else {
                                                    z4 = false;
                                                }
                                                dbk0 dbk0Var4 = cbk0Var.e;
                                                str6 = (String) map5.get("item.speed");
                                                if (str6 != null) {
                                                    fB0 = nhc1.b0(str6);
                                                    if (fB0 != null) {
                                                        fFloatValue = fB0.floatValue();
                                                    } else {
                                                        fFloatValue = 1.0f;
                                                    }
                                                    fValueOf = Float.valueOf(fFloatValue);
                                                } else {
                                                    fValueOf = null;
                                                }
                                                str7 = (String) map4.get("item.speed");
                                                if (str7 != null) {
                                                    Float fB2 = nhc1.b0(str7);
                                                    fValueOf2 = Float.valueOf(fB2 != null ? fB2.floatValue() : 1.0f);
                                                } else {
                                                    fValueOf2 = null;
                                                }
                                                return s24.w(s24Var, nig1Var, lhg1VarA4, lhg1Var2, lhg1Var, lhg1Var3, (lhg1) null, z2, z4, dbk0Var4, str4, fValueOf, fValueOf2, false, listC, smc0VarV2, listC, 28672);
                                            }
                                        }
                                        it = it;
                                        listC = listC;
                                        break;
                                    }
                                    listC = listC;
                                    listC = k4p1.C(k4p1.k(smc0VarN));
                                } catch (Exception unused3) {
                                    lhg1Var3 = lhg1VarA2;
                                }
                                break;
                            } else {
                                lhg1Var3 = lhg1VarA2;
                            }
                            if (lhg1Var3 != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            smc0 smc0VarV3 = s24Var.v(map9, lhg1VarA4, (lhg1) null, z3);
                            if (qxc0Var != null || (x7i1Var = qxc0Var.t) == null) {
                                z4 = false;
                            } else {
                                z4 = x7i1Var.b;
                            }
                            dbk0 dbk0Var5 = cbk0Var.e;
                            str6 = (String) map5.get("item.speed");
                            if (str6 != null) {
                                fB0 = nhc1.b0(str6);
                                if (fB0 != null) {
                                    fFloatValue = fB0.floatValue();
                                } else {
                                    fFloatValue = 1.0f;
                                }
                                fValueOf = Float.valueOf(fFloatValue);
                            } else {
                                fValueOf = null;
                            }
                            str7 = (String) map4.get("item.speed");
                            if (str7 != null) {
                                Float fB3 = nhc1.b0(str7);
                                fValueOf2 = Float.valueOf(fB3 != null ? fB3.floatValue() : 1.0f);
                            } else {
                                fValueOf2 = null;
                            }
                            return s24.w(s24Var, nig1Var, lhg1VarA4, lhg1Var2, lhg1Var, lhg1Var3, (lhg1) null, z2, z4, dbk0Var5, str4, fValueOf, fValueOf2, false, listC, smc0VarV3, listC, 28672);
                        }
                        z2 = z;
                        lhg1VarA2 = null;
                        if (lhg1VarA2 != null) {
                            str4 = (String) map9.get("automix.arm_id");
                        } else {
                            str4 = null;
                        }
                        listC = z6x.a;
                        str5 = (String) map9.get("automix.explicit_feedback");
                        if (str5 != null) {
                            explicitFeedbackP = ExplicitFeedback.p(n9a.b(n9a.e, str5.getBytes(nne.a)));
                            smc0VarN = k4p1.n();
                            if (explicitFeedbackP.n()) {
                                lhg1Var3 = lhg1VarA2;
                                smc0VarN.add(new sr10("Core", "core", lhg1VarA4, false));
                            } else {
                                lhg1Var3 = lhg1VarA2;
                            }
                            h290 h290VarO2 = explicitFeedbackP.o();
                            arrayList = new ArrayList();
                            while (r2.hasNext()) {
                                if (((BackendTransition) obj2).p()) {
                                    arrayList.add(obj2);
                                }
                            }
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                backendTransition = (BackendTransition) it.next();
                                lhg1VarA3 = kkg1.a(backendTransition.q());
                                if (lhg1VarA3 == null) {
                                    it = it;
                                    listC = listC;
                                    sr10Var = null;
                                } else {
                                    strO = backendTransition.o();
                                    if (strO.length() > 0) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append((Object) String.valueOf(strO.charAt(0)).toUpperCase(Locale.ROOT));
                                        sb2.append(strO.substring(1));
                                        strO = sb2.toString();
                                    }
                                    sr10Var = new sr10(strO, backendTransition.o(), lhg1VarA3, false);
                                }
                                if (sr10Var != null) {
                                    smc0VarN.add(sr10Var);
                                }
                                it = it;
                                listC = listC;
                                break;
                            }
                            listC = listC;
                            listC = k4p1.C(k4p1.k(smc0VarN));
                            break;
                        } else {
                            lhg1Var3 = lhg1VarA2;
                        }
                        if (lhg1Var3 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        smc0 smc0VarV4 = s24Var.v(map9, lhg1VarA4, (lhg1) null, z3);
                        if (qxc0Var != null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        dbk0 dbk0Var6 = cbk0Var.e;
                        str6 = (String) map5.get("item.speed");
                        if (str6 != null) {
                            fB0 = nhc1.b0(str6);
                            if (fB0 != null) {
                                fFloatValue = fB0.floatValue();
                            } else {
                                fFloatValue = 1.0f;
                            }
                            fValueOf = Float.valueOf(fFloatValue);
                        } else {
                            fValueOf = null;
                        }
                        str7 = (String) map4.get("item.speed");
                        if (str7 != null) {
                            Float fB4 = nhc1.b0(str7);
                            fValueOf2 = Float.valueOf(fB4 != null ? fB4.floatValue() : 1.0f);
                        } else {
                            fValueOf2 = null;
                        }
                        return s24.w(s24Var, nig1Var, lhg1VarA4, lhg1Var2, lhg1Var, lhg1Var3, (lhg1) null, z2, z4, dbk0Var6, str4, fValueOf, fValueOf2, false, listC, smc0VarV4, listC, 28672);
                    }
                    map5 = map2;
                    lhg1Var = lhg1VarB2;
                    kkg1Var2 = kkg1Var;
                    lhg1Var2 = null;
                    if (!((rxj0) s24Var.e).G) {
                        z2 = z;
                        lhg1VarA2 = null;
                    } else {
                        ruq0Var = lhg1VarA.b;
                        z2 = z;
                        if (lnn1.m(lhg1VarA, kkg1Var2, cbk0Var.b.a, cbk0Var.c.a, map5, map4)) {
                            lhg1VarA2 = null;
                        } else {
                            ruq0 ruq0Var5 = lhg1VarA.b;
                            String str16 = cbk0Var.b.b;
                            String str17 = cbk0Var.c.b;
                            String str18 = ruq0Var2.c;
                            String str19 = ruq0Var2.d;
                            str2 = ruq0Var2.e;
                            if (str2.length() == 0) {
                                str2 = ruq0Var.e;
                            }
                            String str110 = str2;
                            str3 = ruq0Var2.f;
                            if (str3.length() == 0) {
                                str3 = ruq0Var.f;
                            }
                            lhg1VarA2 = lhg1.a(lhg1VarA, (q6w0) null, ruq0.a(ruq0Var5, (String) null, (String) null, str18, str19, str110, str3, str16, str17, 0, 0, 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 524035), false, false, 1);
                        }
                    }
                    if (lhg1VarA2 != null) {
                        str4 = (String) map9.get("automix.arm_id");
                    } else {
                        str4 = null;
                    }
                    listC = z6x.a;
                    str5 = (String) map9.get("automix.explicit_feedback");
                    if (str5 != null) {
                        explicitFeedbackP = ExplicitFeedback.p(n9a.b(n9a.e, str5.getBytes(nne.a)));
                        smc0VarN = k4p1.n();
                        if (explicitFeedbackP.n()) {
                            lhg1Var3 = lhg1VarA2;
                            smc0VarN.add(new sr10("Core", "core", lhg1VarA4, false));
                        } else {
                            lhg1Var3 = lhg1VarA2;
                        }
                        h290 h290VarO3 = explicitFeedbackP.o();
                        arrayList = new ArrayList();
                        while (r2.hasNext()) {
                            if (((BackendTransition) obj2).p()) {
                                arrayList.add(obj2);
                            }
                        }
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            backendTransition = (BackendTransition) it.next();
                            lhg1VarA3 = kkg1.a(backendTransition.q());
                            if (lhg1VarA3 == null) {
                                it = it;
                                listC = listC;
                                sr10Var = null;
                            } else {
                                strO = backendTransition.o();
                                if (strO.length() > 0) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append((Object) String.valueOf(strO.charAt(0)).toUpperCase(Locale.ROOT));
                                    sb3.append(strO.substring(1));
                                    strO = sb3.toString();
                                }
                                sr10Var = new sr10(strO, backendTransition.o(), lhg1VarA3, false);
                            }
                            if (sr10Var != null) {
                                smc0VarN.add(sr10Var);
                            }
                            it = it;
                            listC = listC;
                            break;
                        }
                        listC = listC;
                        listC = k4p1.C(k4p1.k(smc0VarN));
                        break;
                    } else {
                        lhg1Var3 = lhg1VarA2;
                    }
                    if (lhg1Var3 != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    smc0 smc0VarV5 = s24Var.v(map9, lhg1VarA4, (lhg1) null, z3);
                    if (qxc0Var != null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    dbk0 dbk0Var7 = cbk0Var.e;
                    str6 = (String) map5.get("item.speed");
                    if (str6 != null) {
                        fB0 = nhc1.b0(str6);
                        if (fB0 != null) {
                            fFloatValue = fB0.floatValue();
                        } else {
                            fFloatValue = 1.0f;
                        }
                        fValueOf = Float.valueOf(fFloatValue);
                    } else {
                        fValueOf = null;
                    }
                    str7 = (String) map4.get("item.speed");
                    if (str7 != null) {
                        Float fB5 = nhc1.b0(str7);
                        fValueOf2 = Float.valueOf(fB5 != null ? fB5.floatValue() : 1.0f);
                    } else {
                        fValueOf2 = null;
                    }
                    return s24.w(s24Var, nig1Var, lhg1VarA4, lhg1Var2, lhg1Var, lhg1Var3, (lhg1) null, z2, z4, dbk0Var7, str4, fValueOf, fValueOf2, false, listC, smc0VarV5, listC, 28672);
                }
                map = map8;
                nig1Var = nig1Var2;
                kkg1Var = kkg1Var3;
                str10 = null;
                cbk0Var.g = str10;
                pvc0Var = (pvc0) u890.k(d0rVar2.b(o3rVar4.a(cbk0Var.b.b)), (d0r) null, (n4r) null);
                pvc0Var2 = (pvc0) u890.k(d0rVar2.b(o3rVar4.a(cbk0Var.c.b)), (d0r) null, (n4r) null);
                if (pvc0Var != null) {
                    map2 = pvc0Var.f;
                } else {
                    map2 = null;
                }
                if (map2 == null) {
                    map2 = map;
                }
                if (pvc0Var2 != null) {
                    map3 = pvc0Var2.f;
                } else {
                    map3 = null;
                }
                if (map3 == null) {
                    map4 = map;
                } else {
                    map4 = map3;
                }
                if (pvc0Var != null) {
                    zC = z6k0.c(pvc0Var.e);
                } else {
                    zC = true;
                }
                if (zC) {
                    dbk0Var2.getClass();
                    if (dbk0Var2 == dbk0Var) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                qxc0Var = (qxc0) u890.k(d0rVar2.b(o3rVar3.a(cbk0Var.a)), (d0r) null, (n4r) null);
                if (lhg1VarB2 != null) {
                    map5 = map2;
                    kkg1Var2 = kkg1Var;
                    lhg1Var = lhg1VarB2;
                    if (!lnn1.m(lhg1VarB2, kkg1Var2, cbk0Var.b.a, cbk0Var.c.a, map5, map4)) {
                    }
                    if (!((rxj0) s24Var.e).G) {
                        z2 = z;
                        lhg1VarA2 = null;
                    } else {
                        ruq0Var = lhg1VarA.b;
                        z2 = z;
                        if (lnn1.m(lhg1VarA, kkg1Var2, cbk0Var.b.a, cbk0Var.c.a, map5, map4)) {
                            lhg1VarA2 = null;
                        } else {
                            ruq0 ruq0Var6 = lhg1VarA.b;
                            String str111 = cbk0Var.b.b;
                            String str112 = cbk0Var.c.b;
                            String str113 = ruq0Var2.c;
                            String str114 = ruq0Var2.d;
                            str2 = ruq0Var2.e;
                            if (str2.length() == 0) {
                                str2 = ruq0Var.e;
                            }
                            String str115 = str2;
                            str3 = ruq0Var2.f;
                            if (str3.length() == 0) {
                                str3 = ruq0Var.f;
                            }
                            lhg1VarA2 = lhg1.a(lhg1VarA, (q6w0) null, ruq0.a(ruq0Var6, (String) null, (String) null, str113, str114, str115, str3, str111, str112, 0, 0, 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 524035), false, false, 1);
                        }
                    }
                    if (lhg1VarA2 != null) {
                        str4 = (String) map9.get("automix.arm_id");
                    } else {
                        str4 = null;
                    }
                    listC = z6x.a;
                    str5 = (String) map9.get("automix.explicit_feedback");
                    if (str5 != null) {
                        explicitFeedbackP = ExplicitFeedback.p(n9a.b(n9a.e, str5.getBytes(nne.a)));
                        smc0VarN = k4p1.n();
                        if (explicitFeedbackP.n()) {
                            lhg1Var3 = lhg1VarA2;
                            smc0VarN.add(new sr10("Core", "core", lhg1VarA4, false));
                        } else {
                            lhg1Var3 = lhg1VarA2;
                        }
                        h290 h290VarO4 = explicitFeedbackP.o();
                        arrayList = new ArrayList();
                        while (r2.hasNext()) {
                            if (((BackendTransition) obj2).p()) {
                                arrayList.add(obj2);
                            }
                        }
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            backendTransition = (BackendTransition) it.next();
                            lhg1VarA3 = kkg1.a(backendTransition.q());
                            if (lhg1VarA3 == null) {
                                it = it;
                                listC = listC;
                                sr10Var = null;
                            } else {
                                strO = backendTransition.o();
                                if (strO.length() > 0) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append((Object) String.valueOf(strO.charAt(0)).toUpperCase(Locale.ROOT));
                                    sb4.append(strO.substring(1));
                                    strO = sb4.toString();
                                }
                                sr10Var = new sr10(strO, backendTransition.o(), lhg1VarA3, false);
                            }
                            if (sr10Var != null) {
                                smc0VarN.add(sr10Var);
                            }
                            it = it;
                            listC = listC;
                            break;
                        }
                        listC = listC;
                        listC = k4p1.C(k4p1.k(smc0VarN));
                        break;
                    } else {
                        lhg1Var3 = lhg1VarA2;
                    }
                    if (lhg1Var3 != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    smc0 smc0VarV6 = s24Var.v(map9, lhg1VarA4, (lhg1) null, z3);
                    if (qxc0Var != null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    dbk0 dbk0Var8 = cbk0Var.e;
                    str6 = (String) map5.get("item.speed");
                    if (str6 != null) {
                        fB0 = nhc1.b0(str6);
                        if (fB0 != null) {
                            fFloatValue = fB0.floatValue();
                        } else {
                            fFloatValue = 1.0f;
                        }
                        fValueOf = Float.valueOf(fFloatValue);
                    } else {
                        fValueOf = null;
                    }
                    str7 = (String) map4.get("item.speed");
                    if (str7 != null) {
                        Float fB6 = nhc1.b0(str7);
                        fValueOf2 = Float.valueOf(fB6 != null ? fB6.floatValue() : 1.0f);
                    } else {
                        fValueOf2 = null;
                    }
                    return s24.w(s24Var, nig1Var, lhg1VarA4, lhg1Var2, lhg1Var, lhg1Var3, (lhg1) null, z2, z4, dbk0Var8, str4, fValueOf, fValueOf2, false, listC, smc0VarV6, listC, 28672);
                }
                map5 = map2;
                lhg1Var = lhg1VarB2;
                kkg1Var2 = kkg1Var;
                lhg1Var2 = null;
                if (!((rxj0) s24Var.e).G) {
                    z2 = z;
                    lhg1VarA2 = null;
                } else {
                    ruq0Var = lhg1VarA.b;
                    z2 = z;
                    if (lnn1.m(lhg1VarA, kkg1Var2, cbk0Var.b.a, cbk0Var.c.a, map5, map4)) {
                        lhg1VarA2 = null;
                    } else {
                        ruq0 ruq0Var7 = lhg1VarA.b;
                        String str116 = cbk0Var.b.b;
                        String str117 = cbk0Var.c.b;
                        String str118 = ruq0Var2.c;
                        String str119 = ruq0Var2.d;
                        str2 = ruq0Var2.e;
                        if (str2.length() == 0) {
                            str2 = ruq0Var.e;
                        }
                        String str1110 = str2;
                        str3 = ruq0Var2.f;
                        if (str3.length() == 0) {
                            str3 = ruq0Var.f;
                        }
                        lhg1VarA2 = lhg1.a(lhg1VarA, (q6w0) null, ruq0.a(ruq0Var7, (String) null, (String) null, str118, str119, str1110, str3, str116, str117, 0, 0, 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 524035), false, false, 1);
                    }
                }
                if (lhg1VarA2 != null) {
                    str4 = (String) map9.get("automix.arm_id");
                } else {
                    str4 = null;
                }
                listC = z6x.a;
                str5 = (String) map9.get("automix.explicit_feedback");
                if (str5 != null) {
                    explicitFeedbackP = ExplicitFeedback.p(n9a.b(n9a.e, str5.getBytes(nne.a)));
                    smc0VarN = k4p1.n();
                    if (explicitFeedbackP.n()) {
                        lhg1Var3 = lhg1VarA2;
                        smc0VarN.add(new sr10("Core", "core", lhg1VarA4, false));
                    } else {
                        lhg1Var3 = lhg1VarA2;
                    }
                    h290 h290VarO5 = explicitFeedbackP.o();
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                        if (((BackendTransition) obj2).p()) {
                            arrayList.add(obj2);
                        }
                    }
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        backendTransition = (BackendTransition) it.next();
                        lhg1VarA3 = kkg1.a(backendTransition.q());
                        if (lhg1VarA3 == null) {
                            it = it;
                            listC = listC;
                            sr10Var = null;
                        } else {
                            strO = backendTransition.o();
                            if (strO.length() > 0) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append((Object) String.valueOf(strO.charAt(0)).toUpperCase(Locale.ROOT));
                                sb5.append(strO.substring(1));
                                strO = sb5.toString();
                            }
                            sr10Var = new sr10(strO, backendTransition.o(), lhg1VarA3, false);
                        }
                        if (sr10Var != null) {
                            smc0VarN.add(sr10Var);
                        }
                        it = it;
                        listC = listC;
                        break;
                    }
                    listC = listC;
                    listC = k4p1.C(k4p1.k(smc0VarN));
                    break;
                } else {
                    lhg1Var3 = lhg1VarA2;
                }
                if (lhg1Var3 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                smc0 smc0VarV7 = s24Var.v(map9, lhg1VarA4, (lhg1) null, z3);
                if (qxc0Var != null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                dbk0 dbk0Var9 = cbk0Var.e;
                str6 = (String) map5.get("item.speed");
                if (str6 != null) {
                    fB0 = nhc1.b0(str6);
                    if (fB0 != null) {
                        fFloatValue = fB0.floatValue();
                    } else {
                        fFloatValue = 1.0f;
                    }
                    fValueOf = Float.valueOf(fFloatValue);
                } else {
                    fValueOf = null;
                }
                str7 = (String) map4.get("item.speed");
                if (str7 != null) {
                    Float fB7 = nhc1.b0(str7);
                    fValueOf2 = Float.valueOf(fB7 != null ? fB7.floatValue() : 1.0f);
                } else {
                    fValueOf2 = null;
                }
                return s24.w(s24Var, nig1Var, lhg1VarA4, lhg1Var2, lhg1Var, lhg1Var3, (lhg1) null, z2, z4, dbk0Var9, str4, fValueOf, fValueOf2, false, listC, smc0VarV7, listC, 28672);
            case 13:
                return this.b;
            case 14:
                return new DispatcherWorker(((se80) this.b).e);
            case 15:
                fb3 fb3Var = (fb3) this.b;
                return new kpg0(new ng20((cm0) fb3Var.c), new z5z(fb3Var, (byte) 26));
            case 16:
                kly0 kly0Var = (kly0) ((Optional) ((h72) this.b).h).orElse(null);
                if (kly0Var != null) {
                    return (w6x) kly0Var.get();
                }
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (dwo) ((go80) this.b).a.invoke();
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((jp80) this.b).b.a();
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                oq80 oq80Var = (oq80) this.b;
                if (oq80Var.c > 0) {
                    nq80 nq80Var2 = oq80Var.i;
                    if (nq80Var2 == null) {
                        u890.C("coreInstrumentationListener");
                        throw null;
                    }
                    nq80Var = nq80Var2;
                } else {
                    nq80Var = null;
                }
                z4n z4nVar = new z4n(oq80Var.a, oq80Var.e, oq80Var.d, oq80Var.f, nq80Var, oq80Var.g);
                u9c u9cVar = oq80Var.b;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                arrayList3.add(new e3i1());
                jd11 jd11Var = rc11.a;
                arrayList6.add(new og(z4nVar, jd11Var.b(j2i1.class), (byte) 17));
                arrayList3.add(new vlm0(oq80Var.h));
                arrayList3.add(new qas0());
                arrayList5.add(new mmr0(new q05((byte) 2), jd11Var.b(j2i1.class)));
                u9cVar.d = new h1i(ila0.F(arrayList3), ila0.F(arrayList4), ila0.F(arrayList5), ila0.F(arrayList6), ila0.F(arrayList7));
                return u9cVar.d();
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Intent intent = new Intent("android.intent.action.MAIN");
                ys80 ys80Var = (ys80) this.b;
                Context context3 = ys80Var.a;
                intent.setClassName(context3, ys80Var.c);
                return PendingIntent.getActivity(context3, 0, intent, 67108864);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                o860 o860Var = (o860) this.b;
                return p7h.H(new fyf0[]{(p680) o860Var.b, (z3c) o860Var.c, (exn0) o860Var.d});
            case 22:
                gx80 gx80Var = (gx80) this.b;
                cx80 cx80Var = gx80Var.X.d;
                if (cx80Var != null) {
                    cx80Var.cancel();
                }
                bqk0 bqk0Var = gx80Var.Z;
                bqk0Var.getClass();
                x6h1 x6h1VarC = bqk0Var.b.c();
                x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 23:
                return new DispatcherWorker(((bz80) this.b).g);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ez80 ez80Var = (ez80) this.b;
                boolean zT = ez80Var.c.t();
                mr4 mr4Var = ez80Var.m;
                if (tx9.t(zT, mr4Var.n(), mr4Var.u())) {
                    ((ipk1) ez80Var.o.get()).getClass();
                }
                return null;
            case 25:
                qz80 qz80Var = (qz80) this.b;
                long jNanoTime = System.nanoTime();
                o811 o811Var = new o811();
                o811 o811Var2 = new o811();
                synchronized (qz80Var.c) {
                    o811Var.a = jNanoTime - qz80Var.e;
                    o811Var2.a = 1000000000 / ((long) qz80Var.d);
                }
                fn31.T(qz80Var.a, (o8n) null, 0, new oz80(o811Var, o811Var2, qz80Var, jNanoTime, (lnm) null), 3);
                return rih1.a;
            case 26:
                return (i390) this.b;
            case 27:
                ((da90) this.b).d = true;
                return rih1.a;
            case 28:
                ((hb90) this.b).h.a(rgm1.a);
                return rih1.a;
            default:
                or90 or90Var = (or90) this.b;
                return p7h.M(new yt90[]{((kly0) or90Var.b).get(), ((kly0) or90Var.c).get(), ((kly0) or90Var.d).get(), ((kly0) or90Var.e).get(), ((kly0) or90Var.f).get(), ((kly0) or90Var.g).get()});
        }
    }
}
