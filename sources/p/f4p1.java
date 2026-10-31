package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.signup.signup.v2.proto.Error;
import com.spotify.subscriptionviewservice.v1.Cta;
import com.spotify.subscriptionviewservice.v1.EntryPoint;
import com.spotify.subscriptionviewservice.v1.EntryPointCard;
import com.spotify.subscriptionviewservice.v1.Icon;
import com.spotify.subscriptionviewservice.v1.PresentBottomSheet;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class f4p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(403536879);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131956664);
            af5 af5Var = new af5(cwl1.o0(x340Var, 2131956663));
            qim0 qim0Var2 = nim0.a;
            o6p1.b(strO0, af5Var, qim0Var2, (xu30) null, x340Var, 384, 8);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 10);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(xuj1 xuj1Var, wj31 wj31Var, iu30 iu30Var, qim0 qim0Var, Function0 function0, Function0 function1, ksl kslVar, Function0 function2, iu30 iu30Var2, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        Function0 function3;
        ksl kslVar2;
        Function0 function4;
        iu30 iu30Var3;
        qim0 qim0Var2;
        boolean z;
        m4c m4cVar = fkj0.X;
        wuj1 wuj1Var = xuj1Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2143654994);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xuj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(wj31Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            function3 = function0;
            i3 |= x340Var.i(function3) ? 16384 : 8192;
        } else {
            function3 = function0;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            kslVar2 = kslVar;
            i3 |= x340Var.g(kslVar2) ? 1048576 : 524288;
        } else {
            kslVar2 = kslVar;
        }
        if ((12582912 & i) == 0) {
            function4 = function2;
            i3 |= x340Var.i(function4) ? 8388608 : 4194304;
        } else {
            function4 = function2;
        }
        if ((100663296 & i) == 0) {
            iu30Var3 = iu30Var2;
            i3 |= x340Var.i(iu30Var3) ? 67108864 : 33554432;
        } else {
            iu30Var3 = iu30Var2;
        }
        if (x340Var.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            boolean z2 = wuj1Var instanceof uuj1;
            qim0 qim0Var3 = nim0.a;
            if (z2 || (wuj1Var instanceof puj1)) {
                x340Var.i0(-1531837590);
                b5p1.d((i3 >> 9) & 14, 0, x340Var, qim0Var3);
                x340Var.r(false);
            } else {
                boolean z3 = wuj1Var instanceof suj1;
                if (z3 || (wuj1Var instanceof ruj1) || (wuj1Var instanceof quj1)) {
                    x340Var.i0(-242201838);
                    if (wj31Var != null) {
                        x340Var.i0(-242173256);
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode = Long.hashCode(x340Var.T);
                        xos0 xos0VarM = x340Var.m();
                        qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
                        nko1.H(gfh0VarC, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        int i4 = i3 >> 12;
                        zso1.w(xuj1Var, wj31Var, iu30Var, function4, iu30Var3, (qim0) null, function3, kslVar2, x340Var, (i3 & 1022) | (i4 & 7168) | (i4 & 57344) | ((i3 << 6) & 3670016) | ((i3 << 3) & 29360128));
                        if (z3) {
                            x340Var.i0(1968728968);
                            z = false;
                            b5p1.d(0, 1, x340Var, (qim0) null);
                            x340Var.r(false);
                        } else {
                            z = false;
                            x340Var.i0(1968769330);
                            x340Var.r(false);
                        }
                        x340Var.r(true);
                        x340Var.r(z);
                    } else {
                        z = false;
                        if (z3) {
                            x340Var.i0(-241665786);
                            b5p1.d((i3 >> 9) & 14, 0, x340Var, qim0Var3);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-241625424);
                            x340Var.r(false);
                        }
                    }
                    x340Var.r(z);
                } else if (wuj1Var instanceof tuj1) {
                    x340Var.i0(-1531813364);
                    boolean z4 = ((i3 & 896) == 256) | ((458752 & i3) == 131072);
                    Object objT = x340Var.T();
                    if (z4 || objT == m4cVar) {
                        objT = new wmf(iu30Var, function1, (byte) 10);
                        x340Var.s0(objT);
                    }
                    ltn1.h((Function0) objT, x340Var, (i3 >> 6) & 112);
                    x340Var.r(false);
                } else {
                    if (!(wuj1Var instanceof vuj1)) {
                        throw p3d1.k(x340Var, -1531839090, false);
                    }
                    x340Var.i0(-1531807536);
                    z1p1.g(x340Var, (i3 >> 9) & 14);
                    x340Var.r(false);
                }
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ne00(xuj1Var, wj31Var, iu30Var, qim0Var2, function0, function1, kslVar, function2, iu30Var2, i);
        }
    }

    public static final Integer c(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return null;
        }
        if (iC == 1) {
            return 2131232009;
        }
        if (iC == 2) {
            return 2131232783;
        }
        eg.o();
        return null;
    }

    public static final sjy d(bv11 bv11Var) {
        sz6 sz6Var = bv11Var.l;
        sz6 sz6Var2 = sz6Var instanceof sz6 ? sz6Var : null;
        return (sz6Var2 != null ? sz6Var2.d : null) == u37.a ? new rjy() : qjy.a;
    }

    public static final ujy e(bv11 bv11Var) {
        sz6 sz6Var = bv11Var.l;
        sz6 sz6Var2 = sz6Var instanceof sz6 ? sz6Var : null;
        return (sz6Var2 != null ? sz6Var2.d : null) == u37.a ? new ujy(1) : new ujy(2);
    }

    public static final m6e0 f(x7e0 x7e0Var, Scheduler scheduler) {
        return new m6e0(Observable.create(new zud0(x7e0Var, (byte) 2)).subscribeOn(scheduler), new l6d0(x7e0Var, (byte) 19), new jgd0(x7e0Var, (byte) 8));
    }

    public static m6e0 g(x7e0 x7e0Var) {
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        return f(x7e0Var, scheduler);
    }

    public static final boolean h(PlayerState playerState) {
        return playerState.contextUri().length() > 0 && playerState.track().c() && ((ContextTrack) playerState.track().b()).uri().length() > 0 && !u890.j(((ContextTrack) playerState.track().b()).uri(), playerState.contextUri());
    }

    public static final ven0 i(mr20 mr20Var, Object obj, x8c0 x8c0Var, w8c0 w8c0Var, o8n o8nVar, b0k b0kVar, int i) {
        Object[] objArr = {mr20Var, x8c0Var, w8c0Var, o8nVar};
        x340 x340Var = (x340) b0kVar;
        boolean zI = ((((i & 7168) ^ 3072) > 2048 && x340Var.e(w8c0Var.ordinal())) || (i & 3072) == 2048) | x340Var.i(x8c0Var) | x340Var.i(o8nVar) | x340Var.i(mr20Var);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            ary aryVar = new ary(x8c0Var, w8c0Var, o8nVar, mr20Var, (lnm) null, (byte) 7);
            x340Var.s0(aryVar);
            objT = aryVar;
        }
        return yto.r(obj, objArr, (vu30) objT, x340Var);
    }

    public static final ven0 j(mr20 mr20Var, Object obj, iac0 iac0Var, b0k b0kVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            iac0Var = (iac0) ((x340) b0kVar).k(jfe0.a);
        }
        return i(mr20Var, obj, iac0Var.getLifecycle(), w8c0.d, o6x.a, b0kVar, (i & 14) | (((i >> 3) & 8) << 3) | (i & 112) | (i & 7168) | (i & 57344));
    }

    public static final ven0 k(zob1 zob1Var, iac0 iac0Var, b0k b0kVar, int i) {
        if ((i & 1) != 0) {
            iac0Var = (iac0) ((x340) b0kVar).k(jfe0.a);
        }
        return i(zob1Var, zob1Var.getValue(), iac0Var.getLifecycle(), w8c0.d, o6x.a, b0kVar, 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x011c  */
    /* JADX WARN: Code duplicated, block: B:35:0x012d  */
    public static final p60 l(Cta cta, int i) {
        b6j0 i20Var;
        b6j0 j20Var;
        String strP;
        String strN;
        Icon iconP;
        String strR = cta.r();
        String strQ = cta.q();
        int iN = cta.n().n();
        String uri = (iN == 0 ? -1 : qv9.a[l1d.C(iN)]) == 1 ? cta.n().p().getUri() : "";
        uri.getClass();
        int iN2 = cta.n().n();
        int i2 = iN2 != 0 ? qv9.a[l1d.C(iN2)] : -1;
        if (i2 != 1) {
            if (i2 != 2) {
                i20Var = b6j0.b;
            } else {
                String title = cta.n().q().getTitle();
                String strN2 = cta.n().q().n();
                PresentBottomSheet presentBottomSheetQ = cta.n().q();
                String name = null;
                if (!presentBottomSheetQ.t()) {
                    presentBottomSheetQ = null;
                }
                if (presentBottomSheetQ != null && (iconP = presentBottomSheetQ.p()) != null) {
                    name = iconP.getName();
                }
                j20Var = new j20(title, strN2, name, cta.n().q().q().p(), cta.n().q().getImageUrl(), cta.n().q().r().q(), cta.n().q().r().n().p().getUri(), cta.n().q().s().q(), cta.n().q().s().n().p().getUri());
            }
            strP = cta.o().p();
            if (strP.length() == 0) {
                strP = "#FFFFFF";
            }
            String str = strP;
            strN = cta.o().n();
            if (strN.length() == 0) {
                strN = "#19FFFFFF";
            }
            return new p60((String) null, (String) null, strQ, (String) null, uri, 0.0f, (String) null, str, strN, i, j20Var, strR, Error.TOO_YOUNG_FIELD_NUMBER);
        }
        i20Var = new i20(cta.n().p().getUri());
        j20Var = i20Var;
        strP = cta.o().p();
        if (strP.length() == 0) {
            strP = "#FFFFFF";
        }
        String str2 = strP;
        strN = cta.o().n();
        if (strN.length() == 0) {
            strN = "#19FFFFFF";
        }
        return new p60((String) null, (String) null, strQ, (String) null, uri, 0.0f, (String) null, str2, strN, i, j20Var, strR, Error.TOO_YOUNG_FIELD_NUMBER);
    }

    public static String m(ohc ohcVar) {
        StringBuilder sb = new StringBuilder(ohcVar.size());
        for (int i = 0; i < ohcVar.size(); i++) {
            byte b2 = ohcVar.b(i);
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static ycc1 n(l270 l270Var, bpa bpaVar, yeg1 yeg1Var) {
        yyp0 yyp0Var = (yyp0) l270Var;
        return new ycc1((Object) zgo1.p(yyp0Var.c(), bpaVar, yeg1Var), (Object) zgo1.p(yyp0Var.d(cwp0.d).c(), bpaVar, yeg1Var), (byte) 11);
    }

    public static final String o(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(date);
    }

    public static final n511 p(ua91 ua91Var) {
        return anm1.g(Offset.g(((Offset) ((hrr0) ua91Var.c).getValue()).a, ((Offset) ((hrr0) ua91Var.d).getValue()).a), ua91Var.J());
    }

    public static final boolean q(float f, float f2) {
        return f2 > 0.0f && Math.abs(f - 0.5f) < f2;
    }

    public static StringBuilder r(int i) {
        n3p1.j(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
    }

    public static final n511 s(xs71 xs71Var, yq71 yq71Var) {
        if (yq71Var == null) {
            return null;
        }
        List listB = xs71Var.b();
        int size = listB.size();
        for (int i = 0; i < size; i++) {
            if (u890.j(((ys71) listB.get(i)).Z, yq71Var)) {
                if (((pim0) yq71Var).N0) {
                    return !yq71Var.R0 ? yq71Var.Q0 : anm1.g(elb0.Q(yq71Var.I1(), oap1.z(yq71Var), 6), o0c.R(((q5t0) oap1.z(yq71Var)).c));
                }
                return null;
            }
        }
        return null;
    }

    public static final float t(float f, c380 c380Var, AbstractList abstractList) {
        Object next;
        Object next2;
        Iterator it = c380Var.iterator();
        Object next3 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f - ((Number) next).floatValue());
                do {
                    Object next4 = it.next();
                    float fAbs2 = Math.abs(f - ((Number) next4).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next4;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Float f2 = (Float) next;
        Iterator it2 = abstractList.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                float fAbs3 = Math.abs(f - ((Number) next2).floatValue());
                do {
                    Object next5 = it2.next();
                    float fAbs4 = Math.abs(f - ((Number) next5).floatValue());
                    if (Float.compare(fAbs3, fAbs4) > 0) {
                        next2 = next5;
                        fAbs3 = fAbs4;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        Iterator it3 = f46.i0(new Float[]{f2, (Float) next2}).iterator();
        if (it3.hasNext()) {
            next3 = it3.next();
            if (it3.hasNext()) {
                float fAbs5 = Math.abs(f - ((Number) next3).floatValue());
                do {
                    Object next6 = it3.next();
                    float fAbs6 = Math.abs(f - ((Number) next6).floatValue());
                    if (Float.compare(fAbs5, fAbs6) > 0) {
                        next3 = next6;
                        fAbs5 = fAbs6;
                    }
                } while (it3.hasNext());
            }
        }
        Float f3 = (Float) next3;
        return f3 != null ? f3.floatValue() : f;
    }

    public static final List u(EntryPointCard entryPointCard) {
        int iO = entryPointCard.o();
        int i = iO == 0 ? -1 : qv9.b[l1d.C(iO)];
        if (i == 1) {
            List<EntryPoint> itemsList = entryPointCard.s().getItemsList();
            ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
            for (EntryPoint entryPoint : itemsList) {
                entryPoint.getClass();
                arrayList.add(v(entryPoint));
            }
            return arrayList;
        }
        if (i == 2) {
            List<EntryPoint> itemsList2 = entryPointCard.r().getItemsList();
            ArrayList arrayList2 = new ArrayList(q7h.U(itemsList2, 10));
            for (EntryPoint entryPoint2 : itemsList2) {
                entryPoint2.getClass();
                arrayList2.add(v(entryPoint2));
            }
            return arrayList2;
        }
        if (i == 3) {
            List<EntryPoint> itemsList3 = entryPointCard.q().getItemsList();
            ArrayList arrayList3 = new ArrayList(q7h.U(itemsList3, 10));
            for (EntryPoint entryPoint3 : itemsList3) {
                entryPoint3.getClass();
                arrayList3.add(v(entryPoint3));
            }
            return arrayList3;
        }
        if (i != 4) {
            return z6x.a;
        }
        List<EntryPoint> itemsList4 = entryPointCard.p().getItemsList();
        ArrayList arrayList4 = new ArrayList(q7h.U(itemsList4, 10));
        for (EntryPoint entryPoint4 : itemsList4) {
            entryPoint4.getClass();
            arrayList4.add(v(entryPoint4));
        }
        return arrayList4;
    }

    public static final p60 v(EntryPoint entryPoint) {
        String strR = entryPoint.r();
        String title = entryPoint.getTitle();
        String description = entryPoint.getDescription();
        String uri = entryPoint.getUri();
        String name = entryPoint.o().getName();
        String strP = entryPoint.o().n().p();
        if (strP.length() == 0) {
            strP = "#FFFFFF";
        }
        String str = strP;
        float fP = entryPoint.p();
        String name2 = entryPoint.q().getName();
        int i = 4;
        switch (entryPoint.n()) {
            case ENTRY_POINT_LAYOUT_UNSPECIFIED:
            case ENTRY_POINT_LAYOUT_CARD_STANDARD:
            case UNRECOGNIZED:
                break;
            case ENTRY_POINT_LAYOUT_BUTTON_PRIMARY:
                i = 1;
                break;
            case ENTRY_POINT_LAYOUT_BUTTON_SECONDARY:
                i = 2;
                break;
            case ENTRY_POINT_LAYOUT_BUTTON_TERTIARY:
                i = 3;
                break;
            case ENTRY_POINT_LAYOUT_CARD_PROGRESS:
                i = 5;
                break;
            case ENTRY_POINT_LAYOUT_CARD_EDIT:
                i = 6;
                break;
            default:
                eg.o();
                return null;
        }
        return new p60(name, str, title, description, uri, fP, name2, (String) null, (String) null, i, (k20) null, strR, 1408);
    }

    public static final void w(ua91 ua91Var, long j, long j2, long j3, boolean z) {
        hrr0 hrr0Var = (hrr0) ua91Var.c;
        hrr0 hrr0Var2 = (hrr0) ua91Var.e;
        hrr0 hrr0Var3 = (hrr0) ua91Var.d;
        if (!Offset.c(((Offset) hrr0Var3.getValue()).a, j3) || !Size.c(ua91Var.J(), j) || z) {
            ((hrr0) ua91Var.b).setValue(new Size(j));
            hrr0Var3.setValue(new Offset(j3));
            if (z) {
                hrr0Var.setValue(new Offset(Offset.f(Offset.f(j2, j3), Offset.f(((Offset) hrr0Var2.getValue()).a, ((Offset) hrr0Var.getValue()).a))));
            }
        }
        hrr0Var2.setValue(new Offset(Offset.f(j2, j3)));
    }

    public static final int x(float f, int i) {
        int i2 = (int) (f * (i > 0 ? 32.0f / i : 1.0f));
        int i3 = 1;
        if (i2 < 1) {
            i2 = 1;
        }
        int iHighestOneBit = Integer.highestOneBit(i2);
        if (i <= 2) {
            i3 = 8;
        } else if (i <= 4) {
            i3 = 4;
        } else if (i <= 8) {
            i3 = 2;
        }
        return Math.max(iHighestOneBit, i3);
    }
}
