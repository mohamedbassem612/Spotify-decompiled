package p;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Timestamp;
import com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerState;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentDisplayResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function8;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ulc implements c290, mqr0, Function, BiPredicate, Init, Function8 {
    public final /* synthetic */ byte a;

    public ulc(daq daqVar, teq teqVar) {
        this.a = (byte) 4;
    }

    public static final String h(String str) {
        List listQ0 = ihc1.Q0(str, new String[]{"."}, 0, 6);
        String str2 = listQ0.size() == 1 ? (String) listQ0.get(0) : (String) o7h.A0(listQ0);
        return str2.length() <= 127 ? str2 : ihc1.c1(127, str2);
    }

    public static final String i(String str) {
        Pattern pattern = esg0.b;
        if (esg0.b.matcher(str).matches()) {
            return ihc1.Z0(str, ":markasplayed");
        }
        hhg1.n("Invalid uri passed: ".concat(str));
        return null;
    }

    public static p6r0 j(xo20 xo20Var) {
        if (xo20Var == null) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.U4();
        }
        wo20 wo20Var = xo20Var.b;
        if (wo20Var instanceof to20) {
            int iC = l1d.C(((to20) wo20Var).a);
            if (iC == 0) {
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                return yon1.G1("SEARCH_VIDEOS", "search/videos", 1801, "search");
            }
            if (iC == 1) {
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                return yon1.G1("SEARCH_PODCASTS_AND_EPISODES", "search/podcasts_and_episodes", 1794, "search");
            }
            if (iC == 2) {
                AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                return yon1.G1("SEARCH_LIVE_EVENTS", "search/live_events", 1790, "search");
            }
            eg.o();
            return null;
        }
        if (!(wo20Var instanceof uo20)) {
            if (wo20Var instanceof vo20) {
                AtomicReferenceArray atomicReferenceArray5 = p6r0.e;
                return yon1.G1("SEARCH_RECENT", "search/recent", 1798, "search");
            }
            eg.o();
            return null;
        }
        switch (l1d.C(fn31.X(((uo20) wo20Var).a))) {
            case 0:
                AtomicReferenceArray atomicReferenceArray6 = p6r0.e;
                return yon1.G1("SEARCH_ARTISTS", "search/artists", 1780, "search");
            case 1:
                AtomicReferenceArray atomicReferenceArray7 = p6r0.e;
                return yon1.G1("SEARCH_SONGS", "search/songs", 1800, "search");
            case 2:
                AtomicReferenceArray atomicReferenceArray8 = p6r0.e;
                return yon1.G1("SEARCH_ALBUMS", "search/albums", 1779, "search");
            case 3:
                AtomicReferenceArray atomicReferenceArray9 = p6r0.e;
                return yon1.G1("SEARCH_PLAYLISTS", "search/playlists", 1793, "search");
            case 4:
                AtomicReferenceArray atomicReferenceArray10 = p6r0.e;
                return yon1.G1("SEARCH_GENRES", "search/genres", 1787, "search");
            case 5:
                AtomicReferenceArray atomicReferenceArray11 = p6r0.e;
                return yon1.G1("SEARCH_SHOWS", "search/shows", 1799, "search");
            case 6:
                AtomicReferenceArray atomicReferenceArray12 = p6r0.e;
                return yon1.G1("SEARCH_AUDIOS", "search/audios", 1782, "search");
            case 7:
                AtomicReferenceArray atomicReferenceArray13 = p6r0.e;
                return yon1.G1("SEARCH_PODCASTS_AND_EPISODES", "search/podcasts_and_episodes", 1794, "search");
            case 8:
                AtomicReferenceArray atomicReferenceArray14 = p6r0.e;
                return yon1.G1("SEARCH_PROFILES", "search/profiles", 1797, "search");
            case 9:
                AtomicReferenceArray atomicReferenceArray15 = p6r0.e;
                return yon1.G1("SEARCH_AUDIOBOOKS", "search/audiobooks", 1781, "search");
            default:
                eg.o();
                return null;
        }
    }

    public static svz0 k() {
        return svz0.d;
    }

    public static String l(Timestamp timestamp) {
        try {
            Locale locale = Locale.getDefault();
            Date date = new Date(timestamp.q() * 1000);
            DateFormat dateInstance = DateFormat.getDateInstance(1, locale);
            dateInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            String str = dateInstance.format(date);
            str.getClass();
            return str;
        } catch (Exception unused) {
            n57.e("Received invalid timestamp: " + timestamp);
            return "-";
        }
    }

    public static svz0 m(sc50 sc50Var) {
        List list = sc50Var.c;
        svz0 svz0Var = svz0.d;
        int iS = zno1.s(q7h.U(list, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : list) {
            m67 m67Var = (m67) obj;
            svz0 svz0Var2 = svz0.d;
            linkedHashMap.put(o(m67Var.b, m67Var.a), obj);
        }
        return new svz0(sc50Var, Collections.unmodifiableMap(linkedHashMap));
    }

    public static svz0 n(byte[] bArr) {
        Configuration configurationT = Configuration.t(bArr);
        h290<Configuration.AssignedValue> h290VarO = configurationT.o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (Configuration.AssignedValue assignedValue : h290VarO) {
            assignedValue.getClass();
            arrayList.add(l67.b(assignedValue));
        }
        return m(new sc50(configurationT.p(), configurationT.r(), Collections.unmodifiableList(arrayList), configurationT.s(), 16));
    }

    public static String o(String str, String str2) {
        return f4i1.f(str, ":", str2);
    }

    public static String p() {
        return UUID.randomUUID().toString();
    }

    public static float q() {
        String str = Build.MODEL;
        return (nhc1.Y(str, "SM-F731", false) || nhc1.Y(str, "SM-F741", false)) ? 32.0f : 0.0f;
    }

    public static void r(Context context, String str, tv80 tv80Var) {
        int i = ParentalConsentWebActivity.i1;
        Intent intent = new Intent(context, (Class<?>) ParentalConsentWebActivity.class);
        intent.putExtra("url", str);
        intent.putExtra("interaction_logging_result", (Parcelable) tv80Var);
        context.startActivity(intent);
    }

    public static String t(String str) {
        Set set = s4b1.f;
        return uic.x(str).h();
    }

    public void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1329564356);
        int i2 = i | (b0kVar3.i(function0) ? 4 : 2) | 48;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("playlist_participants_add_collaborator_item", u291.f(qim0Var3, 1.0f));
            String strO0 = cwl1.o0(b0kVar3, 2131960093);
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new isr0(function0, (byte) 25);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarN, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function1), (gbx) null, (xu30) null, s8j.b, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, s8j.c, b0kVar2, 805306368, 196608, 32190);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(this, function0, qim0Var2, i, (byte) 18);
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 14:
                GetCommentDisplayResponse getCommentDisplayResponse = (GetCommentDisplayResponse) obj;
                return new cph(getCommentDisplayResponse.n().r(), new ijh(1, new uge1(Collections.singletonList(getCommentDisplayResponse.n())), 1, getCommentDisplayResponse.o(), "", (String) null), new cg21(mqo1.A(Collections.singletonList(getCommentDisplayResponse.p())), 1, (String) null, (String) null, false, 57));
            case 26:
                throw td6.k(obj);
            default:
                Observable observable = (Observable) obj;
                return Observable.concatEager(p7h.M(new Observable[]{observable.take(1L).map(new rrr(osh1.Y0, (byte) 5)), observable.skip(1L).map(new rrr(osh1.Z0, (byte) 5))}));
        }
    }

    public Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        Map map = (Map) obj4;
        boolean zBooleanValue3 = ((Boolean) obj6).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj7).booleanValue();
        mmr0 mmr0Var = (mmr0) obj8;
        md2 md2Var = (md2) mmr0Var.a;
        return new r910((PlayerState) obj, zBooleanValue, zBooleanValue2, y7y0.t("obfuscate-restricted-tracks", map), y7y0.L(map), rh11.c(map), ((Map) obj5).containsValue(Boolean.TRUE), zBooleanValue3, false, zBooleanValue4, md2Var.a, md2Var.b, (px3) mmr0Var.b);
    }

    public void c(ubg ubgVar, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1668929934);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(ubgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(nim0.a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            jbg jbgVar = ubgVar.a;
            boolean z = jbgVar instanceof jbg ? jbgVar.a : false;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            boolean zI = x340Var.i(c9nVar) | x340Var.i(iu30Var) | x340Var.i(ven0Var2);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new d1c(c9nVar, iu30Var, ven0Var2, (byte) 17);
                x340Var.s0(objT4);
            }
            Function0 function1 = (Function0) objT4;
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                x340Var.i0(551105984);
                boolean zI2 = x340Var.i(ven0Var2) | x340Var.g(function1);
                Object objT5 = x340Var.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new cb(function1, ven0Var2, (byte) 6);
                    x340Var.s0(objT5);
                }
                Function0 function2 = (Function0) objT5;
                boolean zI3 = x340Var.i(ven0Var2);
                Object objT6 = x340Var.T();
                if (zI3 || objT6 == m4cVar) {
                    objT6 = new hnf(ven0Var2, (byte) 3);
                    x340Var.s0(objT6);
                }
                azo1.c(function2, (Function0) objT6, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(551278964);
                x340Var.r(false);
            }
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(551345769);
                boolean zI4 = x340Var.i(ven0Var) | x340Var.g(function1);
                Object objT7 = x340Var.T();
                if (zI4 || objT7 == m4cVar) {
                    objT7 = new cb(function1, ven0Var, (byte) 7);
                    x340Var.s0(objT7);
                }
                Function0 function3 = (Function0) objT7;
                boolean zI5 = x340Var.i(ven0Var);
                Object objT8 = x340Var.T();
                if (zI5 || objT8 == m4cVar) {
                    objT8 = new hnf(ven0Var, (byte) 4);
                    x340Var.s0(objT8);
                }
                azo1.a(function3, (Function0) objT8, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(551540852);
                x340Var.r(false);
            }
            boolean zI6 = x340Var.i(ubgVar) | x340Var.i(ven0Var) | x340Var.g(function1);
            Object objT9 = x340Var.T();
            if (zI6 || objT9 == m4cVar) {
                objT9 = new d1c(ubgVar, function1, ven0Var, (byte) 18);
                x340Var.s0(objT9);
            }
            nyx.a(2, (wux) null, apo.r(463432923, new lf2(z, function0, (Function0) objT9, (byte) 1), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(this, ubgVar, function0, iu30Var, i);
        }
    }

    public Object convert(int i) {
        loz lozVar;
        switch (this.a) {
            case 9:
                if (i == 0) {
                    lozVar = loz.b;
                } else if (i == 1) {
                    lozVar = loz.c;
                } else if (i != 2) {
                    lozVar = i != 3 ? null : loz.e;
                } else {
                    lozVar = loz.d;
                }
                return lozVar == null ? loz.f : lozVar;
            default:
                hjh1 hjh1VarA = hjh1.a(i);
                return hjh1VarA == null ? hjh1.Y : hjh1VarA;
        }
    }

    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        u470 u470Var = new u470(parcel);
        u470Var.a = parcel.readParcelable(classLoader);
        return u470Var;
    }

    public void d(b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1255870190);
        int i3 = i & 6;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 = i | (x340Var.i(nim0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            uwo1.e(cwl1.o0(x340Var, 2131960094), ktd.m(een.Q0, uyn1.x(nim0Var, cbx.b(x340Var).e.b)), cbx.d(x340Var).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            avw0 avw0Var = cbx.b(x340Var).c;
            op71.g(x340Var, dug.f(u291.h(qim0VarF, 1.0f), cbx.a(x340Var).a.b.c(), d4o1.a));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(this, i);
        }
    }

    public void e(fji0 fji0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(465339910);
        int i2 = i | (b0kVar3.g(fji0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384 | (b0kVar3.g(this) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("playlist_participants_collaborator_item: ".concat(fji0Var.a.a), u291.f(qim0Var3, 1.0f));
            String strO0 = cwl1.o0(b0kVar3, fji0Var.c ? 2131960115 : 2131960114);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new wpu0(iu30Var, fji0Var, (byte) 0);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarN, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, (xu30) null, apo.r(-2067490243, new xpu0(fji0Var), b0kVar3), (xu30) null, apo.r(626106686, new xpu0(this, fji0Var, (byte) 1), b0kVar3), (xu30) null, (xu30) null, (xu30) null, apo.r(-1645782206, new xpu0(this, fji0Var, (byte) 2), b0kVar3), b0kVar2, 805306368, 196656, 30142);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, this, fji0Var, iu30Var, qim0Var2, (byte) 21);
        }
    }

    public First e0(Object obj) {
        xeq0 xeq0Var = (xeq0) obj;
        return First.c(xeq0Var, Collections.singleton(new ecq0(xeq0Var.a)));
    }

    public void f(zpu0 zpu0Var, Function0 function0, vu30 vu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-853587858);
        int i2 = i | (x340Var.i(zpu0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128) | (x340Var.g(this) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            i6o0 i6o0VarQ = k1o1.q(x340Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            d(x340Var, (i2 >> 9) & 126);
            qim0 qim0VarL = bmq0.L(nim0Var, i6o0VarQ, (g6o0) null);
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarX = poo1.x(new bgc0(lhc.g(x340Var).g, 32), x340Var);
            boolean zI = ((i2 & 112) == 32) | ((57344 & i2) == 16384) | x340Var.i(zpu0Var) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                ntf0 ntf0Var = new ntf0(zpu0Var, this, function0, vu30Var, (byte) 29);
                x340Var.s0(ntf0Var);
                objT = ntf0Var;
            }
            ujo1.d(qim0VarL, (xtb0) null, vk80VarX, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 506);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, this, zpu0Var, function0, vu30Var, (byte) 22);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void g(xca0 xca0Var, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(714343226);
        int i2 = i | (x340Var.g(xca0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (xca0Var instanceof vca0) {
                x340Var.i0(-563681813);
                obg1.b((vca0) xca0Var, function0, function1, function2, x340Var, i2 & 65534);
                x340Var.r(false);
            } else {
                if (!xca0Var.equals(wca0.a)) {
                    throw p3d1.k(x340Var, -710921200, false);
                }
                x340Var.i0(-563445097);
                x340Var.r(false);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uuy(this, xca0Var, function0, function1, function2, qim0Var2, i, (byte) 10);
        }
    }

    public Object[] newArray(int i) {
        return new u470[i];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(iud iudVar, wh71 wh71Var, onm onmVar) {
        o6n0 o6n0Var;
        if (onmVar instanceof o6n0) {
            o6n0Var = (o6n0) onmVar;
            int i = o6n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o6n0Var.c = i - Integer.MIN_VALUE;
            } else {
                o6n0Var = new o6n0(this, onmVar);
            }
        } else {
            o6n0Var = new o6n0(this, onmVar);
        }
        Object obj = o6n0Var.a;
        int i2 = o6n0Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return null;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (iudVar instanceof aud) {
            return new b7n0(((aud) iudVar).a);
        }
        if (iudVar instanceof ztd) {
            ztd ztdVar = (ztd) iudVar;
            dlw0 dlw0Var = new dlw0(ztdVar.b, ztdVar.c);
            o6n0Var.c = 1;
            Object objA = wh71Var.a(dlw0Var, o6n0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        }
        return null;
    }

    public boolean test(Object obj, Object obj2) {
        switch (this.a) {
            case 17:
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                return y7y0.L(map) == y7y0.L(map2) && u890.j(map.get("pick-and-shuffle"), map2.get("pick-and-shuffle"));
            default:
                z6x0 z6x0Var = (z6x0) obj;
                z6x0 z6x0Var2 = (z6x0) obj2;
                z6x0Var.getClass();
                z6x0Var2.getClass();
                m3x0 m3x0Var = z6x0Var.a;
                int i = m3x0Var.t;
                m3x0 m3x0Var2 = z6x0Var2.a;
                return i == m3x0Var2.t && m3x0Var.i == m3x0Var2.i && z6x0Var.Y == z6x0Var2.Y && m3x0Var.W0 == m3x0Var2.W0;
        }
    }
}
