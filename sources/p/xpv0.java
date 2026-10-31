package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import spotify.profile_esperanto.proto.ChangeDisplayNameResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xpv0 implements iar0, Function, Predicate, BiFunction, s2i1, mnm, c290, dl4, hhh0, fy71, n8n {
    public final /* synthetic */ byte a;
    public static final xpv0 b = new xpv0(0);
    public static final xpv0 c = new xpv0(1);
    public static final xpv0 d = new xpv0(2);
    public static final xpv0 e = new xpv0(3);
    public static final xpv0 f = new xpv0(4);
    public static final xpv0 g = new xpv0(5);
    public static final xpv0 h = new xpv0(6);
    public static final xpv0 i = new xpv0(7);
    public static final xpv0 t = new xpv0(8);
    public static final xpv0 X = new xpv0(9);
    public static final /* synthetic */ xpv0 Y = new xpv0(10);

    public /* synthetic */ xpv0(byte b2) {
        this.a = b2;
    }

    public static n8b1 b() {
        return irn1.l0(pto1.q(324, 1, 30.0f), 324.0f, (Object) null, 4);
    }

    public static n8b1 e() {
        return irn1.l0(pto1.q(207, 1, 24.0f), 207.0f, (Object) null, 4);
    }

    public static boolean g(ContextTrack contextTrack) {
        Set set = s4b1.f;
        return uic.x(l4o1.b0(contextTrack)).c == blc0.PODCAST_CHAPTER;
    }

    public static smc0 h(String str) {
        smc0 smc0VarN = k4p1.n();
        nh40 it = se11.b(sxx0.c(), str).iterator();
        while (true) {
            nh40 nh40Var = it;
            if (!nh40Var.hasNext()) {
                return k4p1.k(smc0VarN);
            }
            mbh0 mbh0Var = (mbh0) nh40Var.next();
            String str2 = (String) mbh0Var.a().get(1);
            xkg0 xkg0Var = new xkg0();
            nh40 it2 = se11.b(sxx0.b(), str2).iterator();
            while (true) {
                nh40 nh40Var2 = it2;
                if (!nh40Var2.hasNext()) {
                    break;
                }
                mbh0 mbh0Var2 = (mbh0) nh40Var2.next();
                xkg0Var.put(mbh0Var2.a().get(1), sxx0.a((String) mbh0Var2.a().get(2)));
            }
            xkg0 xkg0VarB = xkg0Var.b();
            String str3 = (String) mbh0Var.a().get(2);
            String str4 = (String) xkg0VarB.get("field");
            if (str4 != null) {
                String str5 = (String) xkg0VarB.get("value");
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = (String) xkg0VarB.get("unit");
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = (String) xkg0VarB.get("format");
                String str8 = (String) xkg0VarB.get("min");
                Double dA0 = str8 != null ? nhc1.a0(str8) : null;
                String str9 = (String) xkg0VarB.get("max");
                Double dA1 = str9 != null ? nhc1.a0(str9) : null;
                String str10 = (String) xkg0VarB.get("step");
                Double dA2 = str10 != null ? nhc1.a0(str10) : null;
                smc0VarN.add(new wwx0(str4, str5, str6, str7, (dA0 == null && dA1 == null && dA2 == null) ? null : new t120(dA0, dA1, dA2), sxx0.a(str3), mbh0Var.a.group()));
            }
        }
    }

    public static n8b1 j() {
        return irn1.l0(pto1.q(240, 2, 40.0f), 240.0f, (Object) null, 4);
    }

    public static n8b1 k() {
        return irn1.l0(pto1.q(950, 2, 96.0f), 950.0f, (Object) null, 4);
    }

    public static final j3o1 l(Object obj, Object obj2) {
        j3o1 j3o1VarA = (j3o1) obj;
        j3o1 j3o1Var = (j3o1) obj2;
        if (!j3o1Var.isEmpty()) {
            if (!j3o1VarA.a) {
                j3o1VarA = j3o1VarA.a();
            }
            j3o1VarA.b();
            if (!j3o1Var.isEmpty()) {
                j3o1VarA.putAll(j3o1Var);
            }
        }
        return j3o1VarA;
    }

    @Override // p.iar0
    public Parcelable a(s4b1 s4b1Var, th61 th61Var) {
        return new upv0(nik1.Q1, 2131952692);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                byte[] bArr = (byte[]) obj;
                try {
                    return ChangeDisplayNameResponse.n(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.profile_esperanto.proto.ChangeDisplayNameResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 5:
                return Boolean.valueOf(y7y0.G((Map) obj));
            default:
                return new f5l1(((b141) obj).c);
        }
    }

    @Override // p.fy71
    public mr20 c(foc1 foc1Var) {
        return new xkb1(foc1Var, (byte) 0);
    }

    public Object convert(int i2) {
        wd00 wd00Var;
        switch (this.a) {
            case 12:
                if (i2 == 0) {
                    wd00Var = wd00.EVENT_TYPE_UNKNOWN;
                } else if (i2 == 1) {
                    wd00Var = wd00.DISMISS;
                } else if (i2 != 2) {
                    wd00Var = i2 != 3 ? null : wd00.CLICK;
                } else {
                    wd00Var = wd00.VIEW;
                }
                return wd00Var == null ? wd00.UNRECOGNIZED : wd00Var;
            default:
                hm8 hm8VarA = hm8.a(i2);
                return hm8VarA == null ? hm8.h : hm8VarA;
        }
    }

    public Object d(Task task) throws IOException {
        if (task.j()) {
            return (Bundle) task.g();
        }
        if (Log.isLoggable("Rpc", 3)) {
            new StringBuilder(String.valueOf(task.f()).length() + 22);
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.f());
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:118:0x0220  */
    /* JADX WARN: Code duplicated, block: B:122:0x0233 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0235  */
    /* JADX WARN: Code duplicated, block: B:124:0x0238  */
    /* JADX WARN: Code duplicated, block: B:129:0x0249  */
    /* JADX WARN: Code duplicated, block: B:132:0x0253  */
    /* JADX WARN: Code duplicated, block: B:137:0x0266  */
    /* JADX WARN: Code duplicated, block: B:139:0x0278  */
    /* JADX WARN: Code duplicated, block: B:141:0x027c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0280  */
    /* JADX WARN: Code duplicated, block: B:154:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:171:0x0301  */
    /* JADX WARN: Code duplicated, block: B:173:0x030b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0319  */
    /* JADX WARN: Code duplicated, block: B:176:0x0325  */
    /* JADX WARN: Code duplicated, block: B:178:0x0333  */
    /* JADX WARN: Code duplicated, block: B:185:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:90:0x019e  */
    public ArrayList f(PlayerState playerState, ota1 ota1Var, boolean z, sp91 sp91Var, boolean z2, ghh0 ghh0Var, boolean z3, wqg wqgVar, boolean z4) {
        ContextTrack contextTrack;
        boolean z5;
        Object obj;
        String strContextUri;
        boolean z6;
        Iterator it;
        bhh0 bhh0Var;
        boolean zShufflingContext;
        rp91 rp91Var;
        ggh0 ggh0Var = ggh0.d;
        vgh0 vgh0Var = vgh0.a;
        int i2 = ota1Var.a;
        nta1 nta1Var = ota1Var.b;
        ArrayList arrayList = new ArrayList(30);
        arrayList.addAll(hhh0.b0);
        spq0 spq0VarTrack = playerState.track();
        if (spq0VarTrack != null && (contextTrack = (ContextTrack) spq0VarTrack.h()) != null && (l4o1.E(contextTrack) || !l4o1.Y(contextTrack) || !u890.j(contextTrack.metadata().get("is_backgroundable"), "false"))) {
            arrayList.add(wgh0.b);
            if (playerState.isPaused()) {
                arrayList.add(lgh0.a);
            } else {
                arrayList.add(vgh0.b);
                arrayList.add(lgh0.b);
            }
            ktl ktlVar = ghh0Var.f;
            boolean z7 = ghh0Var.g;
            if (!l4o1.P(contextTrack) && !g(contextTrack)) {
                Set set = s4b1.f;
                if (uic.x(l4o1.b0(contextTrack)).c == blc0.CLIP || z7) {
                    if (z7) {
                        z5 = false;
                    }
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else if (z7 || ktlVar == ktl.c || ktlVar != ktl.b) {
                z5 = true;
            } else {
                z5 = false;
            }
            jta1 jta1Var = jta1.a;
            qgh0 qgh0Var = qgh0.d;
            pgh0 pgh0Var = pgh0.d;
            if (z5) {
                boolean zIsEmpty = playerState.restrictions().disallowSeekingReasons().isEmpty();
                if (ghh0Var.h && zIsEmpty) {
                    arrayList.add(pgh0Var);
                    arrayList.add(sgh0.d);
                } else if (zIsEmpty) {
                    arrayList.add(pgh0Var);
                    arrayList.add(qgh0Var);
                }
                if (u890.j(nta1Var, jta1Var)) {
                    arrayList.add(new jgh0(i2));
                }
            }
            boolean zQ = l4o1.Q(contextTrack);
            rgh0 rgh0Var = rgh0.a;
            if (zQ) {
                Restrictions restrictions = playerState.restrictions();
                if (restrictions.disallowSkippingNextReasons().isEmpty()) {
                    arrayList.add(ggh0.e);
                    arrayList.add(rgh0Var);
                } else if (restrictions.disallowSeekingReasons().isEmpty()) {
                    arrayList.add(pgh0Var);
                    arrayList.add(qgh0Var);
                }
                if (u890.j(nta1Var, jta1Var)) {
                    arrayList.add(new jgh0(i2));
                    return arrayList;
                }
            } else if (!l4o1.E(contextTrack)) {
                arrayList.add(vgh0.d);
                if (playerState.restrictions().disallowSeekingReasons().isEmpty()) {
                    arrayList.add(wgh0.c);
                }
                ogh0 ogh0Var = ogh0.d;
                if (z5) {
                    if (!Boolean.parseBoolean((String) playerState.contextMetadata().get("is_audiobook"))) {
                        if (z2) {
                            arrayList.add(ogh0Var);
                        } else {
                            arrayList.add(ggh0Var);
                        }
                    }
                    if (z3) {
                        b380 b380VarSignals = playerState.signals();
                        if (!(g(contextTrack) && b380VarSignals.contains("switch-to-full-episode")) && (g(contextTrack) || !ghh0Var.e)) {
                            b380 b380VarSignals2 = playerState.signals();
                            Set set2 = s4b1.f;
                            if (uic.x(l4o1.b0(contextTrack)).c == blc0.CLIP && b380VarSignals2.contains("switch-to-full-episode")) {
                                arrayList.add(hgh0.e);
                            }
                        } else {
                            arrayList.add(hgh0.e);
                        }
                    }
                    String strContextUri2 = playerState.contextUri();
                    Set set3 = s4b1.f;
                    v5b1 v5b1Var = uic.x(strContextUri2).d;
                    b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
                    if (u890.j(type, wyu0.f) || (u890.j(type, nyu0.e) && !strContextUri2.equals("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt") && (wqgVar == null || !strContextUri2.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD")))) {
                        if (!z5) {
                            arrayList.add(rgh0Var);
                        }
                        if (!z5) {
                            arrayList.add(tgh0.a);
                        }
                        if (playerState.restrictions().disallowTogglingShuffleReasons().isEmpty()) {
                            arrayList.add(wgh0.a);
                            zShufflingContext = playerState.options().shufflingContext();
                            if (sp91Var != null) {
                                if (zShufflingContext) {
                                    rp91Var = rp91.b;
                                } else {
                                    rp91Var = rp91.a;
                                }
                            } else if (zShufflingContext) {
                                rp91Var = rp91.b;
                            } else {
                                rp91Var = rp91.a;
                            }
                            arrayList.add(new kgh0(rp91Var));
                        }
                        if (arrayList.isEmpty()) {
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    bhh0Var = (bhh0) it.next();
                                    if (!u890.j(bhh0Var, ggh0Var)) {
                                    }
                                } else if (Boolean.parseBoolean((String) contextTrack.metadata().get("collection.can_add"))) {
                                    if (z2) {
                                    }
                                    if (obj == null) {
                                        obj = hgh0.d;
                                    }
                                    arrayList.add(obj);
                                }
                            }
                        } else if (Boolean.parseBoolean((String) contextTrack.metadata().get("collection.can_add"))) {
                            if (z2) {
                            }
                            if (obj == null) {
                                obj = hgh0.d;
                            }
                            arrayList.add(obj);
                        }
                        strContextUri = playerState.contextUri();
                        Set set4 = s4b1.f;
                        if (ihh0.a[uic.x(strContextUri).c.ordinal()] != 1) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (z) {
                            arrayList.add(zgh0.e);
                        }
                        if (playerState.options().repeatingContext()) {
                            if (playerState.options().repeatingTrack()) {
                                if (playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()) {
                                    arrayList.add(new ygh0(true));
                                    arrayList.add(vgh0Var);
                                }
                            } else if (playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()) {
                                arrayList.add(xgh0.d);
                                arrayList.add(vgh0Var);
                            }
                        } else if (playerState.options().repeatingTrack()) {
                            if (playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()) {
                                arrayList.add(new ygh0(true));
                                arrayList.add(vgh0Var);
                            }
                        } else if (playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()) {
                            arrayList.add(xgh0.d);
                            arrayList.add(vgh0Var);
                        }
                        if (o4p1.t(playerState)) {
                            arrayList.add(ahh0.e);
                        }
                    }
                } else {
                    if (!z5 && playerState.restrictions().disallowSkippingNextReasons().isEmpty()) {
                        arrayList.add(rgh0Var);
                    }
                    if (!z5 && (playerState.restrictions().disallowSkippingPrevReasons().isEmpty() || playerState.restrictions().disallowSeekingReasons().isEmpty())) {
                        arrayList.add(tgh0.a);
                    }
                    if (playerState.restrictions().disallowTogglingShuffleReasons().isEmpty()) {
                        arrayList.add(wgh0.a);
                        zShufflingContext = playerState.options().shufflingContext();
                        if (sp91Var != null || (rp91Var = sp91Var.a) == null) {
                            if (zShufflingContext) {
                                rp91Var = rp91.b;
                            } else {
                                rp91Var = rp91.a;
                            }
                        }
                        arrayList.add(new kgh0(rp91Var));
                    }
                    if (arrayList.isEmpty()) {
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                bhh0Var = (bhh0) it.next();
                                if (!u890.j(bhh0Var, ggh0Var) || u890.j(bhh0Var, ogh0Var)) {
                                }
                            } else if (Boolean.parseBoolean((String) contextTrack.metadata().get("collection.can_add"))) {
                                if (z2) {
                                }
                                if (obj == null) {
                                    obj = hgh0.d;
                                }
                                arrayList.add(obj);
                            }
                        }
                    } else if (Boolean.parseBoolean((String) contextTrack.metadata().get("collection.can_add"))) {
                        obj = z2 ? ahh0.d : null;
                        if (obj == null) {
                            obj = hgh0.d;
                        }
                        arrayList.add(obj);
                    }
                    strContextUri = playerState.contextUri();
                    Set set5 = s4b1.f;
                    if (ihh0.a[uic.x(strContextUri).c.ordinal()] != 1 || l4o1.P(contextTrack) || l4o1.M(contextTrack)) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (z && !z4 && z6 && !o4p1.t(playerState)) {
                        arrayList.add(zgh0.e);
                    }
                    if (playerState.options().repeatingContext() || playerState.options().repeatingTrack()) {
                        if (playerState.options().repeatingTrack()) {
                            if (playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()) {
                                arrayList.add(new ygh0(true));
                                arrayList.add(vgh0Var);
                            }
                        } else if (playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()) {
                            arrayList.add(xgh0.d);
                            arrayList.add(vgh0Var);
                        }
                    } else if (playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()) {
                        arrayList.add(zgh0.d);
                        arrayList.add(vgh0Var);
                    } else if (playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()) {
                        arrayList.add(new ygh0(false));
                        arrayList.add(vgh0Var);
                    }
                    if (o4p1.t(playerState) && !l4o1.O(contextTrack)) {
                        arrayList.add(ahh0.e);
                    }
                }
            } else if (playerState.restrictions().disallowSkippingNextReasons().isEmpty()) {
                arrayList.add(rgh0Var);
                return arrayList;
            }
        }
        return arrayList;
    }

    @Override // p.s2i1
    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("account_id");
        if (str4 == null || !gho1.k(str4) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
            return null;
        }
        return new aji1(str4, str3, xkg0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return ((PlayerError) obj).error() != ErrorType.SUCCESS;
            case 3:
                return !((Map) obj).isEmpty();
            default:
                String str = ((k5a1) obj).h;
                return str == null || str.length() == 0;
        }
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return "sans-serif-medium";
            case 20:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    @Override // p.dl4
    public void w(Object obj) {
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                return new mmr0((Boolean) obj, (zv21) obj2);
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
        }
    }
}
